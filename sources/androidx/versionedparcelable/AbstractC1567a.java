package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.p025c.C0484a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.versionedparcelable.a */
public abstract class AbstractC1567a {

    /* renamed from: a */
    protected final C0484a<String, Method> f5142a;

    /* renamed from: b */
    protected final C0484a<String, Method> f5143b;

    /* renamed from: c */
    protected final C0484a<String, Class> f5144c;

    static {
        Covode.recordClassIndex(1711);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5204a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5205a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5207a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5210a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5212a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5213a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5215a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC1567a mo5218b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo5223b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo5225c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo5228c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo5230d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo5231e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract CharSequence mo5232f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract <T extends Parcelable> T mo5233g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo5234h();

    /* renamed from: a */
    public final void mo5214a(boolean z, int i) {
        mo5228c(i);
        mo5213a(z);
    }

    /* renamed from: a */
    public final void mo5211a(CharSequence charSequence, int i) {
        mo5228c(i);
        mo5210a(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final <T extends AbstractC1569c> T mo5235i() {
        String d = mo5230d();
        if (d == null) {
            return null;
        }
        return (T) m5238a(d, mo5218b());
    }

    /* renamed from: b */
    public final void mo5221b(String str) {
        mo5228c(7);
        mo5212a(str);
    }

    /* renamed from: c */
    public final <T extends AbstractC1569c> T mo5226c(T t) {
        return !mo5223b(1) ? t : (T) mo5235i();
    }

    /* renamed from: c */
    public final String mo5227c(String str) {
        if (!mo5223b(7)) {
            return str;
        }
        return mo5230d();
    }

    /* renamed from: a */
    private Method m5239a(Class cls) {
        Method method = this.f5143b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class b = m5241b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, AbstractC1567a.class);
        this.f5143b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private Class m5241b(Class<? extends AbstractC1569c> cls) {
        Class cls2 = this.f5144c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(C1764a.m5928a("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f5144c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.versionedparcelable.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private void m5242d(AbstractC1569c cVar) {
        try {
            mo5212a(m5241b((Class<? extends AbstractC1569c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    public final byte[] mo5229c(byte[] bArr) {
        if (!mo5223b(2)) {
            return bArr;
        }
        return mo5231e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5220b(AbstractC1569c cVar) {
        if (cVar == null) {
            mo5212a((String) null);
            return;
        }
        m5242d(cVar);
        AbstractC1567a b = mo5218b();
        m5240a(cVar, b);
        b.mo5204a();
    }

    /* renamed from: b */
    public final void mo5222b(byte[] bArr) {
        mo5228c(2);
        mo5215a(bArr);
    }

    /* renamed from: a */
    public final void mo5209a(AbstractC1569c cVar) {
        mo5228c(1);
        mo5220b(cVar);
    }

    /* renamed from: a */
    public final void mo5206a(int i, int i2) {
        mo5228c(i2);
        mo5205a(i);
    }

    /* renamed from: b */
    public final int mo5216b(int i, int i2) {
        if (!mo5223b(i2)) {
            return i;
        }
        return mo5225c();
    }

    /* renamed from: b */
    public final <T extends Parcelable> T mo5217b(T t, int i) {
        return !mo5223b(i) ? t : (T) mo5233g();
    }

    /* renamed from: a */
    private <T extends AbstractC1569c> T m5238a(String str, AbstractC1567a aVar) {
        try {
            Method method = this.f5142a.get(str);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(str, true, AbstractC1567a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1567a.class);
                this.f5142a.put(str, method);
            }
            return (T) ((AbstractC1569c) method.invoke(null, aVar));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw e2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    public final CharSequence mo5219b(CharSequence charSequence, int i) {
        if (!mo5223b(i)) {
            return charSequence;
        }
        return mo5232f();
    }

    /* renamed from: a */
    private <T extends AbstractC1569c> void m5240a(T t, AbstractC1567a aVar) {
        try {
            m5239a(t.getClass()).invoke(null, t, aVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw e2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    public final void mo5208a(Parcelable parcelable, int i) {
        mo5228c(i);
        mo5207a(parcelable);
    }

    /* renamed from: b */
    public final boolean mo5224b(boolean z, int i) {
        if (!mo5223b(i)) {
            return z;
        }
        return mo5234h();
    }

    public AbstractC1567a(C0484a<String, Method> aVar, C0484a<String, Method> aVar2, C0484a<String, Class> aVar3) {
        this.f5142a = aVar;
        this.f5143b = aVar2;
        this.f5144c = aVar3;
    }
}
