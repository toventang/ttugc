package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.favorites.api.C47190b;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import com.p2082ss.android.ugc.aweme.favorites.api.C47195e;
import com.p2082ss.android.ugc.aweme.favorites.model.AbstractC47491k;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel */
public final class VideoCollectionListViewModel extends AssemViewModel<C47803e> {

    /* renamed from: j */
    private final AbstractC89244h f110721j = C12646c.m22777a(this, C47796c.f110743a);

    static {
        Covode.recordClassIndex(56407);
    }

    /* renamed from: g */
    public final AbstractC12644a<AbstractC47491k> mo23342g() {
        return (AbstractC12644a) this.f110721j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel$c */
    static final class C47796c extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC47491k>> {

        /* renamed from: a */
        public static final C47796c f110743a = new C47796c();

        static {
            Covode.recordClassIndex(56422);
        }

        C47796c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC47491k> invoke() {
            return new C47481j();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C47803e mo20674f() {
        return new C47803e();
    }

    /* renamed from: a */
    public final void mo79857a(boolean z) {
        mo20667b(new C47789b(this, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel$b */
    public static final class C47789b extends AbstractC89220m implements AbstractC89172b<C47803e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionListViewModel f110733a;

        /* renamed from: b */
        final /* synthetic */ boolean f110734b;

        static {
            Covode.recordClassIndex(56415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47789b(VideoCollectionListViewModel videoCollectionListViewModel, boolean z) {
            super(1);
            this.f110733a = videoCollectionListViewModel;
            this.f110734b = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel$b$a */
        public static final class C47794a<T1, T2, R> implements AbstractC88430c<C47195e, C47190b, R> {

            /* renamed from: a */
            final /* synthetic */ C47789b f110739a;

            /* renamed from: b */
            final /* synthetic */ List f110740b;

            static {
                Covode.recordClassIndex(56420);
            }

            public C47794a(C47789b bVar, List list) {
                this.f110739a = bVar;
                this.f110740b = list;
            }

            /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel$b$a$a */
            static final class C47795a extends AbstractC89220m implements AbstractC89172b<C47803e, C47803e> {

                /* renamed from: a */
                final /* synthetic */ List f110741a;

                /* renamed from: b */
                final /* synthetic */ C47195e f110742b;

                static {
                    Covode.recordClassIndex(56421);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C47795a(List list, C47195e eVar) {
                    super(1);
                    this.f110741a = list;
                    this.f110742b = eVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C47803e invoke(C47803e eVar) {
                    long j;
                    boolean z;
                    C89219l.m154721d(eVar, "");
                    C12792n nVar = new C12792n(this.f110741a);
                    Long l = this.f110742b.f109851b;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    Boolean bool = this.f110742b.f109852c;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    return C47803e.m90814a(nVar, j, z);
                }
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88430c
            /* renamed from: a */
            public final R mo9210a(C47195e eVar, C47190b bVar) {
                List<C47192d> list;
                C47192d.C47193a aVar;
                C47190b bVar2 = bVar;
                C47195e eVar2 = eVar;
                R r = (R) new ArrayList();
                List list2 = this.f110740b;
                if (list2 != null && !list2.isEmpty()) {
                    r.addAll(this.f110740b);
                }
                if (!(bVar2.f109838a == null || (aVar = bVar2.f109838a.f109846e) == null || !aVar.f109848b)) {
                    r.add(new C47799b(bVar2.f109838a, 1));
                }
                if ((!r.isEmpty()) && (list = eVar2.f109850a) != null && !list.isEmpty()) {
                    List<C47192d> list3 = eVar2.f109850a;
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C47799b(it.next(), 2));
                    }
                    r.addAll(arrayList);
                }
                this.f110739a.f110733a.mo20662a(new C47795a(r, eVar2));
                return r;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47803e eVar) {
            long j;
            List<C47799b> a;
            AbstractC88979t<C47190b> b;
            C47803e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (this.f110734b || eVar2.f110756c) {
                if (this.f110734b || (eVar2.f110754a instanceof C12797s) || (eVar2.f110754a instanceof C12785h)) {
                    this.f110733a.mo20662a(C477901.f110735a);
                }
                if (this.f110734b) {
                    j = 0;
                } else {
                    j = eVar2.f110755b;
                }
                if (this.f110734b) {
                    a = C89086z.INSTANCE;
                } else {
                    a = eVar2.f110754a.mo20635a();
                }
                AbstractC88979t a2 = AbstractC47491k.C47492a.m90550a(this.f110733a.mo23342g().mo20458a(), j);
                if (j == 0) {
                    b = this.f110733a.mo23342g().mo20458a().mo79752a(1);
                } else {
                    b = AbstractC88979t.m154310b(new C47190b((byte) 0));
                    C89219l.m154716b(b, "");
                }
                VideoCollectionListViewModel videoCollectionListViewModel = this.f110733a;
                AbstractC88979t a3 = a2.mo143270a(b, new C47794a(this, a));
                C89219l.m154709a((Object) a3, "");
                AbstractC88412b a4 = a3.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(C477912.f110736a, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.C47789b.C477923 */

                    /* renamed from: a */
                    final /* synthetic */ C47789b f110737a;

                    static {
                        Covode.recordClassIndex(56418);
                    }

                    {
                        this.f110737a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f110737a.f110733a.mo20662a(new AbstractC89172b<C47803e, C47803e>() {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.C47789b.C477923.C477931 */

                            static {
                                Covode.recordClassIndex(56419);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47803e invoke(C47803e eVar) {
                                C47803e eVar2 = eVar;
                                C89219l.m154721d(eVar2, "");
                                Throwable th = th;
                                C89219l.m154716b(th, "");
                                return C47803e.m90814a(new C12785h(th), eVar2.f110755b, eVar2.f110756c);
                            }
                        });
                    }
                });
                C89219l.m154716b(a4, "");
                videoCollectionListViewModel.mo20659a(a4);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel$a */
    static final class C47782a extends AbstractC89220m implements AbstractC89172b<C47803e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionListViewModel f110722a;

        /* renamed from: b */
        final /* synthetic */ boolean f110723b;

        /* renamed from: c */
        final /* synthetic */ String f110724c;

        static {
            Covode.recordClassIndex(56408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47782a(VideoCollectionListViewModel videoCollectionListViewModel, boolean z, String str) {
            super(1);
            this.f110722a = videoCollectionListViewModel;
            this.f110723b = z;
            this.f110724c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47803e eVar) {
            long j;
            final List<C47799b> a;
            C47803e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (this.f110723b || eVar2.f110756c) {
                if (this.f110723b || (eVar2.f110754a instanceof C12797s) || (eVar2.f110754a instanceof C12785h)) {
                    this.f110722a.mo20662a(C477831.f110725a);
                }
                if (this.f110723b) {
                    j = 0;
                } else {
                    j = eVar2.f110755b;
                }
                if (this.f110723b) {
                    a = C89086z.INSTANCE;
                } else {
                    a = eVar2.f110754a.mo20635a();
                }
                VideoCollectionListViewModel videoCollectionListViewModel = this.f110722a;
                AbstractC88412b a2 = videoCollectionListViewModel.mo23342g().mo20458a().mo79754a(j, this.f110724c).mo143292d(new AbstractC88434g(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.C47782a.C477842 */

                    /* renamed from: a */
                    final /* synthetic */ C47782a f110726a;

                    static {
                        Covode.recordClassIndex(56410);
                    }

                    {
                        this.f110726a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88434g
                    public final /* synthetic */ Object apply(Object obj) {
                        final C47195e eVar = (C47195e) obj;
                        C89219l.m154721d(eVar, "");
                        final ArrayList arrayList = new ArrayList();
                        List list = a;
                        if (list != null && !list.isEmpty()) {
                            arrayList.addAll(a);
                        }
                        List<C47192d> list2 = eVar.f109850a;
                        if (list2 != null && !list2.isEmpty()) {
                            List<C47192d> list3 = eVar.f109850a;
                            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list3, 10));
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new C47799b(it.next(), 2));
                            }
                            arrayList.addAll(arrayList2);
                        }
                        this.f110726a.f110722a.mo20662a(new AbstractC89172b<C47803e, C47803e>() {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.C47782a.C477842.C477851 */

                            static {
                                Covode.recordClassIndex(56411);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47803e invoke(C47803e eVar) {
                                long j;
                                boolean z;
                                C89219l.m154721d(eVar, "");
                                C12792n nVar = new C12792n(arrayList);
                                Long l = eVar.f109851b;
                                if (l != null) {
                                    j = l.longValue();
                                } else {
                                    j = 0;
                                }
                                Boolean bool = eVar.f109852c;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                } else {
                                    z = false;
                                }
                                return C47803e.m90814a(nVar, j, z);
                            }
                        });
                        return arrayList;
                    }
                }).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(C477863.f110730a, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.C47782a.C477874 */

                    /* renamed from: a */
                    final /* synthetic */ C47782a f110731a;

                    static {
                        Covode.recordClassIndex(56413);
                    }

                    {
                        this.f110731a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f110731a.f110722a.mo20662a(new AbstractC89172b<C47803e, C47803e>() {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.C47782a.C477874.C477881 */

                            static {
                                Covode.recordClassIndex(56414);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47803e invoke(C47803e eVar) {
                                C47803e eVar2 = eVar;
                                C89219l.m154721d(eVar2, "");
                                Throwable th = th;
                                C89219l.m154716b(th, "");
                                return C47803e.m90814a(new C12785h(th), eVar2.f110755b, eVar2.f110756c);
                            }
                        });
                    }
                });
                C89219l.m154716b(a2, "");
                videoCollectionListViewModel.mo20659a(a2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo79858a(boolean z, String str) {
        mo20667b(new C47782a(this, z, str));
    }
}
