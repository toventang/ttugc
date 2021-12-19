package com.p2082ss.android.ugc.aweme.comment.barrage.p2488c;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33946d;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell;
import com.p2082ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell;
import com.p2082ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleEmojiCell;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36307b;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.C36378a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.comment.model.LikeListResponse;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36491b;
import com.p2082ss.android.ugc.aweme.comment.util.C37199i;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.C37265a;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.LikeListVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.c.c */
public final class C36322c extends AbstractC36318a implements AbstractC1214u<C33942b>, AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C36323a f85856e = new C36323a((byte) 0);

    /* renamed from: c */
    public final String f85857c;

    /* renamed from: d */
    public final C36491b f85858d;

    /* renamed from: f */
    private boolean f85859f = true;

    /* renamed from: g */
    private int f85860g;

    /* renamed from: h */
    private int f85861h;

    /* renamed from: i */
    private final AbstractC89244h f85862i = C89250i.m154773a((AbstractC89171a) new C36324b(this));

    /* renamed from: j */
    private final AbstractC89244h f85863j = C89250i.m154773a((AbstractC89171a) new C36325c(this));

    /* renamed from: k */
    private List<? extends AbstractC17641a> f85864k;

    /* renamed from: l */
    private AbstractC89124d<? super AbstractC17700f<C36320b>> f85865l;

    /* renamed from: m */
    private AbstractC17641a f85866m;

    static {
        Covode.recordClassIndex(43599);
    }

    /* renamed from: d */
    private final CommentListViewModel m74029d() {
        return (CommentListViewModel) this.f85862i.getValue();
    }

    /* renamed from: e */
    private final LikeListVM m74030e() {
        return (LikeListVM) this.f85863j.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(80, new RunnableC90250g(C36322c.class, "onCommentDeleteEvent", C36387c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCommentDeleteEvent(C36387c cVar) {
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.c.c$a */
    public static final class C36323a {
        static {
            Covode.recordClassIndex(43600);
        }

        private C36323a() {
        }

        public /* synthetic */ C36323a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.AbstractC36318a
    /* renamed from: b */
    public final void mo63566b() {
        super.mo63566b();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.c.c$c */
    static final class C36325c extends AbstractC89220m implements AbstractC89171a<LikeListVM> {

        /* renamed from: a */
        final /* synthetic */ C36322c f85868a;

        static {
            Covode.recordClassIndex(43602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36325c(C36322c cVar) {
            super(0);
            this.f85868a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LikeListVM invoke() {
            ActivityC0945e activity = this.f85868a.f85858d.mo63864b().getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            return LikeListVM.C37250a.m75257a(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.AbstractC36318a
    /* renamed from: a */
    public final void mo63562a() {
        this.f85850b.mo28083a(ReactionBubbleDescriptionCell.class, ReactionBubbleCommentCell.class, ReactionBubbleEmojiCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.c.c$b */
    static final class C36324b extends AbstractC89220m implements AbstractC89171a<CommentListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C36322c f85867a;

        static {
            Covode.recordClassIndex(43601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36324b(C36322c cVar) {
            super(0);
            this.f85867a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CommentListViewModel invoke() {
            ActivityC0945e activity = this.f85867a.f85858d.mo63864b().getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            ActivityC0945e activity2 = this.f85867a.f85858d.mo63864b().getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            C89219l.m154721d(activity, "");
            C89219l.m154721d(activity2, "");
            AbstractC1174ac a = C33946d.m69515a(activity, activity2, new C37265a(activity)).mo3983a(CommentListViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: a */
    private final void m74026a(C33942b bVar) {
        if (C89219l.m154714a(bVar.mo60212a(), (Object) this.f85849a)) {
            AbstractC89124d<? super AbstractC17700f<C36320b>> dVar = this.f85865l;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception())));
            }
            this.f85865l = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.AbstractC36318a
    /* renamed from: a */
    public final void mo63563a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f85860g = 0;
        this.f85861h = 0;
        User author = aweme.getAuthor();
        C89219l.m154716b(author, "");
        this.f85866m = new C36307b(author, aweme, aweme.getCreateTime() * 1000, this.f85850b.getMMobEventParam());
        this.f85850b.getState().mo28132a(this.f85866m);
        this.f85859f = CommentServiceImpl.m73664e().mo63304b(aweme);
        super.mo63563a(aweme);
        C80298cg.m139204a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.AbstractC36318a
    /* renamed from: a */
    public final void mo63564a(AbstractC89124d<? super AbstractC17700f<C36320b>> dVar) {
        C89219l.m154721d(dVar, "");
        this.f85865l = dVar;
        if (this.f85859f) {
            m74029d().mo64783a(this.f85849a, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC17641a aVar = this.f85866m;
        if (aVar != null) {
            arrayList.add(0, aVar);
        }
        this.f85864k = arrayList;
        m74030e().mo64805b().mo64816a(this.f85849a, 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        StringBuilder sb = new StringBuilder("onChanged  ");
        String str2 = null;
        if (bVar2 != null) {
            str2 = bVar2.f80277a;
        }
        C37199i.m75173a("CommentAndLikeListMgr", sb.append(str2).toString());
        if (bVar2 != null && (str = bVar2.f80277a) != null) {
            switch (str.hashCode()) {
                case -1108427715:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS")) {
                        C89378p pVar = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar.getFirst(), (Object) this.f85849a)) {
                            m74027a((CommentItemList) pVar.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -1077696328:
                    if (str.equals("REFRESH_LIKED_LIST_SUCCESS")) {
                        C89378p pVar2 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar2.getFirst(), (Object) this.f85849a)) {
                            m74028a((LikeListResponse) pVar2.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case -734123415:
                    if (str.equals("REFRESH_LIKED_LIST_FAIL")) {
                        m74026a(bVar2);
                        return;
                    }
                    return;
                case -249497211:
                    if (str.equals("LOAD_MORE_LIKED_LIST_SUCCESS")) {
                        C89378p pVar3 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar3.getFirst(), (Object) this.f85849a)) {
                            m74028a((LikeListResponse) pVar3.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -108517967:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_FAIL")) {
                        m74026a(bVar2);
                        return;
                    }
                    return;
                case -70365948:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_FAIL")) {
                        m74026a(bVar2);
                        return;
                    }
                    return;
                case 471107696:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_SUCCESS")) {
                        C89378p pVar4 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar4.getFirst(), (Object) this.f85849a)) {
                            m74027a((CommentItemList) pVar4.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case 1780372668:
                    if (str.equals("LOAD_MORE_LIKED_LIST_FAIL")) {
                        m74026a(bVar2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private final void m74027a(CommentItemList commentItemList, boolean z) {
        List<Comment> replyComments;
        List<Comment> list = commentItemList.items;
        if (list == null) {
            list = C89086z.INSTANCE;
        }
        C37199i.m75173a("CommentAndLikeListMgr", "handleCommentListData original comment size " + list.size());
        ArrayList<Comment> arrayList = new ArrayList();
        for (Comment comment : list) {
            C89219l.m154716b(comment, "");
            arrayList.add(comment);
            if (list.size() < 20 && (replyComments = comment.getReplyComments()) != null) {
                arrayList.addAll(replyComments);
            }
        }
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
        for (Comment comment2 : arrayList) {
            arrayList2.add(C36378a.m74089a(comment2, this.f85850b.getMMobEventParam()));
        }
        List<? extends AbstractC17641a> g = C89070n.m154585g((Collection) arrayList2);
        AbstractC17641a aVar = this.f85866m;
        if (aVar != null && z) {
            g.add(0, aVar);
        }
        this.f85861h++;
        C37199i.m75173a("CommentAndLikeListMgr", "currentCommentLoadTimes:" + this.f85861h + " commentItems: " + g.size() + " handleCommentListData: " + z + " hasmore " + commentItemList.hasMore + ' ' + this.f85864k);
        if (!commentItemList.hasMore || this.f85861h >= 5) {
            this.f85864k = g;
            m74030e().mo64805b().mo64816a(this.f85849a, 0);
            return;
        }
        AbstractC89124d<? super AbstractC17700f<C36320b>> dVar = this.f85865l;
        if (dVar != null) {
            dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, new C36320b(1, commentItemList.cursor), g, 1)));
        }
        this.f85865l = null;
        if (z && g.size() > 1) {
            this.f85850b.mo27122r();
        }
    }

    /* renamed from: a */
    private final void m74028a(LikeListResponse likeListResponse, boolean z) {
        ArrayList arrayList;
        if (likeListResponse.getLikeList() == null) {
            arrayList = C89086z.INSTANCE;
        } else {
            List<User> likeList = likeListResponse.getLikeList();
            if (likeList == null) {
                C89219l.m154715b();
            }
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) likeList, 10));
            Iterator<T> it = likeList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C36378a.m74090a((User) it.next(), this.f85850b.getMMobEventParam()));
            }
            arrayList = arrayList2;
        }
        C37199i.m75173a("CommentAndLikeListMgr", "handleLikedListData data:hasmore:" + likeListResponse.getHasMore() + " likedListItems:" + arrayList.size() + " currentLikeLoadTimes:" + this.f85860g + ' ' + this.f85864k + "  ");
        Collection collection = this.f85864k;
        if (collection == null) {
            collection = C89086z.INSTANCE;
        }
        List d = C89070n.m154572d(collection, (Iterable) arrayList);
        this.f85860g++;
        this.f85864k = null;
        if (!likeListResponse.getHasMore() || this.f85861h >= 5) {
            AbstractC89124d<? super AbstractC17700f<C36320b>> dVar = this.f85865l;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(d)));
            }
        } else {
            AbstractC89124d<? super AbstractC17700f<C36320b>> dVar2 = this.f85865l;
            if (dVar2 != null) {
                dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, new C36320b(2, likeListResponse.getCursor()), d, 1)));
            }
        }
        this.f85865l = null;
        C37199i.m75173a("CommentAndLikeListMgr", "handleLikedListData:powerItemssize:" + d.size() + ' ' + d);
        if (z && d.size() > 1) {
            this.f85850b.mo27122r();
        } else if (d.size() == 1) {
            AwemeCommentBubbleList awemeCommentBubbleList = this.f85850b;
            awemeCommentBubbleList.f85965S = awemeCommentBubbleList.getFirstDataPositionInState();
            awemeCommentBubbleList.mo63602s();
            awemeCommentBubbleList.mo4413b(0);
            awemeCommentBubbleList.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.AbstractC36318a
    /* renamed from: a */
    public final void mo63565a(AbstractC89124d<? super AbstractC17700f<C36320b>> dVar, C36320b bVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        this.f85865l = dVar;
        if (bVar.f85854a == 1) {
            m74029d().mo64783a(this.f85849a, bVar.f85855b);
        } else {
            m74030e().mo64805b().mo64816a(this.f85849a, bVar.f85855b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36322c(String str, C36491b bVar, AwemeCommentBubbleList awemeCommentBubbleList) {
        super(awemeCommentBubbleList);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(awemeCommentBubbleList, "");
        this.f85857c = str;
        this.f85858d = bVar;
        CommentListViewModel d = m74029d();
        d.mo60189a("REFRESH_STORY_COMMENT_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("REFRESH_STORY_COMMENT_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        LikeListVM.BubbleBridge b = m74030e().mo64805b();
        b.mo60189a("REFRESH_LIKED_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        b.mo60189a("REFRESH_LIKED_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        b.mo60189a("LOAD_MORE_LIKED_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        b.mo60189a("LOAD_MORE_LIKED_LIST_FAIL", (AbstractC1214u<C33942b>) this);
    }
}
