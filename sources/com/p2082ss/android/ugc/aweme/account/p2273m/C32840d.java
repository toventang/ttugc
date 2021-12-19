package com.p2082ss.android.ugc.aweme.account.p2273m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.m.d */
public final class C32840d {

    /* renamed from: a */
    public static long f78210a;

    /* renamed from: b */
    public static final C32841a f78211b = new C32841a((byte) 0);

    static {
        Covode.recordClassIndex(39624);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.m.d$a */
    public static final class C32841a {
        static {
            Covode.recordClassIndex(39625);
        }

        private C32841a() {
        }

        public /* synthetic */ C32841a(byte b) {
            this();
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        /* renamed from: a */
        public static void m67412a(int r2, int r3, java.lang.String r4) {
            /*
                java.lang.String r0 = ""
                org.json.JSONObject r1 = m67410a(r3, r4, r0)
                java.lang.String r0 = "monitor_login_email"
                com.p2082ss.android.ugc.aweme.account.p2273m.C32837b.m67403a(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2273m.C32840d.C32841a.m67412a(int, int, java.lang.String):void");
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        /* renamed from: b */
        public static void m67417b(boolean r2, int r3, java.lang.String r4) {
            /*
                r2 = r2 ^ 1
                java.lang.String r0 = ""
                org.json.JSONObject r1 = m67410a(r3, r4, r0)
                java.lang.String r0 = "monitor_login_phone_sms"
                com.p2082ss.android.ugc.aweme.account.p2273m.C32837b.m67403a(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2273m.C32840d.C32841a.m67417b(boolean, int, java.lang.String):void");
        }

        /* renamed from: b */
        private static JSONObject m67415b(int i, String str, String str2) {
            C33743c cVar = new C33743c();
            long currentTimeMillis = System.currentTimeMillis() - C32840d.f78210a;
            C32840d.f78210a = 0;
            if (i != 0) {
                cVar.mo59974a("error_code", Integer.valueOf(i)).mo59976a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.mo59976a("platform", str2);
            }
            cVar.mo59975a("time", Long.valueOf(currentTimeMillis));
            JSONObject a = cVar.mo59977a();
            C89219l.m154716b(a, "");
            return a;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        /* renamed from: a */
        public static void m67414a(boolean r2, int r3, java.lang.String r4) {
            /*
                r2 = r2 ^ 1
                java.lang.String r0 = ""
                org.json.JSONObject r1 = m67410a(r3, r4, r0)
                java.lang.String r0 = "monitor_login_phone_passport"
                com.p2082ss.android.ugc.aweme.account.p2273m.C32837b.m67403a(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2273m.C32840d.C32841a.m67414a(boolean, int, java.lang.String):void");
        }

        /* renamed from: b */
        public static void m67416b(int i, int i2, String str) {
            C33743c cVar = new C33743c();
            if (i2 != 0) {
                cVar.mo59974a("error_code", Integer.valueOf(i2)).mo59976a("error_desc", str);
            }
            JSONObject a = cVar.mo59977a();
            C89219l.m154716b(a, "");
            C32837b.m67403a("monitor_login_verified_env", i, a);
        }

        /* renamed from: a */
        public static void m67413a(int i, String str, int i2, String str2) {
            C89219l.m154721d(str, "");
            C32837b.m67403a("monitor_login_thirdparty", i, m67415b(i2, str2, str));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static JSONObject m67411a(int i, String str, String str2, String str3) {
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C33743c cVar = new C33743c();
            if (i != 0) {
                cVar.mo59974a("error_code", Integer.valueOf(i)).mo59976a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.mo59976a("platform", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                cVar.mo59976a("carrier_type", str3);
            }
            JSONObject a = cVar.mo59977a();
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: a */
    public static final void m67409a(boolean r7, int r8, java.lang.String r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2273m.C32840d.m67409a(boolean, int, java.lang.String, android.os.Bundle):void");
    }
}
