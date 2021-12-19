package com.p2082ss.android.ugc.aweme.story.interaction.p4059vm;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33946d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.api.IStoryLikedListViewModel;
import com.p2082ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.p2082ss.android.ugc.aweme.story.model.C77383f;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryLikedListViewModel */
public final class StoryLikedListViewModel extends IStoryLikedListViewModel {

    /* renamed from: f */
    public static final C77342a f173528f = new C77342a((byte) 0);

    /* renamed from: g */
    private final C88411a f173529g = new C88411a();

    /* renamed from: h */
    private final AbstractC1204m f173530h;

    static {
        Covode.recordClassIndex(90367);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryLikedListViewModel$a */
    public static final class C77342a {
        static {
            Covode.recordClassIndex(90368);
        }

        private C77342a() {
        }

        public /* synthetic */ C77342a(byte b) {
            this();
        }

        /* renamed from: a */
        public static StoryLikedListViewModel m135237a(ActivityC0945e eVar, AbstractC1183ag agVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(agVar, "");
            AbstractC1174ac a = C33946d.m69515a(eVar, agVar, new C77349b(eVar)).mo3983a(StoryLikedListViewModel.class);
            C89219l.m154716b(a, "");
            return (StoryLikedListViewModel) a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f173529g.mo142944a();
    }

    public StoryLikedListViewModel(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f173530h = mVar;
        this.f80259a = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryLikedListViewModel$c */
    static final class C77344c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryLikedListViewModel f173534a;

        /* renamed from: b */
        final /* synthetic */ long f173535b;

        /* renamed from: c */
        final /* synthetic */ String f173536c;

        static {
            Covode.recordClassIndex(90370);
        }

        C77344c(StoryLikedListViewModel storyLikedListViewModel, long j, String str) {
            this.f173534a = storyLikedListViewModel;
            this.f173535b = j;
            this.f173536c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f173535b == 0) {
                this.f173534a.mo60191a("REFRESH_STORY_LIKED_LIST_FAIL", this.f173536c);
                ((IStoryLikedListViewModel) this.f173534a).f171708d.put(this.f173536c, 3);
                return;
            }
            this.f173534a.mo60191a("LOAD_MORE_STORY_LIKED_LIST_FAIL", this.f173536c);
            ((IStoryLikedListViewModel) this.f173534a).f171708d.put(this.f173536c, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryLikedListViewModel$b */
    static final class C77343b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryLikedListViewModel f173531a;

        /* renamed from: b */
        final /* synthetic */ String f173532b;

        /* renamed from: c */
        final /* synthetic */ long f173533c;

        static {
            Covode.recordClassIndex(90369);
        }

        C77343b(StoryLikedListViewModel storyLikedListViewModel, String str, long j) {
            this.f173531a = storyLikedListViewModel;
            this.f173532b = str;
            this.f173533c = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C77383f fVar = (C77383f) obj;
            ((IStoryLikedListViewModel) this.f173531a).f171708d.put(this.f173532b, 2);
            if (this.f173533c == 0) {
                Map<String, C77383f> map = ((IStoryLikedListViewModel) this.f173531a).f171707c;
                String str = this.f173532b;
                C89219l.m154716b(fVar, "");
                map.put(str, fVar);
                this.f173531a.mo60191a("REFRESH_STORY_LIKED_LIST_SUCCESS", new C89378p(this.f173532b, fVar));
                return;
            }
            C77383f fVar2 = ((IStoryLikedListViewModel) this.f173531a).f171707c.get(this.f173532b);
            if (fVar2 != null) {
                fVar2.setTotal(fVar2.getTotal() + fVar.getTotal());
                fVar2.setCursor(fVar.getCursor());
                List<User> likedList = fVar2.getLikedList();
                if (likedList != null) {
                    List<User> likedList2 = fVar.getLikedList();
                    if (likedList2 == null) {
                        likedList2 = C89086z.INSTANCE;
                    }
                    likedList.addAll(likedList2);
                }
            }
            this.f173531a.mo60191a("LOAD_MORE_STORY_LIKED_LIST_SUCCESS", new C89378p(this.f173532b, fVar));
        }
    }

    /* renamed from: a */
    public final void mo120923a(String str, long j) {
        C89219l.m154721d(str, "");
        if (j == 0) {
            ((IStoryLikedListViewModel) this).f171708d.put(str, 0);
        } else {
            ((IStoryLikedListViewModel) this).f171708d.put(str, 1);
        }
        AbstractC88412b a = StoryInteractionApi.f173406a.fetchStoryLikedList(str, j, 30).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77343b(this, str, j), new C77344c(this, j, str));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f173529g);
    }
}
