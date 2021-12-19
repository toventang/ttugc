package com.bytedance.hybrid.spark.p1111e;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.e.c */
public final class C15573c {

    /* renamed from: a */
    public static final C15573c f37956a = new C15573c();

    private C15573c() {
    }

    static {
        Covode.recordClassIndex(17835);
    }

    /* renamed from: a */
    public static void m28691a(String str, String str2, SparkContext sparkContext) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        m28690a(EnumC21209b.I, str, str2, sparkContext);
    }

    /* renamed from: a */
    public static void m28690a(EnumC21209b bVar, String str, String str2, SparkContext sparkContext) {
        String str3;
        StringBuilder append = new StringBuilder().append(str2).append(" containerId:");
        if (sparkContext != null) {
            str3 = sparkContext.f50280f;
        } else {
            str3 = null;
        }
        C21210c.m39924a(append.append(str3).toString(), bVar, "HybridKit-".concat(String.valueOf(str)));
    }
}
