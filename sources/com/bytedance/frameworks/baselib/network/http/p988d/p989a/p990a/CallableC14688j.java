package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.j */
public class CallableC14688j implements Callable<Void> {

    /* renamed from: a */
    private final String f35677a = CallableC14688j.class.getSimpleName();

    /* renamed from: b */
    private final String f35678b;

    /* renamed from: c */
    private final C14681d f35679c;

    /* renamed from: d */
    private final WeakHandler f35680d;

    static {
        Covode.recordClassIndex(16785);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void call() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f35678b);
            for (InetAddress inetAddress : allByName) {
                if (inetAddress instanceof Inet4Address) {
                    arrayList.add(inetAddress.getHostAddress());
                } else if (inetAddress instanceof Inet6Address) {
                    arrayList2.add(inetAddress.getHostAddress());
                }
            }
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                C14668a aVar = new C14668a(this.f35678b, System.currentTimeMillis(), arrayList, arrayList2, C14682e.m26869a().f35654f.get());
                C14681d dVar = this.f35679c;
                String str = this.f35678b;
                C14668a c = dVar.mo23674c(str);
                if (c != null) {
                    c.mo23652c();
                }
                Message obtain = Message.obtain();
                obtain.obj = aVar;
                obtain.what = 11;
                aVar.mo23650a(obtain);
                aVar.f35611f.sendMessageDelayed(obtain, ((long) C14682e.m26869a().f35654f.get()) * 1000);
                dVar.f35632b.put(str, aVar);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        if (!C14682e.m26869a().f35650b.get()) {
            Message obtain2 = Message.obtain();
            obtain2.obj = this;
            obtain2.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("localdns_completed_host", this.f35678b);
            obtain2.setData(bundle);
            this.f35680d.sendMessage(obtain2);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("host", this.f35678b);
                if (arrayList.size() == 0 && arrayList2.size() == 0) {
                    jSONObject.put("status", "failed");
                    jSONObject.put("result", "");
                } else {
                    jSONObject.put("status", "succeed");
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(arrayList);
                    jSONObject.put("result", arrayList3);
                }
                jSONObject.put("rtt", currentTimeMillis2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        this.f35679c.f35634d.remove(this.f35678b);
        return null;
    }

    public CallableC14688j(String str, C14681d dVar, WeakHandler weakHandler) {
        this.f35678b = str;
        this.f35679c = dVar;
        this.f35680d = weakHandler;
    }
}
