package com.p2082ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.sticker.text.i */
public final /* synthetic */ class C75903i implements Comparator {

    /* renamed from: a */
    static final Comparator f170478a = new C75903i();

    static {
        Covode.recordClassIndex(88843);
    }

    private C75903i() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((StickerItemModel) obj).startTime - ((StickerItemModel) obj2).startTime;
    }
}
