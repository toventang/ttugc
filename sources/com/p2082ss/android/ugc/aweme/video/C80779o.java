package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.player.p3549ab.C62907a;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.aweme.simkit.model.p3912a.C74675a;
import com.p2082ss.android.ugc.aweme.video.p4208b.AbstractC80699t;
import com.p2082ss.android.ugc.playerkit.model.C84209m;

/* renamed from: com.ss.android.ugc.aweme.video.o */
public final class C80779o {

    /* renamed from: a */
    public static boolean f180652a;

    static {
        Covode.recordClassIndex(94070);
    }

    /* renamed from: c */
    public static boolean m140115c() {
        if (f180652a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m140116d() {
        return C16048b.m29633a().mo25412a(true, "player_type", 0);
    }

    /* renamed from: b */
    public static C84209m.EnumC84214e m140114b() {
        if (m140113a() == null && m140116d() == 6) {
            return C84209m.EnumC84214e.TT_HARDWARE;
        }
        return C84209m.EnumC84214e.TT;
    }

    /* renamed from: a */
    public static C62907a m140113a() {
        C74675a decodeType;
        int i;
        int i2;
        try {
            int i3 = 0;
            C62907a aVar = (C62907a) C16048b.m29633a().mo25416a(false, "player_type_v2", C62907a.class, AbstractC80699t.f180420a);
            RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.f180314a.f180316b;
            if (rateSettingsResponse == null || (decodeType = rateSettingsResponse.getDecodeType()) == null) {
                return aVar;
            }
            C62907a aVar2 = new C62907a();
            if (decodeType.f167838a != -1) {
                i = decodeType.f167838a;
            } else if (aVar != null) {
                i = aVar.f142799a;
            } else {
                i = 0;
            }
            aVar2.f142799a = i;
            if (decodeType.f167840c != -1) {
                i2 = decodeType.f167840c;
            } else if (aVar != null) {
                i2 = aVar.f142801c;
            } else {
                i2 = 0;
            }
            aVar2.f142801c = i2;
            if (decodeType.f167839b != -1) {
                aVar2.f142800b = decodeType.f167839b;
            } else {
                if (aVar != null) {
                    i3 = aVar.f142800b;
                }
                aVar2.f142800b = i3;
            }
            return aVar2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
