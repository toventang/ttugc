package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.util.Base64;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p379n.AbstractC5781n;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.utils.C11274k;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.service.AbstractC11844b;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1204e.p1205a.C17305a;
import com.facebook.common.p1839k.C24129c;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.f */
public final class C7307f implements AbstractC5781n {

    /* renamed from: a */
    public static final C7307f f18161a = new C7307f();

    /* renamed from: b */
    boolean f18162b;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13559a(com.bytedance.android.live.p379n.AbstractC5781n.C5782a r10) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p481b.C7307f.mo13559a(com.bytedance.android.live.n.n$a):void");
    }

    /* renamed from: a */
    public final void mo13556a(Handler handler, long j, String str, String str2, String str3, String str4, String str5) {
        HashMap<String, String> hashMap = new C11274k().mo18034a("common_label_list", str3).mo18034a("enter_source", str4).mo18034a("request_id", str).mo18034a("enter_type", str2).mo18034a("live_reason", str5).f26963a;
        C6203g.m13462a(new RunnableC7326w(this));
        ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).enterRoom(j, 1, C11115u.m19743a().mo17915b().mo13165e() ? 1 : 0, hashMap).mo143271a(new C11191f()).mo143254a(new C7327x(this, handler, j), new C7328y(this, handler, j));
    }

    /* renamed from: a */
    public static void m15218a(Handler handler, long j, boolean z) {
        ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).sendPlayingPing(j, z ? 1 : 0).mo143271a(new C11191f()).mo143254a(new C7329z(handler), new C7301aa(handler));
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5781n
    /* renamed from: a */
    public final void mo11557a(long j, int i, String str, String str2) {
        ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).digg(new C11274k().mo18034a("room_id", String.valueOf(j)).mo18034a("count", String.valueOf(i)).mo18034a("duration", "2000").mo18034a("common_label_list", String.valueOf(str)).mo18034a("icon", str2).f26963a).mo143271a(new C11191f()).mo143254a(C11195i.f26824b, C11195i.f26823a);
    }

    static {
        Covode.recordClassIndex(8070);
    }

    /* renamed from: a */
    public static AbstractC88979t<C5832d<Map<String, Room>>> m15213a(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        if (jArr != null) {
            for (int i = 0; i < jArr.length; i++) {
                sb.append(jArr[i]);
                if (jArr.length - 1 != i) {
                    sb.append(",");
                }
            }
        }
        return ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).getMultipleRoomInfo(sb.toString()).mo143271a(new C11191f());
    }

    /* renamed from: b */
    public static void m15219b(Handler handler) {
        ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).getRoomDebugInfoPermission().mo143271a(new C11191f()).mo143254a(new C7319p(handler), new C7320q(handler));
    }

    /* renamed from: a */
    public static void m15214a(long j) {
        ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).leaveRoom(j).mo143271a(new C11191f()).mo143254a(C11195i.f26824b, C11195i.f26823a);
    }

    /* renamed from: a */
    static Room m15212a(Room room) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", String.valueOf(room.getOwnerUserId()));
            jSONObject.put("roomId", String.valueOf(room.getId()));
            jSONObject.put("aid", String.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).appId()));
            jSONObject.put("timestamp", String.valueOf(C11200a.m19851a() / 1000));
            String jSONObject2 = jSONObject.toString();
            String b = C13607d.m24442b(String.valueOf(room.getId()));
            byte[] bArr = {8, 9, 7, 5, 7, 5, 6, 7, 8, 9, 10, 11, 12, C86745e.f195623b, 14, 15};
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(C24129c.m45731a(b), "AES"), new IvParameterSpec(bArr));
            room.authenticationValue = "bytedmediasdkandroid:" + Base64.encodeToString(instance.doFinal(jSONObject2.getBytes(Charset.forName("UTF-8"))), 2);
        } catch (Exception e) {
            C3854a.m9458a("AuthenticationCalculate", e);
        }
        return room;
    }

    /* renamed from: a */
    public static void m15216a(Handler handler) {
        ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).finishRoomAbnormal().mo143271a(new C11191f()).mo143254a(new C7315l(handler), new C7316m(handler));
    }

    /* renamed from: a */
    public static void m15215a(long j, AbstractC11844b bVar) {
        if (bVar != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("room_id", String.valueOf(j));
            ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).fetchRoom(hashMap).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C7317n(bVar), new C7318o(bVar));
        }
    }

    /* renamed from: a */
    public static void m15217a(Handler handler, long j) {
        ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).unblockRoom(j).mo143271a(new C11191f()).mo143254a(C11195i.f26824b, new C7312i(handler));
    }

    /* renamed from: a */
    public final void mo13557a(Handler handler, boolean z, long j, int i) {
        mo13558a(handler, z, j, 3, i);
    }

    /* renamed from: a */
    public final void mo13558a(Handler handler, final boolean z, final long j, final int i, int i2) {
        C17305a.m32043a().mo27615a(handler, new Callable() {
            /* class com.bytedance.android.livesdk.chatroom.p481b.C7307f.CallableC73081 */

            static {
                Covode.recordClassIndex(8071);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                T t = ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).getRoomStats(z, j, i).execute().f52262b;
                if (((C5832d) t).extra != null) {
                    ((Room) ((C5832d) t).data).nowTime = ((C5832d) t).extra.now / 1000;
                }
                return ((C5832d) t).data;
            }
        }, i2);
    }
}
