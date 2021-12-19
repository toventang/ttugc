package com.p2082ss.android.ugc.aweme.app.accountsdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* renamed from: com.ss.android.ugc.aweme.app.accountsdk.g */
public class C33582g implements IAccountService.AbstractC31276f {

    /* renamed from: a */
    protected boolean f79750a = false;

    /* renamed from: b */
    protected boolean f79751b = false;

    /* renamed from: c */
    Activity f79752c = null;

    /* renamed from: d */
    private Handler f79753d = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(40472);
    }

    public C33582g() {
    }

    public C33582g(Activity activity) {
        this.f79752c = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r6 != 10) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r7 == 4) goto L_0x0052;
     */
    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31276f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57085a(int r6, int r7) {
        /*
            r5 = this;
            r4 = 1
            r0 = 9
            if (r6 != r0) goto L_0x0017
            if (r7 != r4) goto L_0x005f
            com.ss.android.ugc.aweme.video.i r0 = com.p2082ss.android.ugc.aweme.video.C81079v.m140776O()
            r0.mo123908B()
        L_0x000e:
            com.ss.android.ugc.aweme.login.a.b r0 = new com.ss.android.ugc.aweme.login.a.b
            r0.<init>(r4)
            com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r0)
        L_0x0016:
            return
        L_0x0017:
            r1 = 4
            if (r6 != r4) goto L_0x0047
            r2 = 500(0x1f4, double:2.47E-321)
            if (r7 != r4) goto L_0x0032
            com.ss.android.ugc.aweme.video.i r0 = com.p2082ss.android.ugc.aweme.video.C81079v.m140776O()
            boolean r0 = r0.mo123892o()
            if (r0 == 0) goto L_0x000e
            android.os.Handler r1 = r5.f79753d
            java.lang.Runnable r0 = com.p2082ss.android.ugc.aweme.app.accountsdk.RunnableC33583h.f79754a
            r1.postDelayed(r0, r2)
            r5.f79750a = r4
            goto L_0x000e
        L_0x0032:
            if (r7 != r1) goto L_0x0050
            boolean r0 = r5.f79750a
            if (r0 != 0) goto L_0x003c
            boolean r0 = r5.f79751b
            if (r0 == 0) goto L_0x0052
        L_0x003c:
            android.os.Handler r1 = r5.f79753d
            com.ss.android.ugc.aweme.app.accountsdk.i r0 = new com.ss.android.ugc.aweme.app.accountsdk.i
            r0.<init>(r5)
            r1.postDelayed(r0, r2)
            goto L_0x0052
        L_0x0047:
            if (r6 == r4) goto L_0x0050
            r0 = 7
            if (r6 == r0) goto L_0x0050
            r0 = 10
            if (r6 != r0) goto L_0x005f
        L_0x0050:
            if (r7 != r1) goto L_0x005f
        L_0x0052:
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            java.lang.Runnable r2 = com.p2082ss.android.ugc.aweme.app.accountsdk.RunnableC33585j.f79756a
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            goto L_0x0016
        L_0x005f:
            if (r7 != r4) goto L_0x0016
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.accountsdk.C33582g.mo57085a(int, int):void");
    }
}
