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

/* renamed from: com.ss.android.ugc.aweme.profile.service.a */
public final class C63866a implements AbstractC63869d {

    /* renamed from: a */
    public static final C63866a f144791a = new C63866a();

    /* renamed from: b */
    private final /* synthetic */ AbstractC63869d f144792b = C63873h.f144797a.adUtilsService();

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final void closeProfilePopUpWebPage(Activity activity) {
        this.f144792b.closeProfilePopUpWebPage(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final AbstractC64147a createFakeUserProfileFragment() {
        return this.f144792b.createFakeUserProfileFragment();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final AbstractC64147a createNewFakeUserProfileFragment() {
        return this.f144792b.createNewFakeUserProfileFragment();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i) {
        this.f144792b.feedLiveProfileAvatarOpen(context, aweme, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final AbstractC58064a getAdFlutterLandPageUtil() {
        return this.f144792b.getAdFlutterLandPageUtil();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final AbstractC58066b getAdLynxLandPageUtil() {
        return this.f144792b.getAdLynxLandPageUtil();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final JSONObject getExtJson(Context context, Aweme aweme, String str) {
        return this.f144792b.getExtJson(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final void logFeedRawAdOpenUrlH5(Context context, Aweme aweme) {
        this.f144792b.logFeedRawAdOpenUrlH5(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final void logFeedRawLynxAdOpenUrlH5(Context context, Aweme aweme) {
        this.f144792b.logFeedRawLynxAdOpenUrlH5(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final void onProfileWebPageHide(Context context, Aweme aweme, String str) {
        this.f144792b.onProfileWebPageHide(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final void onProfileWebPageShow(Context context, Aweme aweme, String str) {
        this.f144792b.onProfileWebPageShow(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean openProfilePopUpWebPage(Context context, AwemeRawAd awemeRawAd, String str) {
        return this.f144792b.openProfilePopUpWebPage(context, awemeRawAd, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str) {
        return this.f144792b.openProfilePopUpWebPageInSixTwoMode(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str) {
        return this.f144792b.openProfilePopUpWebPageInTwoExpandMode(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str) {
        return this.f144792b.openProfilePopUpWebPageInTwoMode(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z) {
        return this.f144792b.openProfilePopUpWebPageInTwoMode(context, aweme, str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean openTopViewLive(Context context, Aweme aweme, int i, AbstractC38694bo boVar) {
        return this.f144792b.openTopViewLive(context, aweme, i, boVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean shouldShowAdBrowser(Aweme aweme) {
        return this.f144792b.shouldShowAdBrowser(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean shouldShowBioEmail() {
        return this.f144792b.shouldShowBioEmail();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean shouldShowBioUrl() {
        return this.f144792b.shouldShowBioUrl();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d
    public final boolean shouldShowFakeUserProfile(Aweme aweme) {
        return this.f144792b.shouldShowFakeUserProfile(aweme);
    }

    static {
        Covode.recordClassIndex(75291);
    }

    private C63866a() {
    }
}
