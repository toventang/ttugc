package com.facebook.net;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.frameworks.baselib.network.http.retrofit.ExecutorC14760a;
import com.bytedance.frameworks.baselib.network.p979a.C14586b;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22056j;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p1703d.C22940b;
import com.bytedance.ttnet.p1703d.C22944d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.facebook.common.p1833e.C24099a;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.AbstractC24529ag;
import com.facebook.imagepipeline.p1889n.AbstractC24545al;
import com.facebook.imagepipeline.p1889n.AbstractC24585c;
import com.facebook.imagepipeline.p1889n.AbstractC24596k;
import com.facebook.imagepipeline.p1889n.C24565ax;
import com.facebook.imagepipeline.p1889n.C24587e;
import com.facebook.imagepipeline.p1889n.C24614t;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.facebook.net.c */
public final class C24893c extends AbstractC24585c<C24900c> {

    /* renamed from: b */
    public static AbstractC24901d f59084b;

    /* renamed from: c */
    public static AbstractC24899b f59085c;

    /* renamed from: a */
    public Executor f59086a;

    /* renamed from: com.facebook.net.c$a */
    public interface AbstractC24898a {
        static {
            Covode.recordClassIndex(29091);
        }

        /* renamed from: a */
        Pair<InputStream, Long> mo40780a(InputStream inputStream, String str, long j);

        /* renamed from: a */
        String mo40781a(String str);
    }

    /* renamed from: com.facebook.net.c$b */
    public interface AbstractC24899b {
        static {
            Covode.recordClassIndex(29092);
        }

        /* renamed from: a */
        AbstractC24898a mo40782a();
    }

    static {
        Covode.recordClassIndex(29086);
    }

    public C24893c() {
        this(new ExecutorC14760a());
    }

    private C24893c(Executor executor) {
        this.f59086a = executor;
        C24099a.m45657c("FrescoTTNetFetcher", "init FrescoTTNetFetcher");
    }

    /* renamed from: a */
    private static String m47720a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    private static int m47719a(C24900c cVar) {
        Uri c;
        if (!(cVar == null || cVar.f58495e == null || cVar.f58495e.mo40417d() == null)) {
            Object d = cVar.f58495e.mo40417d();
            if ((d instanceof C24909i) && (c = cVar.mo40453c()) != null) {
                C24909i iVar = (C24909i) d;
                String uri = c.toString();
                if (!C13627m.m24498a(uri) && iVar.f59138a.containsKey(uri)) {
                    return iVar.f59138a.get(uri).intValue();
                }
            }
        }
        return -1;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final /* synthetic */ C24614t createFetchState(AbstractC24596k kVar, AbstractC24545al alVar) {
        return new C24900c(kVar, alVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.n.t, int] */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24585c, com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final /* synthetic */ void onFetchCompletion(C24900c cVar, int i) {
        cVar.f59108k.run();
    }

    /* renamed from: com.facebook.net.c$c */
    public static class C24900c extends C24614t {

        /* renamed from: a */
        public long f59103a;

        /* renamed from: b */
        public long f59104b;

        /* renamed from: c */
        public long f59105c;

        /* renamed from: i */
        public long f59106i;

        /* renamed from: j */
        public boolean f59107j;

        /* renamed from: k */
        public Runnable f59108k;

        static {
            Covode.recordClassIndex(29093);
        }

        public C24900c(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
            super(kVar, alVar);
            if (kVar instanceof C24565ax.C24569a) {
                C24565ax.C24569a aVar = (C24565ax.C24569a) kVar;
                if (aVar.f58374a != null) {
                    this.f59106i = (long) aVar.f58374a.mo40309h();
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.n.t, int] */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24585c, com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final /* synthetic */ Map getExtraMap(C24900c cVar, int i) {
        String str;
        HashMap hashMap = new HashMap(1);
        hashMap.put("image_size", Integer.toString(i));
        if (cVar.f59107j) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("hit_cdn_cache", str);
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final /* synthetic */ void fetch(C24614t tVar, AbstractC24529ag.AbstractC24530a aVar) {
        AbstractC24898a aVar2;
        INetworkApi iNetworkApi;
        C24900c cVar = (C24900c) tVar;
        if (cVar != null) {
            cVar.f59103a = System.currentTimeMillis();
            Uri c = cVar.mo40453c();
            if (c != null) {
                AbstractC24899b bVar = f59085c;
                LinkedList linkedList = null;
                if (bVar != null) {
                    aVar2 = bVar.mo40782a();
                } else {
                    aVar2 = null;
                }
                String uri = c.toString();
                if (aVar2 != null) {
                    uri = aVar2.mo40781a(uri);
                }
                if (!C13627m.m24498a(uri)) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Pair<String, String> a = C14759i.m27066a(uri, linkedHashMap);
                        String str = (String) a.first;
                        String str2 = (String) a.second;
                        if (C24907h.m47742a().mo40785b()) {
                            iNetworkApi = (INetworkApi) C24907h.m47742a().mo40784a(str, INetworkApi.class);
                        } else {
                            iNetworkApi = (INetworkApi) RetrofitUtils.m43281a(str, INetworkApi.class);
                        }
                        C24892b bVar2 = new C24892b(cVar.mo40454d());
                        if (cVar.f59106i > 0) {
                            linkedList = new LinkedList();
                            linkedList.add(new C22027b("Range", "bytes=" + cVar.f59106i + "-"));
                        }
                        Logger.debug();
                        if (iNetworkApi != null) {
                            final AbstractC21983b<TypedInput> downloadFile = iNetworkApi.downloadFile(false, -1, str2, linkedHashMap, linkedList, bVar2);
                            cVar.f58495e.mo40414a(new C24587e() {
                                /* class com.facebook.net.C24893c.C248941 */

                                static {
                                    Covode.recordClassIndex(29087);
                                }

                                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                                /* renamed from: a */
                                public final void mo34237a() {
                                    if (Looper.myLooper() != Looper.getMainLooper()) {
                                        downloadFile.cancel();
                                    } else {
                                        C24893c.this.f59086a.execute(new Runnable() {
                                            /* class com.facebook.net.C24893c.C248941.RunnableC248951 */

                                            static {
                                                Covode.recordClassIndex(29088);
                                            }

                                            public final void run() {
                                                downloadFile.cancel();
                                            }
                                        });
                                    }
                                }
                            });
                            C14731e.AbstractC14736e eVar = C14731e.f35913b;
                            if (eVar != null) {
                                eVar.mo23735b(uri);
                            }
                            downloadFile.enqueue(new AbstractC22056j<TypedInput>(aVar2, cVar, bVar2, aVar, false, downloadFile) {
                                /* class com.facebook.net.C24893c.C248962 */

                                /* renamed from: a */
                                C22940b f59090a;

                                /* renamed from: b */
                                long f59091b;

                                /* renamed from: c */
                                final /* synthetic */ AbstractC24898a f59092c;

                                /* renamed from: d */
                                final /* synthetic */ C24900c f59093d;

                                /* renamed from: e */
                                final /* synthetic */ C22944d f59094e;

                                /* renamed from: f */
                                final /* synthetic */ AbstractC24529ag.AbstractC24530a f59095f;

                                /* renamed from: g */
                                final /* synthetic */ boolean f59096g = false;

                                /* renamed from: h */
                                final /* synthetic */ AbstractC21983b f59097h;

                                static {
                                    Covode.recordClassIndex(29089);
                                }

                                @Override // com.bytedance.retrofit2.AbstractC22030d
                                /* renamed from: a */
                                public final void mo6817a(AbstractC21983b<TypedInput> bVar, C22099u<TypedInput> uVar) {
                                }

                                @Override // com.bytedance.retrofit2.AbstractC22030d
                                /* renamed from: a */
                                public final void mo6818a(AbstractC21983b<TypedInput> bVar, Throwable th) {
                                    Exception exc;
                                    this.f59091b = System.currentTimeMillis();
                                    if (this.f59096g) {
                                        C14586b.C14587a.f35261a.mo23467b();
                                    }
                                    if (th instanceof Exception) {
                                        exc = (Exception) th;
                                    } else {
                                        exc = new Exception(th.getMessage(), th.getCause());
                                    }
                                    m47725a((C22099u) null, exc);
                                }

                                /* JADX WARNING: Failed to process nested try/catch */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00c0 */
                                /* JADX WARNING: Removed duplicated region for block: B:51:0x00c4 A[Catch:{ all -> 0x00d9 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
                                /* renamed from: a */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                private void m47725a(com.bytedance.retrofit2.C22099u r7, java.lang.Exception r8) {
                                    /*
                                    // Method dump skipped, instructions count: 218
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C24893c.C248962.m47725a(com.bytedance.retrofit2.u, java.lang.Exception):void");
                                }

                                /* JADX WARNING: Removed duplicated region for block: B:66:0x0101  */
                                @Override // com.bytedance.retrofit2.AbstractC22056j
                                /* renamed from: b */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void mo35850b(final com.bytedance.retrofit2.AbstractC21983b<com.bytedance.retrofit2.mime.TypedInput> r12, final com.bytedance.retrofit2.C22099u<com.bytedance.retrofit2.mime.TypedInput> r13) {
                                    /*
                                    // Method dump skipped, instructions count: 266
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C24893c.C248962.mo35850b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                                }

                                {
                                    this.f59092c = r4;
                                    this.f59093d = r5;
                                    this.f59094e = r6;
                                    this.f59095f = r7;
                                    this.f59097h = r9;
                                    this.f59091b = -1;
                                }
                            });
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m47723a(C24900c cVar, boolean z, long j) {
        if (m47719a(cVar) == 1) {
            C24902e.m47734a().mo40783a(cVar.mo40453c().toString(), z, j, true);
        } else if (m47719a(cVar) == 0) {
            C24902e.m47734a().mo40783a(cVar.mo40453c().toString(), z, j, false);
        }
    }

    /* renamed from: a */
    public static void m47721a(C14612a aVar, List<C22027b> list, C22944d dVar, Exception exc) {
        if (aVar != null) {
            try {
                if (C13627m.m24498a(aVar.f35358a)) {
                    String str = null;
                    if (list != null && list.size() > 0) {
                        for (C22027b bVar : list) {
                            if ("x-snssdk.remoteaddr".equalsIgnoreCase(bVar.f52037a)) {
                                str = bVar.f52038b;
                            }
                        }
                    }
                    if (C13627m.m24498a(str) && dVar != null) {
                        str = dVar.f35398a;
                    }
                    if (C13627m.m24498a(str)) {
                        str = m47720a(exc);
                    }
                    if (!C13627m.m24498a(str)) {
                        aVar.f35358a = str;
                        if (aVar.f35359b != null) {
                            aVar.f35359b.f35398a = str;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m47722a(C22099u uVar, C24900c cVar, Throwable th, C22940b bVar, int i) {
        if (cVar != null) {
            try {
                long j = cVar.f59105c - cVar.f59103a;
                if (j <= 0) {
                    j = System.currentTimeMillis() - cVar.f59103a;
                }
                String str = null;
                if (C13627m.m24498a((String) null)) {
                    if (uVar != null) {
                        str = uVar.f52261a.f52039a;
                    } else {
                        str = cVar.mo40453c().toString();
                    }
                }
                Logger.debug();
                m47723a(cVar, false, j);
                C24906g gVar = new C24906g();
                gVar.f59125a = uVar;
                gVar.f59127c = str;
                if (f59084b != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", cVar.mo40451a());
                    jSONObject.put("retryCount", i);
                    f59084b.mo39303a(gVar, bVar, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
