package com.bytedance.android.live.core.p218f.p220b;

import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3917d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.f.b.b */
public final class C3922b {

    /* renamed from: a */
    static Map<String, AbstractC3925d> f10804a = new HashMap<String, AbstractC3925d>() {
        /* class com.bytedance.android.live.core.p218f.p220b.C3922b.C39231 */

        static {
            Covode.recordClassIndex(4452);
        }

        {
            put("HUAWEI", new C3917d());
        }
    };

    static {
        Covode.recordClassIndex(4451);
    }

    /* renamed from: a */
    public static int m9557a() {
        return m9558a(C3966y.m9655a().getConfiguration());
    }

    /* renamed from: b */
    public static boolean m9559b() {
        AbstractC3925d dVar = f10804a.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return false;
        }
        return dVar.mo9272a();
    }

    /* renamed from: a */
    private static int m9558a(Configuration configuration) {
        AbstractC3925d dVar = f10804a.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return -1;
        }
        return dVar.mo9271a(configuration);
    }
}
