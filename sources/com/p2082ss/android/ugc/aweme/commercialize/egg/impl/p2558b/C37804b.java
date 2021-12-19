package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p1867c.AbstractC24295b;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.commercialize.egg.C37779a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38006d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b */
public final class C37804b extends AbstractC37801a {

    /* renamed from: i */
    public static final C37805a f89273i = new C37805a((byte) 0);

    /* renamed from: f */
    public SimpleDraweeView f89274f;

    /* renamed from: g */
    public long f89275g;

    /* renamed from: h */
    public boolean f89276h;

    /* renamed from: j */
    private final Handler f89277j = new Handler();

    static {
        Covode.recordClassIndex(45251);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b$a */
    public static final class C37805a {
        static {
            Covode.recordClassIndex(45252);
        }

        private C37805a() {
        }

        public /* synthetic */ C37805a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b$e */
    public static final class RunnableC37810e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37804b f89286a;

        static {
            Covode.recordClassIndex(45257);
        }

        RunnableC37810e(C37804b bVar) {
            this.f89286a = bVar;
        }

        public final void run() {
            this.f89286a.mo65820e();
        }
    }

    /* renamed from: e */
    public final void mo65820e() {
        this.f89276h = false;
        this.f89269e.setVisibility(8);
        SimpleDraweeView simpleDraweeView = this.f89274f;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b.AbstractC37801a
    /* renamed from: c */
    public final void mo65818c() {
        MethodCollector.m26663i(10520);
        this.f89276h = false;
        this.f89267c = null;
        this.f89277j.removeCallbacksAndMessages(null);
        mo65820e();
        if (this.f89274f != null) {
            this.f89269e.removeView(this.f89274f);
            this.f89274f = null;
        }
        MethodCollector.m26664o(10520);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b.AbstractC37801a
    /* renamed from: b */
    public final void mo65817b() {
        AbstractC24255a controller;
        Animatable i;
        MethodCollector.m26663i(10518);
        if (this.f89276h) {
            MethodCollector.m26664o(10518);
            return;
        }
        C37787a aVar = this.f89266b;
        if (aVar == null) {
            AbstractC37781a aVar2 = this.f89267c;
            if (aVar2 != null) {
                aVar2.mo65782b();
                MethodCollector.m26664o(10518);
                return;
            }
            MethodCollector.m26664o(10518);
            return;
        }
        String str = aVar.f89211a;
        if (str == null || str.length() == 0) {
            AbstractC37781a aVar3 = this.f89267c;
            if (aVar3 != null) {
                aVar3.mo65782b();
            }
            mo65814a("materialUrl is null");
            MethodCollector.m26664o(10518);
            return;
        }
        boolean z = aVar.f89217g;
        boolean a = C34577e.m70603a(Uri.parse(str));
        if (!z || a) {
            Context context = this.f89265a;
            if (this.f89274f == null) {
                SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
                simpleDraweeView.setHierarchy(new C24247b(context.getResources()).mo39976a(C24229q.AbstractC24231b.f57454d).mo39973a());
                this.f89274f = simpleDraweeView;
                this.f89269e.addView(this.f89274f);
            }
            SimpleDraweeView simpleDraweeView2 = this.f89274f;
            if (simpleDraweeView2 != null) {
                AbstractC37781a aVar4 = this.f89267c;
                if (aVar4 != null) {
                    aVar4.mo65783b(simpleDraweeView2, this.f89269e);
                }
                C24185e a2 = C24182c.m45843b().mo39797a(str);
                a2.f57303g = new C37806b(this);
                a2.f57306j = true;
                simpleDraweeView2.setController(a2.mo39827e());
                AbstractC37781a aVar5 = this.f89267c;
                if (aVar5 != null) {
                    if (aVar5.mo65784c()) {
                        simpleDraweeView2.setOnClickListener(new View$OnClickListenerC37808c(aVar5, simpleDraweeView2, this, str));
                    } else {
                        simpleDraweeView2.setOnClickListener(null);
                        simpleDraweeView2.setClickable(false);
                    }
                }
            }
            AbstractC37781a aVar6 = this.f89267c;
            if (aVar6 != null) {
                if (aVar6.mo65785d()) {
                    this.f89269e.setOnClickListener(new View$OnClickListenerC37809d(aVar6, this));
                } else {
                    this.f89269e.setOnClickListener(null);
                    this.f89269e.setClickable(false);
                }
            }
            this.f89269e.setVisibility(0);
            SimpleDraweeView simpleDraweeView3 = this.f89274f;
            if (simpleDraweeView3 != null) {
                simpleDraweeView3.setVisibility(0);
            }
            SimpleDraweeView simpleDraweeView4 = this.f89274f;
            if (simpleDraweeView4 != null) {
                simpleDraweeView4.bringToFront();
                String str2 = aVar.f89212b;
                if (C89219l.m154714a((Object) str2, (Object) C37779a.C37780a.f89203c) || C89219l.m154714a((Object) str2, (Object) C37779a.C37780a.f89204d)) {
                    SimpleDraweeView simpleDraweeView5 = this.f89274f;
                    if (!(simpleDraweeView5 == null || (controller = simpleDraweeView5.getController()) == null || (i = controller.mo39821i()) == null || i.isRunning())) {
                        i.start();
                    }
                    if (mo65816a()) {
                        m76457a(5000);
                    }
                } else {
                    this.f89276h = true;
                    m76457a(3000);
                }
                this.f89275g = System.currentTimeMillis();
                MethodCollector.m26664o(10518);
                return;
            }
            this.f89276h = false;
            AbstractC37781a aVar7 = this.f89267c;
            if (aVar7 != null) {
                aVar7.mo65782b();
                MethodCollector.m26664o(10518);
                return;
            }
            MethodCollector.m26664o(10518);
            return;
        }
        this.f89276h = false;
        AbstractC37781a aVar8 = this.f89267c;
        if (aVar8 != null) {
            aVar8.mo65782b();
        }
        mo65814a("preload failed");
        MethodCollector.m26664o(10518);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b$b */
    public static final class C37806b extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C37804b f89278a;

        static {
            Covode.recordClassIndex(45253);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b$b$a */
        public static final class C37807a implements AbstractC24295b {

            /* renamed from: a */
            final /* synthetic */ C37806b f89279a;

            static {
                Covode.recordClassIndex(45254);
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
            /* renamed from: a */
            public final void mo9283a(C24290a aVar) {
                C89219l.m154721d(aVar, "");
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
            /* renamed from: a */
            public final void mo9284a(C24290a aVar, int i) {
                C89219l.m154721d(aVar, "");
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
            /* renamed from: c */
            public final void mo9286c(C24290a aVar) {
                C89219l.m154721d(aVar, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C37807a(C37806b bVar) {
                this.f89279a = bVar;
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
            /* renamed from: b */
            public final void mo9285b(C24290a aVar) {
                C89219l.m154721d(aVar, "");
                this.f89279a.f89278a.mo65820e();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37806b(C37804b bVar) {
            this.f89278a = bVar;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            String str2;
            AbstractC37781a aVar = this.f89278a.f89267c;
            if (aVar != null) {
                aVar.mo65782b();
            }
            C37804b bVar = this.f89278a;
            if (th != null) {
                str2 = th.getMessage();
            } else {
                str2 = null;
            }
            bVar.mo65815a(false, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            try {
                this.f89278a.f89276h = true;
                AbstractC37781a aVar = this.f89278a.f89267c;
                if (aVar != null) {
                    aVar.mo65779a();
                }
                this.f89278a.mo65815a(true, null);
                if (animatable != null && (animatable instanceof C24290a)) {
                    C24290a aVar2 = (C24290a) animatable;
                    aVar2.mo40069a(new C38006d(aVar2.f57588d, ((Number) this.f89278a.f89268d.getValue()).intValue()));
                    aVar2.mo40070a(new C37807a(this));
                    animatable.start();
                }
            } catch (Throwable th) {
                C51423a.m95784a(3, null, "frescoOpenGifSplashError: e = ".concat(String.valueOf(th)));
                C51423a.m95790a(th);
                this.f89278a.mo65815a(false, th.getMessage());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37804b(FrameLayout frameLayout) {
        super(frameLayout);
        C89219l.m154721d(frameLayout, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b$c */
    static final class View$OnClickListenerC37808c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC37781a f89280a;

        /* renamed from: b */
        final /* synthetic */ SimpleDraweeView f89281b;

        /* renamed from: c */
        final /* synthetic */ C37804b f89282c;

        /* renamed from: d */
        final /* synthetic */ String f89283d;

        static {
            Covode.recordClassIndex(45255);
        }

        View$OnClickListenerC37808c(AbstractC37781a aVar, SimpleDraweeView simpleDraweeView, C37804b bVar, String str) {
            this.f89280a = aVar;
            this.f89281b = simpleDraweeView;
            this.f89282c = bVar;
            this.f89283d = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC37781a aVar = this.f89280a;
            C89219l.m154716b(view, "");
            aVar.mo65780a(view, (int) (System.currentTimeMillis() - this.f89282c.f89275g));
            this.f89282c.mo65820e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b$d */
    static final class View$OnClickListenerC37809d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC37781a f89284a;

        /* renamed from: b */
        final /* synthetic */ C37804b f89285b;

        static {
            Covode.recordClassIndex(45256);
        }

        View$OnClickListenerC37809d(AbstractC37781a aVar, C37804b bVar) {
            this.f89284a = aVar;
            this.f89285b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC37781a aVar = this.f89284a;
            SimpleDraweeView simpleDraweeView = this.f89285b.f89274f;
            C89219l.m154716b(view, "");
            aVar.mo65781a(simpleDraweeView, view);
        }
    }

    /* renamed from: a */
    private final void m76457a(long j) {
        this.f89277j.removeCallbacksAndMessages(null);
        this.f89277j.postDelayed(new RunnableC37810e(this), j);
    }
}
