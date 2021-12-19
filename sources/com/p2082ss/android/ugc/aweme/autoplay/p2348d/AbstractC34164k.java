package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34246c;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.utils.C80508gp;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.k */
public abstract class AbstractC34164k extends RecyclerView.ViewHolder implements AbstractC34145c {

    /* renamed from: a */
    private final AbstractC89244h f80792a;

    /* renamed from: i */
    public final AbstractC51043a f80793i;

    /* renamed from: j */
    public final C51060g f80794j;

    /* renamed from: k */
    public AbstractC51044b f80795k;

    static {
        Covode.recordClassIndex(41098);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void an_() {
    }

    /* renamed from: j */
    public abstract ImageView mo60357j();

    /* renamed from: l */
    public abstract SearchVideoView mo60359l();

    /* renamed from: m */
    public AbstractC34145c mo60360m() {
        return (AbstractC34145c) this.f80792a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bg_() {
        mo60360m().bg_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bi_() {
        mo60360m().bi_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: e */
    public final void mo60344e() {
        mo60360m().mo60344e();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final boolean aZ_() {
        return mo60360m().aZ_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: g */
    public final C34246c mo60348g() {
        return mo60360m().mo60348g();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: h */
    public final C34176n mo60349h() {
        return mo60360m().mo60349h();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: i */
    public final AbstractC34186b.AbstractC34187a mo60350i() {
        return mo60360m().mo60350i();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.k$a */
    static final class C34165a extends AbstractC89220m implements AbstractC89171a<C34160j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34164k f80796a;

        /* renamed from: b */
        final /* synthetic */ View f80797b;

        static {
            Covode.recordClassIndex(41099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34165a(AbstractC34164k kVar, View view) {
            super(0);
            this.f80796a = kVar;
            this.f80797b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34160j invoke() {
            return new C34160j(this.f80796a.mo60359l(), this.f80796a.mo60357j(), this.f80796a.f80793i, this.f80796a.f80794j, this.f80796a.f80795k, this.f80797b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: a */
    public final void mo60340a(long j) {
        mo60360m().mo60340a(j);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: a */
    public final void mo60347a(AbstractC34186b.AbstractC34187a aVar) {
        mo60360m().mo60347a(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC34164k(View view, AbstractC51043a aVar, C51060g gVar, AbstractC51044b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        this.f80793i = aVar;
        this.f80794j = gVar;
        this.f80795k = bVar;
        this.f80792a = C89250i.m154773a((AbstractC89171a) new C34165a(this, view));
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new C80508gp(view.getResources().getDimensionPixelOffset(R.dimen.rw)));
            view.setClipToOutline(true);
        }
    }
}
