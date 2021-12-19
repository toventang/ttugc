package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.utils.fi */
final /* synthetic */ class DialogInterface$OnClickListenerC80434fi implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final Context f180002a;

    /* renamed from: b */
    private final boolean f180003b;

    /* renamed from: c */
    private final AbstractC63755f.C63756a f180004c;

    /* renamed from: d */
    private final boolean f180005d;

    /* renamed from: e */
    private final String f180006e;

    /* renamed from: f */
    private final Runnable f180007f;

    static {
        Covode.recordClassIndex(93702);
    }

    DialogInterface$OnClickListenerC80434fi(Context context, boolean z, AbstractC63755f.C63756a aVar, boolean z2, String str, Runnable runnable) {
        this.f180002a = context;
        this.f180003b = z;
        this.f180004c = aVar;
        this.f180005d = z2;
        this.f180006e = str;
        this.f180007f = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f180002a;
        boolean z = this.f180003b;
        AbstractC63755f.C63756a aVar = this.f180004c;
        boolean z2 = this.f180005d;
        String str = this.f180006e;
        Runnable runnable = this.f180007f;
        try {
            C80428fg.m139434b(context);
        } catch (Exception unused) {
            Intent intent = new Intent("android.settings.SETTINGS");
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
        if (z) {
            C39162r.m79460a("notification_setting_alert_click", new C33744d().mo59983a("enter_from", "notification_setting_page").f79943a);
        } else if (aVar != null) {
            C39162r.m79460a("push_pre_permission_auth", new C33744d().mo59983a("enter_from", aVar.f144527c).mo59983a("enter_method", aVar.f144528d).mo59983a("room_id", aVar.f144525a).mo59983a("anchor_id", aVar.f144526b).mo59983a("enter_reason", "general").f79943a);
        } else if (z2) {
            C39162r.m79460a("push_pre_permission_auth", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "notification_bell").mo59983a("enter_reason", "general").f79943a);
        } else {
            C39162r.m79460a("push_pre_permission_auth", new C33744d().f79943a);
        }
        SharedPreferences a = C34822d.m71158a(context, "NotificationGuide", 0);
        SharedPreferences.Editor edit = a.edit();
        edit.putInt("guide_show_times", a.getInt("guide_show_times", 0) + 1);
        edit.putLong("guide_last_time", System.currentTimeMillis());
        edit.apply();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
