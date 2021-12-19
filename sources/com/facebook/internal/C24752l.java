package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.l */
public final class C24752l {

    /* renamed from: g */
    private static C24752l f58726g;

    /* renamed from: a */
    public final Map<Integer, Set<Integer>> f58727a;

    /* renamed from: b */
    public final Map<Integer, Set<Integer>> f58728b;

    /* renamed from: c */
    public final Map<Integer, Set<Integer>> f58729c;

    /* renamed from: d */
    public final String f58730d;

    /* renamed from: e */
    public final String f58731e;

    /* renamed from: f */
    public final String f58732f;

    static {
        Covode.recordClassIndex(28905);
    }

    /* renamed from: com.facebook.internal.l$3 */
    public static /* synthetic */ class C247553 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58733a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 28908(0x70ec, float:4.0509E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.FacebookRequestError$a[] r0 = com.facebook.FacebookRequestError.EnumC23851a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.internal.C24752l.C247553.f58733a = r2
                com.facebook.FacebookRequestError$a r0 = com.facebook.FacebookRequestError.EnumC23851a.OTHER     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.internal.C24752l.C247553.f58733a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.FacebookRequestError$a r0 = com.facebook.FacebookRequestError.EnumC23851a.LOGIN_RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.internal.C24752l.C247553.f58733a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.FacebookRequestError$a r0 = com.facebook.FacebookRequestError.EnumC23851a.TRANSIENT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C24752l.C247553.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static synchronized C24752l m47398a() {
        C24752l lVar;
        synchronized (C24752l.class) {
            MethodCollector.m26663i(9042);
            if (f58726g == null) {
                f58726g = new C24752l(null, new HashMap<Integer, Set<Integer>>() {
                    /* class com.facebook.internal.C24752l.C247531 */

                    static {
                        Covode.recordClassIndex(28906);
                    }

                    {
                        put(2, null);
                        put(4, null);
                        put(9, null);
                        put(17, null);
                        put(341, null);
                    }
                }, new HashMap<Integer, Set<Integer>>() {
                    /* class com.facebook.internal.C24752l.C247542 */

                    static {
                        Covode.recordClassIndex(28907);
                    }

                    {
                        put(102, null);
                        put(Integer.valueOf((int) BuildConfig.VERSION_CODE), null);
                        put(412, null);
                    }
                }, null, null, null);
            }
            lVar = f58726g;
            MethodCollector.m26664o(9042);
        }
        return lVar;
    }

    /* renamed from: a */
    public static C24752l m47399a(JSONArray jSONArray) {
        String optString;
        if (jSONArray == null) {
            return null;
        }
        Map<Integer, Set<Integer>> map = null;
        Map<Integer, Set<Integer>> map2 = null;
        Map<Integer, Set<Integer>> map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString(StringSet.name)) == null)) {
                if (optString.equalsIgnoreCase("other")) {
                    str = optJSONObject.optString("recovery_message", null);
                    map = m47400a(optJSONObject);
                } else if (optString.equalsIgnoreCase("transient")) {
                    str2 = optJSONObject.optString("recovery_message", null);
                    map2 = m47400a(optJSONObject);
                } else if (optString.equalsIgnoreCase("login_recoverable")) {
                    str3 = optJSONObject.optString("recovery_message", null);
                    map3 = m47400a(optJSONObject);
                }
            }
        }
        return new C24752l(map, map2, map3, str, str2, str3);
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m47400a(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        int optInt2 = optJSONArray2.optInt(i2);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    private C24752l(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f58727a = map;
        this.f58728b = map2;
        this.f58729c = map3;
        this.f58730d = str;
        this.f58731e = str2;
        this.f58732f = str3;
    }
}
