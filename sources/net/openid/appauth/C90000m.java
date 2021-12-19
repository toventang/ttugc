package net.openid.appauth;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import net.openid.appauth.p4651c.C89977a;

/* renamed from: net.openid.appauth.m */
public final class C90000m {

    /* renamed from: a */
    private static final Pattern f204021a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    static {
        Covode.recordClassIndex(106171);
    }

    /* renamed from: a */
    public static String m156177a() {
        try {
            MessageDigest.getInstance("SHA-256");
            return "S256";
        } catch (NoSuchAlgorithmException unused) {
            return "plain";
        }
    }

    /* renamed from: a */
    public static void m156178a(String str) {
        boolean z;
        boolean z2 = true;
        if (43 <= str.length()) {
            z = true;
        } else {
            z = false;
        }
        C90009p.m156200a(z, "codeVerifier length is shorter than allowed by the PKCE specification");
        if (str.length() > 128) {
            z2 = false;
        }
        C90009p.m156200a(z2, "codeVerifier length is longer than allowed by the PKCE specification");
        C90009p.m156200a(f204021a.matcher(str).matches(), "codeVerifier string contains illegal characters");
    }

    /* renamed from: b */
    public static String m156179b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("ISO_8859_1"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            C89977a.m156122c("SHA-256 is not supported on this device! Using plain challenge", e);
            return str;
        } catch (UnsupportedEncodingException e2) {
            C89977a.m156123d("ISO-8859-1 encoding not supported on this device!", e2);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e2);
        }
    }
}
