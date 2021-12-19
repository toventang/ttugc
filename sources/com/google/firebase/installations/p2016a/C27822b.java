package com.google.firebase.installations.p2016a;

import android.content.SharedPreferences;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.a.b */
public final class C27822b {

    /* renamed from: a */
    private static final String[] f65365a = {"*", "FCM", "GCM", ""};

    /* renamed from: b */
    private final SharedPreferences f65366b;

    /* renamed from: c */
    private final String f65367c;

    static {
        Covode.recordClassIndex(33411);
    }

    /* renamed from: c */
    private String m55641c() {
        String string;
        MethodCollector.m26663i(3278);
        synchronized (this.f65366b) {
            try {
                string = this.f65366b.getString("|S|id", null);
            } finally {
                MethodCollector.m26664o(3278);
            }
        }
        return string;
    }

    /* renamed from: d */
    private String m55642d() {
        MethodCollector.m26663i(3280);
        synchronized (this.f65366b) {
            try {
                String string = this.f65366b.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey b = m55640b(string);
                if (b == null) {
                    MethodCollector.m26664o(3280);
                    return null;
                }
                String a = m55639a(b);
                MethodCollector.m26664o(3280);
                return a;
            } finally {
                MethodCollector.m26664o(3280);
            }
        }
    }

    /* renamed from: b */
    public final String mo46504b() {
        MethodCollector.m26663i(3274);
        synchronized (this.f65366b) {
            try {
                String c = m55641c();
                if (c != null) {
                    return c;
                }
                String d = m55642d();
                MethodCollector.m26664o(3274);
                return d;
            } finally {
                MethodCollector.m26664o(3274);
            }
        }
    }

    /* renamed from: a */
    public final String mo46503a() {
        MethodCollector.m26663i(3176);
        synchronized (this.f65366b) {
            try {
                String[] strArr = f65365a;
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    String string = this.f65366b.getString("|T|" + this.f65367c + "|" + strArr[i], null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = m55638a(string);
                        }
                        return string;
                    }
                }
                MethodCollector.m26664o(3176);
                return null;
            } finally {
                MethodCollector.m26664o(3176);
            }
        }
    }

    /* renamed from: a */
    private static String m55638a(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static PublicKey m55640b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m55639a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r1.isEmpty() != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27822b(com.google.firebase.C27695b r5) {
        /*
            r4 = this;
            r4.<init>()
            android.content.Context r2 = r5.mo46324a()
            java.lang.String r1 = "com.google.android.gms.appid"
            r0 = 0
            android.content.SharedPreferences r0 = com.p2082ss.android.ugc.aweme.p2387bf.C34822d.m71158a(r2, r1, r0)
            r4.f65366b = r0
            com.google.firebase.e r0 = r5.mo46327c()
            java.lang.String r1 = r0.f65182e
            r3 = 0
            if (r1 == 0) goto L_0x001c
        L_0x0019:
            r4.f65367c = r1
            return
        L_0x001c:
            com.google.firebase.e r0 = r5.mo46327c()
            java.lang.String r1 = r0.f65179b
            java.lang.String r0 = "1:"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "2:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0019
        L_0x0032:
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r1.split(r0)
            int r1 = r2.length
            r0 = 4
            if (r1 == r0) goto L_0x003e
        L_0x003c:
            r1 = r3
            goto L_0x0019
        L_0x003e:
            r0 = 1
            r1 = r2[r0]
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0019
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p2016a.C27822b.<init>(com.google.firebase.b):void");
    }
}
