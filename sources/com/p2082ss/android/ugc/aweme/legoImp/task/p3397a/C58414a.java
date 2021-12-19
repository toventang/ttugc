package com.p2082ss.android.ugc.aweme.legoImp.task.p3397a;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.a.a */
public final class C58414a {

    /* renamed from: a */
    public static boolean f132995a;

    /* renamed from: b */
    public static boolean f132996b;

    /* renamed from: c */
    public static boolean f132997c;

    static {
        Covode.recordClassIndex(68655);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.a.a$a */
    public static final class HandlerC58415a extends Handler {

        /* renamed from: a */
        private final Handler f132998a;

        /* renamed from: b */
        private Method f132999b;

        /* renamed from: c */
        private Object f133000c;

        /* renamed from: d */
        private Method f133001d;

        /* renamed from: e */
        private Field f133002e;

        /* renamed from: f */
        private Field f133003f;

        /* renamed from: g */
        private Class<?> f133004g;

        static {
            Covode.recordClassIndex(68656);
        }

        /* renamed from: a */
        private static Object m106827a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_legoImp_task_anr_AnrDispatchBoost$DelegateInternalHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_legoImp_task_anr_AnrDispatchBoost$DelegateInternalHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        /* renamed from: a */
        private void m106828a() {
            try {
                if (this.f133000c == null) {
                    Method declaredMethod = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new Class[0]);
                    declaredMethod.setAccessible(true);
                    this.f133000c = declaredMethod.invoke(null, new Object[0]);
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: b */
        private static Method m106831b() {
            Method method;
            try {
                Class<?> cls = Class.forName("android.app.IActivityManager");
                if (Build.VERSION.SDK_INT < 23) {
                    method = cls.getDeclaredMethod("finishReceiver", IBinder.class, Integer.TYPE, String.class, Bundle.class, Boolean.TYPE);
                } else {
                    method = cls.getDeclaredMethod("finishReceiver", IBinder.class, Integer.TYPE, String.class, Bundle.class, Boolean.TYPE, Integer.TYPE);
                }
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final void handleMessage(Message message) {
            Handler handler = this.f132998a;
            if (handler != null) {
                handler.handleMessage(message);
            } else {
                super.handleMessage(message);
            }
        }

        /* renamed from: a */
        private void m106830a(Object obj) {
            if (this.f133004g == null) {
                Class<?> cls = obj.getClass();
                this.f133004g = cls;
                m106829a((Class<?>) cls.getSuperclass());
            }
            if (this.f133000c != null && this.f133002e != null) {
                m106832b(obj);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public HandlerC58415a(android.os.Handler r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x000e
                android.os.Looper r0 = r3.getLooper()
            L_0x0006:
                r2.<init>(r0)
                r2.f132998a = r3
                if (r3 == 0) goto L_0x002a
                goto L_0x0013
            L_0x000e:
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                goto L_0x0006
            L_0x0013:
                java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
                java.lang.String r0 = "mCallback"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x002a }
                r0 = 1
                r1.setAccessible(r0)     // Catch:{ all -> 0x002a }
                java.lang.Object r0 = r1.get(r3)     // Catch:{ all -> 0x002a }
                android.os.Handler$Callback r0 = (android.os.Handler.Callback) r0     // Catch:{ all -> 0x002a }
                if (r0 == 0) goto L_0x002a
                r1.set(r2, r0)     // Catch:{ all -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.p3397a.C58414a.HandlerC58415a.<init>(android.os.Handler):void");
        }

        /* renamed from: a */
        private void m106829a(Class<?> cls) {
            if (this.f133001d == null) {
                m106828a();
                this.f133001d = m106831b();
                if (cls != null) {
                    try {
                        Field declaredField = cls.getDeclaredField("mToken");
                        this.f133002e = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = cls.getDeclaredField("mFlags");
                        this.f133003f = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        private void m106832b(Object obj) {
            int i;
            try {
                IBinder iBinder = (IBinder) this.f133002e.get(obj);
                Field field = this.f133003f;
                if (field != null) {
                    i = ((Integer) field.get(obj)).intValue();
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT < 23) {
                    m106827a(this.f133001d, this.f133000c, new Object[]{iBinder, 0, null, null, false});
                    return;
                }
                m106827a(this.f133001d, this.f133000c, new Object[]{iBinder, 0, null, null, false, Integer.valueOf(i)});
            } catch (Throwable unused) {
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|(2:2|(1:4))(1:12)|5|(6:11|13|14|(2:16|(1:18))|19|(6:21|(1:26)|23|(2:29|33)|30|33))(2:34|(2:38|(1:44)))|45|46|(2:48|(2:50|(2:52|(2:54|(1:56)(1:57)))(1:58)))|59|(2:62|63)(2:64|65)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00db */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1 A[Catch:{ all -> 0x0117 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0120  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean sendMessageAtTime(android.os.Message r11, long r12) {
            /*
            // Method dump skipped, instructions count: 302
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.p3397a.C58414a.HandlerC58415a.sendMessageAtTime(android.os.Message, long):boolean");
        }
    }
}
