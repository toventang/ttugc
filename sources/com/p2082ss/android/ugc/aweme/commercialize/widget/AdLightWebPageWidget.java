package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37838g;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38226al;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38234e;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.commercialize.views.C38805a;
import com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog.DialogC38841c;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget */
public final class AdLightWebPageWidget extends AbsAdFeedWidget implements AbstractC33974au {

    /* renamed from: a */
    public static final C39020a f92165a = new C39020a((byte) 0);

    /* renamed from: h */
    private C38805a f92166h;

    static {
        Covode.recordClassIndex(46618);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$a */
    public static final class C39020a {
        static {
            Covode.recordClassIndex(46619);
        }

        private C39020a() {
        }

        public /* synthetic */ C39020a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m79185a(Aweme aweme) {
            AwemeRawAd awemeRawAd;
            if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
                return null;
            }
            return awemeRawAd.getLightWebUrl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$c */
    public static final class C39022c implements C38805a.AbstractC38808c {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageWidget f92169a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f92170b;

        static {
            Covode.recordClassIndex(46621);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.AbstractC38808c
        /* renamed from: a */
        public final void mo67433a() {
            DataCenter dataCenter = this.f92169a.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("on_ad_light_web_page_show", (Object) null);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.AbstractC38808c
        /* renamed from: c */
        public final void mo67435c() {
            DataCenter dataCenter = this.f92169a.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("AD_ACTION_REPLAY_VIDEO", (Object) null);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.C38805a.AbstractC38808c
        /* renamed from: b */
        public final void mo67434b() {
            ActivityC0945e eVar = this.f92170b;
            int i = C38805a.f91638m;
            C89219l.m154721d(eVar, "");
            C38805a b = C38805a.C38809d.m78762b(eVar, i);
            if (b != null) {
                b.mo67415a();
            }
            DataCenter dataCenter = this.f92169a.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("on_ad_light_web_page_hide", (Object) null);
            }
        }

        C39022c(AdLightWebPageWidget adLightWebPageWidget, ActivityC0945e eVar) {
            this.f92169a = adLightWebPageWidget;
            this.f92170b = eVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59238a() {
        super.mo59238a();
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_on_receive_js_bridge_event", (AbstractC1214u<C33942b>) this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$b */
    static final class C39021b extends AbstractC89220m implements AbstractC89172b<C38805a.C38810e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageWidget f92167a;

        /* renamed from: b */
        final /* synthetic */ String f92168b;

        static {
            Covode.recordClassIndex(46620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39021b(AdLightWebPageWidget adLightWebPageWidget, String str) {
            super(1);
            this.f92167a = adLightWebPageWidget;
            this.f92168b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C38805a.C38810e eVar) {
            Context context;
            C38805a.C38810e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            String str = this.f92168b;
            if (str != null) {
                eVar2.mo67436a(str);
            }
            eVar2.f91670b = this.f92167a.f92082p;
            eVar2.f91671c = this.f92167a.f92081o;
            AdLightWebPageWidget adLightWebPageWidget = this.f92167a;
            Aweme aweme = adLightWebPageWidget.f92081o;
            Bundle bundle = new Bundle();
            Fragment fragment = adLightWebPageWidget.f92082p;
            if (!(fragment == null || (context = fragment.getContext()) == null)) {
                C89219l.m154716b(context, "");
                if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                    C38739d.m78570a(bundle, aweme, context);
                    C38739d.m78573b(bundle, aweme, context);
                    C38739d.m78575c(bundle, aweme, context);
                    C38739d.m78569a(bundle, context);
                }
            }
            eVar2.f91674f = bundle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59239a(C33942b bVar) {
        String str;
        Fragment fragment;
        ActivityC0945e activity;
        Aweme aweme;
        String a;
        Fragment fragment2;
        ActivityC0945e activity2;
        int i;
        AwemeRawAd awemeRawAd;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject;
        C38805a aVar;
        String str5;
        C38805a aVar2;
        MethodCollector.m26663i(7538);
        super.onChanged(bVar);
        String str6 = null;
        Object obj = null;
        if (bVar == null || (str = bVar.f80277a) == null) {
            MethodCollector.m26664o(7538);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1540531799) {
            if (hashCode != -1132409520) {
                if (hashCode == -690921606 && str.equals("ad_on_receive_js_bridge_event")) {
                    C37838g gVar = (C37838g) bVar.mo60212a();
                    if (gVar != null) {
                        Object obj2 = gVar.f89337d;
                        if (!(obj2 instanceof C18288a)) {
                            obj2 = null;
                        }
                        C18288a aVar3 = (C18288a) obj2;
                        String str7 = gVar.f89334a;
                        switch (str7.hashCode()) {
                            case 898583738:
                                if (str7.equals("openLightLandingPage")) {
                                    C38805a aVar4 = this.f92166h;
                                    if (aVar4 != null && !aVar4.getMBottomSheet().mo14580a()) {
                                        JSONObject jSONObject2 = gVar.f89335b;
                                        if (jSONObject2 != null) {
                                            str2 = jSONObject2.optString("clickFrom");
                                        } else {
                                            str2 = null;
                                        }
                                        JSONObject jSONObject3 = gVar.f89335b;
                                        if (jSONObject3 != null) {
                                            str3 = jSONObject3.optString("url");
                                        } else {
                                            str3 = null;
                                        }
                                        if (!TextUtils.isEmpty(str3)) {
                                            C38805a.C38809d dVar = C38805a.f91639n;
                                            Activity d = mo60208d();
                                            C89219l.m154716b(d, "");
                                            JSONObject jSONObject4 = gVar.f89335b;
                                            if (jSONObject4 != null) {
                                                str6 = jSONObject4.optString("url");
                                            }
                                            C38805a.C38809d.m78761a(dVar, d, str6);
                                            MethodCollector.m26664o(7538);
                                            return;
                                        }
                                        C38805a aVar5 = this.f92166h;
                                        if (aVar5 != null) {
                                            if (str2 == null) {
                                                str4 = PreRenderWebViewBusiness.C40581a.m81922a(25);
                                            } else {
                                                str4 = str2;
                                            }
                                            aVar5.mo67417a(str4);
                                        }
                                        if (aVar3 != null) {
                                            aVar3.mo29249a(gVar.f89336c, new JSONObject(C89041ag.m154412a(new C89378p("code", 1))));
                                        }
                                        C38234e.C38235a aVar6 = new C38234e.C38235a();
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        C89219l.m154721d(str2, "");
                                        aVar6.f90343a = str2;
                                        aVar6.f90344b = false;
                                        this.f80273e.mo60191a("ACTION_HALF_WEB_PAGE_HIDE", new C38234e(aVar6.f90343a, aVar6.f90344b, (byte) 0));
                                    }
                                    if (aVar3 != null) {
                                        aVar3.mo29249a(gVar.f89336c, new JSONObject(C89041ag.m154412a(new C89378p("code", 0))));
                                        MethodCollector.m26664o(7538);
                                        return;
                                    }
                                    MethodCollector.m26664o(7538);
                                    return;
                                }
                                break;
                            case 1518137890:
                                if (str7.equals("openAdUrl") && (jSONObject = gVar.f89335b) != null && jSONObject.optBoolean("close_current_page") && (aVar = this.f92166h) != null) {
                                    aVar.mo67418b();
                                    MethodCollector.m26664o(7538);
                                    return;
                                }
                            case 1531924954:
                                if (str7.equals("openPanel")) {
                                    JSONObject jSONObject5 = gVar.f89335b;
                                    if (jSONObject5 != null) {
                                        obj = jSONObject5.opt(StringSet.type);
                                    }
                                    if (C89219l.m154714a(obj, (Object) "menu")) {
                                        C27910f b = GsonHolder.m138943c().mo123620b();
                                        JSONObject jSONObject6 = gVar.f89335b;
                                        if (jSONObject6 == null || (str5 = jSONObject6.toString()) == null) {
                                            str5 = "";
                                        }
                                        C38226al alVar = (C38226al) b.mo46670a(str5, C38226al.class);
                                        if (alVar != null) {
                                            C38805a aVar7 = this.f92166h;
                                            if (aVar7 != null) {
                                                String str8 = gVar.f89336c;
                                                C89219l.m154721d(alVar, "");
                                                DialogC38841c cVar = new DialogC38841c(aVar7.getContext(), alVar);
                                                cVar.f91722c = new C38805a.C38831y(aVar7, aVar3, str8);
                                                cVar.show();
                                                MethodCollector.m26664o(7538);
                                                return;
                                            }
                                            MethodCollector.m26664o(7538);
                                            return;
                                        }
                                        MethodCollector.m26664o(7538);
                                        return;
                                    }
                                    MethodCollector.m26664o(7538);
                                    return;
                                }
                                break;
                            case 2049435752:
                                if (str7.equals("closeLightLandingPage")) {
                                    JSONObject jSONObject7 = gVar.f89335b;
                                    if (jSONObject7 == null || jSONObject7.optInt("close_from_h5") != 1) {
                                        C38805a aVar8 = this.f92166h;
                                        if (!(aVar8 == null || !aVar8.getMBottomSheet().mo14580a() || (aVar2 = this.f92166h) == null)) {
                                            aVar2.mo67418b();
                                        }
                                        if (aVar3 != null) {
                                            aVar3.mo29249a(gVar.f89336c, new JSONObject(C89041ag.m154412a(new C89378p("code", 1))));
                                            MethodCollector.m26664o(7538);
                                            return;
                                        }
                                        MethodCollector.m26664o(7538);
                                        return;
                                    }
                                    Activity d2 = mo60208d();
                                    C89219l.m154716b(d2, "");
                                    C38805a.C38809d.m78759a(d2, C38805a.f91638m);
                                    MethodCollector.m26664o(7538);
                                    return;
                                }
                                break;
                        }
                    } else {
                        MethodCollector.m26664o(7538);
                        return;
                    }
                }
            } else if (str.equals("ad_feed_on_page_selected") && !((((a = C39020a.m79185a((aweme = this.f92081o))) == null || a.length() <= 0 || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebviewType() != 0) && !C37699a.m76210M(aweme) && !C37699a.m76250aV(aweme)) || (fragment2 = this.f92082p) == null || (activity2 = fragment2.getActivity()) == null)) {
                String a2 = C39020a.m79185a(this.f92081o);
                if ((a2 == null || a2.length() <= 0) && !C37699a.m76210M(this.f92081o) && !C37699a.m76250aV(this.f92081o)) {
                    MethodCollector.m26664o(7538);
                    return;
                }
                T t = new C38805a.C38810e.C38811a().mo67169a(new C39021b(this, a2)).f91182a;
                C89219l.m154721d(activity2, "");
                C89219l.m154721d(t, "");
                Integer num = t.f91672d;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = C38805a.f91638m;
                }
                C38805a b2 = C38805a.C38809d.m78762b(activity2, i);
                if (b2 == null) {
                    b2 = new C38805a(activity2, (byte) 0);
                    b2.setId(i);
                    b2.setParams(t);
                    FrameLayout a3 = C38805a.C38809d.m78758a(activity2);
                    if (a3 != null) {
                        a3.addView(b2);
                    }
                }
                this.f92166h = b2;
                b2.setCallback(new C39022c(this, activity2));
                MethodCollector.m26664o(7538);
                return;
            }
        } else if (!(!str.equals("ad_feed_on_page_unselected") || this.f92166h == null || (fragment = this.f92082p) == null || (activity = fragment.getActivity()) == null)) {
            int i2 = C38805a.f91638m;
            C89219l.m154721d(activity, "");
            C38805a b3 = C38805a.C38809d.m78762b(activity, i2);
            if (b3 != null) {
                b3.mo67415a();
                FrameLayout a4 = C38805a.C38809d.m78758a(activity);
                if (a4 != null) {
                    a4.removeView(b3);
                }
            }
            this.f92166h = null;
            MethodCollector.m26664o(7538);
            return;
        }
        MethodCollector.m26664o(7538);
    }
}
