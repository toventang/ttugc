package com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3617d.C65605a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72676o;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73925y;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.g.b.c */
public final class C65625c extends AbstractC65626d {

    /* renamed from: b */
    private final Throwable f147947b;

    /* renamed from: c */
    private final String f147948c;

    static {
        Covode.recordClassIndex(77116);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.AbstractC65626d
    /* renamed from: a */
    public final int mo104810a() {
        Throwable th = this.f147947b;
        if (th instanceof C73925y) {
            return (int) ((C73925y) th).getErrorCode();
        }
        return 14;
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.AbstractC65626d
    /* renamed from: b */
    public final EnumC72676o mo104811b() {
        File file = new File(this.f147948c);
        if (this.f147947b instanceof C65605a) {
            return EnumC72676o.CLIENT;
        }
        if (!file.exists() || file.length() == 0) {
            return EnumC72676o.CLIENT;
        }
        if (this.f147947b instanceof C73925y) {
            return EnumC72676o.UPLOAD_SDK;
        }
        return EnumC72676o.CLIENT;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65625c(Throwable th, String str) {
        super(th);
        C89219l.m154721d(th, "");
        C89219l.m154721d(str, "");
        this.f147947b = th;
        this.f147948c = str;
    }
}
