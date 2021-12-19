package com.p2082ss.android.ugc.aweme.upvote.detail;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.p2082ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79708b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79712f;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.EnumC79710d;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
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
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.d */
public final class C79788d implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C79788d f178999a;

    /* renamed from: b */
    private static final AbstractC89244h f179000b = C89250i.m154773a((AbstractC89171a) C79794f.f179011a);

    /* renamed from: c */
    private static final AbstractC89244h f179001c = C89250i.m154773a((AbstractC89171a) C79795g.f179012a);

    /* renamed from: d */
    private static final AbstractC89244h f179002d = C89250i.m154773a((AbstractC89171a) C79789a.f179003a);

    /* renamed from: a */
    public static HashMap<String, List<AbstractC79752c>> m138614a() {
        return (HashMap) f179000b.getValue();
    }

    /* renamed from: b */
    static HashMap<String, UpvoteListViewModel> m138619b() {
        return (HashMap) f179001c.getValue();
    }

    /* renamed from: c */
    private static C88411a m138620c() {
        return (C88411a) f179002d.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(142, new RunnableC90250g(C79788d.class, "onUserBlocked", C63494a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private C79788d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.d$a */
    static final class C79789a extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C79789a f179003a = new C79789a();

        static {
            Covode.recordClassIndex(93013);
        }

        C79789a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.d$f */
    static final class C79794f extends AbstractC89220m implements AbstractC89171a<HashMap<String, List<AbstractC79752c>>> {

        /* renamed from: a */
        public static final C79794f f179011a = new C79794f();

        static {
            Covode.recordClassIndex(93018);
        }

        C79794f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, List<AbstractC79752c>> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.d$g */
    static final class C79795g extends AbstractC89220m implements AbstractC89171a<HashMap<String, UpvoteListViewModel>> {

        /* renamed from: a */
        public static final C79795g f179012a = new C79795g();

        static {
            Covode.recordClassIndex(93019);
        }

        C79795g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, UpvoteListViewModel> invoke() {
            return new HashMap();
        }
    }

    static {
        Covode.recordClassIndex(93012);
        C79788d dVar = new C79788d();
        f178999a = dVar;
        C80298cg.m139204a(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.d$c */
    public static final class C79791c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C79791c f179005a = new C79791c();

        static {
            Covode.recordClassIndex(93015);
        }

        C79791c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String.valueOf(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.d$b */
    public static final class C79790b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C79790b f179004a = new C79790b();

        static {
            Covode.recordClassIndex(93014);
        }

        C79790b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            for (T t : ((C79708b) obj).f178843a) {
                C79788d.f178999a.mo123370a(t.getItemId(), t, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.d$e */
    static final class C79793e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC79721a f179009a;

        /* renamed from: b */
        final /* synthetic */ long f179010b;

        static {
            Covode.recordClassIndex(93017);
        }

        C79793e(AbstractC79721a aVar, long j) {
            this.f179009a = aVar;
            this.f179010b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String.valueOf(th);
            AbstractC79721a aVar = this.f179009a;
            if (aVar != null) {
                C89219l.m154716b(th, "");
                aVar.mo123325a(th, this.f179010b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.d$d */
    static final class C79792d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f179006a;

        /* renamed from: b */
        final /* synthetic */ String f179007b;

        /* renamed from: c */
        final /* synthetic */ AbstractC79721a f179008c;

        static {
            Covode.recordClassIndex(93016);
        }

        C79792d(long j, String str, AbstractC79721a aVar) {
            this.f179006a = j;
            this.f179007b = str;
            this.f179008c = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C79711e eVar;
            C79712f fVar = (C79712f) obj;
            if (this.f179006a == 0) {
                z = true;
            } else {
                z = false;
            }
            C79788d.f178999a.mo123370a(this.f179007b, fVar.f178852a, z);
            if (!z || (eVar = C79722b.m138559b(this.f179007b)) == null) {
                eVar = fVar.f178852a;
            }
            AbstractC79721a aVar = this.f179008c;
            if (aVar != null) {
                aVar.mo123324a(eVar, this.f179006a);
            }
        }
    }

    /* renamed from: a */
    public static void m138615a(String str) {
        C79711e b = C79722b.m138559b(str);
        List<AbstractC79752c> list = m138614a().get(str);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo123320a(str, b);
            }
        }
    }

    @AbstractC90264r
    public final void onUserBlocked(C63494a aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        User user = aVar.f144112a;
        if (user == null || (str = user.getUid()) == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        C79722b.m138561c().add(str);
        Set<Map.Entry<String, List<AbstractC79752c>>> entrySet = m138614a().entrySet();
        C89219l.m154716b(entrySet, "");
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Object key = it.next().getKey();
            C89219l.m154716b(key, "");
            m138615a((String) key);
        }
    }

    /* renamed from: a */
    public static UpvoteListViewModel m138613a(String str, AbstractC1204m mVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        UpvoteListViewModel upvoteListViewModel = m138619b().get(str);
        if (upvoteListViewModel == null) {
            return UpvoteListViewModel.C79719a.m138552a(mVar);
        }
        return upvoteListViewModel;
    }

    /* renamed from: a */
    public static void m138617a(String str, AbstractC79752c cVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        List<AbstractC79752c> list = m138614a().get(str);
        if (list != null) {
            list.remove(cVar);
            if (list.isEmpty()) {
                m138614a().remove(str);
            }
        }
        if (m138614a().isEmpty()) {
            m138620c().mo142944a();
        }
    }

    /* renamed from: a */
    public static void m138618a(List<String> list, List<UpvoteReason> list2) {
        UpvoteApi upvoteApi = UpvoteApi.f178837a;
        String b = C80342dg.m139300a().mo46674b(list);
        C89219l.m154716b(b, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(C80342dg.m139300a().mo46674b(it.next()));
        }
        AbstractC88412b a = upvoteApi.getUpvoteBatchList(b, arrayList.toString()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C79790b.f179004a, C79791c.f179005a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, m138620c());
    }

    /* renamed from: a */
    public final void mo123369a(String str, EnumC79710d dVar) {
        T t;
        String str2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        if (C79722b.m138562d().get(str) != null) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            Iterator<T> it = C79722b.m138562d().get(str).getUpvotes().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                User user = t.getUser();
                if (user != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                if (C89219l.m154714a((Object) str2, (Object) curUserId)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                t2.setCacheState(dVar);
                if (dVar == EnumC79710d.PUBLISH_FAILED) {
                    t2.setText(null);
                }
            }
        }
        m138615a(str);
    }

    /* renamed from: a */
    public final void mo123371a(String str, C79714h hVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(hVar, "");
        if (C79722b.m138562d().get(str) != null) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            C79711e eVar = C79722b.m138562d().get(str);
            Iterator<T> it = eVar.getUpvotes().iterator();
            while (true) {
                String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                User user = next.getUser();
                if (user != null) {
                    str2 = user.getUid();
                }
                if (C89219l.m154714a((Object) str2, (Object) curUserId)) {
                    if (next != null) {
                        int indexOf = eVar.getUpvotes().indexOf(next);
                        List g2 = C89070n.m154585g((Collection) eVar.getUpvotes());
                        g2.set(indexOf, hVar);
                        C79722b.m138562d().put(str, C79711e.copy$default(eVar, g2, 0, false, 0, null, 30, null));
                    }
                }
            }
        }
        m138615a(str);
    }

    /* renamed from: a */
    public final void mo123372a(String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        if (C79722b.m138562d().get(str) == null) {
            C79722b.m138562d().put(str, new C79711e(C89070n.m154516a(new C79714h(null, str2, str, System.currentTimeMillis(), 0, 0, curUser, false, 0, false, null, 0, false, EnumC79710d.PRE_PUBLISH, 8113, null)), 0, false, 1, null, 22, null));
        } else {
            C79711e eVar = C79722b.m138562d().get(str);
            Iterator<T> it = eVar.getUpvotes().iterator();
            while (true) {
                str3 = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                User user = next.getUser();
                if (user != null) {
                    str3 = user.getUid();
                }
                C89219l.m154716b(curUser, "");
                if (C89219l.m154714a((Object) str3, (Object) curUser.getUid())) {
                    str3 = next;
                    break;
                }
            }
            C79714h hVar = (C79714h) str3;
            if (hVar == null) {
                C79714h hVar2 = new C79714h(null, str2, str, System.currentTimeMillis(), 0, 0, curUser, false, 0, false, null, 0, false, EnumC79710d.PRE_PUBLISH, 8113, null);
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar2);
                arrayList.addAll(eVar.getUpvotes());
                C79722b.m138562d().put(str, C79711e.copy$default(eVar, arrayList, 0, false, 1 + eVar.getTotal(), null, 22, null));
            } else {
                hVar.setText(str2);
            }
        }
        m138615a(str);
    }

    /* renamed from: a */
    public final void mo123370a(String str, C79711e eVar, boolean z) {
        C79722b.m138558a(str, eVar, z);
        m138615a(str);
    }

    /* renamed from: a */
    public static void m138616a(String str, UpvoteReason upvoteReason, long j, String str2, AbstractC79721a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC88412b a = UpvoteApi.f178837a.getUpvoteList(str, j, 20, str2, C80342dg.m139300a().mo46674b(upvoteReason)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C79792d(j, str, aVar), new C79793e(aVar, j));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, m138620c());
    }
}
