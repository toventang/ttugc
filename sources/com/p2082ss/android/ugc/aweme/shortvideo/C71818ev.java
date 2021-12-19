package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ev */
public class C71818ev extends RuntimeException {

    /* renamed from: a */
    private boolean f160956a;

    /* renamed from: b */
    private boolean f160957b;

    static {
        Covode.recordClassIndex(84363);
    }

    public boolean isRecover() {
        return this.f160956a;
    }

    public boolean isUserNetworkBad() {
        return this.f160957b;
    }

    public boolean isCauseByApiServerException() {
        return getCause() instanceof C34485a;
    }

    public boolean isCauseByNoSpaceLeft() {
        if (!(getCause() instanceof C71798ef) || ((C71798ef) getCause()).getCode() != 100101) {
            return false;
        }
        return true;
    }

    public C71818ev(Throwable th) {
        super(th);
    }

    public void setRecover(boolean z) {
        this.f160956a = z;
    }

    public C71818ev(Throwable th, boolean z) {
        super(th);
        this.f160957b = z;
    }
}
