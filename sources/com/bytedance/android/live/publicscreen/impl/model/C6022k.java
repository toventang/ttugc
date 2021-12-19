package com.bytedance.android.live.publicscreen.impl.model;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.android.live.publicscreen.impl.model.chat.C6008c;
import com.bytedance.android.live.publicscreen.impl.p393a.C5895a;
import com.bytedance.android.live.publicscreen.impl.p393a.C5896b;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.chatroom.p499ui.C7759an;
import com.bytedance.android.livesdk.chatroom.p499ui.C7887da;
import com.bytedance.android.livesdk.gift.model.C8865y;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.message.C9595a;
import com.bytedance.android.livesdk.model.message.C9605ai;
import com.bytedance.android.livesdk.model.message.C9620at;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.C9670bg;
import com.bytedance.android.livesdk.model.message.C9689bu;
import com.bytedance.android.livesdk.model.message.C9690bv;
import com.bytedance.android.livesdk.model.message.C9717ca;
import com.bytedance.android.livesdk.model.message.C9719cc;
import com.bytedance.android.livesdk.model.message.C9726ci;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.model.message.C9879j;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.model.message.C9886p;
import com.bytedance.android.livesdk.model.message.C9889s;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.model.message.p592e.C9815b;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.k */
public final class C6022k {
    static {
        Covode.recordClassIndex(6633);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.k$1 */
    static /* synthetic */ class C60231 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15106a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 222
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.model.C6022k.C60231.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m13206a(int i) {
        return C3966y.m9669e().getResources().getColor(i);
    }

    /* renamed from: a */
    public static AbstractC5877k<? extends AbstractC6571a> m13208a(AbstractC6571a aVar) {
        switch (C60231.f15106a[aVar.f28131L.ordinal()]) {
            case 1:
                C9878i iVar = (C9878i) aVar;
                C89219l.m154721d(iVar, "");
                if (C5895a.f14759a.contains(Long.valueOf(iVar.f23852a))) {
                    return new C5896b(iVar);
                }
                return new C5993b(iVar);
            case 2:
                return new C6008c((C9889s) aVar);
            case 3:
                return new C6015e((C9895y) aVar);
            case 4:
                return new C6014d((C9886p) aVar);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new C6018g((C9605ai) aVar);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new C6020i((C9627ay) aVar);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return new C6027m((C9690bv) aVar);
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                C9719cc ccVar = (C9719cc) aVar;
                if (ccVar.f23691i == 1) {
                    return new C6030p(ccVar);
                }
                return new C6031q(ccVar);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return new C5987c((C9883n) aVar);
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return new C6029o((C9717ca) aVar);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                return new C6028n((C9689bu) aVar);
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                return new C5984b((C9879j) aVar);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                return new C6035s((C9726ci) aVar);
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                return new C5983a((C9595a) aVar);
            case 15:
                return new C6021j((C9670bg) aVar);
            case 16:
                return new C6024l((C9815b) aVar);
            case 17:
                return new C6019h((C9620at) aVar);
            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                C8865y yVar = (C8865y) aVar;
                if (yVar.f28134O != null) {
                    return new C6032r(yVar);
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static Spannable m13207a(User user, String str, String str2, int i, int i2) {
        if (user == null || TextUtils.isEmpty(C6581g.m14075a(user)) || TextUtils.isEmpty(C6581g.m14075a(user)) || TextUtils.isEmpty(str2)) {
            return C7557c.f18769a;
        }
        String a = C6581g.m14075a(user);
        C7887da daVar = new C7887da(user, m13206a(i));
        C7759an anVar = new C7759an(user, m13206a(i2));
        SpannableString spannableString = new SpannableString(a + str + str2);
        spannableString.setSpan(daVar, 0, a.length(), 33);
        spannableString.setSpan(anVar, a.length(), spannableString.length(), 18);
        return spannableString;
    }

    /* renamed from: b */
    public static Spannable m13209b(User user, String str, String str2, int i, int i2) {
        if (user == null || TextUtils.isEmpty(C6581g.m14075a(user)) || TextUtils.isEmpty(C6581g.m14075a(user)) || TextUtils.isEmpty(str2)) {
            return C7557c.f18769a;
        }
        String a = C6581g.m14075a(user);
        C7887da daVar = new C7887da(user, m13206a(i));
        C7759an anVar = new C7759an(user, m13206a(i2));
        SpannableString spannableString = new SpannableString(a + str + str2);
        spannableString.setSpan(daVar, 0, a.length() + 1, 33);
        spannableString.setSpan(anVar, a.length() + 1, spannableString.length(), 18);
        return spannableString;
    }
}
