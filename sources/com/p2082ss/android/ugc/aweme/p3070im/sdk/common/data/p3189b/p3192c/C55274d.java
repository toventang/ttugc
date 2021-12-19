package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55270d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.d */
public class C55274d {

    /* renamed from: a */
    private static C55274d f126382a;

    static {
        Covode.recordClassIndex(65023);
    }

    /* renamed from: a */
    public static C55274d m101066a() {
        MethodCollector.m26663i(3527);
        if (f126382a == null) {
            synchronized (C55274d.class) {
                try {
                    if (f126382a == null) {
                        f126382a = new C55274d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3527);
                    throw th;
                }
            }
        }
        C55274d dVar = f126382a;
        MethodCollector.m26664o(3527);
        return dVar;
    }

    /* renamed from: b */
    public static String m101067b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists USER_EXTRA (");
        EnumC55270d[] values = EnumC55270d.values();
        for (EnumC55270d dVar : values) {
            sb.append(dVar.key).append(" ").append(dVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        r4 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.UserExtra m101065a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55274d.m101065a(java.lang.String):com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserExtra");
    }
}
