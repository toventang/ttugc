package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ae */
public abstract class AbstractC72598ae {

    /* renamed from: a */
    public final String f162756a;

    static {
        Covode.recordClassIndex(85281);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ae$a */
    public static final class C72599a extends AbstractC72598ae {

        /* renamed from: b */
        public final String f162757b;

        static {
            Covode.recordClassIndex(85282);
        }

        public final String toString() {
            return "HwReEncode:" + this.f162757b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72599a(String str, String str2) {
            super(str2, (byte) 0);
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f162757b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ae$c */
    public static final class C72601c extends AbstractC72598ae {

        /* renamed from: b */
        public final String f162758b;

        static {
            Covode.recordClassIndex(85284);
        }

        public final String toString() {
            return "SwReEncode:" + this.f162758b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72601c(String str, String str2) {
            super(str2, (byte) 0);
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f162758b = str;
        }
    }

    private AbstractC72598ae(String str) {
        this.f162756a = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ae$b */
    public static final class C72600b extends AbstractC72598ae {
        static {
            Covode.recordClassIndex(85283);
        }

        public final String toString() {
            return "SkipReEncode";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72600b(String str) {
            super(str, (byte) 0);
            C89219l.m154721d(str, "");
        }
    }

    public /* synthetic */ AbstractC72598ae(String str, byte b) {
        this(str);
    }
}
