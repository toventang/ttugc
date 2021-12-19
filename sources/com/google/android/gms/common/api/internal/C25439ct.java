package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25335a.AbstractC25339d;
import com.google.android.gms.common.api.C25354h;
import com.google.android.gms.common.api.internal.C25450f;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.signin.AbstractC26544d;
import com.google.android.gms.signin.C26541a;

/* renamed from: com.google.android.gms.common.api.internal.ct */
public final class C25439ct<O extends C25335a.AbstractC25339d> extends C25354h<O> {

    /* renamed from: i */
    public final C25335a.AbstractC25343f f60380i;

    /* renamed from: j */
    private final C25432cm f60381j;

    /* renamed from: k */
    private final C25539d f60382k;

    /* renamed from: l */
    private final C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> f60383l;

    static {
        Covode.recordClassIndex(30838);
    }

    @Override // com.google.android.gms.common.api.C25354h
    /* renamed from: a */
    public final C25335a.AbstractC25343f mo41507a(Looper looper, C25450f.C25451a<O> aVar) {
        this.f60381j.f60343b = aVar;
        return this.f60380i;
    }

    @Override // com.google.android.gms.common.api.C25354h
    /* renamed from: a */
    public final BinderC25408br mo41508a(Context context, Handler handler) {
        return new BinderC25408br(context, handler, this.f60382k, this.f60383l);
    }

    public C25439ct(Context context, C25335a<O> aVar, Looper looper, C25335a.AbstractC25343f fVar, C25432cm cmVar, C25539d dVar, C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar2) {
        super(context, aVar, looper);
        this.f60380i = fVar;
        this.f60381j = cmVar;
        this.f60382k = dVar;
        this.f60383l = aVar2;
        this.f60125h.mo41686a(this);
    }
}
