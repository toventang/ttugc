package com.p2082ss.android.ugc.aweme.editSticker.p2883f;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28020m;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.f.e */
public final class C45887e {
    static {
        Covode.recordClassIndex(54411);
    }

    /* renamed from: a */
    public static final void m88531a(InteractStickerStruct interactStickerStruct, List<? extends BaseTrackTimeStamp> list) {
        C89219l.m154721d(interactStickerStruct, "");
        C89219l.m154721d(list, "");
        if (C84892d.m145850a(list)) {
            interactStickerStruct.setTrackList("");
            return;
        }
        try {
            interactStickerStruct.setTrackList(C45866d.m88489b().mo46674b(list));
        } catch (C28020m unused) {
        }
    }
}
