package com.p2082ss.android.sdk.webview.p2175a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a.a */
public final class C30233a implements AbstractC18293d {

    /* renamed from: a */
    private AbstractC30234a f72147a;

    /* renamed from: com.ss.android.sdk.webview.a.a$a */
    public interface AbstractC30234a {
        static {
            Covode.recordClassIndex(36745);
        }

        /* renamed from: b */
        void mo53689b(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(36744);
    }

    public C30233a(AbstractC30234a aVar) {
        this.f72147a = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        AbstractC30234a aVar = this.f72147a;
        if (aVar != null) {
            aVar.mo53689b(jSONObject);
        }
    }
}
