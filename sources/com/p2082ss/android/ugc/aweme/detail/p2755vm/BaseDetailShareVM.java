package com.p2082ss.android.ugc.aweme.detail.p2755vm;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.viewModel.AbstractC12840g;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM */
public abstract class BaseDetailShareVM<S extends AbstractC14527i<S, ITEM>, ITEM extends AbstractC17641a, Cursor> extends AssemListViewModel<S, ITEM, Cursor> implements AbstractC41238k, AbstractC41262aa {

    /* renamed from: k */
    public boolean f96655k;

    /* renamed from: l */
    public AbstractC41267ad f96656l;

    static {
        Covode.recordClassIndex(49328);
    }

    /* renamed from: a */
    public abstract int mo70711a(String str);

    /* renamed from: a */
    public abstract Cursor mo70712a(C49812b bVar);

    /* renamed from: b */
    public abstract Aweme mo70713b(ITEM item);

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public Object getViewModel() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$j */
    public static final class C41453j extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f96697a;

        static {
            Covode.recordClassIndex(49351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41453j(AbstractC1204m mVar) {
            super(0);
            this.f96697a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC1204m invoke() {
            return this.f96697a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isLoading() {
        return this.f96655k;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$k */
    public static final class C41454k extends AbstractC89220m implements AbstractC89171a<AbstractC12840g<S>> {

        /* renamed from: a */
        public static final C41454k f96698a = new C41454k();

        static {
            Covode.recordClassIndex(49352);
        }

        C41454k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return new C12874b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void unInit() {
        this.f96656l = null;
        this.f96655k = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$b */
    static final class C41433b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96661a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96662b;

        static {
            Covode.recordClassIndex(49331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41433b(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(0);
            this.f96661a = baseDetailShareVM;
            this.f96662b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f96661a.f96656l != null) {
                this.f96661a.f96655k = true;
                C34727m.m70944a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41433b.RunnableC414341 */

                    /* renamed from: a */
                    final /* synthetic */ C41433b f96663a;

                    static {
                        Covode.recordClassIndex(49332);
                    }

                    {
                        this.f96663a = r1;
                    }

                    public final void run() {
                        this.f96663a.f96662b.aW_();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$e */
    static final class C41440e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96674a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96675b;

        static {
            Covode.recordClassIndex(49338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41440e(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(0);
            this.f96674a = baseDetailShareVM;
            this.f96675b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f96674a.f96656l != null) {
                this.f96674a.f96655k = true;
                C34727m.m70944a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41440e.RunnableC414411 */

                    /* renamed from: a */
                    final /* synthetic */ C41440e f96676a;

                    static {
                        Covode.recordClassIndex(49339);
                    }

                    {
                        this.f96676a = r1;
                    }

                    public final void run() {
                        this.f96676a.f96675b.mo59515b();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$h */
    static final class C41448h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96688a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96689b;

        static {
            Covode.recordClassIndex(49346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41448h(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(0);
            this.f96688a = baseDetailShareVM;
            this.f96689b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f96688a.f96656l != null) {
                this.f96688a.f96655k = true;
                C34727m.m70944a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41448h.RunnableC414491 */

                    /* renamed from: a */
                    final /* synthetic */ C41448h f96690a;

                    static {
                        Covode.recordClassIndex(49347);
                    }

                    {
                        this.f96690a = r1;
                    }

                    public final void run() {
                        this.f96690a.f96689b.bl_();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isDataEmpty() {
        List<ITEM> c = ((AbstractC14527i) mo20671d().mo20680a()).mo23369c();
        if (c == null || c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r0 != null) goto L_0x0040;
     */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.feed.model.Aweme> mo70559a() {
        /*
            r4 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = r4
            com.bytedance.assem.arch.viewModel.g r0 = r0.mo20671d()
            com.bytedance.assem.arch.viewModel.j r0 = r0.mo20680a()
            com.bytedance.ext_power_list.i r0 = (com.bytedance.ext_power_list.AbstractC14527i) r0
            java.util.List r0 = r0.mo23369c()
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.powerlist.b.a r0 = (com.bytedance.ies.powerlist.p1231b.AbstractC17641a) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.mo70713b(r0)
            if (r0 == 0) goto L_0x001f
            r2.add(r0)
            goto L_0x001f
        L_0x0035:
            java.util.List r2 = (java.util.List) r2
            java.util.List r0 = p4600h.p4601a.C89070n.m154590j(r2)
            if (r0 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            h.a.z r0 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0040:
            r3.addAll(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.mo70559a():java.util.List");
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$l */
    public static final class C41455l extends AbstractC89220m implements AbstractC89172b<S, S> {

        /* renamed from: a */
        public static final C41455l f96699a = new C41455l();

        static {
            Covode.recordClassIndex(49353);
        }

        C41455l() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154721d(obj, "");
            return obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$a */
    static final class C41431a extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96657a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96658b;

        static {
            Covode.recordClassIndex(49329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41431a(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(1);
            this.f96657a = baseDetailShareVM;
            this.f96658b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            final Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f96657a.f96655k = false;
            C34727m.m70944a(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41431a.RunnableC414321 */

                /* renamed from: a */
                final /* synthetic */ C41431a f96659a;

                static {
                    Covode.recordClassIndex(49330);
                }

                {
                    this.f96659a = r1;
                }

                public final void run() {
                    this.f96659a.f96658b.mo59522c(new Exception(th2));
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$c */
    static final class C41435c extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96664a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96665b;

        static {
            Covode.recordClassIndex(49333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41435c(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(1);
            this.f96664a = baseDetailShareVM;
            this.f96665b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            if (this.f96664a.f96656l != null) {
                this.f96664a.f96655k = false;
                this.f96664a.mo20667b((AbstractC89172b) new AbstractC89172b<S, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41435c.C414361 */

                    /* renamed from: a */
                    final /* synthetic */ C41435c f96666a;

                    static {
                        Covode.recordClassIndex(49334);
                    }

                    {
                        this.f96666a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Object obj) {
                        final boolean z;
                        final ArrayList arrayList;
                        AbstractC14527i iVar = (AbstractC14527i) obj;
                        C89219l.m154721d(iVar, "");
                        C14533l a = iVar.mo23371e().mo20635a();
                        if (a != null) {
                            z = a.f35142b;
                        } else {
                            z = false;
                        }
                        List<ITEM> c = iVar.mo23369c();
                        if (c != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (ITEM item : c) {
                                Aweme b = this.f96666a.f96664a.mo70713b((AbstractC17641a) item);
                                if (b != null) {
                                    arrayList2.add(b);
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        C34727m.m70944a(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41435c.C414361.RunnableC414371 */

                            /* renamed from: a */
                            final /* synthetic */ C414361 f96667a;

                            static {
                                Covode.recordClassIndex(49335);
                            }

                            {
                                this.f96667a = r1;
                            }

                            public final void run() {
                                this.f96667a.f96666a.f96665b.mo59517b(arrayList, z);
                            }
                        });
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$d */
    static final class C41438d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96670a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96671b;

        static {
            Covode.recordClassIndex(49336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41438d(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(1);
            this.f96670a = baseDetailShareVM;
            this.f96671b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            final Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f96670a.f96655k = false;
            C34727m.m70944a(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41438d.RunnableC414391 */

                /* renamed from: a */
                final /* synthetic */ C41438d f96672a;

                static {
                    Covode.recordClassIndex(49337);
                }

                {
                    this.f96672a = r1;
                }

                public final void run() {
                    this.f96672a.f96671b.mo59516b(new Exception(th2));
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$f */
    static final class C41442f extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96677a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96678b;

        static {
            Covode.recordClassIndex(49340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41442f(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(1);
            this.f96677a = baseDetailShareVM;
            this.f96678b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            if (this.f96677a.f96656l != null) {
                this.f96677a.f96655k = false;
                this.f96677a.mo20667b((AbstractC89172b) new AbstractC89172b<S, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41442f.C414431 */

                    /* renamed from: a */
                    final /* synthetic */ C41442f f96679a;

                    static {
                        Covode.recordClassIndex(49341);
                    }

                    {
                        this.f96679a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Object obj) {
                        final boolean z;
                        AbstractC14527i iVar = (AbstractC14527i) obj;
                        C89219l.m154721d(iVar, "");
                        C14533l a = iVar.mo23368b().mo20635a();
                        if (a != null) {
                            z = a.f35142b;
                        } else {
                            z = false;
                        }
                        List<ITEM> c = iVar.mo23369c();
                        if (c != null) {
                            ArrayList arrayList = new ArrayList();
                            for (ITEM item : c) {
                                Aweme b = this.f96679a.f96677a.mo70713b((AbstractC17641a) item);
                                if (b != null) {
                                    arrayList.add(b);
                                }
                            }
                            final ArrayList arrayList2 = arrayList;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                C34727m.m70944a(new Runnable(this) {
                                    /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41442f.C414431.RunnableC414452 */

                                    /* renamed from: a */
                                    final /* synthetic */ C414431 f96681a;

                                    static {
                                        Covode.recordClassIndex(49343);
                                    }

                                    {
                                        this.f96681a = r1;
                                    }

                                    public final void run() {
                                        this.f96681a.f96679a.f96678b.mo59512a(arrayList2, z);
                                    }
                                });
                                return C89391z.f203057a;
                            }
                        }
                        C34727m.m70944a(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41442f.C414431.RunnableC414441 */

                            /* renamed from: a */
                            final /* synthetic */ C414431 f96680a;

                            static {
                                Covode.recordClassIndex(49342);
                            }

                            {
                                this.f96680a = r1;
                            }

                            public final void run() {
                                this.f96680a.f96679a.f96678b.mo59525f();
                            }
                        });
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$g */
    static final class C41446g extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96684a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96685b;

        static {
            Covode.recordClassIndex(49344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41446g(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(1);
            this.f96684a = baseDetailShareVM;
            this.f96685b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            final Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f96684a.f96655k = false;
            C34727m.m70944a(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41446g.RunnableC414471 */

                /* renamed from: a */
                final /* synthetic */ C41446g f96686a;

                static {
                    Covode.recordClassIndex(49345);
                }

                {
                    this.f96686a = r1;
                }

                public final void run() {
                    this.f96686a.f96685b.mo59511a(new Exception(th2));
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM$i */
    static final class C41450i extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseDetailShareVM f96691a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41267ad f96692b;

        static {
            Covode.recordClassIndex(49348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41450i(BaseDetailShareVM baseDetailShareVM, AbstractC41267ad adVar) {
            super(1);
            this.f96691a = baseDetailShareVM;
            this.f96692b = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            if (this.f96691a.f96656l != null) {
                this.f96691a.f96655k = false;
                this.f96691a.mo20667b((AbstractC89172b) new AbstractC89172b<S, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41450i.C414511 */

                    /* renamed from: a */
                    final /* synthetic */ C41450i f96693a;

                    static {
                        Covode.recordClassIndex(49349);
                    }

                    {
                        this.f96693a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Object obj) {
                        final boolean z;
                        final ArrayList arrayList;
                        AbstractC14527i iVar = (AbstractC14527i) obj;
                        C89219l.m154721d(iVar, "");
                        C14533l a = iVar.mo23370d().mo20635a();
                        if (a != null) {
                            z = a.f35141a;
                        } else {
                            z = false;
                        }
                        List<ITEM> c = iVar.mo23369c();
                        if (c != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (ITEM item : c) {
                                Aweme b = this.f96693a.f96691a.mo70713b((AbstractC17641a) item);
                                if (b != null) {
                                    arrayList2.add(b);
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        C34727m.m70944a(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM.C41450i.C414511.RunnableC414521 */

                            /* renamed from: a */
                            final /* synthetic */ C414511 f96694a;

                            static {
                                Covode.recordClassIndex(49350);
                            }

                            {
                                this.f96694a = r1;
                            }

                            public final void run() {
                                this.f96694a.f96693a.f96692b.mo59523c(arrayList, z);
                            }
                        });
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean deleteItem(String str) {
        C89219l.m154721d(str, "");
        int a = mo70711a(str);
        if (a < 0) {
            return false;
        }
        AbstractC41267ad adVar = this.f96656l;
        if (adVar == null) {
            return true;
        }
        adVar.mo62671b(a);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        this.f96656l = adVar;
        mo20663a(C41456a.f96700a, C12856l.m23100a(), new C41438d(this, adVar), new C41440e(this, adVar), new C41442f(this, adVar));
        mo20663a(C41457b.f96701a, C12856l.m23100a(), new C41446g(this, adVar), new C41448h(this, adVar), new C41450i(this, adVar));
        mo20663a(C41458c.f96702a, C12856l.m23100a(), new C41431a(this, adVar), new C41433b(this, adVar), new C41435c(this, adVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        Cursor a = mo70712a(bVar);
        if (i == 1) {
            mo23342g();
        } else if (i == 2) {
            mo23341b((Object) a);
        } else if (i == 4) {
            mo23339a((Object) a);
        }
    }
}
