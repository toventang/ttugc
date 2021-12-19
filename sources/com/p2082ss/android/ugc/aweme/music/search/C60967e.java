package com.p2082ss.android.ugc.aweme.music.search;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.p1230a.C17638b;
import com.bytedance.ies.powerlist.page.EnumC17699e;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.C60837p;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.C60343a;
import com.p2082ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel;
import com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60618p;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60622s;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.AbstractC60601b;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60526a;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.MusicCell;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell;
import com.p2082ss.android.ugc.aweme.music.assem.video.C60706e;
import com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.List;
import java.util.Objects;
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
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.music.search.e */
public final class C60967e extends AbstractC14534m<SearchMusicListViewModel> implements AbstractC60601b, AbstractC60618p {

    /* renamed from: j */
    public boolean f138458j;

    /* renamed from: k */
    public boolean f138459k;

    /* renamed from: l */
    public boolean f138460l;

    /* renamed from: m */
    private final AbstractC89244h f138461m = C89250i.m154773a((AbstractC89171a) new C61018bu(this));

    /* renamed from: n */
    private final C12814b f138462n;

    /* renamed from: o */
    private final C12814b f138463o;

    /* renamed from: p */
    private final C12814b f138464p;

    /* renamed from: q */
    private final AbstractC89244h f138465q;

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ak */
    public static final class C60979ak extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {
        public static final C60979ak INSTANCE = new C60979ak();

        static {
            Covode.recordClassIndex(71570);
        }

        public C60979ak() {
            super(1);
        }

        public final C60622s invoke(C60622s sVar) {
            C89219l.m154719c(sVar, "");
            return sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$l */
    public static final class C61029l extends AbstractC89220m implements AbstractC89172b<C60706e, C60706e> {
        public static final C61029l INSTANCE = new C61029l();

        static {
            Covode.recordClassIndex(71620);
        }

        public C61029l() {
            super(1);
        }

        public final C60706e invoke(C60706e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$o */
    public static final class C61032o extends AbstractC89220m implements AbstractC89172b<C60343a, C60343a> {
        public static final C61032o INSTANCE = new C61032o();

        static {
            Covode.recordClassIndex(71623);
        }

        public C61032o() {
            super(1);
        }

        public final C60343a invoke(C60343a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(71558);
    }

    /* renamed from: A */
    public final LegacyCommunicateViewModel mo98567A() {
        return (LegacyCommunicateViewModel) this.f138463o.getValue();
    }

    /* renamed from: B */
    public final SearchMusicListViewModel mo23378v() {
        return (SearchMusicListViewModel) this.f138464p.getValue();
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: w */
    public final PowerList mo23379w() {
        return (PowerList) this.f138465q.getValue();
    }

    /* renamed from: y */
    public final TuxStatusView mo98570y() {
        return (TuxStatusView) this.f138461m.getValue();
    }

    /* renamed from: z */
    public final MusicPlayViewModel mo98571z() {
        return (MusicPlayViewModel) this.f138462n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ad */
    public static final class C60972ad extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138469a;

        static {
            Covode.recordClassIndex(71563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60972ad(AbstractC12748a aVar) {
            super(0);
            this.f138469a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f138469a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ax */
    public static final class C60992ax extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138485a;

        static {
            Covode.recordClassIndex(71583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60992ax(AbstractC12748a aVar) {
            super(0);
            this.f138485a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f138485a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bk */
    static final class C61007bk extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138498a;

        static {
            Covode.recordClassIndex(71598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61007bk(C60967e eVar) {
            super(0);
            this.f138498a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$h */
    public static final class C61025h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138514a;

        static {
            Covode.recordClassIndex(71616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61025h(AbstractC12748a aVar) {
            super(0);
            this.f138514a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f138514a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60618p
    /* renamed from: E */
    public final boolean mo98068E() {
        return this.f138460l;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ac */
    public static final class C60971ac extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C60971ac INSTANCE = new C60971ac();

        static {
            Covode.recordClassIndex(71562);
        }

        public C60971ac() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ae */
    public static final class C60973ae extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138470a;

        static {
            Covode.recordClassIndex(71564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60973ae(AbstractC12748a aVar) {
            super(0);
            this.f138470a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f138470a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$af */
    public static final class C60974af extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138471a;

        static {
            Covode.recordClassIndex(71565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60974af(AbstractC12748a aVar) {
            super(0);
            this.f138471a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f138471a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$al */
    public static final class C60980al extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60980al INSTANCE = new C60980al();

        static {
            Covode.recordClassIndex(71571);
        }

        public C60980al() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$aq */
    public static final class C60985aq extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60985aq INSTANCE = new C60985aq();

        static {
            Covode.recordClassIndex(71576);
        }

        public C60985aq() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$aw */
    public static final class C60991aw extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60991aw INSTANCE = new C60991aw();

        static {
            Covode.recordClassIndex(71582);
        }

        public C60991aw() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ay */
    public static final class C60993ay extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138486a;

        static {
            Covode.recordClassIndex(71584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60993ay(AbstractC12748a aVar) {
            super(0);
            this.f138486a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f138486a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ba */
    public static final class C60996ba extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60996ba INSTANCE = new C60996ba();

        static {
            Covode.recordClassIndex(71587);
        }

        public C60996ba() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$be */
    public static final class C61000be extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C61000be INSTANCE = new C61000be();

        static {
            Covode.recordClassIndex(71591);
        }

        public C61000be() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$d */
    public static final class C61021d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C61021d INSTANCE = new C61021d();

        static {
            Covode.recordClassIndex(71612);
        }

        public C61021d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$g */
    public static final class C61024g extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C61024g INSTANCE = new C61024g();

        static {
            Covode.recordClassIndex(71615);
        }

        public C61024g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$i */
    public static final class C61026i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138515a;

        static {
            Covode.recordClassIndex(71617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61026i(AbstractC12748a aVar) {
            super(0);
            this.f138515a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f138515a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$j */
    public static final class C61027j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138516a;

        static {
            Covode.recordClassIndex(71618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61027j(AbstractC12748a aVar) {
            super(0);
            this.f138516a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f138516a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$p */
    public static final class C61033p extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C61033p INSTANCE = new C61033p();

        static {
            Covode.recordClassIndex(71624);
        }

        public C61033p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$s */
    public static final class C61036s extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C61036s INSTANCE = new C61036s();

        static {
            Covode.recordClassIndex(71627);
        }

        public C61036s() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$v */
    public static final class C61039v extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C61039v INSTANCE = new C61039v();

        static {
            Covode.recordClassIndex(71630);
        }

        public C61039v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$w */
    public static final class C61040w extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C61040w INSTANCE = new C61040w();

        static {
            Covode.recordClassIndex(71631);
        }

        public C61040w() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$z */
    public static final class C61043z extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C61043z INSTANCE = new C61043z();

        static {
            Covode.recordClassIndex(71634);
        }

        public C61043z() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ag */
    public static final class C60975ag extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138472a;

        static {
            Covode.recordClassIndex(71566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60975ag(AbstractC12748a aVar) {
            super(0);
            this.f138472a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f138472a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ai */
    public static final class C60977ai extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138474a;

        static {
            Covode.recordClassIndex(71568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60977ai(AbstractC12748a aVar) {
            super(0);
            this.f138474a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f138474a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$az */
    public static final class C60994az extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138487a;

        static {
            Covode.recordClassIndex(71585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60994az(AbstractC12748a aVar) {
            super(0);
            this.f138487a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f138487a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bb */
    public static final class C60997bb extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138489a;

        static {
            Covode.recordClassIndex(71588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60997bb(AbstractC12748a aVar) {
            super(0);
            this.f138489a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f138489a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bf */
    static final class C61001bf implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C60967e f138492a;

        static {
            Covode.recordClassIndex(71592);
        }

        C61001bf(C60967e eVar) {
            this.f138492a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            this.f138492a.mo23378v().mo23337a(EnumC17699e.Next);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bt */
    public static final class C61017bt extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138508a;

        static {
            Covode.recordClassIndex(71608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61017bt(C60967e eVar) {
            super(0);
            this.f138508a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f138508a.mo23378v().mo98538l();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bu */
    static final class C61018bu extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138509a;

        static {
            Covode.recordClassIndex(71609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61018bu(C60967e eVar) {
            super(0);
            this.f138509a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f138509a.mo20528t().findViewById(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$k */
    public static final class C61028k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138517a;

        static {
            Covode.recordClassIndex(71619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61028k(AbstractC12748a aVar) {
            super(0);
            this.f138517a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f138517a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$m */
    public static final class C61030m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138518a;

        static {
            Covode.recordClassIndex(71621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61030m(AbstractC12748a aVar) {
            super(0);
            this.f138518a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f138518a.bD_().f30985g;
        }
    }

    /* renamed from: H */
    private static boolean m110534H() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.assem.list.cell.AbstractC60601b
    /* renamed from: C */
    public final C60526a mo98066C() {
        return new C60526a(mo23379w(), new C61001bf(this));
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

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$a */
    public static final class C60968a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f138466a;

        static {
            Covode.recordClassIndex(71559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60968a(AbstractC89277c cVar) {
            super(0);
            this.f138466a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f138466a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ah */
    public static final class C60976ah extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138473a;

        static {
            Covode.recordClassIndex(71567);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60976ah(AbstractC12748a aVar) {
            super(0);
            this.f138473a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138473a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$aj */
    public static final class C60978aj extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f138475a;

        static {
            Covode.recordClassIndex(71569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60978aj(AbstractC89277c cVar) {
            super(0);
            this.f138475a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f138475a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$am */
    public static final class C60981am extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138476a;

        static {
            Covode.recordClassIndex(71572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60981am(AbstractC12748a aVar) {
            super(0);
            this.f138476a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138476a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$an */
    public static final class C60982an extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138477a;

        static {
            Covode.recordClassIndex(71573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60982an(AbstractC12748a aVar) {
            super(0);
            this.f138477a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138477a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ao */
    public static final class C60983ao extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138478a;

        static {
            Covode.recordClassIndex(71574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60983ao(AbstractC12748a aVar) {
            super(0);
            this.f138478a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138478a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ap */
    public static final class C60984ap extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138479a;

        static {
            Covode.recordClassIndex(71575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60984ap(AbstractC12748a aVar) {
            super(0);
            this.f138479a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138479a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ar */
    public static final class C60986ar extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138480a;

        static {
            Covode.recordClassIndex(71577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60986ar(AbstractC12748a aVar) {
            super(0);
            this.f138480a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138480a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$as */
    public static final class C60987as extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138481a;

        static {
            Covode.recordClassIndex(71578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60987as(AbstractC12748a aVar) {
            super(0);
            this.f138481a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138481a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$at */
    public static final class C60988at extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138482a;

        static {
            Covode.recordClassIndex(71579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60988at(AbstractC12748a aVar) {
            super(0);
            this.f138482a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138482a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$b */
    public static final class C60995b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138488a;

        static {
            Covode.recordClassIndex(71586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60995b(AbstractC12748a aVar) {
            super(0);
            this.f138488a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138488a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bc */
    public static final class C60998bc extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138490a;

        static {
            Covode.recordClassIndex(71589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60998bc(AbstractC12748a aVar) {
            super(0);
            this.f138490a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138490a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bd */
    public static final class C60999bd extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138491a;

        static {
            Covode.recordClassIndex(71590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60999bd(AbstractC12748a aVar) {
            super(0);
            this.f138491a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138491a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bv */
    static final class C61019bv extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138510a;

        static {
            Covode.recordClassIndex(71610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61019bv(C60967e eVar) {
            super(0);
            this.f138510a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f138510a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$c */
    public static final class C61020c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138511a;

        static {
            Covode.recordClassIndex(71611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61020c(AbstractC12748a aVar) {
            super(0);
            this.f138511a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138511a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$n */
    public static final class C61031n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f138519a;

        static {
            Covode.recordClassIndex(71622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61031n(AbstractC89277c cVar) {
            super(0);
            this.f138519a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f138519a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$q */
    public static final class C61034q extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138520a;

        static {
            Covode.recordClassIndex(71625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61034q(AbstractC12748a aVar) {
            super(0);
            this.f138520a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138520a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$r */
    public static final class C61035r extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138521a;

        static {
            Covode.recordClassIndex(71626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61035r(AbstractC12748a aVar) {
            super(0);
            this.f138521a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138521a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$t */
    public static final class C61037t extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138522a;

        static {
            Covode.recordClassIndex(71628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61037t(AbstractC12748a aVar) {
            super(0);
            this.f138522a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138522a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$u */
    public static final class C61038u extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138523a;

        static {
            Covode.recordClassIndex(71629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61038u(AbstractC12748a aVar) {
            super(0);
            this.f138523a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138523a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$x */
    public static final class C61041x extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138524a;

        static {
            Covode.recordClassIndex(71632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61041x(AbstractC12748a aVar) {
            super(0);
            this.f138524a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138524a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$y */
    public static final class C61042y extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138525a;

        static {
            Covode.recordClassIndex(71633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61042y(AbstractC12748a aVar) {
            super(0);
            this.f138525a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138525a);
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
        mo23378v().mo98538l();
        return true;
    }

    /* renamed from: G */
    public final void mo98569G() {
        mo98570y().setVisibility(0);
        mo98570y().setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C61017bt(this)));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$aa */
    public static final class C60969aa extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138467a;

        static {
            Covode.recordClassIndex(71560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60969aa(AbstractC12748a aVar) {
            super(0);
            this.f138467a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138467a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$ab */
    public static final class C60970ab extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138468a;

        static {
            Covode.recordClassIndex(71561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60970ab(AbstractC12748a aVar) {
            super(0);
            this.f138468a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138468a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$au */
    public static final class C60989au extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138483a;

        static {
            Covode.recordClassIndex(71580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60989au(AbstractC12748a aVar) {
            super(0);
            this.f138483a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138483a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$av */
    public static final class C60990av extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138484a;

        static {
            Covode.recordClassIndex(71581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60990av(AbstractC12748a aVar) {
            super(0);
            this.f138484a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138484a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$e */
    public static final class C61022e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138512a;

        static {
            Covode.recordClassIndex(71613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61022e(AbstractC12748a aVar) {
            super(0);
            this.f138512a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138512a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$f */
    public static final class C61023f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138513a;

        static {
            Covode.recordClassIndex(71614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61023f(AbstractC12748a aVar) {
            super(0);
            this.f138513a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138513a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bg */
    static final class C61002bg extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138493a;

        static {
            Covode.recordClassIndex(71593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61002bg(C60967e eVar) {
            super(0);
            this.f138493a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            PowerList powerList = (PowerList) this.f138493a.mo20528t().findViewById(R.id.doq);
            powerList.setItemAnimator(null);
            C60967e eVar = this.f138493a;
            RecyclerView.AbstractC1350a adapter = powerList.getAdapter();
            if (adapter != null) {
                PowerStub g = ((PowerAdapter) adapter).mo28058g();
                if (g != null) {
                    C17638b e = g.mo28103e();
                    if (!e.mo28105a().containsKey(C60967e.class)) {
                        e.mo28105a().put(C60967e.class, eVar);
                    } else {
                        throw new RuntimeException("already contains control type :" + C60967e.class);
                    }
                }
                powerList.mo28083a(MusicCell.class);
                return powerList;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    public C60967e() {
        C12814b bVar;
        C12814b bVar2;
        C12814b bVar3;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(MusicPlayViewModel.class);
        C60968a aVar = new C60968a(a);
        C61029l lVar = C61029l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C61040w.INSTANCE, new C60976ah(this), new C60986ar(this), C60996ba.INSTANCE, lVar, new C60998bc(this), new C60999bd(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C61000be.INSTANCE, new C60995b(this), new C61020c(this), C61021d.INSTANCE, lVar, new C61022e(this), new C61023f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C61024g.INSTANCE, new C61025h(this), new C61026i(this), new C61027j(this), lVar, new C61028k(this), new C61030m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f138462n = bVar;
        AbstractC12848i.C12852d dVar2 = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a2 = C89204ab.m154669a(LegacyCommunicateViewModel.class);
        C61031n nVar = new C61031n(a2);
        C61032o oVar = C61032o.INSTANCE;
        if (C89219l.m154714a(dVar2, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, nVar, C61033p.INSTANCE, new C61034q(this), new C61035r(this), C61036s.INSTANCE, oVar, new C61037t(this), new C61038u(this));
        } else if (C89219l.m154714a(dVar2, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, nVar, C61039v.INSTANCE, new C61041x(this), new C61042y(this), C61043z.INSTANCE, oVar, new C60969aa(this), new C60970ab(this));
        } else if (dVar2 == null || C89219l.m154714a(dVar2, AbstractC12848i.C12850b.f31276a)) {
            bVar2 = new C12814b(a2, nVar, C60971ac.INSTANCE, new C60972ad(this), new C60973ae(this), new C60974af(this), oVar, new C60975ag(this), new C60977ai(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f138463o = bVar2;
        this.f138459k = true;
        this.f138460l = true;
        AbstractC12848i.C12852d dVar3 = AbstractC12848i.C12852d.f31278a;
        C61019bv bvVar = new C61019bv(this);
        AbstractC89277c a3 = C89204ab.m154669a(SearchMusicListViewModel.class);
        C60978aj ajVar = new C60978aj(a3);
        C60979ak akVar = C60979ak.INSTANCE;
        if (C89219l.m154714a(dVar3, AbstractC12848i.C12849a.f31275a)) {
            bVar3 = new C12814b(a3, ajVar, C60980al.INSTANCE, new C60981am(this), new C60982an(this), bvVar, akVar, new C60983ao(this), new C60984ap(this));
        } else if (C89219l.m154714a(dVar3, AbstractC12848i.C12852d.f31278a)) {
            bVar3 = new C12814b(a3, ajVar, C60985aq.INSTANCE, new C60987as(this), new C60988at(this), bvVar, akVar, new C60989au(this), new C60990av(this));
        } else if (dVar3 == null || C89219l.m154714a(dVar3, AbstractC12848i.C12850b.f31276a)) {
            bVar3 = new C12814b(a3, ajVar, C60991aw.INSTANCE, new C60992ax(this), new C60993ay(this), bvVar, akVar, new C60994az(this), new C60997bb(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f138464p = bVar3;
        this.f138465q = C89250i.m154773a((AbstractC89171a) new C61002bg(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bm */
    static final class C61009bm extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138500a;

        static {
            Covode.recordClassIndex(71600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61009bm(C60967e eVar) {
            super(1);
            this.f138500a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f138500a.f138458j = bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bi */
    static final class C61004bi extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138495a;

        static {
            Covode.recordClassIndex(71595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61004bi(C60967e eVar) {
            super(1);
            this.f138495a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f138495a.mo98569G();
            this.f138495a.mo23379w().setVisibility(8);
            this.f138495a.f138459k = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bl */
    static final class C61008bl extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138499a;

        static {
            Covode.recordClassIndex(71599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61008bl(C60967e eVar) {
            super(1);
            this.f138499a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            T t;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || !t.booleanValue())) {
                this.f138499a.mo98067D();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bj */
    static final class C61005bj extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138496a;

        static {
            Covode.recordClassIndex(71596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61005bj(C60967e eVar) {
            super(1);
            this.f138496a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            this.f138496a.f138459k = false;
            this.f138496a.mo98571z().mo98128a(true);
            C60967e.m22977a(this.f138496a.mo23378v(), new AbstractC89172b<C60622s, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.music.search.C60967e.C61005bj.C610061 */

                /* renamed from: a */
                final /* synthetic */ C61005bj f138497a;

                static {
                    Covode.recordClassIndex(71597);
                }

                {
                    this.f138497a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C60622s sVar) {
                    boolean z;
                    C60622s sVar2 = sVar;
                    C89219l.m154721d(sVar2, "");
                    List b = AbstractC14527i.C14528a.m26537b(sVar2);
                    if (b == null || b.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (this.f138497a.f138496a.mo23378v().f138348l.length() > 0) {
                            this.f138497a.f138496a.mo98570y().setVisibility(0);
                            this.f138497a.f138496a.mo98570y().setStatus(C79440a.m138170b(new TuxStatusView.C23263c()));
                        }
                        this.f138497a.f138496a.mo23379w().setVisibility(8);
                    } else {
                        this.f138497a.f138496a.mo98570y().setVisibility(8);
                        this.f138497a.f138496a.mo23379w().setVisibility(0);
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
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        C80330da.C80331a.m139266a("origin_music_new_fragment").mo123698a(mo23379w());
        az_();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        mo23379w().setLayoutManager(wrapLinearLayoutManager);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C61045g.f138528a, C12856l.m23100a(), new C61010bn(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C61051m.f138534a, C12856l.m23100a(), new C61013bq(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C61052n.f138535a, C12856l.m23100a(), C61015br.f138506a, 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C61053o.f138536a, (C12854k) null, new C61016bs(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C61054p.f138537a, C12856l.m23100a(), new C61003bh(this), 4);
        AssemViewModel.m23030a(mo23378v(), C61046h.f138529a, null, new C61004bi(this), new C61007bk(this), new C61005bj(this), 2);
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC60416h.class), C61047i.f138530a, new C61008bl(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC60416h.class), C61048j.f138531a, new C61009bm(this));
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m110534H();
        }
        if (!C58029j.f132256h) {
            new C23144b(view).mo37640e(R.string.dcq);
        } else if (mo98567A().f137515l) {
            mo23378v().mo98538l();
        }
        AbstractC12818f.C12819a.m23063a(this, mo98567A(), C61049k.f138532a, C12856l.m23100a(), C61011bo.f138502a, 4);
        AbstractC12818f.C12819a.m23063a(this, mo98567A(), C61050l.f138533a, C12856l.m23100a(), new C61012bp(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bo */
    static final class C61011bo extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Object>, C89391z> {

        /* renamed from: a */
        public static final C61011bo f138502a = new C61011bo();

        static {
            Covode.recordClassIndex(71602);
        }

        C61011bo() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Object> aVar) {
            C89219l.m154721d(pVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bh */
    static final class C61003bh extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138494a;

        static {
            Covode.recordClassIndex(71594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61003bh(C60967e eVar) {
            super(2);
            this.f138494a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Object> aVar) {
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar, "");
            this.f138494a.mo98569G();
            this.f138494a.mo23379w().setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bp */
    static final class C61012bp extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138503a;

        static {
            Covode.recordClassIndex(71603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61012bp(C60967e eVar) {
            super(2);
            this.f138503a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Object> aVar) {
            C89219l.m154721d(pVar, "");
            AbstractC63985aq.AbstractC63987b bVar = this.f138503a.mo98567A().f137513j;
            if (bVar != null && this.f138503a.f138459k) {
                bVar.mo103569a();
            }
            this.f138503a.f138459k = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bs */
    static final class C61016bs extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138507a;

        static {
            Covode.recordClassIndex(71607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61016bs(C60967e eVar) {
            super(2);
            this.f138507a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(pVar, "");
            this.f138507a.f138460l = booleanValue;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bn */
    static final class C61010bn extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, List<? extends C60603d>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138501a;

        static {
            Covode.recordClassIndex(71601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61010bn(C60967e eVar) {
            super(2);
            this.f138501a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, List<? extends C60603d> list) {
            AbstractC63985aq.AbstractC63987b bVar;
            List<? extends C60603d> list2 = list;
            C89219l.m154721d(pVar, "");
            this.f138501a.mo98571z().mo98134k();
            if (list2 == null || list2.isEmpty()) {
                if (this.f138501a.f138459k && (bVar = this.f138501a.mo98567A().f137513j) != null) {
                    bVar.mo103569a();
                }
                this.f138501a.f138459k = false;
            } else {
                this.f138501a.mo23379w().setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$bq */
    static final class C61013bq extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60967e f138504a;

        static {
            Covode.recordClassIndex(71604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61013bq(C60967e eVar) {
            super(2);
            this.f138504a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Integer> aVar) {
            AbstractC12766p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            C89219l.m154721d(aVar, "");
            if (pVar2.f31048h) {
                this.f138504a.mo23379w().postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.music.search.C60967e.C61013bq.RunnableC610141 */

                    /* renamed from: a */
                    final /* synthetic */ C61013bq f138505a;

                    static {
                        Covode.recordClassIndex(71605);
                    }

                    {
                        this.f138505a = r1;
                    }

                    public final void run() {
                        this.f138505a.f138504a.mo23379w().mo4413b(0);
                    }
                }, 50);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$br */
    static final class C61015br extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends C60837p>, C89391z> {

        /* renamed from: a */
        public static final C61015br f138506a = new C61015br();

        static {
            Covode.recordClassIndex(71606);
        }

        C61015br() {
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
                    int i = C61044f.f138526a[t.f138252b.ordinal()];
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
                    int i2 = C61044f.f138527b[t.f138252b.ordinal()];
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
