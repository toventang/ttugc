package com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.h.a */
public final class ProgressDialogC57125a extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public static final C57127b f130055d = new C57127b((byte) 0);

    /* renamed from: a */
    public ImageView f130056a;

    /* renamed from: b */
    public int f130057b;

    /* renamed from: c */
    public AbstractC57128c f130058c;

    /* renamed from: e */
    private ViewGroup f130059e;

    /* renamed from: f */
    private TextView f130060f;

    /* renamed from: g */
    private TuxDualBallView f130061g;

    /* renamed from: h */
    private boolean f130062h;

    /* renamed from: i */
    private CharSequence f130063i;

    /* renamed from: j */
    private final EnumC57126a f130064j;

    /* renamed from: com.ss.android.ugc.aweme.kids.a.h.a$a */
    public enum EnumC57126a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S;

        static {
            Covode.recordClassIndex(67020);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.h.a$c */
    public interface AbstractC57128c {
        static {
            Covode.recordClassIndex(67022);
        }

        /* renamed from: a */
        void mo94279a();
    }

    static {
        Covode.recordClassIndex(67019);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.h.a$b */
    public static final class C57127b {
        static {
            Covode.recordClassIndex(67021);
        }

        private C57127b() {
        }

        public /* synthetic */ C57127b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.h.a$d */
    static final class RunnableC57129d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC57125a f130066a;

        static {
            Covode.recordClassIndex(67023);
        }

        RunnableC57129d(ProgressDialogC57125a aVar) {
            this.f130066a = aVar;
        }

        public final void run() {
            ImageView imageView = this.f130066a.f130056a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.h.a$e */
    static final class View$OnClickListenerC57130e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC57125a f130067a;

        static {
            Covode.recordClassIndex(67024);
        }

        View$OnClickListenerC57130e(ProgressDialogC57125a aVar) {
            this.f130067a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC57128c cVar = this.f130067a.f130058c;
            if (cVar != null) {
                cVar.mo94279a();
            }
            this.f130067a.dismiss();
            this.f130067a.f130057b = 0;
        }
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f130062h) {
            TextView textView = this.f130060f;
            if (textView != null) {
                textView.setText(charSequence);
            }
            TextView textView2 = this.f130060f;
            if (textView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView2.setVisibility(i);
            }
        }
        this.f130063i = charSequence;
    }

    public final void setProgress(int i) {
        if (i >= this.f130057b) {
            if (this.f130062h) {
                TextView textView = this.f130060f;
                if (textView == null) {
                    C89219l.m154715b();
                }
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                C89219l.m154716b(context, "");
                textView.setText(sb.append(context.getResources().getString(R.string.g1j)).append(i).append("%").toString());
            }
            this.f130057b = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.adg);
        this.f130059e = (ViewGroup) findViewById(R.id.dnb);
        this.f130056a = (ImageView) findViewById(R.id.a0x);
        this.f130060f = (TextView) findViewById(R.id.d_g);
        this.f130061g = (TuxDualBallView) findViewById(R.id.ap_);
        int i = C57134b.f130070a[this.f130064j.ordinal()];
        if (i == 1) {
            ImageView imageView = this.f130056a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (i == 2) {
            ImageView imageView2 = this.f130056a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (i == 3 && (viewGroup = this.f130059e) != null) {
            viewGroup.postDelayed(new RunnableC57129d(this), 5000);
        }
        this.f130062h = true;
        setProgress(this.f130057b);
        TuxDualBallView tuxDualBallView = this.f130061g;
        if (tuxDualBallView != null) {
            tuxDualBallView.mo37884b();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f130056a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC57130e(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProgressDialogC57125a(Context context, EnumC57126a aVar) {
        super(context, R.style.zr);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f130064j = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressDialogC57125a(Context context, EnumC57126a aVar, byte b) {
        this(context, aVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
    }
}
