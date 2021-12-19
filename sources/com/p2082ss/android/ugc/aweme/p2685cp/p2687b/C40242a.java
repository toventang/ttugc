package com.p2082ss.android.ugc.aweme.p2685cp.p2687b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1362a.AbstractC18943a;
import com.bytedance.ies.xelement.p1362a.C18945c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cp.b.a */
public final class C40242a implements AbstractC18943a<C18945c> {

    /* renamed from: a */
    private final C21284j f94451a;

    static {
        Covode.recordClassIndex(48043);
    }

    public C40242a(C21284j jVar) {
        C89219l.m154721d(jVar, "");
        this.f94451a = jVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.a$b */
    static final class C40244b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f94455a;

        static {
            Covode.recordClassIndex(48045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40244b(AbstractC89183m mVar) {
            super(1);
            this.f94455a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f94455a.invoke(th, false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.a$a */
    static final class C40243a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C40242a f94452a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f94453b;

        /* renamed from: c */
        final /* synthetic */ String f94454c;

        static {
            Covode.recordClassIndex(48044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40243a(C40242a aVar, AbstractC89172b bVar, String str) {
            super(1);
            this.f94452a = aVar;
            this.f94453b = bVar;
            this.f94454c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0032  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.lynx.hybrid.resource.p1528d.C21294e r8) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2685cp.p2687b.C40242a.C40243a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.ies.xelement.p1362a.AbstractC18943a
    /* renamed from: a */
    public final void mo30064a(String str, AbstractC89172b<? super C18945c, C89391z> bVar, AbstractC89183m<? super Throwable, ? super Boolean, C89391z> mVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(mVar, "");
        IResourceService iResourceService = (IResourceService) C21353c.C21354a.m40102a().mo34954a(IResourceService.class);
        if (iResourceService == null) {
            mVar.invoke(new Throwable("resource loader is null"), false);
        } else {
            iResourceService.loadAsync(str, this.f94451a, new C40243a(this, bVar, str), new C40244b(mVar));
        }
    }
}
