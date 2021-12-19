package com.p4501vk.api.sdk.p4509ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import com.p4501vk.api.sdk.C87912l;
import com.p4501vk.api.sdk.p4507f.C87892f;
import com.p4501vk.api.sdk.p4507f.C87893g;
import com.p4501vk.api.sdk.p4507f.C87894h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity */
public final class VKCaptchaActivity extends Activity {

    /* renamed from: d */
    public static String f199662d;

    /* renamed from: e */
    public static final C87916a f199663e = new C87916a((byte) 0);

    /* renamed from: a */
    EditText f199664a;

    /* renamed from: b */
    public ImageView f199665b;

    /* renamed from: c */
    public ProgressBar f199666c;

    static {
        Covode.recordClassIndex(103927);
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

    /* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity$a */
    public static final class C87916a {
        static {
            Covode.recordClassIndex(103928);
        }

        private C87916a() {
        }

        /* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity$a$a */
        public static final class RunnableC87917a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f199667a;

            /* renamed from: b */
            final /* synthetic */ String f199668b;

            static {
                Covode.recordClassIndex(103929);
            }

            public RunnableC87917a(Context context, String str) {
                this.f199667a = context;
                this.f199668b = str;
            }

            public final void run() {
                Intent putExtra = new Intent(this.f199667a, VKCaptchaActivity.class).addFlags(268435456).putExtra("key_url", this.f199668b);
                C89219l.m154709a((Object) putExtra, "");
                Context context = this.f199667a;
                C84349a.m145093a(putExtra, context);
                context.startActivity(putExtra);
            }
        }

        public /* synthetic */ C87916a(byte b) {
            this();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: a */
    public final void mo142387a() {
        f199662d = null;
        C87894h.m152900b();
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C15477a.m28479e(this);
        C87894h.m152900b();
        super.onDestroy();
    }

    /* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity$b */
    static final class RunnableC87918b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VKCaptchaActivity f199669a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f199670b;

        static {
            Covode.recordClassIndex(103930);
        }

        RunnableC87918b(VKCaptchaActivity vKCaptchaActivity, Bitmap bitmap) {
            this.f199669a = vKCaptchaActivity;
            this.f199670b = bitmap;
        }

        public final void run() {
            ImageView imageView = this.f199669a.f199665b;
            if (imageView == null) {
                C89219l.m154710a("image");
            }
            imageView.setImageBitmap(this.f199670b);
            ProgressBar progressBar = this.f199669a.f199666c;
            if (progressBar == null) {
                C89219l.m154710a("progress");
            }
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity$c */
    static final class RunnableC87919c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VKCaptchaActivity f199671a;

        /* renamed from: b */
        final /* synthetic */ String f199672b;

        static {
            Covode.recordClassIndex(103931);
        }

        RunnableC87919c(VKCaptchaActivity vKCaptchaActivity, String str) {
            this.f199671a = vKCaptchaActivity;
            this.f199672b = str;
        }

        public final void run() {
            MethodCollector.m26663i(11313);
            String str = this.f199672b;
            C89219l.m154709a((Object) str, "");
            byte[] a = C87892f.m152895a(str);
            if (a != null) {
                VKCaptchaActivity vKCaptchaActivity = this.f199671a;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
                C89219l.m154709a((Object) decodeByteArray, "");
                C87912l.m152930a(new RunnableC87918b(vKCaptchaActivity, decodeByteArray));
            }
            MethodCollector.m26664o(11313);
        }
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

    /* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity$f */
    static final class DialogInterface$OnCancelListenerC87922f implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ VKCaptchaActivity f199675a;

        static {
            Covode.recordClassIndex(103934);
        }

        DialogInterface$OnCancelListenerC87922f(VKCaptchaActivity vKCaptchaActivity) {
            this.f199675a = vKCaptchaActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f199675a.mo142387a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(12573);
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        LinearLayout linearLayout = new LinearLayout(this);
        int ceil = (int) Math.ceil((double) (C87893g.m152896a().density * 12.0f));
        int max = (int) (Math.max(1.0f, C87893g.m152896a().density) * 130.0f);
        linearLayout.setPadding(ceil, ceil, ceil, ceil);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(max, (int) (Math.max(1.0f, C87893g.m152896a().density) * 50.0f));
        layoutParams.bottomMargin = ceil;
        frameLayout.setLayoutParams(layoutParams);
        this.f199666c = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ProgressBar progressBar = this.f199666c;
        if (progressBar == null) {
            C89219l.m154710a("progress");
        }
        progressBar.setLayoutParams(layoutParams2);
        ProgressBar progressBar2 = this.f199666c;
        if (progressBar2 == null) {
            C89219l.m154710a("progress");
        }
        frameLayout.addView(progressBar2);
        this.f199665b = new ImageView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageView imageView = this.f199665b;
        if (imageView == null) {
            C89219l.m154710a("image");
        }
        imageView.setLayoutParams(layoutParams3);
        ImageView imageView2 = this.f199665b;
        if (imageView2 == null) {
            C89219l.m154710a("image");
        }
        frameLayout.addView(imageView2);
        linearLayout.addView(frameLayout);
        EditText editText = new EditText(this);
        this.f199664a = editText;
        editText.setInputType(176);
        EditText editText2 = this.f199664a;
        if (editText2 == null) {
            C89219l.m154710a("input");
        }
        editText2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(max, -2);
        EditText editText3 = this.f199664a;
        if (editText3 == null) {
            C89219l.m154710a("input");
        }
        editText3.setLayoutParams(layoutParams4);
        View view = this.f199664a;
        if (view == null) {
            C89219l.m154710a("input");
        }
        linearLayout.addView(view);
        new AlertDialog.Builder(this, 5).setView(linearLayout).setTitle(R.string.h_p).setPositiveButton(17039370, new DialogInterface$OnClickListenerC87920d(this)).setNegativeButton(17039360, new DialogInterface$OnClickListenerC87921e(this)).setOnCancelListener(new DialogInterface$OnCancelListenerC87922f(this)).show();
        EditText editText4 = this.f199664a;
        if (editText4 == null) {
            C89219l.m154710a("input");
        }
        editText4.requestFocus();
        C87912l.m152929a().submit(new RunnableC87919c(this, m152931a(getIntent(), "key_url")));
        MethodCollector.m26664o(12573);
    }

    /* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity$e */
    static final class DialogInterface$OnClickListenerC87921e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VKCaptchaActivity f199674a;

        static {
            Covode.recordClassIndex(103933);
        }

        DialogInterface$OnClickListenerC87921e(VKCaptchaActivity vKCaptchaActivity) {
            this.f199674a = vKCaptchaActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f199674a.mo142387a();
        }
    }

    /* renamed from: a */
    private static String m152931a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity$d */
    static final class DialogInterface$OnClickListenerC87920d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VKCaptchaActivity f199673a;

        static {
            Covode.recordClassIndex(103932);
        }

        DialogInterface$OnClickListenerC87920d(VKCaptchaActivity vKCaptchaActivity) {
            this.f199673a = vKCaptchaActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            VKCaptchaActivity vKCaptchaActivity = this.f199673a;
            EditText editText = vKCaptchaActivity.f199664a;
            if (editText == null) {
                C89219l.m154710a("input");
            }
            VKCaptchaActivity.f199662d = editText.getText().toString();
            C87894h.m152900b();
            vKCaptchaActivity.finish();
        }
    }
}
