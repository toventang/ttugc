package com.p2082ss.android.ugc.aweme.account.p2274n;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.account.bean.C31597d;
import com.p2082ss.android.ugc.aweme.account.experiment.C31644e;
import com.p2082ss.android.ugc.aweme.account.login.EnumC32330v;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31828h;
import com.p2082ss.android.ugc.aweme.account.util.C33051t;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.n.h */
public final class C32858h {
    static {
        Covode.recordClassIndex(39643);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.n.h$1 */
    public static /* synthetic */ class C328591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78236a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 39644(0x9adc, float:5.5553E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.account.login.v[] r0 = com.p2082ss.android.ugc.aweme.account.login.EnumC32330v.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.account.p2274n.C32858h.C328591.f78236a = r2
                com.ss.android.ugc.aweme.account.login.v r0 = com.p2082ss.android.ugc.aweme.account.login.EnumC32330v.FACEBOOK     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.account.p2274n.C32858h.C328591.f78236a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.account.login.v r0 = com.p2082ss.android.ugc.aweme.account.login.EnumC32330v.TWITTER     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.account.p2274n.C32858h.C328591.f78236a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.account.login.v r0 = com.p2082ss.android.ugc.aweme.account.login.EnumC32330v.GOOGLE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.account.p2274n.C32858h.C328591.f78236a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.account.login.v r0 = com.p2082ss.android.ugc.aweme.account.login.EnumC32330v.LINE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.account.p2274n.C32858h.C328591.f78236a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.aweme.account.login.v r0 = com.p2082ss.android.ugc.aweme.account.login.EnumC32330v.KAKAOTALK     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.p2082ss.android.ugc.aweme.account.p2274n.C32858h.C328591.f78236a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.android.ugc.aweme.account.login.v r0 = com.p2082ss.android.ugc.aweme.account.login.EnumC32330v.INSTAGRAM     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r2 = com.p2082ss.android.ugc.aweme.account.p2274n.C32858h.C328591.f78236a     // Catch:{ NoSuchFieldError -> 0x005a }
                com.ss.android.ugc.aweme.account.login.v r0 = com.p2082ss.android.ugc.aweme.account.login.EnumC32330v.VK     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2274n.C32858h.C328591.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static EnumC32330v[] m67461a(boolean z) {
        EnumC32330v[] vVarArr;
        if (C16048b.m29633a().mo25412a(true, "login_platforms_from_server", 1) != 1 || (vVarArr = C33051t.m67698a().mo58836a(z)) == null) {
            vVarArr = C32860i.m67462a(C58071d.m104907a());
        }
        if (z) {
            return C31644e.m65952a(vVarArr);
        }
        return vVarArr;
    }

    /* renamed from: a */
    public static List<C31597d> m67460a(EnumC32330v[] vVarArr) {
        C31597d dVar;
        LinkedList linkedList = new LinkedList();
        if (vVarArr == null) {
            return linkedList;
        }
        for (EnumC32330v vVar : vVarArr) {
            if (C31828h.C31830a.m66175a(vVar)) {
                switch (C328591.f78236a[vVar.ordinal()]) {
                    case 1:
                        dVar = new C31597d("Facebook", 2131231061, "facebook");
                        linkedList.add(dVar);
                        break;
                    case 2:
                        dVar = new C31597d("Twitter", 2131231066, "twitter");
                        linkedList.add(dVar);
                        break;
                    case 3:
                        dVar = new C31597d("Google", 2131231062, "google");
                        linkedList.add(dVar);
                        break;
                    case 4:
                        dVar = new C31597d("Line", 2131231065, "line");
                        linkedList.add(dVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        dVar = new C31597d("Kakao Talk", 2131231064, "kakaotalk");
                        linkedList.add(dVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        dVar = new C31597d("Instagram", 2131231063, "instagram");
                        linkedList.add(dVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        dVar = new C31597d("VK", 2131231067, "vk");
                        linkedList.add(dVar);
                        break;
                }
            }
        }
        return linkedList;
    }
}
