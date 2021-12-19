package com.p2082ss.android.ugc.aweme.profile.widgets.redpoint;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStatus;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
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

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM */
public final class UserProfileBlockVM extends AssemViewModel<C65165a> {

    /* renamed from: j */
    final AbstractC89244h f147051j = C12646c.m22777a(this, C65163b.f147059a);

    static {
        Covode.recordClassIndex(76629);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM$b */
    static final class C65163b extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC65168c>> {

        /* renamed from: a */
        public static final C65163b f147059a = new C65163b();

        static {
            Covode.recordClassIndex(76633);
        }

        C65163b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC65168c> invoke() {
            return new C65166b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C65165a mo20674f() {
        return new C65165a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM$c */
    public static final class C65164c extends AbstractC89220m implements AbstractC89172b<C65165a, C65165a> {

        /* renamed from: a */
        final /* synthetic */ BlockStruct f147060a;

        static {
            Covode.recordClassIndex(76634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65164c(BlockStruct blockStruct) {
            super(1);
            this.f147060a = blockStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C65165a invoke(C65165a aVar) {
            C65165a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C65165a.m116853a(aVar2, this.f147060a, null, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM$a */
    static final class C65160a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f147052a;

        /* renamed from: b */
        final /* synthetic */ UserProfileBlockVM f147053b;

        /* renamed from: c */
        final /* synthetic */ String f147054c;

        /* renamed from: d */
        final /* synthetic */ String f147055d;

        /* renamed from: e */
        final /* synthetic */ int f147056e;

        static {
            Covode.recordClassIndex(76630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65160a(UserProfileBlockVM userProfileBlockVM, String str, String str2, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f147053b = userProfileBlockVM;
            this.f147054c = str;
            this.f147055d = str2;
            this.f147056e = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C65160a(this.f147053b, this.f147054c, this.f147055d, this.f147056e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C65160a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i2 = this.f147052a;
            if (i2 == 0) {
                C89382r.m154942a(obj);
                try {
                    String str = this.f147054c;
                    String str2 = this.f147055d;
                    int i3 = this.f147056e;
                    this.f147052a = 1;
                    obj = ((AbstractC65168c) ((AbstractC12644a) this.f147053b.f147051j.getValue()).mo20458a()).mo104346a(str, str2, i3);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e) {
                    this.f147053b.mo20662a(new AbstractC89172b<C65165a, C65165a>() {
                        /* class com.p2082ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM.C65160a.C651622 */

                        static {
                            Covode.recordClassIndex(76632);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C65165a invoke(C65165a aVar) {
                            C65165a aVar2 = aVar;
                            C89219l.m154721d(aVar2, "");
                            return C65165a.m116853a(aVar2, null, e, 1);
                        }
                    });
                }
            } else if (i2 == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final BlockStruct blockStruct = (BlockStruct) obj;
            C33943c<BlockStatus> c = UserService.m138861d().mo123567c();
            String str3 = this.f147054c;
            if (blockStruct != null) {
                i = blockStruct.blockStatus;
            } else {
                i = 0;
            }
            c.postValue(new BlockStatus(str3, i));
            this.f147053b.mo20662a(new AbstractC89172b<C65165a, C65165a>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM.C65160a.C651611 */

                static {
                    Covode.recordClassIndex(76631);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C65165a invoke(C65165a aVar) {
                    C65165a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    return C65165a.m116853a(aVar2, blockStruct, null, 2);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo104342a(String str, String str2, int i) {
        AbstractC89568bz unused = C89624i.m155555a(aP_(), null, null, new C65160a(this, str, str2, i, null), 3);
    }
}
