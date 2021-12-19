package com.bytedance.disk.p961e;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p961e.p963b.C14444a;
import com.bytedance.disk.p961e.p963b.C14446c;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.disk.e.a */
public class C14441a {

    /* renamed from: b */
    public static AbstractC14448c f34939b;

    /* renamed from: c */
    public static final C14446c.C14447a<Void> f34940c = new C14446c.C14447a<>("com.bytedance.disk.core.DiskMigrateServerImpl", "config", new Class[]{Integer.TYPE, Integer.TYPE, AbstractC14448c.class});

    /* renamed from: d */
    public static final C14446c.C14447a<Void> f34941d = new C14446c.C14447a<>("com.bytedance.disk.core.DiskMigrateServerImpl", "start", new Class[0]);

    /* renamed from: e */
    private static volatile C14441a f34942e;

    /* renamed from: f */
    private static Context f34943f;

    /* renamed from: g */
    private static final C14446c.C14447a<Object> f34944g = new C14446c.C14447a<>("com.bytedance.disk.core.DiskMigrateServerImpl", "init", new Class[]{Context.class});

    /* renamed from: h */
    private static final C14446c.C14447a<AbstractC14443b> f34945h = new C14446c.C14447a<>("com.bytedance.disk.core.DiskMigrateServerImpl", "getInstance", new Class[0]);

    /* renamed from: a */
    public AbstractC14443b f34946a;

    private C14441a() {
        int i = Build.VERSION.SDK_INT;
        AbstractC14448c cVar = f34939b;
        if (cVar != null) {
            cVar.mo23275a(6, "DiskMigWrap", "<init> failed", new Exception());
        }
    }

    /* renamed from: a */
    public static C14441a m26370a() {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (f34942e == null && (context = f34943f) != null) {
            m26371a(context);
        }
        if (f34942e == null) {
            f34942e = new C14441a();
        }
        return f34942e;
    }

    static {
        Covode.recordClassIndex(16520);
    }

    /* renamed from: a */
    public final void mo23272a(long j) {
        AbstractC14443b bVar = this.f34946a;
        if (bVar != null) {
            bVar.mo23262a(j);
        }
    }

    private C14441a(Context context) {
        AbstractC14448c cVar;
        C14444a.m26379a(context);
        f34944g.mo23274a(null, new Object[]{context});
        AbstractC14443b a = f34945h.mo23274a(null, new Object[0]);
        this.f34946a = a;
        if (a == null && (cVar = f34939b) != null) {
            cVar.mo23275a(6, "DiskMigWrap", "<init> failed", null);
        }
    }

    /* renamed from: a */
    public static void m26371a(Context context) {
        MethodCollector.m26663i(4790);
        if (f34942e == null) {
            int i = Build.VERSION.SDK_INT;
            synchronized (C14441a.class) {
                try {
                    if (f34942e == null) {
                        Context context2 = f34943f;
                        if (context2 != null) {
                            context = context2;
                        }
                        f34942e = new C14441a(context);
                    }
                } finally {
                    MethodCollector.m26664o(4790);
                }
            }
            return;
        }
        MethodCollector.m26664o(4790);
    }

    /* renamed from: a */
    public static void m26372a(Context context, AbstractC14448c cVar) {
        f34943f = context;
        f34939b = cVar;
    }
}
