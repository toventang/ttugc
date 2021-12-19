package com.bytedance.android.live.broadcast.model;

import android.net.Uri;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p542g.C8779e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.broadcast.model.m */
public final class C3269m {

    /* renamed from: a */
    public final String f9358a;

    /* renamed from: b */
    public final String f9359b;

    /* renamed from: c */
    public final long f9360c;

    /* renamed from: d */
    public final long f9361d;

    static {
        Covode.recordClassIndex(3751);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3269m)) {
            return false;
        }
        C3269m mVar = (C3269m) obj;
        return this.f9360c == mVar.f9360c && this.f9361d == mVar.f9361d;
    }

    public final String toString() {
        return "PreviewBlockInfo(endTime=" + this.f9360c + ", logId=" + this.f9361d + ")";
    }

    public final int hashCode() {
        long j = this.f9360c;
        long j2 = this.f9361d;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C3269m(long j, long j2) {
        String a;
        this.f9360c = j;
        this.f9361d = j2;
        if (j == -1) {
            a = C3966y.m9657a((int) R.string.eas);
        } else {
            Date date = new Date(j * 1000);
            String a2 = C3966y.m9657a((int) R.string.eau);
            C89219l.m154716b(a2, "");
            String format = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date);
            C89219l.m154716b(format, "");
            String a3 = C89361p.m154868a(a2, "{0}", format);
            String format2 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
            C89219l.m154716b(format2, "");
            a = C89361p.m154868a(a3, "{1}", format2);
        }
        this.f9358a = a == null ? "" : a;
        String uri = Uri.parse(C8779e.m17078a()).buildUpon().appendQueryParameter("id", String.valueOf(j2)).build().toString();
        C89219l.m154716b(uri, "");
        this.f9359b = uri;
    }
}
