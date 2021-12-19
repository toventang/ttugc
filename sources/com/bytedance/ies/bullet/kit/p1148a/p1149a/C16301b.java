package com.bytedance.ies.bullet.kit.p1148a.p1149a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16336c;
import com.bytedance.ies.bullet.kit.p1148a.C16342f;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.C16361l;
import com.bytedance.ies.bullet.kit.p1148a.C16365p;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.EnumC16609ao;
import com.bytedance.ies.bullet.service.base.EnumC16613ar;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16665h;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16664g;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
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

/* renamed from: com.bytedance.ies.bullet.kit.a.a.b */
public final class C16301b extends IXResourceLoader {

    /* renamed from: a */
    public static final C16302a f39152a = new C16302a((byte) 0);

    /* renamed from: b */
    private final String f39153b = "CDN";

    static {
        Covode.recordClassIndex(18594);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$a */
    public static final class C16302a {
        static {
            Covode.recordClassIndex(18595);
        }

        private C16302a() {
        }

        public /* synthetic */ C16302a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final String getTAG() {
        return this.f39153b;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$b */
    public static final class C16303b implements AbstractC16665h {

        /* renamed from: a */
        final /* synthetic */ C16301b f39154a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f39155b;

        /* renamed from: c */
        final /* synthetic */ String f39156c;

        /* renamed from: d */
        final /* synthetic */ C16667j f39157d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f39158e;

        static {
            Covode.recordClassIndex(18596);
        }

        /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$b$a */
        static final class CallableC16304a<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C16303b f39159a;

            /* renamed from: b */
            final /* synthetic */ String f39160b;

            static {
                Covode.recordClassIndex(18597);
            }

            CallableC16304a(C16303b bVar, String str) {
                this.f39159a = bVar;
                this.f39160b = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                AbstractC16582m g;
                try {
                    this.f39159a.f39158e.invoke(new Throwable(this.f39160b));
                } catch (Throwable th) {
                    AbstractC16584o oVar = this.f39159a.f39157d.f39851s;
                    if (oVar == null || (g = oVar.mo25792g()) == null || !g.mo26328c()) {
                        AbstractC16576j.C16578b.m30778a(this.f39159a.f39154a, this.f39159a.f39154a.getTAG() + ":reject error " + th.getMessage(), null, null, 6);
                    } else {
                        throw new Throwable(th);
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$b$b */
        static final class CallableC16305b<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C16303b f39161a;

            /* renamed from: b */
            final /* synthetic */ C16664g f39162b;

            static {
                Covode.recordClassIndex(18598);
            }

            CallableC16305b(C16303b bVar, C16664g gVar) {
                this.f39161a = bVar;
                this.f39162b = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                AbstractC16582m g;
                try {
                    AbstractC89172b bVar = this.f39161a.f39155b;
                    Uri parse = Uri.parse(this.f39161a.f39156c);
                    C89219l.m154709a((Object) parse, "");
                    C16361l lVar = new C16361l(parse);
                    C16336c cVar = new C16336c(new File(this.f39162b.f39820a), EnumC16609ao.CDN);
                    cVar.f39245b = 0L;
                    cVar.f39247d = EnumC16609ao.CDN;
                    cVar.f39244a = this.f39162b.f39821b;
                    lVar.f39347a = cVar;
                    bVar.invoke(lVar);
                } catch (Throwable th) {
                    AbstractC16584o oVar = this.f39161a.f39157d.f39851s;
                    if (oVar == null || (g = oVar.mo25792g()) == null || !g.mo26328c()) {
                        AbstractC16576j.C16578b.m30778a(this.f39161a.f39154a, this.f39161a.f39154a.getTAG() + ":resolve error " + th.getMessage(), null, null, 6);
                    } else {
                        throw new Throwable(th);
                    }
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16665h
        /* renamed from: a */
        public final void mo25891a(C16664g gVar) {
            C89219l.m154719c(gVar, "");
            C1731i.m5640b(new CallableC16305b(this, gVar), C1731i.f5564c);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16665h
        /* renamed from: a */
        public final void mo25892a(String str) {
            C89219l.m154719c(str, "");
            C1731i.m5640b(new CallableC16304a(this, str), C1731i.f5564c);
        }

        C16303b(C16301b bVar, AbstractC89172b bVar2, String str, C16667j jVar, AbstractC89172b bVar3) {
            this.f39154a = bVar;
            this.f39155b = bVar2;
            this.f39156c = str;
            this.f39157d = jVar;
            this.f39158e = bVar3;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$d */
    static final class C16307d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16610ap f39167a;

        /* renamed from: b */
        final /* synthetic */ C16365p f39168b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f39169c;

        static {
            Covode.recordClassIndex(18600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16307d(C16610ap apVar, C16365p pVar, AbstractC89172b bVar) {
            super(1);
            this.f39167a = apVar;
            this.f39168b = pVar;
            this.f39169c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            C89219l.m154719c(th2, str);
            C16610ap apVar = this.f39167a;
            JSONObject jSONObject = apVar.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("c_total", this.f39168b.mo25950b());
            }
            JSONArray jSONArray = apVar.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "CDN");
            jSONObject2.put("status", "failed");
            jSONObject2.put("message", th2.getMessage());
            jSONArray.put(jSONObject2);
            C16610ap apVar2 = this.f39167a;
            if (apVar2 instanceof C16342f) {
                C16342f fVar = (C16342f) apVar2;
                StringBuilder sb = new StringBuilder("cdn ");
                String message = th2.getMessage();
                if (message != null) {
                    str = message;
                }
                fVar.mo25915b(sb.append(str).toString());
            }
            this.f39169c.invoke(th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$e */
    static final class C16308e extends AbstractC89220m implements AbstractC89172b<C16361l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16301b f39170a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f39171b;

        /* renamed from: c */
        final /* synthetic */ C16610ap f39172c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f39173d;

        static {
            Covode.recordClassIndex(18601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16308e(C16301b bVar, C89233z.C89238e eVar, C16610ap apVar, CountDownLatch countDownLatch) {
            super(1);
            this.f39170a = bVar;
            this.f39171b = eVar;
            this.f39172c = apVar;
            this.f39173d = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16361l lVar) {
            File file;
            C16361l lVar2 = lVar;
            C89219l.m154719c(lVar2, "");
            C16336c a = lVar2.mo25947a();
            if (a != null) {
                file = a.f39246c;
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                C89233z.C89238e eVar = this.f39171b;
                T t = (T) this.f39172c;
                t.f39755o = file.getAbsolutePath();
                t.f39756p = EnumC16613ar.DISK;
                t.f39757q = EnumC16609ao.CDN;
                t.f39758r = a.f39244a;
                JSONArray jSONArray = t.f39753m;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, "CDN");
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
                eVar.element = t;
            }
            JSONArray jSONArray2 = this.f39172c.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f39170a.getTAG());
            jSONObject2.put("status", "success");
            jSONArray2.put(jSONObject2);
            this.f39173d.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$f */
    static final class C16309f extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16301b f39174a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39175b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f39176c;

        static {
            Covode.recordClassIndex(18602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16309f(C16301b bVar, C16610ap apVar, CountDownLatch countDownLatch) {
            super(1);
            this.f39174a = bVar;
            this.f39175b = apVar;
            this.f39176c = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            C89219l.m154719c(th2, str);
            JSONArray jSONArray = this.f39175b.f39753m;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f39174a.getTAG());
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            C16610ap apVar = this.f39175b;
            if (apVar instanceof C16342f) {
                C16342f fVar = (C16342f) apVar;
                StringBuilder sb = new StringBuilder("cdn ");
                String message = th2.getMessage();
                if (message != null) {
                    str = message;
                }
                fVar.mo25915b(sb.append(str).toString());
            }
            this.f39176c.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$c */
    static final class C16306c extends AbstractC89220m implements AbstractC89172b<C16361l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f39163a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39164b;

        /* renamed from: c */
        final /* synthetic */ C16365p f39165c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f39166d;

        static {
            Covode.recordClassIndex(18599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16306c(AbstractC89172b bVar, C16610ap apVar, C16365p pVar, AbstractC89172b bVar2) {
            super(1);
            this.f39163a = bVar;
            this.f39164b = apVar;
            this.f39165c = pVar;
            this.f39166d = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16361l lVar) {
            File file;
            C16361l lVar2 = lVar;
            C89219l.m154719c(lVar2, "");
            C16336c a = lVar2.mo25947a();
            if (a != null) {
                file = a.f39246c;
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                this.f39166d.invoke(new FileNotFoundException("[cdn] resource not found on url:" + this.f39164b.f39754n));
                JSONObject jSONObject = this.f39164b.f39752l.f39743h;
                if (jSONObject != null) {
                    jSONObject.put("c_total", this.f39165c.mo25950b());
                }
            } else {
                AbstractC89172b bVar = this.f39163a;
                C16610ap apVar = this.f39164b;
                apVar.f39755o = file.getAbsolutePath();
                apVar.f39756p = EnumC16613ar.DISK;
                apVar.f39757q = EnumC16609ao.CDN;
                apVar.f39758r = a.f39244a;
                JSONArray jSONArray = apVar.f39753m;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringSet.name, "CDN");
                jSONObject2.put("status", "success");
                jSONArray.put(jSONObject2);
                bVar.invoke(apVar);
                JSONObject jSONObject3 = this.f39164b.f39752l.f39743h;
                if (jSONObject3 != null) {
                    jSONObject3.put("c_total", this.f39165c.mo25950b());
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final C16610ap loadSync(C16610ap apVar, C16667j jVar) {
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(jVar, "");
        AbstractC16576j.C16578b.m30778a(this, "start to sync load from cdn", null, null, 6);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m30311a(apVar.f39754n, true, jVar, (AbstractC89172b<? super C16361l, C89391z>) new C16308e(this, eVar, apVar, countDownLatch), (AbstractC89172b<? super Throwable, C89391z>) new C16309f(this, apVar, countDownLatch));
        countDownLatch.await(jVar.f39841i, TimeUnit.MILLISECONDS);
        return eVar.element;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(C16610ap apVar, C16667j jVar, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        Uri parse;
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        C16365p pVar = new C16365p();
        AbstractC16576j.C16578b.m30778a(this, "start to async load from cdn", null, null, 6);
        if (jVar.f39847o.length() == 0) {
            parse = apVar.f39754n;
        } else {
            parse = Uri.parse(jVar.f39847o);
        }
        C89219l.m154709a((Object) parse, "");
        m30311a(parse, false, jVar, (AbstractC89172b<? super C16361l, C89391z>) new C16306c(bVar, apVar, pVar, bVar2), (AbstractC89172b<? super Throwable, C89391z>) new C16307d(apVar, pVar, bVar2));
    }

    /* renamed from: a */
    private final void m30312a(String str, boolean z, C16667j jVar, AbstractC89172b<? super C16361l, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C16343g.C16345b.f39286a.mo25918a(getService()).f39836o.mo25877a(str, z, jVar, new C16303b(this, bVar, str, jVar, bVar2));
    }

    /* renamed from: a */
    private final void m30311a(Uri uri, boolean z, C16667j jVar, AbstractC89172b<? super C16361l, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            String str = "";
            if (hashCode != -1772600516) {
                if (hashCode != 3213448) {
                }
                String uri2 = uri.toString();
                C89219l.m154709a((Object) uri2, str);
                m30312a(uri2, z, jVar, bVar, bVar2);
                return;
            } else if (scheme.equals("lynxview")) {
                String queryParameter = uri.getQueryParameter("surl");
                if (queryParameter != null) {
                    str = queryParameter;
                }
                m30312a(str, z, jVar, bVar, bVar2);
                return;
            }
        }
        bVar2.invoke(new IllegalArgumentException("cdn Invalid URL"));
    }
}
