package com.p2082ss.android.ugc.aweme.account.login.p2263h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.login.h.a */
public final class C31940a {

    /* renamed from: a */
    private static final boolean f76283a = false;

    /* renamed from: b */
    private static int f76284b = 86;

    /* renamed from: c */
    private static volatile C31940a f76285c = null;

    /* renamed from: com.ss.android.ugc.aweme.account.login.h.a$a */
    public static class C31941a implements Serializable {
        @AbstractC27891c(mo46611a = "countryIso_")

        /* renamed from: a */
        private String f76286a = Locale.CHINA.getCountry();
        @AbstractC27891c(mo46611a = "rawInput_")

        /* renamed from: b */
        private String f76287b = "";
        @AbstractC27891c(mo46611a = "countryCode_")

        /* renamed from: c */
        private int f76288c = 86;
        @AbstractC27891c(mo46611a = "nationalNumber_")

        /* renamed from: d */
        private long f76289d = 0;

        static {
            Covode.recordClassIndex(38685);
        }

        public int getCountryCode() {
            return this.f76288c;
        }

        public String getCountryIso() {
            return this.f76286a;
        }

        public long getNationalNumber() {
            return this.f76289d;
        }

        public String getRawInput() {
            return this.f76287b;
        }

        public C31941a setCountryCode(int i) {
            this.f76288c = i;
            return this;
        }

        public void setCountryIso(String str) {
            this.f76286a = str;
        }

        public C31941a setNationalNumber(long j) {
            this.f76289d = j;
            return this;
        }

        public C31941a setRawInput(String str) {
            this.f76287b = str;
            return this;
        }

        public static C31941a create(int i, long j) {
            return new C31941a().setCountryCode(i).setNationalNumber(j);
        }
    }

    static {
        Covode.recordClassIndex(38684);
    }

    /* renamed from: a */
    public static String m66307a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(" ");
        if (!str.startsWith("+") || indexOf <= 0) {
            return "";
        }
        return str.substring(1, indexOf);
    }

    /* renamed from: a */
    public static String m66306a(C31941a aVar) {
        if (aVar == null) {
            return "";
        }
        return "+" + aVar.getCountryCode() + " " + aVar.getNationalNumber();
    }

    /* renamed from: b */
    public static String m66309b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(" ");
        if (!str.startsWith("+") || indexOf <= 0 || (i = indexOf + 1) >= str.length()) {
            return str;
        }
        return str.substring(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m66308a(java.lang.String r7, java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r6 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x000e
            return r6
        L_0x000e:
            r4 = 0
            if (r7 == 0) goto L_0x0017
            int r3 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r8 == 0) goto L_0x0020
            long r1 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0020 }
            goto L_0x0022
        L_0x001f:
            r3 = 0
        L_0x0020:
            r1 = 0
        L_0x0022:
            com.ss.android.ugc.aweme.account.login.h.a$a r0 = new com.ss.android.ugc.aweme.account.login.h.a$a
            r0.<init>()
            com.ss.android.ugc.aweme.account.login.h.a$a r0 = r0.setCountryCode(r3)
            com.ss.android.ugc.aweme.account.login.h.a$a r2 = r0.setNationalNumber(r1)
            int r1 = r2.getCountryCode()
            r0 = 86
            r3 = 1
            if (r1 != r0) goto L_0x004a
            long r0 = r2.getNationalNumber()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            r0 = 11
            if (r1 != r0) goto L_0x0049
            return r3
        L_0x0049:
            return r6
        L_0x004a:
            int r0 = r2.getCountryCode()
            if (r0 == 0) goto L_0x0059
            long r1 = r2.getNationalNumber()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0059
            return r3
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a.m66308a(java.lang.String, java.lang.String):boolean");
    }
}
