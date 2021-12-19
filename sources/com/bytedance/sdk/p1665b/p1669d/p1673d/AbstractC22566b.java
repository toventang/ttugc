package com.bytedance.sdk.p1665b.p1669d.p1673d;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22559b;
import com.bytedance.sdk.p1665b.p1669d.p1674e.AbstractC22578b;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.b.d.d.b */
public abstract class AbstractC22566b<T> extends AbstractC22578b<String> {

    /* renamed from: a */
    private final AbstractC22559b<String> f53334a;

    /* renamed from: b */
    public final AbstractC22558a<T> f53335b;

    static {
        Covode.recordClassIndex(26382);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo36847a(JSONObject jSONObject);

    @Override // com.bytedance.sdk.p1665b.p1669d.p1674e.AbstractRunnableC22576a
    /* renamed from: a */
    public final /* synthetic */ Object mo36849a(String str) {
        C22539a.m42533a("response raw result: ".concat(String.valueOf(str)));
        return str;
    }

    public AbstractC22566b(String str, Map<String, String> map, AbstractC22558a<T> aVar) {
        super(str, map);
        C225671 r0 = new AbstractC22559b<String>() {
            /* class com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22566b.C225671 */

            static {
                Covode.recordClassIndex(26383);
            }

            @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22559b
            /* renamed from: a */
            public final void mo36845a(Exception exc) {
                if (AbstractC22566b.this.f53335b != null) {
                    AbstractC22566b.this.f53335b.mo36791a(exc);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.bytedance.sdk.b.d.b.a<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22559b
            /* renamed from: a */
            public final /* synthetic */ void mo36846a(String str) {
                String str2 = str;
                if (AbstractC22566b.this.f53335b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        int optInt = jSONObject.optInt("status_code", -1);
                        if (optInt == 0) {
                            AbstractC22566b.this.f53335b.mo36792a(AbstractC22566b.this.mo36847a(jSONObject));
                            return;
                        }
                        AbstractC22566b.this.f53335b.mo36790a(optInt, jSONObject.optString("msg"));
                    } catch (Exception e) {
                        AbstractC22566b.this.f53335b.mo36791a(e);
                    }
                }
            }
        };
        this.f53334a = r0;
        this.f53335b = aVar;
        mo36852a((AbstractC22559b) r0);
    }
}
