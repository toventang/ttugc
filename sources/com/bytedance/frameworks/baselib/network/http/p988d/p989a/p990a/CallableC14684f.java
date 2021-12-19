package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14668a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a.C14671b;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a.C14672c;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a.C14673d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.f */
public class CallableC14684f implements Callable<Void> {

    /* renamed from: a */
    private static final String f35668a = CallableC14684f.class.getSimpleName();

    /* renamed from: b */
    private final String f35669b;

    /* renamed from: c */
    private final C14681d f35670c;

    /* renamed from: d */
    private String f35671d;

    /* renamed from: e */
    private List<String> f35672e = new ArrayList();

    /* renamed from: f */
    private List<String> f35673f = new ArrayList();

    /* renamed from: g */
    private C14668a.EnumC14669a f35674g;

    /* renamed from: h */
    private int f35675h = 0;

    /* renamed from: i */
    private final WeakHandler f35676i;

    static {
        Covode.recordClassIndex(16781);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2 A[LOOP:2: B:26:0x009c->B:28:0x00a2, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void call() {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.CallableC14684f.call():java.lang.Void");
    }

    /* renamed from: a */
    private String m26886a(String str) {
        StringBuilder sb = new StringBuilder();
        if (!C14673d.f35618a.get()) {
            this.f35675h = 1;
        }
        sb.append("https://").append(str).append("/q?host=").append(this.f35671d).append("&aid=").append(C14682e.m26869a().f35658j.mo23689c()).append("&okhttp_version=").append(this.f35669b).append("&p=android&source=tt-ok&f=").append(this.f35675h).append("&reason=").append(this.f35674g.ordinal() - 1);
        if (this.f35670c.f35638h.get() < 3) {
            sb.append("&refresh_bkup_ip=1");
            this.f35670c.mo23666a();
        }
        return C14671b.m26844a(sb.toString(), str);
    }

    /* renamed from: b */
    private void m26889b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (this.f35672e.size() > 1) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("dns");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            m26888a(optJSONArray.optJSONObject(i));
                        }
                    } else {
                        return;
                    }
                } else {
                    m26888a(jSONObject);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("httpdns_backup_ip");
                if (optJSONArray2 != null) {
                    C14682e.m26869a().mo23683a(optJSONArray2);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private void m26888a(JSONObject jSONObject) {
        MethodCollector.m26663i(8714);
        if (jSONObject == null) {
            MethodCollector.m26664o(8714);
            return;
        }
        String optString = jSONObject.optString("host");
        int optInt = jSONObject.optInt("ttl");
        JSONArray optJSONArray = jSONObject.optJSONArray("ips");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString2 = optJSONArray.optString(i);
                if (C14672c.m26845a(optString2)) {
                    arrayList2.add(optString2);
                } else if (C14672c.m26846b(optString2)) {
                    arrayList.add(optString2);
                }
            }
        }
        if (this.f35672e.contains(optString) && (arrayList.size() > 0 || arrayList2.size() > 0)) {
            C14668a aVar = new C14668a(optString, System.currentTimeMillis(), arrayList, arrayList2, optInt);
            C14681d dVar = this.f35670c;
            C14668a b = dVar.mo23671b(optString);
            if (b != null) {
                if (C14682e.m26869a().f35650b.get()) {
                    b.mo23649a();
                } else {
                    b.mo23651b();
                }
            }
            if (C14682e.m26869a().f35650b.get()) {
                Message obtain = Message.obtain();
                obtain.obj = aVar;
                obtain.what = 12;
                aVar.mo23650a(obtain);
                aVar.f35611f.sendMessageDelayed(obtain, aVar.f35609d * 1000);
                Message obtain2 = Message.obtain();
                obtain2.obj = aVar;
                obtain2.what = 10;
                aVar.mo23650a(obtain2);
                aVar.f35611f.sendMessageDelayed(obtain2, (aVar.f35609d * 1000) + (((long) C14682e.m26869a().f35656h.get()) * 1000));
            } else {
                Message obtain3 = Message.obtain();
                obtain3.obj = aVar;
                obtain3.what = 13;
                aVar.mo23650a(obtain3);
                aVar.f35611f.sendMessageDelayed(obtain3, aVar.f35609d * 1000);
            }
            synchronized (dVar.f35631a.mo23774c()) {
                try {
                    dVar.f35631a.mo23770a(optString, aVar);
                } finally {
                    MethodCollector.m26664o(8714);
                }
            }
            this.f35670c.mo23677e(optString);
            this.f35672e.remove(optString);
        }
    }

    CallableC14684f(String str, String str2, C14681d dVar, C14668a.EnumC14669a aVar, WeakHandler weakHandler) {
        this.f35671d = str;
        this.f35669b = str2;
        this.f35670c = dVar;
        this.f35674g = aVar;
        this.f35676i = weakHandler;
    }
}
