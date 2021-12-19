package com.bytedance.ies.p1208im.core.p1224e;

import android.content.Context;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.j */
public final class C17529j {

    /* renamed from: a */
    static final int f41949a = 1;

    /* renamed from: b */
    static final int f41950b = 2;

    /* renamed from: c */
    static final int f41951c = 4;

    /* renamed from: d */
    static final AbstractC89244h f41952d = C89250i.m154773a((AbstractC89171a) C17530a.f41954a);

    /* renamed from: e */
    public static final C17529j f41953e = new C17529j();

    private C17529j() {
    }

    static {
        Covode.recordClassIndex(20018);
    }

    /* renamed from: com.bytedance.ies.im.core.e.j$a */
    static final class C17530a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17530a f41954a = new C17530a();

        static {
            Covode.recordClassIndex(20019);
        }

        C17530a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
            if (r1.is4GOrHigher() == false) goto L_0x004f;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke() {
            /*
                r4 = this;
                com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C16048b.m29633a()
                r3 = 1
                java.lang.String r1 = "im_options_parallel_send"
                r0 = 0
                int r1 = r2.mo25412a(r3, r1, r0)
                int r0 = com.bytedance.ies.p1208im.core.p1224e.C17529j.f41951c
                if (r1 != r0) goto L_0x0015
            L_0x0010:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x0015:
                int r0 = com.bytedance.ies.p1208im.core.p1224e.C17529j.f41950b
                java.lang.String r2 = ""
                if (r1 != r0) goto L_0x0037
                com.bytedance.ies.im.core.api.d.d r0 = com.bytedance.ies.p1208im.core.api.C17415a.m32254a()
                android.content.Context r0 = r0.mo27845a()
                com.bytedance.common.utility.l$a r1 = m32503a(r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r2)
                boolean r0 = r1.isWifi()
                if (r0 != 0) goto L_0x0010
                boolean r0 = r1.is4GOrHigher()
                if (r0 == 0) goto L_0x004f
                goto L_0x0010
            L_0x0037:
                int r0 = com.bytedance.ies.p1208im.core.p1224e.C17529j.f41949a
                if (r1 != r0) goto L_0x004f
                com.bytedance.ies.im.core.api.d.d r0 = com.bytedance.ies.p1208im.core.api.C17415a.m32254a()
                android.content.Context r0 = r0.mo27845a()
                com.bytedance.common.utility.l$a r0 = m32503a(r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
                boolean r3 = r0.isWifi()
                goto L_0x0010
            L_0x004f:
                r3 = 0
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1208im.core.p1224e.C17529j.C17530a.invoke():java.lang.Object");
        }

        /* renamed from: a */
        private static C13624l.EnumC13625a m32503a(Context context) {
            if (C58029j.f132251c != C13624l.EnumC13625a.UNKNOWN && C58029j.m104846b() && !C58029j.m104847c()) {
                return C58029j.f132251c;
            }
            C13624l.EnumC13625a d = C13624l.m24488d(context);
            C58029j.f132251c = d;
            return d;
        }
    }
}
