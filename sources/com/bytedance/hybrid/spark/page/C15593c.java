package com.bytedance.hybrid.spark.page;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.monitorV2.p739k.C12119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.AbstractC15504a;
import com.bytedance.hybrid.spark.AbstractC15528b;
import com.bytedance.hybrid.spark.C15534d;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.p1107a.AbstractC15505a;
import com.bytedance.hybrid.spark.p1107a.AbstractC15506b;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.hybrid.spark.p1107a.AbstractC15511g;
import com.bytedance.hybrid.spark.p1107a.AbstractC15512h;
import com.bytedance.hybrid.spark.p1107a.AbstractC15514j;
import com.bytedance.hybrid.spark.p1111e.C15573c;
import com.bytedance.lynx.hybrid.AbstractC21195h;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.C21176e;
import com.bytedance.lynx.hybrid.C21205j;
import com.bytedance.lynx.hybrid.C21217l;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21152f;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.hybrid.p1522h.C21197b;
import com.bytedance.lynx.hybrid.p1522h.C21198c;
import com.bytedance.lynx.hybrid.p1523i.C21202b;
import com.bytedance.lynx.hybrid.p1524j.C21213f;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.service.p1538c.EnumC21362b;
import com.bytedance.lynx.hybrid.webkit.C21394d;
import com.bytedance.lynx.hybrid.webkit.C21395e;
import com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21383d;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21138c;
import com.bytedance.lynx.p1507a.p1508a.p1512d.C21141a;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import com.lynx.tasm.LynxEnv;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89376n;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.hybrid.spark.page.c */
public final class C15593c extends FrameLayout implements AbstractC15511g {

    /* renamed from: l */
    public static final C15594a f38021l = new C15594a((byte) 0);

    /* renamed from: a */
    public AbstractC21154h f38022a;

    /* renamed from: b */
    public SparkContext f38023b;

    /* renamed from: c */
    public View f38024c;

    /* renamed from: d */
    public View f38025d;

    /* renamed from: e */
    public AbstractC15507c f38026e;

    /* renamed from: f */
    public AbstractC15512h f38027f;

    /* renamed from: g */
    public C21138c f38028g;

    /* renamed from: h */
    public Integer f38029h;

    /* renamed from: i */
    public boolean f38030i;

    /* renamed from: j */
    public FrameLayout f38031j;

    /* renamed from: k */
    public boolean f38032k;

    /* renamed from: m */
    private TextView f38033m;

    static {
        Covode.recordClassIndex(17857);
    }

    /* renamed from: com.bytedance.hybrid.spark.page.c$a */
    public static final class C15594a {
        static {
            Covode.recordClassIndex(17858);
        }

        private C15594a() {
        }

        public /* synthetic */ C15594a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15511g
    /* renamed from: b */
    public final void mo25252b() {
        mo25374c();
    }

    public final AbstractC21154h getKitView() {
        return this.f38022a;
    }

    public final SparkContext getSparkContext() {
        return this.f38023b;
    }

    public final String getUrl() {
        SparkContext sparkContext = this.f38023b;
        if (sparkContext != null) {
            return sparkContext.f37778a;
        }
        return null;
    }

    /* renamed from: com.bytedance.hybrid.spark.page.c$c */
    public static final class C15596c extends AbstractC21152f {

        /* renamed from: a */
        public boolean f38037a;

        /* renamed from: b */
        final /* synthetic */ C15593c f38038b;

        /* renamed from: c */
        final /* synthetic */ SparkContext f38039c;

        /* renamed from: d */
        final /* synthetic */ C21198c f38040d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f38041e;

        static {
            Covode.recordClassIndex(17860);
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25380a() {
            super.mo25380a();
            C15573c.m28691a("SparkView", "onPreKitCreate", this.f38039c);
            AbstractC15507c cVar = this.f38038b.f38026e;
            if (cVar != null) {
                cVar.mo25380a();
            }
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: b */
        public final void mo25383b() {
            super.mo25383b();
            C15573c.m28691a("SparkView", "onPostKitCreated", this.f38039c);
            AbstractC15507c cVar = this.f38038b.f38026e;
            if (cVar != null) {
                cVar.mo25383b();
            }
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: c */
        public final void mo25385c() {
            super.mo25385c();
            C15573c.m28691a("SparkView", "onDestroy", this.f38039c);
            AbstractC15507c cVar = this.f38038b.f38026e;
            if (cVar != null) {
                cVar.mo25385c();
            }
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25381a(AbstractC21154h hVar) {
            MethodCollector.m26663i(12362);
            C89219l.m154719c(hVar, "");
            super.mo25381a(hVar);
            C15573c.m28691a("SparkView", "onLoadFinish", this.f38039c);
            C21213f.m39929a(this.f38039c.f50280f, "container_init_end", System.currentTimeMillis());
            this.f38038b.mo25372a((EnumC21362b) this.f38041e.element);
            if (!this.f38037a) {
                this.f38038b.f38031j.removeAllViews();
                this.f38038b.f38031j.setVisibility(8);
            }
            AbstractC15507c cVar = this.f38038b.f38026e;
            if (cVar != null) {
                cVar.mo25381a(hVar);
            }
            this.f38038b.f38032k = false;
            this.f38037a = false;
            MethodCollector.m26664o(12362);
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25382a(AbstractC21154h hVar, String str) {
            MethodCollector.m26663i(12240);
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(str, "");
            super.mo25382a(hVar, str);
            C15573c.m28691a("SparkView", "onLoadStart url:".concat(String.valueOf(str)), this.f38039c);
            this.f38037a = false;
            C21138c cVar = this.f38038b.f38028g;
            if (cVar == null || cVar.getContainerBgColor() == null) {
                if (hVar.mo34724a() instanceof C21395e) {
                    hVar.mo34724a().setBackgroundColor(0);
                } else {
                    hVar.mo34724a().setBackgroundColor(-1);
                }
            }
            AbstractC15507c cVar2 = this.f38038b.f38026e;
            if (cVar2 != null) {
                cVar2.mo25382a(hVar, str);
            }
            AbstractC15512h hVar2 = this.f38038b.f38027f;
            if (hVar2 != null) {
                Context context = this.f38038b.getContext();
                C89219l.m154709a((Object) context, "");
                hVar2.mo25255a(context);
                this.f38038b.f38031j.removeAllViews();
                this.f38038b.f38031j.setVisibility(8);
                if (!this.f38038b.f38030i) {
                    this.f38038b.f38024c = hVar2.mo25253a();
                    View view = this.f38038b.f38024c;
                    if (view != null) {
                        this.f38038b.f38031j.addView(view);
                        this.f38038b.f38031j.setVisibility(0);
                        Integer num = this.f38038b.f38029h;
                        if (num != null) {
                            view.setBackgroundColor(num.intValue());
                            MethodCollector.m26664o(12240);
                            return;
                        }
                        MethodCollector.m26664o(12240);
                        return;
                    }
                }
                MethodCollector.m26664o(12240);
                return;
            }
            MethodCollector.m26664o(12240);
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: b */
        public final void mo25384b(AbstractC21154h hVar, String str) {
            String str2;
            MethodCollector.m26663i(12485);
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(str, "");
            super.mo25384b(hVar, str);
            this.f38037a = true;
            String concat = "onLoadFailed url:".concat(String.valueOf(str));
            SparkContext sparkContext = this.f38039c;
            C89219l.m154719c("SparkView", "");
            C89219l.m154719c(concat, "");
            C15573c.m28690a(EnumC21209b.E, "SparkView", concat, sparkContext);
            if (this.f38041e.element == EnumC21362b.LYNX) {
                C21138c cVar = this.f38038b.f38028g;
                if (cVar != null) {
                    str2 = cVar.getFallbackUrl();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f38038b.f38032k = true;
                    String concat2 = "DowngradeWebView url:".concat(String.valueOf(str));
                    SparkContext sparkContext2 = this.f38039c;
                    C89219l.m154719c("SparkView", "");
                    C89219l.m154719c(concat2, "");
                    C15573c.m28690a(EnumC21209b.W, "SparkView", concat2, sparkContext2);
                    this.f38038b.mo25373b(this.f38039c);
                    this.f38038b.mo25374c();
                    MethodCollector.m26664o(12485);
                    return;
                }
            }
            AbstractC15507c cVar2 = this.f38038b.f38026e;
            if (cVar2 != null) {
                cVar2.mo25384b(hVar, str);
            }
            AbstractC15512h hVar2 = this.f38038b.f38027f;
            if (hVar2 != null) {
                C15593c cVar3 = this.f38038b;
                cVar3.f38025d = hVar2.mo25254a(cVar3);
                View view = this.f38038b.f38025d;
                if (view != null) {
                    this.f38038b.f38031j.removeAllViews();
                    this.f38038b.f38031j.addView(view);
                    this.f38038b.f38031j.setVisibility(0);
                    MethodCollector.m26664o(12485);
                    return;
                }
                MethodCollector.m26664o(12485);
                return;
            }
            MethodCollector.m26664o(12485);
        }

        C15596c(C15593c cVar, SparkContext sparkContext, C21198c cVar2, C89233z.C89238e eVar) {
            this.f38038b = cVar;
            this.f38039c = sparkContext;
            this.f38040d = cVar2;
            this.f38041e = eVar;
        }
    }

    /* renamed from: e */
    private final void m28714e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof AbstractC21154h) {
                removeView(childAt);
            }
        }
    }

    /* renamed from: a */
    public final void mo25370a() {
        Object obj;
        C21198c cVar;
        long currentTimeMillis = System.currentTimeMillis();
        SparkContext sparkContext = this.f38023b;
        Map map = null;
        if (sparkContext == null || (cVar = sparkContext.f50283i) == null) {
            obj = null;
        } else {
            obj = cVar.get((Object) "queryItems");
        }
        if (C89206ad.m154685g(obj)) {
            map = obj;
        }
        Map map2 = map;
        if (map2 != null) {
            map2.put("containerInitTime", String.valueOf(currentTimeMillis));
        }
    }

    /* renamed from: c */
    public final void mo25374c() {
        C15573c.m28691a("SparkView", "loadUrl", this.f38023b);
        mo25370a();
        AbstractC21154h hVar = this.f38022a;
        if (hVar != null) {
            hVar.mo34727b();
        }
    }

    /* renamed from: d */
    public final boolean mo25375d() {
        C21395e eVar;
        C15573c.m28691a("SparkView", "goBack", this.f38023b);
        AbstractC21154h hVar = this.f38022a;
        if (hVar == null || !(hVar instanceof C21395e) || (eVar = (C21395e) hVar) == null || !eVar.canGoBack()) {
            return false;
        }
        eVar.goBack();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.hybrid.spark.page.c$d */
    public static final class View$OnClickListenerC15597d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC15505a f38042a;

        /* renamed from: b */
        final /* synthetic */ C15593c f38043b;

        static {
            Covode.recordClassIndex(17861);
        }

        View$OnClickListenerC15597d(AbstractC15505a aVar, C15593c cVar) {
            this.f38042a = aVar;
            this.f38043b = cVar;
        }

        public final void onClick(View view) {
            C89219l.m154709a((Object) view, "");
        }
    }

    /* renamed from: a */
    public final void mo25371a(SparkContext sparkContext) {
        C89219l.m154719c(sparkContext, "");
        mo25373b(sparkContext);
        this.f38032k = false;
    }

    /* renamed from: c */
    public static void m28713c(SparkContext sparkContext) {
        C21213f.m39929a(sparkContext.f50280f, "container_init_start", System.currentTimeMillis());
        C21213f.m39931a(sparkContext.f50280f, "container_name", "Spark");
        C21213f.m39931a(sparkContext.f50280f, "schema", sparkContext.f37778a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C15593c(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(11231);
        LayoutInflater.from(context).inflate(R.layout.b0f, this);
        View findViewById = findViewById(R.id.e75);
        C89219l.m154709a((Object) findViewById, "");
        this.f38031j = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.aht);
        C89219l.m154709a((Object) findViewById2, "");
        this.f38033m = (TextView) findViewById2;
        MethodCollector.m26664o(11231);
    }

    /* renamed from: a */
    private final void m28712a(C21138c cVar) {
        boolean z;
        Object obj;
        AbstractC21154h hVar;
        if (cVar != null) {
            C21142a containerBgColor = cVar.getContainerBgColor();
            if (!(containerBgColor == null || (hVar = this.f38022a) == null)) {
                hVar.mo34724a().setBackgroundColor(containerBgColor.getColor(getContext()));
            }
            C21142a loadingBgColor = cVar.getLoadingBgColor();
            if (loadingBgColor != null) {
                this.f38029h = Integer.valueOf(loadingBgColor.getColor(getContext()));
            }
            z = cVar.getHideLoading();
        } else {
            z = false;
        }
        this.f38030i = z;
        if (cVar != null) {
            Boolean valueOf = Boolean.valueOf(cVar.getDisableHardwareAccelerate());
            if (valueOf.booleanValue()) {
                try {
                    valueOf.booleanValue();
                    AbstractC21154h hVar2 = this.f38022a;
                    if (hVar2 != null) {
                        hVar2.mo34724a().setLayerType(1, null);
                    }
                    C15573c.m28691a("SparkView", "hardware accelerate disabled", this.f38023b);
                    obj = C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                C89379q.m157067boximpl(obj);
            }
        }
    }

    /* renamed from: a */
    public final void mo25372a(EnumC21362b bVar) {
        int i;
        String str;
        AbstractC15505a a;
        TextView textView = this.f38033m;
        if (C21170d.C21171a.m39868a().f50220a) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (C21170d.C21171a.m39868a().f50220a) {
            int i2 = C15598d.f38047d[bVar.ordinal()];
            if (i2 == 1) {
                str = "lynxview";
            } else if (i2 == 2) {
                str = "webview";
            } else if (i2 == 3) {
                str = "unknown";
            } else {
                throw new C89376n();
            }
            int i3 = C15598d.f38048e[bVar.ordinal()];
            String str2 = "";
            if (i3 == 1) {
                StringBuilder sb = new StringBuilder("(");
                C89219l.m154709a((Object) LynxEnv.m56706b(), str2);
                str2 = sb.append("2.1.5-rc.22-cxxshared)").toString();
            } else if (!(i3 == 2 || i3 == 3)) {
                throw new C89376n();
            }
            this.f38033m.setText("Spark - " + str + str2);
            AbstractC15504a aVar = C15534d.f37883b;
            if (aVar != null && (a = aVar.mo25246a()) != null) {
                this.f38033m.setOnClickListener(new View$OnClickListenerC15597d(a, this));
            }
        }
    }

    /* renamed from: b */
    public final void mo25373b(SparkContext sparkContext) {
        C21394d dVar;
        EnumC21149c cVar;
        C21217l lVar;
        C21394d dVar2;
        this.f38023b = sparkContext;
        String str = sparkContext.f50280f;
        if (str != null) {
            SparkContext.f37776d.put(str, sparkContext);
        }
        String str2 = sparkContext.f37778a;
        C15573c.m28691a("SparkView", "prepareInner start, url:".concat(String.valueOf(str2)), sparkContext);
        if (!TextUtils.isEmpty(str2)) {
            m28713c(sparkContext);
            AbstractC15512h hVar = null;
            this.f38022a = null;
            m28714e();
            this.f38026e = (AbstractC15507c) sparkContext.mo34746a(AbstractC15507c.class);
            AbstractC15512h hVar2 = (AbstractC15512h) sparkContext.mo34746a(AbstractC15512h.class);
            this.f38027f = hVar2;
            if (hVar2 == null) {
                AbstractC15528b bVar = C15534d.f37882a;
                if (bVar != null) {
                    hVar = bVar.mo25314b();
                }
                this.f38027f = hVar;
            }
            C89233z.C89238e eVar = new C89233z.C89238e();
            Uri parse = Uri.parse(str2);
            C89219l.m154709a((Object) parse, "");
            eVar.element = (T) C21176e.C21177a.m39872a(parse);
            if (this.f38032k) {
                eVar.element = (T) EnumC21362b.WEB;
            }
            int i = C15598d.f38044a[eVar.element.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C21213f.m39928a(sparkContext.f50280f, new C12119b("SparkView init failed, not support engine. schema = " + sparkContext.f37778a));
                    C15573c.m28691a("SparkView", "HybridKit Init do nothing type:" + ((Object) eVar.element), sparkContext);
                } else if (!C21176e.f50233d.get()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C21176e.C21177a.m39876b();
                    C15573c.m28691a("SparkView", "HybridKit Init Web Finish by Spark, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms", sparkContext);
                }
            } else if (!C21205j.f50319a) {
                long currentTimeMillis2 = System.currentTimeMillis();
                C21176e.C21177a.m39873a();
                C15573c.m28691a("SparkView", "HybridKit Init Lynx Finish by Spark, cost: " + (System.currentTimeMillis() - currentTimeMillis2) + "ms", sparkContext);
            }
            C21198c cVar2 = sparkContext.f37780c;
            Context context = getContext();
            C89219l.m154709a((Object) context, "");
            int c = C21202b.m39913c(context);
            C21138c b = sparkContext.mo25241b();
            this.f38028g = b;
            if (b != null) {
                Map<String, String> a = C21141a.m39806a(b);
                cVar2.put((Object) "queryItems", (Object) a);
                if (a.containsKey("ab_params")) {
                    cVar2.put((Object) "abParams", (Object) String.valueOf(a.get("ab_params")));
                }
            }
            Context context2 = getContext();
            C89219l.m154709a((Object) context2, "");
            cVar2.put((Object) "statusBarHeight", (Object) Integer.valueOf(C21202b.m39908a((double) c, context2)));
            Context context3 = getContext();
            if (context3 != null) {
                Context context4 = getContext();
                C89219l.m154709a((Object) context4, "");
                cVar2.put((Object) "safeAreaHeight", (Object) Integer.valueOf(C21202b.m39908a((double) C21202b.m39909a(c, (Activity) context3), context4)));
                C15573c.m28691a("SparkView", "prepareInner  GlobalProps:".concat(String.valueOf(cVar2)), sparkContext);
                AbstractC15506b bVar2 = (AbstractC15506b) sparkContext.mo34746a(AbstractC15506b.class);
                AbstractC15514j jVar = (AbstractC15514j) sparkContext.mo34746a(AbstractC15514j.class);
                int i2 = C15598d.f38045b[eVar.element.ordinal()];
                if (i2 == 1) {
                    if (sparkContext.f50282h instanceof C21217l) {
                        AbstractC21195h hVar3 = sparkContext.f50282h;
                        if (hVar3 != null) {
                            lVar = (C21217l) hVar3;
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else {
                        lVar = new C21217l(Uri.parse(str2), (byte) 0);
                    }
                    if (bVar2 != null) {
                        bVar2.mo25247a(lVar);
                    }
                    lVar.mo34745a(cVar2);
                    dVar = lVar;
                } else if (i2 != 2) {
                    C15573c.m28691a("SparkView", "hybridParams transform do nothing type:" + ((Object) eVar.element), sparkContext);
                    return;
                } else {
                    if (sparkContext.f50282h instanceof C21394d) {
                        AbstractC21195h hVar4 = sparkContext.f50282h;
                        if (hVar4 != null) {
                            dVar2 = (C21394d) hVar4;
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else {
                        dVar2 = new C21394d(Uri.parse(str2));
                    }
                    if (bVar2 != null) {
                        bVar2.mo25247a(dVar2);
                    }
                    dVar2.mo34745a(cVar2);
                    dVar2.f50751b = new C15595b(bVar2, cVar2, jVar);
                    dVar = dVar2;
                }
                sparkContext.f50282h = dVar;
                sparkContext.mo34747a(cVar2);
                int i3 = C15598d.f38046c[eVar.element.ordinal()];
                if (i3 == 1) {
                    cVar = EnumC21149c.LYNX;
                } else if (i3 != 2) {
                    cVar = EnumC21149c.UNKNOWN;
                } else {
                    cVar = EnumC21149c.WEB;
                }
                C21197b bVar3 = this.f38028g;
                if (bVar3 == null) {
                    bVar3 = new C21197b(cVar);
                }
                bVar3.setEngineType(cVar);
                C15573c.m28691a("SparkView", "prepareInner  HybridKit.createKitView hybridKitType:".concat(String.valueOf(cVar)), sparkContext);
                Context context5 = getContext();
                C89219l.m154709a((Object) context5, "");
                this.f38022a = C21176e.C21177a.m39871a(bVar3, sparkContext, context5, new C15596c(this, sparkContext, cVar2, eVar));
                m28712a(this.f38028g);
                AbstractC21154h hVar5 = this.f38022a;
                if (hVar5 != null) {
                    addView(hVar5.mo34724a(), 0, new FrameLayout.LayoutParams(-1, -1));
                }
                mo25372a((EnumC21362b) eVar.element);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    public /* synthetic */ C15593c(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.bytedance.hybrid.spark.page.c$b */
    public static final class C15595b extends C21383d {

        /* renamed from: a */
        final /* synthetic */ AbstractC15506b f38034a;

        /* renamed from: b */
        final /* synthetic */ C21198c f38035b;

        /* renamed from: c */
        final /* synthetic */ AbstractC15514j f38036c;

        static {
            Covode.recordClassIndex(17859);
        }

        @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
        /* renamed from: a */
        public final void mo25379a(WebView webView, String str) {
            String url;
            super.mo25379a(webView, str);
            if (str == null || str.length() == 0 || !(webView == null || (url = webView.getUrl()) == null || !C89361p.m154908a((CharSequence) url, (CharSequence) str, false))) {
                AbstractC15514j jVar = this.f38036c;
                if (jVar != null) {
                    jVar.mo25264a("");
                    return;
                }
                return;
            }
            AbstractC15514j jVar2 = this.f38036c;
            if (jVar2 != null) {
                jVar2.mo25264a(str);
            }
        }

        C15595b(AbstractC15506b bVar, C21198c cVar, AbstractC15514j jVar) {
            this.f38034a = bVar;
            this.f38035b = cVar;
            this.f38036c = jVar;
        }
    }
}
