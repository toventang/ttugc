package com.bytedance.webx.p1756e.p1757a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.webx.e.a.d */
public class C23590d {

    /* renamed from: a */
    public static volatile AbstractC23591a f55853a;

    /* renamed from: com.bytedance.webx.e.a.d$a */
    public interface AbstractC23591a {
        static {
            Covode.recordClassIndex(27689);
        }

        /* renamed from: a */
        boolean mo39017a();
    }

    static {
        Covode.recordClassIndex(27688);
    }

    /* renamed from: com.bytedance.webx.e.a.d$b */
    public static class C23592b {

        /* renamed from: a */
        public static boolean f55854a;

        static {
            MethodCollector.m26663i(8803);
            Covode.recordClassIndex(27690);
            f55854a = true;
            if (C23590d.f55853a != null) {
                synchronized (C23590d.class) {
                    try {
                        if (C23590d.f55853a != null) {
                            f55854a = C23590d.f55853a.mo39017a();
                        }
                    } finally {
                        MethodCollector.m26664o(8803);
                    }
                }
                return;
            }
            MethodCollector.m26664o(8803);
        }
    }
}
