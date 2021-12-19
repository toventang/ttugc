package com.p2082ss.android.vesdk;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEMusicBitmapParam */
public class VEMusicBitmapParam {
    public int lineCnt;
    public Bitmap lyricsBitmap;

    static {
        Covode.recordClassIndex(99348);
    }

    public void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public VEMusicBitmapParam(Bitmap bitmap, int i) {
        this.lyricsBitmap = bitmap;
        this.lineCnt = i;
    }
}
