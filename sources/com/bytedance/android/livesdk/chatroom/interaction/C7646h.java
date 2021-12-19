package com.bytedance.android.livesdk.chatroom.interaction;

import android.os.Handler;
import android.os.Message;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.model.C3071d;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9022ap;
import com.bytedance.android.livesdk.p561j.C9085cx;
import com.bytedance.android.livesdk.p561j.C9105dq;
import com.bytedance.android.livesdk.p561j.C9106dr;
import com.bytedance.android.livesdk.p561j.C9107ds;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.interaction.h */
public final class C7646h {

    /* renamed from: c */
    public static final C7648a f18948c = new C7648a((byte) 0);

    /* renamed from: a */
    public final Handler.Callback f18949a;

    /* renamed from: b */
    public final DataChannel f18950b;

    /* renamed from: d */
    private Handler f18951d;

    /* renamed from: e */
    private final C10935a f18952e;

    static {
        Covode.recordClassIndex(8423);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.h$a */
    public static final class C7648a {
        static {
            Covode.recordClassIndex(8425);
        }

        private C7648a() {
        }

        public /* synthetic */ C7648a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo13859a() {
        this.f18951d.removeMessages(100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.h$c */
    public static final class C7650c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C7646h f18954a;

        static {
            Covode.recordClassIndex(8427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7650c(C7646h hVar) {
            super(1);
            this.f18954a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f18954a.mo13859a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.h$b */
    static final class C7649b implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ C7646h f18953a;

        static {
            Covode.recordClassIndex(8426);
        }

        C7649b(C7646h hVar) {
            this.f18953a = hVar;
        }

        public final boolean handleMessage(Message message) {
            String str;
            C89219l.m154721d(message, "");
            if (message.obj instanceof C2912a) {
                DataChannel dataChannel = this.f18953a.f18950b;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
                dataChannel.mo28320c(C9085cx.class, obj);
                return false;
            } else if (message.what != 100) {
                return false;
            } else {
                C7646h hVar = this.f18953a;
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.LiveEffect");
                C11672a aVar = (C11672a) obj2;
                C6501b a = C6501b.C6502a.m13948a("live_take_sticker_effective_use").mo12643a(hVar.f18950b).mo12654b("live_take").mo12656c("click").mo12658d("live_take_detail").mo12651a("sticker_id", String.valueOf(aVar.f27893a));
                if (aVar.f27915w) {
                    str = "1";
                } else {
                    str = "0";
                }
                a.mo12651a("is_video_sticker", str).mo12655b();
                this.f18953a.f18950b.mo28311a(C9022ap.class, (Object) true);
                return false;
            }
        }
    }

    public final void onEvent(C3071d dVar) {
        String str;
        String str2;
        User owner;
        if (this.f18952e.isViewValid() && dVar.f8909a != null && !C89219l.m154714a((Object) "", (Object) dVar.f8909a.f27894b)) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            C3071d dVar2 = (C3071d) DataChannelGlobal.f42558d.mo28324b(C9107ds.class);
            DataChannelGlobal.f42558d.mo28327c(C9107ds.class);
            C6501b c = C6501b.C6502a.m13948a("live_take_sticker_select").mo12643a(this.f18950b).mo12654b("live_take").mo12656c("click");
            if (room == null || (owner = room.getOwner()) == null) {
                str = null;
            } else {
                str = owner.getIdStr();
            }
            C6501b a = c.mo12662g(str).mo12646a("sticker_id", dVar.f8909a.f27893a);
            if (dVar.f8909a.f27915w) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            C6501b a2 = a.mo12651a("is_video_sticker", str2).mo12651a("tab", dVar.f8911c);
            if (dVar2 == null || dVar2.f8909a.f27893a != dVar2.f8909a.f27893a) {
                a2.mo12645a("is_live_take_default", 0);
            } else {
                a2.mo12645a("is_live_take_default", 1);
            }
            a2.mo12655b();
            mo13859a();
            Handler handler = this.f18951d;
            handler.sendMessageDelayed(Message.obtain(handler, 100, dVar.f8909a), 30000);
            this.f18950b.mo28309a((AbstractC1204m) this.f18952e, C9105dq.class, (AbstractC89172b) new C7650c(this));
        }
    }

    public C7646h(C10935a aVar, DataChannel dataChannel) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        this.f18952e = aVar;
        this.f18950b = dataChannel;
        C7649b bVar = new C7649b(this);
        this.f18949a = bVar;
        this.f18951d = new Handler(bVar);
        dataChannel.mo28309a((AbstractC1204m) aVar, C9106dr.class, (AbstractC89172b) new AbstractC89172b<C3071d, C89391z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.C7646h.C76471 */

            static {
                Covode.recordClassIndex(8424);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C3071d dVar) {
                C3071d dVar2 = dVar;
                C89219l.m154721d(dVar2, "");
                ((C7646h) this.receiver).onEvent(dVar2);
                return C89391z.f203057a;
            }
        });
        Object b = DataChannelGlobal.f42558d.mo28324b(C9107ds.class);
        if (b != null) {
            dataChannel.mo28320c(C9106dr.class, b);
        }
    }
}
