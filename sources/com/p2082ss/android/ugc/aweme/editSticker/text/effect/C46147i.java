package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.p2082ss.android.ugc.aweme.editSticker.C45849b;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45884c;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45886d;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.EnumC46088f;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.EnumC46094j;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.EnumC46096k;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.i */
public final class C46147i extends AppCompatEditText {

    /* renamed from: a */
    InnerEffectTextConfig f107427a;

    /* renamed from: b */
    public final List<C20376an<InnerEffectTextBgConfig, Bitmap, NinePatch, Rect>> f107428b;

    /* renamed from: c */
    public int f107429c;

    /* renamed from: d */
    private Paint f107430d;

    /* renamed from: e */
    private final List<C20375am<InnerEffectTextCoverConfig, TextPaint, List<TextPaint>>> f107431e;

    /* renamed from: f */
    private final List<TextPaint> f107432f;

    /* renamed from: g */
    private final C46193v f107433g;

    /* renamed from: h */
    private final C46188s f107434h;

    /* renamed from: i */
    private int f107435i;

    /* renamed from: j */
    private final AbstractC89516am f107436j;

    /* renamed from: k */
    private final Paint.FontMetrics f107437k;

    static {
        Covode.recordClassIndex(54706);
    }

    public final InnerEffectTextConfig getInnerTextConfig() {
        return this.f107427a;
    }

    public final int getMaxViewWidth() {
        return this.f107435i;
    }

    /* renamed from: a */
    private final void m89075a() {
        List<InnerEffectTextStrokeConfig> strokeConfigs;
        InnerEffectTextConfig innerEffectTextConfig = this.f107427a;
        if (!(innerEffectTextConfig == null || (strokeConfigs = innerEffectTextConfig.getStrokeConfigs()) == null)) {
            for (T t : strokeConfigs) {
                TextPaint textPaint = new TextPaint();
                textPaint.set(getPaint());
                textPaint.setStrokeWidth(t.getStrokeWidth() * 2.0f);
                textPaint.setColor(t.getStrokeColor());
                textPaint.setStrokeJoin(t.getStrokeJoin());
                textPaint.setStyle(Paint.Style.STROKE);
                this.f107432f.add(textPaint);
            }
        }
    }

    public final void setMaxViewWidth(int i) {
        if (i > 0) {
            this.f107435i = i;
        }
    }

    public final void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    public final void setTextColor(boolean z) {
        InnerEffectTextConfig innerEffectTextConfig = this.f107427a;
        if (innerEffectTextConfig == null) {
            return;
        }
        if (z) {
            setTextColor(innerEffectTextConfig.getReplaceStringColor());
        } else if (innerEffectTextConfig.getGradientType() == EnumC46096k.NONE) {
            setTextColor(innerEffectTextConfig.getTextColorStart());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.i$b */
    static final class C46151b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f107445a;

        /* renamed from: b */
        final /* synthetic */ C46147i f107446b;

        static {
            Covode.recordClassIndex(54710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46151b(C46147i iVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f107446b = iVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46151b(this.f107446b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46151b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f107445a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C46147i iVar = this.f107446b;
                this.f107445a = 1;
                Object a = C89624i.m155554a(C89546bf.f203267b, new C46149a(iVar, iVar.f107427a, null), this);
                if (a != EnumC89098a.COROUTINE_SUSPENDED) {
                    a = C89391z.f203057a;
                }
                if (a == obj2) {
                    return obj2;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f107446b.requestLayout();
            this.f107446b.invalidate();
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C46147i(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        this.f107430d = new Paint(3);
        this.f107431e = new ArrayList();
        this.f107432f = new ArrayList();
        this.f107428b = new ArrayList();
        this.f107433g = new C46193v();
        this.f107434h = new C46188s();
        this.f107429c = 1;
        this.f107435i = getMaxWidth();
        this.f107436j = C45884c.m88525a();
        addTextChangedListener(new TextWatcher(this) {
            /* class com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46147i.C461481 */

            /* renamed from: a */
            final /* synthetic */ C46147i f107438a;

            static {
                Covode.recordClassIndex(54707);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f107438a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                C46147i iVar = this.f107438a;
                int i = iVar.f107429c;
                int i2 = C45849b.m88473a().f106763c;
                C46147i iVar2 = this.f107438a;
                C45886d.m88528a(iVar, i, i2, Integer.valueOf(C45886d.m88526a(iVar2, iVar2.getMaxViewWidth())));
            }
        });
        this.f107437k = new Paint.FontMetrics();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.i$a */
    public static final class C46149a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f107439a;

        /* renamed from: b */
        final /* synthetic */ C46147i f107440b;

        /* renamed from: c */
        final /* synthetic */ InnerEffectTextConfig f107441c;

        static {
            Covode.recordClassIndex(54708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46149a(C46147i iVar, InnerEffectTextConfig innerEffectTextConfig, AbstractC89124d dVar) {
            super(2, dVar);
            this.f107440b = iVar;
            this.f107441c = innerEffectTextConfig;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46149a(this.f107440b, this.f107441c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46149a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0030 A[SYNTHETIC] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
            // Method dump skipped, instructions count: 311
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46147i.C46149a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Layout layout;
        if (this.f107427a != null) {
            if (canvas != null) {
                for (T t : this.f107428b) {
                    C c = t.f48265c;
                    if (c != null) {
                        c.draw(canvas, t.f48266d);
                    } else {
                        canvas.drawBitmap((Bitmap) t.f48264b, (Rect) null, (Rect) t.f48266d, this.f107430d);
                    }
                }
            }
            getPaint().getFontMetrics(this.f107437k);
            if (canvas != null) {
                int save = canvas.save();
                canvas.translate((float) getPaddingLeft(), ((float) getBaseline()) + this.f107437k.top);
                try {
                    Layout layout2 = getLayout();
                    if (layout2 != null) {
                        for (T t2 : this.f107431e) {
                            for (TextPaint textPaint : t2.f48262c) {
                                C46193v vVar = this.f107433g;
                                String valueOf = String.valueOf(getText());
                                int width = layout2.getWidth();
                                Layout.Alignment alignment = layout2.getAlignment();
                                C89219l.m154716b(alignment, "");
                                C46130b.m89021a(C46193v.m89125a(vVar, valueOf, textPaint, width, alignment, layout2.getSpacingMultiplier(), layout2.getSpacingAdd(), layout2.getEllipsizedWidth()), canvas, t2.f48260a.getOffsetX(), t2.f48260a.getOffsetY());
                            }
                            int width2 = layout2.getWidth();
                            Layout.Alignment alignment2 = layout2.getAlignment();
                            C89219l.m154716b(alignment2, "");
                            StaticLayout a = C46193v.m89125a(this.f107433g, String.valueOf(getText()), t2.f48261b, width2, alignment2, layout2.getSpacingMultiplier(), layout2.getSpacingAdd(), layout2.getEllipsizedWidth());
                            m89076a(t2.f48261b, t2.f48260a.getTextColorStart(), t2.f48260a.getTextColorEnd(), t2.f48260a.getGradientType(), t2.f48260a.getGradientOrientation(), a.getWidth(), a.getHeight());
                            C46130b.m89021a(a, canvas, t2.f48260a.getOffsetX(), t2.f48260a.getOffsetY());
                        }
                    }
                    Layout layout3 = getLayout();
                    if (layout3 != null) {
                        Iterator<T> it = this.f107432f.iterator();
                        while (it.hasNext()) {
                            C46193v vVar2 = this.f107433g;
                            String valueOf2 = String.valueOf(getText());
                            int width3 = layout3.getWidth();
                            Layout.Alignment alignment3 = layout3.getAlignment();
                            C89219l.m154716b(alignment3, "");
                            C46130b.m89021a(C46193v.m89125a(vVar2, valueOf2, it.next(), width3, alignment3, layout3.getSpacingMultiplier(), layout3.getSpacingAdd(), layout3.getEllipsizedWidth()), canvas, 0.0f, 0.0f);
                        }
                    }
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
        InnerEffectTextConfig innerEffectTextConfig = this.f107427a;
        if (!(innerEffectTextConfig == null || innerEffectTextConfig.getGradientType() == EnumC46096k.NONE || (layout = getLayout()) == null)) {
            TextPaint paint = getPaint();
            C89219l.m154716b(paint, "");
            m89076a(paint, innerEffectTextConfig.getTextColorStart(), innerEffectTextConfig.getTextColorEnd(), innerEffectTextConfig.getGradientType(), innerEffectTextConfig.getGradientOrientation(), layout.getWidth(), layout.getHeight());
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setInnerTextConfig(com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig r12) {
        /*
        // Method dump skipped, instructions count: 584
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46147i.setInnerTextConfig(com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig):void");
    }

    public /* synthetic */ C46147i(Context context, byte b) {
        this(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        for (T t : this.f107428b) {
            A a = t.f48263a;
            D d = t.f48266d;
            if (C46152j.f107449c[a.getDimensionModeWidth().ordinal()] != 1) {
                d.set(a.getMarginStart(), ((Rect) d).top, measuredWidth - a.getMarginEnd(), ((Rect) d).bottom);
            } else {
                int gravity = a.getGravity();
                if ((EnumC46088f.LEFT.getGravity() & gravity) != EnumC46088f.LEFT.getGravity() || (gravity & EnumC46088f.RIGHT.getGravity()) == EnumC46088f.RIGHT.getGravity()) {
                    int gravity2 = a.getGravity();
                    if ((EnumC46088f.LEFT.getGravity() & gravity2) == EnumC46088f.LEFT.getGravity() && (gravity2 & EnumC46088f.RIGHT.getGravity()) == EnumC46088f.RIGHT.getGravity()) {
                        int width = (measuredWidth - a.getWidth()) / 2;
                        d.set(width, ((Rect) d).top, a.getWidth() + width, ((Rect) d).bottom);
                    } else {
                        int gravity3 = a.getGravity();
                        if ((EnumC46088f.LEFT.getGravity() & gravity3) == EnumC46088f.LEFT.getGravity() || (gravity3 & EnumC46088f.RIGHT.getGravity()) != EnumC46088f.RIGHT.getGravity()) {
                            d.set(a.getMarginStart(), ((Rect) d).top, a.getMarginStart() + a.getWidth(), ((Rect) d).bottom);
                        } else {
                            d.set((measuredWidth - a.getWidth()) - a.getMarginEnd(), ((Rect) d).top, measuredWidth - a.getMarginEnd(), ((Rect) d).bottom);
                        }
                    }
                } else {
                    d.set(a.getMarginStart(), ((Rect) d).top, a.getMarginStart() + a.getWidth(), ((Rect) d).bottom);
                }
            }
            if (C46152j.f107450d[a.getDimensionModeHeight().ordinal()] != 1) {
                d.set(((Rect) d).left, a.getMarginTop(), ((Rect) d).right, measuredHeight - a.getMarginBottom());
            } else {
                int gravity4 = a.getGravity();
                if ((EnumC46088f.TOP.getGravity() & gravity4) != EnumC46088f.TOP.getGravity() || (gravity4 & EnumC46088f.BOTTOM.getGravity()) == EnumC46088f.BOTTOM.getGravity()) {
                    int gravity5 = a.getGravity();
                    if ((EnumC46088f.TOP.getGravity() & gravity5) == EnumC46088f.TOP.getGravity() && (gravity5 & EnumC46088f.BOTTOM.getGravity()) == EnumC46088f.BOTTOM.getGravity()) {
                        int height = (measuredHeight - a.getHeight()) / 2;
                        d.set(((Rect) d).left, height, ((Rect) d).right, a.getHeight() + height);
                    } else {
                        int gravity6 = a.getGravity();
                        if ((EnumC46088f.TOP.getGravity() & gravity6) == EnumC46088f.TOP.getGravity() || (gravity6 & EnumC46088f.BOTTOM.getGravity()) != EnumC46088f.BOTTOM.getGravity()) {
                            d.set(((Rect) d).left, a.getMarginTop(), ((Rect) d).right, a.getMarginTop() + a.getHeight());
                        } else {
                            d.set(((Rect) d).left, (measuredHeight - a.getHeight()) - a.getMarginBottom(), ((Rect) d).right, measuredHeight - a.getMarginBottom());
                        }
                    }
                } else {
                    d.set(((Rect) d).left, a.getMarginTop(), ((Rect) d).right, a.getMarginTop() + a.getHeight());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m89076a(TextPaint textPaint, int i, int i2, EnumC46096k kVar, EnumC46094j jVar, int i3, int i4) {
        int i5 = C46152j.f107448b[kVar.ordinal()];
        if (i5 == 1) {
            int i6 = C46152j.f107447a[jVar.ordinal()];
            if (i6 == 1) {
                textPaint.setShader(this.f107434h.mo78424a(i, i2, 0, i4));
            } else if (i6 == 2) {
                textPaint.setShader(this.f107434h.mo78424a(i, i2, i3, 0));
            }
        } else if (i5 == 2) {
            textPaint.setColor(i);
        }
    }
}
