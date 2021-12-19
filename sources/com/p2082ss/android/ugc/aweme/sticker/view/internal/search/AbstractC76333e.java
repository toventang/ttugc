package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.e */
public abstract class AbstractC76333e {

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.e$b */
    public static final class C76335b extends AbstractC76333e {

        /* renamed from: a */
        public final Effect f171474a;

        static {
            Covode.recordClassIndex(89290);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C76335b) && C89219l.m154714a(this.f171474a, ((C76335b) obj).f171474a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f171474a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "HideWithEffectChosen(effect=" + this.f171474a + ")";
        }
    }

    static {
        Covode.recordClassIndex(89288);
    }

    private AbstractC76333e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.e$a */
    public static final class C76334a extends AbstractC76333e {

        /* renamed from: a */
        public static final C76334a f171473a = new C76334a();

        private C76334a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(89289);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.e$c */
    public static final class C76336c extends AbstractC76333e {

        /* renamed from: a */
        public static final C76336c f171475a = new C76336c();

        private C76336c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(89291);
        }
    }

    public /* synthetic */ AbstractC76333e(byte b) {
        this();
    }
}
