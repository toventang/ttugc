package com.bytedance.ies.ugc.aweme.rich.p1274ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.rich.ui.RichTagView */
public final class RichTagView extends RelativeLayout {

    /* renamed from: a */
    public final Context f43225a;

    /* renamed from: b */
    private final AbstractC89244h f43226b;

    /* renamed from: c */
    private final AbstractC89244h f43227c;

    /* renamed from: d */
    private final AbstractC89244h f43228d;

    /* renamed from: e */
    private final AbstractC89244h f43229e;

    static {
        Covode.recordClassIndex(20793);
    }

    public RichTagView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public RichTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final RelativeLayout getMContentView() {
        return (RelativeLayout) this.f43227c.getValue();
    }

    private final TuxTextView getMDescTextView() {
        return (TuxTextView) this.f43228d.getValue();
    }

    private final ImageView getMImageView() {
        return (ImageView) this.f43229e.getValue();
    }

    public final int getDescId() {
        return R.id.djy;
    }

    public final int getImageId() {
        return R.id.djz;
    }

    public final View getMRootView() {
        return (View) this.f43226b.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.ui.RichTagView$a */
    static final class C18152a extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ RichTagView f43230a;

        static {
            Covode.recordClassIndex(20794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18152a(RichTagView richTagView) {
            super(0);
            this.f43230a = richTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f43230a.getMRootView().findViewById(R.id.dk0);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.ui.RichTagView$b */
    static final class C18153b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ RichTagView f43231a;

        static {
            Covode.recordClassIndex(20795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18153b(RichTagView richTagView) {
            super(0);
            this.f43231a = richTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f43231a.getMRootView().findViewById(R.id.djy);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.ui.RichTagView$c */
    static final class C18154c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ RichTagView f43232a;

        static {
            Covode.recordClassIndex(20796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18154c(RichTagView richTagView) {
            super(0);
            this.f43232a = richTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f43232a.getMRootView().findViewById(R.id.djz);
        }
    }

    public final ViewGroup.LayoutParams getDescViewParams() {
        ViewGroup.LayoutParams layoutParams = getMDescTextView().getLayoutParams();
        C89219l.m154709a((Object) layoutParams, "");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getImageViewParams() {
        ViewGroup.LayoutParams layoutParams = getMImageView().getLayoutParams();
        C89219l.m154709a((Object) layoutParams, "");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getTagViewParams() {
        ViewGroup.LayoutParams layoutParams = getMContentView().getLayoutParams();
        C89219l.m154709a((Object) layoutParams, "");
        return layoutParams;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.ui.RichTagView$d */
    static final class C18155d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ RichTagView f43233a;

        static {
            Covode.recordClassIndex(20797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18155d(RichTagView richTagView) {
            super(0);
            this.f43233a = richTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            MethodCollector.m26663i(8884);
            View inflate = View.inflate(this.f43233a.f43225a, R.layout.arb, this.f43233a);
            MethodCollector.m26664o(8884);
            return inflate;
        }
    }

    /* renamed from: a */
    public final void mo28933a(C18156a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C89219l.m154719c(aVar, "");
        if (!TextUtils.isEmpty(aVar.f43235a)) {
            Integer num = aVar.f43253s;
            int i8 = 0;
            if (num != null) {
                int intValue = num.intValue();
                ViewGroup.LayoutParams descViewParams = getDescViewParams();
                if (descViewParams != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) descViewParams;
                    ViewGroup.LayoutParams imageViewParams = getImageViewParams();
                    if (imageViewParams != null) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageViewParams;
                        layoutParams.addRule(1, 0);
                        if (intValue == 1 || intValue == 2) {
                            layoutParams.addRule(15);
                            layoutParams2.addRule(15);
                        } else {
                            layoutParams.addRule(14);
                            layoutParams2.addRule(14);
                        }
                        if (intValue == 1) {
                            layoutParams.addRule(1, getImageId());
                            Integer num2 = aVar.f43254t;
                            if (num2 != null) {
                                i4 = num2.intValue();
                            } else {
                                i4 = 0;
                            }
                            layoutParams.leftMargin = i4;
                        } else if (intValue == 2) {
                            layoutParams2.addRule(1, getDescId());
                            Integer num3 = aVar.f43254t;
                            if (num3 != null) {
                                i5 = num3.intValue();
                            } else {
                                i5 = 0;
                            }
                            layoutParams2.leftMargin = i5;
                        } else if (intValue == 3) {
                            layoutParams.addRule(3, getImageId());
                            Integer num4 = aVar.f43254t;
                            if (num4 != null) {
                                i6 = num4.intValue();
                            } else {
                                i6 = 0;
                            }
                            layoutParams.topMargin = i6;
                        } else if (intValue == 4) {
                            layoutParams2.addRule(3, getDescId());
                            Integer num5 = aVar.f43254t;
                            if (num5 != null) {
                                i7 = num5.intValue();
                            } else {
                                i7 = 0;
                            }
                            layoutParams2.topMargin = i7;
                        }
                        getMDescTextView().setLayoutParams(layoutParams);
                        getMImageView().setLayoutParams(layoutParams2);
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            if (!(aVar.f43243i == null && aVar.f43244j == null)) {
                ViewGroup.LayoutParams tagViewParams = getTagViewParams();
                if (tagViewParams != null) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) tagViewParams;
                    Integer num6 = aVar.f43243i;
                    if (num6 != null) {
                        layoutParams3.width = num6.intValue();
                    }
                    Integer num7 = aVar.f43244j;
                    if (num7 != null) {
                        layoutParams3.height = num7.intValue();
                    }
                    getMContentView().setLayoutParams(layoutParams3);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            RelativeLayout.LayoutParams layoutParams4 = aVar.f43250p;
            if (layoutParams4 != null) {
                getMContentView().setLayoutParams(layoutParams4);
            }
            RelativeLayout.LayoutParams layoutParams5 = aVar.f43251q;
            if (layoutParams5 != null) {
                getMDescTextView().setLayoutParams(layoutParams5);
            }
            RelativeLayout.LayoutParams layoutParams6 = aVar.f43252r;
            if (layoutParams6 != null) {
                getMImageView().setLayoutParams(layoutParams6);
            }
            getMDescTextView().setText(aVar.f43235a);
            Integer num8 = aVar.f43236b;
            if (num8 != null) {
                getMDescTextView().setTextColor(num8.intValue());
            }
            Float f = aVar.f43237c;
            if (f != null) {
                getMDescTextView().setTextSize(f.floatValue());
            }
            Integer num9 = aVar.f43238d;
            if (num9 != null) {
                getMDescTextView().setTuxFont(num9.intValue());
            }
            TextUtils.TruncateAt truncateAt = aVar.f43239e;
            if (truncateAt != null) {
                getMDescTextView().setEllipsize(truncateAt);
            }
            Integer num10 = aVar.f43240f;
            if (num10 != null) {
                getMDescTextView().setMaxLines(num10.intValue());
            }
            Integer num11 = aVar.f43249o;
            if (num11 != null) {
                getMImageView().setImageResource(num11.intValue());
                getMImageView().setVisibility(0);
            }
            if (aVar.f43241g != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                Integer num12 = aVar.f43241g;
                if (num12 != null) {
                    gradientDrawable.setColor(num12.intValue());
                }
                Float f2 = aVar.f43242h;
                if (f2 != null) {
                    gradientDrawable.setCornerRadius(f2.floatValue());
                }
                getMContentView().setBackground(gradientDrawable);
            }
            if (aVar.f43247m != null || aVar.f43248n != null || aVar.f43245k != null || aVar.f43246l != null) {
                int i9 = Build.VERSION.SDK_INT;
                RelativeLayout mContentView = getMContentView();
                Integer num13 = aVar.f43245k;
                if (num13 != null) {
                    i = num13.intValue();
                } else {
                    i = 0;
                }
                Integer num14 = aVar.f43247m;
                if (num14 != null) {
                    i2 = num14.intValue();
                } else {
                    i2 = 0;
                }
                Integer num15 = aVar.f43246l;
                if (num15 != null) {
                    i3 = num15.intValue();
                } else {
                    i3 = 0;
                }
                Integer num16 = aVar.f43248n;
                if (num16 != null) {
                    i8 = num16.intValue();
                }
                mContentView.setPaddingRelative(i, i2, i3, i8);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RichTagView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RichTagView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8905);
        this.f43225a = context;
        this.f43226b = C89250i.m154773a((AbstractC89171a) new C18155d(this));
        this.f43227c = C89250i.m154773a((AbstractC89171a) new C18152a(this));
        this.f43228d = C89250i.m154773a((AbstractC89171a) new C18153b(this));
        this.f43229e = C89250i.m154773a((AbstractC89171a) new C18154c(this));
        MethodCollector.m26664o(8905);
    }
}
