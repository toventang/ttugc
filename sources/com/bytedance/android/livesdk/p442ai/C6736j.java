package com.bytedance.android.livesdk.p442ai;

import com.bytedance.android.live.p250i.p251a.AbstractC4356c;
import com.bytedance.android.livesdk.p442ai.p444b.AbstractC6713a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.ai.j */
public final /* synthetic */ class C6736j implements AbstractC6713a {

    /* renamed from: a */
    private final C6730i f16715a;

    static {
        Covode.recordClassIndex(7474);
    }

    C6736j(C6730i iVar) {
        this.f16715a = iVar;
    }

    @Override // com.bytedance.android.livesdk.p442ai.p444b.AbstractC6713a
    /* renamed from: a */
    public final void mo12868a(JSONObject jSONObject, String str) {
        AbstractC4356c cVar;
        C6730i iVar = this.f16715a;
        if (jSONObject != null) {
            if (iVar.f16695k != null) {
                try {
                    for (Map.Entry<String, String> entry : iVar.f16695k.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            iVar.mo12913a(jSONObject);
            if (iVar.f16691g == null || (cVar = iVar.f16691g.get()) == null) {
                iVar.f16690f.mo10107a(jSONObject, str);
            } else {
                cVar.mo10107a(jSONObject, str);
            }
            if (iVar.f16694j != null) {
                iVar.f16694j.mo18429a(jSONObject);
            }
        }
    }
}
