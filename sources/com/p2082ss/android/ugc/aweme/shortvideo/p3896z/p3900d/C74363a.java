package com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d;

import android.util.Log;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.experiment.C46785cb;
import com.p2082ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p2082ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3897a.C74332a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a */
public final class C74363a {

    /* renamed from: l */
    public static final C74365b f167219l = new C74365b((byte) 0);

    /* renamed from: a */
    public final C1213t<List<C74332a>> f167220a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<List<C74332a>> f167221b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<List<C74332a>> f167222c = new C1213t<>();

    /* renamed from: d */
    public String f167223d = "";

    /* renamed from: e */
    public long f167224e = -1;

    /* renamed from: f */
    public boolean f167225f;

    /* renamed from: g */
    public boolean f167226g;

    /* renamed from: h */
    public long f167227h;

    /* renamed from: i */
    public final AbstractC89703z f167228i = C89582cd.m155517a(null);

    /* renamed from: j */
    public final List<SummonFriendItem> f167229j = new ArrayList();

    /* renamed from: k */
    public final List<C74332a> f167230k = new ArrayList();

    /* renamed from: m */
    private final CoroutineExceptionHandler f167231m = new C74364a(CoroutineExceptionHandler.f203145c);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$e */
    public static final class C74368e extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f167237a;

        /* renamed from: b */
        int f167238b;

        /* renamed from: c */
        final /* synthetic */ C74363a f167239c;

        static {
            Covode.recordClassIndex(87140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74368e(C74363a aVar, AbstractC89124d dVar) {
            super(dVar);
            this.f167239c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f167237a = obj;
            this.f167238b |= Integer.MIN_VALUE;
            return this.f167239c.mo116978a(0, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$k */
    public static final class C74374k extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f167262a;

        /* renamed from: b */
        int f167263b;

        /* renamed from: c */
        final /* synthetic */ C74363a f167264c;

        static {
            Covode.recordClassIndex(87146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74374k(C74363a aVar, AbstractC89124d dVar) {
            super(dVar);
            this.f167264c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f167262a = obj;
            this.f167263b |= Integer.MIN_VALUE;
            return this.f167264c.mo116979a(null, 0, 0, null, this);
        }
    }

    static {
        Covode.recordClassIndex(87135);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$b */
    public static final class C74365b {
        static {
            Covode.recordClassIndex(87137);
        }

        private C74365b() {
        }

        public /* synthetic */ C74365b(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public static boolean m130831b() {
        if (!C46785cb.m90131a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m130829a() {
        if (!C46785cb.m90131a()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$a */
    public static final class C74364a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(87136);
        }

        public C74364a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C84911q.m145922a("SharedAR", "load friend list failed, reason: " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ AbstractC89516am m130825a(C74363a aVar) {
        return aVar.m130826a(aVar.f167231m);
    }

    /* renamed from: a */
    private final AbstractC89516am m130826a(CoroutineExceptionHandler coroutineExceptionHandler) {
        return C89517an.m155448a(C31068c.f74429a.plus(this.f167228i).plus(coroutineExceptionHandler));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$d */
    public static final class C74367d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f167234a;

        /* renamed from: b */
        final /* synthetic */ C74363a f167235b;

        /* renamed from: c */
        final /* synthetic */ boolean f167236c;

        static {
            Covode.recordClassIndex(87139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74367d(C74363a aVar, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f167235b = aVar;
            this.f167236c = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74367d(this.f167235b, this.f167236c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C74367d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f167234a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C74363a aVar2 = this.f167235b;
                long j = aVar2.f167224e;
                this.f167234a = 1;
                obj = aVar2.mo116978a(j, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<C74332a> list = (List) obj;
            C1213t<List<C74332a>> tVar = this.f167235b.f167220a;
            if (this.f167236c) {
                ArrayList arrayList = new ArrayList();
                List<C74332a> value = this.f167235b.f167220a.getValue();
                if (value == null) {
                    value = C89086z.INSTANCE;
                }
                arrayList.addAll(value);
                arrayList.addAll(list);
                list = arrayList;
            }
            tVar.setValue(list);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$i */
    public static final class C74372i extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super SummonFriendList>, Object> {

        /* renamed from: a */
        int f167252a;

        /* renamed from: b */
        final /* synthetic */ C74363a f167253b;

        /* renamed from: c */
        final /* synthetic */ String f167254c;

        /* renamed from: d */
        final /* synthetic */ long f167255d;

        /* renamed from: e */
        final /* synthetic */ long f167256e;

        /* renamed from: f */
        final /* synthetic */ String f167257f;

        static {
            Covode.recordClassIndex(87144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74372i(C74363a aVar, String str, long j, long j2, String str2, AbstractC89124d dVar) {
            super(2, dVar);
            this.f167253b = aVar;
            this.f167254c = str;
            this.f167255d = j;
            this.f167256e = j2;
            this.f167257f = str2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74372i(this.f167253b, this.f167254c, this.f167255d, this.f167256e, this.f167257f, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super SummonFriendList> dVar) {
            return ((C74372i) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            User user;
            if (this.f167252a == 0) {
                C89382r.m154942a(obj);
                SummonFriendList a = SummonFriendApi.m95878a(this.f167254c, this.f167255d, this.f167256e, this.f167257f);
                C89219l.m154716b(a, "");
                List<SummonFriendItem> list = a.items;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : list) {
                        T t2 = t;
                        if (!(t2 == null || (user = t2.mUser) == null)) {
                            if (((C74363a.m130829a() && user.getFollowStatus() == 2) || !C74363a.m130829a()) && ((C74363a.m130831b() && C74363a.m130830a(user)) || !C74363a.m130831b())) {
                                arrayList2.add(t);
                            }
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = C89086z.INSTANCE;
                }
                return new SummonFriendList(arrayList, a.cursor, a.hasMore, a.keyword);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$g */
    public static final class C74370g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super List<? extends C74332a>>, Object> {

        /* renamed from: a */
        int f167243a;

        /* renamed from: b */
        final /* synthetic */ C74363a f167244b;

        /* renamed from: c */
        final /* synthetic */ long f167245c;

        static {
            Covode.recordClassIndex(87142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74370g(C74363a aVar, long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f167244b = aVar;
            this.f167245c = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74370g(this.f167244b, this.f167245c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super List<? extends C74332a>> dVar) {
            return ((C74370g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i;
            if (this.f167243a == 0) {
                C89382r.m154942a(obj);
                if (C63244g.m114602a().mo73255A().mo93908g()) {
                    i = 1;
                } else {
                    i = 2;
                }
                FollowUserListModel a = SummonFriendApi.m95877a(50, this.f167245c, C63244g.m114602a().mo73255A().mo93904c(), C63244g.m114602a().mo73255A().mo93905d(), i);
                if (a != null) {
                    this.f167244b.f167224e = a.maxTime;
                    this.f167244b.f167225f = a.hasMore;
                    List<User> list = a.users;
                    if (list != null) {
                        ArrayList<User> arrayList = new ArrayList();
                        for (T t : list) {
                            T t2 = t;
                            if (t2 != null && (((C74363a.m130829a() && t2.getFollowStatus() == 2) || !C74363a.m130829a()) && ((C74363a.m130831b() && C74363a.m130830a((User) t2)) || !C74363a.m130831b()))) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (User user : arrayList) {
                            C89219l.m154716b(user, "");
                            arrayList2.add(new C74332a(user, (byte) 0));
                        }
                        return arrayList2;
                    }
                }
                return C89086z.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$j */
    public static final class C74373j extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f167258a;

        /* renamed from: b */
        final /* synthetic */ C74363a f167259b;

        /* renamed from: c */
        final /* synthetic */ String f167260c;

        /* renamed from: d */
        final /* synthetic */ boolean f167261d;

        static {
            Covode.recordClassIndex(87145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74373j(C74363a aVar, String str, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f167259b = aVar;
            this.f167260c = str;
            this.f167261d = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74373j(this.f167259b, this.f167260c, this.f167261d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C74373j) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f167258a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C74363a aVar2 = this.f167259b;
                String str = this.f167260c;
                long j = aVar2.f167227h;
                this.f167258a = 1;
                obj = aVar2.mo116979a(str, j, 50, "at_user", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SummonFriendList summonFriendList = (SummonFriendList) obj;
            if (!C89219l.m154714a((Object) summonFriendList.keyword, (Object) this.f167259b.f167223d)) {
                return C89391z.f203057a;
            }
            this.f167259b.f167226g = summonFriendList.hasMore;
            this.f167259b.f167227h = summonFriendList.cursor;
            C1213t<List<C74332a>> tVar = this.f167259b.f167222c;
            if (this.f167261d) {
                arrayList = new ArrayList();
                List<C74332a> value = this.f167259b.f167222c.getValue();
                if (value == null) {
                    value = C89086z.INSTANCE;
                }
                arrayList.addAll(value);
                List<SummonFriendItem> list = summonFriendList.items;
                C89219l.m154716b(list, "");
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (T t : list) {
                    C89219l.m154716b(t, "");
                    User user = t.mUser;
                    C89219l.m154716b(user, "");
                    arrayList2.add(new C74332a(user, (byte) 0));
                }
                arrayList.addAll(arrayList2);
            } else {
                List<SummonFriendItem> list2 = summonFriendList.items;
                C89219l.m154716b(list2, "");
                arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                for (T t2 : list2) {
                    C89219l.m154716b(t2, "");
                    User user2 = t2.mUser;
                    C89219l.m154716b(user2, "");
                    arrayList.add(new C74332a(user2, (byte) 0));
                }
            }
            tVar.setValue(arrayList);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static boolean m130830a(User user) {
        String a = C63244g.m114602a().mo73297y().mo93847a();
        String region = user.getRegion();
        if (a == null || a.length() == 0 || !C89219l.m154714a((Object) a, (Object) region)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$f */
    public static final class C74369f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super List<C74332a>>, Object> {

        /* renamed from: a */
        int f167240a;

        /* renamed from: b */
        final /* synthetic */ C74363a f167241b;

        /* renamed from: c */
        final /* synthetic */ long f167242c;

        static {
            Covode.recordClassIndex(87141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74369f(C74363a aVar, long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f167241b = aVar;
            this.f167242c = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74369f(this.f167241b, this.f167242c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super List<C74332a>> dVar) {
            return ((C74369f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c4, code lost:
            if (r10 != null) goto L_0x00c6;
         */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 270
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a.C74369f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$h */
    public static final class C74371h extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super SummonFriendList>, Object> {

        /* renamed from: a */
        int f167246a;

        /* renamed from: b */
        final /* synthetic */ C74363a f167247b;

        /* renamed from: c */
        final /* synthetic */ long f167248c;

        /* renamed from: d */
        final /* synthetic */ long f167249d;

        /* renamed from: e */
        final /* synthetic */ String f167250e;

        /* renamed from: f */
        final /* synthetic */ String f167251f;

        static {
            Covode.recordClassIndex(87143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74371h(C74363a aVar, long j, long j2, String str, String str2, AbstractC89124d dVar) {
            super(2, dVar);
            this.f167247b = aVar;
            this.f167248c = j;
            this.f167249d = j2;
            this.f167250e = str;
            this.f167251f = str2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74371h(this.f167247b, this.f167248c, this.f167249d, this.f167250e, this.f167251f, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super SummonFriendList> dVar) {
            return ((C74371h) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            User user;
            if (this.f167246a == 0) {
                C89382r.m154942a(obj);
                ArrayList arrayList2 = new ArrayList();
                List d = C89070n.m154571d((Iterable) this.f167247b.f167229j, (int) this.f167248c);
                arrayList2.addAll(d);
                this.f167247b.f167229j.removeAll(d);
                C89233z.C89237d dVar = new C89233z.C89237d();
                dVar.element = this.f167249d;
                C89233z.C89234a aVar = new C89233z.C89234a();
                aVar.element = this.f167247b.f167226g;
                while (((long) arrayList2.size()) < this.f167248c) {
                    SummonFriendList a = SummonFriendApi.m95878a(this.f167250e, dVar.element, this.f167248c, this.f167251f);
                    C89219l.m154716b(a, "");
                    List<SummonFriendItem> list = a.items;
                    if (list != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list) {
                            T t2 = t;
                            if (!(t2 == null || (user = t2.mUser) == null)) {
                                if (((C74363a.m130829a() && user.getFollowStatus() == 2) || !C74363a.m130829a()) && ((C74363a.m130831b() && C74363a.m130830a(user)) || !C74363a.m130831b())) {
                                    arrayList3.add(t);
                                }
                            }
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = C89086z.INSTANCE;
                    }
                    dVar.element = a.cursor;
                    aVar.element = a.hasMore;
                    arrayList.size();
                    List d2 = C89070n.m154571d((Iterable) arrayList, ((int) this.f167248c) - arrayList2.size());
                    arrayList2.addAll(d2);
                    this.f167247b.f167229j.addAll(C89070n.m154573d(arrayList, arrayList.size() - d2.size()));
                    if (aVar.element) {
                        if (!C89219l.m154714a((Object) a.keyword, (Object) this.f167247b.f167223d)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f167247b.f167227h = dVar.element;
                this.f167247b.f167226g = aVar.element;
                return new SummonFriendList(arrayList2, dVar.element, aVar.element, this.f167250e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final void mo116980a(List<C74332a> list) {
        this.f167221b.setValue(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.d.a$c */
    public static final class C74366c extends AbstractC89097a implements CoroutineExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f167232a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f167233b;

        static {
            Covode.recordClassIndex(87138);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C84911q.m145922a("SharedAR", "load friends data failed, isLoadMore: " + this.f167232a + ", stacktrace: " + Log.getStackTraceString(th));
            AbstractC89172b bVar = this.f167233b;
            if (bVar != null) {
                bVar.invoke(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74366c(AbstractC89127f.AbstractC89132c cVar, boolean z, AbstractC89172b bVar) {
            super(cVar);
            this.f167232a = z;
            this.f167233b = bVar;
        }
    }

    /* renamed from: a */
    private void m130828a(boolean z, AbstractC89172b<? super Boolean, C89391z> bVar) {
        if (!z) {
            this.f167224e = System.currentTimeMillis() / 1000;
            this.f167225f = false;
        } else if (!this.f167225f) {
            if (bVar != null) {
                bVar.invoke(false);
                return;
            }
            return;
        }
        AbstractC89568bz unused = C89624i.m155555a(m130826a(new C74366c(CoroutineExceptionHandler.f203145c, z, bVar)), null, null, new C74367d(this, z, null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo116978a(long r7, p4600h.p4603c.AbstractC89124d<? super java.util.List<com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3897a.C74332a>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a.C74368e
            if (r0 == 0) goto L_0x004f
            r5 = r9
            com.ss.android.ugc.aweme.shortvideo.z.d.a$e r5 = (com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a.C74368e) r5
            int r0 = r5.f167238b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004f
            int r0 = r5.f167238b
            int r0 = r0 - r1
            r5.f167238b = r0
        L_0x0013:
            java.lang.Object r2 = r5.f167237a
            h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r5.f167238b
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r1) goto L_0x005d
            if (r0 != r3) goto L_0x0055
            p4600h.C89382r.m154942a(r2)
        L_0x0024:
            return r2
        L_0x0025:
            p4600h.C89382r.m154942a(r2)
            boolean r0 = com.p2082ss.android.ugc.aweme.experiment.C46785cb.m90131a()
            r2 = 0
            if (r0 != 0) goto L_0x003f
            r5.f167238b = r1
            kotlinx.coroutines.ah r1 = kotlinx.coroutines.C89546bf.f203267b
            com.ss.android.ugc.aweme.shortvideo.z.d.a$f r0 = new com.ss.android.ugc.aweme.shortvideo.z.d.a$f
            r0.<init>(r6, r7, r2)
            java.lang.Object r2 = kotlinx.coroutines.C89624i.m155554a(r1, r0, r5)
            if (r2 != r4) goto L_0x0060
            return r4
        L_0x003f:
            r5.f167238b = r3
            kotlinx.coroutines.ah r1 = kotlinx.coroutines.C89546bf.f203267b
            com.ss.android.ugc.aweme.shortvideo.z.d.a$g r0 = new com.ss.android.ugc.aweme.shortvideo.z.d.a$g
            r0.<init>(r6, r7, r2)
            java.lang.Object r2 = kotlinx.coroutines.C89624i.m155554a(r1, r0, r5)
            if (r2 != r4) goto L_0x0024
            return r4
        L_0x004f:
            com.ss.android.ugc.aweme.shortvideo.z.d.a$e r5 = new com.ss.android.ugc.aweme.shortvideo.z.d.a$e
            r5.<init>(r6, r9)
            goto L_0x0013
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x005d:
            p4600h.C89382r.m154942a(r2)
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a.mo116978a(long, h.c.d):java.lang.Object");
    }

    /* renamed from: a */
    public final boolean mo116981a(String str, boolean z) {
        C89219l.m154721d(str, "");
        if (str.length() == 0) {
            return false;
        }
        this.f167223d = str;
        if (!z) {
            this.f167227h = 0;
            this.f167226g = false;
        } else if (!this.f167226g) {
            return false;
        }
        AbstractC89568bz unused = C89624i.m155555a(m130825a(this), null, null, new C74373j(this, str, z, null), 3);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.z.d.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m130827a(C74363a aVar, boolean z, AbstractC89172b bVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bVar = null;
        }
        aVar.m130828a(z, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo116979a(java.lang.String r25, long r26, long r28, java.lang.String r30, p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.friends.model.SummonFriendList> r31) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a.mo116979a(java.lang.String, long, long, java.lang.String, h.c.d):java.lang.Object");
    }
}
