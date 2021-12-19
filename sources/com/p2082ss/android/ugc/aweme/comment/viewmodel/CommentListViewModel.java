package com.p2082ss.android.ugc.aweme.comment.viewmodel;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.barrage.BarrageCommentAndLikeApi;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
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

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel */
public final class CommentListViewModel extends ICommentListViewModel {

    /* renamed from: c */
    public static final C37231a f87774c = new C37231a((byte) 0);

    /* renamed from: f */
    private final C88411a f87775f = new C88411a();

    /* renamed from: g */
    private final AbstractC1204m f87776g;

    static {
        Covode.recordClassIndex(44587);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel$a */
    public static final class C37231a {
        static {
            Covode.recordClassIndex(44588);
        }

        private C37231a() {
        }

        public /* synthetic */ C37231a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f87775f.mo142944a();
        ((ICommentListViewModel) this).f87801d.clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel$c */
    static final class C37233c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CommentListViewModel f87780a;

        /* renamed from: b */
        final /* synthetic */ long f87781b;

        /* renamed from: c */
        final /* synthetic */ String f87782c;

        static {
            Covode.recordClassIndex(44590);
        }

        C37233c(CommentListViewModel commentListViewModel, long j, String str) {
            this.f87780a = commentListViewModel;
            this.f87781b = j;
            this.f87782c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f87781b == 0) {
                this.f87780a.mo60191a("REFRESH_STORY_COMMENT_LIST_FAIL", this.f87782c);
            } else {
                this.f87780a.mo60191a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", this.f87782c);
            }
        }
    }

    public CommentListViewModel(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f87776g = mVar;
        this.f80259a = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel$b */
    static final class C37232b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CommentListViewModel f87777a;

        /* renamed from: b */
        final /* synthetic */ long f87778b;

        /* renamed from: c */
        final /* synthetic */ String f87779c;

        static {
            Covode.recordClassIndex(44589);
        }

        C37232b(CommentListViewModel commentListViewModel, long j, String str) {
            this.f87777a = commentListViewModel;
            this.f87778b = j;
            this.f87779c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            CommentItemList commentItemList = (CommentItemList) obj;
            if (this.f87778b == 0) {
                Map<String, CommentItemList> map = ((ICommentListViewModel) this.f87777a).f87801d;
                String str = this.f87779c;
                C89219l.m154716b(commentItemList, "");
                map.put(str, commentItemList);
                this.f87777a.mo60191a("REFRESH_STORY_COMMENT_LIST_SUCCESS", new C89378p(this.f87779c, commentItemList));
                return;
            }
            CommentItemList commentItemList2 = ((ICommentListViewModel) this.f87777a).f87801d.get(this.f87779c);
            if (commentItemList2 != null) {
                long j = commentItemList2.total;
                C89219l.m154716b(commentItemList, "");
                commentItemList2.total = j + commentItemList.total;
                commentItemList2.cursor = commentItemList.cursor;
                List<Comment> list = commentItemList2.items;
                List<Comment> list2 = commentItemList.items;
                C89219l.m154716b(list2, "");
                list.addAll(list2);
                this.f87777a.mo60191a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", new C89378p(this.f87779c, commentItemList));
            }
        }
    }

    /* renamed from: a */
    public final void mo64783a(String str, long j) {
        C89219l.m154721d(str, "");
        AbstractC88412b a = BarrageCommentAndLikeApi.f85806a.fetchCommentList(str, j, 20, null, 1, 2, 1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C37232b(this, j, str), new C37233c(this, j, str));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f87775f);
    }
}
