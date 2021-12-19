package com.google.android.gms.internal.p1944c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25258b;
import com.google.android.gms.auth.api.C25260c;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.internal.AbstractC25544g;
import com.google.android.gms.common.internal.C25539d;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.c.b */
public final class C25717b extends AbstractC25544g<AbstractC25718c> {

    /* renamed from: a */
    private final Bundle f60848a;

    static {
        Covode.recordClassIndex(31132);
    }

    public C25717b(Context context, Looper looper, C25539d dVar, C25260c cVar, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar2) {
        super(context, looper, 16, dVar, bVar, cVar2);
        if (cVar == null) {
            this.f60848a = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final String mo41412a() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: b */
    public final String mo41413b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25544g, com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: e */
    public final int mo41416e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: i */
    public final boolean mo41787i() {
        String str;
        Set set;
        C25539d dVar = ((AbstractC25544g) this).f60608r;
        if (dVar.f60585a != null) {
            str = dVar.f60585a.name;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C25539d.C25541b bVar = dVar.f60588d.get(C25258b.f59885a);
        if (bVar == null || bVar.f60605a.isEmpty()) {
            set = dVar.f60586b;
        } else {
            set = new HashSet(dVar.f60586b);
            set.addAll(bVar.f60605a);
        }
        if (!set.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: p */
    public final Bundle mo41793p() {
        return this.f60848a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final /* synthetic */ IInterface mo41411a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof AbstractC25718c) {
            return queryLocalInterface;
        }
        return new C25719d(iBinder);
    }
}
