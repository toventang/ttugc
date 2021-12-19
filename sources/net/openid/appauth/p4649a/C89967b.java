package net.openid.appauth.p4649a;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: net.openid.appauth.a.b */
public final class C89967b {

    /* renamed from: a */
    public final String f203859a;

    /* renamed from: b */
    public final Set<String> f203860b;

    /* renamed from: c */
    public final String f203861c;

    /* renamed from: d */
    public final Boolean f203862d;

    static {
        Covode.recordClassIndex(106138);
    }

    public final int hashCode() {
        int hashCode = (((this.f203859a.hashCode() * 92821) + this.f203861c.hashCode()) * 92821) + (this.f203862d.booleanValue() ? 1 : 0);
        for (String str : this.f203860b) {
            hashCode = (hashCode * 92821) + str.hashCode();
        }
        return hashCode;
    }

    /* renamed from: a */
    private static String m156103a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    /* renamed from: a */
    private static Set<String> m156104a(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(m156103a(signature));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C89967b)) {
            C89967b bVar = (C89967b) obj;
            if (!this.f203859a.equals(bVar.f203859a) || !this.f203861c.equals(bVar.f203861c) || this.f203862d != bVar.f203862d || !this.f203860b.equals(bVar.f203860b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C89967b(PackageInfo packageInfo, boolean z) {
        this(packageInfo.packageName, m156104a(packageInfo.signatures), packageInfo.versionName, z);
    }

    private C89967b(String str, Set<String> set, String str2, boolean z) {
        this.f203859a = str;
        this.f203860b = set;
        this.f203861c = str2;
        this.f203862d = Boolean.valueOf(z);
    }
}
