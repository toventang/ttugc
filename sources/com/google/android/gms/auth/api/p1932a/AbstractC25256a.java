package com.google.android.gms.auth.api.p1932a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25354h;
import com.google.android.gms.common.api.internal.C25363a;
import com.google.android.gms.internal.p1943b.C25711g;
import com.google.android.gms.p1940d.AbstractC25631h;

/* renamed from: com.google.android.gms.auth.api.a.a */
public abstract class AbstractC25256a extends C25354h<Object> {

    /* renamed from: i */
    private static final C25335a.C25344g<C25711g> f59882i;

    /* renamed from: j */
    private static final C25335a.AbstractC25336a<C25711g, Object> f59883j;

    /* renamed from: k */
    private static final C25335a<Object> f59884k;

    static {
        Covode.recordClassIndex(30628);
        C25335a.C25344g<C25711g> gVar = new C25335a.C25344g<>();
        f59882i = gVar;
        C25257b bVar = new C25257b();
        f59883j = bVar;
        f59884k = new C25335a<>("SmsRetriever.API", bVar, gVar);
    }

    public AbstractC25256a(Context context) {
        super(context, f59884k, (C25335a.AbstractC25339d) null, new C25363a());
    }

    /* renamed from: a */
    public abstract AbstractC25631h<Void> mo41298a();
}
