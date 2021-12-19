package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoPublishActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.viewmodel.VideoPublishViewModel;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ae */
public final class C73942ae {
    static {
        Covode.recordClassIndex(86692);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ae$a */
    public static final class C73943a extends AbstractC89220m implements AbstractC89172b<C20524n<Boolean, Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f166019a;

        static {
            Covode.recordClassIndex(86693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73943a(AbstractC89183m mVar) {
            super(1);
            this.f166019a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20524n<Boolean, Boolean> nVar) {
            C20524n<Boolean, Boolean> nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            this.f166019a.invoke(nVar2.f48283b.getFirst(), nVar2.f48283b.getSecond());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ae$b */
    public static final class C73944b extends AbstractC89220m implements AbstractC89172b<C20524n<Boolean, Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f166020a;

        static {
            Covode.recordClassIndex(86694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73944b(AbstractC89183m mVar) {
            super(1);
            this.f166020a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20524n<Boolean, Boolean> nVar) {
            C20524n<Boolean, Boolean> nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            this.f166020a.invoke(nVar2.f48283b.getFirst(), nVar2.f48283b.getSecond());
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m130037a(VideoPublishActivity videoPublishActivity, AbstractC89183m<? super Boolean, ? super Boolean, C89391z> mVar) {
        C89219l.m154721d(videoPublishActivity, "");
        C89219l.m154721d(mVar, "");
        JediViewModel a = C20531t.m38716a(videoPublishActivity).mo33800a(VideoPublishViewModel.class);
        C89219l.m154716b(a, "");
        AbstractC88412b unused = ((VideoPublishViewModel) a).mo33677a(videoPublishActivity, C73945af.f166021a, new C20370ah(), new C73943a(mVar));
    }

    /* renamed from: b */
    public static final void m130038b(VideoPublishActivity videoPublishActivity, AbstractC89183m<? super Boolean, ? super Boolean, C89391z> mVar) {
        C89219l.m154721d(videoPublishActivity, "");
        C89219l.m154721d(mVar, "");
        JediViewModel a = C20531t.m38716a(videoPublishActivity).mo33800a(VideoPublishViewModel.class);
        C89219l.m154716b(a, "");
        AbstractC88412b unused = ((VideoPublishViewModel) a).mo33677a(videoPublishActivity, C73946ag.f166022a, new C20370ah(), new C73944b(mVar));
    }
}
