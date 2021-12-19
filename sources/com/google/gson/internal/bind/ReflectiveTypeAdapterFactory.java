package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC27894b;
import com.google.gson.AbstractC27909e;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27896c;
import com.google.gson.C27910f;
import com.google.gson.C28027t;
import com.google.gson.internal.AbstractC28006h;
import com.google.gson.internal.C27925b;
import com.google.gson.internal.C27980c;
import com.google.gson.internal.C28008j;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.p2021a.AbstractC27923b;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2018a.AbstractC27892d;
import com.google.gson.p2018a.AbstractC27893e;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements AbstractC28033w {

    /* renamed from: a */
    public final AbstractC27909e f65612a;

    /* renamed from: b */
    private final C27980c f65613b;

    /* renamed from: c */
    private final Excluder f65614c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f65615d;

    /* renamed from: e */
    private final AbstractC27923b f65616e = AbstractC27923b.f65591a;

    static {
        Covode.recordClassIndex(33532);
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    public static final class C27932a<T> extends AbstractC28031v<T> {

        /* renamed from: a */
        private final AbstractC28006h<T> f65624a;

        /* renamed from: b */
        private final Map<String, AbstractC27933b> f65625b;

        static {
            Covode.recordClassIndex(33534);
        }

        @Override // com.google.gson.AbstractC28031v
        public final T read(C27897a aVar) {
            if (aVar.mo46627f() == EnumC27899b.NULL) {
                aVar.mo46631k();
                return null;
            }
            T a = this.f65624a.mo46740a();
            try {
                aVar.mo46623c();
                while (aVar.mo46626e()) {
                    AbstractC27933b bVar = this.f65625b.get(aVar.mo46628h());
                    if (bVar == null || !bVar.f65628j) {
                        aVar.mo46635o();
                    } else {
                        bVar.mo46721a(aVar, a);
                    }
                }
                aVar.mo46625d();
                return a;
            } catch (IllegalStateException e) {
                throw new C28027t(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        C27932a(AbstractC28006h<T> hVar, Map<String, AbstractC27933b> map) {
            this.f65624a = hVar;
            this.f65625b = map;
        }

        @Override // com.google.gson.AbstractC28031v
        public final void write(C27900c cVar, T t) {
            if (t == null) {
                cVar.mo46654f();
                return;
            }
            cVar.mo46652d();
            try {
                for (AbstractC27933b bVar : this.f65625b.values()) {
                    if (bVar.mo46723a(t)) {
                        cVar.mo46645a(bVar.f65626h);
                        bVar.mo46722a(cVar, t);
                    }
                }
                cVar.mo46653e();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C27932a(this.f65613b.mo46738a(aVar), m55990a(fVar, aVar, cls));
    }

    /* renamed from: a */
    private static List m55989a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, Field field) {
        try {
            AbstractC27891c cVar = (AbstractC27891c) field.getAnnotation(AbstractC27891c.class);
            if (cVar == null) {
                return Collections.singletonList(reflectiveTypeAdapterFactory.f65612a.mo46658a(field));
            }
            String a = cVar.mo46611a();
            String[] b = cVar.mo46612b();
            if (b.length == 0) {
                return Collections.singletonList(a);
            }
            ArrayList arrayList = new ArrayList(b.length + 1);
            arrayList.add(a);
            for (String str : b) {
                arrayList.add(str);
            }
            return arrayList;
        } catch (IncompatibleClassChangeError e) {
            C51423a.m95790a(e);
            return Collections.singletonList(reflectiveTypeAdapterFactory.f65612a.mo46658a(field));
        }
    }

    /* renamed from: a */
    private boolean m55991a(Field field, boolean z) {
        List<AbstractC27894b> list;
        AbstractC27889a aVar;
        Excluder excluder = this.f65614c;
        Class<?> type = field.getType();
        if (excluder.mo46702a(type) || excluder.mo46703a(type, z) || (excluder.f65580c & field.getModifiers()) != 0 || ((excluder.f65579b != -1.0d && !excluder.mo46701a((AbstractC27892d) field.getAnnotation(AbstractC27892d.class), (AbstractC27893e) field.getAnnotation(AbstractC27893e.class))) || field.isSynthetic() || ((excluder.f65582e && ((aVar = (AbstractC27889a) field.getAnnotation(AbstractC27889a.class)) == null || (!z ? !aVar.mo46608b() : !aVar.mo46607a()))) || ((!excluder.f65581d && Excluder.m55960c(field.getType())) || Excluder.m55959b(field.getType()))))) {
            return false;
        }
        if (z) {
            list = excluder.f65583f;
        } else {
            list = excluder.f65584g;
        }
        if (!list.isEmpty()) {
            C27896c cVar = new C27896c(field);
            for (AbstractC27894b bVar : list) {
                if (bVar.shouldSkipField(cVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    public static abstract class AbstractC27933b {

        /* renamed from: h */
        final String f65626h;

        /* renamed from: i */
        final boolean f65627i;

        /* renamed from: j */
        final boolean f65628j;

        static {
            Covode.recordClassIndex(33535);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo46721a(C27897a aVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo46722a(C27900c cVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo46723a(Object obj);

        protected AbstractC27933b(String str, boolean z, boolean z2) {
            this.f65626h = str;
            this.f65627i = z;
            this.f65628j = z2;
        }
    }

    /* renamed from: a */
    private Map<String, AbstractC27933b> m55990a(final C27910f fVar, C27895a<?> aVar, Class<?> cls) {
        Class<?> cls2;
        C27895a<?> aVar2;
        Field[] fieldArr;
        int i;
        int i2;
        Type type;
        boolean z;
        final boolean z2;
        final AbstractC28031v<?> a;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type2 = aVar.type;
        Class<?> cls3 = cls;
        C27895a<?> aVar3 = aVar;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            int length = declaredFields.length;
            boolean z3 = false;
            int i3 = 0;
            while (i3 < length) {
                final Field field = declaredFields[i3];
                boolean a2 = reflectiveTypeAdapterFactory.m55991a(field, true);
                boolean a3 = reflectiveTypeAdapterFactory.m55991a(field, z3);
                if (a2 || a3) {
                    reflectiveTypeAdapterFactory.f65616e.mo46705a(field);
                    Type a4 = C27925b.m55980a(aVar3.type, cls3, field.getGenericType());
                    List a5 = m55989a(reflectiveTypeAdapterFactory, field);
                    int size = a5.size();
                    aVar2 = aVar3;
                    AbstractC27933b bVar = null;
                    int i4 = 0;
                    while (i4 < size) {
                        String str = (String) a5.get(i4);
                        if (i4 != 0) {
                            z = false;
                        } else {
                            z = a2;
                        }
                        final C27895a<?> aVar4 = C27895a.get(a4);
                        final boolean containsKey = C28008j.f65793a.containsKey(aVar4.rawType);
                        AbstractC27890b bVar2 = (AbstractC27890b) field.getAnnotation(AbstractC27890b.class);
                        if (bVar2 != null) {
                            a = JsonAdapterAnnotationTypeAdapterFactory.m55988a(reflectiveTypeAdapterFactory.f65613b, fVar, aVar4, bVar2);
                            if (a != null) {
                                z2 = true;
                            }
                            z2 = false;
                            a = fVar.mo46663a((C27895a) aVar4);
                        } else {
                            z2 = false;
                            a = fVar.mo46663a((C27895a) aVar4);
                        }
                        AbstractC27933b bVar3 = (AbstractC27933b) linkedHashMap.put(str, new AbstractC27933b(str, z, a3) {
                            /* class com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C279311 */

                            static {
                                Covode.recordClassIndex(33533);
                            }

                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC27933b
                            /* renamed from: a */
                            public final boolean mo46723a(Object obj) {
                                if (this.f65627i && field.get(obj) != obj) {
                                    return true;
                                }
                                return false;
                            }

                            /* access modifiers changed from: package-private */
                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC27933b
                            /* renamed from: a */
                            public final void mo46721a(C27897a aVar, Object obj) {
                                Object read = a.read(aVar);
                                if (read != null || !containsKey) {
                                    field.set(obj, read);
                                }
                            }

                            /* access modifiers changed from: package-private */
                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC27933b
                            /* renamed from: a */
                            public final void mo46722a(C27900c cVar, Object obj) {
                                AbstractC28031v hVar;
                                Object obj2 = field.get(obj);
                                if (z2) {
                                    hVar = a;
                                } else {
                                    hVar = new C27948h(fVar, a, aVar4.type);
                                }
                                hVar.write(cVar, obj2);
                            }
                        });
                        if (bVar == null) {
                            bVar = bVar3;
                        }
                        i4++;
                        reflectiveTypeAdapterFactory = this;
                        cls3 = cls3;
                        a2 = z;
                        type2 = type2;
                        length = length;
                        size = size;
                        a5 = a5;
                        field = field;
                        i3 = i3;
                        declaredFields = declaredFields;
                    }
                    i = i3;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    if (bVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.f65626h);
                    }
                } else {
                    i = i3;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    aVar2 = aVar3;
                }
                i3 = i + 1;
                reflectiveTypeAdapterFactory = this;
                aVar3 = aVar2;
                cls3 = cls2;
                type2 = type;
                length = i2;
                declaredFields = fieldArr;
                z3 = false;
            }
            aVar3 = C27895a.get(C27925b.m55980a(aVar3.type, cls3, cls3.getGenericSuperclass()));
            cls3 = aVar3.rawType;
            reflectiveTypeAdapterFactory = this;
        }
        return linkedHashMap;
    }

    public ReflectiveTypeAdapterFactory(C27980c cVar, AbstractC27909e eVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f65613b = cVar;
        this.f65612a = eVar;
        this.f65614c = excluder;
        this.f65615d = jsonAdapterAnnotationTypeAdapterFactory;
    }
}
