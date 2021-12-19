package okhttp3.internal.p4659g;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C90208y;
import okhttp3.EnumC90211z;
import okhttp3.internal.p4661i.AbstractC90164c;
import okhttp3.internal.p4661i.AbstractC90166e;
import okhttp3.internal.p4661i.C90162a;
import okhttp3.internal.p4661i.C90163b;

/* renamed from: okhttp3.internal.g.f */
public class C90160f {

    /* renamed from: a */
    private static final Logger f204719a = Logger.getLogger(C90208y.class.getName());

    /* renamed from: c */
    public static final C90160f f204720c;

    /* renamed from: a */
    public String mo144943a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: a */
    public void mo144949a(SSLSocket sSLSocket, String str, List<EnumC90211z> list) {
    }

    /* renamed from: b */
    public void mo144962b(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public void mo144961b(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: b */
    public boolean mo144952b(String str) {
        return true;
    }

    /* renamed from: c */
    public static boolean m156677c() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: b */
    public SSLContext mo144950b() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    static {
        C90160f a;
        Covode.recordClassIndex(106332);
        if (m156677c()) {
            a = C90151a.m156629a();
            Objects.requireNonNull(a, "No platform found on Android");
        } else if (((!"conscrypt".equals(System.getProperty("okhttp.platform")) && !"Conscrypt".equals(Security.getProviders()[0].getName())) || (a = C90155b.m156650a()) == null) && (a = C90156c.m156658a()) == null && (a = C90157d.m156663a()) == null) {
            a = new C90160f();
        }
        f204720c = a;
    }

    /* renamed from: a */
    public AbstractC90164c mo144945a(X509TrustManager x509TrustManager) {
        return new C90162a(mo144951b(x509TrustManager));
    }

    /* renamed from: b */
    public AbstractC90166e mo144951b(X509TrustManager x509TrustManager) {
        return new C90163b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: a */
    public Object mo144942a(String str) {
        if (f204719a.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public static List<String> m156676a(List<EnumC90211z> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC90211z zVar = list.get(i);
            if (zVar != EnumC90211z.HTTP_1_0) {
                arrayList.add(zVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final AbstractC90164c mo144967c(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager a = mo144944a(sSLSocketFactory);
        if (a != null) {
            return mo144945a(a);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + f204720c + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public X509TrustManager mo144944a(SSLSocketFactory sSLSocketFactory) {
        try {
            Object a = m156675a(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (a == null) {
                return null;
            }
            return (X509TrustManager) m156675a(a, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo144947a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo144946a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public void mo144948a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    static <T> T m156675a(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        if (cls.isInstance(obj2)) {
                            return cls.cast(obj2);
                        }
                    }
                    return null;
                } catch (NoSuchFieldException unused) {
                } catch (IllegalAccessException unused2) {
                    throw new AssertionError();
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = m156675a(obj, Object.class, "delegate");
        } while (obj != null);
        return null;
    }

    /* renamed from: a */
    public void mo144946a(int i, String str, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f204719a.log(level, str, th);
    }
}
