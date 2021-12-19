package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22293f;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22438p;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1662m.C22496a;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.o */
public final class C22453o extends AbstractC22384h<C22293f> {

    /* renamed from: e */
    private C22454a f53077e;

    static {
        Covode.recordClassIndex(26269);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22293f fVar) {
        C22455a.m42371a("passport_mobile_validate_code_v1", (String) null, (String) null, fVar);
    }

    /* renamed from: a */
    public static Map<String, String> m42366a(C22454a aVar) {
        HashMap hashMap = new HashMap();
        String str = "1";
        hashMap.put("mix_mode", str);
        hashMap.put("fixed_mix_mode", str);
        hashMap.put("code", C13627m.m24501c(Uri.encode(aVar.f53079b)));
        hashMap.put(StringSet.type, C13627m.m24501c(String.valueOf(aVar.f53081d)));
        if (!aVar.f53080c) {
            str = "0";
        }
        hashMap.put("need_ticket", str);
        if (aVar.f53082e > 0) {
            hashMap.put("scene", String.valueOf(aVar.f53082e));
        }
        if (!TextUtils.isEmpty(aVar.f53083f)) {
            hashMap.put("shark_ticket", aVar.f53083f);
        }
        return hashMap;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42129a(this.f53077e, jSONObject);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            this.f53077e.f53078a = jSONObject2.optString("ticket", "");
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22293f mo36600a(boolean z, C22357b bVar) {
        C22293f fVar = new C22293f(z);
        if (z) {
            fVar.f52736j = this.f53077e.f53078a;
        } else {
            fVar.f52715d = this.f53077e.f53181g;
            fVar.f52717f = this.f53077e.f53182h;
        }
        return fVar;
    }

    /* renamed from: com.bytedance.sdk.a.h.b.o$a */
    public static class C22454a extends C22496a {

        /* renamed from: a */
        String f53078a;

        /* renamed from: b */
        public String f53079b;

        /* renamed from: c */
        public boolean f53080c;

        /* renamed from: d */
        public int f53081d;

        /* renamed from: e */
        public int f53082e;

        /* renamed from: f */
        public String f53083f;

        static {
            Covode.recordClassIndex(26270);
        }

        public C22454a(String str, boolean z, int i) {
            this.f53079b = str;
            this.f53080c = false;
            this.f53081d = 23;
        }

        public C22454a(String str, boolean z, int i, int i2, String str2) {
            this.f53079b = str;
            this.f53080c = true;
            this.f53081d = i;
            this.f53082e = i2;
            this.f53083f = str2;
        }
    }

    public C22453o(Context context, C22355a aVar, C22454a aVar2, AbstractC22438p pVar) {
        super(context, aVar, pVar);
        this.f53077e = aVar2;
    }

    /* renamed from: a */
    public static C22453o m42365a(Context context, String str, int i, int i2, String str2, Map<String, String> map, AbstractC22438p pVar) {
        C22454a aVar = new C22454a(str, true, i, i2, str2);
        C22355a.C22356a aVar2 = new C22355a.C22356a();
        aVar2.f52826a = C22306c.C22307a.m41972a("/passport/mobile/validate_code/v1/");
        return new C22453o(context, aVar2.mo36708a(m42366a(aVar), map).mo36710c(), aVar, pVar);
    }
}
