package com.p2082ss.android.ugc.aweme.share.qrcode.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p2001c.AbstractC27450az;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3760e.C69190a;
import com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69200d;
import com.p2082ss.android.ugc.aweme.share.p3748f.C68926c;
import com.p2082ss.android.ugc.aweme.share.qrcode.p3772a.C69389a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareChannelBar;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView */
public final class UserQRCodeControlView extends FrameLayout {

    /* renamed from: a */
    public AbstractC69408a f155033a;

    /* renamed from: b */
    private View f155034b;

    /* renamed from: c */
    private View f155035c;

    /* renamed from: d */
    private ShareChannelBar f155036d;

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView$a */
    public interface AbstractC69408a {
        static {
            Covode.recordClassIndex(81745);
        }

        /* renamed from: a */
        void mo109631a(View view);

        /* renamed from: a */
        void mo109632a(AbstractC69581b bVar);

        /* renamed from: b */
        void mo109633b(View view);
    }

    static {
        Covode.recordClassIndex(81741);
    }

    public UserQRCodeControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private final void m122596a() {
        ShareChannelBar shareChannelBar = this.f155036d;
        if (shareChannelBar != null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            List<AbstractC69581b> a = C69190a.C69191a.m122289a(C69124b.m122223a(context));
            a.add(new C69389a());
            AbstractC27450az a2 = AbstractC27450az.m54883a(new C69200d());
            C89070n.m154537a((List) a, (AbstractC89172b) new C69409b(this));
            ArrayList arrayList = new ArrayList();
            for (T t : a) {
                T t2 = t;
                if (C69190a.C69191a.m122288a().isEmpty() || C89219l.m154714a((Object) t2.mo109548a(), (Object) "qr_code_save") || C69190a.C69191a.m122288a().contains(t2.mo109548a())) {
                    arrayList.add(t);
                }
            }
            List<? extends AbstractC69581b> a3 = a2.mo45814a(arrayList);
            C89219l.m154716b(a3, "");
            shareChannelBar.mo109818a(a3);
            shareChannelBar.mo109817a(new C69410c(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView$c */
    public static final class C69410c implements AbstractC69681f {

        /* renamed from: a */
        final /* synthetic */ UserQRCodeControlView f155041a;

        static {
            Covode.recordClassIndex(81747);
        }

        C69410c(UserQRCodeControlView userQRCodeControlView) {
            this.f155041a = userQRCodeControlView;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f
        /* renamed from: a_ */
        public final void mo87413a_(AbstractC69581b bVar) {
            C89219l.m154721d(bVar, "");
            AbstractC69408a aVar = this.f155041a.f155033a;
            if (aVar != null) {
                aVar.mo109632a(bVar);
            }
        }
    }

    public final void setCallback(AbstractC69408a aVar) {
        C89219l.m154721d(aVar, "");
        this.f155033a = aVar;
    }

    /* renamed from: a */
    private static /* synthetic */ void m122597a(View view) {
        view.setOnTouchListener(new View$OnTouchListenerC69411d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView$b */
    public static final class C69409b extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ UserQRCodeControlView f155040a;

        static {
            Covode.recordClassIndex(81746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69409b(UserQRCodeControlView userQRCodeControlView) {
            super(1);
            this.f155040a = userQRCodeControlView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            Context context = this.f155040a.getContext();
            C89219l.m154716b(context, "");
            return Boolean.valueOf(!bVar2.mo109557b(context));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView$d */
    public static final class View$OnTouchListenerC69411d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ float f155042a = 0.75f;

        static {
            Covode.recordClassIndex(81748);
        }

        View$OnTouchListenerC69411d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                C89219l.m154716b(view, "");
                view.setAlpha(this.f155042a);
                return false;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                C89219l.m154716b(view, "");
                view.setAlpha(1.0f);
                return false;
            }
        }
    }

    private /* synthetic */ UserQRCodeControlView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private UserQRCodeControlView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6681);
        int a = C68926c.m121626a();
        if (a == 0) {
            C1764a.m5927a(LayoutInflater.from(context), R.layout.azb, this, true);
            this.f155034b = findViewById(R.id.ce3);
            this.f155035c = findViewById(R.id.ce4);
        } else if (a == 1) {
            C1764a.m5927a(LayoutInflater.from(context), R.layout.azc, this, true);
            this.f155034b = findViewById(R.id.ce3);
            this.f155035c = findViewById(R.id.ce4);
            View view = this.f155034b;
            if (view != null) {
                m122597a(view);
            }
            View view2 = this.f155035c;
            if (view2 != null) {
                m122597a(view2);
            }
        } else if (a == 2) {
            C1764a.m5927a(LayoutInflater.from(context), R.layout.azd, this, true);
            this.f155035c = findViewById(R.id.ce4);
        } else if (a == 3) {
            C1764a.m5927a(LayoutInflater.from(context), R.layout.aze, this, true);
            View findViewById = findViewById(R.id.ce4);
            this.f155035c = findViewById;
            if (findViewById != null) {
                m122597a(findViewById);
            }
        } else if (a != 4) {
            setVisibility(8);
        } else {
            C1764a.m5927a(LayoutInflater.from(context), R.layout.azf, this, true);
            this.f155036d = (ShareChannelBar) findViewById(R.id.fa8);
            findViewById(R.id.dz7).setOnClickListener(View$OnClickListenerC694051.f155037a);
        }
        View view3 = this.f155034b;
        if (view3 != null) {
            view3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.View$OnClickListenerC694062 */

                /* renamed from: a */
                final /* synthetic */ UserQRCodeControlView f155038a;

                static {
                    Covode.recordClassIndex(81743);
                }

                {
                    this.f155038a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    AbstractC69408a aVar = this.f155038a.f155033a;
                    if (aVar != null) {
                        C89219l.m154716b(view, "");
                        aVar.mo109631a(view);
                    }
                }
            });
        }
        View view4 = this.f155035c;
        if (view4 != null) {
            view4.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.View$OnClickListenerC694073 */

                /* renamed from: a */
                final /* synthetic */ UserQRCodeControlView f155039a;

                static {
                    Covode.recordClassIndex(81744);
                }

                {
                    this.f155039a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    AbstractC69408a aVar = this.f155039a.f155033a;
                    if (aVar != null) {
                        C89219l.m154716b(view, "");
                        aVar.mo109633b(view);
                    }
                }
            });
        }
        m122596a();
        MethodCollector.m26664o(6681);
    }
}
