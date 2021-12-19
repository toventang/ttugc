package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.C23136b;
import com.bytedance.tux.p1719f.C23137c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.api.C63555a;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.api.C63556b;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3574c.C63644a;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3574c.C63645b;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.C63661a;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.C63677b;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.views.C63678a;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.views.PronounsEditText;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4591l.C88958b;
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
import p4600h.p4622m.C89361p;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k */
public final class C63603k extends AbstractC12769a implements AbstractC63643n {

    /* renamed from: k */
    public static final C63633s f144284k = new C63633s((byte) 0);

    /* renamed from: j */
    boolean f144285j;

    /* renamed from: l */
    private final AbstractC89244h f144286l = C89250i.m154773a((AbstractC89171a) new C63609ae(this));

    /* renamed from: m */
    private final AbstractC89244h f144287m = C89250i.m154773a((AbstractC89171a) new C63608ad(this));

    /* renamed from: n */
    private final AbstractC89244h f144288n = C89250i.m154773a((AbstractC89171a) new C63607ac(this));

    /* renamed from: o */
    private final AbstractC89244h f144289o = C89250i.m154773a((AbstractC89171a) new C63606ab(this));

    /* renamed from: p */
    private final AbstractC89244h f144290p = C89250i.m154773a((AbstractC89171a) new C63640z(this));

    /* renamed from: q */
    private final AbstractC89244h f144291q = C89250i.m154773a((AbstractC89171a) new C63605aa(this));

    /* renamed from: r */
    private final AbstractC89244h f144292r = C89250i.m154773a((AbstractC89171a) C63638x.f144328a);

    /* renamed from: s */
    private final AbstractC89244h f144293s = C89250i.m154773a((AbstractC89171a) C63639y.f144329a);

    /* renamed from: t */
    private final C12786i f144294t = new C12786i(bW_(), new C63632r(this, null));

    /* renamed from: u */
    private final C12814b f144295u;

    /* renamed from: v */
    private SparseArray f144296v;

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$ag */
    static final class C63611ag<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C63611ag f144304a = new C63611ag();

        static {
            Covode.recordClassIndex(74927);
        }

        C63611ag() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$ai */
    static final class View$OnLongClickListenerC63613ai implements View.OnLongClickListener {

        /* renamed from: a */
        public static final View$OnLongClickListenerC63613ai f144307a = new View$OnLongClickListenerC63613ai();

        static {
            Covode.recordClassIndex(74929);
        }

        View$OnLongClickListenerC63613ai() {
        }

        public final boolean onLongClick(View view) {
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$j */
    public static final class C63624j extends AbstractC89220m implements AbstractC89172b<C63677b, C63677b> {
        public static final C63624j INSTANCE = new C63624j();

        static {
            Covode.recordClassIndex(74940);
        }

        public C63624j() {
            super(1);
        }

        public final C63677b invoke(C63677b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(74919);
    }

    /* renamed from: D */
    private final TuxTextView m115176D() {
        return (TuxTextView) this.f144291q.getValue();
    }

    /* renamed from: E */
    private final C88411a m115177E() {
        return (C88411a) this.f144293s.getValue();
    }

    /* renamed from: A */
    public final ProfileEditPronounsSearchAndDisplayViewModel mo102228A() {
        return (ProfileEditPronounsSearchAndDisplayViewModel) this.f144295u.getValue();
    }

    /* renamed from: v */
    public final PronounsEditText mo102234v() {
        return (PronounsEditText) this.f144288n.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final PowerList mo102235w() {
        return (PowerList) this.f144289o.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final View mo102236x() {
        return (View) this.f144290p.getValue();
    }

    /* renamed from: y */
    public final C88958b<String> mo102237y() {
        return (C88958b) this.f144292r.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final C63570d mo102238z() {
        return (C63570d) this.f144294t.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$g */
    public static final class C63621g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144314a;

        static {
            Covode.recordClassIndex(74937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63621g(AbstractC12748a aVar) {
            super(0);
            this.f144314a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f144314a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$s */
    public static final class C63633s {
        static {
            Covode.recordClassIndex(74949);
        }

        private C63633s() {
        }

        public /* synthetic */ C63633s(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.AbstractC63643n
    /* renamed from: B */
    public final boolean mo102229B() {
        return this.f144285j;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$f */
    public static final class C63620f extends AbstractC89220m implements AbstractC89171a<C12874b<C63677b>> {
        public static final C63620f INSTANCE = new C63620f();

        static {
            Covode.recordClassIndex(74936);
        }

        public C63620f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63677b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$h */
    public static final class C63622h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144315a;

        static {
            Covode.recordClassIndex(74938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63622h(AbstractC12748a aVar) {
            super(0);
            this.f144315a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f144315a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$l */
    public static final class C63626l extends AbstractC89220m implements AbstractC89171a<C12874b<C63677b>> {
        public static final C63626l INSTANCE = new C63626l();

        static {
            Covode.recordClassIndex(74942);
        }

        public C63626l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63677b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$q */
    public static final class C63631q extends AbstractC89220m implements AbstractC89171a<C12874b<C63677b>> {
        public static final C63631q INSTANCE = new C63631q();

        static {
            Covode.recordClassIndex(74947);
        }

        public C63631q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63677b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$x */
    static final class C63638x extends AbstractC89220m implements AbstractC89171a<C88958b<String>> {

        /* renamed from: a */
        public static final C63638x f144328a = new C63638x();

        static {
            Covode.recordClassIndex(74954);
        }

        C63638x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88958b<String> invoke() {
            return new C88958b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$y */
    static final class C63639y extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C63639y f144329a = new C63639y();

        static {
            Covode.recordClassIndex(74955);
        }

        C63639y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C63642m mo20658e() {
        return new C63642m();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$aa */
    static final class C63605aa extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C63603k f144298a;

        static {
            Covode.recordClassIndex(74921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63605aa(C63603k kVar) {
            super(0);
            this.f144298a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f144298a.mo20528t().findViewById(R.id.d_x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$ab */
    static final class C63606ab extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C63603k f144299a;

        static {
            Covode.recordClassIndex(74922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63606ab(C63603k kVar) {
            super(0);
            this.f144299a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            return this.f144299a.mo20528t().findViewById(R.id.da4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$ac */
    static final class C63607ac extends AbstractC89220m implements AbstractC89171a<PronounsEditText> {

        /* renamed from: a */
        final /* synthetic */ C63603k f144300a;

        static {
            Covode.recordClassIndex(74923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63607ac(C63603k kVar) {
            super(0);
            this.f144300a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PronounsEditText invoke() {
            return this.f144300a.mo20528t().findViewById(R.id.d_z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$ad */
    static final class C63608ad extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C63603k f144301a;

        static {
            Covode.recordClassIndex(74924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63608ad(C63603k kVar) {
            super(0);
            this.f144301a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f144301a.mo20528t().findViewById(R.id.da1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$ae */
    static final class C63609ae extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C63603k f144302a;

        static {
            Covode.recordClassIndex(74925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63609ae(C63603k kVar) {
            super(0);
            this.f144302a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f144302a.mo20528t().findViewById(R.id.da0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$ak */
    static final class C63615ak extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C63603k f144309a;

        static {
            Covode.recordClassIndex(74931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63615ak(C63603k kVar) {
            super(0);
            this.f144309a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f144309a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$i */
    public static final class C63623i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144316a;

        static {
            Covode.recordClassIndex(74939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63623i(AbstractC12748a aVar) {
            super(0);
            this.f144316a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f144316a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$k */
    public static final class C63625k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144317a;

        static {
            Covode.recordClassIndex(74941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63625k(AbstractC12748a aVar) {
            super(0);
            this.f144317a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f144317a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$z */
    static final class C63640z extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C63603k f144330a;

        static {
            Covode.recordClassIndex(74956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63640z(C63603k kVar) {
            super(0);
            this.f144330a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f144330a.mo20528t().findViewById(R.id.d_y);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        m115177E().dispose();
        super.mo20527p();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$a */
    public static final class C63604a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f144297a;

        static {
            Covode.recordClassIndex(74920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63604a(AbstractC89277c cVar) {
            super(0);
            this.f144297a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f144297a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$b */
    public static final class C63616b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144310a;

        static {
            Covode.recordClassIndex(74932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63616b(AbstractC12748a aVar) {
            super(0);
            this.f144310a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f144310a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$c */
    public static final class C63617c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144311a;

        static {
            Covode.recordClassIndex(74933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63617c(AbstractC12748a aVar) {
            super(0);
            this.f144311a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f144311a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$m */
    public static final class C63627m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144318a;

        static {
            Covode.recordClassIndex(74943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63627m(AbstractC12748a aVar) {
            super(0);
            this.f144318a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f144318a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$n */
    public static final class C63628n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144319a;

        static {
            Covode.recordClassIndex(74944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63628n(AbstractC12748a aVar) {
            super(0);
            this.f144319a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f144319a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$o */
    public static final class C63629o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144320a;

        static {
            Covode.recordClassIndex(74945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63629o(AbstractC12748a aVar) {
            super(0);
            this.f144320a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f144320a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$p */
    public static final class C63630p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144321a;

        static {
            Covode.recordClassIndex(74946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63630p(AbstractC12748a aVar) {
            super(0);
            this.f144321a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f144321a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$r */
    public static final class C63632r extends AbstractC89220m implements AbstractC89171a<C63570d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144322a;

        /* renamed from: b */
        final /* synthetic */ String f144323b;

        static {
            Covode.recordClassIndex(74948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63632r(AbstractC12748a aVar, String str) {
            super(0);
            this.f144322a = aVar;
            this.f144323b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.C63570d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f144322a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d> r1 = com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.C63570d.class
                java.lang.String r0 = r3.f144323b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.C63603k.C63632r.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.AbstractC63643n
    /* renamed from: C */
    public final String mo102230C() {
        ProfileEditPronounsSearchAndDisplayViewModel A = mo102228A();
        if (A.f144360k.isEmpty()) {
            return "";
        }
        return C89070n.m154551a(A.f144360k, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$d */
    public static final class C63618d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144312a;

        static {
            Covode.recordClassIndex(74934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63618d(AbstractC12748a aVar) {
            super(0);
            this.f144312a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f144312a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$e */
    public static final class C63619e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144313a;

        static {
            Covode.recordClassIndex(74935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63619e(AbstractC12748a aVar) {
            super(0);
            this.f144313a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f144313a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$ah */
    static final class C63612ah extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f144305a;

        /* renamed from: b */
        final /* synthetic */ C63603k f144306b;

        static {
            Covode.recordClassIndex(74928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63612ah(Context context, C63603k kVar) {
            super(0);
            this.f144305a = context;
            this.f144306b = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f144306b.mo102228A();
            Context context = this.f144305a;
            C89219l.m154721d(context, "");
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
            C89219l.m154716b(feedbackConf, "");
            String str = feedbackConf.getNormalEntry().toString();
            int a = C89361p.m154888a((CharSequence) str, "hide_nav_bar", 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(0, a);
            C89219l.m154716b(substring, "");
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) substring).append((CharSequence) URLEncoder.encode("id=6420&"));
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring2 = str.substring(a);
            C89219l.m154716b(substring2, "");
            String spannableStringBuilder2 = append.append((CharSequence) substring2).toString();
            C89219l.m154716b(spannableStringBuilder2, "");
            SmartRouter.buildRoute(context, new C29844g(spannableStringBuilder2).mo52126a()).open();
            return C89391z.f203057a;
        }
    }

    public C63603k() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C63615ak akVar = new C63615ak(this);
        AbstractC89277c a = C89204ab.m154669a(ProfileEditPronounsSearchAndDisplayViewModel.class);
        C63604a aVar = new C63604a(a);
        C63624j jVar = C63624j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C63626l.INSTANCE, new C63627m(this), new C63628n(this), akVar, jVar, new C63629o(this), new C63630p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C63631q.INSTANCE, new C63616b(this), new C63617c(this), akVar, jVar, new C63618d(this), new C63619e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C63620f.INSTANCE, new C63621g(this), new C63622h(this), akVar, jVar, new C63623i(this), new C63625k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f144295u = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$v */
    public static final class C63636v extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C63603k f144326a;

        static {
            Covode.recordClassIndex(74952);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63636v(C63603k kVar) {
            this.f144326a = kVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i == 1) {
                KeyboardUtils.m70897c(this.f144326a.mo102234v());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$w */
    public static final class C63637w implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C63603k f144327a;

        static {
            Covode.recordClassIndex(74953);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63637w(C63603k kVar) {
            this.f144327a = kVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            C89219l.m154721d(editable, "");
            C63603k kVar = this.f144327a;
            ProfileEditPronounsSearchAndDisplayViewModel A = kVar.mo102228A();
            C63570d z = kVar.mo102238z();
            if (z != null) {
                str = z.f144254b;
            } else {
                str = null;
            }
            boolean a = C89219l.m154714a((Object) C89070n.m154551a(A.f144360k, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62), (Object) str);
            boolean z2 = true;
            if (!a) {
                ((AbstractC63601i) C12801d.m23018a(kVar, C89204ab.m154669a(AbstractC63601i.class))).mo102226x();
            } else {
                ((AbstractC63601i) C12801d.m23018a(kVar, C89204ab.m154669a(AbstractC63601i.class))).mo102225w();
                z2 = false;
            }
            kVar.f144285j = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void beforeTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            /*
            // Method dump skipped, instructions count: 230
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.C63603k.C63637w.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            C63603k kVar = this.f144327a;
            ProfileEditPronounsSearchAndDisplayViewModel A = kVar.mo102228A();
            PronounsEditText v = kVar.mo102234v();
            C89219l.m154721d(v, "");
            if (A.f144359j.length() != A.f144363n || !A.mo102253a((EditText) v, A.f144359j.length())) {
                ProfileEditPronounsSearchAndDisplayViewModel A2 = kVar.mo102228A();
                PronounsEditText v2 = kVar.mo102234v();
                C89219l.m154721d(v2, "");
                if (A2.mo102253a((EditText) v2, A2.f144359j.length() + 20)) {
                    kVar.mo102231a(1);
                    return;
                }
                String obj = charSequence.subSequence(this.f144327a.mo102228A().f144359j.length(), charSequence.length()).toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = C89361p.m154910b((CharSequence) obj).toString();
                if (obj2.length() == 0) {
                    C63603k kVar2 = this.f144327a;
                    kVar2.mo102236x().setVisibility(8);
                    kVar2.mo102235w().setVisibility(8);
                    return;
                }
                this.f144327a.mo102237y().onNext(obj2);
                return;
            }
            kVar.mo102234v().setCursorVisible(false);
            kVar.mo102231a(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo102231a(int i) {
        int i2;
        if (i == 0) {
            i2 = R.string.exq;
        } else if (i != 1) {
            i2 = R.string.dck;
        } else {
            i2 = R.string.d1o;
        }
        new C23144b(mo20528t()).mo37640e(i2).mo37637b();
    }

    /* renamed from: a */
    public final void mo102232a(List<String> list) {
        mo102235w().getState().mo28128a();
        if (list.isEmpty()) {
            mo102236x().setVisibility(0);
            mo102235w().setVisibility(8);
            return;
        }
        mo102235w().setVisibility(0);
        mo102236x().setVisibility(8);
        C17656f<AbstractC17641a> state = mo102235w().getState();
        mo102228A();
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(new C63661a(str));
        }
        state.mo28133a(arrayList);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$af */
    static final class C63610af<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C63603k f144303a;

        static {
            Covode.recordClassIndex(74926);
        }

        C63610af(C63603k kVar) {
            this.f144303a = kVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<String> arrayList;
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                ProfileEditPronounsSearchAndDisplayViewModel A = this.f144303a.mo102228A();
                C89219l.m154716b(str, "");
                C89219l.m154721d(str, "");
                C63644a aVar = new C63644a(str, A.f144359j.length());
                if (A.f144361l.containsKey(aVar)) {
                    arrayList = A.f144361l.get(aVar);
                    if (arrayList == null) {
                        return;
                    }
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ArrayList<C63645b> arrayList2 = new ArrayList();
                    int size = A.f144362m.size();
                    for (int i = 0; i < size; i++) {
                        int a = C89361p.m154887a((CharSequence) A.f144362m.get(i), str, 0, true);
                        int size2 = C89361p.m154921c(A.f144362m.get(i), new String[]{"/"}).size();
                        if (a != -1 && !linkedHashSet.contains(A.f144362m.get(i)) && size2 <= A.f144363n - A.f144359j.length()) {
                            linkedHashSet.add(A.f144362m.get(i));
                            arrayList2.add(new C63645b(A.f144362m.get(i), a, i));
                        }
                    }
                    C89070n.m154530a((List) arrayList2, (Comparator) ProfileEditPronounsSearchAndDisplayViewModel.C63674d.f144375a);
                    arrayList = new ArrayList<>();
                    for (C63645b bVar : arrayList2) {
                        arrayList.add(bVar.f144334a);
                    }
                    A.f144361l.put(aVar, arrayList);
                }
                this.f144303a.mo102232a(arrayList);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.AbstractC63643n
    /* renamed from: b */
    public final void mo102233b(int i) {
        int i2;
        boolean z;
        ProfileEditPronounsSearchAndDisplayViewModel A = mo102228A();
        PronounsEditText v = mo102234v();
        if (this.f144296v == null) {
            this.f144296v = new SparseArray();
        }
        View view = (View) this.f144296v.get(R.id.f92);
        if (view == null) {
            View t = mo20528t();
            if (t == null) {
                view = null;
            } else {
                view = t.findViewById(R.id.f92);
                this.f144296v.put(R.id.f92, view);
            }
        }
        C89219l.m154716b(view, "");
        View view2 = (View) this.f144286l.getValue();
        C89219l.m154721d(v, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        if (i > 0 && A.f144364o == null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            int[] iArr = {0, 0};
            view.getLocationInWindow(iArr);
            if (((float) (rect.bottom - iArr[1])) >= C89393b.m154948a(78.0f)) {
                z = true;
            } else {
                z = false;
            }
            A.f144364o = Boolean.valueOf(z);
        }
        Boolean bool = A.f144364o;
        if (bool != null) {
            bool.booleanValue();
            if (i > 0) {
                Editable text = v.getText();
                if (text != null) {
                    i2 = text.length();
                } else {
                    i2 = 0;
                }
                if (i2 != A.f144359j.length()) {
                    A.mo102252a(false, view2);
                    if (v.getMaxLines() != 1) {
                        v.setMaxLines(1);
                        return;
                    }
                    return;
                }
            }
            A.mo102252a(true, view2);
            if (i <= 0 && v.getMaxLines() == 1) {
                v.setMaxLines(A.f144365p);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        int i;
        String str;
        C89219l.m154721d(view, "");
        ProfileEditPronounsSearchAndDisplayViewModel A = mo102228A();
        C63555a aVar = (C63555a) C63556b.f144237b.getValue();
        Integer num = aVar.f144234a;
        if (num != null) {
            i = num.intValue();
        } else {
            i = A.f144363n;
        }
        A.f144363n = i;
        List<String> list = aVar.f144235b;
        if (list == null) {
            list = A.f144362m;
        }
        A.f144362m = list;
        Context az_ = az_();
        if (az_ != null) {
            ProfileEditPronounsSearchAndDisplayViewModel A2 = mo102228A();
            C63570d z = mo102238z();
            if (z == null || (str = z.f144254b) == null) {
                str = "";
            }
            C89219l.m154721d(az_, "");
            C89219l.m154721d(str, "");
            if (!C89219l.m154714a((Object) str, (Object) "")) {
                A2.mo102251a(az_, C89361p.m154915b(str, new String[]{"/"}));
            }
        }
        AbstractC12818f.C12819a.m23063a(this, mo102228A(), C63641l.f144331a, (C12854k) null, new C63614aj(this), 6);
        Context az_2 = az_();
        if (az_2 != null) {
            String string = az_2.getString(R.string.exm);
            C89219l.m154716b(string, "");
            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{Integer.valueOf(mo102228A().f144363n)}, 1));
            C89219l.m154716b(a, "");
            ((TuxTextView) this.f144287m.getValue()).setText(a);
        }
        AbstractC88412b a2 = mo102237y().mo143298f(300, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C63610af(this), C63611ag.f144304a);
        C89219l.m154716b(a2, "");
        C88934a.m154195a(a2, m115177E());
        PronounsEditText v = mo102234v();
        Editable text = v.getText();
        if (text != null) {
            mo102234v().setSelection(text.length());
        }
        v.setFocusable(true);
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.setOnLongClickListener(View$OnLongClickListenerC63613ai.f144307a);
        v.setLongClickable(false);
        v.setTextIsSelectable(false);
        v.setMovementMethod(C63678a.f144384a);
        mo102234v().setOnEditorActionListener(C63634t.f144324a);
        mo102234v().addTextChangedListener(new C63637w(this));
        mo102234v().setOnFocusChangeListener(View$OnFocusChangeListenerC63635u.f144325a);
        PowerList w = mo102235w();
        w.mo28083a(PronounCell.class);
        w.setLifecycleOwner(this);
        w.setItemAnimator(null);
        mo102235w().mo4405a(new C63636v(this));
        Context az_3 = az_();
        if (az_3 != null) {
            m115176D().setMovementMethod(C23136b.f54757a);
            String string2 = az_3.getString(R.string.cgu);
            C89219l.m154716b(string2, "");
            String string3 = az_3.getString(R.string.cgv);
            C89219l.m154716b(string3, "");
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string2);
            C23137c a3 = new C23137c().mo37624a(string3);
            a3.f54759b = false;
            a3.f54761d = 1;
            a3.f54760c = 42;
            a3.f54763f = new C63612ah(az_3, this);
            append.append((CharSequence) " ").append(a3.mo37625a(az_3));
            m115176D().setText(append);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$u */
    static final class View$OnFocusChangeListenerC63635u implements View.OnFocusChangeListener {

        /* renamed from: a */
        public static final View$OnFocusChangeListenerC63635u f144325a = new View$OnFocusChangeListenerC63635u();

        static {
            Covode.recordClassIndex(74951);
        }

        View$OnFocusChangeListenerC63635u() {
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                KeyboardUtils.m70896b(view);
            } else {
                KeyboardUtils.m70897c(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$aj */
    static final class C63614aj extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63603k f144308a;

        static {
            Covode.recordClassIndex(74930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63614aj(C63603k kVar) {
            super(2);
            this.f144308a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Boolean> aVar) {
            C89219l.m154721d(pVar, "");
            this.f144308a.mo102234v().setText(this.f144308a.mo102228A().f144359j);
            this.f144308a.mo102234v().setSelectionMinIndex(this.f144308a.mo102228A().f144359j.length());
            if (this.f144308a.mo102228A().f144359j.length() >= this.f144308a.mo102228A().f144363n) {
                this.f144308a.mo102234v().setCursorVisible(false);
            } else {
                this.f144308a.mo102234v().setCursorVisible(true);
                this.f144308a.mo102234v().setSelection(this.f144308a.mo102228A().f144359j.length());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.k$t */
    static final class C63634t implements TextView.OnEditorActionListener {

        /* renamed from: a */
        public static final C63634t f144324a = new C63634t();

        static {
            Covode.recordClassIndex(74950);
        }

        C63634t() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }
}
