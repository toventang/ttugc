package com.p2082ss.videoarch.p4474a.p4477c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.a.c.b */
public final class C87131b {

    /* renamed from: a */
    public JSONObject f196890a;

    /* renamed from: b */
    public String f196891b;

    /* renamed from: c */
    public String f196892c;

    /* renamed from: d */
    public boolean f196893d;

    /* renamed from: e */
    public int f196894e;

    /* renamed from: f */
    public int f196895f;

    /* renamed from: g */
    public int f196896g;

    /* renamed from: h */
    public boolean f196897h;

    /* renamed from: i */
    public int f196898i;

    /* renamed from: j */
    public int f196899j;

    /* renamed from: k */
    public int f196900k;

    /* renamed from: l */
    public int f196901l;

    /* renamed from: m */
    public String f196902m = "";

    /* renamed from: n */
    private JSONObject f196903n;

    /* renamed from: o */
    private int f196904o;

    /* renamed from: p */
    private long f196905p = -1;

    /* renamed from: q */
    private int f196906q = -1;

    /* renamed from: r */
    private String f196907r;

    /* renamed from: s */
    private String f196908s;

    /* renamed from: t */
    private String f196909t = "";

    /* renamed from: u */
    private String f196910u = "";

    /* renamed from: v */
    private final String f196911v = "LiveStreamInfo";

    /* renamed from: w */
    private int f196912w;

    static {
        Covode.recordClassIndex(102932);
    }

    /* renamed from: a */
    public final JSONObject mo140914a() {
        JSONObject jSONObject = this.f196890a;
        JSONObject jSONObject2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("auto");
            return jSONObject2;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject2;
        }
    }

    /* renamed from: b */
    public final String mo140920b() {
        JSONObject jSONObject = this.f196890a;
        if (jSONObject == null || !jSONObject.has("rule_ids")) {
            return null;
        }
        return this.f196890a.optString("rule_ids");
    }

    /* renamed from: c */
    public final String mo140925c() {
        JSONObject jSONObject = this.f196890a;
        if (jSONObject == null || !jSONObject.has("session_id")) {
            return null;
        }
        return this.f196890a.optString("session_id");
    }

    /* renamed from: e */
    private String m150973e() {
        JSONObject jSONObject = this.f196890a;
        if (jSONObject != null && jSONObject.has("query")) {
            StringBuilder sb = new StringBuilder();
            try {
                JSONObject jSONObject2 = this.f196890a.getJSONObject("query");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject2.getString(next);
                    String encode = URLEncoder.encode(next, "UTF-8");
                    sb.append("&").append(encode).append("=").append(URLEncoder.encode(string, "UTF-8"));
                }
                return sb.toString();
            } catch (UnsupportedEncodingException | JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: d */
    public final Map<String, String> mo140929d() {
        JSONObject jSONObject = this.f196890a;
        if (jSONObject != null && jSONObject.has("header")) {
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject2 = this.f196890a.getJSONObject("header");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
                return hashMap;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m150976g(String str) {
        if (TextUtils.isEmpty(str) || !str.equals("auto") || TextUtils.isEmpty(this.f196891b)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo140930d(String str) {
        JSONObject jSONObject = this.f196903n;
        if (jSONObject == null) {
            return false;
        }
        try {
            if (jSONObject.getJSONObject(str) != null) {
                return true;
            }
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public C87131b(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            this.f196903n = jSONObject.getJSONObject("data");
            if (jSONObject.has("common")) {
                this.f196890a = jSONObject.getJSONObject("common");
            }
            JSONObject jSONObject2 = this.f196890a;
            if (jSONObject2 != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("auto");
                if (jSONObject3 != null && jSONObject3.has("default")) {
                    this.f196891b = jSONObject3.getString("default");
                }
                this.f196897h = true;
                if (jSONObject3 != null && jSONObject3.has("list") && (optJSONArray = jSONObject3.optJSONArray("list")) != null && optJSONArray.length() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= optJSONArray.length()) {
                            break;
                        } else if (!mo140930d(optJSONArray.getString(i))) {
                            this.f196897h = false;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f196904o = 0;
    }

    /* renamed from: a */
    public static String m150971a(String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (!jSONObject2.has("adaptationSet") || (jSONObject = jSONObject2.getJSONObject("adaptationSet")) == null || !jSONObject.has("representation") || (jSONArray = jSONObject.getJSONArray("representation")) == null) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3.has("defaultSelect") && jSONObject3.has("url") && jSONObject3.optInt("defaultSelect") == 1) {
                    return jSONObject3.getString("url");
                }
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo140923b(String str) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        if (mo140930d(str)) {
            this.f196891b = str;
        }
    }

    /* renamed from: e */
    private boolean m150974e(String str) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        if (!mo140930d(str)) {
            return false;
        }
        try {
            JSONObject a = mo140914a();
            if (a != null) {
                if (a.has("list")) {
                    JSONArray optJSONArray = a.optJSONArray("list");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            String string = optJSONArray.getString(i);
                            if (string != null && string.equals(str)) {
                                if (!string.equals("origin")) {
                                    return true;
                                }
                                if (this.f196893d) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private String m150975f(String str) {
        int indexOf;
        int indexOf2 = str.indexOf(".com");
        int indexOf3 = str.indexOf(".com:");
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.f196910u)) {
            if (indexOf3 != -1) {
                int i = indexOf3 + 5;
                int i2 = i + 1;
                while (i2 < sb.length() && sb.charAt(i2) - '0' >= 0 && sb.charAt(i2) - '0' <= 9) {
                    i2++;
                }
                sb.replace(i, i2, this.f196910u);
            } else if (indexOf2 != -1 && ((indexOf = str.indexOf("vhost")) == -1 || indexOf > indexOf2)) {
                sb.insert(indexOf2 + 4, ":" + this.f196910u);
            }
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        int indexOf4 = sb2.indexOf("://");
        if (!TextUtils.isEmpty(this.f196909t)) {
            if (this.f196909t.equals("kcp")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "httpk");
                }
            } else if (this.f196909t.equals("quic") || this.f196909t.equals("quicu")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "httpq");
                }
            } else if (this.f196909t.equals("tls")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "https");
                }
            } else if (this.f196909t.equals("tcp") && indexOf4 != -1) {
                sb2.replace(0, indexOf4, "http");
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public final boolean mo140917a(int i) {
        this.f196904o = i | this.f196904o;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* renamed from: c */
    public final boolean mo140927c(String str) {
        JSONObject jSONObject = this.f196903n;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return false;
        }
        int i = this.f196906q;
        if (i < 0) {
            this.f196906q = 1;
            Iterator<String> keys = this.f196903n.keys();
            String str2 = null;
            String str3 = null;
            while (true) {
                if (!keys.hasNext()) {
                    break;
                }
                String next = keys.next();
                if (m150974e(next)) {
                    str3 = mo140933g(next, str);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !str3.equals(str2)) {
                        this.f196906q = 0;
                        break;
                    } else if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                }
            }
            if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
                this.f196906q = 0;
            }
            if (this.f196906q == 1) {
                return true;
            }
            return false;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo140915a(String str, String str2) {
        this.f196909t = str;
        this.f196910u = str2;
    }

    /* renamed from: l */
    private long m150977l(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        long j = -1;
        if (!mo140930d(str)) {
            return -1;
        }
        try {
            j = new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optLong("FastOpenDuration");
            return j;
        } catch (JSONException e) {
            e.printStackTrace();
            return j;
        }
    }

    /* renamed from: m */
    private long m150978m(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        long j = 0;
        if (!mo140930d(str)) {
            return 0;
        }
        try {
            j = new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optLong("gop");
            return j;
        } catch (JSONException e) {
            e.printStackTrace();
            return j;
        }
    }

    /* renamed from: a */
    public final String mo140913a(long j, String str) {
        JSONObject jSONObject = this.f196903n;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        Iterator<String> keys = this.f196903n.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (m150974e(next) && j == mo140934h(next, str) / 1000) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo140921b(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        try {
            String k = mo140937k(str, str2);
            if (k != null) {
                return new JSONObject(k).optString("AvLines");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final int mo140924c(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        if (!mo140930d(str)) {
            return -1;
        }
        try {
            String k = mo140937k(str, str2);
            if (k != null) {
                return new JSONObject(k).optInt("CheckSilenceInterval");
            }
            return -1;
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: d */
    public final String mo140928d(String str, String str2) {
        String str3;
        if (m150976g(str)) {
            str = this.f196891b;
        }
        if (!mo140930d(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("SuggestFormat");
        } catch (JSONException e) {
            e.printStackTrace();
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: e */
    public final String mo140931e(String str, String str2) {
        String str3;
        if (m150976g(str)) {
            str = this.f196891b;
        }
        if (!mo140930d(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("SuggestProtocol");
        } catch (JSONException e) {
            e.printStackTrace();
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: f */
    public final String mo140932f(String str, String str2) {
        String str3;
        if (m150976g(str)) {
            str = this.f196891b;
        }
        if (!mo140930d(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("SuggestAccessCode");
        } catch (JSONException e) {
            e.printStackTrace();
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: g */
    public final String mo140933g(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        String str3 = null;
        if (!mo140930d(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("VCodec");
            return str3;
        } catch (JSONException e) {
            e.printStackTrace();
            return str3;
        }
    }

    /* renamed from: h */
    public final long mo140934h(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        long j = 0;
        if (!mo140930d(str)) {
            return 0;
        }
        try {
            j = new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optLong("vbitrate");
            return j;
        } catch (JSONException e) {
            e.printStackTrace();
            return j;
        }
    }

    /* renamed from: k */
    public final String mo140937k(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        String str3 = null;
        if (!mo140930d(str)) {
            return null;
        }
        try {
            str3 = this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params");
            return str3;
        } catch (JSONException e) {
            e.printStackTrace();
            return str3;
        }
    }

    /* renamed from: i */
    public final JSONObject mo140935i(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        if (!mo140930d(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("NNSR"));
            this.f196895f = jSONObject.optInt("ShorterSideUpperBound");
            this.f196896g = jSONObject.optInt("LongerSideUpperBound");
            this.f196912w = jSONObject.optInt("FrameRateUpperBound");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public final JSONObject mo140936j(String str, String str2) {
        if (m150976g(str)) {
            str = this.f196891b;
        }
        if (!mo140930d(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(this.f196903n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("ASF"));
            this.f196898i = jSONObject.optInt("LongerSideUpperBound");
            this.f196899j = jSONObject.optInt("LongerSideLowerBound");
            this.f196900k = jSONObject.optInt("ShorterSideUpperBound");
            this.f196901l = jSONObject.optInt("ShorterSideLowerBound");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo140916a(String str, String str2, String str3) {
        this.f196892c = str;
        this.f196907r = str2;
        this.f196908s = str3;
    }

    /* renamed from: c */
    public final String mo140926c(String str, String str2, String str3) {
        String str4;
        String str5;
        if (this.f196890a == null) {
            return null;
        }
        if (str.equals("rtmp")) {
            str4 = "rtmp_ports";
        } else {
            str4 = "http_ports";
        }
        try {
            str5 = new JSONObject(this.f196890a.getJSONObject(str4).optString(str2)).optString(str3);
        } catch (JSONException e) {
            e.printStackTrace();
            str5 = null;
        }
        if (TextUtils.isEmpty(str5)) {
            return null;
        }
        return str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo140922b(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.p4477c.C87131b.mo140922b(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final boolean mo140918a(int i, int i2, float f) {
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        if (max > this.f196896g || min > this.f196895f || f > ((float) this.f196912w)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo140919a(String str, String str2, long j) {
        if (this.f196905p > 0) {
            return true;
        }
        long j2 = -1;
        String str3 = "ld";
        while (!TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(mo140922b(str3, str, str2))) {
                long h = mo140934h(str3, str2);
                if (str3.equals("origin") && h <= j2 && j > 0) {
                    this.f196905p = j;
                    h = j;
                }
                j2 = h;
            }
            str3.hashCode();
            switch (str3.hashCode()) {
                case -1008619738:
                    if (!str3.equals("origin")) {
                    }
                    break;
                case 3324:
                    if (str3.equals("hd")) {
                        str3 = "uhd";
                        continue;
                    }
                    break;
                case 3448:
                    if (str3.equals("ld")) {
                        str3 = "sd";
                        continue;
                    }
                    break;
                case 3665:
                    if (str3.equals("sd")) {
                        str3 = "hd";
                        continue;
                    }
                    break;
                case 115761:
                    if (str3.equals("uhd")) {
                        str3 = "origin";
                        continue;
                    }
                    break;
            }
            str3 = null;
        }
        if (this.f196905p > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m150972a(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.p4477c.C87131b.m150972a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
