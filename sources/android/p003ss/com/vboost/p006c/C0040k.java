package android.p003ss.com.vboost.p006c;

import android.p003ss.com.vboost.CapabilityType;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.ss.com.vboost.c.k */
public class C0040k {

    /* renamed from: a */
    private static final String f140a = C0040k.class.getSimpleName();

    /* renamed from: b */
    private Map<CapabilityType, Object> f141b = new HashMap();

    /* renamed from: c */
    private Map<CapabilityType, Object> f142c = new HashMap();

    /* renamed from: android.ss.com.vboost.c.k$a */
    static class C0041a {

        /* renamed from: a */
        public static final C0040k f143a = new C0040k();

        static {
            Covode.recordClassIndex(44);
        }
    }

    static {
        Covode.recordClassIndex(43);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T extends Map> T mo33a(EnumC0036g gVar, CapabilityType capabilityType) {
        return EnumC0036g.VENDOR == gVar ? (T) ((Map) this.f141b.get(capabilityType)) : (T) ((Map) this.f142c.get(capabilityType));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T extends Map> void mo34a(EnumC0036g gVar, CapabilityType capabilityType, T t) {
        if (EnumC0036g.VENDOR == gVar) {
            this.f141b.put(capabilityType, t);
        } else {
            this.f142c.put(capabilityType, t);
        }
    }
}
