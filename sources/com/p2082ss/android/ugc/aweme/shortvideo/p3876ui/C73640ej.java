package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ej */
public final /* synthetic */ class C73640ej implements Comparator {

    /* renamed from: a */
    static final Comparator f165466a = new C73640ej();

    static {
        Covode.recordClassIndex(86378);
    }

    private C73640ej() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((AVTextExtraStruct) obj).getStart(), ((AVTextExtraStruct) obj2).getStart());
    }
}
