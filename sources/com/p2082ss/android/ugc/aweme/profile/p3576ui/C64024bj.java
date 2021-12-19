package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23191e;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63803y;
import com.p2082ss.android.ugc.aweme.utils.C80533hg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bj */
public final class C64024bj extends AbstractC64098cl {

    /* renamed from: g */
    public static final C64025a f145183g = new C64025a((byte) 0);

    /* renamed from: a */
    public String f145184a = "";

    /* renamed from: b */
    public C88958b<Object> f145185b;

    /* renamed from: c */
    public EditText f145186c;

    /* renamed from: d */
    public TuxIconView f145187d;

    /* renamed from: f */
    public TextView f145188f;

    /* renamed from: h */
    private String f145189h = "";

    /* renamed from: i */
    private C88411a f145190i;

    /* renamed from: j */
    private AbstractC64026b f145191j;

    /* renamed from: k */
    private SparseArray f145192k;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bj$b */
    public interface AbstractC64026b {
        static {
            Covode.recordClassIndex(75470);
        }

        /* renamed from: a */
        void mo102003a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bj$f */
    static final class C64030f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64030f f145196a = new C64030f();

        static {
            Covode.recordClassIndex(75474);
        }

        C64030f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75468);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    /* renamed from: a */
    public final View mo102214a(int i) {
        if (this.f145192k == null) {
            this.f145192k = new SparseArray();
        }
        View view = (View) this.f145192k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145192k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final void cj_() {
        SparseArray sparseArray = this.f145192k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cj_();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bj$a */
    public static final class C64025a {
        static {
            Covode.recordClassIndex(75469);
        }

        private C64025a() {
        }

        public /* synthetic */ C64025a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C64024bj m115784a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C64024bj bjVar = new C64024bj();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", str);
            bundle.putString("content_value", str2);
            bjVar.setArguments(bundle);
            return bjVar;
        }
    }

    /* renamed from: a */
    public final EditText mo103591a() {
        EditText editText = this.f145186c;
        if (editText == null) {
            C89219l.m154710a("mEditContentInput");
        }
        return editText;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f145190i.mo142944a();
    }

    public C64024bj() {
        C88958b<Object> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f145185b = bVar;
        this.f145190i = new C88411a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bj$c */
    public static final class C64027c implements AbstractC23190d {

        /* renamed from: a */
        final /* synthetic */ C64024bj f145193a;

        static {
            Covode.recordClassIndex(75471);
        }

        @Override // com.bytedance.tux.navigation.p1723a.AbstractC23190d
        /* renamed from: a */
        public final void mo37744a() {
            KeyboardUtils.m70897c(this.f145193a.mo103591a());
            C63803y.m115397a("save_profile", "click_save", "bio");
            KeyboardUtils.m70897c(this.f145193a.mo103591a());
            this.f145193a.mo102217d();
            this.f145193a.dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64027c(C64024bj bjVar) {
            this.f145193a = bjVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    public final boolean ch_() {
        Dialog dialog;
        EditText editText = this.f145186c;
        if (editText == null) {
            C89219l.m154710a("mEditContentInput");
        }
        KeyboardUtils.m70897c(editText);
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    /* renamed from: d */
    public final void mo102217d() {
        int i;
        boolean z;
        AbstractC64026b bVar = this.f145191j;
        if (bVar != null) {
            EditText editText = this.f145186c;
            if (editText == null) {
                C89219l.m154710a("mEditContentInput");
            }
            String obj = editText.getText().toString();
            int length = obj.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (C89219l.m154703a(obj.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            }
            bVar.mo102003a(obj.subSequence(i2, length + 1).toString());
        }
    }

    /* renamed from: a */
    public final void mo103592a(AbstractC64026b bVar) {
        C89219l.m154721d(bVar, "");
        this.f145191j = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bj$g */
    public static final class C64031g implements TextWatcher {

        /* renamed from: a */
        public String f145197a = "";

        /* renamed from: b */
        final /* synthetic */ C64024bj f145198b;

        static {
            Covode.recordClassIndex(75475);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64031g(C64024bj bjVar) {
            this.f145198b = bjVar;
        }

        public final void afterTextChanged(Editable editable) {
            String substring;
            C89219l.m154721d(editable, "");
            if (this.f145198b.mo103591a().getLineCount() > 5) {
                String obj = editable.toString();
                int selectionStart = this.f145198b.mo103591a().getSelectionStart();
                if (selectionStart != this.f145198b.mo103591a().getSelectionEnd() || selectionStart >= obj.length() || selectionStart <= 0) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    substring = obj.substring(0, editable.length() - 1);
                    C89219l.m154716b(substring, "");
                } else {
                    StringBuilder sb = new StringBuilder();
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = obj.substring(0, selectionStart - 1);
                    C89219l.m154716b(substring2, "");
                    StringBuilder append = sb.append(substring2);
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    String substring3 = obj.substring(selectionStart);
                    C89219l.m154716b(substring3, "");
                    substring = append.append(substring3).toString();
                }
                this.f145197a = substring;
                this.f145198b.mo103591a().setText(substring);
                this.f145198b.mo103591a().setSelection(this.f145198b.mo103591a().getText().length());
                return;
            }
            this.f145197a = editable.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            boolean a = C64024bj.m116005a(this.f145198b.mo103591a(), 80);
            if (a) {
                this.f145198b.f145185b.onNext("");
            }
            C64024bj bjVar = this.f145198b;
            bjVar.mo103719a(a, bjVar.mo103591a().length(), 80);
            if (!TextUtils.equals(charSequence.toString(), this.f145198b.f145184a)) {
                this.f145198b.mo103721h();
            } else {
                this.f145198b.mo103722i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bj$d */
    static final class View$OnClickListenerC64028d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64024bj f145194a;

        static {
            Covode.recordClassIndex(75472);
        }

        View$OnClickListenerC64028d(C64024bj bjVar) {
            this.f145194a = bjVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EditText editText = this.f145194a.f145186c;
            if (editText == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText.setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bj$e */
    static final class C64029e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View f145195a;

        static {
            Covode.recordClassIndex(75473);
        }

        C64029e(View view) {
            this.f145195a = view;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(Object obj) {
            View view = this.f145195a;
            C89219l.m154716b(view, "");
            new C23144b(view).mo37640e(R.string.a4j).mo37637b();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            String string = arguments.getString("content_name");
            if (string == null) {
                C89219l.m154715b();
            }
            this.f145189h = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            String string2 = arguments2.getString("content_value");
            if (string2 == null) {
                C89219l.m154715b();
            }
            this.f145184a = string2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ana, viewGroup, false);
        ActivityC0945e activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C80533hg.m139603a(activity, window, true);
        View findViewById = a.findViewById(R.id.ax1);
        C89219l.m154716b(findViewById, "");
        this.f145186c = (EditText) findViewById;
        View findViewById2 = a.findViewById(R.id.bu3);
        C89219l.m154716b(findViewById2, "");
        this.f145187d = (TuxIconView) findViewById2;
        View findViewById3 = a.findViewById(R.id.evm);
        C89219l.m154716b(findViewById3, "");
        mo103718a((TextView) findViewById3);
        View findViewById4 = a.findViewById(R.id.evk);
        C89219l.m154716b(findViewById4, "");
        this.f145188f = (TextView) findViewById4;
        View findViewById5 = a.findViewById(R.id.bu3);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new View$OnClickListenerC64028d(this));
        }
        mo103720g().setVisibility(0);
        TuxIconView tuxIconView = this.f145187d;
        if (tuxIconView == null) {
            C89219l.m154710a("mClearAllBtn");
        }
        tuxIconView.setVisibility(8);
        TuxIconView tuxIconView2 = this.f145187d;
        if (tuxIconView2 == null) {
            C89219l.m154710a("mClearAllBtn");
        }
        tuxIconView2.setIconRes(R.raw.icon_x_mark_circle_fill);
        AbstractC88412b a2 = this.f145185b.mo143301g(3000, TimeUnit.MILLISECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C64029e(a), C64030f.f145196a);
        C89219l.m154716b(a2, "");
        C88934a.m154195a(a2, this.f145190i);
        EditText editText = this.f145186c;
        if (editText == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText.addTextChangedListener(new C64031g(this));
        EditText editText2 = this.f145186c;
        if (editText2 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText2.setText(this.f145184a);
        EditText editText3 = this.f145186c;
        if (editText3 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        EditText editText4 = this.f145186c;
        if (editText4 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText3.setSelection(editText4.getText().length());
        EditText editText5 = this.f145186c;
        if (editText5 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText5.setFocusable(true);
        EditText editText6 = this.f145186c;
        if (editText6 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText6.setFocusableInTouchMode(true);
        EditText editText7 = this.f145186c;
        if (editText7 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText7.requestFocus();
        this.f145418o = (TuxNavBar) a.findViewById(R.id.cpv);
        AbstractC23189c j = mo103723j();
        C23194g b = m116006b(this.f145189h);
        C23191e a3 = new C23191e().mo37748a((Object) "save");
        String string = getString(R.string.kk);
        C89219l.m154716b(string, "");
        C23191e a4 = a3.mo37749a(string).mo37745a((AbstractC23190d) new C64027c(this));
        TuxNavBar tuxNavBar = this.f145418o;
        if (tuxNavBar != null) {
            TuxNavBar.C23179a b2 = new TuxNavBar.C23179a().mo37732a(j).mo37731a(b).mo37733b(a4);
            b2.f54919d = true;
            tuxNavBar.setNavActions(b2);
        }
        mo103722i();
        return a;
    }
}
