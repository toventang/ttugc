package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r */
public final class C44089r {
    @AbstractC27891c(mo46611a = "payment_methods")

    /* renamed from: a */
    public final List<C44086o> f102821a;
    @AbstractC27891c(mo46611a = "recommend_payment_method")

    /* renamed from: b */
    public final C44086o f102822b = null;
    @AbstractC27891c(mo46611a = "stored_methods")

    /* renamed from: c */
    public final List<C44086o> f102823c;
    @AbstractC27891c(mo46611a = "bank_card_rules")

    /* renamed from: d */
    public final List<C44072b> f102824d;
    @AbstractC27891c(mo46611a = "payment_policy")

    /* renamed from: e */
    public final C44088q f102825e;
    @AbstractC27891c(mo46611a = "stored_method_show_count")

    /* renamed from: f */
    public final Integer f102826f;
    @AbstractC27891c(mo46611a = "encode_key")

    /* renamed from: g */
    public final String f102827g;
    @AbstractC27891c(mo46611a = "pipo_host")

    /* renamed from: h */
    public final String f102828h;
    @AbstractC27891c(mo46611a = "methods_text")

    /* renamed from: i */
    public final String f102829i;
    @AbstractC27891c(mo46611a = "methods_photos")

    /* renamed from: j */
    public final C44091t f102830j;

    /* renamed from: k */
    private C44086o f102831k;

    static {
        Covode.recordClassIndex(52400);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44089r)) {
            return false;
        }
        C44089r rVar = (C44089r) obj;
        return C89219l.m154714a(this.f102821a, rVar.f102821a) && C89219l.m154714a(this.f102822b, rVar.f102822b) && C89219l.m154714a(this.f102823c, rVar.f102823c) && C89219l.m154714a(this.f102824d, rVar.f102824d) && C89219l.m154714a(this.f102825e, rVar.f102825e) && C89219l.m154714a(this.f102826f, rVar.f102826f) && C89219l.m154714a(this.f102827g, rVar.f102827g) && C89219l.m154714a(this.f102828h, rVar.f102828h) && C89219l.m154714a(this.f102829i, rVar.f102829i) && C89219l.m154714a(this.f102830j, rVar.f102830j);
    }

    public final int hashCode() {
        List<C44086o> list = this.f102821a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C44086o oVar = this.f102822b;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        List<C44086o> list2 = this.f102823c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C44072b> list3 = this.f102824d;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        C44088q qVar = this.f102825e;
        int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        Integer num = this.f102826f;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f102827g;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f102828h;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102829i;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C44091t tVar = this.f102830j;
        if (tVar != null) {
            i = tVar.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "PaymentMethodsData(paymentMethods=" + this.f102821a + ", recommendPaymentMethod=" + this.f102822b + ", storedMethods=" + this.f102823c + ", bankCardRules=" + this.f102824d + ", paymentPolicy=" + this.f102825e + ", storedMethodShowCount=" + this.f102826f + ", encodeKey=" + this.f102827g + ", pipoHost=" + this.f102828h + ", paymentMethodsText=" + this.f102829i + ", methodsPhotos=" + this.f102830j + ")";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r1 == null) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o mo74973a() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r4.f102831k
            if (r0 != 0) goto L_0x0051
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r4.f102822b
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.mo74953d()
            r0 = r0 ^ 1
            r3 = 0
            if (r0 == 0) goto L_0x0056
            java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> r0 = r4.f102823c
            if (r0 == 0) goto L_0x0030
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = (com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o) r0
            boolean r0 = r0.mo74953d()
            if (r0 == 0) goto L_0x0019
        L_0x002c:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r1 = (com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o) r1
            if (r1 != 0) goto L_0x004f
        L_0x0030:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> r0 = r4.f102821a
            if (r0 == 0) goto L_0x004e
            java.util.Iterator r2 = r0.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = (com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o) r0
            boolean r0 = r0.mo74953d()
            if (r0 == 0) goto L_0x0038
            r3 = r1
        L_0x004c:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r3 = (com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o) r3
        L_0x004e:
            r1 = r3
        L_0x004f:
            r4.f102831k = r1
        L_0x0051:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r4.f102831k
            return r0
        L_0x0054:
            r1 = r3
            goto L_0x002c
        L_0x0056:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r4.f102822b
            r4.f102831k = r0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r.mo74973a():com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o");
    }

    public C44089r(List<C44086o> list, List<C44086o> list2, List<C44072b> list3, C44088q qVar, Integer num, String str, String str2, String str3, C44091t tVar) {
        this.f102821a = list;
        this.f102823c = list2;
        this.f102824d = list3;
        this.f102825e = qVar;
        this.f102826f = num;
        this.f102827g = str;
        this.f102828h = str2;
        this.f102829i = str3;
        this.f102830j = tVar;
    }
}
