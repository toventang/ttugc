package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31455c;
import com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31482a;
import com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31515d;
import com.p2082ss.android.ugc.aweme.account.login.p2259d.C31899b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32617b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32623d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32634g;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32642h;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32687n;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32696o;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32700p;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32716r;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32725s;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32731t;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32746u;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32758v;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32766w;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.View$OnClickListenerC32630f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.View$OnClickListenerC32647j;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32018b;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32034f;
import com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32053b;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32259r;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32276s;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32297y;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32302z;
import com.p2082ss.android.ugc.aweme.account.p2242b.C31576a;
import com.p2082ss.android.ugc.aweme.account.p2242b.C31581b;
import com.p2082ss.android.ugc.aweme.account.p2245d.C31615a;
import com.p2082ss.android.ugc.aweme.account.p2245d.C31622b;
import com.p2082ss.android.ugc.aweme.account.p2245d.C31627c;
import com.p2082ss.android.ugc.aweme.account.p2253l.C31720a;
import com.p2082ss.android.ugc.aweme.account.p2253l.C31734c;
import com.p2082ss.android.ugc.aweme.account.p2253l.C31744g;
import com.p2082ss.android.ugc.aweme.account.p2253l.C31751i;
import com.p2082ss.android.ugc.aweme.account.p2276o.C32887a;
import com.p2082ss.android.ugc.aweme.account.p2276o.C32896c;
import com.p2082ss.android.ugc.aweme.account.p2276o.C32903d;
import com.p2082ss.android.ugc.aweme.account.unbind.C32998a;
import com.p2082ss.android.ugc.aweme.account.unbind.C33012c;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.i */
public final class C32791i {

    /* renamed from: a */
    public static final C32791i f78141a = new C32791i();

    private C32791i() {
    }

    static {
        Covode.recordClassIndex(39570);
    }

    /* renamed from: a */
    public static AbstractC32572b m67383a(EnumC32594j jVar) {
        C89219l.m154721d(jVar, "");
        switch (C32792j.f78142a[jVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new C32623d();
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return new View$OnClickListenerC32647j();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return new C32896c();
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 16:
            case 17:
            case LiveRechargeAgeThresholdSetting.DEFAULT:
            case 19:
                return new C31455c();
            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
            case 21:
            case 22:
                return new C32700p();
            case 23:
                return new C32687n();
            case 24:
                return new C32696o();
            case 25:
                return new C32716r();
            case 26:
                return new C32725s();
            case 27:
                return new C32758v();
            case 28:
            case 29:
                return new View$OnClickListenerC32630f();
            case 30:
                return new C32731t();
            case 31:
                return new C32746u();
            case 32:
                return new C32634g();
            case 33:
                return new C32018b();
            case 34:
                return new C32034f();
            case 35:
                return new View$OnClickListenerC32630f();
            case 36:
                return new C32731t();
            case 37:
                return new View$OnClickListenerC32647j();
            case 38:
                return new C31744g();
            case 39:
                return new C31720a();
            case 40:
            case 41:
                return new C31751i();
            case 42:
                return new C31581b();
            case 43:
                return new C31576a();
            case BuildConfig.VERSION_CODE:
                return new C31622b();
            case 45:
                return new C31627c();
            case 46:
                return new C31615a();
            case 47:
                return new C32887a();
            case 48:
                return new C32903d();
            case 49:
                return new C31734c();
            case 50:
                return new C32053b();
            case 51:
            case 52:
            case 53:
                return new C32766w();
            case 54:
                return new C31482a();
            case 55:
                return new C31515d();
            case 56:
                return new C32617b();
            case 57:
            case 58:
                return new C32259r();
            case 59:
                return new C32276s();
            case AudiencePingIntervalSetting.DEFAULT:
                return new C32297y();
            case 61:
                return new C32302z();
            case 62:
                return new C31899b();
            case 63:
                return new C32611a();
            case 64:
            case 65:
                return new C32998a();
            case 66:
            case 67:
            case 68:
                return new C33012c();
            case 69:
                return new C32642h();
            default:
                throw new IllegalArgumentException("Unknown step " + jVar + " in LoginFlowFactory");
        }
    }
}
