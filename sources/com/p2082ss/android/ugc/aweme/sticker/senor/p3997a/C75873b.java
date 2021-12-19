package com.p2082ss.android.ugc.aweme.sticker.senor.p3997a;

import android.content.Context;
import android.view.OrientationEventListener;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75877c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.b */
public final class C75873b extends OrientationEventListener {

    /* renamed from: a */
    private final AbstractC75877c f170422a;

    static {
        Covode.recordClassIndex(88807);
    }

    public final void onOrientationChanged(int i) {
        if (i <= 45 || i > 315) {
            i = 0;
        } else if (46 <= i && 135 >= i) {
            i = 90;
        } else if (136 <= i && 225 >= i) {
            i = LiveFeedRefreshTimeSetting.DEFAULT;
        } else if (i > 225) {
            i = 270;
        }
        this.f170422a.mo23149a((float) i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75873b(Context context, AbstractC75877c cVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        this.f170422a = cVar;
    }
}
