package com.bytedance.lynx.hybrid.resource;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21156j;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.C21303f;
import com.bytedance.lynx.hybrid.resource.C21337l;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21279e;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1527c.C21268a;
import com.bytedance.lynx.hybrid.resource.p1528d.C21291b;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.C21297g;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21292c;
import com.bytedance.lynx.hybrid.resource.p1530f.C21308a;
import com.bytedance.lynx.hybrid.resource.p1530f.C21309b;
import com.bytedance.lynx.hybrid.resource.p1530f.C21311d;
import com.bytedance.lynx.hybrid.resource.p1534h.C21325b;
import com.bytedance.lynx.hybrid.resource.p1534h.C21326c;
import com.bytedance.lynx.hybrid.resource.p1535i.C21334c;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21356d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.lynx.hybrid.resource.g */
public final class C21314g extends C21356d implements IResourceService {

    /* renamed from: a */
    public final Application f50610a;

    /* renamed from: c */
    private C21277c f50611c;

    /* renamed from: d */
    private AtomicBoolean f50612d = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(24932);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void deleteResource(C21294e eVar) {
        C89219l.m154719c(eVar, "");
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final C21277c getResourceConfig() {
        C21277c cVar = this.f50611c;
        if (cVar == null) {
            C89219l.m154710a("mConfigHybrid");
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r0 == null) goto L_0x002a;
     */
    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> getPreloadConfigs() {
        /*
            r3 = this;
            com.bytedance.lynx.hybrid.resource.config.c r1 = r3.f50611c
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "mConfigHybrid"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0009:
            com.bytedance.lynx.hybrid.resource.config.GeckoConfig r0 = r1.f50503j
            java.lang.String r2 = r0.getAccessKey()
            com.bytedance.lynx.hybrid.resource.f r1 = com.bytedance.lynx.hybrid.resource.C21303f.C21305b.f50578a
            r0 = r3
            com.bytedance.lynx.hybrid.resource.config.c r0 = r1.mo34909a(r0)
            com.bytedance.lynx.hybrid.resource.config.GeckoConfig r0 = com.bytedance.lynx.hybrid.resource.p1526b.C21263f.m39966a(r0, r2)
            com.bytedance.lynx.hybrid.resource.config.e r1 = r0.getGeckoDepender()
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = r0.getOfflineDir()
            java.util.Map r0 = r1.mo34881a(r0, r2)
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            p4600h.p4611f.p4613b.C89219l.m154707a()
        L_0x002d:
            return r0
        L_0x002e:
            r0 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.C21314g.getPreloadConfigs():java.util.Map");
    }

    @Override // com.bytedance.lynx.hybrid.service.p1537b.C21356d, com.bytedance.lynx.hybrid.service.p1536a.AbstractC21348a
    /* renamed from: u_ */
    public final void mo34922u_() {
        C21303f fVar = C21303f.C21305b.f50578a;
        C89219l.m154719c(this, "");
        fVar.f50575a.remove(this);
        Map<C21291b, C21311d> map = C21337l.f50674c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<C21291b, C21311d> entry : map.entrySet()) {
            entry.getValue().mo34910a();
            arrayList.add(C89391z.f203057a);
        }
        C21337l.f50674c.clear();
    }

    public C21314g(Application application) {
        C89219l.m154719c(application, "");
        this.f50610a = application;
        C21303f.C21305b.f50578a.f50576b = application;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void cancel(C21291b bVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar, "");
        C21311d dVar = C21337l.f50674c.get(bVar);
        if (dVar != null) {
            dVar.mo34910a();
        }
        C21337l.f50674c.remove(bVar);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void unRegisterConfig(String str) {
        C89219l.m154719c(str, "");
        C21277c cVar = this.f50611c;
        if (cVar == null) {
            C89219l.m154710a("mConfigHybrid");
        }
        cVar.f50504k.remove(str);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void init(AbstractC21156j jVar) {
        C21277c cVar;
        C89219l.m154719c(jVar, "");
        if (!this.f50612d.compareAndSet(false, true)) {
            C21210c.m39925a("init# service is already init", (EnumC21209b) null, (String) null, 6);
        } else if ((jVar instanceof C21277c) && jVar != null && (cVar = (C21277c) jVar) != null) {
            C21268a aVar = C21268a.C21270b.f50477a;
            int i = cVar.f50496c;
            if (aVar.f50474a == null && i > 0) {
                aVar.f50474a = new C21268a.C21271c(i, i);
            }
            C21303f fVar = C21303f.C21305b.f50578a;
            C89219l.m154719c(this, "");
            C89219l.m154719c(cVar, "");
            fVar.f50575a.put(this, cVar);
            this.f50611c = cVar;
            registerConfig(cVar.f50503j.getAccessKey(), cVar.f50503j);
            C21210c.m39925a("init globalConfig = ".concat(String.valueOf(cVar)), (EnumC21209b) null, (String) null, 6);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void unregisterCustomLoader(Class<? extends IHybridResourceLoader> cls, EnumC21292c cVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cVar, "");
        int i = C21342m.f50692b[cVar.ordinal()];
        if (i == 1) {
            C21337l.f50672a.remove(cls);
        } else if (i == 2) {
            C21337l.f50673b.remove(cls);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void registerConfig(String str, GeckoConfig geckoConfig) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(geckoConfig, "");
        AbstractC21279e geckoDepender = geckoConfig.getGeckoDepender();
        if (geckoDepender == null) {
            C89219l.m154707a();
        }
        geckoDepender.mo34883a(this);
        C21277c cVar = this.f50611c;
        if (cVar == null) {
            C89219l.m154710a("mConfigHybrid");
        }
        cVar.f50504k.put(str, geckoConfig);
        if (geckoConfig.getNetworkImpl() != null) {
            return;
        }
        if (geckoConfig.getLocalInfo().length() > 0) {
            C21277c cVar2 = this.f50611c;
            if (cVar2 == null) {
                C89219l.m154710a("mConfigHybrid");
            }
            geckoConfig.setNetworkImpl(cVar2.f50505l);
            return;
        }
        C21277c cVar3 = this.f50611c;
        if (cVar3 == null) {
            C89219l.m154710a("mConfigHybrid");
        }
        geckoConfig.setNetworkImpl(cVar3.f50506m);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void registerCustomLoader(Class<? extends IHybridResourceLoader> cls, EnumC21292c cVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cVar, "");
        int i = C21342m.f50691a[cVar.ordinal()];
        if (i != 1) {
            if (i == 2 && !C21337l.f50673b.contains(cls)) {
                C21337l.f50673b.add(cls);
                C21308a.m40022a(cls, EnumC21292c.LOW);
            }
        } else if (!C21337l.f50672a.contains(cls)) {
            C21337l.f50672a.add(cls);
            C21308a.m40022a(cls, EnumC21292c.HIGH);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final C21294e loadSync(String str, C21284j jVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(jVar, "");
        C21210c.m39925a("loadSync# url=" + str + ",taskConfig=" + jVar, (EnumC21209b) null, (String) null, 6);
        if (!this.f50612d.get()) {
            C21210c.m39925a("call loadSync# but not init ", (EnumC21209b) null, (String) null, 6);
            return null;
        }
        C89219l.m154719c(this, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(jVar, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        new C21334c();
        C21210c.m39925a("loadSync# url=" + str + ",taskConfig=" + jVar, (EnumC21209b) null, (String) null, 6);
        Uri parse = Uri.parse(str);
        C89219l.m154709a((Object) parse, "");
        if (!C21325b.m40065a(parse)) {
            return null;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        C21297g a = C21326c.f50641a.mo34930a(false, uptimeMillis, str, parse, jVar, this);
        C21311d a2 = C21309b.m40023a(this, a);
        C21210c.m39925a("loadSync# start load taskConfig=" + jVar + ",resInfo = " + a.f50560b, (EnumC21209b) null, (String) null, 6);
        a2.mo34911a(a, new C21337l.C21340c(eVar, jVar, a), new C21337l.C21341d(str, a, jVar));
        String jSONArray = a.f50560b.f50545l.toString();
        C89219l.m154709a((Object) jSONArray, "");
        jVar.mo34891e(jSONArray);
        String jSONArray2 = a.f50560b.f50545l.toString();
        C89219l.m154709a((Object) jSONArray2, "");
        C21210c.m39925a(jSONArray2, (EnumC21209b) null, (String) null, 6);
        return eVar.element;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final C21291b loadAsync(String str, C21284j jVar, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        Uri parse = Uri.parse(str);
        C89219l.m154709a((Object) parse, "");
        C21291b bVar3 = new C21291b(parse);
        if (!this.f50612d.get()) {
            C21210c.m39925a("call loadAsync# but not init ", (EnumC21209b) null, (String) null, 6);
            bVar2.invoke(new Throwable("resource loader service not init"));
            return bVar3;
        }
        C89219l.m154719c(this, "");
        C89219l.m154719c(bVar3, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        C21210c.m39925a("loadAsync#begin", (EnumC21209b) null, (String) null, 6);
        long uptimeMillis = SystemClock.uptimeMillis();
        Uri uri = bVar3.f50538a;
        C21334c cVar = new C21334c();
        if (!C21325b.m40065a(uri)) {
            bVar2.invoke(new Throwable("is not hierarchical url"));
            return bVar3;
        }
        C21297g a = C21326c.f50641a.mo34930a(true, uptimeMillis, str, uri, jVar, this);
        C21311d a2 = C21309b.m40023a(this, a);
        a2.mo34911a(a, new C21337l.C21338a(bVar3, cVar, jVar, a, bVar), new C21337l.C21339b(a, bVar3, jVar, bVar2));
        C21337l.f50674c.put(bVar3, a2);
        return bVar3;
    }
}
