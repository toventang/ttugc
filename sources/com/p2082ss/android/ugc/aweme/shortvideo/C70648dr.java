package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.dr */
public final /* synthetic */ class C70648dr implements Comparator {

    /* renamed from: a */
    static final Comparator f158129a = new C70648dr();

    static {
        Covode.recordClassIndex(83114);
    }

    private C70648dr() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((InteractStickerStruct) obj).getIndex() - ((InteractStickerStruct) obj2).getIndex();
    }
}
