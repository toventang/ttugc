package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C89641g {

    /* renamed from: a */
    public static final C89641g f203379a = new C89641g();

    private C89641g() {
    }

    static {
        Covode.recordClassIndex(105734);
    }

    /* renamed from: a */
    public static List<MainDispatcherFactory> m155578a() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!C89642h.f203380a) {
            return m155580a(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return m155580a(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    /* renamed from: a */
    private static List<String> m155579a(BufferedReader bufferedReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C89070n.m154590j(linkedHashSet);
            }
            String str = C89361p.m154914b(readLine, "#", readLine);
            if (str != null) {
                String obj = C89361p.m154910b((CharSequence) str).toString();
                for (int i = 0; i < obj.length(); i++) {
                    char charAt = obj.charAt(i);
                    if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                        throw new IllegalArgumentException("Illegal service provider class name: ".concat(String.valueOf(obj)).toString());
                    }
                }
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
        */
    /* renamed from: a */
    private static java.util.List<java.lang.String> m155581a(java.net.URL r6) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C89641g.m155581a(java.net.URL):java.util.List");
    }

    /* renamed from: a */
    private static <S> List<S> m155580a(Class<S> cls, ClassLoader classLoader) {
        try {
            ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
            C89219l.m154709a((Object) list, "");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                C89070n.m154535a((Collection) arrayList, (Iterable) m155581a(url));
            }
            Set<String> l = C89070n.m154592l(arrayList);
            if (!l.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a(l, 10));
                for (String str : l) {
                    Class<?> cls2 = Class.forName(str, false, classLoader);
                    if (cls.isAssignableFrom(cls2)) {
                        arrayList2.add(cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                    } else {
                        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
                    }
                }
                return arrayList2;
            }
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        } catch (Throwable unused) {
            return C89070n.m154590j(ServiceLoader.load(cls, classLoader));
        }
    }
}
