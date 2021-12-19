package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.model.C7685e;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.f */
public final class C7435f implements WeakHandler.IHandler {

    /* renamed from: a */
    public C7437b f18436a;

    /* renamed from: b */
    public final WeakHandler f18437b;

    /* renamed from: c */
    public long f18438c;

    /* renamed from: d */
    public final Queue<C11777a> f18439d = new LinkedList();

    /* renamed from: e */
    public boolean f18440e = false;

    /* renamed from: f */
    public C7685e f18441f;

    /* renamed from: g */
    private final AbstractC7436a f18442g;

    /* renamed from: h */
    private final long f18443h;

    /* renamed from: i */
    private final String f18444i;

    /* renamed from: j */
    private final String f18445j;

    /* renamed from: k */
    private final String f18446k;

    /* renamed from: l */
    private final String f18447l;

    /* renamed from: m */
    private final String f18448m;

    /* renamed from: n */
    private final String f18449n;

    /* renamed from: o */
    private boolean f18450o = false;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.f$a */
    public interface AbstractC7436a {
        static {
            Covode.recordClassIndex(8206);
        }

        /* renamed from: a */
        void mo13657a(int i, String str, String str2);

        /* renamed from: a */
        void mo13658a(C7685e eVar);
    }

    static {
        Covode.recordClassIndex(8205);
    }

    /* renamed from: b */
    public final void mo13656b() {
        this.f18440e = false;
        this.f18450o = true;
        this.f18441f = null;
        this.f18437b.removeCallbacksAndMessages(null);
        C3854a.m9453a(4, "PreFetchRoomInfoManager", "EnterRoomController stop roomid :" + this.f18443h);
        this.f18439d.clear();
    }

    /* renamed from: a */
    public final void mo13655a() {
        C3854a.m9453a(4, "PreFetchRoomInfoManager", "EnterRoomController try to start roomid :" + this.f18443h);
        if (!this.f18440e) {
            C3854a.m9453a(4, "PreFetchRoomInfoManager", "EnterRoomController start roomid :" + this.f18443h);
            this.f18450o = false;
            this.f18440e = true;
            this.f18438c = System.currentTimeMillis();
            C7307f.f18161a.mo13556a(this.f18437b, this.f18443h, this.f18444i, this.f18445j, this.f18446k, this.f18448m, this.f18449n);
            this.f18439d.clear();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        C3854a.m9453a(4, "PreFetchRoomInfoManager", "handleMsg roomid :" + this.f18443h);
        if (message.what != 32 || this.f18450o) {
            if (message.what == 4 && this.f18440e) {
                if (message.obj instanceof C2912a) {
                    C2912a aVar = (C2912a) message.obj;
                    m15328a(aVar.getErrorCode(), aVar.getErrorMsg(), aVar.getPrompt());
                } else if (message.obj instanceof Exception) {
                    m15328a(0, message.obj.toString(), null);
                } else {
                    C3854a.m9453a(4, "PreFetchRoomInfoManager", "handleMsg success roomid :" + this.f18443h);
                    if (!(message.obj instanceof C7685e) || ((C7685e) message.obj).f19034a == null || !Room.isValid(((C7685e) message.obj).f19034a)) {
                        if (!(message.obj instanceof C7685e)) {
                            str = "response unexpected";
                        } else if (((C7685e) message.obj).f19034a == null) {
                            str = "room is null";
                        } else {
                            str = "invalid room data";
                        }
                        m15328a(0, str, null);
                        return;
                    }
                    C7685e eVar = (C7685e) message.obj;
                    this.f18441f = eVar;
                    this.f18440e = false;
                    this.f18442g.mo13658a(eVar);
                }
            }
        } else if (message.obj instanceof Throwable) {
            m15328a(0, "finish_abnormal fail", null);
        } else {
            mo13655a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.f$b */
    public static class C7437b {

        /* renamed from: a */
        public int f18451a;

        /* renamed from: b */
        public String f18452b;

        /* renamed from: c */
        public String f18453c;

        static {
            Covode.recordClassIndex(8207);
        }

        public C7437b(int i, String str, String str2) {
            this.f18451a = i;
            this.f18452b = str;
            this.f18453c = str2;
        }
    }

    /* renamed from: a */
    private void m15328a(int i, String str, String str2) {
        this.f18436a = new C7437b(i, str, str2);
        this.f18440e = false;
        this.f18442g.mo13657a(i, str, str2);
    }

    public C7435f(AbstractC7436a aVar, long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f18442g = aVar;
        this.f18443h = j;
        this.f18444i = str;
        this.f18445j = str2;
        this.f18437b = new WeakHandler(Looper.getMainLooper(), this);
        this.f18446k = str3;
        this.f18447l = str4;
        this.f18448m = str5;
        this.f18449n = str6;
    }
}
