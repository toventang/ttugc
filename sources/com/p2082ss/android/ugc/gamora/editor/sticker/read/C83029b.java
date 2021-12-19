package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45850a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.b */
public final class C83029b extends C45850a {

    /* renamed from: c */
    public final C83060e f185506c;

    static {
        Covode.recordClassIndex(96902);
    }

    /* renamed from: c */
    public final boolean mo128114c() {
        if (this.f185506c.f185600f == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f106810b.getEffectId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C83029b) {
            return C89219l.m154714a((Object) ((C45850a) obj).f106810b.getEffectId(), (Object) this.f106810b.getEffectId());
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83029b(Effect effect, C83060e eVar) {
        super(effect);
        C89219l.m154721d(effect, "");
        C89219l.m154721d(eVar, "");
        this.f185506c = eVar;
    }
}
