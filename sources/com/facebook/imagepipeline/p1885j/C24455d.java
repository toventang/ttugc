package com.facebook.imagepipeline.p1885j;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1836h.AbstractC24120c;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imageutils.C24656a;

/* renamed from: com.facebook.imagepipeline.j.d */
public final class C24455d extends AbstractC24453b {

    /* renamed from: a */
    public volatile Bitmap f58089a;

    /* renamed from: b */
    public final int f58090b;

    /* renamed from: c */
    public final int f58091c;

    /* renamed from: d */
    private C24117a<Bitmap> f58092d;

    /* renamed from: e */
    private final AbstractC24459h f58093e;

    static {
        Covode.recordClassIndex(28598);
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24453b
    /* renamed from: d */
    public final Bitmap mo40296d() {
        return this.f58089a;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24454c
    /* renamed from: e */
    public final AbstractC24459h mo40297e() {
        return this.f58093e;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24454c
    /* renamed from: b */
    public final int mo40290b() {
        return C24656a.m47171a(this.f58089a);
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24454c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C24117a<Bitmap> g = m46673g();
        if (g != null) {
            g.close();
        }
    }

    /* renamed from: g */
    private synchronized C24117a<Bitmap> m46673g() {
        C24117a<Bitmap> aVar;
        MethodCollector.m26663i(5005);
        aVar = this.f58092d;
        this.f58092d = null;
        this.f58089a = null;
        MethodCollector.m26664o(5005);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24454c
    /* renamed from: a */
    public final synchronized boolean mo40289a() {
        MethodCollector.m26663i(5071);
        if (this.f58092d == null) {
            MethodCollector.m26664o(5071);
            return true;
        }
        MethodCollector.m26664o(5071);
        return false;
    }

    /* renamed from: f */
    public final synchronized C24117a<Bitmap> mo40299f() {
        C24117a<Bitmap> b;
        MethodCollector.m26663i(5006);
        b = C24117a.m45711b(this.f58092d);
        MethodCollector.m26664o(5006);
        return b;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24457f
    public final int getHeight() {
        int i;
        if (this.f58090b % LiveFeedRefreshTimeSetting.DEFAULT != 0 || (i = this.f58091c) == 5 || i == 7) {
            return m46671a(this.f58089a);
        }
        return m46672b(this.f58089a);
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24457f
    public final int getWidth() {
        int i;
        if (this.f58090b % LiveFeedRefreshTimeSetting.DEFAULT != 0 || (i = this.f58091c) == 5 || i == 7) {
            return m46672b(this.f58089a);
        }
        return m46671a(this.f58089a);
    }

    /* renamed from: a */
    private static int m46671a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: b */
    private static int m46672b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public C24455d(C24117a<Bitmap> aVar, AbstractC24459h hVar) {
        this(aVar, hVar, 0, 0);
    }

    public C24455d(Bitmap bitmap, AbstractC24120c<Bitmap> cVar, AbstractC24459h hVar) {
        this(bitmap, cVar, hVar, (byte) 0);
    }

    public C24455d(C24117a<Bitmap> aVar, AbstractC24459h hVar, int i, int i2) {
        C24117a<Bitmap> aVar2 = (C24117a) C24091i.m45617a(aVar.mo39697c());
        this.f58092d = aVar2;
        this.f58089a = aVar2.mo39695a();
        this.f58093e = hVar;
        this.f58090b = i;
        this.f58091c = i2;
    }

    private C24455d(Bitmap bitmap, AbstractC24120c<Bitmap> cVar, AbstractC24459h hVar, byte b) {
        this.f58089a = (Bitmap) C24091i.m45617a(bitmap);
        this.f58092d = C24117a.m45707a(this.f58089a, (AbstractC24120c) C24091i.m45617a(cVar));
        this.f58093e = hVar;
        this.f58090b = 0;
        this.f58091c = 0;
    }
}
