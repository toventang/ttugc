package com.bytedance.p1436j.p1437a.p1443f;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1168e.C16638b;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
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

/* renamed from: com.bytedance.j.a.f.a */
public final class C20103a implements AbstractC28735a {

    /* renamed from: a */
    public final AbstractC16584o f47850a;

    /* renamed from: b */
    public final IResourceLoaderService f47851b;

    static {
        Covode.recordClassIndex(23611);
    }

    /* renamed from: com.bytedance.j.a.f.a$b */
    static final class C20106b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28735a.AbstractC28736a f47855a;

        static {
            Covode.recordClassIndex(23614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20106b(AbstractC28735a.AbstractC28736a aVar) {
            super(1);
            this.f47855a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f47855a.mo49849a(null, th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.j.a.f.a$a */
    static final class C20104a extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28735a.AbstractC28736a f47852a;

        static {
            Covode.recordClassIndex(23612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20104a(AbstractC28735a.AbstractC28736a aVar) {
            super(1);
            this.f47852a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            final C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            C1731i.m5636a(new Callable<C89391z>(this) {
                /* class com.bytedance.p1436j.p1437a.p1443f.C20103a.C20104a.CallableC201051 */

                /* renamed from: a */
                final /* synthetic */ C20104a f47853a;

                static {
                    Covode.recordClassIndex(23613);
                }

                {
                    this.f47853a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ C89391z call() {
                    MethodCollector.m26663i(10828);
                    try {
                        InputStream a = apVar2.mo25913a();
                        if (a != null) {
                            try {
                                InputStream inputStream = a;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                                    this.f47853a.f47852a.mo49849a(byteArrayOutputStream2.toByteArray(), null);
                                    C89146c.m154636a(byteArrayOutputStream, null);
                                    C89146c.m154636a(a, null);
                                } catch (Throwable th) {
                                    C89146c.m154636a(byteArrayOutputStream, th);
                                    MethodCollector.m26664o(10828);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                C89146c.m154636a(a, th);
                                MethodCollector.m26664o(10828);
                                throw th2;
                            }
                        } else {
                            this.f47853a.f47852a.mo49849a(null, new Throwable("ResourceLoader stream empty"));
                        }
                    } catch (Throwable th3) {
                        this.f47853a.f47852a.mo49849a(null, th3);
                    }
                    C89391z zVar = C89391z.f203057a;
                    MethodCollector.m26664o(10828);
                    return zVar;
                }
            }, C1731i.f5562a);
            return C89391z.f203057a;
        }
    }

    public C20103a(AbstractC16584o oVar, IResourceLoaderService iResourceLoaderService) {
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(iResourceLoaderService, "");
        this.f47850a = oVar;
        this.f47851b = iResourceLoaderService;
    }

    @Override // com.lynx.tasm.component.AbstractC28735a
    /* renamed from: a */
    public final void mo33445a(String str, AbstractC28735a.AbstractC28736a aVar) {
        if (str == null) {
            aVar.mo49849a(null, new Throwable("url is null"));
            return;
        }
        C16667j jVar = new C16667j();
        jVar.f39851s = this.f47850a;
        jVar.mo26454d("component");
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154709a((Object) parse, "");
            jVar.f39855w = new C16638b(parse);
            String queryParameter = parse.getQueryParameter("surl");
            if (queryParameter != null) {
                C89219l.m154709a((Object) queryParameter, "");
                jVar.mo26453c(queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("channel");
            if (queryParameter2 != null) {
                C89219l.m154709a((Object) queryParameter2, "");
                jVar.mo26451a(queryParameter2);
            }
            String queryParameter3 = parse.getQueryParameter("bundle");
            if (queryParameter3 != null) {
                C89219l.m154709a((Object) queryParameter3, "");
                jVar.mo26452b(queryParameter3);
            }
            jVar.f39842j = 1;
            String queryParameter4 = parse.getQueryParameter("dynamic");
            if (queryParameter4 != null) {
                C89219l.m154709a((Object) queryParameter4, "");
                jVar.f39842j = Integer.valueOf(Integer.parseInt(queryParameter4));
            }
        } catch (Throwable th) {
            this.f47850a.printReject(th, "DefaultDynamicComponentFetcher parse url error");
        }
        this.f47851b.loadAsync(str, jVar, new C20104a(aVar), new C20106b(aVar));
    }
}
