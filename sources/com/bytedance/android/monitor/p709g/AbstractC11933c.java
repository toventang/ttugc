package com.bytedance.android.monitor.p709g;

import com.bytedance.android.monitor.p703a.AbstractC11904e;
import com.bytedance.android.monitor.p720m.C11999a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.g.c */
public abstract class AbstractC11933c extends AbstractC11932b implements AbstractC11904e {

    /* renamed from: a */
    public String f28550a;

    static {
        Covode.recordClassIndex(13659);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19150a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    @Override // com.bytedance.android.monitor.p703a.AbstractC11904e
    /* renamed from: a */
    public final void mo19113a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            C11999a.m21195a(jSONObject, "tag", "ttlive_sdk");
            C11999a.m21195a(jSONObject2, "aid", this.f28550a);
            C11999a.m21194a(jSONObject2, "extra", jSONObject);
            mo19150a(str, 0, null, jSONObject2);
        } catch (Exception unused) {
        }
    }
}
