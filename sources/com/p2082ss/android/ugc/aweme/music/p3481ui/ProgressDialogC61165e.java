package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.app.Activity;
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
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.e */
public final class ProgressDialogC61165e extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public static final C61167b f138871d = new C61167b((byte) 0);

    /* renamed from: a */
    public ImageView f138872a;

    /* renamed from: b */
    public int f138873b;

    /* renamed from: c */
    public AbstractC61168c f138874c;

    /* renamed from: e */
    private ViewGroup f138875e;

    /* renamed from: f */
    private TextView f138876f;

    /* renamed from: g */
    private DmtStatusView f138877g;

    /* renamed from: h */
    private boolean f138878h;

    /* renamed from: i */
    private CharSequence f138879i;

    /* renamed from: j */
    private final EnumC61166a f138880j;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e$a */
    public enum EnumC61166a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S;

        static {
            Covode.recordClassIndex(71771);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e$c */
    public interface AbstractC61168c {
        static {
            Covode.recordClassIndex(71773);
        }

        /* renamed from: a */
        void mo98605a();
    }

    static {
        Covode.recordClassIndex(71770);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e$b */
    public static final class C61167b {
        static {
            Covode.recordClassIndex(71772);
        }

        private C61167b() {
        }

        public /* synthetic */ C61167b(byte b) {
            this();
        }

        /* renamed from: a */
        public static ProgressDialogC61165e m110784a(Context context) {
            C89219l.m154721d(context, "");
            return m110786a(context, new ProgressDialogC61165e(context));
        }

        /* renamed from: a */
        private static ProgressDialogC61165e m110786a(Context context, ProgressDialogC61165e eVar) {
            eVar.setCancelable(false);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (C33067a.m67726a(activity, true) && !activity.isFinishing()) {
                    eVar.show();
                }
            }
            return eVar;
        }

        /* renamed from: a */
        public static ProgressDialogC61165e m110785a(Context context, EnumC61166a aVar, AbstractC61168c cVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(cVar, "");
            ProgressDialogC61165e eVar = new ProgressDialogC61165e(context, aVar, (byte) 0);
            eVar.f138874c = cVar;
            return m110786a(context, eVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e$d */
    static final class RunnableC61169d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC61165e f138882a;

        static {
            Covode.recordClassIndex(71774);
        }

        RunnableC61169d(ProgressDialogC61165e eVar) {
            this.f138882a = eVar;
        }

        public final void run() {
            ImageView imageView = this.f138882a.f138872a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressDialogC61165e(Context context) {
        this(context, EnumC61166a.GONE);
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e$e */
    static final class View$OnClickListenerC61170e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC61165e f138883a;

        static {
            Covode.recordClassIndex(71775);
        }

        View$OnClickListenerC61170e(ProgressDialogC61165e eVar) {
            this.f138883a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC61168c cVar = this.f138883a.f138874c;
            if (cVar != null) {
                cVar.mo98605a();
            }
            this.f138883a.dismiss();
            this.f138883a.f138873b = 0;
        }
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f138878h) {
            TextView textView = this.f138876f;
            if (textView != null) {
                textView.setText(charSequence);
            }
            TextView textView2 = this.f138876f;
            if (textView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView2.setVisibility(i);
            }
        }
        this.f138879i = charSequence;
    }

    public final void setProgress(int i) {
        if (i >= this.f138873b) {
            if (this.f138878h) {
                TextView textView = this.f138876f;
                if (textView == null) {
                    C89219l.m154715b();
                }
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                C89219l.m154716b(context, "");
                textView.setText(sb.append(context.getResources().getString(R.string.g1j)).append(i).append("%").toString());
            }
            this.f138873b = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.al0);
        this.f138875e = (ViewGroup) findViewById(R.id.dnb);
        this.f138872a = (ImageView) findViewById(R.id.a0x);
        this.f138876f = (TextView) findViewById(R.id.d_g);
        this.f138877g = (DmtStatusView) findViewById(R.id.e7i);
        int i = C61171f.f138884a[this.f138880j.ordinal()];
        if (i == 1) {
            ImageView imageView = this.f138872a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (i == 2) {
            ImageView imageView2 = this.f138872a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (i == 3 && (viewGroup = this.f138875e) != null) {
            viewGroup.postDelayed(new RunnableC61169d(this), 5000);
        }
        this.f138878h = true;
        if (UIUXBugsExperimentService.m65442b().mo57250a()) {
            TextView textView = this.f138876f;
            if (textView == null) {
                C89219l.m154715b();
            }
            Context context = getContext();
            C89219l.m154716b(context, "");
            textView.setText(context.getResources().getString(R.string.g1j));
        } else {
            setProgress(this.f138873b);
        }
        DmtStatusView dmtStatusView = this.f138877g;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(new DmtStatusView.C17269a(getContext()).mo27397a());
        }
        DmtStatusView dmtStatusView2 = this.f138877g;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo27384f();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f138872a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC61170e(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProgressDialogC61165e(Context context, EnumC61166a aVar) {
        super(context, R.style.zr);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f138880j = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressDialogC61165e(Context context, EnumC61166a aVar, byte b) {
        this(context, aVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
    }
}
