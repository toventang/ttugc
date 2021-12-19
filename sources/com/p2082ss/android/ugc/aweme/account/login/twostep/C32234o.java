package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC34913br;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32176a;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseBindService;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o */
public final class C32234o extends AbstractC34586a {

    /* renamed from: a */
    public final int f76912a = ((int) C13628n.m24520b(C17867d.m33078a(), 29.0f));

    /* renamed from: b */
    private final AbstractC89244h f76913b = C89250i.m154773a((AbstractC89171a) new C32235a(this));

    /* renamed from: c */
    private HashMap f76914c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$l */
    public static final class View$OnClickListenerC32249l implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC32249l f76946a = new View$OnClickListenerC32249l();

        static {
            Covode.recordClassIndex(39014);
        }

        View$OnClickListenerC32249l() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$n */
    public static final class View$OnClickListenerC32251n implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC32251n f76949a = new View$OnClickListenerC32251n();

        static {
            Covode.recordClassIndex(39016);
        }

        View$OnClickListenerC32251n() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$p */
    public static final class View$OnClickListenerC32253p implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC32253p f76953a = new View$OnClickListenerC32253p();

        static {
            Covode.recordClassIndex(39018);
        }

        View$OnClickListenerC32253p() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$r */
    public static final class View$OnClickListenerC32255r implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC32255r f76956a = new View$OnClickListenerC32255r();

        static {
            Covode.recordClassIndex(39020);
        }

        View$OnClickListenerC32255r() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(38999);
    }

    /* renamed from: a */
    public final View mo58250a(int i) {
        if (this.f76914c == null) {
            this.f76914c = new HashMap();
        }
        View view = (View) this.f76914c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76914c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final String mo58251a() {
        return (String) this.f76913b.getValue();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f76914c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$a */
    static final class C32235a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32234o f76915a;

        static {
            Covode.recordClassIndex(39000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32235a(C32234o oVar) {
            super(0);
            this.f76915a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f76915a.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                return "";
            }
            return string;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$d */
    public static final class C32239d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C32234o f76927a;

        /* renamed from: b */
        final /* synthetic */ boolean f76928b;

        /* renamed from: c */
        final /* synthetic */ boolean f76929c;

        /* renamed from: d */
        final /* synthetic */ boolean f76930d;

        static {
            Covode.recordClassIndex(39004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32239d(C32234o oVar, boolean z, boolean z2, boolean z3) {
            super(0);
            this.f76927a = oVar;
            this.f76928b = z;
            this.f76929c = z2;
            this.f76930d = z3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f76928b) {
                BaseBindService h = C36085cj.m73554h();
                ActivityC0945e activity = this.f76927a.getActivity();
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_success_toast", false);
                h.modifyMobile(activity, "", bundle, new IAccountService.AbstractC31277g(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32234o.C32239d.C322401 */

                    /* renamed from: a */
                    final /* synthetic */ C32239d f76931a;

                    static {
                        Covode.recordClassIndex(39005);
                    }

                    {
                        this.f76931a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
                    public final void onResult(int i, int i2, Object obj) {
                        C32234o oVar;
                        int i3;
                        if (i2 == 1) {
                            if (this.f76931a.f76929c) {
                                oVar = this.f76931a.f76927a;
                                i3 = R.id.q3;
                            } else {
                                oVar = this.f76931a.f76927a;
                                i3 = R.id.cjs;
                            }
                            TuxTextView tuxTextView = (TuxTextView) oVar.mo58250a(i3);
                            C89219l.m154716b(tuxTextView, "");
                            User f = C36085cj.m73552f();
                            C89219l.m154716b(f, "");
                            tuxTextView.setText(f.getBindPhone());
                        }
                    }
                });
            } else if (this.f76930d) {
                BaseBindService h2 = C36085cj.m73554h();
                ActivityC0945e activity2 = this.f76927a.getActivity();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("show_success_toast", false);
                h2.changeEmail(activity2, "", bundle2, new IAccountService.AbstractC31277g(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32234o.C32239d.C322412 */

                    /* renamed from: a */
                    final /* synthetic */ C32239d f76932a;

                    static {
                        Covode.recordClassIndex(39006);
                    }

                    {
                        this.f76932a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
                    public final void onResult(int i, int i2, Object obj) {
                        C32234o oVar;
                        int i3;
                        if (i2 == 1) {
                            if (this.f76932a.f76929c) {
                                oVar = this.f76932a.f76927a;
                                i3 = R.id.q3;
                            } else {
                                oVar = this.f76932a.f76927a;
                                i3 = R.id.cjs;
                            }
                            TuxTextView tuxTextView = (TuxTextView) oVar.mo58250a(i3);
                            C89219l.m154716b(tuxTextView, "");
                            User f = C36085cj.m73552f();
                            C89219l.m154716b(f, "");
                            tuxTextView.setText(f.getEmail());
                        }
                    }
                });
            } else {
                AbstractC34913br i = C36085cj.f85262b.mo57073i();
                ActivityC0945e activity3 = this.f76927a.getActivity();
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("show_success_toast", false);
                i.changePassword(activity3, "", "", bundle3, null);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$h */
    public static final class View$OnClickListenerC32245h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76937a;

        /* renamed from: b */
        final /* synthetic */ C32176a f76938b;

        static {
            Covode.recordClassIndex(39010);
        }

        View$OnClickListenerC32245h(C32234o oVar, C32176a aVar) {
            this.f76937a = oVar;
            this.f76938b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76937a.mo58254a("mobile_sms_verify", this.f76938b, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$i */
    public static final class View$OnClickListenerC32246i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76939a;

        /* renamed from: b */
        final /* synthetic */ C32176a f76940b;

        static {
            Covode.recordClassIndex(39011);
        }

        View$OnClickListenerC32246i(C32234o oVar, C32176a aVar) {
            this.f76939a = oVar;
            this.f76940b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76939a.mo58254a("email_verify", this.f76940b, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$j */
    public static final class View$OnClickListenerC32247j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76941a;

        /* renamed from: b */
        final /* synthetic */ C32176a f76942b;

        static {
            Covode.recordClassIndex(39012);
        }

        View$OnClickListenerC32247j(C32234o oVar, C32176a aVar) {
            this.f76941a = oVar;
            this.f76942b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76941a.mo58254a("pwd_verify", this.f76942b, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$k */
    public static final class View$OnClickListenerC32248k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76943a;

        /* renamed from: b */
        final /* synthetic */ String f76944b;

        /* renamed from: c */
        final /* synthetic */ C32176a f76945c;

        static {
            Covode.recordClassIndex(39013);
        }

        View$OnClickListenerC32248k(C32234o oVar, String str, C32176a aVar) {
            this.f76943a = oVar;
            this.f76944b = str;
            this.f76945c = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76943a.mo58254a(this.f76944b, this.f76945c, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$m */
    public static final class View$OnClickListenerC32250m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76947a;

        /* renamed from: b */
        final /* synthetic */ String f76948b;

        static {
            Covode.recordClassIndex(39015);
        }

        View$OnClickListenerC32250m(C32234o oVar, String str) {
            this.f76947a = oVar;
            this.f76948b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76947a.mo58253a(this.f76948b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$o */
    public static final class View$OnClickListenerC32252o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76950a;

        /* renamed from: b */
        final /* synthetic */ String f76951b;

        /* renamed from: c */
        final /* synthetic */ C32176a f76952c;

        static {
            Covode.recordClassIndex(39017);
        }

        View$OnClickListenerC32252o(C32234o oVar, String str, C32176a aVar) {
            this.f76950a = oVar;
            this.f76951b = str;
            this.f76952c = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76950a.mo58254a(this.f76951b, this.f76952c, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$q */
    public static final class View$OnClickListenerC32254q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76954a;

        /* renamed from: b */
        final /* synthetic */ String f76955b;

        static {
            Covode.recordClassIndex(39019);
        }

        View$OnClickListenerC32254q(C32234o oVar, String str) {
            this.f76954a = oVar;
            this.f76955b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76954a.mo58253a(this.f76955b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$e */
    static final class View$OnClickListenerC32242e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76933a;

        /* renamed from: b */
        final /* synthetic */ C32176a f76934b;

        static {
            Covode.recordClassIndex(39007);
        }

        View$OnClickListenerC32242e(C32234o oVar, C32176a aVar) {
            this.f76933a = oVar;
            this.f76934b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String a = this.f76933a.mo58251a();
            C89219l.m154716b(a, "");
            C32258q.m66619a("turn_off", a);
            this.f76933a.mo58255b(this.f76934b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$f */
    static final class View$OnClickListenerC32243f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76935a;

        static {
            Covode.recordClassIndex(39008);
        }

        View$OnClickListenerC32243f(C32234o oVar) {
            this.f76935a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String a = this.f76935a.mo58251a();
            C89219l.m154716b(a, "");
            C32258q.m66619a("authorized_logins", a);
            Intent intent = new Intent(this.f76935a.getActivity(), AuthorizedDeviceActivity.class);
            intent.putExtra("enter_from", this.f76935a.mo58251a());
            this.f76935a.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo58253a(String str) {
        String a = mo58251a();
        C89219l.m154716b(a, "");
        C32258q.m66619a("add_back_up_method", a);
        ActivityC0945e activity = getActivity();
        if (!(activity instanceof TwoStepVerificationManageActivity)) {
            activity = null;
        }
        TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) activity;
        if (twoStepVerificationManageActivity != null) {
            twoStepVerificationManageActivity.mo58111a(C89070n.m154524c(str), 0);
        }
    }

    /* renamed from: b */
    public final void mo58255b(C32176a aVar) {
        String a = mo58251a();
        C89219l.m154716b(a, "");
        C32258q.m66624b("turn_off", a);
        C17197a.C17200a aVar2 = new C17197a.C17200a(getContext());
        aVar2.f41070a = getString(R.string.g3r);
        aVar2.f41071b = getString(R.string.g3q);
        C17197a.C17200a b = aVar2.mo27190a(R.string.g3p, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC32256s(this, aVar), false).mo27195b(R.string.g3c, (DialogInterface.OnClickListener) null, false);
        b.f41059E = true;
        b.mo27193a().mo27185c();
    }

    /* renamed from: a */
    public final void mo58252a(C32176a aVar) {
        T t;
        T t2;
        T t3;
        String default_verify_way;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i3;
        String str11;
        int i4;
        String str12;
        String str13;
        List<C32178aa> two_step_verify_ways;
        T t4;
        List<C32178aa> two_step_verify_ways2;
        T t5;
        List<C32178aa> two_step_verify_ways3;
        T t6;
        C89219l.m154721d(aVar, "");
        User f = C36085cj.m73552f();
        C32176a.C32177a data = aVar.getData();
        List<C32178aa> two_step_verify_ways4 = data != null ? data.getTwo_step_verify_ways() : null;
        if (two_step_verify_ways4 != null) {
            int i5 = 0;
            for (C32178aa aaVar : two_step_verify_ways4) {
                if (C89219l.m154714a((Object) aaVar.is_available(), (Object) true)) {
                    i5++;
                }
            }
            if (i5 == 1) {
                View a = mo58250a(R.id.ame);
                C89219l.m154716b(a, "");
                a.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) mo58250a(R.id.gj);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                View a2 = mo58250a(R.id.amf);
                C89219l.m154716b(a2, "");
                a2.setVisibility(8);
                TuxTextView tuxTextView2 = (TuxTextView) mo58250a(R.id.gk);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
                ConstraintLayout constraintLayout = (ConstraintLayout) mo58250a(R.id.q6);
                C89219l.m154716b(constraintLayout, "");
                ((ConstraintLayout) mo58250a(R.id.q6)).setPadding(0, 0, 0, constraintLayout.getPaddingBottom());
            } else if (i5 != 2) {
                View a3 = mo58250a(R.id.ame);
                C89219l.m154716b(a3, "");
                a3.setVisibility(8);
                TuxTextView tuxTextView3 = (TuxTextView) mo58250a(R.id.gj);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
                View a4 = mo58250a(R.id.amf);
                C89219l.m154716b(a4, "");
                a4.setVisibility(8);
                TuxTextView tuxTextView4 = (TuxTextView) mo58250a(R.id.gk);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) mo58250a(R.id.q6);
                C89219l.m154716b(constraintLayout2, "");
                ((ConstraintLayout) mo58250a(R.id.q6)).setPadding(0, 0, 0, constraintLayout2.getPaddingBottom());
                ConstraintLayout constraintLayout3 = (ConstraintLayout) mo58250a(R.id.q6);
                C89219l.m154716b(constraintLayout3, "");
                ((ConstraintLayout) mo58250a(R.id.q5)).setPadding(0, 0, 0, constraintLayout3.getPaddingBottom());
            } else {
                View a5 = mo58250a(R.id.ame);
                C89219l.m154716b(a5, "");
                a5.setVisibility(8);
                TuxTextView tuxTextView5 = (TuxTextView) mo58250a(R.id.gj);
                C89219l.m154716b(tuxTextView5, "");
                tuxTextView5.setVisibility(8);
                View a6 = mo58250a(R.id.amf);
                C89219l.m154716b(a6, "");
                a6.setVisibility(0);
                TuxTextView tuxTextView6 = (TuxTextView) mo58250a(R.id.gk);
                C89219l.m154716b(tuxTextView6, "");
                tuxTextView6.setVisibility(0);
                ConstraintLayout constraintLayout4 = (ConstraintLayout) mo58250a(R.id.q6);
                C89219l.m154716b(constraintLayout4, "");
                ((ConstraintLayout) mo58250a(R.id.q5)).setPadding(0, 0, 0, constraintLayout4.getPaddingBottom());
            }
        }
        C32176a.C32177a data2 = aVar.getData();
        if (data2 == null || (two_step_verify_ways3 = data2.getTwo_step_verify_ways()) == null) {
            t = null;
        } else {
            Iterator<T> it = two_step_verify_ways3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t6 = null;
                    break;
                }
                t6 = it.next();
                if (C89219l.m154714a((Object) t6.getVerify_way(), (Object) "mobile_sms_verify")) {
                    break;
                }
            }
            t = t6;
        }
        C32176a.C32177a data3 = aVar.getData();
        if (data3 == null || (two_step_verify_ways2 = data3.getTwo_step_verify_ways()) == null) {
            t2 = null;
        } else {
            Iterator<T> it2 = two_step_verify_ways2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t5 = null;
                    break;
                }
                t5 = it2.next();
                if (C89219l.m154714a((Object) t5.getVerify_way(), (Object) "email_verify")) {
                    break;
                }
            }
            t2 = t5;
        }
        C32176a.C32177a data4 = aVar.getData();
        if (data4 == null || (two_step_verify_ways = data4.getTwo_step_verify_ways()) == null) {
            t3 = null;
        } else {
            Iterator<T> it3 = two_step_verify_ways.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    t4 = null;
                    break;
                }
                t4 = it3.next();
                if (C89219l.m154714a((Object) t4.getVerify_way(), (Object) "pwd_verify")) {
                    break;
                }
            }
            t3 = t4;
        }
        C32176a.C32177a data5 = aVar.getData();
        if (data5 != null && (default_verify_way = data5.getDefault_verify_way()) != null) {
            int hashCode = default_verify_way.hashCode();
            if (hashCode != -797498437) {
                if (hashCode != 300626556) {
                    if (hashCode == 312290780 && default_verify_way.equals("mobile_sms_verify")) {
                        if (t2 == null || !C89219l.m154714a((Object) t2.is_available(), (Object) true)) {
                            if (t3 == null || !C89219l.m154714a((Object) t3.is_available(), (Object) true)) {
                                i3 = R.id.aig;
                                C89219l.m154716b(f, "");
                                String email = f.getEmail();
                                if (email == null || C89361p.m154870a((CharSequence) email)) {
                                    str11 = getString(R.string.b6);
                                } else {
                                    str11 = f.getEmail();
                                }
                                C89219l.m154716b(str11, "");
                                String string = getString(R.string.g38);
                                C89219l.m154716b(string, "");
                                m66606a(str11, string, 2131231086, "email_verify", false, aVar);
                                String string2 = getString(R.string.gxx);
                                C89219l.m154716b(string2, "");
                                String string3 = getString(R.string.gyd);
                                C89219l.m154716b(string3, "");
                                m66607b(string2, string3, R.drawable.jd, "pwd_verify", false, aVar);
                            } else {
                                String string4 = getString(R.string.gxx);
                                C89219l.m154716b(string4, "");
                                String string5 = getString(R.string.gyd);
                                C89219l.m154716b(string5, "");
                                i3 = R.id.aig;
                                m66606a(string4, string5, R.drawable.jd, "pwd_verify", true, aVar);
                                C89219l.m154716b(f, "");
                                String email2 = f.getEmail();
                                if (email2 == null || C89361p.m154870a((CharSequence) email2)) {
                                    str12 = getString(R.string.b6);
                                } else {
                                    str12 = f.getEmail();
                                }
                                C89219l.m154716b(str12, "");
                                String string6 = getString(R.string.g38);
                                C89219l.m154716b(string6, "");
                                m66607b(str12, string6, 2131231086, "email_verify", false, aVar);
                            }
                            i4 = R.id.cjs;
                        } else {
                            C89219l.m154716b(f, "");
                            String email3 = f.getEmail();
                            if (email3 == null || C89361p.m154870a((CharSequence) email3)) {
                                str13 = getString(R.string.b6);
                            } else {
                                str13 = f.getEmail();
                            }
                            C89219l.m154716b(str13, "");
                            String string7 = getString(R.string.g38);
                            C89219l.m154716b(string7, "");
                            m66606a(str13, string7, 2131231086, "email_verify", true, aVar);
                            if (t3 == null || !C89219l.m154714a((Object) t3.is_available(), (Object) true)) {
                                String string8 = getString(R.string.gxx);
                                C89219l.m154716b(string8, "");
                                String string9 = getString(R.string.gyd);
                                C89219l.m154716b(string9, "");
                                m66607b(string8, string9, R.drawable.jd, "pwd_verify", false, aVar);
                            } else {
                                String string10 = getString(R.string.gxx);
                                C89219l.m154716b(string10, "");
                                String string11 = getString(R.string.gyd);
                                C89219l.m154716b(string11, "");
                                m66607b(string10, string11, R.drawable.jd, "pwd_verify", true, aVar);
                            }
                            i4 = R.id.cjs;
                            i3 = R.id.aig;
                        }
                        TuxTextView tuxTextView7 = (TuxTextView) mo58250a(i4);
                        C89219l.m154716b(tuxTextView7, "");
                        tuxTextView7.setText(f.getBindPhone());
                        TuxTextView tuxTextView8 = (TuxTextView) mo58250a(R.id.aif);
                        C89219l.m154716b(tuxTextView8, "");
                        tuxTextView8.setText(getString(R.string.g39));
                        ((ImageView) mo58250a(i3)).setImageResource(2131231100);
                        ((ImageView) mo58250a(R.id.cld)).setOnClickListener(new View$OnClickListenerC32245h(this, aVar));
                    }
                } else if (default_verify_way.equals("email_verify")) {
                    if (t != null && C89219l.m154714a((Object) t.is_available(), (Object) true)) {
                        C89219l.m154716b(f, "");
                        String bindPhone = f.getBindPhone();
                        if (bindPhone == null || C89361p.m154870a((CharSequence) bindPhone)) {
                            str10 = getString(R.string.f4);
                        } else {
                            str10 = f.getBindPhone();
                        }
                        C89219l.m154716b(str10, "");
                        String string12 = getString(R.string.g39);
                        C89219l.m154716b(string12, "");
                        m66606a(str10, string12, 2131231100, "mobile_sms_verify", true, aVar);
                        if (t3 == null || !C89219l.m154714a((Object) t3.is_available(), (Object) true)) {
                            String string13 = getString(R.string.gxx);
                            C89219l.m154716b(string13, "");
                            String string14 = getString(R.string.gyd);
                            C89219l.m154716b(string14, "");
                            m66607b(string13, string14, R.drawable.jd, "pwd_verify", false, aVar);
                        } else {
                            String string15 = getString(R.string.gxx);
                            C89219l.m154716b(string15, "");
                            String string16 = getString(R.string.gyd);
                            C89219l.m154716b(string16, "");
                            m66607b(string15, string16, R.drawable.jd, "pwd_verify", true, aVar);
                        }
                    } else if (t3 == null || !C89219l.m154714a((Object) t3.is_available(), (Object) true)) {
                        C89219l.m154716b(f, "");
                        String bindPhone2 = f.getBindPhone();
                        if (bindPhone2 == null || C89361p.m154870a((CharSequence) bindPhone2)) {
                            str8 = getString(R.string.f4);
                        } else {
                            str8 = f.getBindPhone();
                        }
                        C89219l.m154716b(str8, "");
                        String string17 = getString(R.string.g39);
                        C89219l.m154716b(string17, "");
                        m66606a(str8, string17, 2131231100, "mobile_sms_verify", false, aVar);
                        String string18 = getString(R.string.gxx);
                        C89219l.m154716b(string18, "");
                        String string19 = getString(R.string.gyd);
                        C89219l.m154716b(string19, "");
                        m66607b(string18, string19, R.drawable.jd, "pwd_verify", false, aVar);
                    } else {
                        String string20 = getString(R.string.gxx);
                        C89219l.m154716b(string20, "");
                        String string21 = getString(R.string.gyd);
                        C89219l.m154716b(string21, "");
                        m66606a(string20, string21, R.drawable.jd, "pwd_verify", true, aVar);
                        C89219l.m154716b(f, "");
                        String bindPhone3 = f.getBindPhone();
                        if (bindPhone3 == null || C89361p.m154870a((CharSequence) bindPhone3)) {
                            str9 = getString(R.string.f4);
                        } else {
                            str9 = f.getBindPhone();
                        }
                        C89219l.m154716b(str9, "");
                        String string22 = getString(R.string.g39);
                        C89219l.m154716b(string22, "");
                        m66607b(str9, string22, 2131231100, "mobile_sms_verify", false, aVar);
                    }
                    TuxTextView tuxTextView9 = (TuxTextView) mo58250a(R.id.cjs);
                    C89219l.m154716b(tuxTextView9, "");
                    tuxTextView9.setText(f.getEmail());
                    TuxTextView tuxTextView10 = (TuxTextView) mo58250a(R.id.aif);
                    C89219l.m154716b(tuxTextView10, "");
                    tuxTextView10.setText(getString(R.string.b6));
                    ((ImageView) mo58250a(R.id.aig)).setImageResource(2131231086);
                    ((ImageView) mo58250a(R.id.cld)).setOnClickListener(new View$OnClickListenerC32246i(this, aVar));
                }
            } else if (default_verify_way.equals("pwd_verify")) {
                if (t != null && C89219l.m154714a((Object) t.is_available(), (Object) true)) {
                    C89219l.m154716b(f, "");
                    String bindPhone4 = f.getBindPhone();
                    if (bindPhone4 == null || C89361p.m154870a((CharSequence) bindPhone4)) {
                        str5 = getString(R.string.f4);
                    } else {
                        str5 = f.getBindPhone();
                    }
                    C89219l.m154716b(str5, "");
                    String string23 = getString(R.string.g39);
                    C89219l.m154716b(string23, "");
                    i = R.id.aig;
                    m66606a(str5, string23, 2131231100, "mobile_sms_verify", true, aVar);
                    if (t2 == null || !C89219l.m154714a((Object) t2.is_available(), (Object) true)) {
                        String email4 = f.getEmail();
                        if (email4 == null || C89361p.m154870a((CharSequence) email4)) {
                            str6 = getString(R.string.b6);
                        } else {
                            str6 = f.getEmail();
                        }
                        C89219l.m154716b(str6, "");
                        String string24 = getString(R.string.g38);
                        C89219l.m154716b(string24, "");
                        m66607b(str6, string24, 2131231086, "email_verify", false, aVar);
                    } else {
                        String email5 = f.getEmail();
                        if (email5 == null || C89361p.m154870a((CharSequence) email5)) {
                            str7 = getString(R.string.b6);
                        } else {
                            str7 = f.getEmail();
                        }
                        C89219l.m154716b(str7, "");
                        String string25 = getString(R.string.g38);
                        C89219l.m154716b(string25, "");
                        m66607b(str7, string25, 2131231086, "email_verify", true, aVar);
                    }
                } else if (t2 == null || !C89219l.m154714a((Object) t2.is_available(), (Object) true)) {
                    C89219l.m154716b(f, "");
                    String bindPhone5 = f.getBindPhone();
                    if (bindPhone5 == null || C89361p.m154870a((CharSequence) bindPhone5)) {
                        str = getString(R.string.f4);
                    } else {
                        str = f.getBindPhone();
                    }
                    C89219l.m154716b(str, "");
                    String string26 = getString(R.string.g39);
                    C89219l.m154716b(string26, "");
                    i = R.id.aig;
                    m66606a(str, string26, 2131231100, "mobile_sms_verify", false, aVar);
                    String email6 = f.getEmail();
                    if (email6 == null || C89361p.m154870a((CharSequence) email6)) {
                        str2 = getString(R.string.b6);
                    } else {
                        str2 = f.getEmail();
                    }
                    C89219l.m154716b(str2, "");
                    String string27 = getString(R.string.g38);
                    C89219l.m154716b(string27, "");
                    m66607b(str2, string27, 2131231086, "email_verify", false, aVar);
                } else {
                    C89219l.m154716b(f, "");
                    String email7 = f.getEmail();
                    if (email7 == null || C89361p.m154870a((CharSequence) email7)) {
                        str3 = getString(R.string.b6);
                    } else {
                        str3 = f.getEmail();
                    }
                    C89219l.m154716b(str3, "");
                    String string28 = getString(R.string.g38);
                    C89219l.m154716b(string28, "");
                    m66606a(str3, string28, 2131231086, "email_verify", true, aVar);
                    String bindPhone6 = f.getBindPhone();
                    if (bindPhone6 == null || C89361p.m154870a((CharSequence) bindPhone6)) {
                        str4 = getString(R.string.f4);
                    } else {
                        str4 = f.getBindPhone();
                    }
                    C89219l.m154716b(str4, "");
                    String string29 = getString(R.string.g39);
                    C89219l.m154716b(string29, "");
                    m66607b(str4, string29, 2131231100, "mobile_sms_verify", false, aVar);
                    i2 = R.id.cjs;
                    i = R.id.aig;
                    TuxTextView tuxTextView11 = (TuxTextView) mo58250a(i2);
                    C89219l.m154716b(tuxTextView11, "");
                    tuxTextView11.setText(getString(R.string.gxx));
                    TuxTextView tuxTextView12 = (TuxTextView) mo58250a(R.id.aif);
                    C89219l.m154716b(tuxTextView12, "");
                    tuxTextView12.setText(getString(R.string.gyd));
                    ((ImageView) mo58250a(i)).setImageResource(R.drawable.jd);
                    ((ImageView) mo58250a(R.id.cld)).setOnClickListener(new View$OnClickListenerC32247j(this, aVar));
                }
                i2 = R.id.cjs;
                TuxTextView tuxTextView112 = (TuxTextView) mo58250a(i2);
                C89219l.m154716b(tuxTextView112, "");
                tuxTextView112.setText(getString(R.string.gxx));
                TuxTextView tuxTextView122 = (TuxTextView) mo58250a(R.id.aif);
                C89219l.m154716b(tuxTextView122, "");
                tuxTextView122.setText(getString(R.string.gyd));
                ((ImageView) mo58250a(i)).setImageResource(R.drawable.jd);
                ((ImageView) mo58250a(R.id.cld)).setOnClickListener(new View$OnClickListenerC32247j(this, aVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$b */
    public static final class DialogInterface$OnClickListenerC32236b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76916a;

        /* renamed from: b */
        final /* synthetic */ String f76917b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f76918c;

        static {
            Covode.recordClassIndex(39001);
        }

        DialogInterface$OnClickListenerC32236b(C32234o oVar, String str, AbstractC89171a aVar) {
            this.f76916a = oVar;
            this.f76917b = str;
            this.f76918c = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f76917b;
            String a = this.f76916a.mo58251a();
            C89219l.m154716b(a, "");
            C32258q.m66625b("update", str, a);
            this.f76918c.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$s */
    public static final class DialogInterface$OnClickListenerC32256s implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76957a;

        /* renamed from: b */
        final /* synthetic */ C32176a f76958b;

        static {
            Covode.recordClassIndex(39021);
        }

        DialogInterface$OnClickListenerC32256s(C32234o oVar, C32176a aVar) {
            this.f76957a = oVar;
            this.f76958b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            String a = this.f76957a.mo58251a();
            C89219l.m154716b(a, "");
            C32258q.m66625b("confirm", "turn_off", a);
            ActivityC0945e activity = this.f76957a.getActivity();
            if (!(activity instanceof TwoStepVerificationManageActivity)) {
                activity = null;
            }
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) activity;
            if (twoStepVerificationManageActivity != null) {
                C32176a.C32177a data = this.f76958b.getData();
                if (data == null || (str = data.getDefault_verify_way()) == null) {
                    str = "";
                }
                twoStepVerificationManageActivity.mo58116b(str, "", "authorized_logins");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$c */
    public static final class DialogInterface$OnClickListenerC32237c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76919a;

        /* renamed from: b */
        final /* synthetic */ String f76920b;

        /* renamed from: c */
        final /* synthetic */ Boolean f76921c;

        /* renamed from: d */
        final /* synthetic */ C32176a f76922d;

        /* renamed from: e */
        final /* synthetic */ String f76923e;

        /* renamed from: f */
        final /* synthetic */ String f76924f;

        /* renamed from: g */
        final /* synthetic */ String f76925g;

        static {
            Covode.recordClassIndex(39002);
        }

        DialogInterface$OnClickListenerC32237c(C32234o oVar, String str, Boolean bool, C32176a aVar, String str2, String str3, String str4) {
            this.f76919a = oVar;
            this.f76920b = str;
            this.f76921c = bool;
            this.f76922d = aVar;
            this.f76923e = str2;
            this.f76924f = str3;
            this.f76925g = str4;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f76920b;
            String a = this.f76919a.mo58251a();
            C89219l.m154716b(a, "");
            C32258q.m66625b("confirm", str, a);
            if (C89219l.m154714a((Object) this.f76921c, (Object) false)) {
                this.f76919a.mo58255b(this.f76922d);
                return;
            }
            String a2 = this.f76919a.mo58251a();
            C89219l.m154716b(a2, "");
            C32258q.m66624b("method_remove", a2);
            C17197a.C17200a aVar = new C17197a.C17200a(this.f76919a.getContext());
            aVar.f41070a = this.f76923e;
            aVar.f41071b = this.f76924f;
            C17197a.C17200a b = aVar.mo27190a(R.string.dd, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32234o.DialogInterface$OnClickListenerC32237c.DialogInterface$OnClickListenerC322381 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC32237c f76926a;

                static {
                    Covode.recordClassIndex(39003);
                }

                {
                    this.f76926a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    String a = this.f76926a.f76919a.mo58251a();
                    C89219l.m154716b(a, "");
                    C32258q.m66625b("confirm", "method_remove", a);
                    ActivityC0945e activity = this.f76926a.f76919a.getActivity();
                    if (!(activity instanceof TwoStepVerificationManageActivity)) {
                        activity = null;
                    }
                    TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) activity;
                    if (twoStepVerificationManageActivity != null) {
                        twoStepVerificationManageActivity.mo58110a(this.f76926a.f76925g, "", "authorized_logins");
                    }
                }
            }, false).mo27195b(R.string.g3c, (DialogInterface.OnClickListener) null, false);
            b.f41059E = true;
            b.mo27193a().mo27185c();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        Serializable serializable = arguments.getSerializable("response");
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse");
        C32176a aVar = (C32176a) serializable;
        mo58252a(aVar);
        ((TuxTextView) mo58250a(R.id.eqp)).setOnClickListener(new View$OnClickListenerC32242e(this, aVar));
        ((ConstraintLayout) mo58250a(R.id.n6)).setOnClickListener(new View$OnClickListenerC32243f(this));
        ((TuxTextView) mo58250a(R.id.eqp)).addOnLayoutChangeListener(new View$OnLayoutChangeListenerC32244g(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ge, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo58254a(String str, C32176a aVar, boolean z) {
        Boolean bool;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String str2;
        int i;
        boolean z2;
        User f = C36085cj.m73552f();
        boolean a = C89219l.m154714a((Object) str, (Object) "mobile_sms_verify");
        boolean a2 = C89219l.m154714a((Object) str, (Object) "email_verify");
        C32176a.C32177a data = aVar.getData();
        List<C32178aa> two_step_verify_ways = data != null ? data.getTwo_step_verify_ways() : null;
        if (two_step_verify_ways != null) {
            int i2 = 0;
            for (C32178aa aaVar : two_step_verify_ways) {
                if (C89219l.m154714a((Object) aaVar.is_available(), (Object) true)) {
                    i2++;
                }
            }
            if (i2 > 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        if (a) {
            C89219l.m154716b(f, "");
            string = f.getBindPhone();
            string2 = getString(R.string.bkn);
        } else if (a2) {
            C89219l.m154716b(f, "");
            string = f.getEmail();
            string2 = getString(R.string.biw);
        } else {
            string = getString(R.string.gxx);
            string2 = getString(R.string.gxs);
        }
        C89219l.m154716b(string2, "");
        if (a) {
            string3 = getString(R.string.h9);
        } else if (a2) {
            string3 = getString(R.string.h8);
        } else {
            string3 = getString(R.string.gxc);
        }
        C89219l.m154716b(string3, "");
        C32239d dVar = new C32239d(this, a, z, a2);
        if (a) {
            string4 = getString(R.string.f_v);
        } else if (a2) {
            string4 = getString(R.string.f_k);
        } else {
            string4 = getString(R.string.gxw);
        }
        C89219l.m154716b(string4, "");
        if (a) {
            string5 = getString(R.string.f_u);
        } else if (a2) {
            string5 = getString(R.string.f_l);
        } else {
            string5 = getString(R.string.gxv);
        }
        C89219l.m154716b(string5, "");
        if (a) {
            str2 = "edit_sms";
        } else if (a2) {
            str2 = "edit_email";
        } else {
            str2 = "edit_password";
        }
        String a3 = mo58251a();
        C89219l.m154716b(a3, "");
        C32258q.m66619a(str2, a3);
        String a4 = mo58251a();
        C89219l.m154716b(a4, "");
        C32258q.m66624b(str2, a4);
        C17197a.C17200a aVar2 = new C17197a.C17200a(getContext());
        aVar2.f41070a = string;
        aVar2.f41071b = string2;
        C17197a.C17200a a5 = aVar2.mo27192a(string3, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC32236b(this, str2, dVar), false);
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            i = R.string.dd;
        } else {
            i = R.string.g3p;
        }
        DialogInterface$OnClickListenerC32237c cVar = new DialogInterface$OnClickListenerC32237c(this, str2, bool, aVar, string4, string5, str);
        a5.f41074e = a5.f41087r.getString(i);
        a5.f41081l = cVar;
        a5.f41057C = false;
        a5.f41061G = true;
        C17197a.C17200a c = a5.mo27197c(a5.f41087r.getString(R.string.g3c), null, false);
        c.f41059E = true;
        c.mo27193a().mo27185c();
    }

    /* renamed from: a */
    private final void m66606a(String str, String str2, int i, String str3, boolean z, C32176a aVar) {
        TuxTextView tuxTextView = (TuxTextView) mo58250a(R.id.q3);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = (TuxTextView) mo58250a(R.id.pz);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(str2);
        ((ImageView) mo58250a(R.id.q1)).setImageResource(i);
        if (z) {
            ((AutoRTLImageView) mo58250a(R.id.pt)).setImageResource(2131231157);
            ((AutoRTLImageView) mo58250a(R.id.pt)).setOnClickListener(new View$OnClickListenerC32248k(this, str3, aVar));
            ((ConstraintLayout) mo58250a(R.id.q5)).setOnClickListener(View$OnClickListenerC32249l.f76946a);
            return;
        }
        ((ConstraintLayout) mo58250a(R.id.q5)).setOnClickListener(new View$OnClickListenerC32250m(this, str3));
        ((AutoRTLImageView) mo58250a(R.id.pt)).setOnClickListener(View$OnClickListenerC32251n.f76949a);
        ((AutoRTLImageView) mo58250a(R.id.pt)).setImageResource(0);
    }

    /* renamed from: b */
    private final void m66607b(String str, String str2, int i, String str3, boolean z, C32176a aVar) {
        TuxTextView tuxTextView = (TuxTextView) mo58250a(R.id.q4);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = (TuxTextView) mo58250a(R.id.q0);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(str2);
        ((ImageView) mo58250a(R.id.q2)).setImageResource(i);
        if (z) {
            ((AutoRTLImageView) mo58250a(R.id.pu)).setImageResource(2131231157);
            ((AutoRTLImageView) mo58250a(R.id.pu)).setOnClickListener(new View$OnClickListenerC32252o(this, str3, aVar));
            ((ConstraintLayout) mo58250a(R.id.q6)).setOnClickListener(View$OnClickListenerC32253p.f76953a);
            return;
        }
        ((ConstraintLayout) mo58250a(R.id.q6)).setOnClickListener(new View$OnClickListenerC32254q(this, str3));
        ((AutoRTLImageView) mo58250a(R.id.pu)).setOnClickListener(View$OnClickListenerC32255r.f76956a);
        ((AutoRTLImageView) mo58250a(R.id.pu)).setImageResource(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$g */
    static final class View$OnLayoutChangeListenerC32244g implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ C32234o f76936a;

        static {
            Covode.recordClassIndex(39009);
        }

        View$OnLayoutChangeListenerC32244g(C32234o oVar) {
            this.f76936a = oVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i2 > this.f76936a.f76912a) {
                TuxTextView tuxTextView = (TuxTextView) this.f76936a.mo58250a(R.id.eqp);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setTop(this.f76936a.f76912a);
            }
        }
    }
}
