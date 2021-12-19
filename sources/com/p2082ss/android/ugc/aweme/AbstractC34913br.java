package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* renamed from: com.ss.android.ugc.aweme.br */
public interface AbstractC34913br {
    static {
        Covode.recordClassIndex(41924);
    }

    void changePassword(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void setPassword(Activity activity, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.AbstractC31277g gVar);

    void verifyPassword(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar);
}
