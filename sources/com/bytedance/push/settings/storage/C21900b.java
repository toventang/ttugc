package com.bytedance.push.settings.storage;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.push.settings.storage.b */
final class C21900b {

    /* renamed from: a */
    String f51871a;

    /* renamed from: b */
    String f51872b;

    /* renamed from: c */
    String f51873c;

    /* renamed from: d */
    String f51874d;

    static {
        Covode.recordClassIndex(25564);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Uri mo35632a(Uri uri) {
        return uri.buildUpon().appendPath(this.f51871a).appendPath(this.f51872b).appendPath(this.f51873c).appendPath(this.f51874d).build();
    }

    C21900b(String str, String str2, String str3, String str4) {
        this.f51871a = str;
        this.f51872b = str2;
        this.f51873c = str3;
        this.f51874d = str4;
    }
}
