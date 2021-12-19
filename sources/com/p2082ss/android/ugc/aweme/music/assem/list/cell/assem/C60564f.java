package com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.AbstractC0549a;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.p795b.AbstractC12658i;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.AbstractC12695v;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60604e;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.EnumC60605f;
import com.p2082ss.android.ugc.aweme.music.assem.video.C60706e;
import com.p2082ss.android.ugc.aweme.music.assem.video.EnumC60707f;
import com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f */
public class C60564f extends AbstractC12695v<C60564f> implements AbstractC12658i<C60603d> {

    /* renamed from: r */
    static final /* synthetic */ AbstractC89286i[] f137778r = {new C89232y(C60564f.class, "cellViewModel", "getCellViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/assem/MusicCellViewModel;", 0), new C89232y(C60564f.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/assem/video/MusicPlayViewModel;", 0)};

    /* renamed from: s */
    private final AbstractC89248d f137779s;

    /* renamed from: t */
    private final AbstractC89248d f137780t;

    /* renamed from: u */
    private EnumC60707f f137781u;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$d */
    public static final class C60568d extends AbstractC89220m implements AbstractC89172b<C60590k, C60590k> {
        public static final C60568d INSTANCE = new C60568d();

        static {
            Covode.recordClassIndex(71122);
        }

        public C60568d() {
            super(1);
        }

        public final C60590k invoke(C60590k kVar) {
            C89219l.m154719c(kVar, "");
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$j */
    public static final class C60574j extends AbstractC89220m implements AbstractC89172b<C60706e, C60706e> {
        public static final C60574j INSTANCE = new C60574j();

        static {
            Covode.recordClassIndex(71128);
        }

        public C60574j() {
            super(1);
        }

        public final C60706e invoke(C60706e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(71118);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final MusicCellViewModel mo98095C() {
        return (MusicCellViewModel) this.f137779s.mo23374a(this, f137778r[0]);
    }

    /* renamed from: D */
    public final MusicPlayViewModel mo98096D() {
        return (MusicPlayViewModel) this.f137780t.mo23374a(this, f137778r[1]);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$e */
    public static final class C60569e extends AbstractC89220m implements AbstractC89171a<C12874b<C60590k>> {
        public static final C60569e INSTANCE = new C60569e();

        static {
            Covode.recordClassIndex(71123);
        }

        public C60569e() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60590k> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$f */
    public static final class C60570f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137785a;

        static {
            Covode.recordClassIndex(71124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60570f(AbstractC12693u uVar) {
            super(0);
            this.f137785a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f137785a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$k */
    public static final class C60575k extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60575k INSTANCE = new C60575k();

        static {
            Covode.recordClassIndex(71129);
        }

        public C60575k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$b */
    public static final class C60566b extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137783a;

        static {
            Covode.recordClassIndex(71120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60566b(AbstractC12693u uVar) {
            super(0);
            this.f137783a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137783a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$c */
    public static final class C60567c extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137784a;

        static {
            Covode.recordClassIndex(71121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60567c(AbstractC12693u uVar) {
            super(0);
            this.f137784a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137784a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$g */
    public static final class C60571g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137786a;

        static {
            Covode.recordClassIndex(71125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60571g(AbstractC12693u uVar) {
            super(0);
            this.f137786a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137786a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$h */
    public static final class C60572h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137787a;

        static {
            Covode.recordClassIndex(71126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60572h(AbstractC12693u uVar) {
            super(0);
            this.f137787a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137787a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$a */
    public static final class C60565a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137782a;

        static {
            Covode.recordClassIndex(71119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60565a(AbstractC89277c cVar) {
            super(0);
            this.f137782a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137782a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$i */
    public static final class C60573i extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137788a;

        static {
            Covode.recordClassIndex(71127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60573i(AbstractC89277c cVar) {
            super(0);
            this.f137788a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137788a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$u */
    static final class C60585u extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60564f f137801a;

        static {
            Covode.recordClassIndex(71139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60585u(C60564f fVar) {
            super(0);
            this.f137801a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f137801a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        MusicPlayViewModel D;
        mo20510a(D, C60587h.f137803a, C60588i.f137804a, C12856l.m23102a(mo98096D().f31149c), null, C60579o.f137794a);
        AbstractC12818f.C12819a.m23063a(this, mo98095C(), C60589j.f137805a, (C12854k) null, C60580p.f137795a, 6);
    }

    /* renamed from: F */
    private final void m110140F() {
        int i;
        TuxTextView tuxTextView = (TuxTextView) mo20528t().findViewById(R.id.f13);
        C89219l.m154716b(tuxTextView, "");
        if (((C60603d) C12661l.m22797a(this)).f137818b == EnumC60605f.PINNED) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
    }

    public C60564f() {
        C60577m mVar = C60577m.f137792a;
        C60578n nVar = C60578n.f137793a;
        AbstractC89277c a = C89204ab.m154669a(MusicCellViewModel.class);
        this.f137779s = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C60565a(a), C60569e.INSTANCE, new C60570f(this), C60568d.INSTANCE, mVar, nVar, new C60571g(this), new C60572h(this));
        AbstractC12848i iVar = AbstractC12848i.C12852d.f31278a;
        C60585u uVar = new C60585u(this);
        AbstractC89277c a2 = C89204ab.m154669a(MusicPlayViewModel.class);
        this.f137780t = C14530k.m26542a(this, a2, iVar == null ? AbstractC12848i.C12851c.f31277a : iVar, new C60573i(a2), C60575k.INSTANCE, uVar, C60574j.INSTANCE, null, null, new C60566b(this), new C60567c(this));
    }

    /* renamed from: E */
    public final void mo98097E() {
        boolean z = true;
        if (MusicService.m81198m().mo69308a(((C60603d) C12661l.m22797a(this)).f137817a, mo20528t().getContext(), true)) {
            MusicCellViewModel C = mo98095C();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this)).f137817a;
            String g = mo98096D().mo23342g();
            int b = C12661l.m22798b(this);
            if (((C60603d) C12661l.m22797a(this)).f137818b != EnumC60605f.PINNED) {
                z = false;
            }
            C.mo98081a(musicModel, g, b, z);
            ((CheckableImageView) mo20528t().findViewById(R.id.bxo)).mo98607b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$t */
    public static final class C60584t implements CheckableImageView.AbstractC61078a {

        /* renamed from: a */
        final /* synthetic */ C60564f f137800a;

        static {
            Covode.recordClassIndex(71138);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
        public final void bX_() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C60584t(C60564f fVar) {
            this.f137800a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
        /* renamed from: a */
        public final void mo62594a(int i) {
            if (i == 1) {
                this.f137800a.mo98095C().mo23343h();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: b */
    public final /* synthetic */ void mo20469b(C60603d dVar) {
        C89219l.m154721d(dVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: c */
    public final /* synthetic */ boolean mo20470c(C60603d dVar) {
        C89219l.m154721d(dVar, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$l */
    static final class View$OnClickListenerC60576l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60564f f137789a;

        /* renamed from: b */
        final /* synthetic */ String f137790b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f137791c;

        static {
            Covode.recordClassIndex(71130);
        }

        View$OnClickListenerC60576l(C60564f fVar, String str, MusicModel musicModel) {
            this.f137789a = fVar;
            this.f137790b = str;
            this.f137791c = musicModel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137789a.mo98097E();
        }
    }

    /* renamed from: a */
    public final void mo98099a(boolean z) {
        int i;
        CheckableImageView checkableImageView = (CheckableImageView) mo20528t().findViewById(R.id.bxo);
        if (z) {
            i = 2131233382;
        } else {
            i = 2131233437;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$r */
    static final class View$OnClickListenerC60582r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60564f f137798a;

        static {
            Covode.recordClassIndex(71136);
        }

        View$OnClickListenerC60582r(C60564f fVar) {
            this.f137798a = fVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel D = this.f137798a.mo98096D();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f137798a)).f137817a;
            int b = C12661l.m22798b(this.f137798a);
            if (((C60603d) C12661l.m22797a(this.f137798a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            D.mo98131d(musicModel, b, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$s */
    static final class View$OnClickListenerC60583s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60564f f137799a;

        static {
            Covode.recordClassIndex(71137);
        }

        View$OnClickListenerC60583s(C60564f fVar) {
            this.f137799a = fVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel D = this.f137799a.mo98096D();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f137799a)).f137817a;
            int b = C12661l.m22798b(this.f137799a);
            if (((C60603d) C12661l.m22797a(this.f137799a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            D.mo98129b(musicModel, b, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$q */
    static final class View$OnClickListenerC60581q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60564f f137796a;

        /* renamed from: b */
        final /* synthetic */ View f137797b;

        static {
            Covode.recordClassIndex(71135);
        }

        View$OnClickListenerC60581q(C60564f fVar, View view) {
            this.f137796a = fVar;
            this.f137797b = view;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            ((TuxIconView) this.f137797b.findViewById(R.id.bzx)).clearAnimation();
            ((TuxIconView) this.f137797b.findViewById(R.id.bzx)).setIconRes(R.raw.icon_color_play);
            MusicPlayViewModel D = this.f137796a.mo98096D();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f137796a)).f137817a;
            int b = C12661l.m22798b(this.f137796a);
            if (((C60603d) C12661l.m22797a(this.f137796a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            D.mo98130c(musicModel, b, z);
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        ((RelativeLayout) view.findViewById(R.id.dlk)).setOnClickListener(new View$OnClickListenerC60581q(this, view));
        ((LinearLayout) view.findViewById(R.id.ceu)).setOnClickListener(new View$OnClickListenerC60582r(this));
        ((TuxIconView) view.findViewById(R.id.cno)).setOnClickListener(new View$OnClickListenerC60583s(this));
        ((CheckableImageView) view.findViewById(R.id.bxo)).setOnStateChangeListener(new C60584t(this));
        CheckableImageView checkableImageView = (CheckableImageView) view.findViewById(R.id.bxo);
        C89219l.m154716b(checkableImageView, "");
        checkableImageView.setVisibility(0);
        AbstractC0549a aVar = (AbstractC0549a) view.findViewById(R.id.qs);
        C89219l.m154716b(aVar, "");
        aVar.setReferencedIds(new int[]{R.id.bxo, R.id.bxt});
    }

    /* renamed from: a */
    public final void mo98098a(EnumC60707f fVar) {
        MethodCollector.m26663i(7749);
        if (this.f137781u == fVar) {
            MethodCollector.m26664o(7749);
            return;
        }
        this.f137781u = fVar;
        View t = mo20528t();
        int i = C60586g.f137802a[fVar.ordinal()];
        if (i == 1) {
            RelativeLayout relativeLayout = (RelativeLayout) t.findViewById(R.id.dlk);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) t.findViewById(R.id.bzx);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) t.findViewById(R.id.bzx)).setImageResource(2131233424);
            ((TuxIconView) t.findViewById(R.id.bzx)).clearAnimation();
            ProgressBar progressBar = (ProgressBar) t.findViewById(R.id.d01);
            C89219l.m154716b(progressBar, "");
            progressBar.setVisibility(8);
            C39162r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(((C60603d) C12661l.m22797a(this)).f137817a.getMusicId()));
            MethodCollector.m26664o(7749);
        } else if (i != 2) {
            if (i == 3) {
                RelativeLayout relativeLayout2 = (RelativeLayout) t.findViewById(R.id.dlk);
                C89219l.m154716b(relativeLayout2, "");
                relativeLayout2.setVisibility(8);
                ProgressBar progressBar2 = (ProgressBar) t.findViewById(R.id.d01);
                C89219l.m154716b(progressBar2, "");
                progressBar2.setVisibility(8);
                TuxIconView tuxIconView2 = (TuxIconView) t.findViewById(R.id.bzx);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
                ((TuxIconView) t.findViewById(R.id.bzx)).setIconRes(R.raw.icon_color_play);
                ((TuxIconView) t.findViewById(R.id.bzx)).clearAnimation();
            }
            MethodCollector.m26664o(7749);
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(mo20528t().getContext(), R.anim.da);
            C89219l.m154716b(loadAnimation, "");
            loadAnimation.setInterpolator(new LinearInterpolator());
            ((TuxIconView) mo20528t().findViewById(R.id.bzx)).setImageResource(2131232639);
            ((TuxIconView) mo20528t().findViewById(R.id.bzx)).startAnimation(loadAnimation);
            MethodCollector.m26664o(7749);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(C60603d dVar) {
        String str;
        C60603d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        mo20528t().setBackground(C0643b.m2369a(mo20528t().getContext(), (int) R.drawable.qa));
        MusicModel musicModel = dVar2.f137817a;
        if (!TextUtils.isEmpty(musicModel.getName())) {
            str = musicModel.getName();
        } else {
            str = "";
        }
        View t = mo20528t();
        TuxTextView tuxTextView = (TuxTextView) t.findViewById(R.id.ezz);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
        int i = 0;
        ((TuxTextView) t.findViewById(R.id.ezz)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        ((CheckableImageView) t.findViewById(R.id.bxo)).setOnClickListener(new View$OnClickListenerC60576l(this, str, musicModel));
        TuxTextView tuxTextView2 = (TuxTextView) t.findViewById(R.id.f6s);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(t.getContext().getString(R.string.dm7, C53437b.m98615a((long) musicModel.getUserCount())));
        if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
            TuxTextView tuxTextView3 = (TuxTextView) t.findViewById(R.id.evh);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(MusicService.m81198m().mo69296a(musicModel.getPresenterDuration()));
            TuxTextView tuxTextView4 = (TuxTextView) t.findViewById(R.id.evh);
            C89219l.m154716b(tuxTextView4, "");
            if (musicModel.getPresenterDuration() <= 0) {
                i = 4;
            }
            tuxTextView4.setVisibility(i);
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) t.findViewById(R.id.evh);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText(MusicService.m81198m().mo69296a(musicModel.getDuration()));
            TuxTextView tuxTextView6 = (TuxTextView) t.findViewById(R.id.evh);
            C89219l.m154716b(tuxTextView6, "");
            if (musicModel.getDuration() <= 0) {
                i = 4;
            }
            tuxTextView6.setVisibility(i);
        }
        if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
            C34577e.m70608b((RemoteImageView) t.findViewById(R.id.dqg), musicModel.getPicPremium(), -1, -1);
        } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
            C34577e.m70608b((RemoteImageView) t.findViewById(R.id.dqg), musicModel.getPicBig(), -1, -1);
        } else {
            C34577e.m70591a((RemoteImageView) t.findViewById(R.id.dqg), 2131233384);
        }
        m110140F();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$m */
    static final class C60577m extends AbstractC89220m implements AbstractC89183m<C60590k, C60603d, C60590k> {

        /* renamed from: a */
        public static final C60577m f137792a = new C60577m();

        static {
            Covode.recordClassIndex(71131);
        }

        C60577m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C60590k invoke(C60590k kVar, C60603d dVar) {
            boolean z;
            C60590k kVar2 = kVar;
            C60603d dVar2 = dVar;
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(dVar2, "");
            if (dVar2.f137817a.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
                z = true;
            } else {
                z = false;
            }
            return C60590k.m110154a(kVar2, z, null, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$n */
    static final class C60578n extends AbstractC89220m implements AbstractC89183m<C60603d, C60590k, C60603d> {

        /* renamed from: a */
        public static final C60578n f137793a = new C60578n();

        static {
            Covode.recordClassIndex(71132);
        }

        C60578n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C60603d invoke(C60603d dVar, C60590k kVar) {
            MusicModel.CollectionType collectionType;
            C60603d dVar2 = dVar;
            C60590k kVar2 = kVar;
            C89219l.m154721d(dVar2, "");
            C89219l.m154721d(kVar2, "");
            MusicModel musicModel = dVar2.f137817a;
            if (kVar2.f137806a) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            musicModel.setCollectionType(collectionType);
            return dVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$p */
    static final class C60580p extends AbstractC89220m implements AbstractC89183m<C60564f, Boolean, C89391z> {

        /* renamed from: a */
        public static final C60580p f137795a = new C60580p();

        static {
            Covode.recordClassIndex(71134);
        }

        C60580p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C60564f fVar, Boolean bool) {
            C60564f fVar2 = fVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(fVar2, "");
            fVar2.mo98099a(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20468a(C60603d dVar, List list) {
        Object obj;
        C60603d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            if (list != null) {
                obj = list.get(0);
            } else {
                obj = null;
            }
            if (obj instanceof C60604e) {
                C60604e eVar = (C60604e) obj;
                if (eVar.f137819a) {
                    m110140F();
                }
                if (eVar.f137820b) {
                    if (dVar2.f137817a.getCollectionType() != MusicModel.CollectionType.COLLECTED) {
                        z = false;
                    }
                    mo98099a(z);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.f$o */
    static final class C60579o extends AbstractC89220m implements AbstractC89187q<C60564f, MusicModel, EnumC60707f, C89391z> {

        /* renamed from: a */
        public static final C60579o f137794a = new C60579o();

        static {
            Covode.recordClassIndex(71133);
        }

        C60579o() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(C60564f fVar, MusicModel musicModel, EnumC60707f fVar2) {
            String str;
            C60564f fVar3 = fVar;
            MusicModel musicModel2 = musicModel;
            EnumC60707f fVar4 = fVar2;
            C89219l.m154721d(fVar3, "");
            C89219l.m154721d(fVar4, "");
            if (musicModel2 != null) {
                str = musicModel2.getMusicId();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) ((C60603d) C12661l.m22797a(fVar3)).f137817a.getMusicId())) {
                fVar3.mo98098a(fVar4);
            } else {
                fVar3.mo98098a(EnumC60707f.Default);
            }
            return C89391z.f203057a;
        }
    }
}
