package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.C45849b;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46104o;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46105p;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.C46047c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.C46049e;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.q */
public final class C46185q extends C46239q {

    /* renamed from: A */
    private final C46161n f107582A;

    /* renamed from: B */
    private InnerEffectTextLayoutConfig f107583B;

    /* renamed from: C */
    private boolean f107584C;

    /* renamed from: a */
    final View f107585a;

    /* renamed from: b */
    final View f107586b;

    /* renamed from: c */
    final View f107587c;

    /* renamed from: d */
    final View f107588d;

    /* renamed from: e */
    final C46104o f107589e;

    static {
        Covode.recordClassIndex(54744);
    }

    public final InnerEffectTextLayoutConfig getEffectTextLayoutConfig() {
        return this.f107583B;
    }

    public final boolean getEffectTextMode() {
        return this.f107584C;
    }

    /* renamed from: a */
    public final void mo78406a() {
        if (this.f107749i == null) {
            this.f107749i = new ArrayList();
        }
        this.f107582A.mo78373a();
        List<TextStickerTextWrap> list = this.f107749i;
        C89219l.m154716b(list, "");
        m89108c(list, this.f107583B);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    public final RectF getCurrentHelpBoxRect() {
        if (this.f107584C) {
            return getEffectTextRect();
        }
        C46047c cVar = this.f107757q;
        C89219l.m154716b(cVar, "");
        RectF a = cVar.mo77724a();
        C89219l.m154716b(a, "");
        return a;
    }

    private final RectF getEffectTextRect() {
        C46161n nVar = this.f107582A;
        Matrix matrix = nVar.getMatrix();
        C89219l.m154716b(matrix, "");
        Context context = nVar.getContext();
        C89219l.m154716b(context, "");
        if (C84912r.m145935c(context)) {
            matrix.setTranslate(nVar.getX(), nVar.getY());
            matrix.preTranslate(nVar.getScaleX(), nVar.getScaleY());
        }
        Rect rect = new Rect();
        nVar.getDrawingRect(rect);
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        return rectF;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    public final PointF[] getAnglePointList() {
        if (this.f107584C) {
            RectF effectTextRect = getEffectTextRect();
            return new PointF[]{new PointF(effectTextRect.left, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.bottom), new PointF(effectTextRect.left, effectTextRect.bottom)};
        }
        PointF[] anglePointList = super.getAnglePointList();
        C89219l.m154716b(anglePointList, "");
        return anglePointList;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    public final PointF[] getAnglePointListForBlock() {
        if (this.f107584C) {
            RectF effectTextRect = getEffectTextRect();
            return new PointF[]{new PointF(effectTextRect.left, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.bottom), new PointF(effectTextRect.left, effectTextRect.bottom)};
        }
        PointF[] anglePointListForBlock = super.getAnglePointListForBlock();
        C89219l.m154716b(anglePointListForBlock, "");
        return anglePointListForBlock;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    /* renamed from: b */
    public final TextStickerData mo78410b() {
        if (this.f107760t == null) {
            this.f107760t = new TextStickerData("", this.f107750j, this.f107751k, this.f107748h.f107215d, this.f107752l, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
            TextStickerData textStickerData = this.f107760t;
            List<TextStickerTextWrap> list = this.f107749i;
            C89219l.m154716b(list, "");
            textStickerData.setTextWrapList(list);
        }
        this.f107760t.setX(this.f107746f);
        this.f107760t.setY(this.f107747g);
        this.f107760t.setRotation(this.f107748h.f107213b);
        this.f107760t.setScale(this.f107748h.f107212a);
        TextStickerData textStickerData2 = this.f107760t;
        List<TextStickerTextWrap> list2 = this.f107749i;
        C89219l.m154716b(list2, "");
        textStickerData2.setTextWrapList(list2);
        this.f107760t.setBgMode(this.f107750j);
        this.f107760t.setColor(this.f107751k);
        this.f107760t.setAlign(this.f107748h.f107215d);
        this.f107760t.setFontType(this.f107752l);
        TextStickerData textStickerData3 = this.f107760t;
        C89219l.m154716b(textStickerData3, "");
        return textStickerData3;
    }

    public final void setEffectTextLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.f107583B = innerEffectTextLayoutConfig;
    }

    public final void setEffectTextMode(boolean z) {
        this.f107584C = z;
    }

    /* renamed from: a */
    private static List<TextStickerTextWrap> m89107a(List<TextStickerTextWrap> list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i = C45849b.m88473a().f106763c;
        int i2 = 0;
        for (TextStickerTextWrap textStickerTextWrap : list) {
            if (i2 >= i) {
                break;
            } else if (textStickerTextWrap.getText().length() + i2 <= i) {
                arrayList.add(textStickerTextWrap);
                i2 += textStickerTextWrap.getText().length();
            } else {
                String text = textStickerTextWrap.getText();
                Objects.requireNonNull(text, "null cannot be cast to non-null type java.lang.String");
                String substring = text.substring(0, i - i2);
                C89219l.m154716b(substring, "");
                arrayList.add(C46110t.m88959a(substring, false));
                i2 = i;
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    /* renamed from: b */
    public final void mo78411b(boolean z) {
        if (z) {
            super.mo78411b(z);
        } else if (this.f107760t != null && this.f107760t.hasPositionData()) {
            if (this.f107760t.getCoverExtraData().isPortrait() == this.f107589e.f107352a) {
                this.f107746f = this.f107760t.getX();
                this.f107747g = this.f107760t.getY();
            }
            this.f107748h.f107213b = this.f107760t.getRotation();
            this.f107748h.f107212a = this.f107760t.getScale();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f107584C) {
            C46161n nVar = this.f107582A;
            nVar.setX(this.f107746f - (((float) nVar.getWidth()) / 2.0f));
            nVar.setY(this.f107747g - (((float) nVar.getHeight()) / 2.0f));
            nVar.setRotation(this.f107748h.f107213b);
            nVar.setScaleX(this.f107748h.f107212a);
            nVar.setScaleY(this.f107748h.f107212a);
            C46161n nVar2 = this.f107582A;
            C46049e eVar = this.f107759s;
            C89219l.m154716b(eVar, "");
            if (eVar.f107289i) {
                drawable = nVar2.f107497b;
            } else {
                drawable = null;
            }
            nVar2.setBackground(drawable);
        } else {
            mo78537a(canvas);
        }
        this.f107758r.mo77727a(this.f107748h.f107212a, this.f107748h.f107213b, this.f107746f, this.f107747g);
        this.f107758r.mo77728b(this.f107748h.f107212a, this.f107748h.f107213b, this.f107746f, this.f107747g);
    }

    /* renamed from: a */
    public final void mo78408a(boolean z) {
        if (!z) {
            this.f107585a.setVisibility(4);
            this.f107586b.setVisibility(4);
            this.f107587c.setVisibility(4);
            this.f107588d.setVisibility(4);
        } else if (this.f107589e.f107352a) {
            this.f107585a.setVisibility(0);
            this.f107586b.setVisibility(0);
            this.f107587c.setVisibility(4);
            this.f107588d.setVisibility(4);
        } else {
            this.f107585a.setVisibility(4);
            this.f107586b.setVisibility(4);
            this.f107587c.setVisibility(0);
            this.f107588d.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    /* renamed from: b */
    public final boolean mo78412b(float f, float f2) {
        if (this.f107584C) {
            return mo78539a(getEffectTextRect(), f, f2);
        }
        return mo78551e(f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    /* renamed from: a */
    public final boolean mo78409a(float f, float f2) {
        if (this.f107584C) {
            return mo78539a(getEffectTextRect(), f, f2);
        }
        return mo78551e(f, f2 - ((float) this.f107756p));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    /* renamed from: c */
    public final PointF mo78413c(float f, float f2) {
        float f3;
        float f4;
        float f5;
        PointF c = super.mo78413c(f, f2);
        if (this.f107589e.f107353b == 0.0f) {
            f3 = 1.0f;
        } else {
            f3 = this.f107589e.f107353b;
        }
        if (this.f107589e.f107352a) {
            f5 = c.x / f3;
            f4 = ((((float) (-getHeight())) * (1.0f - f3)) / 2.0f) + (c.y / f3);
        } else {
            f4 = c.y / f3;
            f5 = (c.x / f3) + ((((float) (-getWidth())) * (1.0f - f3)) / 2.0f);
        }
        return new PointF(f5, f4);
    }

    /* renamed from: c */
    private final void m89108c(List<TextStickerTextWrap> list, Object obj) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = (InnerEffectTextLayoutConfig) obj;
        this.f107583B = innerEffectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            this.f107584C = true;
            this.f107582A.setInnerLayoutConfig(innerEffectTextLayoutConfig);
            this.f107582A.setVisibility(0);
            C46161n nVar = this.f107582A;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (T t : list) {
                    arrayList.add(new C46105p(t.getText(), t.getSelectionStart(), t.isReplaceString(), false, 8));
                }
            }
            nVar.setText(arrayList);
            return;
        }
        this.f107584C = false;
        this.f107582A.setVisibility(4);
        List<TextStickerTextWrap> a = m89107a(list);
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : a) {
            if (t2.safeStrPair().f107313a.length() > 0) {
                arrayList2.add(t2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (!(!arrayList3.isEmpty()) || arrayList3 == null) {
            this.f107757q.mo77726a(C89070n.m154525d(C46110t.m88959a("", false)));
            return;
        }
        this.f107757q.mo77726a(arrayList3);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q
    /* renamed from: a */
    public final void mo78407a(List<TextStickerTextWrap> list, Object obj) {
        C89219l.m154721d(list, "");
        this.f107749i = list;
        List<TextStickerTextWrap> list2 = this.f107749i;
        String string = getContext().getString(R.string.eqe);
        C89219l.m154716b(string, "");
        C89219l.m154721d(string, "");
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            for (TextStickerTextWrap textStickerTextWrap : list2) {
                String text = textStickerTextWrap.getText();
                if (text == null || text.length() == 0) {
                    arrayList.add(C46110t.m88959a(string, true));
                } else {
                    arrayList.add(textStickerTextWrap);
                }
            }
        }
        m89108c(arrayList, obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46185q(Context context, SafeHandler safeHandler, TextStickerData textStickerData, C46104o oVar) {
        super(context, safeHandler, textStickerData, false, null, false);
        C89219l.m154721d(context, "");
        C89219l.m154721d(safeHandler, "");
        C89219l.m154721d(oVar, "");
        MethodCollector.m26663i(11442);
        this.f107589e = oVar;
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        C46161n nVar = new C46161n(context2);
        nVar.setEditable(false);
        nVar.setMaxTextWidth(oVar.f107354c);
        nVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        nVar.setVisibility(4);
        this.f107582A = nVar;
        View view = new View(getContext());
        view.setBackgroundColor(C0643b.m2378c(view.getContext(), R.color.bl));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        view.setLayoutParams(layoutParams);
        view.setVisibility(4);
        this.f107585a = view;
        View view2 = new View(getContext());
        view2.setBackgroundColor(C0643b.m2378c(view2.getContext(), R.color.bl));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        view2.setLayoutParams(layoutParams2);
        view2.setVisibility(4);
        this.f107586b = view2;
        View view3 = new View(getContext());
        view3.setBackgroundColor(C0643b.m2378c(view3.getContext(), R.color.bl));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 3;
        view3.setLayoutParams(layoutParams3);
        view3.setVisibility(4);
        this.f107587c = view3;
        View view4 = new View(getContext());
        view4.setBackgroundColor(C0643b.m2378c(view4.getContext(), R.color.bl));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 5;
        view4.setLayoutParams(layoutParams4);
        view4.setVisibility(4);
        this.f107588d = view4;
        addView(nVar);
        addView(view);
        addView(view2);
        addView(view3);
        addView(view4);
        post(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46185q.RunnableC461861 */

            /* renamed from: a */
            final /* synthetic */ C46185q f107590a;

            static {
                Covode.recordClassIndex(54745);
            }

            {
                this.f107590a = r1;
            }

            public final void run() {
                C46185q qVar = this.f107590a;
                if (qVar.f107589e.f107352a) {
                    int width = qVar.getWidth();
                    int height = (qVar.getHeight() - ((qVar.getWidth() * 4) / 3)) / 2;
                    ViewGroup.LayoutParams layoutParams = qVar.f107585a.getLayoutParams();
                    layoutParams.width = width;
                    layoutParams.height = height;
                    qVar.f107585a.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = qVar.f107586b.getLayoutParams();
                    layoutParams2.width = width;
                    layoutParams2.height = height;
                    qVar.f107586b.setLayoutParams(layoutParams2);
                    return;
                }
                int height2 = qVar.getHeight();
                int width2 = (qVar.getWidth() - ((qVar.getHeight() * 3) / 4)) / 2;
                ViewGroup.LayoutParams layoutParams3 = qVar.f107587c.getLayoutParams();
                layoutParams3.width = width2;
                layoutParams3.height = height2;
                qVar.f107587c.setLayoutParams(layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = qVar.f107588d.getLayoutParams();
                layoutParams4.width = width2;
                layoutParams4.height = height2;
                qVar.f107588d.setLayoutParams(layoutParams4);
            }
        });
        this.f107759s.f107300t = null;
        this.f107759s.f107292l = 1000;
        MethodCollector.m26664o(11442);
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        C89219l.m154721d(view, "");
        if (C89219l.m154714a(view, this.f107582A)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i3) - ((((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4)), 0));
            return;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }
}
