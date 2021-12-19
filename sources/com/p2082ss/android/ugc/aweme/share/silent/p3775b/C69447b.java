package com.p2082ss.android.ugc.aweme.share.silent.p3775b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.b.b */
final /* synthetic */ class C69447b {
    static {
        Covode.recordClassIndex(81785);
    }

    /* renamed from: a */
    private static final String m122654a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    /* renamed from: a */
    public static final String m122655a(String str, List<? extends Object> list) {
        String str2;
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            String a = m122654a(t);
            sb.append(a);
            if (a.length() > 0 && i != list.size() - 1) {
                if (str == null) {
                    str2 = ",";
                } else {
                    str2 = str;
                }
                sb.append(str2);
            }
            i = i2;
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
