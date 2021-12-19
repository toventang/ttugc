package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.ab */
public final class C31858ab {

    /* renamed from: a */
    public static final C31858ab f76125a = new C31858ab();

    private C31858ab() {
    }

    static {
        Covode.recordClassIndex(38600);
    }

    /* renamed from: a */
    public static void m66186a(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        if (intent != null) {
            activity.startActivityForResult(intent, 1001);
        }
    }

    /* renamed from: a */
    public static AbstractC31960l m66185a(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str == null) {
            C89219l.m154715b();
        }
        if (str2 == null) {
            str2 = "";
        }
        C31972p pVar = new C31972p(str, z, str2);
        if (pVar.mo57878a()) {
            return pVar;
        }
        return null;
    }

    /* renamed from: a */
    public static void m66187a(Activity activity, String str, AbstractC32584f fVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        Intent a = m66184a(activity, false, str, fVar);
        if (a != null) {
            activity.startActivityForResult(a, 1001);
        }
    }

    /* renamed from: a */
    public static Intent m66184a(Activity activity, boolean z, String str, AbstractC32584f fVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        AbstractC31960l a = m66185a(str, z, fVar.aa_());
        if (a != null) {
            a.mo57877a(activity);
            return null;
        }
        C32404v.m66770a((Boolean) null, str, fVar, false, (Map) null, false, 56);
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C31291a.m65463a(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.mo60082a("Mob.Event.LOGIN_SUBMIT_".concat(String.valueOf(str)));
            iFeed0VVManagerService.mo60083b("LOGIN");
        }
        Intent intent = new Intent(activity, AuthorizeActivity.class);
        Bundle ae_ = fVar.ae_();
        if (ae_ != null) {
            intent.putExtras(ae_);
        }
        intent.putExtra("platform", str).putExtra("enter_from", fVar.aa_()).putExtra("enter_method", fVar.ab_());
        C31959k.m66326a(str, fVar.aa_(), fVar.ab_());
        return intent;
    }
}
