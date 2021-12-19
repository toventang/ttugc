package com.facebook.p1814a.p1816b.p1817a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.a.a */
public final class C23880a {

    /* renamed from: a */
    public final String f56526a;

    /* renamed from: b */
    public final EnumC23882b f56527b;

    /* renamed from: c */
    public final EnumC23881a f56528c;

    /* renamed from: d */
    public final String f56529d;

    /* renamed from: e */
    public final List<C23884c> f56530e;

    /* renamed from: f */
    public final List<C23883b> f56531f;

    /* renamed from: g */
    public final String f56532g;

    /* renamed from: h */
    public final String f56533h;

    /* renamed from: i */
    public final String f56534i;

    static {
        Covode.recordClassIndex(28001);
    }

    /* renamed from: com.facebook.a.b.a.a$a */
    public enum EnumC23881a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        static {
            Covode.recordClassIndex(28002);
        }
    }

    /* renamed from: com.facebook.a.b.a.a$b */
    public enum EnumC23882b {
        MANUAL,
        INFERENCE;

        static {
            Covode.recordClassIndex(28003);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }, LOOP:0: B:5:0x000e->B:6:0x0010, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.p1814a.p1816b.p1817a.C23880a> m45146a(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            if (r4 == 0) goto L_0x000d
            int r1 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            if (r2 >= r1) goto L_0x001e
            org.json.JSONObject r0 = r4.getJSONObject(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            com.facebook.a.b.a.a r0 = m45145a(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r3.add(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r2 = r2 + 1
            goto L_0x000e
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.p1816b.p1817a.C23880a.m45146a(org.json.JSONArray):java.util.List");
    }

    /* renamed from: a */
    private static C23880a m45145a(JSONObject jSONObject) {
        String string = jSONObject.getString("event_name");
        EnumC23882b valueOf = EnumC23882b.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        EnumC23881a valueOf2 = EnumC23881a.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C23884c(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C23883b(optJSONArray.getJSONObject(i2)));
            }
        }
        return new C23880a(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    private C23880a(String str, EnumC23882b bVar, EnumC23881a aVar, String str2, List<C23884c> list, List<C23883b> list2, String str3, String str4, String str5) {
        this.f56526a = str;
        this.f56527b = bVar;
        this.f56528c = aVar;
        this.f56529d = str2;
        this.f56530e = list;
        this.f56531f = list2;
        this.f56532g = str3;
        this.f56533h = str4;
        this.f56534i = str5;
    }
}
