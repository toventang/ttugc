package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50099bb;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.MainBottomTabView;
import com.p2082ss.android.ugc.aweme.money.growth.AbstractC60168a;
import com.p2082ss.android.ugc.aweme.money.growth.C60180e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a;
import com.p2082ss.android.ugc.aweme.profile.C63504c;
import com.p2082ss.android.ugc.aweme.share.model.C69329a;
import com.p2082ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

public final class FissionPopupWindowHelp implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public UgAwemeActivitySetting f53861a;

    /* renamed from: b */
    public C50099bb f53862b;

    /* renamed from: c */
    public final Fragment f53863c;

    /* renamed from: d */
    public final ScrollSwitchStateManager f53864d;

    /* renamed from: e */
    ViewStub f53865e;

    /* renamed from: f */
    public FeedPanelStateViewModel f53866f;

    /* renamed from: g */
    Handler f53867g;

    /* renamed from: h */
    boolean f53868h;

    /* renamed from: i */
    public boolean f53869i;

    /* renamed from: j */
    public AbstractC56223a f53870j;

    /* renamed from: k */
    public boolean f53871k;

    /* renamed from: l */
    private final String f53872l = "MainPageFragment";

    /* renamed from: m */
    private final View f53873m;

    /* renamed from: n */
    private MainBottomTabView f53874n;

    /* renamed from: o */
    private boolean f53875o;

    static {
        Covode.recordClassIndex(26710);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(123, new RunnableC90250g(FissionPopupWindowHelp.class, "onScrolledToProfileTab", C69329a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp$e */
    static final class RunnableC22818e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FissionPopupWindowHelp f53880a;

        static {
            Covode.recordClassIndex(26715);
        }

        RunnableC22818e(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f53880a = fissionPopupWindowHelp;
        }

        public final void run() {
            this.f53880a.mo37125b();
        }
    }

    /* renamed from: c */
    public final void mo37126c() {
        C50099bb bbVar = this.f53862b;
        if (bbVar != null) {
            bbVar.dismiss();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        this.f53869i = false;
        mo37126c();
    }

    /* renamed from: b */
    public final void mo37125b() {
        ViewStub viewStub = this.f53865e;
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo37124a() {
        long j;
        RunnableC22820g gVar = new RunnableC22820g(this);
        MainBottomTabView mainBottomTabView = this.f53874n;
        long j2 = 0;
        if (mainBottomTabView != null) {
            if (C50099bb.f115642i) {
                j = 0;
            } else {
                j = 4000;
            }
            mainBottomTabView.postDelayed(gVar, j);
        }
        MainBottomTabView mainBottomTabView2 = this.f53874n;
        if (mainBottomTabView2 != null) {
            RunnableC22819f fVar = new RunnableC22819f(this);
            if (C63504c.m115069a().mo102139b()) {
                j2 = 4000;
            }
            mainBottomTabView2.postDelayed(fVar, j2);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        this.f53869i = true;
        this.f53874n = (MainBottomTabView) this.f53873m.findViewById(R.id.ci0);
        this.f53865e = (ViewStub) this.f53873m.findViewById(R.id.afi);
        if (this.f53866f == null) {
            this.f53866f = (FeedPanelStateViewModel) C1181ae.m3881a(this.f53863c.requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(FeedPanelStateViewModel.class);
        }
        if (C60180e.f137180f) {
            UgAwemeActivitySetting ugAwemeActivitySetting = C60180e.f137181g.f137183a;
            this.f53861a = ugAwemeActivitySetting;
            if (ugAwemeActivitySetting != null) {
                mo37124a();
            }
        } else if (!this.f53875o) {
            this.f53875o = true;
            C60180e.f137181g.mo97854a(new C22814a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp$g */
    public static final class RunnableC22820g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FissionPopupWindowHelp f53882a;

        static {
            Covode.recordClassIndex(26717);
        }

        RunnableC22820g(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f53882a = fissionPopupWindowHelp;
        }

        public final void run() {
            Boolean bool;
            Boolean bool2;
            C1213t<Boolean> tVar;
            C1213t<Boolean> tVar2;
            if (this.f53882a.f53862b == null && this.f53882a.f53871k && this.f53882a.f53863c.getActivity() != null && this.f53882a.f53864d.mo89350b("page_feed")) {
                FeedPanelStateViewModel feedPanelStateViewModel = this.f53882a.f53866f;
                C50099bb bbVar = null;
                if (feedPanelStateViewModel == null || (tVar2 = feedPanelStateViewModel.f155229c) == null) {
                    bool = null;
                } else {
                    bool = tVar2.getValue();
                }
                FeedPanelStateViewModel feedPanelStateViewModel2 = this.f53882a.f53866f;
                if (feedPanelStateViewModel2 == null || (tVar = feedPanelStateViewModel2.f155230d) == null) {
                    bool2 = null;
                } else {
                    bool2 = tVar.getValue();
                }
                if (bool != null && bool.booleanValue()) {
                    return;
                }
                if ((bool2 == null || !bool2.booleanValue()) && this.f53882a.f53870j.mo93045h()) {
                    ActivityC0945e activity = this.f53882a.f53863c.getActivity();
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, "");
                    AbstractC53316a aVar = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a(activity).mo89739b("USER");
                    FissionPopupWindowHelp fissionPopupWindowHelp = this.f53882a;
                    if (aVar != null) {
                        UgAwemeActivitySetting ugAwemeActivitySetting = fissionPopupWindowHelp.f53861a;
                        ActivityC0945e activity2 = this.f53882a.f53863c.getActivity();
                        C89219l.m154721d(aVar, "");
                        if (!(activity2 == null || !C50099bb.C50100a.m94052a(ugAwemeActivitySetting) || C50099bb.f115643j == null)) {
                            String str = C50099bb.f115643j;
                            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                            bbVar = new C50099bb(activity2, aVar, str);
                            if (bbVar.f115647a != null) {
                                int i = Build.VERSION.SDK_INT;
                                bbVar.showAsDropDown(bbVar.f115647a, bbVar.f115653g, -(bbVar.f115647a.getHeight() + bbVar.f115650d + bbVar.f115652f), 51);
                                bbVar.f115651e.post(new C50099bb.RunnableC50103d(bbVar));
                                long j = (long) C50099bb.f115644k;
                                bbVar.getContentView().removeCallbacks(bbVar.f115649c);
                                bbVar.getContentView().postDelayed(bbVar.f115649c, j);
                            }
                            C60180e.f137181g.f137184b.mo97852a(true);
                        }
                    }
                    fissionPopupWindowHelp.f53862b = bbVar;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp$f */
    public static final class RunnableC22819f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FissionPopupWindowHelp f53881a;

        static {
            Covode.recordClassIndex(26716);
        }

        RunnableC22819f(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f53881a = fissionPopupWindowHelp;
        }

        public final void run() {
            Boolean bool;
            boolean z;
            View inflate;
            TextView textView;
            C1213t<Boolean> tVar;
            C1213t<Boolean> tVar2;
            MethodCollector.m26663i(6675);
            FissionPopupWindowHelp fissionPopupWindowHelp = this.f53881a;
            if (!fissionPopupWindowHelp.f53868h) {
                fissionPopupWindowHelp.f53868h = true;
                if (fissionPopupWindowHelp.f53871k && fissionPopupWindowHelp.f53863c.getActivity() != null && fissionPopupWindowHelp.f53864d.mo89350b("page_feed")) {
                    FeedPanelStateViewModel feedPanelStateViewModel = fissionPopupWindowHelp.f53866f;
                    Boolean bool2 = null;
                    if (feedPanelStateViewModel == null || (tVar2 = feedPanelStateViewModel.f155229c) == null) {
                        bool = null;
                    } else {
                        bool = tVar2.getValue();
                    }
                    FeedPanelStateViewModel feedPanelStateViewModel2 = fissionPopupWindowHelp.f53866f;
                    if (!(feedPanelStateViewModel2 == null || (tVar = feedPanelStateViewModel2.f155230d) == null)) {
                        bool2 = tVar.getValue();
                    }
                    if ((bool == null || !bool.booleanValue()) && ((bool2 == null || !bool2.booleanValue()) && fissionPopupWindowHelp.f53870j.mo93045h())) {
                        try {
                            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                            C89219l.m154716b(iESSettingsProxy, "");
                            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                            C89219l.m154716b(awemeActivitySetting, "");
                            UgProfileActivityButton profileActivityButton = awemeActivitySetting.getProfileActivityButton();
                            C89219l.m154716b(profileActivityButton, "");
                            Integer timeLimit = profileActivityButton.getTimeLimit();
                            C63504c a = C63504c.m115069a();
                            String activityId = awemeActivitySetting.getActivityId();
                            C89219l.m154716b(timeLimit, "");
                            z = a.mo102137a(activityId, timeLimit.intValue());
                        } catch (C16041a unused) {
                            z = false;
                        }
                        if (C63504c.m115069a().mo102139b() && z) {
                            C63504c.m115069a().mo102136a(true);
                            try {
                                IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
                                C89219l.m154716b(iESSettingsProxy2, "");
                                UgAwemeActivitySetting awemeActivitySetting2 = iESSettingsProxy2.getAwemeActivitySetting();
                                C89219l.m154716b(awemeActivitySetting2, "");
                                UgProfileActivityButton profileActivityButton2 = awemeActivitySetting2.getProfileActivityButton();
                                C89219l.m154716b(profileActivityButton2, "");
                                String tabBubbleText = profileActivityButton2.getTabBubbleText();
                                if (tabBubbleText != null && !TextUtils.equals(tabBubbleText, "")) {
                                    ViewStub viewStub = fissionPopupWindowHelp.f53865e;
                                    if (!(viewStub == null || (inflate = viewStub.inflate()) == null || (textView = (TextView) inflate.findViewById(R.id.afj)) == null)) {
                                        textView.setText(tabBubbleText);
                                    }
                                    ViewStub viewStub2 = fissionPopupWindowHelp.f53865e;
                                    if (viewStub2 != null) {
                                        viewStub2.setVisibility(0);
                                    }
                                    C39162r.m79460a("bubble_show", new C33744d().mo59983a("bubble_type", "coupon_fission").mo59983a("show_position", "personal_homepage").f79943a);
                                    fissionPopupWindowHelp.f53867g = new Handler(Looper.getMainLooper());
                                    Handler handler = fissionPopupWindowHelp.f53867g;
                                    if (handler != null) {
                                        handler.postDelayed(new RunnableC22818e(fissionPopupWindowHelp), 5000);
                                        MethodCollector.m26664o(6675);
                                        return;
                                    }
                                    MethodCollector.m26664o(6675);
                                    return;
                                }
                            } catch (C16041a unused2) {
                                MethodCollector.m26664o(6675);
                                return;
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
            MethodCollector.m26664o(6675);
        }
    }

    @AbstractC90264r
    public final void onScrolledToProfileTab(C69329a aVar) {
        mo37126c();
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp$a */
    public static final class C22814a implements AbstractC60168a {

        /* renamed from: a */
        final /* synthetic */ FissionPopupWindowHelp f53876a;

        static {
            Covode.recordClassIndex(26711);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C22814a(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f53876a = fissionPopupWindowHelp;
        }

        @Override // com.p2082ss.android.ugc.aweme.money.growth.AbstractC60168a
        /* renamed from: a */
        public final void mo37130a(UgAwemeActivitySetting ugAwemeActivitySetting) {
            this.f53876a.f53861a = ugAwemeActivitySetting;
            if (ugAwemeActivitySetting != null && this.f53876a.f53869i) {
                this.f53876a.mo37124a();
            }
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp$b */
    public static final class C22815b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FissionPopupWindowHelp f53877a;

        static {
            Covode.recordClassIndex(26712);
        }

        public C22815b(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f53877a = fissionPopupWindowHelp;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f53877a.mo37126c();
            }
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp$c */
    public static final class C22816c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FissionPopupWindowHelp f53878a;

        static {
            Covode.recordClassIndex(26713);
        }

        public C22816c(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f53878a = fissionPopupWindowHelp;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f53878a.mo37126c();
            }
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp$d */
    public static final class C22817d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FissionPopupWindowHelp f53879a;

        static {
            Covode.recordClassIndex(26714);
        }

        public C22817d(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f53879a = fissionPopupWindowHelp;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f53879a.mo37126c();
            }
        }
    }

    public FissionPopupWindowHelp(AbstractC56223a aVar, Fragment fragment, View view, ScrollSwitchStateManager scrollSwitchStateManager) {
        AbstractC1196i lifecycle;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(scrollSwitchStateManager, "");
        this.f53863c = fragment;
        this.f53864d = scrollSwitchStateManager;
        this.f53873m = view;
        this.f53870j = aVar;
        if (!(!(fragment instanceof AbstractC1204m) || fragment == null || (lifecycle = fragment.getLifecycle()) == null)) {
            lifecycle.mo4012a(this);
        }
        EventBus.m156966a(EventBus.m156962a(), this);
    }
}
