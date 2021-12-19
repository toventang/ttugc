package com.p2082ss.android.ugc.aweme.profile.widgets.p3582a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38393b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38394c;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38396e;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.ecommerce.p2818a.C43314b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.BottomBanner;
import com.p2082ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.service.C63866a;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e */
public final class C64490e extends AbstractC12769a implements AbstractC64510i, AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public AbstractC38392a f146146j;

    /* renamed from: k */
    public AbstractC38392a f146147k;

    /* renamed from: l */
    public boolean f146148l;

    /* renamed from: m */
    public boolean f146149m;

    /* renamed from: n */
    public boolean f146150n;

    /* renamed from: o */
    public boolean f146151o;

    /* renamed from: p */
    public DampScrollableLayout f146152p;

    /* renamed from: q */
    public boolean f146153q;

    /* renamed from: r */
    private AbstractC38392a f146154r;

    /* renamed from: s */
    private final C64506o f146155s = new C64506o(this);

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$e */
    static final class C64496e implements AbstractC38029b {

        /* renamed from: a */
        public static final C64496e f146163a = new C64496e();

        static {
            Covode.recordClassIndex(75959);
        }

        C64496e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$f */
    static final class C64497f implements AbstractC38029b {

        /* renamed from: a */
        public static final C64497f f146164a = new C64497f();

        static {
            Covode.recordClassIndex(75960);
        }

        C64497f() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$g */
    public static final class C64498g implements AbstractC38029b {

        /* renamed from: a */
        public static final C64498g f146165a = new C64498g();

        static {
            Covode.recordClassIndex(75961);
        }

        C64498g() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$h */
    public static final class C64499h implements AbstractC38029b {

        /* renamed from: a */
        public static final C64499h f146166a = new C64499h();

        static {
            Covode.recordClassIndex(75962);
        }

        C64499h() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$i */
    public static final class C64500i implements AbstractC38029b {

        /* renamed from: a */
        public static final C64500i f146167a = new C64500i();

        static {
            Covode.recordClassIndex(75963);
        }

        C64500i() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$j */
    public static final class C64501j implements AbstractC38029b {

        /* renamed from: a */
        public static final C64501j f146168a = new C64501j();

        static {
            Covode.recordClassIndex(75964);
        }

        C64501j() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$k */
    public static final class C64502k implements AbstractC38029b {

        /* renamed from: a */
        public static final C64502k f146169a = new C64502k();

        static {
            Covode.recordClassIndex(75965);
        }

        C64502k() {
        }
    }

    static {
        Covode.recordClassIndex(75953);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(332, new RunnableC90250g(C64490e.class, "onNativeGPViewHiddenEvent", C64485a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(333, new RunnableC90250g(C64490e.class, "onEvent", C43314b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3582a.AbstractC64510i
    /* renamed from: y */
    public final boolean mo104079y() {
        return this.f146151o;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$a */
    public static final class C64491a extends C38395d {

        /* renamed from: a */
        final /* synthetic */ C64490e f146156a;

        static {
            Covode.recordClassIndex(75954);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d
        /* renamed from: a */
        public final void mo66987a() {
            this.f146156a.f146148l = true;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d
        /* renamed from: b */
        public final void mo66988b() {
            this.f146156a.mo104078x();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64491a(C64490e eVar) {
            this.f146156a = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$b */
    public static final class C64492b extends C38395d {

        /* renamed from: a */
        final /* synthetic */ C64490e f146157a;

        /* renamed from: b */
        final /* synthetic */ Aweme f146158b;

        static {
            Covode.recordClassIndex(75955);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d
        /* renamed from: a */
        public final void mo66987a() {
            this.f146157a.f146148l = true;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d
        /* renamed from: b */
        public final void mo66988b() {
            C64490e eVar = this.f146157a;
            Aweme v = eVar.mo104076v();
            C38000g.m77050a().mo65889b(eVar.az_(), v, "button");
            if (!C37699a.m76318w(v)) {
                C38000g.m77052c().mo65918a(eVar.az_(), v, 8, C64497f.f146164a);
            } else if (!C63866a.f144791a.openTopViewLive(eVar.az_(), v, 8, new C64494d(eVar, v))) {
                C38000g.m77052c().mo65918a(eVar.az_(), v, 8, C64496e.f146163a);
                eVar.mo104069b(300);
            }
        }

        C64492b(C64490e eVar, Aweme aweme) {
            this.f146157a = eVar;
            this.f146158b = aweme;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$c */
    public static final class C64493c extends C38395d {

        /* renamed from: a */
        final /* synthetic */ C64490e f146159a;

        static {
            Covode.recordClassIndex(75956);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d
        /* renamed from: b */
        public final void mo66988b() {
            this.f146159a.mo104078x();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64493c(C64490e eVar) {
            this.f146159a = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$o */
    public static final class C64506o implements ScrollableLayout.AbstractC39210b {

        /* renamed from: a */
        final /* synthetic */ C64490e f146173a;

        static {
            Covode.recordClassIndex(75969);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        /* renamed from: b */
        public final void mo62635b(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        public final boolean av_() {
            this.f146173a.f146153q = false;
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64506o(C64490e eVar) {
            this.f146173a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        /* renamed from: a */
        public final void mo62628a(float f, float f2) {
            String str;
            Aweme v = this.f146173a.mo104076v();
            if (f2 > 5.0f) {
                if (!this.f146173a.f146153q) {
                    if (C37699a.m76232aD(v) || this.f146173a.f146149m) {
                        this.f146173a.mo104069b(300);
                    } else if (C37699a.m76279ay(v)) {
                        this.f146173a.mo104072c(300);
                    } else if (C37699a.m76230aB(v)) {
                        C63866a.f144791a.closeProfilePopUpWebPage(C12777b.m23004b(this.f146173a));
                    } else {
                        this.f146173a.mo104066a(300);
                    }
                    this.f146173a.f146153q = true;
                }
            } else if (f2 < -5.0f && !this.f146173a.f146153q) {
                if (C37699a.m76232aD(v) || this.f146173a.f146149m) {
                    this.f146173a.mo104071b(false);
                } else if (C37699a.m76279ay(v)) {
                    this.f146173a.mo104073c(false);
                } else if (C37699a.m76230aB(v)) {
                    C63866a aVar = C63866a.f144791a;
                    Context az_ = this.f146173a.az_();
                    if (v != null) {
                        str = v.getAid();
                    } else {
                        str = null;
                    }
                    aVar.openProfilePopUpWebPageInTwoMode(az_, v, str, false);
                } else {
                    this.f146173a.mo104068a(false);
                }
                this.f146173a.f146153q = true;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C80298cg.m139204a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$d */
    public static final class C64494d implements AbstractC38694bo {

        /* renamed from: a */
        final /* synthetic */ C64490e f146160a;

        /* renamed from: b */
        final /* synthetic */ Aweme f146161b;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$d$a */
        static final class C64495a implements AbstractC38029b {

            /* renamed from: a */
            public static final C64495a f146162a = new C64495a();

            static {
                Covode.recordClassIndex(75958);
            }

            C64495a() {
            }
        }

        static {
            Covode.recordClassIndex(75957);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo
        /* renamed from: a */
        public final void mo67267a() {
            C38000g.m77052c().mo65918a(this.f146160a.az_(), this.f146161b, 8, C64495a.f146162a);
            this.f146160a.mo104069b(300);
        }

        C64494d(C64490e eVar, Aweme aweme) {
            this.f146160a = eVar;
            this.f146161b = aweme;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        C64506o oVar;
        super.mo20527p();
        DampScrollableLayout dampScrollableLayout = this.f146152p;
        if (!(dampScrollableLayout == null || (oVar = this.f146155s) == null || !dampScrollableLayout.f92556L.contains(oVar))) {
            dampScrollableLayout.f92556L.remove(oVar);
        }
        C80298cg.m139205b(this);
    }

    /* renamed from: v */
    public final Aweme mo104076v() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145632g;
        }
        return null;
    }

    /* renamed from: w */
    public final String mo104077w() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145629d;
        }
        return null;
    }

    /* renamed from: x */
    public final void mo104078x() {
        AwemeRawAd awemeRawAd;
        Aweme v = mo104076v();
        if (v != null && v.isAd() && (awemeRawAd = v.getAwemeRawAd()) != null) {
            C89219l.m154716b(awemeRawAd, "");
            String type = awemeRawAd.getType();
            if (!TextUtils.isEmpty(type) && type != null) {
                switch (type.hashCode()) {
                    case 96801:
                        if (!type.equals("app")) {
                            return;
                        }
                        if (C37699a.m76241aM(mo104076v())) {
                            C38000g.m77052c().mo65918a(az_(), mo104076v(), 8, C64501j.f146168a);
                            return;
                        } else if (C37699a.m76242aN(mo104076v())) {
                            C38000g.m77052c().mo65922b(az_(), v);
                            return;
                        } else {
                            return;
                        }
                    case 117588:
                        if (type.equals("web")) {
                            if (!C37699a.m76280az(mo104076v())) {
                                C38000g.m77050a().mo65904p(az_(), v);
                                C18129a.m33746a("homepage_ad", "click_button", awemeRawAd).mo28902c();
                                C38000g.m77050a().mo65905q(az_(), v);
                            }
                            C38000g.m77052c().mo65918a(az_(), v, 8, C64500i.f146167a);
                            return;
                        }
                        return;
                    case 3083120:
                        if (type.equals("dial")) {
                            C38000g.m77050a().mo65906r(az_(), v);
                            C18129a.m33746a("homepage_ad", "click_call", awemeRawAd).mo28902c();
                            C38000g.m77050a().mo65905q(az_(), v);
                            return;
                        }
                        return;
                    case 3148996:
                        if (type.equals("form")) {
                            C38000g.m77050a().mo65907s(az_(), v);
                            C18129a.m33746a("homepage_ad", "click_form", awemeRawAd).mo28902c();
                            C38000g.m77050a().mo65905q(az_(), v);
                            AbstractC37873az c = C38000g.m77052c();
                            Context az_ = az_();
                            if (!(az_ instanceof Activity)) {
                                az_ = null;
                            }
                            c.mo65917a((Activity) az_, v, 8);
                            return;
                        }
                        return;
                    case 957829685:
                        if (type.equals("counsel")) {
                            C38000g.m77050a().mo65904p(az_(), v);
                            C18129a.m33746a("homepage_ad", "click_button", awemeRawAd).mo28902c();
                            C38000g.m77050a().mo65905q(az_(), v);
                            C38000g.m77052c().mo65918a(az_(), v, 8, C64498g.f146165a);
                            C38000g.m77050a().mo65904p(az_(), v);
                            C18129a.m33746a("homepage_ad", "click_button", awemeRawAd).mo28902c();
                            C38000g.m77050a().mo65905q(az_(), v);
                            C38000g.m77052c().mo65918a(az_(), v, 8, C64499h.f146166a);
                            return;
                        }
                        return;
                    case 1893962841:
                        if (type.equals("redpacket")) {
                            C38000g.m77050a().mo65905q(az_(), v);
                            C38000g.m77050a().mo65908t(az_(), v);
                            C18129a.m33746a("homepage_ad", "click_redpacket", awemeRawAd).mo28902c();
                            C38000g.m77052c().mo65918a(az_(), v, 8, C64502k.f146169a);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$n */
    static final class C64505n extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64490e f146172a;

        static {
            Covode.recordClassIndex(75968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64505n(C64490e eVar) {
            super(1);
            this.f146172a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            if (aVar != null) {
                this.f146172a.f146148l = false;
                this.f146172a.f146149m = false;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo104066a(int i) {
        AbstractC38392a aVar;
        if (this.f31048h && (aVar = this.f146146j) != null) {
            aVar.mo66984a(i);
        }
    }

    /* renamed from: b */
    public final void mo104069b(int i) {
        AbstractC38392a aVar;
        if (this.f31048h && (aVar = this.f146147k) != null) {
            aVar.mo66984a(i);
        }
    }

    /* renamed from: c */
    public final void mo104072c(int i) {
        AbstractC38392a aVar;
        if (this.f31048h && (aVar = this.f146154r) != null) {
            aVar.mo66984a(i);
            this.f146150n = false;
        }
    }

    @AbstractC90264r
    public final void onNativeGPViewHiddenEvent(C64485a aVar) {
        C89219l.m154721d(aVar, "");
        mo104073c(false);
    }

    /* renamed from: a */
    public final void mo104067a(Aweme aweme) {
        AbstractC38392a aVar = this.f146154r;
        if (aVar != null) {
            aVar.mo66985a(new C38396e().mo66989a(az_(), aweme, mo104077w(), new C64493c(this)));
        }
    }

    /* renamed from: b */
    public final void mo104070b(Aweme aweme) {
        AbstractC38392a aVar = this.f146146j;
        if (aVar != null) {
            aVar.mo66985a(new C38396e().mo66989a(az_(), aweme, mo104077w(), new C64491a(this)));
        }
    }

    /* renamed from: a */
    public final void mo104068a(boolean z) {
        AbstractC38392a aVar;
        if (this.f31048h && this.f146146j != null && !this.f146148l && C37699a.m76235aG(mo104076v()) && (aVar = this.f146146j) != null) {
            aVar.mo66986a(z);
        }
    }

    /* renamed from: b */
    public final void mo104071b(boolean z) {
        if (this.f31048h && this.f146147k != null && !this.f146148l) {
            if (C37699a.m76235aG(mo104076v()) || this.f146149m) {
                if (z) {
                    this.f146149m = true;
                }
                AbstractC38392a aVar = this.f146147k;
                if (aVar != null) {
                    aVar.mo66986a(z);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo104073c(boolean z) {
        if (this.f31048h && this.f146154r != null && C37699a.m76279ay(mo104076v()) && !this.f146150n) {
            this.f146150n = true;
            AbstractC38392a aVar = this.f146154r;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo66986a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$l */
    static final class C64503l extends AbstractC89220m implements AbstractC89172b<Aweme, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64490e f146170a;

        static {
            Covode.recordClassIndex(75966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64503l(C64490e eVar) {
            super(1);
            this.f146170a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Aweme aweme) {
            Aweme aweme2 = aweme;
            if (aweme2 != null) {
                this.f146170a.f146151o = aweme2.isAd();
                if (C37699a.m76232aD(aweme2)) {
                    if (C37699a.m76234aF(aweme2)) {
                        this.f146170a.mo104067a(aweme2);
                        this.f146170a.mo104070b(aweme2);
                    }
                    C64490e eVar = this.f146170a;
                    AbstractC38392a aVar = eVar.f146147k;
                    if (aVar != null) {
                        aVar.mo66985a(new C38396e().mo66989a(eVar.az_(), aweme2, eVar.mo104077w(), new C64492b(eVar, aweme2)));
                    }
                    this.f146170a.mo104066a(0);
                    this.f146170a.mo104072c(0);
                } else if (C37699a.m76279ay(aweme2)) {
                    this.f146170a.mo104067a(aweme2);
                    this.f146170a.mo104066a(0);
                    this.f146170a.mo104069b(0);
                } else if (C38000g.m77053d().mo67206a(aweme2)) {
                    this.f146170a.mo104070b(aweme2);
                    this.f146170a.mo104069b(0);
                    this.f146170a.mo104072c(0);
                } else {
                    this.f146170a.mo104066a(0);
                    this.f146170a.mo104069b(0);
                    this.f146170a.mo104072c(0);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        DampScrollableLayout dampScrollableLayout = (DampScrollableLayout) view.findViewById(R.id.dq9);
        this.f146152p = dampScrollableLayout;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.mo68059a(this.f146155s);
        }
        C38396e eVar = new C38396e();
        eVar.f90720e = (ViewStub) view.findViewById(R.id.dk);
        AbstractC39046a c = CommercializeAdServiceImpl.m79243a().mo67724c(az_(), eVar);
        if (c instanceof AbstractC38392a) {
            AbstractC38392a aVar = (AbstractC38392a) c;
            this.f146146j = aVar;
            if (aVar != null) {
                aVar.mo66983a();
            }
        }
        C38393b bVar = new C38393b();
        bVar.f90714a = (ViewStub) view.findViewById(R.id.crm);
        AbstractC39046a c2 = CommercializeAdServiceImpl.m79243a().mo67724c(az_(), bVar);
        if (c2 instanceof AbstractC38392a) {
            AbstractC38392a aVar2 = (AbstractC38392a) c2;
            this.f146147k = aVar2;
            if (aVar2 != null) {
                aVar2.mo66983a();
            }
        }
        C38394c cVar = new C38394c();
        cVar.f90715a = (ViewStub) view.findViewById(R.id.d42);
        AbstractC39046a c3 = CommercializeAdServiceImpl.m79243a().mo67724c(az_(), cVar);
        if (c3 instanceof AbstractC38392a) {
            AbstractC38392a aVar3 = (AbstractC38392a) c3;
            this.f146154r = aVar3;
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            aVar3.mo66983a();
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64507f.f146174a, new C64503l(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64508g.f146175a, new C64504m(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64509h.f146176a, new C64505n(this));
    }

    @AbstractC90264r
    public final void onEvent(C43314b bVar) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        C89219l.m154721d(bVar, "");
        int i = bVar.f101089b;
        AwemeRawAd awemeRawAd5 = null;
        if (i == 1) {
            Integer num = bVar.f101090c;
            if (num != null && num.intValue() == 3) {
                Aweme v = mo104076v();
                if (v != null) {
                    awemeRawAd = v.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("homepage_ad", "click", awemeRawAd).mo28900b("refer", "halfscreen_page").mo28901b();
                Aweme v2 = mo104076v();
                if (v2 != null) {
                    awemeRawAd2 = v2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C18129a.m33746a("homepage_ad", "othershow", awemeRawAd2).mo28900b("refer", "halfscreen_page").mo28901b();
            }
            Integer num2 = bVar.f101090c;
            if (num2 != null && num2.intValue() == 2) {
                Aweme v3 = mo104076v();
                if (v3 != null) {
                    awemeRawAd3 = v3.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                C18129a.m33746a("homepage_ad", "click", awemeRawAd3).mo28900b("refer", "button").mo28901b();
                Aweme v4 = mo104076v();
                if (v4 != null) {
                    awemeRawAd5 = v4.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "othershow", awemeRawAd5).mo28900b("refer", "button").mo28901b();
            }
        } else if (i == 2) {
            Aweme v5 = mo104076v();
            if (v5 != null) {
                awemeRawAd5 = v5.getAwemeRawAd();
            }
            C18129a.m33746a("homepage_ad", "otherclick", awemeRawAd5).mo28900b("refer", "halfscreen_page").mo28901b();
        } else if (i == 4) {
            Integer num3 = bVar.f101090c;
            if (num3 != null && num3.intValue() == 2) {
                Aweme v6 = mo104076v();
                if (v6 != null) {
                    awemeRawAd4 = v6.getAwemeRawAd();
                } else {
                    awemeRawAd4 = null;
                }
                C18129a.m33746a("landing_ad", "close", awemeRawAd4).mo28901b();
            }
            Integer num4 = bVar.f101090c;
            if (num4 != null && num4.intValue() == 3) {
                Aweme v7 = mo104076v();
                if (v7 != null) {
                    awemeRawAd5 = v7.getAwemeRawAd();
                }
                C18129a.m33746a("homepage_ad", "close", awemeRawAd5).mo28900b("refer", "halfscreen_page").mo28901b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$m */
    static final class C64504m extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64490e f146171a;

        static {
            Covode.recordClassIndex(75967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64504m(C64490e eVar) {
            super(1);
            this.f146171a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            AwemeRawAd awemeRawAd;
            NativeAuthorInfo nativeAuthorInfo;
            Integer valueOf;
            AwemeRawAd awemeRawAd2;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                Aweme v = this.f146171a.mo104076v();
                if (aVar2.f31085a.booleanValue()) {
                    this.f146171a.f146148l = false;
                    this.f146171a.f146149m = false;
                    this.f146171a.f146150n = false;
                    if (C37699a.m76232aD(v)) {
                        this.f146171a.mo104071b(true);
                    } else {
                        String str = null;
                        if (C37699a.m76231aC(v)) {
                            this.f146171a.mo104069b(0);
                            C63866a aVar3 = C63866a.f144791a;
                            Context az_ = this.f146171a.az_();
                            if (v != null) {
                                str = v.getAid();
                            }
                            aVar3.openProfilePopUpWebPageInTwoMode(az_, v, str);
                        } else if (C37699a.m76279ay(v)) {
                            this.f146171a.mo104069b(0);
                            this.f146171a.mo104073c(true);
                            if (C37699a.m76229aA(v)) {
                                AwemeRawAd awemeRawAd3 = v.getAwemeRawAd();
                                BottomBanner bottomBanner = v.getAwemeRawAd().getNativeAuthorInfo().getBottomBanner();
                                if (!TextUtils.isEmpty(awemeRawAd3.getOpenUrl()) && bottomBanner.getVersion() == 1 && v.getAwemeRawAd().getNativeAuthorInfo().getAutoPullStyle() == 1 && awemeRawAd3.isOpenUrlSupportPullUp() && !awemeRawAd3.isDisableUserprofileAdLabel()) {
                                    Context az_2 = this.f146171a.az_();
                                    StringBuilder sb = new StringBuilder();
                                    if (!(v == null || (awemeRawAd2 = v.getAwemeRawAd()) == null)) {
                                        str = awemeRawAd2.getOpenUrl();
                                    }
                                    SmartRouter.buildRoute(az_2, sb.append(C35301c.m72250b(str, "fullScreen")).append("&fullScreen=false&player_control=0&collapsible=0&collapsedHeight=0.6&expandHeight=0.9").toString()).open();
                                }
                            }
                        } else if (C37699a.m76230aB(v)) {
                            this.f146171a.mo104069b(0);
                            if (!(v == null || (awemeRawAd = v.getAwemeRawAd()) == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (valueOf = Integer.valueOf(nativeAuthorInfo.getAutoPullStyle())) == null)) {
                                if (valueOf.intValue() == 1) {
                                    C63866a aVar4 = C63866a.f144791a;
                                    Context az_3 = this.f146171a.az_();
                                    if (v != null) {
                                        str = v.getAid();
                                    }
                                    aVar4.openProfilePopUpWebPageInSixTwoMode(az_3, v, str);
                                } else if (valueOf.intValue() == 2) {
                                    C63866a aVar5 = C63866a.f144791a;
                                    Context az_4 = this.f146171a.az_();
                                    if (v != null) {
                                        str = v.getAid();
                                    }
                                    aVar5.openProfilePopUpWebPageInTwoExpandMode(az_4, v, str);
                                }
                            }
                            C63866a aVar6 = C63866a.f144791a;
                            Context az_5 = this.f146171a.az_();
                            if (v != null) {
                                str = v.getAid();
                            }
                            aVar6.openProfilePopUpWebPageInTwoMode(az_5, v, str, true);
                        } else {
                            this.f146171a.mo104068a(true);
                        }
                    }
                } else {
                    if (C37699a.m76230aB(v)) {
                        C63866a.f144791a.closeProfilePopUpWebPage(C12777b.m23004b(this.f146171a));
                    }
                    if (C37699a.m76279ay(v)) {
                        this.f146171a.mo104072c(0);
                    }
                    if (C37699a.m76231aC(v)) {
                        C63866a.f144791a.closeProfilePopUpWebPage(C12777b.m23004b(this.f146171a));
                        this.f146171a.mo104072c(0);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
