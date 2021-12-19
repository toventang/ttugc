package com.bytedance.shadowhook;

import com.bytedance.covode.number.Covode;

public class ShadowHook {

    /* renamed from: a */
    public static final int f53675a = EnumC22717a.SHARED.value;

    /* renamed from: b */
    private static int f53676b = 2;

    private static native int nativeGetInitErrno();

    private static native String nativeGetRecords();

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebuggable(boolean z);

    private static native String nativeToErrmsg(int i);

    static {
        Covode.recordClassIndex(26547);
    }

    /* renamed from: com.bytedance.shadowhook.ShadowHook$a */
    public enum EnumC22717a {
        SHARED(0),
        UNIQUE(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(26548);
        }

        private EnumC22717a(int i) {
            this.value = i;
        }
    }
}
