package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a */
public final class C45593a {

    /* renamed from: a */
    public Map<String, Object> f106171a;

    /* renamed from: b */
    public String f106172b;

    /* renamed from: c */
    public long f106173c = -1;

    /* renamed from: d */
    private final String f106174d;

    static {
        Covode.recordClassIndex(54090);
    }

    public C45593a(String str) {
        this.f106174d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f106171a = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        linkedHashMap.put("previous_page", "shipping_address");
        this.f106172b = "shipping_address";
        if (str != null) {
            linkedHashMap.put("page_info", str);
        }
    }
}
