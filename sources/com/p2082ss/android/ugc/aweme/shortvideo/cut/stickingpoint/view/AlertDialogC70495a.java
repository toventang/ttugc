package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.CircularProgressView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a */
public final class AlertDialogC70495a extends AlertDialog {

    /* renamed from: a */
    public AbstractC70496a f157538a;

    /* renamed from: b */
    private boolean f157539b;

    /* renamed from: c */
    private CharSequence f157540c;

    /* renamed from: d */
    private boolean f157541d;

    /* renamed from: e */
    private boolean f157542e;

    /* renamed from: f */
    private int f157543f;

    /* renamed from: g */
    private int f157544g = 100;

    /* renamed from: h */
    private TextView f157545h;

    /* renamed from: i */
    private CircularProgressView f157546i;

    /* renamed from: j */
    private ImageView f157547j;

    /* renamed from: k */
    private TextView f157548k;

    /* renamed from: l */
    private View f157549l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a$a */
    public interface AbstractC70496a {
        static {
            Covode.recordClassIndex(82945);
        }

        /* renamed from: a */
        void mo111017a();
    }

    static {
        Covode.recordClassIndex(82944);
    }

    public final void dismiss() {
        CircularProgressView circularProgressView = this.f157546i;
        if (circularProgressView == null) {
            C89219l.m154710a("mLodingProgressView");
        }
        circularProgressView.mo129887b();
        super.dismiss();
    }

    /* renamed from: a */
    public final void mo111076a(AbstractC70496a aVar) {
        C89219l.m154721d(aVar, "");
        this.f157538a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a$b */
    static final class View$OnClickListenerC70497b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialogC70495a f157550a;

        static {
            Covode.recordClassIndex(82946);
        }

        View$OnClickListenerC70497b(AlertDialogC70495a aVar) {
            this.f157550a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC70496a aVar = this.f157550a.f157538a;
            if (aVar != null) {
                aVar.mo111017a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogC70495a(Context context) {
        super(context, 3);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public final void mo111077a(boolean z) {
        int i;
        if (this.f157539b) {
            ImageView imageView = this.f157547j;
            if (imageView == null) {
                C89219l.m154710a("mCancelView");
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        this.f157542e = z;
    }

    /* renamed from: a */
    public final void mo111075a(int i) {
        if (this.f157539b) {
            TextView textView = this.f157548k;
            if (textView == null) {
                C89219l.m154710a("mProgressTextView");
            }
            textView.setText(new StringBuilder().append(i).append('%').toString());
            CircularProgressView circularProgressView = this.f157546i;
            if (circularProgressView == null) {
                C89219l.m154710a("mLodingProgressView");
            }
            circularProgressView.setProgress((float) i);
        }
        this.f157543f = i;
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        if (this.f157539b) {
            TextView textView = this.f157545h;
            if (textView == null) {
                C89219l.m154710a("mMessageView");
            }
            textView.setText(charSequence);
            TextView textView2 = this.f157545h;
            if (textView2 == null) {
                C89219l.m154710a("mMessageView");
            }
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
        }
        this.f157540c = charSequence;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.aia);
        View findViewById = findViewById(R.id.dnb);
        C89219l.m154716b(findViewById, "");
        this.f157549l = findViewById;
        View findViewById2 = findViewById(R.id.cj9);
        C89219l.m154716b(findViewById2, "");
        this.f157545h = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.bxi);
        C89219l.m154716b(findViewById3, "");
        this.f157546i = (CircularProgressView) findViewById3;
        View findViewById4 = findViewById(R.id.a0x);
        C89219l.m154716b(findViewById4, "");
        this.f157547j = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.d_3);
        C89219l.m154716b(findViewById5, "");
        this.f157548k = (TextView) findViewById5;
        ImageView imageView = this.f157547j;
        if (imageView == null) {
            C89219l.m154710a("mCancelView");
        }
        imageView.setOnClickListener(new View$OnClickListenerC70497b(this));
        this.f157539b = true;
        setMessage(this.f157540c);
        boolean z = this.f157541d;
        if (this.f157539b) {
            CircularProgressView circularProgressView = this.f157546i;
            if (circularProgressView == null) {
                C89219l.m154710a("mLodingProgressView");
            }
            circularProgressView.setIndeterminate(z);
            TextView textView = this.f157548k;
            if (textView == null) {
                C89219l.m154710a("mProgressTextView");
            }
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f157541d = z;
        int i2 = this.f157544g;
        if (this.f157539b) {
            CircularProgressView circularProgressView2 = this.f157546i;
            if (circularProgressView2 == null) {
                C89219l.m154710a("mLodingProgressView");
            }
            circularProgressView2.setMaxProgress((float) i2);
        }
        this.f157544g = i2;
        mo111075a(this.f157543f);
        setCanceledOnTouchOutside(false);
        mo111077a(this.f157542e);
    }
}
