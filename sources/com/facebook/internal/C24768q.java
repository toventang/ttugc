package com.facebook.internal;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.facebook.internal.q */
public final class C24768q {

    /* renamed from: a */
    public boolean f58753a;

    /* renamed from: b */
    public String f58754b;

    /* renamed from: c */
    public boolean f58755c;

    /* renamed from: d */
    public int f58756d;

    /* renamed from: e */
    public EnumSet<EnumC24692ac> f58757e;

    /* renamed from: f */
    public Map<String, Map<String, C24769a>> f58758f;

    /* renamed from: g */
    public boolean f58759g;

    /* renamed from: h */
    public C24752l f58760h;

    /* renamed from: i */
    public String f58761i;

    /* renamed from: j */
    public String f58762j;

    /* renamed from: k */
    public boolean f58763k;

    /* renamed from: l */
    public boolean f58764l;

    /* renamed from: m */
    public String f58765m;

    /* renamed from: n */
    public JSONArray f58766n;

    /* renamed from: o */
    public boolean f58767o;

    /* renamed from: p */
    public boolean f58768p;

    /* renamed from: q */
    public String f58769q;

    /* renamed from: r */
    public String f58770r;

    /* renamed from: s */
    public String f58771s;

    static {
        Covode.recordClassIndex(28921);
    }

    /* renamed from: com.facebook.internal.q$a */
    public static class C24769a {

        /* renamed from: a */
        public String f58772a;

        /* renamed from: b */
        public String f58773b;

        /* renamed from: c */
        public Uri f58774c;

        /* renamed from: d */
        public int[] f58775d;

        static {
            Covode.recordClassIndex(28922);
        }

        /* renamed from: a */
        static int[] m47424a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C24693ad.m47261a(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            C24693ad.m47255a("FacebookSDK", (Exception) e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        C24769a(String str, String str2, Uri uri, int[] iArr) {
            this.f58772a = str;
            this.f58773b = str2;
            this.f58774c = uri;
            this.f58775d = iArr;
        }
    }

    /* renamed from: a */
    public static C24769a m47423a(String str, String str2, String str3) {
        C24768q a;
        Map<String, C24769a> map;
        if (C24693ad.m47261a(str2) || C24693ad.m47261a(str3) || (a = C24770r.m47425a(str)) == null || (map = a.f58758f.get(str2)) == null) {
            return null;
        }
        return map.get(str3);
    }

    public C24768q(boolean z, String str, boolean z2, int i, EnumSet<EnumC24692ac> enumSet, Map<String, Map<String, C24769a>> map, boolean z3, C24752l lVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        this.f58753a = z;
        this.f58754b = str;
        this.f58755c = z2;
        this.f58758f = map;
        this.f58760h = lVar;
        this.f58756d = i;
        this.f58759g = z3;
        this.f58757e = enumSet;
        this.f58761i = str2;
        this.f58762j = str3;
        this.f58763k = z4;
        this.f58764l = z5;
        this.f58766n = jSONArray;
        this.f58765m = str4;
        this.f58767o = z6;
        this.f58768p = z7;
        this.f58769q = str5;
        this.f58770r = str6;
        this.f58771s = str7;
    }
}
