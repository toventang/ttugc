package com.p2082ss.android.ugc.aweme.tools.draft.ftc.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c.AbstractC78258b;
import java.util.List;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel */
public final class KidsDraftFeedViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public AbstractC89568bz f176098a;

    /* renamed from: b */
    public final C1213t<AbstractC32846a> f176099b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<List<VideoPublishEditModel>> f176100c = new C1213t<>();

    /* renamed from: d */
    public final AbstractC78258b f176101d;

    static {
        Covode.recordClassIndex(91497);
    }

    public KidsDraftFeedViewModel(AbstractC78258b bVar) {
        C89219l.m154721d(bVar, "");
        this.f176101d = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel$a */
    public static final class C78373a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f176102a;

        /* renamed from: b */
        final /* synthetic */ KidsDraftFeedViewModel f176103b;

        static {
            Covode.recordClassIndex(91498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78373a(KidsDraftFeedViewModel kidsDraftFeedViewModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176103b = kidsDraftFeedViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78373a(this.f176103b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78373a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f176102a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89507ah ahVar = C89546bf.f203267b;
                C783741 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel.C78373a.C783741 */

                    /* renamed from: a */
                    Object f176104a;

                    /* renamed from: b */
                    int f176105b;

                    /* renamed from: c */
                    final /* synthetic */ C78373a f176106c;

                    static {
                        Covode.recordClassIndex(91499);
                    }

                    {
                        this.f176106c = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 
                    }
