package com.facebook.p1814a.p1820e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.e.h */
public class C23943h {

    /* renamed from: a */
    public static final SharedPreferences f56676a = C34822d.m71158a(C24872m.f59047g, "com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: b */
    private static final String f56677b = C23943h.class.getCanonicalName();

    /* renamed from: c */
    private static final HashMap<String, Method> f56678c = new HashMap<>();

    /* renamed from: d */
    private static final HashMap<String, Class<?>> f56679d = new HashMap<>();

    /* renamed from: e */
    private static final String f56680e = C24872m.f59047g.getPackageName();

    /* renamed from: f */
    private static final SharedPreferences f56681f = C34822d.m71158a(C24872m.f59047g, "com.facebook.internal.PURCHASE", 0);

    C23943h() {
    }

    /* renamed from: a */
    private static void m45257a(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor edit = f56676a.edit();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            edit.putString(entry.getKey(), currentTimeMillis + ";" + entry.getValue());
        }
        edit.apply();
    }

    static {
        Covode.recordClassIndex(28064);
        C24699ae.m47299a();
        C24699ae.m47299a();
        C24699ae.m47299a();
    }

    /* renamed from: a */
    static boolean m45258a(String str) {
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString == null || optString.isEmpty()) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    static ArrayList<String> m45255a(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        SharedPreferences.Editor edit = f56681f.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                JSONObject jSONObject = new JSONObject(next);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!f56681f.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    /* renamed from: a */
    static ArrayList<String> m45253a(Context context, Object obj) {
        return m45255a(m45254a(context, obj, "inapp"));
    }

    /* renamed from: a */
    static Class<?> m45250a(Context context, String str) {
        HashMap<String, Class<?>> hashMap = f56679d;
        Class<?> cls = hashMap.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            hashMap.put(str, cls);
            return cls;
        } catch (ClassNotFoundException unused) {
            return cls;
        }
    }

    /* renamed from: a */
    static Method m45252a(Class<?> cls, String str) {
        HashMap<String, Method> hashMap = f56678c;
        Method method = hashMap.get(str);
        if (method != null) {
            return method;
        }
        Class<?>[] clsArr = null;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (c == 1) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
            } else if (c == 2) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class};
            } else if (c == 3) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
            } else if (c == 4) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
            }
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            hashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return method;
        }
    }

    /* renamed from: c */
    private static Boolean m45261c(Context context, Object obj, String str) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Object a = m45251a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f56680e, str});
        if (a != null && ((Integer) a).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    static ArrayList<String> m45259b(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        ArrayList<String> arrayList = new ArrayList<>();
        if (m45261c(context, obj, str).booleanValue()) {
            String str2 = null;
            int i = 0;
            boolean z = false;
            do {
                Object a = m45251a(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f56680e, str, str2, new Bundle()});
                if (a != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) a;
                    if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            try {
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            } catch (JSONException unused) {
                            }
                        }
                        str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i >= 30 || str2 == null) {
                            break;
                        }
                    }
                }
                str2 = null;
            } while (!z);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[EDGE_INSN: B:19:0x005a->B:16:0x005a ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.ArrayList<java.lang.String> m45254a(android.content.Context r9, java.lang.Object r10, java.lang.String r11) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r10 != 0) goto L_0x0008
            return r4
        L_0x0008:
            java.lang.Boolean r0 = m45261c(r9, r10, r11)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005a
            r8 = 0
            r7 = 0
            r6 = r7
            r3 = 0
        L_0x0016:
            r0 = 4
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r2 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5[r8] = r0
            r1 = 1
            java.lang.String r0 = com.facebook.p1814a.p1820e.C23943h.f56680e
            r5[r1] = r0
            r0 = 2
            r5[r0] = r11
            r5[r2] = r6
            java.lang.String r1 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r0 = "getPurchases"
            java.lang.Object r2 = m45251a(r9, r1, r0, r10, r5)
            if (r2 == 0) goto L_0x005b
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "RESPONSE_CODE"
            int r0 = r2.getInt(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r1 = r2.getStringArrayList(r0)
            if (r1 == 0) goto L_0x005a
            int r0 = r1.size()
            int r3 = r3 + r0
            r4.addAll(r1)
            java.lang.String r0 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r6 = r2.getString(r0)
        L_0x0054:
            r0 = 30
            if (r3 >= r0) goto L_0x005a
            if (r6 != 0) goto L_0x0016
        L_0x005a:
            return r4
        L_0x005b:
            r6 = r7
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.p1820e.C23943h.m45254a(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: b */
    private static Map<String, String> m45260b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            objArr[1] = f56680e;
            if (z) {
                str = "subs";
            } else {
                str = "inapp";
            }
            objArr[2] = str;
            objArr[3] = bundle;
            Object a = m45251a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (a != null) {
                Bundle bundle2 = (Bundle) a;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            hashMap.put(arrayList.get(i), stringArrayList.get(i));
                        }
                    }
                    m45257a(hashMap);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    static Map<String, String> m45256a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String string = f56676a.getString(next, null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(next, split[1]);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (!hashMap.containsKey(next2)) {
                arrayList2.add(next2);
            }
        }
        hashMap.putAll(m45260b(context, arrayList2, obj, z));
        return hashMap;
    }

    /* renamed from: a */
    static Object m45251a(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method a;
        Class<?> a2 = m45250a(context, str);
        if (a2 == null || (a = m45252a(a2, str2)) == null) {
            return null;
        }
        if (obj != null) {
            obj = a2.cast(obj);
        }
        try {
            Pair<Boolean, Object> a3 = C15346a.m28238a(a, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_facebook_appevents_internal_InAppPurchaseEventManager_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a3.first).booleanValue()) {
                return a3.second;
            }
            Object invoke = a.invoke(obj, objArr);
            C15346a.m28242a(invoke, a, new Object[]{obj, objArr}, "com_facebook_appevents_internal_InAppPurchaseEventManager_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
