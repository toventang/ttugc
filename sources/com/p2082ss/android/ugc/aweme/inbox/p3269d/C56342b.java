package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.b */
public final class C56342b {

    /* renamed from: a */
    public final C56384i f128518a = C56384i.f128609c;

    /* renamed from: b */
    public final C56384i f128519b = C56384i.f128609c;

    /* renamed from: c */
    public final C56384i f128520c = C56384i.f128609c;

    /* renamed from: d */
    public final C56384i f128521d = C56384i.f128609c;

    /* renamed from: e */
    public final C56384i f128522e = C56384i.f128609c;

    /* renamed from: f */
    public final C56384i f128523f = C56384i.f128609c;

    /* renamed from: g */
    public final C56384i f128524g = C56384i.f128609c;

    static {
        Covode.recordClassIndex(66162);
    }

    /* renamed from: a */
    public final void mo93350a(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        try {
            jSONObject.put("life_attach", this.f128518a.mo93375a());
            jSONObject.put("life_create", this.f128519b.mo93375a());
            jSONObject.put("life_create_view", this.f128520c.mo93375a());
            jSONObject.put("life_view_created", this.f128521d.mo93375a());
            jSONObject.put("life_activity_created", this.f128522e.mo93375a());
            jSONObject.put("life_start", this.f128523f.mo93375a());
            C89379q.m157068constructorimpl(jSONObject.put("life_resume", this.f128524g.mo93375a()));
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo93349a(com.p2082ss.android.ugc.aweme.inbox.p3269d.EnumC56341a r5, p4600h.p4611f.p4612a.AbstractC89171a<? extends T> r6) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            int[] r1 = com.p2082ss.android.ugc.aweme.inbox.p3269d.C56343c.f128525a
            int r0 = r5.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0033;
                case 2: goto L_0x0030;
                case 3: goto L_0x002d;
                case 4: goto L_0x002a;
                case 5: goto L_0x0027;
                case 6: goto L_0x0024;
                case 7: goto L_0x0021;
                default: goto L_0x0013;
            }
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.lang.Object r2 = r6.invoke()
            if (r3 == 0) goto L_0x0020
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.f128612b = r0
        L_0x0020:
            return r2
        L_0x0021:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f128524g
            goto L_0x0035
        L_0x0024:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f128523f
            goto L_0x0035
        L_0x0027:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f128522e
            goto L_0x0035
        L_0x002a:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f128521d
            goto L_0x0035
        L_0x002d:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f128520c
            goto L_0x0035
        L_0x0030:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f128519b
            goto L_0x0035
        L_0x0033:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f128518a
        L_0x0035:
            if (r3 == 0) goto L_0x0014
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.f128611a = r0
            goto L_0x0014
            switch-data {1->0x0033, 2->0x0030, 3->0x002d, 4->0x002a, 5->0x0027, 6->0x0024, 7->0x0021, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.p3269d.C56342b.mo93349a(com.ss.android.ugc.aweme.inbox.d.a, h.f.a.a):java.lang.Object");
    }
}
