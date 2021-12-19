package com.p2082ss.android.ugc.aweme.kids.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.e */
public abstract class AbstractC57776e {
    static {
        Covode.recordClassIndex(67763);
    }

    private AbstractC57776e() {
    }

    public /* synthetic */ AbstractC57776e(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.e$a */
    public static final class C57777a extends AbstractC57776e {

        /* renamed from: a */
        public final C43223c f131793a;

        static {
            Covode.recordClassIndex(67764);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C57777a) && C89219l.m154714a(this.f131793a, ((C57777a) obj).f131793a);
            }
            return true;
        }

        public final int hashCode() {
            C43223c cVar = this.f131793a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "DraftVideo(data=" + this.f131793a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57777a(C43223c cVar) {
            super((byte) 0);
            C89219l.m154721d(cVar, "");
            this.f131793a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.e$b */
    public static final class C57778b extends AbstractC57776e {

        /* renamed from: a */
        public final C57743a f131794a;

        static {
            Covode.recordClassIndex(67765);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C57778b) && C89219l.m154714a(this.f131794a, ((C57778b) obj).f131794a);
            }
            return true;
        }

        public final int hashCode() {
            C57743a aVar = this.f131794a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "KidsProfileHeader(userData=" + this.f131794a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57778b(C57743a aVar) {
            super((byte) 0);
            C89219l.m154721d(aVar, "");
            this.f131794a = aVar;
        }
    }
}
