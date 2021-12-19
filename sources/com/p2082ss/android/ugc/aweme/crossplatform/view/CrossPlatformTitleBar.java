package com.p2082ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p063m.p064a.p065a.C1261i;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40633f;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar */
public final class CrossPlatformTitleBar extends FrameLayout {

    /* renamed from: a */
    private AbstractC40717a f95332a;

    /* renamed from: b */
    private C40618a f95333b;

    /* renamed from: c */
    private SparseArray f95334c;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$a */
    public interface AbstractC40717a {
        static {
            Covode.recordClassIndex(48565);
        }

        /* renamed from: a */
        void mo69655a();

        /* renamed from: a */
        void mo69656a(View view);

        /* renamed from: b */
        void mo69657b();

        /* renamed from: c */
        void mo69658c();

        /* renamed from: d */
        void mo69659d();

        /* renamed from: e */
        void mo69660e();
    }

    static {
        Covode.recordClassIndex(48564);
    }

    /* renamed from: a */
    private View m82132a(int i) {
        if (this.f95334c == null) {
            this.f95334c = new SparseArray();
        }
        View view = (View) this.f95334c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f95334c.put(i, findViewById);
        return findViewById;
    }

    public final C40618a getCrossPlatformParams() {
        return this.f95333b;
    }

    public final AbstractC40717a getTitleWrap() {
        return this.f95332a;
    }

    /* renamed from: c */
    public final void mo69896c() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m82132a(R.id.a6v);
        C89219l.m154716b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo69897d() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m82132a(R.id.a6v);
        C89219l.m154716b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo69893a() {
        C40633f fVar;
        setBackgroundColor(0);
        View a = m82132a(R.id.rv);
        C89219l.m154716b(a, "");
        a.setVisibility(8);
        C40618a aVar = this.f95333b;
        if (!(aVar == null || (fVar = aVar.f95071d) == null || !fVar.f95162G)) {
            View a2 = m82132a(R.id.rv);
            C89219l.m154716b(a2, "");
            a2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) m82132a(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        ((TuxIconView) m82132a(R.id.a71)).setIconRes(R.raw.icon_arrow_left_ltr);
        ((TuxIconView) m82132a(R.id.a71)).setTintColorRes(R.attr.m);
        ((TuxIconView) m82132a(R.id.a71)).mo37658a(true);
        ((AutoRTLImageView) m82132a(R.id.a6v)).setImageResource(2131231848);
        ((AutoRTLImageView) m82132a(R.id.yv)).setImageResource(2131231855);
        ((TuxIconView) m82132a(R.id.dij)).setIconRes(R.raw.icon_flag);
        ((TuxIconView) m82132a(R.id.dij)).setTintColorRes(R.attr.m);
        ((TuxIconView) m82132a(R.id.dij)).mo37658a(true);
        ((AutoRTLImageView) m82132a(R.id.dkd)).setImageResource(2131231850);
    }

    /* renamed from: b */
    public final void mo69895b() {
        C40618a aVar = this.f95333b;
        if (aVar != null) {
            if (aVar.f95071d.f95173f != -2) {
                setBackgroundColor(aVar.f95071d.f95173f);
            } else {
                setBackgroundResource(R.drawable.b15);
            }
            if (aVar.f95071d.f95175h != -2) {
                ((TuxTextView) m82132a(R.id.title)).setTextColor(aVar.f95071d.f95175h);
                Context context = getContext();
                if (context != null) {
                    C1261i a = C1261i.m4015a(context.getResources(), R.drawable.a3r, context.getTheme());
                    if (a != null) {
                        a.setTint(aVar.f95071d.f95175h);
                    }
                    ((TuxIconView) m82132a(R.id.a71)).setImageDrawable(a);
                }
            } else {
                ((TuxIconView) m82132a(R.id.a71)).setIconRes(R.raw.icon_arrow_left_ltr);
            }
            View a2 = m82132a(R.id.rv);
            C89219l.m154716b(a2, "");
            a2.setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) m82132a(R.id.title);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            ((AutoRTLImageView) m82132a(R.id.a6v)).setImageResource(2131231849);
            ((AutoRTLImageView) m82132a(R.id.yv)).setImageResource(2131231857);
            ((TuxIconView) m82132a(R.id.dij)).setIconRes(R.raw.icon_exclamation_mark_triangle_fill);
            ((AutoRTLImageView) m82132a(R.id.dkd)).setImageResource(2131231851);
        }
    }

    public final void setTitleWrap(AbstractC40717a aVar) {
        this.f95332a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$c */
    public static final class View$OnClickListenerC40719c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f95336a;

        static {
            Covode.recordClassIndex(48567);
        }

        View$OnClickListenerC40719c(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f95336a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC40717a titleWrap = this.f95336a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo69655a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$d */
    public static final class View$OnClickListenerC40720d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f95337a;

        static {
            Covode.recordClassIndex(48568);
        }

        View$OnClickListenerC40720d(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f95337a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC40717a titleWrap = this.f95337a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo69660e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$e */
    public static final class View$OnClickListenerC40721e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f95338a;

        static {
            Covode.recordClassIndex(48569);
        }

        View$OnClickListenerC40721e(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f95338a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC40717a titleWrap = this.f95338a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo69659d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$f */
    public static final class View$OnClickListenerC40722f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f95339a;

        static {
            Covode.recordClassIndex(48570);
        }

        View$OnClickListenerC40722f(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f95339a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC40717a titleWrap = this.f95339a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo69657b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$g */
    public static final class View$OnClickListenerC40723g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f95340a;

        static {
            Covode.recordClassIndex(48571);
        }

        View$OnClickListenerC40723g(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f95340a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC40717a titleWrap = this.f95340a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo69658c();
            }
        }
    }

    public final void setBackgroundAlpha(float f) {
        View a = m82132a(R.id.rv);
        C89219l.m154716b(a, "");
        a.setAlpha(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$b */
    public static final class View$OnClickListenerC40718b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f95335a;

        static {
            Covode.recordClassIndex(48566);
        }

        View$OnClickListenerC40718b(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f95335a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC40717a titleWrap = this.f95335a.getTitleWrap();
            if (titleWrap != null) {
                C89219l.m154716b(view, "");
                titleWrap.mo69656a(view);
            }
        }
    }

    public final void setTitle(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) m82132a(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo69894a(boolean z) {
        int i;
        TuxIconView tuxIconView = (TuxIconView) m82132a(R.id.dis);
        C89219l.m154716b(tuxIconView, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
    }

    public final void setCrossPlatformParams(C40618a aVar) {
        String str;
        this.f95333b = aVar;
        if (aVar != null) {
            TuxTextView tuxTextView = (TuxTextView) m82132a(R.id.title);
            C89219l.m154716b(tuxTextView, "");
            if (TextUtils.isEmpty(aVar.f95071d.f95172e)) {
                str = getContext().getString(R.string.g1y);
            } else {
                str = aVar.f95071d.f95172e;
            }
            tuxTextView.setText(str);
            ((AutoRTLImageView) m82132a(R.id.dkd)).setOnClickListener(new View$OnClickListenerC40718b(this));
            ((TuxIconView) m82132a(R.id.a71)).setOnClickListener(new View$OnClickListenerC40719c(this));
            ((AutoRTLImageView) m82132a(R.id.a6v)).setOnClickListener(new View$OnClickListenerC40720d(this));
            if (aVar.f95071d.f95170c) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m82132a(R.id.dkd);
                C89219l.m154716b(autoRTLImageView, "");
                autoRTLImageView.setVisibility(8);
            }
            ((AutoRTLImageView) m82132a(R.id.yv)).setOnClickListener(new View$OnClickListenerC40721e(this));
            if (TextUtils.equals(aVar.f95071d.f95177j, "1")) {
                TuxIconView tuxIconView = (TuxIconView) m82132a(R.id.a71);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(8);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) m82132a(R.id.a71);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
            }
            if (aVar.f95071d.f95173f != -2) {
                TuxTextView tuxTextView2 = (TuxTextView) m82132a(R.id.title);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setBackground(new ColorDrawable(aVar.f95071d.f95173f));
                setBackgroundColor(aVar.f95071d.f95173f);
            }
            if (aVar.f95071d.f95175h != -2) {
                ((TuxTextView) m82132a(R.id.title)).setTextColor(aVar.f95071d.f95175h);
                Context context = getContext();
                if (context != null) {
                    C1261i a = C1261i.m4015a(context.getResources(), R.drawable.a3r, context.getTheme());
                    if (a != null) {
                        a.setTint(aVar.f95071d.f95175h);
                    }
                    ((TuxIconView) m82132a(R.id.a71)).setImageDrawable(a);
                }
            }
            if (aVar.f95071d.f95170c) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) m82132a(R.id.yv);
                C89219l.m154716b(autoRTLImageView2, "");
                autoRTLImageView2.setVisibility(8);
            }
            if (aVar.f95071d.f95171d) {
                if (AwemeService.m70060b().mo60690d(aVar.f95068a.f95061j) != null) {
                    TuxIconView tuxIconView3 = (TuxIconView) m82132a(R.id.dij);
                    C89219l.m154716b(tuxIconView3, "");
                    tuxIconView3.setVisibility(0);
                    ((TuxIconView) m82132a(R.id.dij)).setOnClickListener(new View$OnClickListenerC40722f(this));
                }
                AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) m82132a(R.id.yv);
                C89219l.m154716b(autoRTLImageView3, "");
                autoRTLImageView3.setVisibility(8);
            }
            if (aVar.f95071d.f95159D == 2) {
                AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) m82132a(R.id.yv);
                C89219l.m154716b(autoRTLImageView4, "");
                autoRTLImageView4.setVisibility(0);
                TuxIconView tuxIconView4 = (TuxIconView) m82132a(R.id.dij);
                C89219l.m154716b(tuxIconView4, "");
                tuxIconView4.setVisibility(8);
            } else if (aVar.f95071d.f95159D == 1) {
                AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) m82132a(R.id.yv);
                C89219l.m154716b(autoRTLImageView5, "");
                autoRTLImageView5.setVisibility(8);
                TuxIconView tuxIconView5 = (TuxIconView) m82132a(R.id.dij);
                C89219l.m154716b(tuxIconView5, "");
                tuxIconView5.setVisibility(0);
            }
            View a2 = m82132a(R.id.dkd);
            C89219l.m154716b(a2, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(a2, "");
            if (!TextUtils.isEmpty(aVar.f95068a.f95066o)) {
                TuxIconView tuxIconView6 = (TuxIconView) m82132a(R.id.dis);
                C89219l.m154716b(tuxIconView6, "");
                tuxIconView6.setVisibility(0);
                ((TuxIconView) m82132a(R.id.dis)).setOnClickListener(new View$OnClickListenerC40723g(this));
                TuxIconView tuxIconView7 = (TuxIconView) m82132a(R.id.dij);
                C89219l.m154716b(tuxIconView7, "");
                tuxIconView7.setVisibility(8);
                AutoRTLImageView autoRTLImageView6 = (AutoRTLImageView) m82132a(R.id.yv);
                C89219l.m154716b(autoRTLImageView6, "");
                autoRTLImageView6.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossPlatformTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(6930);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.v_, this, true);
        setBackgroundResource(R.drawable.b15);
        setMinimumHeight((int) getResources().getDimension(R.dimen.tn));
        MethodCollector.m26664o(6930);
    }
}
