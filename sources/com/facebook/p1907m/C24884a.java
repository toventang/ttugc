package com.facebook.p1907m;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24742f;
import com.facebook.internal.C24743g;
import com.facebook.login.C24846a;

/* renamed from: com.facebook.m.a */
final class C24884a {

    /* renamed from: a */
    protected String f59066a;

    /* renamed from: b */
    private Fragment f59067b;

    /* renamed from: c */
    private String f59068c;

    static {
        Covode.recordClassIndex(29073);
    }

    /* renamed from: b */
    private String m47706b() {
        if (this.f59068c == null) {
            this.f59068c = C24743g.m47374a();
        }
        return this.f59068c;
    }

    /* renamed from: c */
    private static String m47707c() {
        StringBuilder sb = new StringBuilder("fb");
        C24699ae.m47299a();
        return sb.append(C24872m.f59041a).append("://authorize").toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40775a() {
        if (this.f59067b.getActivity() == null || this.f59067b.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0 || m47706b() == null) {
            Intent intent = new Intent();
            intent.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
            m47705a(0, intent);
            return;
        }
        Bundle bundle = new Bundle();
        this.f59066a = C24693ad.m47264b();
        bundle.putString("redirect_uri", C24743g.m47375a(m47707c()));
        C24699ae.m47299a();
        bundle.putString("app_id", C24872m.f59041a);
        bundle.putString("state", this.f59066a);
        if (C24872m.f59049i) {
            C24846a.m47649a(C24742f.m47372a("share_referral", bundle));
        }
        Intent intent2 = new Intent(this.f59067b.getActivity(), CustomTabMainActivity.class);
        intent2.putExtra(CustomTabMainActivity.f56415a, "share_referral");
        intent2.putExtra(CustomTabMainActivity.f56416b, bundle);
        intent2.putExtra(CustomTabMainActivity.f56417c, m47706b());
        this.f59067b.startActivityForResult(intent2, 1);
    }

    C24884a(Fragment fragment) {
        this.f59067b = fragment;
    }

    /* renamed from: a */
    private static String m47704a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m47705a(int i, Intent intent) {
        ActivityC0945e activity;
        if (this.f59067b.isAdded() && (activity = this.f59067b.getActivity()) != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40776a(int i, int i2, Intent intent) {
        String a;
        if (i == 1) {
            if (!(intent == null || (a = m47704a(intent, CustomTabMainActivity.f56418d)) == null || !a.startsWith(C24743g.m47375a(m47707c())))) {
                Bundle c = C24693ad.m47271c(Uri.parse(a).getQuery());
                if (this.f59066a != null) {
                    boolean equals = this.f59066a.equals(c.getString("state"));
                    this.f59066a = null;
                    if (!equals) {
                        i2 = 0;
                        intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
                    }
                }
                intent.putExtras(c);
            }
            m47705a(i2, intent);
        }
    }
}
