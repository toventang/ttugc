package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.m */
public final /* synthetic */ class C74154m implements Comparator {

    /* renamed from: a */
    private final Editable f166556a;

    static {
        Covode.recordClassIndex(86913);
    }

    C74154m(Editable editable) {
        this.f166556a = editable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Editable editable = this.f166556a;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }
}
