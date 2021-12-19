package com.bytedance.bpea.core.checker.p871a;

import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13347h;
import com.bytedance.bpea.core.p872d.C13382a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.checker.a.f */
public final class C13375f extends AbstractC13370a {

    /* renamed from: c */
    private List<String> f32678c = new ArrayList();

    static {
        Covode.recordClassIndex(15372);
    }

    public C13375f() {
        super(EnumC13372c.ENTRY_VERIFY);
    }

    @Override // com.bytedance.bpea.core.checker.p871a.AbstractC13370a
    /* renamed from: a */
    public final void mo21617a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("allowList");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        List<String> list = this.f32678c;
                        String optString = optJSONArray.optString(i);
                        C89219l.m154709a((Object) optString, "");
                        list.add(optString);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.bpea.core.checker.p871a.AbstractC13371b
    /* renamed from: a */
    public final C13347h mo21619a(C13345f fVar) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c("methodName", "");
        Object obj = fVar.f32615e.get("methodName");
        if (obj == null) {
            obj = fVar.f32611a;
        }
        if ((!this.f32678c.isEmpty()) && obj != null) {
            boolean z = false;
            Iterator<T> it = this.f32678c.iterator();
            while (it.hasNext()) {
                if (C89219l.m154714a(obj, (Object) it.next())) {
                    z = true;
                }
            }
            if (!z) {
                throw new C13340a(-2001, "entryToken verify fail");
            }
        }
        return C13382a.C13383a.m24066a();
    }
}
