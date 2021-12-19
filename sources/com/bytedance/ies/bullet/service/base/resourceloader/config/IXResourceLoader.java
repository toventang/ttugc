package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public abstract class IXResourceLoader implements AbstractC16576j {
    private final String TAG;
    private C16587q loaderLogger;
    public IResourceLoaderService service;

    static {
        Covode.recordClassIndex(19096);
    }

    public abstract void cancelLoad();

    public abstract void loadAsync(C16610ap apVar, C16667j jVar, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    public abstract C16610ap loadSync(C16610ap apVar, C16667j jVar);

    public final C16587q getLoaderLogger() {
        return this.loaderLogger;
    }

    public String getTAG() {
        return this.TAG;
    }

    public final IResourceLoaderService getService() {
        IResourceLoaderService iResourceLoaderService = this.service;
        if (iResourceLoaderService == null) {
            C89219l.m154710a("service");
        }
        return iResourceLoaderService;
    }

    public IXResourceLoader() {
        String simpleName = getClass().getSimpleName();
        C89219l.m154709a((Object) simpleName, "");
        this.TAG = simpleName;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public C16587q getLoggerWrapper() {
        C16587q qVar = this.loaderLogger;
        if (qVar != null) {
            return qVar;
        }
        IResourceLoaderService iResourceLoaderService = this.service;
        if (iResourceLoaderService != null) {
            return ((C16616a) iResourceLoaderService).getLoggerWrapper();
        }
        C89219l.m154710a("service");
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void setLoaderLogger(C16587q qVar) {
        this.loaderLogger = qVar;
    }

    public final void setService(IResourceLoaderService iResourceLoaderService) {
        C89219l.m154719c(iResourceLoaderService, "");
        this.service = iResourceLoaderService;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }
}
