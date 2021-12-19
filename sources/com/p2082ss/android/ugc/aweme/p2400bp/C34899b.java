package com.p2082ss.android.ugc.aweme.p2400bp;

import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;

/* renamed from: com.ss.android.ugc.aweme.bp.b */
public final /* synthetic */ class C34899b implements ICrashCallback {

    /* renamed from: a */
    public static final ICrashCallback f82350a = new C34899b();

    static {
        Covode.recordClassIndex(41910);
    }

    private C34899b() {
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        GraphicMMTPlugin.m7513c().mo7050b();
    }
}
