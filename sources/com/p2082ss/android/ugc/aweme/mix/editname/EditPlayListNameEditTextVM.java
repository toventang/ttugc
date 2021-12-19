package com.p2082ss.android.ugc.aweme.mix.editname;

import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12791m;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59395a;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM */
public final class EditPlayListNameEditTextVM extends AssemViewModel<C59554a> {

    /* renamed from: j */
    private final AbstractC89244h f135887j = C12646c.m22777a(this, C59552c.f135904a);

    static {
        Covode.recordClassIndex(69936);
    }

    /* renamed from: g */
    public final AbstractC12644a<AbstractC59557c> mo23342g() {
        return (AbstractC12644a) this.f135887j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM$c */
    static final class C59552c extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC59557c>> {

        /* renamed from: a */
        public static final C59552c f135904a = new C59552c();

        static {
            Covode.recordClassIndex(69949);
        }

        C59552c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC59557c> invoke() {
            return new C59555b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C59554a mo20674f() {
        return new C59554a();
    }

    /* renamed from: a */
    public final void mo97156a(String str) {
        C89219l.m154721d(str, "");
        mo20667b(new C59546b(this, str));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM$a */
    static final class C59540a extends AbstractC89220m implements AbstractC89172b<C59554a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EditPlayListNameEditTextVM f135888a;

        /* renamed from: b */
        final /* synthetic */ String f135889b;

        /* renamed from: c */
        final /* synthetic */ String f135890c;

        static {
            Covode.recordClassIndex(69937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59540a(EditPlayListNameEditTextVM editPlayListNameEditTextVM, String str, String str2) {
            super(1);
            this.f135888a = editPlayListNameEditTextVM;
            this.f135889b = str;
            this.f135890c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59554a aVar) {
            C59554a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (!(aVar2.f135908a instanceof C12791m)) {
                this.f135888a.mo20670c(C595411.f135891a);
                EditPlayListNameEditTextVM editPlayListNameEditTextVM = this.f135888a;
                AbstractC88412b a = editPlayListNameEditTextVM.mo23342g().mo20458a().mo97160a(this.f135889b, this.f135890c).mo142915a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.C59540a.C595422 */

                    /* renamed from: a */
                    final /* synthetic */ C59540a f135892a;

                    static {
                        Covode.recordClassIndex(69939);
                    }

                    {
                        this.f135892a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final C59396b bVar = (C59396b) obj;
                        this.f135892a.f135888a.mo20662a(new AbstractC89172b<C59554a, C59554a>() {
                            /* class com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.C59540a.C595422.C595431 */

                            static {
                                Covode.recordClassIndex(69940);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C59554a invoke(C59554a aVar) {
                                C59554a aVar2 = aVar;
                                C89219l.m154721d(aVar2, "");
                                return C59554a.m109177a(aVar2, null, new C12792n(bVar), 1);
                            }
                        });
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.C59540a.C595443 */

                    /* renamed from: a */
                    final /* synthetic */ C59540a f135894a;

                    static {
                        Covode.recordClassIndex(69941);
                    }

                    {
                        this.f135894a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f135894a.f135888a.mo20662a(new AbstractC89172b<C59554a, C59554a>() {
                            /* class com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.C59540a.C595443.C595451 */

                            static {
                                Covode.recordClassIndex(69942);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C59554a invoke(C59554a aVar) {
                                C59554a aVar2 = aVar;
                                C89219l.m154721d(aVar2, "");
                                Throwable th = th;
                                C89219l.m154716b(th, "");
                                return C59554a.m109177a(aVar2, null, new C12785h(th), 1);
                            }
                        });
                    }
                });
                C89219l.m154716b(a, "");
                editPlayListNameEditTextVM.mo20659a(a);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM$b */
    public static final class C59546b extends AbstractC89220m implements AbstractC89172b<C59554a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EditPlayListNameEditTextVM f135896a;

        /* renamed from: b */
        final /* synthetic */ int f135897b = 1;

        /* renamed from: c */
        final /* synthetic */ String f135898c;

        static {
            Covode.recordClassIndex(69943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59546b(EditPlayListNameEditTextVM editPlayListNameEditTextVM, String str) {
            super(1);
            this.f135896a = editPlayListNameEditTextVM;
            this.f135898c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59554a aVar) {
            C59554a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (!(aVar2.f135908a instanceof C12791m)) {
                this.f135896a.mo20670c(C595471.f135899a);
                EditPlayListNameEditTextVM editPlayListNameEditTextVM = this.f135896a;
                AbstractC88412b a = editPlayListNameEditTextVM.mo23342g().mo20458a().mo97161a(this.f135897b, this.f135898c).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.C59546b.C595482 */

                    /* renamed from: a */
                    final /* synthetic */ C59546b f135900a;

                    static {
                        Covode.recordClassIndex(69945);
                    }

                    {
                        this.f135900a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final C59395a aVar = (C59395a) obj;
                        this.f135900a.f135896a.mo20662a(new AbstractC89172b<C59554a, C59554a>() {
                            /* class com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.C59546b.C595482.C595491 */

                            static {
                                Covode.recordClassIndex(69946);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C59554a invoke(C59554a aVar) {
                                C59554a aVar2 = aVar;
                                C89219l.m154721d(aVar2, "");
                                return C59554a.m109177a(aVar2, new C12792n(aVar), null, 2);
                            }
                        });
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.C59546b.C595503 */

                    /* renamed from: a */
                    final /* synthetic */ C59546b f135902a;

                    static {
                        Covode.recordClassIndex(69947);
                    }

                    {
                        this.f135902a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f135902a.f135896a.mo20662a(new AbstractC89172b<C59554a, C59554a>() {
                            /* class com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.C59546b.C595503.C595511 */

                            static {
                                Covode.recordClassIndex(69948);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C59554a invoke(C59554a aVar) {
                                C59554a aVar2 = aVar;
                                C89219l.m154721d(aVar2, "");
                                Throwable th = th;
                                C89219l.m154716b(th, "");
                                return C59554a.m109177a(aVar2, new C12785h(th), null, 2);
                            }
                        });
                    }
                });
                C89219l.m154716b(a, "");
                editPlayListNameEditTextVM.mo20659a(a);
            }
            return C89391z.f203057a;
        }
    }
}
