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
import com.p2082ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.service.h */
public final class C63873h implements IProfileDependentComponentService {

    /* renamed from: a */
    public static final C63873h f144797a = new C63873h();

    /* renamed from: b */
    private final /* synthetic */ IProfileDependentComponentService f144798b;

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC63869d adUtilsService() {
        return this.f144798b.adUtilsService();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C29935e eVar, boolean z, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        C89219l.m154721d(eVar, "");
        return (T) this.f144798b.apiExecuteGetJSONObject(i, str, cls, str2, eVar, z, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        return (T) this.f144798b.apiExecuteGetJSONObject(str, cls, str2, z, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC63870e bridgeService() {
        return this.f144798b.bridgeService();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, AbstractC49762o oVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(oVar, "");
        return this.f144798b.buildBaseRecyclerView(recyclerView, oVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean canIM() {
        return this.f144798b.canIM();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC63872g favoritesMobUtilsService() {
        return this.f144798b.favoritesMobUtilsService();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC89172b<Boolean, C89391z> getNotificationManagerHandleSystemCamera() {
        return this.f144798b.getNotificationManagerHandleSystemCamera();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC89189s<Activity, Fragment, Integer, String, String, C89391z> getStartCameraActivity() {
        return this.f144798b.getStartCameraActivity();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        this.f144798b.gotoCropActivity(activity, str, z, f, i, i2, i3, i4, i5);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        this.f144798b.gotoCropActivity(fragment, str, z, f, i, i2, i3, i4, i5);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final String hexDigest(String str) {
        C89219l.m154721d(str, "");
        return this.f144798b.hexDigest(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isDetailActivity(Activity activity) {
        return this.f144798b.isDetailActivity(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isEnableSettingDiskManager() {
        return this.f144798b.isEnableSettingDiskManager();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isUserProfileActivity(Activity activity) {
        return this.f144798b.isUserProfileActivity(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void logShowProfileDiskManagerGuideView() {
        this.f144798b.logShowProfileDiskManagerGuideView();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC63507a mainAnimViewModel(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return this.f144798b.mainAnimViewModel(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC88979t<Boolean> needShowDiskManagerGuideView() {
        return this.f144798b.needShowDiskManagerGuideView();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC24641d newLiveBlurProcessor(int i, float f, C29854c.AbstractC29855a aVar) {
        return this.f144798b.newLiveBlurProcessor(i, f, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC58608c newLivePlayHelper(Runnable runnable, AbstractC58607b bVar) {
        C89219l.m154721d(runnable, "");
        C89219l.m154721d(bVar, "");
        return this.f144798b.newLivePlayHelper(runnable, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean onAntiCrawlerEvent(String str) {
        return this.f144798b.onAntiCrawlerEvent(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC88403ab<BaseResponse> setPrivateSettingItem(String str, int i) {
        C89219l.m154721d(str, "");
        return this.f144798b.setPrivateSettingItem(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldDoCaptcha(Exception exc) {
        return this.f144798b.shouldDoCaptcha(exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.f144798b.shouldUseRecyclerPartialUpdate();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void showCaptchaDialog(AbstractC0952i iVar, C34485a aVar, AbstractC35417a aVar2) {
        this.f144798b.showCaptchaDialog(iVar, aVar, aVar2);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDiskManagerActivity(Context context) {
        C89219l.m154721d(context, "");
        this.f144798b.startDiskManagerActivity(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDownloadControlSettingActivity(Activity activity, int i) {
        C89219l.m154721d(activity, "");
        this.f144798b.startDownloadControlSettingActivity(activity, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        this.f144798b.startHeaderDetailActivity(activity, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        C89219l.m154721d(user, "");
        this.f144798b.startHeaderDetailActivity(activity, view, user, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        C89219l.m154721d(user, "");
        this.f144798b.startHeaderDetailActivity(activity, view, user, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(user, "");
        this.f144798b.startHeaderDetailActivity(activity, view, str, user);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchFromProfile(Context context, User user, boolean z, AbstractC63854r rVar) {
        this.f144798b.watchFromProfile(context, user, z, rVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchLiveMob(Context context, User user, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f144798b.watchLiveMob(context, user, str, str2);
    }

    static {
        Covode.recordClassIndex(75298);
    }

    private C63873h() {
        IProfileDependentComponentService createIProfileDependentComponentServicebyMonsterPlugin = ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false);
        C89219l.m154716b(createIProfileDependentComponentServicebyMonsterPlugin, "");
        this.f144798b = createIProfileDependentComponentServicebyMonsterPlugin;
    }
}
