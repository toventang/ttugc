package com.p2082ss.android.ugc.aweme.qainvitation.p3635b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.C53598c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65844a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65846c;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65849f;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65850g;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65851h;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65852i;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65853j;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65847d;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88435h;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b */
public final class C65796b {

    /* renamed from: n */
    public static final C65797a f148255n = new C65797a((byte) 0);

    /* renamed from: a */
    public boolean f148256a = true;

    /* renamed from: b */
    public List<IMUser> f148257b = new ArrayList();

    /* renamed from: c */
    public String f148258c = "";

    /* renamed from: d */
    public String f148259d = "";

    /* renamed from: e */
    public String f148260e = "";

    /* renamed from: f */
    public long f148261f;

    /* renamed from: g */
    public long f148262g;

    /* renamed from: h */
    public final IQAInvitationService f148263h = QAInvitationService.m117786b();

    /* renamed from: i */
    public List<IMUser> f148264i = new ArrayList();

    /* renamed from: j */
    public C65797a.C65798a f148265j = new C65797a.C65798a(C89086z.INSTANCE, C89086z.INSTANCE, C89086z.INSTANCE, C89086z.INSTANCE, C89086z.INSTANCE, C89086z.INSTANCE);

    /* renamed from: k */
    public final C88411a f148266k;

    /* renamed from: l */
    public final AbstractC89172b<C65797a.C65798a, C89391z> f148267l;

    /* renamed from: m */
    public final AbstractC89171a<C89391z> f148268m;

    /* renamed from: o */
    private int f148269o;

    static {
        Covode.recordClassIndex(77297);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$a */
    public static final class C65797a {
        static {
            Covode.recordClassIndex(77298);
        }

        private C65797a() {
        }

        public /* synthetic */ C65797a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$a$a */
        public static final class C65798a {

            /* renamed from: a */
            public final List<IMUser> f148270a;

            /* renamed from: b */
            public final List<IMUser> f148271b;

            /* renamed from: c */
            public final List<IMUser> f148272c;

            /* renamed from: d */
            public final List<IMUser> f148273d;

            /* renamed from: e */
            public final List<IMUser> f148274e;

            /* renamed from: f */
            public final List<IMUser> f148275f;

            static {
                Covode.recordClassIndex(77299);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C65798a)) {
                    return false;
                }
                C65798a aVar = (C65798a) obj;
                return C89219l.m154714a(this.f148270a, aVar.f148270a) && C89219l.m154714a(this.f148271b, aVar.f148271b) && C89219l.m154714a(this.f148272c, aVar.f148272c) && C89219l.m154714a(this.f148273d, aVar.f148273d) && C89219l.m154714a(this.f148274e, aVar.f148274e) && C89219l.m154714a(this.f148275f, aVar.f148275f);
            }

            public final int hashCode() {
                List<IMUser> list = this.f148270a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.f148271b;
                int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                List<IMUser> list3 = this.f148272c;
                int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
                List<IMUser> list4 = this.f148273d;
                int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
                List<IMUser> list5 = this.f148274e;
                int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
                List<IMUser> list6 = this.f148275f;
                if (list6 != null) {
                    i = list6.hashCode();
                }
                return hashCode5 + i;
            }

            public final String toString() {
                return "AllFriends(selectedSUGUsers=" + this.f148270a + ", recentFriends=" + this.f148271b + ", mutualFriends=" + this.f148272c + ", allFollowingFriends=" + this.f148273d + ", inviteeList=" + this.f148274e + ", allContacts=" + this.f148275f + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX WARN: Multi-variable type inference failed */
            public C65798a(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<? extends IMUser> list4, List<? extends IMUser> list5, List<? extends IMUser> list6) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(list2, "");
                C89219l.m154721d(list3, "");
                C89219l.m154721d(list4, "");
                C89219l.m154721d(list5, "");
                C89219l.m154721d(list6, "");
                this.f148270a = list;
                this.f148271b = list2;
                this.f148272c = list3;
                this.f148273d = list4;
                this.f148274e = list5;
                this.f148275f = list6;
            }
        }
    }

    /* renamed from: a */
    public final void mo104929a(C65846c cVar, List<IMUser> list) {
        List<User> list2;
        List<User> list3 = null;
        if (cVar != null) {
            List<User> list4 = cVar.f148390a;
            int i = 0;
            if (list4 != null && !list4.isEmpty()) {
                if (!(cVar == null || (list2 = cVar.f148390a) == null)) {
                    i = list2.size();
                }
                this.f148269o = i;
                if (cVar == null || (list3 = cVar.f148390a) == null) {
                    C89219l.m154715b();
                }
                list.addAll(C65855a.m117768a(list3));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo104931a(String str) {
        C89219l.m154721d(str, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (C89219l.m154714a((Object) str, (Object) g.getCurUserId())) {
            return true;
        }
        Iterator<T> it = this.f148257b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.getUid(), (Object) str)) {
                if (next != null) {
                    return true;
                }
            }
        }
        for (T t : this.f148265j.f148274e) {
            if (C89219l.m154714a((Object) str, (Object) t.getUid())) {
                if (t != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104928a(com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser r11, com.p2082ss.android.ugc.aweme.qainvitation.p3634a.EnumC65758a r12) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65796b.mo104928a(com.ss.android.ugc.aweme.im.service.model.IMUser, com.ss.android.ugc.aweme.qainvitation.a.a):void");
    }

    /* renamed from: a */
    public final boolean mo104930a() {
        if (this.f148264i.size() + this.f148269o >= mo104932b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo104932b() {
        C65849f a;
        Integer num;
        IQAInvitationService iQAInvitationService = this.f148263h;
        if (iQAInvitationService == null || (a = iQAInvitationService.mo105000a()) == null || (num = a.f148395a) == null) {
            return 30;
        }
        return num.intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c */
    static final class C65802c<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C65796b f148282a;

        /* renamed from: b */
        final /* synthetic */ List f148283b;

        static {
            Covode.recordClassIndex(77303);
        }

        C65802c(C65796b bVar, List list) {
            this.f148282a = bVar;
            this.f148283b = list;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c$d */
        static final class C65806d<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ AbstractC88982v f148289a;

            static {
                Covode.recordClassIndex(77307);
            }

            C65806d(AbstractC88982v vVar) {
                this.f148289a = vVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f148289a.mo143031a(obj);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c$a */
        static final class C65803a<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C65803a f148284a = new C65803a();

            static {
                Covode.recordClassIndex(77304);
            }

            C65803a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C89219l.m154721d(obj, "");
                return new C65853j((byte) 0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c$b */
        static final class C65804b<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C65804b f148285a = new C65804b();

            static {
                Covode.recordClassIndex(77305);
            }

            C65804b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C89219l.m154721d(obj, "");
                return new C65846c((byte) 0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c$f */
        static final class C65808f<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C65808f f148293a = new C65808f();

            static {
                Covode.recordClassIndex(77309);
            }

            C65808f() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C89219l.m154721d(obj, "");
                return new C65850g((byte) 0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c$e */
        static final class C65807e<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65802c f148290a;

            /* renamed from: b */
            final /* synthetic */ List f148291b;

            /* renamed from: c */
            final /* synthetic */ AbstractC88982v f148292c;

            static {
                Covode.recordClassIndex(77308);
            }

            C65807e(C65802c cVar, List list, AbstractC88982v vVar) {
                this.f148290a = cVar;
                this.f148291b = list;
                this.f148292c = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null) {
                    th.getMessage();
                }
                this.f148290a.f148282a.mo104925a(new ArrayList(), this.f148291b, new ArrayList(), this.f148290a.f148283b, new ArrayList());
                this.f148292c.mo143031a(this.f148290a.f148282a.f148265j);
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C65797a.C65798a> vVar) {
            AbstractC88979t<C65846c> a;
            C89219l.m154721d(vVar, "");
            List<IMUser> allFollowIMUsers = IMService.createIIMServicebyMonsterPlugin(false).getAllFollowIMUsers();
            ArrayList arrayList = new ArrayList();
            for (T t : allFollowIMUsers) {
                String uid = t.getUid();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!C89219l.m154714a((Object) uid, (Object) g.getCurUserId())) {
                    arrayList.add(t);
                }
            }
            List g2 = C89070n.m154585g((Collection) arrayList);
            List<IMUser> recentIMUsers = IMService.createIIMServicebyMonsterPlugin(false).getRecentIMUsers();
            String a2 = C65796b.m117718a(g2, recentIMUsers);
            C89219l.m154721d(a2, "");
            String b = new C27910f().mo46674b(C89070n.m154516a(Integer.valueOf(EnumC65847d.QA_INVITE.getType())));
            C89219l.m154716b(b, "");
            AbstractC88979t<C65853j> f = QAInvitationAPI.C65759a.m117689a(b, a2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143299f(C65803a.f148284a);
            AbstractC88979t<C65850g> f2 = QAInvitationAPI.C65759a.m117685a(EnumC65847d.QA_INVITE.getType()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143299f(C65808f.f148293a);
            long j = this.f148282a.f148261f;
            if (j == 0) {
                a = AbstractC88979t.m154310b(new C65846c((byte) 0));
                C89219l.m154716b(a, "");
            } else {
                a = QAInvitationAPI.C65759a.m117686a(j);
            }
            this.f148282a.f148266k.mo142945a(AbstractC88979t.m154298a(f, f2, a.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143299f(C65804b.f148285a), new C65805c(this, recentIMUsers, g2)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C65806d(vVar), new C65807e(this, g2, vVar)));
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$c$c */
        static final class C65805c<T1, T2, T3, R> implements AbstractC88435h {

            /* renamed from: a */
            final /* synthetic */ C65802c f148286a;

            /* renamed from: b */
            final /* synthetic */ List f148287b;

            /* renamed from: c */
            final /* synthetic */ List f148288c;

            static {
                Covode.recordClassIndex(77306);
            }

            C65805c(C65802c cVar, List list, List list2) {
                this.f148286a = cVar;
                this.f148287b = list;
                this.f148288c = list2;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88435h
            /* renamed from: a */
            public final /* synthetic */ Object mo9211a(Object obj, Object obj2, Object obj3) {
                List<C65851h> list;
                C65853j jVar = (C65853j) obj;
                C65850g gVar = (C65850g) obj2;
                C65846c cVar = (C65846c) obj3;
                ArrayList arrayList = new ArrayList();
                List<C65851h> list2 = null;
                if (!(jVar == null || (list = jVar.f148402a) == null || list.isEmpty())) {
                    if (jVar != null) {
                        list2 = jVar.f148402a;
                    }
                    Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.qainvitation.model.UserBlockData>");
                    arrayList.addAll(C89206ad.m154682d(list2));
                }
                ArrayList arrayList2 = new ArrayList();
                C65796b.m117720a(gVar, arrayList2, this.f148287b, arrayList);
                ArrayList arrayList3 = new ArrayList();
                this.f148286a.f148282a.mo104929a(cVar, arrayList3);
                return this.f148286a.f148282a.mo104925a(arrayList2, this.f148288c, arrayList, this.f148286a.f148283b, arrayList3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$d */
    static final class C65809d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C65796b f148294a;

        /* renamed from: b */
        final /* synthetic */ String f148295b;

        /* renamed from: c */
        final /* synthetic */ List f148296c;

        static {
            Covode.recordClassIndex(77310);
        }

        C65809d(C65796b bVar, String str, List list) {
            this.f148294a = bVar;
            this.f148295b = str;
            this.f148296c = list;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$d$b */
        static final class C65811b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ AbstractC88982v f148299a;

            static {
                Covode.recordClassIndex(77312);
            }

            C65811b(AbstractC88982v vVar) {
                this.f148299a = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f148299a.mo143031a(C89086z.INSTANCE);
                ((Throwable) obj).getMessage();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$d$a */
        static final class C65810a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65809d f148297a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f148298b;

            static {
                Covode.recordClassIndex(77311);
            }

            C65810a(C65809d dVar, AbstractC88982v vVar) {
                this.f148297a = dVar;
                this.f148298b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                List list = (List) obj;
                this.f148297a.f148294a.f148257b.clear();
                if (list != null) {
                    this.f148297a.f148294a.f148257b.addAll(list);
                    this.f148298b.mo143031a(this.f148297a.f148294a.f148257b);
                    return;
                }
                this.f148298b.mo143031a(C89086z.INSTANCE);
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<List<IMUser>> vVar) {
            C89219l.m154721d(vVar, "");
            C65796b bVar = this.f148294a;
            String str = this.f148295b;
            C89219l.m154721d(str, "");
            bVar.f148258c = str;
            C65796b bVar2 = this.f148294a;
            List<? extends IMUser> list = this.f148296c;
            String str2 = this.f148295b;
            List<IMUser> searchFollowIMUser = IMService.createIIMServicebyMonsterPlugin(false).searchFollowIMUser(list, str2);
            Locale locale = Locale.ROOT;
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase(locale);
            C89219l.m154716b(lowerCase, "");
            for (T t : list) {
                String uniqueId = t.getUniqueId();
                if (uniqueId == null || uniqueId.length() == 0) {
                    String shortId = t.getShortId();
                    C89219l.m154716b(shortId, "");
                    if (C65796b.m117721a(shortId, lowerCase)) {
                        t.setSearchType(1);
                        searchFollowIMUser.add(t);
                    }
                } else {
                    String uniqueId2 = t.getUniqueId();
                    C89219l.m154716b(uniqueId2, "");
                    if (C65796b.m117721a(uniqueId2, lowerCase)) {
                        t.setSearchType(1);
                        searchFollowIMUser.add(t);
                    }
                }
            }
            if (bVar2.f148256a) {
                List<IMUser> a = C65796b.m117719a(searchFollowIMUser);
                searchFollowIMUser.clear();
                searchFollowIMUser.addAll(a);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t2 : searchFollowIMUser) {
                if (hashSet.add(t2.getUid())) {
                    arrayList.add(t2);
                }
            }
            this.f148294a.f148266k.mo142945a(AbstractC88979t.m154310b((Object) arrayList).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C65810a(this, vVar), new C65811b(vVar)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$b */
    static final class C65799b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C65796b f148276a;

        /* renamed from: b */
        final /* synthetic */ long f148277b;

        static {
            Covode.recordClassIndex(77300);
        }

        C65799b(C65796b bVar, long j) {
            this.f148276a = bVar;
            this.f148277b = j;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$b$a */
        static final class C65800a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65799b f148278a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f148279b;

            static {
                Covode.recordClassIndex(77301);
            }

            C65800a(C65799b bVar, AbstractC88982v vVar) {
                this.f148278a = bVar;
                this.f148279b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                int i = 0;
                if (obj != null) {
                    this.f148279b.mo143031a(obj);
                    i = 1;
                } else {
                    this.f148279b.mo143031a(new C65844a((byte) 0));
                }
                this.f148278a.f148276a.mo104926a(i);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b$b$b */
        static final class C65801b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65799b f148280a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f148281b;

            static {
                Covode.recordClassIndex(77302);
            }

            C65801b(C65799b bVar, AbstractC88982v vVar) {
                this.f148280a = bVar;
                this.f148281b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C89219l.m154721d(th, "");
                this.f148281b.mo143031a(new C65844a((byte) 0));
                th.getMessage();
                this.f148280a.f148276a.mo104926a(0);
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C65844a> vVar) {
            C89219l.m154721d(vVar, "");
            if (!this.f148276a.f148264i.isEmpty()) {
                String a = C65796b.m117718a(this.f148276a.f148264i, C89086z.INSTANCE);
                long j = this.f148277b;
                C89219l.m154721d(a, "");
                this.f148276a.f148266k.mo142945a(QAInvitationAPI.C65759a.m117688a(j, a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C65800a(this, vVar), new C65801b(this, vVar)));
            }
        }
    }

    /* renamed from: a */
    static List<IMUser> m117719a(List<? extends IMUser> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : list) {
            String uid = iMUser.getUid();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!C89219l.m154714a((Object) uid, (Object) g.getCurUserId())) {
                arrayList.add(iMUser);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final IMUser mo104933b(IMUser iMUser) {
        boolean z;
        C89219l.m154721d(iMUser, "");
        List<IMUser> list = this.f148264i;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        if (z) {
            return null;
        }
        Iterator<T> it = this.f148264i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.getUid(), (Object) iMUser.getUid())) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* renamed from: a */
    public final void mo104926a(int i) {
        C39162r.m79460a("send_qa_invitation", new C33744d().mo59983a("enter_from", this.f148260e).mo59983a("enter_method", this.f148259d).mo59981a("question_id", this.f148261f).mo59980a("invitee_count", this.f148264i.size()).mo59980a("is_success", i).f79943a);
    }

    /* renamed from: a */
    public final void mo104927a(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        Iterator<T> it = this.f148264i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) iMUser.getUid(), (Object) next.getUid())) {
                if (next != null) {
                    this.f148264i.remove(next);
                }
            }
        }
        List<? extends IMUser> g = C89070n.m154585g((Collection) this.f148265j.f148270a);
        Iterator<T> it2 = g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next2 = it2.next();
            if (C89219l.m154714a((Object) iMUser.getUid(), (Object) next2.getUid())) {
                if (next2 != null) {
                    g.remove(next2);
                    m117722b(g, this.f148265j.f148271b, this.f148265j.f148272c, this.f148265j.f148274e, this.f148265j.f148273d);
                }
            }
        }
        C39162r.m79460a("cancel_select_qa_invitee", new C33744d().mo59983a("enter_from", this.f148260e).mo59983a("enter_method", this.f148259d).mo59981a("from_user_id", this.f148262g).mo59983a("to_user_id", iMUser.getUid()).f79943a);
        this.f148267l.invoke(this.f148265j);
    }

    /* renamed from: a */
    public static String m117718a(List<? extends IMUser> list, List<? extends IMUser> list2) {
        boolean z;
        ArrayList<IMUser> arrayList = new ArrayList();
        arrayList.addAll(list);
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.addAll(list2);
        }
        try {
            C27910f fVar = new C27910f();
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            for (IMUser iMUser : arrayList) {
                String uid = iMUser.getUid();
                C89219l.m154716b(uid, "");
                arrayList2.add(Long.valueOf(Long.parseLong(uid)));
            }
            String b = fVar.mo46674b(arrayList2);
            C89219l.m154716b(b, "");
            return b;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    static boolean m117721a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) str2)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.qainvitation.b.b$a$a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C65796b(C88411a aVar, AbstractC89172b<? super C65797a.C65798a, C89391z> bVar, AbstractC89171a<C89391z> aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar2, "");
        this.f148266k = aVar;
        this.f148267l = bVar;
        this.f148268m = aVar2;
    }

    /* renamed from: a */
    public static void m117720a(C65850g gVar, List<IMUser> list, List<IMUser> list2, List<C65851h> list3) {
        List<C65851h> list4;
        List<User> list5;
        T t;
        List<C65852i> list6;
        boolean z;
        List<C65852i> list7;
        C65852i iVar;
        Integer num;
        C65851h hVar;
        List<C65852i> list8;
        boolean z2;
        List<C65852i> list9;
        C65852i iVar2;
        Integer num2;
        Object obj;
        if (gVar != null) {
            try {
                list5 = gVar.f148396a;
                list4 = gVar.f148397b;
            } catch (Exception e) {
                e.getMessage();
                return;
            }
        } else {
            list5 = null;
            list4 = null;
        }
        if (list5 != null && (!list5.isEmpty())) {
            for (User user : list5) {
                if (list.size() < 10) {
                    String uid = user.getUid();
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (!C89219l.m154714a((Object) uid, (Object) g.getCurUserId())) {
                        IMUser a = C53598c.m98833a(user);
                        if (list4 != null) {
                            Iterator it = list4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (C89219l.m154714a((Object) String.valueOf(((C65851h) obj).f148398a), (Object) (a != null ? a.getUid() : null))) {
                                    break;
                                }
                            }
                            hVar = (C65851h) obj;
                        } else {
                            hVar = null;
                        }
                        if (a != null) {
                            a.setUserEnabledQAInvite(true);
                            if (!(hVar == null || (list8 = hVar.f148399b) == null || list8.isEmpty())) {
                                if (hVar == null || (list9 = hVar.f148399b) == null || (iVar2 = list9.get(0)) == null || (num2 = iVar2.f148400a) == null || num2.intValue() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                a.setUserEnabledQAInvite(Boolean.valueOf(z2));
                            }
                            list.add(a);
                        }
                    }
                }
            }
        }
        if (!(list.size() >= 10 || list2 == null || list2.isEmpty())) {
            for (T t2 : list2) {
                if (list.size() < 10 && !list.contains(t2)) {
                    String uid2 = t2.getUid();
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    if (!C89219l.m154714a((Object) uid2, (Object) g2.getCurUserId())) {
                        t2.setUserEnabledQAInvite(true);
                        Iterator<T> it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (C89219l.m154714a((Object) String.valueOf(t.f148398a), (Object) t2.getUid())) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (!(t3 == null || (list6 = t3.f148399b) == null || list6.isEmpty())) {
                            if (t3 == null || (list7 = t3.f148399b) == null || (iVar = list7.get(0)) == null || (num = iVar.f148400a) == null || num.intValue() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            t2.setUserEnabledQAInvite(Boolean.valueOf(z));
                        }
                        list.add(t2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private C65797a.C65798a m117722b(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<? extends IMUser> list4, List<? extends IMUser> list5) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(list3, "");
        C89219l.m154721d(list4, "");
        C89219l.m154721d(list5, "");
        List arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        arrayList.addAll(list5);
        if (this.f148256a) {
            arrayList = m117719a(arrayList);
        }
        C65797a.C65798a aVar = new C65797a.C65798a(list, list2, list3, list5, list4, arrayList);
        this.f148265j = aVar;
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r0 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65796b.C65797a.C65798a mo104925a(java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> r19, java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> r20, java.util.List<com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65851h> r21, java.util.List<? extends com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> r22, java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> r23) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65796b.mo104925a(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):com.ss.android.ugc.aweme.qainvitation.b.b$a$a");
    }
}
