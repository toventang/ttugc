package com.facebook.p1814a.p1821f;

import android.os.Bundle;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.C24872m;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24759o;
import com.facebook.internal.C24764p;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1819d.C23915a;
import com.facebook.p1814a.p1820e.AsyncTaskC23935e;
import com.facebook.p1814a.p1824i.C23988d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.f.c */
public final class C23953c {

    /* renamed from: a */
    private static final Map<String, C23959b> f56709a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final Integer f56710b = 259200000;

    /* renamed from: c */
    private static final List<String> f56711c = Arrays.asList("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d */
    private static final List<String> f56712d = Arrays.asList("none", "address", "health");

    /* renamed from: com.facebook.a.f.c$a */
    public enum EnumC23958a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public final String toKey() {
            int i = C239574.f56713a[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i != 2) {
                return "Unknown";
            }
            return "app_event_pred";
        }

        public final String toUseCase() {
            int i = C239574.f56713a[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i != 2) {
                return null;
            }
            return "MTML_APP_EVENT_PRED";
        }

        static {
            Covode.recordClassIndex(28079);
        }
    }

    /* renamed from: a */
    static /* synthetic */ JSONObject m45283a() {
        if (C24677a.m47209a(C23953c.class)) {
            return null;
        }
        try {
            return m45294c();
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.f.c$4 */
    public static /* synthetic */ class C239574 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56713a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 28078(0x6dae, float:3.9346E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.a.f.c$a[] r0 = com.facebook.p1814a.p1821f.C23953c.EnumC23958a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.p1814a.p1821f.C23953c.C239574.f56713a = r2
                com.facebook.a.f.c$a r0 = com.facebook.p1814a.p1821f.C23953c.EnumC23958a.MTML_INTEGRITY_DETECT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.p1814a.p1821f.C23953c.C239574.f56713a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.a.f.c$a r0 = com.facebook.p1814a.p1821f.C23953c.EnumC23958a.MTML_APP_EVENT_PREDICTION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.p1821f.C23953c.C239574.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(28074);
    }

    /* renamed from: d */
    private static boolean m45295d() {
        if (C24677a.m47209a(C23953c.class)) {
            return false;
        }
        try {
            Locale c = C24693ad.m47273c();
            if (c == null) {
                return true;
            }
            if (c.getLanguage().contains("en")) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return false;
        }
    }

    /* renamed from: c */
    private static JSONObject m45294c() {
        if (C24677a.m47209a(C23953c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            C24699ae.m47299a();
            GraphRequest a = GraphRequest.m45068a(C1764a.m5928a("%s/model_asset", new Object[]{C24872m.f59041a}));
            a.f56463n = true;
            a.f56459j = bundle;
            JSONObject jSONObject = GraphRequest.m45069a(a).f59153b;
            if (jSONObject == null) {
                return null;
            }
            return m45289b(jSONObject);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m45290b() {
        if (!C24677a.m47209a(C23953c.class)) {
            try {
                if (!C24677a.m47209a(C23953c.class)) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        String str = null;
                        int i = 0;
                        for (Map.Entry<String, C23959b> entry : f56709a.entrySet()) {
                            String key = entry.getKey();
                            if (key.equals(EnumC23958a.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                                C23959b value = entry.getValue();
                                str = value.f56716b;
                                i = Math.max(i, value.f56718d);
                                if (C24759o.m47408a(C24759o.EnumC24763b.SuggestedEvents) && m45295d()) {
                                    value.f56722h = new Runnable() {
                                        /* class com.facebook.p1814a.p1821f.C23953c.RunnableC239552 */

                                        static {
                                            Covode.recordClassIndex(28076);
                                        }

                                        public final void run() {
                                            if (!C24677a.m47209a(this)) {
                                                try {
                                                    C23988d.m45365a();
                                                } catch (Throwable th) {
                                                    C24677a.m47208a(th, this);
                                                }
                                            }
                                        }
                                    };
                                    arrayList.add(value);
                                }
                            }
                            if (key.equals(EnumC23958a.MTML_INTEGRITY_DETECT.toUseCase())) {
                                C23959b value2 = entry.getValue();
                                str = value2.f56716b;
                                i = Math.max(i, value2.f56718d);
                                if (C24759o.m47408a(C24759o.EnumC24763b.IntelligentIntegrity)) {
                                    value2.f56722h = new Runnable() {
                                        /* class com.facebook.p1814a.p1821f.C23953c.RunnableC239563 */

                                        static {
                                            Covode.recordClassIndex(28077);
                                        }

                                        public final void run() {
                                            if (!C24677a.m47209a(this)) {
                                                try {
                                                    if (!C24677a.m47209a(C23915a.class)) {
                                                        try {
                                                            C23915a.f56624a = true;
                                                            C24699ae.m47299a();
                                                            C23915a.f56625b = C24764p.m47419a("FBSDKFeatureIntegritySample", C24872m.f59041a, false);
                                                        } catch (Throwable th) {
                                                            C24677a.m47208a(th, C23915a.class);
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    C24677a.m47208a(th2, this);
                                                }
                                            }
                                        }
                                    };
                                    arrayList.add(value2);
                                }
                            }
                        }
                        if (!(str == null || i <= 0 || arrayList.isEmpty())) {
                            C23959b bVar = new C23959b("MTML", str, null, i, null);
                            C23959b.m45297a(bVar.f56715a, bVar.f56718d);
                            C23959b.m45298a(bVar.f56716b, bVar.f56715a + "_" + bVar.f56718d, new AsyncTaskC23935e.AbstractC23936a(arrayList) {
                                /* class com.facebook.p1814a.p1821f.C23953c.C23959b.C239601 */

                                /* renamed from: a */
                                final /* synthetic */ List f56723a;

                                static {
                                    Covode.recordClassIndex(28081);
                                }

                                {
                                    this.f56723a = r1;
                                }

                                @Override // com.facebook.p1814a.p1820e.AsyncTaskC23935e.AbstractC23936a
                                /* renamed from: a */
                                public final void mo39430a(File file) {
                                    final C23950b a = C23950b.m45278a(file);
                                    if (a != null) {
                                        for (final C23959b bVar : this.f56723a) {
                                            C23959b.m45298a(bVar.f56717c, bVar.f56715a + "_" + bVar.f56718d + "_rule", new AsyncTaskC23935e.AbstractC23936a() {
                                                /* class com.facebook.p1814a.p1821f.C23953c.C23959b.C239601.C239611 */

                                                static {
                                                    Covode.recordClassIndex(28082);
                                                }

                                                @Override // com.facebook.p1814a.p1820e.AsyncTaskC23935e.AbstractC23936a
                                                /* renamed from: a */
                                                public final void mo39430a(File file) {
                                                    bVar.f56721g = a;
                                                    bVar.f56720f = file;
                                                    if (bVar.f56722h != null) {
                                                        bVar.f56722h.run();
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        C24677a.m47208a(th, C23953c.class);
                    }
                }
            } catch (Throwable th2) {
                C24677a.m47208a(th2, C23953c.class);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.f.c$b */
    public static class C23959b {

        /* renamed from: a */
        String f56715a;

        /* renamed from: b */
        String f56716b;

        /* renamed from: c */
        String f56717c;

        /* renamed from: d */
        int f56718d;

        /* renamed from: e */
        float[] f56719e;

        /* renamed from: f */
        File f56720f;

        /* renamed from: g */
        C23950b f56721g;

        /* renamed from: h */
        public Runnable f56722h;

        static {
            Covode.recordClassIndex(28080);
        }

        /* renamed from: a */
        static C23959b m45296a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                return new C23959b(jSONObject.getString("use_case"), jSONObject.getString("asset_uri"), jSONObject.optString("rules_uri", null), jSONObject.getInt("version_id"), C23953c.m45286a(jSONObject.getJSONArray("thresholds")));
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        private static boolean m45299a(File file) {
            MethodCollector.m26663i(6739);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(6739);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(6739);
            return delete;
        }

        /* renamed from: a */
        static void m45297a(String str, int i) {
            File[] listFiles;
            File a = C23963e.m45314a();
            if (!(a == null || (listFiles = a.listFiles()) == null || listFiles.length == 0)) {
                String str2 = str + "_" + i;
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.startsWith(str) && !name.startsWith(str2)) {
                        m45299a(file);
                    }
                }
            }
        }

        /* renamed from: a */
        public static void m45298a(String str, String str2, AsyncTaskC23935e.AbstractC23936a aVar) {
            File file = new File(C23963e.m45314a(), str2);
            if (str == null || file.exists()) {
                aVar.mo39430a(file);
            } else {
                new AsyncTaskC23935e(str, file, aVar).execute(new String[0]);
            }
        }

        C23959b(String str, String str2, String str3, int i, float[] fArr) {
            this.f56715a = str;
            this.f56716b = str2;
            this.f56717c = str3;
            this.f56718d = i;
            this.f56719e = fArr;
        }
    }

    /* renamed from: a */
    public static File m45282a(EnumC23958a aVar) {
        if (C24677a.m47209a(C23953c.class)) {
            return null;
        }
        try {
            C23959b bVar = f56709a.get(aVar.toUseCase());
            if (bVar == null) {
                return null;
            }
            return bVar.f56720f;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m45291b(long j) {
        if (C24677a.m47209a(C23953c.class) || j == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - j < ((long) f56710b.intValue())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return false;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m45284a(JSONObject jSONObject) {
        if (!C24677a.m47209a(C23953c.class)) {
            try {
                if (!C24677a.m47209a(C23953c.class)) {
                    try {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            try {
                                C23959b a = C23959b.m45296a(jSONObject.getJSONObject(keys.next()));
                                if (a != null) {
                                    f56709a.put(a.f56715a, a);
                                }
                            } catch (JSONException unused) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        C24677a.m47208a(th, C23953c.class);
                    }
                }
            } catch (Throwable th2) {
                C24677a.m47208a(th2, C23953c.class);
            }
        }
    }

    /* renamed from: b */
    private static JSONObject m45289b(JSONObject jSONObject) {
        if (C24677a.m47209a(C23953c.class)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m45285a(long j) {
        if (C24677a.m47209a(C23953c.class)) {
            return false;
        }
        try {
            return m45291b(j);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return false;
        }
    }

    /* renamed from: a */
    static /* synthetic */ float[] m45286a(JSONArray jSONArray) {
        if (C24677a.m47209a(C23953c.class)) {
            return null;
        }
        try {
            return m45292b(jSONArray);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }

    /* renamed from: b */
    private static float[] m45292b(JSONArray jSONArray) {
        if (C24677a.m47209a(C23953c.class) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    fArr[i] = Float.parseFloat(jSONArray.getString(i));
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }

    /* renamed from: a */
    private static String[] m45287a(C23949a aVar, float[] fArr) {
        if (C24677a.m47209a(C23953c.class)) {
            return null;
        }
        try {
            int i = aVar.f56694b[0];
            int i2 = aVar.f56694b[1];
            float[] fArr2 = aVar.f56693a;
            String[] strArr = new String[i];
            if (i2 != fArr.length) {
                return null;
            }
            for (int i3 = 0; i3 < i; i3++) {
                strArr[i3] = "other";
                for (int i4 = 0; i4 < fArr.length; i4++) {
                    if (fArr2[(i3 * i2) + i4] >= fArr[i4]) {
                        strArr[i3] = f56711c.get(i4);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }

    /* renamed from: b */
    private static String[] m45293b(C23949a aVar, float[] fArr) {
        if (C24677a.m47209a(C23953c.class)) {
            return null;
        }
        try {
            int i = aVar.f56694b[0];
            int i2 = aVar.f56694b[1];
            float[] fArr2 = aVar.f56693a;
            String[] strArr = new String[i];
            if (i2 != fArr.length) {
                return null;
            }
            for (int i3 = 0; i3 < i; i3++) {
                strArr[i3] = "none";
                for (int i4 = 0; i4 < fArr.length; i4++) {
                    if (fArr2[(i3 * i2) + i4] >= fArr[i4]) {
                        strArr[i3] = f56712d.get(i4);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }

    /* renamed from: a */
    public static String[] m45288a(EnumC23958a aVar, float[][] fArr, String[] strArr) {
        if (C24677a.m47209a(C23953c.class)) {
            return null;
        }
        try {
            C23959b bVar = f56709a.get(aVar.toUseCase());
            if (bVar != null) {
                if (bVar.f56721g != null) {
                    int length = fArr[0].length;
                    C23949a aVar2 = new C23949a(new int[]{1, length});
                    for (int i = 0; i <= 0; i++) {
                        System.arraycopy(fArr[0], 0, aVar2.f56693a, length * 0, length);
                    }
                    C23949a a = bVar.f56721g.mo39449a(aVar2, strArr, aVar.toKey());
                    float[] fArr2 = bVar.f56719e;
                    if (!(a == null || fArr2 == null || a.f56693a.length == 0)) {
                        if (fArr2.length != 0) {
                            int i2 = C239574.f56713a[aVar.ordinal()];
                            if (i2 == 1) {
                                return m45293b(a, fArr2);
                            }
                            if (i2 != 2) {
                                return null;
                            }
                            return m45287a(a, fArr2);
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23953c.class);
            return null;
        }
    }
}
