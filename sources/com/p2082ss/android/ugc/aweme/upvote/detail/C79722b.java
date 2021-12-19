package com.p2082ss.android.ugc.aweme.upvote.detail;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.p4190d.C79715a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.b */
public final class C79722b {

    /* renamed from: a */
    public static final C79722b f178886a = new C79722b();

    /* renamed from: b */
    private static final AbstractC89244h f178887b = C89250i.m154773a((AbstractC89171a) C79724b.f178892a);

    /* renamed from: c */
    private static final AbstractC89244h f178888c = C89250i.m154773a((AbstractC89171a) C79726d.f178894a);

    /* renamed from: d */
    private static final AbstractC89244h f178889d = C89250i.m154773a((AbstractC89171a) C79723a.f178891a);

    /* renamed from: e */
    private static final AbstractC89244h f178890e = C89250i.m154773a((AbstractC89171a) C79725c.f178893a);

    /* renamed from: a */
    public static HashMap<String, UpvoteReason> m138556a() {
        return (HashMap) f178887b.getValue();
    }

    /* renamed from: b */
    public static HashMap<String, Integer> m138560b() {
        return (HashMap) f178888c.getValue();
    }

    /* renamed from: c */
    public static HashSet<String> m138561c() {
        return (HashSet) f178889d.getValue();
    }

    /* renamed from: d */
    public static LruCache<String, C79711e> m138562d() {
        return (LruCache) f178890e.getValue();
    }

    private C79722b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.b$a */
    static final class C79723a extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C79723a f178891a = new C79723a();

        static {
            Covode.recordClassIndex(92945);
        }

        C79723a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.b$b */
    static final class C79724b extends AbstractC89220m implements AbstractC89171a<HashMap<String, UpvoteReason>> {

        /* renamed from: a */
        public static final C79724b f178892a = new C79724b();

        static {
            Covode.recordClassIndex(92946);
        }

        C79724b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, UpvoteReason> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.b$d */
    static final class C79726d extends AbstractC89220m implements AbstractC89171a<HashMap<String, Integer>> {

        /* renamed from: a */
        public static final C79726d f178894a = new C79726d();

        static {
            Covode.recordClassIndex(92948);
        }

        C79726d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, Integer> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.b$c */
    static final class C79725c extends AbstractC89220m implements AbstractC89171a<LruCache<String, C79711e>> {

        /* renamed from: a */
        public static final C79725c f178893a = new C79725c();

        static {
            Covode.recordClassIndex(92947);
        }

        C79725c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LruCache<String, C79711e> invoke() {
            return new LruCache(C79715a.m138541a());
        }
    }

    static {
        Covode.recordClassIndex(92944);
    }

    /* renamed from: a */
    public static UpvoteReason m138555a(String str) {
        C89219l.m154721d(str, "");
        return m138556a().get(str);
    }

    /* renamed from: b */
    public static C79711e m138559b(String str) {
        C89219l.m154721d(str, "");
        C79711e eVar = m138562d().get(str);
        if (eVar == null) {
            return null;
        }
        List<C79714h> upvotes = eVar.getUpvotes();
        ArrayList arrayList = new ArrayList();
        for (T t : upvotes) {
            HashSet<String> c = m138561c();
            User user = t.getUser();
            String uid = user != null ? user.getUid() : null;
            if (!C89070n.m154556a((Iterable) c, (Object) uid)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        return C79711e.copy$default(eVar, arrayList2, 0, false, eVar.getTotal() - ((long) (eVar.getUpvotes().size() - arrayList2.size())), null, 22, null);
    }

    /* renamed from: a */
    public static void m138557a(String str, int i) {
        C89219l.m154721d(str, "");
        m138560b().put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m138558a(String str, C79711e eVar, boolean z) {
        T t;
        List<C79714h> upvotes;
        C79711e eVar2 = eVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar2, "");
        C79711e eVar3 = m138562d().get(str);
        boolean z2 = true;
        if (eVar3 == null || z) {
            LruCache<String, C79711e> d = m138562d();
            C89219l.m154721d(eVar2, "");
            C79711e eVar4 = m138562d().get(eVar2.getItemId());
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            if (eVar4 != null && (upvotes = eVar4.getUpvotes()) != null) {
                Iterator<T> it = upvotes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    User user = t2.getUser();
                    if (C89219l.m154714a((Object) (user != null ? user.getUid() : null), (Object) curUserId) && t2.isFake()) {
                        break;
                    }
                }
            } else {
                t = null;
            }
            List<C79714h> upvotes2 = eVar2.getUpvotes();
            if (!(upvotes2 instanceof Collection) || !upvotes2.isEmpty()) {
                Iterator<T> it2 = upvotes2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    User user2 = it2.next().getUser();
                    if (C89219l.m154714a((Object) (user2 != null ? user2.getUid() : null), (Object) curUserId)) {
                        break;
                    }
                }
                if (t != null && !z2) {
                    List g2 = C89070n.m154585g((Collection) eVar2.getUpvotes());
                    g2.add(0, t);
                    eVar2 = C79711e.copy$default(eVar2, g2, 0, false, eVar2.getTotal() + 1, null, 22, null);
                }
                d.put(str, eVar2);
            }
            z2 = false;
            List g22 = C89070n.m154585g((Collection) eVar2.getUpvotes());
            g22.add(0, t);
            eVar2 = C79711e.copy$default(eVar2, g22, 0, false, eVar2.getTotal() + 1, null, 22, null);
            d.put(str, eVar2);
        } else if (eVar2.getCursor() == eVar3.getCursor() + 20) {
            List<C79714h> upvotes3 = eVar3.getUpvotes();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) upvotes3, 10));
            Iterator<T> it3 = upvotes3.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().getCommentId());
            }
            Set l = C89070n.m154592l(arrayList);
            List g3 = C89070n.m154585g((Collection) eVar3.getUpvotes());
            List<C79714h> upvotes4 = eVar2.getUpvotes();
            ArrayList arrayList2 = new ArrayList();
            for (T t3 : upvotes4) {
                if (!l.contains(t3.getCommentId())) {
                    arrayList2.add(t3);
                }
            }
            g3.addAll(arrayList2);
            m138562d().put(str, C79711e.copy$default(eVar2, g3, 0, false, 0, null, 30, null));
        }
    }
}
