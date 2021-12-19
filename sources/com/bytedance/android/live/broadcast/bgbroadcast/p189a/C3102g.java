package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.C1764a;
import com.bytedance.android.live.broadcast.bgbroadcast.p189a.p190a.C3092a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p605r.C10318g;
import com.bytedance.android.livesdk.p605r.C10319h;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g */
public final class C3102g {

    /* renamed from: w */
    public static final C3103a f8999w = new C3103a((byte) 0);

    /* renamed from: A */
    private final int f9000A;

    /* renamed from: a */
    public C10319h f9001a;

    /* renamed from: b */
    public C3092a f9002b;

    /* renamed from: c */
    public C10319h f9003c;

    /* renamed from: d */
    public AbstractC5863b f9004d;

    /* renamed from: e */
    public C3149r f9005e;

    /* renamed from: f */
    public int f9006f = 2;

    /* renamed from: g */
    public boolean f9007g;

    /* renamed from: h */
    public final int f9008h;

    /* renamed from: i */
    public final int f9009i;

    /* renamed from: j */
    public final int f9010j;

    /* renamed from: k */
    public final int f9011k;

    /* renamed from: l */
    final int f9012l;

    /* renamed from: m */
    public final List<AbstractC3143l> f9013m;

    /* renamed from: n */
    public C3104b f9014n;

    /* renamed from: o */
    public final C3104b f9015o;

    /* renamed from: p */
    public final C3104b f9016p;

    /* renamed from: q */
    public final C3104b f9017q;

    /* renamed from: r */
    public final C3104b f9018r;

    /* renamed from: s */
    public Runnable f9019s;

    /* renamed from: t */
    public long f9020t;

    /* renamed from: u */
    public final C3104b f9021u;

    /* renamed from: v */
    public final C3104b f9022v;

    /* renamed from: x */
    private final Handler f9023x = new Handler(Looper.getMainLooper());

    /* renamed from: y */
    private boolean f9024y;

    /* renamed from: z */
    private int f9025z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$i */
    public final /* synthetic */ class RunnableC3116i implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f9045a;

        static {
            Covode.recordClassIndex(3597);
        }

        RunnableC3116i(AbstractC89171a aVar) {
            this.f9045a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f9045a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(3583);
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$a */
    public static final class C3103a {
        static {
            Covode.recordClassIndex(3584);
        }

        private C3103a() {
        }

        public /* synthetic */ C3103a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo8416a(AbstractC3143l lVar) {
        C89219l.m154721d(lVar, "");
        return this.f9013m.add(lVar);
    }

    /* renamed from: a */
    public final void mo8415a(boolean z, boolean z2) {
        this.f9023x.postDelayed(new RunnableC3107e(this, z, z2), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d6, code lost:
        if (r12 != false) goto L_0x00be;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8414a(boolean r14, int r15, int r16) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.mo8414a(boolean, int, int):void");
    }

    /* renamed from: a */
    public final C10319h mo8408a() {
        C10319h hVar = this.f9001a;
        if (hVar == null) {
            C89219l.m154710a("ctrlWindow");
        }
        return hVar;
    }

    /* renamed from: b */
    public final C3092a mo8417b() {
        C3092a aVar = this.f9002b;
        if (aVar == null) {
            C89219l.m154710a("ctrlView");
        }
        return aVar;
    }

    /* renamed from: c */
    public final C10319h mo8420c() {
        C10319h hVar = this.f9003c;
        if (hVar == null) {
            C89219l.m154710a("msgWindow");
        }
        return hVar;
    }

    /* renamed from: d */
    public final AbstractC5863b mo8421d() {
        AbstractC5863b bVar = this.f9004d;
        if (bVar == null) {
            C89219l.m154710a("msgView");
        }
        return bVar;
    }

    /* renamed from: e */
    public final C3149r mo8422e() {
        C3149r rVar = this.f9005e;
        if (rVar == null) {
            C89219l.m154710a("trayView");
        }
        return rVar;
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$j */
    public static final class C3117j extends C3104b {

        /* renamed from: d */
        final /* synthetic */ C3102g f9046d;

        /* renamed from: e */
        private AbstractC88412b f9047e;

        static {
            Covode.recordClassIndex(3598);
        }

        /* renamed from: c */
        private final void m8493c() {
            View e = this.f9046d.mo8408a().mo17101e();
            C89219l.m154716b(e, "");
            e.setAlpha(0.5f);
        }

        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$j$a */
        static final class RunnableC3118a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3117j f9048a;

            static {
                Covode.recordClassIndex(3599);
            }

            RunnableC3118a(C3117j jVar) {
                this.f9048a = jVar;
            }

            public final void run() {
                this.f9048a.f9046d.mo8413a(!this.f9048a.f9046d.mo8423f());
                this.f9048a.f9046d.mo8421d().setState(2);
                if (this.f9048a.f9046d.mo8423f()) {
                    this.f9048a.f9046d.mo8412a((Integer) null);
                } else {
                    this.f9048a.f9046d.mo8415a(false, true);
                }
            }
        }

        /* renamed from: b */
        private final void m8492b() {
            AbstractC88412b bVar = this.f9047e;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f9047e = AbstractC88979t.m154307b(5000, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3119b(this), C3120c.f9050a);
        }

        /* renamed from: a */
        private final void m8491a() {
            if (this.f9046d.mo8408a().f24939k) {
                m8493c();
                int a = this.f9046d.f9011k + this.f9046d.mo8422e().mo8479a();
                C3102g gVar = this.f9046d;
                gVar.mo8410a(gVar.mo8408a(), this.f9046d.mo8408a().f24929a.f24927g, a);
                this.f9046d.mo8413a(false);
                this.f9046d.mo8422e().mo17080b(this.f9046d.mo8408a().f24929a.f24928h - this.f9046d.mo8422e().f9117c);
                this.f9046d.mo8422e().mo8481c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$j$b */
        public static final class C3119b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C3117j f9049a;

            static {
                Covode.recordClassIndex(3600);
            }

            C3119b(C3117j jVar) {
                this.f9049a = jVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f9049a.f9046d.mo8409a(EnumC3091a.CMD_HIDE_MSG_WINDOW);
                C6805b<Boolean> bVar = AbstractC6804a.f17041co;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a((C6800c) bVar, (Object) false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$j$c */
        public static final class C3120c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C3120c f9050a = new C3120c();

            static {
                Covode.recordClassIndex(3601);
            }

            C3120c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C89219l.m154721d(th, "");
                C3854a.m9453a(6, "ALogger", th.getMessage());
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: b */
        public final void mo8429b(C3104b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo8429b(bVar);
            AbstractC88412b bVar2 = this.f9047e;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            View e = this.f9046d.mo8408a().mo17101e();
            C89219l.m154716b(e, "");
            e.setAlpha(1.0f);
            this.f9046d.f9020t = SystemClock.uptimeMillis();
            this.f9046d.mo8422e().mo8480b();
            this.f9046d.f9019s = new RunnableC3118a(this);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final void mo8427a(C3104b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo8427a(bVar);
            m8491a();
            this.f9046d.f9019s = null;
            AbstractC5863b d = this.f9046d.mo8421d();
            d.setState(3);
            if (!d.mo11662a()) {
                C6805b<Boolean> bVar2 = AbstractC6804a.f17041co;
                C89219l.m154716b(bVar2, "");
                Boolean a = bVar2.mo13066a();
                C89219l.m154716b(a, "");
                if (!a.booleanValue() || !this.f9046d.mo8423f()) {
                    this.f9046d.mo8419b(false);
                } else {
                    this.f9046d.mo8420c().mo17099c();
                    m8492b();
                }
            }
            Iterator<T> it = this.f9046d.f9013m.iterator();
            while (it.hasNext()) {
                it.next().mo8474d();
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final boolean mo8428a(EnumC3091a aVar) {
            C89219l.m154721d(aVar, "");
            switch (C3125i.f9060c[aVar.ordinal()]) {
                case 1:
                    this.f9046d.mo8418b(aVar);
                    m8491a();
                    break;
                case 2:
                    C3102g gVar = this.f9046d;
                    C3102g.m8452a(gVar, gVar.f9022v, null, false, 6);
                    break;
                case 3:
                    Object param = aVar.getParam();
                    if (!(param instanceof C3146o)) {
                        param = null;
                    }
                    C3146o oVar = (C3146o) param;
                    if (oVar != null) {
                        this.f9046d.mo8414a(oVar.f9103a, oVar.f9104b, oVar.f9105c);
                    }
                    C3102g gVar2 = this.f9046d;
                    C3102g.m8452a(gVar2, gVar2.f9022v, null, false, 2);
                    break;
                case 4:
                    AbstractC88412b bVar = this.f9047e;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f9046d.mo8412a((Integer) null);
                    if (!this.f9046d.f9007g) {
                        m8492b();
                        break;
                    }
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    if (!this.f9046d.mo8421d().mo11662a()) {
                        this.f9046d.mo8419b(false);
                        break;
                    }
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    AbstractC88412b bVar2 = this.f9047e;
                    if (bVar2 != null) {
                        bVar2.dispose();
                    }
                    this.f9046d.mo8412a((Integer) null);
                    this.f9046d.f9007g = true;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    this.f9046d.mo8419b(false);
                    this.f9046d.f9007g = false;
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    C3102g gVar3 = this.f9046d;
                    C3102g.m8452a(gVar3, gVar3.f9017q, null, false, 6);
                    break;
                default:
                    return super.mo8428a(aVar);
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3117j(C3102g gVar, String str) {
            super(gVar, str);
            this.f9046d = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo8424g() {
        C3092a aVar = this.f9002b;
        if (aVar == null) {
            C89219l.m154710a("ctrlView");
        }
        return aVar.getIconWidth() + this.f9000A;
    }

    /* renamed from: h */
    public final void mo8425h() {
        C10319h hVar = this.f9001a;
        if (hVar == null) {
            C89219l.m154710a("ctrlWindow");
        }
        C10319h hVar2 = this.f9003c;
        if (hVar2 == null) {
            C89219l.m154710a("msgWindow");
        }
        m8453a(hVar, hVar2, mo8424g(), this.f9012l);
    }

    /* renamed from: i */
    public final boolean mo8426i() {
        C10319h hVar = this.f9001a;
        if (hVar == null) {
            C89219l.m154710a("ctrlWindow");
        }
        C10318g gVar = hVar.f24929a;
        C89219l.m154716b(gVar, "");
        if (gVar.f24927g < this.f9010j) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$f */
    public static final class C3108f extends C3104b {

        /* renamed from: d */
        final /* synthetic */ C3102g f9034d;

        /* renamed from: e */
        private AbstractC88412b f9035e;

        /* renamed from: f */
        private AbstractC88412b f9036f;

        static {
            Covode.recordClassIndex(3589);
        }

        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$f$a */
        static final class RunnableC3109a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3108f f9037a;

            static {
                Covode.recordClassIndex(3590);
            }

            RunnableC3109a(C3108f fVar) {
                this.f9037a = fVar;
            }

            public final void run() {
                C3149r e = this.f9037a.f9034d.mo8422e();
                int height = this.f9037a.f9034d.mo8417b().getHeight();
                int i = e.f9115a;
                if (height > 0 && i > height) {
                    e.f9117c = (e.f9115a - height) / 2;
                }
            }
        }

        /* renamed from: a */
        private final void m8480a() {
            C3102g gVar = this.f9034d;
            C10319h a = gVar.mo8408a();
            int i = this.f9034d.mo8408a().f24929a.f24927g;
            double d = (double) this.f9034d.f9010j;
            Double.isNaN(d);
            gVar.mo8410a(a, i, (int) (d * 1.5d));
            this.f9034d.mo8413a(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$f$d */
        public static final class C3112d<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C3108f f9040a;

            static {
                Covode.recordClassIndex(3593);
            }

            C3112d(C3108f fVar) {
                this.f9040a = fVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f9040a.f9034d.mo8409a(EnumC3091a.CMD_CTRL_MENU_COLLAPSE);
            }
        }

        /* renamed from: a */
        private final void m8481a(int i) {
            if (this.f9034d.mo8423f()) {
                m8483b(i);
            } else {
                m8480a();
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$f$b */
        static final class C3110b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C3108f f9038a;

            static {
                Covode.recordClassIndex(3591);
            }

            C3110b(C3108f fVar) {
                this.f9038a = fVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C6805b<Boolean> bVar = AbstractC6804a.f17040cn;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a((C6800c) bVar, (Object) false);
                this.f9038a.f9034d.mo8409a(EnumC3091a.CMD_SNAPPED_TIMER_ENDED);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$f$c */
        static final class C3111c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C3111c f9039a = new C3111c();

            static {
                Covode.recordClassIndex(3592);
            }

            C3111c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C89219l.m154721d(th, "");
                C3854a.m9453a(6, "ALogger", th.getMessage());
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: b */
        public final void mo8429b(C3104b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo8429b(bVar);
            AbstractC88412b bVar2 = this.f9036f;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            AbstractC88412b bVar3 = this.f9035e;
            if (bVar3 != null) {
                bVar3.dispose();
            }
        }

        /* renamed from: b */
        private final void m8483b(int i) {
            C3102g gVar = this.f9034d;
            C10319h a = gVar.mo8408a();
            int i2 = this.f9034d.mo8408a().f24929a.f24927g;
            double d = (double) this.f9034d.f9010j;
            Double.isNaN(d);
            gVar.mo8410a(a, i2, (int) (d * 1.5d));
            this.f9034d.mo8412a(Integer.valueOf(i));
        }

        /* renamed from: a */
        private final void m8482a(boolean z) {
            AbstractC88412b bVar = this.f9035e;
            if (bVar != null) {
                bVar.dispose();
            }
            if (z) {
                this.f9035e = AbstractC88979t.m154307b(10000, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3112d(this), C11195i.f26823a);
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final boolean mo8428a(EnumC3091a aVar) {
            C89219l.m154721d(aVar, "");
            switch (C3125i.f9059b[aVar.ordinal()]) {
                case 1:
                    this.f9034d.mo8418b(aVar);
                    C3102g gVar = this.f9034d;
                    C3102g.m8452a(gVar, gVar.f9021u, null, false, 6);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    C3102g gVar2 = this.f9034d;
                    C3102g.m8452a(gVar2, gVar2.f9022v, null, false, 6);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    C6805b<Boolean> bVar = AbstractC6804a.f16875D;
                    C89219l.m154716b(bVar, "");
                    C6806c.m14603a((C6800c) bVar, (Object) true);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    C6805b<Boolean> bVar2 = AbstractC6804a.f16875D;
                    C89219l.m154716b(bVar2, "");
                    C6806c.m14603a((C6800c) bVar2, (Object) false);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    C3102g gVar3 = this.f9034d;
                    C3102g.m8452a(gVar3, gVar3.f9021u, null, false, 6);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    C3102g gVar4 = this.f9034d;
                    gVar4.mo8413a(!gVar4.mo8417b().mo8395a());
                    boolean a = this.f9034d.mo8417b().mo8395a();
                    if (a || !this.f9034d.mo8423f()) {
                        this.f9034d.mo8419b(true);
                        this.f9034d.mo8415a(false, true);
                    } else {
                        this.f9034d.mo8412a((Integer) null);
                    }
                    m8482a(a);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    if (this.f9034d.mo8417b().mo8395a()) {
                        this.f9034d.mo8413a(false);
                        if (this.f9034d.mo8423f()) {
                            this.f9034d.mo8412a((Integer) null);
                            break;
                        }
                    }
                    break;
                default:
                    return super.mo8428a(aVar);
            }
            return true;
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final void mo8427a(C3104b bVar) {
            boolean z;
            C89219l.m154721d(bVar, "");
            super.mo8427a(bVar);
            if (C89219l.m154714a(bVar, this.f9034d.f9016p)) {
                this.f9034d.mo8408a().mo17099c();
                this.f9034d.mo8422e().f24926f.post(new RunnableC3109a(this));
                C6805b<Boolean> bVar2 = AbstractC6804a.f16875D;
                C89219l.m154716b(bVar2, "");
                Boolean a = bVar2.mo13066a();
                C6805b<Integer> bVar3 = AbstractC6804a.f17042cp;
                C89219l.m154716b(bVar3, "");
                Integer a2 = bVar3.mo13066a();
                if (a2 != null && a2.intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C3092a b = this.f9034d.mo8417b();
                C89219l.m154716b(a, "");
                b.setMsgBtnActive(a.booleanValue());
                if (!a.booleanValue() || !z) {
                    this.f9034d.mo8419b(false);
                } else {
                    this.f9034d.mo8413a(false);
                    this.f9034d.mo8412a((Integer) 2);
                }
            } else if (C89219l.m154714a(bVar, this.f9034d.f9021u)) {
                m8481a(this.f9034d.f9006f);
            } else if (C89219l.m154714a(bVar, this.f9034d.f9022v) && this.f9026a == EnumC3091a.CMD_CLICK_FLOAT_BALL && SystemClock.uptimeMillis() - this.f9034d.f9020t < 200) {
                m8481a(this.f9034d.f9006f);
                this.f9026a = null;
            } else if (this.f9034d.mo8426i()) {
                C3102g gVar = this.f9034d;
                C3102g.m8452a(gVar, gVar.f9021u, null, false, 6);
                return;
            }
            AbstractC88412b bVar4 = this.f9036f;
            if (bVar4 != null) {
                bVar4.dispose();
            }
            C6805b<Boolean> bVar5 = AbstractC6804a.f17040cn;
            C89219l.m154716b(bVar5, "");
            Boolean a3 = bVar5.mo13066a();
            C89219l.m154716b(a3, "");
            if (a3.booleanValue()) {
                this.f9036f = AbstractC88979t.m154307b(60000, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3110b(this), C3111c.f9039a);
            }
            Runnable runnable = this.f9034d.f9019s;
            if (runnable != null) {
                runnable.run();
            }
            this.f9034d.f9019s = null;
            m8482a(this.f9034d.mo8417b().mo8395a());
            Iterator<T> it = this.f9034d.f9013m.iterator();
            while (it.hasNext()) {
                it.next().mo8473c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3108f(C3102g gVar, String str) {
            super(gVar, str);
            this.f9034d = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$k */
    public static final class C3121k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3102g f9051a;

        /* renamed from: b */
        final /* synthetic */ C3104b f9052b;

        /* renamed from: c */
        final /* synthetic */ EnumC3091a f9053c;

        static {
            Covode.recordClassIndex(3602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3121k(C3102g gVar, C3104b bVar, EnumC3091a aVar) {
            super(0);
            this.f9051a = gVar;
            this.f9052b = bVar;
            this.f9053c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f9052b.f9026a = this.f9053c;
            C3102g gVar = this.f9051a;
            C3104b bVar = this.f9052b;
            C89219l.m154721d(bVar, "");
            if (!C89219l.m154714a(gVar.f9014n, bVar)) {
                C3104b bVar2 = gVar.f9014n;
                bVar2.mo8429b(bVar);
                gVar.f9014n = bVar;
                bVar.mo8427a(bVar2);
            }
            EnumC3091a aVar = this.f9051a.f9014n.f9026a;
            if (aVar != null) {
                this.f9051a.mo8409a(aVar);
                this.f9051a.f9014n.f9026a = null;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: f */
    public final boolean mo8423f() {
        C6805b<Boolean> bVar = AbstractC6804a.f16875D;
        C89219l.m154716b(bVar, "");
        if (!C89219l.m154714a((Object) bVar.mo13066a(), (Object) true)) {
            AbstractC5863b bVar2 = this.f9004d;
            if (bVar2 == null) {
                C89219l.m154710a("msgView");
            }
            if (bVar2.mo11662a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C3102g() {
        int a = C3966y.m9653a(10.0f);
        this.f9008h = a;
        this.f9009i = C13628n.m24525e(C3966y.m9669e()) + a;
        this.f9010j = a;
        this.f9000A = (int) C89393b.m154948a(6.0f);
        this.f9013m = new ArrayList();
        this.f9014n = new C3104b(this, "default");
        this.f9015o = new C3114h(this, "initState");
        this.f9016p = new C3113g(this, "hiddenState");
        this.f9017q = new C3108f(this, "floatingState");
        this.f9018r = new C3105c(this, "destroyState");
        this.f9021u = new C3117j(this, "snappedState");
        this.f9022v = new C3106d(this, "draggingState");
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$h */
    public static final class C3114h extends C3104b {

        /* renamed from: d */
        public boolean f9042d;

        /* renamed from: e */
        final /* synthetic */ C3102g f9043e;

        static {
            Covode.recordClassIndex(3595);
        }

        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$h$a */
        static final class RunnableC3115a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3114h f9044a;

            static {
                Covode.recordClassIndex(3596);
            }

            RunnableC3115a(C3114h hVar) {
                this.f9044a = hVar;
            }

            public final void run() {
                if (this.f9044a.f9043e.mo8417b().getWidth() <= 0 || this.f9044a.f9043e.mo8417b().getHeight() <= 0) {
                    String a = C1764a.m5928a("ctrlView size is wrong, width=%d, height=%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f9044a.f9043e.mo8417b().getWidth()), Integer.valueOf(this.f9044a.f9043e.mo8417b().getHeight())}, 2));
                    C89219l.m154716b(a, "");
                    C3854a.m9453a(6, "GameUiStateMachine", a);
                    this.f9044a.f9043e.mo8417b().measure(0, 0);
                    this.f9044a.f9043e.mo8408a().f24929a.mo17094b(this.f9044a.f9043e.mo8417b().getMeasuredWidth(), this.f9044a.f9043e.mo8417b().getMeasuredHeight());
                    String a2 = C1764a.m5928a("ctrlView size after measured, measuredWidth=%d, measuredHeight=%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f9044a.f9043e.mo8417b().getMeasuredWidth()), Integer.valueOf(this.f9044a.f9043e.mo8417b().getMeasuredHeight())}, 2));
                    C89219l.m154716b(a2, "");
                    C3854a.m9453a(6, "GameUiStateMachine", a2);
                    return;
                }
                this.f9044a.f9043e.mo8408a().f24929a.mo17094b(this.f9044a.f9043e.mo8417b().getWidth(), this.f9044a.f9043e.mo8417b().getHeight());
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final void mo8427a(C3104b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo8427a(bVar);
            if (!this.f9042d) {
                this.f9043e.mo8417b().post(new RunnableC3115a(this));
                C6805b<Integer> bVar2 = AbstractC6804a.f16873B;
                C89219l.m154716b(bVar2, "");
                Integer a = bVar2.mo13066a();
                C6805b<Integer> bVar3 = AbstractC6804a.f16874C;
                C89219l.m154716b(bVar3, "");
                Integer a2 = bVar3.mo13066a();
                if (a.intValue() < 0 || a2.intValue() < 0) {
                    this.f9043e.mo8408a().f24929a.mo17093a(8388659, this.f9043e.f9008h, this.f9043e.f9009i);
                } else {
                    C10318g gVar = this.f9043e.mo8408a().f24929a;
                    C89219l.m154716b(a, "");
                    int intValue = a.intValue();
                    C89219l.m154716b(a2, "");
                    gVar.mo17093a(8388659, intValue, a2.intValue());
                }
                this.f9043e.mo8425h();
                this.f9043e.mo8408a().mo17100d();
                this.f9043e.mo8419b(false);
                this.f9043e.mo8422e().mo8480b();
                Iterator<T> it = this.f9043e.f9013m.iterator();
                while (it.hasNext()) {
                    it.next().mo8471a();
                }
                this.f9042d = true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3114h(C3102g gVar, String str) {
            super(gVar, str);
            this.f9043e = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$e */
    public static final class RunnableC3107e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3102g f9031a;

        /* renamed from: b */
        final /* synthetic */ boolean f9032b;

        /* renamed from: c */
        final /* synthetic */ boolean f9033c;

        static {
            Covode.recordClassIndex(3588);
        }

        RunnableC3107e(C3102g gVar, boolean z, boolean z2) {
            this.f9031a = gVar;
            this.f9032b = z;
            this.f9033c = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e9, code lost:
            if (r4 != false) goto L_0x008b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 242
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.RunnableC3107e.run():void");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$m */
    public static final class C3123m implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C3102g f9056a;

        static {
            Covode.recordClassIndex(3604);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3123m(C3102g gVar) {
            this.f9056a = gVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f9056a.mo8425h();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$d */
    public static final class C3106d extends C3104b {

        /* renamed from: d */
        final /* synthetic */ C3102g f9030d;

        static {
            Covode.recordClassIndex(3587);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final void mo8427a(C3104b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo8427a(bVar);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final boolean mo8428a(EnumC3091a aVar) {
            C89219l.m154721d(aVar, "");
            C3146o oVar = null;
            switch (C3125i.f9061d[aVar.ordinal()]) {
                case 1:
                case 3:
                    return true;
                case 2:
                    this.f9030d.mo8418b(aVar);
                    C3102g gVar = this.f9030d;
                    C3102g.m8452a(gVar, gVar.f9021u, null, false, 6);
                    return true;
                case 4:
                    Object param = aVar.getParam();
                    if (param instanceof C3146o) {
                        oVar = param;
                    }
                    C3146o oVar2 = oVar;
                    if (oVar2 == null) {
                        return true;
                    }
                    this.f9030d.mo8414a(oVar2.f9103a, oVar2.f9104b, oVar2.f9105c);
                    return true;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    C3102g gVar2 = this.f9030d;
                    C3102g.m8452a(gVar2, gVar2.f9017q, aVar, false, 4);
                    return true;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    if (this.f9030d.mo8426i()) {
                        C3102g gVar3 = this.f9030d;
                        C3102g.m8452a(gVar3, gVar3.f9021u, null, false, 6);
                        return true;
                    }
                    C3102g gVar4 = this.f9030d;
                    C3102g.m8452a(gVar4, gVar4.f9017q, null, false, 6);
                    return true;
                default:
                    return super.mo8428a(aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3106d(C3102g gVar, String str) {
            super(gVar, str);
            this.f9030d = gVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$g */
    public static final class C3113g extends C3104b {

        /* renamed from: d */
        final /* synthetic */ C3102g f9041d;

        static {
            Covode.recordClassIndex(3594);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final boolean mo8428a(EnumC3091a aVar) {
            C89219l.m154721d(aVar, "");
            if (C3125i.f9058a[aVar.ordinal()] != 1) {
                return super.mo8428a(aVar);
            }
            return true;
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: b */
        public final void mo8429b(C3104b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo8429b(bVar);
            if (C89219l.m154714a(bVar, this.f9041d.f9017q)) {
                this.f9041d.mo8408a().mo17099c();
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final void mo8427a(C3104b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo8427a(bVar);
            this.f9041d.mo8408a().mo17100d();
            C6805b<Integer> bVar2 = AbstractC6804a.f16873B;
            C89219l.m154716b(bVar2, "");
            C10318g gVar = this.f9041d.mo8408a().f24929a;
            C89219l.m154716b(gVar, "");
            C6806c.m14603a(bVar2, Integer.valueOf(gVar.f24927g));
            C6805b<Integer> bVar3 = AbstractC6804a.f16874C;
            C89219l.m154716b(bVar3, "");
            C10318g gVar2 = this.f9041d.mo8408a().f24929a;
            C89219l.m154716b(gVar2, "");
            C6806c.m14603a(bVar3, Integer.valueOf(gVar2.f24928h));
            this.f9041d.mo8419b(false);
            this.f9041d.mo8422e().mo8480b();
            Iterator<T> it = this.f9041d.f9013m.iterator();
            while (it.hasNext()) {
                it.next().mo8472b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3113g(C3102g gVar, String str) {
            super(gVar, str);
            this.f9041d = gVar;
        }
    }

    /* renamed from: b */
    public final void mo8419b(boolean z) {
        C10319h hVar = this.f9003c;
        if (hVar == null) {
            C89219l.m154710a("msgWindow");
        }
        hVar.mo17100d();
        if (z) {
            C6805b<Integer> bVar = AbstractC6804a.f17042cp;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) 1);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$b */
    public class C3104b {

        /* renamed from: a */
        public EnumC3091a f9026a;

        /* renamed from: b */
        public final String f9027b;

        /* renamed from: c */
        final /* synthetic */ C3102g f9028c;

        static {
            Covode.recordClassIndex(3585);
        }

        /* renamed from: a */
        public void mo8427a(C3104b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* renamed from: b */
        public void mo8429b(C3104b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* renamed from: a */
        public boolean mo8428a(EnumC3091a aVar) {
            C89219l.m154721d(aVar, "");
            int i = C3124h.f9057a[aVar.ordinal()];
            if (i == 1) {
                C3102g gVar = this.f9028c;
                C3102g.m8452a(gVar, gVar.f9015o, null, false, 6);
            } else if (i == 2) {
                C3102g gVar2 = this.f9028c;
                C3102g.m8452a(gVar2, gVar2.f9016p, null, false, 6);
            } else if (i == 3) {
                C3102g gVar3 = this.f9028c;
                C3102g.m8452a(gVar3, gVar3.f9018r, null, false, 6);
            } else if (i != 4) {
                return false;
            } else {
                C3102g gVar4 = this.f9028c;
                C3102g.m8452a(gVar4, gVar4.f9017q, null, false, 6);
            }
            return true;
        }

        public C3104b(C3102g gVar, String str) {
            C89219l.m154721d(str, "");
            this.f9028c = gVar;
            this.f9027b = str;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$c */
    public static final class C3105c extends C3104b {

        /* renamed from: d */
        final /* synthetic */ C3102g f9029d;

        static {
            Covode.recordClassIndex(3586);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3102g.C3104b
        /* renamed from: a */
        public final void mo8427a(C3104b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo8427a(bVar);
            this.f9029d.mo8408a().mo17082a();
            this.f9029d.mo8420c().mo17082a();
            this.f9029d.mo8422e().mo17097f();
            Iterator<T> it = this.f9029d.f9013m.iterator();
            while (it.hasNext()) {
                it.next().mo8475e();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3105c(C3102g gVar, String str) {
            super(gVar, str);
            this.f9029d = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$l */
    public static final class C3122l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C3102g f9054a;

        /* renamed from: b */
        final /* synthetic */ C10319h f9055b;

        static {
            Covode.recordClassIndex(3603);
        }

        C3122l(C3102g gVar, C10319h hVar) {
            this.f9054a = gVar;
            this.f9055b = hVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            C10318g gVar = this.f9055b.f24929a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            gVar.mo17078a(((Integer) animatedValue).intValue());
            this.f9054a.mo8425h();
        }
    }

    /* renamed from: c */
    private final void m8454c(boolean z) {
        if (z) {
            C10319h hVar = this.f9001a;
            if (hVar == null) {
                C89219l.m154710a("ctrlWindow");
            }
            C10318g gVar = hVar.f24929a;
            if (gVar != null) {
                gVar.mo17095c((int) C89393b.m154948a(166.0f), (int) C89393b.m154948a(96.0f));
                return;
            }
            return;
        }
        C10319h hVar2 = this.f9001a;
        if (hVar2 == null) {
            C89219l.m154710a("ctrlWindow");
        }
        C10318g gVar2 = hVar2.f24929a;
        if (gVar2 != null) {
            gVar2.mo17095c((int) C89393b.m154948a(36.0f), (int) C89393b.m154948a(36.0f));
        }
    }

    /* renamed from: a */
    public final void mo8409a(EnumC3091a aVar) {
        C89219l.m154721d(aVar, "");
        if (C89219l.m154714a(this.f9014n, this.f9018r)) {
            C3854a.m9453a(6, "GameUiStateMachine", "stateMachine is destroy, cmd=".concat(String.valueOf(aVar)));
        } else if (!this.f9014n.mo8428a(aVar)) {
            C3854a.m9453a(6, "GameUiStateMachine", "not handleCommand, state=" + this.f9014n + ", cmd=" + aVar);
        }
    }

    /* renamed from: b */
    public final void mo8418b(EnumC3091a aVar) {
        if (aVar == EnumC3091a.CMD_ORIENTATION_CHANGED) {
            Object param = aVar.getParam();
            if (!(param instanceof C3145n)) {
                param = null;
            }
            C3145n nVar = (C3145n) param;
            if (nVar != null) {
                C3149r rVar = this.f9005e;
                if (rVar == null) {
                    C89219l.m154710a("trayView");
                }
                int i = nVar.f9102b;
                if (i > 0) {
                    rVar.mo17078a(rVar.f24927g - i);
                } else {
                    rVar.mo17078a(rVar.f24927g + rVar.f9116b);
                }
                rVar.f9116b = i;
                this.f9025z = nVar.f9102b;
                this.f9024y = nVar.f9101a;
            }
            C10319h hVar = this.f9001a;
            if (hVar == null) {
                C89219l.m154710a("ctrlWindow");
            }
            hVar.f24929a.mo17080b(this.f9009i);
        }
    }

    /* renamed from: a */
    public final void mo8412a(Integer num) {
        if (mo8423f()) {
            if (num != null) {
                AbstractC5863b bVar = this.f9004d;
                if (bVar == null) {
                    C89219l.m154710a("msgView");
                }
                bVar.setState(num.intValue());
            }
            C10319h hVar = this.f9003c;
            if (hVar == null) {
                C89219l.m154710a("msgWindow");
            }
            if (!hVar.f24939k) {
                C10319h hVar2 = this.f9003c;
                if (hVar2 == null) {
                    C89219l.m154710a("msgWindow");
                }
                hVar2.mo17099c();
                mo8425h();
                C6805b<Integer> bVar2 = AbstractC6804a.f17042cp;
                C89219l.m154716b(bVar2, "");
                C6806c.m14603a((C6800c) bVar2, (Object) 0);
                mo8415a(true, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo8413a(boolean z) {
        C3092a aVar = this.f9002b;
        if (aVar == null) {
            C89219l.m154710a("ctrlView");
        }
        if (aVar.mo8395a() != z) {
            if (z) {
                C3092a aVar2 = this.f9002b;
                if (aVar2 == null) {
                    C89219l.m154710a("ctrlView");
                }
                aVar2.f8981c.setVisibility(0);
                m8454c(true);
                return;
            }
            C3092a aVar3 = this.f9002b;
            if (aVar3 == null) {
                C89219l.m154710a("ctrlView");
            }
            aVar3.f8981c.setVisibility(8);
            m8454c(false);
        }
    }

    /* renamed from: a */
    public final void mo8410a(C10319h hVar, int i, int i2) {
        ValueAnimator ofInt = ObjectAnimator.ofInt(i, i2);
        C89219l.m154716b(ofInt, "");
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(200L).start();
        ofInt.addUpdateListener(new C3122l(this, hVar));
        ofInt.addListener(new C3123m(this));
    }

    /* renamed from: a */
    public final void mo8411a(C10319h hVar, C10319h hVar2, C3149r rVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar2, "");
        C89219l.m154721d(rVar, "");
        this.f9001a = hVar;
        View e = hVar.mo17101e();
        Objects.requireNonNull(e, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.bgbroadcast.game.floatwindow.LiveGameControlView");
        this.f9002b = (C3092a) e;
        this.f9003c = hVar2;
        View e2 = hVar2.mo17101e();
        Objects.requireNonNull(e2, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.api.game.GameMessageView");
        this.f9004d = (AbstractC5863b) e2;
        this.f9005e = rVar;
    }

    /* renamed from: a */
    static void m8453a(C10319h hVar, C10319h hVar2, int i, int i2) {
        if (hVar != null && hVar.f24939k && hVar2 != null && hVar2.f24939k) {
            C10318g gVar = hVar.f24929a;
            C89219l.m154716b(gVar, "");
            float f = (float) gVar.f24927g;
            C10318g gVar2 = hVar.f24929a;
            C89219l.m154716b(gVar2, "");
            float f2 = (float) gVar2.f24928h;
            hVar2.f24929a.mo17078a((int) (f + ((float) i)));
            hVar2.f24929a.mo17080b((int) (f2 + ((float) i2)));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m8452a(C3102g gVar, C3104b bVar, EnumC3091a aVar, boolean z, int i) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        C3121k kVar = new C3121k(gVar, bVar, aVar);
        if (z) {
            gVar.f9023x.post(new RunnableC3116i(kVar));
        } else {
            kVar.invoke();
        }
    }
}
