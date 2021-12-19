package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22317d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.bytedance.sdk.p1625a.p1664o.C22509b;
import com.p2082ss.android.account.C29346c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.d */
public final class C22395d extends AbstractC22384h<C22317d> {

    /* renamed from: e */
    private JSONObject f52947e;

    /* renamed from: f */
    private JSONObject f52948f;

    /* renamed from: g */
    private C22507a f52949g;

    static {
        Covode.recordClassIndex(26211);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22317d dVar) {
        C22455a.m42371a("passport_sdk_common_request", (String) null, (String) null, dVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52947e = jSONObject2;
        this.f52948f = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52947e = jSONObject;
        this.f52948f = jSONObject2;
        if (!TextUtils.isEmpty(jSONObject2.optString("user_id"))) {
            this.f52949g = C29346c.C29347a.m58778a(jSONObject);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C22317d mo36600a(boolean z, C22357b bVar) {
        C22317d dVar = new C22317d(z);
        if (!z) {
            dVar.f52715d = bVar.f52831b;
            dVar.f52717f = bVar.f52832c;
        } else {
            dVar.f52724j = this.f52949g;
        }
        dVar.f52719h = this.f52947e;
        dVar.f52748v = this.f52948f;
        if (z && bVar.f52830a.f52822d > 0) {
            String b = C22509b.m42458b(bVar.f52833d);
            Map<String, String> map = bVar.f52830a.f52821c;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("result", dVar.f52719h);
                jSONObject.put("data", dVar.f52748v);
                C22509b.m42455a().mo36782a(b, map, jSONObject.toString(), System.currentTimeMillis() + bVar.f52830a.f52822d);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dVar;
    }

    public C22395d(Context context, C22355a aVar, AbstractC22288a<C22317d> aVar2) {
        super(context, aVar, aVar2);
    }
}
