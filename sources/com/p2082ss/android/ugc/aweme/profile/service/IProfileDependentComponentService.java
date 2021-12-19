package com.p2082ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.p2133d.C29854c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.captcha.AbstractC35417a;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3570d.AbstractC63507a;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89189s;

/* renamed from: com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService */
public interface IProfileDependentComponentService {
    static {
        Covode.recordClassIndex(75290);
    }

    AbstractC63869d adUtilsService();

    <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C29935e eVar, boolean z, String str3);

    <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3);

    AbstractC63870e bridgeService();

    RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, AbstractC49762o oVar);

    boolean canIM();

    AbstractC63872g favoritesMobUtilsService();

    AbstractC89172b<Boolean, C89391z> getNotificationManagerHandleSystemCamera();

    AbstractC89189s<Activity, Fragment, Integer, String, String, C89391z> getStartCameraActivity();

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5);

    void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5);

    String hexDigest(String str);

    boolean isDetailActivity(Activity activity);

    boolean isEnableSettingDiskManager();

    boolean isUserProfileActivity(Activity activity);

    void logShowProfileDiskManagerGuideView();

    AbstractC63507a mainAnimViewModel(ActivityC0945e eVar);

    AbstractC88979t<Boolean> needShowDiskManagerGuideView();

    AbstractC24641d newLiveBlurProcessor(int i, float f, C29854c.AbstractC29855a aVar);

    AbstractC58608c newLivePlayHelper(Runnable runnable, AbstractC58607b bVar);

    boolean onAntiCrawlerEvent(String str);

    AbstractC88403ab<BaseResponse> setPrivateSettingItem(String str, int i);

    boolean shouldDoCaptcha(Exception exc);

    boolean shouldUseRecyclerPartialUpdate();

    void showCaptchaDialog(AbstractC0952i iVar, C34485a aVar, AbstractC35417a aVar2);

    void startDiskManagerActivity(Context context);

    void startDownloadControlSettingActivity(Activity activity, int i);

    void startHeaderDetailActivity(Activity activity, Bundle bundle);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2);

    void startHeaderDetailActivity(Activity activity, View view, String str, User user);

    void watchFromProfile(Context context, User user, boolean z, AbstractC63854r rVar);

    void watchLiveMob(Context context, User user, String str, String str2);
}
