package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

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
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g */
public final class ProgressDialogC72983g extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public static final C72985b f163775d = new C72985b((byte) 0);

    /* renamed from: a */
    public ImageView f163776a;

    /* renamed from: b */
    public int f163777b;

    /* renamed from: c */
    public AbstractC72986c f163778c;

    /* renamed from: e */
    private ViewGroup f163779e;

    /* renamed from: f */
    private DmtTextView f163780f;

    /* renamed from: g */
    private DmtStatusView f163781g;

    /* renamed from: h */
    private boolean f163782h;

    /* renamed from: i */
    private CharSequence f163783i;

    /* renamed from: j */
    private EnumC72984a f163784j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$a */
    public enum EnumC72984a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S;

        static {
            Covode.recordClassIndex(85687);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$c */
    public interface AbstractC72986c {
        static {
            Covode.recordClassIndex(85689);
        }

        /* renamed from: a */
        void mo113591a();
    }

    static {
        Covode.recordClassIndex(85686);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$b */
    public static final class C72985b {
        static {
            Covode.recordClassIndex(85688);
        }

        private C72985b() {
        }

        public /* synthetic */ C72985b(byte b) {
            this();
        }

        /* renamed from: a */
        public static ProgressDialogC72983g m128884a(Context context) {
            C89219l.m154721d(context, "");
            return m128886a(context, new ProgressDialogC72983g(context, R.style.vc));
        }

        /* renamed from: a */
        public static ProgressDialogC72983g m128886a(Context context, ProgressDialogC72983g gVar) {
            gVar.setCancelable(false);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (C33067a.m67726a(activity, false) && !activity.isFinishing()) {
                    gVar.show();
                }
            }
            return gVar;
        }

        /* renamed from: a */
        public static ProgressDialogC72983g m128885a(Context context, EnumC72984a aVar, AbstractC72986c cVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(cVar, "");
            ProgressDialogC72983g gVar = new ProgressDialogC72983g(context, R.style.vc, aVar);
            gVar.f163778c = cVar;
            return m128886a(context, gVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$d */
    static final class RunnableC72987d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC72983g f163786a;

        static {
            Covode.recordClassIndex(85690);
        }

        RunnableC72987d(ProgressDialogC72983g gVar) {
            this.f163786a = gVar;
        }

        public final void run() {
            ImageView imageView = this.f163786a.f163776a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo115402a() {
        ViewGroup.LayoutParams layoutParams;
        DmtTextView dmtTextView = this.f163780f;
        if (dmtTextView != null) {
            dmtTextView.setFontWeight(2);
        }
        ImageView imageView = this.f163776a;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        if (layoutParams3 != null) {
            layoutParams3.gravity = 8388661;
        }
        ImageView imageView2 = this.f163776a;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressDialogC72983g(Context context) {
        this(context, R.style.vc, EnumC72984a.GONE);
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$e */
    static final class View$OnClickListenerC72988e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC72983g f163787a;

        static {
            Covode.recordClassIndex(85691);
        }

        View$OnClickListenerC72988e(ProgressDialogC72983g gVar) {
            this.f163787a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC72986c cVar = this.f163787a.f163778c;
            if (cVar != null) {
                cVar.mo113591a();
            }
            this.f163787a.dismiss();
            this.f163787a.f163777b = 0;
        }
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f163782h) {
            DmtTextView dmtTextView = this.f163780f;
            if (dmtTextView != null) {
                dmtTextView.setText(charSequence);
            }
            DmtTextView dmtTextView2 = this.f163780f;
            if (dmtTextView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                dmtTextView2.setVisibility(i);
            }
        }
        this.f163783i = charSequence;
    }

    public final void setProgress(int i) {
        if (i >= this.f163777b) {
            if (this.f163782h) {
                DmtTextView dmtTextView = this.f163780f;
                if (dmtTextView == null) {
                    C89219l.m154715b();
                }
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                C89219l.m154716b(context, "");
                dmtTextView.setText(sb.append(context.getResources().getString(R.string.g1j)).append(i).append("%").toString());
            }
            this.f163777b = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.aer);
        this.f163779e = (ViewGroup) findViewById(R.id.dnb);
        this.f163776a = (ImageView) findViewById(R.id.a0x);
        this.f163780f = (DmtTextView) findViewById(R.id.d_g);
        this.f163781g = (DmtStatusView) findViewById(R.id.e7i);
        int i = C72989h.f163788a[this.f163784j.ordinal()];
        if (i == 1) {
            ImageView imageView = this.f163776a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (i == 2) {
            ImageView imageView2 = this.f163776a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (i == 3 && (viewGroup = this.f163779e) != null) {
            viewGroup.postDelayed(new RunnableC72987d(this), 5000);
        }
        this.f163782h = true;
        setProgress(this.f163777b);
        DmtStatusView dmtStatusView = this.f163781g;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(new DmtStatusView.C17269a(getContext()).mo27397a());
        }
        DmtStatusView dmtStatusView2 = this.f163781g;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo27384f();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f163776a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC72988e(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressDialogC72983g(Context context, int i) {
        this(context, R.style.vc, EnumC72984a.GONE);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressDialogC72983g(Context context, int i, EnumC72984a aVar) {
        super(context, i);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f163784j = aVar;
    }
}
