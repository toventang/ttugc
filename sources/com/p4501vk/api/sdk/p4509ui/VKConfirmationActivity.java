package com.p4501vk.api.sdk.p4509ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import com.p4501vk.api.sdk.p4507f.C87894h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.ui.VKConfirmationActivity */
public final class VKConfirmationActivity extends Activity {

    /* renamed from: a */
    public static boolean f199676a;

    /* renamed from: b */
    public static final C87923a f199677b = new C87923a((byte) 0);

    static {
        Covode.recordClassIndex(103935);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* renamed from: com.vk.api.sdk.ui.VKConfirmationActivity$a */
    public static final class C87923a {
        static {
            Covode.recordClassIndex(103936);
        }

        private C87923a() {
        }

        /* renamed from: com.vk.api.sdk.ui.VKConfirmationActivity$a$a */
        public static final class RunnableC87924a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f199678a;

            /* renamed from: b */
            final /* synthetic */ String f199679b;

            static {
                Covode.recordClassIndex(103937);
            }

            public RunnableC87924a(Context context, String str) {
                this.f199678a = context;
                this.f199679b = str;
            }

            public final void run() {
                Intent putExtra = new Intent(this.f199678a, VKConfirmationActivity.class).addFlags(268435456).putExtra("key_message", this.f199679b);
                C89219l.m154709a((Object) putExtra, "");
                Context context = this.f199678a;
                C84349a.m145093a(putExtra, context);
                context.startActivity(putExtra);
            }
        }

        public /* synthetic */ C87923a(byte b) {
            this();
        }
    }

    public final void finish() {
        super.finish();
        C87894h.m152900b();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C87894h.m152900b();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.vk.api.sdk.ui.VKConfirmationActivity$d */
    static final class DialogInterface$OnCancelListenerC87927d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ VKConfirmationActivity f199682a;

        static {
            Covode.recordClassIndex(103940);
        }

        DialogInterface$OnCancelListenerC87927d(VKConfirmationActivity vKConfirmationActivity) {
            this.f199682a = vKConfirmationActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            VKConfirmationActivity.f199676a = false;
            this.f199682a.finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(12451);
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        new AlertDialog.Builder(this, 5).setTitle(R.string.h_q).setMessage(m152933a(getIntent(), "key_message")).setPositiveButton(17039370, new DialogInterface$OnClickListenerC87925b(this)).setNegativeButton(17039360, new DialogInterface$OnClickListenerC87926c(this)).setOnCancelListener(new DialogInterface$OnCancelListenerC87927d(this)).show();
        MethodCollector.m26664o(12451);
    }

    /* renamed from: a */
    private static String m152933a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.vk.api.sdk.ui.VKConfirmationActivity$b */
    static final class DialogInterface$OnClickListenerC87925b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VKConfirmationActivity f199680a;

        static {
            Covode.recordClassIndex(103938);
        }

        DialogInterface$OnClickListenerC87925b(VKConfirmationActivity vKConfirmationActivity) {
            this.f199680a = vKConfirmationActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            VKConfirmationActivity.f199676a = true;
            this.f199680a.finish();
        }
    }

    /* renamed from: com.vk.api.sdk.ui.VKConfirmationActivity$c */
    static final class DialogInterface$OnClickListenerC87926c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VKConfirmationActivity f199681a;

        static {
            Covode.recordClassIndex(103939);
        }

        DialogInterface$OnClickListenerC87926c(VKConfirmationActivity vKConfirmationActivity) {
            this.f199681a = vKConfirmationActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            VKConfirmationActivity.f199676a = false;
            this.f199681a.finish();
        }
    }
}
