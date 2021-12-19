package com.bytedance.android.livesdk.p425aa;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.p492g.C7589k;
import com.bytedance.android.livesdk.p425aa.AbstractC6556j;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p428c.C6520a;
import com.bytedance.android.livesdk.p425aa.p428c.C6522b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1204e.p1205a.C17305a;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.aa.f */
public final class C6545f {

    /* renamed from: a */
    public boolean f16340a = true;

    static {
        Covode.recordClassIndex(7281);
    }

    /* renamed from: b */
    public final void mo12681b(final EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && enterRoomConfig.f28232b != null && enterRoomConfig.f28233c != null) {
            final String str = enterRoomConfig.f28232b.f28265i;
            final String str2 = enterRoomConfig.f28232b.f28266j;
            final String str3 = enterRoomConfig.f28232b.f28257a;
            final long j = enterRoomConfig.f28233c.f28301R;
            final String str4 = enterRoomConfig.f28233c.f28323ad;
            final String str5 = enterRoomConfig.f28233c.f28363s;
            final String str6 = enterRoomConfig.f28232b.f28274r;
            final String str7 = enterRoomConfig.f28232b.f28258b;
            C17305a.m32043a().mo27615a(null, new Callable() {
                /* class com.bytedance.android.livesdk.p425aa.C6545f.CallableC65461 */

                static {
                    Covode.recordClassIndex(7282);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str;
                    HashMap hashMap = new HashMap();
                    hashMap.put("room_id", String.valueOf(j));
                    hashMap.put("anchor_id", String.valueOf(str7));
                    hashMap.put("request_id", str3);
                    if (!TextUtils.isEmpty(str4)) {
                        hashMap.put("moment_room_source", str4);
                    }
                    hashMap.put("is_preview", enterRoomConfig.f28233c.f28361q);
                    hashMap.put("is_sale", "unknown");
                    hashMap.put("orientation", String.valueOf(enterRoomConfig.f28233c.f28362r));
                    if (!C13627m.m24498a(enterRoomConfig.f28233c.f28306W)) {
                        hashMap.put("live_window_mode", enterRoomConfig.f28233c.f28306W);
                    }
                    if (enterRoomConfig.f28233c.f28324ae != -1) {
                        hashMap.put("small_picture_order", String.valueOf(enterRoomConfig.f28233c.f28324ae));
                    }
                    if (C6545f.this.f16340a) {
                        if (!TextUtils.isEmpty(enterRoomConfig.f28232b.f28257a)) {
                            hashMap.put("request_id", enterRoomConfig.f28232b.f28257a);
                        }
                        if (!TextUtils.isEmpty(enterRoomConfig.f28232b.f28263g)) {
                            hashMap.put("log_pb", enterRoomConfig.f28232b.f28263g);
                        }
                        C7589k.m15599a(C6545f.this.f16340a, enterRoomConfig);
                        C6545f.this.f16340a = false;
                    } else {
                        C6538d.m13976a(Long.valueOf(j));
                        C6538d.m13979b(Long.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
                        C7589k.m15599a(C6545f.this.f16340a, enterRoomConfig);
                    }
                    if (!TextUtils.isEmpty(str5) && "draw".equals(enterRoomConfig.f28233c.f28321ab)) {
                        hashMap.put("scene_id", str5);
                    }
                    String str2 = "0";
                    if (TextUtils.isEmpty(str6) || !"click_push_live_cd_user".equals(str6)) {
                        hashMap.put("is_subscribe", str2);
                    } else {
                        hashMap.put("is_subscribe", "1");
                    }
                    hashMap.put("growth_deepevent", "1");
                    if (enterRoomConfig.f28232b.f28268l) {
                        str = "1";
                    } else {
                        str = str2;
                    }
                    hashMap.put("is_video_head", str);
                    hashMap.put("live_type", C11729j.m20684a(enterRoomConfig.f28233c.f28302S));
                    hashMap.put("request_page", str);
                    hashMap.put("anchor_type", str2);
                    if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
                        hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
                    }
                    if (!TextUtils.isEmpty(enterRoomConfig.f28232b.f28247D)) {
                        hashMap.put("enter_live_method", enterRoomConfig.f28232b.f28247D);
                    }
                    if (!TextUtils.isEmpty(enterRoomConfig.f28232b.f28248E)) {
                        hashMap.put("order", enterRoomConfig.f28232b.f28248E);
                    }
                    if (!TextUtils.isEmpty(enterRoomConfig.f28232b.f28249F)) {
                        hashMap.put("watch_user_cnt", enterRoomConfig.f28232b.f28249F);
                    }
                    hashMap.put("request_page", C7411d.m15284a().mo13614e());
                    if (!TextUtils.isEmpty(C6544e.m13999m())) {
                        hashMap.put("list_item_id", String.valueOf(j));
                    }
                    if (enterRoomConfig.f28233c.f28342aw) {
                        str2 = "1";
                    }
                    hashMap.put("is_return", str2);
                    if (!TextUtils.isEmpty(enterRoomConfig.f28232b.f28262f)) {
                        hashMap.put("live_reason", enterRoomConfig.f28232b.f28262f);
                    }
                    hashMap.put("has_banner", String.valueOf(C2695a.f8059g.mo7220c()));
                    C6501b.C6502a.m13948a("rec_live_play").mo12652a((Map<String, String>) hashMap).mo12639a().mo12654b("live_view").mo12661f(enterRoomConfig.f28233c.f28321ab).mo12655b();
                    return null;
                }
            }, 0);
        }
    }

    /* renamed from: a */
    public static void m14005a(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig enterRoomConfig2 = C11870f.C11871a.f28404a.mo19010a().f28391b;
        if (DataChannelGlobal.f42558d.mo28324b(C6522b.class) == null) {
            C6520a.C6521a aVar = new C6520a.C6521a();
            aVar.f16237a = enterRoomConfig2.f28233c.f28295L;
            aVar.f16238b = enterRoomConfig.f28233c.f28293J;
            aVar.f16239c = enterRoomConfig.f28232b.f28269m;
            if (enterRoomConfig.f28232b.f28270n != 0) {
                aVar.f16240d = Long.valueOf(enterRoomConfig.f28232b.f28270n);
            }
            aVar.f16241e = enterRoomConfig.f28232b.f28259c;
            aVar.f16242f = enterRoomConfig.f28232b.f28271o;
            aVar.f16245i = enterRoomConfig.f28232b.f28272p;
            aVar.f16246j = enterRoomConfig.f28232b.f28274r;
            aVar.f16247k = enterRoomConfig.f28232b.f28275s;
            aVar.f16248l = enterRoomConfig.f28232b.f28273q;
            aVar.f16249m = enterRoomConfig.f28232b.f28262f;
            aVar.f16224D = enterRoomConfig.f28232b.f28251H;
            aVar.f16226F = (long) C2695a.f8059g.mo7216a().size();
            aVar.f16227G = enterRoomConfig.f28232b.f28254K;
            aVar.f16228H = enterRoomConfig.f28232b.f28255L;
            aVar.f16225E = enterRoomConfig.f28232b.f28253J;
            aVar.f16229I = enterRoomConfig.f28232b.f28252I;
            aVar.f16251o = enterRoomConfig.f28232b.f28280x;
            aVar.f16252p = enterRoomConfig.f28232b.f28281y;
            aVar.f16253q = enterRoomConfig.f28232b.f28282z;
            aVar.f16254r = enterRoomConfig.f28232b.f28244A;
            aVar.f16255s = enterRoomConfig.f28232b.f28245B;
            aVar.f16256t = Boolean.valueOf(enterRoomConfig.f28232b.f28268l);
            aVar.f16250n = enterRoomConfig.f28233c.f28296M;
            aVar.f16257u = enterRoomConfig.f28232b.f28263g;
            aVar.f16258v = enterRoomConfig.f28232b.f28257a;
            aVar.f16223C = enterRoomConfig.f28232b.f28250G;
            aVar.f16232L = enterRoomConfig.f28233c.f28317aG;
            String str = enterRoomConfig2.f28233c.f28361q;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            aVar.f16259w = str;
            if (enterRoomConfig2.f28233c.f28324ae != -1) {
                aVar.f16261y = Long.valueOf(enterRoomConfig2.f28233c.f28324ae);
            }
            if (enterRoomConfig.f28233c.f28340au.f28241c == 1) {
                aVar.f16262z = "1";
                aVar.f16222B = enterRoomConfig.f28233c.f28340au.f28242d;
            } else {
                aVar.f16262z = "0";
            }
            aVar.f16230J = enterRoomConfig.f28232b.f28260d;
            aVar.f16231K = enterRoomConfig.f28232b.f28261e;
            aVar.f16233M = Long.valueOf(enterRoomConfig.f28233c.f28318aH);
            aVar.f16234N = Long.valueOf(enterRoomConfig.f28233c.f28319aI);
            C11199a.m19847a(enterRoomConfig, aVar);
            DataChannelGlobal.f42558d.mo28321a(C6522b.class, aVar.mo12669a());
        }
    }

    /* renamed from: a */
    public static void m14007a(String str, EnterRoomConfig enterRoomConfig) {
        String str2 = enterRoomConfig.f28232b.f28257a;
        if (TextUtils.isEmpty(str2)) {
            str2 = enterRoomConfig.f28232b.f28257a;
        }
        String str3 = enterRoomConfig.f28232b.f28263g;
        long j = enterRoomConfig.f28233c.f28301R;
        String str4 = enterRoomConfig.f28232b.f28258b;
        String c = C6544e.m13989c();
        String str5 = enterRoomConfig.f28233c.f28323ad;
        String str6 = enterRoomConfig.f28233c.f28363s;
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j));
        hashMap.put("anchor_id", str4);
        C6538d.m13976a(Long.valueOf(j));
        C6538d.m13979b(Long.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
        String str7 = enterRoomConfig.f28233c.f28293J;
        String str8 = enterRoomConfig.f28233c.f28295L;
        hashMap.put("request_id", str2);
        hashMap.put("log_pb", str3);
        hashMap.put("action_type", str);
        hashMap.put("enter_from_merge", str7);
        hashMap.put("enter_method", str8);
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("moment_room_source", str5);
        }
        if (!TextUtils.isEmpty(str6) && "draw".equals(str)) {
            hashMap.put("scene_id", str6);
        }
        String str9 = "0";
        if ("draw".equals(str)) {
            hashMap.put("orientation", str9);
        }
        if (!C13627m.m24498a(enterRoomConfig.f28233c.f28306W)) {
            hashMap.put("live_window_mode", enterRoomConfig.f28233c.f28306W);
        }
        String g = C6544e.m13993g();
        if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
            hashMap.put("is_subscribe", str9);
        } else {
            hashMap.put("is_subscribe", "1");
        }
        if (enterRoomConfig.f28233c.f28324ae != -1) {
            hashMap.put("small_picture_order", String.valueOf(enterRoomConfig.f28233c.f28324ae));
        }
        if (!TextUtils.isEmpty(C6544e.m13999m())) {
            hashMap.put("list_item_id", String.valueOf(j));
        }
        if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
            hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
        }
        if (enterRoomConfig.f28233c.f28342aw) {
            str9 = "1";
        }
        hashMap.put("is_return", str9);
        C6501b.C6502a.m13948a("live_show").mo12652a((Map<String, String>) hashMap).mo12639a().mo12658d("").mo12654b("live_view").mo12656c("core").mo12660e(c).mo12655b();
    }

    /* renamed from: a */
    public static void m14006a(EnterRoomConfig enterRoomConfig, String str, long j, String str2) {
        if (enterRoomConfig != null) {
            if (TextUtils.isEmpty(str)) {
                str = enterRoomConfig.f28233c.f28287D;
            }
            if (j == 0) {
                j = enterRoomConfig.f28233c.f28301R;
            }
            if (TextUtils.equals(C6544e.m13990d(), "push")) {
                C6501b.C6502a.m13948a("livesdk_push_error").mo12652a(new AbstractC6556j.C6557a().mo12691a("anchor_id", str).mo12691a("anchor_status", str2).mo12691a("room_id", String.valueOf(j)).f16374a).mo12655b();
            }
        }
    }
}
