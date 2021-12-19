package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.b */
public interface AbstractC81695b {

    /* renamed from: a */
    public static final C81697b f182671a = C81697b.f182677b;

    static {
        Covode.recordClassIndex(95100);
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.b$a */
    public static final class C81696a implements Serializable {
        @AbstractC27891c(mo46611a = "x")

        /* renamed from: a */
        private float f182672a;
        @AbstractC27891c(mo46611a = "y")

        /* renamed from: b */
        private float f182673b;
        @AbstractC27891c(mo46611a = "width")

        /* renamed from: c */
        private float f182674c;
        @AbstractC27891c(mo46611a = "height")

        /* renamed from: d */
        private float f182675d;

        static {
            Covode.recordClassIndex(95101);
        }

        public C81696a() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public final float getHeight() {
            return this.f182675d;
        }

        public final float getWidth() {
            return this.f182674c;
        }

        public final float getX() {
            return this.f182672a;
        }

        public final float getY() {
            return this.f182673b;
        }

        public final void setHeight(float f) {
            this.f182675d = f;
        }

        public final void setWidth(float f) {
            this.f182674c = f;
        }

        public final void setX(float f) {
            this.f182672a = f;
        }

        public final void setY(float f) {
            this.f182673b = f;
        }

        public C81696a(float f, float f2, float f3, float f4) {
            this.f182672a = f;
            this.f182673b = f2;
            this.f182674c = f3;
            this.f182675d = f4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C81696a(float f, float f2, float f3, float f4, int i, C89214g gVar) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.b$b */
    public static final class C81697b {

        /* renamed from: a */
        static final AbstractC89244h f182676a;

        /* renamed from: b */
        static final /* synthetic */ C81697b f182677b;

        private C81697b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.b$b$a */
        static final class C81698a extends AbstractC89220m implements AbstractC89171a<Set<? extends String>> {

            /* renamed from: a */
            final /* synthetic */ C81697b f182678a;

            static {
                Covode.recordClassIndex(95103);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C81698a(C81697b bVar) {
                super(0);
                this.f182678a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Set<? extends String> invoke() {
                return C89047am.m154438a((Object[]) new String[]{"scroll", "scrolltoactive", "scrolltobounce"});
            }
        }

        static {
            Covode.recordClassIndex(95102);
            C81697b bVar = new C81697b();
            f182677b = bVar;
            f182676a = C89250i.m154773a((AbstractC89171a) new C81698a(bVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.b$c */
    public static final class C81699c implements Serializable {
        @AbstractC27891c(mo46611a = "leftMargin")

        /* renamed from: a */
        private float f182679a;
        @AbstractC27891c(mo46611a = "rightMargin")

        /* renamed from: b */
        private float f182680b;
        @AbstractC27891c(mo46611a = "itemSpace")

        /* renamed from: c */
        private float f182681c;
        @AbstractC27891c(mo46611a = "preferitemwidth")

        /* renamed from: d */
        private float f182682d;

        static {
            Covode.recordClassIndex(95104);
        }

        public C81699c() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public final float getItemSpace() {
            return this.f182681c;
        }

        public final float getLeftMargin() {
            return this.f182679a;
        }

        public final float getPreferItemWidth() {
            return this.f182682d;
        }

        public final float getRightMargin() {
            return this.f182680b;
        }

        public final void setItemSpace(float f) {
            this.f182681c = f;
        }

        public final void setLeftMargin(float f) {
            this.f182679a = f;
        }

        public final void setPreferItemWidth(float f) {
            this.f182682d = f;
        }

        public final void setRightMargin(float f) {
            this.f182680b = f;
        }

        public C81699c(float f, float f2, float f3, float f4) {
            this.f182679a = f;
            this.f182680b = f2;
            this.f182681c = f3;
            this.f182682d = f4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C81699c(float f, float f2, float f3, float f4, int i, C89214g gVar) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
        }
    }
}
