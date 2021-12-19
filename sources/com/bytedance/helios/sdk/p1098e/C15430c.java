package com.bytedance.helios.sdk.p1098e;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15481c;
import com.bytedance.helios.sdk.utils.C15482d;
import com.google.gson.p2019b.C27895a;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.e.c */
public final class C15430c {

    /* renamed from: a */
    public static C15428a<Map<String, Object>> f37669a;

    /* renamed from: b */
    public static final C15430c f37670b = new C15430c();

    /* renamed from: c */
    private static final Type f37671c;

    /* renamed from: com.bytedance.helios.sdk.e.c$b */
    public static final class C15432b extends C27895a<List<? extends HashMap<String, Object>>> {
        static {
            Covode.recordClassIndex(17684);
        }

        C15432b() {
        }
    }

    /* renamed from: com.bytedance.helios.sdk.e.c$c */
    public static final class C15433c implements AbstractC15429b<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(17685);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.helios.sdk.e.a<java.util.Map<java.lang.String, java.lang.Object>>] */
        @Override // com.bytedance.helios.sdk.p1098e.AbstractC15429b
        /* renamed from: a */
        public final void mo25163a(C15428a<Map<String, ? extends Object>> aVar) {
            C89219l.m154719c(aVar, "");
        }

        C15433c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.helios.sdk.e.a, java.lang.Object, boolean] */
        @Override // com.bytedance.helios.sdk.p1098e.AbstractC15429b
        /* renamed from: a */
        public final /* synthetic */ void mo25164a(C15428a<Map<String, ? extends Object>> aVar, Map<String, ? extends Object> map, boolean z) {
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(map, "");
            if (z) {
                C15482d.m28488b("region", C15481c.m28482a(C15430c.f37669a));
            }
        }
    }

    private C15430c() {
    }

    /* renamed from: a */
    public static String m28383a() {
        Object obj;
        List j;
        try {
            C15428a<Map<String, Object>> aVar = f37669a;
            if (aVar == null || (j = C89070n.m154590j(aVar)) == null) {
                obj = null;
            } else {
                obj = C89070n.m154553a((Iterable) j, (Comparator) new C15431a());
            }
        } catch (Exception unused) {
            obj = f37669a;
        }
        return C15481c.m28482a(obj);
    }

    static {
        C15428a<Map<String, Object>> aVar;
        Covode.recordClassIndex(17682);
        Type type = new C15432b().type;
        C89219l.m154709a((Object) type, "");
        f37671c = type;
        String a = C15482d.m28485a("region");
        C15433c cVar = new C15433c();
        if (a.length() == 0) {
            aVar = new C15428a<>(20, cVar, null, 4, null);
        } else {
            Collection collection = (List) C15481c.m28481a(a, type);
            if (collection == null) {
                collection = C89086z.INSTANCE;
            }
            aVar = new C15428a<>(20, cVar, collection);
        }
        f37669a = aVar;
    }

    /* renamed from: com.bytedance.helios.sdk.e.c$a */
    public static final class C15431a<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(17683);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Object obj = t.get("event_time_stamp");
            String str = null;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str2 = (String) obj;
            Object obj2 = t2.get("event_time_stamp");
            if (obj2 instanceof String) {
                str = obj2;
            }
            return C89090a.m154604a(str2, str);
        }
    }
}
