package com.p2082ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51104c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
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

/* renamed from: com.ss.android.ugc.aweme.following.repository.c */
public final class C51120c extends AbstractC20287b {

    /* renamed from: b */
    public final C51134g f117955b;

    /* renamed from: c */
    public final String f117956c = "FollowingListRepo";

    /* renamed from: d */
    public AbstractC88412b f117957d;

    /* renamed from: e */
    private final C51132e f117958e;

    /* renamed from: f */
    private final AbstractC20129c<String, User> f117959f;

    static {
        Covode.recordClassIndex(60318);
    }

    public C51120c() {
        C51132e eVar = new C51132e();
        this.f117958e = eVar;
        C51134g gVar = new C51134g();
        this.f117955b = gVar;
        AbstractC20129c<String, User> a = UserService.m138861d().mo123560a();
        this.f117959f = a;
        mo33651a(eVar, gVar, new C51123a());
        mo33650a(gVar, a, new C51129c());
        mo33649a(a, gVar, new C51126b());
        this.f117957d = C20165b.m38137a(a).mo33476a(true, new AbstractC20168e[0]).mo143254a(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.following.repository.C51120c.C511211 */

            /* renamed from: a */
            final /* synthetic */ C51120c f117960a;

            static {
                Covode.recordClassIndex(60319);
            }

            {
                this.f117960a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Iterable iterable;
                List<T> list = (List) obj;
                HashMap hashMap = new HashMap();
                C89219l.m154716b(list, "");
                for (T t : list) {
                    User user = (User) t.getSecond();
                    if (user != null) {
                        String uid = user.getUid();
                        C89219l.m154716b(uid, "");
                        hashMap.put(uid, user);
                    }
                }
                C89378p pVar = (C89378p) C89070n.m154583g(this.f117960a.f117955b.mo33470c());
                if (pVar == null || (iterable = (List) pVar.getSecond()) == null) {
                    iterable = C89086z.INSTANCE;
                }
                for (T t2 : iterable) {
                    User user2 = (User) hashMap.get(t2.getUid());
                    if (user2 != null) {
                        C89219l.m154716b(user2, "");
                        t2.setFollowStatus(user2.getFollowStatus());
                    }
                }
            }
        }, new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.following.repository.C51120c.C511222 */

            /* renamed from: a */
            final /* synthetic */ C51120c f117961a;

            static {
                Covode.recordClassIndex(60320);
            }

            {
                this.f117961a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C51423a.m95792b(this.f117961a.f117956c, "subscribe failed ".concat(String.valueOf(obj)));
            }
        });
    }

    /* renamed from: com.ss.android.ugc.aweme.following.repository.c$a */
    public static final class C51123a extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20278c<C51110a, List<? extends User>, C89391z, List<? extends User>>, C89391z> {
        static {
            Covode.recordClassIndex(60321);
        }

        public C51123a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20272a.C20278c<C51110a, List<? extends User>, C89391z, List<? extends User>> cVar) {
            invoke((AbstractC20272a.C20278c<C51110a, List<User>, C89391z, List<User>>) cVar);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20272a.C20278c<C51110a, List<User>, C89391z, List<User>> cVar) {
            C89219l.m154719c(cVar, "");
            cVar.mo33643a(new AbstractC89183m<C51110a, List<? extends User>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.repository.C51120c.C51123a.C511241 */

                /* renamed from: a */
                final /* synthetic */ C51123a f117962a;

                static {
                    Covode.recordClassIndex(60322);
                }

                {
                    this.f117962a = r2;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.following.repository.a */
                /* JADX WARN: Multi-variable type inference failed */
                public final C89391z invoke(C51110a aVar, List<? extends User> list) {
                    if (C89219l.m154714a(C51110a.class, C89391z.class)) {
                        Objects.requireNonNull(aVar, "null cannot be cast to non-null type kotlin.Unit");
                        return aVar;
                    } else if (C89219l.m154714a(C89391z.class, C89391z.class)) {
                        return C89391z.f203057a;
                    } else {
                        throw new RuntimeException();
                    }
                }
            });
            cVar.mo33644a(new AbstractC89187q<C51110a, List<? extends User>, List<? extends User>, List<? extends User>>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.repository.C51120c.C51123a.C511252 */

                /* renamed from: a */
                final /* synthetic */ C51123a f117963a;

                static {
                    Covode.recordClassIndex(60323);
                }

                {
                    this.f117963a = r2;
                }

                /* JADX DEBUG: Failed to insert an additional move for type inference into block B:5:0x0011 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User>] */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r7v3, types: [h.a.z] */
                public final List<User> invoke(C51110a aVar, List<? extends User> list, List<? extends User> list2) {
                    if (aVar.f117941c != 0) {
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

    /* renamed from: com.ss.android.ugc.aweme.following.repository.c$b */
    public static final class C51126b extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<? extends User>>, C89391z> {
        static {
            Covode.recordClassIndex(60324);
        }

        public C51126b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<? extends User>> dVar) {
            invoke((AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<User>>) dVar);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<User>> dVar) {
            C89219l.m154719c(dVar, "");
            dVar.mo33645a(C511271.INSTANCE);
            dVar.mo33646b(new AbstractC89183m<User, List<? extends User>, List<? extends User>>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.repository.C51120c.C51126b.C511282 */

                /* renamed from: a */
                final /* synthetic */ C51126b f117964a;

                static {
                    Covode.recordClassIndex(60326);
                }

                {
                    this.f117964a = r2;
                }

                public final List<User> invoke(User user, List<? extends User> list) {
                    C89219l.m154719c(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (User user2 : list) {
                        if (C89219l.m154714a((Object) user2.getUid(), (Object) user.getUid()) && (user instanceof Object) && user != null) {
                            user2 = user;
                        }
                        arrayList.add(user2);
                    }
                    return arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.repository.c$c */
    public static final class C51129c extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20273a<? extends Object, List<? extends User>, String, User>, C89391z> {
        static {
            Covode.recordClassIndex(60327);
        }

        public C51129c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20272a.C20273a<? extends Object, List<? extends User>, String, User> aVar) {
            invoke((AbstractC20272a.C20273a<? extends Object, List<User>, String, User>) aVar);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20272a.C20273a<? extends Object, List<User>, String, User> aVar) {
            C89219l.m154719c(aVar, "");
            aVar.mo33642a(new AbstractC89172b<List<? extends User>, List<? extends C89378p<? extends String, ? extends User>>>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.repository.C51120c.C51129c.C511301 */

                /* renamed from: a */
                final /* synthetic */ C51129c f117965a;

                static {
                    Covode.recordClassIndex(60328);
                }

                {
                    this.f117965a = r2;
                }

                public final List<C89378p<String, User>> invoke(List<? extends User> list) {
                    C89219l.m154719c(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        arrayList.add(C89387v.m154943a(t.getUid(), t));
                    }
                    return arrayList;
                }
            });
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<C51104c> mo86538a(String str, String str2, long j, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f117958e.mo33487c(new C51110a(str, str2, j, 20, i, i2, i3, i4, i5));
    }
}
