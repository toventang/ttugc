package com.p2082ss.android.ttvecamera.p2201j;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.j.g */
public final class C30870g extends AbstractC30857b {

    /* renamed from: a */
    SurfaceTexture f73953a;

    /* renamed from: b */
    Surface f73954b;

    /* renamed from: c */
    float[] f73955c = new float[16];

    /* renamed from: d */
    int f73956d;

    /* renamed from: e */
    SurfaceTexture.OnFrameAvailableListener f73957e = new SurfaceTexture.OnFrameAvailableListener() {
        /* class com.p2082ss.android.ttvecamera.p2201j.C30870g.C308711 */

        static {
            Covode.recordClassIndex(37496);
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (C30870g.this.f73923i != null) {
                surfaceTexture.getTransformMatrix(C30870g.this.f73955c);
                C30844i iVar = new C30844i(C30870g.this.f73922h.f73616a, C30870g.this.f73922h.f73617b, surfaceTexture.getTimestamp());
                iVar.mo55866a(C30870g.this.f73956d, C30870g.this.f73923i.mo55844G(), C30870g.this.f73955c, C30870g.this.f73921g, C30870g.this.f73923i.f73853u);
                iVar.f73881b = C30870g.this.f73926l;
                C30870g.this.mo55880a(iVar);
            }
        }
    };

    static {
        Covode.recordClassIndex(37495);
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: c */
    public final int mo55876c() {
        return 1;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final Surface mo55873a() {
        return this.f73954b;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: b */
    public final SurfaceTexture mo55875b() {
        return this.f73953a;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: i */
    public final int mo55886i() {
        return this.f73956d;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: e */
    public final void mo55882e() {
        super.mo55882e();
        Surface surface = this.f73954b;
        if (surface != null) {
            surface.release();
            this.f73954b = null;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: h */
    public final void mo55885h() {
        super.mo55885h();
        this.f73957e.onFrameAvailable(this.f73953a);
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: d */
    public final void mo55877d() {
        Surface surface = this.f73954b;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f73953a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f73953a = new SurfaceTexture(this.f73956d);
        this.f73954b = new Surface(this.f73953a);
        this.f73920f.onNewSurfaceTexture(this.f73953a);
    }

    /* renamed from: a */
    private void m63622a(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f73953a.setOnFrameAvailableListener(onFrameAvailableListener, this.f73923i.f73850r);
        } else {
            this.f73953a.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final void mo55874a(SurfaceTexture surfaceTexture) {
        Surface surface = this.f73954b;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture2 = this.f73953a;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.f73953a = surfaceTexture;
        this.f73954b = new Surface(this.f73953a);
        m63622a(this.f73957e);
        if (this.f73920f != null && (this.f73920f instanceof AbstractC30857b.AbstractC30861b)) {
            ((AbstractC30857b.AbstractC30861b) this.f73920f).mo55889a(this.f73953a);
        }
    }

    public C30870g(C30862c.C30863a aVar, AbstractC30825g gVar) {
        super(aVar, gVar);
        this.f73953a = aVar.f73934d;
        this.f73956d = aVar.f73935e;
        this.f73954b = new Surface(this.f73953a);
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final int mo55879a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (!this.f73923i.f73847o.f74158Y) {
            return mo55872a(m63568a(outputSizes), tEFrameSizei);
        }
        List<TEFrameSizei> a = m63568a(streamConfigurationMap.getOutputSizes(MediaRecorder.class));
        List<TEFrameSizei> a2 = m63568a(outputSizes);
        a2.retainAll(a);
        return mo55872a(a2, tEFrameSizei);
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final int mo55872a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f73922h = C30956m.m63661a(list, this.f73922h);
        }
        this.f73953a.setDefaultBufferSize(this.f73922h.f73616a, this.f73922h.f73617b);
        m63622a(this.f73957e);
        return 0;
    }
}
