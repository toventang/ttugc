package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.play.core.tasks.f */
public final class C27064f {
    static {
        Covode.recordClassIndex(32544);
    }

    /* renamed from: a */
    public static <ResultT> AbstractC27062d<ResultT> m53800a(Exception exc) {
        C27075q qVar = new C27075q();
        qVar.mo44787a(exc);
        return qVar;
    }

    /* renamed from: a */
    public static <ResultT> AbstractC27062d<ResultT> m53801a(ResultT resultt) {
        C27075q qVar = new C27075q();
        qVar.mo44788a((Object) resultt);
        return qVar;
    }

    /* renamed from: a */
    public static <ResultT> ResultT m53802a(AbstractC27062d<ResultT> dVar) {
        if (dVar.mo44774b()) {
            return dVar.mo44775c();
        }
        throw new ExecutionException(dVar.mo44776d());
    }
}
