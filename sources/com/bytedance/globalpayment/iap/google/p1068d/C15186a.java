package com.bytedance.globalpayment.iap.google.p1068d;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.payment.common.lib.C15234a;

/* renamed from: com.bytedance.globalpayment.iap.google.d.a */
public final class C15186a extends C15234a {

    /* renamed from: a */
    public long f37069a;

    /* renamed from: b */
    public long f37070b;

    /* renamed from: c */
    public long f37071c;

    /* renamed from: d */
    public String f37072d;

    /* renamed from: e */
    public String f37073e;

    /* renamed from: f */
    public boolean f37074f;

    /* renamed from: g */
    public int f37075g;

    /* renamed from: h */
    private long f37076h;

    static {
        Covode.recordClassIndex(17366);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r5 > 0) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24548a(int r10, com.bytedance.globalpayment.iap.common.ability.C15126d r11) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.iap.google.p1068d.C15186a.mo24548a(int, com.bytedance.globalpayment.iap.common.ability.d):void");
    }

    public C15186a(String str, String str2, boolean z, PayType payType) {
        this.f37072d = str;
        this.f37073e = str2;
        this.f37074f = z;
        if (payType != null) {
            this.f37075g = payType.ordinal();
        } else {
            this.f37075g = -1;
        }
    }
}
