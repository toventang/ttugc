package com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75710p;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76192k;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel */
public final class StickerStatesStoreViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final Map<String, AbstractC76150f> f171619a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(89355);
    }

    /* renamed from: a */
    public final AbstractC76150f mo120113a(AbstractC75710p pVar, String str) {
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(str, "");
        AbstractC76150f fVar = this.f171619a.get(str);
        if (fVar != null) {
            return fVar;
        }
        C76192k kVar = new C76192k(pVar);
        this.f171619a.put(str, kVar);
        return kVar;
    }
}
