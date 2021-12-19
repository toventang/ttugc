package com.p2082ss.android.ugc.aweme.mix.editname;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59395a;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.EnumC59529b;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59404d;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59413b;
import com.p2082ss.android.ugc.aweme.mix.p3451f.C59621a;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.util.C80130h;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.mix.editname.d */
public final class C59558d extends AbstractC12769a {

    /* renamed from: j */
    public int f135913j = 15;

    /* renamed from: k */
    public EditText f135914k;

    /* renamed from: l */
    View f135915l;

    /* renamed from: m */
    LinearLayout f135916m;

    /* renamed from: n */
    public TuxSpinner f135917n;

    /* renamed from: o */
    TuxButton f135918o;

    /* renamed from: p */
    public ImageView f135919p;

    /* renamed from: q */
    public boolean f135920q;

    /* renamed from: r */
    public final C80130h f135921r;

    /* renamed from: s */
    private final long f135922s = 1000;

    /* renamed from: t */
    private TextView f135923t;

    /* renamed from: u */
    private TextView f135924u;

    /* renamed from: v */
    private final C12814b f135925v;

    /* renamed from: w */
    private final C12814b f135926w;

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$b */
    public static final class C59577b extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {
        public static final C59577b INSTANCE = new C59577b();

        static {
            Covode.recordClassIndex(69974);
        }

        public C59577b() {
            super(1);
        }

        public final C59528a invoke(C59528a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$l */
    public static final class C59587l extends AbstractC89220m implements AbstractC89172b<C59554a, C59554a> {
        public static final C59587l INSTANCE = new C59587l();

        static {
            Covode.recordClassIndex(69984);
        }

        public C59587l() {
            super(1);
        }

        public final C59554a invoke(C59554a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(69955);
    }

    /* renamed from: v */
    public final EditPlayListNameEditTextVM mo97162v() {
        return (EditPlayListNameEditTextVM) this.f135925v.getValue();
    }

    /* renamed from: w */
    public final MixCreateViewModel mo97163w() {
        return (MixCreateViewModel) this.f135926w.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ae */
    static final class C59564ae extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C59564ae f135932a = new C59564ae();

        static {
            Covode.recordClassIndex(69961);
        }

        C59564ae() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ah */
    static final class C59567ah extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C59567ah f135935a = new C59567ah();

        static {
            Covode.recordClassIndex(69964);
        }

        C59567ah() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ak */
    static final class C59570ak extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C59570ak f135938a = new C59570ak();

        static {
            Covode.recordClassIndex(69967);
        }

        C59570ak() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$q */
    public static final class C59592q extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135956a;

        static {
            Covode.recordClassIndex(69989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59592q(AbstractC12748a aVar) {
            super(0);
            this.f135956a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f135956a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$w */
    public static final class C59598w extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135961a;

        static {
            Covode.recordClassIndex(69995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59598w(AbstractC12748a aVar) {
            super(0);
            this.f135961a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f135961a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$c */
    public static final class C59578c extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59578c INSTANCE = new C59578c();

        static {
            Covode.recordClassIndex(69975);
        }

        public C59578c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$f */
    public static final class C59581f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59581f INSTANCE = new C59581f();

        static {
            Covode.recordClassIndex(69978);
        }

        public C59581f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$i */
    public static final class C59584i extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59584i INSTANCE = new C59584i();

        static {
            Covode.recordClassIndex(69981);
        }

        public C59584i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$m */
    public static final class C59588m extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59588m INSTANCE = new C59588m();

        static {
            Covode.recordClassIndex(69985);
        }

        public C59588m() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$p */
    public static final class C59591p extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59591p INSTANCE = new C59591p();

        static {
            Covode.recordClassIndex(69988);
        }

        public C59591p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$r */
    public static final class C59593r extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135957a;

        static {
            Covode.recordClassIndex(69990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59593r(AbstractC12748a aVar) {
            super(0);
            this.f135957a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f135957a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$s */
    public static final class C59594s extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135958a;

        static {
            Covode.recordClassIndex(69991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59594s(AbstractC12748a aVar) {
            super(0);
            this.f135958a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f135958a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$v */
    public static final class C59597v extends AbstractC89220m implements AbstractC89171a<C12874b<C59554a>> {
        public static final C59597v INSTANCE = new C59597v();

        static {
            Covode.recordClassIndex(69994);
        }

        public C59597v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59554a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$x */
    public static final class C59599x extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135962a;

        static {
            Covode.recordClassIndex(69996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59599x(AbstractC12748a aVar) {
            super(0);
            this.f135962a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f135962a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$y */
    public static final class C59600y extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135963a;

        static {
            Covode.recordClassIndex(69997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59600y(AbstractC12748a aVar) {
            super(0);
            this.f135963a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f135963a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$aa */
    public static final class C59560aa extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135928a;

        static {
            Covode.recordClassIndex(69957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59560aa(AbstractC12748a aVar) {
            super(0);
            this.f135928a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f135928a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$t */
    public static final class C59595t extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135959a;

        static {
            Covode.recordClassIndex(69992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59595t(AbstractC12748a aVar) {
            super(0);
            this.f135959a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f135959a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$u */
    public static final class C59596u extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135960a;

        static {
            Covode.recordClassIndex(69993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59596u(AbstractC12748a aVar) {
            super(0);
            this.f135960a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f135960a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$z */
    public static final class C59601z extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135964a;

        static {
            Covode.recordClassIndex(69998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59601z(AbstractC12748a aVar) {
            super(0);
            this.f135964a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f135964a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$a */
    public static final class C59559a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135927a;

        static {
            Covode.recordClassIndex(69956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59559a(AbstractC89277c cVar) {
            super(0);
            this.f135927a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135927a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ab */
    public static final class C59561ab extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135929a;

        static {
            Covode.recordClassIndex(69958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59561ab(AbstractC89277c cVar) {
            super(0);
            this.f135929a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135929a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$d */
    public static final class C59579d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135948a;

        static {
            Covode.recordClassIndex(69976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59579d(AbstractC12748a aVar) {
            super(0);
            this.f135948a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f135948a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$e */
    public static final class C59580e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135949a;

        static {
            Covode.recordClassIndex(69977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59580e(AbstractC12748a aVar) {
            super(0);
            this.f135949a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f135949a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$g */
    public static final class C59582g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135950a;

        static {
            Covode.recordClassIndex(69979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59582g(AbstractC12748a aVar) {
            super(0);
            this.f135950a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f135950a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$h */
    public static final class C59583h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135951a;

        static {
            Covode.recordClassIndex(69980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59583h(AbstractC12748a aVar) {
            super(0);
            this.f135951a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f135951a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$j */
    public static final class C59585j extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135952a;

        static {
            Covode.recordClassIndex(69982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59585j(AbstractC12748a aVar) {
            super(0);
            this.f135952a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f135952a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$k */
    public static final class C59586k extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135953a;

        static {
            Covode.recordClassIndex(69983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59586k(AbstractC12748a aVar) {
            super(0);
            this.f135953a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f135953a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$n */
    public static final class C59589n extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135954a;

        static {
            Covode.recordClassIndex(69986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59589n(AbstractC12748a aVar) {
            super(0);
            this.f135954a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f135954a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$o */
    public static final class C59590o extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135955a;

        static {
            Covode.recordClassIndex(69987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59590o(AbstractC12748a aVar) {
            super(0);
            this.f135955a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f135955a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: l */
    public final void mo20537l() {
        if (this.f135914k == null) {
            C89219l.m154710a("editText");
        } else {
            MixCreateViewModel w = mo97163w();
            EditText editText = this.f135914k;
            if (editText == null) {
                C89219l.m154710a("editText");
            }
            w.mo97105b(m109185a(editText.getText().toString()));
        }
        super.mo20537l();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$al */
    static final class RunnableC59571al implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C59558d f135939a;

        /* renamed from: b */
        final /* synthetic */ InputMethodManager f135940b;

        static {
            Covode.recordClassIndex(69968);
        }

        RunnableC59571al(C59558d dVar, InputMethodManager inputMethodManager) {
            this.f135939a = dVar;
            this.f135940b = inputMethodManager;
        }

        public final void run() {
            C59558d.m109183a(this.f135939a).setFocusable(true);
            C59558d.m109183a(this.f135939a).setFocusableInTouchMode(true);
            C59558d.m109183a(this.f135939a).requestFocus();
            C59558d.m109183a(this.f135939a).setSelection(C59558d.m109183a(this.f135939a).getText().toString().length());
            InputMethodManager inputMethodManager = this.f135940b;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(C59558d.m109183a(this.f135939a), 2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$aq */
    public static final class C59576aq implements C80130h.AbstractC80131a {

        /* renamed from: a */
        final /* synthetic */ C59558d f135947a;

        static {
            Covode.recordClassIndex(69973);
        }

        @Override // com.p2082ss.android.ugc.aweme.util.C80130h.AbstractC80131a
        /* renamed from: a */
        public final void mo97028a() {
            if (C89219l.m154714a((Object) C59558d.m109183a(this.f135947a).getText().toString(), (Object) "")) {
                C59558d.m109186b(this.f135947a).setVisibility(8);
                C59558d.m109187c(this.f135947a).setVisibility(8);
                return;
            }
            String obj = C59558d.m109183a(this.f135947a).getText().toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (C89361p.m154910b((CharSequence) obj).toString().length() == 0) {
                this.f135947a.mo97165y();
            } else if (C59558d.m109183a(this.f135947a).getText().toString().length() <= this.f135947a.f135913j) {
                C59558d.m109186b(this.f135947a).setVisibility(0);
                C59558d.m109187c(this.f135947a).setVisibility(8);
                this.f135947a.mo97162v().mo97156a(C59558d.m109183a(this.f135947a).getText().toString());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59576aq(C59558d dVar) {
            this.f135947a = dVar;
        }
    }

    public C59558d() {
        C12814b bVar;
        AbstractC89277c a = C89204ab.m154669a(EditPlayListNameEditTextVM.class);
        this.f135925v = new C12814b(a, new C59559a(a), C59597v.INSTANCE, new C59598w(this), new C59599x(this), new C59600y(this), C59587l.INSTANCE, new C59601z(this), new C59560aa(this));
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a2 = C89204ab.m154669a(MixCreateViewModel.class);
        C59561ab abVar = new C59561ab(a2);
        C59577b bVar2 = C59577b.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a2, abVar, C59578c.INSTANCE, new C59579d(this), new C59580e(this), C59581f.INSTANCE, bVar2, new C59582g(this), new C59583h(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a2, abVar, C59584i.INSTANCE, new C59585j(this), new C59586k(this), C59588m.INSTANCE, bVar2, new C59589n(this), new C59590o(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a2, abVar, C59591p.INSTANCE, new C59592q(this), new C59593r(this), new C59594s(this), bVar2, new C59595t(this), new C59596u(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f135926w = bVar;
        this.f135921r = new C80130h(1000, new C59576aq(this));
    }

    /* renamed from: x */
    public final void mo97164x() {
        String str;
        CharSequence charSequence;
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            C17191a.C17192a aVar = new C17191a.C17192a();
            EditText editText = this.f135914k;
            if (editText == null) {
                C89219l.m154710a("editText");
            }
            C17191a.C17192a a = aVar.mo27177a(String.valueOf(editText.getText().length()));
            if (C80471gb.m139482a()) {
                str = "‏\\";
            } else {
                str = "‎/";
            }
            C17191a aVar2 = a.mo27177a(str).mo27177a(String.valueOf(this.f135913j)).f40973a;
            EditText editText2 = this.f135914k;
            if (editText2 == null) {
                C89219l.m154710a("editText");
            }
            if (editText2.getText().length() > this.f135913j) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(b.getResources().getColor(R.color.bd));
                EditText editText3 = this.f135914k;
                if (editText3 == null) {
                    C89219l.m154710a("editText");
                }
                aVar2.setSpan(foregroundColorSpan, 0, String.valueOf(editText3.getText().length()).length() + 1, 33);
                TextView textView = this.f135923t;
                if (textView == null) {
                    C89219l.m154710a("lengthHint");
                }
                textView.setText(aVar2);
                LinearLayout linearLayout = this.f135916m;
                if (linearLayout == null) {
                    C89219l.m154710a("errorHint");
                }
                linearLayout.setVisibility(0);
                TextView textView2 = this.f135924u;
                if (textView2 == null) {
                    C89219l.m154710a("txErrorHint");
                }
                Context az_ = az_();
                if (az_ != null) {
                    charSequence = az_.getText(R.string.ab_);
                } else {
                    charSequence = null;
                }
                textView2.setText(charSequence);
                ActivityC0945e b2 = C12777b.m23004b(this);
                if (b2 != null) {
                    View view = this.f135915l;
                    if (view == null) {
                        C89219l.m154710a("viewLint");
                    }
                    view.setBackground(b2.getResources().getDrawable(R.color.bd));
                    return;
                }
                return;
            }
            TextView textView3 = this.f135923t;
            if (textView3 == null) {
                C89219l.m154710a("lengthHint");
            }
            textView3.setText(aVar2);
        }
    }

    /* renamed from: y */
    public final void mo97165y() {
        CharSequence charSequence;
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            View view = this.f135915l;
            if (view == null) {
                C89219l.m154710a("viewLint");
            }
            view.setBackground(b.getResources().getDrawable(R.color.b0));
            TuxButton tuxButton = this.f135918o;
            if (tuxButton == null) {
                C89219l.m154710a("button");
            }
            tuxButton.setBackground(b.getResources().getDrawable(R.color.g));
            TuxButton tuxButton2 = this.f135918o;
            if (tuxButton2 == null) {
                C89219l.m154710a("button");
            }
            tuxButton2.setTextColor(b.getResources().getColor(R.color.bz));
        }
        LinearLayout linearLayout = this.f135916m;
        if (linearLayout == null) {
            C89219l.m154710a("errorHint");
        }
        linearLayout.setVisibility(8);
        TuxSpinner tuxSpinner = this.f135917n;
        if (tuxSpinner == null) {
            C89219l.m154710a("loading");
        }
        tuxSpinner.setVisibility(8);
        ImageView imageView = this.f135919p;
        if (imageView == null) {
            C89219l.m154710a("delete");
        }
        imageView.setVisibility(0);
        TextView textView = this.f135924u;
        if (textView == null) {
            C89219l.m154710a("txErrorHint");
        }
        Context az_ = az_();
        if (az_ != null) {
            charSequence = az_.getText(R.string.dq0);
        } else {
            charSequence = null;
        }
        textView.setText(charSequence);
        TuxButton tuxButton3 = this.f135918o;
        if (tuxButton3 == null) {
            C89219l.m154710a("button");
        }
        tuxButton3.setEnabled(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$am */
    public static final class C59572am implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C59558d f135941a;

        static {
            Covode.recordClassIndex(69969);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59572am(C59558d dVar) {
            this.f135941a = dVar;
        }

        public final void afterTextChanged(Editable editable) {
            this.f135941a.mo97165y();
            this.f135941a.mo97164x();
            this.f135941a.f135921r.mo123588a();
            this.f135941a.f135921r.mo123589b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$an */
    static final class View$OnClickListenerC59573an implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59558d f135942a;

        static {
            Covode.recordClassIndex(69970);
        }

        View$OnClickListenerC59573an(C59558d dVar) {
            this.f135942a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C59558d.m109183a(this.f135942a).setText("");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m109183a(C59558d dVar) {
        EditText editText = dVar.f135914k;
        if (editText == null) {
            C89219l.m154710a("editText");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ TuxSpinner m109186b(C59558d dVar) {
        TuxSpinner tuxSpinner = dVar.f135917n;
        if (tuxSpinner == null) {
            C89219l.m154710a("loading");
        }
        return tuxSpinner;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m109187c(C59558d dVar) {
        ImageView imageView = dVar.f135919p;
        if (imageView == null) {
            C89219l.m154710a("delete");
        }
        return imageView;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$aj */
    static final class C59569aj extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59558d f135937a;

        static {
            Covode.recordClassIndex(69966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59569aj(C59558d dVar) {
            super(1);
            this.f135937a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            ActivityC0945e b = C12777b.m23004b(this.f135937a);
            if (b != null) {
                new C23144b(b).mo37640e(R.string.fz3).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ad */
    static final class C59563ad extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59558d f135931a;

        static {
            Covode.recordClassIndex(69960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59563ad(C59558d dVar) {
            super(1);
            this.f135931a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            ActivityC0945e b;
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            String message = th2.getMessage();
            if ((message == null || !message.equals("dark_post_failed")) && (b = C12777b.m23004b(this.f135931a)) != null) {
                new C23144b(b).mo37640e(R.string.fz3).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ag */
    static final class C59566ag extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59558d f135934a;

        static {
            Covode.recordClassIndex(69963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59566ag(C59558d dVar) {
            super(1);
            this.f135934a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            C59558d.m109186b(this.f135934a).setVisibility(8);
            C59558d.m109187c(this.f135934a).setVisibility(0);
            ActivityC0945e b = C12777b.m23004b(this.f135934a);
            if (b != null) {
                new C23144b(b).mo37640e(R.string.fz3).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ai */
    static final class C59568ai extends AbstractC89220m implements AbstractC89172b<C59396b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59558d f135936a;

        static {
            Covode.recordClassIndex(69965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59568ai(C59558d dVar) {
            super(1);
            this.f135936a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59396b bVar) {
            C59396b bVar2 = bVar;
            if (bVar2 != null && bVar2.status_code == 0) {
                ((AbstractC59620k) C12801d.m23018a(this.f135936a, C89204ab.m154669a(AbstractC59620k.class))).mo97175a(C59558d.m109185a(C59558d.m109183a(this.f135936a).getText().toString()));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m109185a(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        char[] charArray = str.toCharArray();
        C89219l.m154716b(charArray, "");
        int length = charArray.length;
        while (length > 0 && C89219l.m154703a(charArray[length - 1], 32) <= 0) {
            length--;
        }
        if (length >= charArray.length) {
            return new String(charArray);
        }
        String substring = new String(charArray).substring(0, length);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ac */
    static final class C59562ac extends AbstractC89220m implements AbstractC89172b<C59396b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59558d f135930a;

        static {
            Covode.recordClassIndex(69959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59562ac(C59558d dVar) {
            super(1);
            this.f135930a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59396b bVar) {
            C59396b bVar2 = bVar;
            if (bVar2 != null && bVar2.status_code == 0 && this.f135930a.f135920q) {
                AbstractC81915c.m141874a(new C59404d(C59558d.m109185a(C59558d.m109183a(this.f135930a).getText().toString()), bVar2.f135679a, this.f135930a.mo97163w().f135809m, MixFeedService.m109435k().mo97325b(), this.f135930a.mo97163w().f135808l));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ao */
    static final class View$OnClickListenerC59574ao implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59558d f135943a;

        /* renamed from: b */
        final /* synthetic */ InputMethodManager f135944b;

        static {
            Covode.recordClassIndex(69971);
        }

        View$OnClickListenerC59574ao(C59558d dVar, InputMethodManager inputMethodManager) {
            this.f135943a = dVar;
            this.f135944b = inputMethodManager;
        }

        public final void onClick(View view) {
            AbstractC0952i supportFragmentManager;
            ClickAgent.onClick(view);
            ActivityC0945e b = C12777b.m23004b(this.f135943a);
            if (b != null && (supportFragmentManager = b.getSupportFragmentManager()) != null) {
                InputMethodManager inputMethodManager = this.f135944b;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(C59558d.m109183a(this.f135943a).getWindowToken(), 0);
                }
                this.f135943a.mo97163w().mo97105b(C59558d.m109185a(C59558d.m109183a(this.f135943a).getText().toString()));
                if (supportFragmentManager.mo3564e() == 0) {
                    ActivityC0945e b2 = C12777b.m23004b(this.f135943a);
                    if (b2 != null) {
                        b2.finish();
                        return;
                    }
                    return;
                }
                supportFragmentManager.mo3562c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$af */
    static final class C59565af extends AbstractC89220m implements AbstractC89172b<C59395a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59558d f135933a;

        static {
            Covode.recordClassIndex(69962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59565af(C59558d dVar) {
            super(1);
            this.f135933a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59395a aVar) {
            C59395a aVar2 = aVar;
            if (this.f135933a.f135921r.mo123590c()) {
                if (aVar2 == null || !aVar2.f135677c) {
                    C59558d dVar = this.f135933a;
                    ActivityC0945e b = C12777b.m23004b(dVar);
                    if (b != null) {
                        View view = dVar.f135915l;
                        if (view == null) {
                            C89219l.m154710a("viewLint");
                        }
                        view.setBackground(b.getResources().getDrawable(R.color.bd));
                    }
                    LinearLayout linearLayout = dVar.f135916m;
                    if (linearLayout == null) {
                        C89219l.m154710a("errorHint");
                    }
                    linearLayout.setVisibility(0);
                    ImageView imageView = dVar.f135919p;
                    if (imageView == null) {
                        C89219l.m154710a("delete");
                    }
                    imageView.setVisibility(0);
                    TuxButton tuxButton = dVar.f135918o;
                    if (tuxButton == null) {
                        C89219l.m154710a("button");
                    }
                    tuxButton.setEnabled(false);
                } else {
                    C59558d dVar2 = this.f135933a;
                    EditText editText = dVar2.f135914k;
                    if (editText == null) {
                        C89219l.m154710a("editText");
                    }
                    Editable text = editText.getText();
                    C89219l.m154716b(text, "");
                    if (text.length() > 0) {
                        EditText editText2 = dVar2.f135914k;
                        if (editText2 == null) {
                            C89219l.m154710a("editText");
                        }
                        if (editText2.getText().length() <= dVar2.f135913j) {
                            TuxButton tuxButton2 = dVar2.f135918o;
                            if (tuxButton2 == null) {
                                C89219l.m154710a("button");
                            }
                            tuxButton2.setButtonVariant(0);
                            TuxButton tuxButton3 = dVar2.f135918o;
                            if (tuxButton3 == null) {
                                C89219l.m154710a("button");
                            }
                            tuxButton3.setEnabled(true);
                        }
                    }
                }
            }
            C59558d.m109186b(this.f135933a).setVisibility(8);
            C59558d.m109187c(this.f135933a).setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$ap */
    static final class View$OnClickListenerC59575ap implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59558d f135945a;

        /* renamed from: b */
        final /* synthetic */ InputMethodManager f135946b;

        static {
            Covode.recordClassIndex(69972);
        }

        View$OnClickListenerC59575ap(C59558d dVar, InputMethodManager inputMethodManager) {
            this.f135945a = dVar;
            this.f135946b = inputMethodManager;
        }

        public final void onClick(View view) {
            Integer valueOf;
            ClickAgent.onClick(view);
            InputMethodManager inputMethodManager = this.f135946b;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(C59558d.m109183a(this.f135945a).getWindowToken(), 0);
            }
            C59619j jVar = (C59619j) C12801d.m23029f(this.f135945a, C89204ab.m154669a(AbstractC59620k.class));
            String str = null;
            if (jVar != null && (valueOf = Integer.valueOf(jVar.f135987a)) != null) {
                if (valueOf.intValue() == 1) {
                    if (C59413b.m109112a() == 1 || C59413b.m109112a() == 2) {
                        this.f135945a.mo97163w().mo97105b(C59558d.m109185a(C59558d.m109183a(this.f135945a).getText().toString()));
                        this.f135945a.mo97163w().mo97106i();
                        return;
                    }
                    this.f135945a.mo97163w().mo97105b(C59558d.m109185a(C59558d.m109183a(this.f135945a).getText().toString()));
                    this.f135945a.mo97163w().mo97102a(EnumC59529b.MULTI_VIDEO);
                } else if (valueOf.intValue() == 2) {
                    C59619j jVar2 = (C59619j) C12801d.m23029f(this.f135945a, C89204ab.m154669a(AbstractC59620k.class));
                    if (jVar2 != null) {
                        str = jVar2.f135989c;
                    }
                    if (str == null) {
                        str = "";
                    }
                    EditPlayListNameEditTextVM v = this.f135945a.mo97162v();
                    String a = C59558d.m109185a(C59558d.m109183a(this.f135945a).getText().toString());
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(a, "");
                    v.mo20667b(new EditPlayListNameEditTextVM.C59540a(v, str, a));
                } else if (valueOf.intValue() == 3) {
                    this.f135945a.mo97163w().mo97105b(C59558d.m109185a(C59558d.m109183a(this.f135945a).getText().toString()));
                    this.f135945a.mo97163w().mo97106i();
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        Object obj;
        String str;
        Integer num;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        C89219l.m154721d(view, "");
        this.f135913j = C59621a.m109206a();
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.ax1);
        C89219l.m154716b(findViewById, "");
        this.f135914k = (EditText) findViewById;
        View findViewById2 = view.findViewById(R.id.c8f);
        C89219l.m154716b(findViewById2, "");
        this.f135923t = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.fee);
        C89219l.m154716b(findViewById3, "");
        this.f135915l = findViewById3;
        View findViewById4 = view.findViewById(R.id.arp);
        C89219l.m154716b(findViewById4, "");
        this.f135916m = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.cfa);
        C89219l.m154716b(findViewById5, "");
        this.f135917n = (TuxSpinner) findViewById5;
        View findViewById6 = view.findViewById(R.id.button);
        C89219l.m154716b(findViewById6, "");
        this.f135918o = (TuxButton) findViewById6;
        View findViewById7 = view.findViewById(R.id.aiw);
        C89219l.m154716b(findViewById7, "");
        this.f135919p = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(R.id.evk);
        C89219l.m154716b(findViewById8, "");
        this.f135924u = (TextView) findViewById8;
        TextView textView = (TextView) view.findViewById(R.id.an4);
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            obj = m109184a(b, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        EditText editText = this.f135914k;
        if (editText == null) {
            C89219l.m154710a("editText");
        }
        editText.postDelayed(new RunnableC59571al(this, inputMethodManager), 300);
        C59619j jVar = (C59619j) C12801d.m23029f(this, C89204ab.m154669a(AbstractC59620k.class));
        if (jVar != null) {
            str = jVar.f135988b;
        } else {
            str = null;
        }
        if (!(str == null || str.length() == 0)) {
            EditText editText2 = this.f135914k;
            if (editText2 == null) {
                C89219l.m154710a("editText");
            }
            editText2.setText(str);
            EditText editText3 = this.f135914k;
            if (editText3 == null) {
                C89219l.m154710a("editText");
            }
            editText3.setSelection(str.length());
        }
        EditText editText4 = this.f135914k;
        if (editText4 == null) {
            C89219l.m154710a("editText");
        }
        editText4.addTextChangedListener(new C59572am(this));
        C59619j jVar2 = (C59619j) C12801d.m23029f(this, C89204ab.m154669a(AbstractC59620k.class));
        if (jVar2 != null) {
            num = Integer.valueOf(jVar2.f135987a);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                if (C59413b.m109112a() == 1 || C59413b.m109112a() == 2) {
                    C89219l.m154716b(textView, "");
                    Context az_ = az_();
                    if (az_ != null) {
                        charSequence5 = az_.getText(R.string.dca);
                    } else {
                        charSequence5 = null;
                    }
                    textView.setText(charSequence5);
                    TuxButton tuxButton = this.f135918o;
                    if (tuxButton == null) {
                        C89219l.m154710a("button");
                    }
                    Context az_2 = az_();
                    if (az_2 != null) {
                        charSequence6 = az_2.getText(R.string.aw0);
                    } else {
                        charSequence6 = null;
                    }
                    tuxButton.setText(charSequence6);
                } else {
                    C89219l.m154716b(textView, "");
                    Context az_3 = az_();
                    if (az_3 != null) {
                        charSequence7 = az_3.getText(R.string.dca);
                    } else {
                        charSequence7 = null;
                    }
                    textView.setText(charSequence7);
                    TuxButton tuxButton2 = this.f135918o;
                    if (tuxButton2 == null) {
                        C89219l.m154710a("button");
                    }
                    Context az_4 = az_();
                    if (az_4 != null) {
                        charSequence8 = az_4.getText(R.string.dfb);
                    } else {
                        charSequence8 = null;
                    }
                    tuxButton2.setText(charSequence8);
                }
                C59330a.m109031a(mo97163w().f135807k);
            } else if (num.intValue() == 2) {
                C89219l.m154716b(textView, "");
                Context az_5 = az_();
                if (az_5 != null) {
                    charSequence3 = az_5.getText(R.string.aav);
                } else {
                    charSequence3 = null;
                }
                textView.setText(charSequence3);
                TuxButton tuxButton3 = this.f135918o;
                if (tuxButton3 == null) {
                    C89219l.m154710a("button");
                }
                Context az_6 = az_();
                if (az_6 != null) {
                    charSequence4 = az_6.getText(R.string.fdf);
                } else {
                    charSequence4 = null;
                }
                tuxButton3.setText(charSequence4);
            } else if (num.intValue() == 3) {
                C89219l.m154716b(textView, "");
                Context az_7 = az_();
                if (az_7 != null) {
                    charSequence = az_7.getText(R.string.dca);
                } else {
                    charSequence = null;
                }
                textView.setText(charSequence);
                TuxButton tuxButton4 = this.f135918o;
                if (tuxButton4 == null) {
                    C89219l.m154710a("button");
                }
                Context az_8 = az_();
                if (az_8 != null) {
                    charSequence2 = az_8.getText(R.string.dfb);
                } else {
                    charSequence2 = null;
                }
                tuxButton4.setText(charSequence2);
                this.f135920q = true;
                C59330a.m109031a(mo97163w().f135807k);
            }
        }
        ImageView imageView = this.f135919p;
        if (imageView == null) {
            C89219l.m154710a("delete");
        }
        imageView.setOnClickListener(new View$OnClickListenerC59573an(this));
        View findViewById9 = view.findViewById(R.id.eiz);
        C89219l.m154716b(findViewById9, "");
        ((TextTitleBar) findViewById9).getBackBtn().setOnClickListener(new View$OnClickListenerC59574ao(this, inputMethodManager));
        TuxButton tuxButton5 = this.f135918o;
        if (tuxButton5 == null) {
            C89219l.m154710a("button");
        }
        C58001a.m104815a(tuxButton5, 300);
        View findViewById10 = view.findViewById(R.id.eiz);
        C89219l.m154716b(findViewById10, "");
        ((TextTitleBar) findViewById10).getBackBtn().setImageResource(2131233257);
        TuxButton tuxButton6 = this.f135918o;
        if (tuxButton6 == null) {
            C89219l.m154710a("button");
        }
        tuxButton6.setOnClickListener(new View$OnClickListenerC59575ap(this, inputMethodManager));
        mo97164x();
        mo97165y();
        AssemViewModel.m23030a(mo97162v(), C59602e.f135965a, null, new C59566ag(this), C59567ah.f135935a, new C59565af(this), 2);
        AssemViewModel.m23030a(mo97162v(), C59603f.f135966a, null, new C59569aj(this), C59570ak.f135938a, new C59568ai(this), 2);
        AssemViewModel.m23030a(mo97163w(), C59604g.f135967a, null, new C59563ad(this), C59564ae.f135932a, new C59562ac(this), 2);
        ImageView imageView2 = this.f135919p;
        if (imageView2 == null) {
            C89219l.m154710a("delete");
        }
        imageView2.setVisibility(0);
        if (!TextUtils.isEmpty(mo97163w().mo23342g())) {
            EditText editText5 = this.f135914k;
            if (editText5 == null) {
                C89219l.m154710a("editText");
            }
            editText5.setText(mo97163w().mo23342g());
        }
    }

    /* renamed from: a */
    private static Object m109184a(ActivityC0945e eVar, String str) {
        Object obj;
        MethodCollector.m26663i(2893);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = eVar.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = eVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2893);
                }
            }
        } else {
            obj = eVar.getSystemService(str);
        }
        return obj;
    }
}
