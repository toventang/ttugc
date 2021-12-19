package com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService */
public interface IFamilyPairingService {

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService$a */
    public enum EnumC39276a {
        UNLINK_LOCKED,
        PARENT,
        CHILD,
        NONE;

        static {
            Covode.recordClassIndex(46943);
        }
    }

    static {
        Covode.recordClassIndex(46942);
    }

    /* renamed from: a */
    EnumC39276a mo68649a();

    /* renamed from: a */
    void mo68650a(Activity activity);

    /* renamed from: a */
    boolean mo68651a(String str);

    /* renamed from: b */
    AbstractC36109j mo68652b();

    /* renamed from: b */
    void mo68653b(Activity activity);

    /* renamed from: c */
    AbstractC36109j mo68654c();

    /* renamed from: d */
    IInterceptor mo68655d();

    /* renamed from: e */
    boolean mo68656e();
}
