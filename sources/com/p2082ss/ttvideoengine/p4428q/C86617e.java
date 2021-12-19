package com.p2082ss.ttvideoengine.p4428q;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.strategy.ILogCallback;
import com.bytedance.vcloud.strategy.IStrategyEventListener;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.p2082ss.ttvideoengine.p4415h.EnumC86487t;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4421n.p4424c.C86591b;
import com.p2082ss.ttvideoengine.p4428q.C86615d;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.q.e */
public final class C86617e {

    /* renamed from: a */
    public AbstractC86613b f195164a;

    /* renamed from: b */
    public String f195165b;

    /* renamed from: c */
    public String f195166c;

    /* renamed from: d */
    public String f195167d;

    /* renamed from: e */
    public String f195168e;

    /* renamed from: f */
    public String f195169f;

    /* renamed from: g */
    public String f195170g;

    /* renamed from: h */
    public String f195171h;

    /* renamed from: i */
    public String f195172i;

    /* renamed from: j */
    public String f195173j;

    /* renamed from: k */
    public long f195174k;

    /* renamed from: l */
    public long f195175l;

    /* renamed from: m */
    public Context f195176m;

    /* renamed from: n */
    public int f195177n = 5;

    /* renamed from: o */
    public int f195178o;

    /* renamed from: p */
    public boolean f195179p;

    /* renamed from: q */
    public C86615d f195180q = new C86615d();

    /* renamed from: r */
    private StrategyCenter f195181r;

    /* renamed from: s */
    private boolean f195182s;

    /* renamed from: t */
    private boolean f195183t;

    /* renamed from: u */
    private Map<Integer, Integer> f195184u = new ConcurrentHashMap(5);

    static {
        Covode.recordClassIndex(101845);
    }

    /* renamed from: a */
    public static C86617e m150014a() {
        return C86621c.f195187a;
    }

    /* renamed from: c */
    public final boolean mo137880c() {
        if (!this.f195183t) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.ttvideoengine.q.e$c */
    public static class C86621c {

        /* renamed from: a */
        public static final C86617e f195187a = new C86617e();

        static {
            Covode.recordClassIndex(101849);
        }
    }

    /* renamed from: d */
    public final boolean mo137881d() {
        return mo137879b().isRunning();
    }

    /* renamed from: b */
    public final StrategyCenter mo137879b() {
        if (this.f195181r == null) {
            this.f195181r = new StrategyCenter(new C86620b());
        }
        return this.f195181r;
    }

    /* renamed from: com.ss.ttvideoengine.q.e$a */
    public static class C86619a implements ILogCallback {
        static {
            Covode.recordClassIndex(101847);
        }

        @Override // com.bytedance.vcloud.strategy.ILogCallback
        public final void log(String str) {
            C86641i.m150110a("StrategyHelper", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.q.e$b */
    public class C86620b implements IStrategyEventListener {
        static {
            Covode.recordClassIndex(101848);
        }

        C86620b() {
        }

        @Override // com.bytedance.vcloud.strategy.IStrategyEventListener
        public final void onEventLog(String str, String str2) {
            C86641i.m150113b("StrategyHelper", "eventName: " + str + ", logInfo: " + str2);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    EnumC86487t.instance.addEventV2(true, new JSONObject(str2), str);
                } catch (JSONException unused) {
                }
            }
        }

        @Override // com.bytedance.vcloud.strategy.IStrategyEventListener
        public final void onEvent(String str, int i, int i2, String str2) {
            Map map;
            MethodCollector.m26663i(3881);
            C86641i.m150110a("StrategyHelper", "videoID = " + str + ", key = " + i + ", value = " + i2 + ", info = " + str2);
            C86615d dVar = C86617e.this.f195180q;
            if (i == 2000) {
                synchronized (dVar) {
                    try {
                        if (!dVar.f195161a.containsKey(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("pause", new C86615d.C86616a());
                            hashMap.put("resume", new C86615d.C86616a());
                            dVar.f195161a.put(str, hashMap);
                        }
                        map = (Map) dVar.f195161a.get(str);
                    } finally {
                        MethodCollector.m26664o(3881);
                    }
                }
                if (i2 == 1) {
                    ((C86615d.C86616a) map.get("pause")).mo137874a();
                    MethodCollector.m26664o(3881);
                } else if (i2 == 2) {
                    ((C86615d.C86616a) map.get("resume")).mo137874a();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo137878a(int i) {
        if (i != -1) {
            boolean z = true;
            this.f195183t = true;
            if (mo137879b().iPlayerVersion() != i) {
                z = false;
            }
            this.f195179p = z;
        }
        return this.f195179p;
    }

    /* renamed from: a */
    public static String m150016a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Map<String, Integer> m150017a(String str) {
        String[] split;
        if (str == null || str.length() < 2) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(",")) {
            try {
                String[] split2 = str2.split(":");
                if (split2.length == 2) {
                    hashMap.put(split2[0], Integer.valueOf(Integer.parseInt(split2[1])));
                }
            } catch (NumberFormatException unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Map<String, String> m150018b(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                    map.put(next, string);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    /* renamed from: a */
    public final void mo137876a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            C86641i.m150110a("StrategyHelper", "[preload] Algorithm json ".concat(String.valueOf(str)));
            return;
        }
        switch (i) {
            case 31001:
                this.f195165b = str;
                break;
            case 31002:
                this.f195166c = str;
                break;
            case 31003:
                this.f195167d = str;
                break;
            case 31004:
                this.f195168e = str;
                break;
            case 31005:
                this.f195169f = str;
                break;
            case 31006:
                this.f195170g = str;
                break;
            case 31007:
                this.f195171h = str;
                break;
            case 31008:
                this.f195172i = str;
                break;
            case 31009:
                this.f195173j = str;
                break;
        }
        if (mo137879b().isLoadLibrarySucceed()) {
            mo137879b().setAlgorithmJson(i, str);
        }
    }

    /* renamed from: a */
    public final void mo137877a(String str, Map map) {
        if (!this.f195182s && mo137879b().isLoadLibrarySucceed()) {
            mo137879b().setAppInfo(str);
            this.f195182s = true;
        }
        if (map != null && map.containsKey("appid")) {
            this.f195178o = C86640h.m150076a(map.get("appid"));
        }
    }

    /* renamed from: a */
    public static String m150015a(String str, String str2, String[] strArr) {
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("urls", strArr);
            hashMap2.put("file_hash", str2);
            arrayList.add(hashMap2);
            hashMap.put("vid", str);
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap).toString();
        } catch (Throwable th) {
            C86641i.m150117e("StrategyHelper", th.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final Map<String, Integer> mo137875a(AbstractC86517e eVar, int i, Map<String, String> map, C86591b bVar) {
        String selectBitrate = mo137879b().selectBitrate(eVar.mo137760m(), i, m150016a(map), bVar);
        if (!TextUtils.isEmpty(selectBitrate)) {
            return m150017a(selectBitrate);
        }
        C86641i.m150113b("StrategyHelper", "[GearStrategy]StrategyHelper.selectResolution result invalid retString=".concat(String.valueOf(selectBitrate)));
        return null;
    }
}
