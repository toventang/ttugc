package com.p2082ss.android.ugc.aweme.story.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.widget.RoundCornerImageView */
public final class RoundCornerImageView extends AppCompatImageView {

    /* renamed from: a */
    private final AbstractC89244h f172039a;

    /* renamed from: b */
    private final int f172040b;

    static {
        Covode.recordClassIndex(89645);
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Path getPath() {
        return (Path) this.f172039a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.widget.RoundCornerImageView$a */
    static final class C76652a extends AbstractC89220m implements AbstractC89171a<Path> {

        /* renamed from: a */
        public static final C76652a f172041a = new C76652a();

        static {
            Covode.recordClassIndex(89646);
        }

        C76652a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Path invoke() {
            return new Path();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public final void draw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        if (this.f172040b > 0) {
            Path path = getPath();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
            int i = this.f172040b;
            path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
            canvas.clipPath(getPath());
        }
        try {
            super.draw(canvas);
        } catch (Throwable unused) {
        }
    }

    private /* synthetic */ RoundCornerImageView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RoundCornerImageView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f172039a = C89250i.m154773a((AbstractC89171a) C76652a.f172041a);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a8n}, 0, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f172040b = dimensionPixelSize;
    }
}
