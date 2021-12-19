package com.p2082ss.android.ugc.tools.infosticker.view.internal;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.f */
public interface AbstractC84694f {
    static {
        Covode.recordClassIndex(98661);
    }

    /* renamed from: a */
    ViewPager mo129606a();

    /* renamed from: a */
    void mo129607a(List<? extends C89378p<C84695a, ? extends AbstractC89171a<? extends View>>> list);

    /* renamed from: a */
    void mo129608a(boolean z);

    /* renamed from: b */
    void mo129609b();

    /* renamed from: c */
    AbstractC88979t<C89378p<C84695a, Integer>> mo129610c();

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.f$a */
    public static final class C84695a {

        /* renamed from: a */
        public final AbstractC84456m f189220a;

        /* renamed from: b */
        public final String f189221b;

        /* renamed from: c */
        public final String f189222c;

        static {
            Covode.recordClassIndex(98662);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C84695a)) {
                return false;
            }
            C84695a aVar = (C84695a) obj;
            return C89219l.m154714a(this.f189220a, aVar.f189220a) && C89219l.m154714a(this.f189221b, aVar.f189221b) && C89219l.m154714a(this.f189222c, aVar.f189222c);
        }

        public final int hashCode() {
            AbstractC84456m mVar = this.f189220a;
            int i = 0;
            int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
            String str = this.f189221b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f189222c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "Page(meta=" + this.f189220a + ", name=" + this.f189221b + ", displayName=" + this.f189222c + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C84695a(com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m r2) {
            /*
                r1 = this;
                java.lang.String r0 = r2.f188787e
                r1.<init>(r2, r0, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f.C84695a.<init>(com.ss.android.ugc.tools.h.a.m):void");
        }

        private C84695a(AbstractC84456m mVar, String str, String str2) {
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f189220a = mVar;
            this.f189221b = str;
            this.f189222c = str2;
        }
    }
}
