package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.p2082ss.android.ugc.aweme.shortvideo.TTUploaderService;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ei */
public final /* synthetic */ class CallableC71803ei implements Callable {

    /* renamed from: a */
    static final Callable f160909a = new CallableC71803ei();

    static {
        Covode.recordClassIndex(84348);
    }

    private CallableC71803ei() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C27646l.m55298a(TTUploaderService.m123219b().getUploadAuthKeyConfig(new HashMap(0)), new TTUploaderService.C69739a(0), C27659u.EnumC27662a.INSTANCE);
        return null;
    }
}
