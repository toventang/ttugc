package com.p2082ss.android.ugc.aweme.comment;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36216b;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtSummonFriendList;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36544e;
import com.p2082ss.android.ugc.aweme.comment.util.C37222w;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p2082ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34911d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.a */
public final class C36164a {

    /* renamed from: h */
    public static final C36165a f85429h = new C36165a((byte) 0);

    /* renamed from: a */
    public AbstractC36166b f85430a;

    /* renamed from: b */
    public C36216b f85431b;

    /* renamed from: c */
    public CommentAtSummonFriendList f85432c = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");

    /* renamed from: d */
    final HashMap<String, CommentAtSummonFriendList> f85433d = new HashMap<>();

    /* renamed from: e */
    public CommentAtSummonFriendList f85434e = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");

    /* renamed from: f */
    public String f85435f = "";

    /* renamed from: g */
    public final C37222w f85436g = new C37222w();

    /* renamed from: i */
    private CommentAtSummonFriendList f85437i = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");

    /* renamed from: j */
    private final AbstractC89244h f85438j = C89250i.m154773a((AbstractC89171a) C36172h.f85449a);

    /* renamed from: com.ss.android.ugc.aweme.comment.a$b */
    public interface AbstractC36166b {
        static {
            Covode.recordClassIndex(43426);
        }

        /* renamed from: a */
        void mo63326a();

        /* renamed from: a */
        void mo63327a(boolean z);

        /* renamed from: a */
        boolean mo63328a(String str);

        /* renamed from: b */
        void mo63329b();

        /* renamed from: c */
        void mo63330c();
    }

    static {
        Covode.recordClassIndex(43424);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$a */
    public static final class C36165a {
        static {
            Covode.recordClassIndex(43425);
        }

        private C36165a() {
        }

        public /* synthetic */ C36165a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$h */
    static final class C36172h extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C36172h f85449a = new C36172h();

        static {
            Covode.recordClassIndex(43432);
        }

        C36172h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    /* renamed from: a */
    public final AbstractC36166b mo63318a() {
        AbstractC36166b bVar = this.f85430a;
        if (bVar == null) {
            C89219l.m154710a("listener");
        }
        return bVar;
    }

    /* renamed from: b */
    public final C36216b mo63324b() {
        C36216b bVar = this.f85431b;
        if (bVar == null) {
            C89219l.m154710a("adapter");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo63325c() {
        AbstractC36166b bVar = this.f85430a;
        if (bVar == null) {
            C89219l.m154710a("listener");
        }
        bVar.mo63326a();
    }

    /* renamed from: d */
    private final void m73708d() {
        this.f85434e = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");
        C36216b bVar = this.f85431b;
        if (bVar == null) {
            C89219l.m154710a("adapter");
        }
        bVar.mo62377b_(this.f85434e.items);
        C36216b bVar2 = this.f85431b;
        if (bVar2 == null) {
            C89219l.m154710a("adapter");
        }
        bVar2.notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$c */
    public static final class C36167c implements C37222w.AbstractC37223a {

        /* renamed from: a */
        final /* synthetic */ C36164a f85439a;

        static {
            Covode.recordClassIndex(43427);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C36167c(C36164a aVar) {
            this.f85439a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.util.C37222w.AbstractC37223a
        /* renamed from: a */
        public final void mo63331a(String str) {
            C89219l.m154721d(str, "");
            this.f85439a.mo63322a(str, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$e */
    public static final class C36169e implements AbstractC88986z<SummonFriendList> {

        /* renamed from: a */
        final /* synthetic */ C36164a f85442a;

        /* renamed from: b */
        final /* synthetic */ int f85443b;

        static {
            Covode.recordClassIndex(43429);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(SummonFriendList summonFriendList) {
            SummonFriendList summonFriendList2 = summonFriendList;
            C89219l.m154721d(summonFriendList2, "");
            this.f85442a.mo63324b().aq_();
            C36164a aVar = this.f85442a;
            CommentAtSummonFriendList commonAtSummonFriendList = CommentAtSummonFriendList.toCommonAtSummonFriendList(summonFriendList2);
            C89219l.m154716b(commonAtSummonFriendList, "");
            aVar.mo63321a(commonAtSummonFriendList, this.f85443b);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f85442a.mo63324b().aq_();
            this.f85442a.mo63324b().mo67824j();
            this.f85442a.mo63318a().mo63327a(true);
            if (this.f85443b == 0) {
                this.f85442a.mo63318a().mo63330c();
            }
        }

        C36169e(C36164a aVar, int i) {
            this.f85442a = aVar;
            this.f85443b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$f */
    public static final class C36170f implements AbstractC88986z<RecentFriendModel> {

        /* renamed from: a */
        final /* synthetic */ C36164a f85444a;

        /* renamed from: b */
        final /* synthetic */ int f85445b;

        static {
            Covode.recordClassIndex(43430);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f85444a.mo63324b().aq_();
            this.f85444a.mo63324b().mo67823i();
            this.f85444a.mo63318a().mo63327a(true);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(RecentFriendModel recentFriendModel) {
            String str;
            RecentFriendModel recentFriendModel2 = recentFriendModel;
            C89219l.m154721d(recentFriendModel2, "");
            this.f85444a.mo63324b().aq_();
            SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), recentFriendModel2.cursor, recentFriendModel2.hasMore, "");
            ArrayList arrayList = new ArrayList();
            for (T t : recentFriendModel2.blockResults) {
                if (t.f82362b.get(0).f82364b == 1) {
                    arrayList.add(t.f82361a);
                }
            }
            for (T t2 : recentFriendModel2.users) {
                List<CommentAtSummonFriendItem> list = this.f85444a.f85432c.items;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        C89219l.m154716b(next, "");
                        CommentAtUser commentAtUser = next.mUser;
                        if (commentAtUser != null) {
                            str = commentAtUser.uid;
                        } else {
                            str = null;
                        }
                        if (C89219l.m154714a((Object) str, (Object) t2.getUid())) {
                            break;
                        }
                    }
                }
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.mUser = t2;
                summonFriendItem.isMentionBlocked = arrayList.contains(t2.getUid());
                summonFriendList.items.add(summonFriendItem);
            }
            C36164a aVar = this.f85444a;
            CommentAtSummonFriendList commonAtSummonFriendList = CommentAtSummonFriendList.toCommonAtSummonFriendList(summonFriendList);
            C89219l.m154716b(commonAtSummonFriendList, "");
            aVar.mo63321a(commonAtSummonFriendList, this.f85445b);
        }

        C36170f(C36164a aVar, int i) {
            this.f85444a = aVar;
            this.f85445b = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.a$g */
    public static final class C36171g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C36164a f85446a;

        /* renamed from: b */
        final /* synthetic */ String f85447b;

        /* renamed from: c */
        final /* synthetic */ int f85448c;

        static {
            Covode.recordClassIndex(43431);
        }

        C36171g(C36164a aVar, String str, int i) {
            this.f85446a = aVar;
            this.f85447b = str;
            this.f85448c = i;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Integer num;
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                Object d = iVar.mo5545d();
                C89219l.m154716b(d, "");
                this.f85446a.mo63324b().aq_();
                C36164a aVar = this.f85446a;
                String str = this.f85447b;
                CommentAtSummonFriendList fromSearchSug = CommentAtSummonFriendList.fromSearchSug((C67683h) d, str);
                C89219l.m154716b(fromSearchSug, "");
                aVar.mo63323a(str, fromSearchSug, this.f85448c);
                AbstractC36166b bVar = aVar.f85430a;
                if (bVar == null) {
                    C89219l.m154710a("listener");
                }
                if (bVar.mo63328a(str)) {
                    C36216b bVar2 = aVar.f85431b;
                    if (bVar2 == null) {
                        C89219l.m154710a("adapter");
                    }
                    bVar2.f85532b = 1;
                    AbstractC36166b bVar3 = aVar.f85430a;
                    if (bVar3 == null) {
                        C89219l.m154710a("listener");
                    }
                    bVar3.mo63327a(true);
                    C36216b bVar4 = aVar.f85431b;
                    if (bVar4 == null) {
                        C89219l.m154710a("adapter");
                    }
                    bVar4.mo67829d(fromSearchSug.hasMore);
                    CommentAtSummonFriendList commentAtSummonFriendList = aVar.f85433d.get(str);
                    if (commentAtSummonFriendList != null) {
                        aVar.f85434e = commentAtSummonFriendList;
                        C36216b bVar5 = aVar.f85431b;
                        if (bVar5 == null) {
                            C89219l.m154710a("adapter");
                        }
                        bVar5.mo62377b_(aVar.f85434e.items);
                        List<CommentAtSummonFriendItem> list = aVar.f85434e.items;
                        if (list == null || list.isEmpty()) {
                            aVar.mo63325c();
                        }
                        C33744d a = new C33744d().mo59983a("search_position", "comments").mo59983a("new_sug_session_id", C36544e.f86527a).mo59983a("impr_id", fromSearchSug.requestId).mo59983a("raw_query", str);
                        C36216b bVar6 = aVar.f85431b;
                        if (bVar6 == null) {
                            C89219l.m154710a("adapter");
                        }
                        List e = bVar6.mo63369e();
                        if (e != null) {
                            num = Integer.valueOf(e.size());
                        } else {
                            num = null;
                        }
                        C39162r.m79460a("trending_show", a.mo59982a("words_num", num).f79943a);
                    }
                }
            } else {
                this.f85446a.mo63324b().aq_();
                this.f85446a.mo63324b().mo67823i();
                this.f85446a.mo63318a().mo63327a(true);
                if (this.f85448c == 0) {
                    this.f85446a.mo63318a().mo63330c();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo63320a(long j, int i) {
        if (i == 0) {
            AbstractC88979t.m154296a(SummonFriendApi.f118656a.queryRecentFriends4AtV2(3), SummonFriendApi.m95879a(20, (int) j), new C36168d(this, new ArrayList())).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new C36169e(this, i));
            return;
        }
        SummonFriendApi.m95879a(20, (int) j).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C36170f(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.a$d */
    public static final class C36168d<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        final /* synthetic */ C36164a f85440a;

        /* renamed from: b */
        final /* synthetic */ List f85441b;

        static {
            Covode.recordClassIndex(43428);
        }

        C36168d(C36164a aVar, List list) {
            this.f85440a = aVar;
            this.f85441b = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            C34911d dVar = (C34911d) obj;
            RecentFriendModel recentFriendModel = (RecentFriendModel) obj2;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(recentFriendModel, "");
            SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), 0, false, "");
            this.f85440a.f85432c.items.clear();
            for (T t : dVar.f82367b) {
                if (t.f82362b.get(0).f82364b == 1) {
                    this.f85441b.add(t.f82361a);
                }
            }
            for (T t2 : recentFriendModel.blockResults) {
                if (t2.f82362b.get(0).f82364b == 1 && !this.f85441b.contains(t2.f82361a)) {
                    this.f85441b.add(t2.f82361a);
                }
            }
            for (T t3 : dVar.f82366a) {
                List<User> list = recentFriendModel.users;
                ArrayList<Object> arrayList = new ArrayList();
                for (T t4 : list) {
                    if (C89219l.m154714a((Object) t3.getUid(), (Object) t4.getUid())) {
                        arrayList.add(t4);
                    }
                }
                for (Object obj3 : arrayList) {
                    recentFriendModel.users.remove(obj3);
                }
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.mUser = t3;
                summonFriendItem.type = 4;
                summonFriendItem.isMentionBlocked = this.f85441b.contains(t3.getUid());
                summonFriendList.items.add(summonFriendItem);
                this.f85440a.f85432c.items.add(CommentAtSummonFriendItem.toCommentAtSummonFriendItem(summonFriendItem));
            }
            for (T t5 : recentFriendModel.users) {
                SummonFriendItem summonFriendItem2 = new SummonFriendItem();
                summonFriendItem2.mUser = t5;
                summonFriendItem2.type = 3;
                summonFriendItem2.isMentionBlocked = this.f85441b.contains(t5.getUid());
                summonFriendList.items.add(summonFriendItem2);
            }
            summonFriendList.cursor = recentFriendModel.cursor;
            summonFriendList.hasMore = recentFriendModel.hasMore;
            return summonFriendList;
        }
    }

    /* renamed from: a */
    public final void mo63319a(int i, Editable editable) {
        List<CommentAtSummonFriendItem> list;
        boolean z;
        String a = m73707a(i, editable, true);
        if (a == null) {
            mo63325c();
            return;
        }
        AbstractC36166b bVar = this.f85430a;
        if (bVar == null) {
            C89219l.m154710a("listener");
        }
        bVar.mo63329b();
        this.f85434e.keyword = a;
        if (this.f85433d.containsKey(a)) {
            CommentAtSummonFriendList commentAtSummonFriendList = this.f85433d.get(a);
            if (commentAtSummonFriendList == null || (list = commentAtSummonFriendList.items) == null || list.isEmpty()) {
                mo63325c();
                return;
            }
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C36216b bVar2 = this.f85431b;
                if (bVar2 == null) {
                    C89219l.m154710a("adapter");
                }
                bVar2.f85532b = 0;
            } else {
                C36216b bVar3 = this.f85431b;
                if (bVar3 == null) {
                    C89219l.m154710a("adapter");
                }
                bVar3.f85532b = 1;
            }
            AbstractC36166b bVar4 = this.f85430a;
            if (bVar4 == null) {
                C89219l.m154710a("listener");
            }
            bVar4.mo63327a(true);
            this.f85434e = commentAtSummonFriendList;
            commentAtSummonFriendList.keyword = a;
            C36216b bVar5 = this.f85431b;
            if (bVar5 == null) {
                C89219l.m154710a("adapter");
            }
            bVar5.mo62377b_(commentAtSummonFriendList.items);
            C36216b bVar6 = this.f85431b;
            if (bVar6 == null) {
                C89219l.m154710a("adapter");
            }
            bVar6.mo67829d(commentAtSummonFriendList.hasMore);
        } else if (a.length() == 0) {
            m73708d();
            AbstractC36166b bVar7 = this.f85430a;
            if (bVar7 == null) {
                C89219l.m154710a("listener");
            }
            bVar7.mo63327a(false);
            mo63320a(0, 0);
        } else {
            m73708d();
            AbstractC36166b bVar8 = this.f85430a;
            if (bVar8 == null) {
                C89219l.m154710a("listener");
            }
            bVar8.mo63327a(false);
            C37222w wVar = this.f85436g;
            C89219l.m154721d(a, "");
            C37222w.AbstractC37224b bVar9 = wVar.f87760a;
            if (bVar9 != null) {
                bVar9.mo64779a(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo63321a(CommentAtSummonFriendList commentAtSummonFriendList, int i) {
        mo63323a("", commentAtSummonFriendList, i);
        AbstractC36166b bVar = this.f85430a;
        if (bVar == null) {
            C89219l.m154710a("listener");
        }
        if (bVar.mo63328a("")) {
            C36216b bVar2 = this.f85431b;
            if (bVar2 == null) {
                C89219l.m154710a("adapter");
            }
            bVar2.f85532b = 0;
            AbstractC36166b bVar3 = this.f85430a;
            if (bVar3 == null) {
                C89219l.m154710a("listener");
            }
            bVar3.mo63327a(true);
            C36216b bVar4 = this.f85431b;
            if (bVar4 == null) {
                C89219l.m154710a("adapter");
            }
            bVar4.mo67829d(commentAtSummonFriendList.hasMore);
            CommentAtSummonFriendList commentAtSummonFriendList2 = this.f85433d.get("");
            if (commentAtSummonFriendList2 != null) {
                this.f85437i = commentAtSummonFriendList2;
                if (i == 0) {
                    C36216b bVar5 = this.f85431b;
                    if (bVar5 == null) {
                        C89219l.m154710a("adapter");
                    }
                    bVar5.mo62377b_(this.f85437i.items);
                    this.f85434e = this.f85437i;
                } else {
                    this.f85434e = commentAtSummonFriendList2;
                    C36216b bVar6 = this.f85431b;
                    if (bVar6 == null) {
                        C89219l.m154710a("adapter");
                    }
                    bVar6.mo62377b_(this.f85434e.items);
                }
                List<CommentAtSummonFriendItem> list = this.f85434e.items;
                if (list != null && !list.isEmpty()) {
                    return;
                }
            }
            mo63325c();
        }
    }

    /* renamed from: a */
    public final void mo63322a(String str, int i) {
        ArrayList arrayList;
        List<CommentAtSummonFriendItem> list;
        CommentAtUser commentAtUser;
        String str2;
        C89219l.m154721d(str, "");
        CommentAtSummonFriendList commentAtSummonFriendList = this.f85433d.get(str);
        if (commentAtSummonFriendList == null || (list = commentAtSummonFriendList.items) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                if (!(t == null || (commentAtUser = t.mUser) == null || (str2 = commentAtUser.uid) == null)) {
                    arrayList2.add(str2);
                }
            }
            arrayList = arrayList2;
        }
        ((ISearchUserService) this.f85438j.getValue()).mo106814a(new C67681g(3, null, str, "comment_user", 10, arrayList)).mo5534a(new C36171g(this, str, i), C1731i.f5564c, null);
    }

    /* renamed from: a */
    public static String m73707a(int i, Editable editable, boolean z) {
        boolean z2;
        if (editable == null || editable.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && i != 0) {
            Object obj = null;
            for (Object obj2 : C89271h.m154766a(0, i)) {
                if (editable.charAt(((Number) obj2).intValue()) == '@') {
                    obj = obj2;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                MentionEditText.MentionSpan[] mentionSpanArr = (MentionEditText.MentionSpan[]) editable.getSpans(intValue, i, MentionEditText.MentionSpan.class);
                if (!(mentionSpanArr == null || mentionSpanArr.length == 0)) {
                    return null;
                }
                String obj3 = editable.subSequence(intValue + 1, i).toString();
                if (C89361p.m154908a((CharSequence) obj3, (CharSequence) "  ", false) || C89361p.m154922c((CharSequence) obj3, '\n')) {
                    return null;
                }
                if (z) {
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                    obj3 = C89361p.m154910b((CharSequence) obj3).toString();
                }
                if (obj3.length() > 24) {
                    return null;
                }
                return obj3;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63323a(String str, CommentAtSummonFriendList commentAtSummonFriendList, int i) {
        CommentAtSummonFriendList commentAtSummonFriendList2;
        List<CommentAtSummonFriendItem> list;
        if (i == 0) {
            this.f85433d.put(str, commentAtSummonFriendList);
            CommentAtSummonFriendList commentAtSummonFriendList3 = this.f85433d.get(str);
            if (commentAtSummonFriendList3 != null) {
                commentAtSummonFriendList3.keyword = str;
            }
        } else if (i == 1) {
            if (this.f85433d.get(str) == null || (commentAtSummonFriendList2 = this.f85433d.get(str)) == null || commentAtSummonFriendList2.items == null) {
                this.f85433d.put(str, commentAtSummonFriendList);
                CommentAtSummonFriendList commentAtSummonFriendList4 = this.f85433d.get(str);
                if (commentAtSummonFriendList4 != null) {
                    commentAtSummonFriendList4.keyword = str;
                    return;
                }
                return;
            }
            CommentAtSummonFriendList commentAtSummonFriendList5 = this.f85433d.get(str);
            if (!(commentAtSummonFriendList5 == null || (list = commentAtSummonFriendList5.items) == null)) {
                List<CommentAtSummonFriendItem> list2 = commentAtSummonFriendList.items;
                C89219l.m154716b(list2, "");
                list.addAll(list2);
            }
            CommentAtSummonFriendList commentAtSummonFriendList6 = this.f85433d.get(str);
            if (commentAtSummonFriendList6 != null) {
                commentAtSummonFriendList6.cursor = commentAtSummonFriendList.cursor;
            }
            CommentAtSummonFriendList commentAtSummonFriendList7 = this.f85433d.get(str);
            if (commentAtSummonFriendList7 != null) {
                commentAtSummonFriendList7.keyword = str;
            }
            CommentAtSummonFriendList commentAtSummonFriendList8 = this.f85433d.get(str);
            if (commentAtSummonFriendList8 != null) {
                commentAtSummonFriendList8.hasMore = commentAtSummonFriendList.hasMore;
            }
        }
    }
}
