package com.p2082ss.android.ugc.aweme.account.p2242b;

import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32807q;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.BaseBindService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.b.b */
public final class C31581b extends AbstractC32620c {

    /* renamed from: a */
    public static final int f75532a = 8;

    /* renamed from: b */
    public static final AbstractC89187q<AbstractC32572b, String, String, AbstractC88973n<C22291d<C22412g>>> f75533b = C31583b.f75538a;

    /* renamed from: c */
    public static final String f75534c = "email_bundling_success";

    /* renamed from: d */
    public static final C31582a f75535d = new C31582a((byte) 0);

    /* renamed from: j */
    private final AbstractC89244h f75536j = C89250i.m154773a((AbstractC89171a) new C31584c(this));

    /* renamed from: k */
    private HashMap f75537k;

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75537k == null) {
            this.f75537k = new HashMap();
        }
        View view = (View) this.f75537k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75537k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public final boolean mo57586e() {
        return ((Boolean) this.f75536j.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75537k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$a */
    public static final class C31582a {
        static {
            Covode.recordClassIndex(38307);
        }

        private C31582a() {
        }

        public /* synthetic */ C31582a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$c */
    static final class C31584c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31581b f75539a;

        static {
            Covode.recordClassIndex(38309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31584c(C31581b bVar) {
            super(0);
            this.f75539a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f75539a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
        }
    }

    static {
        Covode.recordClassIndex(38306);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        KeyboardUtils.m70897c(mo58502i());
        C31588c.m65884a(mo58466w());
        return super.mo57458q();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: g */
    public final void mo57437g() {
        if (mo57586e()) {
            C39162r.m79460a("input_wrong_email", new C31376a().mo57399a("page", "Input Email Captcha").mo57399a("error_code", "1").f75156a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b mo57457p() {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2242b.C31581b.mo57457p():com.ss.android.ugc.aweme.account.login.v2.ui.b");
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$d */
    static final class C31585d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31581b f75540a;

        /* renamed from: b */
        final /* synthetic */ String f75541b;

        static {
            Covode.recordClassIndex(38310);
        }

        C31585d(C31581b bVar, String str) {
            this.f75540a = bVar;
            this.f75541b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f75540a.mo57585a(this.f75541b, true);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C31588c.m65885a(mo58466w(), "email");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32620c
    /* renamed from: a */
    public final void mo57584a(String str) {
        C32308a aVar;
        C89219l.m154721d(str, "");
        C32582d.m67063a(this, str);
        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), str, mo58458A());
        if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
            f75533b.invoke(this, str, "user_click").mo143251d(new C31585d(this, str)).mo143246c();
        } else {
            mo57585a(str, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$e */
    static final class View$OnClickListenerC31586e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31581b f75542a;

        static {
            Covode.recordClassIndex(38311);
        }

        View$OnClickListenerC31586e(C31581b bVar) {
            this.f75542a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f75542a.mo57586e()) {
                C39162r.onEventV3("set_up_by_phone");
            }
            Bundle arguments = this.f75542a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            if (arguments.getInt("last_scene", -1) != -1) {
                ActivityC0945e activity = this.f75542a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                activity.finish();
                return;
            }
            BaseBindService h = C36085cj.m73554h();
            ActivityC0945e activity2 = this.f75542a.getActivity();
            String w = this.f75542a.mo58466w();
            ActivityC0945e activity3 = this.f75542a.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity");
            h.bindMobile(activity2, w, ((CommonFlowActivity) activity3).mo58450h(), new IAccountService.AbstractC31277g(this) {
                /* class com.p2082ss.android.ugc.aweme.account.p2242b.C31581b.View$OnClickListenerC31586e.C315871 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31586e f75543a;

                static {
                    Covode.recordClassIndex(38312);
                }

                {
                    this.f75543a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
                public final void onResult(int i, int i2, Object obj) {
                    if (i2 == 1) {
                        ActivityC0945e activity = this.f75543a.f75542a.getActivity();
                        if (!(activity instanceof CommonFlowActivity)) {
                            activity = null;
                        }
                        CommonFlowActivity commonFlowActivity = (CommonFlowActivity) activity;
                        if (commonFlowActivity != null) {
                            commonFlowActivity.mo58449a(i, (Bundle) null);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo57585a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C32582d.m67064a(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        arguments.putInt("next_page", EnumC32594j.EMAIL_SMS_BIND.getValue());
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
        if (arguments.getBoolean("use_phone") || mo57586e()) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            ((TuxTextView) mo57434c(R.id.a3v)).setTextColor(C0643b.m2378c(view.getContext(), R.color.bx));
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView2, "");
            C32807q.m67391a(tuxTextView2, new View$OnClickListenerC31586e(this), R.string.fld, R.string.fle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$b */
    static final class C31583b extends AbstractC89220m implements AbstractC89187q<AbstractC32572b, String, String, AbstractC88973n<C22291d<C22412g>>> {

        /* renamed from: a */
        public static final C31583b f75538a = new C31583b();

        static {
            Covode.recordClassIndex(38308);
        }

        C31583b() {
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
            return C32407x.m66788a(bVar2, str3, C31581b.f75532a, str4, (Map) null, (String) null, 112);
        }
    }
}
