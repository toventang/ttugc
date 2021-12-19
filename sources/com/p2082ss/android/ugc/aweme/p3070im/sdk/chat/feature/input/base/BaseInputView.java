package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46595g;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54101a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54232b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.SafeConversationConfirmation;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3130ui.ChatTopTip;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.SearchableEditText;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55172ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55195e;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView */
public abstract class BaseInputView implements View.OnClickListener, View.OnTouchListener, AbstractC54142b, AbstractC54232b.AbstractC54233a {

    /* renamed from: a */
    protected SearchableEditText f124021a;

    /* renamed from: b */
    protected TuxIconView f124022b;

    /* renamed from: c */
    protected TuxIconView f124023c;

    /* renamed from: d */
    protected View f124024d;

    /* renamed from: e */
    protected SoftInputResizeFuncLayoutView f124025e;

    /* renamed from: f */
    protected C54101a f124026f;

    /* renamed from: g */
    public boolean f124027g;

    /* renamed from: h */
    public boolean f124028h;

    /* renamed from: i */
    public boolean f124029i;

    /* renamed from: j */
    private AbstractC54142b.AbstractC54144b f124030j;

    /* renamed from: k */
    private final AbstractC89244h f124031k = C89250i.m154773a((AbstractC89171a) new C54127e(this));

    /* renamed from: l */
    private AbstractC54232b.AbstractC54233a f124032l;

    /* renamed from: m */
    private int f124033m = -1;

    /* renamed from: n */
    private final AbstractC89244h f124034n = C89250i.m154773a((AbstractC89171a) new C54128f(this));

    static {
        Covode.recordClassIndex(63800);
    }

    /* renamed from: a */
    public abstract C54101a.C54104b mo91199a(C54101a.C54104b bVar);

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91208a(AbstractView$OnClickListenerC54146d dVar) {
        C89219l.m154721d(dVar, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final AbstractC54142b mo91221g() {
        return (AbstractC54142b) this.f124031k.getValue();
    }

    /* renamed from: o */
    public abstract void mo91229o();

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    public void onPause() {
        AbstractC54145c.onPause(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    public void onResume() {
        AbstractC54145c.onResume(this);
    }

    /* renamed from: p */
    public abstract void mo91235p();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91211a(SearchableEditText searchableEditText) {
        C89219l.m154721d(searchableEditText, "");
        this.f124021a = searchableEditText;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public void mo91212a(String str) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            C89219l.m154721d(str, "");
            SearchableEditText searchableEditText = this.f124021a;
            if (searchableEditText == null) {
                C89219l.m154710a("editText");
            }
            Editable text = searchableEditText.getText();
            if (text != null && text.length() + str.length() > 6000) {
                Activity activity = null;
                if (1 != 0) {
                    Context i = mo91223i();
                    while (true) {
                        if (i != null) {
                            if (!(i instanceof Activity)) {
                                if (!(i instanceof ContextWrapper)) {
                                    break;
                                }
                                i = ((ContextWrapper) i).getBaseContext();
                            } else {
                                activity = (Activity) i;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    C55195e.m100910b(activity);
                    return;
                }
            }
            if (this.f124033m == -1) {
                mo91201a(-2);
            }
            SearchableEditText searchableEditText2 = this.f124021a;
            if (searchableEditText2 == null) {
                C89219l.m154710a("editText");
            }
            searchableEditText2.mo91539a(str);
        }
    }

    /* renamed from: a */
    public final void mo91213a(boolean z) {
        TuxIconView tuxIconView = this.f124022b;
        if (tuxIconView == null) {
            C89219l.m154710a("emojiBtn");
        }
        tuxIconView.setTuxIcon(z ? mo91252t() : mo91251s());
        TuxIconView tuxIconView2 = this.f124022b;
        if (tuxIconView2 == null) {
            C89219l.m154710a("emojiBtn");
        }
        tuxIconView2.setSelected(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91210a(AbstractC54232b.AbstractC54233a aVar) {
        this.f124032l = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView$f */
    static final class C54128f extends AbstractC89220m implements AbstractC89171a<View.OnKeyListener> {

        /* renamed from: a */
        final /* synthetic */ BaseInputView f124040a;

        static {
            Covode.recordClassIndex(63806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54128f(BaseInputView baseInputView) {
            super(0);
            this.f124040a = baseInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View.OnKeyListener invoke() {
            return new View.OnKeyListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView.C54128f.View$OnKeyListenerC541291 */

                /* renamed from: a */
                final /* synthetic */ C54128f f124041a;

                static {
                    Covode.recordClassIndex(63807);
                }

                {
                    this.f124041a = r1;
                }

                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (!C89219l.m154714a(view, this.f124041a.f124040a.mo91200a()) || i != 4) {
                        return false;
                    }
                    C89219l.m154716b(keyEvent, "");
                    if (keyEvent.getAction() == 0) {
                        return this.f124041a.f124040a.mo91250r();
                    }
                    return false;
                }
            };
        }
    }

    /* renamed from: s */
    private static C22999a mo91251s() {
        return C23005c.m43393a(C54123a.f124035a);
    }

    /* renamed from: t */
    private static C22999a mo91252t() {
        return C23005c.m43393a(C54124b.f124036a);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView$e */
    static final class C54127e extends AbstractC89220m implements AbstractC89171a<InputViewDelegate> {

        /* renamed from: a */
        final /* synthetic */ BaseInputView f124039a;

        static {
            Covode.recordClassIndex(63805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54127e(BaseInputView baseInputView) {
            super(0);
            this.f124039a = baseInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InputViewDelegate invoke() {
            BaseInputView baseInputView = this.f124039a;
            baseInputView.mo91223i();
            return new InputViewDelegate(baseInputView);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SearchableEditText mo91200a() {
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        return searchableEditText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final TuxIconView mo91214b() {
        TuxIconView tuxIconView = this.f124022b;
        if (tuxIconView == null) {
            C89219l.m154710a("emojiBtn");
        }
        return tuxIconView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final TuxIconView mo91217c() {
        TuxIconView tuxIconView = this.f124023c;
        if (tuxIconView == null) {
            C89219l.m154710a("sendBtn");
        }
        return tuxIconView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final View mo91218d() {
        View view = this.f124024d;
        if (view == null) {
            C89219l.m154710a("editLayout");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final SoftInputResizeFuncLayoutView mo91219e() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124025e;
        if (softInputResizeFuncLayoutView == null) {
            C89219l.m154710a("inputPanelView");
        }
        return softInputResizeFuncLayoutView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C54101a mo91220f() {
        C54101a aVar = this.f124026f;
        if (aVar == null) {
            C89219l.m154710a("emojiChoosePanelV2");
        }
        return aVar;
    }

    /* renamed from: h */
    public final boolean mo91222h() {
        if (this.f124026f != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: m */
    public final void mo91227m() {
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        searchableEditText.setText("");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: n */
    public final void mo91228n() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124025e;
        if (softInputResizeFuncLayoutView == null) {
            C89219l.m154710a("inputPanelView");
        }
        softInputResizeFuncLayoutView.mo91312a(-1);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    public void onDestroy() {
        C54101a aVar = this.f124026f;
        if (aVar == null) {
            C89219l.m154710a("emojiChoosePanelV2");
        }
        aVar.mo91184g();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView$d */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC54126d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ BaseInputView f124038a;

        static {
            Covode.recordClassIndex(63804);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC54126d(BaseInputView baseInputView) {
            this.f124038a = baseInputView;
        }

        public final void onGlobalLayout() {
            if (this.f124038a.mo91218d().getVisibility() != 0) {
                this.f124038a.mo91228n();
            }
        }
    }

    /* renamed from: i */
    public final Context mo91223i() {
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        Context context = searchableEditText.getContext();
        C89219l.m154716b(context, "");
        return context;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: l */
    public final void mo91226l() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        if (!searchableEditText.mo91538a()) {
            SearchableEditText searchableEditText2 = this.f124021a;
            if (searchableEditText2 == null) {
                C89219l.m154710a("editText");
            }
            searchableEditText2.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: j */
    public void mo91224j() {
        TuxIconView tuxIconView = this.f124023c;
        if (tuxIconView == null) {
            C89219l.m154710a("sendBtn");
        }
        tuxIconView.setOnClickListener(this);
        TuxIconView tuxIconView2 = this.f124022b;
        if (tuxIconView2 == null) {
            C89219l.m154710a("emojiBtn");
        }
        tuxIconView2.setOnClickListener(this);
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        searchableEditText.setFilters(new InputFilter[]{new C55172ad(searchableEditText)});
        searchableEditText.setOnKeyListener((View.OnKeyListener) this.f124034n.getValue());
        searchableEditText.setOnClickListener(this);
        searchableEditText.setOnTouchListener(this);
        searchableEditText.setOnFocusChangeListener(new View$OnFocusChangeListenerC54125c(this));
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124025e;
        if (softInputResizeFuncLayoutView == null) {
            C89219l.m154710a("inputPanelView");
        }
        softInputResizeFuncLayoutView.setOnPanelChangeListener(this);
        softInputResizeFuncLayoutView.setOnClickListener(this);
        View view = this.f124024d;
        if (view == null) {
            C89219l.m154710a("editLayout");
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC54126d(this));
    }

    /* renamed from: k */
    public final void mo91225k() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124025e;
        if (softInputResizeFuncLayoutView == null) {
            C89219l.m154710a("inputPanelView");
        }
        C54101a.C54104b bVar = new C54101a.C54104b(this, softInputResizeFuncLayoutView);
        C54101a.C54104b a = mo91199a(bVar);
        if (a != null) {
            bVar = a;
        }
        C46595g.C46596a.m89935a();
        if (C46597h.m89940b(1)) {
            bVar.mo91188b();
        } else {
            bVar.mo91187a();
        }
        C54101a g = bVar.mo91191e().mo91193g();
        this.f124026f = g;
        if (g == null) {
            C89219l.m154710a("emojiChoosePanelV2");
        }
        g.mo91178a(this);
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = this.f124025e;
        if (softInputResizeFuncLayoutView2 == null) {
            C89219l.m154710a("inputPanelView");
        }
        C54101a aVar = this.f124026f;
        if (aVar == null) {
            C89219l.m154710a("emojiChoosePanelV2");
        }
        softInputResizeFuncLayoutView2.mo91325a(aVar.f108227b);
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        softInputResizeFuncLayoutView2.setEditText(searchableEditText);
        softInputResizeFuncLayoutView2.setResizable(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView$g */
    public static final class C54130g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AbstractC54142b.AbstractC54143a f124042a;

        static {
            Covode.recordClassIndex(63808);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C54130g(AbstractC54142b.AbstractC54143a aVar) {
            this.f124042a = aVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            AbstractC54142b.AbstractC54143a aVar = this.f124042a;
            if (aVar != null) {
                aVar.mo91256a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91203a(View view) {
        C89219l.m154721d(view, "");
        this.f124024d = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo91215b(TuxIconView tuxIconView) {
        C89219l.m154721d(tuxIconView, "");
        this.f124023c = tuxIconView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView$a */
    public static final class C54123a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C54123a f124035a = new C54123a();

        static {
            Covode.recordClassIndex(63801);
        }

        C54123a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_3pt_dm_emoji;
            aVar2.f54436f = true;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView$b */
    public static final class C54124b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C54124b f124036a = new C54124b();

        static {
            Covode.recordClassIndex(63802);
        }

        C54124b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_3pt_keyboard;
            aVar2.f54436f = true;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91205a(TuxIconView tuxIconView) {
        C89219l.m154721d(tuxIconView, "");
        this.f124022b = tuxIconView;
    }

    /* renamed from: b */
    public void mo91216b(boolean z) {
        if (this.f124027g != z) {
            this.f124027g = z;
            SearchableEditText searchableEditText = this.f124021a;
            if (searchableEditText == null) {
                C89219l.m154710a("editText");
            }
            searchableEditText.setSelected(z);
            TuxIconView tuxIconView = this.f124022b;
            if (tuxIconView == null) {
                C89219l.m154710a("emojiBtn");
            }
            tuxIconView.setActivated(z);
        }
    }

    /* renamed from: a */
    public void mo91204a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        if (this.f124023c == null || this.f124022b == null || this.f124021a == null || this.f124025e == null || this.f124024d == null) {
            throw new Exception("Initialize views inside initViewRefs() method of child class");
        }
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124025e;
        if (softInputResizeFuncLayoutView == null) {
            C89219l.m154710a("inputPanelView");
        }
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        softInputResizeFuncLayoutView.setEditText(searchableEditText);
        softInputResizeFuncLayoutView.setResizable(true);
    }

    /* renamed from: a */
    public void mo91201a(int i) {
        ChatTopTip chatTopTip;
        SafeConversationConfirmation safeConversationConfirmation;
        if (i == -2) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124025e;
            if (softInputResizeFuncLayoutView == null) {
                C89219l.m154710a("inputPanelView");
            }
            softInputResizeFuncLayoutView.mo91313c();
            mo91229o();
        } else if (i == -1) {
            mo91228n();
            return;
        } else if (i == 1) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = this.f124025e;
            if (softInputResizeFuncLayoutView2 == null) {
                C89219l.m154710a("inputPanelView");
            }
            if (softInputResizeFuncLayoutView2.mo91327b() == 1) {
                mo91228n();
                return;
            }
            C54101a aVar = this.f124026f;
            if (aVar == null) {
                C89219l.m154710a("emojiChoosePanelV2");
            }
            aVar.mo91183f();
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView3 = this.f124025e;
            if (softInputResizeFuncLayoutView3 == null) {
                C89219l.m154710a("inputPanelView");
            }
            softInputResizeFuncLayoutView3.mo91312a(1);
            mo91235p();
        } else if (!(i == -2 || i == 1)) {
            return;
        }
        if (C55052e.m100673d()) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView4 = this.f124025e;
            if (softInputResizeFuncLayoutView4 == null) {
                C89219l.m154710a("inputPanelView");
            }
            Context context = softInputResizeFuncLayoutView4.getContext();
            C89219l.m154716b(context, "");
            while (context != null) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null && (safeConversationConfirmation = (SafeConversationConfirmation) activity.findViewById(R.id.d_k)) != null && safeConversationConfirmation.getVisibility() == 0) {
                        safeConversationConfirmation.getViewModel().mo91427a(1);
                        safeConversationConfirmation.setVisibility(8);
                        return;
                    }
                    return;
                } else if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return;
                }
            }
        } else if (C55052e.m100672c()) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView5 = this.f124025e;
            if (softInputResizeFuncLayoutView5 == null) {
                C89219l.m154710a("inputPanelView");
            }
            Context context2 = softInputResizeFuncLayoutView5.getContext();
            C89219l.m154716b(context2, "");
            while (context2 != null) {
                if (context2 instanceof Activity) {
                    Activity activity2 = (Activity) context2;
                    if (activity2 != null && (chatTopTip = (ChatTopTip) activity2.findViewById(R.id.a4b)) != null) {
                        chatTopTip.mo91439a();
                        return;
                    }
                    return;
                } else if (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                } else {
                    return;
                }
            }
        }
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 500)) {
            SearchableEditText searchableEditText = this.f124021a;
            if (searchableEditText == null) {
                C89219l.m154710a("editText");
            }
            if (!C89219l.m154714a(view, searchableEditText)) {
                TuxIconView tuxIconView = this.f124023c;
                if (tuxIconView == null) {
                    C89219l.m154710a("sendBtn");
                }
                if (C89219l.m154714a(view, tuxIconView)) {
                    mo91221g().mo91249q();
                    return;
                }
                TuxIconView tuxIconView2 = this.f124022b;
                if (tuxIconView2 == null) {
                    C89219l.m154710a("emojiBtn");
                }
                if (C89219l.m154714a(view, tuxIconView2)) {
                    TuxIconView tuxIconView3 = this.f124022b;
                    if (tuxIconView3 == null) {
                        C89219l.m154710a("emojiBtn");
                    }
                    TuxIconView tuxIconView4 = this.f124022b;
                    if (tuxIconView4 == null) {
                        C89219l.m154710a("emojiBtn");
                    }
                    tuxIconView3.setSelected(!tuxIconView4.isSelected());
                    TuxIconView tuxIconView5 = this.f124022b;
                    if (tuxIconView5 == null) {
                        C89219l.m154710a("emojiBtn");
                    }
                    if (tuxIconView5.isSelected()) {
                        mo91201a(1);
                    } else {
                        mo91201a(-2);
                    }
                    TuxIconView tuxIconView6 = this.f124022b;
                    if (tuxIconView6 == null) {
                        C89219l.m154710a("emojiBtn");
                    }
                    mo91213a(tuxIconView6.isSelected());
                }
            } else if (this.f124029i) {
                mo91213a(false);
                mo91201a(-2);
            } else {
                this.f124029i = true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91206a(AbstractC54142b.AbstractC54143a aVar) {
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        searchableEditText.addTextChangedListener(new C54130g(aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91207a(AbstractC54142b.AbstractC54144b bVar) {
        this.f124030j = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91209a(SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView) {
        C89219l.m154721d(softInputResizeFuncLayoutView, "");
        this.f124025e = softInputResizeFuncLayoutView;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView$c */
    static final class View$OnFocusChangeListenerC54125c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ BaseInputView f124037a;

        static {
            Covode.recordClassIndex(63803);
        }

        View$OnFocusChangeListenerC54125c(BaseInputView baseInputView) {
            this.f124037a = baseInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                this.f124037a.mo91228n();
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(motionEvent, "");
        SearchableEditText searchableEditText = this.f124021a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        if (C89219l.m154714a(view, searchableEditText) && motionEvent.getAction() == 1 && !this.f124028h) {
            mo91213a(false);
            mo91201a(-2);
            this.f124028h = true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r5 == -1) goto L_0x000c;
     */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54232b.AbstractC54233a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91202a(int r5, android.view.View r6) {
        /*
            r4 = this;
            r3 = -2
            r1 = -1
            r0 = 1
            r2 = 0
            if (r5 == r3) goto L_0x0042
            if (r5 == r1) goto L_0x0023
            if (r5 == r0) goto L_0x001f
            if (r5 != r1) goto L_0x000e
        L_0x000c:
            r2 = 8
        L_0x000e:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b$b r0 = r4.f124030j
            if (r0 == 0) goto L_0x0015
            r0.mo91257a(r2)
        L_0x0015:
            r4.f124033m = r5
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b$a r0 = r4.f124032l
            if (r0 == 0) goto L_0x001e
            r0.mo91202a(r5, r6)
        L_0x001e:
            return
        L_0x001f:
            r4.mo91216b(r0)
            goto L_0x000e
        L_0x0023:
            com.bytedance.tux.icon.TuxIconView r1 = r4.f124022b
            if (r1 != 0) goto L_0x002c
            java.lang.String r0 = "emojiBtn"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x002c:
            boolean r0 = r1.isSelected()
            if (r0 == 0) goto L_0x0035
            r4.mo91213a(r2)
        L_0x0035:
            r4.mo91216b(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a r0 = r4.f124026f
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "emojiChoosePanelV2"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
            goto L_0x000c
        L_0x0042:
            r4.mo91216b(r0)
            r4.mo91213a(r2)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView.mo91202a(int, android.view.View):void");
    }
}
