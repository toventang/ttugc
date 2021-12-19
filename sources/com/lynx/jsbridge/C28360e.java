package com.lynx.jsbridge;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.base.C28454c;
import java.lang.reflect.Method;

/* renamed from: com.lynx.jsbridge.e */
public class C28360e {

    /* renamed from: b */
    private static C0484a<Class, Character> f66606b;

    /* renamed from: a */
    public final Method f66607a;

    /* renamed from: c */
    private final Class[] f66608c;

    /* renamed from: d */
    private boolean f66609d;

    /* renamed from: e */
    private String f66610e;

    static {
        Covode.recordClassIndex(34335);
    }

    /* renamed from: a */
    public final String mo48480a() {
        boolean z;
        if (!this.f66609d) {
            this.f66609d = true;
            Method method = this.f66607a;
            Class[] clsArr = this.f66608c;
            StringBuilder sb = new StringBuilder(clsArr.length + 2);
            Class<?> returnType = method.getReturnType();
            char a = m56667a(returnType);
            if (a == 0) {
                if (returnType == Void.TYPE) {
                    a = 'v';
                } else if (returnType == WritableMap.class) {
                    a = 'M';
                } else if (returnType == WritableArray.class) {
                    a = 'A';
                } else if (returnType == byte[].class) {
                    a = 'a';
                } else {
                    throw new RuntimeException("Got unknown return class: " + returnType.getSimpleName());
                }
            }
            sb.append(a);
            sb.append('.');
            for (int i = 0; i < clsArr.length; i++) {
                Class cls = clsArr[i];
                if (cls == Promise.class) {
                    if (i == clsArr.length - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C28454c.m56883a(z, "Promise must be used as last parameter only");
                }
                char a2 = m56667a(cls);
                if (a2 == 0) {
                    if (cls == Callback.class) {
                        a2 = 'X';
                    } else if (cls == Promise.class) {
                        a2 = 'P';
                    } else if (cls == ReadableMap.class) {
                        a2 = 'M';
                    } else if (cls == ReadableArray.class) {
                        a2 = 'A';
                    } else if (cls == AbstractC28367a.class) {
                        a2 = 'Y';
                    } else if (cls == byte[].class) {
                        a2 = 'a';
                    } else {
                        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
                    }
                }
                sb.append(a2);
            }
            this.f66610e = sb.toString();
        }
        return (String) C28454c.m56881a(this.f66610e);
    }

    C28360e(Method method) {
        this.f66607a = method;
        method.setAccessible(true);
        this.f66608c = method.getParameterTypes();
    }

    /* renamed from: a */
    private static char m56667a(Class cls) {
        if (f66606b == null) {
            C0484a<Class, Character> aVar = new C0484a<>();
            f66606b = aVar;
            aVar.put(Byte.TYPE, 'b');
            f66606b.put(Byte.class, 'B');
            f66606b.put(Short.TYPE, 's');
            f66606b.put(Short.class, 'S');
            f66606b.put(Long.TYPE, 'l');
            f66606b.put(Long.class, 'L');
            f66606b.put(Character.TYPE, 'c');
            f66606b.put(Character.class, 'C');
            f66606b.put(Boolean.TYPE, 'z');
            f66606b.put(Boolean.class, 'Z');
            f66606b.put(Integer.TYPE, 'i');
            f66606b.put(Integer.class, 'I');
            f66606b.put(Double.TYPE, 'd');
            f66606b.put(Double.class, 'D');
            f66606b.put(Float.TYPE, 'f');
            f66606b.put(Float.class, 'F');
            f66606b.put(String.class, 'T');
        }
        if (f66606b.containsKey(cls)) {
            return f66606b.get(cls).charValue();
        }
        return 0;
    }
}
