package com.facebook.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24006ab;
import com.facebook.C24872m;
import com.facebook.GraphRequest;
import com.facebook.internal.C24768q;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23874b;
import com.facebook.p1814a.C23973h;
import com.facebook.p1814a.p1816b.p1817a.C23887e;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.r */
public final class C24770r {

    /* renamed from: a */
    public static final String f58776a = C24770r.class.getSimpleName();

    /* renamed from: b */
    public static final Map<String, C24768q> f58777b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final AtomicReference<EnumC24774a> f58778c = new AtomicReference<>(EnumC24774a.NOT_LOADED);

    /* renamed from: d */
    public static final ConcurrentLinkedQueue<AbstractC24775b> f58779d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    public static boolean f58780e = false;

    /* renamed from: f */
    private static final String[] f58781f = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"};

    /* renamed from: g */
    private static boolean f58782g = false;

    /* renamed from: h */
    private static JSONArray f58783h = null;

    /* renamed from: com.facebook.internal.r$b */
    public interface AbstractC24775b {
        static {
            Covode.recordClassIndex(28928);
        }

        /* renamed from: a */
        void mo39466a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.r$a */
    public enum EnumC24774a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        static {
            Covode.recordClassIndex(28927);
        }
    }

    static {
        Covode.recordClassIndex(28923);
    }

    /* renamed from: b */
    public static synchronized void m47431b() {
        synchronized (C24770r.class) {
            MethodCollector.m26663i(6453);
            EnumC24774a aVar = f58778c.get();
            if (EnumC24774a.NOT_LOADED.equals(aVar) || EnumC24774a.LOADING.equals(aVar)) {
                MethodCollector.m26664o(6453);
                return;
            }
            C24699ae.m47299a();
            final C24768q qVar = f58777b.get(C24872m.f59041a);
            Handler handler = new Handler(Looper.getMainLooper());
            if (EnumC24774a.ERROR.equals(aVar)) {
                while (true) {
                    ConcurrentLinkedQueue<AbstractC24775b> concurrentLinkedQueue = f58779d;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        final AbstractC24775b poll = concurrentLinkedQueue.poll();
                        handler.post(new Runnable() {
                            /* class com.facebook.internal.C24770r.RunnableC247722 */

                            static {
                                Covode.recordClassIndex(28925);
                            }

                            public final void run() {
                                C24677a.m47209a(this);
                            }
                        });
                    } else {
                        MethodCollector.m26664o(6453);
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<AbstractC24775b> concurrentLinkedQueue2 = f58779d;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        final AbstractC24775b poll2 = concurrentLinkedQueue2.poll();
                        handler.post(new Runnable() {
                            /* class com.facebook.internal.C24770r.RunnableC247733 */

                            static {
                                Covode.recordClassIndex(28926);
                            }

                            public final void run() {
                                if (!C24677a.m47209a(this)) {
                                    try {
                                        poll2.mo39466a();
                                    } catch (Throwable th) {
                                        C24677a.m47208a(th, this);
                                    }
                                }
                            }
                        });
                    } else {
                        MethodCollector.m26664o(6453);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m47429a() {
        C24699ae.m47299a();
        final Context context = C24872m.f59047g;
        C24699ae.m47299a();
        final String str = C24872m.f59041a;
        if (C24693ad.m47261a(str)) {
            f58778c.set(EnumC24774a.ERROR);
            m47431b();
        } else if (f58777b.containsKey(str)) {
            f58778c.set(EnumC24774a.SUCCESS);
            m47431b();
        } else {
            AtomicReference<EnumC24774a> atomicReference = f58778c;
            if (atomicReference.compareAndSet(EnumC24774a.NOT_LOADED, EnumC24774a.LOADING) || atomicReference.compareAndSet(EnumC24774a.ERROR, EnumC24774a.LOADING)) {
                final String a = C1764a.m5928a("com.facebook.internal.APP_SETTINGS.%s", new Object[]{str});
                C24872m.m47689c().execute(new Runnable() {
                    /* class com.facebook.internal.C24770r.RunnableC247711 */

                    static {
                        Covode.recordClassIndex(28924);
                    }

                    public final void run() {
                        EnumC24774a aVar;
                        if (!C24677a.m47209a(this)) {
                            try {
                                SharedPreferences a = C34822d.m71158a(context, "com.facebook.internal.preferences.APP_SETTINGS", 0);
                                C24768q qVar = null;
                                String string = a.getString(a, null);
                                if (!C24693ad.m47261a(string)) {
                                    try {
                                        qVar = C24770r.m47426a(str, new JSONObject(string));
                                    } catch (JSONException e) {
                                        C24693ad.m47255a("FacebookSDK", (Exception) e);
                                    }
                                }
                                JSONObject b = C24770r.m47430b(str);
                                if (b != null) {
                                    C24770r.m47426a(str, b);
                                    a.edit().putString(a, b.toString()).apply();
                                }
                                if (qVar != null) {
                                    String str = qVar.f58765m;
                                    if (!C24770r.f58780e && str != null && str.length() > 0) {
                                        C24770r.f58780e = true;
                                    }
                                }
                                C24764p.m47415a(str);
                                C24699ae.m47299a();
                                Context context = C24872m.f59047g;
                                C24699ae.m47299a();
                                String str2 = C24872m.f59041a;
                                boolean b2 = C24006ab.m45407b();
                                C24699ae.m47301a((Object) context, "context");
                                if (b2 && (context instanceof Application)) {
                                    Application application = (Application) context;
                                    if (!C24677a.m47209a(C23973h.class)) {
                                        try {
                                            if (C24872m.m47685a()) {
                                                if (!C23874b.f56511c) {
                                                    C23973h.m45331g().execute(
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009d: INVOKE  
                                                          (wrap: java.util.concurrent.Executor : 0x0094: INVOKE  (r1v16 java.util.concurrent.Executor) =  type: STATIC call: com.facebook.a.h.g():java.util.concurrent.Executor)
                                                          (wrap: com.facebook.a.b$1 : 0x009a: CONSTRUCTOR  (r0v67 com.facebook.a.b$1) =  call: com.facebook.a.b.1.<init>():void type: CONSTRUCTOR)
                                                         type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.facebook.internal.r.1.run():void, file: classes6.dex
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
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009a: CONSTRUCTOR  (r0v67 com.facebook.a.b$1) =  call: com.facebook.a.b.1.<init>():void type: CONSTRUCTOR in method: com.facebook.internal.r.1.run():void, file: classes6.dex
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                        	... 49 more
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.b, state: GENERATED_AND_UNLOADED
                                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                        	... 55 more
                                                        */
                                                    /*
                                                    // Method dump skipped, instructions count: 514
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C24770r.RunnableC247711.run():void");
                                                }
                                            });
                                            return;
                                        }
                                        m47431b();
                                    }
                                }

                                /* renamed from: a */
                                public static C24768q m47425a(String str) {
                                    if (str != null) {
                                        return f58777b.get(str);
                                    }
                                    return null;
                                }

                                /* renamed from: b */
                                public static JSONObject m47430b(String str) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f58781f))));
                                    GraphRequest a = GraphRequest.m45068a(str);
                                    a.f56463n = true;
                                    a.f56459j = bundle;
                                    return GraphRequest.m45069a(a).f59153b;
                                }

                                /* renamed from: a */
                                private static Map<String, Map<String, C24768q.C24769a>> m47428a(JSONObject jSONObject) {
                                    JSONArray optJSONArray;
                                    HashMap hashMap = new HashMap();
                                    if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
                                        for (int i = 0; i < optJSONArray.length(); i++) {
                                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                            String optString = optJSONObject.optString(StringSet.name);
                                            Uri uri = null;
                                            if (!C24693ad.m47261a(optString)) {
                                                String[] split = optString.split("\\|");
                                                if (split.length == 2) {
                                                    String str = split[0];
                                                    String str2 = split[1];
                                                    if (!C24693ad.m47261a(str) && !C24693ad.m47261a(str2)) {
                                                        String optString2 = optJSONObject.optString("url");
                                                        if (!C24693ad.m47261a(optString2)) {
                                                            uri = Uri.parse(optString2);
                                                        }
                                                        C24768q.C24769a aVar = new C24768q.C24769a(str, str2, uri, C24768q.C24769a.m47424a(optJSONObject.optJSONArray("versions")));
                                                        String str3 = aVar.f58772a;
                                                        Map map = (Map) hashMap.get(str3);
                                                        if (map == null) {
                                                            map = new HashMap();
                                                            hashMap.put(str3, map);
                                                        }
                                                        map.put(aVar.f58773b, aVar);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return hashMap;
                                }

                                /* renamed from: a */
                                public static C24768q m47427a(String str, boolean z) {
                                    if (!z) {
                                        Map<String, C24768q> map = f58777b;
                                        if (map.containsKey(str)) {
                                            return map.get(str);
                                        }
                                    }
                                    JSONObject b = m47430b(str);
                                    if (b == null) {
                                        return null;
                                    }
                                    C24768q a = m47426a(str, b);
                                    C24699ae.m47299a();
                                    if (str.equals(C24872m.f59041a)) {
                                        f58778c.set(EnumC24774a.SUCCESS);
                                        m47431b();
                                    }
                                    return a;
                                }

                                /* renamed from: a */
                                protected static C24768q m47426a(String str, JSONObject jSONObject) {
                                    C24752l a;
                                    boolean z;
                                    boolean z2;
                                    boolean z3;
                                    boolean z4;
                                    boolean z5;
                                    JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
                                    if (optJSONArray == null) {
                                        a = C24752l.m47398a();
                                    } else {
                                        a = C24752l.m47399a(optJSONArray);
                                    }
                                    int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
                                    if ((optInt & 8) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if ((optInt & 16) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if ((optInt & 32) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if ((optInt & 256) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if ((optInt & 16384) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    JSONArray optJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
                                    f58783h = optJSONArray2;
                                    if (optJSONArray2 != null && C24780u.m47438a()) {
                                        C23887e.m45154a(optJSONArray2.toString());
                                    }
                                    C24768q qVar = new C24768q(jSONObject.optBoolean("supports_implicit_sdk_logging", false), jSONObject.optString("gdpv4_nux_content", ""), jSONObject.optBoolean("gdpv4_nux_enabled", false), jSONObject.optInt("app_events_session_timeout", 60), EnumC24692ac.parseOptions(jSONObject.optLong("seamless_login")), m47428a(jSONObject.optJSONObject("android_dialog_configs")), z, a, jSONObject.optString("smart_login_bookmark_icon_url"), jSONObject.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject.optString("sdk_update_message"), z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
                                    f58777b.put(str, qVar);
                                    return qVar;
                                }
                            }
