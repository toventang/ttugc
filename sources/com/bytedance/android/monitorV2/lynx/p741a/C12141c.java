package com.bytedance.android.monitorV2.lynx.p741a;

import android.view.View;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23500c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.a.c */
public final class C12141c {

    /* renamed from: a */
    static final C12147e f29182a = C12147e.f29192a;

    /* renamed from: b */
    public static final C12141c f29183b = new C12141c();

    /* renamed from: com.bytedance.android.monitorV2.lynx.a.c$c */
    public interface AbstractC12144c {
        static {
            Covode.recordClassIndex(13873);
        }

        /* renamed from: a */
        void mo19510a(View view, String str, float f);

        /* renamed from: a */
        void mo19511a(View view, String str, long j, long j2);
    }

    private C12141c() {
    }

    static {
        Covode.recordClassIndex(13870);
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.a.c$a */
    public static final class C12142a extends C23500c.AbstractC23504c {

        /* renamed from: a */
        private final AbstractC12144c f29184a;

        static {
            Covode.recordClassIndex(13871);
        }

        public C12142a(AbstractC12144c cVar) {
            this.f29184a = cVar;
        }

        @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23504c
        /* renamed from: a */
        public final void mo19173a(View view, String str, int i, int i2, int i3) {
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            float f = (((float) i2) * 1.0f) / ((float) i);
            try {
                AbstractC12144c cVar = this.f29184a;
                if (cVar != null) {
                    cVar.mo19510a(view, str, f);
                }
                C12115b.m21583b("LynxViewBlankChecker_result", "total:" + i + ", validate:" + i2 + ", invalidate:" + i3);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.a.c$b */
    public static final class C12143b extends C23500c.AbstractC23505d {

        /* renamed from: a */
        public long f29185a;

        /* renamed from: b */
        public long f29186b;

        /* renamed from: c */
        private final View f29187c;

        /* renamed from: d */
        private final AbstractC12144c f29188d;

        static {
            Covode.recordClassIndex(13872);
        }

        public C12143b(View view, AbstractC12144c cVar) {
            C89219l.m154719c(view, "");
            this.f29187c = view;
            this.f29188d = cVar;
        }

        @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23505d
        /* renamed from: b */
        public final void mo19175b(String str, long j) {
            C89219l.m154719c(str, "");
            super.mo19175b(str, j);
            this.f29186b = j;
        }

        @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23505d
        /* renamed from: a */
        public final void mo19174a(String str, long j) {
            C89219l.m154719c(str, "");
            super.mo19174a(str, j);
            this.f29185a = j;
            try {
                AbstractC12144c cVar = this.f29188d;
                if (cVar != null) {
                    cVar.mo19511a(this.f29187c, str, this.f29186b, j);
                }
            } catch (Exception unused) {
            }
        }
    }
}
