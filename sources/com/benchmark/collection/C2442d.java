package com.benchmark.collection;

import android.os.RemoteException;
import android.text.TextUtils;
import com.benchmark.collection.AbstractC2440c;
import com.benchmark.collection.C2457e;
import com.benchmark.collection.service.C2464a;
import com.benchmark.netUtils.BytebenchAPI;
import com.benchmark.netUtils.BytebenchFaasAPI;
import com.benchmark.netUtils.C2496a;
import com.benchmark.p117a.C2413a;
import com.benchmark.p117a.C2414b;
import com.benchmark.p117a.C2415c;
import com.benchmark.p119c.C2436b;
import com.benchmark.port.C2499b;
import com.benchmark.tools.C2513b;
import com.benchmark.tools.C2529k;
import com.benchmark.tools.C2530l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p983b.C14620c;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import okhttp3.AbstractC90025ab;
import okhttp3.C90204w;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.benchmark.collection.d */
public final class C2442d extends AbstractC2440c {

    /* renamed from: b */
    public C2464a f7345b;

    /* renamed from: c */
    public long f7346c;

    /* renamed from: d */
    public EnumC2456a f7347d = EnumC2456a.INVALID;

    /* renamed from: e */
    private AbstractC22030d<TypedInput> f7348e = new AbstractC22030d<TypedInput>() {
        /* class com.benchmark.collection.C2442d.C24452 */

        static {
            Covode.recordClassIndex(2798);
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(final AbstractC21983b<TypedInput> bVar, final C22099u<TypedInput> uVar) {
            C2530l.m7415a(new Callable<Void>() {
                /* class com.benchmark.collection.C2442d.C24452.CallableC24461 */

                static {
                    Covode.recordClassIndex(2799);
                }

                /* access modifiers changed from: private */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
                    if (r2 == null) goto L_0x0058;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Void call() {
                    /*
                    // Method dump skipped, instructions count: 109
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.benchmark.collection.C2442d.C24452.CallableC24461.call():java.lang.Void");
                }
            }, C2530l.f7652a);
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<TypedInput> bVar, Throwable th) {
            if (th instanceof C14620c) {
                C14620c cVar = (C14620c) th;
                cVar.getStatusCode();
                cVar.getMessage();
            }
            if (th != null) {
                th.printStackTrace(new PrintWriter(new StringWriter()));
            }
            C2442d.this.f7344a.mo6805a(103, -1, th.getMessage());
        }
    };

    static {
        Covode.recordClassIndex(2795);
    }

    @Override // com.benchmark.collection.AbstractC2460f
    /* renamed from: b */
    public final int mo6811b() {
        if (this.f7347d != EnumC2456a.RUN) {
            return -4;
        }
        this.f7347d = EnumC2456a.STOPPING;
        C2530l.m7415a(new Callable<Void>() {
            /* class com.benchmark.collection.C2442d.CallableC24528 */

            static {
                Covode.recordClassIndex(2805);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                C2464a aVar = C2442d.this.f7345b;
                if (!C2439b.f7341a.f7342b.f7338e) {
                    aVar.f7402f.stopByteBench();
                    if (aVar.f7401e == null) {
                        return null;
                    }
                    aVar.f7401e.mo6806a(102, "stop");
                    return null;
                } else if (aVar.f7403g && aVar.f7397a != null) {
                    try {
                        aVar.f7397a.mo6798a();
                        return null;
                    } catch (RemoteException e) {
                        C2415c.m7261a(e);
                        return null;
                    }
                } else if (aVar.f7401e == null) {
                    return null;
                } else {
                    aVar.f7401e.mo6805a(102, -1, "stop failed");
                    return null;
                }
            }
        }, C2530l.f7652a);
        return 0;
    }

    /* renamed from: d */
    public final void mo6814d() {
        C2464a aVar = this.f7345b;
        if (C2439b.f7341a.f7342b.f7338e) {
            try {
                if (aVar.f7403g) {
                    aVar.f7398b.unbindService(aVar.f7399c);
                    aVar.f7397a = null;
                    aVar.f7403g = false;
                    aVar.f7399c = null;
                }
            } catch (Throwable th) {
                C2415c.m7261a(th);
            }
        } else {
            aVar.f7402f.release();
        }
    }

    /* renamed from: com.benchmark.collection.d$a */
    public enum EnumC2456a {
        INVALID,
        INIT,
        LOADING,
        LOAD,
        START,
        RUN,
        STOPPING,
        STOP,
        QUITTING;

        static {
            Covode.recordClassIndex(2809);
        }
    }

    /* renamed from: c */
    public final int mo6813c() {
        String str;
        String[] result = this.f7345b.f7402f.getResult();
        if (result != null) {
            String str2 = null;
            if (result.length > 0) {
                str = result[0];
            } else {
                str = null;
            }
            if (result.length > 1) {
                str2 = result[1];
            }
            try {
                if (!(this.f7344a == null || str == null)) {
                    final JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("sdk_version", "2.4.0-8_mt");
                    C2413a.m7259a("bytebench_task", jSONObject);
                    if (C2439b.f7341a.f7342b.f7337d == C2457e.EnumC2459b.FAAS_API) {
                        C2530l.m7415a(new Callable<Void>() {
                            /* class com.benchmark.collection.C2442d.CallableC244410 */

                            static {
                                Covode.recordClassIndex(2797);
                            }

                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public Void call() {
                                MethodCollector.m26663i(7891);
                                String jSONObject = jSONObject.toString();
                                C22099u<TypedInput> execute = ((BytebenchFaasAPI) RetrofitUtils.m43288b("").mo35884a(BytebenchFaasAPI.class)).reportResult(C2496a.m7360a().mo6918b(), AbstractC90025ab.create(C90204w.m156843b("application/json"), jSONObject)).execute();
                                try {
                                    byte[] bArr = new byte[4096];
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    InputStream in = execute.f52262b.mo11577in();
                                    while (true) {
                                        int read = in.read(bArr, 0, 4096);
                                        if (read <= 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    }
                                    JSONObject jSONObject2 = new JSONObject(jSONObject);
                                    jSONObject2.optInt("status_code");
                                    jSONObject2.optString("message");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                MethodCollector.m26664o(7891);
                                return null;
                            }
                        }, C2530l.f7652a);
                    }
                }
            } catch (Exception e) {
                C2415c.m7261a(e);
            }
            if (str2 != null) {
                C2529k.m7411a().mo6985a(C2436b.f7319m.f7320a, "benchmark", str2);
                if (this.f7347d == EnumC2456a.QUITTING) {
                    this.f7347d = EnumC2456a.LOAD;
                }
            } else {
                this.f7347d = EnumC2456a.INVALID;
            }
        }
        return 0;
    }

    @Override // com.benchmark.collection.AbstractC2460f
    /* renamed from: a */
    public final void mo6809a() {
        Map<String, String> a;
        if (this.f7347d == EnumC2456a.INIT) {
            this.f7346c = System.currentTimeMillis();
            this.f7347d = EnumC2456a.LOADING;
            HashMap hashMap = new HashMap();
            if (C2414b.f7251a == null || (a = C2414b.f7251a.mo6978a()) == null) {
                hashMap.put("", "");
            } else {
                hashMap.putAll(a);
            }
            BytebenchAPI bytebenchAPI = (BytebenchAPI) C2496a.m7360a().mo6917a(BytebenchAPI.class);
            HashMap hashMap2 = new HashMap(C2496a.m7360a().mo6918b());
            if (C2439b.f7341a.f7342b.f7334a) {
                hashMap2.put("aid", "123123");
                hashMap2.put("task_group_id", String.valueOf(C2439b.f7341a.f7342b.f7335b));
            }
            AbstractC21983b<TypedInput> defaultBenchmark = bytebenchAPI.getDefaultBenchmark(hashMap, hashMap2);
            defaultBenchmark.request().getUrl();
            defaultBenchmark.enqueue(this.f7348e);
        }
    }

    /* renamed from: b */
    public final void mo6812b(final String str) {
        C2530l.m7415a(new Callable<Void>() {
            /* class com.benchmark.collection.C2442d.CallableC24506 */

            static {
                Covode.recordClassIndex(2803);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() {
                int loadByteBench;
                C2464a aVar = C2442d.this.f7345b;
                String str = str;
                if (aVar.f7402f == null) {
                    loadByteBench = -100;
                } else {
                    loadByteBench = aVar.f7402f.loadByteBench(str);
                }
                if (loadByteBench == 0) {
                    C2442d.this.f7344a.mo6806a(103, "load Task success");
                    return null;
                }
                C2442d.this.f7344a.mo6805a(103, loadByteBench, "loadBytebenchToNative failed");
                return null;
            }
        }, C2530l.f7652a);
    }

    @Override // com.benchmark.collection.AbstractC2460f
    /* renamed from: a */
    public final int mo6807a(final int i) {
        if (this.f7347d != EnumC2456a.LOAD && this.f7347d != EnumC2456a.STOP) {
            return -4;
        }
        this.f7347d = EnumC2456a.START;
        if (i == -1) {
            return -1;
        }
        C2530l.m7415a(new Callable<Void>() {
            /* class com.benchmark.collection.C2442d.CallableC24517 */

            static {
                Covode.recordClassIndex(2804);
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0081 A[Catch:{ all -> 0x0082 }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() {
                /*
                // Method dump skipped, instructions count: 191
                */
                throw new UnsupportedOperationException("Method not decompiled: com.benchmark.collection.C2442d.CallableC24517.call():java.lang.Void");
            }
        }, C2530l.f7652a);
        return 0;
    }

    @Override // com.benchmark.collection.AbstractC2460f
    /* renamed from: a */
    public final int mo6808a(C2457e eVar) {
        if (!C2499b.f7582a.get()) {
            return -105;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C2437a aVar = C2439b.f7341a.f7342b;
        aVar.f7334a = eVar.f7372a;
        aVar.f7335b = eVar.f7373b;
        aVar.f7337d = eVar.f7374c;
        aVar.f7338e = eVar.f7375d;
        this.f7344a = new AbstractC2440c.AbstractC2441a() {
            /* class com.benchmark.collection.C2442d.C24539 */

            static {
                Covode.recordClassIndex(2806);
            }

            @Override // com.benchmark.collection.AbstractC2440c.AbstractC2441a
            /* renamed from: a */
            public final void mo6806a(int i, String str) {
                switch (i) {
                    case HandlerC21534a.f51116a:
                        C2442d.this.f7347d = EnumC2456a.INIT;
                        return;
                    case 101:
                        C2442d.this.f7347d = EnumC2456a.RUN;
                        return;
                    case 102:
                        C2442d.this.f7347d = EnumC2456a.STOP;
                        return;
                    case 103:
                        C2442d.this.f7347d = EnumC2456a.LOAD;
                        long currentTimeMillis = System.currentTimeMillis() - C2442d.this.f7346c;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("cost_time", currentTimeMillis);
                            jSONObject.put("result", 0);
                            jSONObject.put("message", str);
                            C2413a.m7259a("bytebench_collection_load_task", jSONObject);
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    case 104:
                        C2442d.this.f7347d = EnumC2456a.QUITTING;
                        C2442d.this.mo6814d();
                        return;
                    case 105:
                        C2530l.m7415a(new Callable<Boolean>() {
                            /* class com.benchmark.collection.C2442d.C24539.CallableC24552 */

                            static {
                                Covode.recordClassIndex(2808);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Boolean call() {
                                C2442d.this.mo6813c();
                                return true;
                            }
                        }, C2530l.f7652a).mo6986a(new C2530l.AbstractC2534a<Boolean, Void>() {
                            /* class com.benchmark.collection.C2442d.C24539.C24541 */

                            static {
                                Covode.recordClassIndex(2807);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.benchmark.tools.l] */
                            @Override // com.benchmark.tools.C2530l.AbstractC2534a
                            /* renamed from: a */
                            public final /* synthetic */ Void mo6821a(C2530l<Boolean> lVar) {
                                lVar.mo6991b();
                                return null;
                            }
                        }, C2530l.f7653b);
                        return;
                    default:
                        return;
                }
            }

            @Override // com.benchmark.collection.AbstractC2440c.AbstractC2441a
            /* renamed from: a */
            public final void mo6805a(int i, int i2, String str) {
                switch (i) {
                    case HandlerC21534a.f51116a:
                        C2442d.this.f7347d = EnumC2456a.INVALID;
                        return;
                    case 101:
                        C2442d.this.f7347d = EnumC2456a.LOAD;
                        return;
                    case 102:
                        C2442d.this.f7347d = EnumC2456a.INIT;
                        return;
                    case 103:
                        C2442d.this.f7347d = EnumC2456a.INIT;
                        long currentTimeMillis = System.currentTimeMillis() - C2442d.this.f7346c;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("cost_time", currentTimeMillis);
                            jSONObject.put("result", i2);
                            jSONObject.put("message", str);
                            C2413a.m7259a("bytebench_collection_load_task", jSONObject);
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    case 104:
                        C2442d.this.mo6814d();
                        C2442d.this.f7347d = EnumC2456a.INVALID;
                        return;
                    default:
                        return;
                }
            }
        };
        C2439b.f7341a.f7342b.f7336c = C2436b.f7319m.f7331l + "/bytebench_collection";
        C2464a a = C2464a.m7305a();
        this.f7345b = a;
        a.mo6841a(this.f7344a);
        this.f7344a.mo6806a(100, "bytebench init");
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            C2413a.m7259a("bytebench_collection_init", jSONObject);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo6810a(final String str) {
        if (str != null) {
            C2529k.m7411a().mo6985a(C2436b.f7319m.f7320a, "benchmark", str);
        } else {
            str = C2529k.m7411a().mo6984a(C2436b.f7319m.f7320a, "benchmark");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("status_code");
            if (optInt != 0) {
                jSONObject.optString("message");
                this.f7344a.mo6805a(103, -optInt, "loadBytebench with invalid status_code");
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("resource_list");
            if (jSONArray == null) {
                mo6812b(str);
                return;
            }
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            final RunnableC24431 r4 = new Runnable() {
                /* class com.benchmark.collection.C2442d.RunnableC24431 */

                static {
                    Covode.recordClassIndex(2796);
                }

                public final void run() {
                    C2442d.this.mo6812b(str);
                }
            };
            final RunnableC24473 r3 = new Runnable() {
                /* class com.benchmark.collection.C2442d.RunnableC24473 */

                static {
                    Covode.recordClassIndex(2800);
                }

                public final void run() {
                    C2442d.this.f7344a.mo6805a(103, -1, "check resource failed");
                }
            };
            C2530l.m7415a(new Callable<Boolean>() {
                /* class com.benchmark.collection.C2442d.CallableC24495 */

                static {
                    Covode.recordClassIndex(2802);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Boolean call() {
                    int indexOf;
                    for (String str : arrayList) {
                        String[] split = str.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = C2439b.f7341a.f7342b.f7336c + "/" + str2;
                        if (!TextUtils.isEmpty(str)) {
                            if (!TextUtils.isEmpty(str3)) {
                                File file = new File(str3);
                                if (file.exists() && (indexOf = str.indexOf("?")) != -1) {
                                    String substring = str.substring(indexOf + 1);
                                    if (!TextUtils.isEmpty(substring) && substring.equalsIgnoreCase(C2513b.m7383a(file))) {
                                    }
                                }
                            }
                            C2496a.m7360a();
                            C2496a.m7362a(str, C2439b.f7341a.f7342b.f7336c, str2);
                        }
                    }
                    return true;
                }
            }, C2530l.f7652a).mo6986a(new C2530l.AbstractC2534a<Boolean, Void>() {
                /* class com.benchmark.collection.C2442d.C24484 */

                static {
                    Covode.recordClassIndex(2801);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.benchmark.tools.l] */
                @Override // com.benchmark.tools.C2530l.AbstractC2534a
                /* renamed from: a */
                public final /* synthetic */ Void mo6821a(C2530l<Boolean> lVar) {
                    if (!lVar.mo6991b()) {
                        return null;
                    }
                    if (lVar.mo6987a().booleanValue()) {
                        Runnable runnable = r4;
                        if (runnable == null) {
                            return null;
                        }
                        runnable.run();
                        return null;
                    }
                    Runnable runnable2 = r3;
                    if (runnable2 == null) {
                        return null;
                    }
                    runnable2.run();
                    return null;
                }
            }, C2530l.f7653b);
        } catch (Exception e) {
            this.f7344a.mo6805a(103, -1, e.getMessage());
            C2415c.m7261a(e);
        }
    }
}
