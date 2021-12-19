package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55269c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.b */
public final class C55272b {

    /* renamed from: a */
    public static final String f126379a = "IM_RES_CACHE";

    /* renamed from: b */
    public static final C55272b f126380b = new C55272b();

    private C55272b() {
    }

    static {
        Covode.recordClassIndex(65021);
    }

    /* renamed from: a */
    public static String m101039a() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists " + f126379a + " (");
        EnumC55269c[] values = EnumC55269c.values();
        for (EnumC55269c cVar : values) {
            sb.append(cVar.key).append(" ").append(cVar.type).append(",");
        }
        sb.append(" primary key (").append(EnumC55269c.COLUMN_MD5.key).append(",").append(EnumC55269c.COLUMN_TYPE.key).append("),");
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
        String substring = sb2.substring(0, sb2.length() - 1);
        C89219l.m154716b(substring, "");
        return sb3.append(substring).append(");").toString();
    }
}
