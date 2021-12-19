package com.squareup.p2075a.p2076a;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.C29237q;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p4632k.AbstractC89408aa;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: com.squareup.a.a.j */
public final class C29206j {

    /* renamed from: a */
    public static final byte[] f69176a = new byte[0];

    /* renamed from: b */
    public static final String[] f69177b = new String[0];

    /* renamed from: c */
    public static final Charset f69178c = Charset.forName("UTF-8");

    /* renamed from: a */
    public static boolean m58441a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static void m58439a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m58440a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m58443a(AbstractC89408aa aaVar, TimeUnit timeUnit) {
        try {
            return m58442a(aaVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m58442a(AbstractC89408aa aaVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long R_ = aaVar.timeout().mo143780Q_() ? aaVar.timeout().mo143781R_() - nanoTime : Long.MAX_VALUE;
        aaVar.timeout().mo143783a(Math.min(R_, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C89420f fVar = new C89420f();
            while (aaVar.read(fVar, 2048) != -1) {
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

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> T[] m58445a(Class<T> cls, T[] tArr, T[] tArr2) {
        List a = m58435a((Object[]) tArr, (Object[]) tArr2);
        return (T[]) a.toArray((Object[]) Array.newInstance((Class<?>) cls, a.size()));
    }

    /* renamed from: a */
    public static boolean m58440a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static boolean m58444a(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    static {
        Covode.recordClassIndex(35555);
    }

    /* renamed from: b */
    public static ThreadFactory m58446b(final String str) {
        return new ThreadFactory() {
            /* class com.squareup.p2075a.p2076a.C29206j.ThreadFactoryC292071 */

            /* renamed from: b */
            final /* synthetic */ boolean f69180b = true;

            static {
                Covode.recordClassIndex(35556);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(this.f69180b);
                return thread;
            }
        };
    }

    /* renamed from: a */
    public static <T> List<T> m58433a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <T> List<T> m58434a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: a */
    public static String m58431a(C29237q qVar) {
        if (qVar.f69287e != C29237q.m58511a(qVar.f69283a)) {
            return qVar.f69286d + ":" + qVar.f69287e;
        }
        return qVar.f69286d;
    }

    /* renamed from: a */
    public static String m58432a(String str) {
        try {
            return C89427i.m155136of(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).hex();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static C89427i m58436a(C89427i iVar) {
        try {
            return C89427i.m155136of(MessageDigest.getInstance("SHA-1").digest(iVar.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static void m58438a(Closeable closeable) {
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
    private static <T> List<T> m58435a(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m58437a(long j, long j2) {
        if ((j2 | 0) < 0 || 0 > j || j - 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
