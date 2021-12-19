package com.squareup.p2075a.p2076a.p2080d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.squareup.a.a.d.a */
public final class C29191a implements AbstractC29196f {

    /* renamed from: a */
    private final X509TrustManager f69141a;

    /* renamed from: b */
    private final Method f69142b;

    static {
        Covode.recordClassIndex(35540);
    }

    /* renamed from: a */
    public static AbstractC29196f m58381a(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C29191a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.squareup.p2075a.p2076a.p2080d.AbstractC29196f
    /* renamed from: a */
    public final X509Certificate mo50915a(X509Certificate x509Certificate) {
        Object invoke;
        try {
            Method method = this.f69142b;
            X509TrustManager x509TrustManager = this.f69141a;
            Object[] objArr = {x509Certificate};
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{x509TrustManager, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_tls_AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                invoke = a.second;
            } else {
                invoke = method.invoke(x509TrustManager, objArr);
                C15346a.m28242a(invoke, method, new Object[]{x509TrustManager, objArr}, "com_squareup_okhttp_internal_tls_AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            TrustAnchor trustAnchor = (TrustAnchor) invoke;
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
        }
        return null;
    }

    private C29191a(X509TrustManager x509TrustManager, Method method) {
        this.f69142b = method;
        this.f69141a = x509TrustManager;
    }
}
