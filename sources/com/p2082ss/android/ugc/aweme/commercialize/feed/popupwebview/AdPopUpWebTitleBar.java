package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar */
public final class AdPopUpWebTitleBar extends FrameLayout {

    /* renamed from: a */
    public static final C37967a f89697a = new C37967a((byte) 0);

    /* renamed from: b */
    private AbstractC37968b f89698b;

    /* renamed from: c */
    private String f89699c;

    /* renamed from: d */
    private HashMap f89700d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar$b */
    public interface AbstractC37968b {
        static {
            Covode.recordClassIndex(45427);
        }

        /* renamed from: a */
        void mo66171a();

        /* renamed from: b */
        void mo66172b();

        /* renamed from: c */
        void mo66173c();

        /* renamed from: d */
        void mo66174d();
    }

    static {
        Covode.recordClassIndex(45425);
    }

    public AdPopUpWebTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo66176a(int i) {
        if (this.f89700d == null) {
            this.f89700d = new HashMap();
        }
        View view = (View) this.f89700d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f89700d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar$a */
    public static final class C37967a {
        static {
            Covode.recordClassIndex(45426);
        }

        private C37967a() {
        }

        public /* synthetic */ C37967a(byte b) {
            this();
        }
    }

    public final String getDefTitle() {
        return this.f89699c;
    }

    public final AbstractC37968b getTitleBarListener() {
        return this.f89698b;
    }

    /* renamed from: b */
    public final void mo66179b() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo66176a(R.id.d47);
        C89219l.m154716b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(0);
        C38615aa.f91244b = true;
    }

    /* renamed from: c */
    public final void mo66181c() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo66176a(R.id.d47);
        C89219l.m154716b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(8);
        C38615aa.f91244b = false;
    }

    /* renamed from: a */
    public final void mo66177a() {
        int a = C34728n.m70946a(12.0d);
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo66176a(R.id.d4i);
        C89219l.m154716b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(0);
        TuxIconView tuxIconView = (TuxIconView) mo66176a(R.id.d4f);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(8);
        ((TuxIconView) mo66176a(R.id.d46)).setPadding(a, a, a, a);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo66176a(R.id.d4m);
        C89219l.m154716b(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.height = C34728n.m70946a(52.5d);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo66176a(R.id.d4m);
        C89219l.m154716b(constraintLayout2, "");
        constraintLayout2.setLayoutParams(layoutParams);
        ((ConstraintLayout) mo66176a(R.id.d4m)).setBackgroundResource(R.drawable.pf);
    }

    public final void setDefTitle(String str) {
        this.f89699c = str;
    }

    public final void setTitleBarListener(AbstractC37968b bVar) {
        this.f89698b = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar$c */
    static final class View$OnClickListenerC37969c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f89701a;

        static {
            Covode.recordClassIndex(45428);
        }

        View$OnClickListenerC37969c(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f89701a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC37968b titleBarListener = this.f89701a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo66172b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar$d */
    static final class View$OnClickListenerC37970d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f89702a;

        static {
            Covode.recordClassIndex(45429);
        }

        View$OnClickListenerC37970d(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f89702a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC37968b titleBarListener = this.f89702a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo66171a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar$e */
    static final class View$OnClickListenerC37971e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f89703a;

        static {
            Covode.recordClassIndex(45430);
        }

        View$OnClickListenerC37971e(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f89703a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC37968b titleBarListener = this.f89703a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo66173c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar$f */
    static final class View$OnClickListenerC37972f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f89704a;

        static {
            Covode.recordClassIndex(45431);
        }

        View$OnClickListenerC37972f(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f89704a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC37968b titleBarListener = this.f89704a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo66171a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebTitleBar$g */
    static final class View$OnClickListenerC37973g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f89705a;

        static {
            Covode.recordClassIndex(45432);
        }

        View$OnClickListenerC37973g(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f89705a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC37968b titleBarListener = this.f89705a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo66174d();
            }
        }
    }

    /* renamed from: b */
    public final void mo66180b(String str) {
        TuxTextView tuxTextView = (TuxTextView) mo66176a(R.id.d4k);
        C89219l.m154716b(tuxTextView, "");
        if (str == null && (str = this.f89699c) == null) {
            str = getContext().getString(R.string.g1y);
        }
        tuxTextView.setText(str);
    }

    /* renamed from: a */
    public final void mo66178a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(R.string.g1y);
        }
        this.f89699c = str;
        TuxTextView tuxTextView = (TuxTextView) mo66176a(R.id.d4k);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f89699c);
    }

    private /* synthetic */ AdPopUpWebTitleBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPopUpWebTitleBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2621);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bj2, this, true);
        MethodCollector.m26664o(2621);
    }
}
