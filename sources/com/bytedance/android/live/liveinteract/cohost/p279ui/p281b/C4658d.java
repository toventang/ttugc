package com.bytedance.android.live.liveinteract.cohost.p279ui.p281b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.d */
public final class C4658d {

    /* renamed from: a */
    public static final C4658d f12332a = new C4658d();

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.d$a */
    public interface AbstractC4659a {
        static {
            Covode.recordClassIndex(5236);
        }

        /* renamed from: a */
        void mo10337a();

        /* renamed from: b */
        void mo10338b();
    }

    private C4658d() {
    }

    static {
        Covode.recordClassIndex(5235);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.d$b */
    static final class DialogInterface$OnClickListenerC4660b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC4659a f12333a;

        static {
            Covode.recordClassIndex(5237);
        }

        DialogInterface$OnClickListenerC4660b(AbstractC4659a aVar) {
            this.f12333a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            this.f12333a.mo10337a();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.d$c */
    static final class DialogInterface$OnClickListenerC4661c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC4659a f12334a;

        static {
            Covode.recordClassIndex(5238);
        }

        DialogInterface$OnClickListenerC4661c(AbstractC4659a aVar) {
            this.f12334a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            this.f12334a.mo10338b();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static final Dialog m10789a(Context context, AbstractC4659a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(context);
        aVar2.f22247d = 2131234100;
        aVar2.f22244a = C3966y.m9657a((int) R.string.dx1);
        aVar2.f22245b = C3966y.m9657a((int) R.string.dx2);
        DialogC9148b.C9149a a = aVar2.mo15249b(R.string.e5q, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC4660b(aVar), false).mo15244a(R.string.e5s, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC4661c(aVar), false);
        a.f22256m = false;
        DialogC9148b a2 = a.mo15247a();
        C89219l.m154716b(a2, "");
        return a2;
    }
}
