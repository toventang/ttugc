package com.bytedance.android.monitor.p706d;

import com.bytedance.android.monitor.p704b.AbstractC11907a;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.d.b */
public final class C11918b extends AbstractC11907a {

    /* renamed from: a */
    public final List<Map<String, Object>> f28468a;

    static {
        Covode.recordClassIndex(13644);
    }

    public C11918b(List<Map<String, Object>> list) {
        C89219l.m154719c(list, "");
        this.f28468a = list;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        Iterator<T> it = this.f28468a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : it.next().entrySet()) {
                C11950d.m21100a(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
    }
}
