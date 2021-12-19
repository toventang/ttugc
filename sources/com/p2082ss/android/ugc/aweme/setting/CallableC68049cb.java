package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.cb */
public final /* synthetic */ class CallableC68049cb implements Callable {

    /* renamed from: a */
    private final AbstractC68041bz f152430a;

    /* renamed from: b */
    private final Object f152431b;

    /* renamed from: c */
    private final boolean f152432c;

    static {
        Covode.recordClassIndex(80245);
    }

    CallableC68049cb(AbstractC68041bz bzVar, Object obj, boolean z) {
        this.f152430a = bzVar;
        this.f152431b = obj;
        this.f152432c = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AbstractC68041bz bzVar = this.f152430a;
        Object obj = this.f152431b;
        boolean z = this.f152432c;
        if (obj == null || !(obj instanceof C28022o)) {
            return null;
        }
        bzVar.mo108657a((C28022o) obj, z);
        bzVar.mo108642a(obj);
        return null;
    }
}
