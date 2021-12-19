package com.p2082ss.android.ugc.aweme.mediaplayer;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule */
public class MediaPlayerModule implements TextureView.SurfaceTextureListener, AbstractC33974au {

    /* renamed from: a */
    public String f134713a;

    /* renamed from: b */
    public AbstractC59193a f134714b;

    /* renamed from: c */
    public boolean f134715c;

    /* renamed from: d */
    public boolean f134716d;

    /* renamed from: e */
    boolean f134717e;

    /* renamed from: f */
    C59200h f134718f;

    /* renamed from: g */
    public TextureView.SurfaceTextureListener f134719g;

    /* renamed from: h */
    public C1213t<C59201i> f134720h;

    static {
        Covode.recordClassIndex(69552);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        mo96697b();
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        mo96696a();
    }

    /* renamed from: a */
    public final void mo96696a() {
        if (!this.f134715c && !this.f134716d) {
            this.f134714b.mo96713b();
            this.f134720h.postValue(new C59201i(4, true));
        }
    }

    /* renamed from: b */
    public final void mo96697b() {
        this.f134714b.mo96707a();
        this.f134720h.postValue(new C59201i(3, true));
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f134714b.mo96707a();
        this.f134714b.mo96716c();
        this.f134714b.mo96717d();
        this.f134720h.postValue(new C59201i(6, true));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f134719g;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.f134714b.mo96716c();
        this.f134720h.postValue(new C59201i(5, true));
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f134719g;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    public MediaPlayerModule(AbstractC59193a aVar, C59200h hVar) {
        C1213t<C59201i> tVar = new C1213t<>();
        this.f134720h = tVar;
        this.f134714b = aVar;
        this.f134718f = hVar;
        tVar.observeForever(new C59195c(this));
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f134719g;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f134719g;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        C1731i.m5640b(new CallableC59196d(this), C1731i.f5562a).mo5534a(new C59197e(this), C1731i.f5564c, null).mo5532a((AbstractC1729g) new C59198f(this, surfaceTexture)).mo5534a(new C59199g(this), C1731i.f5564c, null);
    }
}
