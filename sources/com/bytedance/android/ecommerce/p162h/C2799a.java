package com.bytedance.android.ecommerce.p162h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import java.util.HashMap;

/* renamed from: com.bytedance.android.ecommerce.h.a */
public final class C2799a {
    static {
        Covode.recordClassIndex(3225);
    }

    /* renamed from: a */
    public static String m8033a(AbstractC18754n nVar, String str) {
        if (nVar == null || !nVar.mo29757a(str)) {
            return null;
        }
        AbstractC18659k i = nVar.mo29766i(str);
        if (i.mo29707a() != EnumC18805o.String) {
            return null;
        }
        try {
            return i.mo29711e();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m8035a(Object obj, AbstractC18400b.AbstractC18402b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        hashMap.put("data", obj);
        bVar.mo13405a(hashMap);
    }

    /* renamed from: a */
    public static void m8036a(String str, AbstractC18400b.AbstractC18402b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", 0);
        hashMap.put("error_msg", str);
        bVar.mo13405a(hashMap);
    }

    /* renamed from: a */
    public static void m8034a(int i, int i2, String str, AbstractC18400b.AbstractC18402b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("detail_code", Integer.valueOf(i2));
        hashMap.put("message", str);
        hashMap.put("msg", "code:" + i + " detailCode:" + i2 + " msg:" + str);
        bVar.mo13405a(hashMap);
    }
}
