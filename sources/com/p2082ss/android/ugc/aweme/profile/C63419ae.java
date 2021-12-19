package com.p2082ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34895bp;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63853q;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63859w;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ae */
public final class C63419ae implements IProfileService {

    /* renamed from: a */
    public static final C63419ae f143971a = new C63419ae();

    /* renamed from: b */
    private final /* synthetic */ IProfileService f143972b;

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final int mo101949a(User user) {
        return this.f143972b.mo101949a(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final AbstractC34895bp mo101950a(Activity activity) {
        C89219l.m154721d(activity, "");
        return this.f143972b.mo101950a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final AbstractC35329by mo101951a(Context context) {
        C89219l.m154721d(context, "");
        return this.f143972b.mo101951a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101952a() {
        return this.f143972b.mo101952a();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101953a(Aweme aweme, C38214ac acVar) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(acVar, "");
        return this.f143972b.mo101953a(aweme, acVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101954a(boolean z) {
        return this.f143972b.mo101954a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101955a(Activity activity, String str, String str2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f143972b.mo101955a(activity, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101956a(Handler handler) {
        C89219l.m154721d(handler, "");
        this.f143972b.mo101956a(handler);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101957a(AbstractC0952i iVar, C63511a aVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        this.f143972b.mo101957a(iVar, aVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101958a(Aweme aweme, Integer num, int i, String str) {
        this.f143972b.mo101958a(aweme, num, i, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101959a(String str, String str2) {
        this.f143972b.mo101959a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101960a(String str, String str2, String str3, int i, boolean z, View view, AbstractC63755f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(fVar, "");
        this.f143972b.mo101960a(str, str2, str3, i, z, view, fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final String mo101961b() {
        return this.f143972b.mo101961b();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final void mo101962b(AbstractC0952i iVar, C63511a aVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        this.f143972b.mo101962b(iVar, aVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final boolean mo101963b(Context context) {
        C89219l.m154721d(context, "");
        return this.f143972b.mo101963b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: c */
    public final C33931ar mo101964c(Context context) {
        C89219l.m154721d(context, "");
        return this.f143972b.mo101964c(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: c */
    public final boolean mo101965c() {
        return this.f143972b.mo101965c();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC39100a<Aweme, ?> createAwemeModel() {
        return this.f143972b.createAwemeModel();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: d */
    public final AbstractC63853q<?, ?> mo101966d() {
        return this.f143972b.mo101966d();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: e */
    public final Fragment mo101967e() {
        return this.f143972b.mo101967e();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: f */
    public final void mo101968f() {
        this.f143972b.mo101968f();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final int getMessageProfile() {
        return this.f143972b.getMessageProfile();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final Object getPushSettingCallback() {
        return this.f143972b.getPushSettingCallback();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        this.f143972b.gotoCropActivity(activity, str, z, f, i, i2, i3, i4, i5, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void mobRefreshInProfileAweme(AbstractC39100a<?, ?> aVar, List<? extends Aweme> list) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
        this.f143972b.mobRefreshInProfileAweme(aVar, list);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowCompleteProfileGuideBar() {
        return this.f143972b.needShowCompleteProfileGuideBar();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowSafeInfoNotice() {
        return this.f143972b.needShowSafeInfoNotice();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC64005b newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        return this.f143972b.newBasicAwemeListFragment(i, i2, str, str2, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC63859w newUserPresenter() {
        return this.f143972b.newUserPresenter();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainMyProfileFragment() {
        return this.f143972b.obtainMyProfileFragment();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainUserProfileFragment() {
        return this.f143972b.obtainUserProfileFragment();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfile(ActivityC0945e eVar, String str) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        this.f143972b.preloadProfile(eVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i) {
        C89219l.m154721d(handler, "");
        C89219l.m154721d(str3, "");
        this.f143972b.queryProfileResponseWithDoubleId(handler, str, str2, str3, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final User queryUser(String str, boolean z, String str2) {
        C89219l.m154721d(str, "");
        return this.f143972b.queryUser(str, z, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        C89219l.m154721d(context, "");
        return this.f143972b.showRemindUserCompleteProfileDialog(context, str, str2, onDismissListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePermission(boolean z) {
        this.f143972b.updateProfilePermission(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void updateUserInfo(Fragment fragment, Aweme aweme) {
        this.f143972b.updateUserInfo(fragment, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final String userUrl(String str, String str2, String str3, int i) {
        return this.f143972b.userUrl(str, str2, str3, i);
    }

    static {
        Covode.recordClassIndex(74710);
    }

    private C63419ae() {
        IProfileService g = ProfileServiceImpl.m114884g();
        C89219l.m154716b(g, "");
        this.f143972b = g;
    }
}
