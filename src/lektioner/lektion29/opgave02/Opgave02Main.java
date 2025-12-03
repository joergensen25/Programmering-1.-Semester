package lektioner.lektion29.opgave02;

import lektioner.lektion29.opgave02.models.Team;
import lektioner.lektion29.opgave02.storage.ChampionsLeagueStorage;

public class Opgave02Main {
    public static void main(String[] args) {
        ChampionsLeagueStorage storage = new ChampionsLeagueStorage();
        Team[] groupA = storage.getGroupA();
        Team[] groupB = storage.getGroupB();

        Team[] merged = flet(groupA, groupB);

        for (Team t : merged) {
            System.out.println(t.getName() + " - " + t.getPoints()
                    + "p, målforskel: " + t.getGoalDifference());
        }
    }

    public static Team[] flet(Team[] groupA, Team[] groupB) {
        Team[] result = new Team[groupA.length + groupB.length];

        int i1 = 0;
        int i2 = 0;
        int k = 0;

        while (i1 < groupA.length && i2 < groupB.length) {
//            if (groupA[i1].getPoints() > groupB[i2].getPoints()) {
//                result[k++] = groupA[i1++];
//            }
            if (groupA[i1].compareTo(groupB[i2]) >= 0) {
                result[k++] = groupA[i1++];
            } else {
                result[k++] = groupB[i2++];
            }

//            else if (groupA[i1].getPoints() < groupB[i2].getPoints()) {
//                result[k++] = groupB[i2++];
//            }

//            else {
//                if (groupA[i1].getGoalDifference() > groupB[i2].getGoalDifference())
//                    result[k++] = groupA[i1++];

//                else {
//                    result[k++] = groupB[i2++];
//                }
        }
        while (i1 < groupA.length) result[k++] = groupA[i1++];
        while (i2 < groupB.length) result[k++] = groupB[i2++];

        return result;
    }
}
