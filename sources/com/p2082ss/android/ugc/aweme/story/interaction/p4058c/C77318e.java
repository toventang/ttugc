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
import com.p2082ss.android.ugc.aweme.story.interaction.cell.ReactionBubblePublishCell;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77296b;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77301f;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryCommentListViewModel;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.view.ReactionBubbleList;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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

/* renamed from: com.ss.android.ugc.aweme.story.interaction.c.e */
public final class C77318e extends AbstractC77307a implements AbstractC1214u<C33942b>, AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public final String f173460d;

    /* renamed from: e */
    public final C48238ce f173461e;

    /* renamed from: f */
    private final AbstractC89244h f173462f = C89250i.m154773a((AbstractC89171a) new C77319a(this));

    /* renamed from: g */
    private final boolean f173463g;

    /* renamed from: h */
    private AbstractC89124d<? super AbstractC17700f<C77309b>> f173464h;

    /* renamed from: i */
    private AbstractC17641a f173465i;

    /* renamed from: j */
    private boolean f173466j;

    static {
        Covode.recordClassIndex(90337);
    }

    /* renamed from: d */
    private final StoryCommentListViewModel m135200d() {
        return (StoryCommentListViewModel) this.f173462f.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final boolean mo120908a() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(80, new RunnableC90250g(C77318e.class, "onCommentDeleteEvent", C36387c.class, ThreadMode.MAIN, 0, false));
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
        this.f173438c.mo28083a(ReactionBubbleCommentCell.class, ReactionBubblePublishCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.c.e$a */
    static final class C77319a extends AbstractC89220m implements AbstractC89171a<StoryCommentListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77318e f173467a;

        static {
            Covode.recordClassIndex(90338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77319a(C77318e eVar) {
            super(0);
            this.f173467a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryCommentListViewModel invoke() {
            ActivityC0945e activity = this.f173467a.f173461e.f111746c.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            ActivityC0945e activity2 = this.f173467a.f173461e.f111746c.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            return StoryCommentListViewModel.C77339a.m135235a(activity, activity2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120905a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (this.f173463g) {
            User author = aweme.getAuthor();
            C89219l.m154716b(author, "");
            this.f173465i = new C77301f(author, aweme.getCreateTime() * 1000, this.f173438c.getMobEventParam());
            this.f173438c.getState().mo28132a(this.f173465i);
        }
        this.f173466j = CommentServiceImpl.m73664e().mo63304b(aweme);
        super.mo120905a(aweme);
        C80298cg.m139204a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120906a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar) {
        C89219l.m154721d(dVar, "");
        this.f173464h = dVar;
        if (this.f173466j) {
            m135200d().mo120922a(this.f173436a, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC17641a aVar = this.f173465i;
        if (aVar != null) {
            arrayList.add(0, aVar);
        }
        dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList)));
        this.f173464h = null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f80277a) != null) {
            switch (str.hashCode()) {
                case -1108427715:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS")) {
                        m135199a(bVar2, false);
                        return;
                    }
                    return;
                case -108517967:
                    if (!str.equals("REFRESH_STORY_COMMENT_LIST_FAIL")) {
                        return;
                    }
                    break;
                case -70365948:
                    if (!str.equals("LOAD_MORE_STORY_COMMENT_LIST_FAIL")) {
                        return;
                    }
                    break;
                case 471107696:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_SUCCESS")) {
                        m135199a(bVar2, true);
                        return;
                    }
                    return;
                default:
                    return;
            }
            String str2 = (String) bVar2.mo60212a();
            AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173464h;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(str2))));
            }
            this.f173464h = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120907a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar, C77309b bVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        this.f173464h = dVar;
        m135200d().mo120922a(this.f173436a, bVar.f173442b);
    }

    /* renamed from: a */
    private final void m135199a(C33942b bVar, boolean z) {
        C89378p pVar = (C89378p) bVar.mo60212a();
        if (!(!C89219l.m154714a(pVar.getFirst(), (Object) this.f173436a))) {
            CommentItemList commentItemList = (CommentItemList) pVar.getSecond();
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
            List g = C89070n.m154585g((Collection) arrayList2);
            AbstractC17641a aVar = this.f173465i;
            if (aVar != null && z) {
                g.add(0, aVar);
            }
            if (commentItemList.hasMore) {
                AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173464h;
                if (dVar != null) {
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, new C77309b(1, commentItemList.cursor), g, 1)));
                }
            } else {
                AbstractC89124d<? super AbstractC17700f<C77309b>> dVar2 = this.f173464h;
                if (dVar2 != null) {
                    dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(g)));
                }
            }
            this.f173464h = null;
            if (z && ((this.f173463g && g.size() > 1) || (!this.f173463g && g.size() > 0))) {
                this.f173438c.mo27122r();
            }
            this.f173438c.setForbidAppendItem(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77318e(String str, C48238ce ceVar, ReactionBubbleList reactionBubbleList) {
        super(reactionBubbleList);
        C89219l.m154721d(ceVar, "");
        C89219l.m154721d(reactionBubbleList, "");
        this.f173460d = str;
        this.f173461e = ceVar;
        StoryCommentListViewModel d = m135200d();
        d.mo60189a("REFRESH_STORY_COMMENT_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("REFRESH_STORY_COMMENT_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        this.f173463g = C76660b.m134252l();
        this.f173466j = true;
    }
}
