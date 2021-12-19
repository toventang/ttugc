package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71977b;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75572h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75654n;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75728c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76333e;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76337f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76368m;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.utils.KeyboardUtils;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85030e;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer */
public final class SearchStickerViewContainer implements TextView.OnEditorActionListener, AbstractC33974au, AbstractC76331c {

    /* renamed from: z */
    public static final C76297a f171376z = new C76297a((byte) 0);

    /* renamed from: A */
    private RelativeLayout f171377A;

    /* renamed from: B */
    private RelativeLayout f171378B;

    /* renamed from: C */
    private TextView f171379C;

    /* renamed from: D */
    private LinearLayout f171380D;

    /* renamed from: E */
    private RecyclerView f171381E;

    /* renamed from: F */
    private TextView f171382F;

    /* renamed from: G */
    private LinearLayout f171383G;

    /* renamed from: H */
    private final AbstractC75655o f171384H;

    /* renamed from: I */
    private final C88960c<AbstractC76333e> f171385I;

    /* renamed from: J */
    private final int f171386J;

    /* renamed from: K */
    private boolean f171387K;

    /* renamed from: L */
    private C88958b<String> f171388L;

    /* renamed from: M */
    private long f171389M;

    /* renamed from: N */
    private final C88411a f171390N;

    /* renamed from: O */
    private final C76318v f171391O;

    /* renamed from: P */
    private final RunnableC76317u f171392P;

    /* renamed from: Q */
    private final int f171393Q;

    /* renamed from: R */
    private final C75574j f171394R;

    /* renamed from: S */
    private final AbstractC89171a<C89391z> f171395S;

    /* renamed from: a */
    public View f171396a;

    /* renamed from: b */
    View f171397b;

    /* renamed from: c */
    public EditText f171398c;

    /* renamed from: d */
    public TextView f171399d;

    /* renamed from: e */
    public RecyclerView f171400e;

    /* renamed from: f */
    public LinearLayout f171401f;

    /* renamed from: g */
    public C76344h f171402g;

    /* renamed from: h */
    public AbstractC85027b<EnumC85026a> f171403h;

    /* renamed from: i */
    C76344h f171404i;

    /* renamed from: j */
    public final C88960c<C76343g> f171405j;

    /* renamed from: k */
    public final C1213t<AbstractC76337f> f171406k;

    /* renamed from: l */
    public C1213t<Boolean> f171407l;

    /* renamed from: m */
    public long f171408m;

    /* renamed from: n */
    public final AbstractC89171a<Boolean> f171409n;

    /* renamed from: o */
    public C76363k f171410o;

    /* renamed from: p */
    public C76332d f171411p;

    /* renamed from: q */
    public int f171412q;

    /* renamed from: r */
    boolean f171413r;

    /* renamed from: s */
    LinearLayoutManager f171414s;

    /* renamed from: t */
    public String f171415t;

    /* renamed from: u */
    public final ActivityC0945e f171416u;

    /* renamed from: v */
    public final View f171417v;

    /* renamed from: w */
    public final AbstractC76125l.C76127b f171418w;

    /* renamed from: x */
    public final AbstractC76329a f171419x;

    /* renamed from: y */
    public final int f171420y;

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$b */
    static final class View$OnClickListenerC76298b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC76298b f171421a = new View$OnClickListenerC76298b();

        static {
            Covode.recordClassIndex(89251);
        }

        View$OnClickListenerC76298b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(89249);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestory();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$a */
    public static final class C76297a {
        static {
            Covode.recordClassIndex(89250);
        }

        private C76297a() {
        }

        public /* synthetic */ C76297a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: f */
    public final LiveData<AbstractC76337f> mo120011f() {
        return this.f171406k;
    }

    /* renamed from: o */
    private final boolean m133754o() {
        if (this.f171393Q == 1) {
            return true;
        }
        return false;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    private final void onDestory() {
        this.f171390N.mo142944a();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$p */
    static final class C76312p extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171435a;

        static {
            Covode.recordClassIndex(89268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76312p(SearchStickerViewContainer searchStickerViewContainer) {
            super(0);
            this.f171435a = searchStickerViewContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (this.f171435a.mo120018m()) {
                return "1";
            }
            return "0";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$r */
    static final class C76314r extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171437a;

        static {
            Covode.recordClassIndex(89270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76314r(SearchStickerViewContainer searchStickerViewContainer) {
            super(0);
            this.f171437a = searchStickerViewContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (this.f171437a.mo120018m()) {
                return "1";
            }
            return "0";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$w */
    static final class C76319w extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171442a;

        static {
            Covode.recordClassIndex(89275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76319w(SearchStickerViewContainer searchStickerViewContainer) {
            super(0);
            this.f171442a = searchStickerViewContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f171442a.mo120018m());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: e */
    public final AbstractC88979t<AbstractC76333e> mo120010e() {
        AbstractC88979t<AbstractC76333e> c = this.f171385I.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: g */
    public final void mo120012g() {
        EditText editText = this.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        editText.requestFocus();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: i */
    public final void mo120014i() {
        C76344h hVar = this.f171402g;
        if (hVar == null) {
            C89219l.m154710a("stickerAdapter");
        }
        hVar.f171495b = false;
    }

    /* renamed from: l */
    public final String mo120017l() {
        if (mo120018m()) {
            return "1";
        }
        return "0";
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    private final void onPause() {
        if (mo120018m()) {
            this.f171387K = true;
            EditText editText = this.f171398c;
            if (editText == null) {
                C89219l.m154710a("etSearchInput");
            }
            KeyboardUtils.m145810c(editText, this.f171416u);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    private final void onStop() {
        EditText editText = this.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        editText.setText((CharSequence) null);
        mo120003a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: c */
    public final void mo120008c() {
        EditText editText = this.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        KeyboardUtils.m145810c(editText, this.f171416u);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: d */
    public final AbstractC88979t<C76343g> mo120009d() {
        AbstractC88979t<C76343g> c = this.f171405j.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: h */
    public final boolean mo120013h() {
        C76344h hVar = this.f171402g;
        if (hVar == null) {
            C89219l.m154710a("stickerAdapter");
        }
        if (hVar.f171495b) {
            return true;
        }
        C76344h hVar2 = this.f171404i;
        if (hVar2 == null) {
            C89219l.m154710a("recommendAdapter");
        }
        if (hVar2.f171495b) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo120015j() {
        int a;
        int i;
        if (this.f171394R.f169846h == 2) {
            a = (int) C84912r.m145930a(this.f171416u, 300.0f);
            i = this.f171412q;
        } else {
            a = (int) C84912r.m145930a(this.f171416u, 172.0f);
            i = this.f171412q;
        }
        return a + i;
    }

    /* renamed from: k */
    public final void mo120016k() {
        if (!mo120018m()) {
            if (m133754o()) {
                AbstractC89171a<C89391z> aVar = this.f171395S;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            mo120006b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo120018m() {
        Boolean value = this.f171407l.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$s */
    public static final class RunnableC76315s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171438a;

        static {
            Covode.recordClassIndex(89271);
        }

        RunnableC76315s(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171438a = searchStickerViewContainer;
        }

        public final void run() {
            SearchStickerViewContainer.m133749a(this.f171438a).requestFocus();
            SearchStickerViewContainer.m133749a(this.f171438a).onWindowFocusChanged(true);
            SearchStickerViewContainer.m133749a(this.f171438a).setImeOptions(3);
            KeyboardUtils.m145808a(SearchStickerViewContainer.m133749a(this.f171438a), this.f171438a.f171416u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$u */
    public static final class RunnableC76317u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171440a;

        static {
            Covode.recordClassIndex(89273);
        }

        public final void run() {
            if (this.f171440a.f171412q > 0) {
                this.f171440a.f171405j.onNext(new C76343g(true, true, false, this.f171440a.mo120015j()));
                return;
            }
            View view = this.f171440a.f171396a;
            if (view == null) {
                C89219l.m154710a("rootViewInternal");
            }
            view.postDelayed(this, 100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC76317u(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171440a = searchStickerViewContainer;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: a */
    public final View mo120000a() {
        View view = this.f171396a;
        if (view == null) {
            C89219l.m154710a("rootViewInternal");
        }
        return view;
    }

    /* renamed from: n */
    public final void mo120019n() {
        RecyclerView recyclerView = this.f171400e;
        if (recyclerView == null) {
            C89219l.m154710a("rvStickerContent");
        }
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            RecyclerView recyclerView2 = this.f171400e;
            if (recyclerView2 == null) {
                C89219l.m154710a("rvStickerContent");
            }
            RecyclerView.AbstractC1362i layoutManager = recyclerView2.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            ((GridLayoutManager) layoutManager).mo4320a(this.f171391O);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: b */
    public final void mo120006b() {
        EditText editText = this.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        editText.postDelayed(new RunnableC76315s(this), 100);
        AbstractC85027b<EnumC85026a> bVar = this.f171403h;
        if (bVar == null) {
            C89219l.m154710a("statusView");
        }
        bVar.setState(EnumC85026a.NONE);
        LinearLayout linearLayout = this.f171401f;
        if (linearLayout == null) {
            C89219l.m154710a("llStickerContainer");
        }
        linearLayout.setVisibility(0);
        if (C89219l.m154714a(this.f171419x.mo120035c(), AbstractC76368m.C76371c.f171556a)) {
            m133750a(this, false, 2);
        }
        if (this.f171420y == 2) {
            RecyclerView recyclerView = this.f171400e;
            if (recyclerView == null) {
                C89219l.m154710a("rvStickerContent");
            }
            recyclerView.mo4413b(0);
        }
        if (this.f171412q <= 0) {
            View view = this.f171396a;
            if (view == null) {
                C89219l.m154710a("rootViewInternal");
            }
            view.postDelayed(this.f171392P, 100);
            return;
        }
        this.f171405j.onNext(new C76343g(true, true, false, mo120015j()));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$d */
    public static final class C76300d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171423a;

        static {
            Covode.recordClassIndex(89253);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76300d(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171423a = searchStickerViewContainer;
        }

        public final void afterTextChanged(Editable editable) {
            int i;
            String str;
            SearchStickerViewContainer searchStickerViewContainer = this.f171423a;
            View view = searchStickerViewContainer.f171397b;
            if (view == null) {
                C89219l.m154710a("btnClearSearchText");
            }
            if (TextUtils.isEmpty(String.valueOf(editable))) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            searchStickerViewContainer.f171415t = str;
            if (str.length() == 0) {
                AbstractC85027b<EnumC85026a> bVar = searchStickerViewContainer.f171403h;
                if (bVar == null) {
                    C89219l.m154710a("statusView");
                }
                if (bVar.getState() != EnumC85026a.NONE) {
                    AbstractC85027b<EnumC85026a> bVar2 = searchStickerViewContainer.f171403h;
                    if (bVar2 == null) {
                        C89219l.m154710a("statusView");
                    }
                    bVar2.setState(EnumC85026a.NONE);
                    LinearLayout linearLayout = searchStickerViewContainer.f171401f;
                    if (linearLayout == null) {
                        C89219l.m154710a("llStickerContainer");
                    }
                    linearLayout.setVisibility(0);
                }
                SearchStickerViewContainer.m133750a(searchStickerViewContainer, false, 3);
            } else if (!C89219l.m154714a((Object) str, (Object) searchStickerViewContainer.f171419x.mo120036d().getValue())) {
                searchStickerViewContainer.mo120007b(searchStickerViewContainer.f171413r);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$g */
    public static final class C76303g implements C77268b.AbstractC77269a {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171426a;

        static {
            Covode.recordClassIndex(89256);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: c */
        public final void mo77540c(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76303g(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171426a = searchStickerViewContainer;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: a */
        public final void mo77523a(int i) {
            if (!this.f171426a.mo120018m()) {
                this.f171426a.f171412q = i;
                this.f171426a.f171407l.setValue(true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: b */
        public final void mo77535b(int i) {
            if (this.f171426a.mo120018m()) {
                this.f171426a.f171407l.setValue(false);
                if (SearchStickerViewContainer.m133751b(this.f171426a).getVisibility() != 0) {
                    this.f171426a.mo120003a(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$q */
    public static final class C76313q extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171436a;

        static {
            Covode.recordClassIndex(89269);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76313q(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171436a = searchStickerViewContainer;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (this.f171436a.mo120018m() && i == 1) {
                this.f171436a.mo120008c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$v */
    public static final class C76318v extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ SearchStickerViewContainer f171441e;

        static {
            Covode.recordClassIndex(89274);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76318v(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171441e = searchStickerViewContainer;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (i == 0) {
                return 5;
            }
            C76344h hVar = this.f171441e.f171402g;
            if (hVar == null) {
                C89219l.m154710a("stickerAdapter");
            }
            if (i == hVar.getItemCount() - 1) {
                return 5;
            }
            return 1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$e */
    static final class View$OnClickListenerC76301e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171424a;

        static {
            Covode.recordClassIndex(89254);
        }

        View$OnClickListenerC76301e(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171424a = searchStickerViewContainer;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f171424a.mo120016k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$m */
    static final class C76309m<T> implements AbstractC1214u<AbstractC76337f> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171432a;

        static {
            Covode.recordClassIndex(89265);
        }

        C76309m(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171432a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(AbstractC76337f fVar) {
            AbstractC76337f fVar2 = fVar;
            SearchStickerViewContainer searchStickerViewContainer = this.f171432a;
            C89219l.m154716b(fVar2, "");
            searchStickerViewContainer.mo120001a(fVar2);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m133749a(SearchStickerViewContainer searchStickerViewContainer) {
        EditText editText = searchStickerViewContainer.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m133751b(SearchStickerViewContainer searchStickerViewContainer) {
        RecyclerView recyclerView = searchStickerViewContainer.f171400e;
        if (recyclerView == null) {
            C89219l.m154710a("rvStickerContent");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ AbstractC85027b m133752c(SearchStickerViewContainer searchStickerViewContainer) {
        AbstractC85027b<EnumC85026a> bVar = searchStickerViewContainer.f171403h;
        if (bVar == null) {
            C89219l.m154710a("statusView");
        }
        return bVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ LinearLayout m133753d(SearchStickerViewContainer searchStickerViewContainer) {
        LinearLayout linearLayout = searchStickerViewContainer.f171401f;
        if (linearLayout == null) {
            C89219l.m154710a("llStickerContainer");
        }
        return linearLayout;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$h */
    static final class C76304h<T> implements AbstractC1214u<C75654n> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171427a;

        static {
            Covode.recordClassIndex(89259);
        }

        C76304h(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171427a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C75654n nVar) {
            Effect effect = nVar.f170068b;
            if (effect != null && this.f171427a.mo120005a(effect)) {
                this.f171427a.mo120003a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$k */
    static final class C76307k<T> implements AbstractC1214u<C76363k> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171430a;

        static {
            Covode.recordClassIndex(89263);
        }

        C76307k(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171430a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C76363k kVar) {
            C76363k kVar2 = kVar;
            List<Effect> list = kVar2.f171543b;
            if (list != null && !list.isEmpty()) {
                this.f171430a.f171410o = kVar2;
                SearchStickerViewContainer searchStickerViewContainer = this.f171430a;
                C89219l.m154716b(kVar2, "");
                searchStickerViewContainer.mo120002a(kVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$t */
    static final class C76316t extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171439a;

        static {
            Covode.recordClassIndex(89272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76316t(SearchStickerViewContainer searchStickerViewContainer) {
            super(1);
            this.f171439a = searchStickerViewContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            Object invoke;
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            AbstractC89172b<? super ViewGroup, ? extends View> bVar = this.f171439a.f171418w.f171029f.f169829c;
            if (bVar == null || (invoke = bVar.invoke(viewGroup2)) == null) {
                return C85030e.m146192a(viewGroup2);
            }
            return invoke;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$c */
    static final class View$OnClickListenerC76299c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171422a;

        static {
            Covode.recordClassIndex(89252);
        }

        View$OnClickListenerC76299c(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171422a = searchStickerViewContainer;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f171422a.f171406k.setValue(new AbstractC76337f.C76341d(this.f171422a.mo120017l()));
            SearchStickerViewContainer.m133749a(this.f171422a).setText((CharSequence) null);
            this.f171422a.mo120003a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$f */
    static final class View$OnClickListenerC76302f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171425a;

        static {
            Covode.recordClassIndex(89255);
        }

        View$OnClickListenerC76302f(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171425a = searchStickerViewContainer;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f171425a.f171406k.setValue(new AbstractC76337f.C76338a(this.f171425a.mo120017l()));
            this.f171425a.f171419x.mo120030a();
            this.f171425a.mo120016k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$i */
    static final class C76305i<T> implements AbstractC88433f<String> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171428a;

        static {
            Covode.recordClassIndex(89260);
        }

        C76305i(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171428a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(String str) {
            String str2 = str;
            if (C89219l.m154714a((Object) str2, (Object) this.f171428a.f171415t)) {
                this.f171428a.f171419x.mo120031a(new C75728c(null, str2, 50, null, this.f171428a.f171419x.mo120033b(), 25));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$j */
    static final class C76306j<T> implements AbstractC1214u<C76332d> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171429a;

        static {
            Covode.recordClassIndex(89262);
        }

        C76306j(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171429a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C76332d dVar) {
            C76332d dVar2 = dVar;
            List<Effect> list = dVar2.f171472a;
            if (list != null && !list.isEmpty()) {
                this.f171429a.f171411p = dVar2;
                SearchStickerViewContainer searchStickerViewContainer = this.f171429a;
                C89219l.m154716b(dVar2, "");
                C76344h hVar = searchStickerViewContainer.f171404i;
                if (hVar == null) {
                    C89219l.m154710a("recommendAdapter");
                }
                hVar.mo119952a((List) dVar2.f171472a.subList(0, 5));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$n */
    static final class C76310n<T> implements AbstractC1214u<String> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171433a;

        static {
            Covode.recordClassIndex(89266);
        }

        C76310n(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171433a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(String str) {
            String str2 = str;
            if (!C89219l.m154714a((Object) str2, (Object) SearchStickerViewContainer.m133749a(this.f171433a).getText().toString())) {
                SearchStickerViewContainer.m133749a(this.f171433a).setText(str2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$o */
    static final class C76311o<T> implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171434a;

        static {
            Covode.recordClassIndex(89267);
        }

        C76311o(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171434a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            int i;
            Boolean bool2 = bool;
            if (this.f171434a.f171420y == 2) {
                RecyclerView b = SearchStickerViewContainer.m133751b(this.f171434a);
                C89219l.m154716b(bool2, "");
                int i2 = 8;
                if (bool2.booleanValue()) {
                    i = 8;
                } else {
                    i = 0;
                }
                b.setVisibility(i);
                TextView textView = this.f171434a.f171399d;
                if (textView == null) {
                    C89219l.m154710a("tvSearchNullResult");
                }
                if (!bool2.booleanValue()) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo120001a(AbstractC76337f fVar) {
        C89219l.m154721d(fVar, "");
        this.f171406k.setValue(fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$l */
    static final class C76308l<T> implements AbstractC1214u<EnumC85026a> {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171431a;

        static {
            Covode.recordClassIndex(89264);
        }

        C76308l(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171431a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC85026a aVar) {
            EnumC85026a aVar2 = aVar;
            if (aVar2 != null) {
                int i = C76372n.f171557a[aVar2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        SearchStickerViewContainer.m133752c(this.f171431a).setState(EnumC85026a.NONE);
                        SearchStickerViewContainer.m133753d(this.f171431a).setVisibility(0);
                    } else if (i == 3) {
                        SearchStickerViewContainer.m133752c(this.f171431a).setState(EnumC85026a.NONE);
                        SearchStickerViewContainer.m133753d(this.f171431a).setVisibility(0);
                        this.f171431a.mo120004a(false, true);
                    } else if (i == 4) {
                        SearchStickerViewContainer.m133752c(this.f171431a).setState(EnumC85026a.NONE);
                        SearchStickerViewContainer.m133753d(this.f171431a).setVisibility(0);
                        this.f171431a.mo120004a(false, true);
                    }
                } else if (System.currentTimeMillis() - this.f171431a.f171408m > 500) {
                    SearchStickerViewContainer.m133752c(this.f171431a).setState(EnumC85026a.LOADING);
                    SearchStickerViewContainer.m133753d(this.f171431a).setVisibility(8);
                    this.f171431a.f171408m = System.currentTimeMillis();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo120002a(C76363k kVar) {
        EditText editText = this.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        if (TextUtils.isEmpty(editText.getText())) {
            m133750a(this, false, 3);
            return;
        }
        mo120019n();
        if (this.f171420y == 1) {
            LinearLayout linearLayout = this.f171383G;
            if (linearLayout == null) {
                C89219l.m154710a("recommendViewContainer");
            }
            linearLayout.setVisibility(8);
            if (m133754o()) {
                RecyclerView recyclerView = this.f171400e;
                if (recyclerView == null) {
                    C89219l.m154710a("rvStickerContent");
                }
                recyclerView.setVisibility(0);
                if (kVar.f171542a) {
                    TextView textView = this.f171399d;
                    if (textView == null) {
                        C89219l.m154710a("tvSearchNullResult");
                    }
                    textView.setVisibility(0);
                } else {
                    TextView textView2 = this.f171399d;
                    if (textView2 == null) {
                        C89219l.m154710a("tvSearchNullResult");
                    }
                    textView2.setVisibility(8);
                }
                C76344h hVar = this.f171402g;
                if (hVar == null) {
                    C89219l.m154710a("stickerAdapter");
                }
                hVar.mo120075a(kVar);
            } else if (kVar.f171542a) {
                RecyclerView recyclerView2 = this.f171400e;
                if (recyclerView2 == null) {
                    C89219l.m154710a("rvStickerContent");
                }
                recyclerView2.setVisibility(8);
                TextView textView3 = this.f171399d;
                if (textView3 == null) {
                    C89219l.m154710a("tvSearchNullResult");
                }
                textView3.setVisibility(8);
            } else {
                RecyclerView recyclerView3 = this.f171400e;
                if (recyclerView3 == null) {
                    C89219l.m154710a("rvStickerContent");
                }
                recyclerView3.setVisibility(0);
                TextView textView4 = this.f171399d;
                if (textView4 == null) {
                    C89219l.m154710a("tvSearchNullResult");
                }
                textView4.setVisibility(8);
                C76344h hVar2 = this.f171402g;
                if (hVar2 == null) {
                    C89219l.m154710a("stickerAdapter");
                }
                hVar2.mo120075a(kVar);
            }
        } else {
            RecyclerView recyclerView4 = this.f171400e;
            if (recyclerView4 == null) {
                C89219l.m154710a("rvStickerContent");
            }
            recyclerView4.setVisibility(0);
            C76344h hVar3 = this.f171402g;
            if (hVar3 == null) {
                C89219l.m154710a("stickerAdapter");
            }
            hVar3.mo120075a(kVar);
            if (kVar.f171542a) {
                TextView textView5 = this.f171399d;
                if (textView5 == null) {
                    C89219l.m154710a("tvSearchNullResult");
                }
                textView5.setVisibility(0);
            } else {
                TextView textView6 = this.f171399d;
                if (textView6 == null) {
                    C89219l.m154710a("tvSearchNullResult");
                }
                textView6.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f171383G;
            if (linearLayout2 == null) {
                C89219l.m154710a("recommendViewContainer");
            }
            linearLayout2.setVisibility(8);
            if (kVar.f171542a && mo120018m()) {
                RecyclerView recyclerView5 = this.f171400e;
                if (recyclerView5 == null) {
                    C89219l.m154710a("rvStickerContent");
                }
                recyclerView5.setVisibility(8);
                TextView textView7 = this.f171399d;
                if (textView7 == null) {
                    C89219l.m154710a("tvSearchNullResult");
                }
                textView7.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo120007b(boolean z) {
        EditText editText = this.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        String obj = editText.getText().toString();
        if (!TextUtils.isEmpty(obj)) {
            if (z) {
                RecyclerView recyclerView = this.f171400e;
                if (recyclerView == null) {
                    C89219l.m154710a("rvStickerContent");
                }
                if (recyclerView.getVisibility() == 0) {
                    EditText editText2 = this.f171398c;
                    if (editText2 == null) {
                        C89219l.m154710a("etSearchInput");
                    }
                    KeyboardUtils.m145810c(editText2, this.f171416u);
                }
            }
            this.f171389M = System.currentTimeMillis();
            this.f171388L.onNext(obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: a */
    public final void mo120003a(boolean z) {
        EditText editText = this.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        KeyboardUtils.m145810c(editText, this.f171416u);
        this.f171405j.onNext(new C76343g(false, mo120005a((Effect) null), z, mo120015j()));
        if (z) {
            this.f171385I.onNext(AbstractC76333e.C76334a.f171473a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c
    /* renamed from: a */
    public final boolean mo120005a(Effect effect) {
        if (effect == null) {
            effect = this.f171384H.mo119294f();
        }
        if (effect != null) {
            C76344h hVar = this.f171402g;
            if (hVar == null) {
                C89219l.m154710a("stickerAdapter");
            }
            for (T t : hVar.f171234h) {
                if (C89219l.m154714a((Object) t.getId(), (Object) effect.getId())) {
                    RecyclerView recyclerView = this.f171400e;
                    if (recyclerView == null) {
                        C89219l.m154710a("rvStickerContent");
                    }
                    if (recyclerView.getVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
            }
            C76344h hVar2 = this.f171404i;
            if (hVar2 == null) {
                C89219l.m154710a("recommendAdapter");
            }
            Iterator<T> it = hVar2.f171234h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C89219l.m154714a((Object) it.next().getId(), (Object) effect.getId())) {
                    RecyclerView recyclerView2 = this.f171381E;
                    if (recyclerView2 == null) {
                        C89219l.m154710a("recommendContent");
                    }
                    if (recyclerView2.getVisibility() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120004a(boolean r4, boolean r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0007
            com.ss.android.ugc.aweme.sticker.view.internal.search.a r0 = r3.f171419x
            r0.mo120030a()
        L_0x0007:
            java.lang.String r2 = "recommendText"
            if (r5 == 0) goto L_0x004e
            android.widget.EditText r1 = r3.f171398c
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "etSearchInput"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0014:
            android.text.Editable r0 = r1.getText()
            if (r0 == 0) goto L_0x004e
            android.widget.TextView r1 = r3.f171382F
            if (r1 != 0) goto L_0x0021
            p4600h.p4611f.p4613b.C89219l.m154710a(r2)
        L_0x0021:
            int r0 = com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71977b.f161302h
            r1.setText(r0)
        L_0x0026:
            android.widget.LinearLayout r1 = r3.f171383G
            if (r1 != 0) goto L_0x002f
            java.lang.String r0 = "recommendViewContainer"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x002f:
            r0 = 0
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r3.f171400e
            if (r1 != 0) goto L_0x003c
            java.lang.String r0 = "rvStickerContent"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x003c:
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r3.f171399d
            if (r1 != 0) goto L_0x004a
            java.lang.String r0 = "tvSearchNullResult"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x004a:
            r1.setVisibility(r2)
            return
        L_0x004e:
            android.widget.TextView r1 = r3.f171382F
            if (r1 != 0) goto L_0x0055
            p4600h.p4611f.p4613b.C89219l.m154710a(r2)
        L_0x0055:
            int r0 = com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71977b.f161304j
            r1.setText(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer.mo120004a(boolean, boolean):void");
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        mo120007b(true);
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m133750a(SearchStickerViewContainer searchStickerViewContainer, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        searchStickerViewContainer.mo120004a(z, false);
    }

    public /* synthetic */ SearchStickerViewContainer(ActivityC0945e eVar, View view, AbstractC76125l.C76127b bVar, AbstractC76329a aVar, int i, C75574j jVar) {
        this(eVar, view, bVar, aVar, 2, i, jVar, null);
    }

    public SearchStickerViewContainer(ActivityC0945e eVar, View view, AbstractC76125l.C76127b bVar, AbstractC76329a aVar, int i, int i2, C75574j jVar, AbstractC89171a<C89391z> aVar2) {
        LinearLayoutManager searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2;
        View view2 = view;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(jVar, "");
        MethodCollector.m26663i(5706);
        this.f171416u = eVar;
        this.f171417v = view2;
        this.f171418w = bVar;
        this.f171419x = aVar;
        this.f171393Q = i;
        this.f171420y = i2;
        this.f171394R = jVar;
        this.f171395S = aVar2;
        AbstractC75655o oVar = bVar.f171024a;
        this.f171384H = oVar;
        C88960c<C76343g> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f171405j = cVar;
        C88960c<AbstractC76333e> cVar2 = new C88960c<>();
        C89219l.m154716b(cVar2, "");
        this.f171385I = cVar2;
        C1213t<AbstractC76337f> tVar = new C1213t<>();
        this.f171406k = tVar;
        this.f171407l = new C1213t<>();
        this.f171409n = new C76319w(this);
        C88958b<String> bVar2 = new C88958b<>();
        C89219l.m154716b(bVar2, "");
        this.f171388L = bVar2;
        this.f171415t = "";
        C88411a aVar3 = new C88411a();
        this.f171390N = aVar3;
        this.f171391O = new C76318v(this);
        this.f171392P = new RunnableC76317u(this);
        this.f171386J = (int) C84912r.m145930a(eVar, 12.0f);
        if (!m133754o()) {
            View findViewById = view2.findViewById(R.id.ea4);
            if (findViewById != null) {
                view2 = ((ViewStub) findViewById).inflate();
                C89219l.m154716b(view2, "");
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                MethodCollector.m26664o(5706);
                throw nullPointerException;
            }
        }
        this.f171396a = view2;
        View findViewById2 = mo120000a().findViewById(R.id.dm0);
        C89219l.m154716b(findViewById2, "");
        this.f171377A = (RelativeLayout) findViewById2;
        View findViewById3 = mo120000a().findViewById(R.id.drf);
        C89219l.m154716b(findViewById3, "");
        this.f171378B = (RelativeLayout) findViewById3;
        View findViewById4 = mo120000a().findViewById(R.id.x9);
        C89219l.m154716b(findViewById4, "");
        this.f171397b = findViewById4;
        View findViewById5 = mo120000a().findViewById(R.id.ax6);
        C89219l.m154716b(findViewById5, "");
        this.f171398c = (EditText) findViewById5;
        View findViewById6 = mo120000a().findViewById(R.id.f35);
        C89219l.m154716b(findViewById6, "");
        this.f171379C = (TextView) findViewById6;
        View findViewById7 = mo120000a().findViewById(R.id.f37);
        C89219l.m154716b(findViewById7, "");
        this.f171399d = (TextView) findViewById7;
        View findViewById8 = mo120000a().findViewById(R.id.e93);
        C89219l.m154716b(findViewById8, "");
        this.f171400e = (RecyclerView) findViewById8;
        View findViewById9 = mo120000a().findViewById(R.id.dry);
        C89219l.m154716b(findViewById9, "");
        this.f171401f = (LinearLayout) findViewById9;
        View findViewById10 = mo120000a().findViewById(R.id.e95);
        C89219l.m154716b(findViewById10, "");
        this.f171380D = (LinearLayout) findViewById10;
        View findViewById11 = mo120000a().findViewById(R.id.dru);
        C89219l.m154716b(findViewById11, "");
        this.f171383G = (LinearLayout) findViewById11;
        View findViewById12 = mo120000a().findViewById(R.id.doc);
        C89219l.m154716b(findViewById12, "");
        this.f171381E = (RecyclerView) findViewById12;
        View findViewById13 = mo120000a().findViewById(R.id.f36);
        C89219l.m154716b(findViewById13, "");
        this.f171382F = (TextView) findViewById13;
        View findViewById14 = mo120000a().findViewById(R.id.drx);
        C89219l.m154716b(findViewById14, "");
        ViewGroup viewGroup = (ViewGroup) findViewById14;
        Map a = C89041ag.m154412a(C89387v.m154943a(EnumC85026a.LOADING, new C76316t(this)));
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        C85029d dVar = new C85029d(context, a, EnumC85026a.NONE, (byte) 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C84912r.m145930a(eVar, 100.0f));
        layoutParams.gravity = 48;
        dVar.setLayoutParams(layoutParams);
        viewGroup.addView(dVar);
        this.f171403h = dVar;
        EditText editText = this.f171398c;
        if (editText == null) {
            C89219l.m154710a("etSearchInput");
        }
        editText.setHint(C71977b.f161301g);
        TextView textView = this.f171379C;
        if (textView == null) {
            C89219l.m154710a("tvSearchCancel");
        }
        textView.setText(C71977b.f161300f);
        TextView textView2 = this.f171399d;
        if (textView2 == null) {
            C89219l.m154710a("tvSearchNullResult");
        }
        textView2.setText(C71977b.f161304j);
        TextView textView3 = this.f171382F;
        if (textView3 == null) {
            C89219l.m154710a("recommendText");
        }
        textView3.setText(C71977b.f161304j);
        if (jVar.f169846h == 2) {
            searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2 = new C76320x4fd3c66d(this);
        } else {
            searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2 = new C76321x4fd3c66e(this);
        }
        RecyclerView recyclerView = this.f171400e;
        if (recyclerView == null) {
            C89219l.m154710a("rvStickerContent");
        }
        recyclerView.setLayoutManager(searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2);
        RecyclerView recyclerView2 = this.f171400e;
        if (recyclerView2 == null) {
            C89219l.m154710a("rvStickerContent");
        }
        recyclerView2.setItemViewCacheSize(5);
        AbstractC76151g gVar = bVar.f171028e;
        C75572h hVar = bVar.f171029f;
        RecyclerView recyclerView3 = this.f171400e;
        if (recyclerView3 == null) {
            C89219l.m154710a("rvStickerContent");
        }
        this.f171402g = new C76344h(eVar, oVar, gVar, aVar, hVar, tVar, recyclerView3.getLayoutManager(), jVar.f169846h, new C76312p(this), (byte) 0);
        RecyclerView recyclerView4 = this.f171400e;
        if (recyclerView4 == null) {
            C89219l.m154710a("rvStickerContent");
        }
        C76344h hVar2 = this.f171402g;
        if (hVar2 == null) {
            C89219l.m154710a("stickerAdapter");
        }
        recyclerView4.setAdapter(hVar2);
        this.f171414s = searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2;
        RecyclerView recyclerView5 = this.f171400e;
        if (recyclerView5 == null) {
            C89219l.m154710a("rvStickerContent");
        }
        recyclerView5.mo4405a(new C76313q(this));
        C76322xc1d09527 searchStickerViewContainer$initRecyclerView$recommendLayoutManager$1 = new C76322xc1d09527(this);
        RecyclerView recyclerView6 = this.f171381E;
        if (recyclerView6 == null) {
            C89219l.m154710a("recommendContent");
        }
        recyclerView6.setLayoutManager(searchStickerViewContainer$initRecyclerView$recommendLayoutManager$1);
        RecyclerView recyclerView7 = this.f171381E;
        if (recyclerView7 == null) {
            C89219l.m154710a("recommendContent");
        }
        recyclerView7.setItemViewCacheSize(5);
        this.f171404i = new C76344h(eVar, oVar, bVar.f171028e, aVar, bVar.f171029f, tVar, this.f171414s, 3, new C76314r(this), (byte) 0);
        RecyclerView recyclerView8 = this.f171381E;
        if (recyclerView8 == null) {
            C89219l.m154710a("recommendContent");
        }
        C76344h hVar3 = this.f171404i;
        if (hVar3 == null) {
            C89219l.m154710a("recommendAdapter");
        }
        recyclerView8.setAdapter(hVar3);
        mo120000a().setOnClickListener(View$OnClickListenerC76298b.f171421a);
        TextView textView4 = this.f171379C;
        if (textView4 == null) {
            C89219l.m154710a("tvSearchCancel");
        }
        textView4.setOnClickListener(new View$OnClickListenerC76299c(this));
        EditText editText2 = this.f171398c;
        if (editText2 == null) {
            C89219l.m154710a("etSearchInput");
        }
        editText2.setOnEditorActionListener(this);
        EditText editText3 = this.f171398c;
        if (editText3 == null) {
            C89219l.m154710a("etSearchInput");
        }
        editText3.addTextChangedListener(new C76300d(this));
        EditText editText4 = this.f171398c;
        if (editText4 == null) {
            C89219l.m154710a("etSearchInput");
        }
        editText4.setOnClickListener(new View$OnClickListenerC76301e(this));
        View view3 = this.f171397b;
        if (view3 == null) {
            C89219l.m154710a("btnClearSearchText");
        }
        view3.setOnClickListener(new View$OnClickListenerC76302f(this));
        if (!m133754o()) {
            new C77268b(eVar, null).mo120871a(new C76303g(this));
        }
        oVar.mo119302n().mo119327d().observe(eVar, new C76304h(this));
        LinearLayout linearLayout = this.f171383G;
        if (linearLayout == null) {
            C89219l.m154710a("recommendViewContainer");
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.f171383G;
        if (linearLayout2 == null) {
            C89219l.m154710a("recommendViewContainer");
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        linearLayout2.setLayoutParams(layoutParams2);
        TextView textView5 = this.f171382F;
        if (textView5 == null) {
            C89219l.m154710a("recommendText");
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        textView5.setLayoutParams(layoutParams3);
        TextView textView6 = this.f171382F;
        if (textView6 == null) {
            C89219l.m154710a("recommendText");
        }
        textView6.setTextSize(14.0f);
        TextView textView7 = this.f171382F;
        if (textView7 == null) {
            C89219l.m154710a("recommendText");
        }
        Context context2 = mo120000a().getContext();
        C89219l.m154716b(context2, "");
        textView7.setTextColor(context2.getResources().getColor(R.color.f_));
        RecyclerView recyclerView9 = this.f171381E;
        if (recyclerView9 == null) {
            C89219l.m154710a("recommendContent");
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        Context context3 = mo120000a().getContext();
        C89219l.m154716b(context3, "");
        layoutParams4.topMargin = (int) C84912r.m145930a(context3, 8.0f);
        recyclerView9.setLayoutParams(layoutParams4);
        aVar.mo120039g().observe(eVar, new C76306j(this));
        aVar.mo120037e().observe(eVar, new C76307k(this));
        aVar.mo120101m().observe(eVar, new C76308l(this));
        if (!m133754o()) {
            aVar.mo120038f().observe(eVar, new C76309m(this));
        }
        aVar.mo120036d().observe(eVar, new C76310n(this));
        this.f171407l.observe(eVar, new C76311o(this));
        eVar.getLifecycle().mo4012a(this);
        aVar3.mo142945a(this.f171388L.mo143295e(500, TimeUnit.MILLISECONDS).mo143261a(C88392a.m153583a()).mo143289d(new C76305i(this)));
        if (m133754o()) {
            mo120000a().setBackground(null);
            mo120000a().setVisibility(0);
            TextView textView8 = this.f171379C;
            if (textView8 == null) {
                C89219l.m154710a("tvSearchCancel");
            }
            textView8.setVisibility(8);
            RelativeLayout relativeLayout = this.f171377A;
            if (relativeLayout == null) {
                C89219l.m154710a("rlSearchContainer");
            }
            ViewGroup.LayoutParams layoutParams5 = relativeLayout.getLayoutParams();
            if (layoutParams5 != null) {
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.leftMargin = (int) C84912r.m145930a(eVar, 8.5f);
                relativeLayout.setLayoutParams(layoutParams6);
                RecyclerView recyclerView10 = this.f171400e;
                if (recyclerView10 == null) {
                    C89219l.m154710a("rvStickerContent");
                }
                ViewGroup.LayoutParams layoutParams7 = recyclerView10.getLayoutParams();
                if (layoutParams7 != null) {
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.leftMargin = 0;
                    layoutParams8.rightMargin = 0;
                    recyclerView10.setLayoutParams(layoutParams8);
                    EditText editText5 = this.f171398c;
                    if (editText5 == null) {
                        C89219l.m154710a("etSearchInput");
                    }
                    editText5.setFocusableInTouchMode(false);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    MethodCollector.m26664o(5706);
                    throw nullPointerException2;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                MethodCollector.m26664o(5706);
                throw nullPointerException3;
            }
        } else {
            mo120000a().setVisibility(8);
            TextView textView9 = this.f171379C;
            if (textView9 == null) {
                C89219l.m154710a("tvSearchCancel");
            }
            textView9.setVisibility(0);
            EditText editText6 = this.f171398c;
            if (editText6 == null) {
                C89219l.m154710a("etSearchInput");
            }
            editText6.setFocusableInTouchMode(true);
        }
        if (jVar.f169843e > 0) {
            Context context4 = mo120000a().getContext();
            C89219l.m154716b(context4, "");
            int a2 = (int) C84912r.m145930a(context4, (float) jVar.f169843e);
            LinearLayout linearLayout3 = this.f171380D;
            if (linearLayout3 == null) {
                C89219l.m154710a("stickerContentRoot");
            }
            ViewGroup.LayoutParams layoutParams9 = linearLayout3.getLayoutParams();
            if (i2 == 2) {
                Context context5 = mo120000a().getContext();
                C89219l.m154716b(context5, "");
                layoutParams9.height = a2 - ((int) C84912r.m145930a(context5, 24.0f));
            } else {
                Context context6 = mo120000a().getContext();
                C89219l.m154716b(context6, "");
                layoutParams9.height = a2 - ((int) C84912r.m145930a(context6, 68.0f));
            }
            layoutParams9.height = -1;
            LinearLayout linearLayout4 = this.f171380D;
            if (linearLayout4 == null) {
                C89219l.m154710a("stickerContentRoot");
            }
            linearLayout4.setLayoutParams(layoutParams9);
        }
        MethodCollector.m26664o(5706);
    }
}
