package com.google.android.datatransport.runtime.p1925b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.datatransport.runtime.b.b */
public final class C25122b {
    static {
        Covode.recordClassIndex(30487);
    }

    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m48173a(int i, TInput tinput, AbstractC25121a<TInput, TResult, TException> aVar, AbstractC25123c<TInput, TResult> cVar) {
        TResult a;
        do {
            a = aVar.mo41056a(tinput);
            tinput = cVar.mo41057a(tinput, a);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i > 0);
        return a;
    }
}
