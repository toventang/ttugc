package com.p2082ss.android.ugc.aweme.donation.detail;

import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.p2310al.C33489d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.donation.detail.c */
public final class C43137c implements IInterceptor {
    static {
        Covode.recordClassIndex(51309);
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.c$a */
    static final class DialogInterface$OnDismissListenerC43138a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC43138a f100517a = new DialogInterface$OnDismissListenerC43138a();

        static {
            Covode.recordClassIndex(51310);
        }

        DialogInterface$OnDismissListenerC43138a() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC81915c.m141874a(new C33489d(false, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4 != null) goto L_0x000d;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0023
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = r0.getPath()
        L_0x0017:
            java.lang.String r2 = p4600h.p4611f.p4613b.C89219l.m154704a(r1, r2)
            java.lang.String r1 = "donation/pannel"
            r0 = 0
            boolean r0 = p4600h.p4622m.C89361p.m154908a(r2, r1, r0)
            return r0
        L_0x0023:
            r1 = r2
            if (r4 == 0) goto L_0x0017
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.donation.detail.C43137c.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* renamed from: a */
    private static String m86047a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0131, code lost:
        if (r18 != null) goto L_0x000f;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r17, com.bytedance.router.RouteIntent r18) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.donation.detail.C43137c.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
