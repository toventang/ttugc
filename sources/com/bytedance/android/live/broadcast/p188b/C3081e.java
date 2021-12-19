package com.bytedance.android.live.broadcast.p188b;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.b.e */
public final class C3081e {

    /* renamed from: a */
    static boolean f8947a;

    /* renamed from: b */
    public static final C3081e f8948b = new C3081e();

    private C3081e() {
    }

    static {
        Covode.recordClassIndex(3561);
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.e$c */
    static final class DialogInterface$OnDismissListenerC3085c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC3085c f8957a = new DialogInterface$OnDismissListenerC3085c();

        static {
            Covode.recordClassIndex(3565);
        }

        DialogInterface$OnDismissListenerC3085c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C3081e.f8947a = false;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.e$d */
    static final class DialogInterface$OnShowListenerC3086d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public static final DialogInterface$OnShowListenerC3086d f8958a = new DialogInterface$OnShowListenerC3086d();

        static {
            Covode.recordClassIndex(3566);
        }

        DialogInterface$OnShowListenerC3086d() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            C3081e.f8947a = true;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.e$b */
    static final class C3084b implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ String f8955a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f8956b;

        static {
            Covode.recordClassIndex(3564);
        }

        C3084b(String str, AbstractC89171a aVar) {
            this.f8955a = str;
            this.f8956b = aVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            C3081e.m8417a(this.f8955a, "cancel");
            AbstractC89171a aVar = this.f8956b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.e$a */
    static final class C3082a implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ String f8949a;

        /* renamed from: b */
        final /* synthetic */ Activity f8950b;

        /* renamed from: c */
        final /* synthetic */ String f8951c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f8952d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f8953e;

        static {
            Covode.recordClassIndex(3562);
        }

        C3082a(String str, Activity activity, String str2, AbstractC89183m mVar, AbstractC89172b bVar) {
            this.f8949a = str;
            this.f8950b = activity;
            this.f8951c = str2;
            this.f8952d = mVar;
            this.f8953e = bVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            C3081e.m8417a(this.f8949a, "add");
            ((IHostAction) C6193a.m13435a(IHostAction.class)).goEditDoBAgeGatePage(this.f8950b, this.f8951c, new IHostAction.AbstractC11786a(this) {
                /* class com.bytedance.android.live.broadcast.p188b.C3081e.C3082a.C30831 */

                /* renamed from: a */
                final /* synthetic */ C3082a f8954a;

                static {
                    Covode.recordClassIndex(3563);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f8954a = r1;
                }

                @Override // com.bytedance.android.livesdkapi.host.IHostAction.AbstractC11786a
                /* renamed from: a */
                public final void mo8360a(String str) {
                    C89219l.m154721d(str, "");
                    this.f8954a.f8953e.invoke(str);
                }

                @Override // com.bytedance.android.livesdkapi.host.IHostAction.AbstractC11786a
                /* renamed from: a */
                public final void mo8361a(String str, String str2) {
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(str2, "");
                    this.f8954a.f8952d.invoke(str, str2);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m8417a(String str, String str2) {
        C6501b.C6502a.m13948a("livesdk_add_birth_popup_window_click").mo12639a().mo12651a("request_page", str).mo12651a("click_type", str2).mo12655b();
    }

    /* renamed from: a */
    public static boolean m8418a(Activity activity, String str, String str2, AbstractC89183m<? super String, ? super String, C89391z> mVar, AbstractC89172b<? super String, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        if (f8947a) {
            return false;
        }
        LiveDialog.C4056a aVar2 = new LiveDialog.C4056a(activity);
        aVar2.f11242r = false;
        aVar2.f11241q = false;
        LiveDialog.C4056a b = aVar2.mo9499a(R.string.dty).mo9504b(R.string.dtx).mo9500a(R.string.dtw, new C3082a(str2, activity, str, mVar, bVar)).mo9505b(R.string.dtv, new C3084b(str2, aVar));
        b.f11244t = DialogInterface$OnDismissListenerC3085c.f8957a;
        b.f11243s = DialogInterface$OnShowListenerC3086d.f8958a;
        b.mo9503a().show();
        return true;
    }
}
