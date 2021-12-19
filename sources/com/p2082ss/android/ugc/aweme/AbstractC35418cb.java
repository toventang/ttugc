package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.cb */
public interface AbstractC35418cb {

    /* renamed from: com.ss.android.ugc.aweme.cb$a */
    public enum EnumC35419a {
        SMS,
        EMAIL,
        PASSWORD;

        static {
            Covode.recordClassIndex(42595);
        }
    }

    static {
        Covode.recordClassIndex(42594);
    }

    C1731i<Boolean> getSafeInfo();

    int getTwoStepVerificationStatusFromLocal();

    C1731i<Boolean> getTwoStepVerificationStatusFromNetwork();

    void handlePushChallengeInfo(String str, String str2);

    void onOpenPushChallengePage(String str);

    void openTwoStepVerificationManageActivity(Activity activity, String str);
}
