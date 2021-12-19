package com.bytedance.android.livesdk.chatroom.p481b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.chatroom.p488c.C7384c;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.message.C9888r;
import com.bytedance.android.livesdk.model.message.C9890t;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.c */
public enum EnumC7303c {
    INSTANCE;
    

    /* renamed from: a */
    Runnable f18148a;

    /* renamed from: b */
    private Queue<C11777a> f18149b;

    /* renamed from: c */
    private AbstractC7304a f18150c;

    /* renamed from: d */
    private boolean f18151d;

    /* renamed from: e */
    private boolean f18152e;

    /* renamed from: f */
    private C7384c f18153f;

    /* renamed from: g */
    private Handler f18154g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.b.c$a */
    public interface AbstractC7304a {
        static {
            Covode.recordClassIndex(8067);
        }

        /* renamed from: a */
        void mo13553a(C11777a aVar);
    }

    public final void onMessageFinish() {
        this.f18151d = false;
        m15209a();
    }

    static {
        Covode.recordClassIndex(8066);
    }

    public final void stop() {
        this.f18150c = null;
        this.f18149b = null;
        this.f18152e = false;
        this.f18151d = false;
        Handler handler = this.f18154g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f18154g = null;
        this.f18148a = null;
    }

    /* renamed from: a */
    private void m15209a() {
        Queue<C11777a> queue = this.f18149b;
        if (queue != null && queue.size() > 0 && this.f18150c != null && this.f18152e && !this.f18151d) {
            this.f18151d = true;
            this.f18150c.mo13553a(this.f18149b.poll());
        }
    }

    public final void start(AbstractC7304a aVar) {
        this.f18150c = aVar;
        this.f18149b = new ArrayDeque();
        this.f18152e = true;
        this.f18151d = false;
    }

    /* renamed from: a */
    static boolean m15210a(Room room) {
        if (room == null) {
            return false;
        }
        long followStatus = room.getOwner().getFollowInfo().getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return true;
        }
        return false;
    }

    public final void add(C11777a aVar) {
        Queue<C11777a> queue;
        if (this.f18152e && aVar != null && (queue = this.f18149b) != null) {
            queue.offer(aVar);
            m15209a();
        }
    }

    public final void addFollowGuideMessage(Room room, C11777a aVar) {
        if (aVar instanceof C9890t) {
            if (m15210a(room)) {
                Handler handler = this.f18154g;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                this.f18148a = null;
                onMessageFinish();
                return;
            }
            C9890t tVar = (C9890t) aVar;
            if (this.f18152e && this.f18149b != null) {
                if (this.f18154g == null) {
                    this.f18154g = new Handler(Looper.getMainLooper());
                }
                if (this.f18148a == null) {
                    this.f18148a = new RunnableC7305d(this, room, tVar);
                }
                C7384c cVar = this.f18153f;
                if (cVar == null || cVar.f18305b) {
                    this.f18154g.postDelayed(this.f18148a, 500);
                } else {
                    this.f18154g.postDelayed(new RunnableC7306e(this, room, aVar), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
            }
        }
    }

    public final void setBigGiftPlayStateEvent(boolean z, boolean z2, C9888r rVar) {
        if (this.f18153f == null) {
            this.f18153f = new C7384c(z, z2, rVar);
        }
        this.f18153f.f18304a = z;
        this.f18153f.f18305b = z2;
        this.f18153f.f18306c = rVar;
    }
}
