package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.C25609k;
import com.google.android.gms.p1940d.AbstractC25619a;
import com.google.android.gms.p1940d.AbstractC25631h;

/* renamed from: com.google.firebase.iid.d */
final /* synthetic */ class C27788d implements AbstractC25619a {

    /* renamed from: a */
    private final Context f65290a;

    /* renamed from: b */
    private final Intent f65291b;

    static {
        Covode.recordClassIndex(33376);
    }

    C27788d(Context context, Intent intent) {
        this.f65290a = context;
        this.f65291b = intent;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25619a
    /* renamed from: a */
    public final Object mo41863a(AbstractC25631h hVar) {
        Context context = this.f65290a;
        Intent intent = this.f65291b;
        if (!C25609k.m49423e() || ((Integer) hVar.mo41886d()).intValue() != 402) {
            return hVar;
        }
        return C27786b.m55567a(context, intent).mo41871a(C27791g.f65294a, C27790f.f65293a);
    }
}
