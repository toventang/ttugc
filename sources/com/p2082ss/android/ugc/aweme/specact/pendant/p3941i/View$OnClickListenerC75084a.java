package com.p2082ss.android.ugc.aweme.specact.pendant.p3941i;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.pendant.C62766b;
import com.p2082ss.android.ugc.aweme.pendant.OptimizedLottieAnimationView;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3930a.p3931a.C74963a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3932b.C74973a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3933c.C74982a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3934d.C74993b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3935e.C75003b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75062c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75067g;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75068h;
import com.p2082ss.android.ugc.aweme.specact.pendant.views.C75088a;
import com.p2082ss.android.ugc.aweme.specact.pendant.views.C75098b;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.i.a */
public final class View$OnClickListenerC75084a implements View.OnClickListener, AbstractC75020a {

    /* renamed from: f */
    public static final C75085a f168745f = new C75085a((byte) 0);

    /* renamed from: a */
    public C75098b f168746a;

    /* renamed from: b */
    public View.OnClickListener f168747b;

    /* renamed from: c */
    public boolean f168748c;

    /* renamed from: d */
    public UgAwemeActivitySetting f168749d;

    /* renamed from: e */
    public boolean f168750e;

    /* renamed from: g */
    private ViewGroup f168751g;

    /* renamed from: h */
    private C75088a f168752h;

    /* renamed from: i */
    private int f168753i;

    /* renamed from: j */
    private boolean f168754j;

    /* renamed from: k */
    private int f168755k;

    /* renamed from: l */
    private boolean f168756l;

    static {
        Covode.recordClassIndex(87956);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.i.a$a */
    public static final class C75085a {
        static {
            Covode.recordClassIndex(87957);
        }

        private C75085a() {
        }

        public /* synthetic */ C75085a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: g */
    public final boolean mo118144g() {
        return this.f168750e;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: j */
    public final boolean mo118147j() {
        return this.f168754j;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final void mo118131a(boolean z, boolean z2) {
        C75098b bVar;
        if (mo118132a()) {
            int i = 0;
            if (z2) {
                this.f168755k = 0;
            }
            if (this.f168754j != z || this.f168748c != z2) {
                this.f168754j = z;
                this.f168748c = z2;
                if (z2) {
                    this.f168750e = false;
                }
                int i2 = this.f168753i;
                int i3 = 8;
                if (i2 == 0) {
                    C75088a aVar = this.f168752h;
                    if (aVar != null) {
                        if (z) {
                            i3 = 0;
                        }
                        aVar.setVisibility(i3);
                    }
                    if (this.f168748c && mo118142e()) {
                        C75088a aVar2 = this.f168752h;
                        if (aVar2 != null) {
                            aVar2.mo118194a();
                        }
                        this.f168756l = false;
                    }
                } else if (i2 == 1 && (bVar = this.f168746a) != null) {
                    if (!z) {
                        i = 8;
                    }
                    bVar.setVisibility(i);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final void mo118130a(boolean z, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f168753i = z ? 1 : 0;
        this.f168754j = true;
        this.f168750e = false;
        this.f168756l = false;
        this.f168755k = 0;
        int i = 8;
        if (z) {
            C75098b bVar = this.f168746a;
            if (bVar != null) {
                bVar.mo118214a();
            }
            C75088a aVar = this.f168752h;
            if (aVar != null) {
                aVar.setVisibility(8);
            }
            C75098b bVar2 = this.f168746a;
            if (bVar2 != null) {
                bVar2.setVisibility(0);
            }
        } else {
            C75098b bVar3 = this.f168746a;
            if (bVar3 != null) {
                bVar3.setVisibility(8);
            }
            C75088a aVar2 = this.f168752h;
            if (aVar2 != null) {
                aVar2.setVisibility(0);
            }
            C75088a aVar3 = this.f168752h;
            if (aVar3 != null) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                aVar3.f168778j = str;
                aVar3.f168779k = str2;
                if (!aVar3.f168769a) {
                    aVar3.f168780l = true;
                    aVar3.getSmartImageView().setVisibility(0);
                    aVar3.getSmallSmartImageView().setVisibility(8);
                    aVar3.mo118195a(80.0f, 80.0f);
                    aVar3.getSmartImageView().setImageURI(str);
                } else {
                    aVar3.getSmartImageView().setVisibility(8);
                    aVar3.getSmallSmartImageView().setVisibility(0);
                    aVar3.mo118195a(32.0f, 107.0f);
                    aVar3.getSmallSmartImageView().setImageURI(str2);
                }
                ImageView closeView = aVar3.getCloseView();
                if (aVar3.f168780l) {
                    i = 0;
                }
                closeView.setVisibility(i);
                aVar3.getCloseView().setOnClickListener(new C75088a.View$OnClickListenerC75090b(aVar3));
                aVar3.setBackground(null);
            }
        }
        if (C75062c.m131824a(C75062c.m131823a())) {
            mo118131a(false, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: d */
    public final boolean mo118141d() {
        if (this.f168753i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final Context m131851k() {
        Context context;
        ViewGroup viewGroup = this.f168751g;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            return C17867d.m33078a();
        }
        return context;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: e */
    public final boolean mo118142e() {
        C75088a aVar = this.f168752h;
        if (aVar == null || !aVar.getStaticPendantIsFold()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: f */
    public final void mo118143f() {
        C75098b bVar;
        if (mo118141d() && (bVar = this.f168746a) != null) {
            bVar.mo118214a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: h */
    public final void mo118145h() {
        C75088a aVar = this.f168752h;
        if (aVar != null) {
            aVar.setVisibility(0);
        }
        this.f168754j = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: i */
    public final void mo118146i() {
        C75088a aVar = this.f168752h;
        if (aVar != null) {
            aVar.setVisibility(8);
        }
        this.f168754j = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final boolean mo118132a() {
        if (this.f168751g == null) {
            return false;
        }
        C75098b bVar = this.f168746a;
        if (bVar != null && bVar.getParent() != null) {
            return true;
        }
        C75088a aVar = this.f168752h;
        if (aVar == null || aVar.getParent() == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: b */
    public final void mo118134b() {
        C75098b bVar;
        if (mo118132a() && mo118141d() && (bVar = this.f168746a) != null) {
            bVar.f168798a = 0;
            bVar.getProgressBarTimerView().setVisibility(4);
            OptimizedLottieAnimationView lottieView = bVar.getLottieView();
            lottieView.mo5827a(0, 64);
            lottieView.setRepeatCount(0);
            lottieView.setRepeatMode(1);
            lottieView.mo5828a(new C75098b.C75107i());
            lottieView.mo5826a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.i.a$b */
    public static final class C75086b implements C75088a.AbstractC75089a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75084a f168757a;

        static {
            Covode.recordClassIndex(87958);
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.views.C75088a.AbstractC75089a
        /* renamed from: a */
        public final void mo118187a() {
            String aid;
            if (this.f168757a.mo118132a()) {
                if (C75062c.m131823a() == null) {
                    aid = "";
                } else {
                    Aweme a = C75062c.m131823a();
                    if (a == null) {
                        C89219l.m154715b();
                    }
                    aid = a.getAid();
                }
                C89219l.m154716b(aid, "");
                boolean z = this.f168757a.f168748c;
                C75068h.m131835a("finished", "non_tracker", 0, aid, z ? 1 : 0, "close", this.f168757a.f168749d);
                this.f168757a.f168750e = true;
                this.f168757a.mo118131a(false, false);
                C62766b.C62768b.f142302a.mo100738b();
            }
        }

        C75086b(View$OnClickListenerC75084a aVar) {
            this.f168757a = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: c */
    public final void mo118138c() {
        MethodCollector.m26663i(11408);
        if (mo118132a()) {
            this.f168751g = null;
            C75098b bVar = this.f168746a;
            if (bVar == null) {
                C89219l.m154715b();
            }
            if (bVar.getParent() != null) {
                C75098b bVar2 = this.f168746a;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                ViewParent parent = bVar2.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f168746a);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.m26664o(11408);
                    throw nullPointerException;
                }
            }
            C75088a aVar = this.f168752h;
            if (aVar == null) {
                C89219l.m154715b();
            }
            if (aVar.getParent() != null) {
                C75088a aVar2 = this.f168752h;
                if (aVar2 == null) {
                    C89219l.m154715b();
                }
                ViewParent parent2 = aVar2.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(this.f168752h);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.m26664o(11408);
                    throw nullPointerException2;
                }
            }
        }
        this.f168746a = null;
        this.f168752h = null;
        this.f168754j = false;
        MethodCollector.m26664o(11408);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final void mo118126a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        this.f168749d = ugAwemeActivitySetting;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final boolean mo118133a(int i) {
        if (i <= 0 || i > this.f168755k + 1) {
            return false;
        }
        return true;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        View.OnClickListener onClickListener = this.f168747b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: b */
    public final void mo118135b(String str) {
        ViewGroup.LayoutParams layoutParams;
        int b;
        C89219l.m154721d(str, "");
        C75088a aVar = this.f168752h;
        if (aVar != null) {
            C89219l.m154721d(str, "");
            C74963a aVar2 = aVar.f168770b;
            int i = 1;
            if (aVar2 == null || !aVar2.f168535b) {
                if (aVar.f168772d == null) {
                    aVar.f168771c = aVar.findViewById(R.id.e08);
                    aVar.f168772d = (TextView) aVar.findViewById(R.id.e09);
                }
                TextView textView = aVar.f168772d;
                if (textView != null) {
                    textView.setText(str);
                }
                View view = aVar.f168771c;
                ViewGroup.LayoutParams layoutParams2 = null;
                if (view != null) {
                    layoutParams = view.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (str.length() <= 11) {
                    b = (int) C13628n.m24520b(aVar.getContext(), 80.0f);
                } else {
                    b = (int) C13628n.m24520b(aVar.getContext(), 300.0f);
                    i = 0;
                }
                if (layoutParams != null) {
                    layoutParams.width = b;
                }
                View view2 = aVar.f168771c;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                }
                TextView textView2 = aVar.f168772d;
                if (textView2 != null) {
                    layoutParams2 = textView2.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.gravity = i;
                TextView textView3 = aVar.f168772d;
                if (textView3 != null) {
                    textView3.setLayoutParams(layoutParams3);
                }
                View view3 = aVar.f168771c;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                aVar.f168770b = new C74963a(aVar, view3);
                C74963a aVar3 = aVar.f168770b;
                if (aVar3 != null) {
                    aVar3.f168536c.setCanDrag(false);
                    aVar3.f168537d.setVisibility(4);
                    aVar3.f168537d.postDelayed(new C74963a.RunnableC74966c(aVar3), 100);
                }
                C39162r.m79460a("widget_bubble2_show", new C33744d().mo59983a(StringSet.type, "tapme_short_inform").f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: d */
    public final void mo118140d(String str) {
        C89219l.m154721d(str, "");
        C75098b bVar = this.f168746a;
        if (bVar != null) {
            C89219l.m154721d(str, "");
            if (bVar.f168804g == null) {
                bVar.f168801d = bVar.findViewById(R.id.ch3);
                bVar.f168802e = bVar.findViewById(R.id.ch1);
                bVar.f168803f = bVar.findViewById(R.id.ch2);
                bVar.f168804g = (TextView) bVar.findViewById(R.id.ch4);
                bVar.f168805h = bVar.findViewById(R.id.a76);
                View view = bVar.f168805h;
                if (view != null) {
                    view.setOnClickListener(new C75098b.View$OnClickListenerC75112n(bVar));
                }
            }
            TextView textView = bVar.f168804g;
            if (textView != null) {
                textView.setText(str);
            }
            View view2 = bVar.f168801d;
            if (view2 == null) {
                C89219l.m154715b();
            }
            View view3 = bVar.f168802e;
            if (view3 == null) {
                C89219l.m154715b();
            }
            View view4 = bVar.f168803f;
            if (view4 == null) {
                C89219l.m154715b();
            }
            bVar.f168808k = new C74993b(bVar, view2, view3, view4);
            C74993b bVar2 = bVar.f168808k;
            if (bVar2 != null) {
                bVar2.f168591d.setVisibility(4);
                bVar2.f168591d.postDelayed(new C74993b.RunnableC74996c(bVar2), 1000);
            }
            C39162r.m79460a("widget_bubble2_show", new C33744d().mo59983a(StringSet.type, "watch_video").f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final void mo118125a(ViewGroup viewGroup) {
        int i;
        MethodCollector.m26663i(11399);
        C89219l.m154721d(viewGroup, "");
        if (mo118132a()) {
            MethodCollector.m26664o(11399);
            return;
        }
        this.f168751g = viewGroup;
        if (this.f168746a == null) {
            C75098b bVar = new C75098b(m131851k(), (byte) 0);
            bVar.setOnClickListener(this);
            this.f168746a = bVar;
        }
        if (this.f168752h == null) {
            C75088a aVar = new C75088a(m131851k(), (byte) 0);
            aVar.setOnClickListener(this);
            aVar.setSubViewListener(new C75086b(this));
            this.f168752h = aVar;
        }
        C75098b bVar2 = this.f168746a;
        if (bVar2 == null) {
            C89219l.m154715b();
        }
        if (bVar2.getParent() != null) {
            C75098b bVar3 = this.f168746a;
            if (bVar3 == null) {
                C89219l.m154715b();
            }
            ViewParent parent = bVar3.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f168746a);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(11399);
                throw nullPointerException;
            }
        }
        C75088a aVar2 = this.f168752h;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        if (aVar2.getParent() != null) {
            C75088a aVar3 = this.f168752h;
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            ViewParent parent2 = aVar3.getParent();
            if (parent2 != null) {
                ((ViewGroup) parent2).removeView(this.f168752h);
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(11399);
                throw nullPointerException2;
            }
        }
        if ((viewGroup instanceof FrameLayout) || (viewGroup instanceof RelativeLayout)) {
            viewGroup.addView(this.f168746a);
            viewGroup.addView(this.f168752h);
        }
        int c = C13628n.m24522c(m131851k(), ((float) C13628n.m24525e(m131851k())) + 0.0f);
        if (C75067g.m131833a()) {
            i = 80;
        } else {
            i = 70;
        }
        int i2 = c + i;
        C75098b bVar4 = this.f168746a;
        if (bVar4 == null) {
            C89219l.m154715b();
        }
        ViewGroup.LayoutParams layoutParams = bVar4.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) C13628n.m24520b(m131851k(), (float) i2);
        }
        C75098b bVar5 = this.f168746a;
        if (bVar5 == null) {
            C89219l.m154715b();
        }
        bVar5.setLayoutParams(layoutParams);
        C75088a aVar4 = this.f168752h;
        if (aVar4 == null) {
            C89219l.m154715b();
        }
        ViewGroup.LayoutParams layoutParams2 = aVar4.getLayoutParams();
        layoutParams2.height = -2;
        layoutParams2.width = -2;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).topMargin = (int) C13628n.m24520b(m131851k(), (float) i2);
        }
        C75088a aVar5 = this.f168752h;
        if (aVar5 == null) {
            C89219l.m154715b();
        }
        aVar5.setLayoutParams(layoutParams2);
        MethodCollector.m26664o(11399);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: c */
    public final void mo118139c(String str) {
        C89219l.m154721d(str, "");
        C75098b bVar = this.f168746a;
        if (bVar != null) {
            C89219l.m154721d(str, "");
            if (bVar.f168800c == null) {
                bVar.f168799b = bVar.findViewById(R.id.e08);
                bVar.f168800c = (TextView) bVar.findViewById(R.id.e09);
            }
            TextView textView = bVar.f168800c;
            if (textView != null) {
                textView.setText(str);
            }
            View view = bVar.f168799b;
            if (view == null) {
                C89219l.m154715b();
            }
            bVar.f168807j = new C74973a(bVar, view);
            C74973a aVar = bVar.f168807j;
            if (aVar != null) {
                aVar.f168557c.setPivotX(C74973a.m131624a(aVar.f168557c.getContext(), 20.0f));
                aVar.f168557c.setPivotY(C74973a.m131624a(aVar.f168557c.getContext(), 25.0f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f168557c, "scaleX", 1.3f, 1.0f), ObjectAnimator.ofFloat(aVar.f168557c, "scaleY", 1.3f, 1.0f));
                animatorSet.setDuration(297L);
                animatorSet.addListener(new C74973a.C74976c(aVar));
                animatorSet.setTarget(aVar.f168557c);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(aVar.f168557c, "scaleX", 0.0f, 1.3f), ObjectAnimator.ofFloat(aVar.f168557c, "scaleY", 0.0f, 1.3f));
                animatorSet2.setDuration(528L);
                animatorSet2.addListener(new C74973a.C74978d(aVar, animatorSet));
                animatorSet2.setTarget(aVar.f168557c);
                aVar.f168557c.setVisibility(0);
                animatorSet2.start();
                aVar.f168555a = false;
            }
            C39162r.m79460a("widget_bubble2_show", new C33744d().mo59983a(StringSet.type, "tapme_timer_short_inform").f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final void mo118127a(String str) {
        C75098b bVar;
        AnimatorSet animatorSet;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("canival_ratio", 1);
                boolean optBoolean = jSONObject.optBoolean("show_points");
                int optInt2 = jSONObject.optInt("display_amount");
                LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
                C89219l.m154716b(localTestApi, "");
                localTestApi.getSpecActDebugService().mo106976a("SpecPendant", "onTaskDoneResult: showPoints:" + optBoolean + "  ratio:" + optInt + "  displayAmount:" + optInt2);
                if (optBoolean && optInt2 > 0 && (bVar = this.f168746a) != null) {
                    Animator animator = bVar.f168809l;
                    if (animator != null) {
                        animator.cancel();
                    }
                    String concat = "+".concat(String.valueOf(optInt2));
                    if (optInt > 1) {
                        String str2 = "+" + (optInt2 / optInt);
                        bVar.getBonusTextView().setTranslationY(bVar.mo118213a(2.0f));
                        bVar.getBonusTextView().setVisibility(0);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(bVar.getBonusTextView(), "translationY", bVar.mo118213a(7.0f)).setDuration(333L);
                        C89219l.m154716b(duration, "");
                        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(bVar.getBonusTextView(), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", bVar.mo118213a(7.0f), bVar.mo118213a(6.0f))).setDuration(133L);
                        C89219l.m154716b(duration2, "");
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playSequentially(duration, duration2);
                        animatorSet2.addListener(new C75098b.C75108j(bVar, str2));
                        Animator c = bVar.mo118216c();
                        c.addListener(new C75098b.C75109k(bVar, concat));
                        animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(animatorSet2, c);
                    } else {
                        bVar.getBonusTextView().setTranslationY(bVar.mo118213a(6.0f));
                        bVar.getBonusTextView().setScaleY(0.0f);
                        bVar.getBonusTextView().setVisibility(0);
                        Animator c2 = bVar.mo118216c();
                        c2.addListener(new C75098b.C75110l(bVar, concat));
                        animatorSet = new AnimatorSet();
                        animatorSet.play(c2);
                    }
                    bVar.f168809l = animatorSet;
                    Animator animator2 = bVar.f168809l;
                    if (animator2 != null) {
                        animator2.addListener(new C75098b.C75106h(bVar));
                        animator2.start();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: b */
    public final void mo118137b(boolean z, boolean z2) {
        if ((!z || !z2) && !mo118141d()) {
            mo118146i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final void mo118124a(int i, int i2) {
        C75098b bVar;
        if (mo118132a() && mo118141d() && (bVar = this.f168746a) != null && i >= 0 && i2 >= 0 && i <= i2 && bVar.f168798a <= i) {
            bVar.getProgressBarTimerView().setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat((float) bVar.f168798a, (float) i);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(1000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new C75098b.C75113o(bVar, i2));
            bVar.f168798a = i;
            ofFloat.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: b */
    public final void mo118136b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C75088a aVar = this.f168752h;
        if (aVar != null) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C74982a aVar2 = aVar.f168781m;
            if (aVar2 == null || !aVar2.f168569b) {
                aVar.f168773e = aVar.findViewById(R.id.ch3);
                aVar.f168774f = aVar.findViewById(R.id.ch1);
                aVar.f168775g = aVar.findViewById(R.id.ch2);
                aVar.f168776h = (TextView) aVar.findViewById(R.id.ch4);
                aVar.f168777i = aVar.findViewById(R.id.a76);
                View view = aVar.f168777i;
                if (view != null) {
                    view.setOnClickListener(new C75088a.View$OnClickListenerC75093e(aVar, str2));
                }
                TextView textView = aVar.f168776h;
                if (textView != null) {
                    textView.setText(str);
                }
                View view2 = aVar.f168773e;
                if (view2 == null) {
                    C89219l.m154715b();
                }
                View view3 = aVar.f168774f;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                View view4 = aVar.f168775g;
                if (view4 == null) {
                    C89219l.m154715b();
                }
                aVar.f168781m = new C74982a(aVar, view2, view3, view4);
                C74982a aVar3 = aVar.f168781m;
                if (aVar3 != null) {
                    aVar3.f168572e.setVisibility(4);
                    aVar3.f168572e.postDelayed(new C74982a.RunnableC74985c(aVar3), 100);
                }
                C39162r.m79460a("widget_bubble2_show", new C33744d().mo59983a(StringSet.type, str2).f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final void mo118129a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C75098b bVar = this.f168746a;
        if (bVar != null) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C75003b bVar2 = bVar.f168806i;
            if (bVar2 == null || !bVar2.f168609c) {
                if (bVar.f168800c == null) {
                    bVar.f168799b = bVar.findViewById(R.id.e08);
                    bVar.f168800c = (TextView) bVar.findViewById(R.id.e09);
                    bVar.f168801d = bVar.findViewById(R.id.ch3);
                    bVar.f168802e = bVar.findViewById(R.id.ch1);
                    bVar.f168803f = bVar.findViewById(R.id.ch2);
                    bVar.f168804g = (TextView) bVar.findViewById(R.id.ch4);
                    bVar.f168805h = bVar.findViewById(R.id.a76);
                    View view = bVar.f168805h;
                    if (view != null) {
                        view.setOnClickListener(new C75098b.View$OnClickListenerC75101c(bVar));
                    }
                }
                TextView textView = bVar.f168804g;
                if (textView != null) {
                    textView.setText(str);
                }
                TextView textView2 = bVar.f168800c;
                if (textView2 != null) {
                    textView2.setText(str2);
                }
                View view2 = bVar.f168799b;
                if (view2 == null) {
                    C89219l.m154715b();
                }
                View view3 = bVar.f168801d;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                View view4 = bVar.f168802e;
                if (view4 == null) {
                    C89219l.m154715b();
                }
                View view5 = bVar.f168803f;
                if (view5 == null) {
                    C89219l.m154715b();
                }
                bVar.f168806i = new C75003b(bVar, view2, view3, view4, view5);
                C75003b bVar3 = bVar.f168806i;
                if (bVar3 != null) {
                    bVar3.f168613g.setVisibility(4);
                    bVar3.f168613g.postDelayed(new C75003b.RunnableC75007d(bVar3), 100);
                }
                C39162r.onEventV3("widget_bubble_show");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a
    /* renamed from: a */
    public final void mo118128a(String str, int i, boolean z) {
        float width;
        C89219l.m154721d(str, "");
        int i2 = this.f168755k + 1;
        this.f168755k = i2;
        if (!this.f168756l && i2 >= i) {
            this.f168756l = true;
            if (this.f168752h != null) {
                boolean a = C80471gb.m139482a();
                C75088a aVar = this.f168752h;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(str, "");
                aVar.f168769a = true;
                aVar.setCanDrag(false);
                aVar.setCloseViewStatus(z);
                aVar.f168780l = z;
                ViewParent parent = aVar.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                if (!a) {
                    width = C13628n.m24520b(aVar.getContext(), -80.0f);
                } else {
                    width = (float) view.getWidth();
                }
                aVar.animate().setListener(new C75088a.C75092d(aVar, str, a)).x(width).y(aVar.getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200).start();
            }
        }
    }
}
