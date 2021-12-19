package com.bytedance.helios.p1085a.p1086a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Calendar;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.a.a.g */
public final class C15294g {

    /* renamed from: a */
    public static final C15294g f37314a = new C15294g();

    private C15294g() {
    }

    static {
        Covode.recordClassIndex(17524);
    }

    /* renamed from: a */
    public static String m28203a(long j) {
        String valueOf;
        Calendar instance = Calendar.getInstance();
        C89219l.m154709a((Object) instance, "");
        instance.setTimeInMillis(j);
        int i = instance.get(15) / 3600000;
        if (i >= 0) {
            valueOf = "+".concat(String.valueOf(i));
        } else {
            valueOf = String.valueOf(i);
        }
        String a = C1764a.m5928a("%d-%02d-%02d %02d:%02d:%02d.%03d GMT%s", Arrays.copyOf(new Object[]{Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5)), Integer.valueOf(instance.get(11)), Integer.valueOf(instance.get(12)), Integer.valueOf(instance.get(13)), Integer.valueOf(instance.get(14)), valueOf}, 8));
        C89219l.m154716b(a, "");
        return a;
    }
}
