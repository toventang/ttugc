package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.a.h */
public final class C84540h {

    /* renamed from: a */
    public final Effect f188936a;

    /* renamed from: b */
    public final C84549q f188937b;

    /* renamed from: c */
    public final Integer f188938c;

    /* renamed from: d */
    public final Exception f188939d;

    static {
        Covode.recordClassIndex(98505);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84540h)) {
            return false;
        }
        C84540h hVar = (C84540h) obj;
        return C89219l.m154714a(this.f188936a, hVar.f188936a) && C89219l.m154714a(this.f188937b, hVar.f188937b) && C89219l.m154714a(this.f188938c, hVar.f188938c) && C89219l.m154714a(this.f188939d, hVar.f188939d);
    }

    public final int hashCode() {
        Effect effect = this.f188936a;
        int i = 0;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        C84549q qVar = this.f188937b;
        int hashCode2 = (hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31;
        Integer num = this.f188938c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Exception exc = this.f188939d;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "InfoStickerDownloadEvent(effect=" + this.f188936a + ", info=" + this.f188937b + ", progress=" + this.f188938c + ", exception=" + this.f188939d + ")";
    }

    public /* synthetic */ C84540h(Effect effect, C84549q qVar) {
        this(effect, qVar, null, null);
    }

    public C84540h(Effect effect, C84549q qVar, Integer num, Exception exc) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(qVar, "");
        this.f188936a = effect;
        this.f188937b = qVar;
        this.f188938c = num;
        this.f188939d = exc;
    }
}
