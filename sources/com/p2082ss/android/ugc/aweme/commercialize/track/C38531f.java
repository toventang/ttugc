package com.p2082ss.android.ugc.aweme.commercialize.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.track.f */
public final class C38531f {

    /* renamed from: a */
    public static final C38531f f91048a = new C38531f();

    private C38531f() {
    }

    static {
        Covode.recordClassIndex(46061);
    }

    /* renamed from: a */
    public static boolean m78151a() {
        return C16048b.m29633a().mo25421a(true, "enable_tracker_sdk", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.f$a */
    public static final class C38532a implements AbstractC38530e {

        /* renamed from: a */
        final /* synthetic */ String f91049a;

        /* renamed from: b */
        final /* synthetic */ Long f91050b;

        /* renamed from: c */
        final /* synthetic */ String f91051c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f91052d;

        static {
            Covode.recordClassIndex(46062);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.track.AbstractC38530e
        /* renamed from: a */
        public final void mo59217a(String str, String str2, long j) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C38151a.C38153b a = C38151a.m77333a(str, str2, j);
            a.f90127f = "track_url";
            a.f90122a = "track_ad";
            C38151a.C38153b a2 = a.mo66453b(this.f91049a).mo66446a(this.f91050b);
            String str3 = this.f91051c;
            if (str3 == null) {
                str3 = "";
            }
            C38151a.C38153b c = a2.mo66454c(str3);
            AbstractC89183m mVar = this.f91052d;
            if (mVar != null) {
                C89219l.m154716b(c, "");
                mVar.invoke(c, true);
            }
            c.mo66456d();
        }

        C38532a(String str, Long l, String str2, AbstractC89183m mVar) {
            this.f91049a = str;
            this.f91050b = l;
            this.f91051c = str2;
            this.f91052d = mVar;
        }
    }

    /* renamed from: a */
    public static void m78149a(String str, UrlModel urlModel, Long l, String str2, AbstractC89183m<? super C38151a.C38153b, ? super Boolean, ? extends C38151a.C38153b> mVar) {
        List<String> list;
        C89219l.m154721d(str, "");
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        m78150a(str, list, l, str2, mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m78150a(java.lang.String r5, java.util.List<java.lang.String> r6, java.lang.Long r7, java.lang.String r8, p4600h.p4611f.p4612a.AbstractC89183m<? super com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a.C38153b, ? super java.lang.Boolean, ? extends com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a.C38153b> r9) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            r4 = 1
            if (r6 == 0) goto L_0x000e
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            r0 = 0
            r3 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L_0x000e
            r0.booleanValue()
            boolean r0 = m78151a()
            if (r0 == 0) goto L_0x004e
            com.bytedance.android.a.a.d.b$a r2 = new com.bytedance.android.a.a.d.b$a
            r2.<init>()
            r2.f7898f = r5
            if (r7 == 0) goto L_0x004b
            long r0 = r7.longValue()
        L_0x002f:
            r2.f7893a = r0
            com.bytedance.android.a.a.d.b$a r0 = r2.mo7145a(r6)
            r0.f7896d = r8
            r0.f7894b = r4
            r0.f7897e = r3
            r0.f7900h = r4
            com.bytedance.android.a.a.d.b r1 = r0.mo7146a()
            com.ss.android.ugc.aweme.commercialize.track.h r0 = com.p2082ss.android.ugc.aweme.commercialize.track.C38534h.f91055b
            com.bytedance.android.a.a.d r0 = r0.mo67058a()
            r0.mo7147a(r1)
            return
        L_0x004b:
            r0 = 0
            goto L_0x002f
        L_0x004e:
            if (r6 != 0) goto L_0x0053
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0053:
            com.ss.android.ugc.aweme.commercialize.track.f$a r0 = new com.ss.android.ugc.aweme.commercialize.track.f$a
            r0.<init>(r5, r7, r8, r9)
            com.p2082ss.android.ugc.aweme.commercialize.track.C38526b.m78143a(r0, r6)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.track.C38531f.m78150a(java.lang.String, java.util.List, java.lang.Long, java.lang.String, h.f.a.m):void");
    }
}
