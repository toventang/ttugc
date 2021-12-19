package com.p2082ss.android.ugc.aweme.editSticker.compile;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.editSticker.compile.h */
public final class C45865h extends AbstractC45860c {
    static {
        Covode.recordClassIndex(54389);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.compile.AbstractC45860c
    /* renamed from: a */
    public final String mo77213a(String str, int i) {
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        return str + "text_sticker_" + i + ".png";
    }
}
