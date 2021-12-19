package com.bytedance.apm.block;

import com.bytedance.apm.p789q.C12584g;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.block.f */
public class C12388f {

    /* renamed from: b */
    private static volatile C12388f f29895b;

    /* renamed from: a */
    public int f29896a;

    static {
        Covode.recordClassIndex(14195);
    }

    private C12388f() {
    }

    /* renamed from: a */
    public static C12388f m22257a() {
        if (f29895b == null) {
            synchronized (C12388f.class) {
                if (f29895b == null) {
                    f29895b = new C12388f();
                }
            }
        }
        return f29895b;
    }

    /* renamed from: a */
    public static int m22256a(JSONObject jSONObject) {
        int a = C12584g.m22673a(jSONObject, "performance_modules", "smooth", "block_monitor_mode");
        if (a == 11) {
            return 2;
        }
        if (a == 101) {
            return 3;
        }
        if (a != 1001) {
            return 1;
        }
        return 0;
    }
}
