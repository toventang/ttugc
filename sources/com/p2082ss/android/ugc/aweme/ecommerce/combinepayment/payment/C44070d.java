package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.android.ecommerce.p153a.C2747g;
import com.bytedance.android.ecommerce.p153a.C2749i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.d */
public final class C44070d {

    /* renamed from: a */
    public static final C44070d f102724a = new C44070d();

    private C44070d() {
    }

    static {
        Covode.recordClassIndex(52376);
    }

    /* renamed from: a */
    public static C2749i m86904a(C44087p pVar) {
        ArrayList arrayList;
        C89219l.m154721d(pVar, "");
        String id = pVar.getId();
        List<C44084m> paymentElements = pVar.getPaymentElements();
        if (paymentElements != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) paymentElements, 10));
            for (T t : paymentElements) {
                C89219l.m154721d(t, "");
                C2747g gVar = new C2747g(t.getElement(), t.getParamName(), t.getParamValue());
                gVar.f8257d = t.isEncrypted().booleanValue();
                arrayList2.add(gVar);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        C2749i iVar = new C2749i(id, arrayList);
        iVar.f8269b = pVar.getToken();
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r16 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r16 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r16 != null) goto L_0x000d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p m86906a(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n r16, boolean r17) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44070d.m86906a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, boolean):com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p");
    }
}
