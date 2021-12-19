package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25981gj;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.hh */
public final class C26011hh implements AbstractC26040ij {

    /* renamed from: b */
    private static final AbstractC26021hr f61286b = new C26009hf();

    /* renamed from: a */
    private final AbstractC26021hr f61287a;

    static {
        Covode.recordClassIndex(31426);
    }

    public C26011hh() {
        this(new C26013hj(C25978gg.f61234a, m50654a()));
    }

    /* renamed from: a */
    private static AbstractC26021hr m50654a() {
        try {
            return (AbstractC26021hr) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f61286b;
        }
    }

    private C26011hh(AbstractC26021hr hrVar) {
        this.f61287a = (AbstractC26021hr) C25989gm.m50601a((Object) hrVar, "messageInfoFactory");
    }

    /* renamed from: a */
    private static boolean m50655a(AbstractC26018ho hoVar) {
        if (hoVar.mo42689a() == AbstractC25981gj.C25986e.f61250h) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26040ij
    /* renamed from: a */
    public final <T> AbstractC26041ik<T> mo42669a(Class<T> cls) {
        if (AbstractC25981gj.class.isAssignableFrom(cls) || C26043im.f61345a == null || C26043im.f61345a.isAssignableFrom(cls)) {
            AbstractC26018ho b = this.f61287a.mo42612b(cls);
            if (b.mo42690b()) {
                if (AbstractC25981gj.class.isAssignableFrom(cls)) {
                    return C26026hw.m50750a(C26043im.f61348d, C25970fz.f61162a, b.mo42691c());
                }
                return C26026hw.m50750a(C26043im.f61346b, C25970fz.m50538a(), b.mo42691c());
            } else if (AbstractC25981gj.class.isAssignableFrom(cls)) {
                if (m50655a(b)) {
                    return C26024hu.m50703a(b, C26031ia.f61327b, AbstractC26004ha.f61281b, C26043im.f61348d, C25970fz.f61162a, C26019hp.f61296b);
                }
                return C26024hu.m50703a(b, C26031ia.f61327b, AbstractC26004ha.f61281b, C26043im.f61348d, (AbstractC25968fx<?>) null, C26019hp.f61296b);
            } else if (m50655a(b)) {
                return C26024hu.m50703a(b, C26031ia.f61326a, AbstractC26004ha.f61280a, C26043im.f61346b, C25970fz.m50538a(), C26019hp.f61295a);
            } else {
                return C26024hu.m50703a(b, C26031ia.f61326a, AbstractC26004ha.f61280a, C26043im.f61347c, (AbstractC25968fx<?>) null, C26019hp.f61295a);
            }
        } else {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
