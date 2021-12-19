package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.commercialize.AbstractC37841f;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37835d;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37836e;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37837f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38747h;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38673e;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38866ab;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.FeedLiveAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.FormAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.GeneralAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.InteractAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.PollAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardAction;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.SurveyAdCardAction;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49682j;
import com.p2082ss.android.ugc.aweme.miniapp.utils.C59286a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.AbstractC33279b;
import com.p2082ss.android.ugc.aweme.utils.C80309co;
import com.p2082ss.android.ugc.aweme.utils.C80631v;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81570a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.a */
public final class C37657a implements AbstractC37687t {
    static {
        Covode.recordClassIndex(45090);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65656a(String str, AwemeRawAd awemeRawAd) {
        C89219l.m154721d(str, "");
        if (awemeRawAd != null && str.hashCode() == 94750088 && str.equals("click")) {
            C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C37659b(awemeRawAd));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final boolean mo65661a(Context context, Aweme aweme, int i) {
        return C38767w.m78661e(context, aweme, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65657a(boolean z) {
        if (z) {
            AbstractC81915c.m141874a(new C49682j(true));
        } else {
            AbstractC81915c.m141874a(new C49682j(false));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final boolean mo65660a(Context context, Aweme aweme) {
        return AbstractC38757n.m78633a(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final boolean mo65658a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return g.isLogin();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: b */
    public final boolean mo65663b() {
        return C80309co.m139212a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: g */
    public final void mo65674g() {
        C81079v.m140776O().mo123950y();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: e */
    public final boolean mo65671e() {
        C49625h a = C49625h.m93072a();
        C89219l.m154716b(a, "");
        return a.f114195g;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: f */
    public final void mo65673f() {
        C81079v.m140776O().mo123908B();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: c */
    public final void mo65666c() {
        C49625h a = C49625h.m93072a();
        C89219l.m154716b(a, "");
        a.f114194f = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: d */
    public final boolean mo65669d() {
        C49625h a = C49625h.m93072a();
        C89219l.m154716b(a, "");
        return a.f114194f;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: s */
    public final void mo65687s(Aweme aweme) {
        C37699a.m76310o(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final boolean mo65659a(Context context) {
        return C38767w.m78631a(context, 33);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: e */
    public final long mo65670e(Aweme aweme) {
        return C37699a.m76316u(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: f */
    public final CardStruct mo65672f(Aweme aweme) {
        return C37699a.m76292e(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: h */
    public final boolean mo65676h(Aweme aweme) {
        return C37699a.m76314s(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: k */
    public final boolean mo65679k(Aweme aweme) {
        return C37699a.m76202E(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: l */
    public final String mo65680l(Aweme aweme) {
        return C37699a.m76281b(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: m */
    public final boolean mo65681m(Aweme aweme) {
        return C37699a.m76203F(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: n */
    public final boolean mo65682n(Aweme aweme) {
        return C37699a.m76290d(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: o */
    public final CardStruct mo65683o(Aweme aweme) {
        return C37699a.m76272ar(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: p */
    public final boolean mo65684p(Aweme aweme) {
        return C80631v.m139799b(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: q */
    public final boolean mo65685q(Aweme aweme) {
        return C37699a.m76199B(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: r */
    public final boolean mo65686r(Aweme aweme) {
        return C37699a.m76307l(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: b */
    public final AbstractC38878ae mo65662b(Aweme aweme) {
        Bundle a = C38739d.m78572a(aweme);
        C89219l.m154716b(a, "");
        return C38866ab.C38867a.m78904a(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: c */
    public final AbstractC38878ae mo65665c(Aweme aweme) {
        Bundle b = C38739d.m78574b(aweme);
        C89219l.m154716b(b, "");
        return C38866ab.C38867a.m78904a(b);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: d */
    public final String mo65668d(Aweme aweme) {
        String t = C37699a.m76315t(aweme);
        C89219l.m154716b(t, "");
        return t;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: g */
    public final boolean mo65675g(Aweme aweme) {
        return C38739d.m78577d(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: i */
    public final void mo65677i(Aweme aweme) {
        AbstractC81915c.m141874a(new C37835d(aweme, 17));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: j */
    public final void mo65678j(Aweme aweme) {
        AbstractC81915c.m141874a(new C37836e(aweme, 2));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65652a(Aweme aweme) {
        C81570a.f182403c = C37699a.m76292e(aweme);
        C81570a.f182404d = C37699a.m76272ar(aweme);
        C81570a.f182406f = 1;
        C81570a.f182407g = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65650a(Context context, C38661b bVar) {
        C38189j.m77475a(context, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.a$a */
    public static final class C37658a extends AbstractC33279b {

        /* renamed from: a */
        final /* synthetic */ AbstractC34466a f89027a;

        /* renamed from: b */
        final /* synthetic */ Activity f89028b;

        static {
            Covode.recordClassIndex(45091);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            return this.f89027a.onKeyDown(i, keyEvent);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37658a(AbstractC34466a aVar, Activity activity, Activity activity2) {
            super(activity2);
            this.f89027a = aVar;
            this.f89028b = activity;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: c */
    public final boolean mo65667c(Context context, Aweme aweme) {
        return AbstractC38757n.m78635a(context, aweme, (String) null, (String) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final AbstractC37841f mo65647a(Activity activity, AbstractC34466a aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        return new C37658a(aVar, activity, activity);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.a$b */
    static final class C37659b extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f89029a;

        static {
            Covode.recordClassIndex(45092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37659b(AwemeRawAd awemeRawAd) {
            super(2);
            this.f89029a = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66498b(this.f89029a);
            } else {
                a = bVar2.mo66489a(this.f89029a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.a$c */
    static final class C37660c extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ Aweme f89030a;

        static {
            Covode.recordClassIndex(45093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37660c(Aweme aweme) {
            super(2);
            this.f89030a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(this.f89030a);
            } else {
                a = bVar2.mo66488a(this.f89030a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65649a(int i, boolean z) {
        C37837f fVar = new C37837f(z);
        fVar.f89332b = i;
        AbstractC81915c.m141874a(fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: b */
    public final boolean mo65664b(Context context, Aweme aweme) {
        return C59286a.m108996a(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65651a(Context context, String str) {
        C89219l.m154721d(str, "");
        if (context != null) {
            C38673e.m78468a(context, "click_ad_card");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65653a(Aweme aweme, String str) {
        if (str == null) {
            str = "";
        }
        C38747h.m78591b(aweme, str, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65654a(Aweme aweme, boolean z, String str) {
        if (z) {
            C38747h.m78587a(aweme, true);
            return;
        }
        if (str == null) {
            str = "";
        }
        C38747h.m78588a(aweme, str, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final void mo65655a(String str, UrlModel urlModel, Aweme aweme) {
        Long l;
        C89219l.m154721d(str, "");
        if (aweme != null && aweme.getAwemeRawAd() != null && str.hashCode() == -1944956403 && str.equals("othershow")) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String str2 = null;
            if (awemeRawAd != null) {
                l = awemeRawAd.getCreativeId();
            } else {
                l = null;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str2 = awemeRawAd2.getLogExtra();
            }
            C38164aj.m77369a("othershow", urlModel, l, str2, new C37660c(aweme));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t
    /* renamed from: a */
    public final AbstractC38883ai mo65648a(Integer num, Context context, Aweme aweme, AbstractC38878ae aeVar) {
        C89219l.m154721d(aeVar, "");
        if (num != null) {
            if (num.intValue() == 2) {
                return new DownloadAdCardAction(context, aweme, aeVar);
            }
            if (num.intValue() == 3) {
                return new ShopAdCardAction(context, aweme, aeVar);
            }
            if (num != null) {
                if (num.intValue() == 1) {
                    return new FormAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 4) {
                    return new ImageAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 5) {
                    return new InteractAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 6) {
                    return new PollAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 7) {
                    return new SurveyAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 8 || num.intValue() == 9) {
                    return new CouponAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 11) {
                    return new SelectAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 12) {
                    if (aweme == null || !aweme.isLive()) {
                        return new GeneralAdCardAction(context, aweme, aeVar);
                    }
                    return new FeedLiveAdCardAction(context, aweme, aeVar);
                }
            }
        }
        return new LandingPageAdCardAction(context, aweme, aeVar);
    }
}
