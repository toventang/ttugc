package com.bytedance.android.monitorV2.p731d;

import com.bytedance.android.monitorV2.p728a.AbstractC12066a;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.d.b */
public final class C12082b extends AbstractC12066a {

    /* renamed from: a */
    public final List<Map<String, Object>> f28949a;

    static {
        Covode.recordClassIndex(13811);
    }

    public C12082b(List<Map<String, Object>> list) {
        C89219l.m154719c(list, "");
        this.f28949a = list;
    }

    public C12082b(Map<String, ? extends Object> map) {
        this(new ArrayList());
        if (map != null) {
            this.f28949a.add(map);
        }
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        Iterator<T> it = this.f28949a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : it.next().entrySet()) {
                C12130f.m21651a(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
    }
}
