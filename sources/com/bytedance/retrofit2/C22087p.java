package com.bytedance.retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.retrofit2.AbstractC22019c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p4640l.C89782m;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.p */
public class C22087p {

    /* renamed from: a */
    static final C22087p f52128a = m41473b();

    /* renamed from: b */
    static final boolean f52129b = m41474c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.p$b */
    public static class C22090b extends C22087p {
        static {
            Covode.recordClassIndex(25790);
        }

        /* renamed from: com.bytedance.retrofit2.p$b$a */
        static class ExecutorC22091a implements Executor {

            /* renamed from: a */
            private static Object f52131a;

            /* renamed from: b */
            private static Method f52132b;

            ExecutorC22091a() {
            }

            static {
                Covode.recordClassIndex(25791);
                try {
                    Class<?> cls = Class.forName("org.robovm.apple.foundation.NSOperationQueue");
                    f52131a = cls.getDeclaredMethod("getMainQueue", new Class[0]).invoke(null, new Object[0]);
                    f52132b = cls.getDeclaredMethod("addOperation", Runnable.class);
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            }

            public final void execute(Runnable runnable) {
                try {
                    Method method = f52132b;
                    Object obj = f52131a;
                    Object[] objArr = {runnable};
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_retrofit2_Platform$IOS$MainThreadExecutor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        Object obj2 = a.second;
                        return;
                    }
                    C15346a.m28242a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_bytedance_retrofit2_Platform$IOS$MainThreadExecutor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw cause;
                    } else if (cause instanceof Error) {
                        throw cause;
                    } else {
                        throw new RuntimeException(cause);
                    }
                }
            }
        }

        C22090b() {
        }

        @Override // com.bytedance.retrofit2.C22087p
        /* renamed from: a */
        public final Executor mo35877a() {
            return new ExecutorC22091a();
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.C22087p
        /* renamed from: a */
        public final AbstractC22019c.AbstractC22020a mo35876a(Executor executor) {
            return new C22050i(executor);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Executor mo35877a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.p$a */
    public static class C22088a extends C22087p {
        static {
            Covode.recordClassIndex(25788);
        }

        C22088a() {
        }

        /* renamed from: com.bytedance.retrofit2.p$a$a */
        static class ExecutorC22089a implements Executor {

            /* renamed from: a */
            private final Handler f52130a = new Handler(Looper.getMainLooper());

            static {
                Covode.recordClassIndex(25789);
            }

            ExecutorC22089a() {
            }

            public final void execute(Runnable runnable) {
                this.f52130a.post(runnable);
            }
        }

        @Override // com.bytedance.retrofit2.C22087p
        /* renamed from: a */
        public final Executor mo35877a() {
            return new ExecutorC22089a();
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.C22087p
        /* renamed from: a */
        public final AbstractC22019c.AbstractC22020a mo35876a(Executor executor) {
            return new C22050i(executor);
        }
    }

    C22087p() {
    }

    /* renamed from: c */
    private static boolean m41474c() {
        try {
            new C89782m.C89784a();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(25787);
    }

    /* renamed from: b */
    private static C22087p m41473b() {
        try {
            Class.forName("android.os.Build");
            int i = Build.VERSION.SDK_INT;
            return new C22088a();
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("org.robovm.apple.foundation.NSObject");
                return new C22090b();
            } catch (ClassNotFoundException unused2) {
                return new C22087p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC22019c.AbstractC22020a mo35876a(Executor executor) {
        if (executor != null) {
            return new C22050i(executor);
        }
        return C22045f.f52071a;
    }
}
