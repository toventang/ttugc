package com.bytedance.crash.ensure;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.p932j.C13911h;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Collection;
import java.util.Map;

public class EnsureInitInner$1 implements IEnsure {
    static {
        Covode.recordClassIndex(15918);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere() {
        C13849d.m25013a(null, "EnsureNotReachHere", null);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void reportLogException(Throwable th) {
        ensureNotReachHere(th);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureFalse(boolean z) {
        if (z) {
            C13849d.m25013a(null, "EnsureFalse", null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureNotNull(Object obj) {
        if (obj != null) {
            return true;
        }
        C13849d.m25013a(null, "EnsureNotNull", null);
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(String str) {
        C13849d.m25013a(str, "EnsureNotReachHere", null);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureTrue(boolean z) {
        if (!z) {
            C13849d.m25013a(null, "EnsureTrue", null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureNotEmpty(Collection collection) {
        if (collection != null && collection.size() != 0) {
            return true;
        }
        C13849d.m25013a(null, "EnsureNotEmpty", null);
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(Throwable th) {
        if (C13849d.m25016a(th)) {
            C13911h.m25183a(th, null, true);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void reportLogException(Throwable th, String str) {
        ensureNotReachHere(th, str);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureFalse(boolean z, String str) {
        if (z) {
            C13849d.m25013a(str, "EnsureFalse", null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureNotNull(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        C13849d.m25013a(str, "EnsureNotNull", null);
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(String str, Map<String, String> map) {
        C13849d.m25013a(str, "EnsureNotReachHere", map);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureTrue(boolean z, String str) {
        if (!z) {
            C13849d.m25013a(str, "EnsureTrue", null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(Throwable th, String str) {
        if (C13849d.m25016a(th)) {
            C13911h.m25183a(th, str, true);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        if (z) {
            C13849d.m25013a(str, "EnsureFalse", map);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        if (!z) {
            C13849d.m25013a(str, "EnsureTrue", map);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void reportLogException(int i, Throwable th, String str) {
        if (C13849d.m25016a(th)) {
            C13911h.m25183a(th, str, false);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (C13849d.m25016a(th)) {
            C13911h.m25185a(th, str, true, map, "core_exception_monitor");
        }
    }
}
