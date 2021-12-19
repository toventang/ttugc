package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.favorites.api.C47191c;
import com.p2082ss.android.ugc.aweme.favorites.model.AbstractC47491k;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
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

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel */
public final class VideoCollectionContentViewModel extends AssemViewModel<C47802d> {

    /* renamed from: k */
    public static final C47759a f110690k = new C47759a((byte) 0);

    /* renamed from: j */
    public String f110691j;

    /* renamed from: l */
    private final AbstractC89244h f110692l = C12646c.m22777a(this, C47780f.f110719a);

    static {
        Covode.recordClassIndex(56383);
    }

    /* renamed from: g */
    public final AbstractC12644a<AbstractC47491k> mo23342g() {
        return (AbstractC12644a) this.f110692l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$a */
    public static final class C47759a {
        static {
            Covode.recordClassIndex(56384);
        }

        private C47759a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$a$a */
        public static final class C47760a implements C1175ad.AbstractC1177b {

            /* renamed from: a */
            final /* synthetic */ String f110693a;

            static {
                Covode.recordClassIndex(56385);
            }

            C47760a(String str) {
                this.f110693a = str;
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                if (AssemViewModel.class.isAssignableFrom(cls)) {
                    return cls.getConstructor(String.class).newInstance(this.f110693a);
                }
                throw new IllegalArgumentException("Custom ViewModel must be a subclass of VideoCollectionContentViewModel.");
            }
        }

        public /* synthetic */ C47759a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C1175ad.AbstractC1177b m90805a(String str) {
            C89219l.m154721d(str, "");
            return new C47760a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$f */
    static final class C47780f extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC47491k>> {

        /* renamed from: a */
        public static final C47780f f110719a = new C47780f();

        static {
            Covode.recordClassIndex(56405);
        }

        C47780f() {
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
    public final /* synthetic */ C47802d mo20674f() {
        return new C47802d();
    }

    public VideoCollectionContentViewModel() {
    }

    /* renamed from: a */
    public final void mo79853a(boolean z) {
        mo20662a(new C47779e(z));
    }

    /* renamed from: b */
    public final void mo79854b(boolean z) {
        mo20667b(new C47767c(this, z));
    }

    /* renamed from: c */
    public final void mo79855c(boolean z) {
        mo20667b(new C47761b(this, z));
    }

    /* renamed from: d */
    public final void mo79856d(boolean z) {
        mo20667b(new C47773d(this, z));
    }

    public VideoCollectionContentViewModel(String str) {
        C89219l.m154721d(str, "");
        this.f110691j = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$b */
    static final class C47761b extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionContentViewModel f110694a;

        /* renamed from: b */
        final /* synthetic */ boolean f110695b;

        static {
            Covode.recordClassIndex(56386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47761b(VideoCollectionContentViewModel videoCollectionContentViewModel, boolean z) {
            super(1);
            this.f110694a = videoCollectionContentViewModel;
            this.f110695b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47802d dVar) {
            long j;
            C47802d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (this.f110695b || dVar2.f110753c) {
                if (this.f110695b || (dVar2.f110751a instanceof C12797s) || (dVar2.f110751a instanceof C12785h)) {
                    this.f110694a.mo20662a(C477621.f110696a);
                }
                if (this.f110695b) {
                    j = 0;
                } else {
                    j = dVar2.f110752b;
                }
                VideoCollectionContentViewModel videoCollectionContentViewModel = this.f110694a;
                AbstractC88412b a = videoCollectionContentViewModel.mo23342g().mo20458a().mo79753a(j).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47761b.C477632 */

                    /* renamed from: a */
                    final /* synthetic */ C47761b f110697a;

                    static {
                        Covode.recordClassIndex(56388);
                    }

                    {
                        this.f110697a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final C47191c cVar = (C47191c) obj;
                        this.f110697a.f110694a.mo20662a(new AbstractC89172b<C47802d, C47802d>(this) {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47761b.C477632.C477641 */

                            /* renamed from: a */
                            final /* synthetic */ C477632 f110698a;

                            static {
                                Covode.recordClassIndex(56389);
                            }

                            {
                                this.f110698a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47802d invoke(C47802d dVar) {
                                Long l;
                                List<C47797a> a;
                                C47802d dVar2 = dVar;
                                C89219l.m154721d(dVar2, "");
                                ALog.m59865d("Collections", "get videos in allfavorites: cursor = " + dVar2.f110752b + ", maxCursor = " + cVar.f109840b);
                                Long l2 = cVar.f109840b;
                                long j = dVar2.f110752b;
                                long j2 = 0;
                                if (l2 != null && l2.longValue() == j && ((l = cVar.f109840b) == null || l.longValue() != 0)) {
                                    return dVar2;
                                }
                                if (this.f110698a.f110697a.f110695b) {
                                    a = C89086z.INSTANCE;
                                } else {
                                    a = dVar2.f110751a.mo20635a();
                                    if (a == null) {
                                        a = C89086z.INSTANCE;
                                    }
                                }
                                ArrayList arrayList = new ArrayList();
                                boolean z = false;
                                if (a != null && !a.isEmpty()) {
                                    arrayList.addAll(a);
                                }
                                List<Aweme> list = cVar.f109839a;
                                if (list != null && !list.isEmpty()) {
                                    List<Aweme> list2 = cVar.f109839a;
                                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new C47797a(it.next(), 0));
                                    }
                                    arrayList.addAll(arrayList2);
                                }
                                C12792n nVar = new C12792n(arrayList);
                                Long l3 = cVar.f109840b;
                                if (l3 != null) {
                                    j2 = l3.longValue();
                                }
                                Boolean bool = cVar.f109841c;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                }
                                return new C47802d(nVar, j2, z);
                            }
                        });
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47761b.C477653 */

                    /* renamed from: a */
                    final /* synthetic */ C47761b f110700a;

                    static {
                        Covode.recordClassIndex(56390);
                    }

                    {
                        this.f110700a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f110700a.f110694a.mo20662a(new AbstractC89172b<C47802d, C47802d>() {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47761b.C477653.C477661 */

                            static {
                                Covode.recordClassIndex(56391);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47802d invoke(C47802d dVar) {
                                C47802d dVar2 = dVar;
                                C89219l.m154721d(dVar2, "");
                                Throwable th = th;
                                C89219l.m154716b(th, "");
                                return C47802d.m90812a(new C12785h(th), dVar2.f110752b, dVar2.f110753c);
                            }
                        });
                    }
                });
                C89219l.m154716b(a, "");
                videoCollectionContentViewModel.mo20659a(a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$c */
    static final class C47767c extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionContentViewModel f110702a;

        /* renamed from: b */
        final /* synthetic */ boolean f110703b;

        static {
            Covode.recordClassIndex(56392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47767c(VideoCollectionContentViewModel videoCollectionContentViewModel, boolean z) {
            super(1);
            this.f110702a = videoCollectionContentViewModel;
            this.f110703b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47802d dVar) {
            long j;
            C47802d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (this.f110703b || dVar2.f110753c) {
                if (this.f110703b || (dVar2.f110751a instanceof C12797s) || (dVar2.f110751a instanceof C12785h)) {
                    this.f110702a.mo20662a(C477681.f110704a);
                }
                if (this.f110703b) {
                    j = 0;
                } else {
                    j = dVar2.f110752b;
                }
                VideoCollectionContentViewModel videoCollectionContentViewModel = this.f110702a;
                AbstractC88412b a = videoCollectionContentViewModel.mo23342g().mo20458a().mo79758b(j).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47767c.C477692 */

                    /* renamed from: a */
                    final /* synthetic */ C47767c f110705a;

                    static {
                        Covode.recordClassIndex(56394);
                    }

                    {
                        this.f110705a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final C47191c cVar = (C47191c) obj;
                        this.f110705a.f110702a.mo20662a(new AbstractC89172b<C47802d, C47802d>(this) {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47767c.C477692.C477701 */

                            /* renamed from: a */
                            final /* synthetic */ C477692 f110706a;

                            static {
                                Covode.recordClassIndex(56395);
                            }

                            {
                                this.f110706a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47802d invoke(C47802d dVar) {
                                Long l;
                                List<C47797a> a;
                                C47802d dVar2 = dVar;
                                C89219l.m154721d(dVar2, "");
                                ALog.m59865d("Collections", "get videos in candidate: cursor = " + dVar2.f110752b + ", maxCursor = " + cVar.f109840b);
                                Long l2 = cVar.f109840b;
                                long j = dVar2.f110752b;
                                long j2 = 0;
                                if (l2 != null && l2.longValue() == j && ((l = cVar.f109840b) == null || l.longValue() != 0)) {
                                    return dVar2;
                                }
                                if (this.f110706a.f110705a.f110703b) {
                                    a = C89086z.INSTANCE;
                                } else {
                                    a = dVar2.f110751a.mo20635a();
                                    if (a == null) {
                                        a = C89086z.INSTANCE;
                                    }
                                }
                                ArrayList arrayList = new ArrayList();
                                boolean z = false;
                                if (a != null && !a.isEmpty()) {
                                    arrayList.addAll(a);
                                }
                                List<Aweme> list = cVar.f109839a;
                                if (list != null && !list.isEmpty()) {
                                    List<Aweme> list2 = cVar.f109839a;
                                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new C47797a(it.next(), 1));
                                    }
                                    arrayList.addAll(arrayList2);
                                }
                                C12792n nVar = new C12792n(arrayList);
                                Long l3 = cVar.f109840b;
                                if (l3 != null) {
                                    j2 = l3.longValue();
                                }
                                Boolean bool = cVar.f109841c;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                }
                                return new C47802d(nVar, j2, z);
                            }
                        });
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47767c.C477713 */

                    /* renamed from: a */
                    final /* synthetic */ C47767c f110708a;

                    static {
                        Covode.recordClassIndex(56396);
                    }

                    {
                        this.f110708a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f110708a.f110702a.mo20662a(new AbstractC89172b<C47802d, C47802d>() {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47767c.C477713.C477721 */

                            static {
                                Covode.recordClassIndex(56397);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47802d invoke(C47802d dVar) {
                                C47802d dVar2 = dVar;
                                C89219l.m154721d(dVar2, "");
                                Throwable th = th;
                                C89219l.m154716b(th, "");
                                return C47802d.m90812a(new C12785h(th), dVar2.f110752b, dVar2.f110753c);
                            }
                        });
                    }
                });
                C89219l.m154716b(a, "");
                videoCollectionContentViewModel.mo20659a(a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$d */
    static final class C47773d extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionContentViewModel f110710a;

        /* renamed from: b */
        final /* synthetic */ boolean f110711b;

        static {
            Covode.recordClassIndex(56398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47773d(VideoCollectionContentViewModel videoCollectionContentViewModel, boolean z) {
            super(1);
            this.f110710a = videoCollectionContentViewModel;
            this.f110711b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47802d dVar) {
            long j;
            C47802d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            String str = this.f110710a.f110691j;
            if (str != null && (this.f110711b || dVar2.f110753c)) {
                if (this.f110711b || (dVar2.f110751a instanceof C12797s) || (dVar2.f110751a instanceof C12785h)) {
                    this.f110710a.mo20662a(C477741.f110712a);
                }
                if (this.f110711b) {
                    j = 0;
                } else {
                    j = dVar2.f110752b;
                }
                VideoCollectionContentViewModel videoCollectionContentViewModel = this.f110710a;
                AbstractC88412b a = videoCollectionContentViewModel.mo23342g().mo20458a().mo79757a(str, j).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47773d.C477752 */

                    /* renamed from: a */
                    final /* synthetic */ C47773d f110713a;

                    static {
                        Covode.recordClassIndex(56400);
                    }

                    {
                        this.f110713a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final C47191c cVar = (C47191c) obj;
                        this.f110713a.f110710a.mo20662a(new AbstractC89172b<C47802d, C47802d>(this) {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47773d.C477752.C477761 */

                            /* renamed from: a */
                            final /* synthetic */ C477752 f110714a;

                            static {
                                Covode.recordClassIndex(56401);
                            }

                            {
                                this.f110714a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47802d invoke(C47802d dVar) {
                                Long l;
                                List<C47797a> a;
                                int i;
                                C47802d dVar2 = dVar;
                                C89219l.m154721d(dVar2, "");
                                ALog.m59865d("Collections", "get videos in collection: cursor = " + dVar2.f110752b + ", maxCursor = " + cVar.f109840b);
                                Long l2 = cVar.f109840b;
                                long j = dVar2.f110752b;
                                long j2 = 0;
                                if (l2 != null && l2.longValue() == j && ((l = cVar.f109840b) == null || l.longValue() != 0)) {
                                    return dVar2;
                                }
                                if (this.f110714a.f110713a.f110711b) {
                                    a = C89086z.INSTANCE;
                                } else {
                                    a = dVar2.f110751a.mo20635a();
                                    if (a == null) {
                                        a = C89086z.INSTANCE;
                                    }
                                }
                                boolean z = false;
                                if (!(a instanceof Collection) || !a.isEmpty()) {
                                    Iterator<T> it = a.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (it.next().f110746b != 0) {
                                                i = 0;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                i = 1;
                                int i2 = i ^ 1;
                                ArrayList arrayList = new ArrayList();
                                if (a != null && !a.isEmpty()) {
                                    arrayList.addAll(a);
                                }
                                List<Aweme> list = cVar.f109839a;
                                if (list != null && !list.isEmpty()) {
                                    List<Aweme> list2 = cVar.f109839a;
                                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                                    Iterator<T> it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(new C47797a(it2.next(), i2));
                                    }
                                    arrayList.addAll(arrayList2);
                                }
                                C12792n nVar = new C12792n(arrayList);
                                Long l3 = cVar.f109840b;
                                if (l3 != null) {
                                    j2 = l3.longValue();
                                }
                                Boolean bool = cVar.f109841c;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                }
                                return new C47802d(nVar, j2, z);
                            }
                        });
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47773d.C477773 */

                    /* renamed from: a */
                    final /* synthetic */ C47773d f110716a;

                    static {
                        Covode.recordClassIndex(56402);
                    }

                    {
                        this.f110716a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f110716a.f110710a.mo20662a(new AbstractC89172b<C47802d, C47802d>() {
                            /* class com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47773d.C477773.C477781 */

                            static {
                                Covode.recordClassIndex(56403);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C47802d invoke(C47802d dVar) {
                                C47802d dVar2 = dVar;
                                C89219l.m154721d(dVar2, "");
                                Throwable th = th;
                                C89219l.m154716b(th, "");
                                return C47802d.m90812a(new C12785h(th), dVar2.f110752b, dVar2.f110753c);
                            }
                        });
                    }
                });
                C89219l.m154716b(a, "");
                videoCollectionContentViewModel.mo20659a(a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$e */
    static final class C47779e extends AbstractC89220m implements AbstractC89172b<C47802d, C47802d> {

        /* renamed from: a */
        final /* synthetic */ boolean f110718a;

        static {
            Covode.recordClassIndex(56404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47779e(boolean z) {
            super(1);
            this.f110718a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x003b */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [h.a.z] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.ArrayList] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d invoke(com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.favorites.viewmodel.d r6 = (com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d) r6
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
                com.bytedance.assem.arch.extensions.f<java.util.List<com.ss.android.ugc.aweme.favorites.viewmodel.a>> r0 = r6.f110751a
                java.lang.Object r2 = r0.mo20635a()
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x0039
                java.util.ArrayList r1 = new java.util.ArrayList
                r0 = 10
                int r0 = p4600h.p4601a.C89070n.m154526a(r2, r0)
                r1.<init>(r0)
                java.util.Iterator r4 = r2.iterator()
            L_0x0020:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                com.ss.android.ugc.aweme.favorites.viewmodel.a r0 = (com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a) r0
                com.ss.android.ugc.aweme.favorites.viewmodel.a r3 = new com.ss.android.ugc.aweme.favorites.viewmodel.a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f110745a
                boolean r0 = r5.f110718a
                r3.<init>(r2, r0)
                r1.add(r3)
                goto L_0x0020
            L_0x0039:
                h.a.z r1 = p4600h.p4601a.C89086z.INSTANCE
            L_0x003b:
                com.bytedance.assem.arch.extensions.n r0 = new com.bytedance.assem.arch.extensions.n
                r0.<init>(r1)
                com.ss.android.ugc.aweme.favorites.viewmodel.d r0 = com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d.m90813a(r6, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.C47779e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$g */
    public static final class C47781g extends AbstractC89220m implements AbstractC89172b<C47802d, C47802d> {

        /* renamed from: a */
        final /* synthetic */ C47797a f110720a;

        static {
            Covode.recordClassIndex(56406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47781g(C47797a aVar) {
            super(1);
            this.f110720a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C47802d invoke(C47802d dVar) {
            List list;
            C47802d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            List<C47797a> a = dVar2.f110751a.mo20635a();
            if (a != null) {
                list = new ArrayList(C89070n.m154526a((Iterable) a, 10));
                for (T t : a) {
                    if (C89219l.m154714a(t.f110745a, this.f110720a.f110745a)) {
                        t = (T) this.f110720a;
                    }
                    list.add(t);
                }
            } else {
                list = C89086z.INSTANCE;
            }
            return C47802d.m90812a(new C12792n(list), dVar2.f110752b, dVar2.f110753c);
        }
    }
}
