package com.p2082ss.android.vesdk.p4388d;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.vesdk.p4388d.C85456b;

/* renamed from: com.ss.android.vesdk.d.c */
public final class C85459c extends C85456b {

    /* renamed from: a */
    public Surface f191391a;

    /* renamed from: b */
    public int f191392b;

    static {
        Covode.recordClassIndex(99580);
    }

    @Override // com.p2082ss.android.vesdk.p4388d.C85456b
    /* renamed from: b */
    public final boolean mo131104b() {
        if (!super.mo131104b() || this.f191391a == null) {
            return false;
        }
        return true;
    }

    public C85459c(TEFrameSizei tEFrameSizei, C85456b.AbstractC85457a aVar, int i, SurfaceTexture surfaceTexture, Surface surface) {
        super(C30844i.EnumC30847b.PIXEL_FORMAT_Recorder, tEFrameSizei, aVar, surfaceTexture);
        this.f191391a = surface;
        this.f191392b = i;
    }
}
