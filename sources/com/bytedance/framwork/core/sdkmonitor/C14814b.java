package com.bytedance.framwork.core.sdkmonitor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.p999b.p1003d.C14782a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.b */
public final class C14814b {

    /* renamed from: a */
    public final LinkedList<C14836l> f36116a = new LinkedList<>();

    /* renamed from: b */
    public final LinkedList<C14816c> f36117b = new LinkedList<>();

    /* renamed from: c */
    public final LinkedList<C14813a> f36118c = new LinkedList<>();

    /* renamed from: d */
    private int f36119d = 200;

    /* renamed from: e */
    private boolean f36120e;

    static {
        Covode.recordClassIndex(16915);
    }

    /* renamed from: a */
    public final void mo23845a(final C14827k kVar) {
        if (!this.f36120e) {
            this.f36120e = true;
            C14782a.C14784a.f36049a.mo23819a(new Runnable() {
                /* class com.bytedance.framwork.core.sdkmonitor.C14814b.RunnableC148151 */

                static {
                    Covode.recordClassIndex(16916);
                }

                public final void run() {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    LinkedList linkedList3;
                    MethodCollector.m26663i(13628);
                    try {
                        synchronized (C14814b.this.f36116a) {
                            try {
                                linkedList = new LinkedList(C14814b.this.f36116a);
                                C14814b.this.f36116a.clear();
                            } finally {
                                MethodCollector.m26664o(13628);
                            }
                        }
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C14836l lVar = (C14836l) it.next();
                            C14827k kVar = kVar;
                            if (lVar != null && !TextUtils.isEmpty(lVar.f36211a)) {
                                kVar.mo23857a(lVar.f36211a, lVar.f36212b, lVar.f36213c, lVar.f36214d, lVar.f36215e, lVar.f36216f, lVar.f36217g);
                            }
                        }
                        synchronized (C14814b.this.f36117b) {
                            try {
                                linkedList2 = new LinkedList(C14814b.this.f36117b);
                                C14814b.this.f36117b.clear();
                            } finally {
                                MethodCollector.m26664o(13628);
                            }
                        }
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            C14816c cVar = (C14816c) it2.next();
                            C14827k kVar2 = kVar;
                            if (cVar != null) {
                                String str = cVar.f36123a;
                                JSONObject jSONObject = cVar.f36124b;
                                long j = cVar.f36125c;
                                try {
                                    jSONObject.put("log_type", str);
                                    jSONObject.put("network_type", kVar2.mo23868k());
                                    if (!TextUtils.isEmpty(null)) {
                                        jSONObject.put("session_id", (Object) null);
                                    }
                                    if (jSONObject.isNull("timestamp")) {
                                        jSONObject.put("timestamp", j);
                                    }
                                    if (!(kVar2.f36156c == null || kVar2.f36159f == null)) {
                                        if (!TextUtils.isEmpty(str)) {
                                            if (kVar2.f36159f.opt(str) != null) {
                                                kVar2.f36156c.mo23817a("common_log", "common_log", jSONObject);
                                            }
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        synchronized (C14814b.this.f36118c) {
                            try {
                                linkedList3 = new LinkedList(C14814b.this.f36118c);
                                C14814b.this.f36118c.clear();
                            } finally {
                                MethodCollector.m26664o(13628);
                            }
                        }
                        Iterator it3 = linkedList3.iterator();
                        while (it3.hasNext()) {
                            C14813a aVar = (C14813a) it3.next();
                            C14827k kVar3 = kVar;
                            if (aVar != null && !TextUtils.isEmpty(aVar.f36108a)) {
                                if (aVar.f36108a.equals("api_error")) {
                                    kVar3.mo23863b(aVar.f36109b, aVar.f36110c, aVar.f36111d, aVar.f36112e, aVar.f36113f, aVar.f36114g, aVar.f36115h);
                                } else if (aVar.f36108a.equals("api_all")) {
                                    kVar3.mo23854a(aVar.f36109b, aVar.f36110c, aVar.f36111d, aVar.f36112e, aVar.f36113f, aVar.f36114g, aVar.f36115h);
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        MethodCollector.m26664o(13628);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo23844a(C14813a aVar) {
        MethodCollector.m26663i(11216);
        synchronized (this.f36118c) {
            try {
                if (this.f36118c.size() > this.f36119d) {
                    this.f36118c.poll();
                }
                this.f36118c.add(aVar);
            } finally {
                MethodCollector.m26664o(11216);
            }
        }
    }

    /* renamed from: a */
    public final void mo23846a(C14836l lVar) {
        MethodCollector.m26663i(11065);
        synchronized (this.f36116a) {
            try {
                if (this.f36116a.size() > this.f36119d) {
                    this.f36116a.poll();
                }
                this.f36116a.add(lVar);
            } finally {
                MethodCollector.m26664o(11065);
            }
        }
    }
}
