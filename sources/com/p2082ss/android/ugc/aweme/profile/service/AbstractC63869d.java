package com.p2082ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.landpage.AbstractC58064a;
import com.p2082ss.android.ugc.aweme.landpage.AbstractC58066b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.service.d */
public interface AbstractC63869d {
    static {
        Covode.recordClassIndex(75294);
    }

    void closeProfilePopUpWebPage(Activity activity);

    AbstractC64147a createFakeUserProfileFragment();

    AbstractC64147a createNewFakeUserProfileFragment();

    void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i);

    AbstractC58064a getAdFlutterLandPageUtil();

    AbstractC58066b getAdLynxLandPageUtil();

    JSONObject getExtJson(Context context, Aweme aweme, String str);

    void logFeedRawAdOpenUrlH5(Context context, Aweme aweme);

    void logFeedRawLynxAdOpenUrlH5(Context context, Aweme aweme);

    void onProfileWebPageHide(Context context, Aweme aweme, String str);

    void onProfileWebPageShow(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPage(Context context, AwemeRawAd awemeRawAd, String str);

    boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z);

    boolean openTopViewLive(Context context, Aweme aweme, int i, AbstractC38694bo boVar);

    boolean shouldShowAdBrowser(Aweme aweme);

    boolean shouldShowBioEmail();

    boolean shouldShowBioUrl();

    boolean shouldShowFakeUserProfile(Aweme aweme);
}
