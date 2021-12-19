package com.p2082ss.android.sdk.webview.p2175a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a.b */
public final class C30235b implements AbstractC18293d {

    /* renamed from: a */
    private AbstractC30236a f72148a;

    /* renamed from: com.ss.android.sdk.webview.a.b$a */
    public interface AbstractC30236a {
        static {
            Covode.recordClassIndex(36747);
        }

        /* renamed from: a */
        void mo53684a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(36746);
    }

    public C30235b(AbstractC30236a aVar) {
        this.f72148a = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        AbstractC30236a aVar = this.f72148a;
        if (aVar != null) {
            aVar.mo53684a(jSONObject);
        }
    }
}
