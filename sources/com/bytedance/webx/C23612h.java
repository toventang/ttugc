package com.bytedance.webx;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.AbstractC23568e;
import com.bytedance.webx.p1750a.C23549a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.webx.h */
public class C23612h {

    /* renamed from: a */
    public static C23615b f55874a;

    /* renamed from: i */
    private static Context f55875i;

    /* renamed from: j */
    private static Map<String, List<Pair<Class<? extends AbstractC23605f>, AbstractC23617d>>> f55876j = new HashMap();

    /* renamed from: k */
    private static Map<String, Map<Class<? extends AbstractC23605f>, C23612h>> f55877k = new HashMap();

    /* renamed from: b */
    public String f55878b;

    /* renamed from: c */
    public Class<? extends AbstractC23605f> f55879c;

    /* renamed from: d */
    public LinkedHashSet<Class<? extends AbstractC23547a>> f55880d;

    /* renamed from: e */
    public LinkedHashSet<Class<? extends AbstractC23547a>> f55881e;

    /* renamed from: f */
    public LinkedHashSet<AbstractC23616c> f55882f;

    /* renamed from: g */
    public HashMap<Class<? extends AbstractC23547a>, LinkedHashSet<AbstractC23616c>> f55883g;

    /* renamed from: h */
    public HashSet<C23549a.C23551b> f55884h;

    /* renamed from: com.bytedance.webx.h$b */
    public static class C23615b {

        /* renamed from: a */
        public boolean f55890a;

        static {
            Covode.recordClassIndex(27714);
        }
    }

    /* renamed from: com.bytedance.webx.h$c */
    public interface AbstractC23616c {
        static {
            Covode.recordClassIndex(27715);
        }

        /* renamed from: a */
        void mo34738a(AbstractC23547a aVar);
    }

    /* renamed from: com.bytedance.webx.h$d */
    public static abstract class AbstractC23617d {

        /* renamed from: b */
        public Class f55891b;

        static {
            Covode.recordClassIndex(27716);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo26815a(C23613a aVar);
    }

    static {
        Covode.recordClassIndex(27711);
    }

    /* renamed from: com.bytedance.webx.h$a */
    public static class C23613a {

        /* renamed from: a */
        LinkedHashSet<Class<? extends AbstractC23547a>> f55885a = new LinkedHashSet<>();

        /* renamed from: b */
        LinkedHashSet<Class<? extends AbstractC23547a>> f55886b = new LinkedHashSet<>();

        /* renamed from: c */
        LinkedHashSet<AbstractC23616c> f55887c = new LinkedHashSet<>();

        /* renamed from: d */
        HashMap<Class<? extends AbstractC23547a>, LinkedHashSet<AbstractC23616c>> f55888d = new HashMap<>();

        /* renamed from: e */
        HashSet<C23549a.C23551b> f55889e = new HashSet<>();

        /* renamed from: com.bytedance.webx.h$a$a */
        public interface AbstractC23614a {
            static {
                Covode.recordClassIndex(27713);
            }

            /* renamed from: a */
            String mo38634a();
        }

        static {
            Covode.recordClassIndex(27712);
        }

        /* renamed from: a */
        public final C23613a mo39036a(Class<? extends AbstractC23547a> cls) {
            LinkedHashSet<Class<? extends AbstractC23547a>> linkedHashSet;
            if (AbstractC23568e.AbstractC23570b.class.isAssignableFrom(cls)) {
                linkedHashSet = this.f55885a;
            } else if (AbstractC23568e.AbstractC23569a.class.isAssignableFrom(cls)) {
                linkedHashSet = this.f55886b;
            } else {
                throw new Error();
            }
            linkedHashSet.add(cls);
            return this;
        }
    }

    /* renamed from: a */
    public static void m44649a(Context context) {
        if (f55875i == null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            f55875i = applicationContext;
            f55874a = new C23615b();
        }
    }

    /* renamed from: a */
    public static C23612h m44648a(String str, Class<? extends AbstractC23605f> cls) {
        MethodCollector.m26663i(5239);
        Map<Class<? extends AbstractC23605f>, C23612h> map = f55877k.get(str);
        if (map == null) {
            synchronized (C23612h.class) {
                try {
                    map = f55877k.get(str);
                    if (map == null) {
                        map = new Hashtable<>();
                        f55877k.put(str, map);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5239);
                    throw th;
                }
            }
        }
        C23612h hVar = map.get(cls);
        if (hVar != null) {
            MethodCollector.m26664o(5239);
            return hVar;
        }
        synchronized (C23612h.class) {
            try {
                C23612h hVar2 = map.get(cls);
                if (hVar2 != null) {
                    return hVar2;
                }
                C23613a aVar = new C23613a();
                List<Pair<Class<? extends AbstractC23605f>, AbstractC23617d>> list = f55876j.get(str);
                if (list == null) {
                    MethodCollector.m26664o(5239);
                    return null;
                }
                for (Pair<Class<? extends AbstractC23605f>, AbstractC23617d> pair : list) {
                    if (((Class) pair.first).equals(cls)) {
                        AbstractC23617d dVar = (AbstractC23617d) pair.second;
                        dVar.f55891b = cls;
                        dVar.mo26815a(aVar);
                        dVar.f55891b = null;
                    }
                }
                C23612h hVar3 = new C23612h(str, cls, aVar.f55885a, aVar.f55886b, (byte) 0);
                hVar3.f55882f = aVar.f55887c;
                hVar3.f55883g = aVar.f55888d;
                hVar3.f55884h = aVar.f55889e;
                map.put(cls, hVar3);
                MethodCollector.m26664o(5239);
                return hVar3;
            } finally {
                MethodCollector.m26664o(5239);
            }
        }
    }

    /* renamed from: a */
    public static <T extends AbstractC23605f> void m44650a(String str, Class<T> cls, AbstractC23617d dVar) {
        MethodCollector.m26663i(5182);
        List<Pair<Class<? extends AbstractC23605f>, AbstractC23617d>> list = f55876j.get(str);
        if (list == null) {
            synchronized (C23612h.class) {
                try {
                    list = f55876j.get(str);
                    if (list == null) {
                        list = new ArrayList<>();
                        f55876j.put(str, list);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5182);
                    throw th;
                }
            }
        }
        Pair<Class<? extends AbstractC23605f>, AbstractC23617d> pair = new Pair<>(cls, dVar);
        synchronized (C23612h.class) {
            try {
                list.add(pair);
            } finally {
                MethodCollector.m26664o(5182);
            }
        }
    }

    private <T extends AbstractC23605f> C23612h(String str, Class<T> cls, LinkedHashSet<Class<? extends AbstractC23547a>> linkedHashSet, LinkedHashSet<Class<? extends AbstractC23547a>> linkedHashSet2) {
        this.f55878b = str;
        this.f55879c = cls;
        this.f55880d = linkedHashSet;
        this.f55881e = linkedHashSet2;
    }

    private /* synthetic */ C23612h(String str, Class cls, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, byte b) {
        this(str, cls, linkedHashSet, linkedHashSet2);
    }
}
