package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.ck.a */
public final class C36092a implements IInterceptor {

    /* renamed from: a */
    public static final C36093a f85287a = new C36093a((byte) 0);

    /* renamed from: b */
    private final ArrayList<String> f85288b = C89070n.m154525d("mobile/phoneNumber", "password/change", "emailBind", "setAltLoginMethod");

    static {
        Covode.recordClassIndex(43345);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.a$a */
    public static final class C36093a {
        static {
            Covode.recordClassIndex(43346);
        }

        private C36093a() {
        }

        public /* synthetic */ C36093a(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r6 != null) goto L_0x000d;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r6) {
        /*
            r5 = this;
            r2 = 0
            if (r6 == 0) goto L_0x003b
            android.net.Uri r0 = r6.getUri()
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r6.getUri()
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = r0.getPath()
        L_0x0017:
            java.lang.String r4 = p4600h.p4611f.p4613b.C89219l.m154704a(r1, r2)
            java.util.ArrayList<java.lang.String> r0 = r5.f85288b
            java.util.Iterator r3 = r0.iterator()
        L_0x0021:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            boolean r0 = p4600h.p4622m.C89361p.m154874b(r4, r1, r2)
            if (r0 == 0) goto L_0x0021
            r0 = 1
            return r0
        L_0x003b:
            r1 = r2
            if (r6 == 0) goto L_0x0017
            goto L_0x000d
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36092a.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* renamed from: a */
    private static String m73560a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.a$b */
    static final class DialogInterface$OnClickListenerC36094b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f85289a;

        /* renamed from: b */
        final /* synthetic */ String f85290b;

        /* renamed from: c */
        final /* synthetic */ Bundle f85291c;

        static {
            Covode.recordClassIndex(43347);
        }

        DialogInterface$OnClickListenerC36094b(Context context, String str, Bundle bundle) {
            this.f85289a = context;
            this.f85290b = str;
            this.f85291c = bundle;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C31575b.m65863e().changeEmail((Activity) this.f85289a, this.f85290b, this.f85291c, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d3, code lost:
        if (r16 == null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009d, code lost:
        if (r16 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        if (r16 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ae, code lost:
        if (r16 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01bb  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r15, com.bytedance.router.RouteIntent r16) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36092a.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
