package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.p3188a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a */
public abstract class AbstractC55249a<T> {
    static {
        Covode.recordClassIndex(64996);
    }

    private AbstractC55249a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a$b */
    public static abstract class AbstractC55251b extends AbstractC55249a {

        /* renamed from: a */
        public final Object f126345a;

        static {
            Covode.recordClassIndex(64998);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a$b$a */
        public static final class C55252a extends AbstractC55249a {

            /* renamed from: a */
            public final Object f126346a;

            static {
                Covode.recordClassIndex(64999);
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C55252a) && C89219l.m154714a(this.f126346a, ((C55252a) obj).f126346a);
                }
                return true;
            }

            public final int hashCode() {
                Object obj = this.f126346a;
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }

            public final String toString() {
                return "GenericException(exception=" + this.f126346a + ")";
            }

            private /* synthetic */ C55252a() {
                this(null);
            }

            public C55252a(Object obj) {
                super((byte) 0);
                this.f126346a = obj;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a$a */
    public static final class C55250a<T> extends AbstractC55249a<T> {

        /* renamed from: a */
        public final T f126344a;

        static {
            Covode.recordClassIndex(64997);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C55250a) && C89219l.m154714a(this.f126344a, ((C55250a) obj).f126344a);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.f126344a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Error(data=" + ((Object) this.f126344a) + ")";
        }

        public C55250a(T t) {
            super((byte) 0);
            this.f126344a = t;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a$c */
    public static final class C55253c<T> extends AbstractC55249a<T> {

        /* renamed from: a */
        public final T f126347a;

        static {
            Covode.recordClassIndex(65000);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C55253c) && C89219l.m154714a(this.f126347a, ((C55253c) obj).f126347a);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.f126347a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Loading(data=" + ((Object) this.f126347a) + ")";
        }

        public C55253c(T t) {
            super((byte) 0);
            this.f126347a = t;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a$d */
    public static final class C55254d<T> extends AbstractC55249a<T> {

        /* renamed from: a */
        public final T f126348a;

        static {
            Covode.recordClassIndex(65001);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C55254d) && C89219l.m154714a(this.f126348a, ((C55254d) obj).f126348a);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.f126348a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Success(data=" + ((Object) this.f126348a) + ")";
        }

        public C55254d(T t) {
            super((byte) 0);
            this.f126348a = t;
        }
    }

    public /* synthetic */ AbstractC55249a(byte b) {
        this();
    }
}
