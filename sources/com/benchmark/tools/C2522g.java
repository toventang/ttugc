package com.benchmark.tools;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.benchmark.tools.g */
public class C2522g {

    /* renamed from: c */
    public static Context f7637c;

    /* renamed from: d */
    public static AbstractC2524b f7638d;

    /* renamed from: e */
    public static AbstractC2524b f7639e = new C2523a();

    /* renamed from: com.benchmark.tools.g$b */
    public interface AbstractC2524b {
        static {
            Covode.recordClassIndex(2895);
        }

        /* renamed from: a */
        boolean mo6980a(List<String> list);
    }

    static {
        Covode.recordClassIndex(2893);
    }

    /* renamed from: com.benchmark.tools.g$a */
    public static class C2523a implements AbstractC2524b {
        static {
            Covode.recordClassIndex(2894);
        }

        @Override // com.benchmark.tools.C2522g.AbstractC2524b
        /* renamed from: a */
        public final boolean mo6980a(List<String> list) {
            System.currentTimeMillis();
            for (String str : list) {
                System.currentTimeMillis();
                if (!C2525h.m7401a(str, C2522g.f7637c)) {
                    return false;
                }
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
            return true;
        }
    }
}
