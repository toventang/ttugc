package com.p2082ss.ugc.live.sdk.msg.p4473d;

import com.bytedance.covode.number.Covode;
import java.lang.Exception;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.sdk.msg.d.f */
public abstract class AbstractC87110f<V, E extends Exception> {

    /* renamed from: a */
    public static final C87111a f196384a = new C87111a((byte) 0);

    static {
        Covode.recordClassIndex(102906);
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.d.f$a */
    public static final class C87111a {
        static {
            Covode.recordClassIndex(102907);
        }

        private C87111a() {
        }

        public /* synthetic */ C87111a(byte b) {
            this();
        }

        /* renamed from: a */
        public static <V> C87113c<V> m150861a(V v) {
            return new C87113c<>(v);
        }

        /* renamed from: a */
        public static <E extends Exception> C87112b<E> m150860a(E e) {
            C89219l.m154719c(e, "");
            return new C87112b<>(e);
        }
    }

    private AbstractC87110f() {
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.d.f$b */
    public static final class C87112b<E extends Exception> extends AbstractC87110f {

        /* renamed from: b */
        public final E f196385b;

        static {
            Covode.recordClassIndex(102908);
        }

        public final int hashCode() {
            return this.f196385b.hashCode();
        }

        public final String toString() {
            return "[Failure: " + this.f196385b + ']';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87112b(E e) {
            super((byte) 0);
            C89219l.m154719c(e, "");
            this.f196385b = e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C87112b) || !C89219l.m154714a(this.f196385b, ((C87112b) obj).f196385b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.d.f$c */
    public static final class C87113c<V> extends AbstractC87110f {

        /* renamed from: b */
        public final V f196386b;

        static {
            Covode.recordClassIndex(102909);
        }

        public final int hashCode() {
            V v = this.f196386b;
            if (v != null) {
                return v.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "[Success: " + ((Object) this.f196386b) + ']';
        }

        public C87113c(V v) {
            super((byte) 0);
            this.f196386b = v;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C87113c) || !C89219l.m154714a((Object) this.f196386b, (Object) ((C87113c) obj).f196386b)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AbstractC87110f(byte b) {
        this();
    }
}
