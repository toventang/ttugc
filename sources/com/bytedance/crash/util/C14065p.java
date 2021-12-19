package com.bytedance.crash.util;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.crash.util.p */
public final class C14065p {

    /* renamed from: a */
    static final C14066a f34247a = new C14067b((byte) 0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.util.p$a */
    public static class C14066a {
        static {
            Covode.recordClassIndex(16133);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo22593a(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }

        private C14066a() {
        }

        /* synthetic */ C14066a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.crash.util.p$b */
    static class C14067b extends C14066a {
        static {
            Covode.recordClassIndex(16134);
        }

        private C14067b() {
            super((byte) 0);
        }

        /* synthetic */ C14067b(byte b) {
            this();
        }

        @Override // com.bytedance.crash.util.C14065p.C14066a
        /* renamed from: a */
        public final long mo22593a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        Covode.recordClassIndex(16132);
        int i = Build.VERSION.SDK_INT;
    }
}
