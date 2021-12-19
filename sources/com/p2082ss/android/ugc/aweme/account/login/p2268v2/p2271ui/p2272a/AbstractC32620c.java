package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AccountKeyBoardHelper;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32783f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33038h;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.c */
public abstract class AbstractC32620c extends AbstractC32613a {

    /* renamed from: a */
    private HashMap f77810a;

    /* renamed from: e */
    protected EditText f77811e;

    static {
        Covode.recordClassIndex(39399);
    }

    /* renamed from: a */
    public abstract void mo57584a(String str);

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public View mo57434c(int i) {
        if (this.f77810a == null) {
            this.f77810a = new HashMap();
        }
        View view = (View) this.f77810a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77810a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hg;
    }

    /* renamed from: g */
    public void mo57437g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public void mo57438h() {
        HashMap hashMap = this.f77810a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final EditText mo58502i() {
        EditText editText = this.f77811e;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        return editText;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.bo9)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.bo9)).mo58776a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: f */
    public final void mo58496f() {
        super.mo58496f();
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.bo7);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: u */
    public final void mo58497u() {
        super.mo58497u();
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.bo7);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (AccountKeyBoardHelper.C32598a.m67091a()) {
            EditText editText = this.f77811e;
            if (editText == null) {
                C89219l.m154710a("emailInput");
            }
            C32776c.m67375a(editText);
            return;
        }
        EditText editText2 = this.f77811e;
        if (editText2 == null) {
            C89219l.m154710a("emailInput");
        }
        editText2.requestFocus();
    }

    /* renamed from: k */
    public final void mo58503k() {
        EditText editText = this.f77811e;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        String obj = editText.getText().toString();
        if (!C33038h.m67672a(obj)) {
            View c = mo57434c(R.id.bo8);
            C89219l.m154716b(c, "");
            String string = getString(R.string.apo);
            C89219l.m154716b(string, "");
            ((InputResultIndicator) c.findViewById(R.id.boo)).mo58482a(string);
            mo57437g();
            return;
        }
        mo57584a(obj);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.c$a */
    public static final class C32621a extends C34699o {

        /* renamed from: a */
        final /* synthetic */ AbstractC32620c f77812a;

        static {
            Covode.recordClassIndex(39400);
        }

        C32621a(AbstractC32620c cVar) {
            this.f77812a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator;
            LoadingButton loadingButton = (LoadingButton) this.f77812a.mo57434c(R.id.bo9);
            if (loadingButton != null) {
                loadingButton.setEnabled(!TextUtils.isEmpty(this.f77812a.mo58502i().getText()));
            }
            View c = this.f77812a.mo57434c(R.id.bo8);
            if (c != null && (inputResultIndicator = (InputResultIndicator) c.findViewById(R.id.boo)) != null) {
                inputResultIndicator.mo58481a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.c$b */
    static final class View$OnClickListenerC32622b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC32620c f77813a;

        static {
            Covode.recordClassIndex(39401);
        }

        View$OnClickListenerC32622b(AbstractC32620c cVar) {
            this.f77813a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f77813a.mo58503k();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        InputResultIndicator inputResultIndicator;
        C89219l.m154721d(str, "");
        View c = mo57434c(R.id.bo8);
        if (c != null && (inputResultIndicator = (InputResultIndicator) c.findViewById(R.id.boo)) != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        EditText editText = ((InputWithIndicator) mo57434c(R.id.bon)).getEditText();
        this.f77811e = editText;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        editText.setInputType(32);
        editText.addTextChangedListener(new C32621a(this));
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.aow));
        String a = C32582d.m67060a(this);
        if (!TextUtils.isEmpty(a)) {
            editText.setText(a);
            editText.setSelection(a.length());
        }
        mo58495a(mo57434c(R.id.bo9), new View$OnClickListenerC32622b(this));
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.bo7);
        C89219l.m154716b(recyclerView, "");
        EditText editText2 = this.f77811e;
        if (editText2 == null) {
            C89219l.m154710a("emailInput");
        }
        String w = mo58466w();
        C89219l.m154716b(w, "");
        String x = mo58467x();
        C89219l.m154716b(x, "");
        C32783f.C32787c.m67382a(recyclerView, editText2, w, x);
    }
}
