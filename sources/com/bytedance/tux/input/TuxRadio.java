package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.C0439n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22988k;
import com.bytedance.tux.p1708b.p1709a.C22973a;
import com.bytedance.tux.p1710c.AbstractC23010g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public final class TuxRadio extends C0439n implements AbstractC23176a {

    /* renamed from: a */
    private final C22988k<TextView> f54860a;

    /* renamed from: b */
    private boolean f54861b;

    /* renamed from: c */
    private AbstractC89171a<Boolean> f54862c;

    static {
        Covode.recordClassIndex(27105);
    }

    public TuxRadio(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: com.bytedance.tux.input.TuxRadio$a */
    static final class C23172a extends AbstractC23010g {

        /* renamed from: a */
        private final int f54863a;

        /* renamed from: b */
        private final Paint f54864b = new Paint();

        /* renamed from: c */
        private final int f54865c;

        static {
            Covode.recordClassIndex(27106);
        }

        public final int getIntrinsicHeight() {
            return this.f54863a;
        }

        public final int getIntrinsicWidth() {
            return this.f54863a;
        }

        public C23172a(int i) {
            this.f54865c = i;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            this.f54863a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        }

        public final void draw(Canvas canvas) {
            C89219l.m154719c(canvas, "");
            int i = this.f54863a;
            float f = ((float) i) / 2.0f;
            float f2 = ((float) i) / 12.0f;
            this.f54864b.setAntiAlias(true);
            this.f54864b.setStyle(Paint.Style.STROKE);
            this.f54864b.setStrokeWidth(f2);
            this.f54864b.setColor(this.f54865c);
            canvas.drawCircle(f, f, f - (f2 / 2.0f), this.f54864b);
            this.f54864b.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f, f, ((float) i) / 3.0f, this.f54864b);
        }
    }

    /* renamed from: com.bytedance.tux.input.TuxRadio$b */
    static final class C23173b extends AbstractC23010g {

        /* renamed from: a */
        private final int f54866a;

        /* renamed from: b */
        private final Paint f54867b = new Paint();

        /* renamed from: c */
        private final int f54868c;

        /* renamed from: d */
        private final int f54869d;

        static {
            Covode.recordClassIndex(27107);
        }

        public final int getIntrinsicHeight() {
            return this.f54866a;
        }

        public final int getIntrinsicWidth() {
            return this.f54866a;
        }

        public final void draw(Canvas canvas) {
            C89219l.m154719c(canvas, "");
            int i = this.f54866a;
            float f = ((float) i) / 2.0f;
            float f2 = ((float) i) / 16.0f;
            this.f54867b.setAntiAlias(true);
            this.f54867b.setStyle(Paint.Style.FILL);
            this.f54867b.setColor(this.f54869d);
            canvas.drawCircle(f, f, f - f2, this.f54867b);
            this.f54867b.setStyle(Paint.Style.STROKE);
            this.f54867b.setStrokeWidth(f2);
            this.f54867b.setColor(this.f54868c);
            canvas.drawCircle(f, f, f - (f2 / 2.0f), this.f54867b);
        }

        public C23173b(int i, int i2) {
            this.f54868c = i;
            this.f54869d = i2;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            this.f54866a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        }
    }

    public final void toggle() {
        Boolean invoke;
        AbstractC89171a<Boolean> aVar = this.f54862c;
        if (aVar == null || (invoke = aVar.invoke()) == null || !invoke.booleanValue()) {
            super.toggle();
        }
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
    }

    @Override // com.bytedance.tux.input.AbstractC23176a
    public final void setInterceptToggleListener(AbstractC89171a<Boolean> aVar) {
        this.f54862c = aVar;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f54861b) {
            this.f54860a.mo37302a(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxRadio(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        C22988k<TextView> kVar = new C22988k<>(new C22973a());
        this.f54860a = kVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aqb, R.attr.aqc, R.attr.aqd}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        int color3 = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f54861b = true;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, new C23172a(color));
        stateListDrawable.addState(new int[0], new C23173b(color2, color3));
        setButtonDrawable(stateListDrawable);
        kVar.mo37303a(this, (int) R.attr.er);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxRadio(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.c2 : i);
    }
}
