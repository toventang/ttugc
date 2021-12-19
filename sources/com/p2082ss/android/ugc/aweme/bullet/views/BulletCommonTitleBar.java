package com.p2082ss.android.ugc.aweme.bullet.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p063m.p064a.p065a.C1261i;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16733k;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar */
public final class BulletCommonTitleBar extends FrameLayout {

    /* renamed from: a */
    private AbstractC35304a f83328a;

    /* renamed from: b */
    private HashMap f83329b;

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$a */
    public interface AbstractC35304a {
        static {
            Covode.recordClassIndex(42472);
        }

        /* renamed from: a */
        void mo62092a();

        /* renamed from: a */
        void mo62093a(View view);

        /* renamed from: b */
        void mo62094b();

        /* renamed from: c */
        void mo62095c();

        /* renamed from: d */
        void mo62096d();
    }

    static {
        Covode.recordClassIndex(42471);
    }

    /* renamed from: a */
    public final View mo62156a(int i) {
        if (this.f83329b == null) {
            this.f83329b = new HashMap();
        }
        View view = (View) this.f83329b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83329b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AbstractC35304a getTitleWrap() {
        return this.f83328a;
    }

    public final void setTitleWrap(AbstractC35304a aVar) {
        this.f83328a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$b */
    public static final class View$OnClickListenerC35305b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f83330a;

        static {
            Covode.recordClassIndex(42473);
        }

        View$OnClickListenerC35305b(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f83330a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC35304a titleWrap = this.f83330a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo62094b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$d */
    public static final class View$OnClickListenerC35307d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f83332a;

        static {
            Covode.recordClassIndex(42475);
        }

        View$OnClickListenerC35307d(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f83332a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC35304a titleWrap = this.f83332a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo62092a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$e */
    public static final class View$OnClickListenerC35308e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f83333a;

        static {
            Covode.recordClassIndex(42476);
        }

        View$OnClickListenerC35308e(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f83333a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC35304a titleWrap = this.f83333a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo62096d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$f */
    public static final class View$OnClickListenerC35309f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f83334a;

        static {
            Covode.recordClassIndex(42477);
        }

        View$OnClickListenerC35309f(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f83334a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC35304a titleWrap = this.f83334a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo62095c();
            }
        }
    }

    public final void setBackgroundAlpha(float f) {
        View a = mo62156a(R.id.rv);
        C89219l.m154716b(a, "");
        a.setAlpha(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$c */
    public static final class View$OnClickListenerC35306c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f83331a;

        static {
            Covode.recordClassIndex(42474);
        }

        View$OnClickListenerC35306c(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f83331a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC35304a titleWrap = this.f83331a.getTitleWrap();
            if (titleWrap != null) {
                C89219l.m154716b(view, "");
                titleWrap.mo62093a(view);
            }
        }
    }

    public final void setTitle(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        TuxTextView tuxTextView = (TuxTextView) mo62156a(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo62157a(C16721b bVar) {
        String b;
        int i;
        int i2;
        if (bVar != null) {
            TuxTextView tuxTextView = (TuxTextView) mo62156a(R.id.title);
            C89219l.m154716b(tuxTextView, "");
            if (TextUtils.isEmpty(bVar.f39931g.mo26550b())) {
                Context context = getContext();
                C89219l.m154716b(context, "");
                Resources resources = context.getResources();
                if (resources != null) {
                    b = resources.getString(R.string.g1y);
                } else {
                    b = null;
                }
            } else {
                b = bVar.f39931g.mo26550b();
            }
            tuxTextView.setText(b);
            ((AutoRTLImageView) mo62156a(R.id.dkd)).setOnClickListener(new View$OnClickListenerC35306c(this));
            ((AutoRTLImageView) mo62156a(R.id.a71)).setOnClickListener(new View$OnClickListenerC35307d(this));
            ((AutoRTLImageView) mo62156a(R.id.a6v)).setOnClickListener(new View$OnClickListenerC35308e(this));
            if (C89219l.m154714a(bVar.f39922M.mo26550b(), (Object) true)) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo62156a(R.id.dkd);
                C89219l.m154716b(autoRTLImageView, "");
                autoRTLImageView.setVisibility(8);
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) mo62156a(R.id.yv);
                C89219l.m154716b(autoRTLImageView2, "");
                autoRTLImageView2.setVisibility(8);
            }
            ((AutoRTLImageView) mo62156a(R.id.yv)).setOnClickListener(new View$OnClickListenerC35309f(this));
            if (C89219l.m154714a((Object) bVar.f39943s.mo26550b(), (Object) true)) {
                AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) mo62156a(R.id.a71);
                C89219l.m154716b(autoRTLImageView3, "");
                autoRTLImageView3.setVisibility(0);
            }
            C16746t b2 = bVar.f39928d.mo26550b();
            if (!(b2 == null || (i2 = b2.f39989a) == -2)) {
                TuxTextView tuxTextView2 = (TuxTextView) mo62156a(R.id.title);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setBackground(new ColorDrawable(i2));
                setBackgroundColor(i2);
            }
            C16746t b3 = bVar.f39932h.mo26550b();
            if (!(b3 == null || (i = b3.f39989a) == -2)) {
                ((TuxTextView) mo62156a(R.id.title)).setTextColor(i);
                Context context2 = getContext();
                if (context2 != null) {
                    C1261i a = C1261i.m4015a(context2.getResources(), R.drawable.a3r, context2.getTheme());
                    if (a != null) {
                        a.setTint(i);
                    }
                    ((AutoRTLImageView) mo62156a(R.id.a71)).setImageDrawable(a);
                }
            }
            if (C89219l.m154714a(AbstractC16741q.m31062a(bVar, "show_report"), (Object) true)) {
                if (AwemeService.m70060b().mo60690d((String) AbstractC16741q.m31062a(bVar, "aweme_id")) != null) {
                    AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) mo62156a(R.id.dij);
                    C89219l.m154716b(autoRTLImageView4, "");
                    autoRTLImageView4.setVisibility(0);
                    ((AutoRTLImageView) mo62156a(R.id.dij)).setOnClickListener(new View$OnClickListenerC35305b(this));
                }
                AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) mo62156a(R.id.yv);
                C89219l.m154716b(autoRTLImageView5, "");
                autoRTLImageView5.setVisibility(8);
            }
            if (bVar.f39933i.mo26550b() == EnumC16733k.SHARE) {
                AutoRTLImageView autoRTLImageView6 = (AutoRTLImageView) mo62156a(R.id.yv);
                C89219l.m154716b(autoRTLImageView6, "");
                autoRTLImageView6.setVisibility(0);
                AutoRTLImageView autoRTLImageView7 = (AutoRTLImageView) mo62156a(R.id.dij);
                C89219l.m154716b(autoRTLImageView7, "");
                autoRTLImageView7.setVisibility(8);
            } else if (bVar.f39933i.mo26550b() == EnumC16733k.REPORT) {
                AutoRTLImageView autoRTLImageView8 = (AutoRTLImageView) mo62156a(R.id.yv);
                C89219l.m154716b(autoRTLImageView8, "");
                autoRTLImageView8.setVisibility(8);
                AutoRTLImageView autoRTLImageView9 = (AutoRTLImageView) mo62156a(R.id.dij);
                C89219l.m154716b(autoRTLImageView9, "");
                autoRTLImageView9.setVisibility(0);
            }
            mo62156a(R.id.dkd);
            C89219l.m154721d(bVar, "");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BulletCommonTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(7855);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ma, this, true);
        setBackgroundResource(R.drawable.u4);
        setMinimumHeight((int) getResources().getDimension(R.dimen.tn));
        MethodCollector.m26664o(7855);
    }
}
