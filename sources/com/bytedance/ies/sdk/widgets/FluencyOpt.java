package com.bytedance.ies.sdk.widgets;

import android.view.View;
import com.bytedance.covode.number.Covode;

public interface FluencyOpt {
    static {
        Covode.recordClassIndex(20429);
    }

    View getPreloadLayout(int i);

    void post(Runnable runnable, Object obj);

    void removeMessages(Object obj);

    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(20430);
        }

        public static /* synthetic */ void post$default(FluencyOpt fluencyOpt, Runnable runnable, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 2) != 0) {
                    obj = null;
                }
                fluencyOpt.post(runnable, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
    }
}
