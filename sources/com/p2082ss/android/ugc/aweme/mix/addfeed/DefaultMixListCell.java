package com.p2082ss.android.ugc.aweme.mix.addfeed;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.p2082ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59395a;
import com.p2082ss.android.ugc.aweme.mix.editname.C59554a;
import com.p2082ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.p2082ss.android.ugc.aweme.mix.p3451f.C59621a;
import com.p2082ss.android.ugc.aweme.util.C80130h;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell */
public final class DefaultMixListCell extends PowerCell<C59377b> implements AbstractC20527q {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f135612a = {new C89232y(DefaultMixListCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/mix/addfeed/IMixFeedControl;", 0)};

    /* renamed from: r */
    public static final C59365p f135613r = new C59365p((byte) 0);

    /* renamed from: b */
    public EditText f135614b;

    /* renamed from: j */
    View f135615j;

    /* renamed from: k */
    LinearLayout f135616k;

    /* renamed from: l */
    public TuxSpinner f135617l;

    /* renamed from: m */
    public ImageView f135618m;

    /* renamed from: n */
    TextView f135619n;

    /* renamed from: o */
    public C80130h f135620o;

    /* renamed from: p */
    public C59377b f135621p;

    /* renamed from: q */
    public int f135622q = 25;

    /* renamed from: s */
    private TuxTextView f135623s;

    /* renamed from: t */
    private final AbstractC89248d f135624t = new C59364o(this);

    /* renamed from: u */
    private final C12814b f135625u;

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$g */
    public static final class C59356g extends AbstractC89220m implements AbstractC89172b<C59554a, C59554a> {
        public static final C59356g INSTANCE = new C59356g();

        static {
            Covode.recordClassIndex(69742);
        }

        public C59356g() {
            super(1);
        }

        public final C59554a invoke(C59554a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(69735);
    }

    /* renamed from: a */
    public final AbstractC59378c mo97023a() {
        return (AbstractC59378c) this.f135624t.mo23374a(this, f135612a[0]);
    }

    /* renamed from: b */
    public final EditPlayListNameEditTextVM mo97024b() {
        return (EditPlayListNameEditTextVM) this.f135625u.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$p */
    public static final class C59365p {
        static {
            Covode.recordClassIndex(69751);
        }

        private C59365p() {
        }

        public /* synthetic */ C59365p(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$t */
    static final class C59369t extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C59369t f135638a = new C59369t();

        static {
            Covode.recordClassIndex(69755);
        }

        C59369t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$b */
    public static final class C59351b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59351b INSTANCE = new C59351b();

        static {
            Covode.recordClassIndex(69737);
        }

        public C59351b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$c */
    public static final class C59352c extends AbstractC89220m implements AbstractC89171a<C12874b<C59554a>> {
        public static final C59352c INSTANCE = new C59352c();

        static {
            Covode.recordClassIndex(69738);
        }

        public C59352c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59554a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$h */
    public static final class C59357h extends AbstractC89220m implements AbstractC89171a<C12874b<C59554a>> {
        public static final C59357h INSTANCE = new C59357h();

        static {
            Covode.recordClassIndex(69743);
        }

        public C59357h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59554a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$k */
    public static final class C59360k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59360k INSTANCE = new C59360k();

        static {
            Covode.recordClassIndex(69746);
        }

        public C59360k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$l */
    public static final class C59361l extends AbstractC89220m implements AbstractC89171a<C12874b<C59554a>> {
        public static final C59361l INSTANCE = new C59361l();

        static {
            Covode.recordClassIndex(69747);
        }

        public C59361l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59554a> invoke() {
            return new C12874b<>();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$y */
    public static final class RunnableC59374y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135645a;

        static {
            Covode.recordClassIndex(69760);
        }

        RunnableC59374y(DefaultMixListCell defaultMixListCell) {
            this.f135645a = defaultMixListCell;
        }

        public final void run() {
            DefaultMixListCell.m109068c(this.f135645a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$a */
    public static final class C59350a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135626a;

        static {
            Covode.recordClassIndex(69736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59350a(AbstractC89277c cVar) {
            super(0);
            this.f135626a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135626a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$d */
    public static final class C59353d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135627a;

        static {
            Covode.recordClassIndex(69739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59353d(PowerCell powerCell) {
            super(0);
            this.f135627a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f135627a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f135627a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$e */
    public static final class C59354e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135628a;

        static {
            Covode.recordClassIndex(69740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59354e(PowerCell powerCell) {
            super(0);
            this.f135628a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f135628a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f135628a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$f */
    public static final class C59355f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135629a;

        static {
            Covode.recordClassIndex(69741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59355f(PowerCell powerCell) {
            super(0);
            this.f135629a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f135629a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f135629a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$i */
    public static final class C59358i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135630a;

        static {
            Covode.recordClassIndex(69744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59358i(PowerCell powerCell) {
            super(0);
            this.f135630a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f135630a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f135630a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f135630a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (ActivityC0945e) baseContext;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f135630a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$j */
    public static final class C59359j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135631a;

        static {
            Covode.recordClassIndex(69745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59359j(PowerCell powerCell) {
            super(0);
            this.f135631a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f135631a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f135631a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f135631a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (ActivityC0945e) baseContext;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f135631a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$m */
    public static final class C59362m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135632a;

        static {
            Covode.recordClassIndex(69748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59362m(PowerCell powerCell) {
            super(0);
            this.f135632a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f135632a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f135632a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f135632a.mo28070i();
                if (i3 != null) {
                    Fragment a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                    if (a != null) {
                        return a;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$n */
    public static final class C59363n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135633a;

        static {
            Covode.recordClassIndex(69749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59363n(PowerCell powerCell) {
            super(0);
            this.f135633a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f135633a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f135633a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f135633a.mo28070i();
                if (i3 != null) {
                    a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a != null && (viewModelStore = a.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$z */
    public static final class RunnableC59375z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135646a;

        /* renamed from: b */
        final /* synthetic */ boolean f135647b;

        static {
            Covode.recordClassIndex(69761);
        }

        RunnableC59375z(DefaultMixListCell defaultMixListCell, boolean z) {
            this.f135646a = defaultMixListCell;
            this.f135647b = z;
        }

        public final void run() {
            View view = this.f135646a.itemView;
            C89219l.m154716b(view, "");
            InputMethodManager inputMethodManager = (InputMethodManager) m109083a(view.getContext(), "input_method");
            DefaultMixListCell.m109067b(this.f135646a).setFocusable(this.f135647b);
            DefaultMixListCell.m109067b(this.f135646a).setFocusableInTouchMode(this.f135647b);
            if (this.f135647b) {
                DefaultMixListCell.m109067b(this.f135646a).requestFocus();
                DefaultMixListCell.m109067b(this.f135646a).setSelection(DefaultMixListCell.m109067b(this.f135646a).getText().toString().length());
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(DefaultMixListCell.m109067b(this.f135646a), 2);
                }
            } else if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(DefaultMixListCell.m109067b(this.f135646a).getWindowToken(), 0);
            }
        }

        /* renamed from: a */
        private static Object m109083a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(2421);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
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
                        MethodCollector.m26664o(2421);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: c */
    public final void mo97026c() {
        View view = this.f135615j;
        if (view == null) {
            C89219l.m154710a("inputLine");
        }
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view.setBackground(view2.getResources().getDrawable(R.color.b0));
        LinearLayout linearLayout = this.f135616k;
        if (linearLayout == null) {
            C89219l.m154710a("errorHint");
        }
        linearLayout.setVisibility(8);
        TuxSpinner tuxSpinner = this.f135617l;
        if (tuxSpinner == null) {
            C89219l.m154710a("loading");
        }
        tuxSpinner.postDelayed(new RunnableC59374y(this), 300);
        ImageView imageView = this.f135618m;
        if (imageView == null) {
            C89219l.m154710a("delete");
        }
        imageView.setVisibility(0);
        TextView textView = this.f135619n;
        if (textView == null) {
            C89219l.m154710a("errorHintText");
        }
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        textView.setText(view3.getContext().getText(R.string.dq0));
    }

    /* renamed from: e */
    public final void mo23352e() {
        C59377b bVar = this.f135621p;
        if (bVar == null) {
            C89219l.m154710a("defaultMixListItem");
        }
        if (bVar.f135651c) {
            C59377b bVar2 = this.f135621p;
            if (bVar2 == null) {
                C89219l.m154710a("defaultMixListItem");
            }
            View view = this.itemView;
            C89219l.m154716b(view, "");
            DmtEditText dmtEditText = (DmtEditText) view.findViewById(R.id.aij);
            C89219l.m154716b(dmtEditText, "");
            bVar2.f135592e = String.valueOf(dmtEditText.getText());
            AbstractC59378c a = mo97023a();
            if (a != null) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.aic);
                C89219l.m154716b(appCompatCheckBox, "");
                boolean isChecked = appCompatCheckBox.isChecked();
                C59377b bVar3 = this.f135621p;
                if (bVar3 == null) {
                    C89219l.m154710a("defaultMixListItem");
                }
                a.mo96998a(new AddFeedToMixFragment.C59339e(isChecked, bVar3.f135592e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$q */
    public static final class C59366q implements C80130h.AbstractC80131a {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135635a;

        static {
            Covode.recordClassIndex(69752);
        }

        @Override // com.p2082ss.android.ugc.aweme.util.C80130h.AbstractC80131a
        /* renamed from: a */
        public final void mo97028a() {
            if (C89219l.m154714a((Object) DefaultMixListCell.m109067b(this.f135635a).getText().toString(), (Object) "")) {
                DefaultMixListCell.m109068c(this.f135635a).setVisibility(8);
                DefaultMixListCell.m109069d(this.f135635a).setVisibility(8);
                DefaultMixListCell.m109070e(this.f135635a).f135651c = false;
                this.f135635a.mo97025b(false);
                return;
            }
            String obj = DefaultMixListCell.m109067b(this.f135635a).getText().toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (C89361p.m154910b((CharSequence) obj).toString().length() == 0) {
                this.f135635a.mo97026c();
                DefaultMixListCell.m109070e(this.f135635a).f135651c = false;
                this.f135635a.mo97025b(false);
            } else if (DefaultMixListCell.m109067b(this.f135635a).getText().toString().length() > this.f135635a.f135622q) {
                DefaultMixListCell.m109070e(this.f135635a).f135651c = false;
                this.f135635a.mo97025b(false);
            } else {
                DefaultMixListCell.m109068c(this.f135635a).setVisibility(0);
                DefaultMixListCell.m109069d(this.f135635a).setVisibility(8);
                this.f135635a.mo97024b().mo97156a(DefaultMixListCell.m109067b(this.f135635a).getText().toString());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59366q(DefaultMixListCell defaultMixListCell) {
            this.f135635a = defaultMixListCell;
        }
    }

    public DefaultMixListCell() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(EditPlayListNameEditTextVM.class);
        C59350a aVar2 = new C59350a(a);
        C59356g gVar = C59356g.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C59357h.INSTANCE, new C59358i(this), new C59359j(this), C59360k.INSTANCE, gVar);
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C59361l.INSTANCE, new C59362m(this), new C59363n(this), C59351b.INSTANCE, gVar);
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C59352c.INSTANCE, new C59353d(this), new C59354e(this), new C59355f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + aVar + " there");
        }
        this.f135625u = bVar;
    }

    /* renamed from: d */
    public final void mo23351d() {
        String str;
        C17191a.C17192a aVar = new C17191a.C17192a();
        EditText editText = this.f135614b;
        if (editText == null) {
            C89219l.m154710a("editText");
        }
        C17191a.C17192a a = aVar.mo27177a(String.valueOf(editText.getText().length()));
        if (C80471gb.m139482a()) {
            str = "‏\\";
        } else {
            str = "‎/";
        }
        C17191a aVar2 = a.mo27177a(str).mo27177a(String.valueOf(this.f135622q)).f40973a;
        EditText editText2 = this.f135614b;
        if (editText2 == null) {
            C89219l.m154710a("editText");
        }
        if (editText2.getText().length() > this.f135622q) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(view.getResources().getColor(R.color.bd));
            EditText editText3 = this.f135614b;
            if (editText3 == null) {
                C89219l.m154710a("editText");
            }
            aVar2.setSpan(foregroundColorSpan, 0, String.valueOf(editText3.getText().length()).length() + 1, 33);
            TuxTextView tuxTextView = this.f135623s;
            if (tuxTextView == null) {
                C89219l.m154710a("lengthHint");
            }
            tuxTextView.setText(aVar2);
            LinearLayout linearLayout = this.f135616k;
            if (linearLayout == null) {
                C89219l.m154710a("errorHint");
            }
            linearLayout.setVisibility(0);
            TextView textView = this.f135619n;
            if (textView == null) {
                C89219l.m154710a("errorHintText");
            }
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            textView.setText(view2.getContext().getText(R.string.ab_));
            View view3 = this.f135615j;
            if (view3 == null) {
                C89219l.m154710a("inputLine");
            }
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            view3.setBackground(view4.getResources().getDrawable(R.color.bd));
            mo97025b(false);
            return;
        }
        TuxTextView tuxTextView2 = this.f135623s;
        if (tuxTextView2 == null) {
            C89219l.m154710a("lengthHint");
        }
        tuxTextView2.setText(aVar2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        this.f135622q = C59621a.m109206a();
        this.f135620o = new C80130h(1000, new C59366q(this));
        View view = this.itemView;
        C89219l.m154716b(view, "");
        DmtEditText dmtEditText = (DmtEditText) view.findViewById(R.id.aij);
        C89219l.m154716b(dmtEditText, "");
        this.f135614b = dmtEditText;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.aio);
        C89219l.m154716b(tuxTextView, "");
        this.f135623s = tuxTextView;
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        View findViewById = view3.findViewById(R.id.aip);
        C89219l.m154716b(findViewById, "");
        this.f135615j = findViewById;
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        LinearLayout linearLayout = (LinearLayout) view4.findViewById(R.id.ain);
        C89219l.m154716b(linearLayout, "");
        this.f135616k = linearLayout;
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        TuxSpinner tuxSpinner = (TuxSpinner) view5.findViewById(R.id.air);
        C89219l.m154716b(tuxSpinner, "");
        this.f135617l = tuxSpinner;
        View view6 = this.itemView;
        C89219l.m154716b(view6, "");
        ImageView imageView = (ImageView) view6.findViewById(R.id.aii);
        C89219l.m154716b(imageView, "");
        this.f135618m = imageView;
        View view7 = this.itemView;
        C89219l.m154716b(view7, "");
        TuxTextView tuxTextView2 = (TuxTextView) view7.findViewById(R.id.aim);
        C89219l.m154716b(tuxTextView2, "");
        this.f135619n = tuxTextView2;
        EditText editText = this.f135614b;
        if (editText == null) {
            C89219l.m154710a("editText");
        }
        editText.addTextChangedListener(new C59372w(this));
        mo23351d();
        mo97026c();
        AssemViewModel.m23030a(mo97024b(), C59376a.f135648a, null, new C59368s(this), C59369t.f135638a, new C59367r(this), 2);
        ImageView imageView2 = this.f135618m;
        if (imageView2 == null) {
            C89219l.m154710a("delete");
        }
        imageView2.setVisibility(0);
        ImageView imageView3 = this.f135618m;
        if (imageView3 == null) {
            C89219l.m154710a("delete");
        }
        imageView3.setOnClickListener(new View$OnClickListenerC59373x(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$o */
    public static final class C59364o implements AbstractC89248d<Object, AbstractC59378c> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135634a;

        static {
            Covode.recordClassIndex(69750);
        }

        public C59364o(PowerCell powerCell) {
            this.f135634a = powerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            if (r0 == null) goto L_0x004b;
         */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.mix.addfeed.AbstractC59378c mo23374a(java.lang.Object r6, p4600h.p4620k.AbstractC89286i r7) {
            /*
            // Method dump skipped, instructions count: 149
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell.C59364o.mo23374a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$w */
    public static final class C59372w implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135643a;

        static {
            Covode.recordClassIndex(69758);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59372w(DefaultMixListCell defaultMixListCell) {
            this.f135643a = defaultMixListCell;
        }

        public final void afterTextChanged(Editable editable) {
            this.f135643a.mo97026c();
            this.f135643a.mo23351d();
            DefaultMixListCell.m109066a(this.f135643a).mo123588a();
            DefaultMixListCell.m109066a(this.f135643a).mo123589b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$x */
    static final class View$OnClickListenerC59373x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135644a;

        static {
            Covode.recordClassIndex(69759);
        }

        View$OnClickListenerC59373x(DefaultMixListCell defaultMixListCell) {
            this.f135644a = defaultMixListCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DefaultMixListCell.m109067b(this.f135644a).setText("");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C80130h m109066a(DefaultMixListCell defaultMixListCell) {
        C80130h hVar = defaultMixListCell.f135620o;
        if (hVar == null) {
            C89219l.m154710a("timer");
        }
        return hVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditText m109067b(DefaultMixListCell defaultMixListCell) {
        EditText editText = defaultMixListCell.f135614b;
        if (editText == null) {
            C89219l.m154710a("editText");
        }
        return editText;
    }

    /* renamed from: c */
    public static final /* synthetic */ TuxSpinner m109068c(DefaultMixListCell defaultMixListCell) {
        TuxSpinner tuxSpinner = defaultMixListCell.f135617l;
        if (tuxSpinner == null) {
            C89219l.m154710a("loading");
        }
        return tuxSpinner;
    }

    /* renamed from: d */
    public static final /* synthetic */ ImageView m109069d(DefaultMixListCell defaultMixListCell) {
        ImageView imageView = defaultMixListCell.f135618m;
        if (imageView == null) {
            C89219l.m154710a("delete");
        }
        return imageView;
    }

    /* renamed from: e */
    public static final /* synthetic */ C59377b m109070e(DefaultMixListCell defaultMixListCell) {
        C59377b bVar = defaultMixListCell.f135621p;
        if (bVar == null) {
            C89219l.m154710a("defaultMixListItem");
        }
        return bVar;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ake, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$s */
    static final class C59368s extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135637a;

        static {
            Covode.recordClassIndex(69754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59368s(DefaultMixListCell defaultMixListCell) {
            super(1);
            this.f135637a = defaultMixListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            DefaultMixListCell.m109070e(this.f135637a).f135651c = false;
            DefaultMixListCell.m109068c(this.f135637a).setVisibility(8);
            DefaultMixListCell.m109069d(this.f135637a).setVisibility(0);
            View view = this.f135637a.itemView;
            C89219l.m154716b(view, "");
            new C23144b(view).mo37640e(R.string.fz3).mo37637b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo97025b(boolean z) {
        AbstractC59378c a = mo97023a();
        if (a != null) {
            a.mo96997a(new AddFeedToMixFragment.C59335a(z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$u */
    static final class View$OnClickListenerC59370u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135639a;

        /* renamed from: b */
        final /* synthetic */ C59377b f135640b;

        static {
            Covode.recordClassIndex(69756);
        }

        View$OnClickListenerC59370u(DefaultMixListCell defaultMixListCell, C59377b bVar) {
            this.f135639a = defaultMixListCell;
            this.f135640b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.CheckBox");
            CheckBox checkBox = (CheckBox) view;
            if (!checkBox.isChecked()) {
                GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.m32713b(this.f135639a, GetMixListViewModel.class);
                if (getMixListViewModel == null || !getMixListViewModel.f135661j) {
                    checkBox.setChecked(!checkBox.isChecked());
                    return;
                }
                GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.m32713b(this.f135639a, GetMixListViewModel.class);
                if (getMixListViewModel2 != null) {
                    getMixListViewModel2.mo97042a(-1, (AddFeedToMixFragment.C59338d) null);
                }
            }
            this.f135639a.mo23352e();
            this.f135639a.mo64272a(this.f135640b.f135650b);
            this.f135639a.mo97025b(this.f135640b.f135651c);
            AbstractC59378c a = this.f135639a.mo97023a();
            if (a != null) {
                a.mo96999a(new AddFeedToMixFragment.C59340f(checkBox.isChecked(), this.f135640b.f135649a, this.f135639a.getAdapterPosition(), this.f135640b));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C59377b bVar) {
        int i;
        C59377b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        this.f135621p = bVar2;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view.findViewById(R.id.aic);
        C89219l.m154716b(appCompatCheckBox, "");
        appCompatCheckBox.setChecked(bVar2.f135650b);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        View findViewById = view2.findViewById(R.id.crx);
        C89219l.m154716b(findViewById, "");
        if (bVar2.f135650b) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        mo64272a(bVar2.f135650b);
        mo97025b(bVar2.f135651c);
        mo23352e();
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        ((TuxIconView) view3.findViewById(R.id.aiq)).setBackgroundResource(2131233256);
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        ((AppCompatCheckBox) view4.findViewById(R.id.aic)).setOnClickListener(new View$OnClickListenerC59370u(this, bVar2));
        this.itemView.setOnClickListener(new View$OnClickListenerC59371v(this, bVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$r */
    static final class C59367r extends AbstractC89220m implements AbstractC89172b<C59395a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135636a;

        static {
            Covode.recordClassIndex(69753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59367r(DefaultMixListCell defaultMixListCell) {
            super(1);
            this.f135636a = defaultMixListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59395a aVar) {
            CharSequence charSequence;
            boolean z;
            C59395a aVar2 = aVar;
            if (DefaultMixListCell.m109066a(this.f135636a).mo123590c()) {
                if (aVar2 == null || !aVar2.f135677c) {
                    DefaultMixListCell defaultMixListCell = this.f135636a;
                    if (aVar2 != null) {
                        charSequence = aVar2.f135678d;
                    } else {
                        charSequence = null;
                    }
                    View view = defaultMixListCell.f135615j;
                    if (view == null) {
                        C89219l.m154710a("inputLine");
                    }
                    View view2 = defaultMixListCell.itemView;
                    C89219l.m154716b(view2, "");
                    view.setBackground(view2.getResources().getDrawable(R.color.bd));
                    LinearLayout linearLayout = defaultMixListCell.f135616k;
                    if (linearLayout == null) {
                        C89219l.m154710a("errorHint");
                    }
                    linearLayout.setVisibility(0);
                    ImageView imageView = defaultMixListCell.f135618m;
                    if (imageView == null) {
                        C89219l.m154710a("delete");
                    }
                    imageView.setVisibility(0);
                    TextView textView = defaultMixListCell.f135619n;
                    if (textView == null) {
                        C89219l.m154710a("errorHintText");
                    }
                    if (TextUtils.isEmpty(charSequence)) {
                        View view3 = defaultMixListCell.itemView;
                        C89219l.m154716b(view3, "");
                        charSequence = view3.getContext().getText(R.string.dq0);
                    }
                    textView.setText(charSequence);
                    this.f135636a.mo97025b(false);
                    DefaultMixListCell.m109070e(this.f135636a).f135651c = false;
                } else {
                    DefaultMixListCell defaultMixListCell2 = this.f135636a;
                    EditText editText = defaultMixListCell2.f135614b;
                    if (editText == null) {
                        C89219l.m154710a("editText");
                    }
                    Editable text = editText.getText();
                    C89219l.m154716b(text, "");
                    if (text.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        EditText editText2 = defaultMixListCell2.f135614b;
                        if (editText2 == null) {
                            C89219l.m154710a("editText");
                        }
                        if (editText2.getText().length() <= defaultMixListCell2.f135622q) {
                            C59377b bVar = defaultMixListCell2.f135621p;
                            if (bVar == null) {
                                C89219l.m154710a("defaultMixListItem");
                            }
                            bVar.f135651c = true;
                            defaultMixListCell2.mo97025b(true);
                            this.f135636a.mo23352e();
                        }
                    }
                    C59377b bVar2 = defaultMixListCell2.f135621p;
                    if (bVar2 == null) {
                        C89219l.m154710a("defaultMixListItem");
                    }
                    bVar2.f135651c = false;
                    defaultMixListCell2.mo97025b(false);
                    this.f135636a.mo23352e();
                }
            }
            DefaultMixListCell.m109068c(this.f135636a).setVisibility(8);
            DefaultMixListCell.m109069d(this.f135636a).setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell$v */
    static final class View$OnClickListenerC59371v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DefaultMixListCell f135641a;

        /* renamed from: b */
        final /* synthetic */ C59377b f135642b;

        static {
            Covode.recordClassIndex(69757);
        }

        View$OnClickListenerC59371v(DefaultMixListCell defaultMixListCell, C59377b bVar) {
            this.f135641a = defaultMixListCell;
            this.f135642b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f135641a.itemView;
            C89219l.m154716b(view2, "");
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.aic);
            C89219l.m154716b(appCompatCheckBox, "");
            if (appCompatCheckBox.isChecked()) {
                GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.m32713b(this.f135641a, GetMixListViewModel.class);
                if (getMixListViewModel != null && getMixListViewModel.f135661j) {
                    GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.m32713b(this.f135641a, GetMixListViewModel.class);
                    if (getMixListViewModel2 != null) {
                        getMixListViewModel2.mo97042a(-1, (AddFeedToMixFragment.C59338d) null);
                    }
                } else {
                    return;
                }
            }
            View view3 = this.f135641a.itemView;
            C89219l.m154716b(view3, "");
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view3.findViewById(R.id.aic);
            C89219l.m154716b(appCompatCheckBox2, "");
            View view4 = this.f135641a.itemView;
            C89219l.m154716b(view4, "");
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view4.findViewById(R.id.aic);
            C89219l.m154716b(appCompatCheckBox3, "");
            appCompatCheckBox2.setChecked(true ^ appCompatCheckBox3.isChecked());
            this.f135641a.mo23352e();
            this.f135641a.mo64272a(this.f135642b.f135650b);
            this.f135641a.mo97025b(this.f135642b.f135651c);
            AbstractC59378c a = this.f135641a.mo97023a();
            if (a != null) {
                View view5 = this.f135641a.itemView;
                C89219l.m154716b(view5, "");
                AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) view5.findViewById(R.id.aic);
                C89219l.m154716b(appCompatCheckBox4, "");
                a.mo96999a(new AddFeedToMixFragment.C59340f(appCompatCheckBox4.isChecked(), this.f135642b.f135649a, this.f135641a.getAdapterPosition(), this.f135642b));
            }
        }
    }

    /* renamed from: a */
    public final void mo64272a(boolean z) {
        EditText editText = this.f135614b;
        if (editText == null) {
            C89219l.m154710a("editText");
        }
        editText.postDelayed(new RunnableC59375z(this, z), 300);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
