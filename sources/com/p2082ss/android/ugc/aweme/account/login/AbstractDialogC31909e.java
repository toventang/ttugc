package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.p2252k.C31718d;
import com.p2082ss.android.ugc.aweme.account.views.DialogC33065b;
import com.p2082ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.p2082ss.android.ugc.aweme.base.p2370c.AbstractC34533b;
import com.p2082ss.android.ugc.aweme.base.p2370c.C34531a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.e */
public abstract class AbstractDialogC31909e extends DialogC33065b implements C31667a.AbstractC31669b, AbstractC32584f, AbstractC34533b {

    /* renamed from: a */
    private boolean f76228a;

    /* renamed from: b */
    protected Activity f76229b;

    /* renamed from: c */
    protected Bundle f76230c;

    /* renamed from: d */
    protected String f76231d;

    /* renamed from: e */
    protected String f76232e;

    /* renamed from: f */
    protected String f76233f;

    /* renamed from: g */
    protected boolean f76234g;

    /* renamed from: h */
    protected boolean f76235h;

    /* renamed from: i */
    protected View f76236i;

    /* renamed from: j */
    public String f76237j;

    static {
        Covode.recordClassIndex(38653);
    }

    /* renamed from: a */
    public void mo57760a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String aa_() {
        return this.f76231d;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String ab_() {
        return this.f76232e;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String ac_() {
        return this.f76233f;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final Bundle ae_() {
        return this.f76230c;
    }

    public void cancel() {
        super.cancel();
    }

    /* renamed from: e */
    private static boolean m66265e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void show() {
        this.f76228a = false;
        try {
            if (getOwnerActivity() == null || !getOwnerActivity().isFinishing()) {
                super.show();
                C36085cj.m73541a(1, 1, "");
            }
        } catch (Exception unused) {
        }
    }

    public void dismiss() {
        this.f76228a = true;
        super.dismiss();
        C31667a.m65986b(this);
        if (this.f76234g) {
            this.f76234g = false;
            return;
        }
        C36085cj.m73541a(1, 4, "");
        if (!this.f76235h) {
            new Handler().postDelayed(RunnableC31917f.f76263a, 200);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.views.DialogC33065b
    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(C13628n.m24504a(getContext()), -2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2247f.C31667a.AbstractC31669b
    /* renamed from: a */
    public final void mo57661a(int i) {
        if (i == 11 && !this.f76228a) {
            try {
                dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2370c.AbstractC34533b
    /* renamed from: a */
    public final String mo57730a(C34531a aVar) {
        String str = aVar.f81533a;
        str.hashCode();
        if (!str.equals("login")) {
            if (str.equals("dismiss")) {
                cancel();
            }
        } else if (!aVar.mo61000b()) {
            return null;
        } else {
            getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m66265e();
            }
            if (!C58029j.f132256h) {
                new C79459a(getContext()).mo123050a(R.string.dcq).mo123053a();
                return null;
            }
            this.f76234g = true;
            if (isShowing()) {
                dismiss();
            }
            mo57837a((String) aVar.mo60999a());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57837a(String str) {
        this.f76237j = str;
        if (this.f76230c != null) {
            C31718d dVar = new C31718d();
            dVar.f75860b = this.f76230c.getString("enter_from");
            C89219l.m154721d(str, "");
            dVar.f75861c = str;
            dVar.mo57683a();
        }
        C32404v.m66769a((Boolean) false, str, (AbstractC32584f) this, false, (Map<String, ? extends Object>) null, false);
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C31291a.m65463a(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.mo60082a("Mob.Event.LOGIN_SUBMIT_".concat(String.valueOf(str)));
            iFeed0VVManagerService.mo60083b("LOGIN");
        }
        Intent intent = new Intent(this.f76229b, AuthorizeActivity.class);
        Bundle bundle = this.f76230c;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("platform", str);
        intent.putExtra("enter_from", this.f76231d);
        intent.putExtra("enter_method", this.f76232e);
        intent.putExtra("enter_type", this.f76233f);
        Activity activity = this.f76229b;
        if (activity != null) {
            activity.startActivityForResult(intent, 1001);
        }
        m66264a(str, this.f76231d, this.f76232e);
    }

    public AbstractDialogC31909e(Activity activity, Bundle bundle) {
        this(activity, bundle, (byte) 0);
    }

    private AbstractDialogC31909e(Activity activity, Bundle bundle, byte b) {
        super(activity);
        this.f76229b = activity;
        this.f76230c = bundle;
        mo57760a(activity);
        Bundle bundle2 = this.f76230c;
        if (bundle2 != null) {
            this.f76231d = bundle2.getString("enter_from");
            this.f76232e = this.f76230c.getString("enter_method");
            this.f76233f = this.f76230c.getString("enter_type");
        }
    }

    /* renamed from: a */
    private static void m66264a(String str, String str2, String str3) {
        C39162r.m79460a("login_choose_platform", new C31376a().mo57399a("enter_method", str3).mo57399a("enter_from", str2).mo57399a("platform", str).mo57397a("_perf_monitor", 1).f75156a);
    }
}
