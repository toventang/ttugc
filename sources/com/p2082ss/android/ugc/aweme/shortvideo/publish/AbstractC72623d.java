package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.d */
public abstract class AbstractC72623d {
    static {
        Covode.recordClassIndex(85306);
    }

    private AbstractC72623d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.d$a */
    public static final class C72624a extends AbstractC72623d {

        /* renamed from: a */
        public static final C72624a f162804a = new C72624a();

        public final String toString() {
            return "Cancel";
        }

        private C72624a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(85307);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.d$b */
    public static final class C72625b extends AbstractC72623d {

        /* renamed from: a */
        public final C72677p f162805a;

        static {
            Covode.recordClassIndex(85308);
        }

        public final String toString() {
            return "Failed error:" + this.f162805a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72625b(C72677p pVar) {
            super((byte) 0);
            C89219l.m154721d(pVar, "");
            this.f162805a = pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.d$c */
    public static final class C72626c extends AbstractC72623d {

        /* renamed from: a */
        public final C69831ai f162806a;

        static {
            Covode.recordClassIndex(85309);
        }

        public final String toString() {
            return "Success response:" + this.f162806a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72626c(C69831ai aiVar) {
            super((byte) 0);
            C89219l.m154721d(aiVar, "");
            this.f162806a = aiVar;
        }
    }

    public /* synthetic */ AbstractC72623d(byte b) {
        this();
    }
}
