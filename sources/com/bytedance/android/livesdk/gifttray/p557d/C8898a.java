package com.bytedance.android.livesdk.gifttray.p557d;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPerformanceSettings;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gifttray.d.a */
public final class C8898a {

    /* renamed from: a */
    public static final C8898a f21941a = new C8898a();

    private C8898a() {
    }

    static {
        Covode.recordClassIndex(9782);
    }

    /* renamed from: a */
    public static void m17240a(C8871a aVar) {
        String str;
        if (LiveGiftPerformanceSettings.INSTANCE.useNewQueue()) {
            str = "1";
        } else {
            str = "0";
        }
        aVar.mo15125b(str);
    }

    /* renamed from: a */
    public static C8871a m17239a(C9895y yVar, long j) {
        String str;
        String str2;
        C89219l.m154721d(yVar, "");
        C8871a aVar = new C8871a(yVar);
        C9904t findGiftById = GiftManager.inst().findGiftById(yVar.f23934i);
        if (findGiftById == null || (str = findGiftById.f23998c) == null) {
            str = "";
        }
        int i = 0;
        if (yVar.f23933h != null) {
            User user = yVar.f23933h;
            C89219l.m154716b(user, "");
            if (user.getId() > 0) {
                User user2 = yVar.f23933h;
                C89219l.m154716b(user2, "");
                if (user2.getId() != j) {
                    str = C3966y.m9660a((int) R.string.glb, C6581g.m14075a(yVar.f23933h));
                    C89219l.m154716b(str, "");
                }
            }
        }
        aVar.mo15123a(C8899b.m17246d(aVar));
        User user3 = yVar.f23932g;
        if (user3 != null) {
            str2 = user3.displayId;
        } else {
            str2 = null;
        }
        aVar.f21857v = str2;
        aVar.f21833A = yVar.f23944s;
        aVar.f21839d = yVar.f23939n;
        aVar.mo15122a((CharSequence) str);
        int i2 = yVar.f23939n;
        C9904t tVar = yVar.f23945t;
        if (tVar != null) {
            i = tVar.f24001f;
        }
        aVar.f21837b = i2 * i;
        aVar.f21848m = C11200a.m19851a();
        m17240a(aVar);
        return aVar;
    }
}
