package com.p2082ss.android.ugc.aweme.views.mention;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.views.mention.a */
public final /* synthetic */ class C81452a implements Comparator {

    /* renamed from: a */
    private final Editable f182061a;

    static {
        Covode.recordClassIndex(94824);
    }

    C81452a(Editable editable) {
        this.f182061a = editable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Editable editable = this.f182061a;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }
}
