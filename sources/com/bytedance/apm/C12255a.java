package com.bytedance.apm;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.C12478h;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.config.C12417b;
import com.bytedance.apm.config.C12419c;
import com.bytedance.apm.core.AbstractC12437c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.internal.C12509b;
import com.bytedance.apm.p754a.AbstractC12269f;
import com.bytedance.apm.p754a.C12260a;
import com.bytedance.apm.p754a.p755a.C12262a;
import com.bytedance.apm.p758b.C12310a;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p768a.C12404d;
import com.bytedance.apm.p771d.C12442b;
import com.bytedance.apm.p775g.AbstractC12473a;
import com.bytedance.apm.p778j.C12511a;
import com.bytedance.apm.p779k.C12539h;
import com.bytedance.apm.p784l.C12550a;
import com.bytedance.apm.p785m.C12553a;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p788p.C12566c;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.apm.p789q.C12603v;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13931l;
import com.bytedance.monitor.p1546a.p1548b.AbstractC21450d;
import com.bytedance.monitor.p1546a.p1548b.C21435a;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.p802b.p806b.p807a.p811d.C12957c;
import com.bytedance.p802b.p819d.C13031c;
import com.bytedance.p802b.p827g.C13084b;
import com.bytedance.p802b.p827g.C13089c;
import com.bytedance.p802b.p841k.C13130f;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.p890c.p891a.p892a.p893a.C13469c;
import com.bytedance.p890c.p891a.p892a.p893a.C13473f;
import com.bytedance.p890c.p891a.p892a.p893a.C13475g;
import com.bytedance.services.apm.api.C22710c;
import com.bytedance.services.apm.api.IHttpService;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a */
public final class C12255a {
    static {
        Covode.recordClassIndex(13991);
    }

    private C12255a() {
    }

    /* renamed from: com.bytedance.apm.a$a */
    public static class C12259a {

        /* renamed from: a */
        public static final C12255a f29537a = new C12255a((byte) 0);

        static {
            Covode.recordClassIndex(13995);
        }
    }

    /* synthetic */ C12255a(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo19750a(Context context) {
        ApmDelegate apmDelegate = ApmDelegate.C12507a.f30372a;
        C12417b.C12418a a = C12417b.m22355a();
        a.f30056e = apmDelegate.f30334b;
        if (apmDelegate.f30335c != null) {
            a.f30053b = apmDelegate.f30335c.f30753b;
            a.f30054c = apmDelegate.f30335c.f30752a;
            a.f30057f = apmDelegate.f30335c.f30755d;
            a.f30058g = (long) apmDelegate.f30335c.f30754c;
        }
        apmDelegate.mo20328a(context, a.mo20211a());
        if (C12397c.f29933c) {
            C12566c.m22611a().mo20395a(new Runnable() {
                /* class com.bytedance.apm.C12255a.RunnableC122561 */

                static {
                    Covode.recordClassIndex(13992);
                }

                public final void run() {
                    C12290b.m22063a("Apm#init", "Apm init");
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo19751a(C12419c cVar) {
        ApmDelegate apmDelegate = ApmDelegate.C12507a.f30372a;
        if (!apmDelegate.f30341i) {
            throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start(). If you have any questions, pls lark wangkai.android");
        } else if (cVar != null) {
            if (!apmDelegate.f30342j) {
                C12560b bVar = C12560b.C12564a.f30567a;
                bVar.f30558b = true;
                if (!bVar.f30562h.isEmpty()) {
                    bVar.mo20385a(bVar.f30560f);
                    bVar.mo20386a(bVar.f30560f, C12560b.f30555c);
                }
                if (!bVar.f30563i.isEmpty()) {
                    bVar.mo20385a(bVar.f30561g);
                    bVar.mo20386a(bVar.f30561g, C12560b.f30556d);
                }
                apmDelegate.f30342j = true;
                apmDelegate.f30336d = cVar;
                C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                    /* class com.bytedance.apm.internal.ApmDelegate.RunnableC1249510 */

                    static {
                        Covode.recordClassIndex(14311);
                    }

                    public final void run() {
                        ApmDelegate apmDelegate = ApmDelegate.this;
                        try {
                            long nanoTime = System.nanoTime();
                            C12397c.f29942l = System.currentTimeMillis();
                            if (C12585h.m22682a(apmDelegate.f30336d.f30075a) && !C12585h.m22682a(apmDelegate.f30347o)) {
                                apmDelegate.f30336d.f30075a = apmDelegate.f30347o;
                            }
                            if (C12585h.m22682a(apmDelegate.f30336d.f30076b) && !C12585h.m22682a(apmDelegate.f30348p)) {
                                apmDelegate.f30336d.f30076b = apmDelegate.f30348p;
                            }
                            if (C12585h.m22682a(apmDelegate.f30336d.f30077c) && !C12585h.m22682a(apmDelegate.f30349q)) {
                                apmDelegate.f30336d.f30077c = apmDelegate.f30349q;
                            }
                            C12556c.f30544a = new C12553a();
                            C12478h hVar = C12478h.C12481b.f30317a;
                            hVar.f30314a = new C12478h.AbstractC12480a() {
                                /* class com.bytedance.apm.internal.ApmDelegate.C1249611 */

                                static {
                                    Covode.recordClassIndex(14312);
                                }

                                @Override // com.bytedance.apm.C12478h.AbstractC12480a
                                /* renamed from: a */
                                public final void mo20299a(String str) {
                                    C13468b.m24209a(str);
                                }

                                @Override // com.bytedance.apm.C12478h.AbstractC12480a
                                /* renamed from: a */
                                public final void mo20300a(Throwable th, String str) {
                                    C13468b.m24211a(th, str);
                                }

                                @Override // com.bytedance.apm.C12478h.AbstractC12480a
                                /* renamed from: b */
                                public final void mo20301b(Throwable th, String str) {
                                    C13469c a = C13469c.m24220a();
                                    try {
                                        StackTraceElement[] stackTrace = th.getStackTrace();
                                        String className = stackTrace[0].getClassName();
                                        String methodName = stackTrace[0].getMethodName();
                                        int lineNumber = stackTrace[0].getLineNumber();
                                        String a2 = C13475g.m24230a(th);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("event_type", "exception");
                                        jSONObject.put("timestamp", System.currentTimeMillis());
                                        jSONObject.put("class_ref", className);
                                        jSONObject.put("method", methodName);
                                        jSONObject.put("line_num", lineNumber);
                                        jSONObject.put("stack", a2);
                                        jSONObject.put("exception_type", 1);
                                        jSONObject.put("is_core", 1);
                                        jSONObject.put("message", str);
                                        JSONObject jSONObject2 = new JSONObject();
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(jSONObject);
                                        jSONObject2.put("data", jSONArray);
                                        if (a.f32808c == null) {
                                            a.f32808c = C12397c.f29936f;
                                        }
                                        jSONObject2.put("header", a.f32808c);
                                        C13473f.m24228a(C12603v.m22730a(C13469c.f32804a, C12397c.m22291h()), jSONObject2.toString().getBytes(), C13473f.EnumC13474a.GZIP, "application/json; charset=utf-8");
                                    } catch (Throwable unused) {
                                    }
                                }
                            };
                            C21435a.C21439a.f50832a.mo35033a(new AbstractC21450d.AbstractC21451a() {
                                /* class com.bytedance.apm.C12478h.C124791 */

                                static {
                                    Covode.recordClassIndex(14289);
                                }

                                @Override // com.bytedance.monitor.p1546a.p1548b.AbstractC21450d.AbstractC21451a
                                /* renamed from: a */
                                public final void mo20298a(Throwable th, String str) {
                                    if (C12478h.this.f30314a != null) {
                                        C12478h.this.f30314a.mo20301b(th, str);
                                    }
                                }
                            });
                            C12397c.m22282a(apmDelegate.f30336d.f30091q);
                            C12397c.m22281a(apmDelegate.f30336d.f30092r);
                            IHttpService iHttpService = apmDelegate.f30336d.f30093s;
                            if (iHttpService != null) {
                                C12397c.f29938h = iHttpService;
                            }
                            C12397c.f29947q = apmDelegate.f30336d.f30075a;
                            C12397c.f29948r = apmDelegate.f30336d.f30073A;
                            apmDelegate.f30338f = apmDelegate.f30336d.f30100z;
                            apmDelegate.f30344l = apmDelegate.f30336d.f30094t;
                            C13089c cVar = C13089c.C13090a.f31926a;
                            cVar.mo20932a();
                            cVar.mo20933b();
                            cVar.mo20934c();
                            cVar.mo20935d();
                            if (apmDelegate.f30343k) {
                                C12539h hVar2 = new C12539h();
                                hVar2.f30463c = apmDelegate.f30336d.f30098x;
                                hVar2.mo20344h();
                            }
                            C13031c.f31773a.f31783k = apmDelegate.f30336d.f30098x;
                            C13084b.C13086a.f31905a.f31895a = apmDelegate.f30336d.f30078d;
                            if (apmDelegate.f30336d.f30082h && !apmDelegate.f30336d.f30083i) {
                                apmDelegate.mo20327a();
                            }
                            C12511a a = C12511a.m22484a();
                            AbstractC12473a aVar = apmDelegate.f30336d.f30097w;
                            if (aVar != null) {
                                try {
                                    a.f30381a.add(aVar);
                                } catch (Throwable unused) {
                                }
                            }
                            C12401a.m22303b().mo20178a();
                            C12404d.C12405a.f29983a.mo20178a();
                            C12404d.C12405a.f29983a.f29971f = apmDelegate.f30336d.f30090p;
                            AbstractC12269f fVar = apmDelegate.f30333a.f30051s;
                            if (C12260a.f29538a == null) {
                                C12260a.f29538a = fVar;
                            }
                            try {
                                String b = C13931l.m25215b();
                                if (!TextUtils.isEmpty(b)) {
                                    C12397c.f29936f.put("bytrace_id", b);
                                    C12397c.f29936f.put("pid", String.valueOf(Process.myPid()));
                                }
                            } catch (Throwable unused2) {
                            }
                            long j = apmDelegate.f30336d.f30095u;
                            RunnableC1249712 r10 = new Runnable() {
                                /* class com.bytedance.apm.internal.ApmDelegate.RunnableC1249712 */

                                static {
                                    Covode.recordClassIndex(14313);
                                }

                                public final void run() {
                                    ApmDelegate.this.f30339g.initParams(ApmDelegate.this.f30336d.f30089o, new AbstractC12437c() {
                                        /* class com.bytedance.apm.internal.ApmDelegate.RunnableC1249712.C124981 */

                                        static {
                                            Covode.recordClassIndex(14314);
                                        }

                                        @Override // com.bytedance.apm.core.AbstractC12437c
                                        /* renamed from: a */
                                        public final Map<String, String> mo20253a() {
                                            return C12397c.m22291h();
                                        }
                                    }, ApmDelegate.this.f30336d.f30075a);
                                    if (!ApmDelegate.this.f30336d.f30088n || !C12397c.m22285b()) {
                                        ApmDelegate.this.f30339g.fetchConfig();
                                    } else {
                                        ApmDelegate.this.f30339g.forceUpdateFromRemote(null, null);
                                    }
                                }
                            };
                            if (j <= 0) {
                                C12560b.C12564a.f30567a.mo20387a(r10);
                            } else {
                                C12560b.C12564a.f30567a.mo20388a(r10, j * 1000);
                            }
                            if (apmDelegate.f30343k) {
                                String a2 = C12509b.C12510a.f30379a.mo20339a("update_version_code");
                                String optString = C12397c.f29936f.optString("update_version_code");
                                if (!TextUtils.equals(a2, optString)) {
                                    C12397c.f29939i = 1;
                                    C12509b.C12510a.f30379a.mo20341a("update_version_code", optString);
                                } else {
                                    C12397c.f29939i = 2;
                                }
                            }
                            if (apmDelegate.f30344l != null) {
                                Iterator<Object> it = apmDelegate.f30344l.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                            if (apmDelegate.f30344l != null) {
                                Iterator<Object> it2 = apmDelegate.f30344l.iterator();
                                while (it2.hasNext()) {
                                    it2.next();
                                }
                            }
                            if (apmDelegate.f30344l != null) {
                                Iterator<Object> it3 = apmDelegate.f30344l.iterator();
                                while (it3.hasNext()) {
                                    it3.next();
                                }
                            }
                            C12560b bVar = C12560b.C12564a.f30567a;
                            ExecutorService executorService = apmDelegate.f30336d.f30099y;
                            bVar.f30557a = executorService;
                            if (bVar.f30559e != null) {
                                bVar.f30559e.mo35038a(executorService);
                            }
                            C12419c cVar2 = apmDelegate.f30336d;
                            List<String> list = cVar2.f30076b;
                            if (!C12585h.m22682a(list)) {
                                try {
                                    String host = new URL(list.get(0)).getHost();
                                    C12550a.f30525a = "https://" + host + "/monitor/collect/c/logcollect";
                                    C12550a.f30527c = host;
                                    C12550a.m22565a(host);
                                    C12262a.f29541a = "https://" + host + "/monitor/collect/c/logcollect";
                                } catch (MalformedURLException unused3) {
                                }
                                C12957c cVar3 = C12957c.C12958a.f31568a;
                                if (!C13130f.m23608a(list)) {
                                    cVar3.f31560f.clear();
                                    cVar3.f31560f.addAll(list);
                                }
                            }
                            C12957c cVar4 = C12957c.C12958a.f31568a;
                            List<String> list2 = C12310a.f29617d;
                            if (!C13130f.m23608a(list2)) {
                                cVar4.f31561g.clear();
                                cVar4.f31561g.addAll(list2);
                            }
                            C12957c.C12958a.f31568a.mo20814a(C12310a.f29619f);
                            List<String> list3 = cVar2.f30077c;
                            C12957c.C12958a.f31568a.mo20814a(list3);
                            if (!C12585h.m22682a(list)) {
                                String str = list3.get(0);
                                if (!TextUtils.isEmpty(str)) {
                                    C13469c.f32804a = str;
                                }
                            }
                            apmDelegate.f30337e = apmDelegate.f30336d.f30096v;
                            AutoLaunchTraceHelper.reportStats();
                            C21520c.m40426a(IHttpService.class, new IHttpService() {
                                /* class com.bytedance.apm.internal.ApmDelegate.C125047 */

                                static {
                                    Covode.recordClassIndex(14320);
                                }

                                @Override // com.bytedance.services.apm.api.IHttpService
                                public C22710c doGet(String str, Map<String, String> map) {
                                    return C12397c.m22277a(str, map);
                                }

                                @Override // com.bytedance.services.apm.api.IHttpService
                                public C22710c doPost(String str, byte[] bArr, Map<String, String> map) {
                                    return C12397c.f29938h.doPost(str, bArr, map);
                                }

                                @Override // com.bytedance.services.apm.api.IHttpService
                                public C22710c uploadFiles(String str, List<File> list, Map<String, String> map) {
                                    return C12397c.f29938h.uploadFiles(str, list, map);
                                }
                            });
                            if (C12397c.m22288e()) {
                                if (apmDelegate.f30343k) {
                                    C12442b.C12445a.f30223a.mo20275a("APM_START", (String) null);
                                } else {
                                    C12442b.C12445a.f30223a.mo20275a("APM_START_OTHER_PROCESS", (String) null);
                                }
                            }
                            if (apmDelegate.f30343k) {
                                C12397c.f29935e = System.nanoTime() - nanoTime;
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("init", C12397c.f29934d);
                                    jSONObject.put("start", C12397c.f29935e);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("is_main_process", apmDelegate.f30343k);
                                    C12290b.m22066a("apm_cost", jSONObject2, jSONObject, (JSONObject) null);
                                } catch (JSONException unused4) {
                                }
                            }
                        } catch (Throwable unused5) {
                        }
                    }
                });
            }
            if (C12397c.f29933c) {
                C12566c.m22611a().mo20395a(new Runnable() {
                    /* class com.bytedance.apm.C12255a.RunnableC122583 */

                    static {
                        Covode.recordClassIndex(13994);
                    }

                    public final void run() {
                        C12290b.m22063a("Apm#start", "Apm start");
                    }
                });
            }
        } else {
            throw new IllegalArgumentException("startConfig must not be allowed");
        }
    }
}
