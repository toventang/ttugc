package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.by */
public final class C25855by {

    /* renamed from: a */
    final Uri f60981a;

    /* renamed from: b */
    final String f60982b;

    /* renamed from: c */
    final String f60983c;

    static {
        Covode.recordClassIndex(31270);
    }

    public C25855by(Uri uri) {
        this(uri, "", "");
    }

    /* renamed from: a */
    public final AbstractC25845bo<String> mo42204a(String str, String str2) {
        return new C25852bv(this, str, str2);
    }

    /* renamed from: a */
    public final AbstractC25845bo<Long> mo42203a(String str, long j) {
        return new C25851bu(this, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public final AbstractC25845bo<Boolean> mo42205a(String str, boolean z) {
        return new C25850bt(this, str, Boolean.valueOf(z));
    }

    private C25855by(Uri uri, String str, String str2) {
        this.f60981a = uri;
        this.f60982b = str;
        this.f60983c = str2;
    }
}
