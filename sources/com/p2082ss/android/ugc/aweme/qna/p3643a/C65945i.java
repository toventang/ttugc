package com.p2082ss.android.ugc.aweme.qna.p3643a;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.qna.C66015b;
import com.p2082ss.android.ugc.aweme.qna.api.C66006c;
import com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a;
import com.p2082ss.android.ugc.aweme.qna.fragment.C66106g;
import com.p2082ss.android.ugc.aweme.qna.fragment.C66158m;
import com.p2082ss.android.ugc.aweme.qna.p3644b.C66017b;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66360f;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66361g;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66362h;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.EnumC66359e;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaCreationViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaSelectedPageViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.qna.a.i */
public final class C65945i extends AbstractC12769a {

    /* renamed from: j */
    public static final C65968av f148515j = new C65968av((byte) 0);

    /* renamed from: k */
    private final C12786i f148516k = new C12786i(bW_(), new C65961ao(this, null));

    /* renamed from: l */
    private final C12814b f148517l;

    /* renamed from: m */
    private final C12814b f148518m;

    /* renamed from: n */
    private final C12642a f148519n;

    /* renamed from: o */
    private Activity f148520o;

    /* renamed from: p */
    private Resources f148521p;

    /* renamed from: q */
    private DmtTabLayout f148522q;

    /* renamed from: r */
    private Integer f148523r;

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ap */
    public static final class C65962ap extends AbstractC89220m implements AbstractC89172b<C66361g, C66361g> {
        public static final C65962ap INSTANCE = new C65962ap();

        static {
            Covode.recordClassIndex(77467);
        }

        public C65962ap() {
            super(1);
        }

        public final C66361g invoke(C66361g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$l */
    public static final class C65984l extends AbstractC89220m implements AbstractC89172b<C66360f, C66360f> {
        public static final C65984l INSTANCE = new C65984l();

        static {
            Covode.recordClassIndex(77489);
        }

        public C65984l() {
            super(1);
        }

        public final C66360f invoke(C66360f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$o */
    public static final class C65987o extends AbstractC89220m implements AbstractC89172b<C66362h, C66362h> {
        public static final C65987o INSTANCE = new C65987o();

        static {
            Covode.recordClassIndex(77492);
        }

        public C65987o() {
            super(1);
        }

        public final C66362h invoke(C66362h hVar) {
            C89219l.m154719c(hVar, "");
            return hVar;
        }
    }

    static {
        Covode.recordClassIndex(77450);
    }

    /* renamed from: w */
    private final QnaBannerViewModel m117815w() {
        return (QnaBannerViewModel) this.f148517l.getValue();
    }

    /* renamed from: x */
    private final QnaSelectedPageViewModel m117816x() {
        return (QnaSelectedPageViewModel) this.f148518m.getValue();
    }

    /* renamed from: v */
    public final C66006c mo105033v() {
        return (C66006c) this.f148516k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ad */
    public static final class C65950ad extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148527a;

        static {
            Covode.recordClassIndex(77455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65950ad(AbstractC12748a aVar) {
            super(0);
            this.f148527a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f148527a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$at */
    public static final class C65966at extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f148540a;

        static {
            Covode.recordClassIndex(77471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65966at(AbstractC1204m mVar) {
            super(0);
            this.f148540a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f148540a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$av */
    public static final class C65968av {
        static {
            Covode.recordClassIndex(77473);
        }

        private C65968av() {
        }

        public /* synthetic */ C65968av(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$h */
    public static final class C65980h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148566a;

        static {
            Covode.recordClassIndex(77485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65980h(AbstractC12748a aVar) {
            super(0);
            this.f148566a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f148566a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ac */
    public static final class C65949ac extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C65949ac INSTANCE = new C65949ac();

        static {
            Covode.recordClassIndex(77454);
        }

        public C65949ac() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ae */
    public static final class C65951ae extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148528a;

        static {
            Covode.recordClassIndex(77456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65951ae(AbstractC12748a aVar) {
            super(0);
            this.f148528a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f148528a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$af */
    public static final class C65952af extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148529a;

        static {
            Covode.recordClassIndex(77457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65952af(AbstractC12748a aVar) {
            super(0);
            this.f148529a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f148529a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ak */
    public static final class C65957ak extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65957ak INSTANCE = new C65957ak();

        static {
            Covode.recordClassIndex(77462);
        }

        public C65957ak() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$an */
    public static final class C65960an extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65960an INSTANCE = new C65960an();

        static {
            Covode.recordClassIndex(77465);
        }

        public C65960an() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$as */
    public static final class C65965as extends AbstractC89220m implements AbstractC89171a<C12874b<C66361g>> {
        public static final C65965as INSTANCE = new C65965as();

        static {
            Covode.recordClassIndex(77470);
        }

        public C65965as() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66361g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$au */
    public static final class C65967au extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65967au INSTANCE = new C65967au();

        static {
            Covode.recordClassIndex(77472);
        }

        public C65967au() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$d */
    public static final class C65976d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65976d INSTANCE = new C65976d();

        static {
            Covode.recordClassIndex(77481);
        }

        public C65976d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$g */
    public static final class C65979g extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65979g INSTANCE = new C65979g();

        static {
            Covode.recordClassIndex(77484);
        }

        public C65979g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$i */
    public static final class C65981i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148567a;

        static {
            Covode.recordClassIndex(77486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65981i(AbstractC12748a aVar) {
            super(0);
            this.f148567a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f148567a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$j */
    public static final class C65982j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148568a;

        static {
            Covode.recordClassIndex(77487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65982j(AbstractC12748a aVar) {
            super(0);
            this.f148568a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f148568a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$p */
    public static final class C65988p extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C65988p INSTANCE = new C65988p();

        static {
            Covode.recordClassIndex(77493);
        }

        public C65988p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$s */
    public static final class C65991s extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65991s INSTANCE = new C65991s();

        static {
            Covode.recordClassIndex(77496);
        }

        public C65991s() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$v */
    public static final class C65994v extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C65994v INSTANCE = new C65994v();

        static {
            Covode.recordClassIndex(77499);
        }

        public C65994v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$w */
    public static final class C65995w extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65995w INSTANCE = new C65995w();

        static {
            Covode.recordClassIndex(77500);
        }

        public C65995w() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$z */
    public static final class C65998z extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65998z INSTANCE = new C65998z();

        static {
            Covode.recordClassIndex(77503);
        }

        public C65998z() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ag */
    public static final class C65953ag extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148530a;

        static {
            Covode.recordClassIndex(77458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65953ag(AbstractC12748a aVar) {
            super(0);
            this.f148530a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f148530a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ai */
    public static final class C65955ai extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148532a;

        static {
            Covode.recordClassIndex(77460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65955ai(AbstractC12748a aVar) {
            super(0);
            this.f148532a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f148532a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$k */
    public static final class C65983k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148569a;

        static {
            Covode.recordClassIndex(77488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65983k(AbstractC12748a aVar) {
            super(0);
            this.f148569a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f148569a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$m */
    public static final class C65985m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148570a;

        static {
            Covode.recordClassIndex(77490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65985m(AbstractC12748a aVar) {
            super(0);
            this.f148570a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f148570a.bD_().f30985g;
        }
    }

    @Override // com.bytedance.assem.arch.p797d.AbstractC12769a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: u */
    public final void mo20631u() {
        super.mo20631u();
        C24182c.m45841a(az_(), null);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$a */
    public static final class C65946a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148524a;

        static {
            Covode.recordClassIndex(77451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65946a(AbstractC89277c cVar) {
            super(0);
            this.f148524a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148524a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ah */
    public static final class C65954ah extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148531a;

        static {
            Covode.recordClassIndex(77459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65954ah(AbstractC12748a aVar) {
            super(0);
            this.f148531a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148531a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$aj */
    public static final class C65956aj extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148533a;

        static {
            Covode.recordClassIndex(77461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65956aj(AbstractC12748a aVar) {
            super(0);
            this.f148533a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148533a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$al */
    public static final class C65958al extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148534a;

        static {
            Covode.recordClassIndex(77463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65958al(AbstractC12748a aVar) {
            super(0);
            this.f148534a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148534a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$am */
    public static final class C65959am extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148535a;

        static {
            Covode.recordClassIndex(77464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65959am(AbstractC12748a aVar) {
            super(0);
            this.f148535a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148535a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ao */
    public static final class C65961ao extends AbstractC89220m implements AbstractC89171a<C66006c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148536a;

        /* renamed from: b */
        final /* synthetic */ String f148537b;

        static {
            Covode.recordClassIndex(77466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65961ao(AbstractC12748a aVar, String str) {
            super(0);
            this.f148536a = aVar;
            this.f148537b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.qna.api.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.qna.api.C66006c invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f148536a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.qna.api.c> r1 = com.p2082ss.android.ugc.aweme.qna.api.C66006c.class
                java.lang.String r0 = r3.f148537b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qna.p3643a.C65945i.C65961ao.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$aq */
    public static final class C65963aq extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148538a;

        static {
            Covode.recordClassIndex(77468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65963aq(AbstractC12748a aVar) {
            super(0);
            this.f148538a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148538a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ar */
    public static final class C65964ar extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148539a;

        static {
            Covode.recordClassIndex(77469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65964ar(AbstractC12748a aVar) {
            super(0);
            this.f148539a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148539a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$b */
    public static final class C65973b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148557a;

        static {
            Covode.recordClassIndex(77478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65973b(AbstractC12748a aVar) {
            super(0);
            this.f148557a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148557a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$c */
    public static final class C65975c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148563a;

        static {
            Covode.recordClassIndex(77480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65975c(AbstractC12748a aVar) {
            super(0);
            this.f148563a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148563a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$n */
    public static final class C65986n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148571a;

        static {
            Covode.recordClassIndex(77491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65986n(AbstractC89277c cVar) {
            super(0);
            this.f148571a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148571a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$q */
    public static final class C65989q extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148572a;

        static {
            Covode.recordClassIndex(77494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65989q(AbstractC12748a aVar) {
            super(0);
            this.f148572a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148572a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$r */
    public static final class C65990r extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148573a;

        static {
            Covode.recordClassIndex(77495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65990r(AbstractC12748a aVar) {
            super(0);
            this.f148573a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148573a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$t */
    public static final class C65992t extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148574a;

        static {
            Covode.recordClassIndex(77497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65992t(AbstractC12748a aVar) {
            super(0);
            this.f148574a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148574a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$u */
    public static final class C65993u extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148575a;

        static {
            Covode.recordClassIndex(77498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65993u(AbstractC12748a aVar) {
            super(0);
            this.f148575a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148575a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$x */
    public static final class C65996x extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148576a;

        static {
            Covode.recordClassIndex(77501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65996x(AbstractC12748a aVar) {
            super(0);
            this.f148576a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148576a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$y */
    public static final class C65997y extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148577a;

        static {
            Covode.recordClassIndex(77502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65997y(AbstractC12748a aVar) {
            super(0);
            this.f148577a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148577a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$aa */
    public static final class C65947aa extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148525a;

        static {
            Covode.recordClassIndex(77452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65947aa(AbstractC12748a aVar) {
            super(0);
            this.f148525a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148525a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ab */
    public static final class C65948ab extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148526a;

        static {
            Covode.recordClassIndex(77453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65948ab(AbstractC12748a aVar) {
            super(0);
            this.f148526a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148526a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$e */
    public static final class C65977e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148564a;

        static {
            Covode.recordClassIndex(77482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65977e(AbstractC12748a aVar) {
            super(0);
            this.f148564a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148564a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$f */
    public static final class C65978f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148565a;

        static {
            Covode.recordClassIndex(77483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65978f(AbstractC12748a aVar) {
            super(0);
            this.f148565a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148565a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C65945i() {
        C12814b bVar;
        C12814b bVar2;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(QnaBannerViewModel.class);
        C65946a aVar2 = new C65946a(a);
        C65984l lVar = C65984l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C65995w.INSTANCE, new C65954ah(this), new C65956aj(this), C65957ak.INSTANCE, lVar, new C65958al(this), new C65959am(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C65960an.INSTANCE, new C65973b(this), new C65975c(this), C65976d.INSTANCE, lVar, new C65977e(this), new C65978f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C65979g.INSTANCE, new C65980h(this), new C65981i(this), new C65982j(this), lVar, new C65983k(this), new C65985m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f148517l = bVar;
        AbstractC12848i.C12849a aVar3 = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a2 = C89204ab.m154669a(QnaSelectedPageViewModel.class);
        C65986n nVar = new C65986n(a2);
        C65987o oVar = C65987o.INSTANCE;
        if (C89219l.m154714a(aVar3, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, nVar, C65988p.INSTANCE, new C65989q(this), new C65990r(this), C65991s.INSTANCE, oVar, new C65992t(this), new C65993u(this));
        } else if (C89219l.m154714a(aVar3, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, nVar, C65994v.INSTANCE, new C65996x(this), new C65997y(this), C65998z.INSTANCE, oVar, new C65947aa(this), new C65948ab(this));
        } else if (aVar3 == null || C89219l.m154714a(aVar3, AbstractC12848i.C12850b.f31276a)) {
            bVar2 = new C12814b(a2, nVar, C65949ac.INSTANCE, new C65950ad(this), new C65951ae(this), new C65952af(this), oVar, new C65953ag(this), new C65955ai(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f148518m = bVar2;
        this.f148519n = new C12642a(C89204ab.m154669a(QnaCreationViewModel.class), null, C65965as.INSTANCE, new C65966at(this), C65967au.INSTANCE, C65962ap.INSTANCE, new C65963aq(this), new C65964ar(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$aw */
    static final class View$OnClickListenerC65969aw implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f148541a;

        /* renamed from: b */
        final /* synthetic */ DmtTabLayout.C17294f f148542b;

        /* renamed from: c */
        final /* synthetic */ C65945i f148543c;

        /* renamed from: d */
        final /* synthetic */ View f148544d;

        /* renamed from: e */
        final /* synthetic */ C66015b f148545e;

        static {
            Covode.recordClassIndex(77474);
        }

        View$OnClickListenerC65969aw(int i, DmtTabLayout.C17294f fVar, C65945i iVar, View view, C66015b bVar) {
            this.f148541a = i;
            this.f148542b = fVar;
            this.f148543c = iVar;
            this.f148544d = view;
            this.f148545e = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f148545e.f148631a = this.f148541a;
            this.f148542b.mo27592a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ax */
    public static final class C65970ax implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C65945i f148546a;

        /* renamed from: b */
        final /* synthetic */ View f148547b;

        /* renamed from: c */
        final /* synthetic */ C66015b f148548c;

        static {
            Covode.recordClassIndex(77475);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            String str;
            String d = this.f148548c.mo105076b(i).mo105141d();
            if (d != null) {
                boolean a = C66017b.m117828a(this.f148546a.mo105033v().f148594c);
                C89219l.m154721d(d, "");
                C33744d dVar = new C33744d();
                if (a) {
                    str = "qa_personal_profile";
                } else {
                    str = "qa_others_profile";
                }
                C39162r.m79460a("change_qa_profile_tab", dVar.mo59983a("enter_from", str).mo59983a("tab_name", d).f79943a);
            }
            this.f148546a.mo105031a(this.f148548c, i);
        }

        C65970ax(C65945i iVar, View view, C66015b bVar) {
            this.f148546a = iVar;
            this.f148547b = view;
            this.f148548c = bVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20630b(android.view.View r20) {
        /*
        // Method dump skipped, instructions count: 601
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qna.p3643a.C65945i.mo20630b(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo105031a(C66015b bVar, int i) {
        m117816x().mo105258a(bVar.mo105076b(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ay */
    static final class C65971ay extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148549a;

        /* renamed from: b */
        final /* synthetic */ C65945i f148550b;

        /* renamed from: c */
        final /* synthetic */ View f148551c;

        /* renamed from: d */
        final /* synthetic */ C66015b f148552d;

        static {
            Covode.recordClassIndex(77476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65971ay(C66106g gVar, C65945i iVar, View view, C66015b bVar) {
            super(2);
            this.f148549a = gVar;
            this.f148550b = iVar;
            this.f148551c = view;
            this.f148552d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Long l) {
            Long l2 = l;
            C89219l.m154721d(pVar, "");
            if (l2 != null) {
                this.f148550b.mo105032a(this.f148549a, l2.longValue(), this.f148552d);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$az */
    static final class C65972az extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148553a;

        /* renamed from: b */
        final /* synthetic */ C65945i f148554b;

        /* renamed from: c */
        final /* synthetic */ View f148555c;

        /* renamed from: d */
        final /* synthetic */ C66015b f148556d;

        static {
            Covode.recordClassIndex(77477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65972az(C66158m mVar, C65945i iVar, View view, C66015b bVar) {
            super(2);
            this.f148553a = mVar;
            this.f148554b = iVar;
            this.f148555c = view;
            this.f148556d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Long l) {
            Long l2 = l;
            C89219l.m154721d(pVar, "");
            if (l2 != null) {
                this.f148554b.mo105032a(this.f148553a, l2.longValue(), this.f148556d);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$ba */
    static final class C65974ba extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, EnumC66359e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f148558a;

        /* renamed from: b */
        final /* synthetic */ ViewPager f148559b;

        /* renamed from: c */
        final /* synthetic */ C65945i f148560c;

        /* renamed from: d */
        final /* synthetic */ View f148561d;

        /* renamed from: e */
        final /* synthetic */ C66015b f148562e;

        static {
            Covode.recordClassIndex(77479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65974ba(int i, ViewPager viewPager, C65945i iVar, View view, C66015b bVar) {
            super(2);
            this.f148558a = i;
            this.f148559b = viewPager;
            this.f148560c = iVar;
            this.f148561d = view;
            this.f148562e = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, EnumC66359e eVar) {
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(eVar, "");
            if (eVar == EnumC66359e.PUBLISH_SUCCEED) {
                this.f148559b.setCurrentItem(this.f148558a, true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo105032a(AbstractC66098a aVar, long j, C66015b bVar) {
        String string;
        View view;
        TuxTextView tuxTextView;
        String string2;
        View view2;
        TuxTextView tuxTextView2;
        int count = bVar.getCount();
        for (int i = 0; i < count; i++) {
            DmtTabLayout dmtTabLayout = this.f148522q;
            if (dmtTabLayout == null) {
                C89219l.m154710a("tabLayout");
            }
            DmtTabLayout.C17294f b = dmtTabLayout.mo27529b(i);
            bVar.mo3649a(i);
            Fragment a = bVar.mo3649a(i);
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment");
            String d = ((AbstractC66098a) a).mo105141d();
            String d2 = aVar.mo105141d();
            if (C89219l.m154714a((Object) d, (Object) d2)) {
                if (d2 != null) {
                    int hashCode = d2.hashCode();
                    if (hashCode != -1782234803) {
                        if (hashCode == -847398795 && d2.equals("answers")) {
                            if (j == 1000) {
                                Resources resources = this.f148521p;
                                if (resources == null) {
                                    C89219l.m154710a("resources");
                                }
                                string2 = resources.getString(R.string.f1l);
                            } else if (j > 1000) {
                                Resources resources2 = this.f148521p;
                                if (resources2 == null) {
                                    C89219l.m154710a("resources");
                                }
                                string2 = resources2.getString(R.string.f1m);
                            } else {
                                Resources resources3 = this.f148521p;
                                if (resources3 == null) {
                                    C89219l.m154710a("resources");
                                }
                                string2 = resources3.getString(R.string.f1n, C53437b.m98615a(j));
                            }
                            C89219l.m154716b(string2, "");
                            if (!(b == null || (view2 = b.f41525f) == null || (tuxTextView2 = (TuxTextView) view2.findViewById(R.id.eed)) == null)) {
                                tuxTextView2.setText(string2);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (d2.equals("questions")) {
                        if (j == 1000) {
                            Resources resources4 = this.f148521p;
                            if (resources4 == null) {
                                C89219l.m154710a("resources");
                            }
                            string = resources4.getString(R.string.f1p);
                        } else if (j > 1000) {
                            Resources resources5 = this.f148521p;
                            if (resources5 == null) {
                                C89219l.m154710a("resources");
                            }
                            string = resources5.getString(R.string.f1q);
                        } else {
                            Resources resources6 = this.f148521p;
                            if (resources6 == null) {
                                C89219l.m154710a("resources");
                            }
                            string = resources6.getString(R.string.f1o, C53437b.m98615a(j));
                        }
                        C89219l.m154716b(string, "");
                        if (!(b == null || (view = b.f41525f) == null || (tuxTextView = (TuxTextView) view.findViewById(R.id.eed)) == null)) {
                            tuxTextView.setText(string);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
