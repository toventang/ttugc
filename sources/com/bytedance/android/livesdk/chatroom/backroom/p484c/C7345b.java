package com.bytedance.android.livesdk.chatroom.backroom.p484c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.backroom.C7334b;
import com.bytedance.android.livesdk.chatroom.backroom.RoomBackProgressView;
import com.bytedance.android.livesdk.chatroom.backroom.p482a.C7333a;
import com.bytedance.android.livesdk.chatroom.backroom.p484c.C7341a;
import com.bytedance.android.livesdk.chatroom.backroom.p485d.C7349a;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.b */
public final class C7345b implements C7341a.AbstractC7342a {

    /* renamed from: a */
    public EnterRoomConfig f18216a;

    /* renamed from: b */
    public HSImageView f18217b;

    /* renamed from: c */
    public boolean f18218c;

    /* renamed from: d */
    public EnterRoomConfig f18219d;

    /* renamed from: e */
    public Context f18220e;

    /* renamed from: f */
    public final ViewGroup f18221f;

    /* renamed from: g */
    private boolean f18222g;

    /* renamed from: h */
    private RoomBackProgressView f18223h;

    /* renamed from: i */
    private final AbstractC1196i f18224i;

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.b$c */
    public final /* synthetic */ class C7348c implements AbstractC88433f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f18226a;

        static {
            Covode.recordClassIndex(8112);
        }

        public C7348c(AbstractC89172b bVar) {
            this.f18226a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154716b(this.f18226a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8109);
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.p484c.C7341a.AbstractC7342a
    /* renamed from: a */
    public final void mo13573a() {
        ViewGroup viewGroup = this.f18221f;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.b$a */
    public static final class View$OnClickListenerC7346a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7345b f18225a;

        static {
            Covode.recordClassIndex(8110);
        }

        public View$OnClickListenerC7346a(C7345b bVar) {
            this.f18225a = bVar;
        }

        public final void onClick(View view) {
            this.f18225a.mo13579a("click");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.b$b */
    public static final /* synthetic */ class C7347b extends C89217j implements AbstractC89172b<C7333a, C89391z> {
        static {
            Covode.recordClassIndex(8111);
        }

        public C7347b(C7345b bVar) {
            super(1, bVar, C7345b.class, "onEvent", "onEvent(Lcom/bytedance/android/livesdk/chatroom/backroom/event/RoomFetchEvent;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7333a aVar) {
            ((C7345b) this.receiver).onEvent(aVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo13577a(int i) {
        if (this.f18216a != null) {
            if (i == 1) {
                mo13578a(false);
            } else {
                mo13578a(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo13580b(int i) {
        if (this.f18216a == null) {
            C13628n.m24510a(this.f18221f, 8);
        } else if (this.f18222g) {
            C13628n.m24510a(this.f18221f, 8);
        } else {
            C13628n.m24510a(this.f18221f, i);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.p484c.C7341a.AbstractC7342a
    /* renamed from: a */
    public final void mo13574a(float f) {
        mo13580b(0);
        RoomBackProgressView roomBackProgressView = this.f18223h;
        if (roomBackProgressView != null) {
            roomBackProgressView.setProgress(f);
        }
        C3854a.m9453a(4, "RoomFragmentBackRoomView", "animation progress: " + f + ' ');
    }

    /* renamed from: a */
    public final void mo13578a(boolean z) {
        this.f18222g = z;
        if (z) {
            mo13580b(8);
        } else if (C7341a.m15242b() && C7349a.m15252b()) {
            mo13580b(0);
        }
    }

    public final void onEvent(C7333a aVar) {
        Room room;
        long j;
        String str;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        if (aVar != null) {
            if (this.f18218c) {
                this.f18218c = false;
                if (!(this.f18216a == null || aVar.f18203a == null || (room = aVar.f18203a) == null || room.author() == null)) {
                    C6501b a = C6501b.C6502a.m13948a("livesdk_return_show").mo12639a().mo12645a("layer_level", C7334b.f18205a.mo13571a(C3888a.m9505a(this.f18220e)).mo13570c());
                    EnterRoomConfig enterRoomConfig = this.f18216a;
                    if (enterRoomConfig == null || (roomsData2 = enterRoomConfig.f28233c) == null) {
                        j = 0;
                    } else {
                        j = roomsData2.f28301R;
                    }
                    C6501b a2 = a.mo12646a("to_room_id", j);
                    EnterRoomConfig enterRoomConfig2 = this.f18216a;
                    if (enterRoomConfig2 == null || (roomsData = enterRoomConfig2.f28233c) == null || (str = roomsData.f28287D) == null) {
                        str = "0";
                    }
                    a2.mo12651a("to_anchor_id", str).mo12655b();
                }
            }
            mo13578a(false);
        }
    }

    /* renamed from: a */
    public final boolean mo13579a(String str) {
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        boolean z;
        EnterRoomConfig.RoomsData roomsData5;
        if (this.f18216a == null) {
            return false;
        }
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, "");
        EnterRoomLinkSession a = fVar.mo19010a();
        C89219l.m154716b(a, "");
        EnterRoomConfig enterRoomConfig = a.f28391b;
        if (enterRoomConfig == null) {
            enterRoomConfig = null;
        }
        long j = 0;
        if (!(enterRoomConfig == null || (roomsData4 = enterRoomConfig.f28233c) == null || !roomsData4.f28326ag)) {
            long j2 = enterRoomConfig.f28233c.f28329aj;
            if (j2 > 0) {
                EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                enterRoomConfig2.f28233c.f28301R = j2;
                enterRoomConfig2.f28233c.f28293J = enterRoomConfig.f28233c.f28293J;
                enterRoomConfig2.f28233c.f28295L = enterRoomConfig.f28233c.f28295L;
                enterRoomConfig2.f28233c.f28330ak = false;
                EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig2.f28233c;
                EnterRoomConfig enterRoomConfig3 = this.f18216a;
                if (enterRoomConfig3 == null || (roomsData5 = enterRoomConfig3.f28233c) == null) {
                    z = false;
                } else {
                    z = roomsData5.f28326ag;
                }
                roomsData6.f28326ag = z;
                this.f18216a = enterRoomConfig2;
                EnterRoomLinkSession.m20943a(enterRoomConfig2).mo18994a(new Event("mic_room_jump_event", 1033, EnumC11866b.MessageReceived).mo19003a("roomid:" + j2 + " autojump: false"));
                C6501b.C6502a.m13948a("livesdk_line_up_list_click_return").mo12639a().mo12655b();
            }
        }
        EnterRoomConfig enterRoomConfig4 = this.f18216a;
        if (!(enterRoomConfig4 == null || (roomsData3 = enterRoomConfig4.f28233c) == null)) {
            j = roomsData3.f28301R;
        }
        EnterRoomConfig enterRoomConfig5 = this.f18216a;
        if (!(enterRoomConfig5 == null || (roomsData2 = enterRoomConfig5.f28233c) == null)) {
            roomsData2.f28343ax = str;
        }
        EnterRoomConfig enterRoomConfig6 = this.f18216a;
        if (!(enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f28233c) == null)) {
            roomsData.f28296M = "click";
        }
        C6779a.m14563a().mo13053a(new C8452e(j, this.f18216a, (byte) 0));
        return true;
    }

    public C7345b(Context context, AbstractC1196i iVar, ViewGroup viewGroup) {
        RoomBackProgressView roomBackProgressView;
        int i;
        this.f18220e = context;
        this.f18224i = iVar;
        this.f18221f = viewGroup;
        HSImageView hSImageView = null;
        if (viewGroup != null) {
            roomBackProgressView = (RoomBackProgressView) viewGroup.findViewById(R.id.dml);
        } else {
            roomBackProgressView = null;
        }
        this.f18223h = roomBackProgressView;
        this.f18217b = viewGroup != null ? (HSImageView) viewGroup.findViewById(R.id.dmj) : hSImageView;
        this.f18216a = C7334b.f18205a.mo13571a(C3888a.m9505a(this.f18220e)).mo13567a();
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, "");
        EnterRoomLinkSession a = fVar.mo19010a();
        C89219l.m154716b(a, "");
        this.f18219d = a.f28391b;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            if (!C6229a.m13521a(this.f18220e)) {
                i = R.drawable.bu8;
            } else {
                i = R.drawable.bu9;
            }
            viewGroup.setBackgroundResource(i);
        }
    }
}
