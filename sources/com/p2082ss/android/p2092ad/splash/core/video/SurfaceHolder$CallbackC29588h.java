package com.p2082ss.android.p2092ad.splash.core.video;

import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.core.video.h */
public final class SurfaceHolder$CallbackC29588h implements SurfaceHolder.Callback {

    /* renamed from: a */
    WeakReference<SurfaceHolder.Callback> f70560a;

    static {
        Covode.recordClassIndex(35983);
    }

    public SurfaceHolder$CallbackC29588h(SurfaceHolder.Callback callback) {
        this.f70560a = new WeakReference<>(callback);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f70560a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f70560a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.f70560a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }
}
