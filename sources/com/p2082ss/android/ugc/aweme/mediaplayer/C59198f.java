package com.p2082ss.android.ugc.aweme.mediaplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.f */
final /* synthetic */ class C59198f implements AbstractC1729g {

    /* renamed from: a */
    private final MediaPlayerModule f134726a;

    /* renamed from: b */
    private final SurfaceTexture f134727b;

    static {
        Covode.recordClassIndex(69558);
    }

    C59198f(MediaPlayerModule mediaPlayerModule, SurfaceTexture surfaceTexture) {
        this.f134726a = mediaPlayerModule;
        this.f134727b = surfaceTexture;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        MediaPlayerModule mediaPlayerModule = this.f134726a;
        SurfaceTexture surfaceTexture = this.f134727b;
        if (iVar.mo5544c() || iVar.mo5539b() || ((Integer) iVar.mo5545d()).intValue() < 0) {
            return null;
        }
        Surface surface = new Surface(surfaceTexture);
        boolean a = mediaPlayerModule.f134714b.mo96711a(surface);
        surface.release();
        return Boolean.valueOf(a);
    }
}
