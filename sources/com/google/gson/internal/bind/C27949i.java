package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27919i;
import com.google.gson.C28020m;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.google.gson.C28027t;
import com.google.gson.internal.C27997f;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.gson.internal.bind.i */
public final class C27949i {

    /* renamed from: A */
    public static final AbstractC28031v<String> f65685A;

    /* renamed from: B */
    public static final AbstractC28031v<BigDecimal> f65686B = new AbstractC28031v<BigDecimal>() {
        /* class com.google.gson.internal.bind.C27949i.C279789 */

        static {
            Covode.recordClassIndex(33591);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ BigDecimal read(C27897a aVar) {
            return m56062a(aVar);
        }

        /* renamed from: a */
        private static BigDecimal m56062a(C27897a aVar) {
            if (aVar.mo46627f() == EnumC27899b.NULL) {
                aVar.mo46631k();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo46629i());
            } catch (NumberFormatException e) {
                throw new C28027t(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, BigDecimal bigDecimal) {
            cVar.mo46644a(bigDecimal);
        }
    };

    /* renamed from: C */
    public static final AbstractC28031v<BigInteger> f65687C = new AbstractC28031v<BigInteger>() {
        /* class com.google.gson.internal.bind.C27949i.C2795110 */

        static {
            Covode.recordClassIndex(33564);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ BigInteger read(C27897a aVar) {
            return m56051a(aVar);
        }

        /* renamed from: a */
        private static BigInteger m56051a(C27897a aVar) {
            if (aVar.mo46627f() == EnumC27899b.NULL) {
                aVar.mo46631k();
                return null;
            }
            try {
                return new BigInteger(aVar.mo46629i());
            } catch (NumberFormatException e) {
                throw new C28027t(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, BigInteger bigInteger) {
            cVar.mo46644a(bigInteger);
        }
    };

    /* renamed from: D */
    public static final AbstractC28033w f65688D;

    /* renamed from: E */
    public static final AbstractC28031v<StringBuilder> f65689E;

    /* renamed from: F */
    public static final AbstractC28033w f65690F;

    /* renamed from: G */
    public static final AbstractC28031v<StringBuffer> f65691G;

    /* renamed from: H */
    public static final AbstractC28033w f65692H;

    /* renamed from: I */
    public static final AbstractC28031v<URL> f65693I;

    /* renamed from: J */
    public static final AbstractC28033w f65694J;

    /* renamed from: K */
    public static final AbstractC28031v<URI> f65695K;

    /* renamed from: L */
    public static final AbstractC28033w f65696L;

    /* renamed from: M */
    public static final AbstractC28031v<InetAddress> f65697M;

    /* renamed from: N */
    public static final AbstractC28033w f65698N;

    /* renamed from: O */
    public static final AbstractC28031v<UUID> f65699O;

    /* renamed from: P */
    public static final AbstractC28033w f65700P;

    /* renamed from: Q */
    public static final AbstractC28031v<Currency> f65701Q;

    /* renamed from: R */
    public static final AbstractC28033w f65702R;

    /* renamed from: S */
    public static final AbstractC28033w f65703S = new TypeAdapters$26();

    /* renamed from: T */
    public static final AbstractC28031v<Calendar> f65704T;

    /* renamed from: U */
    public static final AbstractC28033w f65705U;

    /* renamed from: V */
    public static final AbstractC28031v<Locale> f65706V;

    /* renamed from: W */
    public static final AbstractC28033w f65707W;

    /* renamed from: X */
    public static final AbstractC28031v<AbstractC28019l> f65708X;

    /* renamed from: Y */
    public static final AbstractC28033w f65709Y;

    /* renamed from: Z */
    public static final AbstractC28033w f65710Z = new TypeAdapters$30();

    /* renamed from: a */
    public static final AbstractC28031v<Class> f65711a;

    /* renamed from: b */
    public static final AbstractC28033w f65712b;

    /* renamed from: c */
    public static final AbstractC28031v<BitSet> f65713c;

    /* renamed from: d */
    public static final AbstractC28033w f65714d;

    /* renamed from: e */
    public static final AbstractC28031v<Boolean> f65715e;

    /* renamed from: f */
    public static final AbstractC28031v<Boolean> f65716f = new AbstractC28031v<Boolean>() {
        /* class com.google.gson.internal.bind.C27949i.C2796624 */

        static {
            Covode.recordClassIndex(33579);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Boolean read(C27897a aVar) {
            if (aVar.mo46627f() != EnumC27899b.NULL) {
                return Boolean.valueOf(aVar.mo46629i());
            }
            aVar.mo46631k();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Boolean bool) {
            String bool2;
            Boolean bool3 = bool;
            if (bool3 == null) {
                bool2 = "null";
            } else {
                bool2 = bool3.toString();
            }
            cVar.mo46648b(bool2);
        }
    };

    /* renamed from: g */
    public static final AbstractC28033w f65717g;

    /* renamed from: h */
    public static final AbstractC28031v<Number> f65718h;

    /* renamed from: i */
    public static final AbstractC28033w f65719i;

    /* renamed from: j */
    public static final AbstractC28031v<Number> f65720j;

    /* renamed from: k */
    public static final AbstractC28033w f65721k;

    /* renamed from: l */
    public static final AbstractC28031v<Number> f65722l;

    /* renamed from: m */
    public static final AbstractC28033w f65723m;

    /* renamed from: n */
    public static final AbstractC28031v<AtomicInteger> f65724n;

    /* renamed from: o */
    public static final AbstractC28033w f65725o;

    /* renamed from: p */
    public static final AbstractC28031v<AtomicBoolean> f65726p;

    /* renamed from: q */
    public static final AbstractC28033w f65727q;

    /* renamed from: r */
    public static final AbstractC28031v<AtomicIntegerArray> f65728r;

    /* renamed from: s */
    public static final AbstractC28033w f65729s;

    /* renamed from: t */
    public static final AbstractC28031v<Number> f65730t = new AbstractC28031v<Number>() {
        /* class com.google.gson.internal.bind.C27949i.C279723 */

        static {
            Covode.recordClassIndex(33585);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Number read(C27897a aVar) {
            return m56061a(aVar);
        }

        /* renamed from: a */
        private static Number m56061a(C27897a aVar) {
            if (aVar.mo46627f() == EnumC27899b.NULL) {
                aVar.mo46631k();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo46633m());
            } catch (NumberFormatException e) {
                throw new C28027t(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Number number) {
            cVar.mo46644a(number);
        }
    };

    /* renamed from: u */
    public static final AbstractC28031v<Number> f65731u = new AbstractC28031v<Number>() {
        /* class com.google.gson.internal.bind.C27949i.C279734 */

        static {
            Covode.recordClassIndex(33586);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Number read(C27897a aVar) {
            if (aVar.mo46627f() != EnumC27899b.NULL) {
                return Float.valueOf((float) aVar.mo46632l());
            }
            aVar.mo46631k();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Number number) {
            cVar.mo46644a(number);
        }
    };

    /* renamed from: v */
    public static final AbstractC28031v<Number> f65732v = new AbstractC28031v<Number>() {
        /* class com.google.gson.internal.bind.C27949i.C279745 */

        static {
            Covode.recordClassIndex(33587);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Number read(C27897a aVar) {
            if (aVar.mo46627f() != EnumC27899b.NULL) {
                return Double.valueOf(aVar.mo46632l());
            }
            aVar.mo46631k();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Number number) {
            cVar.mo46644a(number);
        }
    };

    /* renamed from: w */
    public static final AbstractC28031v<Number> f65733w;

    /* renamed from: x */
    public static final AbstractC28033w f65734x;

    /* renamed from: y */
    public static final AbstractC28031v<Character> f65735y;

    /* renamed from: z */
    public static final AbstractC28033w f65736z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.i$23 */
    public static /* synthetic */ class C2796523 {

        /* renamed from: a */
        static final /* synthetic */ int[] f65737a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.C27949i.C2796523.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(33562);
        AbstractC28031v<Class> nullSafe = new AbstractC28031v<Class>() {
            /* class com.google.gson.internal.bind.C27949i.C279501 */

            static {
                Covode.recordClassIndex(33563);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Class read(C27897a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        f65711a = nullSafe;
        f65712b = m56048a(Class.class, nullSafe);
        AbstractC28031v<BitSet> nullSafe2 = new AbstractC28031v<BitSet>() {
            /* class com.google.gson.internal.bind.C27949i.C2795312 */

            static {
                Covode.recordClassIndex(33566);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ BitSet read(C27897a aVar) {
                return m56052a(aVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
                if (r6.mo46634n() != 0) goto L_0x003b;
             */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.util.BitSet m56052a(com.google.gson.p2020c.C27897a r6) {
                /*
                // Method dump skipped, instructions count: 107
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.C27949i.C2795312.m56052a(com.google.gson.c.a):java.util.BitSet");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, BitSet bitSet) {
                BitSet bitSet2 = bitSet;
                cVar.mo46647b();
                int length = bitSet2.length();
                for (int i = 0; i < length; i++) {
                    cVar.mo46642a(bitSet2.get(i) ? 1 : 0);
                }
                cVar.mo46649c();
            }
        }.nullSafe();
        f65713c = nullSafe2;
        f65714d = m56048a(BitSet.class, nullSafe2);
        C2796422 r2 = new AbstractC28031v<Boolean>() {
            /* class com.google.gson.internal.bind.C27949i.C2796422 */

            static {
                Covode.recordClassIndex(33577);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Boolean read(C27897a aVar) {
                EnumC27899b f = aVar.mo46627f();
                if (f == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                } else if (f == EnumC27899b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.mo46629i()));
                } else {
                    return Boolean.valueOf(aVar.mo46630j());
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Boolean bool) {
                cVar.mo46643a(bool);
            }
        };
        f65715e = r2;
        f65717g = m56049a(Boolean.TYPE, Boolean.class, r2);
        C2796725 r22 = new AbstractC28031v<Number>() {
            /* class com.google.gson.internal.bind.C27949i.C2796725 */

            static {
                Covode.recordClassIndex(33580);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Number read(C27897a aVar) {
                return m56057a(aVar);
            }

            /* renamed from: a */
            private static Number m56057a(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.mo46634n());
                } catch (NumberFormatException e) {
                    throw new C28027t(e);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Number number) {
                cVar.mo46644a(number);
            }
        };
        f65718h = r22;
        f65719i = m56049a(Byte.TYPE, Byte.class, r22);
        C2796826 r23 = new AbstractC28031v<Number>() {
            /* class com.google.gson.internal.bind.C27949i.C2796826 */

            static {
                Covode.recordClassIndex(33581);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Number read(C27897a aVar) {
                return m56058a(aVar);
            }

            /* renamed from: a */
            private static Number m56058a(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.mo46634n());
                } catch (NumberFormatException e) {
                    throw new C28027t(e);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Number number) {
                cVar.mo46644a(number);
            }
        };
        f65720j = r23;
        f65721k = m56049a(Short.TYPE, Short.class, r23);
        C2796927 r24 = new AbstractC28031v<Number>() {
            /* class com.google.gson.internal.bind.C27949i.C2796927 */

            static {
                Covode.recordClassIndex(33582);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Number read(C27897a aVar) {
                return m56059a(aVar);
            }

            /* renamed from: a */
            private static Number m56059a(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.mo46634n());
                } catch (NumberFormatException e) {
                    throw new C28027t(e);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Number number) {
                cVar.mo46644a(number);
            }
        };
        f65722l = r24;
        f65723m = m56049a(Integer.TYPE, Integer.class, r24);
        AbstractC28031v<AtomicInteger> nullSafe3 = new AbstractC28031v<AtomicInteger>() {
            /* class com.google.gson.internal.bind.C27949i.C2797028 */

            static {
                Covode.recordClassIndex(33583);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ AtomicInteger read(C27897a aVar) {
                return m56060a(aVar);
            }

            /* renamed from: a */
            private static AtomicInteger m56060a(C27897a aVar) {
                try {
                    return new AtomicInteger(aVar.mo46634n());
                } catch (NumberFormatException e) {
                    throw new C28027t(e);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, AtomicInteger atomicInteger) {
                cVar.mo46642a((long) atomicInteger.get());
            }
        }.nullSafe();
        f65724n = nullSafe3;
        f65725o = m56048a(AtomicInteger.class, nullSafe3);
        AbstractC28031v<AtomicBoolean> nullSafe4 = new AbstractC28031v<AtomicBoolean>() {
            /* class com.google.gson.internal.bind.C27949i.C2797129 */

            static {
                Covode.recordClassIndex(33584);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ AtomicBoolean read(C27897a aVar) {
                return new AtomicBoolean(aVar.mo46630j());
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, AtomicBoolean atomicBoolean) {
                cVar.mo46646a(atomicBoolean.get());
            }
        }.nullSafe();
        f65726p = nullSafe4;
        f65727q = m56048a(AtomicBoolean.class, nullSafe4);
        AbstractC28031v<AtomicIntegerArray> nullSafe5 = new AbstractC28031v<AtomicIntegerArray>() {
            /* class com.google.gson.internal.bind.C27949i.C279612 */

            static {
                Covode.recordClassIndex(33574);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ AtomicIntegerArray read(C27897a aVar) {
                return m56054a(aVar);
            }

            /* renamed from: a */
            private static AtomicIntegerArray m56054a(C27897a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.mo46621a();
                while (aVar.mo46626e()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.mo46634n()));
                    } catch (NumberFormatException e) {
                        throw new C28027t(e);
                    }
                }
                aVar.mo46622b();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, AtomicIntegerArray atomicIntegerArray) {
                AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
                cVar.mo46647b();
                int length = atomicIntegerArray2.length();
                for (int i = 0; i < length; i++) {
                    cVar.mo46642a((long) atomicIntegerArray2.get(i));
                }
                cVar.mo46649c();
            }
        }.nullSafe();
        f65728r = nullSafe5;
        f65729s = m56048a(AtomicIntegerArray.class, nullSafe5);
        C279756 r1 = new AbstractC28031v<Number>() {
            /* class com.google.gson.internal.bind.C27949i.C279756 */

            static {
                Covode.recordClassIndex(33588);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Number read(C27897a aVar) {
                EnumC27899b f = aVar.mo46627f();
                int i = C2796523.f65737a[f.ordinal()];
                if (i == 1 || i == 3) {
                    return new C27997f(aVar.mo46629i());
                }
                if (i == 4) {
                    aVar.mo46631k();
                    return null;
                }
                throw new C28027t("Expecting number, got: ".concat(String.valueOf(f)));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Number number) {
                cVar.mo46644a(number);
            }
        };
        f65733w = r1;
        f65734x = m56048a(Number.class, r1);
        C279767 r25 = new AbstractC28031v<Character>() {
            /* class com.google.gson.internal.bind.C27949i.C279767 */

            static {
                Covode.recordClassIndex(33589);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Character read(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                String i = aVar.mo46629i();
                if (i.length() == 1) {
                    return Character.valueOf(i.charAt(0));
                }
                throw new C28027t("Expecting character, got: ".concat(String.valueOf(i)));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Character ch) {
                String valueOf;
                if (ch == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch);
                }
                cVar.mo46648b(valueOf);
            }
        };
        f65735y = r25;
        f65736z = m56049a(Character.TYPE, Character.class, r25);
        C279778 r12 = new AbstractC28031v<String>() {
            /* class com.google.gson.internal.bind.C27949i.C279778 */

            static {
                Covode.recordClassIndex(33590);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ String read(C27897a aVar) {
                EnumC27899b f = aVar.mo46627f();
                if (f == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                } else if (f == EnumC27899b.BOOLEAN) {
                    return Boolean.toString(aVar.mo46630j());
                } else {
                    return aVar.mo46629i();
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, String str) {
                cVar.mo46648b(str);
            }
        };
        f65685A = r12;
        f65688D = m56048a(String.class, r12);
        C2795211 r13 = new AbstractC28031v<StringBuilder>() {
            /* class com.google.gson.internal.bind.C27949i.C2795211 */

            static {
                Covode.recordClassIndex(33565);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ StringBuilder read(C27897a aVar) {
                if (aVar.mo46627f() != EnumC27899b.NULL) {
                    return new StringBuilder(aVar.mo46629i());
                }
                aVar.mo46631k();
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, StringBuilder sb) {
                String sb2;
                StringBuilder sb3 = sb;
                if (sb3 == null) {
                    sb2 = null;
                } else {
                    sb2 = sb3.toString();
                }
                cVar.mo46648b(sb2);
            }
        };
        f65689E = r13;
        f65690F = m56048a(StringBuilder.class, r13);
        C2795413 r14 = new AbstractC28031v<StringBuffer>() {
            /* class com.google.gson.internal.bind.C27949i.C2795413 */

            static {
                Covode.recordClassIndex(33567);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ StringBuffer read(C27897a aVar) {
                if (aVar.mo46627f() != EnumC27899b.NULL) {
                    return new StringBuffer(aVar.mo46629i());
                }
                aVar.mo46631k();
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, StringBuffer stringBuffer) {
                String stringBuffer2;
                StringBuffer stringBuffer3 = stringBuffer;
                if (stringBuffer3 == null) {
                    stringBuffer2 = null;
                } else {
                    stringBuffer2 = stringBuffer3.toString();
                }
                cVar.mo46648b(stringBuffer2);
            }
        };
        f65691G = r14;
        f65692H = m56048a(StringBuffer.class, r14);
        C2795514 r15 = new AbstractC28031v<URL>() {
            /* class com.google.gson.internal.bind.C27949i.C2795514 */

            static {
                Covode.recordClassIndex(33568);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ URL read(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                String i = aVar.mo46629i();
                if ("null".equals(i)) {
                    return null;
                }
                return new URL(i);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, URL url) {
                String externalForm;
                URL url2 = url;
                if (url2 == null) {
                    externalForm = null;
                } else {
                    externalForm = url2.toExternalForm();
                }
                cVar.mo46648b(externalForm);
            }
        };
        f65693I = r15;
        f65694J = m56048a(URL.class, r15);
        C2795615 r16 = new AbstractC28031v<URI>() {
            /* class com.google.gson.internal.bind.C27949i.C2795615 */

            static {
                Covode.recordClassIndex(33569);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ URI read(C27897a aVar) {
                return m56053a(aVar);
            }

            /* renamed from: a */
            private static URI m56053a(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                try {
                    String i = aVar.mo46629i();
                    if ("null".equals(i)) {
                        return null;
                    }
                    return new URI(i);
                } catch (URISyntaxException e) {
                    throw new C28020m(e);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, URI uri) {
                String aSCIIString;
                URI uri2 = uri;
                if (uri2 == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri2.toASCIIString();
                }
                cVar.mo46648b(aSCIIString);
            }
        };
        f65695K = r16;
        f65696L = m56048a(URI.class, r16);
        C2795716 r17 = new AbstractC28031v<InetAddress>() {
            /* class com.google.gson.internal.bind.C27949i.C2795716 */

            static {
                Covode.recordClassIndex(33570);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ InetAddress read(C27897a aVar) {
                if (aVar.mo46627f() != EnumC27899b.NULL) {
                    return InetAddress.getByName(aVar.mo46629i());
                }
                aVar.mo46631k();
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, InetAddress inetAddress) {
                String hostAddress;
                InetAddress inetAddress2 = inetAddress;
                if (inetAddress2 == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress2.getHostAddress();
                }
                cVar.mo46648b(hostAddress);
            }
        };
        f65697M = r17;
        f65698N = m56050b(InetAddress.class, r17);
        C2795817 r18 = new AbstractC28031v<UUID>() {
            /* class com.google.gson.internal.bind.C27949i.C2795817 */

            static {
                Covode.recordClassIndex(33571);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ UUID read(C27897a aVar) {
                if (aVar.mo46627f() != EnumC27899b.NULL) {
                    return UUID.fromString(aVar.mo46629i());
                }
                aVar.mo46631k();
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, UUID uuid) {
                String uuid2;
                UUID uuid3 = uuid;
                if (uuid3 == null) {
                    uuid2 = null;
                } else {
                    uuid2 = uuid3.toString();
                }
                cVar.mo46648b(uuid2);
            }
        };
        f65699O = r18;
        f65700P = m56048a(UUID.class, r18);
        AbstractC28031v<Currency> nullSafe6 = new AbstractC28031v<Currency>() {
            /* class com.google.gson.internal.bind.C27949i.C2795918 */

            static {
                Covode.recordClassIndex(33572);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Currency read(C27897a aVar) {
                return Currency.getInstance(aVar.mo46629i());
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Currency currency) {
                cVar.mo46648b(currency.getCurrencyCode());
            }
        }.nullSafe();
        f65701Q = nullSafe6;
        f65702R = m56048a(Currency.class, nullSafe6);
        C2796019 r3 = new AbstractC28031v<Calendar>() {
            /* class com.google.gson.internal.bind.C27949i.C2796019 */

            static {
                Covode.recordClassIndex(33573);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Calendar read(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                aVar.mo46623c();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (aVar.mo46627f() != EnumC27899b.END_OBJECT) {
                    String h = aVar.mo46628h();
                    int n = aVar.mo46634n();
                    if ("year".equals(h)) {
                        i = n;
                    } else if ("month".equals(h)) {
                        i2 = n;
                    } else if ("dayOfMonth".equals(h)) {
                        i3 = n;
                    } else if ("hourOfDay".equals(h)) {
                        i4 = n;
                    } else if ("minute".equals(h)) {
                        i5 = n;
                    } else if ("second".equals(h)) {
                        i6 = n;
                    }
                }
                aVar.mo46625d();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Calendar calendar) {
                Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    cVar.mo46654f();
                    return;
                }
                cVar.mo46652d();
                cVar.mo46645a("year");
                cVar.mo46642a((long) calendar2.get(1));
                cVar.mo46645a("month");
                cVar.mo46642a((long) calendar2.get(2));
                cVar.mo46645a("dayOfMonth");
                cVar.mo46642a((long) calendar2.get(5));
                cVar.mo46645a("hourOfDay");
                cVar.mo46642a((long) calendar2.get(11));
                cVar.mo46645a("minute");
                cVar.mo46642a((long) calendar2.get(12));
                cVar.mo46645a("second");
                cVar.mo46642a((long) calendar2.get(13));
                cVar.mo46653e();
            }
        };
        f65704T = r3;
        f65705U = new TypeAdapters$34(Calendar.class, GregorianCalendar.class, r3);
        C2796220 r19 = new AbstractC28031v<Locale>() {
            /* class com.google.gson.internal.bind.C27949i.C2796220 */

            static {
                Covode.recordClassIndex(33575);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Locale read(C27897a aVar) {
                String str;
                String str2;
                String str3 = null;
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo46629i(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null) {
                    if (str3 == null) {
                        return new Locale(str);
                    }
                } else if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, Locale locale) {
                String locale2;
                Locale locale3 = locale;
                if (locale3 == null) {
                    locale2 = null;
                } else {
                    locale2 = locale3.toString();
                }
                cVar.mo46648b(locale2);
            }
        };
        f65706V = r19;
        f65707W = m56048a(Locale.class, r19);
        C2796321 r110 = new AbstractC28031v<AbstractC28019l>() {
            /* class com.google.gson.internal.bind.C27949i.C2796321 */

            static {
                Covode.recordClassIndex(33576);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public AbstractC28019l read(C27897a aVar) {
                switch (C2796523.f65737a[aVar.mo46627f().ordinal()]) {
                    case 1:
                        return new C28025r((Number) new C27997f(aVar.mo46629i()));
                    case 2:
                        return new C28025r(Boolean.valueOf(aVar.mo46630j()));
                    case 3:
                        return new C28025r(aVar.mo46629i());
                    case 4:
                        aVar.mo46631k();
                        return C28021n.f65803a;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        C27919i iVar = new C27919i();
                        aVar.mo46621a();
                        while (aVar.mo46626e()) {
                            iVar.mo46686a(read(aVar));
                        }
                        aVar.mo46622b();
                        return iVar;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        C28022o oVar = new C28022o();
                        aVar.mo46623c();
                        while (aVar.mo46626e()) {
                            oVar.mo46797a(aVar.mo46628h(), read(aVar));
                        }
                        aVar.mo46625d();
                        return oVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void write(C27900c cVar, AbstractC28019l lVar) {
                if (lVar == null || (lVar instanceof C28021n)) {
                    cVar.mo46654f();
                } else if (lVar instanceof C28025r) {
                    C28025r l = lVar.mo46791l();
                    if (l.f65806a instanceof Number) {
                        cVar.mo46644a(l.mo46688b());
                    } else if (l.f65806a instanceof Boolean) {
                        cVar.mo46646a(l.mo46695h());
                    } else {
                        cVar.mo46648b(l.mo46689c());
                    }
                } else if (lVar instanceof C27919i) {
                    cVar.mo46647b();
                    Iterator<AbstractC28019l> it = lVar.mo46790k().iterator();
                    while (it.hasNext()) {
                        write(cVar, it.next());
                    }
                    cVar.mo46649c();
                } else if (lVar instanceof C28022o) {
                    cVar.mo46652d();
                    for (Map.Entry<String, AbstractC28019l> entry : lVar.mo46789j().f65804a.entrySet()) {
                        cVar.mo46645a(entry.getKey());
                        write(cVar, entry.getValue());
                    }
                    cVar.mo46653e();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
                }
            }
        };
        f65708X = r110;
        f65709Y = m56050b(AbstractC28019l.class, r110);
    }

    /* renamed from: com.google.gson.internal.bind.i$a */
    static final class C27979a<T extends Enum<T>> extends AbstractC28031v<T> {

        /* renamed from: a */
        private final Map<String, T> f65738a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f65739b = new HashMap();

        static {
            Covode.recordClassIndex(33592);
        }

        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Object read(C27897a aVar) {
            if (aVar.mo46627f() != EnumC27899b.NULL) {
                return this.f65738a.get(aVar.mo46629i());
            }
            aVar.mo46631k();
            return null;
        }

        public C27979a(Class<T> cls) {
            try {
                T[] enumConstants = cls.getEnumConstants();
                for (T t : enumConstants) {
                    String name = t.name();
                    AbstractC27891c cVar = (AbstractC27891c) cls.getField(name).getAnnotation(AbstractC27891c.class);
                    if (cVar != null) {
                        name = cVar.mo46611a();
                        for (String str : cVar.mo46612b()) {
                            this.f65738a.put(str, t);
                        }
                    }
                    this.f65738a.put(name, t);
                    this.f65739b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Object obj) {
            String str;
            if (obj == null) {
                str = null;
            } else {
                str = this.f65739b.get(obj);
            }
            cVar.mo46648b(str);
        }
    }

    /* renamed from: a */
    public static <TT> AbstractC28033w m56047a(C27895a<TT> aVar, AbstractC28031v<TT> vVar) {
        return new TypeAdapters$31(aVar, vVar);
    }

    /* renamed from: b */
    public static <T1> AbstractC28033w m56050b(Class<T1> cls, AbstractC28031v<T1> vVar) {
        return new TypeAdapters$35(cls, vVar);
    }

    /* renamed from: a */
    public static <TT> AbstractC28033w m56048a(Class<TT> cls, AbstractC28031v<TT> vVar) {
        return new TypeAdapters$32(cls, vVar);
    }

    /* renamed from: a */
    public static <TT> AbstractC28033w m56049a(Class<TT> cls, Class<TT> cls2, AbstractC28031v<? super TT> vVar) {
        return new TypeAdapters$33(cls, cls2, vVar);
    }
}
