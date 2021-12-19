package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37830a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38409h;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38457o;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38695bp;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49696x;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.landpage.AbstractC58064a;
import com.p2082ss.android.ugc.aweme.landpage.AbstractC58066b;
import com.p2082ss.android.ugc.aweme.landpage.p3388a.C58065a;
import com.p2082ss.android.ugc.aweme.landpage.p3389b.C58067a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AdUtilsServiceImpl */
public class AdUtilsServiceImpl implements AbstractC63869d {
    static {
        Covode.recordClassIndex(79573);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public AbstractC58064a getAdFlutterLandPageUtil() {
        return C58065a.f132301a;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public AbstractC58066b getAdLynxLandPageUtil() {
        return C58067a.f132302a;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public AbstractC64147a createFakeUserProfileFragment() {
        return new C38457o();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public AbstractC64147a createNewFakeUserProfileFragment() {
        return new C38409h();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean shouldShowBioEmail() {
        try {
            return C52912c.f121688a.f121689b.getBioSettings().getEnableBioEmail().booleanValue();
        } catch (C16041a unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean shouldShowBioUrl() {
        try {
            return C52912c.f121688a.f121689b.getBioSettings().getEnableBioUrl().booleanValue();
        } catch (C16041a unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean shouldShowFakeUserProfile(Aweme aweme) {
        return C37699a.m76203F(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean shouldShowAdBrowser(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !C37699a.m76202E(aweme) || TextUtils.isEmpty(C37699a.m76281b(aweme))) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public void closeProfilePopUpWebPage(Activity activity) {
        C89219l.m154721d(activity, "");
        AdPopUpWebPageView b = AdProfilePopUpWebPageWidget.C38383a.m77798b(activity);
        if (b != null && b.mo66115g()) {
            b.mo66108a(true);
            FrameLayout a = AdProfilePopUpWebPageWidget.C38383a.m77797a(activity);
            if (a != null) {
                a.setVisibility(8);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public void logFeedRawAdOpenUrlH5(Context context, Aweme aweme) {
        C38189j.m77529f(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public void logFeedRawLynxAdOpenUrlH5(Context context, Aweme aweme) {
        C38189j.m77532g(context, aweme);
    }

    public void logFeedRawFlutterAdOpenUrlH5(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("render_type", "flutter");
        C38189j.m77510b(context, "open_url_h5", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77464a(hashMap)));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public JSONObject getExtJson(Context context, Aweme aweme, String str) {
        return C38189j.m77468a(context, aweme, false, (Map<String, String>) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 5, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 6, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 1, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public void onProfileWebPageHide(Context context, Aweme aweme, String str) {
        if (context != null) {
            AbstractC81915c.m141874a(new C49696x(context.hashCode(), 2, aweme, str));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public void onProfileWebPageShow(Context context, Aweme aweme, String str) {
        if (context != null) {
            AbstractC81915c.m141874a(new C49696x(context.hashCode(), 1, aweme, str));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean openProfilePopUpWebPage(Context context, AwemeRawAd awemeRawAd, String str) {
        AwemeRawAd awemeRawAd2;
        C37977b.C37978a c = new C37977b.C37978a().mo66199a(context).mo66201a(awemeRawAd).mo66198a(3).mo66206c(str);
        if (!(c.f89731a == null || c.f89732b == null || !(c.f89731a instanceof Activity) || (awemeRawAd2 = c.f89732b) == null || awemeRawAd2.getProfileWithWebview() != 1)) {
            if (AdPopUpWebPageWidget.f92172n.mo67716a(c.mo66203a())) {
                AbstractC81915c.m141874a(new C37830a(1));
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void feedLiveProfileAvatarOpen(android.content.Context r8, com.p2082ss.android.ugc.aweme.feed.model.Aweme r9, int r10) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.AdUtilsServiceImpl.feedLiveProfileAvatarOpen(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean openTopViewLive(Context context, Aweme aweme, int i, AbstractC38694bo boVar) {
        return C38695bp.m78506a(context, aweme, i, boVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z) {
        return openProfilePopUpWebPage(context, aweme, str, 4, z);
    }

    public boolean openAdWebUrl(Context context, String str, String str2, boolean z, Map<String, String> map) {
        return C38767w.m78640a(context, str, str2, z, map);
    }

    public boolean openProfilePopUpWebPage(Context context, Aweme aweme, String str, int i, boolean z) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return C38767w.m78646a(new C37977b.C37978a().mo66199a(context).mo66201a(aweme.getAwemeRawAd()).mo66198a(i).mo66206c(str).mo66200a(aweme), z);
    }
}
