package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.framework.services.ExtentionKt */
public final class ExtentionKt {
    static {
        Covode.recordClassIndex(60662);
    }

    public static final /* synthetic */ <T> T getService(AbstractC89277c<T> cVar) {
        C89219l.m154719c(cVar, "");
        ServiceManager serviceManager = ServiceManager.get();
        C89219l.m154718c();
        return (T) serviceManager.getService(Object.class);
    }

    public static final /* synthetic */ <T> Set<T> getServices(AbstractC89277c<T> cVar) {
        C89219l.m154719c(cVar, "");
        ServiceManager serviceManager = ServiceManager.get();
        C89219l.m154718c();
        Set<T> services = serviceManager.getServices(Object.class);
        C89219l.m154709a((Object) services, "");
        return services;
    }

    public static final /* synthetic */ <T> T getService(Class<T> cls) {
        C89219l.m154719c(cls, "");
        ServiceManager serviceManager = ServiceManager.get();
        C89219l.m154718c();
        return (T) serviceManager.getService(Object.class);
    }

    public static final /* synthetic */ <T> Set<T> getServices(Class<T> cls) {
        C89219l.m154719c(cls, "");
        ServiceManager serviceManager = ServiceManager.get();
        C89219l.m154718c();
        Set<T> services = serviceManager.getServices(Object.class);
        C89219l.m154709a((Object) services, "");
        return services;
    }
}
