package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17423b;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.GroupRole;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55099j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a */
public final class C53982a {

    /* renamed from: a */
    static final ConcurrentHashMap<String, CopyOnWriteArraySet<AbstractC53999d>> f123794a = new ConcurrentHashMap<>();

    /* renamed from: b */
    static final LruCache<String, ConcurrentHashMap<String, C54006a>> f123795b = new LruCache<>(50);

    /* renamed from: c */
    static final LruCache<String, List<C54006a>> f123796c = new LruCache<>(50);

    /* renamed from: d */
    public static final C53982a f123797d = new C53982a();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, AbstractC17427b> f123798e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final AbstractC89244h f123799f = C89250i.m154773a((AbstractC89171a) C53986d.f123805a);

    /* renamed from: a */
    static C88411a m99199a() {
        return (C88411a) f123799f.getValue();
    }

    private C53982a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$d */
    static final class C53986d extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C53986d f123805a = new C53986d();

        static {
            Covode.recordClassIndex(63655);
        }

        C53986d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    static {
        Covode.recordClassIndex(63651);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$a */
    public static final class CallableC53983a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f123800a;

        /* renamed from: b */
        final /* synthetic */ List f123801b;

        /* renamed from: c */
        final /* synthetic */ List f123802c;

        static {
            Covode.recordClassIndex(63652);
        }

        CallableC53983a(List list, List list2, List list3) {
            this.f123800a = list;
            this.f123801b = list2;
            this.f123802c = list3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (C19537ah ahVar : this.f123800a) {
                if (!this.f123801b.contains(String.valueOf(ahVar.getUid()))) {
                    C54006a aVar = new C54006a(String.valueOf(ahVar.getUid()), ahVar.getSecUid());
                    aVar.setUser(C55085g.m100757b(String.valueOf(ahVar.getUid()), ahVar.getSecUid()));
                    aVar.setMember(ahVar);
                    this.f123802c.add(aVar);
                }
            }
            return this.f123802c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$g */
    static final class CallableC53989g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f123811a;

        static {
            Covode.recordClassIndex(63658);
        }

        CallableC53989g(List list) {
            this.f123811a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<C19537ah> list = this.f123811a;
            C56244a.m102190b("GroupMemberLoader", "transfer ImMemberList origin list : ".concat(String.valueOf(list)));
            ArrayList arrayList = new ArrayList();
            C54006a aVar = null;
            if (list != null) {
                for (C19537ah ahVar : list) {
                    String secUid = ahVar.getSecUid();
                    if (secUid == null || secUid.length() == 0) {
                        secUid = C55099j.m100777a(String.valueOf(ahVar.getUid()));
                    }
                    C54006a aVar2 = new C54006a(String.valueOf(ahVar.getUid()), secUid);
                    aVar2.setUser(C55085g.m100757b(String.valueOf(ahVar.getUid()), secUid));
                    aVar2.setMember(ahVar);
                    if (ahVar.getRole() == GroupRole.OWNER.getValue()) {
                        arrayList.add(0, aVar2);
                    } else {
                        arrayList.add(aVar2);
                    }
                    if (C89219l.m154714a((Object) aVar2.getSecUid(), (Object) C55197c.m100921c())) {
                        aVar = aVar2;
                    }
                }
                if (aVar != null) {
                    arrayList.remove(aVar);
                    arrayList.add(0, aVar);
                }
            }
            C56244a.m102190b("GroupMemberLoader", "transfer ImMemberList result list : ".concat(String.valueOf(arrayList)));
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$j */
    public static final class CallableC53992j<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f123814a;

        static {
            Covode.recordClassIndex(63661);
        }

        CallableC53992j(List list) {
            this.f123814a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List list = this.f123814a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C54006a) obj).getUser() == null) {
                    arrayList.add(obj);
                }
            }
            ArrayList<C54006a> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
            for (C54006a aVar : arrayList2) {
                C19537ah member = aVar.getMember();
                String str = null;
                String valueOf = String.valueOf(member != null ? Long.valueOf(member.getUid()) : null);
                C19537ah member2 = aVar.getMember();
                if (member2 != null) {
                    str = member2.getSecUid();
                }
                arrayList3.add(new C89378p(valueOf, str));
            }
            List<IMUser> a = C55085g.m100753a(arrayList3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : a) {
                String uid = t.getUid();
                C89219l.m154716b(uid, "");
                linkedHashMap.put(uid, t);
            }
            List list2 = this.f123814a;
            ArrayList<C54006a> arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (((C54006a) obj2).getUser() == null) {
                    arrayList4.add(obj2);
                }
            }
            for (C54006a aVar2 : arrayList4) {
                aVar2.setUser((IMUser) linkedHashMap.get(aVar2.getUid()));
            }
            return this.f123814a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$m */
    public static final class C53995m implements AbstractC53999d {

        /* renamed from: a */
        final /* synthetic */ WeakReference f123818a;

        static {
            Covode.recordClassIndex(63664);
        }

        C53995m(WeakReference weakReference) {
            this.f123818a = weakReference;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC53999d
        /* renamed from: a */
        public final void mo91089a(String str, List<C54006a> list, EnumC54000e eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(eVar, "");
            AbstractC53999d dVar = (AbstractC53999d) this.f123818a.get();
            if (dVar != null) {
                dVar.mo91089a(str, list, eVar);
                return;
            }
            C89219l.m154721d(str, "");
            C89219l.m154721d(this, "");
            CopyOnWriteArraySet<AbstractC53999d> copyOnWriteArraySet = C53982a.f123794a.get(str);
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.remove(this);
            }
            C56244a.m102190b("GroupMemberLoader", "unregister:".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$b */
    public static final class C53984b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f123803a;

        static {
            Covode.recordClassIndex(63653);
        }

        C53984b(String str) {
            this.f123803a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            EnumC54000e eVar = EnumC54000e.AddMember;
            String str = this.f123803a;
            C89219l.m154716b(list, "");
            C53982a.m99200a(eVar, str, list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$c */
    public static final class C53985c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C53985c f123804a = new C53985c();

        static {
            Covode.recordClassIndex(63654);
        }

        C53985c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C56244a.m102187a("GroupMemberLoader", th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$e */
    public static final class C53987e implements AbstractC56230a {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f123806a;

        /* renamed from: b */
        final /* synthetic */ AbstractC54002g f123807b;

        static {
            Covode.recordClassIndex(63656);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91086a(Throwable th) {
            C89219l.m154721d(th, "");
            C89219l.m154721d(th, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91085a(IMUser iMUser) {
            if (iMUser != null) {
                this.f123806a.element.setUser(iMUser);
            }
            AbstractC54002g gVar = this.f123807b;
            if (gVar != null) {
                gVar.mo91093a(this.f123806a.element, EnumC54001f.UpdateUser);
            }
        }

        C53987e(C89233z.C89238e eVar, AbstractC54002g gVar) {
            this.f123806a = eVar;
            this.f123807b = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$f */
    public static final class C53988f implements AbstractC19479b<C19537ah> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f123808a;

        /* renamed from: b */
        final /* synthetic */ C53998c f123809b;

        /* renamed from: c */
        final /* synthetic */ AbstractC54002g f123810c;

        static {
            Covode.recordClassIndex(63657);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            AbstractC54002g gVar = this.f123810c;
            if (gVar != null) {
                gVar.mo91093a(this.f123808a.element, EnumC54001f.UpdateMember);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19537ah ahVar) {
            C19537ah ahVar2 = ahVar;
            if (ahVar2 != null) {
                this.f123808a.element.setMember(ahVar2);
                if (C53982a.f123795b.get(this.f123809b.f123823a) == null) {
                    C53982a.f123795b.put(this.f123809b.f123823a, new ConcurrentHashMap<>());
                }
                ConcurrentHashMap<String, C54006a> concurrentHashMap = C53982a.f123795b.get(this.f123809b.f123823a);
                if (concurrentHashMap != null) {
                    concurrentHashMap.put(this.f123809b.f123824b, this.f123808a.element);
                }
            }
            AbstractC54002g gVar = this.f123810c;
            if (gVar != null) {
                gVar.mo91093a(this.f123808a.element, EnumC54001f.UpdateMember);
            }
        }

        C53988f(C89233z.C89238e eVar, C53998c cVar, AbstractC54002g gVar) {
            this.f123808a = eVar;
            this.f123809b = cVar;
            this.f123810c = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$i */
    static final class C53991i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C53991i f123813a = new C53991i();

        static {
            Covode.recordClassIndex(63660);
        }

        C53991i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C56244a.m102190b("GroupMemberLoader", "fetchMemberInfo error: ".concat(String.valueOf(obj)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$l */
    public static final class C53994l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C53994l f123817a = new C53994l();

        static {
            Covode.recordClassIndex(63663);
        }

        C53994l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C56244a.m102193e("GroupMemberLoader", "fetchUserInfo error: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$n */
    public static final class C53996n implements AbstractC17423b {

        /* renamed from: a */
        final /* synthetic */ AbstractC17427b f123819a;

        /* renamed from: b */
        final /* synthetic */ String f123820b;

        static {
            Covode.recordClassIndex(63665);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28003a(String str, int i) {
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28004a(String str, int i, List list) {
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: d */
        public final int mo28016d() {
            return -100;
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28001a(C19638h hVar) {
            C56244a.m102190b("GroupMemberLoader", "onCreateConversation, conversation = ".concat(String.valueOf(hVar)));
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: b */
        public final void mo28010b(C19638h hVar) {
            C56244a.m102190b("GroupMemberLoader", "onDeleteConversation, conversation = ".concat(String.valueOf(hVar)));
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: d */
        public final void mo28017d(C19638h hVar) {
            C56244a.m102190b("GroupMemberLoader", "onDissolveConversation, conversation = ".concat(String.valueOf(hVar)));
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: c */
        public final void mo28014c(C19638h hVar) {
            C56244a.m102190b("GroupMemberLoader", "onLeaveConversation, conversation = ".concat(String.valueOf(hVar)));
            C53982a.f123796c.remove(this.f123820b);
            C53982a.f123795b.remove(this.f123820b);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: b */
        public final void mo28012b(List<C19537ah> list) {
            Integer num;
            StringBuilder sb = new StringBuilder("onAddMember, list.size = ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            C56244a.m102190b("GroupMemberLoader", sb.append(num).toString());
            C53982a.m99201a(this.f123820b, list);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: c */
        public final void mo28015c(List<C19537ah> list) {
            Integer num;
            StringBuilder sb = new StringBuilder("onRemoveMember, list.size = ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            C56244a.m102190b("GroupMemberLoader", sb.append(num).toString());
            C53982a.m99202b(this.f123820b, list);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28006a(List<C19537ah> list) {
            Integer num;
            StringBuilder sb = new StringBuilder("onUpdate, list.size = ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            C56244a.m102190b("GroupMemberLoader", sb.append(num).toString());
            C53982a.m99203c(this.f123820b, list);
        }

        C53996n(AbstractC17427b bVar, String str) {
            this.f123819a = bVar;
            this.f123820b = str;
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28002a(C19638h hVar, int i) {
            C56244a.m102190b("GroupMemberLoader", "onUpdateConversation, conversation = " + hVar + " reason = " + i);
            this.f123819a.mo27750d();
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28005a(String str, List<C19537ah> list) {
            Integer num;
            C89219l.m154721d(str, "");
            StringBuilder append = new StringBuilder("onLoadMember, conversationId = ").append(str).append(" list.size = ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            C56244a.m102190b("GroupMemberLoader", append.append(num).toString());
            if (list == null || !(!list.isEmpty())) {
                C56244a.m102190b("GroupMemberLoader", "fetchMemberInfo memberList == null");
                return;
            }
            AbstractC88412b a = AbstractC88403ab.m153604a((Callable) new CallableC53989g(list)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C53990h(str), C53991i.f123813a);
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, C53982a.m99199a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$h */
    static final class C53990h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f123812a;

        static {
            Covode.recordClassIndex(63659);
        }

        C53990h(String str) {
            this.f123812a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            EnumC54000e eVar = EnumC54000e.FetchMemberInfo;
            String str = this.f123812a;
            C89219l.m154716b(list, "");
            C53982a.m99200a(eVar, str, list);
            C53982a.m99204d(this.f123812a, list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a$k */
    public static final class C53993k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f123815a;

        /* renamed from: b */
        final /* synthetic */ List f123816b;

        static {
            Covode.recordClassIndex(63662);
        }

        C53993k(String str, List list) {
            this.f123815a = str;
            this.f123816b = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            if (C17453a.m32408a((Collection<? extends Object>) list) && list != null) {
                C53982a.m99200a(EnumC54000e.FetchUserInfo, this.f123815a, this.f123816b);
            }
        }
    }

    /* renamed from: d */
    public static void m99204d(String str, List<C54006a> list) {
        AbstractC88412b a = AbstractC88403ab.m153604a((Callable) new CallableC53992j(list)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C53993k(str, list), C53994l.f123817a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, m99199a());
    }

    /* renamed from: b */
    public static void m99202b(String str, List<? extends C19537ah> list) {
        if (!(str == null || str.length() == 0 || list == null || list.isEmpty())) {
            List<C54006a> list2 = f123796c.get(str);
            C89219l.m154716b(list2, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (!C89070n.m154556a((Iterable) list, (Object) t.getMember())) {
                    arrayList.add(t);
                }
            }
            m99200a(EnumC54000e.RemoveMember, str, arrayList);
        }
    }

    /* renamed from: c */
    public static void m99203c(String str, List<? extends C19537ah> list) {
        if (!(str == null || str.length() == 0 || list == null || list.isEmpty())) {
            List<C54006a> list2 = f123796c.get(str);
            for (T t : list2) {
                int a = C89070n.m154546a((List) list, (Object) t.getMember());
                if (a >= 0) {
                    t.setMember((C19537ah) list.get(a));
                }
            }
            EnumC54000e eVar = EnumC54000e.UpdateMember;
            C89219l.m154716b(list2, "");
            m99200a(eVar, str, list2);
        }
    }

    /* renamed from: a */
    public static void m99201a(String str, List<? extends C19537ah> list) {
        if (!(list == null || list.isEmpty())) {
            List<C54006a> list2 = f123796c.get(str);
            C89219l.m154716b(list2, "");
            List<C54006a> g = C89070n.m154585g((Collection) list2);
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) g, 10));
            for (C54006a aVar : g) {
                arrayList.add(aVar.getUid());
            }
            AbstractC88412b a = AbstractC88403ab.m153604a((Callable) new CallableC53983a(list, arrayList, g)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C53984b(str), C53985c.f123804a);
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, m99199a());
        }
    }

    /* renamed from: a */
    public final void mo91083a(String str, AbstractC53999d dVar) {
        C53995m mVar;
        C89219l.m154721d(str, "");
        List<C54006a> list = f123796c.get(str);
        Integer num = null;
        if (dVar != null) {
            mVar = new C53995m(new WeakReference(dVar));
            C89219l.m154721d(str, "");
            C89219l.m154721d(mVar, "");
            ConcurrentHashMap<String, CopyOnWriteArraySet<AbstractC53999d>> concurrentHashMap = f123794a;
            CopyOnWriteArraySet<AbstractC53999d> copyOnWriteArraySet = concurrentHashMap.get(str);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            }
            copyOnWriteArraySet.add(mVar);
            concurrentHashMap.put(str, copyOnWriteArraySet);
        } else {
            mVar = null;
        }
        StringBuilder append = new StringBuilder("getGroupMemberList conversation id = ").append(str).append(" cache size = ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        C56244a.m102191c("GroupMemberLoader", append.append(num).toString());
        if (list == null || list.isEmpty()) {
            ConcurrentHashMap<String, AbstractC17427b> concurrentHashMap2 = f123798e;
            AbstractC17427b bVar = concurrentHashMap2.get(str);
            if (bVar == null) {
                bVar = AbstractC17427b.C17428a.m32308a(str);
                bVar.mo27735a(new C53996n(bVar, bVar.mo27743b()));
                concurrentHashMap2.put(str, bVar);
            }
            bVar.mo27750d();
            return;
        }
        m99204d(str, list);
        if (mVar != null) {
            mVar.mo91089a(str, list, EnumC54000e.ReadFromCache);
        }
    }

    /* renamed from: a */
    public static void m99200a(EnumC54000e eVar, String str, List<C54006a> list) {
        f123796c.put(str, list);
        CopyOnWriteArraySet<AbstractC53999d> copyOnWriteArraySet = f123794a.get(str);
        if (copyOnWriteArraySet != null) {
            Iterator<AbstractC53999d> it = copyOnWriteArraySet.iterator();
            C89219l.m154716b(it, "");
            while (it.hasNext()) {
                it.next().mo91089a(str, list, eVar);
            }
        }
        ConcurrentHashMap<String, C54006a> concurrentHashMap = new ConcurrentHashMap<>();
        for (T t : list) {
            concurrentHashMap.put(t.getUid(), t);
        }
        f123795b.put(str, concurrentHashMap);
        C56244a.m102190b("GroupMemberLoader", "setMemberList for " + str + " from : " + eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (r0 != null) goto L_0x007f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a m99198a(com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC53997b r9, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53998c r10, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC54002g r11) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53982a.m99198a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.c, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g):com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a");
    }
}
