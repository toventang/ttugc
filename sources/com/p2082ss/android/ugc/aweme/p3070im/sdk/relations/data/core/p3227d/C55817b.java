package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3227d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import java.util.Comparator;
import java.util.Map;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b */
public final class C55817b extends AbstractC55816a<C19638h> {

    /* renamed from: b */
    public static final C55818a f127247b = new C55818a((byte) 0);

    static {
        Covode.recordClassIndex(65603);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b$a */
    public static final class C55818a {
        static {
            Covode.recordClassIndex(65604);
        }

        private C55818a() {
        }

        public /* synthetic */ C55818a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55817b(C55732c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b$b */
    public static final class C55819b<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ Map f127248a;

        /* renamed from: b */
        final /* synthetic */ Map f127249b;

        static {
            Covode.recordClassIndex(65605);
        }

        public C55819b(Map map, Map map2) {
            this.f127248a = map;
            this.f127249b = map2;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Integer num = (Integer) this.f127248a.get(obj);
            Integer num2 = (Integer) this.f127248a.get(obj2);
            if (!C89219l.m154714a(num, num2)) {
                return C89090a.m154604a(num2, num);
            }
            return C89090a.m154604a((Long) this.f127249b.get(obj2), (Long) this.f127249b.get(obj));
        }
    }
}
