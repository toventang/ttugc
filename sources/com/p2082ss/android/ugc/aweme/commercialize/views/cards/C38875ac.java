package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ac */
public final class C38875ac implements AbstractC38882ah {

    /* renamed from: a */
    public static final C38875ac f91817a = new C38875ac();

    private C38875ac() {
    }

    static {
        Covode.recordClassIndex(46462);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ac$a */
    public static final class CallableC38876a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C33744d f91818a;

        /* renamed from: b */
        final /* synthetic */ Aweme f91819b;

        /* renamed from: c */
        final /* synthetic */ String f91820c;

        static {
            Covode.recordClassIndex(46463);
        }

        CallableC38876a(C33744d dVar, Aweme aweme, String str) {
            this.f91818a = dVar;
            this.f91819b = aweme;
            this.f91820c = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AwemeRawAd awemeRawAd;
            C33744d dVar = this.f91818a;
            if (dVar == null) {
                dVar = new C33744d();
            }
            String str = null;
            Aweme aweme = this.f91819b;
            if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                str = awemeRawAd.getCreativeIdStr();
            }
            dVar.mo59983a("creativeId", str);
            C39162r.m79460a(this.f91820c, dVar.f79943a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: b */
    public final void mo67546b(Aweme aweme) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_init_commerce_card", null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: c */
    public final void mo67548c(Aweme aweme) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_preload_ad_half_web_page", null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: d */
    public final void mo67549d(Aweme aweme) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_show_ad_half_web_page", null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: e */
    public final void mo67550e(Aweme aweme) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_show_success", null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: f */
    public final void mo67551f(Aweme aweme) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_release", null);
        }
    }

    /* renamed from: g */
    private static boolean m78911g(Aweme aweme) {
        AbstractC37687t a = C37663b.f89031b.mo65688a();
        if (a == null || !a.mo65684p(aweme) || !C38877ad.m78921a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: a */
    public final void mo67543a(Aweme aweme) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_view_holder_selected", null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: b */
    public final void mo67547b(Aweme aweme, String str) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_show_failed", new C33744d().mo59983a("errMsg", str));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: a */
    public final void mo67544a(Aweme aweme, long j) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_view_holder_unselected", new C33744d().mo59983a("currentPosition", String.valueOf(j)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah
    /* renamed from: a */
    public final void mo67545a(Aweme aweme, String str) {
        if (m78911g(aweme)) {
            m78910a(aweme, "ad_half_web_show_cancel", new C33744d().mo59983a("errMsg", str));
        }
    }

    /* renamed from: a */
    private static void m78910a(Aweme aweme, String str, C33744d dVar) {
        C1731i.m5640b(new CallableC38876a(dVar, aweme, str), C1731i.f5562a);
    }
}
