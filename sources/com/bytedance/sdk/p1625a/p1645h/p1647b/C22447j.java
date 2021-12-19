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
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22434l;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.j */
public final class C22447j extends AbstractC22384h<C22291d<C22419n>> {

    /* renamed from: e */
    private C22419n f53070e;

    static {
        Covode.recordClassIndex(26263);
    }

    /* renamed from: a */
    private static C22355a.C22356a m42341a(C22419n nVar) {
        return new C22355a.C22356a().mo36708a(m42343b(nVar), nVar.f53046z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22419n> dVar) {
        C22455a.m42371a("passport_mobile_sendcode", "mobile", this.f52931b.mo36704a(StringSet.type), dVar);
    }

    /* renamed from: b */
    private static Map<String, String> m42343b(C22419n nVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(nVar.f53033a)) {
            hashMap.put("mobile", C13627m.m24501c(nVar.f53033a));
        }
        if (!TextUtils.isEmpty(nVar.f53039g)) {
            hashMap.put("old_mobile", C13627m.m24501c(nVar.f53039g));
        }
        if (!TextUtils.isEmpty(nVar.f53034b)) {
            hashMap.put("captcha", nVar.f53034b);
        }
        hashMap.put(StringSet.type, C13627m.m24501c(String.valueOf(nVar.f53037e)));
        hashMap.put("unbind_exist", C13627m.m24501c(String.valueOf(nVar.f53038f)));
        hashMap.put("mix_mode", "1");
        if (nVar.f53032A == 1) {
            hashMap.put("check_register", "1");
        } else if (nVar.f53032A == 0) {
            hashMap.put("check_register", "0");
        }
        if (!TextUtils.isEmpty(nVar.f53041u)) {
            hashMap.put("ticket", nVar.f53041u);
        }
        hashMap.put("auto_read", String.valueOf(nVar.f53042v));
        if (!TextUtils.isEmpty(nVar.f53043w)) {
            hashMap.put("shark_ticket", nVar.f53043w);
        }
        if (!TextUtils.isEmpty(nVar.f53045y)) {
            hashMap.put("auth_token", nVar.f53045y);
        }
        if (!TextUtils.isEmpty(nVar.f53044x)) {
            hashMap.put("unusable_mobile_ticket", nVar.f53044x);
        }
        return hashMap;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22419n> mo36600a(boolean z, C22357b bVar) {
        if (z) {
            this.f53070e.f53003h = 0;
            this.f53070e.f53005j = "";
            this.f53070e.f53004i = 0;
        }
        return new C22291d(z, 1002, this.f53070e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53070e.f53040t = jSONObject2.optInt("retry_time", 30);
        this.f53070e.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53070e, jSONObject);
        this.f53070e.f53008m = jSONObject2;
    }

    private C22447j(Context context, C22355a aVar, C22419n nVar, AbstractC22434l lVar) {
        super(context, aVar, lVar);
        this.f53070e = nVar;
    }

    /* renamed from: a */
    public static C22447j m42342a(Context context, String str, int i, String str2, int i2, int i3, String str3, String str4, Map map, AbstractC22434l lVar) {
        C22419n nVar = new C22419n(str, i, 0, str2, i2, i3, str3, str4, map);
        C22355a.C22356a a = m42341a(nVar);
        a.f52826a = C22306c.C22307a.m41972a("/passport/mobile/send_code/v1/");
        return new C22447j(context, a.mo36710c(), nVar, lVar);
    }
}
