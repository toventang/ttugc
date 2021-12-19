package com.bytedance.android.live.publicscreen.impl.model;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.chatroom.p499ui.C7759an;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.i */
public final class C6020i extends AbstractC5877k<C9627ay> {
    static {
        Covode.recordClassIndex(6631);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9627ay) this.f14737d).f23444f;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: F */
    public final C9698b mo11705F() {
        if (!mo11702C() || ((C9627ay) this.f14737d).f23457s == null) {
            return super.mo11705F();
        }
        return ((C9627ay) this.f14737d).f23457s;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: h_ */
    public final int mo10712h_() {
        if (((C9627ay) this.f14737d).f23446h == 1) {
            return 2131234677;
        }
        return super.mo10712h_();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: k */
    public final boolean mo11683k() {
        if (((C9627ay) this.f14737d).f23446h != 1) {
            return false;
        }
        if (mo11702C() || this.f14737d.f28134O.f28145k != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private boolean m13196s() {
        if (!mo11702C() || ((C9627ay) this.f14737d).f23446h != 1) {
            return false;
        }
        if (((!TextUtils.equals(((C9627ay) this.f14737d).f23458t, "live_merge-live_cover") || !TextUtils.equals(((C9627ay) this.f14737d).f23460v, "hour")) && !TextUtils.equals(((C9627ay) this.f14737d).f23458t, "live_detail-hourly_rank")) || !TextUtils.equals(((C9627ay) this.f14737d).f23459u, "click")) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private boolean m13197t() {
        if (!mo11702C() || !TextUtils.equals(((C9627ay) this.f14737d).f23459u, "click")) {
            return false;
        }
        if ((TextUtils.equals(((C9627ay) this.f14737d).f23458t, "live_merge-live_cover") && TextUtils.equals(((C9627ay) this.f14737d).f23460v, "week")) || TextUtils.equals(((C9627ay) this.f14737d).f23458t, "live_detail-weekly_rank") || TextUtils.equals(((C9627ay) this.f14737d).f23458t, "live_detail-weekly_rank_notice")) {
            return true;
        }
        if (!TextUtils.equals(((C9627ay) this.f14737d).f23458t, "homepage_hot-live_cell") || !TextUtils.equals(((C9627ay) this.f14737d).f23460v, "week")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        String a;
        switch (((C9627ay) this.f14737d).f23446h) {
            case 1:
                ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
                ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
                User user = ((C9627ay) this.f14737d).f23444f;
                if (m13197t()) {
                    a = C3966y.m9660a((int) R.string.dry, "");
                } else if (m13196s()) {
                    a = C3966y.m9657a((int) R.string.e7f);
                    if (((C9627ay) this.f14737d).f23445g) {
                        a = C3966y.m9660a((int) R.string.grw, Long.valueOf((long) ((C9627ay) this.f14737d).f23447i), a);
                    }
                } else {
                    a = m13193a((C9627ay) this.f14737d);
                }
                return C6022k.m13207a(user, "  ", a, R.color.a1l, R.color.a07);
            case 2:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            default:
                User user2 = ((C9627ay) this.f14737d).f23444f;
                String a2 = m13193a((C9627ay) this.f14737d);
                ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
                ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
                return C6022k.m13207a(user2, "  ", a2, R.color.xy, R.color.y0);
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                User b = mo10375b();
                String a3 = m13193a((C9627ay) this.f14737d);
                ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
                SpannableString spannableString = new SpannableString(a3);
                spannableString.setSpan(new C7759an(b, C6022k.m13206a((int) R.color.a04)), 0, spannableString.length(), 18);
                return spannableString;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                String str = "Top" + ((long) ((C9627ay) this.f14737d).f23447i);
                String a4 = m13193a((C9627ay) this.f14737d);
                if (C6229a.m13521a(C3966y.m9669e())) {
                    str = ((long) ((C9627ay) this.f14737d).f23447i) + "Top";
                    a4 = new StringBuffer(a4).reverse().toString();
                }
                String[] split = a4.split(str);
                if (split[0].length() == a4.length()) {
                    return C7557c.f18769a;
                }
                SpannableString spannableString2 = new SpannableString(a4);
                ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
                int a5 = C6022k.m13206a((int) R.color.a04);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(a5);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(a5);
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(a5);
                spannableString2.setSpan(foregroundColorSpan2, 0, split[0].length(), 18);
                spannableString2.setSpan(foregroundColorSpan, split[0].length(), split[0].length() + str.length(), 18);
                spannableString2.setSpan(foregroundColorSpan3, split[0].length() + str.length(), a4.length(), 18);
                spannableString2.setSpan(new C7759an(mo10375b(), a5), 0, spannableString2.length(), 18);
                return spannableString2;
        }
    }

    public C6020i(C9627ay ayVar) {
        super(ayVar);
    }

    /* renamed from: b */
    private static boolean m13194b(C9627ay ayVar) {
        if (ayVar.f23448j == null || ayVar.f23448j.getUserAttr() == null || !ayVar.f23448j.getUserAttr().f23193c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static String m13195c(C9627ay ayVar) {
        if (ayVar.f23452n == null) {
            if (ayVar.f23446h != 1) {
                ayVar.f23452n = "";
            } else {
                ayVar.f23452n = m13192a(R.string.gs5, new Object[0]);
            }
        }
        return ayVar.f23452n;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5872g
    /* renamed from: b */
    public final void mo11686b(C5889g gVar) {
        super.mo11686b(gVar);
        if (m13196s() || m13197t()) {
            ((C9627ay) this.f14737d).f23462x = true;
            ((C9627ay) this.f14737d).f23463y = false;
            return;
        }
        ((C9627ay) this.f14737d).f23462x = false;
        ((C9627ay) this.f14737d).f23463y = true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static String m13193a(C9627ay ayVar) {
        String a;
        String a2;
        String a3;
        String str = "";
        if (ayVar == null) {
            return str;
        }
        if (ayVar.f23448j == null) {
            a = str;
        } else {
            a = C6581g.m14075a(ayVar.f23448j);
        }
        User user = ayVar.f23444f;
        switch (ayVar.f23446h) {
            case 1:
                if (!ayVar.f23445g) {
                    return m13195c(ayVar);
                }
                return m13192a(R.string.grw, Long.valueOf((long) ayVar.f23447i), m13195c(ayVar));
            case 2:
                if (!ayVar.f23445g) {
                    return m13192a(R.string.gs9, new Object[0]);
                }
                return m13192a(R.string.grx, Long.valueOf((long) ayVar.f23447i));
            case 3:
                if (m13194b(ayVar)) {
                    if (user == null) {
                        return str;
                    }
                    return m13192a(R.string.gsi, C6581g.m14075a(user), a);
                } else if (user == null) {
                    return str;
                } else {
                    return C6581g.m14075a(user) + m13192a(R.string.gsh, new Object[0]);
                }
            case 4:
                if (m13194b(ayVar)) {
                    if (user == null) {
                        return str;
                    }
                    return m13192a(R.string.gsk, C6581g.m14075a(user), a);
                } else if (user == null) {
                    return str;
                } else {
                    return C6581g.m14075a(user) + m13192a(R.string.gsj, new Object[0]);
                }
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return C6581g.m14075a(user) + " " + m13192a(R.string.gsf, new Object[0]);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return C6581g.m14075a(user) + " " + m13192a(R.string.gs3, new Object[0]);
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                if (((long) ayVar.f23447i) > 0) {
                    if (ayVar.f23449k) {
                        return m13192a(R.string.gs2, C6581g.m14075a(user), Long.valueOf((long) ayVar.f23447i));
                    }
                    return m13192a(R.string.gs1, C6581g.m14075a(user), Long.valueOf((long) ayVar.f23447i));
                }
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                Object[] objArr = new Object[2];
                if (user == null) {
                    a2 = str;
                } else {
                    a2 = C6581g.m14075a(user);
                }
                objArr[0] = a2;
                if (ayVar.f23448j != null) {
                    str = C6581g.m14075a(ayVar.f23448j);
                }
                objArr[1] = str;
                return m13192a(R.string.gsi, objArr);
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                Object[] objArr2 = new Object[2];
                if (user == null) {
                    a3 = str;
                } else {
                    a3 = C6581g.m14075a(user);
                }
                objArr2[0] = a3;
                if (ayVar.f23448j != null) {
                    str = C6581g.m14075a(ayVar.f23448j);
                }
                objArr2[1] = str;
                return m13192a(R.string.gsk, objArr2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                if (m13194b(ayVar)) {
                    if (user == null) {
                        return str;
                    }
                    return C6581g.m14075a(user) + m13192a(R.string.gs7, new Object[0]);
                } else if (user == null) {
                    return str;
                } else {
                    return C6581g.m14075a(user) + m13192a(R.string.gs6, new Object[0]);
                }
        }
        return str;
    }

    /* renamed from: a */
    private static String m13192a(int i, Object... objArr) {
        Context e = C3966y.m9669e();
        if (objArr.length > 0) {
            return e.getResources().getString(i, objArr);
        }
        return e.getResources().getString(i);
    }
}
