package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.lynx.tasm.component.AbstractC28735a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.b */
public final class C21231b implements AbstractC28735a {

    /* renamed from: a */
    public final IResourceService f50390a;

    static {
        Covode.recordClassIndex(24847);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b$b */
    static final class C21234b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28735a.AbstractC28736a f50394a;

        static {
            Covode.recordClassIndex(24850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21234b(AbstractC28735a.AbstractC28736a aVar) {
            super(1);
            this.f50394a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f50394a.mo49849a(null, th2);
            return C89391z.f203057a;
        }
    }

    public C21231b(IResourceService iResourceService) {
        C89219l.m154719c(iResourceService, "");
        this.f50390a = iResourceService;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b$a */
    static final class C21232a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28735a.AbstractC28736a f50391a;

        static {
            Covode.recordClassIndex(24848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21232a(AbstractC28735a.AbstractC28736a aVar) {
            super(1);
            this.f50391a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            final C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            C1731i.m5636a(new Callable<C89391z>(this) {
                /* class com.bytedance.lynx.hybrid.resource.C21231b.C21232a.CallableC212331 */

                /* renamed from: a */
                final /* synthetic */ C21232a f50392a;

                static {
                    Covode.recordClassIndex(24849);
                }

                {
                    this.f50392a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ C89391z call() {
                    MethodCollector.m26663i(6836);
                    try {
                        InputStream a = eVar2.mo34899a();
                        if (a != null) {
                            try {
                                InputStream inputStream = a;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                                    this.f50392a.f50391a.mo49849a(byteArrayOutputStream2.toByteArray(), null);
                                    C89146c.m154636a(byteArrayOutputStream, null);
                                    C89146c.m154636a(a, null);
                                } catch (Throwable th) {
                                    C89146c.m154636a(byteArrayOutputStream, th);
                                    MethodCollector.m26664o(6836);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                C89146c.m154636a(a, th);
                                MethodCollector.m26664o(6836);
                                throw th2;
                            }
                        } else {
                            this.f50392a.f50391a.mo49849a(null, new Throwable("ResourceLoader stream empty"));
                        }
                    } catch (Throwable th3) {
                        this.f50392a.f50391a.mo49849a(null, th3);
                    }
                    C89391z zVar = C89391z.f203057a;
                    MethodCollector.m26664o(6836);
                    return zVar;
                }
            }, C1731i.f5562a);
            return C89391z.f203057a;
        }
    }

    @Override // com.lynx.tasm.component.AbstractC28735a
    /* renamed from: a */
    public final void mo33445a(String str, AbstractC28735a.AbstractC28736a aVar) {
        if (str == null) {
            aVar.mo49849a(null, new Throwable("url is null"));
            return;
        }
        C21284j jVar = new C21284j();
        jVar.mo34890d("component");
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("surl");
            if (queryParameter != null) {
                C89219l.m154709a((Object) queryParameter, "");
                jVar.mo34889c(queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("channel");
            if (queryParameter2 != null) {
                C89219l.m154709a((Object) queryParameter2, "");
                jVar.mo34887a(queryParameter2);
            }
            String queryParameter3 = parse.getQueryParameter("bundle");
            if (queryParameter3 != null) {
                C89219l.m154709a((Object) queryParameter3, "");
                jVar.mo34888b(queryParameter3);
            }
            jVar.f50514e = 1;
            String queryParameter4 = parse.getQueryParameter("dynamic");
            if (queryParameter4 != null) {
                C89219l.m154709a((Object) queryParameter4, "");
                jVar.f50514e = Integer.valueOf(Integer.parseInt(queryParameter4));
            }
        } catch (Throwable th) {
            C21210c.m39927a(th, "DefaultDynamicComponentFetcher parse url error", (String) null, 4);
        }
        this.f50390a.loadAsync(str, jVar, new C21232a(aVar), new C21234b(aVar));
    }
}
