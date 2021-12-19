package com.p2082ss.android.ugc.aweme.story.interaction.p4058c;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77298d;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.model.C77385h;
import com.p2082ss.android.ugc.aweme.story.model.C77386i;
import com.p2082ss.android.ugc.aweme.story.view.ReactionBubbleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.story.interaction.c.f */
public final class C77320f extends AbstractC77307a implements AbstractC1214u<C33942b> {

    /* renamed from: d */
    public final String f173468d;

    /* renamed from: e */
    public final C48238ce f173469e;

    /* renamed from: f */
    private final AbstractC89244h f173470f = C89250i.m154773a((AbstractC89171a) new C77321a(this));

    /* renamed from: g */
    private AbstractC89124d<? super AbstractC17700f<C77309b>> f173471g;

    static {
        Covode.recordClassIndex(90339);
    }

    /* renamed from: d */
    private final StoryViewerListViewModel m135208d() {
        return (StoryViewerListViewModel) this.f173470f.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final boolean mo120908a() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: b */
    public final void mo120909b() {
        this.f173438c.mo28083a(ReactionBubbleEmojiCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.c.f$a */
    static final class C77321a extends AbstractC89220m implements AbstractC89171a<StoryViewerListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77320f f173472a;

        static {
            Covode.recordClassIndex(90340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77321a(C77320f fVar) {
            super(0);
            this.f173472a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryViewerListViewModel invoke() {
            ActivityC0945e activity = this.f173472a.f173469e.f111746c.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            ActivityC0945e activity2 = this.f173472a.f173469e.f111746c.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            return StoryViewerListViewModel.C77345a.m135239a(activity, activity2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a
    /* renamed from: a */
    public final void mo120906a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar) {
        C89219l.m154721d(dVar, "");
        this.f173471g = dVar;
        m135208d().mo120924a(this.f173436a, 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f80277a) != null) {
            switch (str.hashCode()) {
                case -2122462547:
                    if (str.equals("LOAD_MORE_STORY_VIEWER_LIST_FAIL") && C89219l.m154714a(bVar2.mo60212a(), (Object) this.f173436a)) {
                        AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173471g;
                        if (dVar != null) {
                            dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception())));
                        }
                        this.f173471g = null;
                        return;
                    }
                    return;
                case -738219936:
                    if (str.equals("REFRESH_STORY_VIEWER_LIST_FAIL") && C89219l.m154714a(bVar2.mo60212a(), (Object) this.f173436a)) {
                        AbstractC89124d<? super AbstractC17700f<C77309b>> dVar2 = this.f173471g;
                        if (dVar2 != null) {
                            dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception())));
                        }
                        this.f173471g = null;
                        return;
                    }
                    return;
                case -553717260:
                    if (str.equals("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS")) {
                        m135207a(bVar2, false);
                        return;
                    }
                    return;
                case 1436898145:
                    if (str.equals("REFRESH_STORY_VIEWER_LIST_SUCCESS")) {
                        m135207a(bVar2, true);
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
        this.f173471g = dVar;
        m135208d().mo120924a(this.f173436a, bVar.f173442b);
    }

    /* renamed from: a */
    private final void m135207a(C33942b bVar, boolean z) {
        C89378p pVar = (C89378p) bVar.mo60212a();
        if (C89219l.m154714a(pVar.getFirst(), (Object) this.f173436a)) {
            C77386i iVar = (C77386i) pVar.getSecond();
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
            if (iVar.getHasMore()) {
                AbstractC89124d<? super AbstractC17700f<C77309b>> dVar = this.f173471g;
                if (dVar != null) {
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, new C77309b(2, iVar.getCursor()), arrayList2, 1)));
                }
            } else {
                AbstractC89124d<? super AbstractC17700f<C77309b>> dVar2 = this.f173471g;
                if (dVar2 != null) {
                    dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                }
            }
            this.f173471g = null;
            if (z && (!arrayList2.isEmpty())) {
                this.f173438c.mo27122r();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77320f(String str, C48238ce ceVar, ReactionBubbleList reactionBubbleList) {
        super(reactionBubbleList);
        C89219l.m154721d(ceVar, "");
        C89219l.m154721d(reactionBubbleList, "");
        this.f173468d = str;
        this.f173469e = ceVar;
        StoryViewerListViewModel d = m135208d();
        d.mo60189a("REFRESH_STORY_VIEWER_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("REFRESH_STORY_VIEWER_LIST_FAIL", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        d.mo60189a("LOAD_MORE_STORY_VIEWER_LIST_FAIL", (AbstractC1214u<C33942b>) this);
    }
}
