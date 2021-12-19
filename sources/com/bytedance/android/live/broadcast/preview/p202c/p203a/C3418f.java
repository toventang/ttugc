package com.bytedance.android.live.broadcast.preview.p202c.p203a;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAndCoHostAddAgeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6875i;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.c.a.f */
public final class C3418f implements AbstractC3411a {

    /* renamed from: a */
    public final User f9644a;

    static {
        Covode.recordClassIndex(3902);
    }

    public C3418f() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        AbstractC2994b a = b.mo13147a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        this.f9644a = (User) a;
    }

    @Override // com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a
    /* renamed from: a */
    public final boolean mo8723a(AbstractC3411a.C3412a aVar) {
        C89219l.m154721d(aVar, "");
        Context context = aVar.f9641a;
        C6875i iVar = new C6875i();
        boolean b = C6875i.m14731b(context, "saved_uid_start", this.f9644a.getId());
        if (!LiveLowAgeCountrySetting.INSTANCE.getValue() || UserWithAgeSetting.INSTANCE.getValue() || b || LiveHostAndCoHostAddAgeSetting.INSTANCE.getValue() != 0) {
            return false;
        }
        DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(context);
        aVar2.f22244a = C3966y.m9660a((int) R.string.e5t, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
        aVar2.f22245b = C3966y.m9657a((int) R.string.e5r);
        DialogC9148b.C9149a b2 = aVar2.mo15245a((CharSequence) C3966y.m9657a((int) R.string.e5s), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3419a(this, aVar, iVar, context), false).mo15250b((CharSequence) C3966y.m9657a((int) R.string.e5q), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3420b(this, aVar), false);
        b2.f22256m = false;
        b2.mo15247a().show();
        C6501b.C6502a.m13948a("livesdk_live_age_popup_show").mo12643a(aVar.f9642b).mo12654b("live").mo12658d("start_broadcast").mo12656c("show").mo12655b();
        return true;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.c.a.f$b */
    static final class DialogInterface$OnClickListenerC3420b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3418f f9649a;

        /* renamed from: b */
        final /* synthetic */ AbstractC3411a.C3412a f9650b;

        static {
            Covode.recordClassIndex(3904);
        }

        DialogInterface$OnClickListenerC3420b(C3418f fVar, AbstractC3411a.C3412a aVar) {
            this.f9649a = fVar;
            this.f9650b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            C3418f.m8841a("cancel", this.f9650b.f9642b);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.c.a.f$a */
    static final class DialogInterface$OnClickListenerC3419a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3418f f9645a;

        /* renamed from: b */
        final /* synthetic */ AbstractC3411a.C3412a f9646b;

        /* renamed from: c */
        final /* synthetic */ C6875i f9647c;

        /* renamed from: d */
        final /* synthetic */ Context f9648d;

        static {
            Covode.recordClassIndex(3903);
        }

        DialogInterface$OnClickListenerC3419a(C3418f fVar, AbstractC3411a.C3412a aVar, C6875i iVar, Context context) {
            this.f9645a = fVar;
            this.f9646b = aVar;
            this.f9647c = iVar;
            this.f9648d = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            C3418f.m8841a("continue", this.f9646b.f9642b);
            C6875i.m14730a(this.f9648d, "saved_uid_start", this.f9645a.f9644a.getId());
            this.f9646b.f9643c.invoke();
        }
    }

    /* renamed from: a */
    public static void m8841a(String str, DataChannel dataChannel) {
        C6501b.C6502a.m13948a("livesdk_live_age_popup_click").mo12643a(dataChannel).mo12654b("live").mo12658d("start_broadcast").mo12656c("click").mo12651a("click_icon", str).mo12655b();
    }
}
