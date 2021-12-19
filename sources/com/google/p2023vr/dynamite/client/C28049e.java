package com.google.p2023vr.dynamite.client;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.vr.dynamite.client.e */
final class C28049e {

    /* renamed from: a */
    private Context f65815a;

    /* renamed from: b */
    private ILoadedInstanceCreator f65816b;

    /* renamed from: c */
    private final C28050f f65817c;

    static {
        Covode.recordClassIndex(33709);
    }

    public C28049e(C28050f fVar) {
        this.f65817c = fVar;
    }

    /* renamed from: a */
    public final synchronized ILoadedInstanceCreator mo47136a(Context context) {
        ILoadedInstanceCreator iLoadedInstanceCreator;
        ILoadedInstanceCreator iLoadedInstanceCreator2;
        MethodCollector.m26663i(8160);
        if (this.f65816b == null) {
            IBinder a = m56153a(mo47137b(context).getClassLoader());
            if (a == null) {
                iLoadedInstanceCreator2 = null;
            } else {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                    iLoadedInstanceCreator2 = (ILoadedInstanceCreator) queryLocalInterface;
                } else {
                    iLoadedInstanceCreator2 = new C28045a(a);
                }
            }
            this.f65816b = iLoadedInstanceCreator2;
        }
        iLoadedInstanceCreator = this.f65816b;
        MethodCollector.m26664o(8160);
        return iLoadedInstanceCreator;
    }

    /* renamed from: b */
    public final synchronized Context mo47137b(Context context) {
        Context context2;
        MethodCollector.m26663i(8608);
        if (this.f65815a == null) {
            try {
                this.f65815a = context.createPackageContext(this.f65817c.f65818a, 3);
            } catch (PackageManager.NameNotFoundException unused) {
                C28048d dVar = new C28048d();
                MethodCollector.m26664o(8608);
                throw dVar;
            }
        }
        context2 = this.f65815a;
        MethodCollector.m26664o(8608);
        return context2;
    }

    /* renamed from: a */
    private static IBinder m56153a(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e2);
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e3);
        } catch (InstantiationException e4) {
            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e4);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e5);
        }
    }
}
