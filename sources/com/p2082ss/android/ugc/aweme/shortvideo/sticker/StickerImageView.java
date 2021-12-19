package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4340c.C84407b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView */
public final class StickerImageView extends FrameLayout {

    /* renamed from: a */
    public CircleDraweeView f163433a;

    /* renamed from: b */
    public ImageView f163434b;

    /* renamed from: c */
    public AVCircleProgressView f163435c;

    /* renamed from: d */
    public boolean f163436d;

    /* renamed from: e */
    public final boolean f163437e;

    /* renamed from: f */
    private SmartImageView f163438f;

    /* renamed from: g */
    private View f163439g;

    /* renamed from: h */
    private Drawable f163440h;

    /* renamed from: i */
    private final boolean f163441i;

    /* renamed from: j */
    private final boolean f163442j;

    static {
        Covode.recordClassIndex(85521);
    }

    public StickerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setShowDownloadIcon(boolean z) {
        this.f163436d = z;
    }

    /* renamed from: a */
    public final void mo115193a(int i) {
        if (this.f163437e) {
            SmartImageView smartImageView = this.f163438f;
            if (smartImageView == null) {
                C89219l.m154710a("smartImageView");
            }
            C84402a.m145165a(smartImageView, i);
            return;
        }
        CircleDraweeView circleDraweeView = this.f163433a;
        if (circleDraweeView == null) {
            C89219l.m154710a("iconImageView");
        }
        C84402a.m145165a(circleDraweeView, i);
    }

    public final void setImageBackground(int i) {
        if (this.f163437e) {
            SmartImageView smartImageView = this.f163438f;
            if (smartImageView == null) {
                C89219l.m154710a("smartImageView");
            }
            smartImageView.setBackgroundResource(i);
            return;
        }
        CircleDraweeView circleDraweeView = this.f163433a;
        if (circleDraweeView == null) {
            C89219l.m154710a("iconImageView");
        }
        circleDraweeView.setBackgroundResource(i);
    }

    public final void setImageHierarchy(C24246a aVar) {
        if (this.f163437e) {
            SmartImageView smartImageView = this.f163438f;
            if (smartImageView == null) {
                C89219l.m154710a("smartImageView");
            }
            smartImageView.setHierarchy(aVar);
            return;
        }
        CircleDraweeView circleDraweeView = this.f163433a;
        if (circleDraweeView == null) {
            C89219l.m154710a("iconImageView");
        }
        circleDraweeView.setHierarchy(aVar);
    }

    /* renamed from: a */
    public final void mo115194a(Drawable drawable) {
        if (this.f163437e) {
            SmartImageView smartImageView = this.f163438f;
            if (smartImageView == null) {
                C89219l.m154710a("smartImageView");
            }
            smartImageView.setImageDrawable(drawable);
            return;
        }
        CircleDraweeView circleDraweeView = this.f163433a;
        if (circleDraweeView == null) {
            C89219l.m154710a("iconImageView");
        }
        circleDraweeView.setImageDrawable(drawable);
    }

    public final void setIconImageViewScaleType(C24229q.AbstractC24231b bVar) {
        if (this.f163437e) {
            SmartImageView smartImageView = this.f163438f;
            if (smartImageView == null) {
                C89219l.m154710a("smartImageView");
            }
            C24246a aVar = (C24246a) smartImageView.getHierarchy();
            C89219l.m154716b(aVar, "");
            aVar.mo39958a(bVar);
            return;
        }
        CircleDraweeView circleDraweeView = this.f163433a;
        if (circleDraweeView == null) {
            C89219l.m154710a("iconImageView");
        }
        C24246a aVar2 = (C24246a) circleDraweeView.getHierarchy();
        C89219l.m154716b(aVar2, "");
        aVar2.mo39958a(bVar);
    }

    /* renamed from: a */
    public final void mo115195a(String str) {
        if (!this.f163437e) {
            CircleDraweeView circleDraweeView = this.f163433a;
            if (circleDraweeView == null) {
                C89219l.m154710a("iconImageView");
            }
            C84402a.m145174a(circleDraweeView, str, -1, -1);
        } else if (str != null) {
            C20766v a = C20761r.m39061a(str);
            C20745e.C20746a aVar = new C20745e.C20746a();
            aVar.f48957a = true;
            C20745e a2 = aVar.mo34169a();
            C89219l.m154716b(a2, "");
            a.f49126w = a2;
            SmartImageView smartImageView = this.f163438f;
            if (smartImageView == null) {
                C89219l.m154710a("smartImageView");
            }
            a.f49092E = smartImageView;
            a.mo34186c();
        }
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.f163437e) {
                SmartImageView smartImageView = this.f163438f;
                if (smartImageView == null) {
                    C89219l.m154710a("smartImageView");
                }
                smartImageView.clearColorFilter();
                return;
            }
            CircleDraweeView circleDraweeView = this.f163433a;
            if (circleDraweeView == null) {
                C89219l.m154710a("iconImageView");
            }
            circleDraweeView.clearColorFilter();
        } else if (this.f163437e) {
            SmartImageView smartImageView2 = this.f163438f;
            if (smartImageView2 == null) {
                C89219l.m154710a("smartImageView");
            }
            smartImageView2.setColorFilter(R.color.d9, PorterDuff.Mode.DST_IN);
        } else {
            CircleDraweeView circleDraweeView2 = this.f163433a;
            if (circleDraweeView2 == null) {
                C89219l.m154710a("iconImageView");
            }
            circleDraweeView2.setColorFilter(R.color.d9, PorterDuff.Mode.DST_IN);
        }
    }

    /* renamed from: a */
    public final void mo115197a(boolean z) {
        int i;
        ImageView imageView = this.f163434b;
        if (imageView == null) {
            C89219l.m154710a("downloadImg");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo115196a(String str, Bitmap.Config config) {
        if (!this.f163437e) {
            CircleDraweeView circleDraweeView = this.f163433a;
            if (circleDraweeView == null) {
                C89219l.m154710a("iconImageView");
            }
            C84407b.m145191a(circleDraweeView, str, config);
        } else if (str != null) {
            C20766v a = C20761r.m39061a(str);
            a.f49106c = true;
            C20766v a2 = a.mo34175a();
            SmartImageView smartImageView = this.f163438f;
            if (smartImageView == null) {
                C89219l.m154710a("smartImageView");
            }
            a2.f49092E = smartImageView;
            a2.mo34186c();
        }
    }

    /* renamed from: a */
    private final void m128607a(Context context, AttributeSet attributeSet) {
        int i;
        MethodCollector.m26663i(11069);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f163440h = obtainStyledAttributes.getDrawable(29);
            obtainStyledAttributes.recycle();
        }
        if (this.f163441i) {
            i = R.layout.ae3;
        } else if (this.f163442j) {
            i = R.layout.ae2;
        } else {
            i = R.layout.ae1;
        }
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        this.f163439g = inflate;
        if (inflate == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById = inflate.findViewById(R.id.bm_);
        C89219l.m154716b(findViewById, "");
        this.f163433a = (CircleDraweeView) findViewById;
        View view = this.f163439g;
        if (view == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById2 = view.findViewById(R.id.e1j);
        C89219l.m154716b(findViewById2, "");
        this.f163438f = (SmartImageView) findViewById2;
        C24246a a = new C24247b(getResources()).mo39973a();
        a.mo39953a(1, this.f163440h);
        a.mo39953a(5, this.f163440h);
        if (this.f163437e) {
            SmartImageView smartImageView = this.f163438f;
            if (smartImageView == null) {
                C89219l.m154710a("smartImageView");
            }
            smartImageView.setVisibility(0);
            CircleDraweeView circleDraweeView = this.f163433a;
            if (circleDraweeView == null) {
                C89219l.m154710a("iconImageView");
            }
            circleDraweeView.setVisibility(8);
            SmartImageView smartImageView2 = this.f163438f;
            if (smartImageView2 == null) {
                C89219l.m154710a("smartImageView");
            }
            smartImageView2.setHierarchy(a);
        } else {
            SmartImageView smartImageView3 = this.f163438f;
            if (smartImageView3 == null) {
                C89219l.m154710a("smartImageView");
            }
            smartImageView3.setVisibility(8);
            CircleDraweeView circleDraweeView2 = this.f163433a;
            if (circleDraweeView2 == null) {
                C89219l.m154710a("iconImageView");
            }
            circleDraweeView2.setVisibility(0);
            CircleDraweeView circleDraweeView3 = this.f163433a;
            if (circleDraweeView3 == null) {
                C89219l.m154710a("iconImageView");
            }
            circleDraweeView3.setHierarchy(a);
        }
        View view2 = this.f163439g;
        if (view2 == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById3 = view2.findViewById(R.id.bmb);
        C89219l.m154716b(findViewById3, "");
        this.f163434b = (ImageView) findViewById3;
        View view3 = this.f163439g;
        if (view3 == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById4 = view3.findViewById(R.id.bxi);
        C89219l.m154716b(findViewById4, "");
        AVCircleProgressView aVCircleProgressView = (AVCircleProgressView) findViewById4;
        this.f163435c = aVCircleProgressView;
        if (aVCircleProgressView == null) {
            C89219l.m154710a("progressView");
        }
        aVCircleProgressView.setBgCircleColor(C0643b.m2378c(getContext(), R.color.bo));
        AVCircleProgressView aVCircleProgressView2 = this.f163435c;
        if (aVCircleProgressView2 == null) {
            C89219l.m154710a("progressView");
        }
        aVCircleProgressView2.setProgressColor(-1);
        AVCircleProgressView aVCircleProgressView3 = this.f163435c;
        if (aVCircleProgressView3 == null) {
            C89219l.m154710a("progressView");
        }
        aVCircleProgressView3.setMaxProgress(100);
        AVCircleProgressView aVCircleProgressView4 = this.f163435c;
        if (aVCircleProgressView4 == null) {
            C89219l.m154710a("progressView");
        }
        aVCircleProgressView4.setCircleWidth((int) C84912r.m145930a(context, 2.0f));
        AVCircleProgressView aVCircleProgressView5 = this.f163435c;
        if (aVCircleProgressView5 == null) {
            C89219l.m154710a("progressView");
        }
        aVCircleProgressView5.setBgCircleWidth((int) C84912r.m145930a(context, 3.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view4 = this.f163439g;
        if (view4 == null) {
            C89219l.m154710a("mRootView");
        }
        view4.setLayoutParams(layoutParams);
        View view5 = this.f163439g;
        if (view5 == null) {
            C89219l.m154710a("mRootView");
        }
        addView(view5);
        MethodCollector.m26664o(11069);
    }

    private /* synthetic */ StickerImageView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, false, false, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerImageView(Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11072);
        this.f163441i = z;
        this.f163442j = z2;
        this.f163437e = z3;
        m128607a(context, attributeSet);
        MethodCollector.m26664o(11072);
    }
}
