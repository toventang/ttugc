package com.p2082ss.android.ugc.aweme.analysis;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.framework.p3006a.AbstractC51424b;

/* renamed from: com.ss.android.ugc.aweme.analysis.a */
public final class C33498a implements AbstractC51424b {

    /* renamed from: a */
    private static int f79587a = 20971520;

    /* renamed from: b */
    private static int f79588b = 10485760;

    /* renamed from: c */
    private boolean f79589c;

    @Override // com.p2082ss.android.ugc.aweme.framework.p3006a.AbstractC51424b
    /* renamed from: b */
    public final String mo59594b() {
        return "AppLog";
    }

    static {
        Covode.recordClassIndex(40356);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.p3006a.AbstractC51424b
    /* renamed from: a */
    public final boolean mo59593a() {
        return this.f79589c;
    }

    public C33498a(boolean z) {
        this.f79589c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    @Override // com.p2082ss.android.ugc.aweme.framework.p3006a.AbstractC51424b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59590a(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.analysis.C33498a.mo59590a(android.content.Context):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.p3006a.AbstractC51424b
    /* renamed from: a */
    public final void mo59592a(String str, Throwable th) {
        ALog.m59868e(str, th);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.p3006a.AbstractC51424b
    /* renamed from: a */
    public final void mo59591a(String str, String str2, Exception exc) {
        ALog.m59867e(str, str2, exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.p3006a.AbstractC51424b
    /* renamed from: a */
    public final void mo59589a(int i, String str, String str2) {
        if (i == 2) {
            ALog.m59870v(str, str2);
        } else if (i == 3) {
            ALog.m59865d(str, str2);
        } else if (i == 4) {
            ALog.m59869i(str, str2);
        } else if (i == 5) {
            ALog.m59871w(str, str2);
        } else if (i == 6) {
            ALog.m59866e(str, str2);
        }
    }
}
