package com.p2082ss.android.ugc.aweme.story.interaction.p4059vm;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33946d;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.story.api.IStoryCommentListViewModel;
import com.p2082ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
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
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryCommentListViewModel */
public final class StoryCommentListViewModel extends IStoryCommentListViewModel {

    /* renamed from: f */
    public static final C77339a f173519f = new C77339a((byte) 0);

    /* renamed from: g */
    private final C88411a f173520g = new C88411a();

    /* renamed from: h */
    private final AbstractC1204m f173521h;

    static {
        Covode.recordClassIndex(90363);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryCommentListViewModel$a */
    public static final class C77339a {
        static {
            Covode.recordClassIndex(90364);
        }

        private C77339a() {
        }

        public /* synthetic */ C77339a(byte b) {
            this();
        }

        /* renamed from: a */
        public static StoryCommentListViewModel m135235a(ActivityC0945e eVar, AbstractC1183ag agVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(agVar, "");
            AbstractC1174ac a = C33946d.m69515a(eVar, agVar, new C77348a(eVar)).mo3983a(StoryCommentListViewModel.class);
            C89219l.m154716b(a, "");
            return (StoryCommentListViewModel) a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f173520g.mo142944a();
    }

    public StoryCommentListViewModel(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f173521h = mVar;
        this.f80259a = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryCommentListViewModel$c */
    public static final class C77341c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryCommentListViewModel f173525a;

        /* renamed from: b */
        final /* synthetic */ long f173526b;

        /* renamed from: c */
        final /* synthetic */ String f173527c;

        static {
            Covode.recordClassIndex(90366);
        }

        C77341c(StoryCommentListViewModel storyCommentListViewModel, long j, String str) {
            this.f173525a = storyCommentListViewModel;
            this.f173526b = j;
            this.f173527c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f173526b == 0) {
                this.f173525a.mo60191a("REFRESH_STORY_COMMENT_LIST_FAIL", this.f173527c);
                ((IStoryCommentListViewModel) this.f173525a).f171705d.put(this.f173527c, 3);
                return;
            }
            this.f173525a.mo60191a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", this.f173527c);
            ((IStoryCommentListViewModel) this.f173525a).f171705d.put(this.f173527c, 4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryCommentListViewModel$b */
    public static final class C77340b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryCommentListViewModel f173522a;

        /* renamed from: b */
        final /* synthetic */ String f173523b;

        /* renamed from: c */
        final /* synthetic */ long f173524c;

        static {
            Covode.recordClassIndex(90365);
        }

        C77340b(StoryCommentListViewModel storyCommentListViewModel, String str, long j) {
            this.f173522a = storyCommentListViewModel;
            this.f173523b = str;
            this.f173524c = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            CommentItemList commentItemList = (CommentItemList) obj;
            ((IStoryCommentListViewModel) this.f173522a).f171705d.put(this.f173523b, 2);
            if (this.f173524c == 0) {
                Map<String, CommentItemList> map = ((IStoryCommentListViewModel) this.f173522a).f171704c;
                String str = this.f173523b;
                C89219l.m154716b(commentItemList, "");
                map.put(str, commentItemList);
                this.f173522a.mo60191a("REFRESH_STORY_COMMENT_LIST_SUCCESS", new C89378p(this.f173523b, commentItemList));
                return;
            }
            CommentItemList commentItemList2 = ((IStoryCommentListViewModel) this.f173522a).f171704c.get(this.f173523b);
            if (commentItemList2 != null) {
                long j = commentItemList2.total;
                C89219l.m154716b(commentItemList, "");
                commentItemList2.total = j + commentItemList.total;
                commentItemList2.cursor = commentItemList.cursor;
                List<Comment> list = commentItemList2.items;
                List<Comment> list2 = commentItemList.items;
                C89219l.m154716b(list2, "");
                list.addAll(list2);
                this.f173522a.mo60191a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", new C89378p(this.f173523b, commentItemList));
            }
        }
    }

    /* renamed from: a */
    public final void mo120922a(String str, long j) {
        C89219l.m154721d(str, "");
        if (j == 0) {
            ((IStoryCommentListViewModel) this).f171705d.put(str, 0);
        } else {
            ((IStoryCommentListViewModel) this).f171705d.put(str, 1);
        }
        AbstractC88412b a = StoryInteractionApi.f173406a.fetchCommentListV2(str, j, 30, null, 1, 2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77340b(this, str, j), new C77341c(this, j, str));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f173520g);
    }
}
