package com.google.p1998c.p2005g;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* renamed from: com.google.c.g.b */
public abstract class AbstractC27563b<T, R> extends C27562a implements GenericDeclaration {
    static {
        Covode.recordClassIndex(33143);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Type[] mo46133b();

    /* renamed from: com.google.c.g.b$b */
    static class C27565b<T> extends AbstractC27563b<T, Object> {

        /* renamed from: a */
        final Method f64934a;

        static {
            Covode.recordClassIndex(33145);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2005g.AbstractC27563b
        /* renamed from: b */
        public Type[] mo46133b() {
            return this.f64934a.getGenericParameterTypes();
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f64934a.getTypeParameters();
        }

        C27565b(Method method) {
            super(method);
            this.f64934a = method;
        }
    }

    @Override // com.google.p1998c.p2005g.C27562a, java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) super.getDeclaringClass();
    }

    @Override // com.google.p1998c.p2005g.C27562a
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.p1998c.p2005g.C27562a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.p1998c.p2005g.C27562a
    /* renamed from: a */
    public AbstractC27577g<T> mo46119a() {
        return AbstractC27577g.m55138of((Class) getDeclaringClass());
    }

    /* renamed from: com.google.c.g.b$a */
    static class C27564a<T> extends AbstractC27563b<T, T> {

        /* renamed from: a */
        final Constructor<?> f64933a;

        static {
            Covode.recordClassIndex(33144);
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f64933a.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[(typeParameters.length + typeParameters2.length)];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2005g.AbstractC27563b
        /* renamed from: b */
        public Type[] mo46133b() {
            Type[] genericParameterTypes = this.f64933a.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0) {
                return genericParameterTypes;
            }
            Class<?> declaringClass = this.f64933a.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() == null) {
                Method enclosingMethod = declaringClass.getEnclosingMethod();
                if (enclosingMethod != null) {
                    if (Modifier.isStatic(enclosingMethod.getModifiers())) {
                        return genericParameterTypes;
                    }
                } else if (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                    return genericParameterTypes;
                }
            }
            Class<?>[] parameterTypes = this.f64933a.getParameterTypes();
            if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                return (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
            }
            return genericParameterTypes;
        }

        C27564a(Constructor<?> constructor) {
            super(constructor);
            this.f64933a = constructor;
        }
    }

    <M extends AccessibleObject & Member> AbstractC27563b(M m) {
        super(m);
    }

    @Override // com.google.p1998c.p2005g.C27562a
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }
}
