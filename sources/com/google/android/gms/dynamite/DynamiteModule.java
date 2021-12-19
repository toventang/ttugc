package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.C25604f;
import com.google.android.gms.p1934b.AbstractC25324a;
import com.google.android.gms.p1934b.BinderC25327b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {

    /* renamed from: a */
    public static final AbstractC25654b f60792a = new C25661c();

    /* renamed from: b */
    public static final AbstractC25654b f60793b = new C25660b();

    /* renamed from: c */
    public static final AbstractC25654b f60794c = new C25663e();

    /* renamed from: d */
    public static final AbstractC25654b f60795d = new C25662d();

    /* renamed from: e */
    public static final AbstractC25654b f60796e = new C25665g();

    /* renamed from: g */
    private static Boolean f60797g;

    /* renamed from: h */
    private static AbstractC25668j f60798h;

    /* renamed from: i */
    private static AbstractC25670l f60799i;

    /* renamed from: j */
    private static String f60800j;

    /* renamed from: k */
    private static int f60801k = -1;

    /* renamed from: l */
    private static final ThreadLocal<C25657c> f60802l = new ThreadLocal<>();

    /* renamed from: m */
    private static final AbstractC25654b.AbstractC25656b f60803m = new C25659a();

    /* renamed from: n */
    private static final AbstractC25654b f60804n = new C25664f();

    /* renamed from: f */
    public final Context f60805f;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;

        static {
            Covode.recordClassIndex(31065);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface AbstractC25654b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public static class C25655a {

            /* renamed from: a */
            public int f60806a;

            /* renamed from: b */
            public int f60807b;

            /* renamed from: c */
            public int f60808c;

            static {
                Covode.recordClassIndex(31068);
            }
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public interface AbstractC25656b {
            static {
                Covode.recordClassIndex(31069);
            }

            /* renamed from: a */
            int mo41909a(Context context, String str);

            /* renamed from: a */
            int mo41910a(Context context, String str, boolean z);
        }

        static {
            Covode.recordClassIndex(31067);
        }

        /* renamed from: a */
        C25655a mo41908a(Context context, String str, AbstractC25656b bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    public static class C25657c {

        /* renamed from: a */
        public Cursor f60809a;

        static {
            Covode.recordClassIndex(31070);
        }

        private C25657c() {
        }

        /* synthetic */ C25657c(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static Boolean m49547a() {
        boolean z;
        Boolean valueOf;
        MethodCollector.m26663i(10390);
        synchronized (DynamiteModule.class) {
            try {
                if (f60801k >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            } finally {
                MethodCollector.m26664o(10390);
            }
        }
        return valueOf;
    }

    static {
        Covode.recordClassIndex(31064);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C25653a extends Exception {
        static {
            Covode.recordClassIndex(31066);
        }

        private C25653a(String str) {
            super(str);
        }

        /* synthetic */ C25653a(String str, byte b) {
            this(str);
        }

        private C25653a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C25653a(String str, Throwable th, byte b) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    static class C25658d implements AbstractC25654b.AbstractC25656b {

        /* renamed from: a */
        private final int f60810a;

        static {
            Covode.recordClassIndex(31071);
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.AbstractC25654b.AbstractC25656b
        /* renamed from: a */
        public final int mo41910a(Context context, String str, boolean z) {
            return 0;
        }

        public C25658d(int i) {
            this.f60810a = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.AbstractC25654b.AbstractC25656b
        /* renamed from: a */
        public final int mo41909a(Context context, String str) {
            return this.f60810a;
        }
    }

    private DynamiteModule(Context context) {
        this.f60805f = (Context) C25565r.m49314a(context);
    }

    /* renamed from: a */
    private static Context m49544a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private static void m49548a(ClassLoader classLoader) {
        AbstractC25670l lVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof AbstractC25670l) {
                    lVar = (AbstractC25670l) queryLocalInterface;
                } else {
                    lVar = new C25669k(iBinder);
                }
            }
            f60799i = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C25653a("Failed to instantiate dynamite loader", e, (byte) 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r1 != null) goto L_0x003a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.AbstractC25668j m49552b(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m49552b(android.content.Context):com.google.android.gms.dynamite.j");
    }

    /* renamed from: a */
    public final IBinder mo41907a(String str) {
        String str2;
        try {
            return (IBinder) this.f60805f.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Failed to instantiate module class: ".concat(valueOf);
            } else {
                str2 = new String("Failed to instantiate module class: ");
            }
            throw new C25653a(str2, e, (byte) 0);
        }
    }

    /* renamed from: b */
    private static DynamiteModule m49550b(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(m49544a(context));
    }

    /* renamed from: a */
    public static int m49542a(Context context, String str) {
        try {
            Class<?> loadClass = m49544a(context).getClassLoader().loadClass(new StringBuilder(String.valueOf(str).length() + 61).append("com.google.android.gms.dynamite.descriptors.").append(str).append(".ModuleDescriptor").toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(String.valueOf(declaredField.get(null))).length();
            String.valueOf(str).length();
            return 0;
        } catch (ClassNotFoundException unused) {
            String.valueOf(str).length();
            return 0;
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf);
            } else {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    /* renamed from: b */
    private static int m49549b(Context context, String str, boolean z) {
        AbstractC25668j b = m49552b(context);
        if (b == null) {
            return 0;
        }
        try {
            if (b.mo41912a() >= 2) {
                return b.mo41915b(BinderC25327b.m48694a(context), str, z);
            }
            return b.mo41913a(BinderC25327b.m48694a(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to retrieve remote module version: ".concat(valueOf);
            } else {
                new String("Failed to retrieve remote module version: ");
            }
            return 0;
        }
    }

    /* renamed from: b */
    private static DynamiteModule m49551b(Context context, String str, int i) {
        AbstractC25670l lVar;
        AbstractC25324a a;
        MethodCollector.m26663i(10238);
        String.valueOf(str).length();
        synchronized (DynamiteModule.class) {
            try {
                lVar = f60799i;
            } catch (Throwable th) {
                MethodCollector.m26664o(10238);
                throw th;
            }
        }
        if (lVar != null) {
            C25657c cVar = f60802l.get();
            if (cVar == null || cVar.f60809a == null) {
                C25653a aVar = new C25653a("No result cursor", (byte) 0);
                MethodCollector.m26664o(10238);
                throw aVar;
            }
            Context a2 = m49544a(context);
            Cursor cursor = cVar.f60809a;
            BinderC25327b.m48694a((Object) null);
            if (m49547a().booleanValue()) {
                a = lVar.mo41918b(BinderC25327b.m48694a(a2), str, i, BinderC25327b.m48694a(cursor));
            } else {
                a = lVar.mo41917a(BinderC25327b.m48694a(a2), str, i, BinderC25327b.m48694a(cursor));
            }
            Context context2 = (Context) BinderC25327b.m48695a(a);
            if (context2 != null) {
                DynamiteModule dynamiteModule = new DynamiteModule(context2);
                MethodCollector.m26664o(10238);
                return dynamiteModule;
            }
            C25653a aVar2 = new C25653a("Failed to get module context", (byte) 0);
            MethodCollector.m26664o(10238);
            throw aVar2;
        }
        C25653a aVar3 = new C25653a("DynamiteLoaderV2 was not cached.", (byte) 0);
        MethodCollector.m26664o(10238);
        throw aVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4 A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m49553c(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m49553c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    public static int m49543a(Context context, String str, boolean z) {
        ClassLoader hVar;
        MethodCollector.m26663i(8998);
        try {
            synchronized (DynamiteModule.class) {
                try {
                    Boolean bool = f60797g;
                    if (bool == null) {
                        try {
                            Class<?> loadClass = m49544a(context).getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                            Field declaredField = loadClass.getDeclaredField("sClassLoader");
                            synchronized (loadClass) {
                                try {
                                    ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                    if (classLoader != null) {
                                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                m49548a(classLoader);
                                            } catch (C25653a unused) {
                                            }
                                            bool = Boolean.TRUE;
                                        }
                                    } else if ("com.google.android.gms".equals(m49544a(context).getPackageName())) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int c = m49553c(context, str, z);
                                            String str2 = f60800j;
                                            if (str2 != null) {
                                                if (!str2.isEmpty()) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        hVar = new DelegateLastClassLoader(f60800j, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        hVar = new C25666h(f60800j, ClassLoader.getSystemClassLoader());
                                                    }
                                                    m49548a(hVar);
                                                    declaredField.set(null, hVar);
                                                    f60797g = Boolean.TRUE;
                                                    MethodCollector.m26664o(8998);
                                                    return c;
                                                }
                                            }
                                            return c;
                                        } catch (C25653a unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                            f60797g = bool;
                                            if (bool.booleanValue()) {
                                                try {
                                                    int c2 = m49553c(context, str, z);
                                                    MethodCollector.m26664o(8998);
                                                    return c2;
                                                } catch (C25653a e) {
                                                    String valueOf = String.valueOf(e.getMessage());
                                                    if (valueOf.length() != 0) {
                                                        "Failed to retrieve remote module version: ".concat(valueOf);
                                                    } else {
                                                        new String("Failed to retrieve remote module version: ");
                                                    }
                                                    MethodCollector.m26664o(8998);
                                                    return 0;
                                                }
                                            } else {
                                                int b = m49549b(context, str, z);
                                                MethodCollector.m26664o(8998);
                                                return b;
                                            }
                                        }
                                    }
                                } finally {
                                    MethodCollector.m26664o(8998);
                                }
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                            String.valueOf(String.valueOf(e2)).length();
                            bool = Boolean.FALSE;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(8998);
                }
            }
        } catch (Throwable th) {
            C25604f.m49410a(context, th);
            MethodCollector.m26664o(8998);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static DynamiteModule m49545a(Context context, AbstractC25654b bVar, String str) {
        ThreadLocal<C25657c> threadLocal = f60802l;
        C25657c cVar = threadLocal.get();
        C25657c cVar2 = new C25657c((byte) 0);
        threadLocal.set(cVar2);
        try {
            AbstractC25654b.C25655a a = bVar.mo41908a(context, str, f60803m);
            String.valueOf(str).length();
            String.valueOf(str).length();
            if (a.f60808c == 0 || ((a.f60808c == -1 && a.f60806a == 0) || (a.f60808c == 1 && a.f60807b == 0))) {
                int i = a.f60806a;
                throw new C25653a(new StringBuilder(91).append("No acceptable module found. Local version is ").append(i).append(" and remote version is ").append(a.f60807b).append(".").toString(), (byte) 0);
            } else if (a.f60808c == -1) {
                DynamiteModule b = m49550b(context, str);
                if (cVar2.f60809a != null) {
                    cVar2.f60809a.close();
                }
                threadLocal.set(cVar);
                return b;
            } else if (a.f60808c == 1) {
                try {
                    DynamiteModule a2 = m49546a(context, str, a.f60807b);
                    if (cVar2.f60809a != null) {
                        cVar2.f60809a.close();
                    }
                    threadLocal.set(cVar);
                    return a2;
                } catch (C25653a e) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Failed to load remote module: ".concat(valueOf);
                    } else {
                        new String("Failed to load remote module: ");
                    }
                    if (a.f60806a == 0 || bVar.mo41908a(context, str, new C25658d(a.f60806a)).f60808c != -1) {
                        throw new C25653a("Remote load failed. No local fallback found.", e, (byte) 0);
                    }
                    DynamiteModule b2 = m49550b(context, str);
                    if (cVar2.f60809a != null) {
                        cVar2.f60809a.close();
                    }
                    f60802l.set(cVar);
                    return b2;
                }
            } else {
                throw new C25653a(new StringBuilder(47).append("VersionPolicy returned invalid code:").append(a.f60808c).toString(), (byte) 0);
            }
        } catch (Throwable th) {
            if (cVar2.f60809a != null) {
                cVar2.f60809a.close();
            }
            f60802l.set(cVar);
            throw th;
        }
    }

    /* renamed from: a */
    private static DynamiteModule m49546a(Context context, String str, int i) {
        Boolean bool;
        AbstractC25324a a;
        MethodCollector.m26663i(9153);
        try {
            synchronized (DynamiteModule.class) {
                try {
                    bool = f60797g;
                } finally {
                    MethodCollector.m26664o(9153);
                }
            }
            if (bool == null) {
                C25653a aVar = new C25653a("Failed to determine which loading route to use.", (byte) 0);
                MethodCollector.m26664o(9153);
                throw aVar;
            } else if (bool.booleanValue()) {
                DynamiteModule b = m49551b(context, str, i);
                MethodCollector.m26664o(9153);
                return b;
            } else {
                String.valueOf(str).length();
                AbstractC25668j b2 = m49552b(context);
                if (b2 != null) {
                    if (b2.mo41912a() >= 2) {
                        a = b2.mo41916b(BinderC25327b.m48694a(context), str, i);
                    } else {
                        a = b2.mo41914a(BinderC25327b.m48694a(context), str, i);
                    }
                    if (BinderC25327b.m48695a(a) != null) {
                        return new DynamiteModule((Context) BinderC25327b.m48695a(a));
                    }
                    C25653a aVar2 = new C25653a("Failed to load remote module.", (byte) 0);
                    MethodCollector.m26664o(9153);
                    throw aVar2;
                }
                C25653a aVar3 = new C25653a("Failed to create IDynamiteLoader.", (byte) 0);
                MethodCollector.m26664o(9153);
                throw aVar3;
            }
        } catch (RemoteException e) {
            C25653a aVar4 = new C25653a("Failed to load remote module.", e, (byte) 0);
            MethodCollector.m26664o(9153);
            throw aVar4;
        } catch (C25653a e2) {
            MethodCollector.m26664o(9153);
            throw e2;
        } catch (Throwable th) {
            C25604f.m49410a(context, th);
            C25653a aVar5 = new C25653a("Failed to load remote module.", th, (byte) 0);
            MethodCollector.m26664o(9153);
            throw aVar5;
        }
    }
}
