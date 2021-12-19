package com.bytedance.geckox.statistic.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.geckox.statistic.model.a */
public final class C15039a {

    /* renamed from: a */
    public String f36717a;

    /* renamed from: b */
    public String f36718b;

    /* renamed from: c */
    public String f36719c;

    /* renamed from: d */
    public String f36720d;

    /* renamed from: e */
    public String f36721e;

    /* renamed from: f */
    public int f36722f;

    /* renamed from: g */
    public int f36723g = 1;

    /* renamed from: h */
    public int f36724h;

    /* renamed from: i */
    public int f36725i;

    /* renamed from: j */
    public int f36726j;

    /* renamed from: k */
    public String f36727k;

    /* renamed from: l */
    public long f36728l = -1;

    /* renamed from: m */
    public long f36729m = -1;

    /* renamed from: n */
    public int f36730n = -1;

    static {
        Covode.recordClassIndex(17205);
    }

    /* renamed from: a */
    public static String m27689a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("x-tt-logid");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String str2 = map.get("X-Tt-Logid");
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String str3 = map.get("X-TT-LOGID");
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }
}
