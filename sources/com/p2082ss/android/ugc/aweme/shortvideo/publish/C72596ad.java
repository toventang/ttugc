package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30093n;
import com.p2082ss.android.ugc.aweme.property.C65431dn;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ad */
public final class C72596ad implements AbstractC30093n {

    /* renamed from: b */
    public static final C72597a f162754b = new C72597a((byte) 0);

    /* renamed from: a */
    public final C65431dn f162755a;

    static {
        Covode.recordClassIndex(85279);
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: c */
    public final boolean mo53469c() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ad$a */
    public static final class C72597a {
        static {
            Covode.recordClassIndex(85280);
        }

        private C72597a() {
        }

        public /* synthetic */ C72597a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: a */
    public final String mo53467a() {
        return this.f162755a.packageUrl;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: b */
    public final String mo53468b() {
        String str = this.f162755a.scene;
        if (str.length() == 0) {
            return "default";
        }
        return str;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: d */
    public final String mo53470d() {
        if (this.f162755a.type != 3) {
            return "tflite";
        }
        return "bytenn";
    }

    public C72596ad(C65431dn dnVar) {
        C89219l.m154721d(dnVar, "");
        this.f162755a = dnVar;
    }
}
