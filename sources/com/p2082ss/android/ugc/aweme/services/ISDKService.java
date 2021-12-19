package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.ISDKService */
public interface ISDKService {

    /* renamed from: com.ss.android.ugc.aweme.services.ISDKService$SplitCallback */
    public interface SplitCallback {

        /* renamed from: com.ss.android.ugc.aweme.services.ISDKService$SplitCallback$DefaultImpls */
        public static final class DefaultImpls {
            static {
                Covode.recordClassIndex(79641);
            }

            public static boolean checkIsCanceled(SplitCallback splitCallback) {
                return false;
            }
        }

        static {
            Covode.recordClassIndex(79640);
        }

        boolean checkIsCanceled();

        void onFail();

        void onSuccess(int i, int i2);
    }

    static {
        Covode.recordClassIndex(79639);
    }

    void split(Context context, int i, String str, String str2, String str3, String str4, SplitCallback splitCallback);
}
