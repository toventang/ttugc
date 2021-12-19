package com.p2082ss.android.ugc.aweme.homepage.story.p3052a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1213t;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.bytedance.p802b.p821e.C13036a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.compliance.api.p2638b.C39227a;
import com.p2082ss.android.ugc.aweme.feed.C48316ak;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49666aa;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.experiment.C52971b;
import com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53046d;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.C53110d;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76681f;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a */
public final class C52995a extends AbstractC12769a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: u */
    public static final C53023v f121863u = new C53023v((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f121864A;

    /* renamed from: j */
    public FrameLayout f121865j;

    /* renamed from: k */
    public ActivityC0945e f121866k;

    /* renamed from: l */
    public DrawerViewModel f121867l;

    /* renamed from: m */
    public boolean f121868m;

    /* renamed from: n */
    public boolean f121869n;

    /* renamed from: o */
    public boolean f121870o;

    /* renamed from: p */
    public boolean f121871p;

    /* renamed from: q */
    public boolean f121872q;

    /* renamed from: r */
    public boolean f121873r;

    /* renamed from: s */
    public boolean f121874s;

    /* renamed from: t */
    public int f121875t;

    /* renamed from: v */
    private boolean f121876v;

    /* renamed from: w */
    private final C12814b f121877w;

    /* renamed from: x */
    private final AbstractC89244h f121878x;

    /* renamed from: y */
    private HomePageDataViewModel f121879y;

    /* renamed from: z */
    private final AbstractC89244h f121880z;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$l */
    public static final class C53013l extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {
        public static final C53013l INSTANCE = new C53013l();

        static {
            Covode.recordClassIndex(62553);
        }

        public C53013l() {
            super(1);
        }

        public final C53110d invoke(C53110d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(62535);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(223, new RunnableC90250g(C52995a.class, "onComplianceDialogCheckEvent", C39227a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(224, new RunnableC90250g(C52995a.class, "onRestoreDialogCheckEvent", C49666aa.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: v */
    public final StorySidebarFeedVM mo89449v() {
        return (StorySidebarFeedVM) this.f121877w.getValue();
    }

    /* renamed from: w */
    public final Keva mo89450w() {
        return (Keva) this.f121880z.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final int mo89451x() {
        return ((Number) this.f121864A.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$h */
    public static final class C53009h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121892a;

        static {
            Covode.recordClassIndex(62549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53009h(AbstractC12748a aVar) {
            super(0);
            this.f121892a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f121892a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$v */
    public static final class C53023v {
        static {
            Covode.recordClassIndex(62563);
        }

        private C53023v() {
        }

        public /* synthetic */ C53023v(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$af */
    static final class C53002af extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C53002af f121887a = new C53002af();

        static {
            Covode.recordClassIndex(62542);
        }

        C53002af() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("repo_story_cold_start");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$d */
    public static final class C53005d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53005d INSTANCE = new C53005d();

        static {
            Covode.recordClassIndex(62545);
        }

        public C53005d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$g */
    public static final class C53008g extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53008g INSTANCE = new C53008g();

        static {
            Covode.recordClassIndex(62548);
        }

        public C53008g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$i */
    public static final class C53010i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121893a;

        static {
            Covode.recordClassIndex(62550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53010i(AbstractC12748a aVar) {
            super(0);
            this.f121893a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f121893a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$j */
    public static final class C53011j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121894a;

        static {
            Covode.recordClassIndex(62551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53011j(AbstractC12748a aVar) {
            super(0);
            this.f121894a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f121894a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$n */
    public static final class C53015n extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53015n INSTANCE = new C53015n();

        static {
            Covode.recordClassIndex(62555);
        }

        public C53015n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$q */
    public static final class C53018q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53018q INSTANCE = new C53018q();

        static {
            Covode.recordClassIndex(62558);
        }

        public C53018q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$t */
    public static final class C53021t extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53021t INSTANCE = new C53021t();

        static {
            Covode.recordClassIndex(62561);
        }

        public C53021t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$w */
    static final class C53024w extends AbstractC89220m implements AbstractC89171a<C13036a> {

        /* renamed from: a */
        public static final C53024w f121903a = new C53024w();

        static {
            Covode.recordClassIndex(62564);
        }

        C53024w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C13036a invoke() {
            return new C13036a();
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C80298cg.m139204a(this);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$k */
    public static final class C53012k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121895a;

        static {
            Covode.recordClassIndex(62552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53012k(AbstractC12748a aVar) {
            super(0);
            this.f121895a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f121895a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$m */
    public static final class C53014m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121896a;

        static {
            Covode.recordClassIndex(62554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53014m(AbstractC12748a aVar) {
            super(0);
            this.f121896a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f121896a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$x */
    static final class C53025x extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C53025x f121904a = new C53025x();

        static {
            Covode.recordClassIndex(62565);
        }

        C53025x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("tiktok_story_sidebar_auto_show_count_limit_per_day", 2));
        }
    }

    /* renamed from: A */
    static String m97932A() {
        User b = C63770ai.m139683b();
        if (b != null) {
            return b.getUid();
        }
        return null;
    }

    /* renamed from: y */
    public final boolean mo89452y() {
        if (!mo89450w().getBoolean("key_guide_animation_has_shown", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$a */
    public static final class C52996a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f121881a;

        static {
            Covode.recordClassIndex(62536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52996a(AbstractC89277c cVar) {
            super(0);
            this.f121881a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f121881a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$b */
    public static final class C53003b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121888a;

        static {
            Covode.recordClassIndex(62543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53003b(AbstractC12748a aVar) {
            super(0);
            this.f121888a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f121888a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$c */
    public static final class C53004c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121889a;

        static {
            Covode.recordClassIndex(62544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53004c(AbstractC12748a aVar) {
            super(0);
            this.f121889a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f121889a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$o */
    public static final class C53016o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121897a;

        static {
            Covode.recordClassIndex(62556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53016o(AbstractC12748a aVar) {
            super(0);
            this.f121897a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f121897a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$p */
    public static final class C53017p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121898a;

        static {
            Covode.recordClassIndex(62557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53017p(AbstractC12748a aVar) {
            super(0);
            this.f121898a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f121898a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$r */
    public static final class C53019r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121899a;

        static {
            Covode.recordClassIndex(62559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53019r(AbstractC12748a aVar) {
            super(0);
            this.f121899a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f121899a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$s */
    public static final class C53020s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121900a;

        static {
            Covode.recordClassIndex(62560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53020s(AbstractC12748a aVar) {
            super(0);
            this.f121900a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f121900a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: n */
    public final void mo20526n() {
        super.mo20526n();
        if (!((C13036a) this.f121878x.getValue()).f31813a && C17873f.m33102j() == null) {
            this.f121876v = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$e */
    public static final class C53006e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121890a;

        static {
            Covode.recordClassIndex(62546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53006e(AbstractC12748a aVar) {
            super(0);
            this.f121890a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f121890a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$f */
    public static final class C53007f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f121891a;

        static {
            Covode.recordClassIndex(62547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53007f(AbstractC12748a aVar) {
            super(0);
            this.f121891a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f121891a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$u */
    static final class RunnableC53022u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f121901a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f121902b;

        static {
            Covode.recordClassIndex(62562);
        }

        RunnableC53022u(FrameLayout frameLayout, FrameLayout frameLayout2) {
            this.f121901a = frameLayout;
            this.f121902b = frameLayout2;
        }

        public final void run() {
            float f;
            View findViewById = this.f121901a.findViewById(R.id.bw0);
            C89219l.m154716b(findViewById, "");
            AnimationImageView animationImageView = (AnimationImageView) findViewById;
            if (animationImageView != null) {
                if (C80471gb.m139483a(this.f121902b.getContext())) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                animationImageView.setScaleX(f);
                animationImageView.mo5833b(true);
                animationImageView.setAnimation("story_guide_hand_swip_lottie.json");
                animationImageView.mo5826a();
            }
        }
    }

    /* renamed from: z */
    public final boolean mo89453z() {
        long j = mo89450w().getLong("key_guide_show_last_time_" + m97932A(), 0);
        int i = mo89450w().getInt("key_guide_show_count_limit_" + m97932A(), 0);
        if (j == 0 || C80566ib.m139650a(Long.valueOf(j)) > 0) {
            return true;
        }
        if (C80566ib.m139650a(Long.valueOf(j)) != 0 || i >= mo89451x()) {
            return false;
        }
        return true;
    }

    public C52995a() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(StorySidebarFeedVM.class);
        C52996a aVar2 = new C52996a(a);
        C53013l lVar = C53013l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C53015n.INSTANCE, new C53016o(this), new C53017p(this), C53018q.INSTANCE, lVar, new C53019r(this), new C53020s(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C53021t.INSTANCE, new C53003b(this), new C53004c(this), C53005d.INSTANCE, lVar, new C53006e(this), new C53007f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C53008g.INSTANCE, new C53009h(this), new C53010i(this), new C53011j(this), lVar, new C53012k(this), new C53014m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f121877w = bVar;
        this.f121878x = C89250i.m154773a((AbstractC89171a) C53024w.f121903a);
        this.f121880z = C89250i.m154773a((AbstractC89171a) C53002af.f121887a);
        this.f121864A = C89250i.m154773a((AbstractC89171a) C53025x.f121904a);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        String str;
        super.mo20525j();
        if (this.f121876v) {
            this.f121876v = false;
            ActivityC0945e b = C12777b.m23004b(this);
            if (b != null) {
                this.f121879y = HomePageDataViewModel.C52942a.m97777a(b);
                Aweme a = AwemeChangeCallBack.m108593a(b);
                if (a != null && !a.isAd() && this.f121868m) {
                    if (mo89450w().getInt("key_setting", 0) == 5) {
                        if (mo89450w().getLong("key_tutorial_last_time", 0) != 0) {
                            C77260g gVar = C77260g.f173332a;
                            HomePageDataViewModel homePageDataViewModel = this.f121879y;
                            if (homePageDataViewModel == null || (str = homePageDataViewModel.mo89328c()) == null) {
                                str = "";
                            }
                            gVar.mo120142a(b, str);
                        }
                    } else if (!mo89452y() && mo89453z()) {
                        List<Aweme> h = mo89449v().mo23343h();
                        ArrayList arrayList = new ArrayList();
                        for (T t : h) {
                            UserStory userStory = t.getUserStory();
                            if (userStory != null && !userStory.getAllViewed()) {
                                arrayList.add(t);
                            }
                        }
                        if (arrayList.size() >= C52971b.m97882a()) {
                            mo89449v().mo89621j();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$ae */
    static final class C53001ae<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C52995a f121886a;

        static {
            Covode.recordClassIndex(62541);
        }

        C53001ae(C52995a aVar) {
            this.f121886a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f121886a.mo89446a("auto");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$y */
    public static final class C53026y implements AbstractC53046d {

        /* renamed from: a */
        final /* synthetic */ C52995a f121905a;

        static {
            Covode.recordClassIndex(62566);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37184a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37186a(int i, boolean z, boolean z2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: b */
        public final void mo37187b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53046d
        /* renamed from: c */
        public final void mo89457c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53046d
        /* renamed from: d */
        public final void mo89458d() {
        }

        C53026y(C52995a aVar) {
            this.f121905a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37185a(float f) {
            if (this.f121905a.f121865j != null) {
                this.f121905a.mo89446a("");
                DrawerViewModel drawerViewModel = this.f121905a.f121867l;
                if (drawerViewModel != null) {
                    drawerViewModel.mo89468b(this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$z */
    public static final class C53027z implements AbstractC15497d {

        /* renamed from: a */
        final /* synthetic */ C52995a f121906a;

        static {
            Covode.recordClassIndex(62567);
        }

        C53027z(C52995a aVar) {
            this.f121906a = aVar;
        }

        @Override // com.bytedance.hox.p1106a.AbstractC15497d
        /* renamed from: a */
        public final void mo25223a(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            this.f121906a.f121868m = true;
        }

        @Override // com.bytedance.hox.p1106a.AbstractC15497d
        /* renamed from: b */
        public final void mo25224b(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            this.f121906a.f121868m = false;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onComplianceDialogCheckEvent(C39227a aVar) {
        if (aVar != null) {
            this.f121873r = true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRestoreDialogCheckEvent(C49666aa aaVar) {
        if (aaVar != null) {
            this.f121874s = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$ac */
    static final class View$OnClickListenerC52999ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52995a f121884a;

        static {
            Covode.recordClassIndex(62539);
        }

        View$OnClickListenerC52999ac(C52995a aVar) {
            this.f121884a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f121884a.mo89446a("click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$ad */
    static final class C53000ad<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ C52995a f121885a;

        static {
            Covode.recordClassIndex(62540);
        }

        C53000ad(C52995a aVar) {
            this.f121885a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C89219l.m154721d(obj, "");
            FrameLayout frameLayout = this.f121885a.f121865j;
            if (frameLayout == null || frameLayout.getVisibility() != 0) {
                return false;
            }
            return true;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            this.f121866k = b;
            Hox.C15490a.m28529a(b).mo25209a("HOME", new C53027z(this));
            AbstractC12818f.C12819a.m23063a(this, mo89449v(), C53028b.f121907a, (C12854k) null, new C52997aa(this), 6);
            AwemeChangeCallBack.m108594a(b, b, new C52998ab(this));
        }
    }

    /* renamed from: a */
    public final void mo89446a(String str) {
        DrawerViewModel drawerViewModel;
        C1213t<Boolean> tVar;
        MethodCollector.m26663i(220);
        C89219l.m154721d(str, "");
        if (!(this.f121866k == null || (drawerViewModel = this.f121867l) == null || (tVar = drawerViewModel.f121920d) == null)) {
            tVar.postValue(false);
        }
        FrameLayout frameLayout = this.f121865j;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.f121865j = null;
        if (!TextUtils.isEmpty(str)) {
            C48316ak.m91753a("exit", str);
        }
        mo89449v().mo89622k();
        MethodCollector.m26664o(220);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$ab */
    static final class C52998ab implements AwemeChangeCallBack.AbstractC59111a {

        /* renamed from: a */
        final /* synthetic */ C52995a f121883a;

        static {
            Covode.recordClassIndex(62538);
        }

        C52998ab(C52995a aVar) {
            this.f121883a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b6, code lost:
            if (r8 != null) goto L_0x00ed;
         */
        @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo37101a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r12) {
            /*
            // Method dump skipped, instructions count: 490
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.p3052a.C52995a.C52998ab.mo37101a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$aa */
    static final class C52997aa extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52995a f121882a;

        static {
            Covode.recordClassIndex(62537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52997aa(C52995a aVar) {
            super(2);
            this.f121882a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(pVar, "");
            int i = this.f121882a.mo89450w().getInt("key_setting", 0);
            if (i > 0 && i != 5 && this.f121882a.mo89450w().getBoolean("key_new_version", false) && intValue == 6) {
                List<Aweme> h = this.f121882a.mo89449v().mo23343h();
                if (!this.f121882a.mo89452y() || !(!h.isEmpty())) {
                    if (this.f121882a.mo89453z()) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : h) {
                            UserStory userStory = t.getUserStory();
                            if (userStory != null && !userStory.getAllViewed()) {
                                arrayList.add(t);
                            }
                        }
                        if (arrayList.size() >= C52971b.m97882a() && !C76681f.m134256a()) {
                            this.f121882a.f121869n = false;
                            this.f121882a.f121870o = true;
                            this.f121882a.f121871p = true;
                        }
                    }
                    this.f121882a.f121869n = false;
                    this.f121882a.f121870o = false;
                } else {
                    this.f121882a.f121869n = true;
                    this.f121882a.f121871p = true;
                }
            }
            return C89391z.f203057a;
        }
    }
}
