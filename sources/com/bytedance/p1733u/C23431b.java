package com.bytedance.p1733u;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.storage.StorageManager;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.u.b */
public class C23431b {

    /* renamed from: d */
    private static C23431b f55567d;

    /* renamed from: e */
    private static volatile boolean f55568e;

    /* renamed from: g */
    private static Context f55569g;

    /* renamed from: a */
    public long f55570a;

    /* renamed from: b */
    public long f55571b;

    /* renamed from: c */
    public String f55572c;

    /* renamed from: f */
    private AbstractC23432a f55573f;

    /* renamed from: h */
    private volatile Boolean f55574h;

    /* renamed from: i */
    private File f55575i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.u.b$a */
    public interface AbstractC23432a {
        static {
            Covode.recordClassIndex(27392);
        }

        /* renamed from: a */
        String mo38205a();
    }

    static {
        Covode.recordClassIndex(27391);
    }

    /* renamed from: b */
    private String m44103b() {
        AbstractC23432a aVar = this.f55573f;
        if (aVar == null) {
            return "unknown";
        }
        return aVar.mo38205a();
    }

    /* renamed from: a */
    public final boolean mo38203a() {
        if (!"mounted".equals(m44103b()) || !m44104c()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "state=" + m44103b() + ", totalSize=" + this.f55571b + ", availableSize=" + this.f55570a + ", path=" + this.f55572c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.u.b$b */
    public static class C23433b implements AbstractC23432a {

        /* renamed from: a */
        private Method f55576a;

        /* renamed from: b */
        private Object f55577b;

        static {
            Covode.recordClassIndex(27393);
        }

        @Override // com.bytedance.p1733u.C23431b.AbstractC23432a
        /* renamed from: a */
        public final String mo38205a() {
            Object obj;
            Object invoke;
            Method method = this.f55576a;
            if (method == null || (obj = this.f55577b) == null) {
                return "unknown";
            }
            try {
                Object[] objArr = new Object[0];
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_storage_SdCardInfo$ReflectStateListener_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    invoke = a.second;
                } else {
                    invoke = method.invoke(obj, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_storage_SdCardInfo$ReflectStateListener_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                return (String) invoke;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return "unknown";
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return "unknown";
            }
        }

        public C23433b(Method method, Object obj) {
            this.f55576a = method;
            this.f55577b = obj;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ba, code lost:
        if (r4 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6 A[SYNTHETIC, Splitter:B:47:0x00a6] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m44104c() {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1733u.C23431b.m44104c():boolean");
    }

    /* renamed from: a */
    public static C23431b m44101a(Context context) {
        MethodCollector.m26663i(6177);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        f55569g = applicationContext;
        if (!f55568e) {
            synchronized (C23431b.class) {
                try {
                    if (!f55568e) {
                        try {
                            StorageManager storageManager = (StorageManager) m44102a(context, "storage");
                            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
                            Method method2 = cls.getMethod("getPathFile", new Class[0]);
                            Method method3 = cls.getMethod("isRemovable", new Class[0]);
                            Method method4 = cls.getMethod("getState", new Class[0]);
                            Object invoke = method.invoke(storageManager, new Object[0]);
                            int length = Array.getLength(invoke);
                            for (int i = 0; i < length; i++) {
                                Object obj = Array.get(invoke, i);
                                if (((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                                    File file = (File) method2.invoke(obj, new Object[0]);
                                    C23431b bVar = new C23431b(new C23433b(method4, obj), file.getFreeSpace(), file.getTotalSpace(), file.getPath());
                                    f55567d = bVar;
                                    f55568e = true;
                                    return bVar;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } catch (Throwable th) {
                            f55568e = true;
                            MethodCollector.m26664o(6177);
                            throw th;
                        }
                        f55568e = true;
                    }
                } finally {
                    MethodCollector.m26664o(6177);
                }
            }
        }
        C23431b bVar2 = f55567d;
        MethodCollector.m26664o(6177);
        return bVar2;
    }

    /* renamed from: a */
    private static Object m44102a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6179);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6179);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private C23431b(AbstractC23432a aVar, long j, long j2, String str) {
        this.f55573f = aVar;
        this.f55570a = j;
        this.f55571b = j2;
        this.f55572c = str;
    }
}
