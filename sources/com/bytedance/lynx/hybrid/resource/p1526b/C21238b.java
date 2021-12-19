package com.bytedance.lynx.hybrid.resource.p1526b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.C21299e;
import com.bytedance.lynx.hybrid.resource.C21303f;
import com.bytedance.lynx.hybrid.resource.C21335j;
import com.bytedance.lynx.hybrid.resource.C21343n;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21278d;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21283i;
import com.bytedance.lynx.hybrid.resource.config.C21282h;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21293d;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21298h;
import com.bytedance.lynx.hybrid.resource.p1535i.C21334c;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.lynx.hybrid.resource.b.b */
public final class C21238b extends IHybridResourceLoader {

    /* renamed from: a */
    public static final C21239a f50403a = new C21239a((byte) 0);

    /* renamed from: b */
    private final String f50404b = "CDN";

    static {
        Covode.recordClassIndex(24854);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void cancelLoad() {
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$a */
    public static final class C21239a {
        static {
            Covode.recordClassIndex(24855);
        }

        private C21239a() {
        }

        public /* synthetic */ C21239a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final String getTAG() {
        return this.f50404b;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$b */
    public static final class C21240b implements AbstractC21283i {

        /* renamed from: a */
        final /* synthetic */ C21238b f50405a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f50406b;

        /* renamed from: c */
        final /* synthetic */ String f50407c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f50408d;

        static {
            Covode.recordClassIndex(24856);
        }

        /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$b$a */
        static final class CallableC21241a<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C21240b f50409a;

            /* renamed from: b */
            final /* synthetic */ String f50410b;

            static {
                Covode.recordClassIndex(24857);
            }

            CallableC21241a(C21240b bVar, String str) {
                this.f50409a = bVar;
                this.f50410b = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                try {
                    this.f50409a.f50408d.invoke(new Throwable(this.f50410b));
                } catch (Throwable th) {
                    if (!C21170d.C21171a.m39868a().f50220a) {
                        C21210c.m39925a(this.f50409a.f50405a.getTAG() + ":reject error " + th.getMessage(), (EnumC21209b) null, (String) null, 6);
                    } else {
                        throw new Throwable(th);
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$b$b */
        static final class CallableC21242b<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C21240b f50411a;

            /* renamed from: b */
            final /* synthetic */ C21282h f50412b;

            static {
                Covode.recordClassIndex(24858);
            }

            CallableC21242b(C21240b bVar, C21282h hVar) {
                this.f50411a = bVar;
                this.f50412b = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                try {
                    AbstractC89172b bVar = this.f50411a.f50406b;
                    Uri parse = Uri.parse(this.f50411a.f50407c);
                    C89219l.m154709a((Object) parse, "");
                    C21343n nVar = new C21343n(parse);
                    C21299e eVar = new C21299e(new File(this.f50412b.f50508a), EnumC21293d.CDN);
                    eVar.f50565b = 0L;
                    eVar.f50567d = EnumC21293d.CDN;
                    eVar.f50564a = this.f50412b.f50509b;
                    nVar.f50693a = eVar;
                    bVar.invoke(nVar);
                } catch (Throwable th) {
                    if (!C21170d.C21171a.m39868a().f50220a) {
                        C21210c.m39925a(this.f50411a.f50405a.getTAG() + ":resolve error " + th.getMessage(), (EnumC21209b) null, (String) null, 6);
                    } else {
                        throw new Throwable(th);
                    }
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21283i
        /* renamed from: a */
        public final void mo34834a(C21282h hVar) {
            C89219l.m154719c(hVar, "");
            C1731i.m5636a(new CallableC21242b(this, hVar), C1731i.f5564c);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21283i
        /* renamed from: a */
        public final void mo34835a(String str) {
            C89219l.m154719c(str, "");
            C1731i.m5636a(new CallableC21241a(this, str), C1731i.f5564c);
        }

        C21240b(C21238b bVar, AbstractC89172b bVar2, String str, AbstractC89172b bVar3) {
            this.f50405a = bVar;
            this.f50406b = bVar2;
            this.f50407c = str;
            this.f50408d = bVar3;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$c */
    static final class C21243c extends AbstractC89220m implements AbstractC89172b<C21343n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f50413a;

        /* renamed from: b */
        final /* synthetic */ C21294e f50414b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f50415c;

        static {
            Covode.recordClassIndex(24859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21243c(AbstractC89172b bVar, C21294e eVar, AbstractC89172b bVar2) {
            super(1);
            this.f50413a = bVar;
            this.f50414b = eVar;
            this.f50415c = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21343n nVar) {
            File file;
            C21343n nVar2 = nVar;
            C89219l.m154719c(nVar2, "");
            C21299e a = nVar2.mo34949a();
            if (a == null || (file = a.f50566c) == null || !file.exists()) {
                this.f50415c.invoke(new FileNotFoundException("[cdn] resource not found on url:" + this.f50414b.f50546m));
            } else {
                AbstractC89172b bVar = this.f50413a;
                C21294e eVar = this.f50414b;
                eVar.f50547n = file.getAbsolutePath();
                eVar.f50548o = EnumC21298h.DISK;
                eVar.f50549p = EnumC21293d.CDN;
                eVar.f50550q = a.f50564a;
                JSONArray jSONArray = eVar.f50545l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, "CDN");
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
                bVar.invoke(eVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$d */
    static final class C21244d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21294e f50416a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f50417b;

        static {
            Covode.recordClassIndex(24860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21244d(C21294e eVar, AbstractC89172b bVar) {
            super(1);
            this.f50416a = eVar;
            this.f50417b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            C89219l.m154719c(th2, str);
            JSONArray jSONArray = this.f50416a.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, "CDN");
            jSONObject.put("status", "failed");
            jSONObject.put("message", th2.getMessage());
            jSONArray.put(jSONObject);
            C21294e eVar = this.f50416a;
            if (eVar instanceof C21335j) {
                C21335j jVar = (C21335j) eVar;
                StringBuilder sb = new StringBuilder("cdn ");
                String message = th2.getMessage();
                if (message != null) {
                    str = message;
                }
                jVar.mo34937b(sb.append(str).toString());
            }
            this.f50417b.invoke(th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$e */
    static final class C21245e extends AbstractC89220m implements AbstractC89172b<C21343n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21238b f50418a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f50419b;

        /* renamed from: c */
        final /* synthetic */ C21294e f50420c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f50421d;

        static {
            Covode.recordClassIndex(24861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21245e(C21238b bVar, C89233z.C89238e eVar, C21294e eVar2, CountDownLatch countDownLatch) {
            super(1);
            this.f50418a = bVar;
            this.f50419b = eVar;
            this.f50420c = eVar2;
            this.f50421d = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21343n nVar) {
            File file;
            C21343n nVar2 = nVar;
            C89219l.m154719c(nVar2, "");
            C21299e a = nVar2.mo34949a();
            if (a != null) {
                file = a.f50566c;
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                C89233z.C89238e eVar = this.f50419b;
                T t = (T) this.f50420c;
                t.f50547n = file.getAbsolutePath();
                t.f50548o = EnumC21298h.DISK;
                t.f50549p = EnumC21293d.CDN;
                t.f50550q = a.f50564a;
                JSONArray jSONArray = t.f50545l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, "CDN");
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
                eVar.element = t;
            }
            JSONArray jSONArray2 = this.f50420c.f50545l;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f50418a.getTAG());
            jSONObject2.put("status", "success");
            jSONArray2.put(jSONObject2);
            this.f50421d.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$f */
    static final class C21246f extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21238b f50422a;

        /* renamed from: b */
        final /* synthetic */ C21294e f50423b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f50424c;

        static {
            Covode.recordClassIndex(24862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21246f(C21238b bVar, C21294e eVar, CountDownLatch countDownLatch) {
            super(1);
            this.f50422a = bVar;
            this.f50423b = eVar;
            this.f50424c = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            C89219l.m154719c(th2, str);
            JSONArray jSONArray = this.f50423b.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50422a.getTAG());
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            C21294e eVar = this.f50423b;
            if (eVar instanceof C21335j) {
                C21335j jVar = (C21335j) eVar;
                StringBuilder sb = new StringBuilder("cdn ");
                String message = th2.getMessage();
                if (message != null) {
                    str = message;
                }
                jVar.mo34937b(sb.append(str).toString());
            }
            this.f50424c.countDown();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final C21294e loadSync(C21294e eVar, C21284j jVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(jVar, "");
        C21210c.m39925a("start to sync load from cdn", (EnumC21209b) null, (String) null, 6);
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m39948a(eVar.f50546m, true, jVar, (AbstractC89172b<? super C21343n, C89391z>) new C21245e(this, eVar2, eVar, countDownLatch), (AbstractC89172b<? super Throwable, C89391z>) new C21246f(this, eVar, countDownLatch));
        countDownLatch.await(jVar.f50513d, TimeUnit.MILLISECONDS);
        return eVar2.element;
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void loadAsync(C21294e eVar, C21284j jVar, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        Uri parse;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        new C21334c();
        C21210c.m39925a("start to async load from cdn", (EnumC21209b) null, (String) null, 6);
        if (jVar.f50519j.length() == 0) {
            parse = eVar.f50546m;
        } else {
            parse = Uri.parse(jVar.f50519j);
        }
        C89219l.m154709a((Object) parse, "");
        m39948a(parse, false, jVar, (AbstractC89172b<? super C21343n, C89391z>) new C21243c(bVar, eVar, bVar2), (AbstractC89172b<? super Throwable, C89391z>) new C21244d(eVar, bVar2));
    }

    /* renamed from: a */
    private final void m39949a(String str, boolean z, C21284j jVar, AbstractC89172b<? super C21343n, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        AbstractC21278d dVar = C21303f.C21305b.f50578a.mo34909a(getService()).f50494a;
        if (dVar == null) {
            C89219l.m154707a();
        }
        dVar.mo34880a(str, z, jVar, new C21240b(this, bVar, str, bVar2));
    }

    /* renamed from: a */
    private final void m39948a(Uri uri, boolean z, C21284j jVar, AbstractC89172b<? super C21343n, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            String str = "";
            if (hashCode != -1772600516) {
                if (hashCode != 3213448) {
                }
                String uri2 = uri.toString();
                C89219l.m154709a((Object) uri2, str);
                m39949a(uri2, z, jVar, bVar, bVar2);
                return;
            } else if (scheme.equals("lynxview")) {
                String queryParameter = uri.getQueryParameter("surl");
                if (queryParameter != null) {
                    str = queryParameter;
                }
                m39949a(str, z, jVar, bVar, bVar2);
                return;
            }
        }
        bVar2.invoke(new IllegalArgumentException("cdn Invalid URL"));
    }
}
