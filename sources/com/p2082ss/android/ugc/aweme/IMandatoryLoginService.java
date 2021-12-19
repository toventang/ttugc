package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.IMandatoryLoginService */
public interface IMandatoryLoginService {
    static {
        Covode.recordClassIndex(37953);
    }

    boolean getHasRequestComplianceApi();

    Bundle getLoginActivityBundle();

    void setHasRequestComplianceApi(boolean z);

    boolean shouldShowForcedLogin();

    boolean shouldShowLoginTabFirst();
}
