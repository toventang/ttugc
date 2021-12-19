package com.p2082ss.android.ugc.aweme.tools.draft.ftc.util;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.e */
public abstract class AbstractC78335e {

    /* renamed from: a */
    public final int f175932a;

    static {
        Covode.recordClassIndex(91454);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.e$a */
    public static final class C78336a extends AbstractC78335e {

        /* renamed from: b */
        public final int f175933b;

        static {
            Covode.recordClassIndex(91455);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C78336a) && this.f175933b == ((C78336a) obj).f175933b;
            }
            return true;
        }

        public final int hashCode() {
            return this.f175933b;
        }

        public final String toString() {
            return "Delete(i=" + this.f175933b + ")";
        }

        public C78336a(int i) {
            super(i, (byte) 0);
            this.f175933b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.e$b */
    public static final class C78337b extends AbstractC78335e {

        /* renamed from: b */
        public final int f175934b;

        static {
            Covode.recordClassIndex(91456);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C78337b) && this.f175934b == ((C78337b) obj).f175934b;
            }
            return true;
        }

        public final int hashCode() {
            return this.f175934b;
        }

        public final String toString() {
            return "Edit(i=" + this.f175934b + ")";
        }

        public C78337b(int i) {
            super(i, (byte) 0);
            this.f175934b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.e$c */
    public static final class C78338c extends AbstractC78335e {

        /* renamed from: b */
        public final int f175935b;

        static {
            Covode.recordClassIndex(91457);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C78338c) && this.f175935b == ((C78338c) obj).f175935b;
            }
            return true;
        }

        public final int hashCode() {
            return this.f175935b;
        }

        public final String toString() {
            return "Save(i=" + this.f175935b + ")";
        }

        public C78338c(int i) {
            super(i, (byte) 0);
            this.f175935b = i;
        }
    }

    private AbstractC78335e(int i) {
        this.f175932a = i;
    }

    public /* synthetic */ AbstractC78335e(int i, byte b) {
        this(i);
    }
}
