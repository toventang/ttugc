package com.p2082ss.android.ugc.aweme.discover.p2766b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.C24296c;
import com.google.android.material.appbar.AppBarLayout;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42309b;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41520as;
import com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.utils.C80590iv;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.discover.b.g */
public final class View$OnAttachStateChangeListenerC41864g extends RecyclerView.AbstractC1371n implements View.OnAttachStateChangeListener {

    /* renamed from: p */
    public static final C41867b f97664p = new C41867b((byte) 0);

    /* renamed from: A */
    private boolean f97665A;

    /* renamed from: B */
    private Integer f97666B;

    /* renamed from: C */
    private Integer f97667C;

    /* renamed from: D */
    private long f97668D;

    /* renamed from: a */
    public float f97669a;

    /* renamed from: b */
    public float f97670b;

    /* renamed from: c */
    public boolean f97671c;

    /* renamed from: d */
    public int f97672d;

    /* renamed from: e */
    public int f97673e;

    /* renamed from: f */
    boolean f97674f;

    /* renamed from: g */
    public boolean f97675g;

    /* renamed from: h */
    public boolean f97676h;

    /* renamed from: i */
    public boolean f97677i;

    /* renamed from: j */
    public boolean f97678j;

    /* renamed from: k */
    public Integer f97679k;

    /* renamed from: l */
    AbstractC41858b f97680l;

    /* renamed from: m */
    public final AbstractC89244h f97681m = C89250i.m154773a((AbstractC89171a) new C41885s(this));

    /* renamed from: n */
    public final RecyclerView f97682n;

    /* renamed from: o */
    public final View f97683o;

    /* renamed from: q */
    private final AbstractC89244h f97684q = C89250i.m154773a((AbstractC89171a) new C41869d(this));

    /* renamed from: r */
    private final AbstractC89244h f97685r = C89250i.m154773a((AbstractC89171a) C41873h.f97705a);

    /* renamed from: s */
    private final AbstractC89244h f97686s = C89250i.m154773a((AbstractC89171a) C41874i.f97706a);

    /* renamed from: t */
    private final AbstractC89244h f97687t = C89250i.m154773a((AbstractC89171a) C41872g.f97704a);

    /* renamed from: u */
    private final AbstractC89244h f97688u = C89250i.m154773a((AbstractC89171a) C41870e.f97702a);

    /* renamed from: v */
    private final AbstractC89244h f97689v = C89250i.m154773a((AbstractC89171a) new C41871f(this));

    /* renamed from: w */
    private int f97690w;

    /* renamed from: x */
    private boolean f97691x;

    /* renamed from: y */
    private boolean f97692y;

    /* renamed from: z */
    private boolean f97693z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$a */
    public static final class HandlerC41865a extends Handler {

        /* renamed from: e */
        private static final C41866a f97694e = new C41866a((byte) 0);

        /* renamed from: a */
        public boolean f97695a;

        /* renamed from: b */
        public boolean f97696b;

        /* renamed from: c */
        private final WeakReference<View$OnAttachStateChangeListenerC41864g> f97697c;

        /* renamed from: d */
        private boolean f97698d;

        static {
            Covode.recordClassIndex(49791);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.b.g$a$a */
        static final class C41866a {
            static {
                Covode.recordClassIndex(49792);
            }

            private C41866a() {
            }

            public /* synthetic */ C41866a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        public final void mo71042a() {
            this.f97698d = true;
            this.f97695a = false;
            removeMessages(1);
        }

        /* renamed from: b */
        public final void mo71044b() {
            this.f97696b = false;
            this.f97698d = false;
            this.f97695a = false;
            removeCallbacksAndMessages(null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC41865a(View$OnAttachStateChangeListenerC41864g gVar) {
            super(Looper.getMainLooper());
            C89219l.m154721d(gVar, "");
            this.f97697c = new WeakReference<>(gVar);
        }

        /* renamed from: a */
        public final void mo71043a(Integer num) {
            if (this.f97698d) {
                this.f97698d = false;
                removeMessages(1);
                return;
            }
            this.f97695a = true;
            obtainMessage(1, num).sendToTarget();
        }

        public final void handleMessage(Message message) {
            T t;
            AbstractC41858b bVar;
            String str;
            C89219l.m154721d(message, "");
            int i = message.what;
            Object obj = null;
            if (i == 1) {
                this.f97696b = true;
                View$OnAttachStateChangeListenerC41864g gVar = this.f97697c.get();
                if (gVar != null) {
                    Object obj2 = message.obj;
                    if (obj2 instanceof Integer) {
                        obj = obj2;
                    }
                    Integer num = (Integer) obj;
                    AbstractC41858b a = gVar.mo71029a(0);
                    if (a != null) {
                        gVar.mo71031a(a, num, new C41877l(gVar, num));
                    }
                }
            } else if (i == 2) {
                Object obj3 = message.obj;
                View$OnAttachStateChangeListenerC41864g gVar2 = this.f97697c.get();
                if (gVar2 != null) {
                    Object obj4 = message.obj;
                    if (!(obj4 instanceof String)) {
                        obj4 = null;
                    }
                    Set<Map.Entry<Integer, AbstractC41858b>> entrySet = gVar2.mo71034b().entrySet();
                    C89219l.m154716b(entrySet, "");
                    Iterator<T> it = entrySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        T t2 = t;
                        Aweme x = ((AbstractC41858b) t2.getValue()).mo60380h().mo60396x();
                        if (x != null) {
                            str = x.getAid();
                        } else {
                            str = null;
                        }
                        ((AbstractC41858b) t2.getValue()).mo60380h().mo60387o();
                        if (C89219l.m154714a((Object) str, obj4) && C41861d.m83859b((AbstractC41858b) t2.getValue()) >= 0) {
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        bVar = (AbstractC41858b) t3.getValue();
                        if (bVar != null) {
                            Integer.valueOf(bVar.mo60380h().mo60387o());
                        }
                    } else {
                        bVar = null;
                    }
                    gVar2.f97679k = null;
                    gVar2.f97674f = false;
                    if (bVar != null) {
                        gVar2.mo71031a(bVar, (Integer) null, (AbstractC41863f) null);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$e */
    static final class C41870e extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C41870e f97702a = new C41870e();

        static {
            Covode.recordClassIndex(49796);
        }

        C41870e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(49790);
    }

    /* renamed from: h */
    private final Map<C41868c, Float> m83873h() {
        return (Map) this.f97686s.getValue();
    }

    /* renamed from: i */
    private final Map<C41868c, Float> m83874i() {
        return (Map) this.f97687t.getValue();
    }

    /* renamed from: j */
    private final int[] m83875j() {
        return (int[]) this.f97688u.getValue();
    }

    /* renamed from: a */
    public final Context mo71028a() {
        return (Context) this.f97684q.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConcurrentHashMap<Integer, AbstractC41858b> mo71034b() {
        return (ConcurrentHashMap) this.f97685r.getValue();
    }

    /* renamed from: c */
    public final HandlerC41865a mo71035c() {
        return (HandlerC41865a) this.f97689v.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$b */
    static final class C41867b {
        static {
            Covode.recordClassIndex(49793);
        }

        private C41867b() {
        }

        public /* synthetic */ C41867b(byte b) {
            this();
        }
    }

    /* renamed from: g */
    public final void mo71039g() {
        mo71038f();
    }

    /* renamed from: a */
    public final void mo71033a(boolean z, AppBarLayout appBarLayout) {
        this.f97692y = z;
        this.f97675g = false;
        this.f97691x = false;
        this.f97680l = null;
        this.f97679k = null;
        if (appBarLayout != null) {
            appBarLayout.mo43717a(new C41879m(this));
        }
        m83877l();
        this.f97682n.mo4418b(this);
        this.f97682n.mo4405a(this);
        this.f97682n.removeOnAttachStateChangeListener(this);
        this.f97682n.addOnAttachStateChangeListener(this);
        mo71038f();
        for (Map.Entry<Integer, AbstractC41858b> entry : mo71034b().entrySet()) {
            Aweme x = entry.getValue().mo60380h().mo60396x();
            if (x != null) {
                x.getDesc();
            }
            SearchPlayerCore a = C41861d.m83857a(entry.getValue());
            if (a != null) {
                AbstractC80747i mPlayer = a.getMPlayer();
                if (mPlayer != null) {
                    Integer.valueOf(mPlayer.hashCode());
                }
                a.getMPlayer();
                AbstractC80747i mPlayer2 = a.getMPlayer();
                if (mPlayer2 != null) {
                    mPlayer2.mo123914H();
                }
            }
        }
        mo71035c().mo71044b();
        mo71035c().postDelayed(new RunnableC41880n(this), 1000);
        this.f97665A = true;
    }

    /* renamed from: a */
    public final void mo71032a(String str) {
        if (str != null && str.length() != 0) {
            this.f97674f = true;
            HandlerC41865a c = mo71035c();
            c.removeMessages(2);
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = str;
            c.sendMessageDelayed(obtain, 500);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$f */
    static final class C41871f extends AbstractC89220m implements AbstractC89171a<HandlerC41865a> {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97703a;

        static {
            Covode.recordClassIndex(49797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41871f(View$OnAttachStateChangeListenerC41864g gVar) {
            super(0);
            this.f97703a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC41865a invoke() {
            return new HandlerC41865a(this.f97703a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$g */
    static final class C41872g extends AbstractC89220m implements AbstractC89171a<Map<C41868c, Float>> {

        /* renamed from: a */
        public static final C41872g f97704a = new C41872g();

        static {
            Covode.recordClassIndex(49798);
        }

        C41872g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<C41868c, Float> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$h */
    static final class C41873h extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<Integer, AbstractC41858b>> {

        /* renamed from: a */
        public static final C41873h f97705a = new C41873h();

        static {
            Covode.recordClassIndex(49799);
        }

        C41873h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<Integer, AbstractC41858b> invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$i */
    static final class C41874i extends AbstractC89220m implements AbstractC89171a<Map<C41868c, Float>> {

        /* renamed from: a */
        public static final C41874i f97706a = new C41874i();

        static {
            Covode.recordClassIndex(49800);
        }

        C41874i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<C41868c, Float> invoke() {
            return new LinkedHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$q */
    public static final class C41883q extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f97724a;

        static {
            Covode.recordClassIndex(49809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41883q(AbstractC89171a aVar) {
            super(0);
            this.f97724a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f97724a.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$d */
    static final class C41869d extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97701a;

        static {
            Covode.recordClassIndex(49795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41869d(View$OnAttachStateChangeListenerC41864g gVar) {
            super(0);
            this.f97701a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Context invoke() {
            return this.f97701a.f97682n.getContext();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$o */
    static final class C41881o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f97721a;

        /* renamed from: b */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97722b;

        static {
            Covode.recordClassIndex(49807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41881o(View view, View$OnAttachStateChangeListenerC41864g gVar) {
            super(0);
            this.f97721a = view;
            this.f97722b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f97722b.f97672d = this.f97721a.getHeight();
            return C89391z.f203057a;
        }
    }

    /* renamed from: e */
    public final void mo71037e() {
        if (this.f97665A) {
            m83877l();
            m83868b(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$l */
    public static final class C41877l extends AbstractC41863f {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97716a;

        /* renamed from: b */
        final /* synthetic */ Integer f97717b;

        static {
            Covode.recordClassIndex(49803);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.b.g$l$a */
        public static final class C41878a extends AbstractC41863f {

            /* renamed from: a */
            final /* synthetic */ C41877l f97718a;

            static {
                Covode.recordClassIndex(49804);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41863f
            /* renamed from: a */
            public final void mo71027a() {
                AbstractC41858b a = this.f97718a.f97716a.mo71029a(1);
                if (a != null) {
                    a.mo60389q();
                }
                this.f97718a.f97716a.mo71035c().mo71043a(this.f97718a.f97717b);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C41878a(C41877l lVar) {
                this.f97718a = lVar;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41863f
        /* renamed from: a */
        public final void mo71027a() {
            AbstractC41858b a = this.f97716a.mo71029a(0);
            if (a != null) {
                a.mo60389q();
            }
            AbstractC41858b a2 = this.f97716a.mo71029a(1);
            if (a2 != null) {
                this.f97716a.mo71031a(a2, this.f97717b, new C41878a(this));
            }
        }

        C41877l(View$OnAttachStateChangeListenerC41864g gVar, Integer num) {
            this.f97716a = gVar;
            this.f97717b = num;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$n */
    static final class RunnableC41880n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97720a;

        static {
            Covode.recordClassIndex(49806);
        }

        RunnableC41880n(View$OnAttachStateChangeListenerC41864g gVar) {
            this.f97720a = gVar;
        }

        public final void run() {
            this.f97720a.f97682n.isAttachedToWindow();
            if (!this.f97720a.f97676h && this.f97720a.f97677i) {
                this.f97720a.mo71036d();
            }
            this.f97720a.f97675g = true;
        }
    }

    /* renamed from: l */
    private final void m83877l() {
        if (!this.f97671c) {
            C41884r rVar = new C41884r(this);
            if (this.f97683o.getHeight() <= 0) {
                C80590iv.m139730a(this.f97683o, new C41883q(rVar));
            } else {
                rVar.invoke();
            }
        }
    }

    /* renamed from: f */
    public final void mo71038f() {
        if (mo71035c().f97695a) {
            mo71035c().mo71042a();
        }
        m83871c(mo71029a(0));
        m83871c(mo71029a(1));
        m83871c(this.f97680l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$r */
    public static final class C41884r extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97725a;

        static {
            Covode.recordClassIndex(49810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41884r(View$OnAttachStateChangeListenerC41864g gVar) {
            super(0);
            this.f97725a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            float f;
            int[] iArr = new int[2];
            this.f97725a.f97683o.getLocationOnScreen(iArr);
            int i = iArr[1];
            View$OnAttachStateChangeListenerC41864g gVar = this.f97725a;
            float f2 = (float) i;
            gVar.f97669a = (((float) gVar.f97683o.getHeight()) * 0.15f) + f2;
            View$OnAttachStateChangeListenerC41864g gVar2 = this.f97725a;
            float height = (float) gVar2.f97683o.getHeight();
            if (C41520as.m83460a() == 0 || C41520as.m83460a() == 1 || C41520as.m83460a() == 3) {
                f = 0.45f;
            } else {
                f = 0.35f;
            }
            gVar2.f97670b = f2 + (height * f);
            this.f97725a.f97671c = true;
            this.f97725a.f97683o.getHeight();
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$s */
    static final class C41885s extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97726a;

        static {
            Covode.recordClassIndex(49811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41885s(View$OnAttachStateChangeListenerC41864g gVar) {
            super(0);
            this.f97726a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
            if (com.p2082ss.android.ugc.aweme.utils.C80422fe.EnumC80423a.MOBILE != r1) goto L_0x0009;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke() {
            /*
                r4 = this;
                boolean r1 = com.p2082ss.android.ugc.aweme.discover.p2766b.C41886h.m83908b()
                r3 = 1
                r0 = 0
                if (r1 != 0) goto L_0x000e
            L_0x0008:
                r3 = 0
            L_0x0009:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x000e:
                boolean r0 = com.p2082ss.android.ugc.aweme.discover.p2760a.C41554x.m83488a()
                if (r0 != 0) goto L_0x0015
                goto L_0x0008
            L_0x0015:
                com.ss.android.ugc.aweme.discover.b.g r0 = r4.f97726a
                android.content.Context r1 = r0.mo71028a()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80422fe.m139425a(r1)
                if (r0 != 0) goto L_0x0027
                goto L_0x0008
            L_0x0027:
                com.ss.android.ugc.aweme.discover.b.g r0 = r4.f97726a
                android.content.Context r2 = r0.mo71028a()
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a.f118501a
                if (r0 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.utils.fe$a r1 = com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a.f118501a
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.p2082ss.android.ugc.aweme.utils.C80422fe.EnumC80423a.NONE
                if (r1 != r0) goto L_0x004c
            L_0x0037:
                com.ss.android.ugc.aweme.utils.fe$a r1 = com.p2082ss.android.ugc.aweme.utils.C80422fe.m139426b(r2)
            L_0x003b:
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.p2082ss.android.ugc.aweme.utils.C80422fe.EnumC80423a.MOBILE_2G
                if (r0 == r1) goto L_0x0008
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.p2082ss.android.ugc.aweme.utils.C80422fe.EnumC80423a.MOBILE_3G
                if (r0 == r1) goto L_0x0008
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.p2082ss.android.ugc.aweme.utils.C80422fe.EnumC80423a.MOBILE_4G
                if (r0 == r1) goto L_0x0008
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.p2082ss.android.ugc.aweme.utils.C80422fe.EnumC80423a.MOBILE
                if (r0 != r1) goto L_0x0009
                goto L_0x0008
            L_0x004c:
                com.ss.android.ugc.aweme.utils.fe$a r1 = com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a.f118501a
                goto L_0x003b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g.C41885s.invoke():java.lang.Object");
        }
    }

    /* renamed from: k */
    private final AbstractC41858b m83876k() {
        T t;
        Collection<AbstractC41858b> values = mo71034b().values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (t2.mo60380h().mo60387o() == 0 && C42309b.m84670a(Integer.valueOf(t2.mo60380h().mo60385m())) && t2.mo60380h().mo60381i()) {
                break;
            }
        }
        return t;
    }

    /* renamed from: d */
    public final void mo71036d() {
        Integer num;
        if (this.f97665A && !this.f97674f && !this.f97676h && this.f97677i && !this.f97678j) {
            if (!this.f97691x) {
                if (!this.f97692y) {
                    int i = 1;
                    if (C41886h.m83907a() == 1) {
                        i = 3;
                    }
                    if (!mo71035c().f97696b) {
                        mo71035c().mo71043a(Integer.valueOf(i));
                    } else {
                        AbstractC41858b a = mo71029a(0);
                        if (a != null) {
                            mo71031a(a, (Integer) null, (AbstractC41863f) null);
                        }
                    }
                } else {
                    AbstractC41858b k = m83876k();
                    if (k != null) {
                        num = Integer.valueOf(k.mo60380h().mo60385m());
                    } else {
                        num = null;
                    }
                    if (C42309b.m84670a(num) && k != null && k.mo60380h().mo60387o() == 0) {
                        mo71031a(k, (Integer) null, (AbstractC41863f) null);
                    }
                }
            }
            AbstractC41858b bVar = this.f97680l;
            if (bVar != null) {
                mo71031a(bVar, (Integer) null, (AbstractC41863f) null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$j */
    public static final class C41875j implements AbstractC20734k {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97707a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41858b f97708b;

        /* renamed from: c */
        final /* synthetic */ Integer f97709c;

        /* renamed from: d */
        final /* synthetic */ AbstractC41863f f97710d;

        /* renamed from: e */
        final /* synthetic */ SmartImageView f97711e;

        static {
            Covode.recordClassIndex(49801);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34146a(Uri uri) {
            hashCode();
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
            hashCode();
            if (view != null) {
                view.hashCode();
            }
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34148a(Uri uri, C20758o oVar) {
            hashCode();
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34149a(Uri uri, Throwable th) {
            hashCode();
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            hashCode();
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            SmartImageView s;
            AbstractC24270a aVar;
            AbstractC41858b bVar;
            Integer num;
            int b = C41861d.m83859b(this.f97708b);
            hashCode();
            if (view != null) {
                Integer.valueOf(view.hashCode());
            }
            if (this.f97707a.f97679k == null || ((num = this.f97707a.f97679k) != null && num.intValue() == b)) {
                View$OnAttachStateChangeListenerC41864g gVar = this.f97707a;
                AbstractC41858b bVar2 = this.f97708b;
                Integer num2 = this.f97709c;
                AbstractC41863f fVar = this.f97710d;
                if (bVar2 != null && (s = bVar2.mo60391s()) != null) {
                    C41861d.m83859b(bVar2);
                    if (!gVar.f97676h) {
                        C41862e eVar = null;
                        if (!gVar.mo71035c().f97695a && (bVar = gVar.f97680l) != null) {
                            int b2 = C41861d.m83859b(bVar);
                            int b3 = C41861d.m83859b(bVar2);
                            C41861d.m83862d(bVar2);
                            C41861d.m83862d(bVar);
                            if (b2 != b3 && C41861d.m83862d(bVar)) {
                                AbstractC41858b bVar3 = gVar.f97680l;
                                if (bVar3 != null) {
                                    Integer.valueOf(C41861d.m83859b(bVar3));
                                }
                                View$OnAttachStateChangeListenerC41864g.m83869b(bVar);
                                bVar.mo60389q();
                            }
                        }
                        C24290a a = C41861d.m83856a(s);
                        if (a != null) {
                            aVar = a.f57588d;
                        } else {
                            aVar = null;
                        }
                        if (aVar instanceof C41862e) {
                            eVar = aVar;
                        }
                        C41862e eVar2 = eVar;
                        if (eVar2 != null) {
                            eVar2.f97663b = num2;
                        } else if (a != null) {
                            a.mo40069a(new C41862e(a.f57588d, num2));
                        }
                        C41861d.m83858a(s, new C41882p(fVar));
                        if (s.f49154c == null || !s.f49154c.f49175b) {
                            C41861d.m83859b(bVar2);
                            return;
                        }
                        C41861d.m83859b(bVar2);
                        Aweme x = bVar2.mo60380h().mo60396x();
                        if (x != null) {
                            x.getDesc();
                        }
                        s.setUserVisibleHint(true);
                        s.mo34197b();
                        gVar.f97680l = bVar2;
                        return;
                    }
                    return;
                }
                return;
            }
            C41861d.m83860b(this.f97711e);
        }

        C41875j(View$OnAttachStateChangeListenerC41864g gVar, AbstractC41858b bVar, Integer num, AbstractC41863f fVar, SmartImageView smartImageView) {
            this.f97707a = gVar;
            this.f97708b = bVar;
            this.f97709c = num;
            this.f97710d = fVar;
            this.f97711e = smartImageView;
        }
    }

    public final void onViewAttachedToWindow(View view) {
        mo71036d();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$p */
    public static final class C41882p extends C24296c {

        /* renamed from: a */
        final /* synthetic */ AbstractC41863f f97723a;

        static {
            Covode.recordClassIndex(49808);
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
        /* renamed from: a */
        public final void mo9283a(C24290a aVar) {
        }

        C41882p(AbstractC41863f fVar) {
            this.f97723a = fVar;
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
        /* renamed from: b */
        public final void mo9285b(C24290a aVar) {
            AbstractC41863f fVar = this.f97723a;
            if (fVar != null) {
                fVar.mo71027a();
            }
        }
    }

    /* renamed from: c */
    private static void m83871c(AbstractC41858b bVar) {
        if (C41886h.m83910d()) {
            m83869b(bVar);
            if (bVar != null) {
                bVar.mo60389q();
                return;
            }
            return;
        }
        SearchPlayerCore a = C41861d.m83857a(bVar);
        if (a != null) {
            a.mo60584a();
        }
    }

    /* renamed from: b */
    static void m83869b(AbstractC41858b bVar) {
        SmartImageView s;
        if (bVar != null && (s = bVar.mo60391s()) != null) {
            C41861d.m83859b(bVar);
            Aweme x = bVar.mo60380h().mo60396x();
            if (x != null) {
                x.getDesc();
            }
            C41861d.m83858a(s, null);
            s.setUserVisibleHint(false);
            s.mo34198c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC41858b mo71029a(int i) {
        T t;
        Collection<AbstractC41858b> values = mo71034b().values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (C41861d.m83861c(t2) == i && t2.mo60380h().mo60381i()) {
                break;
            }
        }
        return t;
    }

    public final void onViewDetachedFromWindow(View view) {
        mo71038f();
        this.f97680l = null;
        this.f97667C = null;
        this.f97692y = false;
        this.f97691x = false;
        this.f97671c = false;
        this.f97673e = 0;
        this.f97672d = 0;
        this.f97670b = 0.0f;
        this.f97669a = 0.0f;
        mo71035c().mo71044b();
        this.f97682n.mo4418b(this);
        mo71034b().clear();
        m83873h().clear();
        m83874i().clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r3 != null) goto L_0x0039;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.ugc.aweme.base.model.UrlModel m83872d(com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.search.j.a r0 = r5.mo60380h()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo60396x()
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.feed.model.Video r2 = r0.getVideo()
            if (r2 != 0) goto L_0x0014
        L_0x0013:
            return r4
        L_0x0014:
            int r1 = com.p2082ss.android.ugc.aweme.discover.p2766b.C41886h.m83907a()
            r0 = 1
            if (r1 == r0) goto L_0x0027
            r0 = 2
            if (r1 == r0) goto L_0x0032
            r0 = 3
            if (r1 == r0) goto L_0x0022
            goto L_0x0013
        L_0x0022:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getAiDynamicCoverBak()
            goto L_0x0036
        L_0x0027:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getAnimatedCover()
            if (r3 != 0) goto L_0x0039
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getDynamicCover()
            goto L_0x0036
        L_0x0032:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getAiDynamicCover()
        L_0x0036:
            r0 = 0
            if (r3 == 0) goto L_0x0013
        L_0x0039:
            java.util.List r0 = r3.getUrlList()
            if (r0 == 0) goto L_0x0013
            java.util.Iterator r2 = r0.iterator()
        L_0x0043:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0043
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0043
            if (r1 == 0) goto L_0x0013
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g.m83872d(com.ss.android.ugc.aweme.discover.b.b):com.ss.android.ugc.aweme.base.model.UrlModel");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$k */
    public static final class C41876k implements SearchVideoView.AbstractC34237b {

        /* renamed from: a */
        final /* synthetic */ AbstractC41858b f97712a;

        /* renamed from: b */
        final /* synthetic */ Boolean f97713b;

        /* renamed from: c */
        final /* synthetic */ SearchPlayerCore f97714c;

        /* renamed from: d */
        final /* synthetic */ AbstractC41863f f97715d;

        static {
            Covode.recordClassIndex(49802);
        }

        @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView.AbstractC34237b
        /* renamed from: a */
        public final void mo60415a(C71904j jVar) {
            C89219l.m154721d(jVar, "");
            int i = jVar.f161106c;
            if (i != 1) {
                if (i != 7) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 11) {
                                if (i != 12) {
                                    return;
                                }
                            } else if ((this.f97712a instanceof View$OnClickListenerC42476c) && C41857a.m83849b()) {
                                ((View$OnClickListenerC42476c) this.f97712a).mo72634K();
                                return;
                            } else {
                                return;
                            }
                        } else if ((this.f97712a instanceof View$OnClickListenerC42476c) && C41857a.m83849b()) {
                            ((View$OnClickListenerC42476c) this.f97712a).mo72634K();
                            return;
                        } else {
                            return;
                        }
                    } else if ((this.f97712a instanceof View$OnClickListenerC42476c) && C41857a.m83849b()) {
                        ((View$OnClickListenerC42476c) this.f97712a).mo72636M();
                        return;
                    } else {
                        return;
                    }
                } else if (C89219l.m154714a((Object) this.f97713b, (Object) true)) {
                    this.f97714c.mo60584a();
                    AbstractC41863f fVar = this.f97715d;
                    if (fVar != null) {
                        fVar.mo71027a();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            if ((this.f97712a instanceof View$OnClickListenerC42476c) && C41857a.m83849b()) {
                ((View$OnClickListenerC42476c) this.f97712a).mo72636M();
            }
        }

        C41876k(AbstractC41858b bVar, Boolean bool, SearchPlayerCore searchPlayerCore, AbstractC41863f fVar) {
            this.f97712a = bVar;
            this.f97713b = bool;
            this.f97714c = searchPlayerCore;
            this.f97715d = fVar;
        }
    }

    /* renamed from: b */
    private final void m83868b(int i) {
        int i2;
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        Integer num = this.f97666B;
        if (num == null || num.intValue() != i2) {
            this.f97666B = Integer.valueOf(i2);
            m83873h().clear();
            m83874i().clear();
        }
        if (Math.abs(i) > 30) {
            z = true;
        } else {
            z = false;
        }
        float f5 = this.f97669a;
        int i3 = this.f97673e;
        float f6 = f5 + ((float) i3);
        float f7 = this.f97670b + ((float) i3);
        mo71034b().size();
        for (AbstractC41858b bVar : mo71034b().values()) {
            int b = C41861d.m83859b(bVar);
            if (b >= 0 && bVar.mo60380h().mo60381i()) {
                bVar.mo60380h().mo60384l().getLocationOnScreen(m83875j());
                float f8 = (float) m83875j()[1];
                float f9 = ((float) this.f97672d) + f8;
                int n = bVar.mo60380h().mo60386n();
                if (!C42309b.m84670a(Integer.valueOf(bVar.mo60380h().mo60385m())) || i == 0) {
                    if (n != 0) {
                        if (n == 1) {
                            if (i2 == 1) {
                                Float f10 = m83873h().get(new C41868c(bVar, Integer.valueOf(b)));
                                if (f10 != null) {
                                    f2 = f10.floatValue();
                                } else {
                                    f2 = f8;
                                }
                                float c = C89271h.m154771c(f2, f8);
                                float b2 = C89271h.m154768b(f2, f8);
                                if (f6 >= c && f6 <= b2) {
                                    C89219l.m154716b(bVar, "");
                                    m83867a(bVar, z);
                                }
                            }
                        } else if (n != 1) {
                        }
                        if (i2 == -1) {
                            Float f11 = m83874i().get(new C41868c(bVar, Integer.valueOf(b)));
                            if (f11 != null) {
                                f = f11.floatValue();
                            } else {
                                f = f9;
                            }
                            float c2 = C89271h.m154771c(f, f9);
                            float b3 = C89271h.m154768b(f, f9);
                            if (f7 >= c2 && f7 <= b3) {
                                C89219l.m154716b(bVar, "");
                                m83867a(bVar, z);
                            }
                        }
                    } else if (i2 == 1) {
                        Float f12 = m83873h().get(new C41868c(bVar, Integer.valueOf(b)));
                        if (f12 != null) {
                            f4 = f12.floatValue();
                        } else {
                            f4 = f8;
                        }
                        float c3 = C89271h.m154771c(f4, f8);
                        float b4 = C89271h.m154768b(f4, f8);
                        if (f7 >= c3 && f7 <= b4) {
                            C89219l.m154716b(bVar, "");
                            m83867a(bVar, z);
                        }
                    } else if (i2 == -1) {
                        Float f13 = m83873h().get(new C41868c(bVar, Integer.valueOf(b)));
                        if (f13 != null) {
                            f3 = f13.floatValue();
                        } else {
                            f3 = f8;
                        }
                        float c4 = C89271h.m154771c(f3, f8);
                        float b5 = C89271h.m154768b(f3, f8);
                        if (f6 >= c4 && f6 <= b5) {
                            C89219l.m154716b(bVar, "");
                            m83867a(bVar, z);
                        }
                    }
                    throw new IllegalStateException("Unsupported column index " + n + " found");
                }
                float f14 = this.f97670b;
                if (f14 >= f8 && f14 <= ((float) bVar.mo60380h().mo60384l().getHeight()) + f8) {
                    C41861d.m83859b(bVar);
                    C89219l.m154716b(bVar, "");
                    m83867a(bVar, z);
                }
                m83873h().put(new C41868c(bVar, Integer.valueOf(C41861d.m83859b(bVar))), Float.valueOf(f8));
                m83874i().put(new C41868c(bVar, Integer.valueOf(C41861d.m83859b(bVar))), Float.valueOf(f9));
            }
        }
    }

    /* renamed from: a */
    public final void mo71030a(AbstractC41858b bVar) {
        if (bVar != null && bVar.mo60390r()) {
            ConcurrentHashMap<Integer, AbstractC41858b> b = mo71034b();
            Integer valueOf = Integer.valueOf(bVar.hashCode());
            if (b.get(valueOf) == null) {
                bVar.hashCode();
                mo71034b().size();
                if (C42309b.m84670a(Integer.valueOf(bVar.mo60380h().mo60385m()))) {
                    this.f97693z = true;
                }
                b.putIfAbsent(valueOf, bVar);
            }
            if (this.f97672d <= 0 && bVar.mo60380h().mo60385m() == 16) {
                View l = bVar.mo60380h().mo60384l();
                if (l.getHeight() <= 0) {
                    C80590iv.m139730a(l, new C41881o(l, this));
                } else {
                    this.f97672d = l.getHeight();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$c */
    public static final class C41868c {

        /* renamed from: a */
        public AbstractC41858b f97699a;

        /* renamed from: b */
        public Integer f97700b;

        static {
            Covode.recordClassIndex(49794);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41868c)) {
                return false;
            }
            C41868c cVar = (C41868c) obj;
            return C89219l.m154714a(this.f97699a, cVar.f97699a) && C89219l.m154714a(this.f97700b, cVar.f97700b);
        }

        public final int hashCode() {
            AbstractC41858b bVar = this.f97699a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            Integer num = this.f97700b;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "HolderAndPosition(holder=" + this.f97699a + ", adapterPos=" + this.f97700b + ")";
        }

        public C41868c(AbstractC41858b bVar, Integer num) {
            this.f97699a = bVar;
            this.f97700b = num;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$m */
    static final class C41879m implements AppBarLayout.AbstractC26571c {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC41864g f97719a;

        static {
            Covode.recordClassIndex(49805);
        }

        C41879m(View$OnAttachStateChangeListenerC41864g gVar) {
            this.f97719a = gVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC26569a
        /* renamed from: a */
        public final void mo15197a(AppBarLayout appBarLayout, int i) {
            this.f97719a.f97673e = i;
        }
    }

    public View$OnAttachStateChangeListenerC41864g(RecyclerView recyclerView, View view) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(view, "");
        this.f97682n = recyclerView;
        this.f97683o = view;
    }

    /* renamed from: a */
    private final void m83867a(AbstractC41858b bVar, boolean z) {
        boolean z2;
        boolean z3;
        if (mo71035c().f97695a) {
            mo71035c().mo71042a();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f97690w == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j = this.f97668D;
        if (j == 0 || elapsedRealtime - j > 500) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3 || z) {
            Integer valueOf = Integer.valueOf(C41861d.m83859b(bVar));
            this.f97667C = valueOf;
            this.f97679k = valueOf;
            C41861d.m83859b(bVar);
            return;
        }
        C41861d.m83859b(bVar);
        this.f97667C = null;
        this.f97668D = elapsedRealtime;
        this.f97679k = Integer.valueOf(C41861d.m83859b(bVar));
        mo71031a(bVar, (Integer) null, (AbstractC41863f) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        RecyclerView.AbstractC1362i iVar;
        T t;
        AbstractC41858b bVar;
        C89219l.m154721d(recyclerView, "");
        super.mo4753a(recyclerView, i);
        this.f97690w = i;
        if (i == 0) {
            RecyclerView recyclerView2 = this.f97682n;
            if (recyclerView2 != null) {
                iVar = recyclerView2.getLayoutManager();
            } else {
                iVar = null;
            }
            if (!(iVar instanceof LinearLayoutManager)) {
                iVar = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
            if (linearLayoutManager != null && linearLayoutManager.mo4372l() == 0) {
                this.f97691x = false;
                this.f97679k = null;
                this.f97667C = null;
                if (this.f97692y) {
                    AbstractC41858b k = m83876k();
                    if (k != null) {
                        m83867a(k, false);
                        return;
                    }
                    return;
                }
                AbstractC41858b a = mo71029a(0);
                if (a != null) {
                    mo71031a(a, (Integer) null, (AbstractC41863f) null);
                    return;
                }
                return;
            }
            Integer num = this.f97667C;
            if (num != null) {
                int intValue = num.intValue();
                Set<Map.Entry<Integer, AbstractC41858b>> entrySet = mo71034b().entrySet();
                C89219l.m154716b(entrySet, "");
                Iterator<T> it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (intValue == C41861d.m83859b((AbstractC41858b) t.getValue())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    bVar = (AbstractC41858b) t2.getValue();
                } else {
                    bVar = null;
                }
                mo71031a(bVar, (Integer) null, (AbstractC41863f) null);
                this.f97667C = null;
            }
        }
    }

    /* renamed from: b */
    private final void m83870b(AbstractC41858b bVar, Integer num, AbstractC41863f fVar) {
        SmartImageView s;
        if (bVar != null && (s = bVar.mo60391s()) != null) {
            s.setVisibility(0);
            C34602l a = C34735v.m70965a(m83872d(bVar));
            List<String> list = a.f81655b;
            C89219l.m154716b(list, "");
            C89070n.m154583g((List) list);
            C20766v a2 = C20761r.m39060a(a);
            a2.f49092E = s;
            C20766v a3 = a2.mo34179a("TLVideoPlayController");
            a3.f49117n = C0643b.m2369a(mo71028a(), (int) R.drawable.beu);
            a3.mo34181a(new C41875j(this, bVar, num, fVar, s));
        }
    }

    /* renamed from: a */
    private final void m83866a(AbstractC41858b bVar, Boolean bool, AbstractC41863f fVar) {
        AbstractC34186b.AbstractC34192d t;
        boolean z;
        AbstractC41858b bVar2;
        if (!this.f97676h && this.f97677i && bVar != null && (t = bVar.mo60392t()) != null && (t instanceof SearchVideoView)) {
            SearchVideoView searchVideoView = (SearchVideoView) t;
            SearchPlayerCore a = C41861d.m83857a(bVar);
            if (a != null) {
                if (!a.getSurfaceHolder().mo129315c()) {
                    bVar.hashCode();
                    return;
                }
                if (C80635y.m139807b(bVar.mo60380h().mo60396x()) || C41857a.m83848a()) {
                    z = true;
                } else {
                    z = false;
                }
                a.setMute(z);
                C41861d.m83859b(bVar);
                Aweme x = bVar.mo60380h().mo60396x();
                if (x != null) {
                    x.getAid();
                }
                searchVideoView.setVideoPlayerStatusListener(new C41876k(bVar, bool, a, fVar));
                if (!mo71035c().f97695a && (bVar2 = this.f97680l) != null) {
                    int b = C41861d.m83859b(bVar2);
                    int b2 = C41861d.m83859b(bVar);
                    C41861d.m83863e(bVar);
                    C41861d.m83863e(bVar2);
                    if (b != b2 && C41861d.m83863e(bVar2)) {
                        AbstractC41858b bVar3 = this.f97680l;
                        if (bVar3 != null) {
                            Integer.valueOf(C41861d.m83859b(bVar3));
                        }
                        SearchPlayerCore a2 = C41861d.m83857a(bVar2);
                        if (a2 != null) {
                            a2.mo60584a();
                        }
                    }
                }
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    a.f80925a = 0;
                }
                a.mo60424A();
                this.f97680l = bVar;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (r0.getMLiveStarted() == true) goto L_0x00b0;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4754a(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g.mo4754a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: a */
    public final void mo71031a(AbstractC41858b bVar, Integer num, AbstractC41863f fVar) {
        boolean z;
        if (bVar != null) {
            AbstractC67459a h = bVar.mo60380h();
            C41861d.m83859b(bVar);
            h.mo60385m();
            h.mo60393u();
            h.mo60381i();
            if (!this.f97676h && h.mo60381i() && !h.mo60397y()) {
                if (h.mo60385m() == 16) {
                    if (!h.mo60393u()) {
                        C34181a.m69860c(bVar);
                        C34181a.m69861d(bVar);
                        if (C41886h.m83909c()) {
                            if (num != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            m83866a(bVar, Boolean.valueOf(z), fVar);
                        } else if (C41886h.m83910d()) {
                            m83870b(bVar, num, fVar);
                        }
                    }
                } else if (C42309b.m84670a(Integer.valueOf(h.mo60385m())) && !bVar.aZ_()) {
                    C34181a.m69860c(bVar.mo60392t());
                    C34181a.m69861d(bVar);
                    bVar.mo60424A();
                    this.f97680l = bVar;
                }
            }
        }
    }
}
