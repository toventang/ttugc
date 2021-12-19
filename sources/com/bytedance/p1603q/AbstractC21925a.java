package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1603q.AbstractC21946l;
import java.util.List;

/* renamed from: com.bytedance.q.a */
public abstract class AbstractC21925a<IN, OUT> extends AbstractC21946l<IN, OUT> {
    static {
        Covode.recordClassIndex(25591);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo24022a(IN in);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.q.b<OUT> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final Object mo24020a(AbstractC21931b<OUT> bVar, IN in) {
        new C21949m(bVar);
        String a = mo24022a((Object) in);
        AbstractC21946l.C21947a aVar = this.f51938b.get(a);
        if (aVar != null) {
            List<C21940h> list = aVar.f51939a;
            Object a2 = C21934c.m41250a(list, bVar, this).mo35692a((Object) in);
            if (!m41274a(list)) {
                return a2;
            }
            return bVar.mo35692a((OUT) a2);
        }
        throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(a)));
    }
}
