package com.bytedance.lynx.hybrid.resource.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public abstract class IHybridResourceLoader {
    private final String TAG;
    public IResourceService service;

    static {
        Covode.recordClassIndex(24892);
    }

    public abstract void cancelLoad();

    public abstract void loadAsync(C21294e eVar, C21284j jVar, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    public abstract C21294e loadSync(C21294e eVar, C21284j jVar);

    public String getTAG() {
        return this.TAG;
    }

    public final IResourceService getService() {
        IResourceService iResourceService = this.service;
        if (iResourceService == null) {
            C89219l.m154710a("service");
        }
        return iResourceService;
    }

    public IHybridResourceLoader() {
        String simpleName = getClass().getSimpleName();
        C89219l.m154709a((Object) simpleName, "");
        this.TAG = simpleName;
    }

    public final void setService(IResourceService iResourceService) {
        C89219l.m154719c(iResourceService, "");
        this.service = iResourceService;
    }
}
