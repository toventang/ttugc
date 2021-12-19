package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.settings.p1601a.AbstractC21888a;
import com.bytedance.push.settings.storage.AbstractC21912i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.settings.f */
public final class C21893f {

    /* renamed from: a */
    private final ConcurrentHashMap<Class<? extends ILocalSettings>, ILocalSettings> f51856a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final AbstractC21896i f51857b;

    static {
        Covode.recordClassIndex(25556);
    }

    C21893f(AbstractC21896i iVar) {
        this.f51857b = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T extends ILocalSettings> T mo35618a(Context context, Class<T> cls) {
        MethodCollector.m26663i(12943);
        ILocalSettings iLocalSettings = (T) this.f51856a.get(cls);
        if (iLocalSettings == null) {
            synchronized (this) {
                try {
                    iLocalSettings = this.f51856a.get(cls);
                    if (iLocalSettings == null) {
                        iLocalSettings = (T) m41116b(context, cls);
                        this.f51856a.put(cls, iLocalSettings);
                    }
                } finally {
                    MethodCollector.m26664o(12943);
                }
            }
        }
        return iLocalSettings;
    }

    /* renamed from: b */
    private <T extends ILocalSettings> T m41116b(Context context, Class<T> cls) {
        AbstractC21896i iVar = this.f51857b;
        try {
            Constructor<?> constructor = Class.forName(cls.getName() + "$$SettingImpl", true, cls.getClassLoader()).getConstructor(Context.class, AbstractC21912i.class);
            AbstractC21888a aVar = (AbstractC21888a) cls.getAnnotation(AbstractC21888a.class);
            if (aVar != null) {
                String a = aVar.mo35616a();
                return (T) ((ILocalSettings) constructor.newInstance(context, iVar.mo35620a(context, aVar.mo35617b(), a)));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }
}
