package com.p2082ss.android.ugc.aweme.player.sdk.p3554c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63031a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63052m;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84203g;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.model.C84224v;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.b */
public final class HandlerC63062b extends Handler {

    /* renamed from: a */
    private AbstractC63051l f143278a;

    /* renamed from: b */
    private volatile int f143279b = m113911b(300);

    /* renamed from: c */
    private boolean f143280c;

    /* renamed from: d */
    private AbstractC63063a f143281d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.player.sdk.c.b$a */
    public interface AbstractC63063a {
        static {
            Covode.recordClassIndex(73902);
        }

        /* renamed from: a */
        void mo101204a();
    }

    static {
        Covode.recordClassIndex(73901);
    }

    /* renamed from: b */
    private static int m113911b(int i) {
        int r = C84191b.m144791r();
        if (i < r) {
            return r;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo101202a(int i) {
        if (i > 0) {
            this.f143279b = m113911b(i);
        }
    }

    public final void handleMessage(Message message) {
        if (this.f143278a != null && !this.f143280c) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f143278a.mo100993a((C84217p) message.obj);
                    if (message.obj != null && ((C84217p) message.obj).f188158aC) {
                        if (!((C84217p) message.obj).f188206t || !((C84217p) message.obj).f188156aA) {
                            this.f143278a.mo100988a(AbstractC63042j.EnumC63047e.NORMAL);
                            return;
                        } else {
                            this.f143278a.mo100988a(AbstractC63042j.EnumC63047e.LOW);
                            return;
                        }
                    } else {
                        return;
                    }
                case 2:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                default:
                    return;
                case 3:
                    this.f143278a.mo101009d();
                    return;
                case 4:
                    if (message.obj == null) {
                        this.f143278a.mo101014h();
                        return;
                    } else {
                        this.f143278a.mo100995a((String) message.obj);
                        return;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f143278a.mo101012f();
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.f143278a.mo101011e();
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if ((message.obj instanceof Boolean) && ((Boolean) message.obj).booleanValue()) {
                        this.f143278a.mo100988a(AbstractC63042j.EnumC63047e.LOW);
                    }
                    this.f143278a.mo101013g();
                    this.f143280c = true;
                    AbstractC63063a aVar = this.f143281d;
                    if (aVar != null) {
                        aVar.mo101204a();
                        return;
                    }
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    this.f143278a.mo101006c();
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    Pair pair = (Pair) message.obj;
                    if (pair != null) {
                        this.f143278a.mo100977a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                        return;
                    }
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    this.f143278a.mo100976a(((Float) message.obj).floatValue());
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    this.f143278a.mo101025s();
                    if (C84191b.m144788o()) {
                        removeMessages(12);
                    }
                    sendEmptyMessageDelayed(12, (long) this.f143279b);
                    return;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    Pair pair2 = (Pair) message.obj;
                    if (pair2 != null) {
                        this.f143278a.mo100978a(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                        return;
                    }
                    return;
                case ABRConfig.ABR_SELECT_SCENE:
                    this.f143278a.mo100981a((SurfaceHolder) message.obj);
                    return;
                case 15:
                    this.f143278a.mo100980a((Surface) message.obj);
                    this.f143278a.mo101002b((Surface) message.obj);
                    return;
                case 16:
                    this.f143278a.mo100999b();
                    return;
                case 17:
                    if ((message.obj instanceof Boolean) && ((Boolean) message.obj).booleanValue()) {
                        this.f143278a.mo100988a(AbstractC63042j.EnumC63047e.LOW);
                    }
                    this.f143278a.mo101002b((Surface) null);
                    this.f143278a.mo101022p();
                    return;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    if (message.arg1 == 0) {
                        this.f143278a.mo101007c(message.arg2);
                        return;
                    } else if (message.arg1 == 1) {
                        AbstractC63051l lVar = this.f143278a;
                        if (message.arg2 == 1) {
                            z = true;
                        }
                        lVar.mo100996a(z);
                        return;
                    } else if (message.arg1 == 2) {
                        this.f143278a.mo100990a((AbstractC63052m) message.obj);
                        return;
                    } else {
                        return;
                    }
                case 19:
                    this.f143278a.mo101019m();
                    return;
                case C84224v.f188239U:
                    this.f143278a.mo100973A();
                    return;
                case 21:
                    this.f143278a.mo100980a((Surface) message.obj);
                    return;
                case 22:
                    if (message.arg1 == 0) {
                        this.f143278a.mo101010d(message.arg2);
                        return;
                    } else if (message.arg1 == 2) {
                        this.f143278a.mo100983a((AbstractC63031a) message.obj);
                        return;
                    } else {
                        return;
                    }
                case 23:
                    Bundle bundle = (Bundle) message.obj;
                    this.f143278a.mo100997a(bundle.getBoolean("crop_param_open", false), bundle);
                    return;
                case 24:
                    Bundle bundle2 = (Bundle) message.obj;
                    this.f143278a.mo100979a(bundle2.getInt("texture_layout_param", 0), bundle2);
                    return;
                case 25:
                    C84203g gVar = (C84203g) message.obj;
                    if (gVar != null) {
                        this.f143278a.mo100992a(gVar);
                        return;
                    }
                    return;
            }
        }
    }

    public HandlerC63062b(AbstractC63063a aVar, Looper looper, AbstractC63051l lVar) {
        super(looper);
        this.f143278a = lVar;
        this.f143281d = aVar;
    }
}
