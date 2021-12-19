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
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.dialog.C23048e;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23191e;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.profile.C63425ak;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63498e;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63803y;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63828ae;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80533hg;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bk */
public final class C64032bk extends AbstractC64098cl implements AbstractC63860x {

    /* renamed from: n */
    public static final C64033a f145199n = new C64033a((byte) 0);

    /* renamed from: a */
    public String f145200a = "";

    /* renamed from: b */
    public boolean f145201b;

    /* renamed from: c */
    public int f145202c;

    /* renamed from: d */
    public boolean f145203d;

    /* renamed from: f */
    AbstractC64034b f145204f;

    /* renamed from: g */
    public C63828ae f145205g;

    /* renamed from: h */
    public C63425ak f145206h;

    /* renamed from: i */
    public DmtStatusView f145207i;

    /* renamed from: j */
    public TextView f145208j;

    /* renamed from: k */
    public EditText f145209k;

    /* renamed from: l */
    public TuxIconView f145210l;

    /* renamed from: m */
    public TextView f145211m;

    /* renamed from: r */
    private String f145212r = "";

    /* renamed from: s */
    private SparseArray f145213s;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bk$b */
    public interface AbstractC64034b {
        static {
            Covode.recordClassIndex(75478);
        }

        /* renamed from: a */
        void mo103600a(String str);
    }

    static {
        Covode.recordClassIndex(75476);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    /* renamed from: a */
    public final View mo102214a(int i) {
        if (this.f145213s == null) {
            this.f145213s = new SparseArray();
        }
        View view = (View) this.f145213s.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145213s.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final void cj_() {
        SparseArray sparseArray = this.f145213s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bk$a */
    public static final class C64033a {
        static {
            Covode.recordClassIndex(75477);
        }

        private C64033a() {
        }

        public /* synthetic */ C64033a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C64032bk m115795a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C64032bk bkVar = new C64032bk();
            Bundle bundle = new Bundle();
            bundle.putString("content_value", str);
            bundle.putBoolean("is_edit_enabled", true);
            bundle.putString("edit_hint", str2);
            bundle.putInt("content_max_length", 0);
            bundle.putBoolean("is_enable_null", true);
            bkVar.setArguments(bundle);
            return bkVar;
        }
    }

    /* renamed from: a */
    public final EditText mo103598a() {
        EditText editText = this.f145209k;
        if (editText == null) {
            C89219l.m154710a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: c */
    public final TuxIconView mo103599c() {
        TuxIconView tuxIconView = this.f145210l;
        if (tuxIconView == null) {
            C89219l.m154710a("mClearAllBtn");
        }
        return tuxIconView;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    /* renamed from: d */
    public final void mo102217d() {
        AbstractC64034b bVar = this.f145204f;
        if (bVar != null) {
            EditText editText = this.f145209k;
            if (editText == null) {
                C89219l.m154710a("mEditContentInput");
            }
            bVar.mo103600a(editText.getText().toString());
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final void onDestroyView() {
        super.onDestroyView();
        C63828ae aeVar = this.f145205g;
        if (aeVar != null) {
            aeVar.f144692c = null;
        }
        DmtStatusView dmtStatusView = this.f145207i;
        if (dmtStatusView == null) {
            C89219l.m154710a("mDmtStatusView");
        } else {
            dmtStatusView.setVisibility(8);
        }
        cj_();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    public final boolean ch_() {
        Dialog dialog;
        EditText editText = this.f145209k;
        if (editText == null) {
            C89219l.m154710a("mEditContentInput");
        }
        KeyboardUtils.m70897c(editText);
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            activity.finish();
        } else if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bk$c */
    public static final class C64035c implements AbstractC23190d {

        /* renamed from: a */
        final /* synthetic */ C64032bk f145214a;

        static {
            Covode.recordClassIndex(75479);
        }

        @Override // com.bytedance.tux.navigation.p1723a.AbstractC23190d
        /* renamed from: a */
        public final void mo37744a() {
            Map<String, String> map;
            C63803y.m115397a("save_profile", "click_save", "bio");
            String obj = this.f145214a.mo103598a().getText().toString();
            while (C89361p.m154908a((CharSequence) obj, (CharSequence) "\n\n", false)) {
                obj = new C89350l("\n\n").replace(obj, "\n");
            }
            int length = obj.length() - 1;
            if (length >= 0 && obj.charAt(length) == '\n') {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                obj = obj.substring(0, length);
                C89219l.m154716b(obj, "");
            }
            if (!TextUtils.equals(obj, this.f145214a.f145200a)) {
                KeyboardUtils.m70897c(this.f145214a.mo103598a());
                this.f145214a.mo103598a().setText(obj);
                C63425ak akVar = this.f145214a.f145206h;
                if (akVar != null) {
                    akVar.f143987k = obj;
                }
                C63828ae aeVar = this.f145214a.f145205g;
                if (aeVar != null) {
                    C63425ak akVar2 = this.f145214a.f145206h;
                    if (akVar2 != null) {
                        map = akVar2.mo102037a();
                    } else {
                        map = null;
                    }
                    aeVar.mo103294a(map);
                }
                DmtStatusView dmtStatusView = this.f145214a.f145207i;
                if (dmtStatusView == null) {
                    C89219l.m154710a("mDmtStatusView");
                }
                dmtStatusView.mo27384f();
                return;
            }
            this.f145214a.ch_();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64035c(C64032bk bkVar) {
            this.f145214a = bkVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bk$e */
    public static final class C64037e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C64032bk f145216a;

        static {
            Covode.recordClassIndex(75481);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64037e(C64032bk bkVar) {
            this.f145216a = bkVar;
        }

        public final void afterTextChanged(Editable editable) {
            C89219l.m154721d(editable, "");
            if (this.f145216a.f145201b) {
                if (editable.length() <= 0 && !this.f145216a.f145203d) {
                    this.f145216a.mo103722i();
                } else if (!TextUtils.equals(editable.toString(), this.f145216a.f145200a)) {
                    this.f145216a.mo103721h();
                } else {
                    this.f145216a.mo103722i();
                }
                if (editable.length() > 0) {
                    this.f145216a.mo103599c().setVisibility(0);
                } else {
                    this.f145216a.mo103599c().setVisibility(8);
                }
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            if (this.f145216a.f145202c != 0) {
                boolean a = C64032bk.m116005a(this.f145216a.mo103598a(), this.f145216a.f145202c);
                C64032bk bkVar = this.f145216a;
                bkVar.mo103719a(a, bkVar.mo103598a().length(), this.f145216a.f145202c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bk$d */
    static final class View$OnClickListenerC64036d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64032bk f145215a;

        static {
            Covode.recordClassIndex(75480);
        }

        View$OnClickListenerC64036d(C64032bk bkVar) {
            this.f145215a = bkVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EditText editText = this.f145215a.f145209k;
            if (editText == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText.setText("");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61026a(boolean z) {
        if (z) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.nc).mo123053a();
            AbstractC81915c.m141874a(new C63498e());
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
            String string = arguments.getString("content_value");
            if (string == null) {
                C89219l.m154715b();
            }
            this.f145200a = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            this.f145201b = arguments2.getBoolean("is_edit_enabled");
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                C89219l.m154715b();
            }
            String string2 = arguments3.getString("edit_hint");
            if (string2 == null) {
                C89219l.m154715b();
            }
            this.f145212r = string2;
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                C89219l.m154715b();
            }
            this.f145202c = arguments4.getInt("content_max_length");
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                C89219l.m154715b();
            }
            this.f145203d = arguments5.getBoolean("is_enable_null");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61023a(User user, int i) {
        DmtStatusView dmtStatusView = this.f145207i;
        if (dmtStatusView == null) {
            C89219l.m154710a("mDmtStatusView");
        } else {
            dmtStatusView.mo27382d();
        }
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            activity.finish();
            return;
        }
        mo102217d();
        dismiss();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61024a(Exception exc, int i) {
        ActivityC0945e activity;
        DmtStatusView dmtStatusView = this.f145207i;
        if (dmtStatusView == null) {
            C89219l.m154710a("mDmtStatusView");
        } else {
            dmtStatusView.setVisibility(8);
        }
        if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 2097 && (activity = getActivity()) != null) {
            C89219l.m154716b(activity, "");
            ((C23048e) new C23048e(activity).mo37479a(R.string.cvb).mo37483b(R.string.cv_)).mo37443a(R.string.cva, null).mo37442a().mo37396b().show();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61025a(String str, boolean z) {
        DmtStatusView dmtStatusView = this.f145207i;
        if (dmtStatusView == null) {
            C89219l.m154710a("mDmtStatusView");
        } else {
            dmtStatusView.setVisibility(8);
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            new C79459a(C17867d.m33078a()).mo123052a(str).mo123053a();
            if (z && getActivity() != null) {
                ActivityC0945e activity = getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bk$f */
    static final class C64038f implements TextView.OnEditorActionListener {

        /* renamed from: a */
        public static final C64038f f145217a = new C64038f();

        static {
            Covode.recordClassIndex(75482);
        }

        C64038f() {
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
        int intValue;
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.anb, viewGroup, false);
        View findViewById = a.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById, "");
        this.f145207i = (DmtStatusView) findViewById;
        View findViewById2 = a.findViewById(R.id.eu8);
        C89219l.m154716b(findViewById2, "");
        this.f145208j = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.ax1);
        C89219l.m154716b(findViewById3, "");
        this.f145209k = (EditText) findViewById3;
        View findViewById4 = a.findViewById(R.id.bu3);
        C89219l.m154716b(findViewById4, "");
        this.f145210l = (TuxIconView) findViewById4;
        View findViewById5 = a.findViewById(R.id.evm);
        C89219l.m154716b(findViewById5, "");
        mo103718a((TextView) findViewById5);
        View findViewById6 = a.findViewById(R.id.evk);
        C89219l.m154716b(findViewById6, "");
        this.f145211m = (TextView) findViewById6;
        View findViewById7 = a.findViewById(R.id.bu3);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new View$OnClickListenerC64036d(this));
        }
        ActivityC0945e activity = getActivity();
        Dialog dialog = getDialog();
        Integer num = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C80533hg.m139603a(activity, window, true);
        C63828ae aeVar = new C63828ae();
        this.f145205g = aeVar;
        aeVar.f144692c = this;
        this.f145206h = new C63425ak();
        DmtStatusView dmtStatusView = this.f145207i;
        if (dmtStatusView == null) {
            C89219l.m154710a("mDmtStatusView");
        } else {
            dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(getActivity()));
        }
        TextView textView = this.f145208j;
        if (textView == null) {
            C89219l.m154710a("mTvContentName");
        }
        textView.setText(getString(R.string.bkg));
        EditText editText = this.f145209k;
        if (editText == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText.addTextChangedListener(new C64037e(this));
        EditText editText2 = this.f145209k;
        if (editText2 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText2.setText(this.f145200a);
        EditText editText3 = this.f145209k;
        if (editText3 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        EditText editText4 = this.f145209k;
        if (editText4 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText3.setSelection(editText4.getText().length());
        EditText editText5 = this.f145209k;
        if (editText5 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText5.setFocusable(true);
        EditText editText6 = this.f145209k;
        if (editText6 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText6.setFocusableInTouchMode(true);
        EditText editText7 = this.f145209k;
        if (editText7 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText7.requestFocus();
        this.f145418o = (TuxNavBar) a.findViewById(R.id.cpv);
        AbstractC23189c j = mo103723j();
        String string = getString(R.string.bkg);
        C89219l.m154716b(string, "");
        C23194g b = m116006b(string);
        C23191e a2 = new C23191e().mo37748a((Object) "save");
        String string2 = getString(R.string.bk9);
        C89219l.m154716b(string2, "");
        C23191e a3 = a2.mo37749a(string2).mo37745a((AbstractC23190d) new C64035c(this));
        TuxNavBar tuxNavBar = this.f145418o;
        if (tuxNavBar != null) {
            TuxNavBar.C23179a b2 = new TuxNavBar.C23179a().mo37732a(j).mo37731a(b).mo37733b(a3);
            b2.f54919d = true;
            tuxNavBar.setNavActions(b2);
        }
        if (!this.f145201b) {
            EditText editText8 = this.f145209k;
            if (editText8 == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText8.setEnabled(false);
            EditText editText9 = this.f145209k;
            if (editText9 == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText9.setFocusable(false);
            EditText editText10 = this.f145209k;
            if (editText10 == null) {
                C89219l.m154710a("mEditContentInput");
            }
            editText10.setFocusableInTouchMode(false);
            TuxIconView tuxIconView = this.f145210l;
            if (tuxIconView == null) {
                C89219l.m154710a("mClearAllBtn");
            }
            tuxIconView.setVisibility(8);
        }
        mo103722i();
        if (TextUtils.isEmpty(this.f145212r)) {
            TextView textView2 = this.f145211m;
            if (textView2 == null) {
                C89219l.m154710a("mIdEditHintText");
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.f145211m;
            if (textView3 == null) {
                C89219l.m154710a("mIdEditHintText");
            }
            textView3.setVisibility(0);
            TextView textView4 = this.f145211m;
            if (textView4 == null) {
                C89219l.m154710a("mIdEditHintText");
            }
            textView4.setText(this.f145212r);
        }
        if (this.f145202c > 0) {
            mo103720g().setVisibility(0);
            TextView g = mo103720g();
            Object[] objArr = new Object[2];
            if (TextUtils.isEmpty(this.f145200a)) {
                intValue = 0;
            } else {
                String str = this.f145200a;
                if (str != null) {
                    num = Integer.valueOf(str.length());
                }
                intValue = num.intValue();
            }
            objArr[0] = Integer.valueOf(intValue);
            objArr[1] = Integer.valueOf(this.f145202c);
            g.setText(getString(R.string.aba, objArr));
        }
        EditText editText11 = this.f145209k;
        if (editText11 == null) {
            C89219l.m154710a("mEditContentInput");
        }
        editText11.setOnEditorActionListener(C64038f.f145217a);
        return a;
    }
}
