package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1830b.AbstractRunnableC24073h;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.av */
public abstract class AbstractC24562av<T> extends AbstractRunnableC24073h<T> {

    /* renamed from: b */
    private final AbstractC24596k<T> f58349b;

    /* renamed from: c */
    private final AbstractC24547an f58350c;

    /* renamed from: d */
    private final String f58351d;

    /* renamed from: e */
    private final String f58352e;

    static {
        Covode.recordClassIndex(28706);
    }

    @Override // com.facebook.common.p1830b.AbstractRunnableC24073h
    /* renamed from: b */
    public abstract void mo39640b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo40385c(T t) {
        return null;
    }

    @Override // com.facebook.common.p1830b.AbstractRunnableC24073h
    /* renamed from: b */
    public void mo39639b() {
        AbstractC24547an anVar = this.f58350c;
        String str = this.f58352e;
        String str2 = this.f58351d;
        anVar.requiresExtraMap(str);
        anVar.onProducerFinishWithCancellation(str, str2, null);
        this.f58349b.mo40432b();
    }

    @Override // com.facebook.common.p1830b.AbstractRunnableC24073h
    /* renamed from: a */
    public void mo39637a(Exception exc) {
        AbstractC24547an anVar = this.f58350c;
        String str = this.f58352e;
        String str2 = this.f58351d;
        anVar.requiresExtraMap(str);
        anVar.onProducerFinishWithFailure(str, str2, exc, null);
        this.f58349b.mo40435b(exc);
    }

    @Override // com.facebook.common.p1830b.AbstractRunnableC24073h
    /* renamed from: a */
    public void mo39638a(T t) {
        Map<String, String> map;
        AbstractC24547an anVar = this.f58350c;
        String str = this.f58352e;
        String str2 = this.f58351d;
        if (anVar.requiresExtraMap(str)) {
            map = mo40385c(t);
        } else {
            map = null;
        }
        anVar.onProducerFinishWithSuccess(str, str2, map);
        this.f58349b.mo40434b(t, 1);
    }

    public AbstractC24562av(AbstractC24596k<T> kVar, AbstractC24547an anVar, String str, String str2) {
        this.f58349b = kVar;
        this.f58350c = anVar;
        this.f58351d = str;
        this.f58352e = str2;
        anVar.onProducerStart(str2, str);
    }
}
