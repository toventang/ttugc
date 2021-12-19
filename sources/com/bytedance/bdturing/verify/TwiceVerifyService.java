package com.bytedance.bdturing.verify;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.bdturing.AbstractC13248b;
import com.bytedance.bdturing.twiceverify.C13314c;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;
import com.bytedance.bdturing.verify.p867a.AbstractC13322a;
import com.bytedance.bdturing.verify.p867a.C13324c;
import com.bytedance.bdturing.verify.p867a.C13328g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

public class TwiceVerifyService implements AbstractC13321a {
    static {
        Covode.recordClassIndex(15287);
    }

    @Override // com.bytedance.bdturing.verify.AbstractC13321a
    public boolean isProcess(int i) {
        switch (i) {
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                return true;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
            default:
                return false;
        }
    }

    @Override // com.bytedance.bdturing.verify.AbstractC13321a
    public boolean execute(AbstractC13322a aVar, final AbstractC13248b bVar) {
        if (C13314c.m23939a().f32564a == null) {
            return false;
        }
        C13314c a = C13314c.m23939a();
        a.f32565b = new C13314c.AbstractC13316a() {
            /* class com.bytedance.bdturing.verify.TwiceVerifyService.C133201 */

            static {
                Covode.recordClassIndex(15288);
            }

            @Override // com.bytedance.bdturing.twiceverify.C13314c.AbstractC13316a
            /* renamed from: a */
            public final void mo21485a() {
                bVar.mo21412b(0);
            }

            @Override // com.bytedance.bdturing.twiceverify.C13314c.AbstractC13316a
            /* renamed from: a */
            public final void mo21486a(int i) {
                bVar.mo21411a(i);
            }
        };
        if (!(aVar instanceof C13328g) && !(aVar instanceof C13324c)) {
            a.f32567d = aVar;
            Intent intent = new Intent();
            Activity activity = aVar.f32577a;
            intent.setClass(activity, TwiceVerifyWebActivity.class);
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }
        return true;
    }
}
