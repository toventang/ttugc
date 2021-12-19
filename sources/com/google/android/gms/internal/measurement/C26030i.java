package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.p1934b.BinderC25327b;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C26030i extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f61321c = null;

    /* renamed from: d */
    private final /* synthetic */ String f61322d = null;

    /* renamed from: e */
    private final /* synthetic */ Context f61323e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f61324f;

    /* renamed from: g */
    private final /* synthetic */ C25939f f61325g;

    static {
        Covode.recordClassIndex(31445);
    }

    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i;
        try {
            this.f61325g.f61099d = new ArrayList();
            String str3 = null;
            if (C25939f.m50215a(this.f61321c, this.f61322d)) {
                str2 = this.f61322d;
                str = this.f61321c;
                str3 = this.f61325g.f61096a;
            } else {
                str = null;
                str2 = null;
            }
            C25939f.m50213a(this.f61323e);
            if (C25939f.f61093e.booleanValue() || str != null) {
                z = true;
            } else {
                z = false;
            }
            C25939f fVar = this.f61325g;
            fVar.f61102h = fVar.mo42390a(this.f61323e, z);
            if (this.f61325g.f61102h != null) {
                int a = DynamiteModule.m49542a(this.f61323e, ModuleDescriptor.MODULE_ID);
                int a2 = DynamiteModule.m49543a(this.f61323e, ModuleDescriptor.MODULE_ID, false);
                if (z) {
                    i = Math.max(a, a2);
                    if (a2 < a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    if (a > 0) {
                        a2 = a;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i = a2;
                }
                this.f61325g.f61102h.initialize(BinderC25327b.m48694a(this.f61323e), new zzae(31000, (long) i, z2, str3, str, str2, this.f61324f), this.f61105a);
            }
        } catch (Exception e) {
            this.f61325g.mo42392a(e, true, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26030i(C25939f fVar, String str, String str2, Context context, Bundle bundle) {
        super(fVar);
        this.f61325g = fVar;
        this.f61323e = context;
        this.f61324f = bundle;
    }
}
