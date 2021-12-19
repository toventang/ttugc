package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC35421cc;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.BaseVerificationService */
public class BaseVerificationService implements AbstractC33974au, AbstractC35421cc {
    static {
        Covode.recordClassIndex(79596);
    }

    public void checkUserVerifiedStatus(Activity activity, String str, Bundle bundle, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(activity, "");
    }

    public String getPhoneCountryCode() {
        return "";
    }

    public boolean isHighRiskPhone(String str) {
        return false;
    }

    public void notifyCheckUserComplete() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    public boolean shouldAlertHighRiskPhone() {
        return false;
    }

    public void verifyCredential(AbstractC35421cc.C35422a aVar) {
        C89219l.m154721d(aVar, "");
    }
}
