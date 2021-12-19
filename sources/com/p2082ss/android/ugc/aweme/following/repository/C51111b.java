package com.p2082ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51103b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
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

/* renamed from: com.ss.android.ugc.aweme.following.repository.b */
public final class C51111b extends AbstractC20287b {

    /* renamed from: b */
    private final C51131d f117948b;

    /* renamed from: c */
    private final C51134g f117949c;

    /* renamed from: d */
    private final AbstractC20129c<String, User> f117950d;

    static {
        Covode.recordClassIndex(60309);
    }

    public C51111b() {
        C51131d dVar = new C51131d();
        this.f117948b = dVar;
        C51134g gVar = new C51134g();
        this.f117949c = gVar;
        AbstractC20129c<String, User> a = UserService.m138861d().mo123560a();
        this.f117950d = a;
        mo33651a(dVar, gVar, new C51112a());
        mo33650a(gVar, a, new C51118c());
        mo33649a(a, gVar, new C51115b());
    }

    /* renamed from: com.ss.android.ugc.aweme.following.repository.b$a */
    public static final class C51112a extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20278c<C51110a, List<? extends User>, C89391z, List<? extends User>>, C89391z> {
        static {
            Covode.recordClassIndex(60310);
        }

        public C51112a() {
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
                /* class com.p2082ss.android.ugc.aweme.following.repository.C51111b.C51112a.C511131 */

                /* renamed from: a */
                final /* synthetic */ C51112a f117951a;

                static {
                    Covode.recordClassIndex(60311);
                }

                {
                    this.f117951a = r2;
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
                /* class com.p2082ss.android.ugc.aweme.following.repository.C51111b.C51112a.C511142 */

                /* renamed from: a */
                final /* synthetic */ C51112a f117952a;

                static {
                    Covode.recordClassIndex(60312);
                }

                {
                    this.f117952a = r2;
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

    /* renamed from: com.ss.android.ugc.aweme.following.repository.b$b */
    public static final class C51115b extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20281d<? extends Object, User, ? extends Object, List<? extends User>>, C89391z> {
        static {
            Covode.recordClassIndex(60313);
        }

        public C51115b() {
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
            dVar.mo33645a(C511161.INSTANCE);
            dVar.mo33646b(new AbstractC89183m<User, List<? extends User>, List<? extends User>>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.repository.C51111b.C51115b.C511172 */

                /* renamed from: a */
                final /* synthetic */ C51115b f117953a;

                static {
                    Covode.recordClassIndex(60315);
                }

                {
                    this.f117953a = r2;
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

    /* renamed from: com.ss.android.ugc.aweme.following.repository.b$c */
    public static final class C51118c extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20273a<? extends Object, List<? extends User>, String, User>, C89391z> {
        static {
            Covode.recordClassIndex(60316);
        }

        public C51118c() {
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
                /* class com.p2082ss.android.ugc.aweme.following.repository.C51111b.C51118c.C511191 */

                /* renamed from: a */
                final /* synthetic */ C51118c f117954a;

                static {
                    Covode.recordClassIndex(60317);
                }

                {
                    this.f117954a = r2;
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
    public final AbstractC88979t<C51103b> mo86529a(String str, String str2, long j, int i, int i2, int i3, int i4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f117948b.mo33487c(new C51110a(str, str2, j, i, i2, i3, i4));
    }
}
