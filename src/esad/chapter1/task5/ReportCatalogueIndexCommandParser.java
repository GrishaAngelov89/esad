package esad.chapter1.task5;

/**
 * @author: grisha_angelov
 */
public class ReportCatalogueIndexCommandParser {
    final String NO_GROUPING = "orgNoGrouping";
    final int ORG_CATALOG = 0;
    final int PART_CATALOG = 1;

    int getGroupingType(String grouping) {
        if (grouping.equals(NO_GROUPING) ||
                grouping.equals("orgGroupByCountry") ||
                grouping.equals("orgGroupByTypeOfOrgName")) {
            return ORG_CATALOG;
        } else if (grouping.equals("part")) {
            return PART_CATALOG;
        } else
            throw new IllegalArgumentException("Invalid grouping!");
    }
}
