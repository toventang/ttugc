package p4600h.p4617i;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4607d.C89140b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.i.c */
public abstract class AbstractC89255c {
    public static final C89256a Default = new C89256a(null);
    public static final AbstractC89255c defaultRandom = C89140b.f202850a.mo143579a();

    /* renamed from: h.i.c$a */
    public static final class C89256a extends AbstractC89255c implements Serializable {
        static {
            Covode.recordClassIndex(105340);
        }

        /* renamed from: h.i.c$a$a */
        static final class C89257a implements Serializable {

            /* renamed from: a */
            public static final C89257a f202913a = new C89257a();
            private static final long serialVersionUID = 0;

            private C89257a() {
            }

            private final Object readResolve() {
                return AbstractC89255c.Default;
            }

            static {
                Covode.recordClassIndex(105341);
            }
        }

        private C89256a() {
        }

        private final Object writeReplace() {
            return C89257a.f202913a;
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final boolean nextBoolean() {
            return AbstractC89255c.defaultRandom.nextBoolean();
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final double nextDouble() {
            return AbstractC89255c.defaultRandom.nextDouble();
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final float nextFloat() {
            return AbstractC89255c.defaultRandom.nextFloat();
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final int nextInt() {
            return AbstractC89255c.defaultRandom.nextInt();
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final long nextLong() {
            return AbstractC89255c.defaultRandom.nextLong();
        }

        public /* synthetic */ C89256a(C89214g gVar) {
            this();
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final int nextBits(int i) {
            return AbstractC89255c.defaultRandom.nextBits(i);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final byte[] nextBytes(int i) {
            return AbstractC89255c.defaultRandom.nextBytes(i);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final byte[] nextBytes(byte[] bArr) {
            C89219l.m154721d(bArr, "");
            return AbstractC89255c.defaultRandom.nextBytes(bArr);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final double nextDouble(double d) {
            return AbstractC89255c.defaultRandom.nextDouble(d);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final int nextInt(int i) {
            return AbstractC89255c.defaultRandom.nextInt(i);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final long nextLong(long j) {
            return AbstractC89255c.defaultRandom.nextLong(j);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final double nextDouble(double d, double d2) {
            return AbstractC89255c.defaultRandom.nextDouble(d, d2);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final int nextInt(int i, int i2) {
            return AbstractC89255c.defaultRandom.nextInt(i, i2);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final long nextLong(long j, long j2) {
            return AbstractC89255c.defaultRandom.nextLong(j, j2);
        }

        @Override // p4600h.p4617i.AbstractC89255c
        public final byte[] nextBytes(byte[] bArr, int i, int i2) {
            C89219l.m154721d(bArr, "");
            return AbstractC89255c.defaultRandom.nextBytes(bArr, i, i2);
        }
    }

    public abstract int nextBits(int i);

    public int nextInt() {
        return nextBits(32);
    }

    public boolean nextBoolean() {
        if (nextBits(1) != 0) {
            return true;
        }
        return false;
    }

    public float nextFloat() {
        return ((float) nextBits(24)) / 1.6777216E7f;
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    static {
        Covode.recordClassIndex(105339);
    }

    public double nextDouble() {
        double nextBits = (double) ((((long) nextBits(26)) << 27) + ((long) nextBits(27)));
        Double.isNaN(nextBits);
        return nextBits / 9.007199254740992E15d;
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    public long nextLong(long j) {
        return nextLong(0, j);
    }

    public byte[] nextBytes(byte[] bArr) {
        C89219l.m154721d(bArr, "");
        return nextBytes(bArr, 0, bArr.length);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public double nextDouble(double d, double d2) {
        double nextDouble;
        if (d2 > d) {
            double d3 = d2 - d;
            if (!Double.isInfinite(d3) || Double.isInfinite(d) || Double.isNaN(d) || Double.isInfinite(d2) || Double.isNaN(d2)) {
                nextDouble = nextDouble() * d3;
            } else {
                nextDouble = nextDouble() * ((d2 / 2.0d) - (d / 2.0d));
                d += nextDouble;
            }
            double d4 = d + nextDouble;
            if (d4 >= d2) {
                return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
            }
            return d4;
        }
        throw new IllegalArgumentException(C89258d.m154746a(Double.valueOf(d), Double.valueOf(d2)).toString());
    }

    public int nextInt(int i, int i2) {
        int nextInt;
        int i3;
        if (i2 > i) {
            int i4 = i2 - i;
            if (i4 > 0 || i4 == Integer.MIN_VALUE) {
                if (((-i4) & i4) == i4) {
                    i3 = nextBits(31 - Integer.numberOfLeadingZeros(i4));
                } else {
                    do {
                        nextInt = nextInt() >>> 1;
                        i3 = nextInt % i4;
                    } while ((nextInt - i3) + (i4 - 1) < 0);
                }
                return i + i3;
            }
            while (true) {
                int nextInt2 = nextInt();
                if (i <= nextInt2 && i2 > nextInt2) {
                    return nextInt2;
                }
            }
        } else {
            throw new IllegalArgumentException(C89258d.m154746a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public long nextLong(long j, long j2) {
        long nextLong;
        long j3;
        int nextInt;
        if (j2 > j) {
            long j4 = j2 - j;
            if (j4 > 0) {
                if (((-j4) & j4) == j4) {
                    int i = (int) j4;
                    int i2 = (int) (j4 >>> 32);
                    if (i != 0) {
                        nextInt = nextBits(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        nextInt = nextInt();
                    } else {
                        j3 = (((long) nextBits(31 - Integer.numberOfLeadingZeros(i2))) << 32) + ((long) nextInt());
                    }
                    j3 = ((long) nextInt) & 4294967295L;
                } else {
                    do {
                        nextLong = nextLong() >>> 1;
                        j3 = nextLong % j4;
                    } while ((nextLong - j3) + (j4 - 1) < 0);
                }
                return j + j3;
            }
            while (true) {
                long nextLong2 = nextLong();
                if (j <= nextLong2 && j2 > nextLong2) {
                    return nextLong2;
                }
            }
        } else {
            throw new IllegalArgumentException(C89258d.m154746a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] nextBytes(byte[] r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4617i.AbstractC89255c.nextBytes(byte[], int, int):byte[]");
    }

    public static /* synthetic */ byte[] nextBytes$default(AbstractC89255c cVar, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return cVar.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }
}
