package com.example.hp.listview;

import android.widget.TextView;

/**
 * Created by HP on 12/23/2017.
 */

class SingleItem {
    String title;
    int thumb;

    public SingleItem(String title, int thumb) {
        this.title = title;
        this.thumb = thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }
}
