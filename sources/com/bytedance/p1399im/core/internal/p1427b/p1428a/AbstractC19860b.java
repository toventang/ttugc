package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.proto.Response;
import com.bytedance.p1399im.core.proto.ResponseBody;

/* renamed from: com.bytedance.im.core.internal.b.a.b */
public abstract class AbstractC19860b extends AbstractC19927w {

    /* renamed from: a */
    protected C19978k f47160a;

    static {
        Covode.recordClassIndex(22704);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31749a(int i, ResponseBody responseBody, C19608bd bdVar);

    public AbstractC19860b(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (!kVar.mo31869l() || kVar.f47482f == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (mo31130a(kVar) && kVar.f47482f.body != null) {
            this.f47160a = kVar;
            Response response = kVar.f47482f;
            mo31749a(response.inbox_type.intValue(), response.body, kVar.f47483g);
        }
    }
}
