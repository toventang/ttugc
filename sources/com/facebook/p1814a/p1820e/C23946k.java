package com.facebook.p1814a.p1820e;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;

/* renamed from: com.facebook.a.e.k */
final class C23946k {

    /* renamed from: a */
    public String f56690a;

    /* renamed from: b */
    public boolean f56691b;

    static {
        Covode.recordClassIndex(28067);
    }

    /* renamed from: a */
    public final void mo39445a() {
        C24699ae.m47299a();
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C24872m.f59047g).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f56690a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f56691b);
        edit.apply();
    }

    public final String toString() {
        String str;
        if (this.f56691b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        if (this.f56690a != null) {
            return str + "(" + this.f56690a + ")";
        }
        return str;
    }

    C23946k(String str, boolean z) {
        this.f56690a = str;
        this.f56691b = z;
    }
}
