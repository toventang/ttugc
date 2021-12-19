package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: kotlinx.coroutines.internal.u */
public final class C89658u {

    /* renamed from: a */
    private static final String f203407a;

    /* renamed from: b */
    private static final String f203408b;

    /* renamed from: a */
    private static final boolean m155633a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C89219l.m154714a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C89219l.m154714a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C89219l.m154714a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str;
        String str2;
        String str3 = "kotlinx.coroutines.internal.u";
        String str4 = "h.c.b.a.a";
        Covode.recordClassIndex(105751);
        try {
            str = C89379q.m157068constructorimpl(Class.forName(str4).getCanonicalName());
        } catch (Throwable th) {
            str = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157071exceptionOrNullimpl(str) == null) {
            str4 = str;
        }
        f203407a = str4;
        try {
            str2 = C89379q.m157068constructorimpl(Class.forName(str3).getCanonicalName());
        } catch (Throwable th2) {
            str2 = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
        }
        if (C89379q.m157071exceptionOrNullimpl(str2) == null) {
            str3 = str2;
        }
        f203408b = str3;
    }

    /* renamed from: a */
    private static boolean m155632a(StackTraceElement stackTraceElement) {
        return C89361p.m154874b(stackTraceElement.getClassName(), "\b\b\b", false);
    }

    /* renamed from: a */
    private static StackTraceElement m155626a(String str) {
        return new StackTraceElement("\b\b\b(".concat(String.valueOf(str)), "\b", "\b", -1);
    }

    /* renamed from: b */
    private static final <E extends Throwable> C89378p<E, StackTraceElement[]> m155634b(E e) {
        Throwable cause = e.getCause();
        if (cause == null || !C89219l.m154714a(cause.getClass(), e.getClass())) {
            return C89387v.m154943a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (m155632a(stackTraceElement)) {
                return C89387v.m154943a(cause, stackTrace);
            }
        }
        return C89387v.m154943a(e, new StackTraceElement[0]);
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m155627a(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && !(!C89219l.m154714a(e2.getClass(), e.getClass()))) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (m155632a(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    private static final ArrayDeque<StackTraceElement> m155630a(AbstractC89111e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while ((eVar instanceof AbstractC89111e) && (eVar = eVar.getCallerFrame()) != null) {
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    /* renamed from: a */
    private static final int m155625a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C89219l.m154714a((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m155628a(E e, AbstractC89111e eVar) {
        C89378p b = m155634b(e);
        Throwable th = (Throwable) b.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b.component2();
        Throwable a = C89633f.m155577a(th);
        if (a == null || (!C89219l.m154714a((Object) a.getMessage(), (Object) th.getMessage()))) {
            return e;
        }
        ArrayDeque<StackTraceElement> a2 = m155630a(eVar);
        if (a2.isEmpty()) {
            return e;
        }
        if (th != e) {
            m155631a(stackTraceElementArr, a2);
        }
        return (E) m155629a(th, a, a2);
    }

    /* renamed from: a */
    private static final void m155631a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m155632a(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                if (m155633a(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m155629a(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m155626a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int a = m155625a(stackTrace, f203407a);
        int i = 0;
        if (a == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a)];
        for (int i2 = 0; i2 < a; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }
}
