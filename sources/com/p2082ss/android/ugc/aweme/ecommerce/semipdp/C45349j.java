package com.p2082ss.android.ugc.aweme.ecommerce.semipdp;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.j */
public final class C45349j {

    /* renamed from: a */
    final LinkedHashMap<String, Object> f105681a = new LinkedHashMap<>();

    /* renamed from: b */
    long f105682b = -1;

    /* renamed from: c */
    final HashMap<String, Object> f105683c;

    static {
        Covode.recordClassIndex(53808);
    }

    public C45349j(HashMap<String, Object> hashMap) {
        this.f105683c = hashMap;
    }

    /* renamed from: a */
    public final void mo76426a(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("glide_type", str);
        mo76429b("tiktokec_product_detail_page_glide", linkedHashMap);
    }

    /* renamed from: b */
    public final void mo76429b(String str, HashMap<String, Object> hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f105681a);
        linkedHashMap.putAll(hashMap);
        C45544c.m88082a(str, linkedHashMap);
    }

    /* renamed from: a */
    public final void mo76427a(String str, String str2) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("actionsheet_name", str2);
        }
        mo76429b("tiktokec_button_click", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo76428a(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("switch_type", str);
        linkedHashMap.putAll(hashMap);
        mo76429b("tiktokec_switch_app_result", linkedHashMap);
    }
}
