package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView */
public final class AVDmtImageTextView extends FrameLayout {

    /* renamed from: K */
    private static final int f174439K = C77795c.f174520c;

    /* renamed from: L */
    private static final int f174440L = C77795c.f174519b;

    /* renamed from: M */
    private static final int f174441M = Color.parseColor("#80000000");

    /* renamed from: c */
    public static final C77788a f174442c = new C77788a((byte) 0);

    /* renamed from: A */
    private String f174443A;

    /* renamed from: B */
    private int f174444B;

    /* renamed from: C */
    private Drawable f174445C;

    /* renamed from: D */
    private Drawable f174446D;

    /* renamed from: E */
    private boolean f174447E;

    /* renamed from: F */
    private boolean f174448F;

    /* renamed from: G */
    private int f174449G;

    /* renamed from: H */
    private int f174450H;

    /* renamed from: I */
    private int f174451I;

    /* renamed from: J */
    private LinearLayout f174452J;

    /* renamed from: a */
    public StickerImageView f174453a;

    /* renamed from: b */
    public AVDmtTextView f174454b;

    /* renamed from: d */
    private LinearLayout f174455d;

    /* renamed from: e */
    private ImageView f174456e;

    /* renamed from: f */
    private View f174457f;

    /* renamed from: g */
    private View f174458g;

    /* renamed from: h */
    private FrameLayout f174459h;

    /* renamed from: i */
    private ImageView f174460i;

    /* renamed from: j */
    private int f174461j;

    /* renamed from: k */
    private int f174462k;

    /* renamed from: l */
    private boolean f174463l;

    /* renamed from: m */
    private boolean f174464m;

    /* renamed from: n */
    private int f174465n;

    /* renamed from: o */
    private boolean f174466o;

    /* renamed from: p */
    private boolean f174467p;

    /* renamed from: q */
    private boolean f174468q;

    /* renamed from: r */
    private boolean f174469r;

    /* renamed from: s */
    private int f174470s;

    /* renamed from: t */
    private boolean f174471t;

    /* renamed from: u */
    private boolean f174472u;

    /* renamed from: v */
    private boolean f174473v;

    /* renamed from: w */
    private Animation f174474w;

    /* renamed from: x */
    private boolean f174475x;

    /* renamed from: y */
    private boolean f174476y;

    /* renamed from: z */
    private Drawable f174477z;

    public AVDmtImageTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView$a */
    public static final class C77788a {
        static {
            Covode.recordClassIndex(90857);
        }

        private C77788a() {
        }

        public /* synthetic */ C77788a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo121333a() {
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.setBackground(this.f174446D);
    }

    static {
        Covode.recordClassIndex(90856);
    }

    public final void setImageViewPadding(int i) {
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.setPadding(i, i, i, i);
    }

    public final void setImgBackground(int i) {
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.setImageBackground(i);
    }

    public final void setShowDownloadIcon(boolean z) {
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.setShowDownloadIcon(z);
    }

    public final void setShowDownloadStateIcon(boolean z) {
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.mo115197a(z);
    }

    public final void setTextColor(int i) {
        AVDmtTextView aVDmtTextView = this.f174454b;
        if (aVDmtTextView == null) {
            C89219l.m154710a("dmtTextView");
        }
        aVDmtTextView.setSelectTextColor(i);
    }

    /* renamed from: a */
    public final void mo121334a(float f) {
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.setAlpha(f);
    }

    public final void setIconImagePadding(int i) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        int a = (int) C84912r.m145930a(context, (float) i);
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.setPadding(a, a, a, a);
    }

    /* renamed from: a */
    public final void mo121335a(int i) {
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.mo115193a(i);
    }

    /* renamed from: b */
    public final void mo121341b(boolean z) {
        if (z) {
            ImageView imageView = this.f174456e;
            if (imageView == null) {
                C89219l.m154710a("loadingImageView");
            }
            imageView.clearAnimation();
            ImageView imageView2 = this.f174456e;
            if (imageView2 == null) {
                C89219l.m154710a("loadingImageView");
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.f174456e;
            if (imageView3 == null) {
                C89219l.m154710a("loadingImageView");
            }
            imageView3.startAnimation(this.f174474w);
            return;
        }
        ImageView imageView4 = this.f174456e;
        if (imageView4 == null) {
            C89219l.m154710a("loadingImageView");
        }
        imageView4.setVisibility(8);
        ImageView imageView5 = this.f174456e;
        if (imageView5 == null) {
            C89219l.m154710a("loadingImageView");
        }
        imageView5.clearAnimation();
    }

    public final void setClickStatusColor(int i) {
        int i2;
        Drawable a;
        if (this.f174463l) {
            a = C84916a.m145946a(i, 0, this.f174470s);
            C89219l.m154716b(a, "");
        } else {
            if (this.f174472u) {
                i2 = this.f174465n + this.f174470s;
            } else {
                i2 = this.f174465n;
            }
            a = C84916a.m145947a(i, 0, this.f174470s, i2);
            C89219l.m154716b(a, "");
        }
        View view = this.f174457f;
        if (view == null) {
            C89219l.m154710a("borderView");
        }
        view.setBackground(a);
        AVDmtTextView aVDmtTextView = this.f174454b;
        if (aVDmtTextView == null) {
            C89219l.m154710a("dmtTextView");
        }
        aVDmtTextView.setStatusTextColor(i);
    }

    public final void setEnableUI(boolean z) {
        StickerImageView stickerImageView = this.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        stickerImageView.setEnableUI(z);
        AVDmtTextView aVDmtTextView = this.f174454b;
        if (aVDmtTextView == null) {
            C89219l.m154710a("dmtTextView");
        }
        aVDmtTextView.setEnableUI(z);
        if (z) {
            ImageView imageView = this.f174460i;
            if (imageView == null) {
                C89219l.m154710a("bottomDotView");
            }
            imageView.clearColorFilter();
            return;
        }
        ImageView imageView2 = this.f174460i;
        if (imageView2 == null) {
            C89219l.m154710a("bottomDotView");
        }
        imageView2.setColorFilter(R.color.d9, PorterDuff.Mode.DST_IN);
    }

    /* renamed from: a */
    public final void mo121336a(Drawable drawable) {
        if (drawable != null) {
            StickerImageView stickerImageView = this.f174453a;
            if (stickerImageView == null) {
                C89219l.m154710a("imageView");
            }
            stickerImageView.mo115194a(drawable);
        }
    }

    public final void setText(CharSequence charSequence) {
        int i;
        if (charSequence != null && charSequence.length() != 0) {
            AVDmtTextView aVDmtTextView = this.f174454b;
            if (aVDmtTextView == null) {
                C89219l.m154710a("dmtTextView");
            }
            int measureText = (int) aVDmtTextView.getPaint().measureText(charSequence, 0, charSequence.length());
            if (this.f174469r) {
                i = (int) C77793b.m135908a();
            } else {
                i = this.f174461j;
            }
            if (measureText <= i) {
                AVDmtTextView aVDmtTextView2 = this.f174454b;
                if (aVDmtTextView2 == null) {
                    C89219l.m154710a("dmtTextView");
                }
                aVDmtTextView2.setGravity(17);
            } else if (this.f174447E) {
                AVDmtTextView aVDmtTextView3 = this.f174454b;
                if (aVDmtTextView3 == null) {
                    C89219l.m154710a("dmtTextView");
                }
                aVDmtTextView3.setGravity(8388611);
            } else {
                AVDmtTextView aVDmtTextView4 = this.f174454b;
                if (aVDmtTextView4 == null) {
                    C89219l.m154710a("dmtTextView");
                }
                aVDmtTextView4.setGravity(17);
            }
            LinearLayout linearLayout = this.f174455d;
            if (linearLayout == null) {
                C89219l.m154710a("textLayout");
            }
            linearLayout.setVisibility(0);
            AVDmtTextView aVDmtTextView5 = this.f174454b;
            if (aVDmtTextView5 == null) {
                C89219l.m154710a("dmtTextView");
            }
            aVDmtTextView5.setVisibility(0);
            AVDmtTextView aVDmtTextView6 = this.f174454b;
            if (aVDmtTextView6 == null) {
                C89219l.m154710a("dmtTextView");
            }
            aVDmtTextView6.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo121338a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StickerImageView stickerImageView = this.f174453a;
            if (stickerImageView == null) {
                C89219l.m154710a("imageView");
            }
            stickerImageView.mo115195a(str);
        }
    }

    /* renamed from: a */
    public final void mo121340a(boolean z) {
        int i;
        if (this.f174467p) {
            AVDmtTextView aVDmtTextView = this.f174454b;
            if (aVDmtTextView == null) {
                C89219l.m154710a("dmtTextView");
            }
            aVDmtTextView.mo121358a(z);
            AVDmtTextView aVDmtTextView2 = this.f174454b;
            if (aVDmtTextView2 == null) {
                C89219l.m154710a("dmtTextView");
            }
            aVDmtTextView2.setSelected(z);
        }
        if (this.f174466o) {
            View view = this.f174457f;
            if (view == null) {
                C89219l.m154710a("borderView");
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        if (!z || !this.f174447E) {
            AVDmtTextView aVDmtTextView3 = this.f174454b;
            if (aVDmtTextView3 == null) {
                C89219l.m154710a("dmtTextView");
            }
            aVDmtTextView3.setEllipsize(null);
            return;
        }
        AVDmtTextView aVDmtTextView4 = this.f174454b;
        if (aVDmtTextView4 == null) {
            C89219l.m154710a("dmtTextView");
        }
        aVDmtTextView4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    /* renamed from: a */
    public final void mo121337a(Drawable drawable, int i) {
        if (drawable != null) {
            StickerImageView stickerImageView = this.f174453a;
            if (stickerImageView == null) {
                C89219l.m154710a("imageView");
            }
            stickerImageView.mo115194a(drawable);
            StickerImageView stickerImageView2 = this.f174453a;
            if (stickerImageView2 == null) {
                C89219l.m154710a("imageView");
            }
            stickerImageView2.setPadding(i, i, i, i);
        }
    }

    /* renamed from: a */
    public final void mo121339a(String str, Bitmap.Config config) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str) && config != null) {
            StickerImageView stickerImageView = this.f174453a;
            if (stickerImageView == null) {
                C89219l.m154710a("imageView");
            }
            stickerImageView.mo115196a(str, config);
        }
    }

    private /* synthetic */ AVDmtImageTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x028a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AVDmtImageTextView(android.content.Context r19, android.util.AttributeSet r20, char r21) {
        /*
        // Method dump skipped, instructions count: 1452
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView.<init>(android.content.Context, android.util.AttributeSet, char):void");
    }
}
