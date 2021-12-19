package com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
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
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.C60394b;
import com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60621r;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60622s;
import com.p2082ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60604e;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.EnumC60605f;
import com.p2082ss.android.ugc.aweme.music.assem.video.C60706e;
import com.p2082ss.android.ugc.aweme.music.assem.video.EnumC60707f;
import com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
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
import p4600h.p4615g.C89241a;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a */
public class C60530a extends AbstractC12695v<C60530a> implements AbstractC12658i<C60603d> {

    /* renamed from: r */
    static final /* synthetic */ AbstractC89286i[] f137741r = {new C89232y(C60530a.class, "cellViewModel", "getCellViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/assem/MusicCellViewModel;", 0), new C89232y(C60530a.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/OriginMusicListViewModel;", 0), new C89232y(C60530a.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/assem/video/MusicPlayViewModel;", 0)};

    /* renamed from: s */
    private final AbstractC89248d f137742s;

    /* renamed from: t */
    private final AbstractC89248d f137743t;

    /* renamed from: u */
    private final AbstractC89248d f137744u;

    /* renamed from: v */
    private EnumC60707f f137745v;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$e */
    public static final class C60538e extends AbstractC89220m implements AbstractC89172b<C60706e, C60706e> {
        public static final C60538e INSTANCE = new C60538e();

        static {
            Covode.recordClassIndex(71092);
        }

        public C60538e() {
            super(1);
        }

        public final C60706e invoke(C60706e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$i */
    public static final class C60542i extends AbstractC89220m implements AbstractC89172b<C60590k, C60590k> {
        public static final C60542i INSTANCE = new C60542i();

        static {
            Covode.recordClassIndex(71096);
        }

        public C60542i() {
            super(1);
        }

        public final C60590k invoke(C60590k kVar) {
            C89219l.m154719c(kVar, "");
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$o */
    public static final class C60548o extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {
        public static final C60548o INSTANCE = new C60548o();

        static {
            Covode.recordClassIndex(71102);
        }

        public C60548o() {
            super(1);
        }

        public final C60622s invoke(C60622s sVar) {
            C89219l.m154719c(sVar, "");
            return sVar;
        }
    }

    static {
        Covode.recordClassIndex(71084);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final MusicCellViewModel mo98082C() {
        return (MusicCellViewModel) this.f137742s.mo23374a(this, f137741r[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final OriginMusicListViewModel mo98083D() {
        return (OriginMusicListViewModel) this.f137743t.mo23374a(this, f137741r[1]);
    }

    /* renamed from: E */
    public final MusicPlayViewModel mo98084E() {
        return (MusicPlayViewModel) this.f137744u.mo23374a(this, f137741r[2]);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$f */
    public static final class C60539f extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60539f INSTANCE = new C60539f();

        static {
            Covode.recordClassIndex(71093);
        }

        public C60539f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$j */
    public static final class C60543j extends AbstractC89220m implements AbstractC89171a<C12874b<C60590k>> {
        public static final C60543j INSTANCE = new C60543j();

        static {
            Covode.recordClassIndex(71097);
        }

        public C60543j() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60590k> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$k */
    public static final class C60544k extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137755a;

        static {
            Covode.recordClassIndex(71098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60544k(AbstractC12693u uVar) {
            super(0);
            this.f137755a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f137755a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$p */
    public static final class C60549p extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60549p INSTANCE = new C60549p();

        static {
            Covode.recordClassIndex(71103);
        }

        public C60549p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$b */
    public static final class C60535b extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137750a;

        static {
            Covode.recordClassIndex(71089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60535b(AbstractC12693u uVar) {
            super(0);
            this.f137750a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137750a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$c */
    public static final class C60536c extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137751a;

        static {
            Covode.recordClassIndex(71090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60536c(AbstractC12693u uVar) {
            super(0);
            this.f137751a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137751a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$g */
    public static final class C60540g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137753a;

        static {
            Covode.recordClassIndex(71094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60540g(AbstractC12693u uVar) {
            super(0);
            this.f137753a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137753a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$h */
    public static final class C60541h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137754a;

        static {
            Covode.recordClassIndex(71095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60541h(AbstractC12693u uVar) {
            super(0);
            this.f137754a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137754a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$l */
    public static final class C60545l extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137756a;

        static {
            Covode.recordClassIndex(71099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60545l(AbstractC12693u uVar) {
            super(0);
            this.f137756a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137756a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$m */
    public static final class C60546m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137757a;

        static {
            Covode.recordClassIndex(71100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60546m(AbstractC12693u uVar) {
            super(0);
            this.f137757a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137757a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$a */
    public static final class C60531a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137746a;

        static {
            Covode.recordClassIndex(71085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60531a(AbstractC89277c cVar) {
            super(0);
            this.f137746a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137746a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$ab */
    static final class C60533ab extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60530a f137748a;

        static {
            Covode.recordClassIndex(71087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60533ab(C60530a aVar) {
            super(0);
            this.f137748a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f137748a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$d */
    public static final class C60537d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137752a;

        static {
            Covode.recordClassIndex(71091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60537d(AbstractC89277c cVar) {
            super(0);
            this.f137752a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137752a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$n */
    public static final class C60547n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137758a;

        static {
            Covode.recordClassIndex(71101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60547n(AbstractC89277c cVar) {
            super(0);
            this.f137758a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137758a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$u */
    static final class C60554u extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60530a f137767a;

        static {
            Covode.recordClassIndex(71108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60554u(C60530a aVar) {
            super(0);
            this.f137767a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f137767a.az_();
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
        MusicPlayViewModel E;
        mo20510a(E, C60561c.f137775a, C60562d.f137776a, C12856l.m23102a(mo98084E().f31149c), null, C60555v.f137768a);
        AbstractC12818f.C12819a.m23063a(this, mo98082C(), C60563e.f137777a, (C12854k) null, C60556w.f137769a, 6);
    }

    /* renamed from: F */
    public final void mo98085F() {
        boolean z = true;
        if (MusicService.m81198m().mo69308a(((C60603d) C12661l.m22797a(this)).f137817a, mo20528t().getContext(), true)) {
            MusicCellViewModel C = mo98082C();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this)).f137817a;
            String g = mo98084E().mo23342g();
            int b = C12661l.m22798b(this);
            if (((C60603d) C12661l.m22797a(this)).f137818b != EnumC60605f.PINNED) {
                z = false;
            }
            C.mo98081a(musicModel, g, b, z);
            ((CheckableImageView) mo20528t().findViewById(R.id.bxo)).mo98607b();
        }
    }

    public C60530a() {
        C60552s sVar = C60552s.f137765a;
        C60553t tVar = C60553t.f137766a;
        AbstractC89277c a = C89204ab.m154669a(MusicCellViewModel.class);
        this.f137742s = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C60531a(a), C60543j.INSTANCE, new C60544k(this), C60542i.INSTANCE, sVar, tVar, new C60545l(this), new C60546m(this));
        AbstractC12848i iVar = AbstractC12848i.C12852d.f31278a;
        C60554u uVar = new C60554u(this);
        AbstractC89277c a2 = C89204ab.m154669a(OriginMusicListViewModel.class);
        this.f137743t = C14530k.m26542a(this, a2, iVar == null ? AbstractC12848i.C12851c.f31277a : iVar, new C60547n(a2), C60549p.INSTANCE, uVar, C60548o.INSTANCE, null, null, new C60535b(this), new C60536c(this));
        AbstractC12848i iVar2 = AbstractC12848i.C12852d.f31278a;
        C60533ab abVar = new C60533ab(this);
        AbstractC89277c a3 = C89204ab.m154669a(MusicPlayViewModel.class);
        this.f137744u = C14530k.m26542a(this, a3, iVar2 == null ? AbstractC12848i.C12851c.f31277a : iVar2, new C60537d(a3), C60539f.INSTANCE, abVar, C60538e.INSTANCE, null, null, new C60540g(this), new C60541h(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$aa */
    public static final class C60532aa implements CheckableImageView.AbstractC61078a {

        /* renamed from: a */
        final /* synthetic */ C60530a f137747a;

        static {
            Covode.recordClassIndex(71086);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
        public final void bX_() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C60532aa(C60530a aVar) {
            this.f137747a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
        /* renamed from: a */
        public final void mo62594a(int i) {
            if (i == 1) {
                this.f137747a.mo98082C().mo23343h();
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

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$q */
    static final class View$OnClickListenerC60550q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60530a f137759a;

        /* renamed from: b */
        final /* synthetic */ String f137760b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f137761c;

        static {
            Covode.recordClassIndex(71104);
        }

        View$OnClickListenerC60550q(C60530a aVar, String str, MusicModel musicModel) {
            this.f137759a = aVar;
            this.f137760b = str;
            this.f137761c = musicModel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137759a.mo98085F();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$y */
    static final class View$OnClickListenerC60558y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60530a f137772a;

        static {
            Covode.recordClassIndex(71112);
        }

        View$OnClickListenerC60558y(C60530a aVar) {
            this.f137772a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel E = this.f137772a.mo98084E();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f137772a)).f137817a;
            int b = C12661l.m22798b(this.f137772a);
            if (((C60603d) C12661l.m22797a(this.f137772a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.mo98131d(musicModel, b, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$z */
    static final class View$OnClickListenerC60559z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60530a f137773a;

        static {
            Covode.recordClassIndex(71113);
        }

        View$OnClickListenerC60559z(C60530a aVar) {
            this.f137773a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel E = this.f137773a.mo98084E();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f137773a)).f137817a;
            int b = C12661l.m22798b(this.f137773a);
            if (((C60603d) C12661l.m22797a(this.f137773a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.mo98129b(musicModel, b, z);
        }
    }

    /* renamed from: a */
    private final void m110126a(EnumC60605f fVar) {
        int i;
        ((TuxIconView) mo20528t().findViewById(R.id.bxt)).setTuxIcon(C23005c.m43393a(new C60534ac(fVar)));
        TuxTextView tuxTextView = (TuxTextView) mo20528t().findViewById(R.id.f13);
        C89219l.m154716b(tuxTextView, "");
        if (fVar == EnumC60605f.PINNED) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$ac */
    public static final class C60534ac extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC60605f f137749a;

        static {
            Covode.recordClassIndex(71088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60534ac(EnumC60605f fVar) {
            super(1);
            this.f137749a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            int i;
            int i2;
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            if (this.f137749a == EnumC60605f.PINNED) {
                i = R.raw.icon_pin_fill;
            } else {
                i = R.raw.icon_pin;
            }
            aVar2.f54431a = i;
            if (this.f137749a == EnumC60605f.PINNED || this.f137749a == EnumC60605f.ENABLE_PINNED) {
                i2 = R.attr.bc;
            } else {
                i2 = R.attr.bd;
            }
            aVar2.f54435e = Integer.valueOf(i2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$x */
    static final class View$OnClickListenerC60557x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60530a f137770a;

        /* renamed from: b */
        final /* synthetic */ View f137771b;

        static {
            Covode.recordClassIndex(71111);
        }

        View$OnClickListenerC60557x(C60530a aVar, View view) {
            this.f137770a = aVar;
            this.f137771b = view;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            ((TuxIconView) this.f137771b.findViewById(R.id.bzx)).clearAnimation();
            ((TuxIconView) this.f137771b.findViewById(R.id.bzx)).setIconRes(R.raw.icon_color_play);
            MusicPlayViewModel E = this.f137770a.mo98084E();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f137770a)).f137817a;
            int b = C12661l.m22798b(this.f137770a);
            if (((C60603d) C12661l.m22797a(this.f137770a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.mo98130c(musicModel, b, z);
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        ((RelativeLayout) view.findViewById(R.id.dlk)).setOnClickListener(new View$OnClickListenerC60557x(this, view));
        ((LinearLayout) view.findViewById(R.id.ceu)).setOnClickListener(new View$OnClickListenerC60558y(this));
        ((TuxIconView) view.findViewById(R.id.cno)).setOnClickListener(new View$OnClickListenerC60559z(this));
        ((CheckableImageView) view.findViewById(R.id.bxo)).setOnStateChangeListener(new C60532aa(this));
        CheckableImageView checkableImageView = (CheckableImageView) view.findViewById(R.id.bxo);
        C89219l.m154716b(checkableImageView, "");
        checkableImageView.setVisibility(8);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bxt);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
        int i = -a;
        C13628n.m24513a(view.findViewById(R.id.bxt), i, i, a, a);
        AbstractC0549a aVar = (AbstractC0549a) view.findViewById(R.id.qs);
        C89219l.m154716b(aVar, "");
        aVar.setReferencedIds(new int[]{R.id.bxo, R.id.bxt});
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$r */
    static final class View$OnClickListenerC60551r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60530a f137762a;

        /* renamed from: b */
        final /* synthetic */ String f137763b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f137764c;

        static {
            Covode.recordClassIndex(71105);
        }

        View$OnClickListenerC60551r(C60530a aVar, String str, MusicModel musicModel) {
            this.f137762a = aVar;
            this.f137763b = str;
            this.f137764c = musicModel;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C60530a aVar = this.f137762a;
            if (((C60603d) C12661l.m22797a(aVar)).f137818b == EnumC60605f.PINNED) {
                OriginMusicListViewModel D = aVar.mo98083D();
                C60603d dVar = (C60603d) C12661l.m22797a(aVar);
                C89219l.m154721d(dVar, "");
                if (!D.f137609m && !D.f137610n) {
                    D.f137610n = true;
                    AbstractC60621r a = D.f137611o.mo20458a();
                    String k = D.mo98057k();
                    if (k == null) {
                        k = "";
                    }
                    String musicId = dVar.f137817a.getMusicId();
                    C89219l.m154716b(musicId, "");
                    AbstractC88412b a2 = a.mo98019b(k, musicId).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new OriginMusicListViewModel.C60430l(D, dVar), new OriginMusicListViewModel.C60431m(D));
                    C89219l.m154716b(a2, "");
                    D.mo20659a(a2);
                    return;
                }
                return;
            }
            OriginMusicListViewModel D2 = aVar.mo98083D();
            C60603d dVar2 = (C60603d) C12661l.m22797a(aVar);
            int b = C12661l.m22798b(aVar);
            C89219l.m154721d(dVar2, "");
            if (!D2.f137609m && !D2.f137610n) {
                PinnedMusicList pinnedMusicList = D2.f137607k;
                if (pinnedMusicList == null || pinnedMusicList.getAvalibleCapicity() != 0) {
                    C60394b bVar = (C60394b) C12801d.m23016a(D2, C89204ab.m154669a(AbstractC60416h.class));
                    if (bVar == null || !bVar.f137579d) {
                        str = "others_homepage";
                    } else {
                        str = "personal_homepage";
                    }
                    C39162r.m79460a("pin_to_top_music", new C33744d().mo59983a("enter_from", str).mo59983a("music_id", dVar2.f137817a.getMusicId()).mo59983a("enter_method", "personal_list").mo59983a("user_id", D2.mo98056j()).mo59980a("pos", b).mo59980a("is_pin_to_top", 0).f79943a);
                    D2.f137610n = true;
                    AbstractC60621r a3 = D2.f137611o.mo20458a();
                    String k2 = D2.mo98057k();
                    if (k2 == null) {
                        k2 = "";
                    }
                    String musicId2 = dVar2.f137817a.getMusicId();
                    C89219l.m154716b(musicId2, "");
                    AbstractC88412b a4 = a3.mo98018a(k2, musicId2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new OriginMusicListViewModel.C60423f(D2, dVar2), new OriginMusicListViewModel.C60424g(D2));
                    C89219l.m154716b(a4, "");
                    D2.mo20659a(a4);
                    return;
                }
                D2.mo20662a((AbstractC89172b) new OriginMusicListViewModel.C60422e(D2));
            }
        }
    }

    /* renamed from: a */
    public final void mo98086a(EnumC60707f fVar) {
        MethodCollector.m26663i(7052);
        if (this.f137745v == fVar) {
            MethodCollector.m26664o(7052);
            return;
        }
        this.f137745v = fVar;
        View t = mo20528t();
        int i = C60560b.f137774a[fVar.ordinal()];
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
            MethodCollector.m26664o(7052);
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
            MethodCollector.m26664o(7052);
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(mo20528t().getContext(), R.anim.da);
            C89219l.m154716b(loadAnimation, "");
            loadAnimation.setInterpolator(new LinearInterpolator());
            ((TuxIconView) mo20528t().findViewById(R.id.bzx)).setImageResource(2131232639);
            ((TuxIconView) mo20528t().findViewById(R.id.bzx)).startAnimation(loadAnimation);
            MethodCollector.m26664o(7052);
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
        ((CheckableImageView) t.findViewById(R.id.bxo)).setOnClickListener(new View$OnClickListenerC60550q(this, str, musicModel));
        TuxTextView tuxTextView2 = (TuxTextView) t.findViewById(R.id.f6s);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(t.getContext().getString(R.string.dm7, Integer.valueOf(musicModel.getUserCount())));
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
        ((TuxIconView) t.findViewById(R.id.bxt)).setOnClickListener(new View$OnClickListenerC60551r(this, str, musicModel));
        m110126a(dVar2.f137818b);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$s */
    static final class C60552s extends AbstractC89220m implements AbstractC89183m<C60590k, C60603d, C60590k> {

        /* renamed from: a */
        public static final C60552s f137765a = new C60552s();

        static {
            Covode.recordClassIndex(71106);
        }

        C60552s() {
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

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$t */
    static final class C60553t extends AbstractC89220m implements AbstractC89183m<C60603d, C60590k, C60603d> {

        /* renamed from: a */
        public static final C60553t f137766a = new C60553t();

        static {
            Covode.recordClassIndex(71107);
        }

        C60553t() {
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

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$w */
    static final class C60556w extends AbstractC89220m implements AbstractC89183m<C60530a, Boolean, C89391z> {

        /* renamed from: a */
        public static final C60556w f137769a = new C60556w();

        static {
            Covode.recordClassIndex(71110);
        }

        C60556w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C60530a aVar, Boolean bool) {
            int i;
            C60530a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(aVar2, "");
            CheckableImageView checkableImageView = (CheckableImageView) aVar2.mo20528t().findViewById(R.id.bxo);
            if (booleanValue) {
                i = 2131233382;
            } else {
                i = 2131233437;
            }
            checkableImageView.setImageResource(i);
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
        if (list != null && !list.isEmpty()) {
            if (list != null) {
                obj = list.get(0);
            } else {
                obj = null;
            }
            if ((obj instanceof C60604e) && ((C60604e) obj).f137819a) {
                m110126a(dVar2.f137818b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.a$v */
    static final class C60555v extends AbstractC89220m implements AbstractC89187q<C60530a, MusicModel, EnumC60707f, C89391z> {

        /* renamed from: a */
        public static final C60555v f137768a = new C60555v();

        static {
            Covode.recordClassIndex(71109);
        }

        C60555v() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(C60530a aVar, MusicModel musicModel, EnumC60707f fVar) {
            String str;
            C60530a aVar2 = aVar;
            MusicModel musicModel2 = musicModel;
            EnumC60707f fVar2 = fVar;
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(fVar2, "");
            if (musicModel2 != null) {
                str = musicModel2.getMusicId();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) ((C60603d) C12661l.m22797a(aVar2)).f137817a.getMusicId())) {
                aVar2.mo98086a(fVar2);
            } else {
                aVar2.mo98086a(EnumC60707f.Default);
            }
            return C89391z.f203057a;
        }
    }
}
