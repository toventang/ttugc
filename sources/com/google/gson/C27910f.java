package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.internal.C27980c;
import com.google.gson.internal.C28008j;
import com.google.gson.internal.C28009k;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C27937a;
import com.google.gson.internal.bind.C27939b;
import com.google.gson.internal.bind.C27940c;
import com.google.gson.internal.bind.C27942d;
import com.google.gson.internal.bind.C27944e;
import com.google.gson.internal.bind.C27946f;
import com.google.gson.internal.bind.C27947g;
import com.google.gson.internal.bind.C27949i;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.C27901d;
import com.google.gson.p2020c.EnumC27899b;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.f */
public final class C27910f {

    /* renamed from: r */
    private static final C27895a<?> f65534r = C27895a.get(Object.class);

    /* renamed from: a */
    final List<AbstractC28033w> f65535a;

    /* renamed from: b */
    public final Excluder f65536b;

    /* renamed from: c */
    public final AbstractC27909e f65537c;

    /* renamed from: d */
    final Map<Type, AbstractC27918h<?>> f65538d;

    /* renamed from: e */
    public final boolean f65539e;

    /* renamed from: f */
    final boolean f65540f;

    /* renamed from: g */
    final boolean f65541g;

    /* renamed from: h */
    public final boolean f65542h;

    /* renamed from: i */
    final boolean f65543i;

    /* renamed from: j */
    final boolean f65544j;

    /* renamed from: k */
    final boolean f65545k;

    /* renamed from: l */
    final String f65546l;

    /* renamed from: m */
    final int f65547m;

    /* renamed from: n */
    final int f65548n;

    /* renamed from: o */
    final EnumC28028u f65549o;

    /* renamed from: p */
    final List<AbstractC28033w> f65550p;

    /* renamed from: q */
    final List<AbstractC28033w> f65551q;

    /* renamed from: s */
    private final ThreadLocal<Map<C27895a<?>, C27916a<?>>> f65552s;

    /* renamed from: t */
    private final Map<C27895a<?>, AbstractC28031v<?>> f65553t;

    /* renamed from: u */
    private final C27980c f65554u;

    /* renamed from: v */
    private final JsonAdapterAnnotationTypeAdapterFactory f65555v;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.f$a */
    public static class C27916a<T> extends AbstractC28031v<T> {

        /* renamed from: a */
        AbstractC28031v<T> f65560a;

        static {
            Covode.recordClassIndex(33510);
        }

        C27916a() {
        }

        @Override // com.google.gson.AbstractC28031v
        public final T read(C27897a aVar) {
            AbstractC28031v<T> vVar = this.f65560a;
            if (vVar != null) {
                return vVar.read(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.AbstractC28031v
        public final void write(C27900c cVar, T t) {
            AbstractC28031v<T> vVar = this.f65560a;
            if (vVar != null) {
                vVar.write(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final <T> AbstractC28031v<T> mo46663a(C27895a<T> aVar) {
        AbstractC28031v<T> vVar = (AbstractC28031v<T>) this.f65553t.get(aVar == null ? f65534r : aVar);
        if (vVar != null) {
            return vVar;
        }
        Map<C27895a<?>, C27916a<?>> map = this.f65552s.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f65552s.set(map);
            z = true;
        }
        C27916a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            C27916a<?> aVar3 = new C27916a<>();
            map.put(aVar, aVar3);
            for (AbstractC28033w wVar : this.f65535a) {
                AbstractC28031v<T> create = wVar.create(this, aVar);
                if (create != null) {
                    if (aVar3.f65560a == null) {
                        aVar3.f65560a = create;
                        this.f65553t.put(aVar, create);
                        return create;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle ".concat(String.valueOf(aVar)));
        } finally {
            map.remove(aVar);
            if (z) {
                this.f65552s.remove();
            }
        }
    }

    /* renamed from: a */
    public final <T> AbstractC28031v<T> mo46664a(AbstractC28033w wVar, C27895a<T> aVar) {
        if (!this.f65535a.contains(wVar)) {
            wVar = this.f65555v;
        }
        boolean z = false;
        for (AbstractC28033w wVar2 : this.f65535a) {
            if (z) {
                AbstractC28031v<T> create = wVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (wVar2 == wVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public final <T> AbstractC28031v<T> mo46665a(Class<T> cls) {
        return mo46663a((C27895a) C27895a.get((Class) cls));
    }

    /* renamed from: a */
    public final AbstractC28019l mo46661a(Object obj) {
        if (obj == null) {
            return C28021n.f65803a;
        }
        return mo46662a(obj, obj.getClass());
    }

    /* renamed from: a */
    public final AbstractC28019l mo46662a(Object obj, Type type) {
        C27942d dVar = new C27942d();
        mo46673a(obj, type, dVar);
        return dVar.mo46734a();
    }

    /* renamed from: a */
    public final void mo46673a(Object obj, Type type, C27900c cVar) {
        AbstractC28031v a = mo46663a((C27895a) C27895a.get(type));
        boolean z = cVar.f65525b;
        cVar.f65525b = true;
        boolean z2 = cVar.f65526c;
        cVar.f65526c = this.f65542h;
        boolean z3 = cVar.f65527d;
        cVar.f65527d = this.f65539e;
        try {
            a.write(cVar, obj);
            cVar.f65525b = z;
            cVar.f65526c = z2;
            cVar.f65527d = z3;
        } catch (IOException e) {
            throw new C28020m(e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            cVar.f65525b = z;
            cVar.f65526c = z2;
            cVar.f65527d = z3;
            throw th;
        }
    }

    /* renamed from: a */
    public final String mo46672a(AbstractC28019l lVar) {
        StringWriter stringWriter = new StringWriter();
        m55917a(lVar, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final <T> T mo46670a(String str, Class<T> cls) {
        return (T) C28008j.m56097a(cls).cast(mo46671a(str, (Type) cls));
    }

    /* renamed from: a */
    public final <T> T mo46671a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) m55914a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public final <T> T mo46669a(Reader reader, Class<T> cls) {
        C27897a a = mo46659a(reader);
        Object a2 = mo46666a(a, (Type) cls);
        m55918a(a2, a);
        return (T) C28008j.m56097a(cls).cast(a2);
    }

    /* renamed from: a */
    public final <T> T mo46666a(C27897a aVar, Type type) {
        boolean z = aVar.f65506a;
        boolean z2 = true;
        aVar.f65506a = true;
        try {
            aVar.mo46627f();
            z2 = false;
            T read = mo46663a((C27895a) C27895a.get(type)).read(aVar);
            aVar.f65506a = z;
            return read;
        } catch (EOFException e) {
            if (z2) {
                aVar.f65506a = z;
                return null;
            }
            throw new C28027t(e);
        } catch (IllegalStateException e2) {
            throw new C28027t(e2);
        } catch (IOException e3) {
            throw new C28027t(e3);
        } catch (AssertionError e4) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
        } catch (Throwable th) {
            aVar.f65506a = z;
            throw th;
        }
    }

    /* renamed from: a */
    public final <T> T mo46667a(AbstractC28019l lVar, Class<T> cls) {
        return (T) C28008j.m56097a(cls).cast(mo46668a(lVar, (Type) cls));
    }

    /* renamed from: a */
    public final <T> T mo46668a(AbstractC28019l lVar, Type type) {
        if (lVar == null) {
            return null;
        }
        return (T) mo46666a((C27897a) new C27940c(lVar), type);
    }

    static {
        Covode.recordClassIndex(33504);
    }

    public C27910f() {
        this(Excluder.f65578a, EnumC27902d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC28028u.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public final String toString() {
        return "{serializeNulls:" + this.f65539e + ",factories:" + this.f65535a + ",instanceCreators:" + this.f65554u + "}";
    }

    /* renamed from: b */
    public final String mo46674b(Object obj) {
        if (obj == null) {
            return mo46672a((AbstractC28019l) C28021n.f65803a);
        }
        return mo46675b(obj, obj.getClass());
    }

    /* renamed from: a */
    static void m55915a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: a */
    public final C27897a mo46659a(Reader reader) {
        C27897a aVar = new C27897a(reader);
        aVar.f65506a = this.f65544j;
        return aVar;
    }

    /* renamed from: a */
    public final C27900c mo46660a(Writer writer) {
        MethodCollector.m26663i(6541);
        if (this.f65541g) {
            writer.write(")]}'\n");
        }
        C27900c cVar = new C27900c(writer);
        if (this.f65543i) {
            cVar.mo46650c("  ");
        }
        cVar.f65527d = this.f65539e;
        MethodCollector.m26664o(6541);
        return cVar;
    }

    /* renamed from: a */
    private <T> T m55914a(Reader reader, Type type) {
        C27897a a = mo46659a(reader);
        T t = (T) mo46666a(a, type);
        m55918a(t, a);
        return t;
    }

    /* renamed from: b */
    public final String mo46675b(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m55919a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    private void m55917a(AbstractC28019l lVar, Appendable appendable) {
        try {
            m55916a(lVar, mo46660a(C28009k.m56100a(appendable)));
        } catch (IOException e) {
            throw new C28020m(e);
        }
    }

    /* renamed from: a */
    private void m55916a(AbstractC28019l lVar, C27900c cVar) {
        boolean z = cVar.f65525b;
        cVar.f65525b = true;
        boolean z2 = cVar.f65526c;
        cVar.f65526c = this.f65542h;
        boolean z3 = cVar.f65527d;
        cVar.f65527d = this.f65539e;
        try {
            C28009k.m56101a(lVar, cVar);
            cVar.f65525b = z;
            cVar.f65526c = z2;
            cVar.f65527d = z3;
        } catch (IOException e) {
            throw new C28020m(e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            cVar.f65525b = z;
            cVar.f65526c = z2;
            cVar.f65527d = z3;
            throw th;
        }
    }

    /* renamed from: a */
    private static void m55918a(Object obj, C27897a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo46627f() != EnumC27899b.END_DOCUMENT) {
                    throw new C28020m("JSON document was not fully consumed.");
                }
            } catch (C27901d e) {
                throw new C28027t(e);
            } catch (IOException e2) {
                throw new C28020m(e2);
            }
        }
    }

    /* renamed from: a */
    private void m55919a(Object obj, Type type, Appendable appendable) {
        try {
            mo46673a(obj, type, mo46660a(C28009k.m56100a(appendable)));
        } catch (IOException e) {
            throw new C28020m(e);
        }
    }

    C27910f(Excluder excluder, AbstractC27909e eVar, Map<Type, AbstractC27918h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC28028u uVar, String str, int i, int i2, List<AbstractC28033w> list, List<AbstractC28033w> list2, List<AbstractC28033w> list3) {
        final AbstractC28031v r5;
        AbstractC28031v r0;
        AbstractC28031v r02;
        this.f65552s = new ThreadLocal<>();
        this.f65553t = new ConcurrentHashMap();
        this.f65536b = excluder;
        this.f65537c = eVar;
        this.f65538d = map;
        C27980c cVar = new C27980c(map);
        this.f65554u = cVar;
        this.f65539e = z;
        this.f65540f = z2;
        this.f65541g = z3;
        this.f65542h = z4;
        this.f65543i = z5;
        this.f65544j = z6;
        this.f65545k = z7;
        this.f65549o = uVar;
        this.f65546l = str;
        this.f65547m = i;
        this.f65548n = i2;
        this.f65550p = list;
        this.f65551q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C27949i.f65709Y);
        arrayList.add(C27944e.f65675a);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(C27949i.f65688D);
        arrayList.add(C27949i.f65723m);
        arrayList.add(C27949i.f65717g);
        arrayList.add(C27949i.f65719i);
        arrayList.add(C27949i.f65721k);
        if (uVar == EnumC28028u.DEFAULT) {
            r5 = C27949i.f65730t;
        } else {
            r5 = new AbstractC28031v<Number>() {
                /* class com.google.gson.C27910f.C279133 */

                static {
                    Covode.recordClassIndex(33507);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.gson.AbstractC28031v
                public final /* synthetic */ Number read(C27897a aVar) {
                    if (aVar.mo46627f() != EnumC27899b.NULL) {
                        return Long.valueOf(aVar.mo46633m());
                    }
                    aVar.mo46631k();
                    return null;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
                @Override // com.google.gson.AbstractC28031v
                public final /* synthetic */ void write(C27900c cVar, Number number) {
                    if (number == null) {
                        cVar.mo46654f();
                    } else {
                        cVar.mo46648b(number.toString());
                    }
                }
            };
        }
        arrayList.add(C27949i.m56049a(Long.TYPE, Long.class, r5));
        Class cls = Double.TYPE;
        if (z7) {
            r0 = C27949i.f65732v;
        } else {
            r0 = new AbstractC28031v<Number>() {
                /* class com.google.gson.C27910f.C279111 */

                static {
                    Covode.recordClassIndex(33505);
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
                    Number number2 = number;
                    if (number2 == null) {
                        cVar.mo46654f();
                        return;
                    }
                    C27910f.m55915a(number2.doubleValue());
                    cVar.mo46644a(number2);
                }
            };
        }
        arrayList.add(C27949i.m56049a(cls, Double.class, r0));
        Class cls2 = Float.TYPE;
        if (z7) {
            r02 = C27949i.f65731u;
        } else {
            r02 = new AbstractC28031v<Number>() {
                /* class com.google.gson.C27910f.C279122 */

                static {
                    Covode.recordClassIndex(33506);
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
                    Number number2 = number;
                    if (number2 == null) {
                        cVar.mo46654f();
                        return;
                    }
                    C27910f.m55915a((double) number2.floatValue());
                    cVar.mo46644a(number2);
                }
            };
        }
        arrayList.add(C27949i.m56049a(cls2, Float.class, r02));
        arrayList.add(C27949i.f65734x);
        arrayList.add(C27949i.f65725o);
        arrayList.add(C27949i.f65727q);
        arrayList.add(C27949i.m56048a(AtomicLong.class, new AbstractC28031v<AtomicLong>() {
            /* class com.google.gson.C27910f.C279144 */

            static {
                Covode.recordClassIndex(33508);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ AtomicLong read(C27897a aVar) {
                return new AtomicLong(((Number) r5.read(aVar)).longValue());
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, AtomicLong atomicLong) {
                r5.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe()));
        arrayList.add(C27949i.m56048a(AtomicLongArray.class, new AbstractC28031v<AtomicLongArray>() {
            /* class com.google.gson.C27910f.C279155 */

            static {
                Covode.recordClassIndex(33509);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ AtomicLongArray read(C27897a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.mo46621a();
                while (aVar.mo46626e()) {
                    arrayList.add(Long.valueOf(((Number) r5.read(aVar)).longValue()));
                }
                aVar.mo46622b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ void write(C27900c cVar, AtomicLongArray atomicLongArray) {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                cVar.mo46647b();
                int length = atomicLongArray2.length();
                for (int i = 0; i < length; i++) {
                    r5.write(cVar, Long.valueOf(atomicLongArray2.get(i)));
                }
                cVar.mo46649c();
            }
        }.nullSafe()));
        arrayList.add(C27949i.f65729s);
        arrayList.add(C27949i.f65736z);
        arrayList.add(C27949i.f65690F);
        arrayList.add(C27949i.f65692H);
        arrayList.add(C27949i.m56048a(BigDecimal.class, C27949i.f65686B));
        arrayList.add(C27949i.m56048a(BigInteger.class, C27949i.f65687C));
        arrayList.add(C27949i.f65694J);
        arrayList.add(C27949i.f65696L);
        arrayList.add(C27949i.f65700P);
        arrayList.add(C27949i.f65702R);
        arrayList.add(C27949i.f65707W);
        arrayList.add(C27949i.f65698N);
        arrayList.add(C27949i.f65714d);
        arrayList.add(C27939b.f65662a);
        arrayList.add(C27949i.f65705U);
        arrayList.add(C27947g.f65680a);
        arrayList.add(C27946f.f65678a);
        arrayList.add(C27949i.f65703S);
        arrayList.add(C27937a.f65658a);
        arrayList.add(C27949i.f65712b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.f65555v = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(C27949i.f65710Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, eVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f65535a = Collections.unmodifiableList(arrayList);
    }
}
