package com.p2082ss.android.ugc.aweme.account.agegate.p2238c;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.agegate.model.C31546g;
import com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31492b;
import com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31505c;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31567i;
import com.p2082ss.android.ugc.aweme.account.base.p2243a.DialogC31590a;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.C32306u;
import com.p2082ss.android.ugc.aweme.account.login.C32821z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32783f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33046o;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a */
public final class C31482a extends AbstractC32613a implements AbstractC31532g {

    /* renamed from: b */
    public static final C31483a f75338b = new C31483a((byte) 0);

    /* renamed from: a */
    public C31505c f75339a;

    /* renamed from: c */
    private final AbstractC89244h f75340c = C89250i.m154773a((AbstractC89171a) new C31484b(this));

    /* renamed from: d */
    private final AbstractC89244h f75341d = C89250i.m154773a((AbstractC89171a) new C31485c(this));

    /* renamed from: e */
    private C32783f f75342e;

    /* renamed from: j */
    private final C31546g[] f75343j = {C31546g.f75446c, C31546g.f75447d, C31546g.f75448e};

    /* renamed from: k */
    private HashMap f75344k;

    static {
        Covode.recordClassIndex(38199);
    }

    /* renamed from: k */
    private final boolean m65705k() {
        return ((Boolean) this.f75340c.getValue()).booleanValue();
    }

    /* renamed from: l */
    private final boolean m65706l() {
        return ((Boolean) this.f75341d.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75344k == null) {
            this.f75344k = new HashMap();
        }
        View view = (View) this.f75344k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75344k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.g8;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75344k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$a */
    public static final class C31483a {
        static {
            Covode.recordClassIndex(38200);
        }

        private C31483a() {
        }

        public /* synthetic */ C31483a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        if (!m65705k()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$b */
    static final class C31484b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31482a f75345a;

        static {
            Covode.recordClassIndex(38201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31484b(C31482a aVar) {
            super(0);
            this.f75345a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle arguments = this.f75345a.getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("age_gate_block");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$c */
    static final class C31485c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31482a f75346a;

        static {
            Covode.recordClassIndex(38202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31485c(C31482a aVar) {
            super(0);
            this.f75346a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f75346a.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("is_existing_user", false);
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: i */
    public final void mo57490i() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.b98);
        if (inputWithIndicator != null) {
            inputWithIndicator.mo58760a(1, 3);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C32776c.m67375a(((InputWithIndicator) mo57434c(R.id.b98)).getEditText());
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        boolean z;
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.b9_);
        if (loadingButton != null) {
            LoadingButton loadingButton2 = (LoadingButton) mo57434c(R.id.b9_);
            if (loadingButton2 != null) {
                z = loadingButton2.isEnabled();
            } else {
                z = false;
            }
            loadingButton.mo58777b(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        boolean z;
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.b9_);
        if (loadingButton != null) {
            LoadingButton loadingButton2 = (LoadingButton) mo57434c(R.id.b9_);
            if (loadingButton2 != null) {
                z = loadingButton2.isEnabled();
            } else {
                z = false;
            }
            loadingButton.mo58776a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        String str;
        boolean k = m65705k();
        if (m65705k()) {
            str = getString(R.string.aqx);
        } else {
            str = " ";
        }
        return new C32775b(str, null, k, getString(R.string.adp), getString(R.string.adl), false, null, false, true, 458);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: e */
    public final void mo57489e() {
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.b99);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58481a();
        }
        mo57459r();
        if (m65706l()) {
            C33048q.m67691b(false);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC32594j.DELETE_VIDEO_ALERT.getValue());
        arguments.putSerializable("age_gate_response", new AgeGateResponse(0, "", true, 0, 1, null, 32, null));
        arguments.putString("enter_from", "from_create_account_password");
        arguments.putBoolean("can_return_to_prev_page", false);
        arguments.putBoolean("finish_before_jump", true);
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: g */
    public final void mo57437g() {
        String str;
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.b99);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58481a();
        }
        mo57459r();
        if (m65706l()) {
            C33048q.m67691b(false);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC32594j.FTC_CREATE_PASSWORD.getValue());
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.b98);
        if (inputWithIndicator == null || (str = inputWithIndicator.getText()) == null) {
            str = "";
        }
        arguments.putString("ftc_username", str);
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$g */
    public static final class C31489g extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C31482a f75350a;

        static {
            Covode.recordClassIndex(38206);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31489g(C31482a aVar) {
            this.f75350a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f75350a.mo57434c(R.id.b99);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo58481a();
            }
            C31505c a = C31482a.m65704a(this.f75350a);
            String valueOf = String.valueOf(editable);
            C89219l.m154721d(valueOf, "");
            a.f75380e.onNext(valueOf);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: a */
    public final void mo57485a(List<String> list) {
        C32783f fVar = this.f75342e;
        if (fVar != null) {
            fVar.mo58585a(list);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C31505c m65704a(C31482a aVar) {
        C31505c cVar = aVar.f75339a;
        if (cVar == null) {
            C89219l.m154710a("presenter");
        }
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: b */
    public final void mo57487b(String str) {
        mo57459r();
        if (str != null) {
            mo57442a(0, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$d */
    static final class View$OnClickListenerC31486d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31482a f75347a;

        static {
            Covode.recordClassIndex(38203);
        }

        View$OnClickListenerC31486d(C31482a aVar) {
            this.f75347a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DialogC31590a.C31591a aVar = new DialogC31590a.C31591a();
            aVar.f75549a = C33046o.m67682a("terms-of-use");
            aVar.mo57591a(this.f75347a.getActivity()).show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$e */
    static final class View$OnClickListenerC31487e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31482a f75348a;

        static {
            Covode.recordClassIndex(38204);
        }

        View$OnClickListenerC31487e(C31482a aVar) {
            this.f75348a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DialogC31590a.C31591a aVar = new DialogC31590a.C31591a();
            aVar.f75549a = C33046o.m67682a("privacy-policy");
            aVar.mo57591a(this.f75348a.getActivity()).show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$f */
    static final class C31488f extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31482a f75349a;

        static {
            Covode.recordClassIndex(38205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31488f(C31482a aVar) {
            super(1);
            this.f75349a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            new C23144b(this.f75349a).mo37640e(num.intValue()).mo37637b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$i */
    static final class C31491i extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31482a f75352a;

        static {
            Covode.recordClassIndex(38208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31491i(C31482a aVar) {
            super(1);
            this.f75352a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            C31505c a = C31482a.m65704a(this.f75352a);
            C89219l.m154721d(str2, "");
            a.f75382g.mo57484a(str2);
            a.f75381f = true;
            C39162r.onEventV3("click_create_account_username_suggest");
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean l = m65706l();
        String w = mo58466w();
        C89219l.m154716b(w, "");
        String x = mo58467x();
        C89219l.m154716b(x, "");
        this.f75339a = new C31505c(this, l, w, x);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: b */
    public final void mo57488b(boolean z) {
        String text;
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.b98);
        if (inputWithIndicator != null) {
            int i = 1;
            if (z) {
                i = 2;
            } else {
                InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.b98);
                if (inputWithIndicator2 == null || (text = inputWithIndicator2.getText()) == null || text.length() == 0) {
                    i = 0;
                }
            }
            inputWithIndicator.mo58760a(i, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: a */
    public final void mo57484a(String str) {
        C89219l.m154721d(str, "");
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.b98);
        if (inputWithIndicator != null) {
            inputWithIndicator.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$h */
    static final class View$OnClickListenerC31490h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31482a f75351a;

        static {
            Covode.recordClassIndex(38207);
        }

        View$OnClickListenerC31490h(C31482a aVar) {
            this.f75351a = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            ((LoadingButton) this.f75351a.mo57434c(R.id.b9_)).mo58776a(true);
            C31505c a = C31482a.m65704a(this.f75351a);
            InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f75351a.mo57434c(R.id.b98);
            if (inputWithIndicator == null || (str = inputWithIndicator.getText()) == null) {
                str = "";
            }
            C89219l.m154721d(str, "");
            if (!a.f75383h) {
                C32306u.m66678a(true, a.f75384i, a.f75385j, a.f75381f);
                a.f75382g.mo57437g();
                return;
            }
            AbstractC88412b bVar = a.f75377b;
            if (bVar != null) {
                bVar.dispose();
            }
            C31492b bVar2 = a.f75376a;
            C89219l.m154721d(str, "");
            AbstractC88924h<R> a2 = NetworkProxyAccount.m67480d("/passport/login_name/update/", C89041ag.m154412a(C89387v.m154943a("login_name", str))).mo143198a(new C31492b.C31503i(bVar2));
            C89219l.m154716b(a2, "");
            a.f75377b = a2.mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143190a(new C31505c.C31509d(a), new C31505c.C31510e(a));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: a */
    public final void mo57486a(boolean z) {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.b9_);
        if (loadingButton != null) {
            loadingButton.setEnabled(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.b99);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2238c.AbstractC31532g
    /* renamed from: a */
    public final void mo57483a(Integer num, Integer num2) {
        mo57459r();
        if (num2 != null) {
            String string = getString(num2.intValue());
            C89219l.m154716b(string, "");
            mo57442a(0, string);
        }
        if (num != null) {
            new C23144b(this).mo37635a(getString(num.intValue())).mo37637b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC88412b bVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C31505c cVar = this.f75339a;
        if (cVar == null) {
            C89219l.m154710a("presenter");
        }
        AbstractC88412b bVar2 = cVar.f75379d;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = cVar.f75379d) == null)) {
            bVar.dispose();
        }
        cVar.f75379d = cVar.f75380e.mo143266a(C88446a.f200695a).mo143280b(new C31505c.C31506a(cVar)).mo143291d(500, TimeUnit.MILLISECONDS).mo143268a(C31505c.C31507b.f75387a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C31505c.C31508c(cVar));
        if (cVar.f75383h) {
            cVar.f75382g.mo57484a(cVar.f75376a.mo57494a());
            cVar.f75380e.onNext(cVar.f75376a.mo57494a());
        }
        C39162r.m79460a("show_create_account_page", new C31376a().mo57399a("enter_from", cVar.f75384i).f75156a);
        if (m65705k()) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.b9a);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            C32821z.m67398a(getActivity(), (TextView) mo57434c(R.id.b9a), new View$OnClickListenerC31486d(this), new View$OnClickListenerC31487e(this), false);
        }
        if (m65706l()) {
            C33048q.m67691b(true);
        }
        ((InputWithIndicator) mo57434c(R.id.b98)).getEditText().setInputType(524288);
        ((InputWithIndicator) mo57434c(R.id.b98)).getEditText().setFilters(new C31567i[]{new C31567i(this.f75343j, new C31488f(this))});
        ((InputWithIndicator) mo57434c(R.id.b98)).getEditText().addTextChangedListener(new C31489g(this));
        mo58495a(mo57434c(R.id.b9_), new View$OnClickListenerC31490h(this));
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.b9e);
        C89219l.m154716b(recyclerView, "");
        C32783f fVar = new C32783f(recyclerView, null, new C31491i(this));
        this.f75342e = fVar;
        fVar.f78124a = true;
    }
}
