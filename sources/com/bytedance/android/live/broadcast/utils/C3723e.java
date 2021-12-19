package com.bytedance.android.live.broadcast.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3752w;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventNoPenaltySetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9054bt;
import com.bytedance.android.livesdk.p561j.C9055bu;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.utils.e */
public final class C3723e {

    /* renamed from: a */
    public static final C3723e f10319a = new C3723e();

    private C3723e() {
    }

    static {
        Covode.recordClassIndex(4238);
    }

    /* renamed from: a */
    private static long m9230a() {
        Long l = (Long) DataChannelGlobal.f42558d.mo28324b(C9055bu.class);
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    /* renamed from: a */
    public static void m9231a(long j) {
        DataChannelGlobal.f42558d.mo28321a(C9055bu.class, Long.valueOf(j));
    }

    /* renamed from: a */
    public static boolean m9234a(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        Boolean bool = (Boolean) dataChannel.mo28318b(C3752w.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.utils.e$b */
    public static final class DialogInterface$OnClickListenerC3725b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f10322a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f10323b;

        static {
            Covode.recordClassIndex(4240);
        }

        DialogInterface$OnClickListenerC3725b(AbstractC89171a aVar, DataChannel dataChannel) {
            this.f10322a = aVar;
            this.f10323b = dataChannel;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            this.f10322a.invoke();
            C3723e.m9232a(this.f10323b, "cancel");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.utils.e$a */
    public static final class DialogInterface$OnClickListenerC3724a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f10320a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f10321b;

        static {
            Covode.recordClassIndex(4239);
        }

        DialogInterface$OnClickListenerC3724a(AbstractC89172b bVar, DataChannel dataChannel) {
            this.f10320a = bVar;
            this.f10321b = dataChannel;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            this.f10320a.invoke(PrivacyCert.Builder.Companion.with("bpea-420").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            C3723e.m9232a(this.f10321b, "end_now");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static void m9232a(DataChannel dataChannel, String str) {
        Long l;
        User owner;
        C6501b a = C6501b.C6502a.m13948a("livesdk_live_event_end_early");
        Room room = (Room) dataChannel.mo28318b(C9093de.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        C6501b a2 = a.mo12650a("room_id", (Number) l).mo12650a("live_event_id", (Number) DataChannelGlobal.f42558d.mo28324b(C9054bt.class));
        Room room2 = (Room) dataChannel.mo28318b(C9093de.class);
        if (!(room2 == null || (owner = room2.getOwner()) == null)) {
            l2 = Long.valueOf(owner.getId());
        }
        a2.mo12650a("anchor_id", (Number) l2).mo12651a("action_type", str).mo12655b();
    }

    /* renamed from: a */
    public static boolean m9233a(Context context, DataChannel dataChannel, AbstractC89172b<? super PrivacyCert, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        int i;
        C89219l.m154721d(context, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        if (m9230a() <= 0 || SystemClock.elapsedRealtime() >= m9230a() + 600000) {
            return false;
        }
        m9232a(dataChannel, "show");
        DialogC9148b.C9149a a = new DialogC9148b.C9149a(context).mo15243a(R.string.dus);
        if (LiveEventNoPenaltySetting.INSTANCE.getValue()) {
            i = R.string.e6w;
        } else {
            i = R.string.e71;
        }
        a.mo15248b(i).mo15244a(R.string.duu, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3724a(bVar, dataChannel), false).mo15249b(R.string.dut, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3725b(aVar, dataChannel), false).mo15247a().show();
        return true;
    }
}
