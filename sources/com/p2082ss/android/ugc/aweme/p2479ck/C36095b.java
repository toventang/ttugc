package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ck.b */
public final class C36095b implements AbstractC36109j {

    /* renamed from: a */
    public String f85292a;

    /* renamed from: b */
    public C36096c f85293b;

    /* renamed from: c */
    public boolean f85294c;

    /* renamed from: d */
    private Context f85295d;

    /* renamed from: e */
    private Class<? extends Activity> f85296e;

    /* renamed from: f */
    private String f85297f;

    static {
        Covode.recordClassIndex(43348);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: c */
    public final boolean mo63242c(String str) {
        return mo63241b(null, str);
    }

    /* renamed from: a */
    private static void m73564a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service", "in_app_router_no_matched");
            jSONObject.put("open_url", str);
            C12290b.m22064a("common_log", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m73561a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: a */
    public final boolean mo63240a(Activity activity, String str) {
        return mo63241b(activity, str);
    }

    /* renamed from: a */
    private static void m73562a(Intent intent, String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
        } else {
            Uri parse = Uri.parse(str);
            hashMap = new HashMap();
            for (String str2 : parse.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(parse.getQueryParameter(str2))) {
                    hashMap.put(str2, str2);
                }
            }
        }
        for (String str3 : hashMap.keySet()) {
            m73565b(intent, str3, C36132v.m73608b(str, (String) hashMap.get(str3)));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r9 != null) goto L_0x004a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo63241b(android.app.Activity r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36095b.mo63241b(android.app.Activity, java.lang.String):boolean");
    }

    public C36095b(Context context, String str, Class<? extends Activity> cls) {
        this.f85295d = context;
        this.f85292a = str;
        this.f85296e = cls;
    }

    /* renamed from: a */
    private static void m73563a(Intent intent, String str, String str2) {
        List<String> a = C36132v.m73606a(str);
        List<String> a2 = C36132v.m73606a(str2);
        int size = a.size();
        for (int i = 1; i < size; i++) {
            if (i < size) {
                intent.putExtra(a.get(i).substring(1), a2.get(i));
            }
        }
    }

    /* renamed from: b */
    private static void m73565b(Intent intent, String str, String str2) {
        C36123r rVar = C36125t.m73591a().f85349c;
        if (rVar != null) {
            if (C36123r.m73586a(rVar.f85332a, str)) {
                intent.putExtra(str, Integer.parseInt(str2));
            } else if (C36123r.m73586a(rVar.f85333b, str)) {
                intent.putExtra(str, Long.parseLong(str2));
            } else if (C36123r.m73586a(rVar.f85334c, str)) {
                intent.putExtra(str, Boolean.parseBoolean(str2));
            } else if (C36123r.m73586a(rVar.f85335d, str)) {
                intent.putExtra(str, Short.parseShort(str2));
            } else if (C36123r.m73586a(rVar.f85336e, str)) {
                intent.putExtra(str, Float.parseFloat(str2));
            } else if (C36123r.m73586a(rVar.f85337f, str)) {
                intent.putExtra(str, Double.parseDouble(str2));
            } else if (C36123r.m73586a(rVar.f85338g, str)) {
                intent.putExtra(str, Byte.parseByte(str2));
            } else if (C36123r.m73586a(rVar.f85339h, str)) {
                intent.putExtra(str, str2.charAt(0));
            } else {
                C36123r.m73586a(rVar.f85340i, str);
                intent.putExtra(str, str2);
            }
        }
    }
}
