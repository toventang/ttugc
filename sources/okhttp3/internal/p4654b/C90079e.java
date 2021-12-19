package okhttp3.internal.p4654b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.internal.b.e */
public final class C90079e extends RuntimeException {

    /* renamed from: a */
    private IOException f204418a;

    /* renamed from: b */
    private IOException f204419b;

    static {
        Covode.recordClassIndex(106251);
    }

    public final IOException getFirstConnectException() {
        return this.f204418a;
    }

    public final IOException getLastConnectException() {
        return this.f204419b;
    }

    public C90079e(IOException iOException) {
        super(iOException);
        this.f204418a = iOException;
        this.f204419b = iOException;
    }

    public final void addConnectException(IOException iOException) {
        IOException iOException2 = this.f204418a;
        if (C90084c.f204454i != null) {
            try {
                Method method = C90084c.f204454i;
                Object[] objArr = {iOException};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{iOException2, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_Util_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    Object obj = a.second;
                } else {
                    C15346a.m28242a(method.invoke(iOException2, objArr), method, new Object[]{iOException2, objArr}, "okhttp3_internal_Util_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.f204419b = iOException;
    }
}
