package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.p */
public final /* synthetic */ class C74157p implements Comparator {

    /* renamed from: a */
    private final Editable f166558a;

    static {
        Covode.recordClassIndex(86916);
    }

    C74157p(Editable editable) {
        this.f166558a = editable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Editable editable = this.f166558a;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }
}
