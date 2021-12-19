package com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3864e;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk;
import com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75382h;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c */
public final class C72874c implements AbstractC63227bk {
    static {
        Covode.recordClassIndex(85566);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk
    /* renamed from: a */
    public final void mo101711a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk
    /* renamed from: a */
    public final String mo101709a() {
        String str = C72869a.f163501a;
        C89219l.m154716b(str, "");
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk
    /* renamed from: a */
    public final void mo101710a(Activity activity) {
        C89219l.m154721d(activity, "");
        C72869a.m128691a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk
    /* renamed from: a */
    public final AbstractC75382h mo101708a(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(onUnlockShareFinishListener, "");
        return new C72870b(str, context, effect, onUnlockShareFinishListener, z);
    }
}
