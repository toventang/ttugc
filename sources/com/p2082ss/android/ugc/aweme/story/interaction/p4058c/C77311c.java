package com.p2082ss.android.ugc.aweme.story.interaction.p4058c;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell;
import com.p2082ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell;
import com.p2082ss.android.ugc.aweme.story.interaction.cell.ReactionBubblePublishCell;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77296b;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77298d;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77301f;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryCommentListViewModel;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryLikedListViewModel;
import com.p2082ss.android.ugc.aweme.story.model.C77383f;
import com.p2082ss.android.ugc.aweme.story.view.ReactionBubbleList;
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

/* renamed from: com.ss.android.ugc.aweme.story.interaction.c.c */
public final class C77311c extends AbstractC77307a implements AbstractC1214u<C33942b>, AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C77312a f173443e = new C77312a((byte) 0);

    /* renamed from: d */
    public final String f173444d;

    /* renamed from: f */
    private final AbstractC89244h f173445f;

    /* renamed from: g */
    private final AbstractC89244h f173446g;

    /* renamed from: h */
    private List<? extends AbstractC17641a> f173447h;

    /* renamed from: i */
    private AbstractC89124d<? super AbstractC17700f<C77309b>> f173448i;

    /* renamed from: j */
    private boolean f173449j = true;

    /* renamed from: k */
    private AbstractC17641a f173450k;

    static {
        Covode.recordClassIndex(90330);
    }

    /* renamed from: d */
    private final StoryCommentListViewModel m135180d() {
        return (StoryCommentListViewModel) this.f173445f.getValue();
    }

    /* renamed from: e */
    private final StoryLikedListViewModel m135181e() {
        return (StoryLikedListViewModel) this.f173446g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final boolean mo120908a() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(80, new RunnableC90250g(C77311c.class, "onCommentDeleteEvent", C36387c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCommentDeleteEvent(C36387c cVar) {
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.c.c$a */
    public static final class C77312a {
        static {
            Covode.recordClassIndex(90331);
        }

        private C77312a() {
        }

        public /* synthetic */ C77312a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: c */
    public final void mo120910c() {
        super.mo120910c();
        C80298cg.m139205b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: b */
    public final void mo120909b() {
        this.f173438c.mo28083a(ReactionBubblePublishCell.class, ReactionBubbleCommentCell.class, ReactionBubbleEmojiCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.c.c$b */
    static final class C77313b extends AbstractC89220m implements AbstractC89171a<StoryCommentListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C48238ce f173451a;

        static {
            Covode.recordClassIndex(90332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77313b(C48238ce ceVar) {
            super(0);
            this.f173451a = ceVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryCommentListViewModel invoke() {
            ActivityC0945e activity = this.f173451a.f111746c.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            ActivityC0945e activity2 = this.f173451a.f111746c.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            return StoryCommentListViewModel.C77339a.m135235a(activity, activity2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.c.c$c */
    static final class C77314c extends AbstractC89220m implements AbstractC89171a<StoryLikedListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C48238ce f173452a;

        static {
            Covode.recordClassIndex(90333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77314c(C48238ce ceVar) {
            super(0);
            this.f173452a = ceVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryLikedListViewModel invoke() {
            ActivityC0945e activity = this.f173452a.f111746c.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            ActivityC0945e activity2 = this.f173452a.f111746c.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            return StoryLikedListViewModel.C77342a.m135237a(activity, activity2);
        }
    }

    /* renamed from: a */
    private final void m135177a(C33942b bVar) {
        if (C89219l.m154714a(bVar.mo60212a(), (Object) this.f173436a)) {
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173448i;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception())));
            }
            this.f173448i = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120905a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        User author = aweme.getAuthor();
        C89219l.m154716b(author, "");
        this.f173450k = new C77301f(author, aweme.getCreateTime() * 1000, this.f173438c.getMobEventParam());
        this.f173438c.getState().mo28132a(this.f173450k);
        this.f173449j = CommentServiceImpl.m73664e().mo63304b(aweme);
        super.mo120905a(aweme);
        C80298cg.m139204a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f80277a) != null) {
            switch (str.hashCode()) {
                case -2111570833:
                    if (str.equals("LOAD_MORE_STORY_LIKED_LIST_SUCCESS")) {
                        C89378p pVar = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar.getFirst(), (Object) this.f173436a)) {
                            m135179a((C77383f) pVar.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -1108427715:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS")) {
                        C89378p pVar2 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar2.getFirst(), (Object) this.f173436a)) {
                            m135178a((CommentItemList) pVar2.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -108517967:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_FAIL")) {
                        m135177a(bVar2);
                        return;
                    }
                    return;
                case -70365948:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_FAIL")) {
                        m135177a(bVar2);
                        return;
                    }
                    return;
                case 29510162:
                    if (str.equals("LOAD_MORE_STORY_LIKED_LIST_FAIL")) {
                        m135177a(bVar2);
                        return;
                    }
                    return;
                case 471107696:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_SUCCESS")) {
                        C89378p pVar3 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar3.getFirst(), (Object) this.f173436a)) {
                            m135178a((CommentItemList) pVar3.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case 1000683874:
                    if (str.equals("REFRESH_STORY_LIKED_LIST_SUCCESS")) {
                        C89378p pVar4 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar4.getFirst(), (Object) this.f173436a)) {
                            m135179a((C77383f) pVar4.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case 1736731135:
                    if (str.equals("REFRESH_STORY_LIKED_LIST_FAIL")) {
                        m135177a(bVar2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120906a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar) {
        C89219l.m154721d(dVar, "");
        this.f173448i = dVar;
        if (this.f173449j) {
            m135180d().mo120922a(this.f173436a, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC17641a aVar = this.f173450k;
        if (aVar != null) {
            arrayList.add(0, aVar);
        }
        this.f173447h = arrayList;
        m135181e().mo120923a(this.f173436a, 0);
    }

    /* renamed from: a */
    private final void m135178a(CommentItemList commentItemList, boolean z) {
        List<Comment> list = commentItemList.items;
        if (list == null) {
            list = C89086z.INSTANCE;
        }
        ArrayList<Comment> arrayList = new ArrayList();
        for (Comment comment : list) {
            C89219l.m154716b(comment, "");
            arrayList.add(comment);
            List<Comment> replyComments = comment.getReplyComments();
            if (replyComments != null) {
                arrayList.addAll(replyComments);
            }
        }
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
        for (Comment comment2 : arrayList) {
            arrayList2.add(C77296b.m135158a(comment2, this.f173438c.getMobEventParam()));
        }
        List<? extends AbstractC17641a> g = C89070n.m154585g((Collection) arrayList2);
        AbstractC17641a aVar = this.f173450k;
        if (aVar != null && z) {
            g.add(0, aVar);
        }
        if (commentItemList.hasMore) {
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173448i;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, new C77309b(1, commentItemList.cursor), g, 1)));
            }
            this.f173448i = null;
            if (z && g.size() > 1) {
                this.f173438c.mo27122r();
                return;
            }
            return;
        }
        this.f173447h = g;
        m135181e().mo120923a(this.f173436a, 0);
    }

    /* renamed from: a */
    private final void m135179a(C77383f fVar, boolean z) {
        ArrayList arrayList;
        if (fVar.getLikedList() == null) {
            arrayList = C89086z.INSTANCE;
        } else {
            List<User> likedList = fVar.getLikedList();
            if (likedList == null) {
                C89219l.m154715b();
            }
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) likedList, 10));
            Iterator<T> it = likedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C77298d.m135159a((User) it.next(), this.f173438c.getMobEventParam()));
            }
            arrayList = arrayList2;
        }
        Collection collection = this.f173447h;
        if (collection == null) {
            collection = C89086z.INSTANCE;
        }
        List d = C89070n.m154572d(collection, arrayList);
        this.f173447h = null;
        if (fVar.getHasMore()) {
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173448i;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, new C77309b(2, fVar.getCursor()), d, 1)));
            }
        } else {
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar2 = this.f173448i;
            if (dVar2 != null) {
                dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(d)));
            }
        }
        this.f173448i = null;
        if (z && d.size() > 1) {
            this.f173438c.mo27122r();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120907a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar, C77309b bVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        this.f173448i = dVar;
        if (bVar.f173441a == 1) {
            m135180d().mo120922a(this.f173436a, bVar.f173442b);
        } else {
            m135181e().mo120923a(this.f173436a, bVar.f173442b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77311c(String str, C48238ce ceVar, ReactionBubbleList reactionBubbleList) {
        super(reactionBubbleList);
        C89219l.m154721d(ceVar, "");
        C89219l.m154721d(reactionBubbleList, "");
        this.f173444d = str;
        this.f173445f = C89250i.m154773a((AbstractC89171a) new C77313b(ceVar));
        this.f173446g = C89250i.m154773a((AbstractC89171a) new C77314c(ceVar));
        StoryCommentListViewModel d = m135180d();
        d.mo60189a("REFRESH_STORY_COMMENT_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("REFRESH_STORY_COMMENT_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        StoryLikedListViewModel e = m135181e();
        e.mo60189a("REFRESH_STORY_LIKED_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        e.mo60189a("REFRESH_STORY_LIKED_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        e.mo60189a("LOAD_MORE_STORY_LIKED_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        e.mo60189a("LOAD_MORE_STORY_LIKED_LIST_FAIL", (AbstractC1214u<C33942b>) this);
    }
}
