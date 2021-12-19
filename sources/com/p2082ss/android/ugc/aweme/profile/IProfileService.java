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

/* renamed from: com.ss.android.ugc.aweme.profile.IProfileService */
public interface IProfileService {
    static {
        Covode.recordClassIndex(74626);
    }

    /* renamed from: a */
    int mo101949a(User user);

    /* renamed from: a */
    AbstractC34895bp mo101950a(Activity activity);

    /* renamed from: a */
    AbstractC35329by mo101951a(Context context);

    /* renamed from: a */
    String mo101952a();

    /* renamed from: a */
    String mo101953a(Aweme aweme, C38214ac acVar);

    /* renamed from: a */
    String mo101954a(boolean z);

    /* renamed from: a */
    void mo101955a(Activity activity, String str, String str2);

    /* renamed from: a */
    void mo101956a(Handler handler);

    /* renamed from: a */
    void mo101957a(AbstractC0952i iVar, C63511a aVar, String str);

    /* renamed from: a */
    void mo101958a(Aweme aweme, Integer num, int i, String str);

    /* renamed from: a */
    void mo101959a(String str, String str2);

    /* renamed from: a */
    void mo101960a(String str, String str2, String str3, int i, boolean z, View view, AbstractC63755f fVar);

    /* renamed from: b */
    String mo101961b();

    /* renamed from: b */
    void mo101962b(AbstractC0952i iVar, C63511a aVar, String str);

    /* renamed from: b */
    boolean mo101963b(Context context);

    /* renamed from: c */
    C33931ar mo101964c(Context context);

    /* renamed from: c */
    boolean mo101965c();

    AbstractC39100a<Aweme, ?> createAwemeModel();

    /* renamed from: d */
    AbstractC63853q<?, ?> mo101966d();

    /* renamed from: e */
    Fragment mo101967e();

    /* renamed from: f */
    void mo101968f();

    int getMessageProfile();

    Object getPushSettingCallback();

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2);

    void mobRefreshInProfileAweme(AbstractC39100a<?, ?> aVar, List<? extends Aweme> list);

    boolean needShowCompleteProfileGuideBar();

    boolean needShowSafeInfoNotice();

    AbstractC64005b newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2);

    AbstractC63859w newUserPresenter();

    Fragment obtainMyProfileFragment();

    Fragment obtainUserProfileFragment();

    void preloadProfile(ActivityC0945e eVar, String str);

    void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i);

    User queryUser(String str, boolean z, String str2);

    boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener);

    void updateProfilePermission(boolean z);

    void updateUserInfo(Fragment fragment, Aweme aweme);

    String userUrl(String str, String str2, String str3, int i);
}
