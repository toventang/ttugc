package com.p2082ss.android.ugc.aweme.music.search.p3479b;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60622s;
import com.p2082ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.p2082ss.android.ugc.aweme.music.search.p3480ui.SearchView;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.Objects;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.music.search.b.a */
public final class C60930a extends AbstractC12769a {

    /* renamed from: j */
    final C12814b f138419j;

    /* renamed from: k */
    private final long f138420k = 300;

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$j */
    public static final class C60940j extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {
        public static final C60940j INSTANCE = new C60940j();

        static {
            Covode.recordClassIndex(71531);
        }

        public C60940j() {
            super(1);
        }

        public final C60622s invoke(C60622s sVar) {
            C89219l.m154719c(sVar, "");
            return sVar;
        }
    }

    static {
        Covode.recordClassIndex(71521);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$g */
    public static final class C60937g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138426a;

        static {
            Covode.recordClassIndex(71528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60937g(AbstractC12748a aVar) {
            super(0);
            this.f138426a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f138426a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$f */
    public static final class C60936f extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60936f INSTANCE = new C60936f();

        static {
            Covode.recordClassIndex(71527);
        }

        public C60936f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$h */
    public static final class C60938h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138427a;

        static {
            Covode.recordClassIndex(71529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60938h(AbstractC12748a aVar) {
            super(0);
            this.f138427a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f138427a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$l */
    public static final class C60942l extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60942l INSTANCE = new C60942l();

        static {
            Covode.recordClassIndex(71533);
        }

        public C60942l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$q */
    public static final class C60947q extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60947q INSTANCE = new C60947q();

        static {
            Covode.recordClassIndex(71538);
        }

        public C60947q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$u */
    public static final class C60951u implements SearchView.AbstractC61061a {

        /* renamed from: a */
        final /* synthetic */ C60930a f138438a;

        /* renamed from: b */
        final /* synthetic */ View f138439b;

        static {
            Covode.recordClassIndex(71542);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.search.p3480ui.SearchView.AbstractC61061a
        /* renamed from: a */
        public final void mo98559a() {
            C60930a.m110525c(this.f138439b);
        }

        C60951u(C60930a aVar, View view) {
            this.f138438a = aVar;
            this.f138439b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$i */
    public static final class C60939i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138428a;

        static {
            Covode.recordClassIndex(71530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60939i(AbstractC12748a aVar) {
            super(0);
            this.f138428a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f138428a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$k */
    public static final class C60941k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138429a;

        static {
            Covode.recordClassIndex(71532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60941k(AbstractC12748a aVar) {
            super(0);
            this.f138429a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f138429a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$a */
    public static final class C60931a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f138421a;

        static {
            Covode.recordClassIndex(71522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60931a(AbstractC89277c cVar) {
            super(0);
            this.f138421a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f138421a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$b */
    public static final class C60932b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138422a;

        static {
            Covode.recordClassIndex(71523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60932b(AbstractC12748a aVar) {
            super(0);
            this.f138422a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138422a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$c */
    public static final class C60933c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138423a;

        static {
            Covode.recordClassIndex(71524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60933c(AbstractC12748a aVar) {
            super(0);
            this.f138423a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138423a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$m */
    public static final class C60943m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138430a;

        static {
            Covode.recordClassIndex(71534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60943m(AbstractC12748a aVar) {
            super(0);
            this.f138430a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138430a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$n */
    public static final class C60944n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138431a;

        static {
            Covode.recordClassIndex(71535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60944n(AbstractC12748a aVar) {
            super(0);
            this.f138431a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138431a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$o */
    public static final class C60945o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138432a;

        static {
            Covode.recordClassIndex(71536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60945o(AbstractC12748a aVar) {
            super(0);
            this.f138432a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138432a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$p */
    public static final class C60946p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138433a;

        static {
            Covode.recordClassIndex(71537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60946p(AbstractC12748a aVar) {
            super(0);
            this.f138433a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f138433a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$r */
    static final class C60948r extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60930a f138434a;

        static {
            Covode.recordClassIndex(71539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60948r(C60930a aVar) {
            super(0);
            this.f138434a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f138434a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$d */
    public static final class C60934d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138424a;

        static {
            Covode.recordClassIndex(71525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60934d(AbstractC12748a aVar) {
            super(0);
            this.f138424a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138424a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$e */
    public static final class C60935e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f138425a;

        static {
            Covode.recordClassIndex(71526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60935e(AbstractC12748a aVar) {
            super(0);
            this.f138425a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138425a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C60930a() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C60948r rVar = new C60948r(this);
        AbstractC89277c a = C89204ab.m154669a(SearchMusicListViewModel.class);
        C60931a aVar = new C60931a(a);
        C60940j jVar = C60940j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C60942l.INSTANCE, new C60943m(this), new C60944n(this), rVar, jVar, new C60945o(this), new C60946p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C60947q.INSTANCE, new C60932b(this), new C60933c(this), rVar, jVar, new C60934d(this), new C60935e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C60936f.INSTANCE, new C60937g(this), new C60938h(this), rVar, jVar, new C60939i(this), new C60941k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f138419j = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$v */
    public static final class C60952v implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C60930a f138440a;

        static {
            Covode.recordClassIndex(71543);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C60952v(C60930a aVar) {
            this.f138440a = aVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String valueOf = String.valueOf(charSequence);
            SearchMusicListViewModel searchMusicListViewModel = (SearchMusicListViewModel) this.f138440a.f138419j.getValue();
            C89219l.m154721d(valueOf, "");
            searchMusicListViewModel.f138348l = valueOf;
            searchMusicListViewModel.mo98538l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$t */
    static final class View$OnClickListenerC60950t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60930a f138436a;

        /* renamed from: b */
        final /* synthetic */ View f138437b;

        static {
            Covode.recordClassIndex(71541);
        }

        View$OnClickListenerC60950t(C60930a aVar, View view) {
            this.f138436a = aVar;
            this.f138437b = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C60930a.m110525c(this.f138437b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$s */
    static final class View$OnClickListenerC60949s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60930a f138435a;

        static {
            Covode.recordClassIndex(71540);
        }

        View$OnClickListenerC60949s(C60930a aVar) {
            this.f138435a = aVar;
        }

        public final void onClick(View view) {
            ActivityC0945e activity;
            ClickAgent.onClick(view);
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f138435a);
            if (a != null && (activity = a.getActivity()) != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$z */
    static final class C60956z implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f138445a;

        static {
            Covode.recordClassIndex(71547);
        }

        C60956z(View view) {
            this.f138445a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TuxTextView tuxTextView = (TuxTextView) this.f138445a.findViewById(R.id.ewn);
            C89219l.m154716b(tuxTextView, "");
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            tuxTextView.setTranslationX(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: c */
    public static void m110525c(View view) {
        DmtEditText dmtEditText = (DmtEditText) view.findViewById(R.id.ax7);
        C89219l.m154716b(dmtEditText, "");
        if (String.valueOf(dmtEditText.getText()).length() > 0) {
            KeyboardUtils.m70897c(view.findViewById(R.id.ax7));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$x */
    static final class C60954x implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f138443a;

        static {
            Covode.recordClassIndex(71545);
        }

        C60954x(View view) {
            this.f138443a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            LinearLayout linearLayout = (LinearLayout) this.f138443a.findViewById(R.id.cef);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setAlpha(floatValue);
            TuxIconView tuxIconView = (TuxIconView) this.f138443a.findViewById(R.id.bsy);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setAlpha(floatValue);
            TuxTextView tuxTextView = (TuxTextView) this.f138443a.findViewById(R.id.ewn);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setAlpha(floatValue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$y */
    static final class C60955y implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f138444a;

        static {
            Covode.recordClassIndex(71546);
        }

        C60955y(View view) {
            this.f138444a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            LinearLayout linearLayout = (LinearLayout) this.f138444a.findViewById(R.id.cef);
            C89219l.m154716b(linearLayout, "");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            aVar.setMarginEnd(intValue);
            ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a(aVar);
            LinearLayout linearLayout2 = (LinearLayout) this.f138444a.findViewById(R.id.cef);
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setLayoutParams(aVar2);
            ((LinearLayout) this.f138444a.findViewById(R.id.cef)).requestLayout();
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        ((TuxIconView) view.findViewById(R.id.bsy)).setOnClickListener(new View$OnClickListenerC60949s(this));
        ((TuxTextView) view.findViewById(R.id.ewn)).setOnClickListener(new View$OnClickListenerC60950t(this, view));
        ((SearchView) view.findViewById(R.id.ed2)).setDispatchTouchEventListener(new C60951u(this, view));
        ((DmtEditText) view.findViewById(R.id.ax7)).addTextChangedListener(new C60952v(this));
        ((DmtEditText) view.findViewById(R.id.ax7)).setOnEditorActionListener(new C60953w(this, view));
        ((DmtEditText) view.findViewById(R.id.ax7)).requestFocus();
        KeyboardUtils.m70896b(view.findViewById(R.id.ax7));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ewn);
        C89219l.m154716b(tuxTextView, "");
        String obj = tuxTextView.getText().toString();
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.ewn);
        C89219l.m154716b(tuxTextView2, "");
        int measureText = (int) tuxTextView2.getPaint().measureText(obj);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C60954x(view));
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(this.f138420k);
        ValueAnimator ofInt = ValueAnimator.ofInt((int) C13628n.m24520b(view.getContext(), 16.0f), ((int) C13628n.m24520b(view.getContext(), 32.0f)) + measureText);
        ofInt.addUpdateListener(new C60955y(view));
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(this.f138420k);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((-C13628n.m24520b(view.getContext(), 16.0f)) + (((float) measureText) / 2.0f), 0.0f);
        ofFloat2.addUpdateListener(new C60956z(view));
        C89219l.m154716b(ofFloat2, "");
        ofFloat2.setDuration(this.f138420k);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).with(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$w */
    static final class C60953w implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C60930a f138441a;

        /* renamed from: b */
        final /* synthetic */ View f138442b;

        static {
            Covode.recordClassIndex(71544);
        }

        C60953w(C60930a aVar, View view) {
            this.f138441a = aVar;
            this.f138442b = view;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return true;
            }
            C60930a.m110525c(this.f138442b);
            return true;
        }
    }
}
