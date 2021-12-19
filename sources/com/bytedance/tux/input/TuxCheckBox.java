package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1708b.C22988k;
import com.bytedance.tux.p1708b.p1709a.AbstractC22974b;
import com.bytedance.tux.p1708b.p1709a.C22977e;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxCheckBox extends AppCompatCheckBox implements AbstractC23176a {

    /* renamed from: a */
    public Drawable f54841a;

    /* renamed from: b */
    public int f54842b;

    /* renamed from: c */
    private final boolean f54843c;

    /* renamed from: d */
    private final C22988k<TuxCheckBox> f54844d;

    /* renamed from: e */
    private AbstractC89171a<Boolean> f54845e;

    /* renamed from: f */
    private final ColorMatrixColorFilter f54846f;

    /* renamed from: g */
    private final ColorMatrixColorFilter f54847g;

    static {
        Covode.recordClassIndex(27100);
    }

    public TuxCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public final void toggle() {
        Boolean invoke;
        AbstractC89171a<Boolean> aVar = this.f54845e;
        if (aVar == null || (invoke = aVar.invoke()) == null || !invoke.booleanValue()) {
            super.toggle();
        }
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
    }

    @Override // com.bytedance.tux.input.AbstractC23176a
    public final void setInterceptToggleListener(AbstractC89171a<Boolean> aVar) {
        this.f54845e = aVar;
    }

    /* renamed from: com.bytedance.tux.input.TuxCheckBox$a */
    final class C23170a extends AbstractC22974b<TuxCheckBox> {

        /* renamed from: b */
        private final C22977e f54849b = new C22977e();

        static {
            Covode.recordClassIndex(27101);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C23170a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
        @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
        /* renamed from: a */
        public final /* synthetic */ Map mo37289a(TuxCheckBox tuxCheckBox, Map map) {
            C89219l.m154719c(tuxCheckBox, "");
            C89219l.m154719c(map, "");
            return super.mo37289a(tuxCheckBox, this.f54849b.mo37289a(tuxCheckBox, map));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
        @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
        /* renamed from: a */
        public final /* synthetic */ boolean mo37290a(TuxCheckBox tuxCheckBox, int i, Object obj) {
            C89219l.m154719c(tuxCheckBox, "");
            C89219l.m154719c(obj, "");
            if (i == C22983g.m43346t().f54332a) {
                TuxCheckBox tuxCheckBox2 = TuxCheckBox.this;
                Context context = tuxCheckBox2.getContext();
                C89219l.m154709a((Object) context, "");
                C22983g.m43346t();
                C89219l.m154719c(obj, "");
                int intValue = ((Number) obj).intValue();
                C89219l.m154719c(context, "");
                tuxCheckBox2.f54841a = (Drawable) C23155d.m43643a(context, intValue, new C23155d.C23157b(context));
                TuxCheckBox tuxCheckBox3 = TuxCheckBox.this;
                tuxCheckBox3.setButtonDrawable(tuxCheckBox3.f54841a);
                return true;
            } else if (i != C22983g.m43347u().f54332a) {
                return false;
            } else {
                TuxCheckBox tuxCheckBox4 = TuxCheckBox.this;
                C22983g.m43347u();
                C89219l.m154719c(obj, "");
                tuxCheckBox4.f54842b = ((Number) obj).intValue();
                return true;
            }
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f54843c) {
            this.f54844d.mo37302a(this);
        }
    }

    public final void setShape(int i) {
        this.f54844d.mo37304a(this, R.attr.aop, i);
    }

    public final void setSize(int i) {
        this.f54844d.mo37304a(this, R.attr.aoq, i);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (canvas != null && (drawable = this.f54841a) != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (isChecked()) {
                colorMatrixColorFilter = this.f54846f;
            } else {
                colorMatrixColorFilter = this.f54847g;
            }
            drawable.setColorFilter(colorMatrixColorFilter);
            float height = ((float) getHeight()) / ((float) intrinsicHeight);
            canvas.save();
            canvas.scale(height, height);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = this.f54842b;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        int i4 = this.f54842b;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        C22988k<TuxCheckBox> kVar = new C22988k<>(new C23170a());
        this.f54844d = kVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aoo, R.attr.aop, R.attr.aoq, R.attr.aor}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int i2 = obtainStyledAttributes.getInt(1, 0);
        int i3 = obtainStyledAttributes.getInt(2, 0);
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        this.f54846f = C23163i.m43656a(color);
        this.f54847g = C23163i.m43656a(color2);
        this.f54843c = true;
        setShape(i2);
        setSize(i3);
        kVar.mo37303a(this, (int) R.attr.cv);
        setGravity(51);
        setBackground(null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.bp : i);
    }
}
