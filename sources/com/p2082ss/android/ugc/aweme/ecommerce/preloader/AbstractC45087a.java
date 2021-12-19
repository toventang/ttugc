package com.p2082ss.android.ugc.aweme.ecommerce.preloader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.a */
public abstract class AbstractC45087a extends AbstractC45535a {

    /* renamed from: a */
    public static final C45088a f105130a = new C45088a((byte) 0);

    static {
        Covode.recordClassIndex(53518);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.a$a */
    public static final class C45088a {
        static {
            Covode.recordClassIndex(53519);
        }

        private C45088a() {
        }

        public /* synthetic */ C45088a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return new HashMap<>();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC45087a(String str) {
        super(str);
        C89219l.m154721d(str, "");
        this.f106050k.put("EVENT_ORIGIN_FEATURE", "TEMAI");
    }
}
