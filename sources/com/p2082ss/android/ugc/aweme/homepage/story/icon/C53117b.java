package com.p2082ss.android.ugc.aweme.homepage.story.icon;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.C0576b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.C53110d;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.p2082ss.android.ugc.aweme.homepage.story.p3054c.C53031b;
import com.p2082ss.android.ugc.aweme.homepage.story.sidebar.C53297m;
import com.p2082ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.services.story.event.StoryPublishEvent;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76546f;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76592b;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76675c;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76679e;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a;
import com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d;
import com.p2082ss.android.ugc.aweme.story.publish.C77428e;
import com.p2082ss.android.ugc.aweme.story.publish.C77444g;
import com.p2082ss.android.ugc.aweme.story.publish.EnumC77446i;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79476b;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b */
public final class C53117b extends AbstractC12769a implements AbstractC76546f, AbstractC90252i, AbstractC90253j {

    /* renamed from: m */
    public static final C53127ai f122147m = new C53127ai((byte) 0);

    /* renamed from: j */
    public int f122148j;

    /* renamed from: k */
    Aweme f122149k;

    /* renamed from: l */
    final C12642a f122150l;

    /* renamed from: n */
    private final C12814b f122151n;

    /* renamed from: o */
    private final AbstractC89244h f122152o;

    /* renamed from: p */
    private final C12814b f122153p;

    /* renamed from: q */
    private final AbstractC77389a f122154q;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ac */
    public static final class C53121ac extends AbstractC89220m implements AbstractC89172b<C53297m, C53297m> {
        public static final C53121ac INSTANCE = new C53121ac();

        static {
            Covode.recordClassIndex(62669);
        }

        public C53121ac() {
            super(1);
        }

        public final C53297m invoke(C53297m mVar) {
            C89219l.m154719c(mVar, "");
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$av */
    static final class C53141av extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C53141av f122174a = new C53141av();

        static {
            Covode.recordClassIndex(62689);
        }

        C53141av() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_sidebar_list";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$l */
    public static final class C53152l extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {
        public static final C53152l INSTANCE = new C53152l();

        static {
            Covode.recordClassIndex(62700);
        }

        public C53152l() {
            super(1);
        }

        public final C53110d invoke(C53110d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$o */
    public static final class C53155o extends AbstractC89220m implements AbstractC89172b<C53173i, C53173i> {
        public static final C53155o INSTANCE = new C53155o();

        static {
            Covode.recordClassIndex(62703);
        }

        public C53155o() {
            super(1);
        }

        public final C53173i invoke(C53173i iVar) {
            C89219l.m154719c(iVar, "");
            return iVar;
        }
    }

    static {
        Covode.recordClassIndex(62665);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, new RunnableC90250g(C53117b.class, "onStoryPublishEventPost", StoryPublishEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(155, new RunnableC90250g(C53117b.class, "onShowSidebar", C76592b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: v */
    public final StorySidebarFeedVM mo89648v() {
        return (StorySidebarFeedVM) this.f122151n.getValue();
    }

    /* renamed from: w */
    public final DrawerViewModel mo89649w() {
        return (DrawerViewModel) this.f122152o.getValue();
    }

    /* renamed from: x */
    public final StoryIconVM mo89650x() {
        return (StoryIconVM) this.f122153p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ag */
    public static final class C53125ag extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f122159a;

        static {
            Covode.recordClassIndex(62673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53125ag(AbstractC1204m mVar) {
            super(0);
            this.f122159a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f122159a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ai */
    public static final class C53127ai {
        static {
            Covode.recordClassIndex(62675);
        }

        private C53127ai() {
        }

        public /* synthetic */ C53127ai(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$h */
    public static final class C53148h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122179a;

        static {
            Covode.recordClassIndex(62696);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53148h(AbstractC12748a aVar) {
            super(0);
            this.f122179a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f122179a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$q */
    public static final class C53157q extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122185a;

        static {
            Covode.recordClassIndex(62705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53157q(AbstractC12748a aVar) {
            super(0);
            this.f122185a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f122185a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ab */
    public static final class C53120ab extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53120ab INSTANCE = new C53120ab();

        static {
            Covode.recordClassIndex(62668);
        }

        public C53120ab() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$af */
    public static final class C53124af extends AbstractC89220m implements AbstractC89171a<C12874b<C53297m>> {
        public static final C53124af INSTANCE = new C53124af();

        static {
            Covode.recordClassIndex(62672);
        }

        public C53124af() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53297m> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ah */
    public static final class C53126ah extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53126ah INSTANCE = new C53126ah();

        static {
            Covode.recordClassIndex(62674);
        }

        public C53126ah() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$d */
    public static final class C53144d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53144d INSTANCE = new C53144d();

        static {
            Covode.recordClassIndex(62692);
        }

        public C53144d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$g */
    public static final class C53147g extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53147g INSTANCE = new C53147g();

        static {
            Covode.recordClassIndex(62695);
        }

        public C53147g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$i */
    public static final class C53149i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122180a;

        static {
            Covode.recordClassIndex(62697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53149i(AbstractC12748a aVar) {
            super(0);
            this.f122180a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f122180a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$j */
    public static final class C53150j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122181a;

        static {
            Covode.recordClassIndex(62698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53150j(AbstractC12748a aVar) {
            super(0);
            this.f122181a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f122181a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$p */
    public static final class C53156p extends AbstractC89220m implements AbstractC89171a<C12874b<C53173i>> {
        public static final C53156p INSTANCE = new C53156p();

        static {
            Covode.recordClassIndex(62704);
        }

        public C53156p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53173i> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$r */
    public static final class C53158r extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122186a;

        static {
            Covode.recordClassIndex(62706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53158r(AbstractC12748a aVar) {
            super(0);
            this.f122186a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f122186a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$s */
    public static final class C53159s extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122187a;

        static {
            Covode.recordClassIndex(62707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53159s(AbstractC12748a aVar) {
            super(0);
            this.f122187a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f122187a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$v */
    public static final class C53162v extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53162v INSTANCE = new C53162v();

        static {
            Covode.recordClassIndex(62710);
        }

        public C53162v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$y */
    public static final class C53165y extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53165y INSTANCE = new C53165y();

        static {
            Covode.recordClassIndex(62713);
        }

        public C53165y() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76546f
    /* renamed from: A */
    public final AbstractC1204m mo89643A() {
        return C12777b.m23004b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$aj */
    static final class C53128aj extends AbstractC89220m implements AbstractC89171a<DrawerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122160a;

        static {
            Covode.recordClassIndex(62676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53128aj(C53117b bVar) {
            super(0);
            this.f122160a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DrawerViewModel invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122160a);
            if (b != null) {
                return DrawerViewModel.C53032a.m97961a(b);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$k */
    public static final class C53151k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122182a;

        static {
            Covode.recordClassIndex(62699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53151k(AbstractC12748a aVar) {
            super(0);
            this.f122182a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f122182a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$m */
    public static final class C53153m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122183a;

        static {
            Covode.recordClassIndex(62701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53153m(AbstractC12748a aVar) {
            super(0);
            this.f122183a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f122183a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$t */
    public static final class C53160t extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122188a;

        static {
            Covode.recordClassIndex(62708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53160t(AbstractC12748a aVar) {
            super(0);
            this.f122188a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f122188a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$u */
    public static final class C53161u extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122189a;

        static {
            Covode.recordClassIndex(62709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53161u(AbstractC12748a aVar) {
            super(0);
            this.f122189a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f122189a.bD_().f30985g;
        }
    }

    /* renamed from: y */
    public final void mo89651y() {
        m22977a(mo89648v(), new C53132an(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$a */
    public static final class C53118a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f122155a;

        static {
            Covode.recordClassIndex(62666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53118a(AbstractC89277c cVar) {
            super(0);
            this.f122155a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f122155a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$aa */
    public static final class C53119aa extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122156a;

        static {
            Covode.recordClassIndex(62667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53119aa(AbstractC12748a aVar) {
            super(0);
            this.f122156a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122156a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ad */
    public static final class C53122ad extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122157a;

        static {
            Covode.recordClassIndex(62670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53122ad(AbstractC12748a aVar) {
            super(0);
            this.f122157a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122157a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ae */
    public static final class C53123ae extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122158a;

        static {
            Covode.recordClassIndex(62671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53123ae(AbstractC12748a aVar) {
            super(0);
            this.f122158a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122158a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$b */
    public static final class C53142b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122175a;

        static {
            Covode.recordClassIndex(62690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53142b(AbstractC12748a aVar) {
            super(0);
            this.f122175a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122175a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$c */
    public static final class C53143c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122176a;

        static {
            Covode.recordClassIndex(62691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53143c(AbstractC12748a aVar) {
            super(0);
            this.f122176a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122176a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$n */
    public static final class C53154n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f122184a;

        static {
            Covode.recordClassIndex(62702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53154n(AbstractC89277c cVar) {
            super(0);
            this.f122184a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f122184a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$w */
    public static final class C53163w extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122190a;

        static {
            Covode.recordClassIndex(62711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53163w(AbstractC12748a aVar) {
            super(0);
            this.f122190a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122190a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$x */
    public static final class C53164x extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122191a;

        static {
            Covode.recordClassIndex(62712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53164x(AbstractC12748a aVar) {
            super(0);
            this.f122191a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122191a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$z */
    public static final class C53166z extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122192a;

        static {
            Covode.recordClassIndex(62714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53166z(AbstractC12748a aVar) {
            super(0);
            this.f122192a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122192a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C80298cg.m139204a(this);
        C53116a.f122145a.restoreScheduleInfoFromDraft(new C53129ak(this));
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        C80298cg.m139205b(this);
        AbstractC76504c d = C77260g.f173332a.mo120156d();
        if (d != null) {
            d.mo120230a(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$e */
    public static final class C53145e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122177a;

        static {
            Covode.recordClassIndex(62693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53145e(AbstractC12748a aVar) {
            super(0);
            this.f122177a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122177a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$f */
    public static final class C53146f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122178a;

        static {
            Covode.recordClassIndex(62694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53146f(AbstractC12748a aVar) {
            super(0);
            this.f122178a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122178a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: B */
    private final void m98155B() {
        this.f122148j = 0;
        TuxIconView tuxIconView = (TuxIconView) mo20528t().findViewById(R.id.bgi);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        StoryBrandView storyBrandView = (StoryBrandView) mo20528t().findViewById(R.id.bgx);
        C89219l.m154716b(storyBrandView, "");
        storyBrandView.setVisibility(4);
        AvatarImageView avatarImageView = (AvatarImageView) mo20528t().findViewById(R.id.bsr);
        C89219l.m154716b(avatarImageView, "");
        avatarImageView.setVisibility(4);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$al */
    static final class RunnableC53130al implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53117b f122162a;

        static {
            Covode.recordClassIndex(62678);
        }

        RunnableC53130al(C53117b bVar) {
            this.f122162a = bVar;
        }

        public final void run() {
            Aweme aweme;
            int indexOf;
            if (this.f122162a.mo89648v().mo23342g()) {
                StoryIconVM x = this.f122162a.mo89650x();
                List<Aweme> h = this.f122162a.mo89648v().mo23343h();
                C89219l.m154721d(h, "");
                if (C76675c.m134254b() && (aweme = x.f122138j) != null && (indexOf = h.indexOf(aweme)) > 0) {
                    int i = 0;
                    int i2 = 0;
                    do {
                        boolean b = StoryIconVM.m98148b(h.get(i));
                        boolean a = StoryIconVM.m98147a(h.get(i));
                        if (!b && !a) {
                            break;
                        }
                        i2++;
                        i++;
                    } while (i < indexOf);
                    if (i2 != indexOf) {
                        C89219l.m154721d(h, "");
                        if (i2 != indexOf && i2 < h.size()) {
                            h = C89070n.m154585g((Collection) h);
                            h.add(i2, h.remove(indexOf));
                        }
                        this.f122162a.mo89648v().mo89616a(h);
                    }
                }
            }
        }
    }

    public C53117b() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(StorySidebarFeedVM.class);
        C53118a aVar2 = new C53118a(a);
        C53152l lVar = C53152l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C53162v.INSTANCE, new C53163w(this), new C53164x(this), C53165y.INSTANCE, lVar, new C53166z(this), new C53119aa(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C53120ab.INSTANCE, new C53142b(this), new C53143c(this), C53144d.INSTANCE, lVar, new C53145e(this), new C53146f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C53147g.INSTANCE, new C53148h(this), new C53149i(this), new C53150j(this), lVar, new C53151k(this), new C53153m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f122151n = bVar;
        this.f122152o = C89250i.m154773a((AbstractC89171a) new C53128aj(this));
        AbstractC89277c a2 = C89204ab.m154669a(StoryIconVM.class);
        this.f122153p = new C12814b(a2, new C53154n(a2), C53156p.INSTANCE, new C53157q(this), new C53158r(this), new C53159s(this), C53155o.INSTANCE, new C53160t(this), new C53161u(this));
        this.f122154q = C77260g.f173332a.mo120158f();
        C53141av avVar = C53141av.f122174a;
        this.f122150l = new C12642a(C89204ab.m154669a(StorySidebarListVM.class), avVar, C53124af.INSTANCE, new C53125ag(this), C53126ah.INSTANCE, C53121ac.INSTANCE, new C53122ad(this), new C53123ae(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89652z() {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.icon.C53117b.mo89652z():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$am */
    public static final class C53131am implements AbstractC77426d {

        /* renamed from: a */
        final /* synthetic */ C53117b f122163a;

        static {
            Covode.recordClassIndex(62679);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89655a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89656a(float f) {
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89658a(EnumC77446i iVar) {
            C89219l.m154721d(iVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89660a(String str, C77428e eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(eVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53131am(C53117b bVar) {
            this.f122163a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89657a(int i) {
            int i2;
            if (i > 1) {
                i2 = R.string.h3s;
            } else {
                i2 = R.string.g5k;
            }
            ActivityC0945e b = C12777b.m23004b(this.f122163a);
            if (b != null) {
                new C23144b(b).mo37640e(i2).mo37637b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89659a(String str) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: b */
        public final void mo89661b(String str, C77428e eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(eVar, "");
            this.f122163a.mo89652z();
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: c */
        public final void mo89662c(String str, C77428e eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(eVar, "");
            AbstractC77426d.C77427a.m135370a(str, eVar);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onShowSidebar(C76592b bVar) {
        C89219l.m154721d(bVar, "");
        mo89645a(false, "click");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$an */
    public static final class C53132an extends AbstractC89220m implements AbstractC89172b<C53110d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122164a;

        static {
            Covode.recordClassIndex(62680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53132an(C53117b bVar) {
            super(1);
            this.f122164a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (dVar2.f122127a == 0 && dVar2.f122128b != 1) {
                this.f122164a.mo89652z();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ak */
    static final class C53129ak extends AbstractC89220m implements AbstractC89172b<List<? extends ScheduleInfo>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122161a;

        static {
            Covode.recordClassIndex(62677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53129ak(C53117b bVar) {
            super(1);
            this.f122161a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends ScheduleInfo> list) {
            List<? extends ScheduleInfo> list2 = list;
            C89219l.m154721d(list2, "");
            if (!list2.isEmpty()) {
                AbstractC77389a f = C77260g.f173332a.mo120158f();
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    C77444g gVar = new C77444g(it.next());
                    gVar.f173767b.mo121052a(EnumC77446i.FAILED);
                    arrayList.add(gVar);
                }
                f.mo120169a(C89070n.m154585g((Collection) arrayList));
                this.f122161a.mo89648v().mo89619b(false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m98156a(EnumC79475a aVar) {
        this.f122148j = 1;
        TuxIconView tuxIconView = (TuxIconView) mo20528t().findViewById(R.id.bgi);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        ((StoryBrandView) mo20528t().findViewById(R.id.bgx)).setMode(aVar);
        StoryBrandView storyBrandView = (StoryBrandView) mo20528t().findViewById(R.id.bgx);
        C89219l.m154716b(storyBrandView, "");
        storyBrandView.setVisibility(0);
        AvatarImageView avatarImageView = (AvatarImageView) mo20528t().findViewById(R.id.bsr);
        C89219l.m154716b(avatarImageView, "");
        avatarImageView.setVisibility(4);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        m98155B();
        mo20528t().setOnClickListener(new View$OnClickListenerC53140au(this));
        AbstractC12818f.C12819a.m23063a(this, mo89648v(), C53167c.f122193a, (C12854k) null, new C53134ap(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo89648v(), C53168d.f122194a, (C12854k) null, new C53136aq(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo89648v(), C53169e.f122195a, C12856l.m23100a(), new C53137ar(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo89648v(), C53170f.f122196a, (C12854k) null, new C53138as(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo89648v(), C53171g.f122197a, (C12854k) null, new C53133ao(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo89650x(), C53172h.f122198a, (C12854k) null, new C53139at(this), 6);
        this.f122154q.mo120167a("StoryIconAssem", new C53131am(this));
        View t = mo20528t();
        AbstractC76504c d = C77260g.f173332a.mo120156d();
        if (d != null) {
            d.mo120234a(this, "*");
        }
        ((StoryBrandView) t.findViewById(R.id.bgx)).setThemeType(EnumC79476b.CONST);
        StorySidebarFeedVM v = mo89648v();
        RunnableC53130al alVar = new RunnableC53130al(this);
        C89219l.m154721d(alVar, "");
        v.f122086p.add(alVar);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onStoryPublishEventPost(StoryPublishEvent storyPublishEvent) {
        ActivityC0945e b;
        C89219l.m154721d(storyPublishEvent, "");
        AbstractC77389a aVar = this.f122154q;
        List<ScheduleInfo> scheduleList = storyPublishEvent.getScheduleList();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) scheduleList, 10));
        Iterator<T> it = scheduleList.iterator();
        while (it.hasNext()) {
            arrayList.add(new C77444g(it.next()));
        }
        aVar.mo120169a(C89070n.m154585g((Collection) arrayList));
        if (storyPublishEvent.getSwitch2FeedTab() && (b = C12777b.m23004b(this)) != null) {
            String f = Hox.C15490a.m28529a(b).mo25219f(C34792be.f82124c);
            if (!(!C89219l.m154714a((Object) f, (Object) "page_feed"))) {
                String f2 = Hox.C15490a.m28529a(b).mo25219f(f);
                if (!C89219l.m154714a((Object) f, (Object) "HOME")) {
                    Hox a = Hox.C15490a.m28529a(b);
                    Bundle bundle = new Bundle();
                    bundle.putString(C34792be.f82123b, f2);
                    a.mo25211b("HOME", bundle);
                }
            }
        }
        mo89648v().mo89619b(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$au */
    static final class View$OnClickListenerC53140au implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53117b f122173a;

        static {
            Covode.recordClassIndex(62688);
        }

        View$OnClickListenerC53140au(C53117b bVar) {
            this.f122173a = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String requestId;
            ClickAgent.onClick(view);
            int i = this.f122173a.f122148j;
            if (i == 0) {
                DrawerViewModel w = this.f122173a.mo89649w();
                if (w != null) {
                    w.mo89466a(1, "click_upper_left_camera");
                }
            } else if (i != 2) {
                this.f122173a.mo89645a(false, "click");
            } else if (((Boolean) C76679e.f172091a.getValue()).booleanValue()) {
                C53117b bVar = this.f122173a;
                Activity topActivity = ActivityStack.getTopActivity();
                User user = null;
                if (!(topActivity instanceof ActivityC0218d)) {
                    topActivity = null;
                }
                ActivityC0218d dVar = (ActivityC0218d) topActivity;
                if (dVar == null || dVar.isFinishing()) {
                    return;
                }
                if (!C80422fe.m139425a(dVar)) {
                    new C23144b(dVar).mo37640e(R.string.dcq).mo37637b();
                    return;
                }
                ((StorySidebarListVM) bVar.f122150l.getValue()).mo89686a(bVar.mo89648v().f122083m.f122124a, bVar.mo89648v().mo23343h());
                SmartRoute buildRoute = SmartRouter.buildRoute(dVar, "aweme://story/detail");
                StoryBrandView storyBrandView = (StoryBrandView) bVar.mo20528t().findViewById(R.id.bgx);
                String str3 = "";
                C89219l.m154716b(storyBrandView, str3);
                C0576b b = C0576b.m2193b(storyBrandView, storyBrandView.getWidth(), storyBrandView.getHeight());
                C89219l.m154716b(b, str3);
                SmartRoute withParam = buildRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_SIDE_BAR").withParam("enter_from", "westwindow").withParam("previous_page", "westwindow");
                Aweme aweme = bVar.f122149k;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                withParam.withParam("id", str).withParam("story_req_id", bVar.mo89648v().f122083m.f122126c).withParam("impr_id", bVar.mo89648v().f122083m.f122126c).withBundleAnimation(b.mo2564a()).withParam("activity_has_activity_options", true).withParam("enter_play_method", "click_avatar_dot");
                buildRoute.open();
                HashMap hashMap = new HashMap();
                Aweme aweme2 = bVar.f122149k;
                if (aweme2 == null || (str2 = aweme2.getAuthorUid()) == null) {
                    str2 = str3;
                }
                hashMap.put("author_id", str2);
                Aweme aweme3 = bVar.f122149k;
                if (aweme3 != null) {
                    user = aweme3.getAuthor();
                }
                hashMap.put("follow_status", String.valueOf(C76598h.m134176a(user)));
                Aweme aweme4 = bVar.f122149k;
                if (!(aweme4 == null || (requestId = aweme4.getRequestId()) == null)) {
                    str3 = requestId;
                }
                hashMap.put("req_id", str3);
                hashMap.put("enter_method", "click_avatar_dot");
                hashMap.put("enter_from", "westwindow");
                C39162r.m79460a("story_click", hashMap);
            } else {
                this.f122173a.mo89645a(false, "click");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76546f
    /* renamed from: a */
    public final void mo89644a(String str, Aweme aweme) {
        C89219l.m154721d(str, "");
        mo89651y();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ao */
    static final class C53133ao extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122165a;

        static {
            Covode.recordClassIndex(62681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53133ao(C53117b bVar) {
            super(2);
            this.f122165a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2.f31085a.booleanValue()) {
                this.f122165a.mo89651y();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ap */
    static final class C53134ap extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122166a;

        static {
            Covode.recordClassIndex(62682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53134ap(C53117b bVar) {
            super(2);
            this.f122166a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
            final int intValue = num.intValue();
            C89219l.m154721d(pVar, "");
            AbstractC12766p.m22977a(this.f122166a.mo89648v(), new AbstractC89172b<C53110d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.homepage.story.icon.C53117b.C53134ap.C531351 */

                /* renamed from: a */
                final /* synthetic */ C53134ap f122167a;

                static {
                    Covode.recordClassIndex(62683);
                }

                {
                    this.f122167a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C53110d dVar) {
                    User author;
                    User author2;
                    long j;
                    C53110d dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    if ((intValue & 2) != 0 && dVar2.f122127a == 0) {
                        StoryIconVM x = this.f122167a.f122166a.mo89650x();
                        List<Aweme> h = this.f122167a.f122166a.mo89648v().mo23343h();
                        C89219l.m154721d(h, "");
                        if (C76675c.m134254b()) {
                            T t = null;
                            r3 = null;
                            String str = null;
                            long j2 = 0;
                            T t2 = null;
                            for (T t3 : h) {
                                UserStory userStory = t3.getUserStory();
                                if (userStory != null && !userStory.getAllViewed()) {
                                    User author3 = t3.getAuthor();
                                    if (!C53031b.m97957a(author3 != null ? author3.getUid() : null) && !StoryIconVM.m98147a((Aweme) t3)) {
                                        UserStory userStory2 = t3.getUserStory();
                                        if (userStory2 != null) {
                                            j = userStory2.getLastStoryCreatedAt();
                                        } else {
                                            j = 0;
                                        }
                                        if (j > j2) {
                                            t2 = t3;
                                            j2 = j;
                                        }
                                    }
                                }
                            }
                            if (!C89219l.m154714a((Object) x.f122139k, (Object) ((t2 == null || (author2 = t2.getAuthor()) == null) ? null : author2.getUid()))) {
                                if (!(t2 == null || (author = t2.getAuthor()) == null)) {
                                    str = author.getUid();
                                }
                                x.f122139k = str;
                                t = t2;
                            }
                            x.f122138j = t;
                        }
                        this.f122167a.f122166a.mo89652z();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$at */
    static final class C53139at extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122172a;

        static {
            Covode.recordClassIndex(62687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53139at(C53117b bVar) {
            super(2);
            this.f122172a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2.f31085a.booleanValue()) {
                this.f122172a.mo89651y();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo89645a(boolean z, String str) {
        int i;
        if (z) {
            i = 35;
        } else {
            i = 3;
        }
        DrawerViewModel w = mo89649w();
        if (w != null) {
            w.mo89466a(i, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$ar */
    static final class C53137ar extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122170a;

        static {
            Covode.recordClassIndex(62685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53137ar(C53117b bVar) {
            super(2);
            this.f122170a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends String> aVar) {
            C12776a<? extends String> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            T t = aVar2.f31085a;
            C77283a.m135111b("StoryIconAssem", "StoryIconAssem: openSidebarEvent, reason: ".concat(String.valueOf(t)));
            this.f122170a.mo89645a(true, (String) t);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$as */
    static final class C53138as extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122171a;

        static {
            Covode.recordClassIndex(62686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53138as(C53117b bVar) {
            super(2);
            this.f122171a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Boolean> aVar) {
            DrawerViewModel w;
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2.f31085a.booleanValue() && (w = this.f122171a.mo89649w()) != null) {
                w.mo89466a(4, "auto");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$aq */
    static final class C53136aq extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53117b f122169a;

        static {
            Covode.recordClassIndex(62684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53136aq(C53117b bVar) {
            super(2);
            this.f122169a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
            AbstractC12766p pVar2 = pVar;
            int intValue = num.intValue();
            C89219l.m154721d(pVar2, "");
            StoryIconVM x = this.f122169a.mo89650x();
            if (C76675c.m134254b()) {
                x.f122138j = null;
                x.mo23342g().mo142944a();
            }
            if (intValue == 0) {
                this.f122169a.mo89652z();
                pVar2.mo20528t().setVisibility(0);
            } else if (intValue == 1) {
                pVar2.mo20528t().setVisibility(4);
            }
            return C89391z.f203057a;
        }
    }
}
