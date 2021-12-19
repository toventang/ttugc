package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.a */
public final class C7289a {
    static {
        Covode.recordClassIndex(8052);
    }

    /* renamed from: a */
    public static void m15195a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("time", Long.valueOf(j));
        C3868c.m9491a("ttlive_live_end_audience_query", i, hashMap);
    }

    /* renamed from: a */
    public static void m15196a(final Handler handler, long j) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ((EndPageRecommendRetrofitApi) C5805e.m12718a().mo11572a(EndPageRecommendRetrofitApi.class)).getLive(j).mo143271a(new C11191f()).mo143254a(new AbstractC88433f<C5827a<Room, C2965a>>() {
            /* class com.bytedance.android.livesdk.chatroom.api.C7289a.C72901 */

            static {
                Covode.recordClassIndex(8053);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C5827a<Room, C2965a> aVar) {
                C5827a<Room, C2965a> aVar2 = aVar;
                SystemClock.elapsedRealtime();
                C7289a.m15195a(elapsedRealtime, 0);
                Handler handler = handler;
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(22);
                    obtainMessage.obj = aVar2.f14684b;
                    try {
                        for (Room room : (List) obtainMessage.obj) {
                            room.setRequestId(((C2965a) aVar2.f14685c).f8720f);
                            room.setLog_pb(((C2965a) aVar2.f14685c).mo7786a().toString());
                        }
                    } catch (Exception unused) {
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        }, new AbstractC88433f<Throwable>() {
            /* class com.bytedance.android.livesdk.chatroom.api.C7289a.C72912 */

            static {
                Covode.recordClassIndex(8054);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Throwable th) {
                SystemClock.elapsedRealtime();
                C7289a.m15195a(elapsedRealtime, 1);
                Handler handler = handler;
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(22);
                    obtainMessage.obj = th;
                    handler.sendMessage(obtainMessage);
                }
            }
        });
    }
}
