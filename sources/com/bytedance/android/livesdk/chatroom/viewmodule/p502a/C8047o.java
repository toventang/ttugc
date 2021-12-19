package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.C4415e;
import com.bytedance.android.live.liveinteract.api.p261b.C4417f;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9075cn;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.o */
public final class C8047o implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    public static final C8048a f20052a = new C8048a((byte) 0);

    /* renamed from: b */
    private DataChannel f20053b;

    /* renamed from: c */
    private int f20054c;

    static {
        Covode.recordClassIndex(8854);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.o$a */
    public static final class C8048a {
        static {
            Covode.recordClassIndex(8855);
        }

        private C8048a() {
        }

        public /* synthetic */ C8048a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo14323a() {
        DataChannel dataChannel = this.f20053b;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9075cn.class, (Object) true);
        }
        this.f20054c++;
    }

    /* renamed from: b */
    public final boolean mo14324b() {
        String str;
        C4415e eVar;
        DataChannel dataChannel = this.f20053b;
        if (dataChannel == null || (eVar = (C4415e) dataChannel.mo28318b(C4417f.class)) == null || (str = eVar.f12015a) == null) {
            str = C4415e.f12005b;
        }
        if (!(!C89219l.m154714a((Object) str, (Object) C4415e.f12005b))) {
            return false;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.duk);
        return true;
    }

    public final void onClick(View view) {
        int i;
        C89219l.m154721d(view, "");
        if (!mo14324b()) {
            if (this.f20054c == 3) {
                i = 1;
            } else {
                i = 0;
            }
            C6501b.C6502a.m13948a("livesdk_live_pause_click").mo12643a(this.f20053b).mo12645a("is_max_pause_num", i).mo12655b();
            if (i != 0) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dup);
                return;
            }
            C6805b<Boolean> bVar = AbstractC6804a.f16918aT;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (a.booleanValue()) {
                C6805b<Boolean> bVar2 = AbstractC6804a.f16918aT;
                C89219l.m154716b(bVar2, "");
                C6806c.m14603a((C6800c) bVar2, (Object) false);
                new DialogC9148b.C9149a(view.getContext()).mo15243a(R.string.dui).mo15248b(R.string.duh).mo15244a(R.string.duf, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC8049b(this), false).mo15249b(R.string.dug, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC8050c.f20056a, false).mo15247a().show();
                return;
            }
            mo14323a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.o$c */
    static final class DialogInterface$OnClickListenerC8050c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC8050c f20056a = new DialogInterface$OnClickListenerC8050c();

        static {
            Covode.recordClassIndex(8857);
        }

        DialogInterface$OnClickListenerC8050c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        this.f20053b = dataChannel;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.o$b */
    static final class DialogInterface$OnClickListenerC8049b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8047o f20055a;

        static {
            Covode.recordClassIndex(8856);
        }

        DialogInterface$OnClickListenerC8049b(C8047o oVar) {
            this.f20055a = oVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f20055a.mo14324b()) {
                this.f20055a.mo14323a();
            }
            dialogInterface.dismiss();
        }
    }
}
