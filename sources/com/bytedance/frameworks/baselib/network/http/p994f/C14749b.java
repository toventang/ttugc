package com.bytedance.frameworks.baselib.network.http.p994f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14758h;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C90029ac;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.f.b */
public class C14749b {

    /* renamed from: l */
    public static final /* synthetic */ boolean f35936l = true;

    /* renamed from: m */
    private static volatile C14749b f35937m;

    /* renamed from: n */
    private static final String f35938n = C14749b.class.getSimpleName();

    /* renamed from: a */
    public String f35939a = "";

    /* renamed from: b */
    public String f35940b = "";

    /* renamed from: c */
    public String f35941c = "";

    /* renamed from: d */
    public String f35942d = "";

    /* renamed from: e */
    public String f35943e = "";

    /* renamed from: f */
    public String f35944f = "";

    /* renamed from: g */
    public List<String> f35945g = new ArrayList();

    /* renamed from: h */
    public Context f35946h;

    /* renamed from: i */
    public boolean f35947i = false;

    /* renamed from: j */
    public boolean f35948j = false;

    /* renamed from: k */
    public AbstractC14748a f35949k;

    /* renamed from: o */
    private List<String> f35950o = new ArrayList();

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f.b$a */
    public interface AbstractC14750a {
        static {
            Covode.recordClassIndex(16847);
        }

        /* renamed from: a */
        void mo23630a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    static {
        Covode.recordClassIndex(16846);
    }

    private C14749b() {
    }

    /* renamed from: a */
    public static C14749b m27031a() {
        MethodCollector.m26663i(8040);
        if (f35937m == null) {
            synchronized (C14749b.class) {
                try {
                    if (f35937m == null) {
                        f35937m = new C14749b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8040);
                    throw th;
                }
            }
        }
        C14749b bVar = f35937m;
        MethodCollector.m26664o(8040);
        return bVar;
    }

    /* renamed from: b */
    public final void mo23765b() {
        if (!this.f35942d.isEmpty()) {
            this.f35939a = this.f35942d;
            this.f35943e = "uid";
        } else if (!this.f35941c.isEmpty()) {
            this.f35939a = this.f35941c;
            this.f35943e = "did";
        } else if (!this.f35944f.isEmpty()) {
            this.f35939a = this.f35944f;
            this.f35943e = "local";
        } else {
            this.f35943e = "none";
            this.f35939a = "";
        }
    }

    /* renamed from: a */
    public static boolean m27033a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("uid") || str.equals("did")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo23766b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : this.f35950o) {
            if (C14759i.m27069a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m27032a(HttpURLConnection httpURLConnection, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            return httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    /* renamed from: a */
    public final String mo23762a(C90029ac acVar, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str);
            jSONObject2.put("headers", acVar.f204110f.toString());
            jSONObject.put("base", jSONObject2);
            jSONObject.put("report_time", System.currentTimeMillis());
            jSONObject.put("store_idc", this.f35940b);
            jSONObject.put("store_region", this.f35939a);
            jSONObject.put("source", this.f35943e);
            jSONObject.put("did_region", this.f35941c);
            jSONObject.put("uid_region", this.f35942d);
            jSONObject.put("local", this.f35944f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public final void mo23763a(Request request, Request.C22024a aVar, List<C22027b> list) {
        if (!TextUtils.isEmpty(request.getPath())) {
            for (String str : this.f35950o) {
                if (C14759i.m27069a(request.getPath(), str)) {
                    if (!this.f35941c.isEmpty()) {
                        list.add(new C22027b("x-tt-store-region-did", this.f35941c));
                    } else {
                        list.add(new C22027b("x-tt-store-region-did", "none"));
                    }
                    if (!this.f35942d.isEmpty()) {
                        list.add(new C22027b("x-tt-store-region-uid", this.f35942d));
                    } else {
                        list.add(new C22027b("x-tt-store-region-uid", "none"));
                    }
                    C14758h hVar = new C14758h(request.getUrl());
                    hVar.mo23779a("okhttp_version", "4.0.71.7-tiktok");
                    aVar.mo35838a(hVar.mo23776a());
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo23764a(String str, String str2, Context context, AbstractC14748a aVar) {
        if (!TextUtils.isEmpty(str2) && context != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONArray optJSONArray = jSONObject.optJSONArray("update_store_idc_path_list");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        this.f35950o.add(string);
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("add_store_idc_host_list");
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String string2 = optJSONArray2.getString(i2);
                    if (!TextUtils.isEmpty(string2)) {
                        this.f35945g.add(string2);
                    }
                }
                this.f35946h = context;
                this.f35949k = aVar;
                if (!TextUtils.isEmpty(str)) {
                    this.f35944f = str;
                }
                if (!(this.f35950o.isEmpty() || this.f35950o.isEmpty())) {
                    this.f35947i = true;
                    SharedPreferences a = C34822d.m71158a(this.f35946h, "ttnet_store_region", 0);
                    this.f35940b = a.getString("store_idc", "");
                    this.f35939a = a.getString("store_region", "");
                    this.f35942d = a.getString("store_region_uid", "");
                    this.f35941c = a.getString("store_region_did", "");
                    this.f35943e = a.getString("store_region_src", "");
                    this.f35948j = a.getBoolean("disable_store_region", false);
                    mo23765b();
                    this.f35949k.mo23760a(this.f35940b, this.f35939a, this.f35943e);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
