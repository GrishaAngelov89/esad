package esad.chapter1.task4;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author: grisha_angelov
 */
public class ParticipantsInDBTest {
    ParticipantsInDB p;
    Participant part1;
    Participant part2;

    void setUp() {
        p = ParticipantsInDB.getInstance();
        part1 = new Participant("ABC001", "Kent", "Tong", true, "Manager");
        part2 = new Participant("ABC003", "Paul", "Chan", true, "Manager");
    }

    void tearDown() {
        ParticipantsInDB.freeInstance();
    }

    void addOneParticipant() throws SQLException {
        p.deleteAllParticipants();
        addParticipants(Arrays.asList(part1));
        assertEquals(p.getCount(), 1);
    }

    void addTwoParticipants() throws SQLException {
        p.deleteAllParticipants();
        addParticipants(Arrays.asList(part1, part2));
        assertEquals(p.getCount(), 2);
    }

    void testEnum() throws SQLException {
        p.deleteAllParticipants();
        addParticipants(Arrays.asList(part2, part1));
        ParticipantEnumeratorById penum = new ParticipantEnumeratorById();
        assertTrue(penum.next());
        assertTrue(penum.get().equals(part1));
        assertTrue(penum.next());
        assertTrue(penum.get().equals(part2));
        assertTrue(!penum.next());
        penum.close();
    }

    private void addParticipants(List<Participant> participants) throws SQLException {
        for (Participant participant : participants) {
            p.addParticipant(participant);
        }
    }
}
