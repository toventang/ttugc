package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34266aw;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.IMainService */
public interface IMainService {

    /* renamed from: com.ss.android.ugc.aweme.services.IMainService$DownLoadFinishListener */
    public interface DownLoadFinishListener {
        static {
            Covode.recordClassIndex(79634);
        }

        void doAfterDownLoad(int i, Boolean bool);
    }

    static {
        Covode.recordClassIndex(79633);
    }

    C69905c avMusicApply(MusicModel musicModel);

    boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2);

    void downloadStickerHelper(String str, String str2, Activity activity, boolean z, DownLoadFinishListener downLoadFinishListener);

    AbstractC58264w getAmeActivityResumeRunTask(Activity activity);

    AbstractC58259r getAnchorListRequest();

    String getApiUrlPrefix();

    Class<? extends Activity> getAppLinkHandlerActivityClass(boolean z);

    int getAppVersionCode();

    Intent getAwemeWebIntent(Context context, Uri uri, Boolean bool, Boolean bool2);

    AbstractC58264w getCookieMonitorTask();

    Class<? extends Activity> getDeepLinkHandlerActivityClass(boolean z);

    List<AbstractC34266aw> getDeeplinkCommands();

    Long getFeedCount(Integer num);

    String getFeedOrder(Aweme aweme, Integer num);

    AbstractC58264w getFetchImUnder16RequestTask();

    Class[] getFixFragmentManagerWhiteList();

    Fragment getFollowFragmentCache();

    AbstractC58264w getLegoRequestTask();

    Class<? extends Activity> getMainActivityClass();

    Intent getMainActivityIntent(Context context);

    AbstractC58258q getMainInflate();

    AbstractC58264w getPreloadInstanceTask();

    Fragment getRecommendFragmentCache();

    AbstractC58264w getRegisterStorageTask();

    String getSecurityUrl(String str);

    Map<String, Object> getSettings(List<String> list);

    AbstractC58264w getShareCacheRegisterTask();

    Class<? extends Activity> getSplashActivityClass();

    Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri, Boolean bool, Boolean bool2);

    boolean handleLiveSchema(String str);

    void initLegoInflate();

    Context interceptActivityAttachBaseContext(Context context);

    boolean isAppHot();

    boolean isAwemeAppDataEmpty();

    boolean isContainsKeyWithLruEntries();

    boolean isDeepLinkHandlerActivity(Context context);

    boolean isLimitAdTrackingEnabled();

    boolean isMainPage(Context context);

    boolean isOnFollowPage(Activity activity);

    boolean isReplaceAwemeCache();

    boolean isUseJediAwemelistFragment();

    Fragment obtainFriendTabFragment();

    Fragment obtainMainPageFragment();

    boolean openAdOpenUrl(Context context, String str, boolean z);

    boolean openAdTestUrl(Context context, String str, int i);

    boolean openAdWebUrl(Context context, String str, String str2);

    void openDeepLinkActivity(Context context, String str);

    boolean openSystemBrowser(Context context, String str);

    void pendingDeepLinkLog(AbstractC89172b<Boolean, C89391z> bVar);

    void restartApp(Bundle bundle);

    boolean shouldChangeToHandle(String str);

    boolean shouldShowCommerceTagOnFeed(Aweme aweme, Integer num);

    boolean showAdPopUpWebPageWidget(Context context, AwemeRawAd awemeRawAd, Integer num, Integer num2, String str, String str2, Boolean bool, String str3, Aweme aweme, AnchorLynxModel anchorLynxModel);

    boolean startAdsAppActivity(Context context, String str, String str2);

    void startBulletActivity(Context context, String str, String str2, Bundle bundle);

    void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f);

    void trackAppsFlyerEvent(String str, String str2);

    boolean tryShowIllegalUsernameDialog(String str, Runnable runnable, Runnable runnable2);

    void updateIMUserFollowStatus(User user);
}
