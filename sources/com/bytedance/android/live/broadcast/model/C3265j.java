package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.model.j */
public final class C3265j {

    /* renamed from: b */
    public static final C3265j f9350b = new C3265j(-1);

    /* renamed from: c */
    public static final C3266a f9351c = new C3266a((byte) 0);

    /* renamed from: a */
    public final long f9352a;

    /* renamed from: com.bytedance.android.live.broadcast.model.j$a */
    public static final class C3266a {
        static {
            Covode.recordClassIndex(3748);
        }

        private C3266a() {
        }

        public /* synthetic */ C3266a(byte b) {
            this();
        }
    }

    public final int hashCode() {
        long j = this.f9352a;
        return (int) (j ^ (j >>> 32));
    }

    static {
        Covode.recordClassIndex(3747);
    }

    public final String toString() {
        return "MuteDuration(duration=" + this.f9352a + ')';
    }

    public C3265j(long j) {
        this.f9352a = j;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.model.MuteDuration");
        if (this.f9352a == ((C3265j) obj).f9352a) {
            return true;
        }
        return false;
    }
}
