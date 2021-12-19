package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2361az.AbstractC34399a;
import com.p2082ss.android.ugc.aweme.property.C65444e;
import com.p2082ss.android.ugc.aweme.setting.C68065d;

/* renamed from: com.ss.android.ugc.aweme.services.ImportVideoServiceImpl */
public final class ImportVideoServiceImpl implements AbstractC34399a {
    static {
        Covode.recordClassIndex(79651);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2361az.AbstractC34399a
    public final long importLongVideoThreshold() {
        return C68065d.m120371a();
    }

    public final boolean isImportLongVideoAllowed() {
        return C65444e.m117163a();
    }
}
