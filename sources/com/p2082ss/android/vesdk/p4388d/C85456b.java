package com.p2082ss.android.vesdk.p4388d;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b;

/* renamed from: com.ss.android.vesdk.d.b */
public class C85456b {

    /* renamed from: c */
    public C30844i.EnumC30847b f191384c;

    /* renamed from: d */
    public TEFrameSizei f191385d;

    /* renamed from: e */
    public AbstractC85457a f191386e;

    /* renamed from: f */
    public boolean f191387f = true;

    /* renamed from: g */
    public boolean f191388g;

    /* renamed from: h */
    SurfaceTexture f191389h;

    /* renamed from: i */
    public boolean f191390i;

    /* renamed from: com.ss.android.vesdk.d.b$a */
    public interface AbstractC85457a extends AbstractC30857b.AbstractC30860a {
        static {
            Covode.recordClassIndex(99578);
        }

        /* renamed from: a */
        void mo131089a(TEFrameSizei tEFrameSizei);

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
        void onFrameCaptured(C30844i iVar);

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* renamed from: com.ss.android.vesdk.d.b$b */
    public interface AbstractC85458b extends AbstractC85457a {
        static {
            Covode.recordClassIndex(99579);
        }

        /* renamed from: a */
        void mo131088a(SurfaceTexture surfaceTexture, boolean z);

        /* renamed from: a */
        void mo131090a(Object obj);
    }

    static {
        Covode.recordClassIndex(99577);
    }

    /* renamed from: a */
    public SurfaceTexture mo131103a() {
        return this.f191389h;
    }

    /* renamed from: b */
    public boolean mo131104b() {
        TEFrameSizei tEFrameSizei = this.f191385d;
        if (tEFrameSizei == null || tEFrameSizei.f73616a <= 0 || this.f191385d.f73617b <= 0 || this.f191386e == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo131105a(SurfaceTexture surfaceTexture) {
        this.f191389h = surfaceTexture;
    }

    public C85456b(C30844i.EnumC30847b bVar, TEFrameSizei tEFrameSizei, AbstractC85457a aVar, SurfaceTexture surfaceTexture) {
        this.f191384c = bVar;
        this.f191385d = tEFrameSizei;
        this.f191386e = aVar;
        this.f191389h = surfaceTexture;
    }
}
