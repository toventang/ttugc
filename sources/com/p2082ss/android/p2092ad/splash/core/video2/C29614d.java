package com.p2082ss.android.p2092ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q;
import com.p2082ss.ttvideoengine.AbstractC86369ba;
import com.p2082ss.ttvideoengine.AbstractC86376be;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ad.splash.core.video2.d */
public final class C29614d implements AbstractC29621g, AbstractC29623i, HandlerC29663q.AbstractC29664a, AbstractC86369ba, AbstractC86376be {

    /* renamed from: a */
    protected Context f70608a;

    /* renamed from: b */
    protected AbstractC29622h f70609b;

    /* renamed from: c */
    protected C86313ai f70610c;

    /* renamed from: d */
    protected HandlerC29663q f70611d = new HandlerC29663q(this);

    /* renamed from: e */
    public AbstractC29612b f70612e;

    /* renamed from: f */
    private boolean f70613f;

    /* renamed from: g */
    private ArrayList<Runnable> f70614g = new ArrayList<>();

    /* renamed from: h */
    private boolean f70615h;

    /* renamed from: i */
    private boolean f70616i = false;

    /* renamed from: j */
    private boolean f70617j = false;

    /* renamed from: k */
    private long f70618k;

    static {
        Covode.recordClassIndex(36010);
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16746a(C86313ai aiVar) {
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16748a(C86313ai aiVar, int i, int i2) {
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86376be
    /* renamed from: a */
    public final boolean mo51861a(C86535p pVar) {
        return false;
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: b */
    public final void mo16750b(C86313ai aiVar) {
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: b */
    public final void mo16751b(C86313ai aiVar, int i) {
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29623i
    /* renamed from: b */
    public final boolean mo51864b(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: c */
    public final void mo16753c(C86313ai aiVar, int i) {
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: d */
    public final void mo16755d(C86313ai aiVar, int i) {
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: a */
    public final boolean mo51862a(String str, String str2) {
        if (TextUtils.isEmpty(str) || this.f70609b == null) {
            return false;
        }
        C86313ai aiVar = this.f70610c;
        if (aiVar != null) {
            aiVar.mo137261n();
        }
        C86313ai aiVar2 = new C86313ai(this.f70608a, 0);
        this.f70610c = aiVar2;
        aiVar2.mo137236g(true);
        this.f70610c.f192898aI = "splash_ad";
        this.f70610c.mo137173a((AbstractC86369ba) this);
        this.f70610c.mo137174a((AbstractC86376be) this);
        this.f70610c.mo137230f(4, 2);
        this.f70610c.mo137231f(str);
        if (!TextUtils.isEmpty(str2)) {
            this.f70610c.mo137182a(str2);
        }
        this.f70610c.mo137160a(0);
        Surface surface = this.f70609b.getSurface();
        if (surface == null || !surface.isValid()) {
            this.f70609b.setSurfaceViewVisibility(0);
            RunnableC296151 r1 = new Runnable() {
                /* class com.p2082ss.android.p2092ad.splash.core.video2.C29614d.RunnableC296151 */

                static {
                    Covode.recordClassIndex(36011);
                }

                public final void run() {
                    C29614d.this.mo51894a();
                }
            };
            if (this.f70613f) {
                r1.run();
            } else {
                this.f70614g.add(r1);
            }
        } else {
            this.f70610c.mo137167a(surface);
            mo51894a();
        }
        this.f70616i = false;
        return true;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: a */
    public final void mo51860a(boolean z) {
        C86313ai aiVar = this.f70610c;
        if (aiVar != null) {
            aiVar.mo137236g(z);
        }
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16749a(C86633c cVar) {
        AbstractC29612b bVar = this.f70612e;
        if (bVar != null) {
            bVar.mo51424b();
        }
    }

    /* renamed from: a */
    public final void mo51894a() {
        try {
            this.f70610c.mo137242h(false);
            this.f70610c.mo137251k();
        } catch (Exception unused) {
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: c */
    public final float mo51865c() {
        C86313ai aiVar = this.f70610c;
        if (aiVar == null) {
            return 0.0f;
        }
        return C86640h.m150088b(aiVar.f192916aa);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: d */
    public final float mo51866d() {
        C86313ai aiVar = this.f70610c;
        if (aiVar == null) {
            return 0.0f;
        }
        return aiVar.mo137222e();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: e */
    public final boolean mo51867e() {
        C86313ai aiVar = this.f70610c;
        if (aiVar == null || aiVar.f193374v != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: f */
    public final int mo51868f() {
        C86313ai aiVar = this.f70610c;
        if (aiVar != null) {
            return aiVar.mo137267s();
        }
        return 0;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: g */
    public final int mo51869g() {
        C86313ai aiVar = this.f70610c;
        if (aiVar != null) {
            return aiVar.f193376x;
        }
        return 0;
    }

    public C29614d() {
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: b */
    public final void mo51863b() {
        if (this.f70610c != null && !this.f70616i) {
            this.f70612e.mo51423a(mo51868f(), mo51869g());
            this.f70610c.mo137258m();
            this.f70616i = true;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: h */
    public final void mo51870h() {
        if (this.f70610c != null && mo51867e()) {
            this.f70610c.mo137255l();
            AbstractC29612b bVar = this.f70612e;
            if (bVar != null) {
                bVar.mo51489c(mo51868f());
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: i */
    public final void mo51871i() {
        C86313ai aiVar = this.f70610c;
        if (aiVar != null && aiVar.f193374v == 2) {
            this.f70610c.mo137251k();
            AbstractC29612b bVar = this.f70612e;
            if (bVar != null) {
                bVar.mo51893j();
            }
        }
    }

    /* renamed from: k */
    private void m59576k() {
        if (!this.f70615h && !this.f70614g.isEmpty()) {
            this.f70615h = true;
            Iterator it = new ArrayList(this.f70614g).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f70614g.clear();
            this.f70615h = false;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: j */
    public final void mo51872j() {
        AbstractC29622h hVar = this.f70609b;
        if (hVar != null) {
            hVar.mo51845a();
        }
        C86313ai aiVar = this.f70610c;
        if (aiVar != null) {
            aiVar.mo137173a((AbstractC86369ba) null);
            this.f70610c.mo137174a((AbstractC86376be) null);
            if (C29495h.m59095a().f70665m) {
                C86313ai aiVar2 = this.f70610c;
                C86641i.m150110a("TTVideoEngine", "releaseAsync,".concat(String.valueOf(aiVar2)));
                aiVar2.f192913aX = true;
                if (aiVar2.f193015ch.mo137317a(false)) {
                    aiVar2.f193015ch.mo137309a(5);
                } else {
                    aiVar2.mo137150N();
                }
            } else {
                this.f70610c.mo137261n();
            }
            this.f70610c = null;
        }
        this.f70612e = null;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: a */
    public final void mo51859a(AbstractC29612b bVar) {
        this.f70612e = bVar;
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16745a(int i) {
        AbstractC29612b bVar = this.f70612e;
        if (bVar != null) {
            bVar.mo51424b();
        }
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: c */
    public final void mo16752c(C86313ai aiVar) {
        AbstractC29612b bVar = this.f70612e;
        if (bVar != null) {
            bVar.mo51487b(aiVar.f193376x);
        }
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: d */
    public final void mo16754d(C86313ai aiVar) {
        AbstractC29612b bVar = this.f70612e;
        if (bVar != null) {
            bVar.mo51422a(mo51869g());
        }
    }

    public C29614d(AbstractC29622h hVar) {
        mo51895a(hVar);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29623i
    /* renamed from: a */
    public final void mo51858a(SurfaceTexture surfaceTexture) {
        this.f70613f = true;
        Surface surface = this.f70609b.getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        C86313ai aiVar = this.f70610c;
        if (aiVar != null) {
            aiVar.mo137167a(surface);
            m59576k();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.AbstractC29664a
    /* renamed from: a */
    public final void mo28809a(Message message) {
        AbstractC29612b bVar;
        if (message.what == 1000 && this.f70610c != null) {
            if (mo51867e()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.f70618k;
                long j2 = uptimeMillis - j;
                long j3 = 100;
                if (j != 0 && j2 > 100) {
                    j3 = 100 - (j2 % 100);
                }
                this.f70611d.sendMessageDelayed(this.f70611d.obtainMessage(1000), j3);
                this.f70618k = uptimeMillis;
            } else {
                this.f70618k = 0;
            }
            int i = this.f70610c.f193376x;
            if (i > 0 && (bVar = this.f70612e) != null) {
                bVar.mo51892f(this.f70610c.mo137267s(), i);
            }
        }
    }

    /* renamed from: a */
    public final void mo51895a(AbstractC29622h hVar) {
        if (hVar != null) {
            this.f70609b = hVar;
            hVar.setVideoViewCallback(this);
            this.f70608a = this.f70609b.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("IBDASplashVideoView can not be null");
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: a */
    public final void mo51857a(float f, float f2) {
        C86313ai aiVar = this.f70610c;
        if (aiVar != null) {
            aiVar.mo137159a(f, f2);
        }
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16747a(C86313ai aiVar, int i) {
        if (i == 1) {
            AbstractC29612b bVar = this.f70612e;
            if (bVar != null && !this.f70617j) {
                bVar.mo51421a();
            }
            this.f70611d.removeMessages(1000);
            this.f70611d.sendEmptyMessage(1000);
            this.f70617j = true;
        }
    }
}
