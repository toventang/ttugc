package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.k */
public final class C58862k extends SurfaceTexture {

    /* renamed from: a */
    public AbstractC58858h f133997a;

    /* renamed from: b */
    public boolean f133998b = true;

    /* renamed from: c */
    public boolean f133999c = false;

    static {
        Covode.recordClassIndex(69176);
    }

    public final void releaseTexImage() {
        super.releaseTexImage();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.SurfaceTexture, java.lang.Object
    public final void finalize() {
        m108135a();
        super.finalize();
    }

    public final void release() {
        m108135a();
        super.release();
    }

    /* renamed from: a */
    private void m108135a() {
        if (!this.f133999c) {
            this.f133997a.mo96279b();
            this.f133999c = true;
        }
    }

    public C58862k(AbstractC58858h hVar) {
        super(hVar.mo96280c());
        hVar.mo96278a();
        this.f133997a = hVar;
        hVar.mo96281d();
    }
}
