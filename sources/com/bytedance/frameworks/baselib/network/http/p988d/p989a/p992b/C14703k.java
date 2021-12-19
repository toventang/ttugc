package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14690a;
import com.bytedance.frameworks.baselib.network.http.p995g.C14755e;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.k */
public class C14703k {

    /* renamed from: h */
    static final /* synthetic */ boolean f35738h = true;

    /* renamed from: i */
    private static final String f35739i = C14703k.class.getSimpleName();

    /* renamed from: j */
    private static volatile C14703k f35740j;

    /* renamed from: p */
    private static AtomicBoolean f35741p = new AtomicBoolean(false);

    /* renamed from: a */
    public Context f35742a;

    /* renamed from: b */
    public AtomicLong f35743b = new AtomicLong(0);

    /* renamed from: c */
    public AtomicInteger f35744c = new AtomicInteger(0);

    /* renamed from: d */
    public AtomicLong f35745d = new AtomicLong(0);

    /* renamed from: e */
    public ConcurrentMap<String, String> f35746e = new ConcurrentHashMap();

    /* renamed from: f */
    public String f35747f;

    /* renamed from: g */
    public String f35748g;

    /* renamed from: k */
    private AtomicBoolean f35749k = new AtomicBoolean(true);

    /* renamed from: l */
    private List<AbstractC14702j> f35750l = new ArrayList();

    /* renamed from: m */
    private final ReentrantReadWriteLock f35751m = new ReentrantReadWriteLock();

    /* renamed from: n */
    private List<C14693c> f35752n = new ArrayList();

    /* renamed from: o */
    private final ReentrantReadWriteLock f35753o = new ReentrantReadWriteLock();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.k$a */
    public static class C14704a implements Comparator<AbstractC14690a> {
        static {
            Covode.recordClassIndex(16801);
        }

        C14704a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(AbstractC14690a aVar, AbstractC14690a aVar2) {
            return aVar.f35696g - aVar2.f35696g;
        }
    }

    /* renamed from: c */
    public final boolean mo23710c() {
        return this.f35750l.isEmpty();
    }

    /* renamed from: b */
    public final boolean mo23709b() {
        if (!this.f35752n.isEmpty()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(16800);
    }

    /* renamed from: a */
    public static C14703k m26921a() {
        MethodCollector.m26663i(8727);
        if (f35740j == null) {
            synchronized (C14703k.class) {
                try {
                    if (f35740j == null) {
                        f35740j = new C14703k();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8727);
                    throw th;
                }
            }
        }
        C14703k kVar = f35740j;
        MethodCollector.m26664o(8727);
        return kVar;
    }

    /* renamed from: a */
    public final C14695e mo23706a(C14705l lVar) {
        if (C14759i.m27072b(lVar.f35754a) && this.f35749k.get()) {
            return m26924b(lVar);
        }
        return null;
    }

    /* renamed from: a */
    public static void m26922a(Context context) {
        if (C14756f.m27056a(context) && !f35741p.get()) {
            SharedPreferences a = C34822d.m71158a(context, "ttnet_tnc_config", 0);
            String string = a.getString("tnc_config_str", null);
            String string2 = a.getString("ttnet_tnc_etag", null);
            String string3 = a.getString("ttnet_tnc_abtest", null);
            try {
                if (!TextUtils.isEmpty(string)) {
                    m26921a().mo23708a(new JSONObject(string), 0, string2, string3, System.currentTimeMillis());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            f35741p.set(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: java.util.List<com.bytedance.frameworks.baselib.network.http.d.a.b.j> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m26923a(JSONObject jSONObject) {
        int optInt;
        JSONObject optJSONObject;
        String optString = jSONObject.optString("action");
        if (!TextUtils.isEmpty(optString) && (optInt = jSONObject.optInt("act_priority", -1)) >= 0 && (optJSONObject = jSONObject.optJSONObject("param")) != null) {
            String optString2 = jSONObject.optString("lifecycle");
            long j = 0;
            long j2 = -1;
            if ("".equals(optString2)) {
                j2 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                if (C14755e.m27053a(optString2, arrayList) && arrayList.size() == 2) {
                    j = ((Long) arrayList.get(0)).longValue();
                    j2 = ((Long) arrayList.get(1)).longValue();
                } else {
                    j = -1;
                }
            }
            long optInt2 = (long) jSONObject.optInt("rule_id");
            String optString3 = jSONObject.optString("sign");
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("request_method");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString4 = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString4)) {
                        arrayList2.add(optString4);
                    }
                }
            }
            AbstractC14690a a = AbstractC14690a.m26896a(optString, optJSONObject, optInt, j, j2, optInt2, optString3, this.f35743b.get(), arrayList2, jSONObject.optInt("set_req_priority", optInt));
            if (a instanceof AbstractC14702j) {
                this.f35750l.add(a);
            }
        }
    }

    /* renamed from: b */
    private C14695e m26924b(C14705l lVar) {
        String str = lVar.f35754a;
        C14695e eVar = new C14695e();
        ArrayList<C14694d> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, str);
        this.f35751m.readLock().lock();
        Iterator<AbstractC14702j> it = this.f35750l.iterator();
        String str2 = str;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC14690a.EnumC14691a a = it.next().mo23704a(lVar, str2, arrayList2, arrayList);
            str2 = (String) arrayList2.get(0);
            if (a == AbstractC14690a.EnumC14691a.DISPATCH_DROP) {
                if (!f35738h && ((String) arrayList2.get(0)).length() != 0) {
                    throw new AssertionError();
                }
            }
        }
        String str3 = (String) arrayList2.get(0);
        this.f35751m.readLock().unlock();
        ArrayList arrayList3 = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("origin_url", str);
            jSONObject.put("dispatched_url", str3);
            JSONArray jSONArray = new JSONArray();
            for (C14694d dVar : arrayList) {
                if (dVar.f35712d) {
                    JSONObject jSONObject2 = new JSONObject();
                    arrayList3.add(Long.valueOf(dVar.f35710b));
                    jSONObject2.put("rule_id", dVar.f35710b);
                    jSONObject2.put("service_name", dVar.f35709a);
                    jSONObject2.put("priority", dVar.f35711c);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("action_info_list", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("dispatch", jSONObject);
            new JSONObject().put("dispatchersdk", jSONObject3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        eVar.f35717b = arrayList3;
        eVar.f35716a = str3;
        eVar.f35718c = arrayList;
        return eVar;
    }

    /* renamed from: a */
    public final String mo23707a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && !str.contains("/network/get_network") && !str.contains("/get_domains/v5") && !str.contains("/ies/speed")) {
            String str3 = null;
            try {
                URL url = new URL(str);
                str2 = url.getProtocol();
                try {
                    str3 = url.getHost();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2) && (("http".equals(str2) || "https".equals(str2)) && !TextUtils.isEmpty(str3))) {
                ConcurrentMap<String, String> concurrentMap = this.f35746e;
                if (concurrentMap == null || !concurrentMap.containsKey(str3)) {
                    Logger.debug();
                } else {
                    String str4 = this.f35746e.get(str3);
                    if (TextUtils.isEmpty(str4)) {
                        return str;
                    }
                    String str5 = str2 + "://" + str3;
                    String str6 = str2 + "://" + str4;
                    if (str.startsWith(str5)) {
                        return str.replaceFirst(str5, str6);
                    }
                    return str;
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public final int mo23705a(String str, String str2) {
        Logger.debug();
        if (!C14759i.m27072b(str)) {
            Logger.debug();
            return 0;
        }
        this.f35753o.readLock().lock();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, 0);
        Iterator<C14693c> it = this.f35752n.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Logger.debug();
            if (it.next().mo23700a(str, str2, arrayList) == AbstractC14690a.EnumC14691a.DISPATCH_DELAY) {
                Logger.debug();
                break;
            }
        }
        this.f35753o.readLock().unlock();
        return ((Integer) arrayList.get(0)).intValue();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo23708a(JSONObject jSONObject, int i, String str, String str2, long j) {
        int optInt;
        JSONObject optJSONObject;
        this.f35744c.set(i);
        this.f35747f = str;
        this.f35748g = str2;
        this.f35745d.set(j);
        JSONArray optJSONArray = jSONObject.optJSONArray("request_delay_actions");
        try {
            this.f35753o.writeLock().lock();
            this.f35752n.clear();
            boolean z = true;
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    if (!(optJSONObject2 == null || (optInt = optJSONObject2.optInt("act_priority", -1)) < 0 || (optJSONObject = optJSONObject2.optJSONObject("param")) == null)) {
                        String optString = optJSONObject2.optString("lifecycle");
                        long j2 = 0;
                        long j3 = -1;
                        if ("".equals(optString)) {
                            j3 = 0;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (C14755e.m27053a(optString, arrayList) && arrayList.size() == 2) {
                                j2 = ((Long) arrayList.get(0)).longValue();
                                j3 = ((Long) arrayList.get(1)).longValue();
                            } else {
                                j2 = -1;
                            }
                        }
                        AbstractC14690a a = AbstractC14690a.m26896a("delay", optJSONObject, optInt, j2, j3, 0, "", this.f35743b.get(), null, 0);
                        if (a instanceof C14693c) {
                            this.f35752n.add((C14693c) a);
                        }
                    }
                }
            }
            if (!this.f35752n.isEmpty()) {
                Collections.sort(this.f35752n, new C14704a());
            }
            this.f35753o.writeLock().unlock();
            Logger.debug();
            int optInt2 = jSONObject.optInt("ttnet_url_dispatcher_enabled", -1);
            if (optInt2 >= 0) {
                AtomicBoolean atomicBoolean = this.f35749k;
                if (optInt2 != 1) {
                    z = false;
                }
                atomicBoolean.set(z);
            }
            long optInt3 = (long) jSONObject.optInt("ttnet_dispatch_actions_epoch", -1);
            if (optInt3 != this.f35743b.get()) {
                this.f35743b.set(optInt3);
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ttnet_dispatch_actions");
                if (optJSONArray2 != null) {
                    try {
                        this.f35751m.writeLock().lock();
                        this.f35750l.clear();
                        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i3);
                            if (optJSONObject3 != null) {
                                m26923a(optJSONObject3);
                            }
                        }
                        if (!this.f35750l.isEmpty()) {
                            Collections.sort(this.f35750l, new C14704a());
                        }
                    } finally {
                        this.f35751m.writeLock().unlock();
                    }
                }
            }
        } catch (Throwable th) {
            this.f35753o.writeLock().unlock();
            Logger.debug();
            throw th;
        }
    }
}
