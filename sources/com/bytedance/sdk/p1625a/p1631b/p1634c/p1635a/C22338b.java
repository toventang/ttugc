package com.bytedance.sdk.p1625a.p1631b.p1634c.p1635a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22333a;
import com.bytedance.sdk.p1625a.p1631b.p1633b.AbstractC22335a;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22340b;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22342d;
import com.bytedance.sdk.p1625a.p1631b.p1637e.C22345a;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.bytedance.sdk.p1625a.p1638c.p1640b.C22352a;
import com.bytedance.sdk.p1625a.p1638c.p1640b.C22353b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.b.c.a.b */
public final class C22338b implements AbstractC22335a.AbstractC22336a {

    /* renamed from: a */
    AbstractC22333a f52773a;

    /* renamed from: b */
    private final Context f52774b;

    static {
        Covode.recordClassIndex(26154);
    }

    /* renamed from: a */
    private static JSONObject m42055a(C22349c.C22350a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (aVar != null) {
                jSONObject.put("client_key", aVar.f52809c);
            }
            jSONObject.put("sdk_version", 7);
            jSONObject.put("params_for_special", "uc_login");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public C22338b(Context context, AbstractC22333a aVar) {
        this.f52773a = aVar;
        this.f52774b = context;
    }

    /* renamed from: a */
    private void m42057a(String str, JSONObject jSONObject) {
        try {
            if (this.f52773a != null && !TextUtils.isEmpty(str)) {
                this.f52773a.mo36676a(str, jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22334b
    /* renamed from: a */
    public final C22340b mo36679a(C22349c.C22350a aVar, String str, String str2) {
        C22340b bVar;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(null)) {
            str4 = aVar.f52812f;
        }
        List<String> a = C22353b.m42071a(this.f52774b, aVar.getCallerPackage());
        HashMap hashMap = new HashMap();
        hashMap.put("client_key", aVar.f52809c);
        hashMap.put("response_type", "code");
        hashMap.put("source", "native");
        hashMap.put("scope", str4);
        if (!TextUtils.isEmpty(aVar.f52810d)) {
            hashMap.put("from", aVar.f52810d);
        }
        if (TextUtils.equals("wap_to_native", aVar.f52810d) && !TextUtils.isEmpty(aVar.f52808b)) {
            hashMap.put("redirect_uri", aVar.f52808b);
        }
        if (!TextUtils.isEmpty(aVar.f52807a)) {
            hashMap.put("state", aVar.f52807a);
        }
        if (!TextUtils.isEmpty(aVar.getCallerPackage())) {
            hashMap.put("app_identity", C22352a.m42068a(aVar.getCallerPackage()));
        }
        String a2 = C22353b.m42070a(a);
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("signature", a2);
            hashMap.put("sign", a2);
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f52773a.mo36678b();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "/passport/open/auth/";
        }
        try {
            bVar = C22337a.m42049a(this.f52773a.mo36675a(new Uri.Builder().scheme("https").authority(str).path(str2).build().toString(), hashMap));
        } catch (Throwable th) {
            bVar = new C22340b();
            bVar.f52804u = C22345a.m42060a(this.f52773a, th);
        }
        int i = 0;
        String str5 = "fail";
        if (bVar == null) {
            i = -1;
            str3 = this.f52774b.getString(R.string.a3j);
        } else if (!bVar.f52803t) {
            i = bVar.f52804u;
            str3 = bVar.f52805v;
        } else {
            str3 = "";
            str5 = "success";
        }
        m42057a("platform_auth_code", m42056a(aVar, str5, i, str3));
        return bVar;
    }

    /* renamed from: a */
    private static JSONObject m42056a(C22349c.C22350a aVar, String str, int i, String str2) {
        try {
            JSONObject a = m42055a(aVar);
            if (a == null) {
                a = new JSONObject();
            }
            a.put("result", str);
            a.put("errCode", i);
            a.put("errDesc", str2);
            return a;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22334b
    /* renamed from: a */
    public final C22342d mo36680a(C22349c.C22350a aVar, String str, String str2, String str3) {
        C22342d dVar;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str = C22337a.m42050a(aVar);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f52773a.mo36678b();
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "/passport/open/auth_info/v2/";
        }
        try {
            dVar = C22337a.m42053b(this.f52773a.mo36674a(new Uri.Builder().scheme("https").authority(str2).path(str3).appendQueryParameter("client_key", aVar.f52809c).appendQueryParameter("scope", str).build().toString()));
        } catch (Throwable th) {
            dVar = new C22342d();
            dVar.f52804u = C22345a.m42060a(this.f52773a, th);
        }
        int i = 0;
        String str5 = "fail";
        if (dVar == null) {
            i = -1;
            str4 = this.f52774b.getString(R.string.a3j);
        } else if (!dVar.f52803t) {
            i = dVar.f52804u;
            str4 = dVar.f52805v;
        } else {
            str4 = "";
            str5 = "success";
        }
        m42057a("platform_auth_info", m42056a(aVar, str5, i, str4));
        return dVar;
    }
}
