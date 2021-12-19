package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.page.f */
public abstract class AbstractC17700f<T> {

    /* renamed from: a */
    public static final C17701a f42334a = new C17701a((byte) 0);

    static {
        Covode.recordClassIndex(20260);
    }

    /* renamed from: com.bytedance.ies.powerlist.page.f$a */
    public static final class C17701a {
        static {
            Covode.recordClassIndex(20261);
        }

        private C17701a() {
        }

        public /* synthetic */ C17701a(byte b) {
            this();
        }

        /* renamed from: a */
        public static <T> C17702b<T> m32838a(List<? extends AbstractC17641a> list) {
            C89219l.m154719c(list, "");
            return new C17702b<>(list);
        }

        /* renamed from: a */
        public static <T> C17703c<T> m32839a(Exception exc) {
            C89219l.m154719c(exc, "");
            return new C17703c<>(exc);
        }

        /* renamed from: a */
        public static <T> C17704d<T> m32840a(T t, T t2, List<? extends AbstractC17641a> list) {
            C89219l.m154719c(list, "");
            return new C17704d<>(t, t2, list);
        }

        /* renamed from: a */
        public static /* synthetic */ C17704d m32841a(Object obj, Object obj2, List list, int i) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            if ((i & 4) != 0) {
                list = C89086z.INSTANCE;
            }
            return m32840a(obj, obj2, list);
        }
    }

    private AbstractC17700f() {
    }

    public /* synthetic */ AbstractC17700f(byte b) {
        this();
    }

    /* renamed from: com.bytedance.ies.powerlist.page.f$b */
    public static final class C17702b<T> extends AbstractC17700f<T> {

        /* renamed from: b */
        public final List<AbstractC17641a> f42335b;

        static {
            Covode.recordClassIndex(20262);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ies.powerlist.b.a> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17702b(List<? extends AbstractC17641a> list) {
            super((byte) 0);
            C89219l.m154719c(list, "");
            this.f42335b = list;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.f$c */
    public static final class C17703c<T> extends AbstractC17700f<T> {

        /* renamed from: b */
        public final Exception f42336b;

        static {
            Covode.recordClassIndex(20263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17703c(Exception exc) {
            super((byte) 0);
            C89219l.m154719c(exc, "");
            this.f42336b = exc;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.f$d */
    public static final class C17704d<T> extends AbstractC17700f<T> {

        /* renamed from: b */
        public final T f42337b;

        /* renamed from: c */
        public final T f42338c;

        /* renamed from: d */
        public final List<AbstractC17641a> f42339d;

        static {
            Covode.recordClassIndex(20264);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.bytedance.ies.powerlist.b.a> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17704d(T t, T t2, List<? extends AbstractC17641a> list) {
            super((byte) 0);
            C89219l.m154719c(list, "");
            this.f42337b = t;
            this.f42338c = t2;
            this.f42339d = list;
        }
    }
}
