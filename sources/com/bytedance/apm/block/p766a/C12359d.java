package com.bytedance.apm.block.p766a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.block.a.d */
public class C12359d {

    /* renamed from: b */
    static volatile boolean f29780b;

    /* renamed from: c */
    private static volatile C12359d f29781c;

    /* renamed from: a */
    public AbstractC12362b f29782a = new C12361a();

    /* renamed from: com.bytedance.apm.block.a.d$b */
    public interface AbstractC12362b {
        static {
            Covode.recordClassIndex(14168);
        }
    }

    static {
        Covode.recordClassIndex(14165);
    }

    /* renamed from: com.bytedance.apm.block.a.d$a */
    static class C12361a implements AbstractC12362b {
        static {
            Covode.recordClassIndex(14167);
        }

        C12361a() {
        }
    }

    private C12359d() {
    }

    /* renamed from: a */
    public static C12359d m22201a() {
        if (f29781c == null) {
            synchronized (C12359d.class) {
                if (f29781c == null) {
                    f29781c = new C12359d();
                }
            }
        }
        return f29781c;
    }
}
