package com.benchmark.tools;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.benchmark.tools.a */
public final class C2512a extends C2522g {

    /* renamed from: a */
    public static volatile boolean f7621a;

    /* renamed from: b */
    protected static ArrayList<Object> f7622b = new ArrayList<>();

    static {
        Covode.recordClassIndex(2883);
    }

    /* renamed from: a */
    public static void m7381a() {
        if (!f7621a) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("c++_shared");
            arrayList.add("bytebench");
            if (f7638d != null) {
                if (!f7638d.mo6980a(arrayList)) {
                    f7621a = false;
                    return;
                }
            } else if (!f7639e.mo6980a(arrayList)) {
                f7621a = false;
                return;
            }
            f7621a = true;
        }
    }
}
