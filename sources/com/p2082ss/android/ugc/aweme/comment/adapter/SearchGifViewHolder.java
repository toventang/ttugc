package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.jedi.arch.AbstractC20550y;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.C20671j;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.GifEmojiState;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.GifEmojiViewModel;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.AbstractC46649i;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46646h;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder */
public final class SearchGifViewHolder extends JediBaseViewHolder<SearchGifViewHolder, GifEmoji> implements AbstractC46649i, AbstractC46649i {

    /* renamed from: l */
    public static final C36202b f85496l = new C36202b((byte) 0);

    /* renamed from: g */
    final RemoteImageView f85497g;

    /* renamed from: j */
    public boolean f85498j;

    /* renamed from: k */
    public final AbstractC36212ae f85499k;

    static {
        Covode.recordClassIndex(43466);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.utils.AbstractC46649i
    /* renamed from: a */
    public final void mo63349a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.utils.AbstractC46649i
    /* renamed from: b */
    public final void mo63350b() {
        this.f85498j = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$b */
    public static final class C36202b {
        static {
            Covode.recordClassIndex(43468);
        }

        private C36202b() {
        }

        public /* synthetic */ C36202b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C36203c cVar = new C36203c(this);
        JediViewHolderProxy jediViewHolderProxy = this.f48646d;
        if (jediViewHolderProxy != null) {
            JediViewModel jediViewModel = (JediViewModel) C20671j.C20672a.m38922a(mo33721d(), jediViewHolderProxy.mo33900b()).mo33923a(getClass().getName() + '_' + GifEmojiViewModel.class.getName(), GifEmojiViewModel.class);
            AbstractC20550y a = jediViewModel.f48234j.mo33696a(GifEmojiViewModel.class);
            if (a != null) {
                a.binding(jediViewModel);
            }
            jediViewModel.mo33686a_(cVar);
            AbstractC88412b unused = subscribe((GifEmojiViewModel) jediViewModel, new C20370ah(), C36204d.f85502a);
            return;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: m */
    public final C46534a mo63351m() {
        int i;
        C46534a aVar = new C46534a();
        UrlModel origin = ((GifEmoji) aQ_()).getOrigin();
        if (origin == null) {
            origin = new UrlModel();
        }
        aVar.setAnimateUrl(origin);
        UrlModel thumbnail = ((GifEmoji) aQ_()).getThumbnail();
        if (thumbnail == null) {
            thumbnail = new UrlModel();
        }
        aVar.setStaticUrl(thumbnail);
        aVar.setId(((GifEmoji) aQ_()).getImageId());
        UrlModel origin2 = ((GifEmoji) aQ_()).getOrigin();
        int i2 = 0;
        if (origin2 != null) {
            i = origin2.getWidth();
        } else {
            i = 0;
        }
        aVar.setWidth(i);
        UrlModel origin3 = ((GifEmoji) aQ_()).getOrigin();
        if (origin3 != null) {
            i2 = origin3.getHeight();
        }
        aVar.setHeight(i2);
        aVar.setStickerType(((GifEmoji) aQ_()).getStickerType());
        aVar.setAnimateType("gif");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        aVar.setDisplayName(view.getContext().getString(R.string.bm1));
        aVar.setLogPb(((GifEmoji) aQ_()).getLogPb());
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$c */
    static final class C36203c extends AbstractC89220m implements AbstractC89172b<GifEmojiState, GifEmojiState> {

        /* renamed from: a */
        final /* synthetic */ SearchGifViewHolder f85501a;

        static {
            Covode.recordClassIndex(43469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36203c(SearchGifViewHolder searchGifViewHolder) {
            super(1);
            this.f85501a = searchGifViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ GifEmojiState invoke(GifEmojiState gifEmojiState) {
            GifEmojiState gifEmojiState2 = gifEmojiState;
            C89219l.m154721d(gifEmojiState2, "");
            return gifEmojiState2.copy((GifEmoji) this.f85501a.aQ_());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$a */
    static final class View$OnClickListenerC36201a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchGifViewHolder f85500a;

        static {
            Covode.recordClassIndex(43467);
        }

        View$OnClickListenerC36201a(SearchGifViewHolder searchGifViewHolder) {
            this.f85500a = searchGifViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f85500a.f85498j) {
                AbstractC36212ae aeVar = this.f85500a.f85499k;
                C89219l.m154716b(view, "");
                aeVar.mo63371a(this.f85500a.mo63351m(), this.f85500a.getAdapterPosition());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchGifViewHolder(android.view.ViewGroup r5, com.p2082ss.android.ugc.aweme.comment.adapter.AbstractC36212ae r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558748(0x7f0d015c, float:1.874282E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f85499k = r6
            android.view.View r1 = r4.itemView
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            r0 = 2131364965(0x7f0a0c65, float:1.8349782E38)
            android.view.View r1 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView) r1
            r0 = 1
            r1.setDrawingCacheEnabled(r0)
            com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$a r0 = new com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$a
            r0.<init>(r4)
            r1.setOnClickListener(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            r4.f85497g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.comment.adapter.ae):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$d */
    static final class C36204d extends AbstractC89220m implements AbstractC89183m<SearchGifViewHolder, GifEmojiState, C89391z> {

        /* renamed from: a */
        public static final C36204d f85502a = new C36204d();

        static {
            Covode.recordClassIndex(43470);
        }

        C36204d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(SearchGifViewHolder searchGifViewHolder, GifEmojiState gifEmojiState) {
            int[] iArr;
            SearchGifViewHolder searchGifViewHolder2 = searchGifViewHolder;
            GifEmojiState gifEmojiState2 = gifEmojiState;
            C89219l.m154721d(searchGifViewHolder2, "");
            C89219l.m154721d(gifEmojiState2, "");
            GifEmoji gifEmoji = gifEmojiState2.getGifEmoji();
            searchGifViewHolder2.f85498j = false;
            UrlModel thumbnail = gifEmoji.getThumbnail();
            if (thumbnail != null) {
                C89219l.m154721d(thumbnail, "");
                int b = (int) C13628n.m24520b(C17867d.m33078a(), 60.0f);
                if (thumbnail.getWidth() == 0 || thumbnail.getHeight() == 0) {
                    iArr = new int[]{b, b};
                } else {
                    iArr = new int[]{Math.min(C89241a.m154730a((((float) thumbnail.getWidth()) / ((float) thumbnail.getHeight())) * ((float) b)), (int) C13628n.m24520b(C17867d.m33078a(), 107.0f)), b};
                }
                RemoteImageView remoteImageView = searchGifViewHolder2.f85497g;
                ViewGroup.LayoutParams layoutParams = searchGifViewHolder2.f85497g.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iArr[0];
                    layoutParams.height = iArr[1];
                } else {
                    layoutParams = new ViewGroup.LayoutParams(iArr[0], iArr[1]);
                }
                remoteImageView.setLayoutParams(layoutParams);
                C46646h.m90043a(searchGifViewHolder2.f85497g, thumbnail, searchGifViewHolder2);
            }
            searchGifViewHolder2.f85499k.mo63372b(searchGifViewHolder2.mo63351m(), searchGifViewHolder2.getAdapterPosition());
            return C89391z.f203057a;
        }
    }
}
