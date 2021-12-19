package com.p2082ss.android.ugc.aweme.sticker.panel;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76182g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.e */
public final class C75520e {

    /* renamed from: a */
    public int f169725a;

    /* renamed from: b */
    public boolean f169726b;

    /* renamed from: c */
    public AbstractC89172b<? super View, C89391z> f169727c;

    /* renamed from: d */
    public AbstractC89172b<? super Boolean, Boolean> f169728d;

    /* renamed from: e */
    public int f169729e;

    /* renamed from: f */
    public AbstractC89172b<? super C76182g.C76183a, C89391z> f169730f;

    static {
        Covode.recordClassIndex(88442);
    }

    public C75520e() {
        this(false, null, null, 0, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75520e)) {
            return false;
        }
        C75520e eVar = (C75520e) obj;
        return this.f169725a == eVar.f169725a && this.f169726b == eVar.f169726b && C89219l.m154714a(this.f169727c, eVar.f169727c) && C89219l.m154714a(this.f169728d, eVar.f169728d) && this.f169729e == eVar.f169729e && C89219l.m154714a(this.f169730f, eVar.f169730f);
    }

    public final int hashCode() {
        int i = this.f169725a * 31;
        boolean z = this.f169726b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        AbstractC89172b<? super View, C89391z> bVar = this.f169727c;
        int i6 = 0;
        int hashCode = (i5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AbstractC89172b<? super Boolean, Boolean> bVar2 = this.f169728d;
        int hashCode2 = (((hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31) + this.f169729e) * 31;
        AbstractC89172b<? super C76182g.C76183a, C89391z> bVar3 = this.f169730f;
        if (bVar3 != null) {
            i6 = bVar3.hashCode();
        }
        return hashCode2 + i6;
    }

    public final String toString() {
        return "ReverseCameraConfigure(topMargin=" + this.f169725a + ", usingTextInToolBar=" + this.f169726b + ", onSwitchCamera=" + this.f169727c + ", interceptCameraReverse=" + this.f169728d + ", cameraIconResId=" + this.f169729e + ", viewConfigureBuilder=" + this.f169730f + ")";
    }

    private C75520e(boolean z, AbstractC89172b<? super View, C89391z> bVar, AbstractC89172b<? super Boolean, Boolean> bVar2, int i, AbstractC89172b<? super C76182g.C76183a, C89391z> bVar3) {
        this.f169725a = 0;
        this.f169726b = z;
        this.f169727c = bVar;
        this.f169728d = bVar2;
        this.f169729e = i;
        this.f169730f = bVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C75520e(boolean z, AbstractC89172b bVar, AbstractC89172b bVar2, int i, AbstractC89172b bVar3, int i2) {
        this((i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? null : bVar, (i2 & 8) != 0 ? null : bVar2, (i2 & 16) != 0 ? 2131232557 : i, (i2 & 32) == 0 ? bVar3 : null);
    }
}
