package com.bytedance.platform.p1565a.p1567b;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.platform.a.b.b */
public class C21647b {

    /* renamed from: d */
    private static C21647b f51364d;

    /* renamed from: a */
    public Application f51365a;

    /* renamed from: b */
    public boolean f51366b;

    /* renamed from: c */
    public boolean f51367c;

    static {
        Covode.recordClassIndex(25288);
    }

    private C21647b(Application application) {
        this.f51365a = application;
    }

    /* renamed from: a */
    public static C21647b m40599a(Application application) {
        MethodCollector.m26663i(3554);
        if (f51364d == null) {
            synchronized (C21647b.class) {
                try {
                    if (f51364d == null) {
                        f51364d = new C21647b(application);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3554);
                    throw th;
                }
            }
        }
        C21647b bVar = f51364d;
        MethodCollector.m26664o(3554);
        return bVar;
    }
}
