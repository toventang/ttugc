package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.datacenter.p1118c.C16057a;
import com.bytedance.ies.abmock.datacenter.p1118c.C16058b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.abmock.c */
public final class C16049c {

    /* renamed from: a */
    private static List<String> f38666a;

    static {
        Covode.recordClassIndex(18320);
        ArrayList arrayList = new ArrayList();
        f38666a = arrayList;
        arrayList.add("detail_cover_decode_config");
        f38666a.add("enable_add_poi_compliance");
        f38666a.add("poi_config");
        f38666a.add("request_location_permission");
    }

    /* renamed from: a */
    public static void m29650a() {
        for (String str : f38666a) {
            C16065e.m29769a().mo25492a(str);
            C16065e.m29769a().mo25492a(str);
            C16057a.f38676a.mo25462c(str);
            C16058b.f38679a.mo25480c(str);
        }
    }
}
