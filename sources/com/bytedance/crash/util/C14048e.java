package com.bytedance.crash.util;

import android.os.Build;
import android.os.Debug;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.crash.util.e */
public final class C14048e {

    /* renamed from: a */
    static final C14049a f34226a = new C14050b((byte) 0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.util.e$a */
    public static class C14049a {
        static {
            Covode.recordClassIndex(16116);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo22585a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo22586b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo22587c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        private C14049a() {
        }

        /* synthetic */ C14049a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.crash.util.e$b */
    static class C14050b extends C14049a {
        static {
            Covode.recordClassIndex(16117);
        }

        private C14050b() {
            super((byte) 0);
        }

        /* synthetic */ C14050b(byte b) {
            this();
        }

        @Override // com.bytedance.crash.util.C14048e.C14049a
        /* renamed from: a */
        public final int mo22585a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.bytedance.crash.util.C14048e.C14049a
        /* renamed from: b */
        public final int mo22586b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.bytedance.crash.util.C14048e.C14049a
        /* renamed from: c */
        public final int mo22587c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        Covode.recordClassIndex(16115);
        int i = Build.VERSION.SDK_INT;
    }
}
