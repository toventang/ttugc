package com.bytedance.ext_power_list;

import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12791m;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.EnumC17699e;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89671m;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public abstract class AssemListViewModel<S extends AbstractC14527i<S, ITEM>, ITEM extends AbstractC17641a, Cursor> extends AssemViewModel<S> {

    /* renamed from: j */
    public C17656f<ITEM> f35033j;

    /* renamed from: k */
    private final AbstractC89244h f35034k = C89250i.m154773a((AbstractC89171a) new C14487a(this));

    static {
        Covode.recordClassIndex(16569);
    }

    /* renamed from: a */
    public abstract Object mo23330a(AbstractC89124d<? super AbstractC17700f<Cursor>> dVar);

    /* renamed from: a */
    public abstract Object mo23331a(Cursor cursor, AbstractC89124d<? super AbstractC17700f<Cursor>> dVar);

    /* renamed from: a */
    public abstract void mo23334a(C14515a<ITEM> aVar);

    /* renamed from: h */
    public final AbstractC17692b<Cursor> mo23343h() {
        return (AbstractC17692b) this.f35034k.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a */
    public static final class C14487a extends AbstractC89220m implements AbstractC89171a<C144881> {

        /* renamed from: a */
        final /* synthetic */ AssemListViewModel f35035a;

        static {
            Covode.recordClassIndex(16570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14487a(AssemListViewModel assemListViewModel) {
            super(0);
            this.f35035a = assemListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C144881 invoke() {
            C17693c cVar = new C17693c();
            cVar.f42320b = false;
            return new AbstractC17692b<Cursor>(this, cVar) {
                /* class com.bytedance.ext_power_list.AssemListViewModel.C14487a.C144881 */

                /* renamed from: a */
                final /* synthetic */ C14487a f35036a;

                static {
                    Covode.recordClassIndex(16571);
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$b */
                static final class C14490b extends AbstractC89220m implements AbstractC89171a<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C144881 f35040a;

                    static {
                        Covode.recordClassIndex(16573);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C14490b(C144881 r2) {
                        super(0);
                        this.f35040a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f35040a.f35036a.f35035a.mo20667b((AbstractC89172b) new AbstractC89172b<S, C89391z>(this) {
                            /* class com.bytedance.ext_power_list.AssemListViewModel.C14487a.C144881.C14490b.C144911 */

                            /* renamed from: a */
                            final /* synthetic */ C14490b f35041a;

                            static {
                                Covode.recordClassIndex(16574);
                            }

                            {
                                this.f35041a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(Object obj) {
                                AbstractC14527i iVar = (AbstractC14527i) obj;
                                C89219l.m154719c(iVar, "");
                                this.f35041a.f35040a.f35036a.f35035a.mo23334a((C14515a) C14515a.m26525a(iVar.mo23367a(), null, null, new C12791m(), null, 11));
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$f */
                static final class C14495f extends AbstractC89220m implements AbstractC89171a<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C144881 f35047a;

                    static {
                        Covode.recordClassIndex(16578);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C14495f(C144881 r2) {
                        super(0);
                        this.f35047a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f35047a.f35036a.f35035a.mo20667b((AbstractC89172b) new AbstractC89172b<S, C89391z>(this) {
                            /* class com.bytedance.ext_power_list.AssemListViewModel.C14487a.C144881.C14495f.C144961 */

                            /* renamed from: a */
                            final /* synthetic */ C14495f f35048a;

                            static {
                                Covode.recordClassIndex(16579);
                            }

                            {
                                this.f35048a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(Object obj) {
                                AbstractC14527i iVar = (AbstractC14527i) obj;
                                C89219l.m154719c(iVar, "");
                                this.f35048a.f35047a.f35036a.f35035a.mo23334a((C14515a) C14515a.m26525a(iVar.mo23367a(), null, new C12791m(), null, null, 13));
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$j */
                static final class C14500j extends AbstractC89220m implements AbstractC89171a<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C144881 f35053a;

                    static {
                        Covode.recordClassIndex(16583);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C14500j(C144881 r2) {
                        super(0);
                        this.f35053a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f35053a.f35036a.f35035a.mo20667b((AbstractC89172b) new AbstractC89172b<S, C89391z>(this) {
                            /* class com.bytedance.ext_power_list.AssemListViewModel.C14487a.C144881.C14500j.C145011 */

                            /* renamed from: a */
                            final /* synthetic */ C14500j f35054a;

                            static {
                                Covode.recordClassIndex(16584);
                            }

                            {
                                this.f35054a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(Object obj) {
                                AbstractC14527i iVar = (AbstractC14527i) obj;
                                C89219l.m154719c(iVar, "");
                                this.f35054a.f35053a.f35036a.f35035a.mo23334a((C14515a) C14515a.m26525a(iVar.mo23367a(), new C12791m(), C12797s.f31127a, C12797s.f31127a, null, 8));
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<Cursor>> dVar) {
                    C89219l.m154719c(dVar, "");
                    this.f35036a.f35035a.mo23338a(EnumC17699e.Refresh, dVar, new C14499i(this, null), new C14500j(this), C14502k.f35055a, C14503l.f35056a);
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$a */
                static final class C14489a extends AbstractC89118k implements AbstractC89172b<AbstractC89124d<? super AbstractC17700f<Cursor>>, Object> {

                    /* renamed from: a */
                    int f35037a;

                    /* renamed from: b */
                    final /* synthetic */ C144881 f35038b;

                    /* renamed from: c */
                    final /* synthetic */ Object f35039c;

                    static {
                        Covode.recordClassIndex(16572);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C14489a(C144881 r2, Object obj, AbstractC89124d dVar) {
                        super(1, dVar);
                        this.f35038b = r2;
                        this.f35039c = obj;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(AbstractC89124d<?> dVar) {
                        C89219l.m154719c(dVar, "");
                        return new C14489a(this.f35038b, this.f35039c, dVar);
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final Object invoke(Object obj) {
                        return ((C14489a) create((AbstractC89124d) obj)).invokeSuspend(C89391z.f203057a);
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final Object invokeSuspend(Object obj) {
                        EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                        int i = this.f35037a;
                        if (i == 0) {
                            C89382r.m154942a(obj);
                            this.f35037a = 1;
                            obj = AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else if (i == 1) {
                            C89382r.m154942a(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return obj;
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$e */
                static final class C14494e extends AbstractC89118k implements AbstractC89172b<AbstractC89124d<? super AbstractC17700f<Cursor>>, Object> {

                    /* renamed from: a */
                    int f35044a;

                    /* renamed from: b */
                    final /* synthetic */ C144881 f35045b;

                    /* renamed from: c */
                    final /* synthetic */ Object f35046c;

                    static {
                        Covode.recordClassIndex(16577);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C14494e(C144881 r2, Object obj, AbstractC89124d dVar) {
                        super(1, dVar);
                        this.f35045b = r2;
                        this.f35046c = obj;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(AbstractC89124d<?> dVar) {
                        C89219l.m154719c(dVar, "");
                        return new C14494e(this.f35045b, this.f35046c, dVar);
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final Object invoke(Object obj) {
                        return ((C14494e) create((AbstractC89124d) obj)).invokeSuspend(C89391z.f203057a);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final Object invokeSuspend(Object obj) {
                        EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                        int i = this.f35044a;
                        if (i == 0) {
                            C89382r.m154942a(obj);
                            AssemListViewModel assemListViewModel = this.f35045b.f35036a.f35035a;
                            Object obj2 = this.f35046c;
                            this.f35044a = 1;
                            obj = assemListViewModel.mo23331a(obj2, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else if (i == 1) {
                            C89382r.m154942a(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return obj;
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$i */
                static final class C14499i extends AbstractC89118k implements AbstractC89172b<AbstractC89124d<? super AbstractC17700f<Cursor>>, Object> {

                    /* renamed from: a */
                    int f35051a;

                    /* renamed from: b */
                    final /* synthetic */ C144881 f35052b;

                    static {
                        Covode.recordClassIndex(16582);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C14499i(C144881 r2, AbstractC89124d dVar) {
                        super(1, dVar);
                        this.f35052b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(AbstractC89124d<?> dVar) {
                        C89219l.m154719c(dVar, "");
                        return new C14499i(this.f35052b, dVar);
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final Object invoke(Object obj) {
                        return ((C14499i) create((AbstractC89124d) obj)).invokeSuspend(C89391z.f203057a);
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final Object invokeSuspend(Object obj) {
                        EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                        int i = this.f35051a;
                        if (i == 0) {
                            C89382r.m154942a(obj);
                            AssemListViewModel assemListViewModel = this.f35052b.f35036a.f35035a;
                            this.f35051a = 1;
                            obj = assemListViewModel.mo23330a((AbstractC89124d) this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else if (i == 1) {
                            C89382r.m154942a(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return obj;
                    }
                }

                {
                    this.f35036a = r1;
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$d */
                static final class C14493d extends AbstractC89220m implements AbstractC89183m<C14515a<ITEM>, Exception, C14515a<ITEM>> {

                    /* renamed from: a */
                    public static final C14493d f35043a = new C14493d();

                    static {
                        Covode.recordClassIndex(16576);
                    }

                    C14493d() {
                        super(2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                    public final /* synthetic */ Object invoke(Object obj, Exception exc) {
                        C14515a aVar = (C14515a) obj;
                        Exception exc2 = exc;
                        C89219l.m154719c(aVar, "");
                        C89219l.m154719c(exc2, "");
                        return C14515a.m26525a(aVar, null, null, new C12785h(exc2), null, 11);
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$h */
                static final class C14498h extends AbstractC89220m implements AbstractC89183m<C14515a<ITEM>, Exception, C14515a<ITEM>> {

                    /* renamed from: a */
                    public static final C14498h f35050a = new C14498h();

                    static {
                        Covode.recordClassIndex(16581);
                    }

                    C14498h() {
                        super(2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                    public final /* synthetic */ Object invoke(Object obj, Exception exc) {
                        C14515a aVar = (C14515a) obj;
                        Exception exc2 = exc;
                        C89219l.m154719c(aVar, "");
                        C89219l.m154719c(exc2, "");
                        return C14515a.m26525a(aVar, null, new C12785h(exc2), null, null, 13);
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$l */
                static final class C14503l extends AbstractC89220m implements AbstractC89183m<C14515a<ITEM>, Exception, C14515a<ITEM>> {

                    /* renamed from: a */
                    public static final C14503l f35056a = new C14503l();

                    static {
                        Covode.recordClassIndex(16586);
                    }

                    C14503l() {
                        super(2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                    public final /* synthetic */ Object invoke(Object obj, Exception exc) {
                        C14515a aVar = (C14515a) obj;
                        Exception exc2 = exc;
                        C89219l.m154719c(aVar, "");
                        C89219l.m154719c(exc2, "");
                        return C14515a.m26525a(aVar, new C12785h(exc2), null, null, null, 14);
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final void mo23347b(AbstractC89124d<? super AbstractC17700f<Cursor>> dVar, Cursor cursor) {
                    C89219l.m154719c(dVar, "");
                    this.f35036a.f35035a.mo23338a(EnumC17699e.Next, dVar, new C14494e(this, cursor, null), new C14495f(this), C14497g.f35049a, C14498h.f35050a);
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23346a(AbstractC89124d<? super AbstractC17700f<Cursor>> dVar, Cursor cursor) {
                    C89219l.m154719c(dVar, "");
                    this.f35036a.f35035a.mo23338a(EnumC17699e.Prev, dVar, new C14489a(this, cursor, null), new C14490b(this), C14492c.f35042a, C14493d.f35043a);
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$c */
                static final class C14492c extends AbstractC89220m implements AbstractC89187q<C14515a<ITEM>, Boolean, Boolean, C14515a<ITEM>> {

                    /* renamed from: a */
                    public static final C14492c f35042a = new C14492c();

                    static {
                        Covode.recordClassIndex(16575);
                    }

                    C14492c() {
                        super(3);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89187q
                    public final /* synthetic */ Object invoke(Object obj, Boolean bool, Boolean bool2) {
                        C14515a aVar = (C14515a) obj;
                        boolean booleanValue = bool.booleanValue();
                        boolean booleanValue2 = bool2.booleanValue();
                        C89219l.m154719c(aVar, "");
                        return C14515a.m26525a(aVar, null, null, new C12792n(new C14533l(booleanValue, booleanValue2)), null, 11);
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$g */
                static final class C14497g extends AbstractC89220m implements AbstractC89187q<C14515a<ITEM>, Boolean, Boolean, C14515a<ITEM>> {

                    /* renamed from: a */
                    public static final C14497g f35049a = new C14497g();

                    static {
                        Covode.recordClassIndex(16580);
                    }

                    C14497g() {
                        super(3);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89187q
                    public final /* synthetic */ Object invoke(Object obj, Boolean bool, Boolean bool2) {
                        C14515a aVar = (C14515a) obj;
                        boolean booleanValue = bool.booleanValue();
                        boolean booleanValue2 = bool2.booleanValue();
                        C89219l.m154719c(aVar, "");
                        return C14515a.m26525a(aVar, null, new C12792n(new C14533l(booleanValue, booleanValue2)), null, null, 13);
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$k */
                static final class C14502k extends AbstractC89220m implements AbstractC89187q<C14515a<ITEM>, Boolean, Boolean, C14515a<ITEM>> {

                    /* renamed from: a */
                    public static final C14502k f35055a = new C14502k();

                    static {
                        Covode.recordClassIndex(16585);
                    }

                    C14502k() {
                        super(3);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89187q
                    public final /* synthetic */ Object invoke(Object obj, Boolean bool, Boolean bool2) {
                        C14515a aVar = (C14515a) obj;
                        boolean booleanValue = bool.booleanValue();
                        boolean booleanValue2 = bool2.booleanValue();
                        C89219l.m154719c(aVar, "");
                        return C14515a.m26525a(aVar, new C12792n(new C14533l(booleanValue, booleanValue2)), null, null, null, 14);
                    }
                }
            };
        }
    }

    /* renamed from: g */
    public final void mo23342g() {
        mo23343h().f42330c.mo28163e();
    }

    /* renamed from: i */
    public final List<ITEM> mo23344i() {
        C17656f<ITEM> fVar = this.f35033j;
        List<ITEM> list = fVar != null ? (List<ITEM>) fVar.mo28140c() : null;
        if (!(list instanceof List)) {
            return null;
        }
        return list;
    }

    /* renamed from: a */
    public final void mo23332a(int i) {
        mo20667b((AbstractC89172b) new C14506d(this, i));
    }

    /* renamed from: b */
    public final void mo23341b(Cursor cursor) {
        mo23343h().f42330c.mo28156a((Object) cursor);
    }

    /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$b */
    static final class C14504b extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemListViewModel f35057a;

        /* renamed from: b */
        final /* synthetic */ int f35058b;

        /* renamed from: c */
        final /* synthetic */ AbstractC17641a f35059c;

        static {
            Covode.recordClassIndex(16587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14504b(AssemListViewModel assemListViewModel, int i, AbstractC17641a aVar) {
            super(1);
            this.f35057a = assemListViewModel;
            this.f35058b = i;
            this.f35059c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.powerlist.f<ITEM extends com.bytedance.ies.powerlist.b.a> */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC14527i iVar = (AbstractC14527i) obj;
            C89219l.m154719c(iVar, "");
            C17656f<ITEM> fVar = this.f35057a.f35033j;
            if (fVar != 0) {
                fVar.mo28130a(this.f35058b, (ITEM) this.f35059c);
                this.f35057a.mo23335a(iVar, fVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$c */
    static final class C14505c extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemListViewModel f35060a;

        /* renamed from: b */
        final /* synthetic */ AbstractC17641a f35061b;

        static {
            Covode.recordClassIndex(16588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14505c(AssemListViewModel assemListViewModel, AbstractC17641a aVar) {
            super(1);
            this.f35060a = assemListViewModel;
            this.f35061b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.powerlist.f<ITEM extends com.bytedance.ies.powerlist.b.a> */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC14527i iVar = (AbstractC14527i) obj;
            C89219l.m154719c(iVar, "");
            C17656f<ITEM> fVar = this.f35060a.f35033j;
            if (fVar != 0) {
                fVar.mo28137b((ITEM) this.f35061b);
                this.f35060a.mo23335a(iVar, fVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$d */
    static final class C14506d extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemListViewModel f35062a;

        /* renamed from: b */
        final /* synthetic */ int f35063b;

        static {
            Covode.recordClassIndex(16589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14506d(AssemListViewModel assemListViewModel, int i) {
            super(1);
            this.f35062a = assemListViewModel;
            this.f35063b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC14527i iVar = (AbstractC14527i) obj;
            C89219l.m154719c(iVar, "");
            C17656f<ITEM> fVar = this.f35062a.f35033j;
            if (fVar != null) {
                fVar.mo28129a(this.f35063b);
                this.f35062a.mo23335a(iVar, fVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$e */
    public static final class C14507e extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemListViewModel f35064a;

        /* renamed from: b */
        final /* synthetic */ int f35065b;

        /* renamed from: c */
        final /* synthetic */ AbstractC17641a f35066c;

        static {
            Covode.recordClassIndex(16590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14507e(AssemListViewModel assemListViewModel, int i, AbstractC17641a aVar) {
            super(1);
            this.f35064a = assemListViewModel;
            this.f35065b = i;
            this.f35066c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.powerlist.f<ITEM extends com.bytedance.ies.powerlist.b.a> */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC14527i iVar = (AbstractC14527i) obj;
            C89219l.m154719c(iVar, "");
            C17656f<ITEM> fVar = this.f35064a.f35033j;
            if (fVar != 0) {
                fVar.mo28136b(this.f35065b, this.f35066c);
                this.f35064a.mo23335a(iVar, fVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$f */
    static final class C14508f extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemListViewModel f35067a;

        /* renamed from: b */
        final /* synthetic */ Collection f35068b;

        static {
            Covode.recordClassIndex(16591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14508f(AssemListViewModel assemListViewModel, Collection collection) {
            super(1);
            this.f35067a = assemListViewModel;
            this.f35068b = collection;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC14527i iVar = (AbstractC14527i) obj;
            C89219l.m154719c(iVar, "");
            C17656f<ITEM> fVar = this.f35067a.f35033j;
            if (fVar != null) {
                fVar.mo28138b(this.f35068b);
                this.f35067a.mo23335a(iVar, fVar);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$g */
    public static final class C14509g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f35069a;

        /* renamed from: b */
        int f35070b;

        /* renamed from: c */
        final /* synthetic */ AssemListViewModel f35071c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f35072d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f35073e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89124d f35074f;

        /* renamed from: g */
        final /* synthetic */ EnumC17699e f35075g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89187q f35076h;

        /* renamed from: i */
        final /* synthetic */ AbstractC89183m f35077i;

        /* renamed from: j */
        private AbstractC89516am f35078j;

        static {
            Covode.recordClassIndex(16592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14509g(AssemListViewModel assemListViewModel, AbstractC89171a aVar, AbstractC89172b bVar, AbstractC89124d dVar, EnumC17699e eVar, AbstractC89187q qVar, AbstractC89183m mVar, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f35071c = assemListViewModel;
            this.f35072d = aVar;
            this.f35073e = bVar;
            this.f35074f = dVar;
            this.f35075g = eVar;
            this.f35076h = qVar;
            this.f35077i = mVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C14509g gVar = new C14509g(this.f35071c, this.f35072d, this.f35073e, this.f35074f, this.f35075g, this.f35076h, this.f35077i, dVar);
            gVar.f35078j = (AbstractC89516am) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C14509g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$g$a */
        public static final class C14512a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super AbstractC17700f<Cursor>>, Object> {

            /* renamed from: a */
            Object f35084a;

            /* renamed from: b */
            int f35085b;

            /* renamed from: c */
            final /* synthetic */ C14509g f35086c;

            /* renamed from: d */
            private AbstractC89516am f35087d;

            static {
                Covode.recordClassIndex(16595);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14512a(C14509g gVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f35086c = gVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154719c(dVar, "");
                C14512a aVar = new C14512a(this.f35086c, dVar);
                aVar.f35087d = (AbstractC89516am) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, Object obj) {
                return ((C14512a) create(amVar, (AbstractC89124d) obj)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f35085b;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    AbstractC89516am amVar = this.f35087d;
                    AbstractC89172b bVar = this.f35086c.f35073e;
                    this.f35084a = amVar;
                    this.f35085b = 1;
                    obj = bVar.invoke(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            final List list;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f35070b;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89516am amVar = this.f35078j;
                this.f35072d.invoke();
                AbstractC89127f plus = this.f35071c.aP_().mo20678a().plus(C89546bf.f203267b);
                C14512a aVar2 = new C14512a(this, null);
                this.f35069a = amVar;
                this.f35070b = 1;
                obj = C89624i.m155554a(plus, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final AbstractC17700f fVar = (AbstractC17700f) obj;
            if (fVar instanceof AbstractC17700f.C17702b) {
                list = ((AbstractC17700f.C17702b) fVar).f42335b;
                if (list == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (fVar instanceof AbstractC17700f.C17704d) {
                list = ((AbstractC17700f.C17704d) fVar).f42339d;
                if (list == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                list = C89086z.INSTANCE;
            }
            this.f35071c.mo20667b((AbstractC89172b) new AbstractC89172b<S, C89391z>(this) {
                /* class com.bytedance.ext_power_list.AssemListViewModel.C14509g.C145101 */

                /* renamed from: a */
                final /* synthetic */ C14509g f35079a;

                static {
                    Covode.recordClassIndex(16593);
                }

                {
                    this.f35079a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Object obj) {
                    final AbstractC14527i iVar = (AbstractC14527i) obj;
                    C89219l.m154719c(iVar, "");
                    AbstractC89124d dVar = this.f35079a.f35074f;
                    C145111 r1 = new AbstractC89171a<C89391z>(this) {
                        /* class com.bytedance.ext_power_list.AssemListViewModel.C14509g.C145101.C145111 */

                        /* renamed from: a */
                        final /* synthetic */ C145101 f35082a;

                        static {
                            Covode.recordClassIndex(16594);
                        }

                        {
                            this.f35082a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            C14515a<ITEM> aVar;
                            boolean z;
                            Object obj = iVar.mo23367a().f35099d;
                            ArrayList arrayList = new ArrayList();
                            EnumC17699e eVar = this.f35082a.f35079a.f35075g;
                            if (obj == null) {
                                obj = C89086z.INSTANCE;
                            }
                            List list = list;
                            C89219l.m154719c(eVar, "");
                            C89219l.m154719c(obj, "");
                            C89219l.m154719c(list, "");
                            ArrayList arrayList2 = new ArrayList();
                            int i = C14516b.f35100a[eVar.ordinal()];
                            boolean z2 = true;
                            if (i == 1) {
                                arrayList2.addAll(list);
                            } else if (i == 2) {
                                arrayList2.addAll(obj);
                                arrayList2.addAll(list);
                            } else if (i == 3) {
                                arrayList2.addAll(list);
                                arrayList2.addAll(obj);
                            }
                            arrayList.addAll(arrayList2);
                            C14515a a = C14515a.m26525a(iVar.mo23367a(), null, null, null, arrayList, 7);
                            AssemListViewModel assemListViewModel = this.f35082a.f35079a.f35071c;
                            AbstractC17700f fVar = fVar;
                            if (fVar instanceof AbstractC17700f.C17702b) {
                                aVar = (C14515a) this.f35082a.f35079a.f35076h.invoke(a, false, false);
                            } else if (fVar instanceof AbstractC17700f.C17704d) {
                                AbstractC89187q qVar = this.f35082a.f35079a.f35076h;
                                if (((AbstractC17700f.C17704d) fVar).f42337b != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z);
                                if (((AbstractC17700f.C17704d) fVar).f42338c == null) {
                                    z2 = false;
                                }
                                aVar = (C14515a) qVar.invoke(a, valueOf, Boolean.valueOf(z2));
                            } else if (fVar instanceof AbstractC17700f.C17703c) {
                                aVar = (C14515a) this.f35082a.f35079a.f35077i.invoke(a, ((AbstractC17700f.C17703c) fVar).f42336b);
                            } else {
                                throw new C89376n();
                            }
                            assemListViewModel.mo23334a((C14515a) aVar);
                            this.f35082a.f35079a.f35074f.resumeWith(C89379q.m157068constructorimpl(fVar));
                            return C89391z.f203057a;
                        }
                    };
                    C89219l.m154719c(dVar, "");
                    C89219l.m154719c(r1, "");
                    if (!(dVar instanceof AbstractC89671m)) {
                        dVar = null;
                    }
                    AbstractC89671m mVar = (AbstractC89671m) dVar;
                    if (mVar == null) {
                        r1.invoke();
                    } else if (!mVar.mo144217c()) {
                        r1.invoke();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo23336a(ITEM item) {
        C89219l.m154719c(item, "");
        mo20667b((AbstractC89172b) new C14505c(this, item));
    }

    /* renamed from: a */
    public final void mo23337a(EnumC17699e eVar) {
        C89219l.m154719c(eVar, "");
        mo23343h().f42330c.mo28155a(eVar);
    }

    /* renamed from: a */
    public final void mo23339a(Cursor cursor) {
        mo23343h().f42330c.mo28158b(cursor);
    }

    /* renamed from: a */
    public final void mo23340a(Collection<? extends ITEM> collection) {
        C89219l.m154719c(collection, "");
        mo20667b((AbstractC89172b) new C14508f(this, collection));
    }

    /* renamed from: a */
    public final void mo23333a(int i, ITEM item) {
        C89219l.m154719c(item, "");
        mo20667b((AbstractC89172b) new C14504b(this, i, item));
    }

    /* renamed from: a */
    public final void mo23335a(S s, C17656f<ITEM> fVar) {
        mo23334a((C14515a) C14515a.m26525a(s.mo23367a(), null, null, null, fVar.mo28140c(), 7));
    }

    /* renamed from: a */
    public final void mo23338a(EnumC17699e eVar, AbstractC89124d<? super AbstractC17700f<Cursor>> dVar, AbstractC89172b<? super AbstractC89124d<? super AbstractC17700f<Cursor>>, ? extends Object> bVar, AbstractC89171a<C89391z> aVar, AbstractC89187q<? super C14515a<ITEM>, ? super Boolean, ? super Boolean, C14515a<ITEM>> qVar, AbstractC89183m<? super C14515a<ITEM>, ? super Exception, C14515a<ITEM>> mVar) {
        AbstractC89568bz unused = C89624i.m155555a(aP_(), null, null, new C14509g(this, aVar, bVar, dVar, eVar, qVar, mVar, null), 3);
    }
}
