package com.ttnet.org.chromium.net;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87536c;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* renamed from: com.ttnet.org.chromium.net.e */
public abstract class AbstractC87541e {

    /* renamed from: b */
    private static final String f198619b = AbstractC87541e.class.getSimpleName();

    /* renamed from: a */
    protected final Context f198620a;

    /* renamed from: a */
    public abstract AbstractC87536c.C87537a mo141739a();

    /* renamed from: b */
    public abstract String mo141740b();

    /* renamed from: c */
    public abstract String mo141741c();

    static {
        Covode.recordClassIndex(103506);
    }

    public String toString() {
        return "[class=" + getClass().getName() + ", name=" + mo141740b() + ", version=" + mo141741c() + ", enabled=true]";
    }

    public AbstractC87541e(Context context) {
        if (context != null) {
            this.f198620a = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.Set<com.ttnet.org.chromium.net.e> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static boolean m152001a(Context context, String str, Set<AbstractC87541e> set) {
        try {
            set.add(context.getClassLoader().loadClass(str).asSubclass(AbstractC87541e.class).getConstructor(Context.class).newInstance(context));
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
