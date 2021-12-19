package com.p2082ss.android.ugc.aweme.account.unbind;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.unbind.a */
public final class C32998a extends AbstractC32572b {

    /* renamed from: b */
    public static final C32999a f78530b = new C32999a((byte) 0);

    /* renamed from: a */
    public C33010b f78531a;

    /* renamed from: c */
    private final AbstractC89244h f78532c = C89250i.m154773a((AbstractC89171a) new C33004f(this));

    /* renamed from: d */
    private final AbstractC89244h f78533d = C89250i.m154773a((AbstractC89171a) new C33000b(this));

    /* renamed from: e */
    private final AbstractC89244h f78534e = C89250i.m154773a((AbstractC89171a) new C33002d(this));

    /* renamed from: j */
    private final AbstractC89244h f78535j = C89250i.m154773a((AbstractC89171a) new C33001c(this));

    /* renamed from: k */
    private final AbstractC89244h f78536k = C89250i.m154773a((AbstractC89171a) new C33003e(this));

    /* renamed from: l */
    private final AbstractC89244h f78537l = C89250i.m154773a((AbstractC89171a) new C33009i(this));

    /* renamed from: m */
    private HashMap f78538m;

    static {
        Covode.recordClassIndex(39804);
    }

    /* renamed from: i */
    private boolean m67637i() {
        return ((Boolean) this.f78536k.getValue()).booleanValue();
    }

    /* renamed from: k */
    private String m67638k() {
        return (String) this.f78537l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    public final String ad_() {
        return "UnbindConfirmFragment";
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: b_ */
    public final void mo57470b_(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78538m == null) {
            this.f78538m = new HashMap();
        }
        View view = (View) this.f78538m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78538m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public final boolean mo58819e() {
        return ((Boolean) this.f78532c.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final ArrayList<String> mo58820g() {
        return (ArrayList) this.f78533d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78538m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$a */
    public static final class C32999a {
        static {
            Covode.recordClassIndex(39805);
        }

        private C32999a() {
        }

        public /* synthetic */ C32999a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: q */
    public final boolean mo57458q() {
        mo58818a("go_back");
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$f */
    static final class C33004f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32998a f78543a;

        static {
            Covode.recordClassIndex(39810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33004f(C32998a aVar) {
            super(0);
            this.f78543a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C33024e.m67661a(this.f78543a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$b */
    static final class C33000b extends AbstractC89220m implements AbstractC89171a<ArrayList<String>> {

        /* renamed from: a */
        final /* synthetic */ C32998a f78539a;

        static {
            Covode.recordClassIndex(39806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33000b(C32998a aVar) {
            super(0);
            this.f78539a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayList<String> invoke() {
            ArrayList<String> stringArrayList;
            Bundle arguments = this.f78539a.getArguments();
            if (arguments == null || (stringArrayList = arguments.getStringArrayList("extra_eligible_login_methods")) == null) {
                return new ArrayList();
            }
            return stringArrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$c */
    static final class C33001c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32998a f78540a;

        static {
            Covode.recordClassIndex(39807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33001c(C32998a aVar) {
            super(0);
            this.f78540a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f78540a.mo58820g().contains("email"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$d */
    static final class C33002d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32998a f78541a;

        static {
            Covode.recordClassIndex(39808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33002d(C32998a aVar) {
            super(0);
            this.f78541a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f78541a.mo58820g().contains("mobile"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$e */
    static final class C33003e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32998a f78542a;

        static {
            Covode.recordClassIndex(39809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33003e(C32998a aVar) {
            super(0);
            this.f78542a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (this.f78542a.mo58820g().size() <= 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$i */
    static final class C33009i extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32998a f78548a;

        static {
            Covode.recordClassIndex(39815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33009i(C32998a aVar) {
            super(0);
            this.f78548a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            ArrayList arrayList = new ArrayList(this.f78548a.mo58820g());
            arrayList.remove("mobile");
            arrayList.remove("email");
            return C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$h */
    public static final class C33008h implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C32998a f78547a;

        static {
            Covode.recordClassIndex(39814);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33008h(C32998a aVar) {
            this.f78547a = aVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            ActivityC0945e activity = this.f78547a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$g */
    static final class View$OnClickListenerC33005g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32998a f78544a;

        static {
            Covode.recordClassIndex(39811);
        }

        View$OnClickListenerC33005g(C32998a aVar) {
            this.f78544a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f78544a.mo58819e()) {
                C33024e.m67660a(this.f78544a, "user_click", new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.unbind.C32998a.View$OnClickListenerC33005g.C330061 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC33005g f78545a;

                    static {
                        Covode.recordClassIndex(39812);
                    }

                    {
                        this.f78545a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f78545a.f78544a.mo58818a("click_continue");
                        C32582d.m67064a((Fragment) this.f78545a.f78544a, true);
                        C32998a aVar = this.f78545a.f78544a;
                        Bundle arguments = this.f78545a.f78544a.getArguments();
                        if (arguments == null) {
                            C89219l.m154715b();
                        }
                        arguments.putInt("next_page", EnumC32594j.UNBIND_PHONE_VERIFY.getValue());
                        C89219l.m154716b(arguments, "");
                        aVar.mo58461a(arguments);
                        return C89391z.f203057a;
                    }
                });
                return;
            }
            this.f78544a.mo58818a("click_continue");
            C33024e.m67662b(this.f78544a, "user_click", new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.unbind.C32998a.View$OnClickListenerC33005g.C330072 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC33005g f78546a;

                static {
                    Covode.recordClassIndex(39813);
                }

                {
                    this.f78546a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C32582d.m67064a((Fragment) this.f78546a.f78544a, true);
                    C32998a aVar = this.f78546a.f78544a;
                    Bundle arguments = this.f78546a.f78544a.getArguments();
                    if (arguments == null) {
                        C89219l.m154715b();
                    }
                    arguments.putInt("next_page", EnumC32594j.UNBIND_EMAIL_VERIFY_USING_EMAIL.getValue());
                    C89219l.m154716b(arguments, "");
                    aVar.mo58461a(arguments);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo58818a(String str) {
        String str2;
        C31376a aVar = new C31376a();
        if (mo58819e()) {
            str2 = "phone";
        } else {
            str2 = "email";
        }
        aVar.mo57399a("unlink_type", str2);
        if (!mo58819e()) {
            aVar.mo57397a("is_email_verified", C33024e.m67664c(this) ? 1 : 0);
        }
        aVar.mo57399a("exit_method", str);
        C39162r.m79460a("exit_unlink_phone_email_confirm_page", aVar.f75156a);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        String str;
        super.onCreate(bundle);
        if (mo58819e()) {
            String string = getString(R.string.h26);
            C89219l.m154716b(string, "");
            String string2 = getString(R.string.h27);
            C89219l.m154716b(string2, "");
            String string3 = getString(R.string.h28);
            C89219l.m154716b(string3, "");
            String string4 = getString(R.string.h29);
            C89219l.m154716b(string4, "");
            String string5 = getString(R.string.h2_);
            C89219l.m154716b(string5, "");
            strArr = new String[]{string, string2, string3, string4, string5};
        } else {
            String string6 = getString(R.string.h1i);
            C89219l.m154716b(string6, "");
            String string7 = getString(R.string.h1j);
            C89219l.m154716b(string7, "");
            String string8 = getString(R.string.h1k);
            C89219l.m154716b(string8, "");
            String string9 = getString(R.string.h1l);
            C89219l.m154716b(string9, "");
            strArr = new String[]{string6, string7, string8, string9};
        }
        this.f78531a = new C33010b(strArr);
        C31376a aVar = new C31376a();
        if (mo58819e()) {
            str = "phone";
        } else {
            str = "email";
        }
        aVar.mo57399a("unlink_type", str);
        if (!mo58819e()) {
            aVar.mo57397a("is_email_verified", C33024e.m67664c(this) ? 1 : 0);
        }
        C39162r.m79460a("show_unlink_phone_email_confirm_page", aVar.f75156a);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        new C23144b(this).mo37635a(str).mo37637b();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        User f = C36085cj.m73552f();
        if (mo58819e()) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.f8z);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(getString(R.string.h2e));
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.f8y);
            C89219l.m154716b(tuxTextView2, "");
            C89219l.m154716b(f, "");
            tuxTextView2.setText(getString(R.string.h2d, f.getBindPhone()));
            TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.f8v);
            C89219l.m154716b(tuxTextView3, "");
            String string3 = getString(R.string.a6f);
            C89219l.m154716b(string3, "");
            if (!((Boolean) this.f78535j.getValue()).booleanValue()) {
                string2 = getString(R.string.h2a, m67638k());
            } else if (m67637i()) {
                string2 = getString(R.string.h2b, string3, m67638k());
            } else {
                string2 = getString(R.string.h2c, string3);
            }
            C89219l.m154716b(string2, "");
            SpannableString spannableString = new SpannableString(string2);
            m67636a(spannableString, string2, string3);
            m67636a(spannableString, string2, m67638k());
            tuxTextView3.setText(spannableString);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) mo57434c(R.id.f8z);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText(getString(R.string.h1q));
            TuxTextView tuxTextView5 = (TuxTextView) mo57434c(R.id.f8y);
            C89219l.m154716b(tuxTextView5, "");
            C89219l.m154716b(f, "");
            tuxTextView5.setText(getString(R.string.h1p, f.getEmail()));
            TuxTextView tuxTextView6 = (TuxTextView) mo57434c(R.id.f8v);
            C89219l.m154716b(tuxTextView6, "");
            String string4 = getString(R.string.a6g);
            C89219l.m154716b(string4, "");
            if (!((Boolean) this.f78534e.getValue()).booleanValue()) {
                string = getString(R.string.h1m, m67638k());
            } else if (m67637i()) {
                string = getString(R.string.h1n, string4, m67638k());
            } else {
                string = getString(R.string.h1o, string4);
            }
            C89219l.m154716b(string, "");
            SpannableString spannableString2 = new SpannableString(string);
            m67636a(spannableString2, string, string4);
            m67636a(spannableString2, string, m67638k());
            tuxTextView6.setText(spannableString2);
        }
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.f8x);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) mo57434c(R.id.f8x);
        C89219l.m154716b(recyclerView2, "");
        C33010b bVar = this.f78531a;
        if (bVar == null) {
            C89219l.m154710a("detailItemAdapter");
        }
        recyclerView2.setAdapter(bVar);
        ((TuxTextView) mo57434c(R.id.f8w)).setOnClickListener(new View$OnClickListenerC33005g(this));
        ((NormalTitleBar) mo57434c(R.id.qx)).setOnTitleBarClickListener(new C33008h(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.gf, viewGroup, false);
    }

    /* renamed from: a */
    private static void m67636a(SpannableString spannableString, String str, String str2) {
        int a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (a = C89361p.m154888a((CharSequence) str, str2, 0, false, 6)) != -1) {
            spannableString.setSpan(new C23126b(52, true), a, str2.length() + a, 33);
        }
    }
}
