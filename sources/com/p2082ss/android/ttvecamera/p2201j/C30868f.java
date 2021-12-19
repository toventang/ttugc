package com.p2082ss.android.ttvecamera.p2201j;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.j.f */
public final class C30868f extends AbstractC30857b {

    /* renamed from: a */
    public float[] f73947a = new float[16];

    /* renamed from: b */
    int f73948b;

    /* renamed from: c */
    private Surface f73949c;

    /* renamed from: d */
    private Surface f73950d;

    /* renamed from: e */
    private SurfaceTexture f73951e;

    static {
        Covode.recordClassIndex(37493);
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final void mo55874a(SurfaceTexture surfaceTexture) {
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: c */
    public final int mo55876c() {
        return 16;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final Surface mo55873a() {
        return this.f73950d;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: b */
    public final SurfaceTexture mo55875b() {
        return this.f73951e;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: f */
    public final Surface mo55883f() {
        return this.f73949c;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: e */
    public final void mo55882e() {
        super.mo55882e();
        Surface surface = this.f73950d;
        if (surface != null) {
            surface.release();
            this.f73950d = null;
        }
        Surface surface2 = this.f73949c;
        if (surface2 != null) {
            surface2.release();
            this.f73949c = null;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: d */
    public final void mo55877d() {
        Surface surface = this.f73950d;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f73951e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f73951e = new SurfaceTexture(this.f73948b);
        this.f73950d = new Surface(this.f73951e);
        this.f73920f.onNewSurfaceTexture(this.f73951e);
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final int mo55879a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return mo55872a(m63568a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    public C30868f(C30862c.C30863a aVar, AbstractC30825g gVar) {
        super(aVar, gVar);
        this.f73951e = aVar.f73934d;
        this.f73948b = aVar.f73935e;
        this.f73950d = new Surface(aVar.f73934d);
        this.f73949c = aVar.f73937g;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final int mo55872a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f73922h = C30956m.m63661a(list, this.f73922h);
        }
        this.f73951e.setDefaultBufferSize(this.f73922h.f73616a, this.f73922h.f73617b);
        C308691 r2 = new SurfaceTexture.OnFrameAvailableListener() {
            /* class com.p2082ss.android.ttvecamera.p2201j.C30868f.C308691 */

            static {
                Covode.recordClassIndex(37494);
            }

            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C30868f.this.f73923i != null) {
                    surfaceTexture.getTransformMatrix(C30868f.this.f73947a);
                    C30844i iVar = new C30844i(C30868f.this.f73922h.f73616a, C30868f.this.f73922h.f73617b, surfaceTexture.getTimestamp());
                    iVar.mo55866a(C30868f.this.f73948b, C30868f.this.f73923i.mo55844G(), C30868f.this.f73947a, C30868f.this.f73921g, C30868f.this.f73923i.f73853u);
                    C30868f.this.mo55880a(iVar);
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 21) {
            this.f73951e.setOnFrameAvailableListener(r2, this.f73923i.f73850r);
            return 0;
        }
        this.f73951e.setOnFrameAvailableListener(r2);
        return 0;
    }
}
