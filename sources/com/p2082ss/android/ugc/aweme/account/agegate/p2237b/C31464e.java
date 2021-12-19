package com.p2082ss.android.ugc.aweme.account.agegate.p2237b;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31563f;
import com.p2082ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateNicknameViewModel;
import com.p2082ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateResultViewModel;
import com.p2082ss.android.ugc.aweme.account.login.p2261f.C31925b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.b.e */
public final class C31464e extends AbstractC32613a {

    /* renamed from: a */
    public AgeGateNicknameViewModel f75310a;

    /* renamed from: b */
    public final C31925b f75311b = new C31925b();

    /* renamed from: c */
    final AbstractC89244h f75312c = C89250i.m154773a((AbstractC89171a) new C31469e(this));

    /* renamed from: d */
    private final AbstractC89244h f75313d = C89250i.m154773a((AbstractC89171a) new C31465a(this));

    /* renamed from: e */
    private HashMap f75314e;

    static {
        Covode.recordClassIndex(38181);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75314e == null) {
            this.f75314e = new HashMap();
        }
        View view = (View) this.f75314e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75314e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.g3;
    }

    /* renamed from: e */
    public final String mo57473e() {
        return (String) this.f75313d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75314e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.e$a */
    static final class C31465a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31464e f75315a;

        static {
            Covode.recordClassIndex(38182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31465a(C31464e eVar) {
            super(0);
            this.f75315a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (this.f75315a.mo58460Z_() == EnumC32594j.AGE_GATE_LOGIN) {
                return "login";
            }
            return "sign_up";
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        C31563f.m65844a(mo57473e(), 0, this.f75311b.mo57857a());
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.e$e */
    static final class C31469e extends AbstractC89220m implements AbstractC89171a<C1210r<String>> {

        /* renamed from: a */
        final /* synthetic */ C31464e f75319a;

        static {
            Covode.recordClassIndex(38186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31469e(C31464e eVar) {
            super(0);
            this.f75319a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1210r<String> invoke() {
            Fragment parentFragment = this.f75319a.getParentFragment();
            if (parentFragment != null) {
                return ((AgeGateResultViewModel) C1181ae.m3879a(parentFragment, (C1175ad.AbstractC1177b) null).mo3983a(AgeGateResultViewModel.class)).f75514a;
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78102a = getString(R.string.aog);
        bVar.f78106e = getString(R.string.fy1);
        bVar.f78107f = getString(R.string.fxx);
        bVar.f78111j = false;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.e$b */
    public static final class C31466b extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C31464e f75316a;

        static {
            Covode.recordClassIndex(38183);
        }

        C31466b(C31464e eVar) {
            this.f75316a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            AgeGateNicknameViewModel ageGateNicknameViewModel = this.f75316a.f75310a;
            if (ageGateNicknameViewModel == null) {
                C89219l.m154710a("viewModel");
            } else {
                ageGateNicknameViewModel.mo57574a(String.valueOf(editable));
            }
        }
    }

    /* renamed from: a */
    public final void mo57472a(boolean z) {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.hp);
        if (loadingButton != null) {
            loadingButton.setEnabled(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.e$c */
    static final class View$OnClickListenerC31467c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31464e f75317a;

        static {
            Covode.recordClassIndex(38184);
        }

        View$OnClickListenerC31467c(C31464e eVar) {
            this.f75317a = eVar;
        }

        public final void onClick(View view) {
            Editable editable;
            EditText editText;
            ClickAgent.onClick(view);
            LiveData liveData = (LiveData) this.f75317a.f75312c.getValue();
            if (liveData != null) {
                InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f75317a.mo57434c(R.id.ho);
                if (inputWithIndicator == null || (editText = inputWithIndicator.getEditText()) == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                liveData.postValue(String.valueOf(editable));
            }
            C31563f.m65844a(this.f75317a.mo57473e(), 1, this.f75317a.f75311b.mo57857a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.e$d */
    static final class C31468d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C31464e f75318a;

        static {
            Covode.recordClassIndex(38185);
        }

        C31468d(C31464e eVar) {
            this.f75318a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, (Object) true)) {
                this.f75318a.mo57472a(true);
                InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f75318a.mo57434c(R.id.hq);
                if (inputResultIndicator != null) {
                    inputResultIndicator.mo58481a();
                }
            } else if (C89219l.m154714a(obj, (Object) false)) {
                this.f75318a.mo57472a(false);
                InputResultIndicator inputResultIndicator2 = (InputResultIndicator) this.f75318a.mo57434c(R.id.hq);
                if (inputResultIndicator2 != null) {
                    String string = this.f75318a.getString(R.string.fxy);
                    C89219l.m154716b(string, "");
                    inputResultIndicator2.mo58482a(string);
                }
                C31563f.m65845a(this.f75318a.mo57473e(), "separate");
            } else {
                this.f75318a.mo57472a(false);
                InputResultIndicator inputResultIndicator3 = (InputResultIndicator) this.f75318a.mo57434c(R.id.hq);
                if (inputResultIndicator3 != null) {
                    inputResultIndicator3.mo58481a();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.hq);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f75311b.f76270a = SystemClock.elapsedRealtime();
        getViewModelStore().mo3997a();
        AbstractC1174ac a = C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(AgeGateNicknameViewModel.class);
        C89219l.m154716b(a, "");
        this.f75310a = (AgeGateNicknameViewModel) a;
        NormalTitleBar normalTitleBar = (NormalTitleBar) mo57434c(R.id.qx);
        C89219l.m154716b(normalTitleBar, "");
        normalTitleBar.setVisibility(0);
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) mo57434c(R.id.qx);
        C89219l.m154716b(normalTitleBar2, "");
        ImageView startBtn = normalTitleBar2.getStartBtn();
        C89219l.m154716b(startBtn, "");
        startBtn.setVisibility(0);
        NormalTitleBar normalTitleBar3 = (NormalTitleBar) mo57434c(R.id.qx);
        C89219l.m154716b(normalTitleBar3, "");
        ImageView endBtn = normalTitleBar3.getEndBtn();
        C89219l.m154716b(endBtn, "");
        endBtn.setVisibility(8);
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.ho);
        if (inputWithIndicator != null) {
            inputWithIndicator.setTextWatcher(new C31466b(this));
        }
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.ho);
        if (!(inputWithIndicator2 == null || (editText = inputWithIndicator2.getEditText()) == null)) {
            InputFilter[] inputFilterArr = new InputFilter[1];
            AgeGateNicknameViewModel ageGateNicknameViewModel = this.f75310a;
            if (ageGateNicknameViewModel == null) {
                C89219l.m154710a("viewModel");
            }
            inputFilterArr[0] = ageGateNicknameViewModel.f75511c;
            editText.setFilters(inputFilterArr);
        }
        mo58495a(mo57434c(R.id.hp), new View$OnClickListenerC31467c(this));
        AgeGateNicknameViewModel ageGateNicknameViewModel2 = this.f75310a;
        if (ageGateNicknameViewModel2 == null) {
            C89219l.m154710a("viewModel");
        }
        ageGateNicknameViewModel2.f75512d.observe(this, new C31468d(this));
        C32776c.m67375a(((InputWithIndicator) mo57434c(R.id.ho)).getEditText());
        String e = mo57473e();
        C89219l.m154721d(e, "");
        C39162r.m79460a("reg_name_page_show", new C31376a().mo57399a("enter_from", e).mo57399a("platform", "phone_or_email").mo57399a("user_type", "new").f75156a);
    }
}
