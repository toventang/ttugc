package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;

/* renamed from: com.ss.android.ugc.effectmanager.IFetchResourceListenerKt */
public final class IFetchResourceListenerKt {
    static {
        Covode.recordClassIndex(95371);
    }

    public static final AbstractC86796e<Long> toKNListener(IFetchResourceListener iFetchResourceListener) {
        if (iFetchResourceListener == null) {
            return null;
        }
        return new IFetchResourceListenerKt$toKNListener$1(iFetchResourceListener);
    }
}
