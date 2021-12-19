package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.d */
public final class C46136d {
    static {
        Covode.recordClassIndex(54695);
    }

    /* renamed from: a */
    public static final InnerEffectTextLayoutConfig m89062a(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, float f) {
        C89219l.m154721d(innerEffectTextLayoutConfig, "");
        ArrayList arrayList = new ArrayList();
        for (T t : innerEffectTextLayoutConfig.getTextConfigs()) {
            arrayList.add(InnerEffectTextConfig.copy$default(t, 0, 0, 0, 0, 0, 0, 0, 0, 0, (int) (((float) t.getTextSize()) * f), 0, 0, 0, 0, null, 0, null, 0, 0, null, null, 0, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, 2147483135, null));
        }
        return InnerEffectTextLayoutConfig.copy$default(innerEffectTextLayoutConfig, null, 0, 0.0f, 0, 0, 0, 0, arrayList, null, 383, null);
    }
}
