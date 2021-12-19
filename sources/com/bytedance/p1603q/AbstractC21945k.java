package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1603q.C21942i;

/* renamed from: com.bytedance.q.k */
public abstract class AbstractC21945k<IN, OUT> extends AbstractC21935d<IN, OUT> {

    /* renamed from: a */
    public IN f51936a;

    /* renamed from: b */
    private boolean f51937b = true;

    static {
        Covode.recordClassIndex(25611);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo24027a(Throwable th);

    /* JADX WARN: Type inference failed for: r0v0, types: [IN, OUT] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public OUT mo24026a() {
        return this.f51936a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        if (objArr != null && objArr.length > 0) {
            this.f51937b = ((Boolean) objArr[0]).booleanValue();
        }
    }

    /* renamed from: a */
    private Object m41269a(AbstractC21931b<OUT> bVar, Throwable th) {
        while (mo24027a(th) && this.f51937b) {
            try {
                return bVar.mo35692a(mo24026a());
            } catch (C21942i.C21943a e) {
                th = e.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final Object mo24020a(AbstractC21931b<OUT> bVar, IN in) {
        this.f51936a = in;
        try {
            return bVar.mo35692a(mo24026a());
        } catch (C21942i.C21943a e) {
            return m41269a((AbstractC21931b) bVar, e.getCause());
        } catch (Throwable th) {
            return m41269a((AbstractC21931b) bVar, th);
        }
    }
}
