package com.p2082ss.avframework.livestreamv2.core;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.RenderView;

/* renamed from: com.ss.avframework.livestreamv2.core.IShortVideoPushManager */
public interface IShortVideoPushManager {
    static {
        Covode.recordClassIndex(100219);
    }

    void activeSurface(Surface surface, int i, int i2);

    void enableVideoMirror(boolean z, boolean z2);

    Surface getSurface();

    boolean isVideoMirror(boolean z);

    void release();

    void releaseSurface(Surface surface);

    void setFitMode(boolean z);

    void setRenderView(RenderView renderView);
}
