package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.measurement.zzae;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.google.android.gms.measurement.internal.gh */
public final class C26410gh {

    /* renamed from: a */
    final Context f62089a;

    /* renamed from: b */
    String f62090b;

    /* renamed from: c */
    String f62091c;

    /* renamed from: d */
    String f62092d;

    /* renamed from: e */
    Boolean f62093e;

    /* renamed from: f */
    long f62094f;

    /* renamed from: g */
    zzae f62095g;

    /* renamed from: h */
    boolean f62096h = true;

    /* renamed from: i */
    Long f62097i;

    static {
        Covode.recordClassIndex(31832);
    }

    public C26410gh(Context context, zzae zzae, Long l) {
        C25565r.m49314a(context);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C25565r.m49314a(applicationContext);
        this.f62089a = applicationContext;
        this.f62097i = l;
        if (zzae != null) {
            this.f62095g = zzae;
            this.f62090b = zzae.f61662f;
            this.f62091c = zzae.f61661e;
            this.f62092d = zzae.f61660d;
            this.f62096h = zzae.f61659c;
            this.f62094f = zzae.f61658b;
            if (zzae.f61663g != null) {
                this.f62093e = Boolean.valueOf(zzae.f61663g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
