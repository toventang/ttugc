package com.p2082ss.android.ugc.aweme.compliance.business.termspp;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.compliance.business.setting.p2656a.C39531a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.b */
public final class C39578b {

    /* renamed from: a */
    public AbstractC39577a f93329a;

    /* renamed from: b */
    public AbstractC39577a f93330b;

    /* renamed from: c */
    public AbstractC39577a f93331c;

    /* renamed from: d */
    public TuxButton f93332d;

    /* renamed from: e */
    public AbstractC89171a<C89391z> f93333e;

    /* renamed from: f */
    public AbstractC89171a<C89391z> f93334f;

    /* renamed from: g */
    public AbstractC89171a<C89391z> f93335g;

    /* renamed from: h */
    public final Activity f93336h;

    static {
        Covode.recordClassIndex(47289);
    }

    /* renamed from: a */
    public final AbstractC39577a mo68997a() {
        AbstractC39577a aVar = this.f93329a;
        if (aVar == null) {
            C89219l.m154710a("agreeTermsCheckBox");
        }
        return aVar;
    }

    /* renamed from: b */
    public final AbstractC39577a mo68998b() {
        AbstractC39577a aVar = this.f93330b;
        if (aVar == null) {
            C89219l.m154710a("agreePrivacyCheckBox");
        }
        return aVar;
    }

    /* renamed from: c */
    public final AbstractC39577a mo68999c() {
        AbstractC39577a aVar = this.f93331c;
        if (aVar == null) {
            C89219l.m154710a("selectAllCheckBox");
        }
        return aVar;
    }

    /* renamed from: d */
    public final TuxButton mo69000d() {
        TuxButton tuxButton = this.f93332d;
        if (tuxButton == null) {
            C89219l.m154710a("continueButton");
        }
        return tuxButton;
    }

    /* renamed from: e */
    private final void m80362e() {
        this.f93329a = m80359a(R.id.c78, R.id.a29);
        this.f93330b = m80359a(R.id.c5i, R.id.a27);
        this.f93331c = new C39581b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.b$a */
    public static final class C39579a extends AbstractC39577a {

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f93337d;

        static {
            Covode.recordClassIndex(47290);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.business.termspp.AbstractC39577a
        /* renamed from: a */
        public final void mo68996a(boolean z) {
            this.f93328c = z;
            this.f93337d.setChecked(z);
        }

        C39579a(AppCompatCheckBox appCompatCheckBox) {
            this.f93337d = appCompatCheckBox;
            appCompatCheckBox.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.termspp.C39578b.C39579a.View$OnClickListenerC395801 */

                /* renamed from: a */
                final /* synthetic */ C39579a f93338a;

                static {
                    Covode.recordClassIndex(47291);
                }

                {
                    this.f93338a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C39579a aVar = this.f93338a;
                    aVar.mo68996a(!aVar.f93328c);
                    AbstractC89172b<? super Boolean, C89391z> bVar = aVar.f93326a;
                    if (bVar != null) {
                        bVar.invoke(Boolean.valueOf(aVar.f93328c));
                    }
                    AbstractC89171a<C89391z> aVar2 = aVar.f93327b;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private final <T> T m80360a(int i) {
        return (T) this.f93336h.findViewById(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.b$c */
    static final class View$OnClickListenerC39583c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39578b f93342a;

        static {
            Covode.recordClassIndex(47294);
        }

        View$OnClickListenerC39583c(C39578b bVar) {
            this.f93342a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f93342a.f93335g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.b$d */
    static final class View$OnClickListenerC39584d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39578b f93343a;

        static {
            Covode.recordClassIndex(47295);
        }

        View$OnClickListenerC39584d(C39578b bVar) {
            this.f93343a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f93343a.f93333e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.b$e */
    static final class View$OnClickListenerC39585e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39578b f93344a;

        static {
            Covode.recordClassIndex(47296);
        }

        View$OnClickListenerC39585e(C39578b bVar) {
            this.f93344a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f93344a.f93334f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.b$b */
    public static final class C39581b extends AbstractC39577a {

        /* renamed from: d */
        public boolean f93339d = this.f93328c;

        /* renamed from: e */
        final /* synthetic */ C39578b f93340e;

        static {
            Covode.recordClassIndex(47292);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39581b(C39578b bVar) {
            this.f93340e = bVar;
            bVar.mo69000d().setText(R.string.asg);
            bVar.mo69000d().setTextColor(C0643b.m2378c(bVar.f93336h, R.color.bh));
            bVar.mo69000d().setBackground(C0643b.m2369a(bVar.f93336h, (int) R.drawable.a2w));
            bVar.mo69000d().setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.termspp.C39578b.C39581b.View$OnClickListenerC395821 */

                /* renamed from: a */
                final /* synthetic */ C39581b f93341a;

                static {
                    Covode.recordClassIndex(47293);
                }

                {
                    this.f93341a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C39581b bVar = this.f93341a;
                    if (bVar.f93328c) {
                        AbstractC89171a<C89391z> aVar = bVar.f93340e.f93335g;
                        if (aVar != null) {
                            aVar.invoke();
                            return;
                        }
                        return;
                    }
                    bVar.mo68996a(!bVar.f93328c);
                    AbstractC89172b<? super Boolean, C89391z> bVar2 = bVar.f93326a;
                    if (bVar2 != null) {
                        bVar2.invoke(Boolean.valueOf(bVar.f93328c));
                    }
                    AbstractC89171a<C89391z> aVar2 = bVar.f93327b;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            });
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.business.termspp.AbstractC39577a
        /* renamed from: a */
        public final void mo68996a(boolean z) {
            TransitionDrawable transitionDrawable;
            this.f93328c = z;
            if (this.f93339d != this.f93328c) {
                if (this.f93328c) {
                    this.f93340e.mo69000d().setText(R.string.asf);
                    this.f93340e.mo69000d().setTextColor(C0643b.m2378c(this.f93340e.f93336h, R.color.a9));
                    transitionDrawable = new TransitionDrawable(new Drawable[]{C0643b.m2369a(this.f93340e.f93336h, (int) R.drawable.a2w), C0643b.m2369a(this.f93340e.f93336h, (int) R.drawable.a2u)});
                } else {
                    this.f93340e.mo69000d().setText(R.string.asg);
                    this.f93340e.mo69000d().setTextColor(C0643b.m2378c(this.f93340e.f93336h, R.color.bh));
                    transitionDrawable = new TransitionDrawable(new Drawable[]{C0643b.m2369a(this.f93340e.f93336h, (int) R.drawable.a2u), C0643b.m2369a(this.f93340e.f93336h, (int) R.drawable.a2w)});
                }
                this.f93340e.mo69000d().setBackground(transitionDrawable);
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(200);
                this.f93339d = this.f93328c;
            }
        }
    }

    public C39578b(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f93336h = activity;
        TuxButton tuxButton = (TuxButton) m80360a(R.id.xd);
        this.f93332d = tuxButton;
        if (tuxButton == null) {
            C89219l.m154710a("continueButton");
        }
        tuxButton.setOnClickListener(new View$OnClickListenerC39583c(this));
        m80361a(activity, (TuxTextView) m80360a(R.id.f5k), R.string.asz, R.string.asj, new View$OnClickListenerC39584d(this));
        m80361a(activity, (TuxTextView) m80360a(R.id.f1h), R.string.asy, R.string.asi, new View$OnClickListenerC39585e(this));
        int a = C39586c.m80369a();
        if (a == 1) {
            m80362e();
        } else if (a == 2) {
            this.f93331c = m80359a(R.id.c68, R.id.a2m);
            this.f93329a = m80359a(R.id.c78, R.id.a29);
            this.f93330b = m80359a(R.id.c5i, R.id.a27);
        } else if (a == 3) {
            this.f93331c = m80359a(R.id.c67, R.id.a2k);
            this.f93329a = m80359a(R.id.c78, R.id.a29);
            this.f93330b = m80359a(R.id.c5i, R.id.a27);
        } else if (a != 4) {
            m80362e();
        } else {
            this.f93331c = m80359a(R.id.c67, R.id.a2l);
            this.f93329a = m80359a(R.id.c78, R.id.a2_);
            this.f93330b = m80359a(R.id.c5i, R.id.a28);
        }
    }

    /* renamed from: a */
    private final AbstractC39577a m80359a(int i, int i2) {
        ((View) m80360a(i)).setVisibility(0);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) m80360a(i2);
        appCompatCheckBox.setVisibility(0);
        return new C39579a(appCompatCheckBox);
    }

    /* renamed from: a */
    private static void m80361a(Context context, TuxTextView tuxTextView, int i, int i2, View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i2));
        String string = context.getString(i);
        C89219l.m154716b(string, "");
        int c = C0643b.m2378c(context, R.color.c4);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        C89219l.m154716b(spannableStringBuilder2, "");
        int a = C89361p.m154888a((CharSequence) spannableStringBuilder2, string, 0, false, 6);
        try {
            spannableStringBuilder.setSpan(new C39531a.C39532a(c, onClickListener), a, string.length() + a, 34);
            tuxTextView.setHighlightColor(C0643b.m2378c(context, R.color.c9));
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
