package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.p */
final /* synthetic */ class C74663p implements Comparator {

    /* renamed from: a */
    static final Comparator f167825a = new C74663p();

    static {
        Covode.recordClassIndex(87486);
    }

    private C74663p() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((C84237e) obj2).getBitRate() - ((C84237e) obj).getBitRate();
    }
}
