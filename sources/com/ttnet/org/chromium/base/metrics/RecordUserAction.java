package com.ttnet.org.chromium.base.metrics;

import com.bytedance.covode.number.Covode;

public class RecordUserAction {

    /* renamed from: a */
    static final /* synthetic */ boolean f198396a = true;

    public interface UserActionCallback {
        static {
            Covode.recordClassIndex(103411);
        }

        void onActionRecorded(String str);
    }

    private static native long nativeAddActionCallbackForTesting(UserActionCallback userActionCallback);

    public static native void nativeRecordUserAction(String str);

    private static native void nativeRemoveActionCallbackForTesting(long j);

    static {
        Covode.recordClassIndex(103410);
    }
}
