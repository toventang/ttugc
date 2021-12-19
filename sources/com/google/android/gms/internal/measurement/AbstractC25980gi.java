package com.google.android.gms.internal.measurement;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25965fv;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.gi */
public abstract class AbstractC25980gi<T extends C25965fv> {

    /* renamed from: a */
    private static final Logger f61237a = Logger.getLogger(AbstractC25958fq.class.getName());

    /* renamed from: b */
    private static String f61238b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo42613a();

    AbstractC25980gi() {
    }

    static {
        Covode.recordClassIndex(31395);
    }

    /* renamed from: a */
    static <T extends C25965fv> T m50553a(Class<T> cls) {
        String str;
        String str2;
        ClassLoader classLoader = AbstractC25980gi.class.getClassLoader();
        if (cls.equals(C25965fv.class)) {
            str = f61238b;
        } else if (cls.getPackage().equals(AbstractC25980gi.class.getPackage())) {
            str = C1764a.m5928a("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                return cls.cast(((AbstractC25980gi) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo42613a());
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException(e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC25980gi.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC25980gi) it.next()).mo42613a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f61237a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    if (valueOf.length() != 0) {
                        str2 = "Unable to load ".concat(valueOf);
                    } else {
                        str2 = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) ((C25965fv) arrayList.get(0));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) ((C25965fv) cls.getMethod("combine", Collection.class).invoke(null, arrayList));
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
