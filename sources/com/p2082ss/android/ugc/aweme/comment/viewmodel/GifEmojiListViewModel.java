package com.p2082ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C20442b;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p2082ss.android.ugc.aweme.comment.p2497k.C36526c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel */
public final class GifEmojiListViewModel extends JediViewModel<GifEmojiListState> {

    /* renamed from: e */
    public static final C37234a f87783e = new C37234a((byte) 0);

    /* renamed from: a */
    public final C36526c f87784a = new C36526c();

    /* renamed from: b */
    final AbstractC89244h f87785b = C89250i.m154774a(EnumC89331m.NONE, C37235b.f87788a);

    /* renamed from: c */
    public AbstractC88412b f87786c;

    /* renamed from: d */
    public final ListMiddleware<GifEmojiListState, GifEmoji, C20465o> f87787d = new ListMiddleware<>(new C37236c(this), new C37238d(this), null, null, 12);

    static {
        Covode.recordClassIndex(44592);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$a */
    public static final class C37234a {
        static {
            Covode.recordClassIndex(44593);
        }

        private C37234a() {
        }

        public /* synthetic */ C37234a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        ListMiddleware<GifEmojiListState, GifEmoji, C20465o> listMiddleware = this.f87787d;
        listMiddleware.mo33809a(C37266b.f87847a, C37240e.f87793a);
        mo33684a(listMiddleware);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ GifEmojiListState mo23027d() {
        return new GifEmojiListState(null, null, null, 7, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$b */
    static final class C37235b extends AbstractC89220m implements AbstractC89171a<AbstractC88979t<Long>> {

        /* renamed from: a */
        public static final C37235b f87788a = new C37235b();

        static {
            Covode.recordClassIndex(44594);
        }

        C37235b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88979t<Long> invoke() {
            return AbstractC88979t.m154307b(200, TimeUnit.MILLISECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c));
        }
    }

    /* renamed from: a */
    public final void mo64794a() {
        AbstractC88412b bVar = this.f87786c;
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
        mo33689c(C37245h.f87799a);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$f */
    public static final class C37241f extends AbstractC89220m implements AbstractC89172b<GifEmojiListState, GifEmojiListState> {

        /* renamed from: a */
        final /* synthetic */ String f87794a;

        static {
            Covode.recordClassIndex(44600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37241f(String str) {
            super(1);
            this.f87794a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            C89219l.m154721d(gifEmojiListState2, "");
            return GifEmojiListState.copy$default(gifEmojiListState2, null, this.f87794a, null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$c */
    static final class C37236c extends AbstractC89220m implements AbstractC89172b<GifEmojiListState, AbstractC88979t<C89378p<? extends List<? extends GifEmoji>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f87789a;

        static {
            Covode.recordClassIndex(44595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37236c(GifEmojiListViewModel gifEmojiListViewModel) {
            super(1);
            this.f87789a = gifEmojiListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends GifEmoji>, ? extends C20465o>> invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            C89219l.m154721d(gifEmojiListState2, "");
            AbstractC88979t<R> d = this.f87789a.f87784a.mo63994a(gifEmojiListState2.getKeyword(), 0, gifEmojiListState2.getAwemeId()).mo143292d(C372371.f87790a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$d */
    static final class C37238d extends AbstractC89220m implements AbstractC89172b<GifEmojiListState, AbstractC88979t<C89378p<? extends List<? extends GifEmoji>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f87791a;

        static {
            Covode.recordClassIndex(44597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37238d(GifEmojiListViewModel gifEmojiListViewModel) {
            super(1);
            this.f87791a = gifEmojiListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends GifEmoji>, ? extends C20465o>> invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            C89219l.m154721d(gifEmojiListState2, "");
            AbstractC88979t<R> d = this.f87791a.f87784a.mo63994a(gifEmojiListState2.getKeyword(), gifEmojiListState2.getListState().getPayload().f48407b, gifEmojiListState2.getAwemeId()).mo143292d(C372391.f87792a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$h */
    static final class C37245h extends AbstractC89220m implements AbstractC89172b<GifEmojiListState, GifEmojiListState> {

        /* renamed from: a */
        public static final C37245h f87799a = new C37245h();

        static {
            Covode.recordClassIndex(44604);
        }

        C37245h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            C89219l.m154721d(gifEmojiListState2, "");
            return GifEmojiListState.copy$default(gifEmojiListState2, null, null, ListState.copy$default(gifEmojiListState2.getListState(), null, C89086z.INSTANCE, null, null, new C20442b(true), 13, null), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$g */
    public static final class C37242g extends AbstractC89220m implements AbstractC89172b<GifEmojiListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f87795a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f87796b;

        static {
            Covode.recordClassIndex(44601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37242g(GifEmojiListViewModel gifEmojiListViewModel, CharSequence charSequence) {
            super(1);
            this.f87795a = gifEmojiListViewModel;
            this.f87796b = charSequence;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            C89219l.m154721d(gifEmojiListState2, "");
            if (!C89219l.m154714a((Object) this.f87796b, (Object) gifEmojiListState2.getKeyword())) {
                this.f87795a.mo33689c(new AbstractC89172b<GifEmojiListState, GifEmojiListState>(this) {
                    /* class com.p2082ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.C37242g.C372431 */

                    /* renamed from: a */
                    final /* synthetic */ C37242g f87797a;

                    static {
                        Covode.recordClassIndex(44602);
                    }

                    {
                        this.f87797a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
                        GifEmojiListState gifEmojiListState2 = gifEmojiListState;
                        C89219l.m154721d(gifEmojiListState2, "");
                        return GifEmojiListState.copy$default(gifEmojiListState2, String.valueOf(this.f87797a.f87796b), null, null, 6, null);
                    }
                });
                AbstractC88412b bVar = this.f87795a.f87786c;
                if (bVar != null && !bVar.isDisposed()) {
                    bVar.dispose();
                }
                GifEmojiListViewModel gifEmojiListViewModel = this.f87795a;
                gifEmojiListViewModel.f87786c = ((AbstractC88979t) gifEmojiListViewModel.f87785b.getValue()).mo143289d(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.C37242g.C372442 */

                    /* renamed from: a */
                    final /* synthetic */ C37242g f87798a;

                    static {
                        Covode.recordClassIndex(44603);
                    }

                    {
                        this.f87798a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f87798a.f87795a.f87787d.refresh();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$e */
    static final class C37240e extends AbstractC89220m implements AbstractC89183m<GifEmojiListState, ListState<GifEmoji, C20465o>, GifEmojiListState> {

        /* renamed from: a */
        public static final C37240e f87793a = new C37240e();

        static {
            Covode.recordClassIndex(44599);
        }

        C37240e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ GifEmojiListState invoke(GifEmojiListState gifEmojiListState, ListState<GifEmoji, C20465o> listState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            ListState<GifEmoji, C20465o> listState2 = listState;
            C89219l.m154721d(gifEmojiListState2, "");
            C89219l.m154721d(listState2, "");
            return GifEmojiListState.copy$default(gifEmojiListState2, null, null, listState2, 3, null);
        }
    }
}
