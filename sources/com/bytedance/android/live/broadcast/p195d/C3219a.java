package com.bytedance.android.live.broadcast.p195d;

import com.bytedance.android.live.base.model.p180b.C2963a;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.api.p185c.C3053d;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.d.a */
public final class C3219a {

    /* renamed from: a */
    public static long f9250a;

    /* renamed from: b */
    public static boolean f9251b;

    /* renamed from: c */
    public static long f9252c;

    /* renamed from: d */
    public static long f9253d;

    /* renamed from: e */
    public static long f9254e;

    /* renamed from: f */
    public static long f9255f;

    /* renamed from: g */
    public static long f9256g;

    /* renamed from: h */
    public static long f9257h;

    /* renamed from: i */
    public static int f9258i;

    /* renamed from: j */
    public static int f9259j;

    /* renamed from: k */
    public static int f9260k;

    /* renamed from: l */
    public static boolean f9261l;

    /* renamed from: m */
    public static boolean f9262m;

    /* renamed from: n */
    public static int f9263n;

    /* renamed from: o */
    public static final C3219a f9264o = new C3219a();

    private C3219a() {
    }

    /* renamed from: com.bytedance.android.live.broadcast.d.a$a */
    public static final class RunnableC3220a implements Runnable {

        /* renamed from: a */
        private final String f9265a;

        static {
            Covode.recordClassIndex(3701);
        }

        public final void run() {
            C6497a a = C3051c.C3052a.m8359a(this.f9265a);
            a.f16147c = true;
            a.mo12632a();
        }

        public RunnableC3220a(String str) {
            C89219l.m154721d(str, "");
            this.f9265a = str;
        }
    }

    static {
        Covode.recordClassIndex(3700);
    }

    /* renamed from: a */
    public static void m8709a() {
        C3053d.m8364b(C3051c.C3052a.m8359a("ttlive_create_room_success_all").mo12636b("duration", Long.valueOf(System.currentTimeMillis() - f9250a))).mo12632a();
        f9250a = System.currentTimeMillis();
        f9253d = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static void m8712b() {
        f9256g = System.currentTimeMillis();
        C3053d.m8364b(C3051c.C3052a.m8359a("ttlive_broadcast_created_all").mo12636b("click_start_live", Long.valueOf(f9252c)).mo12636b("create_room_success", Long.valueOf(f9253d)).mo12636b("video_page_create", Long.valueOf(f9254e)).mo12636b("video_page_create_success", Long.valueOf(f9255f)).mo12636b("video_page_camera_first_show", Long.valueOf(f9256g))).mo12632a();
    }

    /* renamed from: a */
    public static void m8710a(EnumC11728i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar == EnumC11728i.VIDEO) {
            C6497a a = C3051c.C3052a.m8359a("ttlive_click_start_video_live_all");
            a.f16147c = true;
            C3053d.m8364b(a).mo12632a();
        } else if (iVar == EnumC11728i.THIRD_PARTY) {
            C6497a a2 = C3051c.C3052a.m8359a("ttlive_click_start_obs_live_all");
            a2.f16147c = true;
            C3053d.m8364b(a2).mo12632a();
        }
        f9250a = System.currentTimeMillis();
        f9252c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m8711a(Exception exc, boolean z, String str) {
        int i;
        String message;
        String str2;
        C89219l.m154721d(exc, "");
        long currentTimeMillis = System.currentTimeMillis() - f9252c;
        int i2 = -1;
        if (exc instanceof C2912a) {
            C2912a aVar = (C2912a) exc;
            i2 = aVar.getErrorCode();
            message = aVar.getErrorMsg();
            C6501b.C6502a.m13948a("livesdk_create_room").mo12651a("error_code", "0").mo12651a("error_msg", "").mo12646a("duration", currentTimeMillis).mo12655b();
            i = -1;
        } else {
            if (exc instanceof C2963a) {
                i = ((C2963a) exc).getStatusCode();
            } else {
                i = -1;
            }
            message = exc.getMessage();
        }
        JSONObject jSONObject = new JSONObject();
        C3222c.m9474a(jSONObject, "error_code", (long) i2);
        C3222c.m9475a(jSONObject, "error_msg", message);
        C3222c.m9474a(jSONObject, "status_code", (long) i);
        if (z) {
            str2 = DataType.AUDIO;
        } else {
            str2 = "video";
        }
        C3222c.m9475a(jSONObject, "media_type", str2);
        C3222c.m9475a(jSONObject, "live_permission_source", str);
        C3868c.m9497b("ttlive_create_room_all", 1, jSONObject);
        C3868c.m9492a("ttlive_create_room_error", 1, jSONObject);
        C6499a.m13906a();
        C6499a.m13911a(EnumC6500b.Room.info, "ttlive_create_room", 1, jSONObject);
        C6501b.C6502a.m13948a("livesdk_create_room").mo12645a("error_code", i2).mo12651a("error_msg", message).mo12646a("duration", currentTimeMillis).mo12655b();
    }
}
