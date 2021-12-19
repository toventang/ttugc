package com.p2082ss.android.vesdk.p4388d;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.vesdk.p4388d.C85456b;

/* renamed from: com.ss.android.vesdk.d.a */
public final class C85455a extends C85456b {

    /* renamed from: a */
    public SurfaceTexture f191382a;

    /* renamed from: b */
    public int f191383b;

    static {
        Covode.recordClassIndex(99576);
    }

    @Override // com.p2082ss.android.vesdk.p4388d.C85456b
    /* renamed from: a */
    public final SurfaceTexture mo131103a() {
        return this.f191382a;
    }

    @Override // com.p2082ss.android.vesdk.p4388d.C85456b
    /* renamed from: b */
    public final boolean mo131104b() {
        return super.mo131104b();
    }

    public C85455a(TEFrameSizei tEFrameSizei, C85456b.AbstractC85457a aVar, SurfaceTexture surfaceTexture, int i) {
        super(C30844i.EnumC30847b.PIXEL_FORMAT_BUFFER, tEFrameSizei, aVar, surfaceTexture);
        this.f191382a = surfaceTexture;
        this.f191383b = i;
    }
}
