package com.p2082ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.b */
public final class C75588b {

    /* renamed from: a */
    public final Effect f169916a;

    /* renamed from: b */
    public final int f169917b;

    /* renamed from: c */
    public final int f169918c;

    /* renamed from: d */
    public final boolean f169919d;

    /* renamed from: e */
    public final boolean f169920e;

    static {
        Covode.recordClassIndex(88513);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75588b)) {
            return false;
        }
        C75588b bVar = (C75588b) obj;
        return C89219l.m154714a(this.f169916a, bVar.f169916a) && this.f169917b == bVar.f169917b && this.f169918c == bVar.f169918c && this.f169919d == bVar.f169919d && this.f169920e == bVar.f169920e;
    }

    public final int hashCode() {
        Effect effect = this.f169916a;
        int hashCode = (((((effect != null ? effect.hashCode() : 0) * 31) + this.f169917b) * 31) + this.f169918c) * 31;
        boolean z = this.f169919d;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        if (!this.f169920e) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "ClickStickerEvent(effect=" + this.f169916a + ", tabIndex=" + this.f169917b + ", myPosition=" + this.f169918c + ", isCancelSelect=" + this.f169919d + ", isChildSticker=" + this.f169920e + ")";
    }

    private /* synthetic */ C75588b() {
        this(null, -1, -1, true, false);
    }

    public C75588b(Effect effect, int i, int i2, boolean z, boolean z2) {
        this.f169916a = effect;
        this.f169917b = i;
        this.f169918c = i2;
        this.f169919d = z;
        this.f169920e = z2;
    }
}
