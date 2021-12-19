package com.p2082ss.ttm.player;

import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.x */
public class SurfaceHolder$CallbackC86288x implements SurfaceHolder.Callback {

    /* renamed from: a */
    private static final String f192752a = SurfaceHolder$CallbackC86288x.class.getSimpleName();

    /* renamed from: b */
    private AbstractC86250j f192753b;

    static {
        Covode.recordClassIndex(101465);
    }

    SurfaceHolder$CallbackC86288x(AbstractC86250j jVar) {
        this.f192753b = jVar;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        AbstractC86250j jVar = this.f192753b;
        if (jVar != null) {
            jVar.mo136728a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC86250j jVar = this.f192753b;
        if (jVar != null) {
            jVar.mo136720a();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC86250j jVar = this.f192753b;
        if (jVar != null) {
            jVar.mo136747b();
        }
    }
}
