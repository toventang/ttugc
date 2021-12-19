package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.C4366j;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.chatroom.p488c.C7367a;
import com.bytedance.android.livesdk.chatroom.p488c.C7382ao;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.j */
public final class C8036j implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    public DataChannel f20028a;

    /* renamed from: b */
    private Dialog f20029b;

    /* renamed from: c */
    private final Context f20030c;

    static {
        Covode.recordClassIndex(8843);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    /* renamed from: a */
    public final void mo14315a() {
        String str;
        DataChannel dataChannel = this.f20028a;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        dataChannel.mo28320c(C4366j.class, new C7382ao());
        DataChannel dataChannel2 = this.f20028a;
        if (dataChannel2 == null) {
            C89219l.m154710a("dataChannel");
        }
        Object b = dataChannel2.mo28318b(C9058bx.class);
        if (b == null) {
            b = EnumC11728i.VIDEO;
        }
        C6501b a = C6501b.C6502a.m13948a("livesdk_anchor_comment_click").mo12639a();
        if (b == EnumC11728i.VIDEO) {
            str = "video_live";
        } else {
            str = "third_party";
        }
        a.mo12644a(str).mo12655b();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.j$b */
    static final class C8038b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C8038b f20032a = new C8038b();

        static {
            Covode.recordClassIndex(8845);
        }

        C8038b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
        }
    }

    public C8036j(Context context) {
        C89219l.m154721d(context, "");
        this.f20030c = context;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.j$a */
    static final class C8037a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8036j f20031a;

        static {
            Covode.recordClassIndex(8844);
        }

        C8037a(C8036j jVar) {
            this.f20031a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((C5832d) obj).statusCode == 0) {
                C6501b a = C6501b.C6502a.m13948a("livesdk_set_comment_status");
                DataChannel dataChannel = this.f20031a.f20028a;
                if (dataChannel == null) {
                    C89219l.m154710a("dataChannel");
                }
                a.mo12643a(dataChannel).mo12651a("status", "open").mo12651a("situation", "comment_popup").mo12655b();
                C6805b<Boolean> bVar = AbstractC6804a.f16969bR;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a((C6800c) bVar, (Object) true);
                C6779a.m14563a().mo13053a(new C7367a(true));
                this.f20031a.mo14315a();
                return;
            }
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
        }
    }

    public final void onClick(View view) {
        C6805b<Boolean> bVar = AbstractC6804a.f16969bR;
        C89219l.m154716b(bVar, "");
        if (!bVar.mo13066a().booleanValue()) {
            if (this.f20029b == null) {
                DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(this.f20030c);
                aVar.f22253j = true;
                this.f20029b = aVar.mo15248b(R.string.e6k).mo15244a(R.string.eaf, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC8039c(this), false).mo15249b(R.string.gi8, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC8040d.f20034a, false).mo15247a();
            }
            Dialog dialog = this.f20029b;
            if (dialog != null) {
                C11279p.m19997a(dialog);
                return;
            }
            return;
        }
        mo14315a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.j$d */
    static final class DialogInterface$OnClickListenerC8040d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC8040d f20034a = new DialogInterface$OnClickListenerC8040d();

        static {
            Covode.recordClassIndex(8847);
        }

        DialogInterface$OnClickListenerC8040d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        this.f20028a = dataChannel;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.j$c */
    static final class DialogInterface$OnClickListenerC8039c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8036j f20033a;

        static {
            Covode.recordClassIndex(8846);
        }

        DialogInterface$OnClickListenerC8039c(C8036j jVar) {
            this.f20033a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C8036j jVar = this.f20033a;
            DataChannel dataChannel = jVar.f20028a;
            if (dataChannel == null) {
                C89219l.m154710a("dataChannel");
            }
            Long l = (Long) dataChannel.mo28318b(C9096dh.class);
            if (l != null) {
                ((RoomSwitchApi) C5805e.m12718a().mo11572a(RoomSwitchApi.class)).updateSwitch(l.longValue(), 3, true).mo143271a(new C11191f()).mo143254a(new C8037a(jVar), C8038b.f20032a);
            }
        }
    }
}
