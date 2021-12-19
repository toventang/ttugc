package com.bytedance.creativex.recorder.sticker.p947a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.sticker.a.b */
public abstract class AbstractC14331b {
    static {
        Covode.recordClassIndex(16404);
    }

    private AbstractC14331b() {
    }

    public /* synthetic */ AbstractC14331b(byte b) {
        this();
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.a.b$a */
    public static final class C14332a extends AbstractC14331b {

        /* renamed from: a */
        public final Effect f34705a;

        static {
            Covode.recordClassIndex(16405);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C14332a) && C89219l.m154714a(this.f34705a, ((C14332a) obj).f34705a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f34705a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Show(effect=" + this.f34705a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14332a(Effect effect) {
            super((byte) 0);
            C89219l.m154721d(effect, "");
            this.f34705a = effect;
        }
    }
}
