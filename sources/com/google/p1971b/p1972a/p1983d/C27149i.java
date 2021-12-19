package com.google.p1971b.p1972a.p1983d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import com.google.p1971b.p1972a.p1993g.AbstractC27191m;
import com.google.p1971b.p1972a.p1993g.C27171b;
import com.google.p1971b.p1972a.p1993g.C27173c;
import com.google.p1971b.p1972a.p1993g.C27174d;
import com.google.p1971b.p1972a.p1993g.C27178f;
import com.google.p1971b.p1972a.p1993g.C27184i;
import com.google.p1971b.p1972a.p1993g.C27185j;
import com.google.p1971b.p1972a.p1993g.C27192n;
import com.google.p1971b.p1972a.p1993g.p1994a.C27165a;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.b.a.d.i */
public final class C27149i implements AbstractC27191m {

    /* renamed from: a */
    public static final String f64292a;

    static {
        String name;
        Covode.recordClassIndex(32729);
        C27145e eVar = new C27145e("application/x-www-form-urlencoded");
        Charset charset = C27173c.f64323a;
        if (charset == null) {
            name = null;
        } else {
            name = charset.name();
        }
        eVar.mo45189a("charset", name);
        f64292a = eVar.mo45190a();
    }

    /* renamed from: a */
    public static void m53940a(Reader reader, Object obj) {
        C27185j jVar;
        Map map;
        boolean z;
        ParameterizedType a;
        Type type;
        Type type2;
        Class cls;
        MethodCollector.m26663i(12108);
        Class<?> cls2 = obj.getClass();
        C27174d a2 = C27174d.m54007a(cls2, false);
        List asList = Arrays.asList(cls2);
        if (C27185j.class.isAssignableFrom(cls2)) {
            jVar = (C27185j) obj;
        } else {
            jVar = null;
        }
        if (Map.class.isAssignableFrom(cls2)) {
            map = (Map) obj;
        } else {
            map = null;
        }
        C27171b bVar = new C27171b(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        boolean z2 = true;
        while (true) {
            int read = reader.read();
            if (read == -1 || read == 38) {
                String a3 = C27165a.m53995a(stringWriter.toString());
                if (a3.length() != 0) {
                    String a4 = C27165a.m53995a(stringWriter2.toString());
                    C27184i a5 = a2.mo45245a(a3);
                    if (a5 != null) {
                        Type a6 = C27178f.m54013a((List<Type>) asList, a5.f64366b.getGenericType());
                        if ((a6 instanceof GenericArrayType) || ((a6 instanceof Class) && ((Class) a6).isArray())) {
                            Class<?> a7 = C27192n.m54035a(asList, C27192n.m54041a(a6));
                            Field field = a5.f64366b;
                            Object a8 = m53939a(a7, asList, a4);
                            C27171b.C27172a aVar = bVar.f64318a.get(field);
                            if (aVar == null) {
                                aVar = new C27171b.C27172a(a7);
                                bVar.f64318a.put(field, aVar);
                            }
                            if (a7 == aVar.f64321a) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C27159b.m53983a(z);
                            aVar.f64322b.add(a8);
                        } else {
                            Class<?> a9 = C27192n.m54035a(asList, a6);
                            if (a9.isAssignableFrom(Iterable.class) || Iterable.class.isAssignableFrom(a9)) {
                                Collection collection = (Collection) a5.mo45273a(obj);
                                if (collection == null) {
                                    if (a6 instanceof WildcardType) {
                                        type2 = C27192n.m54042a((WildcardType) a6);
                                    } else {
                                        type2 = a6;
                                    }
                                    if (type2 instanceof ParameterizedType) {
                                        type2 = ((ParameterizedType) type2).getRawType();
                                    }
                                    if (type2 instanceof Class) {
                                        cls = (Class) type2;
                                    } else {
                                        cls = null;
                                    }
                                    if (type2 != null && !(type2 instanceof GenericArrayType)) {
                                        if (cls == null) {
                                            String valueOf = String.valueOf(String.valueOf(type2));
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(new StringBuilder(valueOf.length() + 39).append("unable to create new instance of type: ").append(valueOf).toString());
                                            MethodCollector.m26664o(12108);
                                            throw illegalArgumentException;
                                        } else if (!cls.isArray() && !cls.isAssignableFrom(ArrayList.class)) {
                                            if (cls.isAssignableFrom(HashSet.class)) {
                                                collection = new HashSet();
                                            } else if (cls.isAssignableFrom(TreeSet.class)) {
                                                collection = new TreeSet();
                                            } else {
                                                collection = (Collection) C27192n.m54038a(cls);
                                            }
                                            a5.mo45274a(obj, collection);
                                        }
                                    }
                                    collection = new ArrayList();
                                    a5.mo45274a(obj, collection);
                                }
                                if (a6 == Object.class || (a = C27192n.m54040a(a6, Iterable.class)) == null) {
                                    type = null;
                                } else {
                                    type = a.getActualTypeArguments()[0];
                                    if (type instanceof TypeVariable) {
                                        Type a10 = C27192n.m54043a((List<Type>) Arrays.asList(a6), (TypeVariable<?>) ((TypeVariable) type));
                                        if (a10 != null) {
                                            type = a10;
                                        }
                                    }
                                }
                                collection.add(m53939a(type, asList, a4));
                            } else {
                                a5.mo45274a(obj, m53939a(a6, asList, a4));
                            }
                        }
                    } else if (map != null) {
                        ArrayList arrayList = (ArrayList) map.get(a3);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            if (jVar != null) {
                                jVar.mo45179b(a3, arrayList);
                            } else {
                                map.put(a3, arrayList);
                            }
                        }
                        arrayList.add(a4);
                    }
                }
                stringWriter = new StringWriter();
                stringWriter2 = new StringWriter();
                if (read == -1) {
                    bVar.mo45243a();
                    MethodCollector.m26664o(12108);
                    return;
                }
                z2 = true;
            } else if (read == 61) {
                z2 = false;
            } else if (z2) {
                stringWriter.write(read);
            } else {
                stringWriter2.write(read);
            }
        }
    }

    /* renamed from: a */
    private static Object m53939a(Type type, List<Type> list, String str) {
        return C27178f.m54012a(C27178f.m54013a(list, type), str);
    }
}
