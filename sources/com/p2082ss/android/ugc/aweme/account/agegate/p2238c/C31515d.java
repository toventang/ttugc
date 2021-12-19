package com.p2082ss.android.ugc.aweme.account.agegate.p2238c;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22435m;
import com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31522e;
import com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31526f;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.C32306u;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.ChecklistItemView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.c.d */
public final class C31515d extends AbstractC32613a implements AbstractC31533h, InputWithIndicator.AbstractC32969b {

    /* renamed from: c */
    public static final C31516a f75395c = new C31516a((byte) 0);

    /* renamed from: a */
    public C31526f f75396a;

    /* renamed from: b */
    final AbstractC89244h f75397b = C89250i.m154773a((AbstractC89171a) new C31521f(this));

    /* renamed from: d */
    private final AbstractC89244h f75398d = C89250i.m154773a((AbstractC89171a) new C31518c(this));

    /* renamed from: e */
    private final AbstractC89244h f75399e = C89250i.m154773a((AbstractC89171a) new C31517b(this));

    /* renamed from: j */
    private HashMap f75400j;

    static {
        Covode.recordClassIndex(38232);
    }

    /* renamed from: i */
    private final boolean m65733i() {
        return ((Boolean) this.f75398d.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75400j == null) {
            this.f75400j = new HashMap();
        }
        View view = (View) this.f75400j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75400j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.g9;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75400j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.d$a */
    public static final class C31516a {
        static {
            Covode.recordClassIndex(38233);
        }

        private C31516a() {
        }

        public /* synthetic */ C31516a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        C39162r.onEventV3("exit_create_password_page");
        return m65733i();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.b9b)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.b9b)).mo58776a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.d$b */
    static final class C31517b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31515d f75401a;

        static {
            Covode.recordClassIndex(38234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31517b(C31515d dVar) {
            super(0);
            this.f75401a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle arguments = this.f75401a.getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("age_gate_block");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.d$c */
    static final class C31518c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31515d f75402a;

        static {
            Covode.recordClassIndex(38235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31518c(C31515d dVar) {
            super(0);
            this.f75402a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f75402a.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("is_existing_user", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.d$f */
    static final class C31521f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31515d f75405a;

        static {
            Covode.recordClassIndex(38238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31521f(C31515d dVar) {
            super(0);
            this.f75405a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f75405a.getArguments();
            if (arguments != null) {
                return arguments.getString("ftc_username", "");
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C32776c.m67375a(((InputWithIndicator) mo57434c(R.id.b9c)).getEditText());
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31533h
    /* renamed from: g */
    public final void mo57437g() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString("platform", "account");
            C89219l.m154716b(arguments, "");
            ((ActionResultModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77691b.postValue(arguments);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        String str;
        boolean z = !m65733i();
        if (((Boolean) this.f75399e.getValue()).booleanValue()) {
            str = getString(R.string.aqx);
        } else {
            str = " ";
        }
        return new C32775b(str, null, z, getString(R.string.adi), null, false, null, false, false, 1514);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31533h
    /* renamed from: e */
    public final void mo57517e() {
        if (m65733i()) {
            C33048q.m67693c(false);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC32594j.DELETE_VIDEO_ALERT.getValue());
        arguments.putSerializable("age_gate_response", new AgeGateResponse(0, "", false, 0, 1, null, 32, null));
        arguments.putString("enter_from", "from_create_account_password");
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.d$d */
    public static final class C31519d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C31515d f75403a;

        static {
            Covode.recordClassIndex(38236);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31519d(C31515d dVar) {
            this.f75403a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0082, code lost:
            if (r2 != false) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r9) {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31515d.C31519d.afterTextChanged(android.text.Editable):void");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C31526f m65731a(C31515d dVar) {
        C31526f fVar = dVar.f75396a;
        if (fVar == null) {
            C89219l.m154710a("presenter");
        }
        return fVar;
    }

    /* renamed from: d */
    private static ChecklistItemView.EnumC32958b m65732d(Boolean bool) {
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            return ChecklistItemView.EnumC32958b.Success;
        }
        if (C89219l.m154714a((Object) bool, (Object) false)) {
            return ChecklistItemView.EnumC32958b.Error;
        }
        return ChecklistItemView.EnumC32958b.None;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator.AbstractC32969b
    /* renamed from: b */
    public final void mo57514b(int i) {
        if (i == 4) {
            C32306u.m66675a(true);
        } else if (i == 5) {
            C32306u.m66675a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31533h
    /* renamed from: c */
    public final void mo57516c(Boolean bool) {
        ChecklistItemView checklistItemView = (ChecklistItemView) mo57434c(R.id.b96);
        if (checklistItemView != null) {
            checklistItemView.setVariant(m65732d(bool));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean i = m65733i();
        AbstractC22329e z = mo58469z();
        String x = mo58467x();
        C89219l.m154716b(x, "");
        this.f75396a = new C31526f(this, i, z, x);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31533h
    /* renamed from: a */
    public final void mo57510a(Boolean bool) {
        ChecklistItemView checklistItemView = (ChecklistItemView) mo57434c(R.id.b95);
        if (checklistItemView != null) {
            checklistItemView.setVariant(m65732d(bool));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31533h
    /* renamed from: b */
    public final void mo57515b(Boolean bool) {
        ChecklistItemView checklistItemView = (ChecklistItemView) mo57434c(R.id.b97);
        if (checklistItemView != null) {
            checklistItemView.setVariant(m65732d(bool));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31533h
    /* renamed from: a */
    public final void mo57511a(Integer num) {
        mo57459r();
        if (num != null) {
            String string = getString(num.intValue());
            C89219l.m154716b(string, "");
            mo57442a(0, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.d$e */
    static final class View$OnClickListenerC31520e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31515d f75404a;

        static {
            Covode.recordClassIndex(38237);
        }

        View$OnClickListenerC31520e(C31515d dVar) {
            this.f75404a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75404a.mo57460s();
            C31526f a = C31515d.m65731a(this.f75404a);
            String str = (String) this.f75404a.f75397b.getValue();
            String text = ((InputWithIndicator) this.f75404a.mo57434c(R.id.b9c)).getText();
            C89219l.m154721d(text, "");
            if (a.f75414c) {
                C31522e eVar = a.f75412a;
                C31526f.C31527a aVar = new C31526f.C31527a(a);
                C31526f.C31528b bVar = new C31526f.C31528b(a);
                C89219l.m154721d(text, "");
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(bVar, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("rules_version", "v2");
                linkedHashMap.putAll(C31566h.m65850b());
                eVar.f75407a.mo36657a(text, (Map<String, String>) linkedHashMap, (AbstractC22435m) new C31522e.C31525c(aVar, bVar));
                return;
            }
            C31522e eVar2 = a.f75412a;
            if (str == null) {
                str = "";
            }
            C31526f.C31529c cVar = new C31526f.C31529c(a);
            C31526f.C31531d dVar = new C31526f.C31531d(a);
            C89219l.m154721d(str, "");
            C89219l.m154721d(text, "");
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(dVar, "");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("rules_version", "v2");
            linkedHashMap2.putAll(C31566h.m65850b());
            eVar2.f75407a.mo36653a(str, text, linkedHashMap2, new C31522e.C31524b(cVar, dVar));
            C39162r.m79460a("click_create_password_next", new C31376a().f75156a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31533h
    /* renamed from: a */
    public final void mo57512a(String str) {
        mo57459r();
        if (str != null) {
            mo57442a(0, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31533h
    /* renamed from: a */
    public final void mo57513a(boolean z) {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.b9b);
        if (loadingButton != null) {
            loadingButton.setEnabled(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.b9d);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (m65733i()) {
            C33048q.m67693c(true);
        }
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.b9c);
        if (inputWithIndicator != null) {
            inputWithIndicator.mo58760a(4, 1);
        }
        ChecklistItemView checklistItemView = (ChecklistItemView) mo57434c(R.id.b95);
        if (checklistItemView != null) {
            String string = getString(R.string.ade);
            C89219l.m154716b(string, "");
            checklistItemView.setDesc(string);
        }
        ChecklistItemView checklistItemView2 = (ChecklistItemView) mo57434c(R.id.b97);
        if (checklistItemView2 != null) {
            String string2 = getString(R.string.adf);
            C89219l.m154716b(string2, "");
            checklistItemView2.setDesc(string2);
        }
        ChecklistItemView checklistItemView3 = (ChecklistItemView) mo57434c(R.id.b96);
        if (checklistItemView3 != null) {
            String string3 = getString(R.string.adg);
            C89219l.m154716b(string3, "");
            checklistItemView3.setDesc(string3);
        }
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.b9c);
        if (inputWithIndicator2 != null) {
            inputWithIndicator2.setListener(this);
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) mo57434c(R.id.b9c);
        if (!(inputWithIndicator3 == null || (editText = inputWithIndicator3.getEditText()) == null)) {
            editText.addTextChangedListener(new C31519d(this));
        }
        mo58495a(mo57434c(R.id.b9b), new View$OnClickListenerC31520e(this));
        C39162r.m79460a("show_create_password_page", new C31376a().mo57399a("enter_from", mo58466w()).f75156a);
    }
}
