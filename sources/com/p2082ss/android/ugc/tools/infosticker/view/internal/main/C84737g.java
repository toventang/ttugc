package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84696g;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.utils.KeyboardUtils;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g */
public final class C84737g implements AbstractC84696g {

    /* renamed from: a */
    public EditText f189340a;

    /* renamed from: b */
    View f189341b;

    /* renamed from: c */
    C84747h f189342c;

    /* renamed from: d */
    final C88960c<C20169f<String>> f189343d;

    /* renamed from: e */
    final C88960c<Boolean> f189344e;

    /* renamed from: f */
    boolean f189345f;

    /* renamed from: g */
    public View f189346g;

    /* renamed from: h */
    C77268b f189347h;

    /* renamed from: i */
    final C84745h f189348i = new C84745h(this);

    /* renamed from: j */
    public final ViewGroup f189349j;

    /* renamed from: k */
    public final AbstractC89171a<AbstractC84632c<ProviderEffect>> f189350k;

    /* renamed from: l */
    final View f189351l;

    /* renamed from: m */
    final Activity f189352m;

    /* renamed from: n */
    final boolean f189353n;

    /* renamed from: o */
    private ViewGroup f189354o;

    /* renamed from: p */
    private View f189355p;

    /* renamed from: q */
    private final AbstractC89244h f189356q = C89250i.m154774a(EnumC89331m.NONE, new C84744g(this));

    /* renamed from: r */
    private final C84738a f189357r = new C84738a(this);

    /* renamed from: s */
    private final String f189358s;

    static {
        Covode.recordClassIndex(98713);
    }

    /* renamed from: c */
    public final AbstractC84632c<ProviderEffect> mo129646c() {
        return (AbstractC84632c) this.f189356q.getValue();
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$g */
    static final class C84744g extends AbstractC89220m implements AbstractC89171a<AbstractC84632c<ProviderEffect>> {

        /* renamed from: a */
        final /* synthetic */ C84737g f189365a;

        static {
            Covode.recordClassIndex(98720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84744g(C84737g gVar) {
            super(0);
            this.f189365a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC84632c<ProviderEffect> invoke() {
            return this.f189365a.f189350k.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84696g
    /* renamed from: b */
    public final AbstractC88979t<Boolean> mo129616b() {
        AbstractC88979t<Boolean> c = this.f189344e.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84696g
    /* renamed from: a */
    public final void mo129614a() {
        if (this.f189340a != null) {
            EditText editText = this.f189340a;
            if (editText == null) {
                C89219l.m154710a("searchEditView");
            }
            KeyboardUtils.m145810c(editText, this.f189349j.getContext());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo129647d() {
        EditText editText = this.f189340a;
        if (editText == null) {
            C89219l.m154710a("searchEditView");
        }
        editText.setText("");
        mo129645a("");
        View view = this.f189341b;
        if (view == null) {
            C89219l.m154710a("clearQueryButton");
        }
        view.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$i */
    static final class RunnableC84746i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C84737g f189367a;

        static {
            Covode.recordClassIndex(98722);
        }

        RunnableC84746i(C84737g gVar) {
            this.f189367a = gVar;
        }

        public final void run() {
            C84737g.m145657a(this.f189367a).requestFocus();
            C84737g.m145657a(this.f189367a).setCursorVisible(true);
            KeyboardUtils.m145809b(C84737g.m145657a(this.f189367a), this.f189367a.f189349j.getContext());
        }
    }

    /* renamed from: e */
    private final void m145658e() {
        if (this.f189340a == null) {
            View a = C1764a.m5927a(LayoutInflater.from(this.f189349j.getContext()), R.layout.b3x, this.f189349j, true);
            C89219l.m154716b(a, "");
            this.f189346g = a;
            if (a == null) {
                C89219l.m154710a("content");
            }
            View findViewById = a.findViewById(R.id.dm0);
            C89219l.m154716b(findViewById, "");
            this.f189354o = (ViewGroup) findViewById;
            View view = this.f189346g;
            if (view == null) {
                C89219l.m154710a("content");
            }
            View findViewById2 = view.findViewById(R.id.f32);
            C89219l.m154716b(findViewById2, "");
            this.f189340a = (EditText) findViewById2;
            View view2 = this.f189346g;
            if (view2 == null) {
                C89219l.m154710a("content");
            }
            View findViewById3 = view2.findViewById(R.id.x7);
            C89219l.m154716b(findViewById3, "");
            this.f189341b = findViewById3;
            View view3 = this.f189346g;
            if (view3 == null) {
                C89219l.m154710a("content");
            }
            View findViewById4 = view3.findViewById(R.id.f34);
            C89219l.m154716b(findViewById4, "");
            this.f189355p = findViewById4;
            Context context = this.f189349j.getContext();
            C89219l.m154716b(context, "");
            View view4 = this.f189346g;
            if (view4 == null) {
                C89219l.m154710a("content");
            }
            View view5 = this.f189355p;
            if (view5 == null) {
                C89219l.m154710a("hideListButton");
            }
            ViewGroup viewGroup = this.f189354o;
            if (viewGroup == null) {
                C89219l.m154710a("searchContainer");
            }
            this.f189342c = new C84747h(context, view4, view5, viewGroup);
            EditText editText = this.f189340a;
            if (editText == null) {
                C89219l.m154710a("searchEditView");
            }
            editText.clearFocus();
            EditText editText2 = this.f189340a;
            if (editText2 == null) {
                C89219l.m154710a("searchEditView");
            }
            editText2.setCursorVisible(false);
            String str = this.f189358s;
            if (str != null) {
                EditText editText3 = this.f189340a;
                if (editText3 == null) {
                    C89219l.m154710a("searchEditView");
                }
                editText3.setHint(str);
            }
            EditText editText4 = this.f189340a;
            if (editText4 == null) {
                C89219l.m154710a("searchEditView");
            }
            editText4.setOnEditorActionListener(new C84739b(this));
            EditText editText5 = this.f189340a;
            if (editText5 == null) {
                C89219l.m154710a("searchEditView");
            }
            editText5.addTextChangedListener(this.f189357r);
            EditText editText6 = this.f189340a;
            if (editText6 == null) {
                C89219l.m154710a("searchEditView");
            }
            editText6.setOnTouchListener(new View$OnTouchListenerC84740c(this));
            View view6 = this.f189341b;
            if (view6 == null) {
                C89219l.m154710a("clearQueryButton");
            }
            view6.setOnClickListener(new View$OnClickListenerC84741d(this));
            View view7 = this.f189355p;
            if (view7 == null) {
                C89219l.m154710a("hideListButton");
            }
            view7.setOnClickListener(new View$OnClickListenerC84742e(this));
            this.f189343d.mo143291d(600, TimeUnit.MILLISECONDS).mo143261a(C88392a.m153583a()).mo143254a(new C84743f(this), C84909p.f189747a);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$a */
    public static final class C84738a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C84737g f189359a;

        static {
            Covode.recordClassIndex(98714);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84738a(C84737g gVar) {
            this.f189359a = gVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            C84737g gVar = this.f189359a;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            View view = gVar.f189341b;
            if (view == null) {
                C89219l.m154710a("clearQueryButton");
            }
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            view.setVisibility(i);
            gVar.f189343d.onNext(C20171g.m38149a(str));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$h */
    public static final class C84745h implements C77268b.AbstractC77269a {

        /* renamed from: a */
        final /* synthetic */ C84737g f189366a;

        static {
            Covode.recordClassIndex(98721);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: c */
        public final void mo77540c(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84745h(C84737g gVar) {
            this.f189366a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: a */
        public final void mo77523a(int i) {
            this.f189366a.mo129646c();
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: b */
        public final void mo77535b(int i) {
            this.f189366a.mo129646c();
        }
    }

    /* renamed from: a */
    public final void mo129645a(String str) {
        mo129646c().mo114477a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$d */
    public static final class View$OnClickListenerC84741d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C84737g f189362a;

        static {
            Covode.recordClassIndex(98717);
        }

        View$OnClickListenerC84741d(C84737g gVar) {
            this.f189362a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f189362a.mo129647d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$f */
    public static final class C84743f<T> implements AbstractC88433f<C20169f<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C84737g f189364a;

        static {
            Covode.recordClassIndex(98719);
        }

        C84743f(C84737g gVar) {
            this.f189364a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20169f<? extends String> fVar) {
            this.f189364a.mo129645a((String) fVar.mo33486a());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m145657a(C84737g gVar) {
        EditText editText = gVar.f189340a;
        if (editText == null) {
            C89219l.m154710a("searchEditView");
        }
        return editText;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84696g
    /* renamed from: a */
    public final void mo129615a(boolean z) {
        int i;
        ViewGroup viewGroup = this.f189349j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
        if (z) {
            m145658e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$e */
    public static final class View$OnClickListenerC84742e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C84737g f189363a;

        static {
            Covode.recordClassIndex(98718);
        }

        View$OnClickListenerC84742e(C84737g gVar) {
            this.f189363a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C84737g gVar = this.f189363a;
            gVar.f189345f = false;
            gVar.mo129647d();
            gVar.f189351l.setVisibility(8);
            EditText editText = gVar.f189340a;
            if (editText == null) {
                C89219l.m154710a("searchEditView");
            }
            KeyboardUtils.m145810c(editText, gVar.f189349j.getContext());
            EditText editText2 = gVar.f189340a;
            if (editText2 == null) {
                C89219l.m154710a("searchEditView");
            }
            editText2.clearFocus();
            EditText editText3 = gVar.f189340a;
            if (editText3 == null) {
                C89219l.m154710a("searchEditView");
            }
            editText3.setCursorVisible(false);
            if (gVar.f189353n) {
                C84747h hVar = gVar.f189342c;
                if (hVar == null) {
                    C89219l.m154710a("showHideAnim");
                }
                hVar.mo129656a(false);
            }
            C77268b bVar = gVar.f189347h;
            if (bVar != null) {
                bVar.mo120870a();
            }
            gVar.f189347h = null;
            gVar.f189344e.onNext(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$c */
    public static final class View$OnTouchListenerC84740c implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C84737g f189361a;

        static {
            Covode.recordClassIndex(98716);
        }

        View$OnTouchListenerC84740c(C84737g gVar) {
            this.f189361a = gVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                C84737g gVar = this.f189361a;
                if (!gVar.f189345f) {
                    gVar.f189345f = true;
                    gVar.f189351l.setVisibility(0);
                    gVar.mo129646c().cK_();
                    EditText editText = gVar.f189340a;
                    if (editText == null) {
                        C89219l.m154710a("searchEditView");
                    }
                    editText.post(new RunnableC84746i(gVar));
                    if (gVar.f189353n) {
                        C84747h hVar = gVar.f189342c;
                        if (hVar == null) {
                            C89219l.m154710a("showHideAnim");
                        }
                        hVar.mo129656a(true);
                    }
                    Activity activity = gVar.f189352m;
                    C77268b bVar = null;
                    if (activity != null) {
                        bVar = new C77268b(activity, null);
                    }
                    gVar.f189347h = bVar;
                    C77268b bVar2 = gVar.f189347h;
                    if (bVar2 != null) {
                        bVar2.mo120871a(gVar.f189348i);
                    }
                    gVar.f189344e.onNext(true);
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$b */
    public static final class C84739b implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C84737g f189360a;

        static {
            Covode.recordClassIndex(98715);
        }

        C84739b(C84737g gVar) {
            this.f189360a = gVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            String str;
            if (i != 3) {
                return false;
            }
            C84737g gVar = this.f189360a;
            EditText editText = gVar.f189340a;
            if (editText == null) {
                C89219l.m154710a("searchEditView");
            }
            Editable text = editText.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                C85052j.C85053a.m146245a(gVar.f189349j.getContext(), (int) R.string.gzz, 0).mo129996a();
            } else {
                gVar.mo129645a(str);
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.view.a.c<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84737g(ViewGroup viewGroup, AbstractC89171a<? extends AbstractC84632c<ProviderEffect>> aVar, View view, Activity activity, String str, boolean z) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        this.f189349j = viewGroup;
        this.f189350k = aVar;
        this.f189351l = view;
        this.f189352m = activity;
        this.f189358s = str;
        this.f189353n = z;
        C88960c<C20169f<String>> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f189343d = cVar;
        C88960c<Boolean> cVar2 = new C88960c<>();
        C89219l.m154716b(cVar2, "");
        this.f189344e = cVar2;
        viewGroup.setVisibility(8);
    }
}
