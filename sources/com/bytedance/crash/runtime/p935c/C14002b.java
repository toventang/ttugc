package com.bytedance.crash.runtime.p935c;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.runtime.C14004d;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.C14026q;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.runtime.c.b */
public final class C14002b extends AbstractRunnableC14001a {

    /* renamed from: b */
    private static C14002b f34138b;

    static {
        Covode.recordClassIndex(16067);
    }

    /* renamed from: a */
    public static void m25372a() {
        C14019n.m25421b().mo22552a(m25373b(), 100);
    }

    /* renamed from: b */
    private static C14002b m25373b() {
        if (f34138b == null) {
            f34138b = new C14002b(C14019n.m25421b().f34199d);
        }
        return f34138b;
    }

    public final void run() {
        Map<String, Object> map;
        C14019n.m25421b().f34199d.removeCallbacks(this);
        try {
            map = C13933m.m25221a().mo22519b();
            if (map != null) {
                try {
                    if (C14004d.m25378a(map)) {
                        mo22515a(this.f34135a);
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        } catch (Throwable unused2) {
            map = null;
        }
        C14026q.m25432a().mo22540a(map, new JSONArray());
    }

    private C14002b(Handler handler) {
        super(handler, 30000);
    }
}
