package com.p2082ss.android.ugc.aweme.story.archive;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.p2359ay.C34363c;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.story.archive.StoryArchListViewModel;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListCell */
public final class StoryArchListCell extends PowerCell<C76487g> {

    /* renamed from: a */
    final C12642a f171714a;

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListCell$a */
    public static final class C76445a extends AbstractC89220m implements AbstractC89172b<C76488h, C76488h> {
        public static final C76445a INSTANCE = new C76445a();

        static {
            Covode.recordClassIndex(89423);
        }

        public C76445a() {
            super(1);
        }

        public final C76488h invoke(C76488h hVar) {
            C89219l.m154719c(hVar, "");
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListCell$f */
    static final class C76450f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C76450f f171718a = new C76450f();

        static {
            Covode.recordClassIndex(89428);
        }

        C76450f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_arch_list";
        }
    }

    static {
        Covode.recordClassIndex(89422);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListCell$c */
    public static final class C76447c extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f171715a;

        static {
            Covode.recordClassIndex(89425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76447c(AbstractC1204m mVar) {
            super(0);
            this.f171715a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f171715a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListCell$b */
    public static final class C76446b extends AbstractC89220m implements AbstractC89171a<C12874b<C76488h>> {
        public static final C76446b INSTANCE = new C76446b();

        static {
            Covode.recordClassIndex(89424);
        }

        public C76446b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76488h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListCell$d */
    public static final class C76448d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C76448d INSTANCE = new C76448d();

        static {
            Covode.recordClassIndex(89426);
        }

        public C76448d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    public StoryArchListCell() {
        C76450f fVar = C76450f.f171718a;
        this.f171714a = new C12642a(C89204ab.m154669a(StoryArchListViewModel.class), fVar, C76446b.INSTANCE, new C76447c(this), C76448d.INSTANCE, C76445a.INSTANCE, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        super.mo28073l();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ((SmartImageView) view.findViewById(R.id.buj)).setAttached(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: m */
    public final void mo28074m() {
        super.mo28074m();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ((SmartImageView) view.findViewById(R.id.buj)).setAttached(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b1l, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListCell$e */
    static final class View$OnClickListenerC76449e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StoryArchListCell f171716a;

        /* renamed from: b */
        final /* synthetic */ C76487g f171717b;

        static {
            Covode.recordClassIndex(89427);
        }

        View$OnClickListenerC76449e(StoryArchListCell storyArchListCell, C76487g gVar) {
            this.f171716a = storyArchListCell;
            this.f171717b = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                String aid = this.f171717b.f171767a.getAid();
                C89219l.m154716b(aid, "");
                C89219l.m154721d(aid, "");
                ((AssemViewModel) this.f171716a.f171714a.getValue()).mo20662a(new StoryArchListViewModel.C76453c(aid));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C76487g gVar) {
        UrlModel cover;
        long j;
        C76487g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        Aweme aweme = gVar2.f171767a;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ((SimpleDraweeView) view.findViewById(R.id.buj)).setActualImageResource(0);
        Video video = aweme.getVideo();
        if (video != null) {
            C34363c cVar = C34363c.f81236a;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            SmartImageView smartImageView = (SmartImageView) view2.findViewById(R.id.buj);
            C89219l.m154716b(smartImageView, "");
            if (!C34363c.m70319a(cVar, smartImageView, video, "StoryArchListCell", false, false, 120) && (cover = video.getCover()) != null) {
                C20766v a = C20761r.m39060a(C34735v.m70965a(cover));
                int[] a2 = C80397em.m139369a(200);
                if (a2 != null) {
                    a.mo34185b(a2);
                }
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                a.f49092E = (SmartImageView) view3.findViewById(R.id.buj);
                a.mo34179a("StoryArchListCell").mo34186c();
            }
        }
        Aweme aweme2 = gVar2.f171767a;
        boolean z = true;
        if (!(C76660b.m134241a() == 1 || C76660b.m134241a() == 2)) {
            z = false;
        }
        if (z) {
            View view4 = this.itemView;
            TuxIconView tuxIconView = (TuxIconView) view4.findViewById(R.id.bgl);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(4);
            TuxTextView tuxTextView = (TuxTextView) view4.findViewById(R.id.eue);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(4);
        } else {
            View view5 = this.itemView;
            TuxIconView tuxIconView2 = (TuxIconView) view5.findViewById(R.id.bgl);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.eue);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            ((TuxIconView) view5.findViewById(R.id.bgl)).setIconRes(R.raw.icon_play);
            TuxTextView tuxTextView3 = (TuxTextView) view5.findViewById(R.id.eue);
            C89219l.m154716b(tuxTextView3, "");
            AwemeStatistics statistics = aweme2.getStatistics();
            if (statistics != null) {
                j = statistics.getPlayCount();
            } else {
                j = 0;
            }
            tuxTextView3.setText(C53437b.m98615a(j));
        }
        this.itemView.setOnClickListener(new View$OnClickListenerC76449e(this, gVar2));
        Aweme aweme3 = gVar2.f171767a;
        if (aweme3.isProhibited()) {
            View view6 = this.itemView;
            C89219l.m154716b(view6, "");
            TuxTextView tuxTextView4 = (TuxTextView) view6.findViewById(R.id.d_j);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText(aweme3.getCoverNotice());
            View view7 = this.itemView;
            C89219l.m154716b(view7, "");
            View findViewById = view7.findViewById(R.id.cif);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(0);
            View view8 = this.itemView;
            C89219l.m154716b(view8, "");
            TuxTextView tuxTextView5 = (TuxTextView) view8.findViewById(R.id.d_j);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(0);
            View view9 = this.itemView;
            C89219l.m154716b(view9, "");
            LinearLayout linearLayout = (LinearLayout) view9.findViewById(R.id.ccb);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        View view10 = this.itemView;
        C89219l.m154716b(view10, "");
        View findViewById2 = view10.findViewById(R.id.cif);
        C89219l.m154716b(findViewById2, "");
        findViewById2.setVisibility(8);
        View view11 = this.itemView;
        C89219l.m154716b(view11, "");
        TuxTextView tuxTextView6 = (TuxTextView) view11.findViewById(R.id.d_j);
        C89219l.m154716b(tuxTextView6, "");
        tuxTextView6.setVisibility(8);
        View view12 = this.itemView;
        C89219l.m154716b(view12, "");
        LinearLayout linearLayout2 = (LinearLayout) view12.findViewById(R.id.ccb);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setVisibility(0);
    }
}
