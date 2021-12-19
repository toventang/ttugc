package com.p2082ss.android.ugc.aweme.story.interaction.p4058c;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell;
import com.p2082ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77296b;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77298d;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryCommentListViewModel;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.model.C77385h;
import com.p2082ss.android.ugc.aweme.story.model.C77386i;
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

/* renamed from: com.ss.android.ugc.aweme.story.interaction.c.d */
public final class C77315d extends AbstractC77307a implements AbstractC1214u<C33942b>, AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public final String f173453d;

    /* renamed from: e */
    private final AbstractC89244h f173454e;

    /* renamed from: f */
    private final AbstractC89244h f173455f;

    /* renamed from: g */
    private List<? extends AbstractC17641a> f173456g;

    /* renamed from: h */
    private AbstractC89124d<? super AbstractC17700f<C77309b>> f173457h;

    static {
        Covode.recordClassIndex(90334);
    }

    /* renamed from: d */
    private final StoryCommentListViewModel m135191d() {
        return (StoryCommentListViewModel) this.f173454e.getValue();
    }

    /* renamed from: e */
    private final StoryViewerListViewModel m135192e() {
        return (StoryViewerListViewModel) this.f173455f.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final boolean mo120908a() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(80, new RunnableC90250g(C77315d.class, "onCommentDeleteEvent", C36387c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCommentDeleteEvent(C36387c cVar) {
        C89219l.m154721d(cVar, "");
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
        this.f173438c.mo28083a(ReactionBubbleCommentCell.class, ReactionBubbleEmojiCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.c.d$a */
    static final class C77316a extends AbstractC89220m implements AbstractC89171a<StoryCommentListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C48238ce f173458a;

        static {
            Covode.recordClassIndex(90335);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77316a(C48238ce ceVar) {
            super(0);
            this.f173458a = ceVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryCommentListViewModel invoke() {
            ActivityC0945e activity = this.f173458a.f111746c.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            ActivityC0945e activity2 = this.f173458a.f111746c.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            return StoryCommentListViewModel.C77339a.m135235a(activity, activity2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.c.d$b */
    static final class C77317b extends AbstractC89220m implements AbstractC89171a<StoryViewerListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C48238ce f173459a;

        static {
            Covode.recordClassIndex(90336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77317b(C48238ce ceVar) {
            super(0);
            this.f173459a = ceVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryViewerListViewModel invoke() {
            ActivityC0945e activity = this.f173459a.f111746c.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            ActivityC0945e activity2 = this.f173459a.f111746c.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            return StoryViewerListViewModel.C77345a.m135239a(activity, activity2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120905a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        super.mo120905a(aweme);
        C80298cg.m139204a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120906a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar) {
        C89219l.m154721d(dVar, "");
        this.f173457h = dVar;
        m135191d().mo120922a(this.f173436a, 0);
    }

    /* renamed from: a */
    private final void m135188a(C33942b bVar) {
        if (C89219l.m154714a(bVar.mo60212a(), (Object) this.f173436a)) {
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173457h;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception())));
            }
            this.f173457h = null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f80277a) != null) {
            switch (str.hashCode()) {
                case -2122462547:
                    if (str.equals("LOAD_MORE_STORY_VIEWER_LIST_FAIL")) {
                        m135188a(bVar2);
                        return;
                    }
                    return;
                case -1108427715:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS")) {
                        C89378p pVar = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar.getFirst(), (Object) this.f173436a)) {
                            m135189a((CommentItemList) pVar.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -738219936:
                    if (str.equals("REFRESH_STORY_VIEWER_LIST_FAIL")) {
                        m135188a(bVar2);
                        return;
                    }
                    return;
                case -553717260:
                    if (str.equals("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS")) {
                        C89378p pVar2 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar2.getFirst(), (Object) this.f173436a)) {
                            m135190a((C77386i) pVar2.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -108517967:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_FAIL")) {
                        m135188a(bVar2);
                        return;
                    }
                    return;
                case -70365948:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_FAIL")) {
                        m135188a(bVar2);
                        return;
                    }
                    return;
                case 471107696:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_SUCCESS")) {
                        C89378p pVar3 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar3.getFirst(), (Object) this.f173436a)) {
                            m135189a((CommentItemList) pVar3.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case 1436898145:
                    if (str.equals("REFRESH_STORY_VIEWER_LIST_SUCCESS")) {
                        C89378p pVar4 = (C89378p) bVar2.mo60212a();
                        if (C89219l.m154714a(pVar4.getFirst(), (Object) this.f173436a)) {
                            m135190a((C77386i) pVar4.getSecond(), true);
                            return;
                        }
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
    public final void mo120907a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar, C77309b bVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        this.f173457h = dVar;
        if (bVar.f173441a == 1) {
            m135191d().mo120922a(this.f173436a, bVar.f173442b);
        } else {
            m135192e().mo120924a(this.f173436a, bVar.f173442b);
        }
    }

    /* renamed from: a */
    private final void m135189a(CommentItemList commentItemList, boolean z) {
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
        ArrayList arrayList3 = arrayList2;
        if (commentItemList.hasMore) {
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173457h;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, new C77309b(1, commentItemList.cursor), arrayList3, 1)));
            }
            this.f173457h = null;
            if (z && (!list.isEmpty())) {
                this.f173438c.mo27122r();
                return;
            }
            return;
        }
        this.f173456g = arrayList3;
        m135192e().mo120924a(this.f173436a, 0);
    }

    /* renamed from: a */
    private final void m135190a(C77386i iVar, boolean z) {
        List<C77385h> viewerList = iVar.getViewerList();
        if (viewerList == null) {
            viewerList = C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) viewerList, 10));
        Iterator<T> it = viewerList.iterator();
        while (it.hasNext()) {
            arrayList.add(C77298d.m135160a((C77385h) it.next(), this.f173438c.getMobEventParam()));
        }
        ArrayList arrayList2 = arrayList;
        Collection collection = this.f173456g;
        if (collection == null) {
            collection = C89086z.INSTANCE;
        }
        List d = C89070n.m154572d(collection, (Iterable) arrayList2);
        this.f173456g = null;
        if (iVar.getHasMore()) {
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173457h;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, new C77309b(2, iVar.getCursor()), d, 1)));
            }
        } else {
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar2 = this.f173457h;
            if (dVar2 != null) {
                dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(d)));
            }
        }
        this.f173457h = null;
        if (z && (!d.isEmpty())) {
            this.f173438c.mo27122r();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77315d(String str, C48238ce ceVar, ReactionBubbleList reactionBubbleList) {
        super(reactionBubbleList);
        C89219l.m154721d(ceVar, "");
        C89219l.m154721d(reactionBubbleList, "");
        this.f173453d = str;
        this.f173454e = C89250i.m154773a((AbstractC89171a) new C77316a(ceVar));
        this.f173455f = C89250i.m154773a((AbstractC89171a) new C77317b(ceVar));
        StoryCommentListViewModel d = m135191d();
        d.mo60189a("REFRESH_STORY_COMMENT_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("REFRESH_STORY_COMMENT_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        StoryViewerListViewModel e = m135192e();
        e.mo60189a("REFRESH_STORY_VIEWER_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        e.mo60189a("REFRESH_STORY_VIEWER_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        e.mo60189a("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        e.mo60189a("LOAD_MORE_STORY_VIEWER_LIST_FAIL", (AbstractC1214u<C33942b>) this);
    }
}
