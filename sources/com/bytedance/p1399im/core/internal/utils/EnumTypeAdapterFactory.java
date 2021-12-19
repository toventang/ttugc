package com.bytedance.p1399im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory */
public class EnumTypeAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(22832);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a */
    public enum EnumC19990a {
        INT("int"),
        STRING("java.lang.String"),
        LONG("long"),
        DOUBLE("double"),
        BOOLEAN("boolean");
        

        /* renamed from: f */
        public String f47534f;

        public final String toString() {
            return this.f47534f;
        }

        static {
            Covode.recordClassIndex(22835);
        }

        private EnumC19990a(String str) {
            this.f47534f = str;
        }
    }

    /* renamed from: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$2 */
    static /* synthetic */ class C199892 {

        /* renamed from: a */
        static final /* synthetic */ int[] f47527a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 22834(0x5932, float:3.1997E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a[] r0 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.EnumC19990a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.C199892.f47527a = r2
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.EnumC19990a.INT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.C199892.f47527a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.EnumC19990a.STRING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.C199892.f47527a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.EnumC19990a.LONG     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.C199892.f47527a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.EnumC19990a.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.C199892.f47527a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r0 = com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.EnumC19990a.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.C199892.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static boolean m37738a(String str) {
        for (int i = 0; i < EnumC19990a.values().length; i++) {
            if (EnumC19990a.values()[i].f47534f.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static EnumC19990a m37739b(String str) {
        for (int i = 0; i < EnumC19990a.values().length; i++) {
            EnumC19990a aVar = EnumC19990a.values()[i];
            if (aVar.f47534f.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$b */
    static class C19991b {

        /* renamed from: a */
        Object f47535a;

        /* renamed from: b */
        EnumC19990a f47536b;

        static {
            Covode.recordClassIndex(22836);
        }

        C19991b(Object obj, EnumC19990a aVar) {
            this.f47535a = obj;
            this.f47536b = aVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.AbstractC28033w
    public <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Object obj;
        Class<? super T> cls = aVar.rawType;
        if (!cls.isEnum()) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        try {
            Object[] enumConstants = cls.getEnumConstants();
            for (Object[] objArr : enumConstants) {
                if (objArr != 0) {
                    AbstractC27891c cVar = (AbstractC27891c) objArr.getClass().getField(objArr.toString()).getAnnotation(AbstractC27891c.class);
                    if (cVar != null) {
                        hashMap.put(objArr, new C19991b(cVar.mo46611a(), EnumC19990a.STRING));
                    } else {
                        Field[] declaredFields = objArr.getClass().getDeclaredFields();
                        if (declaredFields != null && declaredFields.length > 0) {
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                Field field = declaredFields[i];
                                if (m37738a(field.getType().getName())) {
                                    field.setAccessible(true);
                                    EnumC19990a b = m37739b(field.getType().getName());
                                    int i2 = C199892.f47527a[b.ordinal()];
                                    if (i2 == 1) {
                                        obj = Integer.valueOf(field.getInt(objArr));
                                    } else if (i2 == 2) {
                                        obj = field.get(objArr);
                                    } else if (i2 == 3) {
                                        obj = Long.valueOf(field.getLong(objArr));
                                    } else if (i2 == 4) {
                                        obj = Double.valueOf(field.getDouble(objArr));
                                    } else if (i2 == 5) {
                                        obj = Boolean.valueOf(field.getBoolean(objArr));
                                    }
                                    if (obj != null) {
                                        hashMap.put(objArr, new C19991b(obj, b));
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                        hashMap.put(objArr, new C19991b(objArr.toString(), EnumC19990a.STRING));
                    }
                }
            }
        } catch (Throwable th) {
            C20001i.m37775a().mo31878a("imsdk", "EnumTypeAdapterFactory", th);
        }
        return new AbstractC28031v<T>() {
            /* class com.bytedance.p1399im.core.internal.utils.EnumTypeAdapterFactory.C199881 */

            static {
                Covode.recordClassIndex(22833);
            }

            @Override // com.google.gson.AbstractC28031v
            public final T read(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                String i = aVar.mo46629i();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!(entry.getValue() == null || ((C19991b) entry.getValue()).f47535a == null || !((C19991b) entry.getValue()).f47535a.toString().equals(i))) {
                        return (T) entry.getKey();
                    }
                }
                return null;
            }

            @Override // com.google.gson.AbstractC28031v
            public final void write(C27900c cVar, T t) {
                if (t == null) {
                    cVar.mo46654f();
                    return;
                }
                C19991b bVar = (C19991b) hashMap.get(t);
                if (bVar != null) {
                    int i = C199892.f47527a[bVar.f47536b.ordinal()];
                    if (i == 1) {
                        cVar.mo46642a((long) ((Integer) bVar.f47535a).intValue());
                    } else if (i == 2) {
                        cVar.mo46648b((String) bVar.f47535a);
                    } else if (i == 3) {
                        cVar.mo46642a(((Long) bVar.f47535a).longValue());
                    } else if (i == 4) {
                        cVar.mo46641a(((Double) bVar.f47535a).doubleValue());
                    } else if (i == 5) {
                        cVar.mo46643a((Boolean) bVar.f47535a);
                    }
                }
            }
        };
    }
}
