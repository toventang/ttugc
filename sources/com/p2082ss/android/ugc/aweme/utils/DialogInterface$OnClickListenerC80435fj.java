package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79656f;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.utils.fj */
final /* synthetic */ class DialogInterface$OnClickListenerC80435fj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final boolean f180008a;

    /* renamed from: b */
    private final AbstractC63755f.C63756a f180009b;

    /* renamed from: c */
    private final boolean f180010c;

    /* renamed from: d */
    private final String f180011d;

    /* renamed from: e */
    private final Context f180012e;

    /* renamed from: f */
    private final Runnable f180013f;

    static {
        Covode.recordClassIndex(93703);
    }

    DialogInterface$OnClickListenerC80435fj(boolean z, AbstractC63755f.C63756a aVar, boolean z2, String str, Context context, Runnable runnable) {
        this.f180008a = z;
        this.f180009b = aVar;
        this.f180010c = z2;
        this.f180011d = str;
        this.f180012e = context;
        this.f180013f = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f180008a;
        AbstractC63755f.C63756a aVar = this.f180009b;
        boolean z2 = this.f180010c;
        String str = this.f180011d;
        Context context = this.f180012e;
        Runnable runnable = this.f180013f;
        dialogInterface.dismiss();
        if (z) {
            C39162r.m79460a("notification_setting_alert_close", new C33744d().mo59983a("enter_from", "notification_setting_page").f79943a);
        } else if (aVar != null) {
            C39162r.m79460a("push_pre_permission_deny", new C33744d().mo59983a("enter_from", aVar.f144527c).mo59983a("enter_method", aVar.f144528d).mo59983a("room_id", aVar.f144525a).mo59983a("anchor_id", aVar.f144526b).mo59983a("enter_reason", "general").f79943a);
        } else if (z2) {
            C39162r.m79460a("push_pre_permission_deny", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "notification_bell").mo59983a("enter_reason", "general").f79943a);
        } else {
            C39162r.m79460a("push_pre_permission_deny", new C33744d().f79943a);
        }
        SharedPreferences a = C34822d.m71158a(context, "NotificationGuide", 0);
        SharedPreferences.Editor edit = a.edit();
        edit.putInt("guide_show_times", a.getInt("guide_show_times", 0) + 1);
        edit.putLong("guide_last_time", System.currentTimeMillis());
        edit.apply();
        if (runnable != null) {
            runnable.run();
        }
        AbstractC81915c.m141874a(new C79656f());
    }
}
