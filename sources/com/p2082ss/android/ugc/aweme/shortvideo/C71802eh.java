package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractC27637e;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.eh */
public final /* synthetic */ class C71802eh implements AbstractC27637e {

    /* renamed from: a */
    static final AbstractC27637e f160908a = new C71802eh();

    static {
        Covode.recordClassIndex(84347);
    }

    private C71802eh() {
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27637e
    /* renamed from: a */
    public final AbstractFutureC27655q mo46254a(Object obj) {
        Throwable th = (Throwable) obj;
        String sdkV4AuthKey = C63244g.m114602a().mo73277e().getSdkV4AuthKey("");
        if (TextUtils.isEmpty(sdkV4AuthKey)) {
            return C27646l.m55296a(th);
        }
        return C27646l.m55295a(C63244g.m114602a().mo73261G().mo46670a(sdkV4AuthKey, C65611c.class));
    }
}
