package com.p2082ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.a */
public final class C45553a {

    /* renamed from: a */
    public static final C45553a f106092a = new C45553a();

    private C45553a() {
    }

    static {
        Covode.recordClassIndex(54046);
    }

    /* renamed from: a */
    public static void m88104a(C45544c.C45545a aVar, Map<String, ? extends Object> map, ProductPackStruct productPackStruct, SkuPrice skuPrice, int i, String str) {
        String str2;
        String str3;
        String str4;
        float f;
        Object obj;
        SellerInfo sellerInfo;
        String str5;
        Price realPrice;
        Price realPrice2;
        String priceVal;
        Float c;
        Price realPrice3;
        String priceVal2;
        Float c2;
        ProductBase productBase;
        String str6 = "";
        C89219l.m154721d(aVar, str6);
        C89219l.m154721d(map, str6);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("author_id", map.get("author_id"));
        Object obj2 = map.get("source_page_type");
        if (C89219l.m154714a(obj2, (Object) "video")) {
            str2 = "ShortVideo";
        } else if (C89219l.m154714a(obj2, (Object) "live")) {
            str2 = "Live";
        } else if (C89219l.m154714a(obj2, (Object) "show_window")) {
            str2 = "ShowCase";
        } else {
            str2 = "Else";
        }
        jSONObject.put("screen_refer", str2);
        Object obj3 = map.get("source_page_type");
        if (C89219l.m154714a(obj3, (Object) "video")) {
            jSONObject.put("feed_id", map.get("source_content_id"));
        } else if (!C89219l.m154714a(obj3, (Object) "live")) {
            jSONObject.put("source_page_type", map.get("source_content_id"));
        } else if (map.get("room_id") != null) {
            jSONObject.put("room_id", map.get("room_id"));
        } else {
            jSONObject.put("room_id", map.get("source_content_id"));
        }
        if (productPackStruct == null || (str3 = productPackStruct.f104674b) == null) {
            str3 = str6;
        }
        jSONObject.put("content_id", str3);
        if (productPackStruct == null || (productBase = productPackStruct.f104677e) == null || (str4 = productBase.f104657a) == null) {
            str4 = str6;
        }
        jSONObject.put("content_name", str4);
        jSONObject.put("quantity", i);
        float f2 = 0.0f;
        if (skuPrice == null || (realPrice3 = skuPrice.getRealPrice()) == null || (priceVal2 = realPrice3.getPriceVal()) == null || (c2 = C89361p.m154861c(priceVal2)) == null) {
            f = 0.0f;
        } else {
            f = c2.floatValue();
        }
        jSONObject.put("discount_price", Float.valueOf(f));
        jSONObject.put("content_type", "product");
        jSONObject.put("page_type", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        aVar.mo76752b("contents", jSONArray);
        if (!(skuPrice == null || (realPrice2 = skuPrice.getRealPrice()) == null || (priceVal = realPrice2.getPriceVal()) == null || (c = C89361p.m154861c(priceVal)) == null)) {
            f2 = c.floatValue();
        }
        aVar.mo76752b("value", Float.valueOf(f2 * ((float) i)));
        aVar.mo76752b("quantity", Integer.valueOf(i));
        if (skuPrice == null || (realPrice = skuPrice.getRealPrice()) == null || (obj = realPrice.getCurrency()) == null) {
            obj = str6;
        }
        aVar.mo76752b("currency", obj);
        aVar.mo76752b("is_ad_signal", 1);
        if (!(productPackStruct == null || (sellerInfo = productPackStruct.f104676d) == null || (str5 = sellerInfo.f104704a) == null)) {
            str6 = str5;
        }
        aVar.mo76752b("shop_id", str6);
    }
}
