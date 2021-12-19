package com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3617d.C65605a;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72676o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.g.b.e */
public final class C65627e extends AbstractC65626d {

    /* renamed from: b */
    private final Throwable f147950b;

    static {
        Covode.recordClassIndex(77118);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.AbstractC65626d
    /* renamed from: a */
    public final int mo104810a() {
        return C65630a.m117453b(this.f147950b);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.AbstractC65626d
    /* renamed from: b */
    public final EnumC72676o mo104811b() {
        Throwable th = this.f147950b;
        if (th instanceof C65605a) {
            return EnumC72676o.CLIENT;
        }
        if (C65630a.m117452a(th)) {
            return EnumC72676o.CLIENT;
        }
        return EnumC72676o.VESDK;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65627e(Throwable th) {
        super(th);
        C89219l.m154721d(th, "");
        this.f147950b = th;
    }
}
