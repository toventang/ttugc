package p4600h.p4603c.p4605b.p4606a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.lang.reflect.Method;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.C89114h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.b.a.a */
public abstract class AbstractC89107a implements AbstractC89111e, AbstractC89124d<Object>, Serializable {
    private final AbstractC89124d<Object> completion;

    static {
        Covode.recordClassIndex(105191);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final AbstractC89124d<Object> getCompletion() {
        return this.completion;
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public AbstractC89111e getCallerFrame() {
        AbstractC89124d<Object> dVar = this.completion;
        if (!(dVar instanceof AbstractC89111e)) {
            dVar = null;
        }
        return (AbstractC89111e) dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return sb.append(stackTraceElement).toString();
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public StackTraceElement getStackTraceElement() {
        int i;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        String str;
        C89219l.m154721d(this, "");
        AbstractC89112f fVar = (AbstractC89112f) getClass().getAnnotation(AbstractC89112f.class);
        String str2 = null;
        if (fVar == null) {
            return null;
        }
        int a = fVar.mo143563a();
        if (a <= 1) {
            int a2 = C89113g.m154617a(this);
            if (a2 < 0) {
                i = -1;
            } else {
                i = fVar.mo143565c()[a2];
            }
            C89219l.m154721d(this, "");
            C89114h.C89115a aVar = C89114h.f202827b;
            if (aVar == null) {
                aVar = C89114h.m154618a(this);
            }
            if (!(aVar == C89114h.f202826a || (method = aVar.f202829a) == null || (invoke = method.invoke(getClass(), new Object[0])) == null || (method2 = aVar.f202830b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null)) {
                Method method3 = aVar.f202831c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, new Object[0]);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = obj;
                }
                String str3 = str2;
                if (str3 != null) {
                    str = str3 + '/' + fVar.mo143567e();
                    return new StackTraceElement(str, fVar.mo143566d(), fVar.mo143564b(), i);
                }
            }
            str = fVar.mo143567e();
            return new StackTraceElement(str, fVar.mo143566d(), fVar.mo143564b(), i);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + a + ". Please update the Kotlin standard library.").toString());
    }

    public AbstractC89107a(AbstractC89124d<Object> dVar) {
        this.completion = dVar;
    }

    public AbstractC89124d<C89391z> create(AbstractC89124d<?> dVar) {
        C89219l.m154721d(dVar, "");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final void resumeWith(Object obj) {
        AbstractC89107a aVar = this;
        while (true) {
            C89219l.m154721d(aVar, "");
            AbstractC89124d<Object> dVar = aVar.completion;
            if (dVar == null) {
                C89219l.m154715b();
            }
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != EnumC89098a.COROUTINE_SUSPENDED) {
                    obj = C89379q.m157068constructorimpl(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar instanceof AbstractC89107a) {
                        aVar = (AbstractC89107a) dVar;
                    } else {
                        dVar.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    public AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
        C89219l.m154721d(dVar, "");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
