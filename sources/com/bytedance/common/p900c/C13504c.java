package com.bytedance.common.p900c;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.c.c */
public final class C13504c {

    /* renamed from: a */
    public static C13505a f32888a = new C13506b((byte) 0);

    /* renamed from: com.bytedance.common.c.c$a */
    public static class C13505a {
        static {
            Covode.recordClassIndex(15513);
        }

        /* renamed from: a */
        public long mo21777a(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }

        private C13505a() {
        }

        /* synthetic */ C13505a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.common.c.c$b */
    static class C13506b extends C13505a {
        static {
            Covode.recordClassIndex(15514);
        }

        private C13506b() {
            super((byte) 0);
        }

        /* synthetic */ C13506b(byte b) {
            this();
        }

        @Override // com.bytedance.common.p900c.C13504c.C13505a
        /* renamed from: a */
        public final long mo21777a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        Covode.recordClassIndex(15512);
        int i = Build.VERSION.SDK_INT;
    }
}
