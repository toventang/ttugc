package com.bytedance.ies.bullet.p1184ui.common;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.l */
public final class C17054l {

    /* renamed from: a */
    public final Uri f40596a;

    /* renamed from: b */
    public final long f40597b;

    static {
        Covode.recordClassIndex(19503);
    }

    public final String toString() {
        return this.f40596a + " [" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(this.f40597b)) + ']';
    }

    public C17054l(Uri uri, long j) {
        C89219l.m154719c(uri, "");
        this.f40596a = uri;
        this.f40597b = j;
    }
}
