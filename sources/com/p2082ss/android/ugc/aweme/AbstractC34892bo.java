package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.bean.C31597d;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bo */
public interface AbstractC34892bo {

    /* renamed from: com.ss.android.ugc.aweme.bo$a */
    public interface AbstractC34893a {
        static {
            Covode.recordClassIndex(41904);
        }

        /* renamed from: a */
        void mo61796a();
    }

    static {
        Covode.recordClassIndex(41903);
    }

    List<C31597d> getAllSupportedLoginPlatform();

    String getLoginMobEnterMethod();

    Class<? extends Activity> getPushLoginActivityClass();

    boolean isEnableMultiAccountLogin();

    void loginByPlatform(IAccountService.C31273c cVar, C31597d dVar);

    void logout(String str, String str2);

    void logout(String str, String str2, AbstractC34893a aVar);

    void openCountryListActivity(Activity activity, AbstractC34292ax axVar);

    void saveDTicket(String str, String str2);

    void showLoginAndRegisterView(IAccountService.C31273c cVar);

    void showLoginView(IAccountService.C31273c cVar);

    void switchAccount(C80053c cVar, Bundle bundle, AbstractC35326bx bxVar);

    boolean toRecoverDeletedAccount(String str);

    void uploadAccountNum(boolean z);
}
