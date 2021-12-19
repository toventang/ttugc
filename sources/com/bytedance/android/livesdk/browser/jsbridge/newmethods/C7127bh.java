package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.share.AbstractC6107a;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7124bg;
import com.bytedance.android.livesdk.browser.p468i.C7030b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bh */
public final class C7127bh extends AbstractC18334e<C7130a, Object> {

    /* renamed from: a */
    private C7124bg.AbstractC7125a f17751a;

    /* renamed from: b */
    private AbstractC88412b f17752b;

    static {
        Covode.recordClassIndex(7873);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bh$a */
    static final class C7130a {
        @AbstractC27891c(mo46611a = "title")

        /* renamed from: a */
        String f17757a;
        @AbstractC27891c(mo46611a = "desc")

        /* renamed from: b */
        String f17758b;
        @AbstractC27891c(mo46611a = "image")

        /* renamed from: c */
        String f17759c;
        @AbstractC27891c(mo46611a = "url")

        /* renamed from: d */
        String f17760d;

        static {
            Covode.recordClassIndex(7876);
        }

        C7130a() {
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17752b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f17751a = null;
    }

    public C7127bh(C7124bg.AbstractC7125a aVar) {
        this.f17751a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7130a aVar, C18338g gVar) {
        C7130a aVar2 = aVar;
        final Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        Map<String, String> d = C6501b.C6502a.m13948a("").mo12659d();
        if (room == null || !TextUtils.isEmpty(aVar2.f17760d)) {
            C7030b c = this.f17751a.mo13299c();
            if (aVar2 != null) {
                c = new C7030b(aVar2.f17757a, aVar2.f17758b, aVar2.f17759c, aVar2.f17760d);
            } else if (c == null) {
                return;
            }
            if (!TextUtils.isEmpty(c.f17631d)) {
                Uri.Builder buildUpon = Uri.parse(c.f17631d).buildUpon();
                buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
                AbstractC6107a share = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share();
                ActivityC0945e a = C11279p.m20001a(gVar.f43859a);
                C11666c.C11667a a2 = C11666c.m20575a();
                a2.f27866m = c.f17628a;
                a2.f27867n = c.f17629b;
                a2.f27868o = c.f17630c;
                a2.f27865l = buildUpon.toString();
                a2.f27837A = d;
                a2.f27850N = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
                share.mo11989a(a, a2.mo18437a(), new AbstractC11665b() {
                    /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7127bh.C71292 */

                    static {
                        Covode.recordClassIndex(7875);
                    }

                    @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
                    /* renamed from: a */
                    public final void mo8904a(Throwable th) {
                        C3854a.m9458a("SharePanelMethod", th);
                    }

                    @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
                    /* renamed from: a */
                    public final void mo8903a(String str, String str2, Bundle bundle) {
                        String str3;
                        String str4 = "";
                        if (bundle != null) {
                            str3 = bundle.getString("shareIdList", str4);
                        } else {
                            str3 = str4;
                        }
                        C7127bh bhVar = C7127bh.this;
                        Room room = room;
                        if (room != null) {
                            str4 = room.getLabels();
                        }
                        bhVar.mo13366a(0, str, str4, str3);
                        C7127bh.m15058a(room, str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        AbstractC6107a share2 = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share();
        ActivityC0945e a3 = C11279p.m20001a(gVar.f43859a);
        C11666c.C11667a a4 = C11666c.m20576a(room);
        a4.f27837A = d;
        a4.f27850N = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
        share2.mo11989a(a3, a4.mo18437a(), new AbstractC11665b() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7127bh.C71281 */

            static {
                Covode.recordClassIndex(7874);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8904a(Throwable th) {
                C3854a.m9458a("SharePanelMethod", th);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8903a(String str, String str2, Bundle bundle) {
                String str3 = "";
                if (bundle != null) {
                    str3 = bundle.getString("shareIdList", str3);
                }
                C7127bh.this.mo13366a(room.getId(), str, room.getLabels(), str3);
                C7127bh.m15058a(room, str, str2, str3);
            }
        });
    }

    /* renamed from: a */
    public final void mo13366a(long j, String str, String str2, String str3) {
        this.f17752b = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).sendShare(j, str, 1, str2, str3).mo143254a(C7131bi.f17761a, C11195i.f26823a);
    }

    /* renamed from: a */
    public static void m15058a(Room room, String str, String str2, String str3) {
        long j;
        long j2;
        String mD5String = MD5Utils.getMD5String("share_success" + System.currentTimeMillis());
        C6501b.C6502a.m13948a("share_info").mo12651a("bind_id", mD5String).mo12651a("to_user_id", str3).mo12655b();
        HashMap hashMap = new HashMap();
        hashMap.put("share_platform", str);
        hashMap.put("share_type", str2);
        hashMap.put("bind_id", mD5String);
        if (room != null) {
            hashMap.put("log_pb", room.getLog_pb());
        }
        String g = C6544e.m13993g();
        Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (room2 != null) {
            j = room2.getOwnerUserId();
        } else {
            j = -1;
        }
        if (b != null) {
            j2 = b.mo13161c();
        } else {
            j2 = -2;
        }
        if (j != j2 && ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getBattleId()));
        }
        if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", "1");
        }
        if (C3966y.m9670f()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        C6501b.C6502a.m13948a("share").mo12652a((Map<String, String>) hashMap).mo12661f("click").mo12639a().mo12655b();
    }
}
