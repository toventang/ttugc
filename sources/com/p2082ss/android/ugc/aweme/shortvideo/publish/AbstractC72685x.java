package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.x */
public abstract class AbstractC72685x {
    static {
        Covode.recordClassIndex(85368);
    }

    private AbstractC72685x() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.x$b */
    public static final class C72687b extends AbstractC72685x {

        /* renamed from: a */
        public static final C72687b f162962a = new C72687b();

        public final String toString() {
            return "PublishState:New";
        }

        private C72687b() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(85370);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.x$c */
    public static final class C72688c extends AbstractC72685x {

        /* renamed from: a */
        public static final C72688c f162963a = new C72688c();

        private C72688c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(85371);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.x$a */
    public static final class C72686a extends AbstractC72685x {

        /* renamed from: a */
        public final AbstractC72623d f162960a;

        /* renamed from: b */
        public final Object f162961b;

        static {
            Covode.recordClassIndex(85369);
        }

        public final String toString() {
            return "PublishState:Finish result:" + this.f162960a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72686a(AbstractC72623d dVar, Object obj) {
            super((byte) 0);
            C89219l.m154721d(dVar, "");
            this.f162960a = dVar;
            this.f162961b = obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.x$d */
    public static final class C72689d extends AbstractC72685x {

        /* renamed from: a */
        public final int f162964a;

        /* renamed from: b */
        public final Object f162965b;

        static {
            Covode.recordClassIndex(85372);
        }

        public final String toString() {
            return "PublishState:Running progress:" + this.f162964a;
        }

        public C72689d(int i, Object obj) {
            super((byte) 0);
            this.f162964a = i;
            this.f162965b = obj;
        }
    }

    public /* synthetic */ AbstractC72685x(byte b) {
        this();
    }
}
