package com.bytedance.lynx.hybrid;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21291b;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import com.lynx.tasm.provider.AbstractC28843b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p4600h.C89391z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.o */
public final class C21226o extends AbstractC28843b {
    static {
        Covode.recordClassIndex(24842);
    }

    /* renamed from: com.bytedance.lynx.hybrid.o$b */
    static final class C21228b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28843b.AbstractC28844a f50387a;

        static {
            Covode.recordClassIndex(24844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21228b(AbstractC28843b.AbstractC28844a aVar) {
            super(1);
            this.f50387a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            AbstractC28843b.AbstractC28844a aVar = this.f50387a;
            if (aVar != null) {
                aVar.mo48671a("template load error, " + th2.getMessage());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.o$a */
    static final class C21227a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28843b.AbstractC28844a f50386a;

        static {
            Covode.recordClassIndex(24843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21227a(AbstractC28843b.AbstractC28844a aVar) {
            super(1);
            this.f50386a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            InputStream inputStream;
            MethodCollector.m26663i(7453);
            C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            try {
                File b = eVar2.mo34902b();
                if (b.exists()) {
                    inputStream = new FileInputStream(b);
                } else if (eVar2.f50553t != null) {
                    inputStream = eVar2.f50553t;
                } else {
                    inputStream = null;
                }
                if (inputStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                        long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                        AbstractC28843b.AbstractC28844a aVar = this.f50386a;
                        if (aVar != null) {
                            aVar.mo48672a(byteArrayOutputStream2.toByteArray());
                        }
                        C89146c.m154636a(byteArrayOutputStream, null);
                    } catch (Throwable th) {
                        C89146c.m154636a(byteArrayOutputStream, th);
                        MethodCollector.m26664o(7453);
                        throw th;
                    }
                } else {
                    AbstractC28843b.AbstractC28844a aVar2 = this.f50386a;
                    if (aVar2 != null) {
                        aVar2.mo48671a("file not found");
                    }
                }
            } catch (Throwable th2) {
                AbstractC28843b.AbstractC28844a aVar3 = this.f50386a;
                if (aVar3 != null) {
                    aVar3.mo48671a("stream write error, " + th2.getMessage());
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7453);
            return zVar;
        }
    }

    @Override // com.lynx.tasm.provider.AbstractC28843b
    /* renamed from: a */
    public final void mo33448a(String str, AbstractC28843b.AbstractC28844a aVar) {
        C89219l.m154719c(str, "");
        IResourceService iResourceService = (IResourceService) C21353c.C21354a.m40102a().mo34954a(IResourceService.class);
        if (iResourceService != null) {
            C21291b unused = iResourceService.loadAsync(str, new C21284j(), new C21227a(aVar), new C21228b(aVar));
        } else if (aVar != null) {
            aVar.mo48671a("ResourceLoader Not Found!");
        }
    }
}
