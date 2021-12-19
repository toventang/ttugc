package com.bytedance.android.live.network;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.client.Request;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.network.m */
public final class C5816m<T> implements AbstractC22019c<T> {

    /* renamed from: b */
    public static final Map<String, AbstractC5796a.EnumC5797a> f14669b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final AbstractC89244h f14670c = C89250i.m154773a((AbstractC89171a) C5818b.f14674a);

    /* renamed from: d */
    public static final C5817a f14671d = new C5817a((byte) 0);

    /* renamed from: a */
    public final AbstractC5796a.EnumC5797a f14672a;

    /* renamed from: e */
    private final AbstractC22019c<T> f14673e;

    /* renamed from: com.bytedance.android.live.network.m$a */
    public static final class C5817a {
        static {
            Covode.recordClassIndex(6422);
        }

        /* renamed from: a */
        public static JSONObject m12755a() {
            return (JSONObject) C5816m.f14670c.getValue();
        }

        private C5817a() {
        }

        public /* synthetic */ C5817a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m12754a(Request request) {
            return request.getUrl() + ", " + request.getMethod();
        }
    }

    /* renamed from: com.bytedance.android.live.network.m$b */
    static final class C5818b extends AbstractC89220m implements AbstractC89171a<JSONObject> {

        /* renamed from: a */
        public static final C5818b f14674a = new C5818b();

        static {
            Covode.recordClassIndex(6423);
        }

        C5818b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ JSONObject invoke() {
            return m12756a();
        }

        /* renamed from: a */
        private static JSONObject m12756a() {
            JSONObject jSONObject;
            try {
                jSONObject = C89379q.m157068constructorimpl(new JSONObject(LiveMtPbRequestsSetting.INSTANCE.getValue().getSwitches()));
            } catch (Throwable th) {
                jSONObject = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            JSONObject jSONObject2 = new JSONObject();
            if (C89379q.m157073isFailureimpl(jSONObject)) {
                jSONObject = jSONObject2;
            }
            return (JSONObject) jSONObject;
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c
    /* renamed from: a */
    public final Type mo11591a() {
        Type a = this.f14673e.mo11591a();
        C89219l.m154716b(a, "");
        return a;
    }

    static {
        Covode.recordClassIndex(6421);
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c
    /* renamed from: a */
    public final <R> T mo11590a(AbstractC21983b<R> bVar) {
        C89219l.m154721d(bVar, "");
        Request request = bVar.request();
        Map<String, AbstractC5796a.EnumC5797a> map = f14669b;
        C89219l.m154716b(request, "");
        map.put(C5817a.m12754a(request), this.f14672a);
        return this.f14673e.mo11590a(bVar);
    }

    public C5816m(AbstractC22019c<T> cVar, AbstractC5796a.EnumC5797a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        this.f14673e = cVar;
        this.f14672a = aVar;
    }
}
