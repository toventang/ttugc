package com.p2082ss.android.vesdk.p4388d;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.vesdk.p4388d.C85456b;

/* renamed from: com.ss.android.vesdk.d.d */
public final class C85460d extends C85456b {

    /* renamed from: a */
    public int f191393a;

    /* renamed from: b */
    public SurfaceTexture f191394b;

    static {
        Covode.recordClassIndex(99581);
    }

    @Override // com.p2082ss.android.vesdk.p4388d.C85456b
    /* renamed from: a */
    public final SurfaceTexture mo131103a() {
        return this.f191394b;
    }

    @Override // com.p2082ss.android.vesdk.p4388d.C85456b
    /* renamed from: b */
    public final boolean mo131104b() {
        if (!super.mo131104b() || this.f191394b == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.vesdk.p4388d.C85456b
    /* renamed from: a */
    public final void mo131105a(SurfaceTexture surfaceTexture) {
        this.f191394b = surfaceTexture;
    }

    public C85460d(TEFrameSizei tEFrameSizei, C85456b.AbstractC85457a aVar, int i, SurfaceTexture surfaceTexture) {
        super(C30844i.EnumC30847b.PIXEL_FORMAT_OpenGL_OES, tEFrameSizei, aVar, surfaceTexture);
        this.f191393a = i;
        this.f191394b = surfaceTexture;
    }
}
