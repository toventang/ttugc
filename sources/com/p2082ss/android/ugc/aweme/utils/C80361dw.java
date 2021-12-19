package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27917g;
import com.google.gson.C28022o;
import com.google.gson.C28027t;
import com.google.gson.internal.C27925b;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.dw */
public final class C80361dw {

    /* renamed from: a */
    private static final AbstractC28031v<Boolean> f179890a = new AbstractC28031v<Boolean>() {
        /* class com.p2082ss.android.ugc.aweme.utils.C80361dw.C803621 */

        static {
            Covode.recordClassIndex(93630);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Boolean read(C27897a aVar) {
            return m139336a(aVar);
        }

        /* renamed from: a */
        private static Boolean m139336a(C27897a aVar) {
            EnumC27899b f = aVar.mo46627f();
            int i = C803643.f179892a[f.ordinal()];
            boolean z = true;
            if (i == 1) {
                return Boolean.valueOf(aVar.mo46630j());
            }
            if (i == 2) {
                aVar.mo46631k();
                return null;
            } else if (i == 3) {
                try {
                    if (aVar.mo46634n() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } catch (NumberFormatException e) {
                    throw new C28027t(e);
                }
            } else if (i == 4) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.mo46629i()));
            } else {
                throw new IllegalStateException("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null) {
                cVar.mo46654f();
            } else {
                cVar.mo46643a(bool2);
            }
        }
    };

    /* renamed from: b */
    private static final AbstractC28031v<Integer> f179891b = new AbstractC28031v<Integer>() {
        /* class com.p2082ss.android.ugc.aweme.utils.C80361dw.C803632 */

        static {
            Covode.recordClassIndex(93631);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Integer read(C27897a aVar) {
            return m139337a(aVar);
        }

        /* renamed from: a */
        private static Integer m139337a(C27897a aVar) {
            EnumC27899b f = aVar.mo46627f();
            int i = C803643.f179892a[f.ordinal()];
            if (i == 1) {
                return Integer.valueOf(aVar.mo46630j() ? 1 : 0);
            }
            if (i == 2) {
                aVar.mo46631k();
                return null;
            } else if (i == 3) {
                try {
                    return Integer.valueOf(aVar.mo46634n());
                } catch (NumberFormatException e) {
                    throw new C28027t(e);
                }
            } else if (i == 4) {
                return Integer.valueOf(Boolean.parseBoolean(aVar.mo46629i()) ? 1 : 0);
            } else {
                throw new IllegalStateException("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Integer num) {
            Integer num2 = num;
            if (num2 == null) {
                cVar.mo46654f();
            } else {
                cVar.mo46644a(num2);
            }
        }
    };

    static {
        Covode.recordClassIndex(93629);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.dw$3 */
    public static /* synthetic */ class C803643 {

        /* renamed from: a */
        static final /* synthetic */ int[] f179892a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 93632(0x16dc0, float:1.31206E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.p2020c.EnumC27899b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.utils.C80361dw.C803643.f179892a = r2
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.utils.C80361dw.C803643.f179892a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NULL     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.utils.C80361dw.C803643.f179892a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.utils.C80361dw.C803643.f179892a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.STRING     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80361dw.C803643.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C27917g m139332a() {
        C27917g gVar = new C27917g();
        AbstractC28031v<Boolean> vVar = f179890a;
        C27917g a = gVar.mo46681a((Type) Boolean.class, (Object) vVar).mo46681a((Type) Boolean.TYPE, (Object) vVar);
        AbstractC28031v<Integer> vVar2 = f179891b;
        C27917g a2 = a.mo46681a((Type) Integer.class, (Object) vVar2).mo46681a((Type) Integer.TYPE, (Object) vVar2);
        a2.f65567g = true;
        return a2;
    }

    /* renamed from: a */
    public static String m139334a(Object obj) {
        return m139332a().mo46682b().mo46674b(obj);
    }

    /* renamed from: a */
    public static <T> T m139333a(String str, Class<T> cls) {
        return cls == null ? (T) new C28022o() : (T) m139332a().mo46682b().mo46670a(str, (Class) cls);
    }

    /* renamed from: b */
    public static <T> List<T> m139335b(String str, Class<T> cls) {
        try {
            return (List) m139332a().mo46682b().mo46671a(str, (Type) C27925b.m55977a((Type) null, ArrayList.class, cls));
        } catch (NullPointerException unused) {
            return new ArrayList();
        }
    }
}
