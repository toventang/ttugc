package com.bytedance.ttnet.p1705f;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.AbstractC14708e;
import com.bytedance.frameworks.baselib.network.http.p994f.C14749b;
import com.bytedance.frameworks.baselib.network.http.p995g.C14758h;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.p1700a.C22898a;
import com.bytedance.ttnet.p1703d.C22939a;
import com.bytedance.ttnet.p1703d.C22942c;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C90200t;
import okhttp3.Request;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.f.c */
public final class C22954c implements AbstractC14708e {

    /* renamed from: a */
    public static String f54285a;

    /* renamed from: e */
    private static C22954c f54286e;

    /* renamed from: b */
    public C22953b f54287b;

    /* renamed from: c */
    Handler f54288c = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.ttnet.p1705f.C22954c.HandlerC229562 */

        static {
            Covode.recordClassIndex(26869);
        }

        public final void handleMessage(Message message) {
            boolean z;
            EnumC22957a aVar;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                C22954c cVar = C22954c.this;
                int i = message.arg2;
                if (i == 7) {
                    aVar = EnumC22957a.PORTRETRY;
                } else if (i == 10) {
                    aVar = EnumC22957a.TTREGION;
                } else if (i != 20) {
                    switch (i) {
                        case -2:
                            aVar = EnumC22957a.TTRESUME;
                            break;
                        case -1:
                            aVar = EnumC22957a.TTHardCode;
                            break;
                        case 0:
                            aVar = EnumC22957a.TTCACHE;
                            break;
                        case 1:
                            aVar = EnumC22957a.TTSERVER;
                            break;
                        case 2:
                            aVar = EnumC22957a.TTERROR;
                            break;
                        case 3:
                            aVar = EnumC22957a.TTPOLL;
                            break;
                        case 4:
                            aVar = EnumC22957a.TTTNC;
                            break;
                        default:
                            aVar = EnumC22957a.TTSERVER;
                            break;
                    }
                } else {
                    aVar = EnumC22957a.TTCRONET;
                }
                cVar.mo37283a(z, aVar);
            }
        }
    };

    /* renamed from: d */
    private long f54289d;

    /* renamed from: f */
    private boolean f54290f;

    /* renamed from: g */
    private Context f54291g;

    /* renamed from: h */
    private int f54292h;

    /* renamed from: i */
    private long f54293i;

    /* renamed from: j */
    private int f54294j;

    /* renamed from: k */
    private HashMap<String, Integer> f54295k = new HashMap<>();

    /* renamed from: l */
    private HashMap<String, Integer> f54296l = new HashMap<>();

    /* renamed from: m */
    private int f54297m = 0;

    /* renamed from: n */
    private HashMap<String, Integer> f54298n = new HashMap<>();

    /* renamed from: o */
    private HashMap<String, Integer> f54299o = new HashMap<>();

    /* renamed from: p */
    private boolean f54300p = true;

    static {
        Covode.recordClassIndex(26867);
    }

    /* renamed from: b */
    private C22952a m43259b() {
        C22953b bVar = this.f54287b;
        if (bVar != null) {
            return bVar.f54279b;
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m43260c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static synchronized C22954c m43256a() {
        C22954c cVar;
        synchronized (C22954c.class) {
            MethodCollector.m26663i(6338);
            if (f54286e == null) {
                f54286e = new C22954c();
            }
            cVar = f54286e;
            MethodCollector.m26664o(6338);
        }
        return cVar;
    }

    /* renamed from: d */
    private static boolean m43261d() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean c = m43260c();
        C58029j.f132253e = c;
        return c;
    }

    /* renamed from: e */
    private void m43262e() {
        Logger.debug();
        this.f54294j = 0;
        this.f54295k.clear();
        this.f54296l.clear();
        this.f54297m = 0;
        this.f54298n.clear();
        this.f54299o.clear();
    }

    private C22954c() {
    }

    /* renamed from: com.bytedance.ttnet.f.c$a */
    public enum EnumC22957a {
        TTRESUME(-2),
        TTHardCode(-1),
        TTCACHE(0),
        TTSERVER(1),
        TTERROR(2),
        TTPOLL(3),
        TTTNC(4),
        PORTRETRY(7),
        TTREGION(10),
        TTCRONET(20);
        
        public final int mValue;

        static {
            Covode.recordClassIndex(26870);
        }

        private EnumC22957a(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: a */
    public final synchronized void mo37282a(Context context, boolean z) {
        MethodCollector.m26663i(6481);
        if (!this.f54290f) {
            this.f54291g = context;
            this.f54300p = z;
            this.f54287b = new C22953b(context, z);
            if (z) {
                SharedPreferences a = C34822d.m71158a(this.f54291g, "ttnet_tnc_config", 0);
                this.f54292h = a.getInt("tnc_probe_cmd", 0);
                this.f54293i = a.getLong("tnc_probe_version", 0);
            }
            Logger.debug();
            this.f54290f = true;
        }
        MethodCollector.m26664o(6481);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.AbstractC14708e
    /* renamed from: a */
    public final synchronized void mo23712a(Request request, Exception exc) {
        MethodCollector.m26663i(6632);
        if (request == null) {
            MethodCollector.m26664o(6632);
        } else if (!this.f54300p) {
            MethodCollector.m26664o(6632);
        } else if (!m43261d()) {
            MethodCollector.m26664o(6632);
        } else {
            C90200t url = request.url();
            String str = url.f204858a;
            String str2 = url.f204861d;
            String f = url.mo145055f();
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String lowerCase = stringWriter.toString().toLowerCase();
            if (!"http".equals(str) && !"https".equals(str)) {
                MethodCollector.m26664o(6632);
            } else if (TextUtils.isEmpty(str2)) {
                MethodCollector.m26664o(6632);
            } else if (TextUtils.isEmpty(lowerCase) || !lowerCase.contains("timeout") || !lowerCase.contains("time out") || lowerCase.contains("unreachable")) {
                MethodCollector.m26664o(6632);
            } else {
                C22952a b = m43259b();
                if (b == null || !b.f54266a) {
                    MethodCollector.m26664o(6632);
                } else if (b.f54268c == null || b.f54268c.size() <= 0 || !b.f54268c.containsKey(str2)) {
                    MethodCollector.m26664o(6632);
                } else {
                    Logger.debug();
                    this.f54294j++;
                    this.f54295k.put(f, 0);
                    this.f54296l.put(str2, 0);
                    if (this.f54294j >= b.f54269d && this.f54295k.size() >= b.f54270e && this.f54296l.size() >= b.f54271f) {
                        Logger.debug();
                        m43257a(false, 0L, EnumC22957a.TTERROR);
                        m43262e();
                    }
                    MethodCollector.m26664o(6632);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0102  */
    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.AbstractC14708e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo23713a(okhttp3.Request r16, okhttp3.C90029ac r17) {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p1705f.C22954c.mo23713a(okhttp3.Request, okhttp3.ac):void");
    }

    /* renamed from: a */
    public final void mo37283a(boolean z, EnumC22957a aVar) {
        C22952a b = m43259b();
        if (b != null) {
            Logger.debug();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f54289d + (((long) b.f54275j) * 1000) <= elapsedRealtime) {
                this.f54289d = elapsedRealtime;
                C22898a.m43150a(this.f54291g).mo37238b(aVar);
                return;
            }
            Logger.debug();
        }
    }

    /* renamed from: a */
    private void m43257a(boolean z, long j, EnumC22957a aVar) {
        if (!this.f54288c.hasMessages(10000)) {
            Message obtainMessage = this.f54288c.obtainMessage();
            obtainMessage.what = 10000;
            obtainMessage.arg1 = z ? 1 : 0;
            obtainMessage.arg2 = aVar.mValue;
            if (j > 0) {
                this.f54288c.sendMessageDelayed(obtainMessage, j);
            } else {
                this.f54288c.sendMessage(obtainMessage);
            }
        }
    }

    /* renamed from: a */
    public static boolean m43258a(Context context, boolean z, EnumC22957a aVar) {
        String str;
        ArrayList<String> arrayList = new ArrayList();
        if (C22898a.m43150a(context).f54080i == null || C22898a.m43150a(context).f54080i.size() == 0) {
            C22898a.m43150a(context);
            arrayList.addAll(Arrays.asList(C22898a.m43155k()));
        } else {
            arrayList.addAll(C22898a.m43150a(context).f54080i);
            C22898a.m43150a(context);
            String[] k = C22898a.m43155k();
            for (String str2 : k) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        for (String str3 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://").append(str3).append("/get_domains/v5/");
            C14758h hVar = new C14758h(sb.toString());
            try {
                if (Build.VERSION.SDK_INT < 21) {
                    str = Build.CPU_ABI;
                } else {
                    str = Build.SUPPORTED_ABIS[0];
                }
                hVar.mo23779a("abi", str);
                hVar.mo23777a("tnc_src", aVar.mValue);
                hVar.mo23779a("okhttp_version", "4.0.71.7-tiktok");
                hVar.mo23779a("ttnet_version", "4.0.71.7-tiktok");
                TTNetInit.getTTNetDepend();
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            C14749b a = C14749b.m27031a();
            if (a.f35947i && !a.f35948j) {
                if (!a.f35940b.isEmpty()) {
                    hashMap.put("x-tt-store-idc", a.f35940b);
                }
                if (!a.f35939a.isEmpty()) {
                    hashMap.put("x-tt-store-region", a.f35939a);
                }
                if (!a.f35943e.isEmpty()) {
                    hashMap.put("x-tt-store-region-src", a.f35943e);
                }
            }
            if (!z) {
                C22939a aVar2 = new C22939a();
                aVar2.f54224b = hVar.toString();
                aVar2.f54228f = true;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String a2 = C22942c.m43245a(aVar2.f54224b, hashMap, null, aVar2);
                    aVar2.f54225c = System.currentTimeMillis() - currentTimeMillis;
                    if (!C13627m.m24498a(a2)) {
                        if (!C13627m.m24498a(aVar2.f54230h)) {
                            C22898a.m43150a(context).f54078g = aVar2.f54230h;
                        }
                        m43256a().f54287b.f54280c = aVar2.f54231i;
                        JSONObject jSONObject = new JSONObject(a2);
                        ClientKeyManager.m43224a().mo37257b(a2);
                        return C22898a.m43150a(context).mo37237a(jSONObject, EnumC22957a.TTSERVER, System.currentTimeMillis());
                    }
                } catch (Throwable unused2) {
                    continue;
                }
            } else {
                hVar.mo23777a("aid", TTNetInit.getTTNetDepend().mo37267e());
                hVar.mo23779a("device_platform", "android");
                if (TTNetInit.getCronetProvider() != null) {
                    hVar.mo23779a("version_code", TTNetInit.getCronetProvider().getVersionCode());
                    hVar.mo23779a("channel", TTNetInit.getCronetProvider().getChannel());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        arrayList2.add(new C22027b((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                String hVar2 = hVar.toString();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Pair<String, String> a3 = C14759i.m27066a(hVar2, linkedHashMap);
                    String str4 = (String) a3.first;
                    String str5 = (String) a3.second;
                    INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.m43281a(str4, INetworkApi.class);
                    if (iNetworkApi != null) {
                        AbstractC21983b<String> doGet = iNetworkApi.doGet(true, -1, str5, linkedHashMap, arrayList2, null);
                        try {
                            C22099u<String> execute = doGet.execute();
                            List<C22027b> list = execute.f52261a.f52042d;
                            T t = execute.f52262b;
                            String a4 = RetrofitUtils.m43283a(list, "x-ss-etag");
                            String a5 = RetrofitUtils.m43283a(list, "x-tt-tnc-abtest");
                            if (C13627m.m24498a((String) t)) {
                                doGet.cancel();
                            } else {
                                if (!C13627m.m24498a(a4)) {
                                    C22898a.m43150a(context).f54078g = a4;
                                }
                                m43256a().f54287b.f54280c = a5;
                                JSONObject jSONObject2 = new JSONObject((String) t);
                                ClientKeyManager.m43224a().mo37257b(t);
                                boolean a6 = C22898a.m43150a(context).mo37237a(jSONObject2, EnumC22957a.TTSERVER, System.currentTimeMillis());
                                doGet.cancel();
                                return a6;
                            }
                        } catch (Throwable unused3) {
                            if (doGet == null) {
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
