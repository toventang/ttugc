package com.bytedance.ttnet.p1700a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.C14642a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14703k;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.retrofit.C22958a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.a.g */
public class C22910g implements SsHttpCall.AbstractC21971a {

    /* renamed from: d */
    private static final String f54121d = C22910g.class.getSimpleName();

    /* renamed from: e */
    private static String f54122e;

    /* renamed from: f */
    private static C22910g f54123f;

    /* renamed from: h */
    private static final Object f54124h = new Object();

    /* renamed from: q */
    private static final Object f54125q = new Object();

    /* renamed from: a */
    final Context f54126a;

    /* renamed from: b */
    String f54127b = "";

    /* renamed from: c */
    public Map<String, Integer> f54128c = new ConcurrentHashMap();

    /* renamed from: g */
    private final boolean f54129g;

    /* renamed from: i */
    private Map<C14642a.EnumC14643a, C22911a> f54130i = new HashMap();

    /* renamed from: j */
    private boolean f54131j = false;

    /* renamed from: k */
    private boolean f54132k = false;

    /* renamed from: l */
    private int f54133l = 1000;

    /* renamed from: m */
    private int f54134m = 100;

    /* renamed from: n */
    private Set<String> f54135n = new HashSet();

    /* renamed from: o */
    private Map<String, Integer> f54136o = new HashMap();

    /* renamed from: p */
    private AtomicInteger f54137p = new AtomicInteger(0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ttnet.a.g$b */
    public static final class C22912b extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(26820);
        }

        C22912b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION".equals(intent.getAction())) {
                new RunnableC13596e() {
                    /* class com.bytedance.ttnet.p1700a.C22910g.C22912b.C229131 */

                    static {
                        Covode.recordClassIndex(26821);
                    }

                    @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                    public final void run() {
                        C22915i.m43207c().mo37251d();
                    }
                }.mo21860a();
            }
        }
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: a */
    public final boolean mo35772a() {
        return this.f54131j;
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: b */
    public final boolean mo35773b() {
        return C14703k.m26921a().mo23709b();
    }

    static {
        Covode.recordClassIndex(26818);
    }

    /* renamed from: c */
    public final void mo37248c() {
        String string = C34822d.m71158a(this.f54126a, "tt_state_config", 4).getString("tnc_delay_config", "");
        this.f54127b = string;
        if (!TextUtils.isEmpty(string)) {
            try {
                mo37247a(new JSONObject(this.f54127b));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        Logger.debug();
        if (this.f54129g) {
            mo37246a(C14642a.f35464b);
        }
    }

    /* renamed from: d */
    private void m43198d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f54131j) {
            linkedHashMap.put("app_delay_enable", 1);
        } else {
            linkedHashMap.put("app_delay_enable", 0);
        }
        if (this.f54132k) {
            linkedHashMap.put("app_delay_use_black_list", 1);
        } else {
            linkedHashMap.put("app_delay_use_black_list", 0);
        }
        linkedHashMap.put("app_delay_whitelist_delay_time", Integer.valueOf(this.f54134m));
        Set<String> set = this.f54135n;
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i] + ",");
        }
        if (strArr.length > 0) {
            linkedHashMap.put("app_delay_white_list", stringBuffer.substring(0, stringBuffer.length() - 1));
        } else {
            linkedHashMap.put("app_delay_white_list", "");
        }
        linkedHashMap.put("app_delay_black_list", new JSONObject(this.f54136o).toString());
        TTNetInit.getTTNetDepend().mo37261a(this.f54126a, linkedHashMap);
        Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION");
        if (!TextUtils.isEmpty(f54122e)) {
            intent.setPackage(f54122e);
        }
        this.f54126a.sendBroadcast(intent);
    }

    /* renamed from: d */
    public static Set<String> m43197d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashSet();
        }
        return new HashSet(Arrays.asList(str.split(",")));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ttnet.a.g$a */
    public class C22911a {

        /* renamed from: a */
        boolean f54138a;

        /* renamed from: b */
        boolean f54139b;

        /* renamed from: c */
        Map<String, Integer> f54140c;

        /* renamed from: d */
        Set<String> f54141d;

        /* renamed from: e */
        int f54142e;

        /* renamed from: f */
        int f54143f;

        /* renamed from: g */
        int f54144g;

        static {
            Covode.recordClassIndex(26819);
        }

        private C22911a() {
            this.f54139b = true;
            this.f54140c = new HashMap();
            this.f54141d = new HashSet();
            this.f54142e = 1000;
            this.f54143f = 100;
            this.f54144g = 1000;
        }

        /* synthetic */ C22911a(C22910g gVar, byte b) {
            this();
        }
    }

    /* renamed from: c */
    public static Map<String, Integer> m43196c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
        }
        return hashMap;
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: a */
    public final int mo35770a(String str) {
        int i;
        if (this.f54132k) {
            i = this.f54136o.get(str).intValue();
        } else {
            i = this.f54134m;
        }
        if (i > 0) {
            this.f54137p.incrementAndGet();
        }
        this.f54128c.put(str, Integer.valueOf(i));
        return this.f54134m;
    }

    /* renamed from: a */
    public static C22910g m43194a(Context context) {
        C22910g gVar;
        MethodCollector.m26663i(4797);
        synchronized (C22910g.class) {
            try {
                if (f54123f == null) {
                    boolean a = C14756f.m27056a(context);
                    Context applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    f54123f = new C22910g(applicationContext, a);
                    f54122e = context.getPackageName();
                    if (a) {
                        SsHttpCall.setThrottleControl(f54123f);
                    } else {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION");
                        try {
                            m43195b(context, new C22912b(), intentFilter);
                        } catch (Throwable unused) {
                        }
                        SsHttpCall.setThrottleControl(C22915i.m43207c());
                    }
                }
                gVar = f54123f;
            } finally {
                MethodCollector.m26664o(4797);
            }
        }
        return gVar;
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: b */
    public final boolean mo35774b(String str) {
        Logger.debug();
        if (!this.f54131j) {
            return false;
        }
        if (this.f54132k) {
            boolean a = C22958a.m43273a(str, this.f54136o.keySet());
            if (a) {
                Logger.debug();
            } else {
                Logger.debug();
            }
            return a;
        } else if (C22958a.m43273a(str, this.f54135n)) {
            Logger.debug();
            return false;
        } else {
            Logger.debug();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo37246a(C14642a.EnumC14643a aVar) {
        MethodCollector.m26663i(4920);
        synchronized (f54124h) {
            try {
                int length = Thread.currentThread().getStackTrace().length;
                for (int i = 0; i < length; i++) {
                    Logger.debug();
                }
                Logger.debug();
                C22911a aVar2 = this.f54130i.get(aVar);
                synchronized (f54125q) {
                    try {
                        this.f54132k = false;
                        this.f54136o = new HashMap();
                        this.f54134m = 100;
                        this.f54135n = new HashSet();
                        this.f54133l = 1000;
                        this.f54128c.clear();
                        if (aVar2 == null) {
                            Logger.debug();
                            this.f54131j = false;
                        } else if (!aVar2.f54141d.isEmpty()) {
                            Logger.debug();
                            this.f54131j = true;
                            this.f54134m = aVar2.f54143f;
                            this.f54135n = aVar2.f54141d;
                            this.f54133l = aVar2.f54144g;
                        } else if (!aVar2.f54140c.isEmpty()) {
                            Logger.debug();
                            this.f54131j = true;
                            this.f54132k = true;
                            this.f54136o = aVar2.f54140c;
                            this.f54133l = aVar2.f54142e;
                        }
                        m43198d();
                    } finally {
                        MethodCollector.m26664o(4920);
                    }
                }
                C14642a.f35464b = aVar;
                if (aVar == C14642a.EnumC14643a.ColdStart) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC22914h(this), (long) this.f54133l);
                }
            } finally {
                MethodCollector.m26664o(4920);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37247a(JSONObject jSONObject) {
        C14642a.EnumC14643a aVar;
        MethodCollector.m26663i(4906);
        JSONArray optJSONArray = jSONObject.optJSONArray("tt_req_delay_config");
        if (optJSONArray == null) {
            synchronized (f54124h) {
                try {
                    this.f54130i.clear();
                } finally {
                    MethodCollector.m26664o(4906);
                }
            }
            return;
        }
        Logger.debug();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C22911a aVar2 = new C22911a(this, (byte) 0);
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("state", -2);
                if (optInt == -1) {
                    aVar = C14642a.EnumC14643a.NormalStart;
                } else if (optInt == 0) {
                    aVar = C14642a.EnumC14643a.ColdStart;
                } else if (optInt == 1) {
                    aVar = C14642a.EnumC14643a.HotStart;
                } else if (optInt == 2) {
                    aVar = C14642a.EnumC14643a.WarmStart;
                } else if (optInt == 3) {
                    aVar = C14642a.EnumC14643a.WeakNet;
                }
                aVar2.f54141d = new HashSet();
                aVar2.f54140c = new HashMap();
                aVar2.f54138a = false;
                if (!optJSONObject.isNull("bl_with_delay_ms")) {
                    aVar2.f54138a = true;
                    aVar2.f54139b = true;
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("bl_with_delay_ms");
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        aVar2.f54140c.put(next, Integer.valueOf(optJSONObject2.optInt(next)));
                    }
                    aVar2.f54142e = optJSONObject.optInt("bl_disable_time_ms");
                } else if (!optJSONObject.isNull("wl")) {
                    aVar2.f54138a = true;
                    aVar2.f54139b = false;
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("wl");
                    if (optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            aVar2.f54141d.add(optJSONArray2.opt(i2));
                        }
                    }
                    aVar2.f54143f = optJSONObject.optInt("delay_time_ms");
                    aVar2.f54144g = optJSONObject.optInt("wl_disable_time_ms");
                }
                synchronized (f54124h) {
                    try {
                        m43194a(this.f54126a).f54130i.put(aVar, aVar2);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(4906);
                        throw th;
                    }
                }
            }
        }
        MethodCollector.m26664o(4906);
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: a */
    public final int mo35771a(String str, String str2) {
        return C14703k.m26921a().mo23705a(str, str2);
    }

    private C22910g(Context context, boolean z) {
        this.f54126a = context;
        this.f54129g = z;
    }

    /* renamed from: a */
    private static Intent m43193a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, null, null);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static Intent m43195b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m43193a(context, broadcastReceiver, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(broadcastReceiver, intentFilter, null, null);
            } catch (SecurityException e) {
                securityException = e;
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                securityException = e2;
                if (message != null) {
                    boolean contains = e2.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e2;
                    if (contains) {
                        throw e2;
                    }
                }
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}
