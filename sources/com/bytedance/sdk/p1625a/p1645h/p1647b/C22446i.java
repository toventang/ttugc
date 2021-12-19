package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22433k;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1662m.C22496a;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.i */
public final class C22446i extends AbstractC22384h<C22292e> {

    /* renamed from: e */
    private C22507a f53067e;

    /* renamed from: f */
    private C22496a f53068f = new C22496a();

    /* renamed from: g */
    private JSONObject f53069g;

    static {
        Covode.recordClassIndex(26262);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22292e eVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (eVar.f52713b) {
                jSONObject.put("result", 1);
            } else {
                jSONObject.put("result", 0);
                jSONObject.put("errCode", eVar.f52715d);
                jSONObject.put("errDesc", eVar.f52717f);
            }
            C22455a.m42377b("passport_device_one_login", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42129a(this.f53068f, jSONObject);
        this.f53069g = jSONObject2;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53067e = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f53069g = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22292e mo36600a(boolean z, C22357b bVar) {
        C22292e eVar = new C22292e(z, 10037);
        if (z) {
            eVar.f52724j = this.f53067e;
        } else {
            eVar.f52715d = this.f53068f.f53181g;
            eVar.f52717f = this.f53068f.f53182h;
            eVar.f52730p = this.f53068f.f53187m;
            eVar.f52731q = this.f53068f.f53188n;
            eVar.f52733s = this.f53068f.f53190p;
            eVar.f52732r = this.f53068f.f53189o;
            eVar.f52729o = this.f53068f.f53186l;
            eVar.f52735u = this.f53068f.f53183i;
            eVar.f52728n = this.f53068f.f53184j;
        }
        eVar.f52719h = this.f53069g;
        return eVar;
    }

    public C22446i(Context context, C22355a aVar, AbstractC22433k kVar) {
        super(context, aVar, kVar);
    }
}
