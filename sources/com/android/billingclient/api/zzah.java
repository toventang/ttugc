package com.android.billingclient.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.List;

final class zzah implements AbstractC2234c, AbstractC2239f, AbstractC2246j, AbstractC2247k, AbstractC2250m {

    /* renamed from: a */
    private final long f6795a;

    static {
        Covode.recordClassIndex(2469);
    }

    public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i, String str, Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int i, String str, SkuDetails[] skuDetailsArr, long j);

    zzah() {
    }

    @Override // com.android.billingclient.api.AbstractC2239f
    /* renamed from: a */
    public final void mo6206a() {
        MethodCollector.m26663i(9057);
        nativeOnBillingServiceDisconnected();
        MethodCollector.m26664o(9057);
    }

    @Override // com.android.billingclient.api.AbstractC2234c
    /* renamed from: a */
    public final void mo6189a(C2242h hVar) {
        MethodCollector.m26663i(8763);
        nativeOnAcknowledgePurchaseResponse(hVar.f6732a, hVar.f6733b, this.f6795a);
        MethodCollector.m26664o(8763);
    }

    @Override // com.android.billingclient.api.AbstractC2239f
    /* renamed from: b */
    public final void mo6207b(C2242h hVar) {
        MethodCollector.m26663i(8900);
        nativeOnBillingSetupFinished(hVar.f6732a, hVar.f6733b, this.f6795a);
        MethodCollector.m26664o(8900);
    }

    @Override // com.android.billingclient.api.AbstractC2246j
    /* renamed from: a */
    public final void mo6212a(C2242h hVar, String str) {
        MethodCollector.m26663i(9058);
        nativeOnConsumePurchaseResponse(hVar.f6732a, hVar.f6733b, str, this.f6795a);
        MethodCollector.m26664o(9058);
    }

    @Override // com.android.billingclient.api.AbstractC2250m
    /* renamed from: b */
    public final void mo6216b(C2242h hVar, List<SkuDetails> list) {
        MethodCollector.m26663i(8761);
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(hVar.f6732a, hVar.f6733b, (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), this.f6795a);
        MethodCollector.m26664o(8761);
    }

    @Override // com.android.billingclient.api.AbstractC2247k
    /* renamed from: a */
    public final void mo6213a(C2242h hVar, List<Purchase> list) {
        MethodCollector.m26663i(9212);
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(hVar.f6732a, hVar.f6733b, (Purchase[]) list.toArray(new Purchase[list.size()]));
        MethodCollector.m26664o(9212);
    }
}
