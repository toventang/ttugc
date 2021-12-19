package com.p2082ss.android.ugc.asve.editor;

import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85395bh;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.g */
public interface AbstractC31074g {

    /* renamed from: a */
    public static final C31075a f74432a = C31075a.f74433a;

    static {
        Covode.recordClassIndex(37704);
    }

    /* renamed from: a */
    AbstractC31071f mo56402a(SurfaceView surfaceView, C31076b bVar);

    /* renamed from: com.ss.android.ugc.asve.editor.g$a */
    public static final class C31075a {

        /* renamed from: a */
        static final /* synthetic */ C31075a f74433a = new C31075a();

        private C31075a() {
        }

        static {
            Covode.recordClassIndex(37705);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.editor.g$b */
    public static final class C31076b {

        /* renamed from: a */
        public final EnumC31070e f74434a;

        /* renamed from: b */
        public final String f74435b;

        /* renamed from: c */
        public final long f74436c;

        /* renamed from: d */
        public final C85395bh f74437d;

        static {
            Covode.recordClassIndex(37706);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31076b)) {
                return false;
            }
            C31076b bVar = (C31076b) obj;
            return C89219l.m154714a(this.f74434a, bVar.f74434a) && C89219l.m154714a(this.f74435b, bVar.f74435b) && this.f74436c == bVar.f74436c && C89219l.m154714a(this.f74437d, bVar.f74437d);
        }

        public final int hashCode() {
            EnumC31070e eVar = this.f74434a;
            int i = 0;
            int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
            String str = this.f74435b;
            int hashCode2 = str != null ? str.hashCode() : 0;
            long j = this.f74436c;
            int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            C85395bh bhVar = this.f74437d;
            if (bhVar != null) {
                i = bhVar.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            return "Params(type=" + this.f74434a + ", workSpace=" + this.f74435b + ", handler=" + this.f74436c + ", veUserConfig=" + this.f74437d + ")";
        }

        public C31076b(EnumC31070e eVar, String str, long j, C85395bh bhVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(str, "");
            this.f74434a = eVar;
            this.f74435b = str;
            this.f74436c = j;
            this.f74437d = bhVar;
        }
    }
}
