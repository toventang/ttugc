package com.p2082ss.android.ugc.aweme.money.growth;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.p2082ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79664i;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.money.growth.e */
public final class C60180e {

    /* renamed from: f */
    public static boolean f137180f;

    /* renamed from: g */
    public static final C60180e f137181g = C60182b.f137189a;

    /* renamed from: h */
    public static final C60181a f137182h = new C60181a((byte) 0);

    /* renamed from: a */
    public UgAwemeActivitySetting f137183a;

    /* renamed from: b */
    public final C60178d f137184b;

    /* renamed from: c */
    public String f137185c;

    /* renamed from: d */
    public boolean f137186d;

    /* renamed from: e */
    public boolean f137187e;

    /* renamed from: i */
    private final List<WeakReference<AbstractC60168a>> f137188i;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.e$a */
    public static final class C60181a {
        static {
            Covode.recordClassIndex(70710);
        }

        private C60181a() {
        }

        public /* synthetic */ C60181a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.e$b */
    static final class C60182b {

        /* renamed from: a */
        static final C60180e f137189a = new C60180e((byte) 0);

        /* renamed from: b */
        public static final C60182b f137190b = new C60182b();

        private C60182b() {
        }

        static {
            Covode.recordClassIndex(70711);
        }
    }

    /* renamed from: h */
    public static void m109674h() {
        AbstractC81915c.m141874a(new C79664i());
    }

    static {
        Covode.recordClassIndex(70709);
    }

    private C60180e() {
        this.f137188i = new ArrayList();
        C60178d dVar = new C60178d();
        this.f137184b = dVar;
        this.f137187e = true;
        m109675i();
        this.f137185c = dVar.f137178c;
    }

    /* renamed from: j */
    private final boolean m109676j() {
        UrlModel urlModel;
        UgLoginBanner loginBanner;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f137183a;
            if (ugAwemeActivitySetting == null || (loginBanner = ugAwemeActivitySetting.getLoginBanner()) == null) {
                urlModel = null;
            } else {
                urlModel = loginBanner.getResourceUrl();
            }
            return m109672b(urlModel);
        } catch (C16041a e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo97858c() {
        UrlModel urlModel;
        UgChannelPopup channelPopup;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f137183a;
            if (ugAwemeActivitySetting == null || (channelPopup = ugAwemeActivitySetting.getChannelPopup()) == null) {
                urlModel = null;
            } else {
                urlModel = channelPopup.getResourceUrl();
            }
            return m109672b(urlModel);
        } catch (C16041a e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo97856b() {
        this.f137186d = true;
        if (!this.f137187e) {
            C89219l.m154721d("not first video,show dialog", "");
            m109674h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo97859d() {
        UrlModel urlModel;
        UgProfileActivityButton profileActivityButton;
        C89219l.m154721d("tryLoadCouponIconImage", "");
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f137183a;
            if (ugAwemeActivitySetting == null || (profileActivityButton = ugAwemeActivitySetting.getProfileActivityButton()) == null) {
                urlModel = null;
            } else {
                urlModel = profileActivityButton.getResourceUrl();
            }
            m109672b(urlModel);
        } catch (C16041a unused) {
            C89219l.m154721d("tryLoadCouponIconImage:NullValueException", "");
        }
    }

    /* renamed from: i */
    private final void m109675i() {
        String str;
        UgChannelPopup channelPopup;
        C89219l.m154721d(" initActivityEntry", "");
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            this.f137183a = iESSettingsProxy.getAwemeActivitySetting();
            try {
                if (TextUtils.isEmpty(this.f137185c)) {
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.f137183a;
                    if (ugAwemeActivitySetting == null || (channelPopup = ugAwemeActivitySetting.getChannelPopup()) == null) {
                        str = null;
                    } else {
                        str = channelPopup.getCampaignName();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C1731i.m5640b(GoogleCampaignInfoApi.C60165a.CallableC60166a.f137154a, C1731i.f5562a);
                    }
                }
            } catch (C16041a e) {
                e.printStackTrace();
            }
            if (mo97860e()) {
                mo97858c();
                mo97859d();
            }
            m109676j();
        } catch (C16041a unused) {
            C89219l.m154721d(" initEntry NullValueException", "");
        }
    }

    /* renamed from: a */
    public final void mo97853a() {
        AbstractC60168a aVar;
        f137180f = true;
        m109675i();
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f137183a;
        if (ugAwemeActivitySetting != null) {
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    this.f137184b.mo97852a(false);
                    this.f137184b.mo97850a(0);
                    this.f137184b.mo97851a("");
                }
            } catch (C16041a e) {
                e.printStackTrace();
            }
            for (WeakReference weakReference : C89070n.m154590j(this.f137188i)) {
                if (!(weakReference == null || (aVar = (AbstractC60168a) weakReference.get()) == null)) {
                    aVar.mo37130a(this.f137183a);
                }
            }
        } else {
            C89219l.m154721d("settingRequestComplete -> activityEntry empty", "");
        }
        if (this.f137186d && !this.f137187e) {
            m109674h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo97860e() {
        if (this.f137184b.f137176a == 2) {
            C89219l.m154721d("DeepLink not show ： have shown", "");
            return false;
        } else if (this.f137184b.f137176a == 1) {
            return true;
        } else {
            try {
                String str = this.f137185c;
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f137183a;
                String str2 = null;
                if (ugAwemeActivitySetting != null) {
                    str2 = ugAwemeActivitySetting.getActivityId();
                }
                if (!TextUtils.equals(str, str2)) {
                    C89219l.m154721d("DeepLink not show： DeepLinkID != activityId--->" + this.f137185c, "");
                    return false;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f137183a;
                if (ugAwemeActivitySetting2 == null || ugAwemeActivitySetting2.getChannelPopup() == null) {
                    C89219l.m154721d("DeepLink not show： channelPopup==null", "");
                    return false;
                }
                this.f137184b.mo97850a(1);
                return true;
            } catch (C16041a unused) {
                C89219l.m154721d("DeepLink not show： setting is null", "");
                return false;
            }
        }
    }

    /* renamed from: g */
    public final UgLoginBanner mo97862g() {
        String str;
        List<String> list;
        UgLoginBanner loginBanner;
        UrlModel resourceUrl;
        UgLoginBanner loginBanner2;
        if (!f137180f || !m109676j()) {
            return null;
        }
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f137183a;
            if (ugAwemeActivitySetting == null || (loginBanner2 = ugAwemeActivitySetting.getLoginBanner()) == null) {
                str = null;
            } else {
                str = loginBanner2.getText();
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f137183a;
            if (ugAwemeActivitySetting2 == null || (loginBanner = ugAwemeActivitySetting2.getLoginBanner()) == null || (resourceUrl = loginBanner.getResourceUrl()) == null) {
                list = null;
            } else {
                list = resourceUrl.getUrlList();
            }
            if (C34717d.m70908a(list)) {
                return null;
            }
            UgAwemeActivitySetting ugAwemeActivitySetting3 = this.f137183a;
            if (ugAwemeActivitySetting3 != null) {
                return ugAwemeActivitySetting3.getLoginBanner();
            }
            return null;
        } catch (C16041a unused) {
        }
    }

    /* renamed from: f */
    public final UgChannelPopup mo97861f() {
        String str;
        String str2;
        String str3;
        String str4;
        List<String> list;
        UgChannelPopup channelPopup;
        UrlModel resourceUrl;
        UgChannelPopup channelPopup2;
        UgChannelPopup channelPopup3;
        UgChannelPopup channelPopup4;
        UgChannelPopup channelPopup5;
        this.f137187e = false;
        if (!f137180f) {
            C89219l.m154721d("DeepLink not show： setting not return", "");
            return null;
        } else if (!mo97860e()) {
            return null;
        } else {
            if (!mo97858c()) {
                C89219l.m154721d("DeepLink not show： resourcce not ready", "");
                return null;
            }
            try {
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f137183a;
                if (ugAwemeActivitySetting == null || (channelPopup5 = ugAwemeActivitySetting.getChannelPopup()) == null) {
                    str = null;
                } else {
                    str = channelPopup5.getButtonText();
                }
                if (TextUtils.isEmpty(str)) {
                    C89219l.m154721d("DeepLink not show： activityEntry?.channelPopup?.buttonText is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f137183a;
                if (ugAwemeActivitySetting2 == null || (channelPopup4 = ugAwemeActivitySetting2.getChannelPopup()) == null) {
                    str2 = null;
                } else {
                    str2 = channelPopup4.getContent();
                }
                if (TextUtils.isEmpty(str2)) {
                    C89219l.m154721d("DeepLink not show： activityEntry?.channelPopup?.content is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting3 = this.f137183a;
                if (ugAwemeActivitySetting3 == null || (channelPopup3 = ugAwemeActivitySetting3.getChannelPopup()) == null) {
                    str3 = null;
                } else {
                    str3 = channelPopup3.getTitle();
                }
                if (TextUtils.isEmpty(str3)) {
                    C89219l.m154721d("DeepLink not show： activityEntry?.channelPopup?.title is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting4 = this.f137183a;
                if (ugAwemeActivitySetting4 == null || (channelPopup2 = ugAwemeActivitySetting4.getChannelPopup()) == null) {
                    str4 = null;
                } else {
                    str4 = channelPopup2.getH5Link();
                }
                if (TextUtils.isEmpty(str4)) {
                    C89219l.m154721d("DeepLink not show： activityEntry?.channelPopup?.h5Link is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting5 = this.f137183a;
                if (ugAwemeActivitySetting5 == null || (channelPopup = ugAwemeActivitySetting5.getChannelPopup()) == null || (resourceUrl = channelPopup.getResourceUrl()) == null) {
                    list = null;
                } else {
                    list = resourceUrl.getUrlList();
                }
                if (C34717d.m70908a(list)) {
                    C89219l.m154721d("DeepLink not show： activityEntry?.channelPopup?.resourceUrl is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting6 = this.f137183a;
                if (ugAwemeActivitySetting6 != null) {
                    return ugAwemeActivitySetting6.getChannelPopup();
                }
                return null;
            } catch (C16041a unused) {
                C89219l.m154721d("DeepLink not show： setting channelPopup is empty", "");
                return null;
            }
        }
    }

    public /* synthetic */ C60180e(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo97854a(AbstractC60168a aVar) {
        C89219l.m154721d(aVar, "");
        this.f137188i.add(new WeakReference<>(aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.money.growth.e$c */
    public static final class C60183c<T> implements AbstractC34583a {

        /* renamed from: a */
        final /* synthetic */ C60180e f137191a;

        static {
            Covode.recordClassIndex(70712);
        }

        C60183c(C60180e eVar) {
            this.f137191a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a
        /* renamed from: a */
        public final /* synthetic */ void mo61039a(Object obj) {
            if (obj != null && this.f137191a.f137186d && !this.f137191a.f137187e) {
                C89219l.m154721d("resoure ready,show dialog", "");
                C60180e.m109674h();
            }
        }
    }

    /* renamed from: b */
    private final boolean m109672b(UrlModel urlModel) {
        com.p2082ss.android.ugc.aweme.base.model.UrlModel a = m109670a(urlModel);
        if (m109673c(urlModel)) {
            return true;
        }
        C34577e.m70589a(a, 0, 0, new C60183c(this));
        return false;
    }

    /* renamed from: a */
    public static com.p2082ss.android.ugc.aweme.base.model.UrlModel m109670a(UrlModel urlModel) {
        List<String> list;
        com.p2082ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.p2082ss.android.ugc.aweme.base.model.UrlModel();
        String str = null;
        if (urlModel != null) {
            try {
                list = urlModel.getUrlList();
            } catch (C16041a e) {
                e.printStackTrace();
            }
        } else {
            list = null;
        }
        urlModel2.setUrlList(list);
        if (urlModel != null) {
            str = urlModel.getUri();
        }
        urlModel2.setUri(str);
        return urlModel2;
    }

    /* renamed from: c */
    private static boolean m109673c(UrlModel urlModel) {
        com.p2082ss.android.ugc.aweme.base.model.UrlModel a = m109670a(urlModel);
        if (C34717d.m70908a(a.getUrlList()) || !C34577e.m70603a(Uri.parse(a.getUrlList().get(0)))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo97857b(String str) {
        try {
            if (this.f137184b.f137176a != 2) {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                C89219l.m154716b(awemeActivitySetting, "");
                Boolean isNewUser = awemeActivitySetting.getIsNewUser();
                String str2 = "old_user";
                C89219l.m154716b(isNewUser, "");
                if (isNewUser.booleanValue()) {
                    str2 = "new_user";
                }
                C39162r.m79460a("coupon_targetusers", new C33744d().mo59983a("media_source", str).mo59983a("user_type", str2).f79943a);
            }
        } catch (C16041a unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo97855a(String str) {
        C89219l.m154721d("feacebook DeepLink:".concat(String.valueOf(str)), "");
        if (TextUtils.indexOf(str, "snssdk1233://growth_activity_dialog") != 0 && TextUtils.indexOf(str, "snssdk1180://growth_activity_dialog") != 0) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        this.f137185c = parse.getLastPathSegment();
        C89219l.m154721d("deepLinkRequestComplete:".concat(String.valueOf(str)), "");
        mo97857b("facebook");
        String str2 = this.f137185c;
        if (str2 != null) {
            C60178d dVar = this.f137184b;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            dVar.mo97851a(str2);
        }
        mo97856b();
        if (!mo97860e()) {
            return true;
        }
        mo97858c();
        mo97859d();
        return true;
    }

    /* renamed from: a */
    public static void m109671a(String str, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
    }
}
