package p4560f.p4561a.p4587h;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88423c;
import p4560f.p4561a.p4566c.C88424d;
import p4560f.p4561a.p4566c.C88426f;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88432e;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4585f.AbstractC88918a;

/* renamed from: f.a.h.a */
public final class C88925a {

    /* renamed from: a */
    public static volatile AbstractC88433f<? super Throwable> f201933a;

    /* renamed from: b */
    static volatile AbstractC88434g<? super Runnable, ? extends Runnable> f201934b;

    /* renamed from: c */
    public static volatile AbstractC88434g<? super Callable<AbstractC88398aa>, ? extends AbstractC88398aa> f201935c;

    /* renamed from: d */
    public static volatile AbstractC88434g<? super Callable<AbstractC88398aa>, ? extends AbstractC88398aa> f201936d;

    /* renamed from: e */
    public static volatile AbstractC88434g<? super Callable<AbstractC88398aa>, ? extends AbstractC88398aa> f201937e;

    /* renamed from: f */
    public static volatile AbstractC88434g<? super Callable<AbstractC88398aa>, ? extends AbstractC88398aa> f201938f;

    /* renamed from: g */
    static volatile AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> f201939g;

    /* renamed from: h */
    static volatile AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> f201940h;

    /* renamed from: i */
    public static volatile AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> f201941i;

    /* renamed from: j */
    static volatile AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> f201942j;

    /* renamed from: k */
    static volatile AbstractC88434g<? super AbstractC88924h, ? extends AbstractC88924h> f201943k;

    /* renamed from: l */
    static volatile AbstractC88434g<? super AbstractC88979t, ? extends AbstractC88979t> f201944l;

    /* renamed from: m */
    static volatile AbstractC88434g<? super AbstractC88918a, ? extends AbstractC88918a> f201945m;

    /* renamed from: n */
    static volatile AbstractC88434g<? super AbstractC88973n, ? extends AbstractC88973n> f201946n;

    /* renamed from: o */
    static volatile AbstractC88434g<? super AbstractC88403ab, ? extends AbstractC88403ab> f201947o;

    /* renamed from: p */
    static volatile AbstractC88434g<? super AbstractC88410b, ? extends AbstractC88410b> f201948p;

    /* renamed from: q */
    static volatile AbstractC88430c<? super AbstractC88924h, ? super AbstractC90214c, ? extends AbstractC90214c> f201949q;

    /* renamed from: r */
    static volatile AbstractC88430c<? super AbstractC88973n, ? super AbstractC88975p, ? extends AbstractC88975p> f201950r;

    /* renamed from: s */
    static volatile AbstractC88430c<? super AbstractC88979t, ? super AbstractC88986z, ? extends AbstractC88986z> f201951s;

    /* renamed from: t */
    static volatile AbstractC88430c<? super AbstractC88403ab, ? super AbstractC88406ae, ? extends AbstractC88406ae> f201952t;

    /* renamed from: u */
    static volatile AbstractC88430c<? super AbstractC88410b, ? super AbstractC88427d, ? extends AbstractC88427d> f201953u;

    /* renamed from: v */
    static volatile AbstractC88432e f201954v;

    /* renamed from: w */
    public static volatile boolean f201955w;

    /* renamed from: x */
    public static volatile boolean f201956x;

    static {
        Covode.recordClassIndex(104967);
    }

    /* renamed from: a */
    public static void m154178a(Throwable th) {
        AbstractC88433f<? super Throwable> fVar = f201933a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m154181b(th)) {
            th = new C88426f(th);
        }
        if (fVar != null) {
            try {
                fVar.accept(th);
                return;
            } catch (Throwable th2) {
                m154183c(th2);
            }
        }
        m154183c(th);
    }

    /* renamed from: a */
    public static Runnable m154175a(Runnable runnable) {
        C88466b.m153697a((Object) runnable, "run is null");
        AbstractC88434g<? super Runnable, ? extends Runnable> gVar = f201934b;
        if (gVar == null) {
            return runnable;
        }
        return (Runnable) m154174a(gVar, runnable);
    }

    /* renamed from: a */
    public static void m154177a(AbstractC88433f<? super Throwable> fVar) {
        if (!f201955w) {
            f201933a = fVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: a */
    public static <T> AbstractC90214c<? super T> m154176a(AbstractC88924h<T> hVar, AbstractC90214c<? super T> cVar) {
        AbstractC88430c<? super AbstractC88924h, ? super AbstractC90214c, ? extends AbstractC90214c> cVar2 = f201949q;
        return cVar2 != null ? (AbstractC90214c) m154173a(cVar2, hVar, cVar) : cVar;
    }

    /* renamed from: a */
    public static <T> AbstractC88986z<? super T> m154172a(AbstractC88979t<T> tVar, AbstractC88986z<? super T> zVar) {
        AbstractC88430c<? super AbstractC88979t, ? super AbstractC88986z, ? extends AbstractC88986z> cVar = f201951s;
        return cVar != null ? (AbstractC88986z) m154173a(cVar, tVar, zVar) : zVar;
    }

    /* renamed from: a */
    public static <T> AbstractC88975p<? super T> m154170a(AbstractC88973n<T> nVar, AbstractC88975p<? super T> pVar) {
        AbstractC88430c<? super AbstractC88973n, ? super AbstractC88975p, ? extends AbstractC88975p> cVar = f201950r;
        return cVar != null ? (AbstractC88975p) m154173a(cVar, nVar, pVar) : pVar;
    }

    /* renamed from: a */
    public static <T> AbstractC88973n<T> m154169a(AbstractC88973n<T> nVar) {
        AbstractC88434g<? super AbstractC88973n, ? extends AbstractC88973n> gVar = f201946n;
        return gVar != null ? (AbstractC88973n) m154174a(gVar, nVar) : nVar;
    }

    /* renamed from: a */
    public static <T> AbstractC88924h<T> m154168a(AbstractC88924h<T> hVar) {
        AbstractC88434g<? super AbstractC88924h, ? extends AbstractC88924h> gVar = f201943k;
        return gVar != null ? (AbstractC88924h) m154174a(gVar, hVar) : hVar;
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154171a(AbstractC88979t<T> tVar) {
        AbstractC88434g<? super AbstractC88979t, ? extends AbstractC88979t> gVar = f201944l;
        return gVar != null ? (AbstractC88979t) m154174a(gVar, tVar) : tVar;
    }

    /* renamed from: a */
    public static boolean m154179a() {
        AbstractC88432e eVar = f201954v;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.mo17930a();
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: a */
    private static <T, R> R m154174a(AbstractC88434g<T, R> gVar, T t) {
        try {
            return gVar.apply(t);
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: a */
    private static <T, U, R> R m154173a(AbstractC88430c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.mo9210a(t, u);
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: a */
    public static AbstractC88398aa m154160a(AbstractC88398aa aaVar) {
        AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> gVar = f201939g;
        if (gVar == null) {
            return aaVar;
        }
        return (AbstractC88398aa) m154174a(gVar, aaVar);
    }

    /* renamed from: b */
    public static AbstractC88398aa m154180b(AbstractC88398aa aaVar) {
        AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> gVar = f201941i;
        if (gVar == null) {
            return aaVar;
        }
        return (AbstractC88398aa) m154174a(gVar, aaVar);
    }

    /* renamed from: c */
    public static AbstractC88398aa m154182c(AbstractC88398aa aaVar) {
        AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> gVar = f201942j;
        if (gVar == null) {
            return aaVar;
        }
        return (AbstractC88398aa) m154174a(gVar, aaVar);
    }

    /* renamed from: d */
    public static AbstractC88398aa m154184d(AbstractC88398aa aaVar) {
        AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> gVar = f201940h;
        if (gVar == null) {
            return aaVar;
        }
        return (AbstractC88398aa) m154174a(gVar, aaVar);
    }

    /* renamed from: c */
    private static void m154183c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public static AbstractC88398aa m154162a(Callable<AbstractC88398aa> callable) {
        try {
            return (AbstractC88398aa) C88466b.m153697a((Object) callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: b */
    private static boolean m154181b(Throwable th) {
        if (!(th instanceof C88424d) && !(th instanceof C88423c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C88417a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> AbstractC88403ab<T> m154163a(AbstractC88403ab<T> abVar) {
        AbstractC88434g<? super AbstractC88403ab, ? extends AbstractC88403ab> gVar = f201947o;
        if (gVar != null) {
            return (AbstractC88403ab) m154174a(gVar, abVar);
        }
        return abVar;
    }

    /* renamed from: a */
    public static AbstractC88410b m154165a(AbstractC88410b bVar) {
        AbstractC88434g<? super AbstractC88410b, ? extends AbstractC88410b> gVar = f201948p;
        if (gVar != null) {
            return (AbstractC88410b) m154174a(gVar, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public static <T> AbstractC88918a<T> m154167a(AbstractC88918a<T> aVar) {
        AbstractC88434g<? super AbstractC88918a, ? extends AbstractC88918a> gVar = f201945m;
        if (gVar != null) {
            return (AbstractC88918a) m154174a(gVar, aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public static AbstractC88398aa m154161a(AbstractC88434g<? super Callable<AbstractC88398aa>, ? extends AbstractC88398aa> gVar, Callable<AbstractC88398aa> callable) {
        return (AbstractC88398aa) C88466b.m153697a(m154174a((AbstractC88434g) gVar, (Object) callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: a */
    public static <T> AbstractC88406ae<? super T> m154164a(AbstractC88403ab<T> abVar, AbstractC88406ae<? super T> aeVar) {
        AbstractC88430c<? super AbstractC88403ab, ? super AbstractC88406ae, ? extends AbstractC88406ae> cVar = f201952t;
        if (cVar != null) {
            return (AbstractC88406ae) m154173a(cVar, abVar, aeVar);
        }
        return aeVar;
    }

    /* renamed from: a */
    public static AbstractC88427d m154166a(AbstractC88410b bVar, AbstractC88427d dVar) {
        AbstractC88430c<? super AbstractC88410b, ? super AbstractC88427d, ? extends AbstractC88427d> cVar = f201953u;
        if (cVar != null) {
            return (AbstractC88427d) m154173a(cVar, bVar, dVar);
        }
        return dVar;
    }
}
