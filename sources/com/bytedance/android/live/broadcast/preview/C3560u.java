package com.bytedance.android.live.broadcast.preview;

import android.net.Uri;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.live.broadcast.C3184c;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.C3804z;
import com.bytedance.android.live.broadcast.model.C3260f;
import com.bytedance.android.live.broadcast.model.C3263i;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2939m;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePermissionApplyLynx;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.u */
public final class C3560u {

    /* renamed from: a */
    public static final C3560u f9870a = new C3560u();

    private C3560u() {
    }

    static {
        Covode.recordClassIndex(4044);
    }

    /* renamed from: a */
    public static DialogInterface$OnCancelListenerC0944d m8960a(DataChannel dataChannel, String str) {
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(str, "");
        return m8961a(LivePermissionApplyLynx.INSTANCE.getValue(), dataChannel, str);
    }

    /* renamed from: b */
    public static void m8962b(DataChannel dataChannel, String str) {
        String str2;
        C3263i.C3264a aVar;
        C3263i.C3264a aVar2;
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(str, "");
        Map map = (Map) dataChannel.mo28318b(C3804z.class);
        int i = 0;
        if (!(map == null || (aVar2 = (C3263i.C3264a) map.get(str)) == null || aVar2.f9342a < aVar2.f9344c)) {
            i = 1;
        }
        C6501b a = C6501b.C6502a.m13948a("livesdk_anchor_live_access_apply_show").mo12643a(dataChannel).mo12645a("apply_threshold", i);
        EnumC11728i iVar = (EnumC11728i) dataChannel.mo28318b(C3802x.class);
        Integer num = null;
        if (iVar != null) {
            str2 = C11729j.m20684a(iVar);
        } else {
            str2 = null;
        }
        C6501b a2 = a.mo12651a("live_type", str2);
        Map map2 = (Map) dataChannel.mo28318b(C3804z.class);
        if (!(map2 == null || (aVar = (C3263i.C3264a) map2.get(str)) == null)) {
            num = Integer.valueOf(aVar.f9342a);
        }
        a2.mo12651a("fans_cnt ", String.valueOf(num)).mo12655b();
    }

    /* renamed from: a */
    private static int m8958a(Uri uri, String str, int i) {
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return i;
        }
        return Integer.parseInt(queryParameter);
    }

    /* renamed from: a */
    private static DialogInterface$OnCancelListenerC0944d m8961a(String str, DataChannel dataChannel, String str2) {
        int i;
        boolean z;
        String str3;
        Uri.Builder a = m8959a(str2, str, (Map) dataChannel.mo28318b(C3804z.class), (C3260f) dataChannel.mo28318b(C3184c.class));
        Uri parse = Uri.parse(a.toString());
        AbstractC2939m a2 = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).createLynxDialogBuilder(a.toString(), "").mo7682a(8, 8);
        if (str2.equals("live")) {
            i = 438;
        } else {
            i = 482;
        }
        boolean z2 = false;
        AbstractC2939m e = a2.mo7687b(m8958a(parse, "height", i)).mo7681a(m8958a(parse, "width", (int) C3966y.m9668e(C3966y.m9664c()))).mo7690c(m8958a(parse, "margin", 0)).mo7696e(80);
        if (m8958a(parse, "show_close", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        AbstractC2939m e2 = e.mo7695d(z).mo7689b(true).mo7697e("0.5");
        if (parse == null || (str3 = parse.toString()) == null) {
            str3 = "";
        }
        C89219l.m154716b(str3, "");
        AbstractC2939m c = e2.mo7691c(str3);
        if (m8958a(parse, "landscape_custom_height", 0) == 1) {
            z2 = true;
        }
        return c.mo7685a(z2).mo7686a();
    }

    /* renamed from: a */
    private static Uri.Builder m8959a(String str, String str2, Map<String, ? extends C3263i.C3264a> map, C3260f fVar) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Boolean bool;
        C3263i.C3264a aVar;
        C3263i.C3264a aVar2;
        C3263i.C3264a aVar3;
        C3263i.C3264a aVar4;
        C3263i.C3264a aVar5;
        C3263i.C3264a aVar6;
        C3263i.C3264a aVar7;
        C3263i.C3264a aVar8;
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("permission_type", str);
        Long l = null;
        if (map == null || (aVar8 = (C3263i.C3264a) map.get(str)) == null) {
            num = null;
        } else {
            num = Integer.valueOf(aVar8.f9342a);
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("anchor_fans_num", String.valueOf(num));
        if (map == null || (aVar7 = (C3263i.C3264a) map.get(str)) == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(aVar7.f9343b);
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("forbidden_apply_countdown", String.valueOf(num2));
        if (map == null || (aVar6 = (C3263i.C3264a) map.get(str)) == null) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(aVar6.f9344c);
        }
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("apply_need_fans_num", String.valueOf(num3));
        if (map == null || (aVar5 = (C3263i.C3264a) map.get(str)) == null) {
            num4 = null;
        } else {
            num4 = Integer.valueOf(aVar5.f9345d);
        }
        Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("target_live_time", String.valueOf(num4));
        if (map == null || (aVar4 = (C3263i.C3264a) map.get(str)) == null) {
            num5 = null;
        } else {
            num5 = Integer.valueOf(aVar4.f9346e);
        }
        Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("forbidden_apply_days", String.valueOf(num5));
        if (map == null || (aVar3 = (C3263i.C3264a) map.get(str)) == null) {
            num6 = null;
        } else {
            num6 = Integer.valueOf(aVar3.f9347f);
        }
        Uri.Builder appendQueryParameter7 = appendQueryParameter6.appendQueryParameter("apply_invalid_time", String.valueOf(num6));
        if (map == null || (aVar2 = (C3263i.C3264a) map.get(str)) == null) {
            num7 = null;
        } else {
            num7 = Integer.valueOf(aVar2.f9348g);
        }
        Uri.Builder appendQueryParameter8 = appendQueryParameter7.appendQueryParameter("need_live_time", String.valueOf(num7));
        if (map == null || (aVar = (C3263i.C3264a) map.get(str)) == null) {
            num8 = null;
        } else {
            num8 = Integer.valueOf(aVar.f9349h);
        }
        Uri.Builder appendQueryParameter9 = appendQueryParameter8.appendQueryParameter("apply_status", String.valueOf(num8));
        if (fVar != null) {
            bool = Boolean.valueOf(fVar.mo8600a());
        } else {
            bool = null;
        }
        Uri.Builder appendQueryParameter10 = appendQueryParameter9.appendQueryParameter("can_receive_gift", String.valueOf(bool));
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            l = Long.valueOf(b.mo13161c());
        }
        appendQueryParameter10.appendQueryParameter("user_id", String.valueOf(l));
        C89219l.m154716b(buildUpon, "");
        return buildUpon;
    }
}
