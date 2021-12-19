package com.p2082ss.android.ugc.aweme.services.shoutout;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.shoutouts.C74428i;

/* renamed from: com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService */
public interface IShoutOutsService {
    static {
        Covode.recordClassIndex(79959);
    }

    int getAuthorCount();

    boolean getInFollowingTab();

    boolean getInMainTab();

    C74428i getShoutOutSettingsModel();

    boolean getUseShoutoutAuthor();

    boolean isShoutoutPostDialog(Object obj);

    void publishShoutOuts(ActivityC0945e eVar, Object obj);

    void setAuthorCount(int i);

    void setInFollowingTab(boolean z);

    void setInMainTab(boolean z);

    void setUseShoutoutAuthor(boolean z);

    void startDownLoadVideo(ActivityC0945e eVar, String str, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener);

    void startShoutoutsPublishActivity(Activity activity, Intent intent);

    void startShoutoutsPublishActivityFromDL(Activity activity, Uri uri);

    void startShoutoutsPublishActivityFromNative(Activity activity, C74418d dVar);

    void startShoutoutsPublishSyncActivity(Activity activity, String str, String str2, String str3);
}
