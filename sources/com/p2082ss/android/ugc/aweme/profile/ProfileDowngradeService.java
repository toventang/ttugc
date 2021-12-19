package com.p2082ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34895bp;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
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
import p4600h.C89377o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ProfileDowngradeService */
public final class ProfileDowngradeService implements IProfileService {
    static {
        Covode.recordClassIndex(74627);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final int mo101949a(User user) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101952a() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101954a(boolean z) {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101955a(Activity activity, String str, String str2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101960a(String str, String str2, String str3, int i, boolean z, View view, AbstractC63755f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final String mo101961b() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final void mo101962b(AbstractC0952i iVar, C63511a aVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final boolean mo101963b(Context context) {
        C89219l.m154721d(context, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: c */
    public final boolean mo101965c() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final int getMessageProfile() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void mobRefreshInProfileAweme(AbstractC39100a<?, ?> aVar, List<? extends Aweme> list) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowCompleteProfileGuideBar() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowSafeInfoNotice() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainMyProfileFragment() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainUserProfileFragment() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfile(ActivityC0945e eVar, String str) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i) {
        C89219l.m154721d(handler, "");
        C89219l.m154721d(str3, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        C89219l.m154721d(context, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePermission(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final void updateUserInfo(Fragment fragment, Aweme aweme) {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ProfileDowngradeService$a */
    public static final class C63342a implements AbstractC34895bp {
        static {
            Covode.recordClassIndex(74628);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34895bp
        /* renamed from: a */
        public final void mo60673a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34895bp
        /* renamed from: b */
        public final void mo60675b() {
        }

        C63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34895bp
        /* renamed from: a */
        public final void mo60674a(Intent intent) {
            C89219l.m154721d(intent, "");
            C89219l.m154721d(intent, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ProfileDowngradeService$b */
    public static final class C63343b implements AbstractC35329by {
        static {
            Covode.recordClassIndex(74629);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
        /* renamed from: Y_ */
        public final String mo62207Y_() {
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
        /* renamed from: a */
        public final int mo57291a() {
            return -2;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
        /* renamed from: a */
        public final View mo62208a(AbstractC35331bz bzVar) {
            C89219l.m154721d(bzVar, "");
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
        /* renamed from: d */
        public final String mo62209d() {
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
        /* renamed from: h */
        public final void mo57292h() {
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
        /* renamed from: i */
        public final void mo57293i() {
        }

        C63343b() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC39100a<Aweme, ?> createAwemeModel() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: d */
    public final /* synthetic */ AbstractC63853q mo101966d() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: e */
    public final /* synthetic */ Fragment mo101967e() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: f */
    public final void mo101968f() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final Object getPushSettingCallback() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC63859w newUserPresenter() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final AbstractC34895bp mo101950a(Activity activity) {
        C89219l.m154721d(activity, "");
        return new C63342a();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final AbstractC35329by mo101951a(Context context) {
        C89219l.m154721d(context, "");
        return new C63343b();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: c */
    public final C33931ar mo101964c(Context context) {
        C89219l.m154721d(context, "");
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101956a(Handler handler) {
        C89219l.m154721d(handler, "");
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101953a(Aweme aweme, C38214ac acVar) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(acVar, "");
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101959a(String str, String str2) {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final User queryUser(String str, boolean z, String str2) {
        C89219l.m154721d(str, "");
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101957a(AbstractC0952i iVar, C63511a aVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final String userUrl(String str, String str2, String str3, int i) {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101958a(Aweme aweme, Integer num, int i, String str) {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC64005b newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }
}
