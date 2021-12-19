package com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.c.a */
public final class C75618a extends AbstractC75620c {

    /* renamed from: a */
    public final Effect f170022a;

    /* renamed from: b */
    public final int f170023b;

    /* renamed from: c */
    public final EnumC75295a f170024c;

    /* renamed from: d */
    public final boolean f170025d;

    /* renamed from: e */
    public final Bundle f170026e;

    static {
        Covode.recordClassIndex(88549);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C75618a m132676a(Effect effect, int i, EnumC75295a aVar, Bundle bundle) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(aVar, "");
        return new C75618a(effect, i, aVar, true, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c
    /* renamed from: a */
    public final Effect mo119346a() {
        return this.f170022a;
    }

    public final int hashCode() {
        int i;
        int i2;
        Effect effect = this.f170022a;
        int i3 = 0;
        if (effect != null) {
            i = effect.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((i * 31) + this.f170023b) * 31;
        EnumC75295a aVar = this.f170024c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        boolean z = this.f170025d;
        if (z) {
            z = true;
        }
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        Bundle bundle = this.f170026e;
        if (bundle != null) {
            i3 = bundle.hashCode();
        }
        return i9 + i3;
    }

    public final String toString() {
        return "SelectedStickerHandleSession(sticker=" + this.f170022a + ", clickPosition=" + this.f170023b + ", requestSource=" + this.f170024c + ", interceptLoad=" + this.f170025d + ", extraData=" + this.f170026e + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75618a)) {
            return false;
        }
        C75618a aVar = (C75618a) obj;
        if (!C89219l.m154714a(this.f170022a, aVar.f170022a) || this.f170023b != aVar.f170023b || !C89219l.m154714a(this.f170024c, aVar.f170024c) || this.f170025d != aVar.f170025d || !C89219l.m154714a(this.f170026e, aVar.f170026e)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C75618a(Effect effect, int i, EnumC75295a aVar, Bundle bundle) {
        this(effect, i, aVar, false, bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C75618a(Effect effect, int i, EnumC75295a aVar, boolean z, Bundle bundle) {
        super((byte) 0);
        C89219l.m154721d(effect, "");
        C89219l.m154721d(aVar, "");
        this.f170022a = effect;
        this.f170023b = i;
        this.f170024c = aVar;
        this.f170025d = z;
        this.f170026e = bundle;
    }
}
