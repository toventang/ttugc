package com.bytedance.lynx.hybrid.resource.p1530f;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.C21297g;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21292c;
import com.bytedance.lynx.hybrid.resource.p1535i.C21334c;
import com.bytedance.lynx.hybrid.service.IResourceService;
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

/* renamed from: com.bytedance.lynx.hybrid.resource.f.d */
public final class C21311d {

    /* renamed from: a */
    public boolean f50587a;

    /* renamed from: b */
    public boolean f50588b;

    /* renamed from: c */
    public IHybridResourceLoader f50589c;

    /* renamed from: d */
    private EnumC21292c f50590d;

    /* renamed from: e */
    private EnumC21292c f50591e;

    /* renamed from: f */
    private CountDownLatch f50592f;

    /* renamed from: g */
    private final List<Class<? extends IHybridResourceLoader>> f50593g;

    /* renamed from: h */
    private final IResourceService f50594h;

    static {
        Covode.recordClassIndex(24929);
    }

    /* renamed from: b */
    private final boolean m40025b() {
        if (this.f50590d == EnumC21292c.LOW || this.f50591e != EnumC21292c.LOW) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo34910a() {
        this.f50587a = true;
        CountDownLatch countDownLatch = this.f50592f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        IHybridResourceLoader iHybridResourceLoader = this.f50589c;
        if (iHybridResourceLoader != null) {
            iHybridResourceLoader.cancelLoad();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.resource.f.d$a */
    public static final class C21312a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21311d f50595a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f50596b;

        /* renamed from: c */
        final /* synthetic */ C21297g f50597c;

        /* renamed from: d */
        final /* synthetic */ Class f50598d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f50599e;

        /* renamed from: f */
        final /* synthetic */ IHybridResourceLoader f50600f;

        static {
            Covode.recordClassIndex(24930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21312a(C21311d dVar, AbstractC89172b bVar, C21297g gVar, Class cls, AbstractC89172b bVar2, IHybridResourceLoader iHybridResourceLoader) {
            super(1);
            this.f50595a = dVar;
            this.f50596b = bVar;
            this.f50597c = gVar;
            this.f50598d = cls;
            this.f50599e = bVar2;
            this.f50600f = iHybridResourceLoader;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            if (this.f50595a.f50587a) {
                this.f50596b.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else {
                this.f50597c.mo34906a(eVar2);
                C21294e eVar3 = this.f50597c.f50560b;
                String simpleName = this.f50598d.getSimpleName();
                C89219l.m154709a((Object) simpleName, "");
                eVar3.mo34904f(simpleName);
                this.f50599e.invoke(this.f50597c);
                JSONArray jSONArray = this.f50597c.f50560b.f50545l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, this.f50600f.getTAG());
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.resource.f.d$b */
    public static final class C21313b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21311d f50601a;

        /* renamed from: b */
        final /* synthetic */ C21297g f50602b;

        /* renamed from: c */
        final /* synthetic */ IHybridResourceLoader f50603c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f50604d;

        /* renamed from: e */
        final /* synthetic */ boolean f50605e;

        /* renamed from: f */
        final /* synthetic */ Iterator f50606f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89172b f50607g;

        /* renamed from: h */
        final /* synthetic */ C21334c f50608h;

        /* renamed from: i */
        final /* synthetic */ int f50609i;

        static {
            Covode.recordClassIndex(24931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21313b(C21311d dVar, C21297g gVar, IHybridResourceLoader iHybridResourceLoader, AbstractC89172b bVar, boolean z, Iterator it, AbstractC89172b bVar2, C21334c cVar, int i) {
            super(1);
            this.f50601a = dVar;
            this.f50602b = gVar;
            this.f50603c = iHybridResourceLoader;
            this.f50604d = bVar;
            this.f50605e = z;
            this.f50606f = it;
            this.f50607g = bVar2;
            this.f50608h = cVar;
            this.f50609i = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            C89219l.m154719c(th2, str);
            JSONArray jSONArray = this.f50602b.f50560b.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50603c.getTAG());
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            String message = th2.getMessage();
            if (message != null) {
                str = message;
            }
            C21210c.m39925a(str, (EnumC21209b) null, (String) null, 6);
            if (this.f50601a.f50587a) {
                this.f50604d.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else if (this.f50605e) {
                this.f50601a.mo34912a(this.f50602b, this.f50606f, this.f50607g, this.f50604d, this.f50608h, this.f50609i + 1);
            } else {
                this.f50604d.invoke(th2);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.lang.Class<? extends com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C21311d(List<? extends Class<? extends IHybridResourceLoader>> list, IResourceService iResourceService) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(iResourceService, "");
        this.f50593g = list;
        this.f50594h = iResourceService;
    }

    /* renamed from: a */
    public final void mo34911a(C21297g gVar, AbstractC89172b<? super C21297g, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        if (gVar.f50562d) {
            Iterator<Class<? extends IHybridResourceLoader>> it = this.f50593g.iterator();
            if (!it.hasNext()) {
                bVar2.invoke(new Throwable("ResourceLoaderChain# no processor for " + gVar.f50560b.f50546m));
                return;
            }
            mo34912a(gVar, it, bVar, bVar2, new C21334c(), 0);
        } else {
            m40024b(gVar, bVar, bVar2);
        }
        C21210c.m39925a("Load url = " + gVar.f50560b.f50546m + ", message = " + gVar.f50560b.f50545l, (EnumC21209b) null, (String) null, 6);
    }

    /* renamed from: b */
    private final void m40024b(C21297g gVar, AbstractC89172b<? super C21297g, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C21334c cVar = new C21334c();
        int i = 0;
        for (T t : this.f50593g) {
            try {
                this.f50591e = C21308a.m40021a(t);
                if (m40025b()) {
                    this.f50588b = true;
                    cVar.mo34935a();
                }
                this.f50590d = this.f50591e;
                IHybridResourceLoader iHybridResourceLoader = (IHybridResourceLoader) t.newInstance();
                iHybridResourceLoader.setService(this.f50594h);
                this.f50589c = iHybridResourceLoader;
                C21294e loadSync = iHybridResourceLoader.loadSync(gVar.f50560b, gVar.f50561c);
                if (loadSync == null) {
                    Throwable th = new Throwable(t.getCanonicalName() + " return null");
                    if (i == this.f50593g.size() - 1) {
                        bVar2.invoke(th);
                    }
                    C21210c.m39927a(th, (String) null, (String) null, 6);
                    if (this.f50587a) {
                        bVar2.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
                        return;
                    }
                    i++;
                } else {
                    gVar.mo34906a(loadSync);
                    C21294e eVar = gVar.f50560b;
                    String simpleName = t.getSimpleName();
                    C89219l.m154709a((Object) simpleName, "");
                    eVar.mo34904f(simpleName);
                    bVar.invoke(gVar);
                    return;
                }
            } catch (Throwable th2) {
                if (i == this.f50593g.size() - 1) {
                    bVar2.invoke(th2);
                }
                C21210c.m39925a("ResourceLoaderChain# onException " + th2.getMessage(), (EnumC21209b) null, (String) null, 6);
            }
        }
    }

    /* renamed from: a */
    public final void mo34912a(C21297g gVar, Iterator<? extends Class<? extends IHybridResourceLoader>> it, AbstractC89172b<? super C21297g, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2, C21334c cVar, int i) {
        int i2 = i;
        while (true) {
            Class cls = (Class) it.next();
            this.f50591e = C21308a.m40021a(cls);
            if (m40025b()) {
                this.f50588b = true;
                cVar.mo34935a();
            }
            this.f50590d = this.f50591e;
            boolean hasNext = it.hasNext();
            IHybridResourceLoader iHybridResourceLoader = (IHybridResourceLoader) cls.newInstance();
            iHybridResourceLoader.setService(this.f50594h);
            this.f50589c = iHybridResourceLoader;
            try {
                iHybridResourceLoader.loadAsync(gVar.f50560b, gVar.f50561c, new C21312a(this, bVar2, gVar, cls, bVar, iHybridResourceLoader), new C21313b(this, gVar, iHybridResourceLoader, bVar2, hasNext, it, bVar, cVar, i2));
                return;
            } catch (Throwable th) {
                C21210c.m39925a("ResourceLoaderChain# onException " + th.getMessage(), (EnumC21209b) null, (String) null, 6);
                if (hasNext) {
                    i2++;
                } else {
                    bVar2.invoke(new Throwable("ResourceLoaderChain# " + th.getMessage()));
                    return;
                }
            }
        }
    }
}
