package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.at */
public final class C51695at extends RelativeLayout {

    /* renamed from: i */
    public static final int f119152i = 0;

    /* renamed from: j */
    public static final int f119153j = 1;

    /* renamed from: k */
    public static final int f119154k = 2;

    /* renamed from: l */
    public static final int f119155l = 5;

    /* renamed from: m */
    public static final int f119156m = 7;

    /* renamed from: n */
    public static final int f119157n = 972;

    /* renamed from: o */
    public static final C51696a f119158o = new C51696a((byte) 0);

    /* renamed from: a */
    public View f119159a;

    /* renamed from: b */
    public TextView f119160b;

    /* renamed from: c */
    public SmartAvatarImageView f119161c;

    /* renamed from: d */
    public TextView f119162d;

    /* renamed from: e */
    public FansFollowUserBtn f119163e;

    /* renamed from: f */
    public TextView f119164f;

    /* renamed from: g */
    public boolean f119165g;

    /* renamed from: h */
    public AbstractC89183m<? super Integer, ? super String, C89391z> f119166h;

    private final int getLayoutResId() {
        return R.layout.ml;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.at$a */
    public static final class C51696a {
        static {
            Covode.recordClassIndex(61059);
        }

        private C51696a() {
        }

        public /* synthetic */ C51696a(byte b) {
            this();
        }
    }

    public final FansFollowUserBtn getMFollowUserBtn() {
        return this.f119163e;
    }

    static {
        Covode.recordClassIndex(61058);
    }

    public final void setNeedRecommendReason(boolean z) {
        this.f119165g = z;
    }

    public final void setActionEventListener(AbstractC89183m<? super Integer, ? super String, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        this.f119166h = mVar;
    }

    public final void setMFollowUserBtn(FansFollowUserBtn fansFollowUserBtn) {
        C89219l.m154721d(fansFollowUserBtn, "");
        this.f119163e = fansFollowUserBtn;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.at$b */
    public static final class View$OnClickListenerC51697b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51695at f119167a;

        static {
            Covode.recordClassIndex(61060);
        }

        public View$OnClickListenerC51697b(C51695at atVar) {
            this.f119167a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89183m<? super Integer, ? super String, C89391z> mVar = this.f119167a.f119166h;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C51695at.f119153j), "click_head");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.at$c */
    public static final class View$OnClickListenerC51698c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51695at f119168a;

        static {
            Covode.recordClassIndex(61061);
        }

        public View$OnClickListenerC51698c(C51695at atVar) {
            this.f119168a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89183m<? super Integer, ? super String, C89391z> mVar = this.f119168a.f119166h;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C51695at.f119152i), "click_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.at$d */
    public static final class View$OnClickListenerC51699d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51695at f119169a;

        static {
            Covode.recordClassIndex(61062);
        }

        public View$OnClickListenerC51699d(C51695at atVar) {
            this.f119169a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89183m<? super Integer, ? super String, C89391z> mVar = this.f119169a.f119166h;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C51695at.f119154k), "");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C51695at(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7383);
        this.f119165g = true;
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this);
        C89219l.m154716b(inflate, "");
        this.f119159a = inflate;
        View findViewById = inflate.findViewById(R.id.f6v);
        C89219l.m154716b(findViewById, "");
        this.f119160b = (TextView) findViewById;
        View findViewById2 = this.f119159a.findViewById(R.id.dff);
        C89219l.m154716b(findViewById2, "");
        this.f119161c = (SmartAvatarImageView) findViewById2;
        View findViewById3 = this.f119159a.findViewById(R.id.f03);
        C89219l.m154716b(findViewById3, "");
        this.f119162d = (TextView) findViewById3;
        View findViewById4 = this.f119159a.findViewById(R.id.xm);
        C89219l.m154716b(findViewById4, "");
        this.f119163e = (FansFollowUserBtn) findViewById4;
        View findViewById5 = this.f119159a.findViewById(R.id.dfk);
        C89219l.m154716b(findViewById5, "");
        this.f119164f = (TextView) findViewById5;
        MethodCollector.m26664o(7383);
    }

    public /* synthetic */ C51695at(Context context, byte b) {
        this(context);
    }
}
