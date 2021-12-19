package com.bytedance.sdk.p1665b.p1669d.p1673d;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22559b;
import com.bytedance.sdk.p1665b.p1669d.p1674e.AbstractC22579c;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.b.d.d.d */
public abstract class AbstractC22571d<T> extends AbstractC22579c<String> {

    /* renamed from: a */
    private final AbstractC22559b<String> f53343a;

    /* renamed from: b */
    public final AbstractC22558a<T> f53344b;

    /* renamed from: c */
    public AbstractC22573a f53345c = null;

    /* renamed from: com.bytedance.sdk.b.d.d.d$a */
    interface AbstractC22573a {
        static {
            Covode.recordClassIndex(26389);
        }

        /* renamed from: a */
        void mo36850a(int i, int i2, String str);
    }

    static {
        Covode.recordClassIndex(26387);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo36848a(JSONObject jSONObject);

    @Override // com.bytedance.sdk.p1665b.p1669d.p1674e.AbstractRunnableC22576a
    /* renamed from: a */
    public final /* synthetic */ Object mo36849a(String str) {
        C22539a.m42533a("response raw result: ".concat(String.valueOf(str)));
        return str;
    }

    public AbstractC22571d(String str, Map<String, String> map, AbstractC22558a<T> aVar) {
        super(str, map);
        C225721 r1 = new AbstractC22559b<String>() {
            /* class com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22571d.C225721 */

            static {
                Covode.recordClassIndex(26388);
            }

            @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22559b
            /* renamed from: a */
            public final void mo36845a(Exception exc) {
                if (AbstractC22571d.this.f53344b != null) {
                    AbstractC22571d.this.f53344b.mo36791a(exc);
                }
                if (AbstractC22571d.this.f53345c != null) {
                    AbstractC22571d.this.f53345c.mo36850a(0, -2, exc.toString());
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.bytedance.sdk.b.d.b.a<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22559b
            /* renamed from: a */
            public final /* synthetic */ void mo36846a(String str) {
                String str2 = str;
                if (AbstractC22571d.this.f53344b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        int optInt = jSONObject.optInt("status_code");
                        if (optInt == 0) {
                            AbstractC22571d.this.f53344b.mo36792a(AbstractC22571d.this.mo36848a(jSONObject));
                            if (AbstractC22571d.this.f53345c != null) {
                                AbstractC22571d.this.f53345c.mo36850a(1, optInt, "");
                                return;
                            }
                            return;
                        }
                        String optString = jSONObject.optString("msg");
                        AbstractC22571d.this.f53344b.mo36790a(optInt, optString);
                        if (AbstractC22571d.this.f53345c != null) {
                            AbstractC22571d.this.f53345c.mo36850a(0, optInt, optString);
                        }
                    } catch (Exception e) {
                        AbstractC22571d.this.f53344b.mo36791a(e);
                        if (AbstractC22571d.this.f53345c != null) {
                            AbstractC22571d.this.f53345c.mo36850a(0, -1, e.toString());
                        }
                    }
                }
            }
        };
        this.f53343a = r1;
        this.f53344b = aVar;
        mo36852a((AbstractC22559b) r1);
    }
}
