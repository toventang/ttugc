package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1603q.AbstractC21946l;
import com.bytedance.p1603q.C21942i;
import java.util.List;

/* renamed from: com.bytedance.q.j */
public abstract class AbstractC21944j<IN, OUT> extends AbstractC21946l<IN, OUT> {

    /* renamed from: a */
    public String f51935a;

    static {
        Covode.recordClassIndex(25610);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo24023a(IN in);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo24024a(IN in, Throwable th, String str);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.q.b<OUT> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final Object mo24020a(AbstractC21931b<OUT> bVar, IN in) {
        new C21949m(bVar);
        this.f51935a = mo24023a((Object) in);
        AbstractC21946l.C21947a aVar = this.f51938b.get(this.f51935a);
        while (aVar != null) {
            List<C21940h> list = aVar.f51939a;
            try {
                Object a = C21934c.m41250a(list, bVar, this).mo35692a((Object) in);
                if (!m41274a(list)) {
                    return a;
                }
                return bVar.mo35692a((OUT) a);
            } catch (C21942i.C21943a e) {
                Throwable cause = e.getCause();
                new C21949m(bVar);
                this.f51935a = mo24024a(in, cause, this.f51935a);
                aVar = this.f51938b.get(this.f51935a);
            } catch (Throwable th) {
                new C21949m(bVar);
                this.f51935a = mo24024a(in, th, this.f51935a);
                aVar = this.f51938b.get(this.f51935a);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f51935a);
    }
}
