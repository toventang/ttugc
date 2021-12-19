package com.p2082ss.android.ugc.aweme.tools;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.ActivityC18242f;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.a */
public class C77804a {

    /* renamed from: a */
    public static final int f174539a = R.anim.f205073do;

    /* renamed from: b */
    public static final int f174540b = R.anim.dx;

    /* renamed from: c */
    public static final int f174541c = R.anim.dq;

    /* renamed from: d */
    public static final int f174542d = R.anim.dv;

    /* renamed from: e */
    public static final int f174543e = R.anim.dp;

    /* renamed from: f */
    public static final int f174544f = R.anim.dy;

    /* renamed from: g */
    public static final int f174545g = R.anim.dr;

    /* renamed from: h */
    public static final int f174546h = R.anim.dw;

    /* renamed from: i */
    public static final int f174547i = R.anim.w;

    /* renamed from: j */
    public static final int f174548j = R.anim.x;

    /* renamed from: k */
    public static final int f174549k = R.anim.bj;

    /* renamed from: l */
    public static final int f174550l = R.anim.bk;

    /* renamed from: m */
    public static final int f174551m = R.anim.dn;

    /* renamed from: n */
    public static final int f174552n = R.anim.du;

    /* renamed from: o */
    public static final int f174553o = R.anim.e9;

    static {
        Covode.recordClassIndex(90888);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m135920a(Activity activity, int i) {
        int i2;
        int i3 = 0;
        switch (i) {
            case 0:
                i3 = f174541c;
                i2 = f174542d;
                break;
            case 1:
                i2 = 0;
                break;
            case 2:
                i3 = f174545g;
                i2 = f174546h;
                break;
            case 3:
                i3 = f174547i;
                i2 = 0;
                break;
            case 4:
                i3 = f174539a;
                i2 = f174540b;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            default:
                i3 = f174541c;
                i2 = f174542d;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                i3 = f174539a;
                i2 = 0;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                i3 = f174547i;
                i2 = f174550l;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                i3 = f174547i;
                i2 = f174552n;
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i3 = f174547i;
                i2 = f174553o;
                break;
        }
        if (activity instanceof ActivityC18242f) {
            ((ActivityC18242f) activity).mo29101a(i3, i2);
        } else {
            activity.overridePendingTransition(i3, i2);
        }
    }

    /* renamed from: b */
    public static void m135921b(Activity activity, int i) {
        int i2;
        int i3 = 0;
        switch (i) {
            case 0:
                i3 = f174539a;
                i2 = f174540b;
                break;
            case 1:
                i2 = 0;
                break;
            case 2:
                i3 = f174543e;
                i2 = f174544f;
                break;
            case 3:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i2 = f174548j;
                break;
            case 4:
                i3 = f174541c;
                i2 = f174542d;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                i2 = f174542d;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            default:
                i3 = f174539a;
                i2 = f174540b;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                i3 = f174549k;
                i2 = f174548j;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                i3 = f174551m;
                i2 = f174548j;
                break;
        }
        activity.overridePendingTransition(i3, i2);
    }
}
