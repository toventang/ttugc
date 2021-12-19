package com.lynx.tasm.behavior.utils;

import android.util.Pair;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28526n;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.behavior.utils.d */
public final class C28703d {

    /* renamed from: a */
    private static final Map<Class, Map<String, AbstractC28713j>> f67701a = new C0484a();

    /* renamed from: b */
    private static final Map<String, AbstractC28713j> f67702b = new C0484a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$j */
    public static abstract class AbstractC28713j {

        /* renamed from: e */
        private static final Object[] f67707e = new Object[1];

        /* renamed from: f */
        private static final Object[] f67708f = new Object[2];

        /* renamed from: g */
        private static final Object[] f67709g = new Object[1];

        /* renamed from: h */
        private static final Object[] f67710h = new Object[2];

        /* renamed from: a */
        public final String f67711a;

        /* renamed from: b */
        public final String f67712b;

        /* renamed from: c */
        protected final Method f67713c;

        /* renamed from: d */
        protected final Integer f67714d;

        /* renamed from: a */
        private static Object m57497a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_lynx_tasm_behavior_utils_PropsSetterCache$PropSetter_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_lynx_tasm_behavior_utils_PropsSetterCache$PropSetter_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Object mo49815a(C28716v vVar);

        static {
            Covode.recordClassIndex(34807);
        }

        /* renamed from: a */
        public final void mo49816a(ShadowNode shadowNode, C28716v vVar) {
            try {
                Integer num = this.f67714d;
                if (num == null) {
                    Object[] objArr = f67709g;
                    objArr[0] = mo49815a(vVar);
                    m57497a(this.f67713c, shadowNode, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f67710h;
                objArr2[0] = num;
                objArr2[1] = mo49815a(vVar);
                m57497a(this.f67713c, shadowNode, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                throw new RuntimeException("Error while updating property '" + this.f67711a + "' in shadow node of type: " + shadowNode.mo49105e() + ":" + th.getMessage(), th);
            }
        }

        /* renamed from: a */
        public final void mo49817a(LynxBaseUI lynxBaseUI, C28716v vVar) {
            try {
                Integer num = this.f67714d;
                if (num == null) {
                    Object[] objArr = f67707e;
                    objArr[0] = mo49815a(vVar);
                    m57497a(this.f67713c, lynxBaseUI, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f67708f;
                objArr2[0] = num;
                objArr2[1] = mo49815a(vVar);
                m57497a(this.f67713c, lynxBaseUI, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                throw new RuntimeException("Error while updating property '" + this.f67711a + "' in shadow node of type: " + lynxBaseUI.getClass() + ":" + th.getMessage(), th);
            }
        }

        private AbstractC28713j(AbstractC28525m mVar, String str, Method method) {
            this.f67711a = mVar.mo49059a();
            this.f67712b = !"__default_type__".equals(mVar.mo49060b()) ? mVar.mo49060b() : str;
            this.f67713c = method;
            this.f67714d = null;
        }

        /* synthetic */ AbstractC28713j(AbstractC28525m mVar, String str, Method method, byte b) {
            this(mVar, str, method);
        }

        private AbstractC28713j(AbstractC28526n nVar, String str, Method method, int i) {
            this.f67711a = nVar.mo49065a()[i];
            this.f67712b = !"__default_type__".equals(nVar.mo49066b()) ? nVar.mo49066b() : str;
            this.f67713c = method;
            this.f67714d = Integer.valueOf(i);
        }

        /* synthetic */ AbstractC28713j(AbstractC28526n nVar, String str, Method method, int i, byte b) {
            this(nVar, str, method, i);
        }
    }

    static {
        Covode.recordClassIndex(34797);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$a */
    public static class C28704a extends AbstractC28713j {
        static {
            Covode.recordClassIndex(34798);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            return vVar.mo49825d(this.f67711a);
        }

        public C28704a(AbstractC28525m mVar, Method method) {
            super(mVar, "Array", method, (byte) 0);
        }

        public C28704a(AbstractC28526n nVar, Method method, int i) {
            super(nVar, "Array", method, i, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$f */
    public static class C28709f extends AbstractC28713j {
        static {
            Covode.recordClassIndex(34803);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            return vVar.mo49827f(this.f67711a);
        }

        public C28709f(AbstractC28525m mVar, Method method) {
            super(mVar, "mixed", method, (byte) 0);
        }

        public C28709f(AbstractC28526n nVar, Method method, int i) {
            super(nVar, "mixed", method, i, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$i */
    public static class C28712i extends AbstractC28713j {
        static {
            Covode.recordClassIndex(34806);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            return vVar.mo49826e(this.f67711a);
        }

        public C28712i(AbstractC28525m mVar, Method method) {
            super(mVar, "Map", method, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$k */
    public static class C28714k extends AbstractC28713j {
        static {
            Covode.recordClassIndex(34808);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            return vVar.mo49824c(this.f67711a);
        }

        public C28714k(AbstractC28525m mVar, Method method) {
            super(mVar, "String", method, (byte) 0);
        }

        public C28714k(AbstractC28526n nVar, Method method, int i) {
            super(nVar, "String", method, i, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$b */
    public static class C28705b extends AbstractC28713j {

        /* renamed from: e */
        private final boolean f67703e;

        static {
            Covode.recordClassIndex(34799);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            if (vVar.mo49822a(this.f67711a, this.f67703e)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public C28705b(AbstractC28525m mVar, Method method, boolean z) {
            super(mVar, "boolean", method, (byte) 0);
            this.f67703e = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$e */
    public static class C28708e extends AbstractC28713j {

        /* renamed from: e */
        private final double f67704e;

        static {
            Covode.recordClassIndex(34802);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            return Double.valueOf(vVar.mo49818a(this.f67711a, this.f67704e));
        }

        public C28708e(AbstractC28525m mVar, Method method, double d) {
            super(mVar, "number", method, (byte) 0);
            this.f67704e = d;
        }

        public C28708e(AbstractC28526n nVar, Method method, int i, double d) {
            super(nVar, "number", method, i, (byte) 0);
            this.f67704e = d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$g */
    public static class C28710g extends AbstractC28713j {

        /* renamed from: e */
        private final float f67705e;

        static {
            Covode.recordClassIndex(34804);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            return Float.valueOf(vVar.mo49819a(this.f67711a, this.f67705e));
        }

        public C28710g(AbstractC28525m mVar, Method method, float f) {
            super(mVar, "number", method, (byte) 0);
            this.f67705e = f;
        }

        public C28710g(AbstractC28526n nVar, Method method, int i, float f) {
            super(nVar, "number", method, i, (byte) 0);
            this.f67705e = f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$h */
    public static class C28711h extends AbstractC28713j {

        /* renamed from: e */
        private final int f67706e;

        static {
            Covode.recordClassIndex(34805);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            return Integer.valueOf(vVar.mo49820a(this.f67711a, this.f67706e));
        }

        public C28711h(AbstractC28525m mVar, Method method, int i) {
            super(mVar, "number", method, (byte) 0);
            this.f67706e = i;
        }

        public C28711h(AbstractC28526n nVar, Method method, int i, int i2) {
            super(nVar, "number", method, i, (byte) 0);
            this.f67706e = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$c */
    public static class C28706c extends AbstractC28713j {
        static {
            Covode.recordClassIndex(34800);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            if (vVar.mo49823b(this.f67711a)) {
                return null;
            }
            if (vVar.mo49822a(this.f67711a, false)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public C28706c(AbstractC28525m mVar, Method method) {
            super(mVar, "boolean", method, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$d */
    public static class C28707d extends AbstractC28713j {
        static {
            Covode.recordClassIndex(34801);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C28703d.AbstractC28713j
        /* renamed from: a */
        public final Object mo49815a(C28716v vVar) {
            if (!vVar.mo49823b(this.f67711a)) {
                return Integer.valueOf(vVar.mo49820a(this.f67711a, 0));
            }
            return null;
        }

        public C28707d(AbstractC28525m mVar, Method method) {
            super(mVar, "number", method, (byte) 0);
        }

        public C28707d(AbstractC28526n nVar, Method method, int i) {
            super(nVar, "number", method, i, (byte) 0);
        }
    }

    /* renamed from: b */
    static Map<String, AbstractC28713j> m57487b(Class<? extends ShadowNode> cls) {
        Class<? super Object> superclass;
        if (cls == null) {
            return f67702b;
        }
        Map<String, AbstractC28713j> map = f67701a.get(cls);
        if (map != null) {
            return map;
        }
        C0484a aVar = new C0484a();
        if (cls == ShadowNode.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        aVar.putAll(m57487b(superclass));
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            AbstractC28525m mVar = (AbstractC28525m) method.getAnnotation(AbstractC28525m.class);
            if (mVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    aVar.put(mVar.mo49059a(), m57484a(mVar, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            AbstractC28526n nVar = (AbstractC28526n) method.getAnnotation(AbstractC28526n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    m57486a(nVar, method, parameterTypes2[1], aVar);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
        f67701a.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static Map<String, AbstractC28713j> m57485a(Class<? extends LynxBaseUI> cls) {
        Class<? super Object> superclass;
        if (cls == null) {
            return f67702b;
        }
        Map<String, AbstractC28713j> map = f67701a.get(cls);
        if (map != null) {
            return map;
        }
        C0484a aVar = new C0484a();
        if (cls == LynxBaseUI.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        aVar.putAll(m57485a(superclass));
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            AbstractC28525m mVar = (AbstractC28525m) method.getAnnotation(AbstractC28525m.class);
            if (mVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    aVar.put(mVar.mo49059a(), m57484a(mVar, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            AbstractC28526n nVar = (AbstractC28526n) method.getAnnotation(AbstractC28526n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    m57486a(nVar, method, parameterTypes2[1], aVar);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
        f67701a.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    private static AbstractC28713j m57484a(AbstractC28525m mVar, Method method, Class<?> cls) {
        if (cls == AbstractC28367a.class) {
            return new C28709f(mVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new C28705b(mVar, method, mVar.mo49064f());
        }
        if (cls == Integer.TYPE) {
            return new C28711h(mVar, method, mVar.mo49063e());
        }
        if (cls == Float.TYPE) {
            return new C28710g(mVar, method, mVar.mo49062d());
        }
        if (cls == Double.TYPE) {
            return new C28708e(mVar, method, mVar.mo49061c());
        }
        if (cls == String.class) {
            return new C28714k(mVar, method);
        }
        if (cls == Boolean.class) {
            return new C28706c(mVar, method);
        }
        if (cls == Integer.class) {
            return new C28707d(mVar, method);
        }
        if (cls == ReadableArray.class) {
            return new C28704a(mVar, method);
        }
        if (cls == ReadableMap.class) {
            return new C28712i(mVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* renamed from: a */
    private static void m57486a(AbstractC28526n nVar, Method method, Class<?> cls, Map<String, AbstractC28713j> map) {
        String[] a = nVar.mo49065a();
        int i = 0;
        if (cls == AbstractC28367a.class) {
            while (i < a.length) {
                map.put(a[i], new C28709f(nVar, method, i));
                i++;
            }
        } else if (cls == Integer.TYPE) {
            while (i < a.length) {
                map.put(a[i], new C28711h(nVar, method, i, nVar.mo49069e()));
                i++;
            }
        } else if (cls == Float.TYPE) {
            while (i < a.length) {
                map.put(a[i], new C28710g(nVar, method, i, nVar.mo49067c()));
                i++;
            }
        } else if (cls == Double.TYPE) {
            while (i < a.length) {
                map.put(a[i], new C28708e(nVar, method, i, nVar.mo49068d()));
                i++;
            }
        } else if (cls == Integer.class) {
            while (i < a.length) {
                map.put(a[i], new C28707d(nVar, method, i));
                i++;
            }
        } else if (cls == String.class) {
            while (i < a.length) {
                map.put(a[i], new C28714k(nVar, method, i));
                i++;
            }
        } else if (cls == ReadableArray.class) {
            while (i < a.length) {
                map.put(a[i], new C28704a(nVar, method, i));
                i++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }
}
