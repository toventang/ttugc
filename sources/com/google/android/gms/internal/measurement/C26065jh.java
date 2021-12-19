package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.jh */
public final class C26065jh {

    /* renamed from: a */
    static final boolean f61380a = m50965c();

    /* renamed from: b */
    static final boolean f61381b = m50962b();

    /* renamed from: c */
    static final boolean f61382c;

    /* renamed from: d */
    private static final Logger f61383d = Logger.getLogger(C26065jh.class.getName());

    /* renamed from: e */
    private static final Unsafe f61384e;

    /* renamed from: f */
    private static final Class<?> f61385f = C25933eu.f61083a;

    /* renamed from: g */
    private static final boolean f61386g;

    /* renamed from: h */
    private static final boolean f61387h;

    /* renamed from: i */
    private static final AbstractC26068c f61388i;

    /* renamed from: j */
    private static final long f61389j;

    /* renamed from: k */
    private static final long f61390k = ((long) m50958b(boolean[].class));

    /* renamed from: l */
    private static final long f61391l = ((long) m50963c(boolean[].class));

    /* renamed from: m */
    private static final long f61392m = ((long) m50958b(int[].class));

    /* renamed from: n */
    private static final long f61393n = ((long) m50963c(int[].class));

    /* renamed from: o */
    private static final long f61394o = ((long) m50958b(long[].class));

    /* renamed from: p */
    private static final long f61395p = ((long) m50963c(long[].class));

    /* renamed from: q */
    private static final long f61396q = ((long) m50958b(float[].class));

    /* renamed from: r */
    private static final long f61397r = ((long) m50963c(float[].class));

    /* renamed from: s */
    private static final long f61398s = ((long) m50958b(double[].class));

    /* renamed from: t */
    private static final long f61399t = ((long) m50963c(double[].class));

    /* renamed from: u */
    private static final long f61400u = ((long) m50958b(Object[].class));

    /* renamed from: v */
    private static final long f61401v = ((long) m50963c(Object[].class));

    /* renamed from: w */
    private static final long f61402w;

    /* renamed from: x */
    private static final int f61403x;

    private C26065jh() {
    }

    /* renamed from: a */
    static void m50954a(Object obj, long j, long j2) {
        f61388i.mo42801a(obj, j, j2);
    }

    /* renamed from: a */
    static void m50956a(Object obj, long j, boolean z) {
        f61388i.mo42796a(obj, j, z);
    }

    /* renamed from: a */
    static void m50955a(Object obj, long j, Object obj2) {
        f61388i.f61404a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static void m50957a(byte[] bArr, long j, byte b) {
        f61388i.mo42793a((Object) bArr, f61389j + j, b);
    }

    /* renamed from: d */
    private static Field m50968d() {
        Field a;
        if (C25933eu.m50185a() && (a = m50948a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a;
        }
        Field a2 = m50948a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    static Unsafe m50949a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C26064jg());
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        long j;
        boolean z;
        Covode.recordClassIndex(31480);
        Unsafe a = m50949a();
        f61384e = a;
        boolean d = m50969d(Long.TYPE);
        f61386g = d;
        boolean d2 = m50969d(Integer.TYPE);
        f61387h = d2;
        AbstractC26068c cVar = null;
        if (a != null) {
            if (!C25933eu.m50185a()) {
                cVar = new C26069d(a);
            } else if (d) {
                cVar = new C26066a(a);
            } else if (d2) {
                cVar = new C26067b(a);
            }
        }
        f61388i = cVar;
        long b = (long) m50958b(byte[].class);
        f61389j = b;
        Field d3 = m50968d();
        if (d3 == null || cVar == null) {
            j = -1;
        } else {
            j = cVar.f61404a.objectFieldOffset(d3);
        }
        f61402w = j;
        f61403x = (int) (7 & b);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f61382c = z;
    }

    /* renamed from: c */
    private static boolean m50965c() {
        Unsafe unsafe = f61384e;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (m50968d() == null) {
                return false;
            }
            if (C25933eu.m50185a()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f61383d;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m50962b() {
        Unsafe unsafe = f61384e;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (C25933eu.m50185a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f61383d;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.jh$a */
    static final class C26066a extends AbstractC26068c {
        static {
            Covode.recordClassIndex(31481);
        }

        C26066a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final byte mo42792a(Object obj, long j) {
            if (C26065jh.f61382c) {
                return C26065jh.m50972g(obj, j);
            }
            return C26065jh.m50973h(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: b */
        public final boolean mo42797b(Object obj, long j) {
            if (C26065jh.f61382c) {
                return C26065jh.m50974i(obj, j);
            }
            return C26065jh.m50975j(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: c */
        public final float mo42798c(Object obj, long j) {
            return Float.intBitsToFloat(mo42802e(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: d */
        public final double mo42799d(Object obj, long j) {
            return Double.longBitsToDouble(mo42803f(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42795a(Object obj, long j, float f) {
            mo42800a(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42793a(Object obj, long j, byte b) {
            if (C26065jh.f61382c) {
                C26065jh.m50950a(obj, j, b);
            } else {
                C26065jh.m50960b(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42794a(Object obj, long j, double d) {
            mo42801a(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42796a(Object obj, long j, boolean z) {
            if (C26065jh.f61382c) {
                C26065jh.m50961b(obj, j, z);
            } else {
                C26065jh.m50964c(obj, j, z);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.jh$b */
    static final class C26067b extends AbstractC26068c {
        static {
            Covode.recordClassIndex(31482);
        }

        C26067b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final byte mo42792a(Object obj, long j) {
            if (C26065jh.f61382c) {
                return C26065jh.m50972g(obj, j);
            }
            return C26065jh.m50973h(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: b */
        public final boolean mo42797b(Object obj, long j) {
            if (C26065jh.f61382c) {
                return C26065jh.m50974i(obj, j);
            }
            return C26065jh.m50975j(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: c */
        public final float mo42798c(Object obj, long j) {
            return Float.intBitsToFloat(mo42802e(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: d */
        public final double mo42799d(Object obj, long j) {
            return Double.longBitsToDouble(mo42803f(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42795a(Object obj, long j, float f) {
            mo42800a(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42793a(Object obj, long j, byte b) {
            if (C26065jh.f61382c) {
                C26065jh.m50950a(obj, j, b);
            } else {
                C26065jh.m50960b(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42794a(Object obj, long j, double d) {
            mo42801a(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42796a(Object obj, long j, boolean z) {
            if (C26065jh.f61382c) {
                C26065jh.m50961b(obj, j, z);
            } else {
                C26065jh.m50964c(obj, j, z);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.jh$d */
    static final class C26069d extends AbstractC26068c {
        static {
            Covode.recordClassIndex(31484);
        }

        C26069d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final byte mo42792a(Object obj, long j) {
            return this.f61404a.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: b */
        public final boolean mo42797b(Object obj, long j) {
            return this.f61404a.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: c */
        public final float mo42798c(Object obj, long j) {
            return this.f61404a.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: d */
        public final double mo42799d(Object obj, long j) {
            return this.f61404a.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42793a(Object obj, long j, byte b) {
            this.f61404a.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42794a(Object obj, long j, double d) {
            this.f61404a.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42795a(Object obj, long j, float f) {
            this.f61404a.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.measurement.C26065jh.AbstractC26068c
        /* renamed from: a */
        public final void mo42796a(Object obj, long j, boolean z) {
            this.f61404a.putBoolean(obj, j, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.measurement.jh$c */
    public static abstract class AbstractC26068c {

        /* renamed from: a */
        Unsafe f61404a;

        static {
            Covode.recordClassIndex(31483);
        }

        /* renamed from: a */
        public abstract byte mo42792a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo42793a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo42794a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo42795a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo42796a(Object obj, long j, boolean z);

        /* renamed from: b */
        public abstract boolean mo42797b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo42798c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo42799d(Object obj, long j);

        AbstractC26068c(Unsafe unsafe) {
            this.f61404a = unsafe;
        }

        /* renamed from: e */
        public final int mo42802e(Object obj, long j) {
            return this.f61404a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long mo42803f(Object obj, long j) {
            return this.f61404a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo42800a(Object obj, long j, int i) {
            this.f61404a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo42801a(Object obj, long j, long j2) {
            this.f61404a.putLong(obj, j, j2);
        }
    }

    /* renamed from: b */
    private static int m50958b(Class<?> cls) {
        if (f61381b) {
            return f61388i.f61404a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m50963c(Class<?> cls) {
        if (f61381b) {
            return f61388i.f61404a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static <T> T m50947a(Class<T> cls) {
        try {
            return (T) f61384e.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    private static boolean m50969d(Class<?> cls) {
        if (!C25933eu.m50185a()) {
            return false;
        }
        try {
            Class<?> cls2 = f61385f;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    static int m50946a(Object obj, long j) {
        return f61388i.mo42802e(obj, j);
    }

    /* renamed from: b */
    static long m50959b(Object obj, long j) {
        return f61388i.mo42803f(obj, j);
    }

    /* renamed from: d */
    static float m50967d(Object obj, long j) {
        return f61388i.mo42798c(obj, j);
    }

    /* renamed from: e */
    static double m50970e(Object obj, long j) {
        return f61388i.mo42799d(obj, j);
    }

    /* renamed from: a */
    static byte m50945a(byte[] bArr, long j) {
        return f61388i.mo42792a(bArr, f61389j + j);
    }

    /* renamed from: f */
    static Object m50971f(Object obj, long j) {
        return f61388i.f61404a.getObject(obj, j);
    }

    /* renamed from: h */
    static byte m50973h(Object obj, long j) {
        return (byte) (m50946a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: i */
    static /* synthetic */ boolean m50974i(Object obj, long j) {
        if (m50972g(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    static /* synthetic */ boolean m50975j(Object obj, long j) {
        if (m50973h(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static boolean m50966c(Object obj, long j) {
        return f61388i.mo42797b(obj, j);
    }

    /* renamed from: g */
    static byte m50972g(Object obj, long j) {
        return (byte) (m50946a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* renamed from: a */
    private static Field m50948a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m50964c(Object obj, long j, boolean z) {
        m50960b(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    static void m50960b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m50953a(obj, j2, ((255 & b) << i) | (m50946a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: b */
    static /* synthetic */ void m50961b(Object obj, long j, boolean z) {
        m50950a(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    static void m50950a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m50953a(obj, j2, ((255 & b) << i) | (m50946a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: a */
    static void m50951a(Object obj, long j, double d) {
        f61388i.mo42794a(obj, j, d);
    }

    /* renamed from: a */
    static void m50952a(Object obj, long j, float f) {
        f61388i.mo42795a(obj, j, f);
    }

    /* renamed from: a */
    static void m50953a(Object obj, long j, int i) {
        f61388i.mo42800a(obj, j, i);
    }
}
