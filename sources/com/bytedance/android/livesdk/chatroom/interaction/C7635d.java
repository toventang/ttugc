package com.bytedance.android.livesdk.chatroom.interaction;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.like.AbstractC9167a;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.AbstractC9170d;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.interaction.d */
public final class C7635d {

    /* renamed from: a */
    public final GestureDetectLayout f18933a;

    /* renamed from: b */
    private final Fragment f18934b;

    /* renamed from: c */
    private final DataChannel f18935c;

    static {
        Covode.recordClassIndex(8412);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.d$b */
    public static final class C7637b implements AbstractC9170d {
        static {
            Covode.recordClassIndex(8414);
        }

        C7637b() {
        }

        @Override // com.bytedance.android.livesdk.like.AbstractC9170d
        /* renamed from: a */
        public final void mo10821a(AbstractC9168b bVar, int i) {
            C89219l.m154721d(bVar, "");
            LivePerformanceManager.getInstance().onModuleStop("like");
        }

        @Override // com.bytedance.android.livesdk.like.AbstractC9170d
        /* renamed from: a */
        public final void mo10822a(AbstractC9168b bVar, int i, int i2, float f, float f2, float f3, float f4) {
            C89219l.m154721d(bVar, "");
            LivePerformanceManager instance = LivePerformanceManager.getInstance();
            if (i2 == 1) {
                instance.onModuleStart("like", null);
            }
            instance.monitorPerformance("show_like");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.d$a */
    static final class C7636a implements AbstractC9167a {

        /* renamed from: a */
        final /* synthetic */ C7635d f18936a;

        /* renamed from: b */
        final /* synthetic */ Room f18937b;

        /* renamed from: c */
        final /* synthetic */ boolean f18938c;

        /* renamed from: d */
        final /* synthetic */ boolean f18939d;

        /* renamed from: e */
        final /* synthetic */ boolean f18940e;

        static {
            Covode.recordClassIndex(8413);
        }

        C7636a(C7635d dVar, Room room, boolean z, boolean z2, boolean z3) {
            this.f18936a = dVar;
            this.f18937b = room;
            this.f18938c = z;
            this.f18939d = z2;
            this.f18940e = z3;
        }

        @Override // com.bytedance.android.livesdk.like.AbstractC9167a
        /* renamed from: a */
        public final GestureDetectLayout mo13855a() {
            return this.f18936a.f18933a;
        }
    }

    public C7635d(Fragment fragment, DataChannel dataChannel, GestureDetectLayout gestureDetectLayout) {
        boolean z;
        boolean z2;
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(gestureDetectLayout, "");
        this.f18934b = fragment;
        this.f18935c = dataChannel;
        this.f18933a = gestureDetectLayout;
        Room room = (Room) dataChannel.mo28318b(C9093de.class);
        if (room != null) {
            Boolean bool = (Boolean) dataChannel.mo28318b(C9119ed.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Object b = dataChannel.mo28318b(C9076co.class);
            if (b == null) {
                C89219l.m154715b();
            }
            boolean booleanValue = ((Boolean) b).booleanValue();
            Object b2 = dataChannel.mo28318b(C9076co.class);
            if (b2 == null) {
                C89219l.m154715b();
            }
            boolean booleanValue2 = ((Boolean) b2).booleanValue();
            if (z || !((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom()) {
                z2 = true;
            } else {
                z2 = false;
            }
            AbstractC10073p pVar = (AbstractC10073p) C6193a.m13435a(AbstractC10073p.class);
            pVar.configLikeHelper(fragment.getActivity(), fragment, room, new C7636a(this, room, booleanValue, booleanValue2, z2), booleanValue, booleanValue2, z2, dataChannel);
            AbstractC9168b likeHelper = pVar.getLikeHelper(room.getId());
            if (likeHelper != null) {
                likeHelper.mo15271a(new C7637b());
            }
        }
    }
}
