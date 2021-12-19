package com.p2082ss.android.ugc.aweme.ecommerce.sku.p2861c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SalePropValue;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.c.b */
public final class C45420b {

    /* renamed from: a */
    public static final C45420b f105827a = new C45420b();

    private C45420b() {
    }

    static {
        Covode.recordClassIndex(53894);
    }

    /* renamed from: a */
    public static String m87990a(List<String> list) {
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size() - 1;
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i));
            sb.append(", ");
        }
        sb.append((String) C89070n.m154586h((List) list));
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: a */
    public static String m87991a(String[] strArr) {
        C89219l.m154721d(strArr, "");
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append("_");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return C89361p.m154868a(sb2, "__", "_");
    }

    /* renamed from: a */
    public static String m87992a(String[] strArr, List<SaleProp> list) {
        List<SalePropValue> list2;
        if (strArr == null || list == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if ((!C89219l.m154714a((Object) strArr[i], (Object) "")) && (list2 = list.get(i).f105849d) != null) {
                for (T t : list2) {
                    if (C89361p.m154872a(t.f105850a, strArr[i], false)) {
                        arrayList.add(t.f105851b);
                    }
                }
            }
        }
        return m87990a(arrayList);
    }
}
