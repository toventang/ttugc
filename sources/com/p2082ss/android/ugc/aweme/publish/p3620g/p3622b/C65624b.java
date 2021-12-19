package com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.publish.p3617d.C65605a;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72676o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.g.b.b */
public final class C65624b extends AbstractC65626d {

    /* renamed from: b */
    private final Throwable f147946b;

    static {
        Covode.recordClassIndex(77115);
    }

    /* renamed from: c */
    private static boolean m117439c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.AbstractC65626d
    /* renamed from: a */
    public final int mo104810a() {
        return C65630a.m117450a(this.f147946b, 13);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.AbstractC65626d
    /* renamed from: b */
    public final EnumC72676o mo104811b() {
        if (this.f147946b instanceof C65605a) {
            return EnumC72676o.CLIENT;
        }
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m117439c();
        }
        if (C58029j.f132253e) {
            return EnumC72676o.CLIENT;
        }
        return EnumC72676o.SERVER;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65624b(Throwable th) {
        super(th);
        C89219l.m154721d(th, "");
        this.f147946b = th;
    }
}
