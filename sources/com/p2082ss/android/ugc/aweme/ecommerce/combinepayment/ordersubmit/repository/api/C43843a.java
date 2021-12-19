package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.OrderSubmitApi;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44287y;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a */
public final class C43843a extends AbstractC20179a<BillInfoRequest, BillInfoResponse, BillInfoRequest, BillInfoResponse> {

    /* renamed from: a */
    public BillInfoResponse f102154a;

    static {
        Covode.recordClassIndex(52109);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a$b */
    static final class C43845b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C43845b f102157a = new C43845b();

        static {
            Covode.recordClassIndex(52111);
        }

        C43845b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t;
            C44089r paymentMethods;
            BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
            if (billInfoResponse.isValid() && (t = billInfoResponse.data) != null && (paymentMethods = t.getPaymentMethods()) != null) {
                C44287y.m87013a(paymentMethods);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a$a */
    static final class C43844a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C43843a f102155a;

        /* renamed from: b */
        final /* synthetic */ BillInfoRequest f102156b;

        static {
            Covode.recordClassIndex(52110);
        }

        C43844a(C43843a aVar, BillInfoRequest billInfoRequest) {
            this.f102155a = aVar;
            this.f102156b = billInfoRequest;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
            C89219l.m154721d(billInfoResponse, "");
            BillInfoResponse billInfoResponse2 = this.f102155a.f102154a;
            if (billInfoResponse2 == null || !billInfoResponse.isValid()) {
                if (billInfoResponse.isValid()) {
                    this.f102155a.f102154a = billInfoResponse;
                }
                return billInfoResponse;
            }
            BillInfoResponse merge = billInfoResponse2.merge(billInfoResponse, this.f102156b);
            if (merge.isValid()) {
                this.f102155a.f102154a = merge;
            }
            return merge;
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<BillInfoResponse> mo33481a(BillInfoRequest billInfoRequest) {
        BillInfoRequest billInfoRequest2 = billInfoRequest;
        C89219l.m154721d(billInfoRequest2, "");
        C89219l.m154721d(billInfoRequest2, "");
        AbstractC88979t<R> b = ((OrderSubmitApi) OrderSubmitApi.C43842a.f102152a.mo28858a(OrderSubmitApi.class)).getBillInfo(billInfoRequest2).mo143292d(new C43844a(this, billInfoRequest2)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b(C43845b.f102157a);
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }
}
