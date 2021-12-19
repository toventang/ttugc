package com.bytedance.p1436j.p1437a.p1443f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.lynx.tasm.provider.AbstractC28846d;
import com.lynx.tasm.provider.AbstractC28853k;
import com.lynx.tasm.provider.C28847e;
import com.lynx.tasm.provider.C28848f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.f.b */
public final class C20107b implements AbstractC28853k {

    /* renamed from: a */
    public final AbstractC16584o f47856a;

    static {
        Covode.recordClassIndex(23615);
    }

    public C20107b(AbstractC16584o oVar) {
        C89219l.m154719c(oVar, "");
        this.f47856a = oVar;
    }

    /* renamed from: com.bytedance.j.a.f.b$b */
    static final class C20109b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20107b f47861a;

        /* renamed from: b */
        final /* synthetic */ C28847e f47862b;

        /* renamed from: c */
        final /* synthetic */ AbstractC28846d f47863c;

        /* renamed from: d */
        final /* synthetic */ C28848f f47864d;

        static {
            Covode.recordClassIndex(23617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20109b(C20107b bVar, C28847e eVar, AbstractC28846d dVar, C28848f fVar) {
            super(1);
            this.f47861a = bVar;
            this.f47862b = eVar;
            this.f47863c = dVar;
            this.f47864d = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f47861a.f47856a.printLog("request " + this.f47862b.f68086a + " failed, " + th2.getMessage(), EnumC16586p.E, "DefaultLynxRequestProvider");
            AbstractC28846d dVar = this.f47863c;
            if (dVar != null) {
                dVar.onFailed(this.f47864d);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.j.a.f.b$a */
    static final class C20108a extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20107b f47857a;

        /* renamed from: b */
        final /* synthetic */ C28848f f47858b;

        /* renamed from: c */
        final /* synthetic */ AbstractC28846d f47859c;

        /* renamed from: d */
        final /* synthetic */ C28847e f47860d;

        static {
            Covode.recordClassIndex(23616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20108a(C20107b bVar, C28848f fVar, AbstractC28846d dVar, C28847e eVar) {
            super(1);
            this.f47857a = bVar;
            this.f47858b = fVar;
            this.f47859c = dVar;
            this.f47860d = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            try {
                this.f47858b.f68095d = apVar2.mo25913a();
                AbstractC28846d dVar = this.f47859c;
                if (dVar != null) {
                    dVar.onSuccess(this.f47858b);
                }
            } catch (Throwable th) {
                this.f47857a.f47856a.printLog("request " + this.f47860d.f68086a + " failed, " + th.getMessage(), EnumC16586p.E, "DefaultLynxRequestProvider");
                AbstractC28846d dVar2 = this.f47859c;
                if (dVar2 != null) {
                    dVar2.onFailed(this.f47858b);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.lynx.tasm.provider.AbstractC28853k
    /* renamed from: a */
    public final void mo33447a(C28847e eVar, AbstractC28846d dVar) {
        C89219l.m154719c(eVar, "");
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) this.f47856a.mo25790b_(IResourceLoaderService.class);
        C28848f fVar = new C28848f();
        if (iResourceLoaderService == null) {
            fVar.f68092a = -100;
            if (dVar != null) {
                dVar.onFailed(fVar);
            }
            this.f47856a.printLog("request " + eVar.f68086a + " failed, for no resourceLoader found", EnumC16586p.E, "DefaultLynxRequestProvider");
            return;
        }
        String str = eVar.f68086a;
        C89219l.m154709a((Object) str, "");
        C16667j jVar = new C16667j();
        jVar.mo26454d("sub_source");
        jVar.f39851s = this.f47856a;
        iResourceLoaderService.loadAsync(str, jVar, new C20108a(this, fVar, dVar, eVar), new C20109b(this, eVar, dVar, fVar));
    }
}
