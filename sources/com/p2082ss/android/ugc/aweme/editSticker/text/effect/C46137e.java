package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.C41091e;
import com.p2082ss.android.ugc.aweme.editSticker.C45849b;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45850a;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45870c;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45884c;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46079a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46091h;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.e */
public final class C46137e<T extends C45850a> extends AbstractC46129a {

    /* renamed from: a */
    public final AbstractC41088b<T, Void> f107414a;

    /* renamed from: b */
    public final AbstractC89183m<T, AbstractC89124d<? super C89391z>, Object> f107415b;

    /* renamed from: c */
    public final AbstractC41086b<T, Void> f107416c;

    /* renamed from: d */
    private final AbstractC89244h f107417d = C89250i.m154773a((AbstractC89171a) C46138a.f107418a);

    static {
        Covode.recordClassIndex(54696);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.e$a */
    static final class C46138a extends AbstractC89220m implements AbstractC89171a<AbstractC89516am> {

        /* renamed from: a */
        public static final C46138a f107418a = new C46138a();

        static {
            Covode.recordClassIndex(54697);
        }

        C46138a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89516am invoke() {
            return C45884c.m88525a();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener, com.p2082ss.android.ugc.aweme.editSticker.text.effect.AbstractC46129a
    public final void onSuccessed(DownloadInfo downloadInfo) {
        AbstractC89568bz unused = C89624i.m155555a((AbstractC89516am) this.f107417d.getValue(), null, null, new C46139b(this, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.e$b */
    static final class C46139b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f107419a;

        /* renamed from: b */
        final /* synthetic */ C46137e f107420b;

        static {
            Covode.recordClassIndex(54698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46139b(C46137e eVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f107420b = eVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46139b(this.f107420b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46139b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46137e.C46139b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener, com.p2082ss.android.ugc.aweme.editSticker.text.effect.AbstractC46129a
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        AbstractC45870c cVar;
        this.f107414a.mo70302a(4);
        AbstractC41088b<T, Void> bVar = this.f107414a;
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        bVar.f96048f = new C41091e(-1, str, baseException);
        this.f107416c.mo70294c(this.f107414a);
        Param param = this.f107414a.f96050h;
        if (param instanceof C46079a) {
            AbstractC45870c cVar2 = C45849b.f106805c;
            if (cVar2 != null) {
                cVar2.mo77228a(baseException, this.f107414a.f96050h.f106810b.getEffectId());
            }
        } else if ((param instanceof C46091h) && (cVar = C45849b.f106805c) != null) {
            cVar.mo77230b(baseException, this.f107414a.f96050h.f106810b.getEffectId());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super T extends com.ss.android.ugc.aweme.editSticker.b.a, ? super h.c.d<? super h.z>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46137e(AbstractC41088b<T, Void> bVar, AbstractC89183m<? super T, ? super AbstractC89124d<? super C89391z>, ? extends Object> mVar, AbstractC41086b<T, Void> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f107414a = bVar;
        this.f107415b = mVar;
        this.f107416c = bVar2;
    }
}
