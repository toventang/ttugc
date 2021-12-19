package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
public final class C27715f<T> {

    /* renamed from: a */
    public final T f65140a;

    /* renamed from: b */
    public final AbstractC27717b<T> f65141b;

    /* renamed from: com.google.firebase.components.f$b */
    public interface AbstractC27717b<T> {
        static {
            Covode.recordClassIndex(33300);
        }

        /* renamed from: a */
        List<String> mo46360a(T t);
    }

    static {
        Covode.recordClassIndex(33298);
    }

    /* renamed from: com.google.firebase.components.f$a */
    public static class C27716a implements AbstractC27717b<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f65142a;

        static {
            Covode.recordClassIndex(33299);
        }

        private C27716a(Class<? extends Service> cls) {
            this.f65142a = cls;
        }

        /* renamed from: a */
        private Bundle m55424a(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f65142a), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.firebase.components.C27715f.AbstractC27717b
        /* renamed from: a */
        public final /* synthetic */ List mo46360a(Context context) {
            Bundle a = m55424a(context);
            if (a == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : a.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m55425a(a, str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public /* synthetic */ C27716a(Class cls, byte b) {
            this(cls);
        }

        /* renamed from: a */
        private static Object m55425a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static List<AbstractC27719h> m55423a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                Class<?> cls = Class.forName(str);
                if (!AbstractC27719h.class.isAssignableFrom(cls)) {
                    C1764a.m5928a("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"});
                } else {
                    arrayList.add(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException unused) {
                C1764a.m5928a("Class %s is not an found.", new Object[]{str});
            } catch (IllegalAccessException unused2) {
                C1764a.m5928a("Could not instantiate %s.", new Object[]{str});
            } catch (InstantiationException unused3) {
                C1764a.m5928a("Could not instantiate %s.", new Object[]{str});
            } catch (NoSuchMethodException unused4) {
                C1764a.m5928a("Could not instantiate %s", new Object[]{str});
            } catch (InvocationTargetException unused5) {
                C1764a.m5928a("Could not instantiate %s", new Object[]{str});
            }
        }
        return arrayList;
    }

    public C27715f(T t, AbstractC27717b<T> bVar) {
        this.f65140a = t;
        this.f65141b = bVar;
    }
}
