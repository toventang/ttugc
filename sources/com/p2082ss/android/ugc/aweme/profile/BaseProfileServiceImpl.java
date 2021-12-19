package com.p2082ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.profile.C63416ac;
import com.p2082ss.android.ugc.aweme.profile.api.C63429c;
import com.p2082ss.android.ugc.aweme.profile.api.C63431e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3570d.C63508b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63973ae;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.CropActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63828ae;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63833b;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl */
public abstract class BaseProfileServiceImpl implements IProfileService {
    static {
        Covode.recordClassIndex(74625);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public int getMessageProfile() {
        return 0;
    }

    public boolean needShowCompleteProfileGuide() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        C89219l.m154721d(context, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public Object getPushSettingCallback() {
        return C63422ah.f143974a;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public AbstractC39100a<Aweme, ?> createAwemeModel() {
        return new C63833b();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public boolean needShowSafeInfoNotice() {
        return C63867b.f144793a.needShowSafeInfoNotice();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public C63828ae newUserPresenter() {
        return new C63828ae();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public Fragment obtainMyProfileFragment() {
        if (MSAdaptionService.m97895c().mo89372a(C17867d.m33078a())) {
            return new C64208b();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public boolean needShowCompleteProfileGuideBar() {
        boolean z;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        if (curUser.getProfileCompletion() <= 0.0f || curUser.getProfileCompletion() > 0.7f) {
            z = false;
        } else {
            z = true;
        }
        if (!needShowCompleteProfileGuide() || (!z && !curUser.nicknameUpdateReminder() && !curUser.avatarUpdateReminder())) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public Fragment obtainUserProfileFragment() {
        if (!MSAdaptionService.m97895c().mo89372a(C17867d.m33078a())) {
            return null;
        }
        C64250i iVar = new C64250i();
        if (MSAdaptionService.m97895c().mo89377c(C17867d.m33078a())) {
            iVar.mo103753a("homepage_hot");
        }
        return iVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public void updateProfilePermission(boolean z) {
        MyProfileGuideViewModel myProfileGuideViewModel;
        WeakReference<MyProfileGuideViewModel> weakReference = C63416ac.f143968b;
        if (!(weakReference == null || (myProfileGuideViewModel = weakReference.get()) == null)) {
            myProfileGuideViewModel.mo75829g(new C63416ac.C63417a(z));
        }
        C63416ac.f143967a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public void updateUserInfo(Fragment fragment, Aweme aweme) {
        if (MSAdaptionService.m97895c().mo89372a(C17867d.m33078a()) && (fragment instanceof AbstractC64151d)) {
            ((AbstractC64151d) fragment).mo103757b(aweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public void mobRefreshInProfileAweme(AbstractC39100a<?, ?> aVar, List<? extends Aweme> list) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
        if (aVar instanceof C63833b) {
            C63833b bVar = (C63833b) aVar;
            bVar.setItems(new ArrayList(list));
            ((FeedItemList) bVar.mData).cursor = (long) list.size();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public void preloadProfile(ActivityC0945e eVar, String str) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        Aweme aweme = HomePageDataViewModel.C52942a.m97777a(eVar).f121741g;
        if (aweme != null && !aweme.getIsPreloadScroll() && TextUtils.equals(str, "page_profile")) {
            aweme.setIsPreloadScroll(true);
            C1731i.m5640b(new C63508b.CallableC63509a(aweme), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public User queryUser(String str, boolean z, String str2) {
        C89219l.m154721d(str, "");
        User a = C63429c.m115016a(str, z, str2);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public String userUrl(String str, String str2, String str3, int i) {
        String a = C63429c.m115018a(str, str2, i, true);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i) {
        C89219l.m154721d(handler, "");
        C89219l.m154721d(str3, "");
        C63431e.m115024a();
        C63431e.m115026a(handler, str, str2, str3, i, true);
    }

    public boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        if ((!C89219l.m154714a((Object) str2, (Object) "follow") && !C89219l.m154714a((Object) str2, (Object) "follow_guide")) || C63973ae.m115690b(user) >= 1000) {
            return false;
        }
        if (i == 1 || i == 2 || i == 4) {
            return showRemindUserCompleteProfileDialog(context, str, "follow_guide", null);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public AbstractC64005b newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        if (str2 == null) {
            str2 = "";
        }
        Bundle bundle = new Bundle();
        C64066c cVar = new C64066c();
        bundle.putInt(StringSet.type, i2);
        bundle.putString("uid", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_my_profile", z);
        bundle.putBoolean("is_scene_transition_enable", false);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("should_refresh_on_init_data", z2);
        cVar.setArguments(bundle);
        C89219l.m154716b(cVar, "");
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        CropActivity.C63911a.m115615a(activity, str, z, f, i, i2, i3, i4, i5, z2);
    }
}
