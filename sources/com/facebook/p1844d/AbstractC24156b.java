package com.facebook.p1844d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.d.b */
public abstract class AbstractC24156b<T> implements AbstractC24160e<T> {
    static {
        Covode.recordClassIndex(28287);
    }

    @Override // com.facebook.p1844d.AbstractC24160e
    public void onCancellation(AbstractC24157c<T> cVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void onFailureImpl(AbstractC24157c<T> cVar);

    /* access modifiers changed from: protected */
    public abstract void onNewResultImpl(AbstractC24157c<T> cVar);

    @Override // com.facebook.p1844d.AbstractC24160e
    public void onProgressUpdate(AbstractC24157c<T> cVar) {
    }

    @Override // com.facebook.p1844d.AbstractC24160e
    public void onFailure(AbstractC24157c<T> cVar) {
        try {
            onFailureImpl(cVar);
        } finally {
            cVar.mo39750g();
        }
    }

    @Override // com.facebook.p1844d.AbstractC24160e
    public void onNewResult(AbstractC24157c<T> cVar) {
        boolean b = cVar.mo39745b();
        try {
            onNewResultImpl(cVar);
        } finally {
            if (b) {
                cVar.mo39750g();
            }
        }
    }
}
