package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.l */
public final class C32224l extends AbstractC34586a {

    /* renamed from: c */
    public static boolean f76891c;

    /* renamed from: d */
    public static boolean f76892d;

    /* renamed from: e */
    public static boolean f76893e;

    /* renamed from: j */
    public static final C32225a f76894j = new C32225a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f76895a = C89250i.m154773a((AbstractC89171a) new C32226b(this));

    /* renamed from: b */
    public final List<String> f76896b = new ArrayList();

    /* renamed from: k */
    private HashMap f76897k;

    static {
        Covode.recordClassIndex(38989);
    }

    /* renamed from: a */
    public final View mo58239a(int i) {
        if (this.f76897k == null) {
            this.f76897k = new HashMap();
        }
        View view = (View) this.f76897k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76897k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.l$a */
    public static final class C32225a {
        static {
            Covode.recordClassIndex(38990);
        }

        private C32225a() {
        }

        public /* synthetic */ C32225a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f76897k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.l$b */
    static final class C32226b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32224l f76898a;

        static {
            Covode.recordClassIndex(38991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32226b(C32224l lVar) {
            super(0);
            this.f76898a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f76898a.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: a */
    public final void mo58240a() {
        boolean z;
        this.f76896b.clear();
        if (f76891c) {
            this.f76896b.add("mobile_sms_verify");
        }
        if (f76892d) {
            this.f76896b.add("email_verify");
        }
        if (f76893e) {
            this.f76896b.add("pwd_verify");
        }
        TuxButton tuxButton = (TuxButton) mo58239a(R.id.eqq);
        C89219l.m154716b(tuxButton, "");
        if (this.f76896b.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        tuxButton.setEnabled(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.l$c */
    static final class View$OnClickListenerC32227c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32224l f76899a;

        static {
            Covode.recordClassIndex(38992);
        }

        View$OnClickListenerC32227c(C32224l lVar) {
            this.f76899a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f76899a.mo58239a(R.id.e3r);
            C89219l.m154716b(tuxCheckBox, "");
            C32224l.f76891c = !tuxCheckBox.isChecked();
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f76899a.mo58239a(R.id.e3r);
            C89219l.m154716b(tuxCheckBox2, "");
            tuxCheckBox2.setChecked(C32224l.f76891c);
            this.f76899a.mo58240a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.l$d */
    static final class View$OnClickListenerC32228d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32224l f76900a;

        static {
            Covode.recordClassIndex(38993);
        }

        View$OnClickListenerC32228d(C32224l lVar) {
            this.f76900a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f76900a.mo58239a(R.id.au4);
            C89219l.m154716b(tuxCheckBox, "");
            C32224l.f76892d = !tuxCheckBox.isChecked();
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f76900a.mo58239a(R.id.au4);
            C89219l.m154716b(tuxCheckBox2, "");
            tuxCheckBox2.setChecked(C32224l.f76892d);
            this.f76900a.mo58240a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.l$e */
    static final class View$OnClickListenerC32229e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32224l f76901a;

        static {
            Covode.recordClassIndex(38994);
        }

        View$OnClickListenerC32229e(C32224l lVar) {
            this.f76901a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f76901a.mo58239a(R.id.czg);
            C89219l.m154716b(tuxCheckBox, "");
            C32224l.f76893e = !tuxCheckBox.isChecked();
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f76901a.mo58239a(R.id.czg);
            C89219l.m154716b(tuxCheckBox2, "");
            tuxCheckBox2.setChecked(C32224l.f76893e);
            this.f76901a.mo58240a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.l$f */
    static final class View$OnClickListenerC32230f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32224l f76902a;

        static {
            Covode.recordClassIndex(38995);
        }

        View$OnClickListenerC32230f(C32224l lVar) {
            this.f76902a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String a = C89070n.m154551a(this.f76902a.f76896b, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 63);
            String str = (String) this.f76902a.f76895a.getValue();
            C89219l.m154716b(str, "");
            C89219l.m154721d(a, "");
            C89219l.m154721d(str, "");
            C39162r.m79460a("two_step_verification_turn_on_click", C32258q.m66614a().mo59983a("click_button", a).mo59983a("enter_from", str).f79943a);
            ActivityC0945e activity = this.f76902a.getActivity();
            if (!(activity instanceof TwoStepVerificationManageActivity)) {
                activity = null;
            }
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) activity;
            if (twoStepVerificationManageActivity != null) {
                twoStepVerificationManageActivity.mo58111a(this.f76902a.f76896b, 1);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((ConstraintLayout) mo58239a(R.id.e3q)).setOnClickListener(new View$OnClickListenerC32227c(this));
        ((ConstraintLayout) mo58239a(R.id.au3)).setOnClickListener(new View$OnClickListenerC32228d(this));
        ((ConstraintLayout) mo58239a(R.id.czf)).setOnClickListener(new View$OnClickListenerC32229e(this));
        ((TuxButton) mo58239a(R.id.eqq)).setOnClickListener(new View$OnClickListenerC32230f(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.h9, viewGroup, false);
    }
}
