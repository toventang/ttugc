package com.bytedance.android.livesdk.gifttray.p557d;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPerformanceSettings;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gifttray.d.b */
public final class C8899b {

    /* renamed from: a */
    public static final C8899b f21942a = new C8899b();

    private C8899b() {
    }

    static {
        Covode.recordClassIndex(9783);
    }

    /* renamed from: c */
    public static long m17245c(C8871a aVar) {
        C9895y yVar;
        C11778b bVar;
        if (aVar == null || (yVar = aVar.f21835C) == null || (bVar = yVar.f28134O) == null) {
            return 0;
        }
        return bVar.f28135a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r2 != null) goto L_0x000d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m17244b(com.bytedance.android.livesdk.gifttray.p554a.C8871a r2) {
        /*
            r1 = 0
            if (r2 == 0) goto L_0x0011
            com.bytedance.android.livesdk.model.message.y r0 = r2.f21835C
            if (r0 == 0) goto L_0x0011
            com.bytedance.android.livesdk.model.t r0 = r0.f23945t
            if (r0 == 0) goto L_0x0011
            int r0 = r0.f24001f
        L_0x000d:
            int r1 = r2.f21839d
        L_0x000f:
            int r0 = r0 * r1
            return r0
        L_0x0011:
            r0 = 0
            if (r2 == 0) goto L_0x000f
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.p557d.C8899b.m17244b(com.bytedance.android.livesdk.gifttray.a.a):int");
    }

    /* renamed from: a */
    public static boolean m17242a(C8871a aVar) {
        C9895y yVar;
        C9904t tVar;
        Integer valueOf;
        if (aVar == null) {
            return false;
        }
        if (aVar.f21838c == C8871a.EnumC8872a.VIDEO_ONLY) {
            return true;
        }
        if (aVar.f21838c == C8871a.EnumC8872a.TRAY_ONLY || (yVar = aVar.f21835C) == null || (tVar = yVar.f23945t) == null || (valueOf = Integer.valueOf(tVar.f24000e)) == null || (valueOf.intValue() != 2 && valueOf.intValue() != 8)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r5 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r2 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r2 = "";
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m17241a(com.bytedance.android.livesdk.model.message.p579c.C9698b r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0044
            java.lang.String r0 = r5.f23645a
        L_0x0005:
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x003c
            com.bytedance.android.livesdk.i18n.b r1 = com.bytedance.android.livesdk.i18n.C8983b.m17319a()
            java.lang.String r0 = r5.f23645a
            java.lang.String r0 = r1.mo15219a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003e
            com.bytedance.android.livesdk.i18n.b r1 = com.bytedance.android.livesdk.i18n.C8983b.m17319a()
            java.lang.String r0 = r5.f23645a
            java.lang.String r2 = r1.mo15219a(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r3)
        L_0x0026:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0046
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.p491f.C7557c.m15540a(r2, r5, r4)
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p491f.C7557c.f18769a
            if (r1 == r0) goto L_0x0046
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p491f.C7557c.m15540a(r2, r5, r4)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            return r0
        L_0x003c:
            if (r5 == 0) goto L_0x0042
        L_0x003e:
            java.lang.String r2 = r5.f23646b
            if (r2 != 0) goto L_0x0026
        L_0x0042:
            r2 = r3
            goto L_0x0026
        L_0x0044:
            r0 = r4
            goto L_0x0005
        L_0x0046:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.p557d.C8899b.m17241a(com.bytedance.android.livesdk.model.message.c.b):java.lang.CharSequence");
    }

    /* renamed from: d */
    public static String m17246d(C8871a aVar) {
        Long l;
        Long l2;
        Long l3;
        User user;
        User user2;
        C89219l.m154721d(aVar, "");
        StringBuffer stringBuffer = new StringBuffer();
        C9895y yVar = aVar.f21835C;
        Long l4 = null;
        if (yVar != null) {
            l = Long.valueOf(yVar.f23934i);
        } else {
            l = null;
        }
        stringBuffer.append(l);
        C9895y yVar2 = aVar.f21835C;
        if (yVar2 == null || (user2 = yVar2.f23932g) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(user2.getId());
        }
        stringBuffer.append(l2);
        C9895y yVar3 = aVar.f21835C;
        if (yVar3 == null || (user = yVar3.f23933h) == null) {
            l3 = null;
        } else {
            l3 = Long.valueOf(user.getId());
        }
        stringBuffer.append(l3);
        if (!aVar.f21833A || LiveGiftPerformanceSettings.INSTANCE.useNewSelfQueue()) {
            C9895y yVar4 = aVar.f21835C;
            if (yVar4 != null) {
                l4 = Long.valueOf(yVar4.f23941p);
            }
            stringBuffer.append(l4);
        }
        String stringBuffer2 = stringBuffer.toString();
        C89219l.m154716b(stringBuffer2, "");
        return stringBuffer2;
    }

    /* renamed from: a */
    public static boolean m17243a(C8871a aVar, C8871a aVar2) {
        if (aVar == null || aVar2 == null || !C89219l.m154714a((Object) m17246d(aVar), (Object) m17246d(aVar2)) || m17242a(aVar) || m17242a(aVar2)) {
            return false;
        }
        return true;
    }
}
