package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;

public interface IReportADLogResultCallback {

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback$a */
    public static final class C18463a {
        static {
            Covode.recordClassIndex(21153);
        }
    }

    static {
        Covode.recordClassIndex(21152);
    }

    void onFailure(int i, String str);

    void onSuccess(C18745b bVar, String str);
}
