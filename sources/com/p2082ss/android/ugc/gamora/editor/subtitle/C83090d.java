package com.p2082ss.android.ugc.gamora.editor.subtitle;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.p043e.p044a.AbstractC0855b;
import androidx.p043e.p044a.C0875d;
import androidx.p043e.p044a.C0876e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3859a.C72832a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.p3873a.C73204a;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75306a;
import com.p2082ss.android.ugc.aweme.sticker.view.C76113a;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.subtitle.d */
public final class C83090d extends C45922g {

    /* renamed from: q */
    public static final float f185665q;

    /* renamed from: r */
    public static final int f185666r = ((int) C13628n.m24520b(C40963b.m82473a(), 200.0f));

    /* renamed from: s */
    public static final int f185667s;

    /* renamed from: t */
    public static final int f185668t;

    /* renamed from: u */
    public static final float f185669u;

    /* renamed from: v */
    public static final int f185670v;

    /* renamed from: w */
    public static final float f185671w = C13628n.m24520b(C40963b.m82473a(), 76.0f);

    /* renamed from: x */
    public static final C83092a f185672x = new C83092a((byte) 0);

    /* renamed from: A */
    private boolean f185673A;

    /* renamed from: B */
    private final C0875d f185674B;

    /* renamed from: C */
    private AbstractC83093b f185675C;

    /* renamed from: D */
    private boolean f185676D;

    /* renamed from: E */
    private VideoPublishEditModel f185677E;

    /* renamed from: F */
    private float f185678F;

    /* renamed from: G */
    private float f185679G;

    /* renamed from: H */
    private float f185680H;

    /* renamed from: I */
    private float f185681I;

    /* renamed from: J */
    private int f185682J;

    /* renamed from: K */
    private float f185683K;

    /* renamed from: L */
    private final ViewGroup f185684L;

    /* renamed from: y */
    private final TextView f185685y;

    /* renamed from: z */
    private int f185686z;

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.d$b */
    public interface AbstractC83093b {
        static {
            Covode.recordClassIndex(96968);
        }

        /* renamed from: a */
        void mo128186a(int i);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: g */
    public final boolean mo77353g() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: h */
    public final boolean mo77365h() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: o */
    public final boolean mo77372o() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: p */
    public final boolean mo77376p() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.d$a */
    public static final class C83092a {
        static {
            Covode.recordClassIndex(96967);
        }

        private C83092a() {
        }

        public /* synthetic */ C83092a(byte b) {
            this();
        }
    }

    public final VideoPublishEditModel getPublishEditModel() {
        return this.f185677E;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: d */
    public final boolean mo77350d() {
        if (this.f185685y.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final AbstractC45824b mo77336a() {
        boolean z;
        C45922g.C45923a aVar = new C45922g.C45923a();
        if (this.f185676D || !C73204a.m129256a()) {
            z = true;
        } else {
            z = false;
        }
        return new C72832a(this, aVar, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: c */
    public final void mo77349c() {
        boolean z;
        VideoPublishEditModel videoPublishEditModel = this.f185677E;
        if (videoPublishEditModel != null) {
            if ((videoPublishEditModel.hasOriginalAudio() || videoPublishEditModel.hasRecord()) && (videoPublishEditModel.hasRecord() || videoPublishEditModel.voiceVolume != 0.0f)) {
                z = false;
            } else {
                z = true;
            }
            if (z != this.f185676D) {
                this.f185676D = z;
                this.f106964p = mo77336a();
            }
            C89219l.m154721d(videoPublishEditModel, "");
            C39162r.m79460a("click_subtitle_menu", C70968bl.m125268d(videoPublishEditModel).f188764a);
        }
        super.mo77349c();
    }

    static {
        Covode.recordClassIndex(96965);
        float b = C13628n.m24520b(C40963b.m82473a(), 44.0f);
        f185665q = b;
        f185667s = (int) (b + ((float) C40979n.m82503a()));
        int b2 = (int) C13628n.m24520b(C40963b.m82473a(), 16.0f);
        f185668t = b2;
        float b3 = C13628n.m24520b(C40963b.m82473a(), 56.0f);
        f185669u = b3;
        f185670v = (int) Math.min(C13628n.m24520b(C40963b.m82473a(), 320.0f), ((float) (C40979n.m82507b(C40963b.m82473a()) - b2)) - b3);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    public final PointF[] getFourAnglePoint() {
        View view = this.f106955g;
        C89219l.m154716b(view, "");
        float measuredWidth = (float) view.getMeasuredWidth();
        View view2 = this.f106955g;
        C89219l.m154716b(view2, "");
        float measuredHeight = (float) view2.getMeasuredHeight();
        View view3 = this.f106955g;
        C89219l.m154716b(view3, "");
        float x = view3.getX();
        View view4 = this.f106955g;
        C89219l.m154716b(view4, "");
        float y = view4.getY();
        float f = measuredWidth + x;
        float f2 = y + measuredHeight;
        return new PointF[]{new PointF(x, y), new PointF(f, y), new PointF(x, f2), new PointF(f, f2)};
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: j */
    public final void mo77367j() {
        float abs = Math.abs(this.f185680H - this.f185678F);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C89219l.m154716b(viewConfiguration, "");
        if (abs < ((float) viewConfiguration.getScaledTouchSlop())) {
            float abs2 = Math.abs(this.f185681I - this.f185679G);
            ViewConfiguration viewConfiguration2 = ViewConfiguration.get(getContext());
            C89219l.m154716b(viewConfiguration2, "");
            if (abs2 < ((float) viewConfiguration2.getScaledTouchSlop())) {
                mo77369l();
                mo77370m();
            }
        }
    }

    public final void setOnCaptionStickerListener(AbstractC83093b bVar) {
        this.f185675C = bVar;
    }

    public final void setPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.f185677E = videoPublishEditModel;
    }

    public final void setCaption(String str) {
        if (str == null || str.length() == 0) {
            this.f185685y.setVisibility(4);
            return;
        }
        this.f185685y.setVisibility(0);
        this.f185685y.setText(str);
    }

    public final void setCaptionLocation(int i) {
        this.f185685y.setTranslationY(0.0f);
        if (i == EnumC75306a.LEFT_BOTTOM.getValue()) {
            setCaptionAlignMode(true);
        } else {
            setCaptionAlignMode(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final boolean mo77341a(MotionEvent motionEvent) {
        float f;
        float f2 = 0.0f;
        if (motionEvent != null) {
            f = motionEvent.getX();
        } else {
            f = 0.0f;
        }
        this.f185678F = f;
        if (motionEvent != null) {
            f2 = motionEvent.getY();
        }
        this.f185679G = f2;
        mo77345b();
        this.f106954f.mo77292a();
        return super.mo77341a(motionEvent);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: b */
    public final boolean mo77347b(MotionEvent motionEvent) {
        float f;
        float f2;
        if (motionEvent != null) {
            f = motionEvent.getX();
        } else {
            f = 0.0f;
        }
        this.f185680H = f;
        if (motionEvent != null) {
            f2 = motionEvent.getY();
        } else {
            f2 = 0.0f;
        }
        this.f185681I = f2;
        mo77345b();
        this.f106954f.mo77292a();
        boolean b = super.mo77347b(motionEvent);
        View view = this.f106955g;
        C89219l.m154716b(view, "");
        if (view.getTranslationY() != 0.0f) {
            this.f185674B.mo3148a();
        }
        return b;
    }

    private final void setCaptionAlignMode(boolean z) {
        EnumC75306a aVar;
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.f185685y.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            this.f185685y.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.f185685y.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 48;
            this.f185685y.setLayoutParams(layoutParams4);
        }
        this.f185673A = z;
        AbstractC83093b bVar = this.f185675C;
        if (bVar != null) {
            if (z) {
                aVar = EnumC75306a.LEFT_BOTTOM;
            } else {
                aVar = EnumC75306a.LEFT_TOP;
            }
            bVar.mo128186a(aVar.getValue());
        }
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C83090d(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11714);
        int a = C40979n.m82504a(context);
        int i = f185667s;
        int i2 = f185666r;
        this.f185686z = (a - i) - i2;
        this.f185673A = true;
        this.f185683K = 1.0f;
        View inflate = LayoutInflater.from(context).inflate(R.layout.aho, this);
        if (inflate != null) {
            this.f185684L = (ViewGroup) inflate;
            View findViewById = inflate.findViewById(R.id.etc);
            C89219l.m154716b(findViewById, "");
            TextView textView = (TextView) findViewById;
            this.f185685y = textView;
            this.f106954f = (StickerHelpBoxView) inflate.findViewById(R.id.e8x);
            this.f106954f.setHelpBoxColor(0);
            this.f106955g = textView;
            C0875d dVar = new C0875d(textView, C0875d.f3139b, (byte) 0);
            C0876e eVar = dVar.f3167x;
            C89219l.m154716b(eVar, "");
            eVar.mo3159a(300.0f);
            C0876e eVar2 = dVar.f3167x;
            C89219l.m154716b(eVar2, "");
            eVar2.mo3160b(0.86f);
            this.f185674B = dVar;
            dVar.mo3146a(new AbstractC0855b.AbstractC0871b(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d.C830911 */

                /* renamed from: a */
                final /* synthetic */ C83090d f185687a;

                static {
                    Covode.recordClassIndex(96966);
                }

                {
                    this.f185687a = r1;
                }

                @Override // androidx.p043e.p044a.AbstractC0855b.AbstractC0871b
                /* renamed from: a */
                public final void mo3155a() {
                    this.f185687a.mo77345b();
                }
            });
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = i;
                layoutParams2.bottomMargin = i2;
                layoutParams2.gravity = 8388611;
                MethodCollector.m26664o(11714);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            MethodCollector.m26664o(11714);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(11714);
        throw nullPointerException2;
    }

    public /* synthetic */ C83090d(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final void mo77340a(int i, int i2) {
        super.mo77340a(i, i2);
        ViewGroup.LayoutParams layoutParams = this.f185685y.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i3 = f185668t;
        if (i < 0) {
            i3 -= i;
        }
        this.f185682J = i3;
        int i4 = (int) (f185669u - ((float) i));
        if (C78099c.m136517a(getContext())) {
            layoutParams2.rightMargin = i3;
            layoutParams2.leftMargin = i4;
        } else {
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i4;
        }
        int i5 = f185667s;
        if (i2 < 0) {
            i5 -= i2;
        }
        layoutParams2.topMargin = i5;
        ViewParent parent = getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int i6 = ((ViewGroup) parent).getLayoutParams().height;
        layoutParams2.bottomMargin = (i6 - C76113a.m133465a(getContext())) + C76113a.getTbMargin();
        this.f185686z = (i6 - layoutParams2.topMargin) - layoutParams2.bottomMargin;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo77338a(float r7, float r8, java.lang.Boolean r9) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d.mo77338a(float, float, java.lang.Boolean):void");
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
