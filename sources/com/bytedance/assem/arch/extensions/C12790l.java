package com.bytedance.assem.arch.extensions;

import android.os.Build;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.l */
public final class C12790l {
    static {
        Covode.recordClassIndex(14618);
    }

    /* renamed from: a */
    private static boolean m23012a(ActivityC0945e eVar) {
        C89219l.m154719c(eVar, "");
        if (eVar.isFinishing()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (eVar.isDestroyed()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m23013a(ActivityC0945e eVar, AbstractC1204m mVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(mVar, "");
        if (!m23012a(eVar)) {
            return false;
        }
        AbstractC1196i lifecycle = mVar.getLifecycle();
        C89219l.m154709a((Object) lifecycle, "");
        if (lifecycle.mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
            return false;
        }
        return true;
    }
}
