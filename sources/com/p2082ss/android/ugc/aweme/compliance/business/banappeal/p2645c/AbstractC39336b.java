package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.c.b */
public abstract class AbstractC39336b {
    static {
        Covode.recordClassIndex(47016);
    }

    private AbstractC39336b() {
    }

    public /* synthetic */ AbstractC39336b(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.c.b$a */
    public static final class C39337a extends AbstractC39336b {

        /* renamed from: a */
        public final String f92852a;

        /* renamed from: b */
        public final String f92853b;

        /* renamed from: c */
        public final C39340d f92854c;

        /* renamed from: d */
        public final C39335a f92855d;

        /* renamed from: e */
        public final C39339c f92856e;

        static {
            Covode.recordClassIndex(47017);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39337a)) {
                return false;
            }
            C39337a aVar = (C39337a) obj;
            return C89219l.m154714a(this.f92852a, aVar.f92852a) && C89219l.m154714a(this.f92853b, aVar.f92853b) && C89219l.m154714a(this.f92854c, aVar.f92854c) && C89219l.m154714a(this.f92855d, aVar.f92855d) && C89219l.m154714a(this.f92856e, aVar.f92856e);
        }

        public final int hashCode() {
            String str = this.f92852a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f92853b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            C39340d dVar = this.f92854c;
            int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
            C39335a aVar = this.f92855d;
            int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C39339c cVar = this.f92856e;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            return "AgsViewState(titleText=" + this.f92852a + ", bodyText=" + this.f92853b + ", hyperLinkState=" + this.f92854c + ", positiveButtonState=" + this.f92855d + ", secondButtonState=" + this.f92856e + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39337a(String str, String str2, C39340d dVar, C39335a aVar, C39339c cVar) {
            super((byte) 0);
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            this.f92852a = str;
            this.f92853b = str2;
            this.f92854c = dVar;
            this.f92855d = aVar;
            this.f92856e = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.c.b$b */
    public static final class C39338b extends AbstractC39336b {

        /* renamed from: a */
        public final String f92857a;

        /* renamed from: b */
        public final String f92858b;

        /* renamed from: c */
        public final C39340d f92859c;

        /* renamed from: d */
        public final C39335a f92860d;

        /* renamed from: e */
        public final C39335a f92861e;

        /* renamed from: f */
        public final C39339c f92862f;

        /* renamed from: g */
        public final AbstractC89171a<C89391z> f92863g;

        static {
            Covode.recordClassIndex(47018);
        }

        public C39338b() {
            this(null, null, null, null, null, null, 127);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39338b)) {
                return false;
            }
            C39338b bVar = (C39338b) obj;
            return C89219l.m154714a(this.f92857a, bVar.f92857a) && C89219l.m154714a(this.f92858b, bVar.f92858b) && C89219l.m154714a(this.f92859c, bVar.f92859c) && C89219l.m154714a(this.f92860d, bVar.f92860d) && C89219l.m154714a(this.f92861e, bVar.f92861e) && C89219l.m154714a(this.f92862f, bVar.f92862f) && C89219l.m154714a(this.f92863g, bVar.f92863g);
        }

        public final int hashCode() {
            String str = this.f92857a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f92858b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            C39340d dVar = this.f92859c;
            int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
            C39335a aVar = this.f92860d;
            int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C39335a aVar2 = this.f92861e;
            int hashCode5 = (hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            C39339c cVar = this.f92862f;
            int hashCode6 = (hashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31;
            AbstractC89171a<C89391z> aVar3 = this.f92863g;
            if (aVar3 != null) {
                i = aVar3.hashCode();
            }
            return hashCode6 + i;
        }

        public final String toString() {
            return "AppealViewState(titleText=" + this.f92857a + ", bodyText=" + this.f92858b + ", hyperLinkState=" + this.f92859c + ", positiveButtonState=" + this.f92860d + ", negativeButtonState=" + this.f92861e + ", secondButtonState=" + this.f92862f + ", eventTracker=" + this.f92863g + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C39338b(String str, String str2, C39340d dVar, C39335a aVar, C39335a aVar2, AbstractC89171a<C89391z> aVar3) {
            super((byte) 0);
            C89219l.m154721d(str2, "");
            this.f92857a = str;
            this.f92858b = str2;
            this.f92859c = dVar;
            this.f92860d = aVar;
            this.f92861e = aVar2;
            this.f92862f = null;
            this.f92863g = aVar3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C39338b(String str, String str2, C39340d dVar, C39335a aVar, C39335a aVar2, AbstractC89171a aVar3, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : aVar2, (i & 64) == 0 ? aVar3 : null);
        }
    }
}
