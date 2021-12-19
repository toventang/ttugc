package com.bytedance.ies.powerpage.p1236b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.C17740d;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.HashMap;

/* renamed from: com.bytedance.ies.powerpage.b.a */
public final class C17737a implements IInterceptor {

    /* renamed from: a */
    HashMap<String, String> f42405a;

    static {
        Covode.recordClassIndex(20299);
    }

    public C17737a() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f42405a = hashMap;
        hashMap.put("//about_activity", "com.ss.android.ugc.aweme.setting.page.about.AboutPage");
        hashMap.put("//ads/preview", "com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment");
        hashMap.put("//authmanagement", "com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
        hashMap.put("//chat/center", "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment");
        hashMap.put("//chatcontrol/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat.ChatPrivacySettingFragment");
        hashMap.put("//commentcontrol/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentPrivacySettingFragment");
        hashMap.put("//display/caption/setting", "com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage");
        hashMap.put("//display/setting", "com.ss.android.ugc.trill.setting.DisplaySettingPage");
        hashMap.put("//duetcontrol/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.duet.DuetPrivacySettingFragment");
        hashMap.put("//filtercomments", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentPrivacySettingFragment");
        hashMap.put("//helper_center", "com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage");
        hashMap.put("//mentioncontrol/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.tagmention.TagMentionPrivacySettingFragment");
        hashMap.put("//mylikelistcontrol/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.LikedListPrivacySettingFragment");
        hashMap.put("//poi/map", "com.ss.android.ugc.aweme.poi_map.LocationDetailFragment");
        hashMap.put("//poi/search", "com.ss.android.ugc.aweme.poi.search.PoiSearchFragment");
        hashMap.put("//privacy/following_visibility", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.following.FollowingVisibilityPrivacySettingFragment");
        hashMap.put("//privacy/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingFragmentMain");
        hashMap.put("//privacy/suggest_account", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.SuggestAccountPrivacySettingFragment");
        hashMap.put("//push-setting", "com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerPage");
        hashMap.put("//qna/settings", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QASettingFragment");
        hashMap.put("//qrcodev2", "com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
        hashMap.put("//recommend/settings", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.recommend.RecommendSettingFragment");
        hashMap.put("//setting/accessibility", "com.ss.android.ugc.aweme.setting.page.accessibility.AccessibilitySettingPage");
        hashMap.put("//setting/background_audio", "com.ss.android.ugc.aweme.setting.page.backgroundaudio.BackgroundAudioPage");
        hashMap.put("//setting/blocklist", "com.ss.android.ugc.aweme.setting.page.privacy.BlackListPage");
        hashMap.put("//setting/datasaver", "com.ss.android.ugc.aweme.setting.page.datasave.DataSaverSettingPage");
        hashMap.put("//setting/datasaver/freedata", "com.ss.android.ugc.aweme.setting.page.datasave.zerorating.FreeDataPage");
        hashMap.put("//setting/diskmanager", "com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage");
        hashMap.put("//setting/download", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.DownloadsPrivacySettingFragment");
        hashMap.put("//setting/findcontact", "com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage");
        hashMap.put("//setting/security", "com.ss.android.ugc.aweme.setting.page.security.SecurityPage");
        hashMap.put("//social/taglist", "com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage");
        hashMap.put("//stitchcontrol/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.StitchPrivacySettingFragment");
        hashMap.put("//story/archive", "com.ss.android.ugc.aweme.story.archive.StoryArchiveFragment");
        hashMap.put("//translation/language/setting", "com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage");
        hashMap.put("//translation/voice/setting", "com.ss.android.ugc.trill.setting.TranslationVoiceSettingPage");
        hashMap.put("//user/ask", "com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment");
        hashMap.put("//user/ask/", "com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment");
        hashMap.put("//user/qna/profile", "com.ss.android.ugc.aweme.qna.QnaProfile");
        hashMap.put("//user/qna_unavailable", "com.ss.android.ugc.aweme.qna.fragment.QuestionUnavailableFragment");
        hashMap.put("//user_profile_page", "com.ss.android.ugc.aweme.profile.ui.UserProfileFragment");
        hashMap.put("aweme://favorite/videos/allfavorites/content", "com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment");
        hashMap.put("aweme://favorite/videos/collections/add/video", "com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment");
        hashMap.put("aweme://favorite/videos/collections/content", "com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment");
        hashMap.put("aweme://poi/detail", "com.ss.android.ugc.aweme.poi.videolist.PoiVideoListVideoListFragment");
        hashMap.put("aweme://push_setting_manager", "com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerPage");
        hashMap.put("aweme://user/ask", "com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment");
        hashMap.put("aweme://user/ask/", "com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment");
        hashMap.put("aweme://user/inbox/follower", "com.ss.android.ugc.aweme.inbox.InboxFollowerFragment");
        hashMap.put("aweme://user/notification", "com.ss.android.ugc.aweme.notification.MusNewNotificationFragment");
    }

    /* renamed from: a */
    private static Bundle m32868a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        try {
            if (!TextUtils.isEmpty(m32869a(routeIntent))) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private static String m32870a(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            return "//" + parse.getAuthority() + parse.getPath();
        }
        return str;
    }

    /* renamed from: a */
    private String m32869a(RouteIntent routeIntent) {
        if (routeIntent == null) {
            return null;
        }
        String url = routeIntent.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        String a = m32870a(url);
        String str = this.f42405a.get(a);
        if (TextUtils.isEmpty(str) && a.endsWith("/") && a.length() > 1) {
            a = a.substring(0, a.length() - 1);
            str = this.f42405a.get(a);
        }
        if (TextUtils.isEmpty(str)) {
            a = m32871b(url);
            str = this.f42405a.get(a);
        }
        if (!TextUtils.isEmpty(str) || !a.endsWith("/") || a.length() <= 1) {
            return str;
        }
        return this.f42405a.get(a.substring(0, a.length() - 1));
    }

    /* renamed from: b */
    private static String m32871b(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            return parse.getScheme() + "://" + parse.getAuthority() + parse.getPath();
        }
        return "//" + parse.getAuthority() + parse.getPath();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.ies.powerpage.d */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Class<?> cls;
        Bundle bundle;
        if (context == null || routeIntent == null) {
            return false;
        }
        Intent intent = null;
        try {
            String a = m32869a(routeIntent);
            if (!TextUtils.isEmpty(a) && (cls = Class.forName(a)) != null) {
                try {
                    if (Fragment.class.isAssignableFrom(cls)) {
                        if (routeIntent.getExtra() != null) {
                            intent = routeIntent.getExtra();
                            bundle = m32868a(intent);
                        } else {
                            bundle = null;
                        }
                        Intent a2 = C17740d.f42407a.mo28215a(context, cls, bundle, routeIntent.getRequestCode(), routeIntent.getOnActivityResultCallback());
                        if (a2 == null || intent == null) {
                            return true;
                        }
                        intent.setComponent(a2.getComponent());
                        intent.putExtra("power_page_fragment_class_name", cls.getCanonicalName());
                        return true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
        return false;
    }
}
