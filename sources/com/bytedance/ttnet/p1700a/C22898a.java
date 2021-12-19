package com.bytedance.ttnet.p1700a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.C14581a;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.cronet.C14642a;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14655e;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.bytedance.frameworks.baselib.network.http.p982a.C14615a;
import com.bytedance.frameworks.baselib.network.http.p982a.C14616b;
import com.bytedance.frameworks.baselib.network.http.p983b.C14623f;
import com.bytedance.frameworks.baselib.network.http.p984c.C14626a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14711g;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14682e;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14703k;
import com.bytedance.frameworks.baselib.network.http.p993e.C14746d;
import com.bytedance.frameworks.baselib.network.http.p994f.C14749b;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.frameworks.baselib.network.http.p995g.C14757g;
import com.bytedance.frameworks.baselib.network.p979a.C14588c;
import com.bytedance.frameworks.baselib.network.p980b.C14604f;
import com.bytedance.frameworks.baselib.network.p981c.C14609c;
import com.bytedance.frameworks.p977a.p978a.C14578a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.ttnet.C22916b;
import com.bytedance.ttnet.C22932c;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p1705f.C22952a;
import com.bytedance.ttnet.p1705f.C22953b;
import com.bytedance.ttnet.p1705f.C22954c;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.bytedance.ttnet.utils.C22963a;
import com.bytedance.ttnet.utils.C22966b;
import com.bytedance.ttnet.utils.C22967c;
import com.bytedance.ttnet.utils.C22970d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.a.a */
public class C22898a implements WeakHandler.IHandler, C14578a.AbstractC14579a, C14588c.AbstractC14590b, C14659h.AbstractC14660a, C14659h.AbstractC14661b, C14731e.AbstractC14734c, C14731e.AbstractC14736e, C14731e.AbstractC14738g, C14731e.AbstractC14739h, C22932c.AbstractC22934b {

    /* renamed from: K */
    private static int f54051K = -1;

    /* renamed from: L */
    private static int f54052L = -1;

    /* renamed from: N */
    private static ArrayList<String> f54053N;

    /* renamed from: O */
    private static boolean f54054O = false;

    /* renamed from: P */
    private static boolean f54055P = false;

    /* renamed from: Q */
    private static boolean f54056Q = false;

    /* renamed from: a */
    public static String f54057a;

    /* renamed from: k */
    static boolean f54058k;

    /* renamed from: l */
    public static boolean f54059l;

    /* renamed from: m */
    static boolean f54060m = false;

    /* renamed from: n */
    private static C22898a f54061n;

    /* renamed from: A */
    private int f54062A = 0;

    /* renamed from: B */
    private int f54063B = 0;

    /* renamed from: C */
    private int f54064C = 1;

    /* renamed from: D */
    private int f54065D = 1;

    /* renamed from: E */
    private int f54066E = 1;

    /* renamed from: F */
    private int f54067F = 1;

    /* renamed from: G */
    private int f54068G = 1;

    /* renamed from: H */
    private int f54069H = 1;

    /* renamed from: I */
    private int f54070I = 0;

    /* renamed from: J */
    private List<String> f54071J = new CopyOnWriteArrayList();

    /* renamed from: M */
    private volatile int f54072M;

    /* renamed from: b */
    AtomicBoolean f54073b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Context f54074c;

    /* renamed from: d */
    public int f54075d = 0;

    /* renamed from: e */
    public String f54076e = "";

    /* renamed from: f */
    public List<String> f54077f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public String f54078g = "";

    /* renamed from: h */
    AtomicInteger f54079h = new AtomicInteger(10800);

    /* renamed from: i */
    public List<String> f54080i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final WeakHandler f54081j = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: o */
    private final boolean f54082o;

    /* renamed from: p */
    private AtomicLong f54083p = new AtomicLong(0);

    /* renamed from: q */
    private final Object f54084q = new Object();

    /* renamed from: r */
    private volatile boolean f54085r = false;

    /* renamed from: s */
    private String f54086s = "";

    /* renamed from: t */
    private int f54087t = 0;

    /* renamed from: u */
    private int f54088u = 0;

    /* renamed from: v */
    private long f54089v = 0;

    /* renamed from: w */
    private int f54090w = 0;

    /* renamed from: x */
    private int f54091x = 0;

    /* renamed from: y */
    private int f54092y = 1;

    /* renamed from: z */
    private int f54093z = 1;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ttnet.a.a$a */
    public static final class C22902a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(26810);
        }

        C22902a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG".equals(intent.getAction())) {
                new RunnableC13596e() {
                    /* class com.bytedance.ttnet.p1700a.C22898a.C22902a.C229031 */

                    static {
                        Covode.recordClassIndex(26811);
                    }

                    @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                    public final void run() {
                        C22909f.m43182a().mo37245h();
                    }
                }.mo21860a();
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.p979a.C14588c.AbstractC14590b
    /* renamed from: a */
    public final void mo23465a() {
        Logger.debug();
    }

    /* renamed from: a */
    public final boolean mo37237a(Object obj, C22954c.EnumC22957a aVar, long j) {
        JSONObject jSONObject;
        boolean z;
        boolean z2;
        int i;
        String string;
        MethodCollector.m26663i(5843);
        JSONObject jSONObject2 = new JSONObject();
        if (obj instanceof String) {
            String str = (String) obj;
            if (C13627m.m24498a(str)) {
                m43151a(jSONObject2, "empty response.");
                MethodCollector.m26664o(5843);
                return false;
            }
            jSONObject = new JSONObject(str);
        } else if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
            m43151a(jSONObject2, "object is null.");
            MethodCollector.m26664o(5843);
            return false;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        C22910g a = C22910g.m43194a(this.f54074c);
        a.f54127b = jSONObject3.toString();
        SharedPreferences.Editor edit = C34822d.m71158a(a.f54126a, "tt_state_config", 4).edit();
        edit.putString("tnc_delay_config", a.f54127b);
        C13611a.m24460a(edit);
        a.mo37247a(jSONObject3);
        C22910g.m43194a(a.f54126a).mo37246a(C14642a.f35464b);
        f54051K = jSONObject3.optInt("use_http_dns", -1);
        f54052L = jSONObject3.optInt("collect_recent_page_info_enable", -1);
        int optInt = jSONObject3.optInt("ok_http_open", 0);
        int optInt2 = jSONObject3.optInt("ok_http3_open", 0);
        int optInt3 = jSONObject3.optInt("cronet_version", 0);
        int optInt4 = jSONObject3.optInt("http_dns_enabled", 0);
        int optInt5 = jSONObject3.optInt("detect_open", 0);
        int optInt6 = jSONObject3.optInt("detect_native_page", 1);
        int optInt7 = jSONObject3.optInt("collect_recent_page_info_enable", 1);
        int optInt8 = jSONObject3.optInt("add_ss_queries_open", 0);
        int optInt9 = jSONObject3.optInt("add_ss_queries_header_open", 0);
        int optInt10 = jSONObject3.optInt("add_ss_queries_plaintext_open", 1);
        int optInt11 = jSONObject3.optInt("add_device_fingerprint_open", 1);
        int optInt12 = jSONObject3.optInt("image_ttnet_enabled", 1);
        int optInt13 = jSONObject3.optInt("sample_band_width_enabled", 1);
        int optInt14 = jSONObject3.optInt("cdn_sample_band_width_enabled", 1);
        int optInt15 = jSONObject3.optInt("dynamic_adjust_threadpool_size_open", 1);
        int optInt16 = jSONObject3.optInt("http_show_hijack", 1);
        int optInt17 = jSONObject3.optInt("http_verify_sign", 1);
        int optInt18 = jSONObject3.optInt("tnc_update_interval", -1);
        if (optInt18 > 0) {
            this.f54079h.set(optInt18);
        }
        JSONArray optJSONArray = jSONObject3.optJSONArray("send_tnc_host_arrays");
        if (optJSONArray != null) {
            this.f54080i.clear();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                if (!TextUtils.isEmpty(optJSONArray.optString(i2))) {
                    this.f54080i.add(optJSONArray.optString(i2));
                }
            }
        }
        synchronized (this) {
            try {
                this.f54087t = optInt;
                this.f54088u = optInt2;
                this.f54070I = optInt3;
                this.f54090w = optInt4;
                this.f54091x = optInt5;
                this.f54092y = optInt6;
                this.f54093z = optInt7;
                this.f54062A = optInt8;
                this.f54063B = optInt9;
                this.f54064C = optInt10;
                this.f54068G = optInt11;
                this.f54069H = optInt15;
                this.f54065D = optInt12;
                this.f54066E = optInt13;
                this.f54067F = optInt14;
            } finally {
                MethodCollector.m26664o(5843);
            }
        }
        C14604f.m26688a(optInt15 > 0);
        if (jSONObject3.optInt("enable_req_ticket", 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        C22967c.f54321c = z;
        int optInt19 = jSONObject3.optInt("ttnet_response_verify_enabled", -1);
        JSONArray optJSONArray2 = jSONObject3.optJSONArray("ttnet_response_verify");
        String str2 = "";
        if (optJSONArray2 != null) {
            str2 = optJSONArray2.toString();
        }
        C22963a.m43293a(optInt19, optJSONArray2);
        C22963a.C22964a aVar2 = new C22963a.C22964a();
        aVar2.f54316a = optInt19;
        aVar2.f54317b = str2;
        if (this.f54062A > 0 || this.f54063B > 0) {
            SsInterceptor.f54304a = true;
        }
        C14746d.f35933a = jSONObject3.optInt("read_response_buff_init_size", 0);
        C14746d.f35934b = jSONObject3.optInt("read_response_buff_increase_size", 0);
        C14659h.f35586e = jSONObject3.optInt("cronet_inputstream_buff_size", 0);
        String optString = jSONObject3.optString("frontier_urls", "");
        String optString2 = jSONObject3.optString("share_cookie_host_list", "");
        TTNetInit.getTTNetDepend().mo37262a(optString2);
        String optString3 = jSONObject3.optString("api_http_host_list", "");
        String optString4 = jSONObject3.optString("concurrent_request_config", "");
        C14655e.m26792a().mo23624a(optString4);
        String optString5 = jSONObject3.optString("add_common_params", "");
        C14615a aVar3 = C14616b.m26722a().f35396a;
        if (aVar3 != null) {
            aVar3.mo23499a(optString5);
        }
        String optString6 = jSONObject3.optString("L0_params", "");
        C14609c.m26706a().mo23496b(optString6);
        int optInt20 = jSONObject3.optInt("query_filter_enabled", Integer.MIN_VALUE);
        String optString7 = jSONObject3.optString("query_filter_actions");
        if (optInt20 != Integer.MIN_VALUE) {
            C14609c.m26706a().f35337a = optInt20 > 0;
            C14609c.m26706a().mo23495a(optString7);
        } else {
            optInt20 = Integer.MIN_VALUE;
        }
        int optInt21 = jSONObject3.optInt("disable_store_region_v2", 0);
        C14749b a2 = C14749b.m27031a();
        if (optInt21 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a2.f35946h == null || !a2.f35947i || a2.f35948j == z2) {
            i = 0;
        } else {
            a2.f35948j = z2;
            i = 0;
            SharedPreferences.Editor edit2 = C34822d.m71158a(a2.f35946h, "ttnet_store_region", 0).edit();
            edit2.putBoolean("disable_store_region", a2.f35948j);
            edit2.apply();
        }
        this.f54072M = jSONObject3.optInt("disable_encrypt_switch", i);
        this.f54076e = jSONObject3.optString("cronet_so_path", "");
        if (this.f54072M == 2) {
            SharedPreferences.Editor edit3 = C34822d.m71158a(this.f54074c, "app_log_encrypt_switch_count", i).edit();
            edit3.putInt("app_log_encrypt_faild_count", i);
            C13611a.m24460a(edit3);
        }
        int optInt22 = jSONObject3.optInt("disable_framed_transport", i);
        if (optInt22 > 0) {
            try {
                C14711g.m26936a(optInt22);
            } catch (Throwable unused) {
            }
        }
        synchronized (this) {
            try {
                SharedPreferences a3 = C34822d.m71158a(this.f54074c, "ss_app_config", 0);
                string = a3.getString("share_cookie_host_list", "");
                SharedPreferences.Editor edit4 = a3.edit();
                edit4.putString("ttnet_response_verify", aVar2.f54317b);
                edit4.putInt("ttnet_response_verify_enabled", aVar2.f54316a);
                edit4.putInt("read_response_buff_init_size", C14746d.f35933a);
                edit4.putInt("read_response_buff_increase_size", C14746d.f35934b);
                edit4.putInt("cronet_inputstream_buff_size", C14659h.f35586e);
                edit4.putInt("ok_http_open", optInt);
                edit4.putInt("ok_http3_open", optInt2);
                edit4.putInt("cronet_version", optInt3);
                edit4.putInt("http_dns_enabled", optInt4);
                edit4.putInt("detect_open", optInt5);
                edit4.putInt("detect_native_page", optInt6);
                edit4.putInt("collect_recent_page_info_enable", optInt7);
                edit4.putInt("add_ss_queries_open", optInt8);
                edit4.putInt("add_ss_queries_header_open", optInt9);
                edit4.putInt("add_ss_queries_plaintext_open", optInt10);
                edit4.putInt("add_device_fingerprint_open", optInt11);
                edit4.putInt("dynamic_adjust_threadpool_size_open", optInt15);
                edit4.putInt("image_ttnet_enabled", optInt12);
                edit4.putInt("use_http_dns", f54051K);
                edit4.putInt("use_http_dns_refetch_on_expire", f54052L);
                edit4.putInt("http_show_hijack", optInt16);
                edit4.putInt("http_verify_sign", optInt17);
                edit4.putString("frontier_urls", optString);
                edit4.putString("cronet_so_path", this.f54076e);
                edit4.putString("share_cookie_host_list", optString2);
                jSONObject2.put("oldShareCookieHosts", string);
                jSONObject2.put("newShareCookieHosts", optString2);
                if (!TextUtils.isEmpty(optString2)) {
                    this.f54077f.clear();
                    C22970d.m43304b(optString2, this.f54077f);
                }
                String d = TTNetInit.getTTNetDepend().mo37266d();
                if (!C13627m.m24498a(d) && !C22970d.m43303a(d, this.f54077f)) {
                    this.f54077f.add(d);
                }
                edit4.putString("api_http_host_list", optString3);
                edit4.putString("concurrent_request_config", optString4);
                edit4.putString("add_common_params", optString5);
                edit4.putString("query_filter_actions", optString7);
                edit4.putString("L0_params", optString6);
                edit4.putInt("query_filter_enabled", optInt20);
                String[] split = optString3.split(",");
                for (String str3 : split) {
                    if (!C13627m.m24498a(str3) && !C22970d.m43303a(str3, this.f54071J)) {
                        this.f54071J.add(str3.trim());
                    }
                }
                edit4.putInt("android_log_encrypt_switch", this.f54072M);
                edit4.putInt("image_ttnet_enabled", this.f54065D);
                edit4.putInt("sample_band_width_enabled", this.f54066E);
                edit4.putInt("cdn_sample_band_width_enabled", this.f54067F);
                edit4.putInt("disable_framed_transport", optInt22);
                edit4.putInt("tnc_update_interval", this.f54079h.get());
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < this.f54080i.size(); i3++) {
                    sb.append(this.f54080i.get(i3));
                    if (i3 != this.f54080i.size()) {
                        sb.append(',');
                    }
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    edit4.putString("send_tnc_host_arrays", sb2);
                }
                C13611a.m24460a(edit4);
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (!C13627m.m24498a(optString) && !optString.equals(this.f54086s)) {
                        this.f54086s = optString;
                        linkedHashMap.put("frontier_urls", optString);
                    }
                    linkedHashMap.put("http_dns_enabled", Integer.valueOf(optInt4));
                    linkedHashMap.put("add_ss_queries_open", Integer.valueOf(optInt8));
                    linkedHashMap.put("add_ss_queries_header_open", Integer.valueOf(optInt9));
                    linkedHashMap.put("add_ss_queries_plaintext_open", Integer.valueOf(optInt10));
                    linkedHashMap.put("share_cookie_host_list", optString2);
                    linkedHashMap.put("disable_framed_transport", Integer.valueOf(optInt22));
                    linkedHashMap.put("query_filter_actions", optString7);
                    linkedHashMap.put("L0_params", optString6);
                    linkedHashMap.put("query_filter_enabled", Integer.valueOf(optInt20));
                    TTNetInit.getTTNetDepend().mo37261a(this.f54074c, linkedHashMap);
                    Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                    if (!TextUtils.isEmpty(f54057a)) {
                        intent.setPackage(f54057a);
                    }
                    this.f54074c.sendBroadcast(intent);
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!C13627m.m24498a(optString2)) {
            C22907e a4 = C22907e.m43179a();
            if (!optString2.equals(string)) {
                
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04ee: INVOKE  
                      (wrap: com.bytedance.ttnet.a.e$1 : 0x04eb: CONSTRUCTOR  (r1v30 com.bytedance.ttnet.a.e$1) = (r3v11 'a4' com.bytedance.ttnet.a.e), (r2v11 'string' java.lang.String), (r22v0 'optString2' java.lang.String) call: com.bytedance.ttnet.a.e.1.<init>(com.bytedance.ttnet.a.e, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: com.bytedance.common.utility.b.e.a():void in method: com.bytedance.ttnet.a.a.a(java.lang.Object, com.bytedance.ttnet.f.c$a, long):boolean, file: classes.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04eb: CONSTRUCTOR  (r1v30 com.bytedance.ttnet.a.e$1) = (r3v11 'a4' com.bytedance.ttnet.a.e), (r2v11 'string' java.lang.String), (r22v0 'optString2' java.lang.String) call: com.bytedance.ttnet.a.e.1.<init>(com.bytedance.ttnet.a.e, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.ttnet.a.a.a(java.lang.Object, com.bytedance.ttnet.f.c$a, long):boolean, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ttnet.a.e, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                // Method dump skipped, instructions count: 1419
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p1700a.C22898a.mo37237a(java.lang.Object, com.bytedance.ttnet.f.c$a, long):boolean");
            }

            /* renamed from: a */
            public final void mo37236a(ArrayList<String> arrayList) {
                if (!arrayList.isEmpty()) {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (!C13627m.m24498a(next) && !C22970d.m43303a(next, this.f54077f)) {
                            this.f54077f.add(next.trim());
                        }
                    }
                }
            }

            /* renamed from: j */
            public static boolean m43154j() {
                try {
                    return C34719f.C34720a.f82009a.mo61395c();
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.AbstractC14661b
            /* renamed from: c */
            public final boolean mo23629c() {
                if (!f54054O && this.f54090w > 0) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.frameworks.p977a.p978a.C14578a.AbstractC14579a
            /* renamed from: e */
            public final boolean mo23459e() {
                if (!f54055P && this.f54063B > 0) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.frameworks.p977a.p978a.C14578a.AbstractC14579a
            /* renamed from: f */
            public final boolean mo23460f() {
                if (!f54055P && this.f54064C <= 0) {
                    return false;
                }
                return true;
            }

            /* renamed from: k */
            public static String[] m43155k() {
                String[] b = TTNetInit.getTTNetDepend().mo37264b();
                if (b == null || b.length <= 0) {
                    return new String[0];
                }
                return b;
            }

            @Override // com.bytedance.frameworks.p977a.p978a.C14578a.AbstractC14579a
            /* renamed from: d */
            public final boolean mo23458d() {
                if (!f54055P && this.f54062A <= 0) {
                    return false;
                }
                return true;
            }

            static {
                Covode.recordClassIndex(26806);
                ArrayList<String> arrayList = new ArrayList<>();
                f54053N = arrayList;
                arrayList.add("MI PAD 2");
                f54053N.add("YT3-X90L");
                f54053N.add("YT3-X90F");
                f54053N.add("GT-810");
            }

            @Override // com.bytedance.ttnet.C22932c.AbstractC22934b
            /* renamed from: g */
            public final boolean mo37239g() {
                if (f54059l) {
                    C14722o.f35853b = 0;
                    return false;
                } else if (f54060m) {
                    C14722o.f35853b = 8;
                    return false;
                } else if (f54058k || this.f54075d <= 5) {
                    TTNetInit.getTTNetDepend();
                    return true;
                } else {
                    C14722o.f35853b = 3;
                    return false;
                }
            }

            @Override // com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.AbstractC14660a
            /* renamed from: b */
            public final boolean mo23628b() {
                Logger.debug();
                SharedPreferences a = C34822d.m71158a(this.f54074c, "ss_app_config", 0);
                this.f54075d = a.getInt("chromium_boot_failures", 0);
                this.f54089v = a.getLong("chromium_boot_failures_timestamp", 0);
                if (this.f54075d > 5 && System.currentTimeMillis() - this.f54089v > TimeUnit.HOURS.toMillis(1)) {
                    this.f54075d = 5;
                }
                if (!mo37239g()) {
                    return false;
                }
                SharedPreferences.Editor edit = a.edit();
                edit.putInt("chromium_boot_failures", this.f54075d + 1);
                edit.putLong("chromium_boot_failures_timestamp", System.currentTimeMillis());
                Logger.debug();
                C13611a.m24460a(edit);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("chromium_boot_failures", Integer.valueOf(this.f54075d + 1));
                TTNetInit.getTTNetDepend().mo37261a(this.f54074c, linkedHashMap);
                return true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public final synchronized void mo37240h() {
                String str;
                MethodCollector.m26663i(5682);
                if (System.currentTimeMillis() - this.f54083p.get() > ((long) this.f54079h.get()) * 1000) {
                    this.f54083p.set(System.currentTimeMillis());
                    try {
                        int a = TTNetInit.getTTNetDepend().mo37258a(this.f54074c, "disable_framed_transport", 0);
                        if (a > 0) {
                            try {
                                C14711g.m26936a(a);
                            } catch (Throwable unused) {
                            }
                        }
                        if (C22954c.m43256a().f54287b != null) {
                            C22953b bVar = C22954c.m43256a().f54287b;
                            long j = this.f54083p.get();
                            try {
                                String a2 = C22966b.m43297a(bVar.f54278a, 4);
                                if (TextUtils.isEmpty(a2)) {
                                    a2 = C22953b.m43253a();
                                    if (TextUtils.isEmpty(a2)) {
                                        MethodCollector.m26664o(5682);
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject(a2);
                                C22952a a3 = C22953b.m43252a(jSONObject);
                                C14703k.m26921a().mo23708a(jSONObject, C22954c.EnumC22957a.TTCACHE.mValue, C22966b.m43297a(bVar.f54278a, 5), C22966b.m43297a(bVar.f54278a, 6), j);
                                C14682e.m26869a().mo23684a(jSONObject);
                                C14581a.m26665a(jSONObject);
                                if (Logger.debug()) {
                                    StringBuilder sb = new StringBuilder("loadLocalConfigForOtherProcess, config: ");
                                    if (a3 == null) {
                                        str = "null";
                                    } else {
                                        str = a3.toString();
                                    }
                                    Logger.m24396d("TNCConfigHandler", sb.append(str).toString());
                                }
                                if (a3 != null) {
                                    bVar.f54279b = a3;
                                }
                                MethodCollector.m26664o(5682);
                                return;
                            } catch (Throwable unused2) {
                                Logger.debug();
                            }
                        }
                        MethodCollector.m26664o(5682);
                        return;
                    } catch (Exception unused3) {
                    }
                }
                MethodCollector.m26664o(5682);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
                com.bytedance.ttnet.p1700a.C22910g.m43194a(r9.f54074c).mo37248c();
                r4 = com.p2082ss.android.ugc.aweme.p2387bf.C34822d.m71158a(r9.f54074c, "ss_app_config", 0);
                r9.f54087t = r4.getInt("ok_http_open", 0);
                r9.f54088u = r4.getInt("ok_http3_open", 0);
                r9.f54070I = r4.getInt("cronet_version", 0);
                r9.f54090w = r4.getInt("http_dns_enabled", 0);
                r9.f54091x = r4.getInt("detect_open", 0);
                r9.f54092y = r4.getInt("detect_native_page", 1);
                r9.f54093z = r4.getInt("collect_recent_page_info_enable", 1);
                r9.f54062A = r4.getInt("add_ss_queries_open", 0);
                r9.f54063B = r4.getInt("add_ss_queries_header_open", 0);
                r9.f54064C = r4.getInt("add_ss_queries_plaintext_open", 1);
                r9.f54068G = r4.getInt("add_device_fingerprint_open", 1);
                r9.f54069H = r4.getInt("dynamic_adjust_threadpool_size_open", 1);
                r9.f54075d = r4.getInt("chromium_boot_failures", 0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0091, code lost:
                if (r9.f54069H <= 0) goto L_0x0113;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0093, code lost:
                r0 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0094, code lost:
                com.bytedance.frameworks.baselib.network.p980b.C14604f.m26688a(r0);
                r9.f54065D = r4.getInt("image_ttnet_enabled", 1);
                r9.f54066E = r4.getInt("sample_band_width_enabled", 1);
                r9.f54067F = r4.getInt("cdn_sample_band_width_enabled", 1);
                com.bytedance.ttnet.p1700a.C22898a.f54051K = r4.getInt("use_http_dns", -1);
                com.bytedance.ttnet.p1700a.C22898a.f54052L = r4.getInt("use_http_dns_refetch_on_expire", -1);
                com.bytedance.frameworks.baselib.network.http.p993e.C14746d.m27017a(r4);
                com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.m26811a(r4);
                com.bytedance.ttnet.utils.C22963a.m43294a(r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x00cb, code lost:
                if (r9.f54062A > 0) goto L_0x00d1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x00cf, code lost:
                if (r9.f54063B <= 0) goto L_0x00d3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d1, code lost:
                com.bytedance.ttnet.retrofit.SsInterceptor.f54304a = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
                r9.f54086s = r4.getString("frontier_urls", "");
                r9.f54076e = r4.getString("cronet_so_path", "");
                r1 = r4.getString("api_http_host_list", "");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f3, code lost:
                if (com.bytedance.common.utility.C13627m.m24498a(r1) != false) goto L_0x0115;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f5, code lost:
                r7 = r1.split(",");
                r3 = r7.length;
                r2 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00fd, code lost:
                if (r2 >= r3) goto L_0x0115;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ff, code lost:
                r1 = r7[r2];
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0105, code lost:
                if (com.bytedance.common.utility.C13627m.m24498a(r1) != false) goto L_0x0110;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0107, code lost:
                r9.f54071J.add(r1.trim());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0110, code lost:
                r2 = r2 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0113, code lost:
                r0 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0115, code lost:
                com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14655e.m26792a().mo23624a(r4.getString("concurrent_request_config", ""));
                r1 = r4.getString("add_common_params", "");
                r0 = com.bytedance.frameworks.baselib.network.http.p982a.C14616b.m26722a().f35396a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0132, code lost:
                if (r0 == null) goto L_0x0137;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0134, code lost:
                r0.mo23499a(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0137, code lost:
                com.bytedance.frameworks.baselib.network.p981c.C14609c.m26706a().mo23496b(r4.getString("L0_params", ""));
                r2 = r4.getInt("query_filter_enabled", Integer.MIN_VALUE);
                r1 = r4.getString("query_filter_actions", "");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0156, code lost:
                if (r2 == Integer.MIN_VALUE) goto L_0x0167;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0158, code lost:
                r0 = com.bytedance.frameworks.baselib.network.p981c.C14609c.m26706a();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x015c, code lost:
                if (r2 <= 0) goto L_0x01de;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x015e, code lost:
                r0.f35337a = r6;
                com.bytedance.frameworks.baselib.network.p981c.C14609c.m26706a().mo23495a(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0167, code lost:
                r3 = r4.getString("share_cookie_host_list", "");
                com.bytedance.ttnet.utils.C22970d.m43304b(r3, r9.f54077f);
                r1 = com.bytedance.ttnet.TTNetInit.getTTNetDepend().mo37266d();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0180, code lost:
                if (com.bytedance.common.utility.C13627m.m24498a(r1) != false) goto L_0x018f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0188, code lost:
                if (com.bytedance.ttnet.utils.C22970d.m43303a(r1, r9.f54077f) != false) goto L_0x018f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x018a, code lost:
                r9.f54077f.add(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x018f, code lost:
                r9.f54079h.set(r4.getInt("tnc_update_interval", 10800));
                r1 = r4.getString("send_tnc_host_arrays", "");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x01a8, code lost:
                if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x01be;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x01aa, code lost:
                r2 = r1.split(",");
                r9.f54080i.clear();
                r9.f54080i.addAll(java.util.Arrays.asList(r2));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x01c4, code lost:
                if (com.bytedance.ttnet.p1705f.C22954c.m43256a().f54287b == null) goto L_0x01d5;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c6, code lost:
                com.bytedance.ttnet.p1705f.C22954c.m43256a().f54287b.mo37280a(r9.f54083p.get());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d5, code lost:
                r4 = r4.getInt("disable_framed_transport", 0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x01db, code lost:
                if (r4 <= 0) goto L_0x01e4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x01de, code lost:
                r6 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
                com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14711g.m26936a(r4);
             */
            /* renamed from: i */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo37241i() {
                /*
                // Method dump skipped, instructions count: 599
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p1700a.C22898a.mo37241i():void");
            }

            @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14739h
            /* renamed from: d */
            public final List<String> mo23739d(String str) {
                if (C22970d.m43303a(str, this.f54077f)) {
                    return this.f54077f;
                }
                return null;
            }

            /* renamed from: e */
            public static String m43153e(String str) {
                if (C13627m.m24498a(str)) {
                    return str;
                }
                try {
                    C22954c.m43256a();
                    return C14703k.m26921a().mo23707a(str);
                } catch (Throwable unused) {
                    return str;
                }
            }

            /* renamed from: b */
            public final boolean mo37238b(final C22954c.EnumC22957a aVar) {
                if (!this.f54073b.compareAndSet(false, true)) {
                    return false;
                }
                new RunnableC13596e() {
                    /* class com.bytedance.ttnet.p1700a.C22898a.C229002 */

                    static {
                        Covode.recordClassIndex(26808);
                    }

                    @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                    public final void run() {
                        C22898a aVar = C22898a.this;
                        C22954c.EnumC22957a aVar2 = aVar;
                        Logger.debug();
                        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132253e = C22898a.m43154j();
                        }
                        if (C58029j.f132253e) {
                            aVar.mo37241i();
                            if (aVar.mo37239g()) {
                                aVar.f54073b.set(false);
                                return;
                            }
                            int i = 102;
                            if (C22954c.m43258a(aVar.f54074c, true, aVar2) || C22954c.m43258a(aVar.f54074c, false, C22954c.EnumC22957a.PORTRETRY)) {
                                i = 101;
                            }
                            aVar.f54081j.sendEmptyMessage(i);
                            aVar.f54081j.removeMessages(103);
                            aVar.f54081j.sendEmptyMessageDelayed(103, (long) (aVar.f54079h.get() * 1000));
                        }
                    }
                }.mo21860a();
                return true;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14738g
            /* renamed from: c */
            public final boolean mo23737c(String str) {
                if (C13627m.m24498a(str) || this.f54066E <= 0) {
                    return false;
                }
                try {
                    URI a = C14757g.m27060a(str);
                    if (a == null) {
                        return false;
                    }
                    String host = a.getHost();
                    if (!C13627m.m24498a(host) && host.endsWith(C22916b.m43214a())) {
                        return true;
                    }
                    return false;
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public void handleMsg(Message message) {
                switch (message.what) {
                    case 101:
                        this.f54083p.set(System.currentTimeMillis());
                        Logger.debug();
                        this.f54073b.set(false);
                        return;
                    case 102:
                        Logger.debug();
                        this.f54073b.set(false);
                        return;
                    case 103:
                        Logger.debug();
                        mo37235a(C22954c.EnumC22957a.TTPOLL);
                        return;
                    default:
                        return;
                }
            }

            @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14734c
            /* renamed from: a */
            public final String mo23732a(String str) {
                if (C13627m.m24498a(str)) {
                    return str;
                }
                try {
                    if (this.f54082o) {
                        mo37241i();
                    } else {
                        mo37240h();
                    }
                } catch (Throwable unused) {
                }
                return str;
            }

            /* renamed from: a */
            public static C22898a m43150a(Context context) {
                C22898a aVar;
                MethodCollector.m26663i(4977);
                synchronized (C22898a.class) {
                    try {
                        if (f54061n == null) {
                            boolean a = C14756f.m27056a(context);
                            Context applicationContext = context.getApplicationContext();
                            if (C58003a.f132201c) {
                                if (applicationContext == null) {
                                    applicationContext = C58003a.f132199a;
                                }
                            }
                            f54061n = new C22898a(applicationContext, a);
                            if (f54053N.contains(Build.MODEL)) {
                                f54060m = true;
                            }
                            f54057a = context.getPackageName();
                            if (a) {
                                C14578a.f35247a = f54061n;
                                C14659h.f35588g = f54061n;
                                C14659h.f35587f = f54061n;
                                C22932c.f54199a = f54061n;
                                C14588c cVar = C14588c.C14589a.f35268a;
                                C22898a aVar2 = f54061n;
                                if (aVar2 != null) {
                                    cVar.f35263b.add(aVar2);
                                }
                                cVar.f35262a.get();
                                C14731e.f35912a = f54061n;
                                C14731e.f35913b = f54061n;
                                if (C14731e.f35920i == null) {
                                    C14731e.f35920i = f54061n;
                                }
                            } else {
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                                try {
                                    m43152b(context, new C22902a(), intentFilter);
                                } catch (Throwable unused) {
                                }
                                C22909f a2 = C22909f.m43182a();
                                C14578a.f35247a = a2;
                                C14659h.f35588g = a2;
                                C14659h.f35587f = a2;
                                C22932c.f54199a = a2;
                                if (C14731e.f35920i == null) {
                                    C14731e.f35920i = a2;
                                }
                            }
                            C14731e.f35919h = f54061n;
                            C22905c.m43176a(context);
                        }
                        aVar = f54061n;
                    } finally {
                        MethodCollector.m26664o(4977);
                    }
                }
                return aVar;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14736e
            /* renamed from: b */
            public final boolean mo23735b(String str) {
                if (C13627m.m24498a(str) || this.f54067F <= 0) {
                    return false;
                }
                try {
                    URI a = C14757g.m27060a(str);
                    if (a == null || C13627m.m24498a(a.getHost())) {
                        return false;
                    }
                    TTNetInit.getTTNetDepend();
                    throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
                } catch (Throwable unused) {
                    return false;
                }
            }

            /* renamed from: a */
            public final void mo37235a(C22954c.EnumC22957a aVar) {
                if (this.f54082o) {
                    mo37238b(aVar);
                } else if (this.f54083p.get() <= 0) {
                    try {
                        new RunnableC13596e() {
                            /* class com.bytedance.ttnet.p1700a.C22898a.C228991 */

                            static {
                                Covode.recordClassIndex(26807);
                            }

                            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                            public final void run() {
                                C22898a.this.mo37240h();
                            }
                        }.mo21860a();
                    } catch (Throwable unused) {
                    }
                }
            }

            /* renamed from: a */
            private void m43151a(JSONObject jSONObject, String str) {
                try {
                    jSONObject.put("return", str);
                    jSONObject.put("CurrentShareCookieHostList", this.f54077f.toString());
                } catch (JSONException unused) {
                }
                TTNetInit.getTTNetDepend();
                TTNetInit.getTTNetDepend().mo37259a();
            }

            private C22898a(Context context, boolean z) {
                this.f54074c = context;
                this.f54082o = z;
            }

            /* renamed from: a */
            private static Intent m43149a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
                try {
                    return context.registerReceiver(broadcastReceiver, intentFilter);
                } catch (Exception e) {
                    if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    throw e;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
                r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
                if (r0 != false) goto L_0x0025;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
                r2 = move-exception;
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
                com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
                return null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
                return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
                r0 = r2.getMessage();
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                if (r0 != null) goto L_0x0018;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static android.content.Intent m43152b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
                /*
                    android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                    com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                    android.content.Intent r0 = m43149a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                    return r0
                L_0x000c:
                    android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                    return r0
                L_0x0011:
                    r2 = move-exception
                    java.lang.String r0 = r2.getMessage()
                    if (r0 == 0) goto L_0x0027
                    java.lang.String r1 = r2.getMessage()
                    java.lang.String r0 = "regist too many Broadcast Receivers"
                    boolean r0 = r1.contains(r0)
                    if (r0 != 0) goto L_0x0025
                    goto L_0x0027
                L_0x0025:
                    throw r2
                L_0x0026:
                    r2 = move-exception
                L_0x0027:
                    java.lang.String r0 = "Register Receiver Exception"
                    com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p1700a.C22898a.m43152b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
            }

            @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14739h
            /* renamed from: a */
            public final List<String> mo23738a(CookieManager cookieManager, C14626a aVar, URI uri) {
                String str;
                if (uri == null) {
                    return null;
                }
                if (cookieManager == null && aVar == null) {
                    return null;
                }
                try {
                    str = uri.getHost();
                } catch (Exception unused) {
                    str = null;
                }
                if (C13627m.m24498a(str) || !C22970d.m43303a(str, this.f54077f) || C13627m.m24498a(TTNetInit.getTTNetDepend().mo37266d())) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                if (cookieManager != null) {
                    String cookie = cookieManager.getCookie(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().mo37266d());
                    if (!C13627m.m24498a(cookie)) {
                        arrayList.add(cookie);
                        return arrayList;
                    }
                }
                if (!C13617h.m24465a(arrayList) || aVar == null) {
                    return arrayList;
                }
                try {
                    Map<String, List<String>> map = aVar.get(URI.create(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().mo37266d()), new LinkedHashMap());
                    if (map == null || map.isEmpty()) {
                        return arrayList;
                    }
                    return map.get("Cookie");
                } catch (Throwable unused2) {
                    return arrayList;
                }
            }

            @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14734c
            /* renamed from: a */
            public final void mo23733a(String str, String str2, boolean z) {
                if (!this.f54071J.isEmpty()) {
                    for (String str3 : this.f54071J) {
                        if (!C13627m.m24498a(str3) && str.endsWith(str3)) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("url", str + str2);
                                jSONObject.put("replace", z);
                                TTNetInit.monitorLogSend("api_http", jSONObject);
                            } catch (Throwable unused) {
                            }
                            if (TTNetInit.apiHttpInterceptEnabled() && !z) {
                                throw new C14623f("Api http request is not allowed to be executed");
                            }
                            return;
                        }
                    }
                }
            }
        }
