package com.yourname.streaming;

import java.util.List;

public class SeasonIterator implements EpisodeIterator, java.util.Iterator<Episode> {
    private List<Episode> episodes;
    private int index = 0;

    public SeasonIterator(Season season) {
        this.episodes = season.getEpisodes();
    }

    @Override
    public boolean hasNext() {
        return index < episodes.size();
    }

    @Override
    public Episode next() {
        return episodes.get(index++);
    }
}
