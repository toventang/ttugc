package com.bytedance.scene.navigation;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.p1622d.C22170j;

/* renamed from: com.bytedance.scene.navigation.e */
public final class C22242e {
    static {
        Covode.recordClassIndex(26054);
    }

    /* renamed from: a */
    public static C22239d m41885a(AbstractC22219j jVar) {
        C22170j.m41654a();
        return m41887c(jVar);
    }

    /* renamed from: c */
    private static C22239d m41887c(AbstractC22219j jVar) {
        while (jVar != null) {
            jVar = jVar.f52551o;
            if (jVar instanceof C22239d) {
                return (C22239d) jVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C22239d m41886b(AbstractC22219j jVar) {
        C22170j.m41654a();
        C22170j.m41654a();
        C22239d c = m41887c(jVar);
        if (c != null) {
            return c;
        }
        if (jVar.mo36483q() == null) {
            throw new IllegalStateException("Scene " + jVar + " is not attached to any Scene");
        } else if (jVar instanceof C22239d) {
            throw new IllegalStateException("Scene " + jVar + " is root Scene");
        } else {
            throw new IllegalStateException("The root of the Scene hierarchy is not NavigationScene");
        }
    }
}
