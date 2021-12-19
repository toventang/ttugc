package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.c */
public abstract class AbstractC44600c extends AbstractC45535a {

    /* renamed from: b */
    public static final C44601a f104072b = new C44601a((byte) 0);

    /* renamed from: a */
    private long f104073a;

    static {
        Covode.recordClassIndex(52967);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.c$a */
    public static final class C44601a {
        static {
            Covode.recordClassIndex(52968);
        }

        private C44601a() {
        }

        public /* synthetic */ C44601a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return new HashMap<>();
    }

    /* renamed from: b */
    public final AbstractC44600c mo75662b() {
        this.f104073a = SystemClock.uptimeMillis();
        return this;
    }

    /* renamed from: c */
    public final AbstractC44600c mo75664c() {
        if (this.f104073a > 0) {
            this.f106050k.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.f104073a));
            this.f104073a = 0;
        }
        return this;
    }

    /* renamed from: a */
    public final AbstractC44600c mo75661a(String str) {
        C89219l.m154721d(str, "");
        this.f106050k.put("previous_page", str);
        return this;
    }

    /* renamed from: b */
    public final AbstractC44600c mo75663b(String str) {
        C89219l.m154721d(str, "");
        this.f106050k.put("tab_name", str);
        return this;
    }

    /* renamed from: c */
    public final AbstractC44600c mo75665c(String str) {
        C89219l.m154721d(str, "");
        this.f106050k.put("tab_id", str);
        return this;
    }

    /* renamed from: d */
    public final AbstractC44600c mo75666d(String str) {
        C89219l.m154721d(str, "");
        this.f106050k.put("button_for", str);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC44600c(String str) {
        super(str);
        C89219l.m154721d(str, "");
        LinkedHashMap<String, Object> linkedHashMap = this.f106050k;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "ecommerce_centre_page");
    }
}
