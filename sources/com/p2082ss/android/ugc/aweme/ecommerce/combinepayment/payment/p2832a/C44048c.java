package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a;

import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p153a.C2744d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c */
public final class C44048c {

    /* renamed from: a */
    public static final C44048c f102687a = new C44048c();

    private C44048c() {
    }

    static {
        Covode.recordClassIndex(52353);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c$a */
    static final class C44049a extends AbstractC89220m implements AbstractC89172b<String, CharSequence> {

        /* renamed from: a */
        public static final C44049a f102688a = new C44049a();

        static {
            Covode.recordClassIndex(52354);
        }

        C44049a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00de, code lost:
        if (r0 == null) goto L_0x00e0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m86895a(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e r7, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o r8, java.util.List<com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m> r9) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a.C44048c.m86895a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, java.util.List):java.lang.String");
    }

    /* renamed from: b */
    public static Map<String, String> m86896b(C44075e eVar, C44086o oVar, List<C44084m> list) {
        T t;
        T t2;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C44075e> list2 = eVar.f102750i;
        if (list2 != null) {
            for (T t3 : list2) {
                if (t3.f102742a != null) {
                    String str = t3.f102742a;
                    String str2 = null;
                    if (str != null && str.hashCode() == 1981981399 && str.equals("eg_ccdc_global_billing_address")) {
                        List<C44075e> a = t3.mo74915a();
                        ArrayList arrayList = new ArrayList();
                        for (T t4 : a) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                if (C89219l.m154714a((Object) t.getElement(), (Object) t4.f102742a)) {
                                    break;
                                }
                            }
                            T t5 = t;
                            String paramValue = t5 != null ? t5.getParamValue() : null;
                            if (paramValue != null) {
                                arrayList.add(paramValue);
                            }
                        }
                        str2 = C89070n.m154551a(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C44049a.f102688a, 30);
                    } else {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it2.next();
                            if (C89219l.m154714a((Object) t2.getElement(), (Object) t3.f102742a)) {
                                break;
                            }
                        }
                        T t6 = t2;
                        if (t6 != null) {
                            str2 = t6.getParamValue();
                        }
                    }
                    try {
                        C2744d a2 = C2732a.f8145a.mo7356a(oVar.f102794a, t3.f102742a, str2);
                        C89219l.m154716b(a2, "");
                        if (!a2.f8231a) {
                            String str3 = t3.f102742a;
                            String a3 = a2.mo7328a();
                            if (a3 == null) {
                                a3 = "";
                            }
                            linkedHashMap.put(str3, a3);
                        }
                    } catch (Exception unused) {
                        linkedHashMap.put(t3.f102742a, "system_error");
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
