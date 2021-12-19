package com.p2082ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.AbstractC89244h;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel */
public final class SearchLiveViewModel extends AssemViewModel<C43028d> {

    /* renamed from: j */
    final AbstractC89244h f100249j = C12646c.m22777a(this, C42998a.f100250a);

    static {
        Covode.recordClassIndex(51133);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel$a */
    static final class C42998a extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC43027c>> {

        /* renamed from: a */
        public static final C42998a f100250a = new C42998a();

        static {
            Covode.recordClassIndex(51134);
        }

        C42998a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC43027c> invoke() {
            return new C43025b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C43028d mo20674f() {
        return new C43028d();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel$b */
    public static final class C42999b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f100251a;

        /* renamed from: b */
        final /* synthetic */ SearchLiveViewModel f100252b;

        /* renamed from: c */
        final /* synthetic */ C42174f f100253c;

        static {
            Covode.recordClassIndex(51135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42999b(SearchLiveViewModel searchLiveViewModel, C42174f fVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f100252b = searchLiveViewModel;
            this.f100253c = fVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C42999b(this.f100252b, this.f100253c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C42999b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f100251a;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    C42174f fVar = this.f100253c;
                    this.f100251a = 1;
                    obj = ((AbstractC43027c) ((AbstractC12644a) this.f100252b.f100249j.getValue()).mo20458a()).mo73217a(fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e) {
                    this.f100252b.mo20662a(new AbstractC89172b<C43028d, C43028d>() {
                        /* class com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel.C42999b.C430012 */

                        static {
                            Covode.recordClassIndex(51137);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C43028d invoke(C43028d dVar) {
                            C89219l.m154721d(dVar, "");
                            return C43028d.m85854a(new C12785h(e));
                        }
                    });
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final SearchLiveList searchLiveList = (SearchLiveList) obj;
            this.f100252b.mo20662a(new AbstractC89172b<C43028d, C43028d>() {
                /* class com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel.C42999b.C430001 */

                static {
                    Covode.recordClassIndex(51136);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C43028d invoke(C43028d dVar) {
                    C89219l.m154721d(dVar, "");
                    return C43028d.m85854a(new C12792n(searchLiveList));
                }
            });
            return C89391z.f203057a;
        }
    }
}
