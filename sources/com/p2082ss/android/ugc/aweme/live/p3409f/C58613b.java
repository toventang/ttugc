package com.p2082ss.android.ugc.aweme.live.p3409f;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.f.b */
public final class C58613b {

    /* renamed from: a */
    public static final C58613b f133493a = new C58613b();

    /* renamed from: b */
    private static Dialog f133494b;

    private C58613b() {
    }

    static {
        Covode.recordClassIndex(68910);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.f.b$a */
    static final class DialogInterface$OnClickListenerC58614a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC58614a f133495a = new DialogInterface$OnClickListenerC58614a();

        static {
            Covode.recordClassIndex(68911);
        }

        DialogInterface$OnClickListenerC58614a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.f.b$b */
    static final class DialogInterface$OnClickListenerC58615b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f133496a;

        /* renamed from: b */
        final /* synthetic */ String f133497b;

        /* renamed from: c */
        final /* synthetic */ Intent f133498c;

        static {
            Covode.recordClassIndex(68912);
        }

        DialogInterface$OnClickListenerC58615b(Activity activity, String str, Intent intent) {
            this.f133496a = activity;
            this.f133497b = str;
            this.f133498c = intent;
        }

        /* renamed from: a */
        private static String m107737a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f133496a.finish();
            SmartRouter.buildRoute(this.f133496a, "//launcher/shortcut_proxy").withParam(StringSet.type, this.f133497b).withParam("open_url", m107737a(this.f133498c, "open_url")).withParam("from_live_block_dialog", true).open();
        }
    }

    /* renamed from: a */
    private static String m107735a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m107736a(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        String a = m107735a(intent, StringSet.type);
        if (C11279p.m20013a((CharSequence) a)) {
            C11279p.m20014b(f133494b);
            DialogC9148b a2 = new DialogC9148b.C9149a(activity).mo15243a(R.string.e53).mo15248b(R.string.e57).mo15249b(R.string.e58, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC58614a.f133495a, false).mo15244a(R.string.e55, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC58615b(activity, a, intent), false).mo15247a();
            f133494b = a2;
            C11279p.m19997a(a2);
        }
    }
}
