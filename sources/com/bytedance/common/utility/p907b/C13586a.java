package com.bytedance.common.utility.p907b;

import android.os.AsyncTask;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.utility.b.a */
public final class C13586a {

    /* renamed from: a */
    public static final C13587a f33031a = new C13588b((byte) 0);

    /* renamed from: com.bytedance.common.utility.b.a$a */
    public static class C13587a {
        static {
            Covode.recordClassIndex(15612);
        }

        private C13587a() {
        }

        /* synthetic */ C13587a(byte b) {
            this();
        }

        /* renamed from: a */
        public <T> void mo21852a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.bytedance.common.utility.b.a$b */
    static class C13588b extends C13587a {
        static {
            Covode.recordClassIndex(15613);
        }

        private C13588b() {
            super((byte) 0);
        }

        /* synthetic */ C13588b(byte b) {
            this();
        }

        @Override // com.bytedance.common.utility.p907b.C13586a.C13587a
        /* renamed from: a */
        public final <T> void mo21852a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(C13590c.f33035a, tArr);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(15611);
        int i = Build.VERSION.SDK_INT;
    }
}
