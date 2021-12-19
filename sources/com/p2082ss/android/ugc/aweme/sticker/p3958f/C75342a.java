package com.p2082ss.android.ugc.aweme.sticker.p3958f;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75297c;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75298d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.f.a */
public final class C75342a {
    static {
        Covode.recordClassIndex(88260);
    }

    /* renamed from: a */
    public static final C75298d m132144a(EnumC75295a aVar) {
        C89219l.m154721d(aVar, "");
        return new C75298d(aVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C75297c m132143a(Effect effect, int i, EnumC75295a aVar, Effect effect2, Bundle bundle, AbstractC75374c.AbstractC75375a aVar2, AbstractC75374c.AbstractC75376b bVar, int i2, boolean z, int i3) {
        boolean z2 = z;
        int i4 = i2;
        AbstractC75374c.AbstractC75375a aVar3 = aVar2;
        int i5 = i;
        Effect effect3 = effect2;
        EnumC75295a aVar4 = aVar;
        Bundle bundle2 = bundle;
        if ((i3 & 1) != 0) {
            i5 = -1;
        }
        if ((i3 & 2) != 0) {
            aVar4 = EnumC75295a.UI_CLICK;
        }
        AbstractC75374c.AbstractC75376b bVar2 = null;
        if ((i3 & 4) != 0) {
            effect3 = null;
        }
        if ((i3 & 8) != 0) {
            bundle2 = null;
        }
        if ((i3 & 16) != 0) {
            aVar3 = null;
        }
        if ((i3 & 32) == 0) {
            bVar2 = bVar;
        }
        if ((i3 & 64) != 0) {
            i4 = Integer.MIN_VALUE;
        }
        if ((i3 & 128) != 0) {
            z2 = true;
        }
        C89219l.m154721d(effect, "");
        C89219l.m154721d(aVar4, "");
        return new C75297c(effect, i5, aVar4, effect3, bundle2, aVar3, bVar2, i4, z2);
    }
}
