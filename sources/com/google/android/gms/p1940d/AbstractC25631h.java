package com.google.android.gms.p1940d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.h */
public abstract class AbstractC25631h<TResult> {
    static {
        Covode.recordClassIndex(31042);
    }

    /* renamed from: a */
    public abstract AbstractC25631h<TResult> mo41867a(Activity activity, AbstractC25627d dVar);

    /* renamed from: a */
    public abstract AbstractC25631h<TResult> mo41868a(Activity activity, AbstractC25628e<? super TResult> eVar);

    /* renamed from: a */
    public abstract AbstractC25631h<TResult> mo41870a(AbstractC25628e<? super TResult> eVar);

    /* renamed from: a */
    public abstract AbstractC25631h<TResult> mo41874a(Executor executor, AbstractC25627d dVar);

    /* renamed from: a */
    public abstract AbstractC25631h<TResult> mo41875a(Executor executor, AbstractC25628e<? super TResult> eVar);

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo41877a(Class<X> cls);

    /* renamed from: a */
    public abstract boolean mo41880a();

    /* renamed from: b */
    public abstract boolean mo41882b();

    /* renamed from: c */
    public abstract boolean mo41885c();

    /* renamed from: d */
    public abstract TResult mo41886d();

    /* renamed from: e */
    public abstract Exception mo41887e();

    /* renamed from: a */
    public AbstractC25631h<TResult> mo41869a(AbstractC25626c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public AbstractC25631h<TResult> mo41873a(Executor executor, AbstractC25626c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public AbstractC25631h<TResult> mo41872a(Executor executor, AbstractC25625b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> AbstractC25631h<TContinuationResult> mo41871a(Executor executor, AbstractC25619a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: b */
    public <TContinuationResult> AbstractC25631h<TContinuationResult> mo41881b(Executor executor, AbstractC25619a<TResult, AbstractC25631h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> AbstractC25631h<TContinuationResult> mo41876a(Executor executor, AbstractC25630g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
