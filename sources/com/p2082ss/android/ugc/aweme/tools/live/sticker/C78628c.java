package com.p2082ss.android.ugc.aweme.tools.live.sticker;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75345d;
import com.p2082ss.android.ugc.aweme.sticker.p3964l.AbstractC75413a;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75432j;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75433k;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.c */
public final class C78628c implements AbstractC75429h {

    /* renamed from: a */
    public AbstractC75413a f176687a;

    static {
        Covode.recordClassIndex(91768);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118951a(long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118953a(Effect effect, boolean z, String str) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118955a(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118956a(String str, long j) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final AbstractC75432j mo118950a() {
        return C75433k.f169514a;
    }

    private C78628c() {
        this.f176687a = null;
    }

    public /* synthetic */ C78628c(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118952a(Effect effect, String str, String str2, int i) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str2, "");
        effect.getEffectId();
        if (this.f176687a != null && C75345d.m132152a(effect) == null) {
            C89219l.m154715b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118954a(Effect effect, boolean z, String str, String str2, int i, boolean z2, Bundle bundle) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str2, "");
        effect.getEffectId();
        if (this.f176687a != null && C75345d.m132152a(effect) == null) {
            C89219l.m154715b();
        }
    }
}
