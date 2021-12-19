package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i */
public final class C18586i {
    static {
        Covode.recordClassIndex(21280);
    }

    /* renamed from: a */
    private static List<Object> m34540a(AbstractC18700m mVar) {
        C89219l.m154719c(mVar, "");
        ArrayList arrayList = new ArrayList();
        int a = mVar.mo29730a();
        for (int i = 0; i < a; i++) {
            switch (C18630j.f44369a[mVar.mo29739h(i).ordinal()]) {
                case 1:
                    arrayList.add(mVar.mo29735d(i));
                    break;
                case 2:
                    arrayList.add(Double.valueOf(mVar.mo29732b(i)));
                    break;
                case 3:
                    arrayList.add(Boolean.valueOf(mVar.mo29731a(i)));
                    break;
                case 4:
                    arrayList.add(Integer.valueOf(mVar.mo29734c(i)));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    AbstractC18754n f = mVar.mo29737f(i);
                    if (f != null) {
                        arrayList.add(m34541a(f));
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    AbstractC18700m e = mVar.mo29736e(i);
                    if (e != null) {
                        arrayList.add(m34540a(e));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final Map<String, Object> m34541a(AbstractC18754n nVar) {
        C89219l.m154719c(nVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC18687l a = nVar.mo29756a();
        while (a.mo29723a()) {
            String b = a.mo29724b();
            switch (C18630j.f44370b[nVar.mo29767j(b).ordinal()]) {
                case 1:
                    linkedHashMap.put(b, nVar.mo29763f(b));
                    break;
                case 2:
                    linkedHashMap.put(b, Double.valueOf(nVar.mo29761d(b)));
                    break;
                case 3:
                    linkedHashMap.put(b, Boolean.valueOf(nVar.mo29760c(b)));
                    break;
                case 4:
                    linkedHashMap.put(b, Integer.valueOf(nVar.mo29762e(b)));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    AbstractC18754n h = nVar.mo29765h(b);
                    if (h == null) {
                        break;
                    } else {
                        linkedHashMap.put(b, m34541a(h));
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    AbstractC18700m g = nVar.mo29764g(b);
                    if (g == null) {
                        break;
                    } else {
                        linkedHashMap.put(b, m34540a(g));
                        break;
                    }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC18754n m34543b(AbstractC18754n nVar, String str) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(str, "");
        if (!nVar.mo29757a(str)) {
            return null;
        }
        AbstractC18659k i = nVar.mo29766i(str);
        if (i.mo29707a() == EnumC18805o.Map) {
            return i.mo29713g();
        }
        return null;
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC18700m m34544c(AbstractC18754n nVar, String str) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(str, "");
        if (!nVar.mo29757a(str)) {
            return null;
        }
        AbstractC18659k i = nVar.mo29766i(str);
        if (i.mo29707a() == EnumC18805o.Array) {
            return i.mo29712f();
        }
        return null;
    }

    /* renamed from: a */
    public static final double m34536a(AbstractC18754n nVar, String str, double d) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(str, "");
        if (!nVar.mo29757a(str)) {
            return d;
        }
        AbstractC18659k i = nVar.mo29766i(str);
        if (i.mo29707a() == EnumC18805o.Number) {
            return i.mo29709c();
        }
        return d;
    }

    /* renamed from: a */
    public static final int m34537a(AbstractC18754n nVar, String str, int i) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(str, "");
        if (!nVar.mo29757a(str)) {
            return i;
        }
        AbstractC18659k i2 = nVar.mo29766i(str);
        if (i2.mo29707a() == EnumC18805o.Int) {
            return i2.mo29710d();
        }
        return i;
    }

    /* renamed from: a */
    public static final String m34539a(AbstractC18754n nVar, String str, String str2) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (!nVar.mo29757a(str)) {
            return str2;
        }
        AbstractC18659k i = nVar.mo29766i(str);
        if (i.mo29707a() == EnumC18805o.String) {
            return i.mo29711e();
        }
        return str2;
    }

    /* renamed from: a */
    public static final boolean m34542a(AbstractC18754n nVar, String str, boolean z) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(str, "");
        if (!nVar.mo29757a(str)) {
            return z;
        }
        AbstractC18659k i = nVar.mo29766i(str);
        if (i.mo29707a() == EnumC18805o.Boolean) {
            return i.mo29708b();
        }
        return z;
    }
}
