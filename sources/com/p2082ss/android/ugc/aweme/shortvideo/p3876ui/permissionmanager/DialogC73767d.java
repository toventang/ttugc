package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0240h;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.d */
public final class DialogC73767d extends DialogC0240h {

    /* renamed from: a */
    public final boolean f165619a = C46981gn.m90261a();

    /* renamed from: b */
    public TuxTextView f165620b;

    /* renamed from: c */
    public AbstractC89171a<C89391z> f165621c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f165622d;

    /* renamed from: e */
    public final Activity f165623e;

    /* renamed from: f */
    private ImageView f165624f;

    /* renamed from: g */
    private ImageView f165625g;

    /* renamed from: h */
    private ImageView f165626h;

    static {
        Covode.recordClassIndex(86506);
    }

    /* renamed from: b */
    public final void mo9590b() {
        Drawable a = C0643b.m2369a(getContext(), 2131232365);
        Drawable a2 = C0643b.m2369a(getContext(), 2131232364);
        ImageView imageView = this.f165624f;
        if (imageView != null) {
            if (C73772f.m129823a("android.permission.CAMERA")) {
                a2 = a;
            }
            imageView.setImageDrawable(a2);
        }
        Drawable a3 = C0643b.m2369a(getContext(), 2131232367);
        ImageView imageView2 = this.f165625g;
        if (imageView2 != null) {
            if (C73772f.m129823a("android.permission.RECORD_AUDIO")) {
                a3 = a;
            }
            imageView2.setImageDrawable(a3);
        }
        Drawable a4 = C0643b.m2369a(getContext(), 2131232366);
        ImageView imageView3 = this.f165626h;
        if (imageView3 != null) {
            if (!C73772f.m129823a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                a = a4;
            }
            imageView3.setImageDrawable(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.d$a */
    static final class View$OnClickListenerC73768a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC73767d f165627a;

        static {
            Covode.recordClassIndex(86507);
        }

        View$OnClickListenerC73768a(DialogC73767d dVar) {
            this.f165627a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f165627a.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.d$b */
    static final class View$OnClickListenerC73769b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC73767d f165628a;

        static {
            Covode.recordClassIndex(86508);
        }

        View$OnClickListenerC73769b(DialogC73767d dVar) {
            this.f165628a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f165628a.f165621c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.d$c */
    static final class DialogInterface$OnCancelListenerC73770c implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ DialogC73767d f165629a;

        static {
            Covode.recordClassIndex(86509);
        }

        DialogInterface$OnCancelListenerC73770c(DialogC73767d dVar) {
            this.f165629a = dVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            AbstractC89171a<C89391z> aVar = this.f165629a.f165622d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC73767d(Activity activity) {
        super(activity);
        C89219l.m154721d(activity, "");
        this.f165623e = activity;
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        requestWindowFeature(1);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ar9, (ViewGroup) findViewById(R.id.acq), false);
        setContentView(a);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(17170445);
        }
        this.f165624f = (ImageView) a.findViewById(R.id.bth);
        this.f165625g = (ImageView) a.findViewById(R.id.bxl);
        this.f165626h = (ImageView) a.findViewById(R.id.bvm);
        this.f165620b = (TuxTextView) a.findViewById(R.id.i_);
        TextView textView = (TextView) a.findViewById(R.id.eb3);
        C89219l.m154716b(textView, "");
        if (this.f165619a) {
            string = getContext().getString(R.string.g7t, getContext().getString(R.string.g7m), getContext().getString(R.string.g7q));
        } else {
            string = getContext().getString(R.string.g7u, getContext().getString(R.string.g7m), getContext().getString(R.string.g7q), getContext().getString(R.string.g7o));
        }
        C89219l.m154716b(string, "");
        textView.setText(string);
        if (this.f165619a) {
            View findViewById = a.findViewById(R.id.b1d);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
        }
        mo9590b();
        a.findViewById(R.id.pf).setOnClickListener(new View$OnClickListenerC73768a(this));
        TuxTextView tuxTextView = this.f165620b;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new View$OnClickListenerC73769b(this));
        }
        setOnCancelListener(new DialogInterface$OnCancelListenerC73770c(this));
    }
}
