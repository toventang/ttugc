package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22429g;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1664o.C22517i;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.f */
public final class C22443f extends AbstractC22384h<C22291d<C22412g>> {

    /* renamed from: e */
    private C22412g f53064e;

    static {
        Covode.recordClassIndex(26259);
    }

    /* renamed from: a */
    private static C22355a.C22356a m42322a(C22412g gVar) {
        return new C22355a.C22356a().mo36708a(m42324b(gVar), gVar.f53000e);
    }

    /* renamed from: b */
    private static Map<String, String> m42324b(C22412g gVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(gVar.f52996a)) {
            hashMap.put("email", C13627m.m24501c(gVar.f52996a));
        }
        if (!TextUtils.isEmpty(gVar.f52997b)) {
            hashMap.put("captcha", gVar.f52997b);
        }
        hashMap.put(StringSet.type, C13627m.m24501c(String.valueOf(gVar.f52998c)));
        if (!TextUtils.isEmpty(gVar.f53002g)) {
            hashMap.put("password", C13627m.m24501c(gVar.f53002g));
        }
        if (!TextUtils.isEmpty(gVar.f52999d)) {
            hashMap.put("next", gVar.f52999d);
        }
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22412g> dVar) {
        C22455a.m42371a("passport_email_send_code", "email", this.f52931b.mo36704a(StringSet.type), dVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53064e.f53008m = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22412g> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 1024, this.f53064e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53064e, jSONObject);
        this.f53064e.f53008m = jSONObject2;
    }

    private C22443f(Context context, C22355a aVar, C22412g gVar, AbstractC22429g gVar2) {
        super(context, aVar, gVar2);
        this.f53064e = gVar;
    }

    /* renamed from: a */
    public static C22443f m42323a(Context context, String str, String str2, int i, Map map, AbstractC22429g gVar) {
        C22412g gVar2 = new C22412g(str, null, str2, i, null, map, null);
        C22355a.C22356a a = m42322a(gVar2);
        a.f52826a = C22517i.m42475a(C22306c.C22307a.m41972a("/passport/email/send_code/"), null);
        return new C22443f(context, a.mo36710c(), gVar2, gVar);
    }
}
