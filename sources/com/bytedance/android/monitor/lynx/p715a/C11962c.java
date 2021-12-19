package com.bytedance.android.monitor.lynx.p715a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23500c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.a.c */
public final class C11962c {

    /* renamed from: a */
    static final C11968e f28607a = C11968e.f28617a;

    /* renamed from: b */
    public static final C11962c f28608b = new C11962c();

    /* renamed from: com.bytedance.android.monitor.lynx.a.c$c */
    public interface AbstractC11965c {
        static {
            Covode.recordClassIndex(13691);
        }

        /* renamed from: a */
        void mo19171a(View view, String str, float f);

        /* renamed from: a */
        void mo19172a(View view, String str, long j, long j2);
    }

    private C11962c() {
    }

    static {
        Covode.recordClassIndex(13688);
    }

    /* renamed from: com.bytedance.android.monitor.lynx.a.c$a */
    public static final class C11963a extends C23500c.AbstractC23504c {

        /* renamed from: a */
        private final AbstractC11965c f28609a;

        static {
            Covode.recordClassIndex(13689);
        }

        public C11963a(AbstractC11965c cVar) {
            this.f28609a = cVar;
        }

        @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23504c
        /* renamed from: a */
        public final void mo19173a(View view, String str, int i, int i2, int i3) {
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            float f = (((float) i2) * 1.0f) / ((float) i);
            try {
                AbstractC11965c cVar = this.f28609a;
                if (cVar != null) {
                    cVar.mo19171a(view, str, f);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.a.c$b */
    public static final class C11964b extends C23500c.AbstractC23505d {

        /* renamed from: a */
        public long f28610a;

        /* renamed from: b */
        public long f28611b;

        /* renamed from: c */
        private final View f28612c;

        /* renamed from: d */
        private final AbstractC11965c f28613d;

        static {
            Covode.recordClassIndex(13690);
        }

        public C11964b(View view, AbstractC11965c cVar) {
            C89219l.m154719c(view, "");
            this.f28612c = view;
            this.f28613d = cVar;
        }

        @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23505d
        /* renamed from: b */
        public final void mo19175b(String str, long j) {
            C89219l.m154719c(str, "");
            super.mo19175b(str, j);
            this.f28611b = j;
        }

        @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23505d
        /* renamed from: a */
        public final void mo19174a(String str, long j) {
            C89219l.m154719c(str, "");
            super.mo19174a(str, j);
            this.f28610a = j;
            try {
                AbstractC11965c cVar = this.f28613d;
                if (cVar != null) {
                    cVar.mo19172a(this.f28612c, str, this.f28611b, j);
                }
            } catch (Exception unused) {
            }
        }
    }
}
