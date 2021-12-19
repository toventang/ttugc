package com.p2082ss.android.ugc.aweme.common;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.experiment.C46792ci;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.l */
public final class C39143l {

    /* renamed from: a */
    public static final C39143l f92358a = new C39143l();

    private C39143l() {
    }

    static {
        Covode.recordClassIndex(46762);
    }

    /* renamed from: a */
    public static final void m79438a(Activity activity, Throwable th) {
        C34480a aVar;
        Integer valueOf;
        C89219l.m154721d(activity, "");
        if (th != null) {
            if (th instanceof C34485a) {
                aVar = (C34480a) th;
            } else if (th.getCause() instanceof C34485a) {
                Throwable cause = th.getCause();
                if (!(cause instanceof C34485a)) {
                    cause = null;
                }
                aVar = (C34480a) cause;
            } else {
                aVar = null;
            }
            if (C46792ci.m90137a()) {
                if (!(aVar == null || (valueOf = Integer.valueOf(aVar.getErrorCode())) == null)) {
                    if (valueOf.intValue() == 5) {
                        new C23144b(activity).mo37640e(R.string.by5).mo37637b();
                        return;
                    } else if (valueOf.intValue() == 2059) {
                        new C23144b(activity).mo37640e(R.string.by3).mo37637b();
                        return;
                    } else if (valueOf.intValue() == 2065) {
                        new C23144b(activity).mo37640e(R.string.by6).mo37637b();
                        return;
                    } else if (valueOf.intValue() == 2149) {
                        new C23144b(activity).mo37640e(R.string.by9).mo37637b();
                        return;
                    } else if (valueOf.intValue() == 4) {
                        new C23144b(activity).mo37640e(R.string.by8).mo37637b();
                        return;
                    } else if (valueOf != null) {
                        if (valueOf.intValue() == 3231) {
                            new C23144b(activity).mo37640e(R.string.by7).mo37637b();
                            return;
                        } else if (valueOf.intValue() == 3058) {
                            new C23144b(activity).mo37640e(R.string.by7).mo37637b();
                            return;
                        } else if (valueOf.intValue() == 3059) {
                            new C23144b(activity).mo37640e(R.string.by7).mo37637b();
                            return;
                        }
                    }
                }
                new C23144b(activity).mo37640e(R.string.byb).mo37637b();
                return;
            }
            new C23144b(activity).mo37640e(R.string.byb).mo37637b();
        }
    }
}
