package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.C84401c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b */
public final class C72845b {
    static {
        Covode.recordClassIndex(85536);
    }

    /* renamed from: a */
    public static final boolean m128621a(String str) {
        C72831a aVar;
        String b = C72847c.m128630b(str, "audio_graph");
        if (b == null || (aVar = (C72831a) C84401c.f188719c.mo46670a(b, C72831a.class)) == null || !aVar.enableMusic()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m128620a(Effect effect) {
        String str;
        C72831a aVar;
        if (effect != null) {
            str = effect.getSdkExtra();
        } else {
            str = null;
        }
        String b = C72847c.m128630b(str, "audio_graph");
        if (b == null || (aVar = (C72831a) C84401c.f188719c.mo46670a(b, C72831a.class)) == null || !aVar.enableMic()) {
            return false;
        }
        return true;
    }
}
