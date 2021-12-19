package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout */
public class CircleWaveLayout extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public static final String f91593a = CircleWaveLayout.class.getSimpleName();

    /* renamed from: b */
    ScaleFadeCircleView f91594b;

    /* renamed from: c */
    public ScaleFadeCircleView f91595c;

    /* renamed from: d */
    public Aweme f91596d;

    /* renamed from: e */
    public boolean f91597e;

    /* renamed from: f */
    public boolean f91598f;

    /* renamed from: g */
    protected AbstractC24203d<AbstractC24457f> f91599g;

    /* renamed from: h */
    private CircleImageView f91600h;

    static {
        Covode.recordClassIndex(46340);
    }

    public CircleWaveLayout(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (view.getId() == R.id.a5h) {
            C38000g.m77052c().mo65914a(getContext(), this.f91596d);
            C38000g.m77050a().mo65896h(getContext(), this.f91596d);
            Aweme aweme = this.f91596d;
            if (aweme != null && aweme.isAd()) {
                C18129a.m33746a("draw_ad", "logo_click", this.f91596d.getAwemeRawAd()).mo28902c();
            }
            C38000g.m77050a().mo65891c(getContext(), this.f91596d);
        }
    }

    public CircleWaveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CircleWaveLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(12866);
        this.f91599g = new C24202c<AbstractC24457f>() {
            /* class com.p2082ss.android.ugc.aweme.commercialize.views.CircleWaveLayout.C387942 */

            static {
                Covode.recordClassIndex(46342);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onRelease(String str) {
                super.onRelease(str);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
                super.onIntermediateImageSet(str, fVar);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                CircleWaveLayout.this.f91598f = false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                if (CircleWaveLayout.this.f91597e) {
                    CircleWaveLayout.this.setVisibility(0);
                    CircleWaveLayout circleWaveLayout = CircleWaveLayout.this;
                    circleWaveLayout.f91594b.mo67408a();
                    circleWaveLayout.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.commercialize.views.CircleWaveLayout.RunnableC387931 */

                        static {
                            Covode.recordClassIndex(46341);
                        }

                        public final void run() {
                            CircleWaveLayout.this.f91595c.mo67408a();
                        }
                    }, 750);
                    CircleWaveLayout.this.f91598f = true;
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.a07, this);
        this.f91594b = (ScaleFadeCircleView) findViewById(R.id.b31);
        this.f91595c = (ScaleFadeCircleView) findViewById(R.id.dti);
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.a5h);
        this.f91600h = circleImageView;
        circleImageView.setOnClickListener(this);
        setOnClickListener(this);
        MethodCollector.m26664o(12866);
    }
}
