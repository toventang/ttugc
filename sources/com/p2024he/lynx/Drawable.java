package com.p2024he.lynx;

import android.view.SurfaceHolder;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.he.lynx.Drawable */
public class Drawable {
    public final SurfaceHolder holder;
    public final long ptr;
    public final View view;

    static {
        Covode.recordClassIndex(33755);
    }

    public Drawable(long j, View view2, SurfaceHolder surfaceHolder) {
        this.ptr = j;
        this.view = view2;
        this.holder = surfaceHolder;
    }
}
