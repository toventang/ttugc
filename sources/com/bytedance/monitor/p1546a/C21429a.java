package com.bytedance.monitor.p1546a;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.monitor.a.a */
public class C21429a {

    /* renamed from: a */
    public static Object f50810a;

    /* renamed from: b */
    public static Class f50811b;

    /* renamed from: c */
    private static Class f50812c;

    /* renamed from: d */
    private static Field f50813d;

    /* renamed from: e */
    private static Object f50814e;

    /* renamed from: f */
    private static Set<Integer> f50815f;

    /* renamed from: c */
    private static synchronized Class m40231c() {
        Class cls;
        synchronized (C21429a.class) {
            if (f50812c == null) {
                try {
                    f50812c = Class.forName("android.app.ActivityThread");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            cls = f50812c;
        }
        return cls;
    }

    /* renamed from: d */
    private static synchronized Field m40232d() {
        Field field;
        synchronized (C21429a.class) {
            if (f50813d == null) {
                f50813d = C21434b.m40241a((Class<?>) m40231c(), "mH");
            }
            field = f50813d;
        }
        return field;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.Object m40233e() {
        /*
            java.lang.Class<com.bytedance.monitor.a.a> r3 = com.bytedance.monitor.p1546a.C21429a.class
            monitor-enter(r3)
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21429a.f50810a     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            if (r0 != 0) goto L_0x0016
            java.lang.Class r2 = m40231c()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            java.lang.String r1 = "currentActivityThread"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21458e.m40303a(r2, r1, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            com.bytedance.monitor.p1546a.C21429a.f50810a = r0     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
        L_0x0016:
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21429a.f50810a     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            monitor-exit(r3)
            return r0
        L_0x001a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x001d:
            r0 = 0
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.p1546a.C21429a.m40233e():java.lang.Object");
    }

    /* renamed from: a */
    public static synchronized Object m40228a() {
        Object obj;
        synchronized (C21429a.class) {
            if (f50814e == null) {
                try {
                    f50814e = m40232d().get(m40233e());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            obj = f50814e;
        }
        return obj;
    }

    static {
        Covode.recordClassIndex(25052);
        HashSet hashSet = new HashSet();
        f50815f = hashSet;
        hashSet.add(113);
        f50815f.add(114);
        f50815f.add(115);
        f50815f.add(116);
        f50815f.add(121);
        f50815f.add(122);
        f50815f.add(100);
        f50815f.add(159);
        f50815f.add(123);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0052 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m40230b() {
        /*
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21429a.f50810a
            if (r0 != 0) goto L_0x0060
            java.lang.Class<com.bytedance.monitor.a.a> r3 = com.bytedance.monitor.p1546a.C21429a.class
            monitor-enter(r3)     // Catch:{ Exception -> 0x005c }
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21429a.f50810a     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0024
            java.lang.Class r0 = com.bytedance.monitor.p1546a.C21429a.f50811b     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0059 }
            com.bytedance.monitor.p1546a.C21429a.f50811b = r0     // Catch:{ all -> 0x0059 }
        L_0x0017:
            java.lang.Class r2 = com.bytedance.monitor.p1546a.C21429a.f50811b     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "currentActivityThread"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21458e.m40303a(r2, r1, r0)     // Catch:{ all -> 0x0059 }
            com.bytedance.monitor.p1546a.C21429a.f50810a = r0     // Catch:{ all -> 0x0059 }
        L_0x0024:
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21429a.f50810a     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0057
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0059 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0059 }
            if (r1 == r0) goto L_0x0057
            java.lang.Object r2 = new java.lang.Object     // Catch:{ all -> 0x0059 }
            r2.<init>()     // Catch:{ all -> 0x0059 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x0059 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0059 }
            r1.<init>(r0)     // Catch:{ all -> 0x0059 }
            com.bytedance.monitor.a.a$1 r0 = new com.bytedance.monitor.a.a$1     // Catch:{ all -> 0x0059 }
            r0.<init>(r2)     // Catch:{ all -> 0x0059 }
            r1.post(r0)     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21429a.f50810a     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0057
            monitor-enter(r2)     // Catch:{ all -> 0x0059 }
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0052 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0057:
            monitor-exit(r3)
            goto L_0x0060
        L_0x0059:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x005c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0060:
            java.lang.Object r0 = com.bytedance.monitor.p1546a.C21429a.f50810a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.p1546a.C21429a.m40230b():java.lang.Object");
    }

    /* renamed from: a */
    public static boolean m40229a(Message message) {
        if (message != null && f50815f.contains(Integer.valueOf(message.what))) {
            return true;
        }
        return false;
    }
}
