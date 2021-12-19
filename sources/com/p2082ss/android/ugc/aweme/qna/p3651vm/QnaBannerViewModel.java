package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.api.C66006c;
import com.p2082ss.android.ugc.aweme.qna.api.C66011h;
import com.p2082ss.android.ugc.aweme.qna.p3646d.AbstractC66039d;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66040e;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel */
public final class QnaBannerViewModel extends AssemViewModel<C66360f> {

    /* renamed from: j */
    private final C12786i f149177j = new C12786i(true, new C66342a(this, null));

    /* renamed from: k */
    private final AbstractC89244h f149178k = C12646c.m22777a(this, C66347d.f149185a);

    static {
        Covode.recordClassIndex(77854);
    }

    /* renamed from: g */
    private final AbstractC12644a<AbstractC66039d> m117995g() {
        return (AbstractC12644a) this.f149178k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel$d */
    static final class C66347d extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC66039d>> {

        /* renamed from: a */
        public static final C66347d f149185a = new C66347d();

        static {
            Covode.recordClassIndex(77860);
        }

        C66347d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC66039d> invoke() {
            return new C66040e();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C66360f mo20674f() {
        return new C66360f();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel$a */
    public static final class C66342a extends AbstractC89220m implements AbstractC89171a<C66006c> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f149179a;

        /* renamed from: b */
        final /* synthetic */ String f149180b;

        static {
            Covode.recordClassIndex(77855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66342a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f149179a = assemViewModel;
            this.f149180b = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.qna.api.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.qna.api.C66006c invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f149179a
                com.bytedance.assem.arch.core.d r0 = r0.f31150d
                if (r0 == 0) goto L_0x0018
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f149179a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 != 0) goto L_0x000f
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x000f:
                java.lang.Class<com.ss.android.ugc.aweme.qna.api.c> r1 = com.p2082ss.android.ugc.aweme.qna.api.C66006c.class
                java.lang.String r0 = r3.f149180b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            L_0x0018:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "HierarchyData has not inject to "
                r1.<init>(r0)
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f149179a
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = ", you can't get hierarchyData"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel.C66342a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel$b */
    static final class C66343b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QnaBannerViewModel f149181a;

        static {
            Covode.recordClassIndex(77856);
        }

        C66343b(QnaBannerViewModel qnaBannerViewModel) {
            this.f149181a = qnaBannerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C66011h hVar = (C66011h) obj;
            this.f149181a.mo20662a(new AbstractC89172b<C66360f, C66360f>() {
                /* class com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel.C66343b.C663441 */

                static {
                    Covode.recordClassIndex(77857);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C66360f invoke(C66360f fVar) {
                    C89219l.m154721d(fVar, "");
                    return C66360f.m118018a(new C12792n(hVar), hVar.f148616f, hVar.f148617g, Boolean.valueOf(hVar.f148618h), hVar.f148615e);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel$c */
    static final class C66345c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QnaBannerViewModel f149183a;

        static {
            Covode.recordClassIndex(77858);
        }

        C66345c(QnaBannerViewModel qnaBannerViewModel) {
            this.f149183a = qnaBannerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            this.f149183a.mo20662a(new AbstractC89172b<C66360f, C66360f>() {
                /* class com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel.C66345c.C663461 */

                static {
                    Covode.recordClassIndex(77859);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C66360f invoke(C66360f fVar) {
                    C66360f fVar2 = fVar;
                    C89219l.m154721d(fVar2, "");
                    Throwable th = th;
                    C89219l.m154716b(th, "");
                    return C66360f.m118019a(fVar2, new C12785h(th), null, null, null, null, 30);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel$e */
    public static final class C66348e extends AbstractC89220m implements AbstractC89172b<C66360f, C66360f> {

        /* renamed from: a */
        final /* synthetic */ long f149186a;

        static {
            Covode.recordClassIndex(77861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66348e(long j) {
            super(1);
            this.f149186a = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C66360f invoke(C66360f fVar) {
            C66360f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C66360f.m118019a(fVar2, null, null, Long.valueOf(this.f149186a), null, null, 27);
        }
    }

    /* renamed from: a */
    public final void mo105256a(Long l, String str) {
        C89219l.m154721d(str, "");
        AbstractC88412b a = m117995g().mo20458a().mo105100a(l, str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C66343b(this), new C66345c(this));
        C89219l.m154716b(a, "");
        mo20659a(a);
    }
}
