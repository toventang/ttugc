package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.bytedance.p1777x.p1780c.C23697c;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.GetWebViewInfo;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35222b;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35226e;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.p2420ui.GradualChangeLinearLayout;
import com.p2082ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.p2082ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40562a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b */
public final class C35180b extends C35222b {

    /* renamed from: c */
    public static final C35181a f83004c = new C35181a((byte) 0);

    /* renamed from: B */
    private boolean f83005B;

    /* renamed from: a */
    public GradualChangeLinearLayout f83006a;

    /* renamed from: b */
    public Runnable f83007b;

    static {
        Covode.recordClassIndex(42338);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: e */
    public final int mo62006e() {
        return R.layout.ck;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(255, new RunnableC90250g(C35180b.class, "onEvent", GetWebViewInfo.C34974a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(256, new RunnableC90250g(C35180b.class, "onPopupShowEvent", C35197k.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(202, new RunnableC90250g(C35180b.class, "onEvent", C40562a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$a */
    public static final class C35181a {
        static {
            Covode.recordClassIndex(42339);
        }

        private C35181a() {
        }

        public /* synthetic */ C35181a(byte b) {
            this();
        }
    }

    /* renamed from: i */
    public final void mo62010i() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83165z.mo61972a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo61944c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: j */
    public final void mo62011j() {
        super.mo62011j();
        GradualChangeLinearLayout gradualChangeLinearLayout = this.f83006a;
        if (gradualChangeLinearLayout != null) {
            gradualChangeLinearLayout.setGradualChangeMode(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$b */
    static final class C35182b extends AbstractC89220m implements AbstractC89171a<AbstractC89171a<? extends C89391z>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC35125b f83008a;

        /* renamed from: b */
        final /* synthetic */ AbstractC33115c f83009b;

        /* renamed from: c */
        final /* synthetic */ C35180b f83010c;

        /* renamed from: d */
        final /* synthetic */ C16248b f83011d;

        static {
            Covode.recordClassIndex(42340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35182b(AbstractC35125b bVar, AbstractC33115c cVar, C35180b bVar2, C16248b bVar3) {
            super(0);
            this.f83008a = bVar;
            this.f83009b = cVar;
            this.f83010c = bVar2;
            this.f83011d = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89171a<? extends C89391z> invoke() {
            final AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83008a.mo61972a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                return new AbstractC89171a<C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35180b.C35182b.C351831 */

                    static {
                        Covode.recordClassIndex(42341);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        String str;
                        String str2 = null;
                        if (adWebStatBusiness.mo61941a()) {
                            str = adWebStatBusiness.mo61946d();
                        } else {
                            str = null;
                        }
                        if (adWebStatBusiness.mo61943b()) {
                            str2 = adWebStatBusiness.mo61947e();
                        }
                        this.f83009b.mo58953c(str, str2);
                        adWebStatBusiness.mo61937a(this.f83011d, this.f83009b.mo58958e());
                        return C89391z.f203057a;
                    }
                };
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: f */
    public final boolean mo62007f() {
        String m;
        boolean f = super.mo62007f();
        if (!(this.f83150k instanceof C35196j)) {
            f = false;
        }
        C35226e eVar = this.f83150k;
        if (eVar == null || (m = eVar.mo62122m()) == null || C23697c.m44781a(m)) {
            return false;
        }
        String lowerCase = m.toLowerCase();
        C89219l.m154716b(lowerCase, "");
        if (!C89361p.m154874b(lowerCase, "http://", false)) {
            String lowerCase2 = m.toLowerCase();
            C89219l.m154716b(lowerCase2, "");
            if (!C89361p.m154874b(lowerCase2, "https://", false)) {
                return false;
            }
        }
        return f;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: g */
    public final void mo62008g() {
        super.mo62008g();
        C35196j jVar = (C35196j) this.f83150k;
        if (jVar != null) {
            JSONObject jSONObject = null;
            if (!C23697c.m44781a(jVar.mo62044b())) {
                try {
                    jSONObject = new JSONObject(jVar.mo62044b());
                } catch (Exception unused) {
                }
            }
            Activity activity = this.f83157r;
            String b = jVar.f83098am.mo26550b();
            if (b == null) {
                b = "";
            }
            C39161q.m79450a(activity, "wap_stat", "wap_enter", b, 0, 0, jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: h */
    public final boolean mo62009h() {
        C35226e eVar = this.f83150k;
        if (!(eVar instanceof C35196j)) {
            eVar = null;
        }
        C35196j jVar = (C35196j) eVar;
        if (jVar != null) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                return a.mo58933a(AwemeService.m70060b().mo60691e(String.valueOf(jVar.f83076Y.mo26550b())));
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$c */
    public static final class C35184c implements SSWebView.AbstractC16469b {

        /* renamed from: a */
        final /* synthetic */ C35180b f83014a;

        static {
            Covode.recordClassIndex(42342);
        }

        C35184c(C35180b bVar) {
            this.f83014a = bVar;
        }

        @Override // com.bytedance.ies.bullet.kit.web.SSWebView.AbstractC16469b
        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f83014a.f83006a;
            if (gradualChangeLinearLayout != null) {
                gradualChangeLinearLayout.onScrollChanged(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$d */
    public static final class C35185d extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ C35180b f83015a;

        static {
            Covode.recordClassIndex(42343);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35185d(C35180b bVar) {
            this.f83015a = bVar;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            OpenURLHintLayout openURLHintLayout;
            Resources resources;
            if (bitmap != null && (openURLHintLayout = this.f83015a.f83147h) != null) {
                Activity activity = this.f83015a.f83157r;
                if (activity != null) {
                    resources = activity.getResources();
                } else {
                    resources = null;
                }
                openURLHintLayout.setBackground(new BitmapDrawable(resources, bitmap));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public final ViewGroup mo26896a(Context context) {
        C89219l.m154721d(context, "");
        ViewGroup a = super.mo26896a(context);
        this.f83006a = (GradualChangeLinearLayout) mo62082k().findViewById(R.id.cdd);
        return a;
    }

    @AbstractC90264r
    public final void onPopupShowEvent(C35197k kVar) {
        C89219l.m154721d(kVar, "");
        Activity activity = this.f83157r;
        if (activity != null) {
            boolean z = kVar.f83111a;
            if (z) {
                mo62004b(activity);
                this.f83005B = z;
                return;
            }
            this.f83005B = z;
            mo62005c(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: a */
    public final void mo62003a(Activity activity) {
        C89219l.m154721d(activity, "");
        super.mo62003a(activity);
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f83165z.mo61972a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.mo61957c();
        }
        this.f83007b = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: b */
    public final void mo62004b(Activity activity) {
        C89219l.m154721d(activity, "");
        if (!this.f83005B) {
            super.mo62004b(activity);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83165z.mo61972a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.mo61940a(false);
            }
            AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f83165z.mo61972a(AdLynxStatBusiness.class);
            if (adLynxStatBusiness != null) {
                adLynxStatBusiness.mo61933a(false);
            }
            PlayableBusiness playableBusiness = (PlayableBusiness) this.f83165z.mo61972a(PlayableBusiness.class);
            if (playableBusiness != null) {
                playableBusiness.mo61966c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: c */
    public final void mo62005c(Activity activity) {
        C89219l.m154721d(activity, "");
        if (!this.f83005B) {
            super.mo62005c(activity);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83165z.mo61972a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.mo61944c();
            }
            AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f83165z.mo61972a(AdLynxStatBusiness.class);
            if (adLynxStatBusiness != null) {
                adLynxStatBusiness.mo61934b();
            }
            PlayableBusiness playableBusiness = (PlayableBusiness) this.f83165z.mo61972a(PlayableBusiness.class);
            if (playableBusiness != null) {
                playableBusiness.mo61965b();
            }
        }
    }

    @AbstractC90264r
    public final void onEvent(GetWebViewInfo.C34974a aVar) {
        SSWebView sSWebView;
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.C35121a.m71835a(this.f83165z);
        if (a != null) {
            a.mo61968a(aVar);
        } else if (aVar != null && aVar.f82505b != null && aVar.f82504a != 0 && (sSWebView = this.f83148i) != null && sSWebView.hashCode() == aVar.f82504a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            aVar.f82505b.mo61874a(jSONObject);
        }
    }

    @AbstractC90264r
    public final void onEvent(C40562a aVar) {
        String str;
        BulletCommonTitleBar bulletCommonTitleBar;
        AbstractC16725d<Boolean> dVar;
        Boolean bool = null;
        if (aVar != null && aVar.f94909a != null && m72070m() && (str = aVar.f94909a) != null && str.hashCode() == 51 && str.equals("3") && C89219l.m154714a((Object) "1", (Object) this.f83162w)) {
            mo62080a("3");
            C35226e eVar = this.f83150k;
            if (!(eVar == null || (dVar = eVar.f39926b) == null)) {
                bool = dVar.mo26550b();
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                mo62084n();
                return;
            }
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f83006a;
            if (gradualChangeLinearLayout != null) {
                gradualChangeLinearLayout.setGradualChangeMode(false);
            }
            C13628n.m24510a(this.f83146g, 0);
            C35226e eVar2 = this.f83150k;
            if (eVar2 != null && (bulletCommonTitleBar = this.f83144e) != null) {
                C89219l.m154721d(eVar2, "");
                C16746t b = eVar2.f39928d.mo26550b();
                if (b == null || b.f39989a != -2) {
                    C16746t b2 = eVar2.f39928d.mo26550b();
                    if (b2 != null) {
                        bulletCommonTitleBar.setBackgroundColor(b2.f39989a);
                    }
                } else {
                    bulletCommonTitleBar.setBackgroundResource(R.drawable.u4);
                }
                C16746t b3 = eVar2.f39932h.mo26550b();
                if (b3 == null || b3.f39989a != -2) {
                    C16746t b4 = eVar2.f39932h.mo26550b();
                    if (b4 != null) {
                        ((TuxTextView) bulletCommonTitleBar.mo62156a(R.id.title)).setTextColor(b4.f39989a);
                    }
                    Context context = bulletCommonTitleBar.getContext();
                    if (context != null) {
                        C1261i a = C1261i.m4015a(context.getResources(), R.drawable.a3r, context.getTheme());
                        C16746t b5 = eVar2.f39932h.mo26550b();
                        if (!(b5 == null || a == null)) {
                            a.setTint(b5.f39989a);
                        }
                        ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.a71)).setImageDrawable(a);
                    }
                } else {
                    ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.a71)).setImageResource(2131231521);
                }
                View a2 = bulletCommonTitleBar.mo62156a(R.id.rv);
                C89219l.m154716b(a2, "");
                a2.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) bulletCommonTitleBar.mo62156a(R.id.title);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.a71)).setImageResource(2131231521);
                ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.a6v)).setImageResource(2131231523);
                ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.yv)).setImageResource(2131231531);
                ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.dij)).setImageResource(2131231528);
                ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.dkd)).setImageResource(2131231525);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35180b(C16248b bVar, AbstractC35125b bVar2) {
        super(bVar, bVar2);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a, com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        String str;
        Activity activity;
        AbstractC16725d<String> dVar;
        AbstractC16725d<C16746t> dVar2;
        C16746t b;
        int i;
        GradualChangeLinearLayout gradualChangeLinearLayout;
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        super.mo25853a(view, uri, iVar);
        SSWebView sSWebView = this.f83148i;
        if (sSWebView != null) {
            sSWebView.setWebScrollListener(new C35184c(this));
        }
        C35226e eVar = this.f83150k;
        if (!(eVar == null || (dVar2 = eVar.f39913D) == null || (b = dVar2.mo26550b()) == null || (i = b.f39989a) == -2 || (gradualChangeLinearLayout = this.f83006a) == null)) {
            gradualChangeLinearLayout.setBackgroundColor(i);
        }
        C35186c cVar = (C35186c) iVar.mo25763a(C35186c.class);
        if (cVar == null || (dVar = cVar.f83033ag) == null || (str = dVar.mo26550b()) == null) {
            str = "";
        }
        if (!C23697c.m44781a(str) && (activity = this.f83157r) != null) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                a.mo58950c(activity);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013b, code lost:
        if (r0 == null) goto L_0x013d;
     */
    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25854a(com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i r13, android.net.Uri r14, com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q r15) {
        /*
        // Method dump skipped, instructions count: 796
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35180b.mo25854a(com.bytedance.ies.bullet.c.c.i, android.net.Uri, com.bytedance.ies.bullet.service.f.a.b.q):void");
    }
}
