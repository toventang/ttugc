package com.p2082ss.android.ugc.aweme.ecommerce.track;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.track.a */
public abstract class AbstractC45535a {

    /* renamed from: m */
    public static final C45536a f106049m = new C45536a((byte) 0);

    /* renamed from: k */
    public final LinkedHashMap<String, Object> f106050k = new LinkedHashMap<>();

    /* renamed from: l */
    public final String f106051l;

    static {
        Covode.recordClassIndex(54026);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<String, Object> mo73987a();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.a$a */
    public static final class C45536a {
        static {
            Covode.recordClassIndex(54027);
        }

        private C45536a() {
        }

        public /* synthetic */ C45536a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    public final void mo76747d() {
        C1731i.m5640b(new CallableC45537b(this), C1731i.f5562a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.a$b */
    public static final class CallableC45537b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC45535a f106052a;

        static {
            Covode.recordClassIndex(54028);
        }

        CallableC45537b(AbstractC45535a aVar) {
            this.f106052a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                HashMap<String, Object> a = this.f106052a.mo73987a();
                if (a != null) {
                    this.f106052a.f106050k.putAll(a);
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Object> entry : this.f106052a.f106050k.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                C39162r.m79461a(this.f106052a.f106051l, jSONObject);
                return C89391z.f203057a;
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.a$c */
    public static final class CallableC45538c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC45535a f106053a;

        /* renamed from: b */
        final /* synthetic */ Map f106054b;

        static {
            Covode.recordClassIndex(54029);
        }

        CallableC45538c(AbstractC45535a aVar, Map map) {
            this.f106053a = aVar;
            this.f106054b = map;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                HashMap<String, Object> a = this.f106053a.mo73987a();
                if (a == null) {
                    a = new HashMap<>();
                }
                JSONObject jSONObject = new JSONObject();
                a.putAll(this.f106054b);
                for (Map.Entry<String, Object> entry : a.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                C39162r.m79461a(this.f106053a.f106051l, jSONObject);
                return C89391z.f203057a;
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo76746c(Map<String, ? extends Object> map) {
        C89219l.m154721d(map, "");
        C1731i.m5640b(new CallableC45538c(this, map), C1731i.f5562a);
    }

    public AbstractC45535a(String str) {
        C89219l.m154721d(str, "");
        this.f106051l = str;
    }
}
