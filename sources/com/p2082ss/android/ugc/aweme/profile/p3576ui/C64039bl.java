package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
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
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63803y;
import com.p2082ss.android.ugc.aweme.utils.C80533hg;
import com.p2082ss.android.ugc.trill.R;
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
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bl */
public final class C64039bl extends AbstractC64098cl {

    /* renamed from: n */
    public static final C64040a f145218n = new C64040a((byte) 0);

    /* renamed from: a */
    public String f145219a = "";

    /* renamed from: b */
    public boolean f145220b;

    /* renamed from: c */
    public String f145221c = "";

    /* renamed from: d */
    public int f145222d;

    /* renamed from: f */
    public boolean f145223f;

    /* renamed from: g */
    public boolean f145224g = true;

    /* renamed from: h */
    AbstractC89172b<? super Editable, Boolean> f145225h;

    /* renamed from: i */
    public C88958b<Object> f145226i;

    /* renamed from: j */
    public TextView f145227j;

    /* renamed from: k */
    public EditText f145228k;

    /* renamed from: l */
    public TuxIconView f145229l;

    /* renamed from: m */
    public TextView f145230m;

    /* renamed from: r */
    private String f145231r = "";

    /* renamed from: s */
    private C88411a f145232s;

    /* renamed from: t */
    private AbstractC64041b f145233t;

    /* renamed from: u */
    private SparseArray f145234u;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bl$b */
    public interface AbstractC64041b {
        static {
            Covode.recordClassIndex(75485);
        }

        /* renamed from: a */
        void mo102004a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bl$f */
    static final class C64045f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64045f f145238a = new C64045f();

        static {
            Covode.recordClassIndex(75489);
        }

        C64045f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75483);
    }

    /* renamed from: a */
    public static final C64039bl m115798a(String str, String str2, String str3, int i, boolean z) {
        return C64040a.m115806a(str, str2, str3, i, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    /* renamed from: a */
    public final View mo102214a(int i) {
        if (this.f145234u == null) {
            this.f145234u = new SparseArray();
        }
        View view = (View) this.f145234u.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145234u.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final void cj_() {
        SparseArray sparseArray = this.f145234u;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cj_();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bl$a */
    public static final class C64040a {
        static {
            Covode.recordClassIndex(75484);
        }

        private C64040a() {
        }

        public /* synthetic */ C64040a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C64039bl m115806a(String str, String str2, String str3, int i, boolean z) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C64039bl blVar = new C64039bl();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", str);
            bundle.putString("content_value", str2);
            bundle.putBoolean("is_edit_enabled", true);
            bundle.putString("edit_hint", str3);
            bundle.putInt("content_max_length", i);
            bundle.putBoolean("is_enable_null", z);
            blVar.setArguments(bundle);
            return blVar;
        }
    }

    /* renamed from: a */
    public final EditText mo103606a() {
        EditText editText = this.f145228k;
        if (editText == null) {
            C89219l.m154710a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: c */
    public final TuxIconView mo103609c() {
        TuxIconView tuxIconView = this.f145229l;
        if (tuxIconView == null) {
            C89219l.m154710a("mClearAllBtn");
        }
        return tuxIconView;
    }

    /* renamed from: e */
    public final TextView mo103610e() {
        TextView textView = this.f145230m;
        if (textView == null) {
            C89219l.m154710a("mIdEditHintText");
        }
        return textView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f145232s.mo142944a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bl$c */
    public static final class C64042c implements AbstractC23190d {

        /* renamed from: a */
        final /* synthetic */ C64039bl f145235a;

        static {
            Covode.recordClassIndex(75486);
        }

        @Override // com.bytedance.tux.navigation.p1723a.AbstractC23190d
        /* renamed from: a */
        public final void mo37744a() {
            KeyboardUtils.m70897c(this.f145235a.mo103606a());
            C63803y.m115397a("save_profile", "click_save", StringSet.name);
            this.f145235a.mo102217d();
            this.f145235a.dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64042c(C64039bl blVar) {
            this.f145235a = blVar;
        }
    }

    public C64039bl() {
        C88958b<Object> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f145226i = bVar;
        this.f145232s = new C88411a();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    /* renamed from: d */
    public final void mo102217d() {
        AbstractC64041b bVar = this.f145233t;
        if (bVar != null) {
            EditText editText = this.f145228k;
            if (editText == null) {
                C89219l.m154710a("mEditContentInput");
            }
            bVar.mo102004a(editText.getText().toString());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    public final boolean ch_() {
        Dialog dialog;
        EditText editText = this.f145228k;
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

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bl$g */
    public static final class C64046g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C64039bl f145239a;

        static {
            Covode.recordClassIndex(75490);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64046g(C64039bl blVar) {
            this.f145239a = blVar;
        }

        public final void afterTextChanged(Editable editable) {
            C89219l.m154721d(editable, "");
            if (this.f145239a.f145220b) {
                if (editable.length() <= 0 && !this.f145239a.f145223f) {
                    this.f145239a.mo103722i();
                } else if (TextUtils.equals(editable.toString(), this.f145239a.f145219a) || !this.f145239a.mo103608a(editable)) {
                    this.f145239a.mo103722i();
                } else {
                    this.f145239a.mo103721h();
                }
                if (editable.length() > 0) {
                    this.f145239a.mo103609c().setVisibility(0);
                } else {
                    this.f145239a.mo103609c().setVisibility(8);
                }
                if (this.f145239a.f145224g) {
                    return;
                }
                if (editable.length() != 0 && !this.f145239a.mo103608a(editable)) {
                    this.f145239a.mo103610e().setVisibility(0);
                    this.f145239a.mo103610e().setText(this.f145239a.f145221c);
                    return;
                }
                this.f145239a.mo103610e().setVisibility(8);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            if (this.f145239a.f145222d != 0) {
                boolean a = C64039bl.m116005a(this.f145239a.mo103606a(), this.f145239a.f145222d);
                if (a) {
                    this.f145239a.f145226i.onNext("");
                }
                C64039bl blVar = this.f145239a;
                blVar.mo103719a(a, blVar.mo103606a().length(), this.f145239a.f145222d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bl$d */
    static final class View$OnClickListenerC64043d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64039bl f145236a;

        static {
            Covode.recordClassIndex(75487);
        }

        View$OnClickListenerC64043d(C64039bl blVar) {
            this.f145236a = blVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EditText editText = this.f145236a.f145228k;
            if (editText == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText.setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bl$e */
    static final class C64044e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View f145237a;

        static {
            Covode.recordClassIndex(75488);
        }

        C64044e(View view) {
            this.f145237a = view;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(Object obj) {
            View view = this.f145237a;
            C89219l.m154716b(view, "");
            new C23144b(view).mo37640e(R.string.a4j).mo37637b();
        }
    }

    /* renamed from: a */
    public final void mo103607a(AbstractC64041b bVar) {
        C89219l.m154721d(bVar, "");
        this.f145233t = bVar;
    }

    /* renamed from: a */
    public final boolean mo103608a(Editable editable) {
        AbstractC89172b<? super Editable, Boolean> bVar = this.f145225h;
        if (bVar == null || bVar.invoke(editable).booleanValue()) {
            return true;
        }
        return false;
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
            this.f145231r = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            String string2 = arguments2.getString("content_value");
            if (string2 == null) {
                C89219l.m154715b();
            }
            this.f145219a = string2;
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                C89219l.m154715b();
            }
            this.f145220b = arguments3.getBoolean("is_edit_enabled");
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                C89219l.m154715b();
            }
            String string3 = arguments4.getString("edit_hint");
            if (string3 == null) {
                C89219l.m154715b();
            }
            this.f145221c = string3;
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                C89219l.m154715b();
            }
            this.f145222d = arguments5.getInt("content_max_length");
            Bundle arguments6 = getArguments();
            if (arguments6 == null) {
                C89219l.m154715b();
            }
            this.f145223f = arguments6.getBoolean("is_enable_null");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bl$h */
    static final class C64047h implements TextView.OnEditorActionListener {

        /* renamed from: a */
        public static final C64047h f145240a = new C64047h();

        static {
            Covode.recordClassIndex(75491);
        }

        C64047h() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.anb, viewGroup, false);
        ActivityC0945e activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C80533hg.m139603a(activity, window, true);
        View findViewById = a.findViewById(R.id.eu8);
        C89219l.m154716b(findViewById, "");
        this.f145227j = (TextView) findViewById;
        View findViewById2 = a.findViewById(R.id.ax1);
        C89219l.m154716b(findViewById2, "");
        this.f145228k = (EditText) findViewById2;
        View findViewById3 = a.findViewById(R.id.bu3);
        C89219l.m154716b(findViewById3, "");
        this.f145229l = (TuxIconView) findViewById3;
        View findViewById4 = a.findViewById(R.id.evm);
        C89219l.m154716b(findViewById4, "");
        mo103718a((TextView) findViewById4);
        View findViewById5 = a.findViewById(R.id.evk);
        C89219l.m154716b(findViewById5, "");
        this.f145230m = (TextView) findViewById5;
        View findViewById6 = a.findViewById(R.id.bu3);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new View$OnClickListenerC64043d(this));
        }
        TextView textView = this.f145227j;
        if (textView == null) {
            C89219l.m154710a("mTvContentName");
        }
        textView.setText(this.f145231r);
        TuxIconView tuxIconView = this.f145229l;
        if (tuxIconView == null) {
            C89219l.m154710a("mClearAllBtn");
        }
        tuxIconView.setIconRes(R.raw.icon_x_mark_circle_fill);
        AbstractC88412b a2 = this.f145226i.mo143301g(3000, TimeUnit.MILLISECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C64044e(a), C64045f.f145238a);
        C89219l.m154716b(a2, "");
        C88934a.m154195a(a2, this.f145232s);
        EditText editText = this.f145228k;
        if (editText == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText.addTextChangedListener(new C64046g(this));
        EditText editText2 = this.f145228k;
        if (editText2 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText2.setText(this.f145219a);
        EditText editText3 = this.f145228k;
        if (editText3 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        EditText editText4 = this.f145228k;
        if (editText4 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText3.setSelection(editText4.getText().length());
        EditText editText5 = this.f145228k;
        if (editText5 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText5.setFocusable(true);
        EditText editText6 = this.f145228k;
        if (editText6 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText6.setFocusableInTouchMode(true);
        EditText editText7 = this.f145228k;
        if (editText7 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText7.requestFocus();
        this.f145418o = (TuxNavBar) a.findViewById(R.id.cpv);
        AbstractC23189c j = mo103723j();
        C23194g b = m116006b(this.f145231r);
        C23191e a3 = new C23191e().mo37748a((Object) "save");
        String string = getString(R.string.bk9);
        C89219l.m154716b(string, "");
        C23191e a4 = a3.mo37749a(string).mo37745a((AbstractC23190d) new C64042c(this));
        TuxNavBar tuxNavBar = this.f145418o;
        if (tuxNavBar != null) {
            TuxNavBar.C23179a b2 = new TuxNavBar.C23179a().mo37732a(j).mo37731a(b).mo37733b(a4);
            b2.f54919d = true;
            tuxNavBar.setNavActions(b2);
        }
        if (!this.f145220b) {
            EditText editText8 = this.f145228k;
            if (editText8 == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText8.setEnabled(false);
            EditText editText9 = this.f145228k;
            if (editText9 == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText9.setFocusable(false);
            EditText editText10 = this.f145228k;
            if (editText10 == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText10.setFocusableInTouchMode(false);
            TuxIconView tuxIconView2 = this.f145229l;
            if (tuxIconView2 == null) {
                C89219l.m154710a("mClearAllBtn");
            }
            tuxIconView2.setVisibility(8);
        }
        mo103722i();
        if (!this.f145224g || TextUtils.isEmpty(this.f145221c)) {
            TextView textView2 = this.f145230m;
            if (textView2 == null) {
                C89219l.m154710a("mIdEditHintText");
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.f145230m;
            if (textView3 == null) {
                C89219l.m154710a("mIdEditHintText");
            }
            textView3.setVisibility(0);
            TextView textView4 = this.f145230m;
            if (textView4 == null) {
                C89219l.m154710a("mIdEditHintText");
            }
            textView4.setText(this.f145221c);
        }
        if (this.f145222d > 0) {
            mo103720g().setVisibility(0);
        }
        EditText editText11 = this.f145228k;
        if (editText11 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText11.setOnEditorActionListener(C64047h.f145240a);
        return a;
    }
}
