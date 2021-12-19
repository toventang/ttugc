package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.p */
public final class C5721p {

    /* renamed from: a */
    public static int f14513a = 5;

    /* renamed from: b */
    public static int f14514b;

    /* renamed from: c */
    public static int f14515c = 1;

    /* renamed from: d */
    private static int f14516d = 4;

    static {
        Covode.recordClassIndex(6319);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.p$a */
    public enum EnumC5722a {
        FAILED_REPLY("server", "reply_fail"),
        FAILED_JOIN_CHANNEL("server", "join_channel_fail"),
        FAILED_RTC_TIMEOUT("rtc", "rtc_timeout"),
        FAILED_RTC_ERROR("rtc", "rtc_error"),
        FAILED_PERMIT("server", "permit_fail");
        

        /* renamed from: f */
        public String f14523f;

        /* renamed from: g */
        public String f14524g;

        static {
            Covode.recordClassIndex(6320);
        }

        private EnumC5722a(String str, String str2) {
            this.f14523f = str;
            this.f14524g = str2;
        }
    }

    /* renamed from: a */
    public static long m12578a(Throwable th) {
        if (!(th instanceof C2908a)) {
            return -1;
        }
        C2908a aVar = (C2908a) th;
        if (aVar.getErrorCode() != 0) {
            return (long) aVar.getErrorCode();
        }
        return -1;
    }

    /* renamed from: a */
    public static void m12579a(int i, long j) {
        String str = EnumC5722a.FAILED_RTC_TIMEOUT.f14523f;
        String str2 = EnumC5722a.FAILED_RTC_TIMEOUT.f14524g;
        String str3 = EnumC5722a.FAILED_RTC_TIMEOUT.f14524g + ":" + j;
        if (i == f14514b) {
            m12584b(str, str2, -1, str3);
        } else if (i == f14515c) {
            m12583a(str, str2, -1, str3);
        }
    }

    /* renamed from: a */
    public static void m12581a(int i, Throwable th) {
        String str = EnumC5722a.FAILED_JOIN_CHANNEL.f14523f;
        String str2 = EnumC5722a.FAILED_JOIN_CHANNEL.f14524g;
        long a = m12578a(th);
        String th2 = th.toString();
        if (i == f14514b) {
            m12584b(str, str2, a, th2);
        } else if (i == f14515c) {
            m12583a(str, str2, a, th2);
        }
    }

    /* renamed from: a */
    public static void m12580a(int i, long j, String str) {
        String str2 = EnumC5722a.FAILED_RTC_ERROR.f14523f;
        String str3 = EnumC5722a.FAILED_RTC_ERROR.f14524g;
        if (i == f14514b) {
            m12584b(str2, str3, j, str);
        } else if (i == f14515c) {
            m12583a(str2, str3, j, str);
        }
    }

    /* renamed from: b */
    private static void m12584b(String str, String str2, long j, String str3) {
        long j2;
        String str4;
        long id;
        String secUid;
        long id2 = ((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getId();
        long j3 = C4384b.C4385a.m10496a().f11957e;
        C4384b a = C4384b.C4385a.m10496a();
        AbstractC2994b a2 = C11115u.m19743a().mo17915b().mo13147a();
        if (a.f11969q) {
            j2 = a2.getId();
        } else {
            j2 = a.f11958f;
        }
        if (a.f11969q) {
            str4 = a2.getSecUid();
        } else {
            str4 = a.f11959g;
        }
        if (a.f11969q) {
            id = a.f11958f;
        } else {
            id = a2.getId();
        }
        if (a.f11969q) {
            secUid = a.f11959g;
        } else {
            secUid = a2.getSecUid();
        }
        m12582a(id2, j3, j2, str4, id, secUid, String.valueOf(f14513a), C4384b.C4385a.m10496a().mo10153d().getValue(), str, str2, j, str3);
    }

    /* renamed from: a */
    public static void m12583a(String str, String str2, long j, String str3) {
        long id = ((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getId();
        ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).reportAudienceLinkIssue(id, id, f14516d, Config.Vendor.fromValue(C6894d.m14753a().f17261f).getValue(), str, str2, j, str3).mo143271a(new C11191f()).mo143254a(C5725s.f14527a, C5726t.f14528a);
    }

    /* renamed from: a */
    public static void m12582a(long j, long j2, long j3, String str, long j4, String str2, String str3, int i, String str4, String str5, long j5, String str6) {
        ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).reportBroadcasterLinkIssue(j, j2, j3, str, j4, str2, str3, i, str4, str5, j5, str6).mo143271a(new C11191f()).mo143254a(C5723q.f14525a, C5724r.f14526a);
    }
}
