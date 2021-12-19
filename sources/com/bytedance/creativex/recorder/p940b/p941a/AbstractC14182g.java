package com.bytedance.creativex.recorder.p940b.p941a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.b.a.g */
public abstract class AbstractC14182g {
    static {
        Covode.recordClassIndex(16251);
    }

    private AbstractC14182g() {
    }

    /* renamed from: com.bytedance.creativex.recorder.b.a.g$a */
    public static final class C14183a extends AbstractC14182g {

        /* renamed from: a */
        public final int f34456a;

        static {
            Covode.recordClassIndex(16252);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C14183a) && this.f34456a == ((C14183a) obj).f34456a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f34456a;
        }

        public final String toString() {
            return "ProcessRunningError(ret=" + this.f34456a + ")";
        }

        public C14183a(int i) {
            super((byte) 0);
            this.f34456a = i;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.b.a.g$b */
    public static final class C14184b extends AbstractC14182g {

        /* renamed from: a */
        public final int f34457a;

        static {
            Covode.recordClassIndex(16253);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C14184b) && this.f34457a == ((C14184b) obj).f34457a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f34457a;
        }

        public final String toString() {
            return "StartRecordFailed(ret=" + this.f34457a + ")";
        }

        public C14184b(int i) {
            super((byte) 0);
            this.f34457a = i;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.b.a.g$c */
    public static final class C14185c extends AbstractC14182g {

        /* renamed from: a */
        public final long f34458a;

        static {
            Covode.recordClassIndex(16254);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C14185c) && this.f34458a == ((C14185c) obj).f34458a;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f34458a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return "StopRecordDurationNegative(duration=" + this.f34458a + ")";
        }

        public C14185c(long j) {
            super((byte) 0);
            this.f34458a = j;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.b.a.g$d */
    public static final class C14186d extends AbstractC14182g {

        /* renamed from: a */
        public final long f34459a;

        static {
            Covode.recordClassIndex(16255);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C14186d) && this.f34459a == ((C14186d) obj).f34459a;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f34459a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return "StopRecordReturnNegative(ret=" + this.f34459a + ")";
        }

        public C14186d(long j) {
            super((byte) 0);
            this.f34459a = j;
        }
    }

    public /* synthetic */ AbstractC14182g(byte b) {
        this();
    }

    /* renamed from: com.bytedance.creativex.recorder.b.a.g$e */
    public static final class C14187e extends AbstractC14182g {

        /* renamed from: a */
        public final C14206w f34460a;

        static {
            Covode.recordClassIndex(16256);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C14187e) && C89219l.m154714a(this.f34460a, ((C14187e) obj).f34460a);
            }
            return true;
        }

        public final int hashCode() {
            C14206w wVar = this.f34460a;
            if (wVar != null) {
                return wVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "TryRecordOnCameraNotInit(event=" + this.f34460a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14187e(C14206w wVar) {
            super((byte) 0);
            C89219l.m154721d(wVar, "");
            this.f34460a = wVar;
        }
    }
}
