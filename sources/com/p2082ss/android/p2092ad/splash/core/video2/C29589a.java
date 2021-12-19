package com.p2082ss.android.p2092ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q;
import com.p2082ss.ttvideoengine.AbstractC86369ba;
import com.p2082ss.ttvideoengine.AbstractC86376be;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ad.splash.core.video2.a */
public final class C29589a implements AbstractC29621g, AbstractC29623i, HandlerC29663q.AbstractC29664a, AbstractC86369ba, AbstractC86376be {

    /* renamed from: i */
    public static final C29590a f70563i = new C29590a((byte) 0);

    /* renamed from: a */
    Context f70564a;

    /* renamed from: b */
    public AbstractC29622h f70565b;

    /* renamed from: c */
    public C86313ai f70566c;

    /* renamed from: d */
    public AbstractC29612b f70567d;

    /* renamed from: e */
    boolean f70568e;

    /* renamed from: f */
    public AbstractC89171a<C89391z> f70569f;

    /* renamed from: g */
    public HandlerC29663q f70570g;

    /* renamed from: h */
    public HandlerThread f70571h;

    /* renamed from: j */
    private boolean f70572j;

    /* renamed from: k */
    private boolean f70573k;

    /* renamed from: l */
    private long f70574l;

    /* renamed from: m */
    private Handler f70575m;

    static {
        Covode.recordClassIndex(35985);
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16746a(C86313ai aiVar) {
        C89219l.m154719c(aiVar, "");
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16748a(C86313ai aiVar, int i, int i2) {
        C89219l.m154719c(aiVar, "");
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86376be
    /* renamed from: a */
    public final boolean mo51861a(C86535p pVar) {
        C89219l.m154719c(pVar, "");
        return false;
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: b */
    public final void mo16750b(C86313ai aiVar) {
        C89219l.m154719c(aiVar, "");
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: b */
    public final void mo16751b(C86313ai aiVar, int i) {
        C89219l.m154719c(aiVar, "");
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29623i
    /* renamed from: b */
    public final boolean mo51864b(SurfaceTexture surfaceTexture) {
        C89219l.m154719c(surfaceTexture, "");
        return false;
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: c */
    public final void mo16753c(C86313ai aiVar, int i) {
        C89219l.m154719c(aiVar, "");
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: d */
    public final void mo16755d(C86313ai aiVar, int i) {
        C89219l.m154719c(aiVar, "");
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$a */
    public static final class C29590a {
        static {
            Covode.recordClassIndex(35986);
        }

        private C29590a() {
        }

        public /* synthetic */ C29590a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$c */
    static final class C29592c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C29592c f70577a = new C29592c();

        static {
            Covode.recordClassIndex(35988);
        }

        C29592c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: a */
    public final boolean mo51862a(String str, String str2) {
        C89219l.m154719c(str, "");
        if (str.length() == 0 || this.f70565b == null) {
            return false;
        }
        this.f70575m.post(new RunnableC29603n(this, str, str2));
        this.f70572j = false;
        return true;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: a */
    public final void mo51860a(boolean z) {
        this.f70575m.post(new RunnableC29608r(this, z));
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16749a(C86633c cVar) {
        C89219l.m154719c(cVar, "");
        this.f70570g.post(new RunnableC29594e(this));
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$b */
    static final class C29591b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C29589a f70576a;

        static {
            Covode.recordClassIndex(35987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29591b(C29589a aVar) {
            super(0);
            this.f70576a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f70576a.mo51856a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$h */
    static final class RunnableC29597h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC29612b f70585a;

        static {
            Covode.recordClassIndex(35993);
        }

        RunnableC29597h(AbstractC29612b bVar) {
            this.f70585a = bVar;
        }

        public final void run() {
            this.f70585a.mo51893j();
        }
    }

    private /* synthetic */ C29589a() {
        this(null);
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$d */
    static final class RunnableC29593d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70578a;

        /* renamed from: b */
        final /* synthetic */ C86313ai f70579b;

        static {
            Covode.recordClassIndex(35989);
        }

        RunnableC29593d(C29589a aVar, C86313ai aiVar) {
            this.f70578a = aVar;
            this.f70579b = aiVar;
        }

        public final void run() {
            AbstractC29612b bVar = this.f70578a.f70567d;
            if (bVar != null) {
                bVar.mo51422a(this.f70579b.f193376x);
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$e */
    static final class RunnableC29594e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70580a;

        static {
            Covode.recordClassIndex(35990);
        }

        RunnableC29594e(C29589a aVar) {
            this.f70580a = aVar;
        }

        public final void run() {
            AbstractC29612b bVar = this.f70580a.f70567d;
            if (bVar != null) {
                bVar.mo51424b();
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$g */
    static final class RunnableC29596g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC29612b f70582a;

        /* renamed from: b */
        final /* synthetic */ C29589a f70583b;

        /* renamed from: c */
        final /* synthetic */ int f70584c;

        static {
            Covode.recordClassIndex(35992);
        }

        RunnableC29596g(AbstractC29612b bVar, C29589a aVar, int i) {
            this.f70582a = bVar;
            this.f70583b = aVar;
            this.f70584c = i;
        }

        public final void run() {
            this.f70582a.mo51489c(this.f70583b.mo51868f());
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$i */
    static final class RunnableC29598i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70586a;

        static {
            Covode.recordClassIndex(35994);
        }

        RunnableC29598i(C29589a aVar) {
            this.f70586a = aVar;
        }

        public final void run() {
            AbstractC29612b bVar = this.f70586a.f70567d;
            if (bVar != null) {
                bVar.mo51421a();
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$j */
    static final class RunnableC29599j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70587a;

        /* renamed from: b */
        final /* synthetic */ C86313ai f70588b;

        static {
            Covode.recordClassIndex(35995);
        }

        RunnableC29599j(C29589a aVar, C86313ai aiVar) {
            this.f70587a = aVar;
            this.f70588b = aiVar;
        }

        public final void run() {
            AbstractC29612b bVar = this.f70587a.f70567d;
            if (bVar != null) {
                bVar.mo51487b(this.f70588b.f193376x);
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$l */
    static final class RunnableC29601l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70591a;

        static {
            Covode.recordClassIndex(35997);
        }

        RunnableC29601l(C29589a aVar) {
            this.f70591a = aVar;
        }

        public final void run() {
            AbstractC29612b bVar = this.f70591a.f70567d;
            if (bVar != null) {
                bVar.mo51424b();
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$m */
    static final class RunnableC29602m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70592a;

        static {
            Covode.recordClassIndex(35998);
        }

        RunnableC29602m(C29589a aVar) {
            this.f70592a = aVar;
        }

        public final void run() {
            C86313ai aiVar = this.f70592a.f70566c;
            if (aiVar != null) {
                aiVar.mo137255l();
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$q */
    static final class RunnableC29607q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70599a;

        static {
            Covode.recordClassIndex(36003);
        }

        RunnableC29607q(C29589a aVar) {
            this.f70599a = aVar;
        }

        public final void run() {
            C86313ai aiVar = this.f70599a.f70566c;
            if (aiVar != null) {
                aiVar.mo137251k();
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$r */
    static final class RunnableC29608r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70600a;

        /* renamed from: b */
        final /* synthetic */ boolean f70601b;

        static {
            Covode.recordClassIndex(36004);
        }

        RunnableC29608r(C29589a aVar, boolean z) {
            this.f70600a = aVar;
            this.f70601b = z;
        }

        public final void run() {
            C86313ai aiVar = this.f70600a.f70566c;
            if (aiVar != null) {
                aiVar.mo137236g(this.f70601b);
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$s */
    static final class RunnableC29609s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70602a;

        /* renamed from: b */
        final /* synthetic */ float f70603b;

        /* renamed from: c */
        final /* synthetic */ float f70604c;

        static {
            Covode.recordClassIndex(36005);
        }

        RunnableC29609s(C29589a aVar, float f, float f2) {
            this.f70602a = aVar;
            this.f70603b = f;
            this.f70604c = f2;
        }

        public final void run() {
            C86313ai aiVar = this.f70602a.f70566c;
            if (aiVar != null) {
                aiVar.mo137159a(this.f70603b, this.f70604c);
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$u */
    static final class RunnableC29611u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70606a;

        static {
            Covode.recordClassIndex(36007);
        }

        RunnableC29611u(C29589a aVar) {
            this.f70606a = aVar;
        }

        public final void run() {
            C86313ai aiVar = this.f70606a.f70566c;
            if (aiVar != null) {
                aiVar.mo137258m();
            }
        }
    }

    /* renamed from: a */
    public final void mo51856a() {
        C86313ai aiVar = this.f70566c;
        if (aiVar != null) {
            this.f70575m.post(new RunnableC29605o(aiVar));
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: c */
    public final float mo51865c() {
        C86313ai aiVar = this.f70566c;
        if (aiVar != null) {
            return aiVar.mo137228f();
        }
        return 0.0f;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: d */
    public final float mo51866d() {
        C86313ai aiVar = this.f70566c;
        if (aiVar != null) {
            return aiVar.mo137222e();
        }
        return 0.0f;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: e */
    public final boolean mo51867e() {
        C86313ai aiVar = this.f70566c;
        if (aiVar == null || aiVar.f193374v != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: f */
    public final int mo51868f() {
        C86313ai aiVar = this.f70566c;
        if (aiVar != null) {
            return aiVar.mo137267s();
        }
        return 0;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: g */
    public final int mo51869g() {
        C86313ai aiVar = this.f70566c;
        if (aiVar != null) {
            return aiVar.f193376x;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$f */
    static final class RunnableC29595f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70581a;

        static {
            Covode.recordClassIndex(35991);
        }

        RunnableC29595f(C29589a aVar) {
            this.f70581a = aVar;
        }

        public final void run() {
            AbstractC29612b bVar = this.f70581a.f70567d;
            if (bVar != null) {
                bVar.mo51892f(this.f70581a.mo51868f(), this.f70581a.mo51869g());
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$k */
    static final class RunnableC29600k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70589a;

        /* renamed from: b */
        final /* synthetic */ Surface f70590b;

        static {
            Covode.recordClassIndex(35996);
        }

        RunnableC29600k(C29589a aVar, Surface surface) {
            this.f70589a = aVar;
            this.f70590b = surface;
        }

        public final void run() {
            C86313ai aiVar = this.f70589a.f70566c;
            if (aiVar != null) {
                aiVar.mo137167a(this.f70590b);
            }
            this.f70589a.f70569f.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ad.splash.core.video2.a$o */
    public static final class RunnableC29605o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C86313ai f70597a;

        static {
            Covode.recordClassIndex(36001);
        }

        RunnableC29605o(C86313ai aiVar) {
            this.f70597a = aiVar;
        }

        public final void run() {
            try {
                this.f70597a.mo137242h(false);
                this.f70597a.mo137251k();
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$t */
    static final class RunnableC29610t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70605a;

        static {
            Covode.recordClassIndex(36006);
        }

        RunnableC29610t(C29589a aVar) {
            this.f70605a = aVar;
        }

        public final void run() {
            AbstractC29612b bVar = this.f70605a.f70567d;
            if (bVar != null) {
                bVar.mo51423a(this.f70605a.mo51868f(), this.f70605a.mo51869g());
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: b */
    public final void mo51863b() {
        if (!this.f70572j) {
            this.f70570g.post(new RunnableC29610t(this));
            this.f70575m.post(new RunnableC29611u(this));
            this.f70572j = true;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: h */
    public final void mo51870h() {
        if (mo51867e()) {
            this.f70575m.post(new RunnableC29602m(this));
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: i */
    public final void mo51871i() {
        C86313ai aiVar = this.f70566c;
        if (aiVar != null && aiVar.f193374v == 2) {
            this.f70575m.post(new RunnableC29607q(this));
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: j */
    public final void mo51872j() {
        AbstractC29622h hVar = this.f70565b;
        if (hVar != null) {
            hVar.mo51845a();
        }
        this.f70575m.post(new RunnableC29606p(this));
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$p */
    static final class RunnableC29606p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70598a;

        static {
            Covode.recordClassIndex(36002);
        }

        RunnableC29606p(C29589a aVar) {
            this.f70598a = aVar;
        }

        public final void run() {
            C86313ai aiVar = this.f70598a.f70566c;
            if (aiVar != null) {
                aiVar.mo137173a((AbstractC86369ba) null);
                aiVar.mo137174a((AbstractC86376be) null);
                aiVar.mo137261n();
            }
            this.f70598a.f70566c = null;
            this.f70598a.f70567d = null;
            int i = Build.VERSION.SDK_INT;
            this.f70598a.f70571h.quitSafely();
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$n */
    static final class RunnableC29603n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29589a f70593a;

        /* renamed from: b */
        final /* synthetic */ String f70594b;

        /* renamed from: c */
        final /* synthetic */ String f70595c;

        static {
            Covode.recordClassIndex(35999);
        }

        RunnableC29603n(C29589a aVar, String str, String str2) {
            this.f70593a = aVar;
            this.f70594b = str;
            this.f70595c = str2;
        }

        public final void run() {
            Surface surface;
            C29589a aVar = this.f70593a;
            String str = this.f70594b;
            String str2 = this.f70595c;
            C86313ai aiVar = aVar.f70566c;
            if (aiVar != null) {
                aiVar.mo137261n();
            }
            C86313ai aiVar2 = new C86313ai(aVar.f70564a, 0);
            boolean z = true;
            aiVar2.mo137236g(true);
            aiVar2.f192898aI = "splash_ad";
            aiVar2.mo137173a((AbstractC86369ba) aVar);
            aiVar2.mo137174a((AbstractC86376be) aVar);
            aiVar2.mo137230f(4, 2);
            aiVar2.mo137231f(str);
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z && str2 != null) {
                aiVar2.mo137182a(str2);
            }
            aiVar2.mo137160a(0);
            aVar.f70566c = aiVar2;
            AbstractC29622h hVar = this.f70593a.f70565b;
            if (hVar == null || (surface = hVar.getSurface()) == null || !surface.isValid()) {
                this.f70593a.f70570g.post(new Runnable(this) {
                    /* class com.p2082ss.android.p2092ad.splash.core.video2.C29589a.RunnableC29603n.RunnableC296041 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC29603n f70596a;

                    static {
                        Covode.recordClassIndex(36000);
                    }

                    {
                        this.f70596a = r1;
                    }

                    public final void run() {
                        AbstractC29622h hVar = this.f70596a.f70593a.f70565b;
                        if (hVar != null) {
                            hVar.setSurfaceViewVisibility(0);
                        }
                    }
                });
                C29589a aVar2 = this.f70593a;
                if (aVar2.f70568e) {
                    aVar2.mo51856a();
                } else {
                    aVar2.f70569f = new C29591b(aVar2);
                }
            } else {
                C86313ai aiVar3 = this.f70593a.f70566c;
                if (aiVar3 != null) {
                    aiVar3.mo137167a(surface);
                }
                this.f70593a.mo51856a();
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: a */
    public final void mo51859a(AbstractC29612b bVar) {
        C89219l.m154719c(bVar, "");
        this.f70567d = bVar;
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: c */
    public final void mo16752c(C86313ai aiVar) {
        C89219l.m154719c(aiVar, "");
        this.f70570g.post(new RunnableC29599j(this, aiVar));
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: d */
    public final void mo16754d(C86313ai aiVar) {
        C89219l.m154719c(aiVar, "");
        this.f70570g.post(new RunnableC29593d(this, aiVar));
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16745a(int i) {
        this.f70570g.post(new RunnableC29601l(this));
    }

    public C29589a(AbstractC29622h hVar) {
        this.f70569f = C29592c.f70577a;
        this.f70570g = new HandlerC29663q(this);
        HandlerThread handlerThread = new HandlerThread("player_thread", 0);
        this.f70571h = handlerThread;
        try {
            handlerThread.start();
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        this.f70575m = new Handler(this.f70571h.getLooper());
        if (hVar != null) {
            C89219l.m154719c(hVar, "");
            this.f70564a = hVar.getApplicationContext();
            hVar.setVideoViewCallback(this);
            this.f70565b = hVar;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29623i
    /* renamed from: a */
    public final void mo51858a(SurfaceTexture surfaceTexture) {
        Surface surface;
        C89219l.m154719c(surfaceTexture, "");
        this.f70568e = true;
        AbstractC29622h hVar = this.f70565b;
        if (hVar == null || (surface = hVar.getSurface()) == null) {
            surface = new Surface(surfaceTexture);
        }
        this.f70575m.post(new RunnableC29600k(this, surface));
    }

    @Override // com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.AbstractC29664a
    /* renamed from: a */
    public final void mo28809a(Message message) {
        C89219l.m154719c(message, "");
        if (message.what == 1000 && this.f70566c != null) {
            if (mo51867e()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.f70574l;
                long j2 = uptimeMillis - j;
                long j3 = 100;
                if (j != 0 && j2 > 100) {
                    j3 = 100 - (j2 % 100);
                }
                this.f70570g.sendMessageDelayed(this.f70570g.obtainMessage(1000), j3);
                this.f70574l = uptimeMillis;
            } else {
                this.f70574l = 0;
            }
            if (mo51869g() > 0) {
                this.f70570g.post(new RunnableC29595f(this));
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g
    /* renamed from: a */
    public final void mo51857a(float f, float f2) {
        this.f70575m.post(new RunnableC29609s(this, f, f2));
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
    /* renamed from: a */
    public final void mo16747a(C86313ai aiVar, int i) {
        AbstractC29612b bVar;
        C89219l.m154719c(aiVar, "");
        if (this.f70573k && (bVar = this.f70567d) != null) {
            if (i == 1) {
                this.f70570g.post(new RunnableC29597h(bVar));
            } else if (i == 2) {
                this.f70570g.post(new RunnableC29596g(bVar, this, i));
            }
        }
        if (mo51867e()) {
            if (!this.f70573k) {
                this.f70573k = true;
                this.f70570g.post(new RunnableC29598i(this));
            }
            this.f70570g.removeMessages(1000);
            this.f70570g.sendEmptyMessage(1000);
        }
    }
}
