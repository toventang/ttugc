package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.backends.k */
final class C25137k implements AbstractC25129e {

    /* renamed from: a */
    private final C25138a f59569a;

    /* renamed from: b */
    private final C25135i f59570b;

    /* renamed from: c */
    private final Map<String, AbstractC25140m> f59571c;

    static {
        Covode.recordClassIndex(30503);
    }

    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    static class C25138a {

        /* renamed from: a */
        private final Context f59572a;

        /* renamed from: b */
        private Map<String, String> f59573b;

        static {
            Covode.recordClassIndex(30504);
        }

        C25138a(Context context) {
            this.f59572a = context;
        }

        /* renamed from: a */
        private static Bundle m48201a(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC25128d mo41118a(String str) {
            Map<String, String> hashMap;
            if (this.f59573b == null) {
                Bundle a = m48201a(this.f59572a);
                if (a == null) {
                    hashMap = Collections.emptyMap();
                } else {
                    hashMap = new HashMap<>();
                    for (String str2 : a.keySet()) {
                        Object a2 = m48202a(a, str2);
                        if ((a2 instanceof String) && str2.startsWith("backend:")) {
                            String[] split = ((String) a2).split(",", -1);
                            for (String str3 : split) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                }
                this.f59573b = hashMap;
            }
            String str4 = this.f59573b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (AbstractC25128d) Class.forName(str4).asSubclass(AbstractC25128d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                C1764a.m5928a("Class %s is not found.", new Object[]{str4});
                return null;
            } catch (IllegalAccessException unused2) {
                C1764a.m5928a("Could not instantiate %s.", new Object[]{str4});
                return null;
            } catch (InstantiationException unused3) {
                C1764a.m5928a("Could not instantiate %s.", new Object[]{str4});
                return null;
            } catch (NoSuchMethodException unused4) {
                C1764a.m5928a("Could not instantiate %s", new Object[]{str4});
                return null;
            } catch (InvocationTargetException unused5) {
                C1764a.m5928a("Could not instantiate %s", new Object[]{str4});
                return null;
            }
        }

        /* renamed from: a */
        private static Object m48202a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25129e
    /* renamed from: a */
    public final synchronized AbstractC25140m mo41117a(String str) {
        MethodCollector.m26663i(3195);
        if (this.f59571c.containsKey(str)) {
            AbstractC25140m mVar = this.f59571c.get(str);
            MethodCollector.m26664o(3195);
            return mVar;
        }
        AbstractC25128d a = this.f59569a.mo41118a(str);
        if (a == null) {
            MethodCollector.m26664o(3195);
            return null;
        }
        C25135i iVar = this.f59570b;
        AbstractC25140m create = a.create(new C25127c(iVar.f59563a, iVar.f59564b, iVar.f59565c, str));
        this.f59571c.put(str, create);
        MethodCollector.m26664o(3195);
        return create;
    }

    C25137k(Context context, C25135i iVar) {
        this(new C25138a(context), iVar);
    }

    private C25137k(C25138a aVar, C25135i iVar) {
        this.f59571c = new HashMap();
        this.f59569a = aVar;
        this.f59570b = iVar;
    }
}
