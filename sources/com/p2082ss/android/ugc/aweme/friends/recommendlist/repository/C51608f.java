package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.repository.C80099b;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.f */
public final class C51608f extends AbstractC51500a {

    /* renamed from: b */
    private final C51607e f118915b;

    /* renamed from: c */
    private final C51606d f118916c;

    /* renamed from: d */
    private final C51601a f118917d;

    /* renamed from: e */
    private final AbstractC20129c<String, User> f118918e;

    /* renamed from: f */
    private final C51624h f118919f;

    /* renamed from: g */
    private final C51603b f118920g = new C51603b();

    static {
        Covode.recordClassIndex(60951);
    }

    public C51608f() {
        C51607e eVar = new C51607e();
        this.f118915b = eVar;
        C51606d dVar = new C51606d();
        this.f118916c = dVar;
        C51601a aVar = new C51601a();
        this.f118917d = aVar;
        AbstractC20129c<String, User> a = UserService.m138861d().mo123560a();
        this.f118918e = a;
        C51624h hVar = new C51624h();
        this.f118919f = hVar;
        mo33651a(eVar, dVar, new C51609a());
        mo33651a(hVar, dVar, new C51612b());
        mo33650a(dVar, a, new C51618d());
        mo33649a(a, dVar, new C51615c());
        mo33652b(aVar, dVar, new C51620e());
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.f$a */
    public static final class C51609a extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20278c<C51623g, List<? extends C80099b>, Integer, List<? extends C80099b>>, C89391z> {
        static {
            Covode.recordClassIndex(60952);
        }

        public C51609a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20272a.C20278c<C51623g, List<? extends C80099b>, Integer, List<? extends C80099b>> cVar) {
            invoke((AbstractC20272a.C20278c<C51623g, List<C80099b>, Integer, List<C80099b>>) cVar);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20272a.C20278c<C51623g, List<C80099b>, Integer, List<C80099b>> cVar) {
            C89219l.m154719c(cVar, "");
            cVar.mo33643a(new AbstractC89183m<C51623g, List<? extends C80099b>, Integer>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51608f.C51609a.C516101 */

                /* renamed from: a */
                final /* synthetic */ C51609a f118921a;

                static {
                    Covode.recordClassIndex(60953);
                }

                {
                    this.f118921a = r2;
                }

                public final Integer invoke(C51623g gVar, List<? extends C80099b> list) {
                    return Integer.valueOf(gVar.f118931d);
                }
            });
            cVar.mo33644a(new AbstractC89187q<C51623g, List<? extends C80099b>, List<? extends C80099b>, List<? extends C80099b>>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51608f.C51609a.C516112 */

                /* renamed from: a */
                final /* synthetic */ C51609a f118922a;

                static {
                    Covode.recordClassIndex(60954);
                }

                {
                    this.f118922a = r2;
                }

                /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0014 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.ss.android.ugc.aweme.user.repository.b>, java.util.List<? extends com.ss.android.ugc.aweme.user.repository.b>] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r4v3, types: [h.a.z] */
                public final List<C80099b> invoke(C51623g gVar, List<? extends C80099b> list, List<? extends C80099b> list2) {
                    Integer num = gVar.f118929b;
                    if (num != null && num.intValue() != 0) {
                        if (list2 == null) {
                            list2 = C89086z.INSTANCE;
                        }
                        if (list != 0 || (list = C89086z.INSTANCE) != 0) {
                            return C89070n.m154572d((Collection) list2, (Iterable) list);
                        }
                        throw new RuntimeException();
                    } else if (list != 0) {
                        return list;
                    } else {
                        return null;
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.f$b */
    public static final class C51612b extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20278c<C51626i, List<? extends C80099b>, Integer, List<? extends C80099b>>, C89391z> {
        static {
            Covode.recordClassIndex(60955);
        }

        public C51612b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20272a.C20278c<C51626i, List<? extends C80099b>, Integer, List<? extends C80099b>> cVar) {
            invoke((AbstractC20272a.C20278c<C51626i, List<C80099b>, Integer, List<C80099b>>) cVar);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20272a.C20278c<C51626i, List<C80099b>, Integer, List<C80099b>> cVar) {
            C89219l.m154719c(cVar, "");
            cVar.mo33643a(new AbstractC89183m<C51626i, List<? extends C80099b>, Integer>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51608f.C51612b.C516131 */

                /* renamed from: a */
                final /* synthetic */ C51612b f118923a;

                static {
                    Covode.recordClassIndex(60956);
                }

                {
                    this.f118923a = r2;
                }

                public final Integer invoke(C51626i iVar, List<? extends C80099b> list) {
                    return Integer.valueOf(iVar.f118942d);
                }
            });
            cVar.mo33644a(new AbstractC89187q<C51626i, List<? extends C80099b>, List<? extends C80099b>, List<? extends C80099b>>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51608f.C51612b.C516142 */

                /* renamed from: a */
                final /* synthetic */ C51612b f118924a;

                static {
                    Covode.recordClassIndex(60957);
                }

                {
                    this.f118924a = r2;
                }

                /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0014 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.ss.android.ugc.aweme.user.repository.b>, java.util.List<? extends com.ss.android.ugc.aweme.user.repository.b>] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r4v3, types: [h.a.z] */
                public final List<C80099b> invoke(C51626i iVar, List<? extends C80099b> list, List<? extends C80099b> list2) {
                    Integer num = iVar.f118940b;
                    if (num != null && num.intValue() != 0) {
                        if (list2 == null) {
                            list2 = C89086z.INSTANCE;
                        }
                        if (list != 0 || (list = C89086z.INSTANCE) != 0) {
                            return C89070n.m154572d((Collection) list2, (Iterable) list);
                        }
                        throw new RuntimeException();
                    } else if (list != 0) {
                        return list;
                    } else {
                        return null;
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.f$c */
    public static final class C51615c extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<? extends C80099b>>, C89391z> {
        static {
            Covode.recordClassIndex(60958);
        }

        public C51615c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<? extends C80099b>> dVar) {
            invoke((AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<C80099b>>) dVar);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<C80099b>> dVar) {
            C89219l.m154719c(dVar, "");
            dVar.mo33645a(C516161.INSTANCE);
            dVar.mo33646b(new AbstractC89183m<User, List<? extends C80099b>, List<? extends C80099b>>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51608f.C51615c.C516172 */

                /* renamed from: a */
                final /* synthetic */ C51615c f118925a;

                static {
                    Covode.recordClassIndex(60960);
                }

                {
                    this.f118925a = r2;
                }

                public final List<C80099b> invoke(User user, List<? extends C80099b> list) {
                    C89219l.m154719c(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        User user2 = user;
                        T t2 = t;
                        if (C89219l.m154714a((Object) t2.f179474a.getUid(), (Object) user2.getUid())) {
                            C89219l.m154721d(user2, "");
                            t2.f179474a = user2;
                            t = t2;
                        }
                        arrayList.add(t);
                    }
                    return arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.f$d */
    public static final class C51618d extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20273a<? extends Object, List<? extends C80099b>, String, User>, C89391z> {
        static {
            Covode.recordClassIndex(60961);
        }

        public C51618d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20272a.C20273a<? extends Object, List<? extends C80099b>, String, User> aVar) {
            invoke((AbstractC20272a.C20273a<? extends Object, List<C80099b>, String, User>) aVar);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20272a.C20273a<? extends Object, List<C80099b>, String, User> aVar) {
            C89219l.m154719c(aVar, "");
            aVar.mo33642a(new AbstractC89172b<List<? extends C80099b>, List<? extends C89378p<? extends String, ? extends User>>>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51608f.C51618d.C516191 */

                /* renamed from: a */
                final /* synthetic */ C51618d f118926a;

                static {
                    Covode.recordClassIndex(60962);
                }

                {
                    this.f118926a = r2;
                }

                public final List<C89378p<String, User>> invoke(List<? extends C80099b> list) {
                    C89219l.m154719c(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        arrayList.add(C89387v.m154943a(t.f179474a.getUid(), t.f179474a));
                    }
                    return arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.f$e */
    public static final class C51620e extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20281d<String, String, Integer, List<? extends C80099b>>, C89391z> {
        static {
            Covode.recordClassIndex(60963);
        }

        public C51620e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20272a.C20281d<String, String, Integer, List<? extends C80099b>> dVar) {
            invoke((AbstractC20272a.C20281d<String, String, Integer, List<C80099b>>) dVar);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20272a.C20281d<String, String, Integer, List<C80099b>> dVar) {
            C89219l.m154719c(dVar, "");
            dVar.mo33645a(C516211.INSTANCE);
            dVar.mo33646b(new AbstractC89183m<String, List<? extends C80099b>, List<? extends C80099b>>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51608f.C51620e.C516222 */

                /* renamed from: a */
                final /* synthetic */ C51620e f118927a;

                static {
                    Covode.recordClassIndex(60965);
                }

                {
                    this.f118927a = r2;
                }

                public final List<C80099b> invoke(String str, List<? extends C80099b> list) {
                    C89219l.m154719c(list, "");
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (!C89219l.m154714a((Object) t.f179474a.getUid(), (Object) str)) {
                            arrayList.add(t);
                        }
                    }
                    return arrayList;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a
    /* renamed from: a */
    public final AbstractC88979t<C20169f<List<C80099b>>> mo87015a(int i) {
        return C20165b.m38138a(this.f118916c).mo33475a(Integer.valueOf(i), C20165b.m38139a(this.f118915b));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a
    /* renamed from: a */
    public final AbstractC88403ab<String> mo87014a(String str, String str2) {
        C89219l.m154721d(str, "");
        AbstractC88403ab<String> a = AbstractC88403ab.m153601a((AbstractC88984x) this.f118917d.mo33487c(new DislikeRecommendParams(str, str2)));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a
    /* renamed from: a */
    public final AbstractC88979t<RecommendUserDialogList> mo87016a(Integer num, Integer num2, String str) {
        Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RecommendUserDialogApi.class);
        C89219l.m154716b(a, "");
        return ((RecommendUserDialogApi) a).fetchRecommendUserDialogList(num, num2, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a
    /* renamed from: b */
    public final AbstractC88979t<RecommendList> mo87018b(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, Integer num5, String str3) {
        return this.f118919f.mo33487c(new C51626i(num, num2, str, i, num3, num4, str2, num5, str3));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a
    /* renamed from: a */
    public final AbstractC88979t<RecommendList> mo87017a(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, Integer num5, String str3) {
        return this.f118915b.mo33487c(new C51623g(num, num2, str, i, num3, num4, str2, num5, str3));
    }
}
