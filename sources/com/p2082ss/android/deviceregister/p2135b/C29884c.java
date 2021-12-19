package com.p2082ss.android.deviceregister.p2135b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.b.c */
public class C29884c extends AbstractC29885d {
    static {
        Covode.recordClassIndex(36294);
    }

    public C29884c(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.deviceregister.p2135b.AbstractC29885d
    /* renamed from: a */
    public final void mo52172a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String a = this.f71303l.mo52153a();
                String b = this.f71303l.mo52156b();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("old_id", str);
                jSONObject.put("new_id", str2);
                if (this.f71301j) {
                    jSONObject.put("openudid", a);
                }
                jSONObject.put("clientudid", b);
                m60235a("did_change", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
