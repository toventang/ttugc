package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22295a;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22314a;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.a */
public final class C22392a extends AbstractC22384h<C22314a> {

    /* renamed from: e */
    private String f52943e;

    /* renamed from: f */
    private JSONObject f52944f;

    static {
        Covode.recordClassIndex(26208);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22314a aVar) {
        String str;
        C22314a aVar2 = aVar;
        if (!TextUtils.isEmpty(aVar2.f52714c)) {
            if (aVar2.f52714c.contains(C22306c.C22307a.m41972a("/passport/mobile/check_code/"))) {
                str = "passport_mobile_check_code";
            } else {
                str = "passport_email_check_code";
            }
            C22455a.m42371a(str, (String) null, (String) null, aVar2);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52944f = jSONObject2;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52943e = jSONObject2.optString("ticket");
        this.f52944f = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22314a mo36600a(boolean z, C22357b bVar) {
        C22314a aVar = new C22314a(z);
        if (z) {
            aVar.f52739j = this.f52943e;
        } else {
            aVar.f52715d = bVar.f52831b;
            aVar.f52717f = bVar.f52832c;
        }
        aVar.f52719h = this.f52944f;
        return aVar;
    }

    public C22392a(Context context, C22355a aVar, AbstractC22295a aVar2) {
        super(context, aVar, aVar2);
    }
}
