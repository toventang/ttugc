package com.p2082ss.android.ugc.aweme.account.p2245d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C33917aq;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32807q;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.BaseBindService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.d.a */
public final class C31615a extends AbstractC32620c {

    /* renamed from: a */
    public static final int f75645a = 7;

    /* renamed from: b */
    public static final AbstractC89187q<AbstractC32572b, String, String, AbstractC88973n<C22291d<C22412g>>> f75646b = C31617b.f75650a;

    /* renamed from: c */
    public static final C31616a f75647c = new C31616a((byte) 0);

    /* renamed from: d */
    private final AbstractC89244h f75648d = C89250i.m154773a((AbstractC89171a) new C31618c(this));

    /* renamed from: j */
    private HashMap f75649j;

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75649j == null) {
            this.f75649j = new HashMap();
        }
        View view = (View) this.f75649j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75649j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public final boolean mo57641e() {
        return ((Boolean) this.f75648d.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75649j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$a */
    public static final class C31616a {
        static {
            Covode.recordClassIndex(38345);
        }

        private C31616a() {
        }

        public /* synthetic */ C31616a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$c */
    static final class C31618c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31615a f75651a;

        static {
            Covode.recordClassIndex(38347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31618c(C31615a aVar) {
            super(0);
            this.f75651a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f75651a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
        }
    }

    static {
        Covode.recordClassIndex(38344);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: g */
    public final void mo57437g() {
        if (mo57641e()) {
            C39162r.m79460a("input_wrong_email", new C31376a().mo57399a("page", "Input Email Captcha").mo57399a("error_code", "1").f75156a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        int i2;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        if (mo57641e()) {
            i = R.string.fma;
        } else {
            i = R.string.flc;
        }
        bVar.f78106e = getString(i);
        if (mo57641e()) {
            i2 = R.string.fm_;
        } else {
            i2 = R.string.fla;
        }
        bVar.f78107f = getString(i2);
        bVar.f78102a = " ";
        bVar.f78111j = false;
        bVar.f78109h = true;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$d */
    static final class C31619d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31615a f75652a;

        static {
            Covode.recordClassIndex(38348);
        }

        C31619d(C31615a aVar) {
            this.f75652a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f75652a.mo57640a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: a */
    public final void mo57584a(String str) {
        C32308a aVar;
        C89219l.m154721d(str, "");
        C32582d.m67063a(this, str);
        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), str, mo58458A());
        if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
            f75646b.invoke(this, str, "user_click").mo143251d(new C31619d(this)).mo143246c();
        } else {
            mo57640a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$e */
    static final class View$OnClickListenerC31620e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31615a f75653a;

        static {
            Covode.recordClassIndex(38349);
        }

        View$OnClickListenerC31620e(C31615a aVar) {
            this.f75653a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f75653a.mo57641e()) {
                C39162r.onEventV3("Enter_new_email_page_use_phone");
            }
            Bundle arguments = this.f75653a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            if (arguments.getInt("last_scene", -1) == EnumC32592i.BIND_PHONE.getValue()) {
                ActivityC0945e activity = this.f75653a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                activity.finish();
                return;
            }
            BaseBindService h = C36085cj.m73554h();
            ActivityC0945e activity2 = this.f75653a.getActivity();
            String w = this.f75653a.mo58466w();
            ActivityC0945e activity3 = this.f75653a.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity");
            h.bindMobile(activity2, w, ((CommonFlowActivity) activity3).mo58450h(), new IAccountService.AbstractC31277g(this) {
                /* class com.p2082ss.android.ugc.aweme.account.p2245d.C31615a.View$OnClickListenerC31620e.C316211 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31620e f75654a;

                static {
                    Covode.recordClassIndex(38350);
                }

                {
                    this.f75654a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
                public final void onResult(int i, int i2, Object obj) {
                    if (i2 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("platForm", "phone");
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.BindMobileFinishData");
                        String optString = new JSONObject(((C33917aq) obj).f80226b).optString("ticket", "");
                        C89219l.m154716b(optString, "");
                        C32582d.m67072d(bundle, optString);
                        ActivityC0945e activity = this.f75654a.f75653a.getActivity();
                        if (!(activity instanceof CommonFlowActivity)) {
                            activity = null;
                        }
                        CommonFlowActivity commonFlowActivity = (CommonFlowActivity) activity;
                        if (commonFlowActivity != null) {
                            commonFlowActivity.mo58449a(i, bundle);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo57640a(boolean z) {
        C32582d.m67064a(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        arguments.putInt("next_page", EnumC32594j.EMAIL_SMS_CHANGE.getValue());
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        if (arguments.getBoolean("use_phone") || mo57641e()) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView2, "");
            ((TuxTextView) mo57434c(R.id.a3v)).setTextColor(C0643b.m2378c(tuxTextView2.getContext(), R.color.bx));
            TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView3, "");
            C32807q.m67391a(tuxTextView3, new View$OnClickListenerC31620e(this), R.string.fld, R.string.fle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$b */
    static final class C31617b extends AbstractC89220m implements AbstractC89187q<AbstractC32572b, String, String, AbstractC88973n<C22291d<C22412g>>> {

        /* renamed from: a */
        public static final C31617b f75650a = new C31617b();

        static {
            Covode.recordClassIndex(38346);
        }

        C31617b() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC88973n<C22291d<C22412g>> invoke(AbstractC32572b bVar, String str, String str2) {
            HashMap hashMap;
            AbstractC32572b bVar2 = bVar;
            String str3 = str;
            String str4 = str2;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            String e = C32582d.m67074e(bVar2);
            if (!TextUtils.isEmpty(e)) {
                hashMap = new HashMap();
                hashMap.put("ticket", e);
            } else {
                hashMap = null;
            }
            return C32407x.m66788a(bVar2, str3, C31615a.f75645a, str4, hashMap, (String) null, 96);
        }
    }
}
