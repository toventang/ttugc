package com.p2082ss.android.ugc.aweme.commercialize.playfun;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38229ao;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38278b;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38283c;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38286d;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38288e;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38289f;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38290g;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2607b.C38293a;
import com.p2082ss.android.ugc.aweme.commercialize.views.AbstractC38946k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.e */
public final class C38298e {

    /* renamed from: a */
    public C38296c f90511a = new C38296c();

    /* renamed from: b */
    public String f90512b = "IdleState";

    /* renamed from: c */
    public AwemePlayFunModel f90513c;

    /* renamed from: d */
    public View f90514d;

    /* renamed from: e */
    public View f90515e;

    /* renamed from: f */
    public View f90516f;

    /* renamed from: g */
    public AbstractC38946k f90517g;

    /* renamed from: h */
    public DataCenter f90518h;

    /* renamed from: i */
    public boolean f90519i;

    /* renamed from: j */
    public long f90520j;

    /* renamed from: k */
    public C38229ao f90521k;

    /* renamed from: l */
    public String f90522l;

    /* renamed from: m */
    final HashMap<String, AbstractC38297d> f90523m;

    /* renamed from: n */
    public final AdPlayFunView f90524n;

    /* renamed from: o */
    private final AbstractC89244h f90525o;

    /* renamed from: p */
    private final HashMap<String, String> f90526p;

    static {
        Covode.recordClassIndex(45785);
    }

    /* renamed from: d */
    private final View m77685d() {
        return (View) this.f90525o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.e$a */
    static final class C38299a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C38298e f90527a;

        static {
            Covode.recordClassIndex(45786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38299a(C38298e eVar) {
            super(0);
            this.f90527a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            ViewParent parent = this.f90527a.f90524n.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                return viewGroup.findViewById(R.id.p7);
            }
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo66894b() {
        AbstractC38297d dVar = this.f90523m.get(this.f90512b);
        if (dVar != null) {
            return dVar.mo66878f();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo66889a() {
        this.f90515e.setAlpha(0.0f);
        this.f90516f.setAlpha(0.0f);
        this.f90514d.setAlpha(0.0f);
        Collection<AbstractC38297d> values = this.f90523m.values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().mo66873e();
        }
        this.f90512b = "IdleState";
    }

    /* renamed from: c */
    public final PointF mo66895c() {
        int a;
        float f = ((1.0f - this.f90511a.f90508d) / 2.0f) * ((float) this.f90511a.f90505a);
        float b = C13628n.m24520b(C17867d.m33078a(), 12.0f) - f;
        if (C80471gb.m139482a()) {
            b = -b;
        }
        if (m77685d() != null) {
            View d = m77685d();
            if (d == null) {
                C89219l.m154715b();
            }
            a = C38300f.m77693a(d);
        } else {
            a = C38300f.m77693a(this.f90524n) + this.f90524n.getHeight();
        }
        return new PointF(b, (((float) ((a - C38300f.m77693a(this.f90524n)) - this.f90511a.f90505a)) + f) - C13628n.m24520b(C17867d.m33078a(), 8.0f));
    }

    /* renamed from: a */
    public final void mo66891a(String str) {
        C89219l.m154721d(str, "");
        this.f90522l = str;
    }

    /* renamed from: b */
    public final void mo66893b(String str) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(str, "");
        if (this.f90517g == null) {
            AdPlayFunView adPlayFunView = this.f90524n;
            C89219l.m154721d(str, "");
            Aweme aweme = adPlayFunView.f90449f;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("draw_ad", "othershow", awemeRawAd).mo28900b("refer", str).mo28901b();
        }
    }

    /* renamed from: a */
    public final void mo66890a(int i) {
        if (i == 0) {
            String str = this.f90526p.get(this.f90512b);
            if (str != null) {
                C89219l.m154716b(str, "");
                this.f90512b = str;
                AbstractC38297d dVar = this.f90523m.get(str);
                if (dVar != null) {
                    dVar.mo66869a();
                }
            }
        } else if (i == 1) {
            this.f90512b = "FinishState";
        }
    }

    public C38298e(AdPlayFunView adPlayFunView) {
        C89219l.m154721d(adPlayFunView, "");
        this.f90524n = adPlayFunView;
        View findViewById = adPlayFunView.findViewById(R.id.f_);
        C89219l.m154716b(findViewById, "");
        this.f90514d = findViewById;
        View findViewById2 = adPlayFunView.findViewById(R.id.fa);
        C89219l.m154716b(findViewById2, "");
        this.f90515e = findViewById2;
        View findViewById3 = adPlayFunView.findViewById(R.id.fb);
        C89219l.m154716b(findViewById3, "");
        this.f90516f = findViewById3;
        this.f90525o = C89250i.m154773a((AbstractC89171a) new C38299a(this));
        this.f90519i = true;
        this.f90522l = "";
        this.f90526p = C89041ag.m154428c(C89387v.m154943a("IdleState", "ExpandState"), C89387v.m154943a("ExpandState", "EggShowState"), C89387v.m154943a("EggShowState", "CollapseState"), C89387v.m154943a("CollapseState", "WidgetShowState"), C89387v.m154943a("WidgetShowState", "FinishState"));
        this.f90523m = C89041ag.m154428c(C89387v.m154943a("IdleState", new C38289f(this)), C89387v.m154943a("ExpandState", new C38286d(this)), C89387v.m154943a("EggShowState", new C38283c(this)), C89387v.m154943a("CollapseState", new C38278b(this)), C89387v.m154943a("WidgetShowState", new C38290g(this)), C89387v.m154943a("FinishState", new C38288e(this)));
    }

    /* renamed from: a */
    public final void mo66892a(String str, Point point, Point point2) {
        C89219l.m154721d(str, "");
        AdPlayFunView adPlayFunView = this.f90524n;
        C89219l.m154721d(str, "");
        C38293a.m77670a(adPlayFunView.f90449f, true, str, point, point2);
    }
}
