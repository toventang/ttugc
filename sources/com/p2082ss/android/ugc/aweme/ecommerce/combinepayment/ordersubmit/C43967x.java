package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2835a.C44323a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43321d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import org.json.JSONObject;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x */
public final class C43967x {

    /* renamed from: a */
    public static final C43967x f102492a = new C43967x();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x$b */
    public static final class C43969b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f102493a;

        /* renamed from: b */
        int f102494b;

        /* renamed from: c */
        final /* synthetic */ C43967x f102495c;

        /* renamed from: d */
        Object f102496d;

        /* renamed from: e */
        Object f102497e;

        /* renamed from: f */
        Object f102498f;

        /* renamed from: g */
        Object f102499g;

        /* renamed from: h */
        Object f102500h;

        /* renamed from: i */
        Object f102501i;

        /* renamed from: j */
        Object f102502j;

        /* renamed from: k */
        Object f102503k;

        /* renamed from: l */
        Object f102504l;

        /* renamed from: m */
        Object f102505m;

        static {
            Covode.recordClassIndex(52259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43969b(C43967x xVar, AbstractC89124d dVar) {
            super(dVar);
            this.f102495c = xVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f102493a = obj;
            this.f102494b |= Integer.MIN_VALUE;
            return this.f102495c.mo74831a(null, null, null, null, null, null, null, false, this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x$a */
    public static final class C43968a extends C27895a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(52258);
        }

        C43968a() {
        }
    }

    private C43967x() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74831a(kotlinx.coroutines.AbstractC89516am r23, android.content.Context r24, com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r25, com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r26, com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState r27, com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam r28, java.util.List<java.lang.String> r29, boolean r30, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r31) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43967x.mo74831a(kotlinx.coroutines.am, android.content.Context, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam, java.util.List, boolean, h.c.d):java.lang.Object");
    }

    static {
        Covode.recordClassIndex(52257);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x$c */
    static final class C43970c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f102506a;

        /* renamed from: b */
        final /* synthetic */ Context f102507b;

        /* renamed from: c */
        final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult f102508c;

        /* renamed from: d */
        final /* synthetic */ ProductPackStruct f102509d;

        /* renamed from: e */
        final /* synthetic */ SkuPanelState f102510e;

        /* renamed from: f */
        final /* synthetic */ IPdpStarter.PdpEnterParam f102511f;

        /* renamed from: g */
        final /* synthetic */ List f102512g;

        /* renamed from: h */
        final /* synthetic */ boolean f102513h;

        /* renamed from: i */
        private /* synthetic */ Object f102514i;

        static {
            Covode.recordClassIndex(52260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43970c(Context context, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, ProductPackStruct productPackStruct, SkuPanelState skuPanelState, IPdpStarter.PdpEnterParam pdpEnterParam, List list, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f102507b = context;
            this.f102508c = packedDeliverySelectResult;
            this.f102509d = productPackStruct;
            this.f102510e = skuPanelState;
            this.f102511f = pdpEnterParam;
            this.f102512g = list;
            this.f102513h = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C43970c cVar = new C43970c(this.f102507b, this.f102508c, this.f102509d, this.f102510e, this.f102511f, this.f102512g, this.f102513h, dVar);
            cVar.f102514i = obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C43970c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f102506a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C43967x xVar = C43967x.f102492a;
                Context context = this.f102507b;
                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.f102508c;
                ProductPackStruct productPackStruct = this.f102509d;
                SkuPanelState skuPanelState = this.f102510e;
                IPdpStarter.PdpEnterParam pdpEnterParam = this.f102511f;
                List<String> list = this.f102512g;
                boolean z = this.f102513h;
                this.f102506a = 1;
                if (xVar.mo74831a((AbstractC89516am) this.f102514i, context, packedDeliverySelectResult, productPackStruct, skuPanelState, pdpEnterParam, list, z, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m86842a(HashMap<String, Object> hashMap) {
        Map map = null;
        try {
            C27910f fVar = new C27910f();
            Object obj = hashMap != null ? hashMap.get("entrance_info") : null;
            if (obj != null) {
                map = (Map) fVar.mo46671a((String) obj, new C43968a().type);
                List<String> list = C43321d.m86440a().f101113a;
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (list.contains(entry.getKey())) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                }
                String jSONObject2 = jSONObject.toString();
                C89219l.m154716b(jSONObject2, "");
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0072, code lost:
        if (r1.length() == 0) goto L_0x0074;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.Object> m86843a(com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam r5, com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43967x.m86843a(com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct, boolean):java.util.HashMap");
    }

    /* renamed from: a */
    private static void m86844a(Context context, OrderSubmitEnterParams orderSubmitEnterParams, String str) {
        if (str == null || str.length() == 0) {
            str = "aweme://ec/order_submit_v2";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("requestParams", orderSubmitEnterParams.getRequestParams());
        linkedHashMap.put("buy_type", Integer.valueOf(orderSubmitEnterParams.getBuyType()));
        List<Region> combinedArea = orderSubmitEnterParams.getCombinedArea();
        if (combinedArea != null) {
            linkedHashMap.put("combinedArea", combinedArea);
        }
        String chainKey = orderSubmitEnterParams.getChainKey();
        if (chainKey != null) {
            linkedHashMap.put("chainKey", chainKey);
        }
        BillInfoResponse billInfoResp = orderSubmitEnterParams.getBillInfoResp();
        if (billInfoResp != null) {
            linkedHashMap.put("response", billInfoResp);
        }
        HashMap<String, Object> trackParams = orderSubmitEnterParams.getTrackParams();
        if (trackParams != null) {
            linkedHashMap.put("trackParams", trackParams);
        }
        String repoId = orderSubmitEnterParams.getRepoId();
        if (repoId != null) {
            linkedHashMap.put("repoId", repoId);
        }
        C45264j.m87843a(context, str, linkedHashMap, false).open();
    }

    /* renamed from: a */
    private static BillInfoRequest m86841a(DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, ProductPackStruct productPackStruct, SkuPanelState skuPanelState, IPdpStarter.PdpEnterParam pdpEnterParam, List<String> list) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        HashMap<String, Object> hashMap;
        Object obj;
        HashMap<String, Object> hashMap2;
        Integer num2;
        LogisticDTO logisticDTO;
        String str5;
        String str6;
        HashMap<String, Object> hashMap3;
        VoucherInfo voucherInfo;
        LogisticDTO logisticDTO2;
        LogisticDTO logisticDTO3;
        LogisticDTO logisticDTO4;
        HashMap<String, Object> trackParams;
        SellerInfo sellerInfo;
        SkuVoucher skuVoucher = null;
        if (packedDeliverySelectResult != null) {
            str = packedDeliverySelectResult.f103422b;
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (productPackStruct == null || (sellerInfo = productPackStruct.f104676d) == null) {
            str2 = null;
        } else {
            str2 = sellerInfo.f104704a;
        }
        ArrayList arrayList2 = new ArrayList();
        if (productPackStruct != null) {
            str3 = productPackStruct.f104674b;
        } else {
            str3 = null;
        }
        if (skuPanelState != null) {
            str4 = skuPanelState.getSkuId();
            num = skuPanelState.getProductQuantity();
        } else {
            str4 = null;
            num = null;
        }
        if (pdpEnterParam != null) {
            hashMap = pdpEnterParam.getTrackParams();
        } else {
            hashMap = null;
        }
        Integer valueOf = Integer.valueOf(IPdpStarter.C44631a.m87368a(hashMap));
        if (pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null) {
            obj = null;
        } else {
            obj = trackParams.get("author_id");
        }
        String valueOf2 = String.valueOf(obj);
        if (pdpEnterParam != null) {
            hashMap2 = pdpEnterParam.getTrackParams();
        } else {
            hashMap2 = null;
        }
        arrayList2.add(new OrderSKUDTO(str3, str4, num, null, valueOf, null, m86842a(hashMap2), null, valueOf2, 168));
        if (packedDeliverySelectResult != null && (logisticDTO4 = packedDeliverySelectResult.f103421a) != null) {
            num2 = Integer.valueOf(logisticDTO4.f103614a);
        } else if (productPackStruct == null || (logisticDTO = productPackStruct.f104681i) == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(logisticDTO.f103614a);
        }
        if (packedDeliverySelectResult == null || (logisticDTO3 = packedDeliverySelectResult.f103421a) == null || (str5 = logisticDTO3.f103624k) == null) {
            if (productPackStruct == null || (logisticDTO2 = productPackStruct.f104681i) == null) {
                str5 = null;
            } else {
                str5 = logisticDTO2.f103624k;
            }
        }
        if (skuPanelState != null) {
            str6 = skuPanelState.getWarehouseId();
        } else {
            str6 = null;
        }
        arrayList.add(new OrderShopDigest(str6, str2, arrayList2, num2, str5));
        if (pdpEnterParam != null) {
            hashMap3 = pdpEnterParam.getOrderRequestParams();
        } else {
            hashMap3 = null;
        }
        if (productPackStruct != null) {
            voucherInfo = productPackStruct.f104684l;
        } else {
            voucherInfo = null;
        }
        if (skuPanelState != null) {
            skuVoucher = skuPanelState.getVoucherInfo();
        }
        return new BillInfoRequest(str, 0, arrayList, true, true, true, true, null, null, C44323a.m87049a(voucherInfo, skuVoucher), true, null, hashMap3, null, list, 8194, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        if (r15 != null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m86845a(android.content.Context r14, com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r15, com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r16, com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState r17, com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam r18, boolean r19, p4600h.p4611f.p4612a.AbstractC89172b<? super java.util.List<java.lang.String>, p4600h.C89391z> r20) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43967x.m86845a(android.content.Context, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam, boolean, h.f.a.b):void");
    }
}
