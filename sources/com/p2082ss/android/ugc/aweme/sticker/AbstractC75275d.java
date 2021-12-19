package com.p2082ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.d */
public abstract class AbstractC75275d {
    static {
        Covode.recordClassIndex(88177);
    }

    private AbstractC75275d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d$c */
    public static final class C75278c extends AbstractC75275d {

        /* renamed from: a */
        public static final C75278c f169244a = new C75278c();

        private C75278c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(88180);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d$e */
    public static final class C75280e extends AbstractC75275d {

        /* renamed from: a */
        public static final C75280e f169246a = new C75280e();

        private C75280e() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(88182);
        }
    }

    public /* synthetic */ AbstractC75275d(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d$a */
    public static final class C75276a extends AbstractC75275d {

        /* renamed from: a */
        public final Effect f169242a;

        static {
            Covode.recordClassIndex(88178);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C75276a) && C89219l.m154714a(this.f169242a, ((C75276a) obj).f169242a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f169242a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "GameEnd(gameSticker=" + this.f169242a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75276a(Effect effect) {
            super((byte) 0);
            C89219l.m154721d(effect, "");
            this.f169242a = effect;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d$b */
    public static final class C75277b extends AbstractC75275d {

        /* renamed from: a */
        public final Effect f169243a;

        static {
            Covode.recordClassIndex(88179);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C75277b) && C89219l.m154714a(this.f169243a, ((C75277b) obj).f169243a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f169243a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "GameEnter(gameSticker=" + this.f169243a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75277b(Effect effect) {
            super((byte) 0);
            C89219l.m154721d(effect, "");
            this.f169243a = effect;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d$d */
    public static final class C75279d extends AbstractC75275d {

        /* renamed from: a */
        public final Effect f169245a;

        static {
            Covode.recordClassIndex(88181);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C75279d) && C89219l.m154714a(this.f169245a, ((C75279d) obj).f169245a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f169245a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "GameReset(gameSticker=" + this.f169245a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75279d(Effect effect) {
            super((byte) 0);
            C89219l.m154721d(effect, "");
            this.f169245a = effect;
        }
    }
}
