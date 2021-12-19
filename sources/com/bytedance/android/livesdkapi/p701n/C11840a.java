package com.bytedance.android.livesdkapi.p701n;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.n.a */
public final class C11840a implements AbstractC81914b {

    /* renamed from: d */
    public static final C11841a f28226d = new C11841a((byte) 0);

    /* renamed from: a */
    public final AbstractC11842b f28227a;

    /* renamed from: b */
    public final Bundle f28228b;

    /* renamed from: c */
    public final Map<String, String> f28229c;

    /* renamed from: com.bytedance.android.livesdkapi.n.a$b */
    public interface AbstractC11842b {
        static {
            Covode.recordClassIndex(13544);
        }

        /* renamed from: a */
        void mo18915a();

        /* renamed from: b */
        void mo18916b();
    }

    static {
        Covode.recordClassIndex(13542);
    }

    /* renamed from: com.bytedance.android.livesdkapi.n.a$a */
    public static final class C11841a {
        static {
            Covode.recordClassIndex(13543);
        }

        private C11841a() {
        }

        public /* synthetic */ C11841a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Map<String, String> m20842a(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                C89219l.m154716b(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    C89219l.m154716b(string, "");
                    hashMap.put(next, string);
                }
            }
            return hashMap;
        }
    }

    public C11840a(AbstractC11842b bVar, Bundle bundle, Map<String, String> map) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(map, "");
        this.f28227a = bVar;
        this.f28228b = bundle;
        this.f28229c = map;
    }
}
