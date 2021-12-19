package org.greenrobot.eventbus;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.AbstractC90255l;
import org.greenrobot.eventbus.AbstractC90258m;
import org.greenrobot.eventbus.p4664a.C90242a;

public class EventBus {
    private static final C90246c DEFAULT_BUILDER = new C90246c();

    /* renamed from: a */
    public static String f204976a = "EventBus";

    /* renamed from: b */
    static volatile EventBus f204977b;

    /* renamed from: c */
    public static boolean f204978c = false;

    /* renamed from: d */
    public static boolean f204979d = false;

    /* renamed from: e */
    public static AbstractC90254k<ExecutorService> f204980e = new AbstractC90254k<ExecutorService>() {
        /* class org.greenrobot.eventbus.EventBus.C902371 */

        static {
            Covode.recordClassIndex(106507);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.greenrobot.eventbus.AbstractC90254k
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ ExecutorService mo145401a() {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = 1;
            return C40780g.m82242a(a.mo70028a());
        }
    };
    private static final Map<Class<?>, List<Class<?>>> eventTypesCache = new HashMap();

    /* renamed from: f */
    public static AbstractC90248e f204981f = null;
    private final RunnableC90241a asyncPoster;
    private final RunnableC90243b backgroundPoster;
    private final ThreadLocal<C90240a> currentPostingThreadState;
    private final boolean eventInheritance;

    /* renamed from: g */
    public final ExecutorService f204982g;

    /* renamed from: h */
    public ExecutorService f204983h;

    /* renamed from: i */
    public final AbstractC90255l f204984i;
    private final int indexCount;
    private final boolean logNoSubscriberMessages;
    private final boolean logSubscriberExceptions;
    private final AbstractC90263q mainThreadPoster;
    private final AbstractC90258m mainThreadSupport;
    private final boolean sendNoSubscriberEvent;
    private final boolean sendSubscriberExceptionEvent;
    private final Map<Class<?>, Object> stickyEvents;
    private final C90267u subscriberMethodFinder;
    private final Map<Class<?>, CopyOnWriteArrayList<C90269v>> subscriptionsByEventType;
    private final boolean throwSubscriberException;
    private final Map<Object, List<Class<?>>> typesBySubscriber;

    /* renamed from: a */
    public final synchronized boolean mo145393a(Object obj) {
        boolean containsKey;
        MethodCollector.m26663i(9861);
        containsKey = this.typesBySubscriber.containsKey(obj);
        MethodCollector.m26664o(9861);
        return containsKey;
    }

    /* renamed from: a */
    public final <T> T mo145391a(Class<T> cls) {
        T cast;
        MethodCollector.m26663i(10335);
        synchronized (this.stickyEvents) {
            try {
                cast = cls.cast(this.stickyEvents.get(cls));
            } finally {
                MethodCollector.m26664o(10335);
            }
        }
        return cast;
    }

    /* renamed from: a */
    private boolean m156970a(Object obj, C90240a aVar, Class<?> cls) {
        CopyOnWriteArrayList<C90269v> copyOnWriteArrayList;
        MethodCollector.m26663i(10788);
        synchronized (this) {
            try {
                copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
            } catch (Throwable th) {
                MethodCollector.m26664o(10788);
                throw th;
            }
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            MethodCollector.m26664o(10788);
            return false;
        }
        aVar.f204990d += copyOnWriteArrayList.size();
        Iterator<C90269v> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C90269v next = it.next();
            aVar.f204992f = obj;
            aVar.f204991e = next;
            try {
                m156969a(next, obj, aVar.f204989c);
                boolean z = aVar.f204993g;
                aVar.f204992f = null;
                aVar.f204991e = null;
                aVar.f204993g = false;
                if (z) {
                    break;
                }
            } catch (Throwable th2) {
                aVar.f204992f = null;
                aVar.f204991e = null;
                aVar.f204993g = false;
                MethodCollector.m26664o(10788);
                throw th2;
            }
        }
        MethodCollector.m26664o(10788);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo145392a(C90261o oVar) {
        Object obj = oVar.f205028a;
        C90269v vVar = oVar.f205029b;
        C90261o.m157009a(oVar);
        if (vVar.f205059c) {
            m156971b(vVar, obj);
        }
    }

    public EventBus() {
        this(DEFAULT_BUILDER);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.greenrobot.eventbus.EventBus$a */
    public static final class C90240a {

        /* renamed from: a */
        final List<Object> f204987a = new ArrayList();

        /* renamed from: b */
        boolean f204988b;

        /* renamed from: c */
        boolean f204989c;

        /* renamed from: d */
        int f204990d;

        /* renamed from: e */
        C90269v f204991e;

        /* renamed from: f */
        Object f204992f;

        /* renamed from: g */
        boolean f204993g;

        static {
            Covode.recordClassIndex(106510);
        }

        C90240a() {
        }
    }

    /* renamed from: b */
    private boolean m156972b() {
        AbstractC90258m mVar = this.mainThreadSupport;
        if (mVar == null || mVar.mo145418a()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(106506);
    }

    /* renamed from: a */
    public static EventBus m156962a() {
        MethodCollector.m26663i(9419);
        EventBus eventBus = f204977b;
        if (eventBus == null) {
            synchronized (EventBus.class) {
                try {
                    eventBus = f204977b;
                    if (eventBus == null) {
                        eventBus = new EventBus();
                        f204977b = eventBus;
                    }
                } finally {
                    MethodCollector.m26664o(9419);
                }
            }
        }
        return eventBus;
    }

    public String toString() {
        return "EventBus[indexCount=" + this.indexCount + ", eventInheritance=" + this.eventInheritance + "]";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.greenrobot.eventbus.EventBus$3 */
    public static /* synthetic */ class C902393 {

        /* renamed from: a */
        static final /* synthetic */ int[] f204986a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 106509(0x1a00d, float:1.49251E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.greenrobot.eventbus.ThreadMode[] r0 = org.greenrobot.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.greenrobot.eventbus.EventBus.C902393.f204986a = r2
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.greenrobot.eventbus.EventBus.C902393.f204986a     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = org.greenrobot.eventbus.EventBus.C902393.f204986a     // Catch:{ NoSuchFieldError -> 0x002e }
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = org.greenrobot.eventbus.EventBus.C902393.f204986a     // Catch:{ NoSuchFieldError -> 0x0039 }
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = org.greenrobot.eventbus.EventBus.C902393.f204986a     // Catch:{ NoSuchFieldError -> 0x0044 }
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.C902393.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final <T> T mo145394b(Class<T> cls) {
        T cast;
        MethodCollector.m26663i(10336);
        synchronized (this.stickyEvents) {
            try {
                cast = cls.cast(this.stickyEvents.remove(cls));
            } finally {
                MethodCollector.m26664o(10336);
            }
        }
        return cast;
    }

    /* renamed from: e */
    public final void mo145398e(Object obj) {
        MethodCollector.m26663i(10169);
        synchronized (this.stickyEvents) {
            try {
                this.stickyEvents.put(obj.getClass(), obj);
            } catch (Throwable th) {
                MethodCollector.m26664o(10169);
                throw th;
            }
        }
        mo145396c(obj);
        MethodCollector.m26664o(10169);
    }

    /* renamed from: c */
    public static List<Class<?>> m156973c(Class<?> cls) {
        List<Class<?>> list;
        MethodCollector.m26663i(11080);
        Map<Class<?>, List<Class<?>>> map = eventTypesCache;
        synchronized (map) {
            try {
                list = map.get(cls);
                if (list == null) {
                    list = new ArrayList<>();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        list.add(cls2);
                        m156965a(list, cls2.getInterfaces());
                    }
                    eventTypesCache.put(cls, list);
                }
            } finally {
                MethodCollector.m26664o(11080);
            }
        }
        return list;
    }

    /* renamed from: d */
    public final void mo145397d(Object obj) {
        C90240a aVar = this.currentPostingThreadState.get();
        if (!aVar.f204988b) {
            throw new C90247d("This method may only be called from inside event handling methods on the posting thread");
        } else if (obj == null) {
            throw new C90247d("Event may not be null");
        } else if (aVar.f204992f != obj) {
            throw new C90247d("Only the currently handled event may be aborted");
        } else if (aVar.f204991e.f205058b.f205038d == ThreadMode.POSTING) {
            aVar.f204993g = true;
        } else {
            throw new C90247d(" event handlers may only abort the incoming event");
        }
    }

    /* renamed from: f */
    public final boolean mo145399f(Object obj) {
        MethodCollector.m26663i(10642);
        synchronized (this.stickyEvents) {
            try {
                Class<?> cls = obj.getClass();
                if (obj.equals(this.stickyEvents.get(cls))) {
                    this.stickyEvents.remove(cls);
                    return true;
                }
                MethodCollector.m26664o(10642);
                return false;
            } finally {
                MethodCollector.m26664o(10642);
            }
        }
    }

    /* renamed from: h */
    private synchronized void m156975h(Object obj) {
        MethodCollector.m26663i(10015);
        List<Class<?>> list = this.typesBySubscriber.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                CopyOnWriteArrayList<C90269v> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
                if (copyOnWriteArrayList != null) {
                    int size = copyOnWriteArrayList.size();
                    int i = 0;
                    while (i < size) {
                        C90269v vVar = copyOnWriteArrayList.get(i);
                        if (vVar.f205057a == obj) {
                            vVar.f205059c = false;
                            copyOnWriteArrayList.remove(i);
                            i--;
                            size--;
                        }
                        i++;
                    }
                }
            }
            this.typesBySubscriber.remove(obj);
            MethodCollector.m26664o(10015);
            return;
        }
        this.f204984i.mo145405a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        MethodCollector.m26664o(10015);
    }

    /* renamed from: b */
    public final synchronized void mo145395b(Object obj) {
        MethodCollector.m26663i(10013);
        if (m156962a().mo145393a(obj)) {
            try {
                m156975h(obj);
                MethodCollector.m26664o(10013);
                return;
            } catch (C90247d e) {
                C13468b.m24210a(e);
            }
        }
        MethodCollector.m26664o(10013);
    }

    /* renamed from: c */
    public final void mo145396c(Object obj) {
        C90240a aVar = this.currentPostingThreadState.get();
        List<Object> list = aVar.f204987a;
        list.add(obj);
        if (!aVar.f204988b) {
            aVar.f204989c = m156972b();
            aVar.f204988b = true;
            if (!aVar.f204993g) {
                while (!list.isEmpty()) {
                    try {
                        m156963a(list.remove(0), aVar);
                    } finally {
                        aVar.f204988b = false;
                        aVar.f204989c = false;
                    }
                }
                return;
            }
            throw new C90247d("Internal error. Abort state was not reset");
        }
    }

    private EventBus(C90246c cVar) {
        AbstractC90255l bVar;
        AbstractC90258m mVar;
        Object a;
        int i;
        this.currentPostingThreadState = new ThreadLocal<C90240a>() {
            /* class org.greenrobot.eventbus.EventBus.C902382 */

            static {
                Covode.recordClassIndex(106508);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public final /* synthetic */ C90240a initialValue() {
                return new C90240a();
            }
        };
        if (cVar.f205013l != null) {
            bVar = cVar.f205013l;
        } else if (!C90242a.f204996a || AbstractC90255l.C90256a.m157001a() == null) {
            bVar = new AbstractC90255l.C90257b();
        } else {
            bVar = new C90242a("EventBus");
        }
        this.f204984i = bVar;
        this.subscriptionsByEventType = new HashMap();
        this.typesBySubscriber = new HashMap();
        this.stickyEvents = new ConcurrentHashMap();
        AbstractC90263q qVar = null;
        if (cVar.f205014m != null) {
            mVar = cVar.f205014m;
        } else if (!C90242a.f204996a || (a = C90246c.m156994a()) == null) {
            mVar = null;
        } else {
            mVar = new AbstractC90258m.C90259a((Looper) a);
        }
        this.mainThreadSupport = mVar;
        this.mainThreadPoster = mVar != null ? mVar.mo145417a(this) : qVar;
        this.backgroundPoster = new RunnableC90243b(this);
        this.asyncPoster = new RunnableC90241a(this);
        if (cVar.f205012k != null) {
            i = cVar.f205012k.size();
        } else {
            i = 0;
        }
        this.indexCount = i;
        this.subscriberMethodFinder = new C90267u(this, cVar.f205012k, cVar.f205009h, cVar.f205008g);
        this.logSubscriberExceptions = cVar.f205002a;
        this.logNoSubscriberMessages = cVar.f205003b;
        this.sendSubscriberExceptionEvent = cVar.f205004c;
        this.sendNoSubscriberEvent = cVar.f205005d;
        this.throwSubscriberException = cVar.f205006e;
        this.eventInheritance = cVar.f205007f;
        this.f204982g = cVar.f205010i;
        if (cVar.f205011j != null) {
            this.f204983h = cVar.f205011j;
            return;
        }
        AbstractC90254k<ExecutorService> kVar = f204980e;
        if (kVar != null) {
            if (kVar.f205023a == null) {
                kVar.f205023a = (T) kVar.mo145401a();
            }
            this.f204983h = kVar.f205023a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m156974g(java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.m156974g(java.lang.Object):void");
    }

    /* renamed from: a */
    private void m156967a(C90269v vVar, Object obj) {
        if (obj != null) {
            m156969a(vVar, obj, m156972b());
        }
    }

    /* renamed from: a */
    private static void m156965a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m156965a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    private void m156971b(C90269v vVar, Object obj) {
        Method b = vVar.f205058b.mo145413b();
        try {
            b.invoke(vVar.f205057a, obj);
        } catch (InvocationTargetException e) {
            m156968a(vVar, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: a */
    private void m156963a(Object obj, C90240a aVar) {
        boolean z;
        Class<?> cls = obj.getClass();
        aVar.f204990d = 0;
        if (this.eventInheritance) {
            List<Class<?>> c = m156973c(cls);
            int size = c.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= m156970a(obj, aVar, c.get(i));
            }
        } else {
            z = m156970a(obj, aVar, cls);
        }
        if (!z) {
            if (this.logNoSubscriberMessages) {
                this.f204984i.mo145405a(Level.FINE, "No subscribers registered for event ".concat(String.valueOf(cls)));
            }
            if (!(!this.sendNoSubscriberEvent || cls == C90260n.class || cls == C90265s.class)) {
                mo145396c(new C90260n(this, obj));
            }
        }
    }

    /* renamed from: a */
    private void m156964a(Object obj, C90266t tVar) {
        Class<?> cls = tVar.f205039e;
        C90269v vVar = new C90269v(obj, tVar);
        CopyOnWriteArrayList<C90269v> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.subscriptionsByEventType.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(vVar)) {
            throw new C90247d("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || tVar.f205040f > copyOnWriteArrayList.get(i).f205058b.f205040f) {
                copyOnWriteArrayList.add(i, vVar);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, vVar);
        List<Class<?>> list = this.typesBySubscriber.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.typesBySubscriber.put(obj, list);
        }
        list.add(cls);
        if (!tVar.f205041g) {
            return;
        }
        if (this.eventInheritance) {
            for (Map.Entry<Class<?>, Object> entry : this.stickyEvents.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    m156967a(vVar, entry.getValue());
                }
            }
            return;
        }
        m156967a(vVar, this.stickyEvents.get(cls));
    }

    /* renamed from: a */
    public static void m156966a(EventBus eventBus, Object obj) {
        if (!m156962a().mo145393a(obj)) {
            try {
                eventBus.m156974g(obj);
            } catch (C90247d e) {
                C13468b.m24210a(e);
            }
        }
    }

    /* renamed from: a */
    private void m156968a(C90269v vVar, Object obj, Throwable th) {
        if (obj instanceof C90265s) {
            if (this.logSubscriberExceptions) {
                this.f204984i.mo145406a(Level.SEVERE, "SubscriberExceptionEvent subscriber " + vVar.f205057a.getClass() + " threw an exception", th);
                C90265s sVar = (C90265s) obj;
                this.f204984i.mo145406a(Level.SEVERE, "Initial event " + sVar.f205035c + " caused exception in " + sVar.f205036d, sVar.f205034b);
            }
        } else if (!this.throwSubscriberException) {
            if (this.logSubscriberExceptions) {
                this.f204984i.mo145406a(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + vVar.f205057a.getClass(), th);
            }
            if (this.sendSubscriberExceptionEvent) {
                mo145396c(new C90265s(this, th, obj, vVar.f205057a));
            }
        } else {
            throw new C90247d("Invoking subscriber failed", th);
        }
    }

    /* renamed from: a */
    private void m156969a(C90269v vVar, Object obj, boolean z) {
        int i = C902393.f204986a[vVar.f205058b.f205038d.ordinal()];
        if (i == 1) {
            m156971b(vVar, obj);
        } else if (i != 2) {
            if (i == 3) {
                AbstractC90263q qVar = this.mainThreadPoster;
                if (qVar != null) {
                    qVar.mo145403a(vVar, obj);
                } else {
                    m156971b(vVar, obj);
                }
            } else if (i != 4) {
                if (i == 5) {
                    this.asyncPoster.mo145403a(vVar, obj);
                    return;
                }
                throw new IllegalStateException("Unknown thread mode: " + vVar.f205058b.f205038d);
            } else if (z) {
                this.backgroundPoster.mo145403a(vVar, obj);
            } else {
                m156971b(vVar, obj);
            }
        } else if (z) {
            m156971b(vVar, obj);
        } else {
            this.mainThreadPoster.mo145403a(vVar, obj);
        }
    }
}
