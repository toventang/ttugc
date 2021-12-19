package com.bytedance.android.livesdk.chatroom.p490e;

import android.os.SystemClock;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p379n.C5764a;
import com.bytedance.android.livesdk.chatroom.p488c.C7372ae;
import com.bytedance.android.livesdk.chatroom.p488c.C7374ag;
import com.bytedance.android.livesdk.chatroom.p490e.C7477c;
import com.bytedance.android.livesdk.chatroom.p492g.C7576f;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.C11868d;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.e.f */
public final /* synthetic */ class C7482f implements AbstractC88433f {

    /* renamed from: a */
    private final C7477c f18586a;

    /* renamed from: b */
    private final C7374ag f18587b;

    /* renamed from: c */
    private final C9878i f18588c;

    /* renamed from: d */
    private final long f18589d;

    static {
        Covode.recordClassIndex(8252);
    }

    C7482f(C7477c cVar, C7374ag agVar, C9878i iVar, long j) {
        this.f18586a = cVar;
        this.f18587b = agVar;
        this.f18588c = iVar;
        this.f18589d = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7477c cVar = this.f18586a;
        C7374ag agVar = this.f18587b;
        C9878i iVar = this.f18588c;
        long j = this.f18589d;
        Throwable th = (Throwable) obj;
        C6779a.m14563a().mo13053a(new C7372ae(agVar, false));
        if (cVar.f38654y != null) {
            if (th instanceof Exception) {
                ((C7477c.AbstractC7479a) cVar.f38654y).mo13718a(agVar, (Exception) th);
                cVar.f18624w.mo28320c(C5764a.class, iVar);
            }
            if (th instanceof C2908a) {
                long uptimeMillis = SystemClock.uptimeMillis() - j;
                int errorCode = ((C2908a) th).getErrorCode();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", uptimeMillis);
                    jSONObject.put("error_code", errorCode);
                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                    C89219l.m154716b(b, "");
                    jSONObject.put("user_id", b.mo13161c());
                    Room room = C7576f.f18800b;
                    jSONObject.put("room_id", room != null ? Long.valueOf(room.getId()) : null);
                    Room room2 = C7576f.f18800b;
                    jSONObject.put("anchor_id", room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null);
                } catch (JSONException unused) {
                }
                C11868d.m20958a("ttlive_chat", null, null, jSONObject);
            }
        }
    }
}
