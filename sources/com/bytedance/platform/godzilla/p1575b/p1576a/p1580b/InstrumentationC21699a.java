package com.bytedance.platform.godzilla.p1575b.p1576a.p1580b;

import android.app.Instrumentation;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1579b.AbstractC21698a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.b.a.b.a */
public final class InstrumentationC21699a extends Instrumentation {

    /* renamed from: a */
    public static boolean f51475a;

    /* renamed from: b */
    private static List<AbstractC21698a> f51476b = new ArrayList();

    static {
        Covode.recordClassIndex(25340);
    }

    /* renamed from: a */
    public static void m40647a(AbstractC21698a aVar) {
        if (C21689g.f51462b && Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("register only in UI thread.");
        } else if (!f51476b.contains(aVar)) {
            f51476b.add(aVar);
        }
    }

    public final boolean onException(Object obj, Throwable th) {
        for (AbstractC21698a aVar : f51476b) {
            if (aVar.mo35356a(obj, th)) {
                return true;
            }
        }
        return super.onException(obj, th);
    }
}
