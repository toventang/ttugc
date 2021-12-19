package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.ActivityC17733a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.p1625a.p1638c.p1640b.C22352a;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.p2133d.C29854c;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.captcha.AbstractC35417a;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.experiment.p2914a.C46680a;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import com.p2082ss.android.ugc.aweme.newfollow.p3504a.C61494a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33920b;
import com.p2082ss.android.ugc.aweme.p2690cr.C40333c;
import com.p2082ss.android.ugc.aweme.p3070im.C53588a;
import com.p2082ss.android.ugc.aweme.p3070im.C53603g;
import com.p2082ss.android.ugc.aweme.pendant.C62766b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3570d.AbstractC63507a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.CropActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileFragment;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63869d;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63871f;
import com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService;
import com.p2082ss.android.ugc.aweme.qrcode.C66414j;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80472gc;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89279e;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl */
public final class ProfileDependentComponentImpl implements IProfileDependentComponentService {
    static {
        Covode.recordClassIndex(79712);
    }

    public final void activeTT(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldDoCaptcha(Exception exc) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void showCaptchaDialog(AbstractC0952i iVar, C34485a aVar, AbstractC35417a aVar2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC89189s<Activity, Fragment, Integer, String, String, C89391z> getStartCameraActivity() {
        return ProfileDependentComponentImpl$startCameraActivity$1.INSTANCE;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC63869d adUtilsService() {
        return new AdUtilsServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean canIM() {
        return C53588a.m98813a();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isEnableSettingDiskManager() {
        return C46680a.m90086a();
    }

    public final boolean platformInfoManagerHasPlatformBinded() {
        return C30223b.f72086a.mo53667a();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final BridgeServiceImpl bridgeService() {
        return new BridgeServiceImpl();
    }

    public final AbstractC63871f contactUtilService() {
        return IRecommendUsersServiceImpl.m118438j().mo105663i();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final FavoritesMobUtilsServiceImpl favoritesMobUtilsService() {
        return new FavoritesMobUtilsServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC89279e<C89391z> getNotificationManagerHandleSystemCamera() {
        return new C67875xe94d92ae(C53603g.C53604a.m98850a());
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void logShowProfileDiskManagerGuideView() {
        C40333c.m81488a().storeBoolean("has_show_disk_manager_guide", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldUseRecyclerPartialUpdate() {
        return SettingsRequestServiceImpl.m65417i().mo57285c();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC88979t<Boolean> needShowDiskManagerGuideView() {
        AbstractC88979t<Boolean> a = AbstractC88979t.m154294a(ProfileDependentComponentImpl$needShowDiskManagerGuideView$1.INSTANCE).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isDetailActivity(Activity activity) {
        return activity instanceof DetailActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final String hexDigest(String str) {
        C89219l.m154721d(str, "");
        return C22352a.m42068a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC63507a mainAnimViewModel(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return new ProfileDependentComponentImpl$mainAnimViewModel$1(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDiskManagerActivity(Context context) {
        C89219l.m154721d(context, "");
        SmartRouter.buildRoute(context, "//setting/diskmanager").open();
    }

    public static IProfileDependentComponentService createIProfileDependentComponentServicebyMonsterPlugin(boolean z) {
        Object a = C81908b.m141854a(IProfileDependentComponentService.class, z);
        if (a != null) {
            return (IProfileDependentComponentService) a;
        }
        return new ProfileDependentComponentImpl();
    }

    public final void clearNinePatchBubbleState(Context context) {
        if (context != null) {
            C62766b bVar = C62766b.C62768b.f142302a;
            C89219l.m154721d(context, "");
            bVar.mo100734a().storeBoolean(C62766b.f142291f, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isUserProfileActivity(Activity activity) {
        if (!(activity instanceof ActivityC17733a) || !(((ActivityC17733a) activity).getRootFragment() instanceof UserProfileFragment)) {
            return activity instanceof UserProfileActivity;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean onAntiCrawlerEvent(String str) {
        if (str == null) {
            return false;
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/post/?", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/favorite/?", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/listcollection/?", false)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, AbstractC49762o oVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(oVar, "");
        return C80472gc.m139484a(recyclerView, oVar, 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC58608c newLivePlayHelper(Runnable runnable, AbstractC58607b bVar) {
        C89219l.m154721d(runnable, "");
        C89219l.m154721d(bVar, "");
        return new ProfileDependentComponentImpl$newLivePlayHelper$1(runnable, bVar);
    }

    public final void openFestivalPageWithSchema(Context context, String str) {
        C89219l.m154721d(str, "");
        C33920b.m69459a(context, str);
    }

    public final void startAdsAppActivity(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C33722d.C33723a.m69045a(context, str, "", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        if (bundle == null) {
            C89219l.m154715b();
        }
        HeaderDetailActivity.m115631a(activity, bundle);
    }

    public final void startQRCodeActivityV2(Context context, C66414j jVar) {
        SmartRouter.buildRoute(context, "//qrcodev2").withParam("extra_params", jVar).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDownloadControlSettingActivity(Activity activity, int i) {
        C89219l.m154721d(activity, "");
        SmartRouter.buildRoute(activity, "//setting/download").withParam("currentSettingsValue", i).withParam("enter_from", "personal_homepage").open();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC88403ab<BaseResponse> setPrivateSettingItem(String str, int i) {
        C89219l.m154721d(str, "");
        AbstractC88403ab<BaseResponse> a = AbstractC88403ab.m153596a((AbstractC88407af) new ProfileDependentComponentImpl$setPrivateSettingItem$1(str, i)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final C61494a newLiveBlurProcessor(int i, float f, C29854c.AbstractC29855a aVar) {
        return new C61494a(i, f, new ProfileDependentComponentImpl$newLiveBlurProcessor$1(aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchFromProfile(Context context, User user, boolean z, AbstractC63854r rVar) {
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95835i().mo105594a(context, user, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchLiveMob(Context context, User user, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28293J = str;
        enterRoomConfig.f28233c.f28295L = str2;
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95835i().mo105593a(context, user, enterRoomConfig);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        boolean z2;
        C89219l.m154721d(user, "");
        UrlModel c = C80580in.m139686c(user);
        if (c != null && C34717d.m70910b(c.getUrlList())) {
            int size = c.getUrlList().size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = c.getUrlList().get(i);
            }
            if (user == null || user.getAvatarVideoUri() != c) {
                z2 = false;
            } else {
                z2 = true;
            }
            HeaderDetailActivity.m115632a(activity, view, 1.0f, user, z, z2, strArr);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(user, "");
        HeaderDetailActivity.m115631a(activity, new C80222ap().mo123647a("extra_zoom_info", ZoomAnimationUtils.m138997a(view)).mo123650a("enable_edit_img", false).mo123651a("uri", TextUtils.isEmpty(str) ? C80580in.m139682a(C80580in.m139688d(user)) : new String[]{str}).mo123650a("enable_download_img", true).mo123648a("share_info", user).f179700a);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        return (T) Api.m68816a(str, cls, str2, (C29935e) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        C89219l.m154721d(user, "");
        UrlModel c = C80580in.m139686c(user);
        if (c != null && C34717d.m70910b(c.getUrlList())) {
            int size = c.getUrlList().size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = c.getUrlList().get(i);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.m138997a(view));
            bundle.putStringArray("uri", strArr);
            bundle.putBoolean("enable_edit_img", z2);
            bundle.putFloat("wh_ratio", 1.0f);
            bundle.putBoolean("enable_download_img", z);
            bundle.putBoolean("handle_with_video_avatar", false);
            if (user != null) {
                bundle.putSerializable("share_info", user);
            }
            HeaderDetailActivity.m115631a(activity, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C29935e eVar, boolean z, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        C89219l.m154721d(eVar, "");
        return (T) Api.m68816a(str, cls, str2, eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        CropActivity.C63911a.m115615a(activity, str, z, f, i, i2, i3, i4, i5, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        SmartRouter.buildFragmentRoute(fragment, "//profile/crop").withParam("original_url", str).withParam("is_oval", z).withParam("rect_ratio", f).withParam("rect_margin", i).withParam("extra_min_width", i3).withParam("extra_min_height", i4).withParam("extra_source_type", i5).open(i2);
    }
}
