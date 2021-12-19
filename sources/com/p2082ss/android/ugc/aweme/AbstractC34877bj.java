package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.bj */
public interface AbstractC34877bj {

    /* renamed from: com.ss.android.ugc.aweme.bj$a */
    public interface AbstractC34878a {
        static {
            Covode.recordClassIndex(41887);
        }
    }

    static {
        Covode.recordClassIndex(41886);
    }

    void bindEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void bindMobile(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void bindMobile(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void changeEmail(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void changeUnverifiedEmail(Activity activity, String str, Bundle bundle);

    Intent getAuthorizeActivityStartIntent(Context context);

    boolean isPlatformBound(String str);

    void modifyMobile(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str);

    void unbindPhone(Activity activity, ArrayList<String> arrayList, String str);

    void verifyEmail(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar);
}
