package com.bytedance.globalpayment.iap.common.ability;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsResult;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.d */
public class C15126d extends AbsResult {

    /* renamed from: a */
    public String f36928a;

    /* renamed from: b */
    public C15124c f36929b;

    /* renamed from: c */
    public PayType f36930c;

    static {
        Covode.recordClassIndex(17294);
    }

    public C15126d() {
        this(-1, -1, "");
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsResult
    public String toString() {
        return "IapResult{mCode=" + this.mCode + ", mDetailCode=" + this.mDetailCode + ", mMessage='" + this.mMessage + '\'' + ", mPayload='" + this.f36928a + '\'' + ", mIapPayRequest=" + this.f36929b + ", payType=" + this.f36930c + '}';
    }

    /* renamed from: a */
    public static C15126d m27810a(AbsResult absResult) {
        if (absResult instanceof C15126d) {
            return (C15126d) absResult;
        }
        return new C15126d(absResult.getCode(), absResult.getDetailCode(), absResult.getMessage());
    }

    public C15126d(int i, String str) {
        this(i, -1, str);
    }

    public C15126d(int i, int i2, String str) {
        this.f36930c = PayType.UNKNOWN;
        this.mCode = i;
        this.mDetailCode = i2;
        this.mMessage = str;
    }
}
