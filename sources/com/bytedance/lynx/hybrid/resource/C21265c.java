package com.bytedance.lynx.hybrid.resource;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21291b;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import com.lynx.tasm.provider.AbstractC28846d;
import com.lynx.tasm.provider.AbstractC28853k;
import com.lynx.tasm.provider.C28847e;
import com.lynx.tasm.provider.C28848f;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.c */
public final class C21265c implements AbstractC28853k {
    static {
        Covode.recordClassIndex(24881);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.c$b */
    static final class C21267b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C28847e f50470a;

        /* renamed from: b */
        final /* synthetic */ AbstractC28846d f50471b;

        /* renamed from: c */
        final /* synthetic */ C28848f f50472c;

        static {
            Covode.recordClassIndex(24883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21267b(C28847e eVar, AbstractC28846d dVar, C28848f fVar) {
            super(1);
            this.f50470a = eVar;
            this.f50471b = dVar;
            this.f50472c = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            C21210c.m39924a("request " + this.f50470a.f68086a + " failed, " + th2.getMessage(), EnumC21209b.E, "DefaultLynxRequestProvider");
            AbstractC28846d dVar = this.f50471b;
            if (dVar != null) {
                dVar.onFailed(this.f50472c);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.c$a */
    static final class C21266a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C28848f f50467a;

        /* renamed from: b */
        final /* synthetic */ AbstractC28846d f50468b;

        /* renamed from: c */
        final /* synthetic */ C28847e f50469c;

        static {
            Covode.recordClassIndex(24882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21266a(C28848f fVar, AbstractC28846d dVar, C28847e eVar) {
            super(1);
            this.f50467a = fVar;
            this.f50468b = dVar;
            this.f50469c = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            InputStream inputStream;
            MethodCollector.m26663i(6983);
            C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            try {
                File b = eVar2.mo34902b();
                C28848f fVar = this.f50467a;
                if (b.exists()) {
                    inputStream = new FileInputStream(b);
                } else if (eVar2.f50553t != null) {
                    inputStream = eVar2.f50553t;
                } else {
                    inputStream = null;
                }
                fVar.f68095d = inputStream;
                AbstractC28846d dVar = this.f50468b;
                if (dVar != null) {
                    dVar.onSuccess(this.f50467a);
                }
            } catch (Throwable th) {
                C21210c.m39924a("request " + this.f50469c.f68086a + " failed, " + th.getMessage(), EnumC21209b.E, "DefaultLynxRequestProvider");
                AbstractC28846d dVar2 = this.f50468b;
                if (dVar2 != null) {
                    dVar2.onFailed(this.f50467a);
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(6983);
            return zVar;
        }
    }

    @Override // com.lynx.tasm.provider.AbstractC28853k
    /* renamed from: a */
    public final void mo33447a(C28847e eVar, AbstractC28846d dVar) {
        C89219l.m154719c(eVar, "");
        IResourceService iResourceService = (IResourceService) C21353c.C21354a.m40102a().mo34954a(IResourceService.class);
        C28848f fVar = new C28848f();
        if (iResourceService == null) {
            fVar.f68092a = -100;
            if (dVar != null) {
                dVar.onFailed(fVar);
            }
            C21210c.m39924a("request " + eVar.f68086a + " failed, for no resourceLoader found", EnumC21209b.E, "DefaultLynxRequestProvider");
            return;
        }
        String str = eVar.f68086a;
        C89219l.m154709a((Object) str, "");
        C21291b unused = iResourceService.loadAsync(str, new C21284j(), new C21266a(fVar, dVar, eVar), new C21267b(eVar, dVar, fVar));
    }
}
