package com.p2082ss.android.ugc.aweme.music.assem.list;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.p1230a.C17638b;
import com.bytedance.ies.powerlist.page.EnumC17699e;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1719f.p1720a.C23129d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.C60837p;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.C60343a;
import com.p2082ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel;
import com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.AbstractC60601b;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60526a;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.MusicCell;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell;
import com.p2082ss.android.ugc.aweme.music.assem.video.C60706e;
import com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.c */
public final class C60439c extends AbstractC14534m<OriginMusicListViewModel> implements AbstractC60601b, AbstractC60618p {

    /* renamed from: m */
    public static final C60477bj f137643m = new C60477bj((byte) 0);

    /* renamed from: j */
    public boolean f137644j;

    /* renamed from: k */
    public boolean f137645k;

    /* renamed from: l */
    public boolean f137646l;

    /* renamed from: n */
    private final AbstractC89244h f137647n = C89250i.m154773a((AbstractC89171a) new C60497ca(this));

    /* renamed from: o */
    private final C12814b f137648o;

    /* renamed from: p */
    private final C12814b f137649p;

    /* renamed from: q */
    private final C12786i f137650q;

    /* renamed from: r */
    private final C12814b f137651r;

    /* renamed from: s */
    private final AbstractC89244h f137652s;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ak */
    public static final class C60451ak extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {
        public static final C60451ak INSTANCE = new C60451ak();

        static {
            Covode.recordClassIndex(71001);
        }

        public C60451ak() {
            super(1);
        }

        public final C60622s invoke(C60622s sVar) {
            C89219l.m154719c(sVar, "");
            return sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$l */
    public static final class C60506l extends AbstractC89220m implements AbstractC89172b<C60706e, C60706e> {
        public static final C60506l INSTANCE = new C60506l();

        static {
            Covode.recordClassIndex(71056);
        }

        public C60506l() {
            super(1);
        }

        public final C60706e invoke(C60706e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$o */
    public static final class C60509o extends AbstractC89220m implements AbstractC89172b<C60343a, C60343a> {
        public static final C60509o INSTANCE = new C60509o();

        static {
            Covode.recordClassIndex(71059);
        }

        public C60509o() {
            super(1);
        }

        public final C60343a invoke(C60343a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70989);
    }

    /* renamed from: G */
    private final OriginMusicArg m110093G() {
        return (OriginMusicArg) this.f137650q.getValue();
    }

    /* renamed from: A */
    public final LegacyCommunicateViewModel mo98064A() {
        return (LegacyCommunicateViewModel) this.f137649p.getValue();
    }

    /* renamed from: B */
    public final OriginMusicListViewModel mo23378v() {
        return (OriginMusicListViewModel) this.f137651r.getValue();
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: w */
    public final PowerList mo23379w() {
        return (PowerList) this.f137652s.getValue();
    }

    /* renamed from: y */
    public final DmtStatusView mo98070y() {
        return (DmtStatusView) this.f137647n.getValue();
    }

    /* renamed from: z */
    public final MusicPlayViewModel mo98071z() {
        return (MusicPlayViewModel) this.f137648o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ad */
    public static final class C60444ad extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137656a;

        static {
            Covode.recordClassIndex(70994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60444ad(AbstractC12748a aVar) {
            super(0);
            this.f137656a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f137656a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$az */
    public static final class C60466az extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137672a;

        static {
            Covode.recordClassIndex(71016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60466az(AbstractC12748a aVar) {
            super(0);
            this.f137672a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f137672a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bj */
    public static final class C60477bj {
        static {
            Covode.recordClassIndex(71027);
        }

        private C60477bj() {
        }

        public /* synthetic */ C60477bj(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$h */
    public static final class C60502h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137704a;

        static {
            Covode.recordClassIndex(71052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60502h(AbstractC12748a aVar) {
            super(0);
            this.f137704a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f137704a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60618p
    /* renamed from: E */
    public final boolean mo98068E() {
        return this.f137646l;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ac */
    public static final class C60443ac extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C60443ac INSTANCE = new C60443ac();

        static {
            Covode.recordClassIndex(70993);
        }

        public C60443ac() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ae */
    public static final class C60445ae extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137657a;

        static {
            Covode.recordClassIndex(70995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60445ae(AbstractC12748a aVar) {
            super(0);
            this.f137657a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f137657a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$af */
    public static final class C60446af extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137658a;

        static {
            Covode.recordClassIndex(70996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60446af(AbstractC12748a aVar) {
            super(0);
            this.f137658a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f137658a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$al */
    public static final class C60452al extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60452al INSTANCE = new C60452al();

        static {
            Covode.recordClassIndex(71002);
        }

        public C60452al() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ao */
    public static final class C60455ao extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60455ao INSTANCE = new C60455ao();

        static {
            Covode.recordClassIndex(71005);
        }

        public C60455ao() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ar */
    public static final class C60458ar extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60458ar INSTANCE = new C60458ar();

        static {
            Covode.recordClassIndex(71008);
        }

        public C60458ar() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$av */
    public static final class C60462av extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60462av INSTANCE = new C60462av();

        static {
            Covode.recordClassIndex(71012);
        }

        public C60462av() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ay */
    public static final class C60465ay extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60465ay INSTANCE = new C60465ay();

        static {
            Covode.recordClassIndex(71015);
        }

        public C60465ay() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ba */
    public static final class C60468ba extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137674a;

        static {
            Covode.recordClassIndex(71018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60468ba(AbstractC12748a aVar) {
            super(0);
            this.f137674a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f137674a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bb */
    public static final class C60469bb extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137675a;

        static {
            Covode.recordClassIndex(71019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60469bb(AbstractC12748a aVar) {
            super(0);
            this.f137675a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f137675a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bd */
    public static final class C60471bd extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60471bd INSTANCE = new C60471bd();

        static {
            Covode.recordClassIndex(71021);
        }

        public C60471bd() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bh */
    public static final class C60475bh extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60475bh INSTANCE = new C60475bh();

        static {
            Covode.recordClassIndex(71025);
        }

        public C60475bh() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$d */
    public static final class C60498d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60498d INSTANCE = new C60498d();

        static {
            Covode.recordClassIndex(71048);
        }

        public C60498d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$g */
    public static final class C60501g extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60501g INSTANCE = new C60501g();

        static {
            Covode.recordClassIndex(71051);
        }

        public C60501g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$i */
    public static final class C60503i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137705a;

        static {
            Covode.recordClassIndex(71053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60503i(AbstractC12748a aVar) {
            super(0);
            this.f137705a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f137705a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$j */
    public static final class C60504j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137706a;

        static {
            Covode.recordClassIndex(71054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60504j(AbstractC12748a aVar) {
            super(0);
            this.f137706a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f137706a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$p */
    public static final class C60510p extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C60510p INSTANCE = new C60510p();

        static {
            Covode.recordClassIndex(71060);
        }

        public C60510p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$s */
    public static final class C60513s extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60513s INSTANCE = new C60513s();

        static {
            Covode.recordClassIndex(71063);
        }

        public C60513s() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$v */
    public static final class C60516v extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C60516v INSTANCE = new C60516v();

        static {
            Covode.recordClassIndex(71066);
        }

        public C60516v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$w */
    public static final class C60517w extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60517w INSTANCE = new C60517w();

        static {
            Covode.recordClassIndex(71067);
        }

        public C60517w() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$z */
    public static final class C60520z extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60520z INSTANCE = new C60520z();

        static {
            Covode.recordClassIndex(71070);
        }

        public C60520z() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ag */
    public static final class C60447ag extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137659a;

        static {
            Covode.recordClassIndex(70997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60447ag(AbstractC12748a aVar) {
            super(0);
            this.f137659a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137659a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ai */
    public static final class C60449ai extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137661a;

        static {
            Covode.recordClassIndex(70999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60449ai(AbstractC12748a aVar) {
            super(0);
            this.f137661a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137661a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bc */
    public static final class C60470bc extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137676a;

        static {
            Covode.recordClassIndex(71020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60470bc(AbstractC12748a aVar) {
            super(0);
            this.f137676a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137676a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$be */
    public static final class C60472be extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137677a;

        static {
            Covode.recordClassIndex(71022);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60472be(AbstractC12748a aVar) {
            super(0);
            this.f137677a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137677a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bk */
    static final class C60478bk implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C60439c f137682a;

        static {
            Covode.recordClassIndex(71028);
        }

        C60478bk(C60439c cVar) {
            this.f137682a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            this.f137682a.mo23378v().mo23337a(EnumC17699e.Next);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ca */
    static final class C60497ca extends AbstractC89220m implements AbstractC89171a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137701a;

        static {
            Covode.recordClassIndex(71047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60497ca(C60439c cVar) {
            super(0);
            this.f137701a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.f137701a.mo20528t().findViewById(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$k */
    public static final class C60505k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137707a;

        static {
            Covode.recordClassIndex(71055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60505k(AbstractC12748a aVar) {
            super(0);
            this.f137707a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137707a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$m */
    public static final class C60507m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137708a;

        static {
            Covode.recordClassIndex(71057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60507m(AbstractC12748a aVar) {
            super(0);
            this.f137708a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137708a.bD_().f30985g;
        }
    }

    /* renamed from: H */
    private static boolean m110094H() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.assem.list.cell.AbstractC60601b
    /* renamed from: C */
    public final C60526a mo98066C() {
        return new C60526a(mo23379w(), new C60478bk(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60618p
    /* renamed from: F */
    public final View mo98069F() {
        if (this.f31048h) {
            return mo23379w();
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: x */
    public final C17693c mo23380x() {
        C17693c cVar = new C17693c();
        cVar.f42320b = false;
        cVar.f42319a = 2;
        cVar.f42321c = MusicFooterCell.class;
        return cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$a */
    public static final class C60440a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137653a;

        static {
            Covode.recordClassIndex(70990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60440a(AbstractC89277c cVar) {
            super(0);
            this.f137653a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137653a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ah */
    public static final class C60448ah extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137660a;

        static {
            Covode.recordClassIndex(70998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60448ah(AbstractC12748a aVar) {
            super(0);
            this.f137660a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137660a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$aj */
    public static final class C60450aj extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137662a;

        static {
            Covode.recordClassIndex(71000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60450aj(AbstractC89277c cVar) {
            super(0);
            this.f137662a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137662a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$am */
    public static final class C60453am extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137663a;

        static {
            Covode.recordClassIndex(71003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60453am(AbstractC12748a aVar) {
            super(0);
            this.f137663a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137663a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$an */
    public static final class C60454an extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137664a;

        static {
            Covode.recordClassIndex(71004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60454an(AbstractC12748a aVar) {
            super(0);
            this.f137664a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137664a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ap */
    public static final class C60456ap extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137665a;

        static {
            Covode.recordClassIndex(71006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60456ap(AbstractC12748a aVar) {
            super(0);
            this.f137665a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137665a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$aq */
    public static final class C60457aq extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137666a;

        static {
            Covode.recordClassIndex(71007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60457aq(AbstractC12748a aVar) {
            super(0);
            this.f137666a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137666a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$as */
    public static final class C60459as extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137667a;

        static {
            Covode.recordClassIndex(71009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60459as(AbstractC12748a aVar) {
            super(0);
            this.f137667a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137667a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$at */
    public static final class C60460at extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137668a;

        static {
            Covode.recordClassIndex(71010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60460at(AbstractC12748a aVar) {
            super(0);
            this.f137668a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137668a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$au */
    public static final class C60461au extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137669a;

        static {
            Covode.recordClassIndex(71011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60461au(AbstractC12748a aVar) {
            super(0);
            this.f137669a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137669a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$b */
    public static final class C60467b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137673a;

        static {
            Covode.recordClassIndex(71017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60467b(AbstractC12748a aVar) {
            super(0);
            this.f137673a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137673a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bf */
    public static final class C60473bf extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137678a;

        static {
            Covode.recordClassIndex(71023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60473bf(AbstractC12748a aVar) {
            super(0);
            this.f137678a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137678a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bg */
    public static final class C60474bg extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137679a;

        static {
            Covode.recordClassIndex(71024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60474bg(AbstractC12748a aVar) {
            super(0);
            this.f137679a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137679a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bi */
    public static final class C60476bi extends AbstractC89220m implements AbstractC89171a<OriginMusicArg> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137680a;

        /* renamed from: b */
        final /* synthetic */ String f137681b;

        static {
            Covode.recordClassIndex(71026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60476bi(AbstractC12748a aVar, String str) {
            super(0);
            this.f137680a = aVar;
            this.f137681b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.music.assem.OriginMusicArg] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f137680a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.music.assem.OriginMusicArg> r1 = com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg.class
                java.lang.String r0 = r3.f137681b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.list.C60439c.C60476bi.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$br */
    static final class C60486br extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137690a;

        static {
            Covode.recordClassIndex(71036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60486br(C60439c cVar) {
            super(0);
            this.f137690a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f137690a.f31048h) {
                this.f137690a.mo98070y().mo27384f();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$c */
    public static final class C60496c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137700a;

        static {
            Covode.recordClassIndex(71046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60496c(AbstractC12748a aVar) {
            super(0);
            this.f137700a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137700a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$n */
    public static final class C60508n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137709a;

        static {
            Covode.recordClassIndex(71058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60508n(AbstractC89277c cVar) {
            super(0);
            this.f137709a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137709a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$q */
    public static final class C60511q extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137710a;

        static {
            Covode.recordClassIndex(71061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60511q(AbstractC12748a aVar) {
            super(0);
            this.f137710a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137710a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$r */
    public static final class C60512r extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137711a;

        static {
            Covode.recordClassIndex(71062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60512r(AbstractC12748a aVar) {
            super(0);
            this.f137711a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137711a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$t */
    public static final class C60514t extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137712a;

        static {
            Covode.recordClassIndex(71064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60514t(AbstractC12748a aVar) {
            super(0);
            this.f137712a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137712a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$u */
    public static final class C60515u extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137713a;

        static {
            Covode.recordClassIndex(71065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60515u(AbstractC12748a aVar) {
            super(0);
            this.f137713a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137713a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$x */
    public static final class C60518x extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137714a;

        static {
            Covode.recordClassIndex(71068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60518x(AbstractC12748a aVar) {
            super(0);
            this.f137714a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137714a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$y */
    public static final class C60519y extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137715a;

        static {
            Covode.recordClassIndex(71069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60519y(AbstractC12748a aVar) {
            super(0);
            this.f137715a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137715a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60618p
    /* renamed from: D */
    public final boolean mo98067D() {
        if (!this.f31048h) {
            return false;
        }
        if (mo23379w().getChildCount() > 0) {
            mo23379w().mo4413b(0);
        }
        mo23378v().mo98058l();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$aa */
    public static final class C60441aa extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137654a;

        static {
            Covode.recordClassIndex(70991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60441aa(AbstractC12748a aVar) {
            super(0);
            this.f137654a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137654a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ab */
    public static final class C60442ab extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137655a;

        static {
            Covode.recordClassIndex(70992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60442ab(AbstractC12748a aVar) {
            super(0);
            this.f137655a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137655a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$aw */
    public static final class C60463aw extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137670a;

        static {
            Covode.recordClassIndex(71013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60463aw(AbstractC12748a aVar) {
            super(0);
            this.f137670a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137670a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$ax */
    public static final class C60464ax extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137671a;

        static {
            Covode.recordClassIndex(71014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60464ax(AbstractC12748a aVar) {
            super(0);
            this.f137671a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137671a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$e */
    public static final class C60499e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137702a;

        static {
            Covode.recordClassIndex(71049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60499e(AbstractC12748a aVar) {
            super(0);
            this.f137702a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137702a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$f */
    public static final class C60500f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137703a;

        static {
            Covode.recordClassIndex(71050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60500f(AbstractC12748a aVar) {
            super(0);
            this.f137703a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137703a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bm */
    static final class C60480bm extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137684a;

        static {
            Covode.recordClassIndex(71030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60480bm(C60439c cVar) {
            super(0);
            this.f137684a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            PowerList powerList = (PowerList) this.f137684a.mo20528t().findViewById(R.id.doq);
            C60439c cVar = this.f137684a;
            RecyclerView.AbstractC1350a adapter = powerList.getAdapter();
            if (adapter != null) {
                PowerStub g = ((PowerAdapter) adapter).mo28058g();
                if (g != null) {
                    C17638b e = g.mo28103e();
                    if (!e.mo28105a().containsKey(C60439c.class)) {
                        e.mo28105a().put(C60439c.class, cVar);
                    } else {
                        throw new RuntimeException("already contains control type :" + C60439c.class);
                    }
                }
                powerList.mo28083a(MusicCell.class);
                return powerList;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    public C60439c() {
        C12814b bVar;
        C12814b bVar2;
        C12814b bVar3;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(MusicPlayViewModel.class);
        C60440a aVar = new C60440a(a);
        C60506l lVar = C60506l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C60517w.INSTANCE, new C60448ah(this), new C60459as(this), C60471bd.INSTANCE, lVar, new C60473bf(this), new C60474bg(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C60475bh.INSTANCE, new C60467b(this), new C60496c(this), C60498d.INSTANCE, lVar, new C60499e(this), new C60500f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C60501g.INSTANCE, new C60502h(this), new C60503i(this), new C60504j(this), lVar, new C60505k(this), new C60507m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f137648o = bVar;
        AbstractC12848i.C12852d dVar2 = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a2 = C89204ab.m154669a(LegacyCommunicateViewModel.class);
        C60508n nVar = new C60508n(a2);
        C60509o oVar = C60509o.INSTANCE;
        if (C89219l.m154714a(dVar2, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, nVar, C60510p.INSTANCE, new C60511q(this), new C60512r(this), C60513s.INSTANCE, oVar, new C60514t(this), new C60515u(this));
        } else if (C89219l.m154714a(dVar2, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, nVar, C60516v.INSTANCE, new C60518x(this), new C60519y(this), C60520z.INSTANCE, oVar, new C60441aa(this), new C60442ab(this));
        } else if (dVar2 == null || C89219l.m154714a(dVar2, AbstractC12848i.C12850b.f31276a)) {
            bVar2 = new C12814b(a2, nVar, C60443ac.INSTANCE, new C60444ad(this), new C60445ae(this), new C60446af(this), oVar, new C60447ag(this), new C60449ai(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f137649p = bVar2;
        this.f137645k = true;
        this.f137646l = true;
        this.f137650q = new C12786i(bW_(), new C60476bi(this, null));
        AbstractC12848i.C12852d dVar3 = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a3 = C89204ab.m154669a(OriginMusicListViewModel.class);
        C60450aj ajVar = new C60450aj(a3);
        C60451ak akVar = C60451ak.INSTANCE;
        if (C89219l.m154714a(dVar3, AbstractC12848i.C12849a.f31275a)) {
            bVar3 = new C12814b(a3, ajVar, C60452al.INSTANCE, new C60453am(this), new C60454an(this), C60455ao.INSTANCE, akVar, new C60456ap(this), new C60457aq(this));
        } else if (C89219l.m154714a(dVar3, AbstractC12848i.C12852d.f31278a)) {
            bVar3 = new C12814b(a3, ajVar, C60458ar.INSTANCE, new C60460at(this), new C60461au(this), C60462av.INSTANCE, akVar, new C60463aw(this), new C60464ax(this));
        } else if (dVar3 == null || C89219l.m154714a(dVar3, AbstractC12848i.C12850b.f31276a)) {
            bVar3 = new C12814b(a3, ajVar, C60465ay.INSTANCE, new C60466az(this), new C60468ba(this), new C60469bb(this), akVar, new C60470bc(this), new C60472be(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f137651r = bVar3;
        this.f137652s = C89250i.m154773a((AbstractC89171a) new C60480bm(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bl */
    static final class View$OnClickListenerC60479bl implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60439c f137683a;

        static {
            Covode.recordClassIndex(71029);
        }

        View$OnClickListenerC60479bl(C60439c cVar) {
            this.f137683a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137683a.mo23378v().mo98058l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bu */
    static final class C60489bu extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137693a;

        static {
            Covode.recordClassIndex(71039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60489bu(C60439c cVar) {
            super(1);
            this.f137693a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f137693a.f137644j = bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bs */
    static final class C60487bs extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137691a;

        static {
            Covode.recordClassIndex(71037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60487bs(C60439c cVar) {
            super(1);
            this.f137691a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            T t;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || !t.booleanValue())) {
                this.f137691a.mo98067D();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bp */
    static final class C60483bp extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137687a;

        static {
            Covode.recordClassIndex(71033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60483bp(C60439c cVar) {
            super(1);
            this.f137687a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            if (!this.f137687a.f31048h || this.f137687a.mo23379w().getChildCount() <= 0) {
                this.f137687a.mo98070y().mo27387h();
            } else {
                this.f137687a.mo98070y().mo27382d();
            }
            this.f137687a.f137645k = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bq */
    static final class C60484bq extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137688a;

        static {
            Covode.recordClassIndex(71034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60484bq(C60439c cVar) {
            super(1);
            this.f137688a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            this.f137688a.f137645k = false;
            this.f137688a.mo98071z().mo98128a(true);
            C60439c.m22977a(this.f137688a.mo23378v(), new AbstractC89172b<C60622s, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.music.assem.list.C60439c.C60484bq.C604851 */

                /* renamed from: a */
                final /* synthetic */ C60484bq f137689a;

                static {
                    Covode.recordClassIndex(71035);
                }

                {
                    this.f137689a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C60622s sVar) {
                    C60622s sVar2 = sVar;
                    C89219l.m154721d(sVar2, "");
                    List b = AbstractC14527i.C14528a.m26537b(sVar2);
                    if (b == null || b.isEmpty()) {
                        this.f137689a.f137688a.mo98070y().mo27385g();
                    } else {
                        this.f137689a.f137688a.mo98070y().mo27382d();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        TuxTextView tuxTextView;
        String str;
        String str2;
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        if (az_() != null) {
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(az_());
            try {
                Context az_ = az_();
                TuxTextView tuxTextView2 = null;
                if (az_ == null) {
                    tuxTextView = null;
                } else {
                    tuxTextView = new TuxTextView(az_, null, 0, 6);
                    tuxTextView.setTuxFont(51);
                    tuxTextView.setGravity(17);
                    tuxTextView.setTextColor(C0643b.m2378c(az_, R.color.c4));
                    tuxTextView.setText(R.string.cxj);
                    tuxTextView.setOnClickListener(new View$OnClickListenerC60479bl(this));
                }
                boolean isMe = m110093G().isMe();
                Context az_2 = az_();
                if (az_2 != null) {
                    TuxTextView tuxTextView3 = new TuxTextView(az_2, null, 0, 6);
                    tuxTextView3.setTuxFont(51);
                    tuxTextView3.setGravity(17);
                    if (isMe) {
                        str = az_2.getString(R.string.dc4);
                    } else {
                        str = az_2.getString(R.string.dm_);
                    }
                    C89219l.m154716b(str, "");
                    if (isMe) {
                        str2 = az_2.getString(R.string.dc3);
                    } else {
                        str2 = az_2.getString(R.string.dm9, "@" + mo98064A().f137514k);
                    }
                    C89219l.m154716b(str2, "");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C89361p.m154854b("\n            " + str + "\n            " + str2 + "\n            "));
                    spannableStringBuilder.setSpan(new C23126b(33, false), 0, str.length(), 18);
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    spannableStringBuilder.setSpan(new C23129d(C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()))), 0, str.length(), 18);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(az_2, R.color.bx)), 0, str.length(), 18);
                    tuxTextView3.setTextColor(C0643b.m2378c(az_2, R.color.c4));
                    tuxTextView3.setText(spannableStringBuilder);
                    tuxTextView3.setLineSpacing(C13628n.m24520b(az_2, 12.0f), 1.0f);
                    tuxTextView2 = tuxTextView3;
                }
                a.mo27406b(tuxTextView2).mo27408c(tuxTextView);
                int b = (int) C13628n.m24520b(az_(), 24.0f);
                mo98070y().setPadding(b, 0, b, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mo98070y().setBuilder(a);
        }
        if (m110093G().getBottomBarHeight() > 0) {
            mo23379w().setPadding(0, 0, 0, m110093G().getBottomBarHeight());
        }
        C80330da.C80331a.m139266a("origin_music_new_fragment").mo123698a(mo23379w());
        az_();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        mo23379w().setLayoutManager(wrapLinearLayoutManager);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C60607e.f137824a, C12856l.m23100a(), new C60488bt(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C60614l.f137831a, C12856l.m23100a(), C60492bx.f137696a, 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C60615m.f137832a, C12856l.m23100a(), new C60493by(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C60616n.f137833a, C12856l.m23100a(), new C60495bz(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C60617o.f137834a, (C12854k) null, new C60481bn(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C60608f.f137825a, C12856l.m23100a(), new C60482bo(this), 4);
        AssemViewModel.m23030a(mo23378v(), C60609g.f137826a, null, new C60483bp(this), new C60486br(this), new C60484bq(this), 2);
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC60416h.class), C60610h.f137827a, new C60487bs(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC60416h.class), C60611i.f137828a, new C60489bu(this));
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m110094H();
        }
        if (!C58029j.f132256h) {
            new C79459a(az_()).mo123050a(R.string.dcq).mo123053a();
        } else if (mo98064A().f137515l) {
            mo23378v().mo98058l();
        }
        AbstractC12818f.C12819a.m23063a(this, mo98064A(), C60612j.f137829a, C12856l.m23100a(), new C60490bv(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo98064A(), C60613k.f137830a, C12856l.m23100a(), new C60491bw(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bn */
    static final class C60481bn extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137685a;

        static {
            Covode.recordClassIndex(71031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60481bn(C60439c cVar) {
            super(2);
            this.f137685a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(pVar, "");
            this.f137685a.f137646l = booleanValue;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bo */
    static final class C60482bo extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137686a;

        static {
            Covode.recordClassIndex(71032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60482bo(C60439c cVar) {
            super(2);
            this.f137686a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Object> aVar) {
            AbstractC12766p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            C89219l.m154721d(aVar, "");
            if (!pVar2.f31048h || this.f137686a.mo23379w().getChildCount() <= 0) {
                this.f137686a.mo98070y().mo27387h();
            } else {
                this.f137686a.mo98070y().mo27382d();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bt */
    static final class C60488bt extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, List<? extends C60603d>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137692a;

        static {
            Covode.recordClassIndex(71038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60488bt(C60439c cVar) {
            super(2);
            this.f137692a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, List<? extends C60603d> list) {
            AbstractC63985aq.AbstractC63987b bVar;
            List<? extends C60603d> list2 = list;
            C89219l.m154721d(pVar, "");
            this.f137692a.mo98071z().mo98134k();
            if (list2 == null || list2.isEmpty()) {
                if (this.f137692a.f137645k && (bVar = this.f137692a.mo98064A().f137513j) != null) {
                    bVar.mo103569a();
                }
                this.f137692a.f137645k = false;
            } else {
                this.f137692a.mo23379w().setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bv */
    static final class C60490bv extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137694a;

        static {
            Covode.recordClassIndex(71040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60490bv(C60439c cVar) {
            super(2);
            this.f137694a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Object> aVar) {
            C89219l.m154721d(pVar, "");
            if (this.f137694a.mo98070y() == null || !this.f137694a.f137644j) {
                this.f137694a.mo23378v().mo98058l();
            } else {
                this.f137694a.mo98070y().setVisibility(4);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bw */
    static final class C60491bw extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137695a;

        static {
            Covode.recordClassIndex(71041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60491bw(C60439c cVar) {
            super(2);
            this.f137695a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Object> aVar) {
            C89219l.m154721d(pVar, "");
            this.f137695a.mo98070y().mo27385g();
            AbstractC63985aq.AbstractC63987b bVar = this.f137695a.mo98064A().f137513j;
            if (bVar != null && this.f137695a.f137645k) {
                bVar.mo103569a();
            }
            this.f137695a.f137645k = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$by */
    static final class C60493by extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137697a;

        static {
            Covode.recordClassIndex(71043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60493by(C60439c cVar) {
            super(2);
            this.f137697a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Integer> aVar) {
            AbstractC12766p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            C89219l.m154721d(aVar, "");
            if (pVar2.f31048h) {
                this.f137697a.mo23379w().postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.music.assem.list.C60439c.C60493by.RunnableC604941 */

                    /* renamed from: a */
                    final /* synthetic */ C60493by f137698a;

                    static {
                        Covode.recordClassIndex(71044);
                    }

                    {
                        this.f137698a = r1;
                    }

                    public final void run() {
                        this.f137698a.f137697a.mo23379w().mo4413b(0);
                    }
                }, 50);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bz */
    static final class C60495bz extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60439c f137699a;

        static {
            Covode.recordClassIndex(71045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60495bz(C60439c cVar) {
            super(2);
            this.f137699a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Boolean> aVar) {
            AbstractC12766p pVar2 = pVar;
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(pVar2, "");
            C89219l.m154721d(aVar2, "");
            if (pVar2.f31048h) {
                if (aVar2.f31085a.booleanValue()) {
                    RecyclerView.AbstractC1362i layoutManager = this.f137699a.mo23379w().getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).mo4372l() <= 1) {
                        this.f137699a.mo23379w().mo4413b(0);
                    }
                } else {
                    this.f137699a.mo23379w().mo4413b(0);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$bx */
    static final class C60492bx extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends C60837p>, C89391z> {

        /* renamed from: a */
        public static final C60492bx f137696a = new C60492bx();

        static {
            Covode.recordClassIndex(71042);
        }

        C60492bx() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends C60837p> aVar) {
            Fragment a;
            AbstractC12766p pVar2 = pVar;
            C12776a<? extends C60837p> aVar2 = aVar;
            C89219l.m154721d(pVar2, "");
            C89219l.m154721d(aVar2, "");
            T t = aVar2.f31085a;
            if (t != null) {
                if (t.f138251a) {
                    int i = C60606d.f137822a[t.f138252b.ordinal()];
                    if (i == 1) {
                        Fragment a2 = C12777b.m22999a((AbstractC1204m) pVar2);
                        if (a2 != null) {
                            new C23144b(a2).mo37640e(R.string.dns).mo37637b();
                        }
                    } else if (i != 2) {
                        Fragment a3 = C12777b.m22999a((AbstractC1204m) pVar2);
                        if (a3 != null) {
                            new C23144b(a3).mo37635a(a3.getString(R.string.dnt)).mo37637b();
                        }
                    } else {
                        Fragment a4 = C12777b.m22999a((AbstractC1204m) pVar2);
                        if (a4 != null) {
                            new C23144b(a4).mo37635a(a4.getString(R.string.dnu, Integer.valueOf(t.f138253c))).mo37637b();
                        }
                    }
                } else {
                    int i2 = C60606d.f137823b[t.f138252b.ordinal()];
                    if (i2 == 1) {
                        Fragment a5 = C12777b.m22999a((AbstractC1204m) pVar2);
                        if (a5 != null) {
                            new C23144b(a5).mo37640e(R.string.dnw).mo37637b();
                        }
                    } else if (i2 == 2 && (a = C12777b.m22999a((AbstractC1204m) pVar2)) != null) {
                        new C23144b(a).mo37635a(a.getString(R.string.dnv)).mo37637b();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
