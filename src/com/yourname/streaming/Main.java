package com.yourname.streaming;

public class Main {
    public static void main(String[] args) {
        Season season1 = new Season();
        season1.addEpisode(new Episode("S1E1 - Pilot", 1200));
        season1.addEpisode(new Episode("S1E2 - Setup", 1100));
        season1.addEpisode(new Episode("S1E3 - Conflict", 1150));

        Season season2 = new Season();
        season2.addEpisode(new Episode("S2E1 - Return", 1300));
        season2.addEpisode(new Episode("S2E2 - Twist", 1250));

        Series series = new Series();
        series.addSeason(season1);
        series.addSeason(season2);

        System.out.println("== Normal Iterator ==");
        EpisodeIterator normal = new SeasonIterator(season1);
        while (normal.hasNext()) {
            System.out.println(normal.next());
        }

        System.out.println("\n== Reverse Iterator ==");
        EpisodeIterator reverse = new ReverseSeasonIterator(season1);
        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }

        System.out.println("\n== Shuffle Iterator ==");
        EpisodeIterator shuffle = new ShuffleSeasonIterator(season1, 42);
        while (shuffle.hasNext()) {
            System.out.println(shuffle.next());
        }

        System.out.println("\n== Binge Iterator (Full Series) ==");
        EpisodeIterator binge = new BingeIterator(series);
        while (binge.hasNext()) {
            System.out.println(binge.next());
        }
    }
}
