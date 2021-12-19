package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1777x.p1780c.C23697c;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.C38974b;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.C38975c;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.C39041b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.AbstractC33279b;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget */
public final class CommonWebPageWidget extends AbsAdFeedWidget implements AbstractC33974au {

    /* renamed from: l */
    public static boolean f92188l;

    /* renamed from: m */
    public static final C39034a f92189m = new C39034a((byte) 0);

    /* renamed from: a */
    CommonPopUpWebPageView f92190a;

    /* renamed from: h */
    long f92191h;

    /* renamed from: i */
    final C39036b f92192i = new C39036b(this);

    /* renamed from: j */
    final C39038d f92193j = new C39038d();

    /* renamed from: k */
    final C39037c f92194k = new C39037c();

    static {
        Covode.recordClassIndex(46634);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget$a */
    public static final class C39034a {
        static {
            Covode.recordClassIndex(46635);
        }

        private C39034a() {
        }

        /* renamed from: a */
        public static void m79218a() {
            if (CommonWebPageWidget.f92188l) {
                C81079v.m140776O().mo123950y();
                CommonWebPageWidget.f92188l = false;
            }
        }

        /* renamed from: b */
        private static boolean m79221b() {
            AbstractC80747i O = C81079v.m140776O();
            C89219l.m154716b(O, "");
            return O.mo123892o();
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget$a$a */
        static final class C39035a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C38975c f92195a;

            /* renamed from: b */
            final /* synthetic */ CommonPopUpWebPageView f92196b;

            static {
                Covode.recordClassIndex(46636);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39035a(C38975c cVar, CommonPopUpWebPageView commonPopUpWebPageView) {
                super(0);
                this.f92195a = cVar;
                this.f92196b = commonPopUpWebPageView;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                Bundle bundle;
                this.f92196b.getActionMode().f92061f = this.f92195a.f92076d;
                C39034a.m79219a(this.f92195a.f92076d);
                CommonPopUpWebPageView commonPopUpWebPageView = this.f92196b;
                C38975c cVar = this.f92195a;
                C89219l.m154721d(cVar, "");
                String str = cVar.f92074b;
                String str2 = null;
                if (str == null) {
                    C38618ac acVar = commonPopUpWebPageView.f92021e;
                    if (acVar != null) {
                        str = acVar.f91259a;
                    }
                    return C89391z.f203057a;
                }
                if (!(str == null || str.length() == 0)) {
                    commonPopUpWebPageView.f92025i.mo45342d().mo45340b();
                    commonPopUpWebPageView.f92027k = cVar;
                    CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer = (CommonPopUpWebBottomSheetContainer) commonPopUpWebPageView.mo67655a(R.id.d45);
                    commonPopUpWebBottomSheetContainer.getActionMode().mo67687a(cVar.f92077e);
                    commonPopUpWebBottomSheetContainer.f92008h.mo66045b(commonPopUpWebBottomSheetContainer.getActionMode().f92056a);
                    int i = cVar.f92077e;
                    if (i != 1) {
                        if (i == 2) {
                            ((CommonPopUpWebBottomSheetContainer) commonPopUpWebPageView.mo67655a(R.id.d45)).mo14580a();
                        } else if (i == 3) {
                            ((CommonPopUpWebBottomSheetContainer) commonPopUpWebPageView.mo67655a(R.id.d45)).f92008h.mo66047c(4);
                        }
                    }
                    String str3 = cVar.f92074b;
                    if (str3 == null) {
                        C38618ac acVar2 = commonPopUpWebPageView.f92021e;
                        if (acVar2 != null) {
                            str2 = acVar2.f91259a;
                        }
                    } else {
                        str2 = str3;
                    }
                    C38618ac acVar3 = commonPopUpWebPageView.f92021e;
                    if (!(acVar3 == null || (bundle = acVar3.f91263e) == null)) {
                        String string = bundle.getString("title");
                        if (C23697c.m44781a(string)) {
                            string = bundle.getString("bundle_web_title");
                        }
                        if (C23697c.m44781a(string)) {
                            string = Uri.parse(str2).getQueryParameter("title");
                        }
                        if (C23697c.m44781a(string)) {
                            string = commonPopUpWebPageView.getContext().getString(R.string.g1j);
                        }
                        CommonPopUpWebTitleBar commonPopUpWebTitleBar = (CommonPopUpWebTitleBar) commonPopUpWebPageView.mo67655a(R.id.d4l);
                        if (TextUtils.isEmpty(string)) {
                            string = commonPopUpWebTitleBar.getContext().getString(R.string.g1y);
                        }
                        commonPopUpWebTitleBar.f92051a = string;
                        TuxTextView tuxTextView = (TuxTextView) commonPopUpWebTitleBar.mo67680a(R.id.d4k);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setText(commonPopUpWebTitleBar.f92051a);
                        ((TuxIconView) commonPopUpWebTitleBar.mo67680a(R.id.d46)).setOnClickListener(new CommonPopUpWebTitleBar.View$OnClickListenerC38971c(commonPopUpWebTitleBar));
                        CommonPopUpWebTitleBar commonPopUpWebTitleBar2 = (CommonPopUpWebTitleBar) commonPopUpWebPageView.mo67655a(R.id.d4l);
                        if (str2 == null) {
                            str2 = "";
                        }
                        commonPopUpWebTitleBar2.setSubTitle(str2);
                    }
                    FrameLayout frameLayout = (FrameLayout) commonPopUpWebPageView.mo67655a(R.id.d49);
                    C89219l.m154716b(frameLayout, "");
                    frameLayout.setVisibility(0);
                    AbstractC33279b bVar = commonPopUpWebPageView.f92017a;
                    if (bVar != null) {
                        bVar.mo59237a(true);
                    }
                    ((FrameLayout) commonPopUpWebPageView.mo67655a(R.id.d49)).setOnClickListener(new CommonPopUpWebPageView.View$OnClickListenerC38966l(commonPopUpWebPageView));
                    C38974b.f92065a = false;
                    WebView webView = commonPopUpWebPageView.getWebView();
                    if (webView != null) {
                        ((CommonPopUpWebBottomSheetContainer) commonPopUpWebPageView.mo67655a(R.id.d45)).setWebViewForDragBehavior(webView);
                    }
                    commonPopUpWebPageView.f92019c = true;
                    AdPopUpWebPageContainer adPopUpWebPageContainer = commonPopUpWebPageView.f92018b;
                    if (adPopUpWebPageContainer != null) {
                        adPopUpWebPageContainer.mo66098b();
                    }
                    CommonPopUpWebPageView.AbstractC38955a aVar = commonPopUpWebPageView.f92022f;
                    if (aVar != null) {
                        aVar.mo67672a();
                    }
                    commonPopUpWebPageView.mo67656a(cVar.f92074b);
                }
                return C89391z.f203057a;
            }
        }

        public /* synthetic */ C39034a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m79219a(int i) {
            if (m79221b()) {
                C81079v.m140776O().mo123908B();
                CommonWebPageWidget.f92188l = true;
            }
            if (i == 3) {
                CommonWebPageWidget.f92188l = true;
            }
        }

        /* renamed from: b */
        static CommonPopUpWebPageView m79220b(Activity activity) {
            CommonPopUpWebPageView commonPopUpWebPageView;
            FrameLayout a = m79217a(activity);
            if (a != null) {
                commonPopUpWebPageView = (CommonPopUpWebPageView) a.findViewById(R.id.abl);
            } else {
                commonPopUpWebPageView = null;
            }
            if (!(commonPopUpWebPageView instanceof CommonPopUpWebPageView)) {
                return null;
            }
            return commonPopUpWebPageView;
        }

        /* renamed from: a */
        static FrameLayout m79217a(Activity activity) {
            View inflate;
            MethodCollector.m26663i(8547);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.abi);
            if (viewStub == null) {
                inflate = activity.findViewById(R.id.abh);
            } else {
                inflate = viewStub.inflate();
                if (inflate == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.m26664o(8547);
                    throw nullPointerException;
                }
            }
            FrameLayout frameLayout = (FrameLayout) inflate;
            MethodCollector.m26664o(8547);
            return frameLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget$c */
    public static final class C39037c implements CommonPopUpWebPageView.AbstractC38957c {
        static {
            Covode.recordClassIndex(46638);
        }

        C39037c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget$d */
    public static final class C39038d implements CommonPopUpWebPageView.AbstractC38958d {
        static {
            Covode.recordClassIndex(46639);
        }

        C39038d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView.AbstractC38958d
        /* renamed from: a */
        public final void mo67674a() {
            C39034a.m79218a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        mo67719a(System.currentTimeMillis() - this.f92191h);
        super.onPause();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.f92191h = System.currentTimeMillis();
        super.onResume();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget$b */
    public static final class C39036b implements CommonPopUpWebPageView.AbstractC38955a {

        /* renamed from: a */
        final /* synthetic */ CommonWebPageWidget f92197a;

        static {
            Covode.recordClassIndex(46637);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView.AbstractC38955a
        /* renamed from: a */
        public final void mo67672a() {
            CommonWebPageWidget commonWebPageWidget = this.f92197a;
            AbstractC81915c.m141874a(new AdPopUpWebPageWidget.C39023a(true));
            DataCenter dataCenter = commonWebPageWidget.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("on_ad_pop_up_web_page_show", (Object) null);
            }
            commonWebPageWidget.f92191h = System.currentTimeMillis();
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView.AbstractC38955a
        /* renamed from: b */
        public final void mo67673b() {
            C39034a.m79218a();
            CommonWebPageWidget commonWebPageWidget = this.f92197a;
            AbstractC81915c.m141874a(new AdPopUpWebPageWidget.C39023a(false));
            DataCenter dataCenter = commonWebPageWidget.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("on_ad_pop_up_web_page_hide", (Object) null);
            }
            commonWebPageWidget.mo67719a(System.currentTimeMillis() - commonWebPageWidget.f92191h);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39036b(CommonWebPageWidget commonWebPageWidget) {
            this.f92197a = commonWebPageWidget;
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
            dataCenter.mo60189a("ad_video_on_resume_play", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("video_params", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        C89219l.m154721d(this, "");
        C39041b.f92201a = new WeakReference<>(this);
        if (!C39041b.f92202b) {
            SmartRouter.addInterceptor(new C39041b.C39042a());
            C39041b.f92202b = true;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67719a(long j) {
        if (this.f92190a != null) {
            C33744d dVar = new C33744d();
            dVar.mo59981a("duration", j);
            C39162r.m79460a("h5_stay_time", dVar.f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59239a(C33942b bVar) {
        String str;
        Fragment fragment;
        ActivityC0945e activity;
        ActivityC0945e activity2;
        MethodCollector.m26663i(7174);
        super.onChanged(bVar);
        if (bVar == null || (str = bVar.f80277a) == null) {
            MethodCollector.m26664o(7174);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1540531799) {
            if (hashCode == 2040441990 && str.equals("ad_video_on_resume_play")) {
                if (this.f92190a == null) {
                    MethodCollector.m26664o(7174);
                    return;
                }
                Fragment fragment2 = this.f92082p;
                if (!(fragment2 == null || (activity2 = fragment2.getActivity()) == null)) {
                    C89219l.m154716b(activity2, "");
                    C89219l.m154721d(activity2, "");
                    CommonPopUpWebPageView b = C39034a.m79220b(activity2);
                    if (b != null && b.mo67658a()) {
                        C39034a.m79219a(-1);
                    }
                    MethodCollector.m26664o(7174);
                    return;
                }
            }
        } else if (!(!str.equals("ad_feed_on_page_unselected") || this.f92190a == null || (fragment = this.f92082p) == null || (activity = fragment.getActivity()) == null)) {
            C89219l.m154721d(activity, "");
            CommonPopUpWebPageView b2 = C39034a.m79220b(activity);
            if (b2 != null) {
                CrossPlatformWebView.m82144a((CrossPlatformWebView) b2.mo67655a(R.id.d4d), "about:blank", false, null, 6);
                b2.f92025i.mo45342d();
                FrameLayout a = C39034a.m79217a(activity);
                if (a != null) {
                    a.removeView(b2);
                }
            }
            this.f92190a = null;
            hashCode();
            MethodCollector.m26664o(7174);
            return;
        }
        MethodCollector.m26664o(7174);
    }
}
