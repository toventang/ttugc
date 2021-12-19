package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1270b.C18141a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38518e;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40545l;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.k */
public final class C38513k extends AbstractC38498a {

    /* renamed from: O */
    public static final C38514a f91020O = new C38514a((byte) 0);

    static {
        Covode.recordClassIndex(46039);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.k$a */
    public static final class C38514a {
        static {
            Covode.recordClassIndex(46040);
        }

        private C38514a() {
        }

        public /* synthetic */ C38514a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        if (this.f90952d.length() == 0) {
            return false;
        }
        return C38518e.m78109a(this.f90952d);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        Intent c = mo67052c();
        String str = this.f90952d;
        if (!(str == null || str.length() == 0)) {
            C40538e.m81839a();
            C40538e.m81840a(new C40545l(str, "Jump directly to open the landing page"));
        }
        if (!C38497a.f90936a.mo65626b()) {
            return C38518e.m78108a(this.f43206b, c);
        }
        C38497a.f90936a.mo65614a(this.f43206b, this.f90952d, this.f90953e, m78091a(c));
        return new C18148g(true);
    }

    /* renamed from: a */
    private static Bundle m78091a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: a */
    public final void mo28926a(boolean z) {
        C18141a b = this.f43207c.mo28929b();
        if (b instanceof AwemeRawAd) {
            C18129a.m33746a(this.f90961m, "open_url_h5", (AwemeRawAd) b).mo28901b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38513k(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
    }
}
