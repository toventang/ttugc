package com.p2082ss.android.p2133d;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.d.f */
public class C29858f implements Serializable {
    private static final long serialVersionUID = -6027923654002990158L;

    /* renamed from: a */
    protected String f71217a;

    /* renamed from: b */
    private transient boolean f71218b;
    public volatile boolean mDownloaded;
    public int mHeight;
    public boolean mIsGif;
    public boolean mIsVideo;
    public String mKey;
    public boolean mNeedAlpha;
    public String mOpenUrl;
    public String mUri;
    public String mUrlList;
    public int mWidth;

    static {
        Covode.recordClassIndex(36266);
    }

    public String getExtraKey() {
        return this.f71217a;
    }

    public boolean isFixedDisplaySize() {
        return this.f71218b;
    }

    public boolean isValid() {
        if (this.mWidth <= 0 || this.mHeight <= 0 || TextUtils.isEmpty(this.mUri) || TextUtils.isEmpty(this.mUrlList)) {
            return false;
        }
        return true;
    }

    public JSONObject toJsonObj() {
        if (TextUtils.isEmpty(this.mUri)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.mUri);
            jSONObject.put("width", this.mWidth);
            jSONObject.put("height", this.mHeight);
            String str = this.mOpenUrl;
            if (str != null) {
                jSONObject.put("open_url", str);
            }
            if (!TextUtils.isEmpty(this.mUrlList)) {
                try {
                    jSONObject.put("url_list", new JSONArray(this.mUrlList));
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public void setExtraKey(String str) {
        this.f71217a = str;
    }

    public static C29858f fromJsonStr(String str) {
        return fromJsonStr(str, true);
    }

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static JSONArray toJsonArray(List<C29858f> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C29858f fVar : list) {
            JSONObject jsonObj = fVar.toJsonObj();
            if (jsonObj != null) {
                jSONArray.put(jsonObj);
            }
        }
        return jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C29858f fVar = (C29858f) obj;
            if (this.mWidth != fVar.mWidth || this.mHeight != fVar.mHeight || this.mIsGif != fVar.mIsGif || this.mDownloaded != fVar.mDownloaded || this.mIsVideo != fVar.mIsVideo || this.f71218b != fVar.f71218b) {
                return false;
            }
            String str = this.mUri;
            if (str == null ? fVar.mUri != null : !str.equals(fVar.mUri)) {
                return false;
            }
            String str2 = this.mOpenUrl;
            if (str2 == null ? fVar.mOpenUrl != null : !str2.equals(fVar.mOpenUrl)) {
                return false;
            }
            String str3 = this.mUrlList;
            if (str3 == null ? fVar.mUrlList != null : !str3.equals(fVar.mUrlList)) {
                return false;
            }
            String str4 = this.f71217a;
            if (str4 == null ? fVar.f71217a != null : !str4.equals(fVar.f71217a)) {
                return false;
            }
            String str5 = this.mKey;
            String str6 = fVar.mKey;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C29858f(String str, String str2) {
        this(str, str2, 0, 0, false);
    }

    public static C29858f fromJsonStr(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str), z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<C29858f> parseImageList(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            C29858f fromJson = fromJson(jSONArray.getJSONObject(i), z);
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static String getUrlFromImageInfo(C29858f fVar, boolean z) {
        String str;
        if (fVar == null) {
            return null;
        }
        if (z) {
            str = fVar.mUri;
        } else {
            str = null;
        }
        List<C29862h> extractImageUrlList = extractImageUrlList(str, fVar.mUrlList);
        if (extractImageUrlList == null || extractImageUrlList.size() <= 0) {
            return null;
        }
        return extractImageUrlList.get(0).f71234a;
    }

    public static ArrayList<C29858f> optImageList(JSONArray jSONArray, boolean z) {
        C29858f fromJson;
        ArrayList<C29858f> arrayList = null;
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (fromJson = fromJson(optJSONObject, z)) == null)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fromJson);
                }
            }
        }
        return arrayList;
    }

    public static C29858f fromJson(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("uri");
        String optString2 = jSONObject.optString("url_list");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        int optInt3 = jSONObject.optInt("r_width", -1);
        int optInt4 = jSONObject.optInt("r_height", -1);
        if (optInt3 != -1) {
            optInt = optInt3;
        }
        if (optInt4 != -1) {
            optInt2 = optInt4;
        }
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        if (z && (optInt <= 0 || optInt2 <= 0)) {
            return null;
        }
        C29858f fVar = new C29858f(optString, optString2, optInt, optInt2);
        fVar.mOpenUrl = jSONObject.optString("open_url", null);
        return fVar;
    }

    public static List<C29862h> extractImageUrlList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                if (length > 3) {
                    length = 3;
                }
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        C29862h hVar = new C29862h(string);
                        arrayList.add(hVar);
                        JSONObject optJSONObject = jSONObject.optJSONObject("header");
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string2 = optJSONObject.getString(next);
                                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                                    hVar.f71235b.add(new C29934d(next, string2));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (arrayList.isEmpty() && !TextUtils.isEmpty(str) && isHttpUrl(str.toLowerCase())) {
            arrayList.add(new C29862h(str));
        }
        return arrayList;
    }

    public static ArrayList<C29858f> optImageList(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || str == null || str.length() == 0 || !jSONObject.has(str)) {
            return null;
        }
        return optImageList(jSONObject.optJSONArray(str), z);
    }

    public C29858f(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, false);
    }

    public C29858f(String str, String str2, int i, int i2, boolean z) {
        this.mUri = str;
        this.mUrlList = str2;
        this.mKey = C13607d.m24442b(str);
        this.mWidth = i;
        this.mHeight = i2;
        if (i > 0 && i2 > 0) {
            this.f71218b = z;
        }
    }
}
