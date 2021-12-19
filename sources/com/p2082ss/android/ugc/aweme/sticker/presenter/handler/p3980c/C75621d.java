package com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.c.d */
public final class C75621d extends AbstractC75620c {

    /* renamed from: a */
    public final Effect f170028a;

    /* renamed from: b */
    public final int f170029b;

    /* renamed from: c */
    public final EnumC75295a f170030c;

    /* renamed from: d */
    public final boolean f170031d;

    /* renamed from: e */
    public final Bundle f170032e;

    static {
        Covode.recordClassIndex(88552);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c
    /* renamed from: a */
    public final Effect mo119346a() {
        return this.f170028a;
    }

    public final int hashCode() {
        int i;
        int i2;
        Effect effect = this.f170028a;
        int i3 = 0;
        if (effect != null) {
            i = effect.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((i * 31) + this.f170029b) * 31;
        EnumC75295a aVar = this.f170030c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        boolean z = this.f170031d;
        if (z) {
            z = true;
        }
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        Bundle bundle = this.f170032e;
        if (bundle != null) {
            i3 = bundle.hashCode();
        }
        return i9 + i3;
    }

    public final String toString() {
        return "UnselectedStickerHandleSession(sticker=" + this.f170028a + ", clickPosition=" + this.f170029b + ", requestSource=" + this.f170030c + ", interceptLoad=" + this.f170031d + ", extraData=" + this.f170032e + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75621d)) {
            return false;
        }
        C75621d dVar = (C75621d) obj;
        if (!C89219l.m154714a(this.f170028a, dVar.f170028a) || this.f170029b != dVar.f170029b || !C89219l.m154714a(this.f170030c, dVar.f170030c) || this.f170031d != dVar.f170031d || !C89219l.m154714a(this.f170032e, dVar.f170032e)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C75621d(Effect effect, int i, EnumC75295a aVar, Bundle bundle) {
        super((byte) 0);
        C89219l.m154721d(aVar, "");
        this.f170028a = effect;
        this.f170029b = i;
        this.f170030c = aVar;
        this.f170031d = false;
        this.f170032e = bundle;
    }

    public /* synthetic */ C75621d(Effect effect, int i, EnumC75295a aVar, Bundle bundle, byte b) {
        this(effect, i, aVar, bundle);
    }
}
