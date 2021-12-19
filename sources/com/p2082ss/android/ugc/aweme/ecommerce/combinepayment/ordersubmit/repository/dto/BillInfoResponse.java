package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse */
public final class BillInfoResponse extends C43612a<BillInfoData> implements Serializable {
    public static final C43846a Companion = new C43846a((byte) 0);

    static {
        Covode.recordClassIndex(52115);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse$a */
    public static final class C43846a {
        static {
            Covode.recordClassIndex(52116);
        }

        private C43846a() {
        }

        public /* synthetic */ C43846a(byte b) {
            this();
        }
    }

    public final String toJson() {
        String b = C33039i.m67673a().mo46674b(this);
        if (b == null) {
            return "{}";
        }
        return b;
    }

    public final boolean isValid() {
        if (!isCodeOK() || this.data == null || this.data.isEmpty()) {
            return false;
        }
        return true;
    }

    public final BillInfoResponse merge(BillInfoResponse billInfoResponse, BillInfoRequest billInfoRequest) {
        BillInfoData billInfoData;
        C89219l.m154721d(billInfoResponse, "");
        C89219l.m154721d(billInfoRequest, "");
        int i = this.code;
        String str = this.message;
        T t = this.data;
        if (t != null) {
            billInfoData = t.merge(billInfoResponse.data, billInfoRequest);
        } else {
            billInfoData = null;
        }
        return new BillInfoResponse(i, str, billInfoData);
    }

    public BillInfoResponse(int i, String str, BillInfoData billInfoData) {
        super(i, str, billInfoData);
    }
}
