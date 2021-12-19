package com.p2082ss.android.ugc.aweme.ecommerce.coupon.event;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.event.a */
public abstract class AbstractC44327a extends AbstractC45535a {

    /* renamed from: a */
    public static final C44328a f103383a = new C44328a((byte) 0);

    static {
        Covode.recordClassIndex(52642);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.event.a$a */
    public static final class C44328a {
        static {
            Covode.recordClassIndex(52643);
        }

        private C44328a() {
        }

        public /* synthetic */ C44328a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return new HashMap<>();
    }

    /* renamed from: a */
    public final AbstractC44327a mo75230a(LinkedHashMap<String, Object> linkedHashMap) {
        C89219l.m154721d(linkedHashMap, "");
        this.f106050k.putAll(linkedHashMap);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC44327a(String str) {
        super(str);
        C89219l.m154721d(str, "");
        LinkedHashMap<String, Object> linkedHashMap = this.f106050k;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("coupon_zone", "actionsheet");
        linkedHashMap.put("is_fullscreen", 0);
    }
}
