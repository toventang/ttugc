package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.settings.p1601a.AbstractC21888a;
import com.bytedance.push.settings.storage.AbstractC21912i;
import com.bytedance.push.settings.storage.C21911h;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.settings.g */
public final class C21894g {

    /* renamed from: a */
    private final ConcurrentHashMap<Class<? extends ISettings>, ISettings> f51858a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<Class<? extends ISettings>, Object> f51859b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25557);
    }

    C21894g() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.ClassNotFoundException */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.NoSuchMethodException */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.IllegalAccessException */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.reflect.InvocationTargetException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static <T extends ISettings> T m41118b(Context context, Class<T> cls) {
        C21911h hVar = C21895h.f51860a;
        InstantiationException instantiationException = null;
        try {
            AbstractC21888a aVar = (AbstractC21888a) cls.getAnnotation(AbstractC21888a.class);
            if (aVar != null) {
                AbstractC21912i a = hVar.mo35620a(context, aVar.mo35617b(), aVar.mo35616a());
                T t = (T) ((ISettings) Class.forName(cls.getName() + "$$SettingImpl", true, cls.getClassLoader()).getConstructor(AbstractC21912i.class).newInstance(a));
                t.updateSettings(context, null);
                return t;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            instantiationException = e;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            instantiationException = e2;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            instantiationException = e3;
        } catch (InstantiationException e4) {
            e4.printStackTrace();
            instantiationException = e4;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            instantiationException = e5;
        }
        if (instantiationException != null) {
            throw new IllegalStateException("get settings instance error，please check warning log", instantiationException);
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }

    /* renamed from: a */
    public final <T extends ISettings> T mo35619a(Context context, Class<T> cls) {
        Object obj;
        MethodCollector.m26663i(9443);
        ISettings iSettings = (T) this.f51858a.get(cls);
        if (iSettings == null) {
            synchronized (this.f51859b) {
                try {
                    if (!this.f51859b.containsKey(cls) || (obj = this.f51859b.get(cls)) == null) {
                        obj = new Object();
                        this.f51859b.put(cls, obj);
                    }
                } finally {
                    MethodCollector.m26664o(9443);
                }
            }
            synchronized (obj) {
                try {
                    iSettings = this.f51858a.get(cls);
                    if (iSettings == null && (iSettings = (T) m41118b(context, cls)) != null) {
                        this.f51858a.put(cls, iSettings);
                    }
                } finally {
                    MethodCollector.m26664o(9443);
                }
            }
        } else if (this.f51859b.containsKey(cls)) {
            this.f51859b.remove(cls);
        }
        return iSettings;
    }
}
