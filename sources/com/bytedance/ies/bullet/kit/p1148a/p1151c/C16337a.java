package com.bytedance.ies.bullet.kit.p1148a.p1151c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16348h;
import com.bytedance.ies.bullet.kit.p1148a.C16365p;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.kakao.usermgmt.StringSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.c.a */
public final class C16337a implements AbstractC16576j {

    /* renamed from: a */
    public int f39248a;

    /* renamed from: b */
    public int f39249b = -1;

    /* renamed from: c */
    public boolean f39250c;

    /* renamed from: d */
    public boolean f39251d;

    /* renamed from: e */
    public IXResourceLoader f39252e;

    /* renamed from: f */
    private CountDownLatch f39253f;

    /* renamed from: g */
    private final List<Class<? extends IXResourceLoader>> f39254g;

    /* renamed from: h */
    private final C16587q f39255h;

    /* renamed from: i */
    private final IResourceLoaderService f39256i;

    static {
        Covode.recordClassIndex(18630);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return this.f39255h;
    }

    /* renamed from: a */
    public final void mo25910a() {
        this.f39250c = true;
        CountDownLatch countDownLatch = this.f39253f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        IXResourceLoader iXResourceLoader = this.f39252e;
        if (iXResourceLoader != null) {
            iXResourceLoader.cancelLoad();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.a.c.a$a */
    public static final class C16338a extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16337a f39257a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f39258b;

        /* renamed from: c */
        final /* synthetic */ C16348h f39259c;

        /* renamed from: d */
        final /* synthetic */ Class f39260d;

        /* renamed from: e */
        final /* synthetic */ C16365p f39261e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f39262f;

        /* renamed from: g */
        final /* synthetic */ IXResourceLoader f39263g;

        static {
            Covode.recordClassIndex(18631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16338a(C16337a aVar, AbstractC89172b bVar, C16348h hVar, Class cls, C16365p pVar, AbstractC89172b bVar2, IXResourceLoader iXResourceLoader) {
            super(1);
            this.f39257a = aVar;
            this.f39258b = bVar;
            this.f39259c = hVar;
            this.f39260d = cls;
            this.f39261e = pVar;
            this.f39262f = bVar2;
            this.f39263g = iXResourceLoader;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            JSONObject jSONObject;
            C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            if (this.f39257a.f39250c) {
                this.f39258b.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else {
                this.f39259c.mo25919a(apVar2);
                C16610ap apVar3 = this.f39259c.f39290b;
                String simpleName = this.f39260d.getSimpleName();
                C89219l.m154709a((Object) simpleName, "");
                apVar3.mo26375f(simpleName);
                if (this.f39257a.f39251d && (jSONObject = this.f39259c.f39290b.f39752l.f39743h) != null) {
                    jSONObject.put("l_total", this.f39261e.mo25949a());
                }
                this.f39262f.invoke(this.f39259c);
                JSONArray jSONArray = this.f39259c.f39290b.f39753m;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringSet.name, this.f39263g.getTAG());
                jSONObject2.put("status", "success");
                jSONArray.put(jSONObject2);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.a.c.a$b */
    public static final class C16339b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16337a f39264a;

        /* renamed from: b */
        final /* synthetic */ C16348h f39265b;

        /* renamed from: c */
        final /* synthetic */ IXResourceLoader f39266c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f39267d;

        /* renamed from: e */
        final /* synthetic */ boolean f39268e;

        /* renamed from: f */
        final /* synthetic */ Iterator f39269f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89172b f39270g;

        /* renamed from: h */
        final /* synthetic */ C16365p f39271h;

        /* renamed from: i */
        final /* synthetic */ int f39272i;

        static {
            Covode.recordClassIndex(18632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16339b(C16337a aVar, C16348h hVar, IXResourceLoader iXResourceLoader, AbstractC89172b bVar, boolean z, Iterator it, AbstractC89172b bVar2, C16365p pVar, int i) {
            super(1);
            this.f39264a = aVar;
            this.f39265b = hVar;
            this.f39266c = iXResourceLoader;
            this.f39267d = bVar;
            this.f39268e = z;
            this.f39269f = it;
            this.f39270g = bVar2;
            this.f39271h = pVar;
            this.f39272i = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            JSONObject jSONObject;
            Throwable th2 = th;
            String str = "";
            C89219l.m154719c(th2, str);
            JSONArray jSONArray = this.f39265b.f39290b.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f39266c.getTAG());
            jSONObject2.put("status", "fail");
            jSONObject2.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject2);
            C16337a aVar = this.f39264a;
            String message = th2.getMessage();
            if (message != null) {
                str = message;
            }
            AbstractC16576j.C16578b.m30778a(aVar, str, null, null, 6);
            if (this.f39264a.f39250c) {
                this.f39267d.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else if (this.f39268e) {
                this.f39264a.mo25912a(this.f39265b, this.f39269f, this.f39270g, this.f39267d, this.f39271h, this.f39272i + 1);
            } else {
                if (this.f39264a.f39251d && (jSONObject = this.f39265b.f39290b.f39752l.f39743h) != null) {
                    jSONObject.put("l_total", this.f39271h.mo25949a());
                }
                this.f39267d.invoke(th2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16337a(List<? extends Class<? extends IXResourceLoader>> list, C16587q qVar, IResourceLoaderService iResourceLoaderService) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(qVar, "");
        C89219l.m154719c(iResourceLoaderService, "");
        this.f39254g = list;
        this.f39255h = qVar;
        this.f39256i = iResourceLoaderService;
    }

    /* renamed from: a */
    public final void mo25911a(C16348h hVar, AbstractC89172b<? super C16348h, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        if (hVar.f39289a) {
            Iterator<Class<? extends IXResourceLoader>> it = this.f39254g.iterator();
            if (!it.hasNext()) {
                bVar2.invoke(new Throwable("ResourceLoaderChain# no processor for " + hVar.f39290b.f39754n));
                return;
            }
            mo25912a(hVar, it, bVar, bVar2, new C16365p(), 0);
        } else {
            m30345b(hVar, bVar, bVar2);
        }
        AbstractC16576j.C16578b.m30778a(this, "Load url = " + hVar.f39290b.f39754n + ", message = " + hVar.f39290b.f39753m, null, null, 6);
    }

    /* renamed from: b */
    private final void m30345b(C16348h hVar, AbstractC89172b<? super C16348h, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        C16365p pVar = new C16365p();
        int i = 0;
        for (T t : this.f39254g) {
            try {
                if (i == this.f39248a && (jSONObject4 = hVar.f39290b.f39752l.f39743h) != null) {
                    jSONObject4.put("h_total", pVar.mo25949a());
                }
                if (i == this.f39249b) {
                    pVar.mo25949a();
                    this.f39251d = true;
                }
                IXResourceLoader iXResourceLoader = (IXResourceLoader) t.newInstance();
                iXResourceLoader.setService(this.f39256i);
                iXResourceLoader.setLoaderLogger(getLoggerWrapper());
                this.f39252e = iXResourceLoader;
                C16610ap loadSync = iXResourceLoader.loadSync(hVar.f39290b, hVar.f39291c);
                if (loadSync == null) {
                    Throwable th = new Throwable(C89219l.m154704a(t.getCanonicalName(), (Object) " return null"));
                    if (i == this.f39254g.size() - 1) {
                        if (this.f39251d && (jSONObject3 = hVar.f39290b.f39752l.f39743h) != null) {
                            jSONObject3.put("l_total", pVar.mo25949a());
                        }
                        bVar2.invoke(th);
                    }
                    printReject(th, "");
                    if (this.f39250c) {
                        bVar2.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
                        return;
                    }
                    i++;
                } else {
                    hVar.mo25919a(loadSync);
                    C16610ap apVar = hVar.f39290b;
                    String simpleName = t.getSimpleName();
                    C89219l.m154709a((Object) simpleName, "");
                    apVar.mo26375f(simpleName);
                    if (this.f39251d && (jSONObject2 = hVar.f39290b.f39752l.f39743h) != null) {
                        jSONObject2.put("l_total", pVar.mo25949a());
                    }
                    bVar.invoke(hVar);
                    return;
                }
            } catch (Throwable th2) {
                if (i == this.f39254g.size() - 1) {
                    if (this.f39251d && (jSONObject = hVar.f39290b.f39752l.f39743h) != null) {
                        jSONObject.put("l_total", pVar.mo25949a());
                    }
                    bVar2.invoke(th2);
                }
                AbstractC16576j.C16578b.m30778a(this, "ResourceLoaderChain# onException " + th2.getMessage(), null, null, 6);
            }
        }
    }

    /* renamed from: a */
    public final void mo25912a(C16348h hVar, Iterator<? extends Class<? extends IXResourceLoader>> it, AbstractC89172b<? super C16348h, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2, C16365p pVar, int i) {
        boolean z;
        Throwable th;
        JSONObject jSONObject;
        int i2 = i;
        while (true) {
            Class cls = (Class) it.next();
            boolean hasNext = it.hasNext();
            IXResourceLoader iXResourceLoader = (IXResourceLoader) cls.newInstance();
            iXResourceLoader.setService(this.f39256i);
            iXResourceLoader.setLoaderLogger(getLoggerWrapper());
            this.f39252e = iXResourceLoader;
            try {
                if (i2 == this.f39248a && (jSONObject = hVar.f39290b.f39752l.f39743h) != null) {
                    jSONObject.put("h_total", pVar.mo25949a());
                }
                if (i2 == this.f39249b) {
                    this.f39251d = true;
                    pVar.mo25949a();
                }
                C16610ap apVar = hVar.f39290b;
                C16667j jVar = hVar.f39291c;
                C16338a aVar = new C16338a(this, bVar2, hVar, cls, pVar, bVar, iXResourceLoader);
                z = hasNext;
                try {
                    iXResourceLoader.loadAsync(apVar, jVar, aVar, new C16339b(this, hVar, iXResourceLoader, bVar2, hasNext, it, bVar, pVar, i2));
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z = hasNext;
                AbstractC16576j.C16578b.m30778a(this, "ResourceLoaderChain# onException " + th.getMessage(), null, null, 6);
                if (z) {
                    i2++;
                } else {
                    bVar2.invoke(new Throwable("ResourceLoaderChain# " + th.getMessage()));
                    return;
                }
            }
            i2++;
        }
    }
}
