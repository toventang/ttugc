package com.p2082ss.android.ugc.aweme.account.p2276o;

import android.os.Bundle;
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
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.BaseBindService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
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

/* renamed from: com.ss.android.ugc.aweme.account.o.a */
public final class C32887a extends AbstractC32620c {

    /* renamed from: a */
    public static final AbstractC89187q<AbstractC32572b, String, String, AbstractC88973n<C22291d<C22412g>>> f78270a = C32889b.f78274a;

    /* renamed from: b */
    public static final C32888a f78271b = new C32888a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f78272c = C89250i.m154773a((AbstractC89171a) new C32890c(this));

    /* renamed from: d */
    private HashMap f78273d;

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78273d == null) {
            this.f78273d = new HashMap();
        }
        View view = (View) this.f78273d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78273d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public final boolean mo58690e() {
        return ((Boolean) this.f78272c.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78273d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.a$a */
    public static final class C32888a {
        static {
            Covode.recordClassIndex(39676);
        }

        private C32888a() {
        }

        public /* synthetic */ C32888a(byte b) {
            this();
        }

        /* renamed from: a */
        public static int m67525a(AbstractC32572b bVar) {
            C89219l.m154721d(bVar, "");
            if (bVar.mo58458A() == EnumC32592i.MODIFY_PHONE) {
                return 6;
            }
            Bundle arguments = bVar.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            if (arguments.getBoolean("from_changePwd")) {
                return 11;
            }
            return 6;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.a$c */
    static final class C32890c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32887a f78275a;

        static {
            Covode.recordClassIndex(39678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32890c(C32887a aVar) {
            super(0);
            this.f78275a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f78275a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
        }
    }

    static {
        Covode.recordClassIndex(39675);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        int i2;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        if (mo58690e()) {
            i = R.string.fmd;
        } else {
            i = R.string.flg;
        }
        bVar.f78106e = getString(i);
        if (mo58690e()) {
            i2 = R.string.fmc;
        } else {
            i2 = R.string.flf;
        }
        bVar.f78107f = getString(i2);
        bVar.f78102a = " ";
        bVar.f78111j = false;
        bVar.f78109h = true;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.a$e */
    static final class C32892e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32887a f78277a;

        /* renamed from: b */
        final /* synthetic */ String f78278b;

        static {
            Covode.recordClassIndex(39680);
        }

        C32892e(C32887a aVar, String str) {
            this.f78277a = aVar;
            this.f78278b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f78277a.mo58689a(this.f78278b, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.a$d */
    static final class View$OnClickListenerC32891d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32887a f78276a;

        static {
            Covode.recordClassIndex(39679);
        }

        View$OnClickListenerC32891d(C32887a aVar) {
            this.f78276a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f78276a.mo58690e()) {
                C39162r.onEventV3("verify_email_page_use_new_email");
            }
            Bundle bundle = new Bundle(this.f78276a.getArguments());
            bundle.putInt("next_page", EnumC32594j.INPUT_EMAIL_CHANGE.getValue());
            C32582d.m67061a(bundle, "");
            this.f78276a.mo58461a(bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: a */
    public final void mo57584a(String str) {
        C32308a aVar;
        C89219l.m154721d(str, "");
        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), str, mo58458A());
        if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
            f78270a.invoke(this, str, "user_click").mo143251d(new C32892e(this, str)).mo143246c();
        } else {
            mo58689a(str, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.a$f */
    static final class View$OnClickListenerC32893f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32887a f78279a;

        static {
            Covode.recordClassIndex(39681);
        }

        View$OnClickListenerC32893f(C32887a aVar) {
            this.f78279a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f78279a.mo58690e()) {
                C39162r.onEventV3("verify_email_page_use_phone");
            }
            Bundle arguments = this.f78279a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            if (arguments.getInt("last_scene", -1) == EnumC32592i.BIND_PHONE.getValue()) {
                ActivityC0945e activity = this.f78279a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                activity.finish();
                return;
            }
            BaseBindService h = C36085cj.m73554h();
            ActivityC0945e activity2 = this.f78279a.getActivity();
            String w = this.f78279a.mo58466w();
            ActivityC0945e activity3 = this.f78279a.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity");
            h.bindMobile(activity2, w, ((CommonFlowActivity) activity3).mo58450h(), new IAccountService.AbstractC31277g(this) {
                /* class com.p2082ss.android.ugc.aweme.account.p2276o.C32887a.View$OnClickListenerC32893f.C328941 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC32893f f78280a;

                static {
                    Covode.recordClassIndex(39682);
                }

                {
                    this.f78280a = r1;
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
                        ActivityC0945e activity = this.f78280a.f78279a.getActivity();
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
    public final void mo58689a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C32582d.m67063a(this, str);
        C32582d.m67064a(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        arguments.putInt("next_page", EnumC32594j.EMAIL_SMS_VERIFY.getValue());
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo58502i().setEnabled(false);
        mo58502i().setTextColor(C0643b.m2378c(mo58502i().getContext(), R.color.bz));
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
        tuxTextView.setVisibility(0);
        tuxTextView.setOnClickListener(new View$OnClickListenerC32891d(this));
        if (mo58690e()) {
            i = R.string.fmb;
        } else {
            i = R.string.flc;
        }
        tuxTextView.setText(getString(i));
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        if (arguments.getBoolean("use_phone") || mo58690e()) {
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a3w);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.a3w);
            C89219l.m154716b(tuxTextView3, "");
            C32807q.m67391a(tuxTextView3, new View$OnClickListenerC32893f(this), R.string.fld, R.string.fle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.a$b */
    static final class C32889b extends AbstractC89220m implements AbstractC89187q<AbstractC32572b, String, String, AbstractC88973n<C22291d<C22412g>>> {

        /* renamed from: a */
        public static final C32889b f78274a = new C32889b();

        static {
            Covode.recordClassIndex(39677);
        }

        C32889b() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC88973n<C22291d<C22412g>> invoke(AbstractC32572b bVar, String str, String str2) {
            AbstractC32572b bVar2 = bVar;
            String str3 = str;
            String str4 = str2;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            if (C32895b.f78281a[bVar2.mo58458A().ordinal()] != 1) {
                return C32407x.m66788a(bVar2, str3, C32888a.m67525a(bVar2), str4, (Map) null, (String) null, 112);
            }
            return C32407x.m66788a(bVar2, "", C32888a.m67525a(bVar2), str4, (Map) null, (String) null, 112);
        }
    }
}
