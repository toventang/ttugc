package com.p2082ss.android.ugc.aweme.p2400bp;

import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;

/* renamed from: com.ss.android.ugc.aweme.bp.c */
public final /* synthetic */ class C34900c implements ICrashCallback {

    /* renamed from: a */
    public static final ICrashCallback f82351a = new C34900c();

    static {
        Covode.recordClassIndex(41911);
    }

    private C34900c() {
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        GraphicMMTPlugin.m7513c().mo7050b();
    }
}
