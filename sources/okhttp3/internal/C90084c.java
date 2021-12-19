package okhttp3.internal;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import okhttp3.C90198s;
import okhttp3.C90200t;
import okhttp3.C90204w;
import okhttp3.internal.p4657e.C90110c;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89426h;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: okhttp3.internal.c */
public final class C90084c {

    /* renamed from: a */
    public static final byte[] f204446a;

    /* renamed from: b */
    public static final String[] f204447b = new String[0];

    /* renamed from: c */
    public static final AbstractC90031ad f204448c;

    /* renamed from: d */
    public static final AbstractC90025ab f204449d;

    /* renamed from: e */
    public static final Charset f204450e = Charset.forName("UTF-8");

    /* renamed from: f */
    public static final Charset f204451f = Charset.forName("ISO-8859-1");

    /* renamed from: g */
    public static final TimeZone f204452g = TimeZone.getTimeZone("GMT");

    /* renamed from: h */
    public static final Comparator<String> f204453h = new Comparator<String>() {
        /* class okhttp3.internal.C90084c.C900851 */

        static {
            Covode.recordClassIndex(106257);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    };

    /* renamed from: i */
    public static final Method f204454i;

    /* renamed from: j */
    private static final C89427i f204455j = C89427i.decodeHex("efbbbf");

    /* renamed from: k */
    private static final C89427i f204456k = C89427i.decodeHex("feff");

    /* renamed from: l */
    private static final C89427i f204457l = C89427i.decodeHex("fffe");

    /* renamed from: m */
    private static final C89427i f204458m = C89427i.decodeHex("0000ffff");

    /* renamed from: n */
    private static final C89427i f204459n = C89427i.decodeHex("ffff0000");

    /* renamed from: o */
    private static final Charset f204460o = Charset.forName("UTF-16BE");

    /* renamed from: p */
    private static final Charset f204461p = Charset.forName("UTF-16LE");

    /* renamed from: q */
    private static final Charset f204462q = Charset.forName("UTF-32BE");

    /* renamed from: r */
    private static final Charset f204463r = Charset.forName("UTF-32LE");

    /* renamed from: s */
    private static final Pattern f204464s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: a */
    public static int m156400a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static void m156414a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static boolean m156418a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static void m156415a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m156416a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m156417a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (!"bio == null".equals(e2.getMessage())) {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m156420a(AbstractC89408aa aaVar, TimeUnit timeUnit) {
        try {
            return m156419a(aaVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m156419a(AbstractC89408aa aaVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long R_ = aaVar.timeout().mo143780Q_() ? aaVar.timeout().mo143781R_() - nanoTime : Long.MAX_VALUE;
        aaVar.timeout().mo143783a(Math.min(R_, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C89420f fVar = new C89420f();
            while (aaVar.read(fVar, 8192) != -1) {
                fVar.mo143854v();
            }
            if (R_ == Long.MAX_VALUE) {
                aaVar.timeout().mo143785e();
                return true;
            }
            aaVar.timeout().mo143783a(nanoTime + R_);
            return true;
        } catch (InterruptedIOException unused) {
            if (R_ == Long.MAX_VALUE) {
                aaVar.timeout().mo143785e();
                return false;
            }
            aaVar.timeout().mo143783a(nanoTime + R_);
            return false;
        } catch (Throwable th) {
            if (R_ == Long.MAX_VALUE) {
                aaVar.timeout().mo143785e();
            } else {
                aaVar.timeout().mo143783a(nanoTime + R_);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static <T> List<T> m156410a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <T> List<T> m156411a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: a */
    public static ThreadFactory m156412a(final String str, final boolean z) {
        return new ThreadFactory() {
            /* class okhttp3.internal.C90084c.ThreadFactoryC900862 */

            static {
                Covode.recordClassIndex(106258);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* renamed from: a */
    public static String[] m156421a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static boolean m156417a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static Charset m156409a(AbstractC89426h hVar, Charset charset) {
        C89427i iVar = f204455j;
        if (hVar.mo143811c(iVar)) {
            hVar.mo143838l((long) iVar.size());
            return f204450e;
        }
        C89427i iVar2 = f204456k;
        if (hVar.mo143811c(iVar2)) {
            hVar.mo143838l((long) iVar2.size());
            return f204460o;
        }
        C89427i iVar3 = f204457l;
        if (hVar.mo143811c(iVar3)) {
            hVar.mo143838l((long) iVar3.size());
            return f204461p;
        }
        C89427i iVar4 = f204458m;
        if (hVar.mo143811c(iVar4)) {
            hVar.mo143838l((long) iVar4.size());
            return f204462q;
        }
        C89427i iVar5 = f204459n;
        if (!hVar.mo143811c(iVar5)) {
            return charset;
        }
        hVar.mo143838l((long) iVar5.size());
        return f204463r;
    }

    /* renamed from: a */
    public static X509TrustManager m156413a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw m156405a("No System TLS", (Exception) e);
        }
    }

    static {
        Covode.recordClassIndex(106256);
        byte[] bArr = new byte[0];
        f204446a = bArr;
        Method method = null;
        f204448c = AbstractC90031ad.create((C90204w) null, bArr);
        f204449d = AbstractC90025ab.create((C90204w) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f204454i = method;
    }

    /* renamed from: b */
    public static int m156422b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m156427c(String str) {
        return f204464s.matcher(str).matches();
    }

    /* renamed from: d */
    private static boolean m156429d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static C90198s m156424b(List<C90110c> list) {
        C90198s.C90199a aVar = new C90198s.C90199a();
        for (C90110c cVar : list) {
            AbstractC90058a.f204330a.mo144790a(aVar, cVar.f204530g.utf8(), cVar.f204531h.utf8());
        }
        return aVar.mo145040a();
    }

    /* renamed from: a */
    public static String m156406a(String str) {
        InetAddress d;
        if (str.contains(":")) {
            int i = 0;
            if (!str.startsWith("[") || !str.endsWith("]")) {
                d = m156428d(str, 0, str.length());
            } else {
                d = m156428d(str, 1, str.length() - 1);
            }
            if (d == null) {
                return null;
            }
            byte[] address = d.getAddress();
            if (address.length == 16) {
                int i2 = -1;
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C89420f fVar = new C89420f();
                while (i < address.length) {
                    if (i == i2) {
                        fVar.mo68847a(58);
                        i += i4;
                        if (i == 16) {
                            fVar.mo68847a(58);
                        }
                    } else {
                        if (i > 0) {
                            fVar.mo68847a(58);
                        }
                        fVar.mo68858c((long) (((address[i] & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return fVar.mo143848r();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m156429d(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m156407a(String str, Object... objArr) {
        return C1764a.m5929a(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static AssertionError m156405a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: a */
    public static String m156408a(C90200t tVar, boolean z) {
        String str;
        if (tVar.f204861d.contains(":")) {
            str = "[" + tVar.f204861d + "]";
        } else {
            str = tVar.f204861d;
        }
        if (z || tVar.f204862e != C90200t.m156790a(tVar.f204858a)) {
            return str + ":" + tVar.f204862e;
        }
        return str;
    }

    /* renamed from: c */
    public static String m156426c(String str, int i, int i2) {
        int a = m156401a(str, i, i2);
        return str.substring(a, m156423b(str, a, i2));
    }

    /* renamed from: a */
    public static int m156401a(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static int m156423b(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m156404a(String str, long j, TimeUnit timeUnit) {
        if (j >= 0) {
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new IllegalArgumentException(str + " < 0");
        }
    }

    /* renamed from: b */
    public static boolean m156425b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b2, code lost:
        if ((r10 - r1) != 0) goto L_0x00b5;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.InetAddress m156428d(java.lang.String r15, int r16, int r17) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.C90084c.m156428d(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: a */
    public static int m156402a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m156403a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
