package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.util.C63086d;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;

/* renamed from: com.ss.android.ugc.aweme.video.p */
public final class C80780p {

    /* renamed from: a */
    private static Boolean f180653a;

    /* renamed from: b */
    private static int f180654b;

    /* renamed from: c */
    private static Boolean f180655c;

    static {
        Covode.recordClassIndex(94071);
    }

    /* renamed from: a */
    public static boolean m140118a() {
        if (!C84191b.m144790q()) {
            return m140119b();
        }
        Boolean bool = f180655c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean b = m140119b();
        f180655c = Boolean.valueOf(b);
        return b;
    }

    /* renamed from: b */
    private static boolean m140119b() {
        boolean z;
        boolean z2;
        if (C80716a.C80717a.f180462a.mo123864a().getPlayerType() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean enableForceUseH264CheckPolicy = C80716a.C80717a.f180462a.mo123864a().enableForceUseH264CheckPolicy();
        boolean enableByteVc1FailCheckCountPolicy = C80716a.C80717a.f180462a.mo123864a().enableByteVc1FailCheckCountPolicy();
        if (!C80716a.C80717a.f180462a.mo123864a().enableForceUseH264Global()) {
            if (z && enableForceUseH264CheckPolicy) {
                if (f180653a == null) {
                    if (C63086d.f143386a == null) {
                        if (C63086d.C63087a.m114022a(new C63086d.C63087a.C63088a(), new C63086d.C63087a.C63091d("video/hevc")) != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C63086d.f143386a = Boolean.valueOf(z2);
                    }
                    Boolean valueOf = Boolean.valueOf(C63086d.f143386a.booleanValue());
                    f180653a = valueOf;
                    if (!valueOf.booleanValue()) {
                        C84231a.m144836b().ensureNotReachHere(new Exception(), "hevc not supported.");
                    }
                }
                if (!f180653a.booleanValue() || (enableByteVc1FailCheckCountPolicy && f180654b > 3)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C84241i m140117a(C84240h hVar, C84209m.EnumC84214e eVar) {
        return C80716a.C80717a.f180462a.mo123864a().getVideoPlayAddr(hVar, eVar);
    }
}
