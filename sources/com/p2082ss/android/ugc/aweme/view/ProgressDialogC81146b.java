package com.p2082ss.android.ugc.aweme.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.b */
public final class ProgressDialogC81146b extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public static final C81148b f181333d = new C81148b((byte) 0);

    /* renamed from: a */
    public ImageView f181334a;

    /* renamed from: b */
    public int f181335b;

    /* renamed from: c */
    public AbstractC81149c f181336c;

    /* renamed from: e */
    private ViewGroup f181337e;

    /* renamed from: f */
    private TextView f181338f;

    /* renamed from: g */
    private DmtStatusView f181339g;

    /* renamed from: h */
    private boolean f181340h;

    /* renamed from: i */
    private CharSequence f181341i;

    /* renamed from: j */
    private final EnumC81147a f181342j;

    /* renamed from: com.ss.android.ugc.aweme.view.b$a */
    public enum EnumC81147a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S;

        static {
            Covode.recordClassIndex(94475);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b$c */
    public interface AbstractC81149c {
        static {
            Covode.recordClassIndex(94477);
        }

        /* renamed from: a */
        void mo113366a();
    }

    static {
        Covode.recordClassIndex(94474);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b$b */
    public static final class C81148b {
        static {
            Covode.recordClassIndex(94476);
        }

        private C81148b() {
        }

        public /* synthetic */ C81148b(byte b) {
            this();
        }

        /* renamed from: a */
        public static ProgressDialogC81146b m140902a(Context context) {
            C89219l.m154721d(context, "");
            return m140904a(context, new ProgressDialogC81146b(context));
        }

        /* renamed from: a */
        private static ProgressDialogC81146b m140904a(Context context, ProgressDialogC81146b bVar) {
            bVar.setCancelable(false);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (C33067a.m67726a(activity, true) && !activity.isFinishing()) {
                    bVar.show();
                }
            }
            return bVar;
        }

        /* renamed from: a */
        public static ProgressDialogC81146b m140903a(Context context, EnumC81147a aVar, AbstractC81149c cVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(aVar, "");
            ProgressDialogC81146b bVar = new ProgressDialogC81146b(context, aVar, (byte) 0);
            bVar.f181336c = cVar;
            return m140904a(context, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b$d */
    static final class RunnableC81150d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC81146b f181344a;

        static {
            Covode.recordClassIndex(94478);
        }

        RunnableC81150d(ProgressDialogC81146b bVar) {
            this.f181344a = bVar;
        }

        public final void run() {
            ImageView imageView = this.f181344a.f181334a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressDialogC81146b(Context context) {
        this(context, EnumC81147a.GONE);
        C89219l.m154721d(context, "");
    }

    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.f181340h) {
            m140901a(charSequence);
        }
        this.f181341i = charSequence;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b$e */
    static final class View$OnClickListenerC81151e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC81146b f181345a;

        static {
            Covode.recordClassIndex(94479);
        }

        View$OnClickListenerC81151e(ProgressDialogC81146b bVar) {
            this.f181345a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC81149c cVar = this.f181345a.f181336c;
            if (cVar != null) {
                cVar.mo113366a();
            }
            this.f181345a.dismiss();
            this.f181345a.f181335b = 0;
        }
    }

    public final void setProgress(int i) {
        if (i >= this.f181335b) {
            if (this.f181340h) {
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                C89219l.m154716b(context, "");
                m140901a(sb.append(context.getResources().getString(R.string.g1j)).append(i).append("%").toString());
            }
            this.f181335b = i;
        }
    }

    /* renamed from: a */
    private final void m140901a(CharSequence charSequence) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        TextView textView = this.f181338f;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.f181338f;
        if (textView2 != null) {
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
        }
        DmtStatusView dmtStatusView = this.f181339g;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (dmtStatusView != null) {
            layoutParams = dmtStatusView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        if (layoutParams3 != null) {
            int i2 = 1;
            if (charSequence == null || charSequence.length() == 0) {
                i2 = 17;
            }
            if (layoutParams3.gravity != i2) {
                layoutParams3.gravity = i2;
                DmtStatusView dmtStatusView2 = this.f181339g;
                if (dmtStatusView2 != null) {
                    dmtStatusView2.setLayoutParams(layoutParams3);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.e4);
        this.f181337e = (ViewGroup) findViewById(R.id.dnb);
        this.f181334a = (ImageView) findViewById(R.id.a0x);
        this.f181338f = (TextView) findViewById(R.id.d_g);
        this.f181339g = (DmtStatusView) findViewById(R.id.e7i);
        int i = C81174c.f181377a[this.f181342j.ordinal()];
        if (i == 1) {
            ImageView imageView = this.f181334a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (i == 2) {
            ImageView imageView2 = this.f181334a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (i == 3 && (viewGroup = this.f181337e) != null) {
            viewGroup.postDelayed(new RunnableC81150d(this), 5000);
        }
        this.f181340h = true;
        setProgress(this.f181335b);
        DmtStatusView dmtStatusView = this.f181339g;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(new DmtStatusView.C17269a(getContext()).mo27397a());
        }
        DmtStatusView dmtStatusView2 = this.f181339g;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo27384f();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f181334a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC81151e(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProgressDialogC81146b(Context context, EnumC81147a aVar) {
        super(context, R.style.vc);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f181342j = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressDialogC81146b(Context context, EnumC81147a aVar, byte b) {
        this(context, aVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
    }
}
