package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.experiment.C31657l;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2253l.C31720a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32847a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32853e;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d */
public final class C32623d extends C31720a {

    /* renamed from: b */
    public static final C32624a f77814b = new C32624a((byte) 0);

    /* renamed from: a */
    public boolean f77815a;

    /* renamed from: e */
    private boolean f77816e;

    /* renamed from: j */
    private String f77817j = "";

    /* renamed from: k */
    private long f77818k = System.currentTimeMillis();

    /* renamed from: l */
    private HashMap f77819l;

    static {
        Covode.recordClassIndex(39402);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.p2253l.C31720a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77819l == null) {
            this.f77819l = new HashMap();
        }
        View view = (View) this.f77819l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77819l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.p2253l.C31720a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77819l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.p2253l.C31720a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d$a */
    public static final class C32624a {
        static {
            Covode.recordClassIndex(39403);
        }

        private C32624a() {
        }

        public /* synthetic */ C32624a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: D */
    public final void mo58494D() {
        this.f77816e = false;
        C39162r.m79460a("click_password_skip", new C31376a().mo57399a("platform", "sms_verification").f75156a);
        super.mo58494D();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        if (this.f77816e) {
            return true;
        }
        if (this.f77815a) {
            return false;
        }
        C36085cj.m73540a(13, 2, (Object) null);
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2253l.C31720a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        String string;
        String string2;
        String str;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        if (!mo57692i()) {
            string = getString(R.string.aog);
            C89219l.m154716b(string, "");
            string2 = getString(R.string.aq9);
            C89219l.m154716b(string2, "");
            str = "set_password";
        } else {
            string = getString(R.string.ap7);
            C89219l.m154716b(string, "");
            string2 = getString(R.string.ap1);
            C89219l.m154716b(string2, "");
            str = "reset_password";
        }
        bVar.f78102a = string;
        bVar.f78106e = string2;
        bVar.f78110i = str;
        boolean z = true;
        if (mo58460Z_() == EnumC32594j.CREATE_PASSWORD_FOR_PHONE) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            if (arguments.containsKey("show_skip")) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    C89219l.m154715b();
                }
                if (arguments2.getBoolean("show_skip")) {
                    bVar.f78103b = getString(R.string.fj7);
                    this.f77816e = true;
                }
            }
        }
        bVar.f78112k = true;
        if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
            z = false;
        }
        bVar.f78111j = z;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2253l.C31720a
    /* renamed from: e */
    public final void mo57691e() {
        boolean z;
        ((LoadingButton) mo57434c(R.id.ag1)).mo58776a(true);
        String text = ((InputWithIndicator) mo57434c(R.id.ag2)).getText();
        if (!mo57689b(text)) {
            if (TextUtils.isEmpty(text) || !C89219l.m154714a((Object) text, (Object) this.f77817j)) {
                z = false;
            } else {
                z = true;
            }
            int i = C32629e.f77826a[mo58460Z_().ordinal()];
            if (i == 1) {
                String g = mo57437g();
                C89219l.m154721d(this, "");
                C89219l.m154721d(text, "");
                C89219l.m154721d(g, "");
                AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32501cl(this, text, g)).mo143251d(new C32407x.C32503cm(this, text, z)).mo143244b(new C32407x.C32504cn(this, z));
                C89219l.m154716b(b, "");
                C32555z.m67011a(this, b).mo143246c();
            } else if (i == 2) {
                C32407x.m66787a(this, text).mo143251d(new C32628e(this)).mo143246c();
            } else if (i == 3) {
                C32847a.m67442a(getContext());
                if (C31657l.m65967a()) {
                    String g2 = mo57437g();
                    C89219l.m154721d(this, "");
                    C89219l.m154721d(text, "");
                    C89219l.m154721d(g2, "");
                    AbstractC88973n b2 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32425al(this, text, g2)).mo143251d(new C32407x.C32427am(this)).mo143244b(new C32407x.C32428an(this));
                    C89219l.m154716b(b2, "");
                    C32555z.m67011a(this, b2).mo143251d(new C32625b(this, text)).mo143246c();
                    return;
                }
                String a = C32582d.m67060a(this);
                C89219l.m154721d(this, "");
                Bundle arguments = getArguments();
                if (arguments == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(arguments, "");
                C89219l.m154721d(arguments, "");
                boolean z2 = arguments.getBoolean("is_multi_account_same_user", false);
                C89219l.m154721d(this, "");
                C89219l.m154721d(a, "");
                C89219l.m154721d(text, "");
                AbstractC88973n b3 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32419ah(this, text, a, z2)).mo143251d(new C32407x.C32421ai(this)).mo143244b(new C32407x.C32422aj(this));
                C89219l.m154716b(b3, "");
                C32555z.m67011a(this, b3).mo143251d(new C32626c(this, text)).mo143246c();
            } else if (i == 4) {
                String g3 = mo57437g();
                C89219l.m154721d(this, "");
                C89219l.m154721d(text, "");
                C89219l.m154721d(g3, "");
                AbstractC88973n b4 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32464bk(this, z, text, g3)).mo143251d(new C32407x.C32466bl(this, text, z)).mo143244b(new C32407x.C32467bm(this, z));
                C89219l.m154716b(b4, "");
                C32555z.m67011a(this, b4).mo143251d(new C32627d(this)).mo143246c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d$b */
    static final class C32625b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32623d f77820a;

        /* renamed from: b */
        final /* synthetic */ String f77821b;

        static {
            Covode.recordClassIndex(39404);
        }

        C32625b(C32623d dVar, String str) {
            this.f77820a = dVar;
            this.f77821b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77820a.mo58505a(this.f77821b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d$c */
    static final class C32626c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32623d f77822a;

        /* renamed from: b */
        final /* synthetic */ String f77823b;

        static {
            Covode.recordClassIndex(39405);
        }

        C32626c(C32623d dVar, String str) {
            this.f77822a = dVar;
            this.f77823b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77822a.mo58505a(this.f77823b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d$d */
    static final class C32627d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32623d f77824a;

        static {
            Covode.recordClassIndex(39406);
        }

        C32627d(C32623d dVar) {
            this.f77824a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            new C79459a(this.f77824a.getContext()).mo123050a(R.string.aas).mo123053a();
        }
    }

    /* renamed from: a */
    public final void mo58505a(String str) {
        C89219l.m154721d(str, "");
        if (mo58458A() == EnumC32592i.SIGN_UP || mo58458A() == EnumC32592i.LOGIN) {
            C32853e.m67450b(C32582d.m67060a(this));
            C32853e.m67448a(str);
            C32853e.m67451c("email");
        }
        if (mo58458A() == EnumC32592i.SIGN_UP) {
            C39162r.m79460a("input_email_pwd_page", new C31376a().mo57398a("stay_time", System.currentTimeMillis() - this.f77818k).f75156a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d$e */
    static final class C32628e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32623d f77825a;

        static {
            Covode.recordClassIndex(39407);
        }

        C32628e(C32623d dVar) {
            this.f77825a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            this.f77825a.f77815a = true;
            C36085cj.m73540a(13, 1, (Object) null);
            if (this.f77825a.mo58458A() == EnumC32592i.SIGN_UP || this.f77825a.mo58458A() == EnumC32592i.LOGIN) {
                Bundle arguments = this.f77825a.getArguments();
                if (arguments == null || (str = arguments.getString("gms_store_id")) == null) {
                    str = "";
                }
                C32853e.m67450b(str);
                Bundle arguments2 = this.f77825a.getArguments();
                if (arguments2 == null || (str2 = arguments2.getString("gms_store_pwd")) == null) {
                    str2 = "";
                }
                C32853e.m67448a(str2);
                Bundle arguments3 = this.f77825a.getArguments();
                if (arguments3 == null || (str3 = arguments3.getString("gms_store_platform")) == null) {
                    str3 = "";
                }
                C32853e.m67451c(str3);
            }
            Bundle arguments4 = this.f77825a.getArguments();
            if (arguments4 == null) {
                C89219l.m154715b();
            }
            arguments4.putInt("next_page", EnumC32594j.FINISH.getValue());
            C32623d dVar = this.f77825a;
            Bundle arguments5 = dVar.getArguments();
            if (arguments5 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments5, "");
            dVar.mo58461a(arguments5);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2253l.C31720a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (mo57692i()) {
            String string = getString(R.string.anz);
            C89219l.m154716b(string, "");
            ((LoadingButton) mo57434c(R.id.ag1)).setText(string);
        }
    }
}
