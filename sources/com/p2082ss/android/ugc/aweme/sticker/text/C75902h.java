package com.p2082ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.sticker.text.h */
public final /* synthetic */ class C75902h implements AbstractC27235f {

    /* renamed from: a */
    static final AbstractC27235f f170477a = new C75902h();

    static {
        Covode.recordClassIndex(88842);
    }

    private C75902h() {
    }

    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final Object mo45319a(Object obj) {
        return C46110t.m88973i(((TextStickerData) C63244g.m114602a().mo73261G().mo46670a(((StickerItemModel) obj).extra, TextStickerData.class)).getTextWrapList());
    }
}
