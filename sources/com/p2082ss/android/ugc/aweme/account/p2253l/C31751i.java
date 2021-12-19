package com.p2082ss.android.ugc.aweme.account.p2253l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22420o;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32375ag;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32405w;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32780e;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32258q;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32291t;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.l.i */
public final class C31751i extends AbstractC32613a {

    /* renamed from: e */
    public static final C31752a f75913e = new C31752a((byte) 0);

    /* renamed from: a */
    public EditText f75914a;

    /* renamed from: b */
    final AbstractC89244h f75915b = C89250i.m154773a((AbstractC89171a) new C31755d(this));

    /* renamed from: c */
    final AbstractC89244h f75916c = C89250i.m154773a((AbstractC89171a) new C31753b(this));

    /* renamed from: d */
    final AbstractC89244h f75917d = C89250i.m154773a((AbstractC89171a) new C31754c(this));

    /* renamed from: j */
    private final AbstractC89244h f75918j = C89250i.m154773a((AbstractC89171a) new C31756e(this));

    /* renamed from: k */
    private final AbstractC89244h f75919k = C89250i.m154773a((AbstractC89171a) new C31768n(this));

    /* renamed from: l */
    private final AbstractC89244h f75920l = C89250i.m154773a((AbstractC89171a) new C31770p(this));

    /* renamed from: m */
    private HashMap f75921m;

    static {
        Covode.recordClassIndex(38485);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75921m == null) {
            this.f75921m = new HashMap();
        }
        View view = (View) this.f75921m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75921m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hu;
    }

    /* renamed from: e */
    public final String mo57698e() {
        return (String) this.f75918j.getValue();
    }

    /* renamed from: g */
    public final String mo57437g() {
        return (String) this.f75919k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75921m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: i */
    public final List<C32291t> mo57699i() {
        return (List) this.f75920l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$a */
    public static final class C31752a {
        static {
            Covode.recordClassIndex(38486);
        }

        private C31752a() {
        }

        public /* synthetic */ C31752a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$d */
    static final class C31755d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31751i f75924a;

        static {
            Covode.recordClassIndex(38489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31755d(C31751i iVar) {
            super(0);
            this.f75924a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67060a(this.f75924a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$e */
    static final class C31756e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31751i f75925a;

        static {
            Covode.recordClassIndex(38490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31756e(C31751i iVar) {
            super(0);
            this.f75925a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67069c(this.f75925a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        EditText editText = this.f75914a;
        if (editText == null) {
            C89219l.m154710a("passwordInput");
        }
        C32776c.m67375a(editText);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$b */
    static final class C31753b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31751i f75922a;

        static {
            Covode.recordClassIndex(38487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31753b(C31751i iVar) {
            super(0);
            this.f75922a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (C89361p.m154870a((CharSequence) this.f75922a.mo57698e())) {
                return this.f75922a.f75915b.getValue();
            }
            return this.f75922a.mo57698e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$n */
    static final class C31768n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31751i f75937a;

        static {
            Covode.recordClassIndex(38502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31768n(C31751i iVar) {
            super(0);
            this.f75937a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f75937a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return arguments.getString("platform", "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        if (!C32582d.m67079i(this)) {
            C36085cj.m73540a(17, 2, new Bundle());
        }
        return super.mo57458q();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.bod)).mo58777b(true);
        ((LoadingButton) mo57434c(R.id.cs9)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.bod)).mo58776a(true);
        ((LoadingButton) mo57434c(R.id.cs9)).mo58776a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$c */
    static final class C31754c extends AbstractC89220m implements AbstractC89171a<C32291t> {

        /* renamed from: a */
        final /* synthetic */ C31751i f75923a;

        static {
            Covode.recordClassIndex(38488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31754c(C31751i iVar) {
            super(0);
            this.f75923a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32291t invoke() {
            String str;
            Bundle arguments = this.f75923a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            for (C32291t tVar : (List) serializable) {
                if (tVar != null) {
                    str = tVar.getVerify_way();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) "pwd_verify")) {
                    return tVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$p */
    static final class C31770p extends AbstractC89220m implements AbstractC89171a<List<? extends C32291t>> {

        /* renamed from: a */
        final /* synthetic */ C31751i f75939a;

        static {
            Covode.recordClassIndex(38504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31770p(C31751i iVar) {
            super(0);
            this.f75939a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends C32291t> invoke() {
            Bundle arguments = this.f75939a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) serializable) {
                C32291t tVar = (C32291t) obj;
                String str = null;
                String verify_way = tVar != null ? tVar.getVerify_way() : null;
                C32291t tVar2 = (C32291t) this.f75939a.f75917d.getValue();
                if (tVar2 != null) {
                    str = tVar2.getVerify_way();
                }
                if (!C89219l.m154714a((Object) verify_way, (Object) str)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        String string;
        if (C32582d.m67079i(this)) {
            string = getString(R.string.fha) + "\n" + getString(R.string.aon);
        } else {
            string = getString(R.string.aon);
            C89219l.m154716b(string, "");
        }
        return new C32775b(null, null, false, string, " ", false, "verify_enter_password_page", false, false, 1231);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$f */
    public static final class C31757f extends C34699o {

        /* renamed from: a */
        final /* synthetic */ C31751i f75926a;

        static {
            Covode.recordClassIndex(38491);
        }

        C31757f(C31751i iVar) {
            this.f75926a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f75926a.mo57434c(R.id.bod);
            if (loadingButton != null) {
                loadingButton.setEnabled(!C32776c.m67377b(C31751i.m66087a(this.f75926a)));
            }
            LoadingButton loadingButton2 = (LoadingButton) this.f75926a.mo57434c(R.id.cs9);
            if (loadingButton2 != null) {
                loadingButton2.setEnabled(!C32776c.m67377b(C31751i.m66087a(this.f75926a)));
            }
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f75926a.mo57434c(R.id.boo);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo58481a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$l */
    static final class View$OnClickListenerC31765l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31751i f75934a;

        static {
            Covode.recordClassIndex(38499);
        }

        View$OnClickListenerC31765l(C31751i iVar) {
            this.f75934a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f75934a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m66087a(C31751i iVar) {
        EditText editText = iVar.f75914a;
        if (editText == null) {
            C89219l.m154710a("passwordInput");
        }
        return editText;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$h */
    static final class View$OnClickListenerC31759h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31751i f75928a;

        static {
            Covode.recordClassIndex(38493);
        }

        View$OnClickListenerC31759h(C31751i iVar) {
            this.f75928a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((TuxCheckBox) this.f75928a.mo57434c(R.id.a4f)).performClick();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39162r.m79460a("verify_enter_password", new C31376a().mo57399a("enter_from", mo58466w()).f75156a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$k */
    static final class View$OnClickListenerC31762k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31751i f75931a;

        static {
            Covode.recordClassIndex(38496);
        }

        View$OnClickListenerC31762k(C31751i iVar) {
            this.f75931a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C31751i iVar = this.f75931a;
            String obj = C31751i.m66087a(this.f75931a).getText().toString();
            String g = this.f75931a.mo57437g();
            C89219l.m154716b(g, "");
            C32407x.m66803a((AbstractC32572b) iVar, (String) iVar.f75916c.getValue(), obj, g, false, (AbstractC89172b) new AbstractC89172b<C32405w, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.p2253l.C31751i.View$OnClickListenerC31762k.C317631 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31762k f75932a;

                static {
                    Covode.recordClassIndex(38497);
                }

                {
                    this.f75932a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C32405w wVar) {
                    C89219l.m154721d(wVar, "");
                    String g = this.f75932a.f75931a.mo57437g();
                    C89219l.m154716b(g, "");
                    C32258q.m66621a(g, "password", false);
                    return C89391z.f203057a;
                }
            }, 16).mo143251d(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.account.p2253l.C31751i.View$OnClickListenerC31762k.C317642 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31762k f75933a;

                static {
                    Covode.recordClassIndex(38498);
                }

                {
                    this.f75933a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    JSONObject jSONObject;
                    JSONObject optJSONObject;
                    C22291d dVar = (C22291d) obj;
                    String g = this.f75933a.f75931a.mo57437g();
                    C89219l.m154716b(g, "");
                    C32258q.m66621a(g, "password", true);
                    String str = null;
                    if (Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true)) {
                        C22420o oVar = (C22420o) dVar.f52723j;
                        if (!(oVar == null || (jSONObject = oVar.f53008m) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null)) {
                            str = optJSONObject.optString("ticket");
                        }
                        TwoStepAuthApi.f76630a = str;
                        return;
                    }
                    TwoStepAuthApi.f76630a = null;
                }
            }).mo143246c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$g */
    static final class View$OnClickListenerC31758g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31751i f75927a;

        static {
            Covode.recordClassIndex(38492);
        }

        View$OnClickListenerC31758g(C31751i iVar) {
            this.f75927a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f75927a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox, "");
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f75927a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox2, "");
            tuxCheckBox.setSelected(!tuxCheckBox2.isSelected());
            Keva repo = Keva.getRepo("two_step_verification");
            TuxCheckBox tuxCheckBox3 = (TuxCheckBox) this.f75927a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox3, "");
            repo.storeBoolean("ask_next_time", tuxCheckBox3.isSelected());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$m */
    static final class View$OnClickListenerC31766m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31751i f75935a;

        static {
            Covode.recordClassIndex(38500);
        }

        View$OnClickListenerC31766m(C31751i iVar) {
            this.f75935a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C31751i iVar = this.f75935a;
            String obj = C31751i.m66087a(iVar).getText().toString();
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(obj, "");
            AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32512ct(iVar, obj)).mo143251d(new C32407x.C32514cu(iVar)).mo143244b(new C32407x.C32515cv(iVar));
            C89219l.m154716b(b, "");
            C32555z.m67011a(iVar, b).mo143251d(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.account.p2253l.C31751i.View$OnClickListenerC31766m.C317671 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31766m f75936a;

                static {
                    Covode.recordClassIndex(38501);
                }

                {
                    this.f75936a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    String a;
                    String str;
                    C22291d dVar = (C22291d) obj;
                    String str2 = "";
                    if (this.f75936a.f75935a.mo58458A() == EnumC32592i.MODIFY_PHONE) {
                        C31751i iVar = this.f75936a.f75935a;
                        Bundle arguments = this.f75936a.f75935a.getArguments();
                        if (arguments == null) {
                            arguments = new Bundle();
                        }
                        arguments.putInt("next_page", EnumC32594j.INPUT_PHONE_MODIFY.getValue());
                        C32375ag agVar = (C32375ag) dVar.f52723j;
                        if (agVar == null || (str = agVar.mo58413a()) == null) {
                            str = str2;
                        }
                        arguments.putString("ticket", str);
                        C89219l.m154716b(arguments, str2);
                        iVar.mo58461a(arguments);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    C32375ag agVar2 = (C32375ag) dVar.f52723j;
                    if (!(agVar2 == null || (a = agVar2.mo58413a()) == null)) {
                        str2 = a;
                    }
                    bundle.putString("ticket", str2);
                    C36085cj.m73540a(17, 1, bundle);
                    ActivityC0945e activity = this.f75936a.f75935a.getActivity();
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    activity.finish();
                }
            }).mo143246c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$i */
    static final class View$OnClickListenerC31760i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31751i f75929a;

        static {
            Covode.recordClassIndex(38494);
        }

        View$OnClickListenerC31760i(C31751i iVar) {
            this.f75929a = iVar;
        }

        public final void onClick(View view) {
            String str;
            String string;
            ClickAgent.onClick(view);
            C31751i iVar = this.f75929a;
            if (iVar.getContext() != null) {
                C39110a aVar = new C39110a(iVar.getContext());
                List<C32291t> i = iVar.mo57699i();
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) i, 10));
                for (T t : i) {
                    if (t == null || (str = t.getVerify_way()) == null) {
                        str = "";
                    }
                    Context context = iVar.getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(context, "");
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(context, "");
                    int hashCode = str.hashCode();
                    if (hashCode != 300626556) {
                        if (hashCode == 312290780 && str.equals("mobile_sms_verify")) {
                            string = context.getString(R.string.cz2);
                            C89219l.m154716b(string, "");
                            arrayList.add(string);
                        }
                    } else if (str.equals("email_verify")) {
                        string = context.getString(R.string.cz1);
                        C89219l.m154716b(string, "");
                        arrayList.add(string);
                    }
                    string = context.getString(R.string.cz1);
                    C89219l.m154716b(string, "");
                    arrayList.add(string);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                aVar.mo67871a((String[]) array, new DialogInterface$OnClickListenerC31769o(iVar));
                C80273bt.m139145a(aVar.f92306a.mo453a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$j */
    static final class View$OnClickListenerC31761j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31751i f75930a;

        static {
            Covode.recordClassIndex(38495);
        }

        View$OnClickListenerC31761j(C31751i iVar) {
            this.f75930a = iVar;
        }

        public final void onClick(View view) {
            boolean z;
            Object obj;
            int value;
            ClickAgent.onClick(view);
            C31751i iVar = this.f75930a;
            C32775b bVar = iVar.f77799v;
            if (bVar == null) {
                C89219l.m154715b();
            }
            String str = bVar.f78110i;
            if (str == null) {
                C89219l.m154715b();
            }
            if (this.f75930a.mo57698e().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = "email";
            } else {
                obj = "mobile";
            }
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(obj, "");
            if (C89219l.m154714a(obj, (Object) "mobile")) {
                C39162r.m79460a("click_forget_password", new C31376a().mo57399a("platform", "phone").mo57399a("enter_from", str).mo57399a("enter_method", iVar.mo58467x()).f75156a);
            } else {
                C39162r.m79460a("click_forget_password", new C31376a().mo57399a("platform", "email").mo57399a("enter_from", str).mo57399a("enter_method", iVar.mo58467x()).f75156a);
            }
            Bundle arguments = iVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            if (C89219l.m154714a(obj, (Object) "mobile")) {
                value = EnumC32594j.INPUT_PHONE_FIND_PASSWORD.getValue();
            } else {
                value = EnumC32594j.INPUT_EMAIL_FIND_PASSWORD.getValue();
            }
            arguments.putInt("next_page", value);
            arguments.putInt("current_scene", EnumC32592i.SET_OR_RESET_PASSWORD.getValue());
            C89219l.m154716b(arguments, "");
            iVar.mo58461a(arguments);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.boo);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$o */
    static final class DialogInterface$OnClickListenerC31769o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31751i f75938a;

        static {
            Covode.recordClassIndex(38503);
        }

        DialogInterface$OnClickListenerC31769o(C31751i iVar) {
            this.f75938a = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EnumC32594j jVar;
            C32291t tVar = this.f75938a.mo57699i().get(i);
            if (tVar != null) {
                C31751i iVar = this.f75938a;
                Bundle arguments = iVar.getArguments();
                if (arguments == null) {
                    C89219l.m154715b();
                }
                String verify_way = tVar.getVerify_way();
                if (verify_way == null) {
                    verify_way = "";
                }
                C89219l.m154721d(verify_way, "");
                int hashCode = verify_way.hashCode();
                if (hashCode != 300626556) {
                    if (hashCode == 312290780 && verify_way.equals("mobile_sms_verify")) {
                        jVar = EnumC32594j.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
                        arguments.putInt("next_page", jVar.getValue());
                        C89219l.m154716b(arguments, "");
                        iVar.mo58461a(arguments);
                    }
                } else if (verify_way.equals("email_verify")) {
                    jVar = EnumC32594j.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV;
                    arguments.putInt("next_page", jVar.getValue());
                    C89219l.m154716b(arguments, "");
                    iVar.mo58461a(arguments);
                }
                jVar = EnumC32594j.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
                arguments.putInt("next_page", jVar.getValue());
                C89219l.m154716b(arguments, "");
                iVar.mo58461a(arguments);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        EditText editText = ((InputWithIndicator) mo57434c(R.id.bon)).getEditText();
        this.f75914a = editText;
        if (editText == null) {
            C89219l.m154710a("passwordInput");
        }
        editText.setHint(getString(R.string.d9d));
        editText.addTextChangedListener(new C31757f(this));
        if (C32582d.m67079i(this)) {
            TuxCheckBox tuxCheckBox = (TuxCheckBox) mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox, "");
            tuxCheckBox.setSelected(Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true));
            ((TuxCheckBox) mo57434c(R.id.a4f)).setOnClickListener(new View$OnClickListenerC31758g(this));
            LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.bod);
            C89219l.m154716b(loadingButton, "");
            loadingButton.setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox2, "");
            tuxCheckBox2.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a4g);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            LoadingButton loadingButton2 = (LoadingButton) mo57434c(R.id.cs9);
            C89219l.m154716b(loadingButton2, "");
            loadingButton2.setVisibility(0);
            ((TuxTextView) mo57434c(R.id.a4g)).setOnClickListener(new View$OnClickListenerC31759h(this));
            if (!mo57699i().isEmpty()) {
                View c = mo57434c(R.id.bob);
                C89219l.m154716b(c, "");
                c.setVisibility(8);
                TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.a3v);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setVisibility(0);
                ((TuxTextView) mo57434c(R.id.a3v)).setOnClickListener(new View$OnClickListenerC31760i(this));
            } else {
                View c2 = mo57434c(R.id.bob);
                C89219l.m154716b(c2, "");
                c2.setVisibility(0);
                TuxTextView tuxTextView4 = (TuxTextView) mo57434c(R.id.a3v);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
                mo58495a(mo57434c(R.id.bob), new View$OnClickListenerC31761j(this));
            }
            String g = mo57437g();
            C89219l.m154716b(g, "");
            C32258q.m66627c(g, "password");
            mo58495a(mo57434c(R.id.cs9), new View$OnClickListenerC31762k(this));
            return;
        }
        LoadingButton loadingButton3 = (LoadingButton) mo57434c(R.id.bod);
        C89219l.m154716b(loadingButton3, "");
        loadingButton3.setVisibility(0);
        String string = getString(R.string.dfa);
        C89219l.m154716b(string, "");
        ((LoadingButton) mo57434c(R.id.bod)).setText(string);
        TuxTextView tuxTextView5 = (TuxTextView) mo57434c(R.id.a3v);
        C89219l.m154716b(tuxTextView5, "");
        tuxTextView5.setVisibility(8);
        TuxCheckBox tuxCheckBox3 = (TuxCheckBox) mo57434c(R.id.a4f);
        C89219l.m154716b(tuxCheckBox3, "");
        tuxCheckBox3.setVisibility(8);
        TuxTextView tuxTextView6 = (TuxTextView) mo57434c(R.id.a4g);
        C89219l.m154716b(tuxTextView6, "");
        tuxTextView6.setVisibility(8);
        LoadingButton loadingButton4 = (LoadingButton) mo57434c(R.id.cs9);
        C89219l.m154716b(loadingButton4, "");
        loadingButton4.setVisibility(8);
        View c3 = mo57434c(R.id.bob);
        C89219l.m154716b(c3, "");
        c3.setVisibility(0);
        View c4 = mo57434c(R.id.bob);
        C89219l.m154716b(c4, "");
        C32775b bVar = this.f77799v;
        if (bVar == null) {
            C89219l.m154715b();
        }
        String str = bVar.f78110i;
        if (str == null) {
            C89219l.m154715b();
        }
        C32780e.m67379a(c4, this, str, false);
        if (mo58458A() == EnumC32592i.MODIFY_PHONE) {
            NormalTitleBar normalTitleBar = (NormalTitleBar) mo57434c(R.id.qx);
            C89219l.m154716b(normalTitleBar, "");
            normalTitleBar.setVisibility(0);
            NormalTitleBar normalTitleBar2 = (NormalTitleBar) mo57434c(R.id.qx);
            C89219l.m154716b(normalTitleBar2, "");
            normalTitleBar2.getStartBtn().setOnClickListener(new View$OnClickListenerC31765l(this));
            NormalTitleBar normalTitleBar3 = (NormalTitleBar) mo57434c(R.id.qx);
            C89219l.m154716b(normalTitleBar3, "");
            ImageView endBtn = normalTitleBar3.getEndBtn();
            C89219l.m154716b(endBtn, "");
            endBtn.setVisibility(8);
        }
        mo58495a(mo57434c(R.id.bod), new View$OnClickListenerC31766m(this));
    }
}
