package com.p2082ss.ttvideoengine;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.VideoSurface;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.ttvideoengine.ar */
public final class SurfaceHolder$CallbackC86352ar implements SurfaceHolder.Callback {

    /* renamed from: a */
    WeakReference<C86313ai> f193448a;

    static {
        Covode.recordClassIndex(101580);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public SurfaceHolder$CallbackC86352ar(C86313ai aiVar) {
        this.f193448a = new WeakReference<>(aiVar);
        C86641i.m150113b("TTVideoEngineSurfaceCallback", "new surface callback:".concat(String.valueOf(this)));
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C86641i.m150113b("TTVideoEngineSurfaceCallback", "surfaceCreated, ".concat(String.valueOf(surfaceHolder)));
        C86313ai aiVar = this.f193448a.get();
        if (aiVar != null) {
            aiVar.mo137194b(surfaceHolder.getSurface());
            VideoSurface videoSurface = aiVar.f192977bn;
            if (videoSurface != null) {
                videoSurface.mo136457b(25, 1);
                C86641i.m150113b("TTVideoEngineSurfaceCallback", "set texturerender force draw");
            }
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C86641i.m150113b("TTVideoEngineSurfaceCallback", "surfaceDestroyed, ".concat(String.valueOf(surfaceHolder)));
        C86313ai aiVar = this.f193448a.get();
        if (aiVar != null) {
            VideoSurface videoSurface = aiVar.f192977bn;
            if (videoSurface != null) {
                videoSurface.mo136457b(9, 1);
            }
            aiVar.mo137194b((Surface) null);
            if (videoSurface != null) {
                videoSurface.mo136457b(9, 0);
            }
        }
    }
}
