package com.squareup.p2075a.p2076a.p2078b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.squareup.a.a.b.p */
public final class C29182p extends Exception {

    /* renamed from: a */
    private static final Method f69102a;

    /* renamed from: b */
    private IOException f69103b;

    public final IOException getLastConnectException() {
        return this.f69103b;
    }

    static {
        Method method;
        Covode.recordClassIndex(35531);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f69102a = method;
    }

    public C29182p(IOException iOException) {
        super(iOException);
        this.f69103b = iOException;
    }

    public final void addConnectException(IOException iOException) {
        IOException iOException2 = this.f69103b;
        Method method = f69102a;
        if (method != null) {
            try {
                Object[] objArr = {iOException2};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{iOException, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_http_RouteException_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    Object obj = a.second;
                } else {
                    C15346a.m28242a(method.invoke(iOException, objArr), method, new Object[]{iOException, objArr}, "com_squareup_okhttp_internal_http_RouteException_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.f69103b = iOException;
    }
}
