package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.i */
public abstract class AbstractC44612i extends AbstractC45535a {

    /* renamed from: a */
    public static final C44613a f104079a = new C44613a((byte) 0);

    static {
        Covode.recordClassIndex(52979);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.i$a */
    public static final class C44613a {
        static {
            Covode.recordClassIndex(52980);
        }

        private C44613a() {
        }

        public /* synthetic */ C44613a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return new HashMap<>();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC44612i(String str) {
        super(str);
        C89219l.m154721d(str, "");
        LinkedHashMap<String, Object> linkedHashMap = this.f106050k;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "Personal_Home_Page");
    }
}
