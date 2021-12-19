package com.bytedance.p1734ug.sdk.region.data.network;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1734ug.sdk.region.data.p1736a.C23460a;
import com.bytedance.p1734ug.sdk.region.data.p1738c.AbstractC23468b;
import com.bytedance.p1734ug.sdk.region.data.p1738c.AbstractC23470d;
import com.bytedance.p1734ug.sdk.region.data.p1739d.C23471a;
import com.bytedance.p1734ug.sdk.region.data.p1740e.C23472a;
import com.bytedance.p1734ug.sdk.region.data.p1740e.C23473b;
import com.bytedance.p1734ug.sdk.region.data.p1741f.C23478b;
import com.bytedance.p1734ug.sdk.region.data.p1743h.C23482a;
import com.bytedance.p1734ug.sdk.region.data.p1743h.C23483b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Semaphore;
import org.json.JSONObject;

/* renamed from: com.bytedance.ug.sdk.region.data.network.b */
public final class C23485b {

    /* renamed from: a */
    private static final Semaphore f55674a = new Semaphore(1);

    static {
        Covode.recordClassIndex(27487);
    }

    /* renamed from: b */
    private static Map<String, String> m44185b() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        if (C23471a.m44160a()) {
            hashMap.put("x-use-boe", "1");
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m44183a() {
        String a = C23484a.m44177a();
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        try {
            String a2 = C23484a.m44179a(a, "/ttloc/config/", m44185b(), new byte[0]);
            if (TextUtils.isEmpty(a2)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(a2);
            if (C23482a.m44169a(jSONObject, "err_no") == 0) {
                return jSONObject.optString("data");
            }
            return "";
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: a */
    public static C23460a m44181a(Context context) {
        C23460a aVar;
        String a;
        Semaphore semaphore = f55674a;
        if (semaphore.tryAcquire(1)) {
            try {
                C23460a b = m44184b(context);
                if (b.mo38220b()) {
                    semaphore.release();
                    return b;
                }
                semaphore.release();
                return b;
            } catch (Exception e) {
                e.printStackTrace();
                C23460a b2 = C23460a.m44152b(e.getMessage());
                f55674a.release();
                return b2;
            } catch (Throwable th) {
                f55674a.release();
                throw th;
            }
        } else {
            try {
                semaphore.acquire();
                if (C23473b.f55656b != C23473b.f55655a) {
                    if (C23473b.f55656b == null || C23473b.f55656b.mo38220b()) {
                        if (C23473b.f55656b != null) {
                            aVar = C23473b.f55656b;
                        } else {
                            AbstractC23470d c = C23471a.m44162c();
                            if (c != null) {
                                a = c.mo38227a();
                            } else {
                                a = C23472a.m44163a(context, "bd_region");
                            }
                            aVar = C23460a.m44151a(a, 1);
                            if (aVar == null || !aVar.mo38220b()) {
                                C23473b.f55656b = C23473b.f55655a;
                                aVar = C23473b.m44165a(context);
                            } else {
                                C23473b.f55656b = aVar;
                            }
                        }
                        semaphore.release();
                        return aVar;
                    }
                    C23473b.f55656b = C23473b.f55655a;
                }
                aVar = C23473b.m44165a(context);
                semaphore.release();
                return aVar;
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                f55674a.release();
                return null;
            } catch (Throwable th2) {
                f55674a.release();
                throw th2;
            }
        }
    }

    /* renamed from: b */
    private static C23460a m44184b(Context context) {
        AbstractC23468b bVar;
        Locale a;
        String str;
        String networkOperator;
        Locale locale;
        String a2 = C23484a.m44177a();
        if (TextUtils.isEmpty(a2)) {
            return C23460a.m44152b("Missing Url");
        }
        Map<String, String> b = m44185b();
        JSONObject jSONObject = new JSONObject();
        if (C23471a.f55653a == null || (bVar = C23471a.f55653a.f55641g) == null) {
            a = Locale.getDefault();
        } else {
            a = bVar.mo38225a();
        }
        String country = a.getCountry();
        String language = a.getLanguage();
        String locale2 = a.toString();
        if (TextUtils.isEmpty(country) || TextUtils.isEmpty(language)) {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Resources.getSystem().getConfiguration().getLocales().get(0);
            } else {
                locale = Resources.getSystem().getConfiguration().locale;
            }
            if (locale != null) {
                country = locale.getCountry();
                language = locale.getLanguage();
                locale2 = language + "_" + country;
            }
        }
        C23482a.m44171a(jSONObject, "system_region", country);
        C23482a.m44171a(jSONObject, "system_language", language);
        C23482a.m44171a(jSONObject, "locale", locale2);
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) C23483b.m44173a(context, "phone");
            if (telephonyManager == null || telephonyManager.getSimState() != 5) {
                str = "";
            } else {
                str = telephonyManager.getSimOperator();
            }
            C23482a.m44171a(jSONObject, "carrier_region", str);
            C23482a.m44171a(jSONObject, "network_sim_region", str);
            TelephonyManager telephonyManager2 = (TelephonyManager) C23483b.m44173a(context, "phone");
            if (telephonyManager2 == null) {
                networkOperator = "";
            } else {
                networkOperator = telephonyManager2.getNetworkOperator();
            }
            C23482a.m44171a(jSONObject, "mcc_mnc", networkOperator);
        }
        try {
            String a3 = C23484a.m44179a(a2, "/location/region/", b, jSONObject.toString().getBytes());
            if (TextUtils.isEmpty(a3)) {
                return C23460a.m44152b("Server:Response empty");
            }
            JSONObject jSONObject2 = new JSONObject(a3);
            int a4 = C23482a.m44169a(jSONObject2, "status");
            String b2 = C23482a.m44172b(jSONObject2, "message", "");
            if (a4 == 0) {
                return m44182a(context, jSONObject2);
            }
            return C23460a.m44152b("resp status = " + a4 + ",message " + b2);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            return C23460a.m44152b(e.getMessage());
        }
    }

    /* renamed from: a */
    private static C23460a m44182a(Context context, JSONObject jSONObject) {
        try {
            C23460a a = C23460a.m44151a(C23482a.m44172b(jSONObject, "data", ""), 0);
            if (a != null) {
                C23473b.f55656b = a;
                C23478b.m44168a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: INVOKE  
                      (wrap: com.bytedance.ug.sdk.region.data.e.b$1 : 0x0013: CONSTRUCTOR  (r0v7 com.bytedance.ug.sdk.region.data.e.b$1) = (r2v0 'context' android.content.Context), (r1v3 'a' com.bytedance.ug.sdk.region.data.a.a) call: com.bytedance.ug.sdk.region.data.e.b.1.<init>(android.content.Context, com.bytedance.ug.sdk.region.data.a.a):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.ug.sdk.region.data.f.b.a(java.lang.Runnable):void in method: com.bytedance.ug.sdk.region.data.network.b.a(android.content.Context, org.json.JSONObject):com.bytedance.ug.sdk.region.data.a.a, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR  (r0v7 com.bytedance.ug.sdk.region.data.e.b$1) = (r2v0 'context' android.content.Context), (r1v3 'a' com.bytedance.ug.sdk.region.data.a.a) call: com.bytedance.ug.sdk.region.data.e.b.1.<init>(android.content.Context, com.bytedance.ug.sdk.region.data.a.a):void type: CONSTRUCTOR in method: com.bytedance.ug.sdk.region.data.network.b.a(android.content.Context, org.json.JSONObject):com.bytedance.ug.sdk.region.data.a.a, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ug.sdk.region.data.e.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    java.lang.String r1 = "data"
                    java.lang.String r0 = ""
                    java.lang.String r1 = com.bytedance.p1734ug.sdk.region.data.p1743h.C23482a.m44172b(r3, r1, r0)     // Catch:{ Exception -> 0x001a }
                    r0 = 0
                    com.bytedance.ug.sdk.region.data.a.a r1 = com.bytedance.p1734ug.sdk.region.data.p1736a.C23460a.m44151a(r1, r0)     // Catch:{ Exception -> 0x001a }
                    if (r1 == 0) goto L_0x0019
                    com.bytedance.p1734ug.sdk.region.data.p1740e.C23473b.f55656b = r1     // Catch:{ Exception -> 0x001a }
                    com.bytedance.ug.sdk.region.data.e.b$1 r0 = new com.bytedance.ug.sdk.region.data.e.b$1     // Catch:{ Exception -> 0x001a }
                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x001a }
                    com.bytedance.p1734ug.sdk.region.data.p1741f.C23478b.m44168a(r0)     // Catch:{ Exception -> 0x001a }
                L_0x0019:
                    return r1
                L_0x001a:
                    r2 = move-exception
                    r2.printStackTrace()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r0 = "Server:"
                    r1.<init>(r0)
                    java.lang.String r0 = r2.getMessage()
                    java.lang.StringBuilder r0 = r1.append(r0)
                    java.lang.String r0 = r0.toString()
                    com.bytedance.ug.sdk.region.data.a.a r0 = com.bytedance.p1734ug.sdk.region.data.p1736a.C23460a.m44152b(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1734ug.sdk.region.data.network.C23485b.m44182a(android.content.Context, org.json.JSONObject):com.bytedance.ug.sdk.region.data.a.a");
            }
        }
