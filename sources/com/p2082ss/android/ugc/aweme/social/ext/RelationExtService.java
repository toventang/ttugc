package com.p2082ss.android.ugc.aweme.social.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.social.service.IRelationExtService;

/* renamed from: com.ss.android.ugc.aweme.social.ext.RelationExtService */
public final class RelationExtService implements IRelationExtService {
    static {
        Covode.recordClassIndex(87567);
    }

    /* renamed from: a */
    public static IRelationExtService m131187a() {
        MethodCollector.m26663i(7762);
        Object a = C81908b.m141854a(IRelationExtService.class, false);
        if (a != null) {
            IRelationExtService iRelationExtService = (IRelationExtService) a;
            MethodCollector.m26664o(7762);
            return iRelationExtService;
        }
        if (C81908b.f183377eg == null) {
            synchronized (IRelationExtService.class) {
                try {
                    if (C81908b.f183377eg == null) {
                        C81908b.f183377eg = new RelationExtService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7762);
                    throw th;
                }
            }
        }
        RelationExtService relationExtService = (RelationExtService) C81908b.f183377eg;
        MethodCollector.m26664o(7762);
        return relationExtService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r12 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r0 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r0 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        r6 = r0.component1();
        r7 = r0.component2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (r7.length() != 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (p4600h.p4622m.C89361p.m154908a((java.lang.CharSequence) r6, (java.lang.CharSequence) "%s", false) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r9.mo117772a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (r14 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r8 = r14.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (r8 >= 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        r9.mo117772a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        r8 = r11.getMaxWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        r1 = com.C1764a.m5928a(r6, java.util.Arrays.copyOf(new java.lang.Object[]{r7}, 1));
        p4600h.p4611f.p4613b.C89219l.m154716b(r1, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (com.p2082ss.android.ugc.aweme.social.p3917d.C74724a.m131182a(r11, r1, r8) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        p4600h.p4611f.p4613b.C89219l.m154721d(r1, "");
        r9.mo117772a(new com.bytedance.ies.dmt.p1194ui.p1198d.C17191a.C17192a().mo27177a(r1).f40973a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        p077b.C1731i.m5640b(new com.p2082ss.android.ugc.aweme.social.p3917d.C74724a.CallableC74728c(r11, r6, r7, r8, r9), p077b.C1731i.f5562a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    @Override // com.p2082ss.android.ugc.aweme.social.service.IRelationExtService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117776a(com.bytedance.tux.input.TuxTextView r11, com.p2082ss.android.ugc.aweme.profile.model.User r12, com.p2082ss.android.ugc.aweme.feed.model.Aweme r13, java.lang.Integer r14) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.ext.RelationExtService.mo117776a(com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer):void");
    }
}
