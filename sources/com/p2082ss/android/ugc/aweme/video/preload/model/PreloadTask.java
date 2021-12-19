package com.p2082ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadTask */
public class PreloadTask {
    public boolean alreadyPreload;
    @AbstractC27891c(mo46611a = "count")
    public int count = 1;
    @AbstractC27891c(mo46611a = "offset")
    public int offset;
    @AbstractC27891c(mo46611a = "download_progress")
    public int progress = 100;
    @AbstractC27891c(mo46611a = "size")
    private int size;

    static {
        Covode.recordClassIndex(94226);
    }

    public PreloadTask() {
    }

    public int getVideoPreloadSize() {
        int i = this.size;
        if (i <= 0) {
            return 10485759;
        }
        return i * 1024;
    }

    public String toString() {
        return "PreloadTask{progress=" + this.progress + ", offset=" + this.offset + ", count=" + this.count + ", size=" + this.size + '}';
    }

    public PreloadTask(int i, int i2) {
        this.count = i;
        this.size = i2;
    }
}
