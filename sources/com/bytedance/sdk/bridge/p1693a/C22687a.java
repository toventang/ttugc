package com.bytedance.sdk.bridge.p1693a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bridge.C22701d;
import com.bytedance.sdk.bridge.C22702e;
import com.bytedance.sdk.bridge.C22704g;
import com.bytedance.sdk.bridge.C22705h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.bridge.a.a */
public final class C22687a {

    /* renamed from: a */
    private static Map<Class<?>, C22705h> f53606a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(26507);
    }

    /* renamed from: a */
    public static C22705h m42781a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        C22704g.m42795a("BridgeAnnotationHelper", "getInfoByReflect - " + cls.getSimpleName());
        C22705h hVar = new C22705h();
        LinkedList linkedList = new LinkedList();
        linkedList.add(cls);
        while (!linkedList.isEmpty()) {
            Class cls2 = (Class) linkedList.remove();
            Class<?>[] interfaces = cls2.getInterfaces();
            if (interfaces != null) {
                for (int i = 0; i < interfaces.length; i++) {
                    if (AbstractC22691e.class.isAssignableFrom(interfaces[i]) && interfaces[i] != AbstractC22691e.class) {
                        linkedList.add(interfaces[i]);
                    }
                }
            }
            Class superclass = cls2.getSuperclass();
            if (superclass != null) {
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                    linkedList.add(superclass);
                }
            }
            m42782a(cls2, hVar);
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m42782a(Class cls, C22705h hVar) {
        MethodCollector.m26663i(4177);
        C22705h hVar2 = f53606a.get(cls);
        if (hVar2 != null) {
            synchronized (hVar2) {
                try {
                    for (C22701d dVar : hVar2.mo36990a()) {
                        if (!hVar.mo36992a(dVar.f53626b)) {
                            hVar.mo36991a(dVar.f53626b, dVar);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(4177);
                }
            }
            return;
        }
        C22705h hVar3 = new C22705h();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            AbstractC22689c cVar = (AbstractC22689c) method.getAnnotation(AbstractC22689c.class);
            if (cVar != null) {
                String a = cVar.mo36974a();
                if (!TextUtils.isEmpty(a) && !hVar.mo36992a(a)) {
                    method.setAccessible(true);
                    String b = cVar.mo36975b();
                    String c = cVar.mo36976c();
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C22702e[] eVarArr = new C22702e[parameterAnnotations.length];
                    for (int i = 0; i < parameterAnnotations.length; i++) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= parameterAnnotations[i].length) {
                                break;
                            } else if (parameterAnnotations[i][i2] instanceof AbstractC22690d) {
                                AbstractC22690d dVar2 = (AbstractC22690d) parameterAnnotations[i][i2];
                                Class<?> cls2 = parameterTypes[i];
                                String a2 = dVar2.mo36977a();
                                Object obj = null;
                                if (cls2 == Integer.TYPE) {
                                    obj = Integer.valueOf(dVar2.mo36978b());
                                } else if (cls2 == Long.TYPE) {
                                    obj = Long.valueOf(dVar2.mo36979c());
                                } else if (cls2 == Boolean.TYPE) {
                                    obj = Boolean.valueOf(dVar2.mo36982f());
                                } else if (cls2 == Double.TYPE) {
                                    obj = Double.valueOf(dVar2.mo36980d());
                                } else if (cls2 == Float.TYPE) {
                                    obj = Float.valueOf(dVar2.mo36981e());
                                } else if (cls2 == String.class) {
                                    obj = dVar2.mo36983g();
                                }
                                eVarArr[i] = new C22702e(cls2, a2, obj, dVar2.mo36984h());
                            } else if (parameterAnnotations[i][i2] instanceof AbstractC22688b) {
                                eVarArr[i] = new C22702e();
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (eVarArr[i] == null) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Bridge param must be Annotated! Please check the bridge method [" + a + "]");
                            MethodCollector.m26664o(4177);
                            throw illegalArgumentException;
                        }
                    }
                    C22701d dVar3 = new C22701d(method, a, b, c, eVarArr);
                    hVar.mo36991a(a, dVar3);
                    hVar3.mo36991a(a, dVar3);
                }
            }
        }
        if (!hVar3.mo36990a().isEmpty()) {
            f53606a.put(cls, hVar3);
        }
        MethodCollector.m26664o(4177);
    }
}
