package com.bytedance.tux.sheet.sheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxSheetHandle extends FrameLayout {

    /* renamed from: a */
    public boolean f55029a;

    /* renamed from: b */
    public float f55030b;

    /* renamed from: c */
    private int f55031c;

    /* renamed from: d */
    private final C23225b f55032d;

    /* renamed from: e */
    private HashMap f55033e;

    /* renamed from: com.bytedance.tux.sheet.sheet.TuxSheetHandle$a */
    public enum EnumC23224a {
        DEFAULT,
        BOTTOM,
        TOP;

        static {
            Covode.recordClassIndex(27165);
        }
    }

    static {
        Covode.recordClassIndex(27164);
    }

    public TuxSheetHandle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public final BottomSheetBehavior.AbstractC26607a getBottomSheetCallback() {
        return this.f55032d;
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.TuxSheetHandle$b */
    public static final class C23225b extends BottomSheetBehavior.AbstractC26607a {

        /* renamed from: a */
        final /* synthetic */ TuxSheetHandle f55035a;

        static {
            Covode.recordClassIndex(27166);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C23225b(TuxSheetHandle tuxSheetHandle) {
            this.f55035a = tuxSheetHandle;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37775a(View view, int i) {
            C89219l.m154719c(view, "");
            if (i == 3 || i == 4 || i == 5 || i == 6) {
                this.f55035a.f55029a = false;
                this.f55035a.mo37807a(EnumC23224a.DEFAULT);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37774a(View view, float f) {
            EnumC23224a aVar;
            C89219l.m154719c(view, "");
            if (!this.f55035a.f55029a) {
                this.f55035a.f55029a = true;
                this.f55035a.f55030b = f;
            }
            if (f > this.f55035a.f55030b) {
                aVar = EnumC23224a.TOP;
            } else if (f < this.f55035a.f55030b) {
                aVar = EnumC23224a.BOTTOM;
            } else {
                aVar = EnumC23224a.DEFAULT;
            }
            this.f55035a.mo37807a(aVar);
        }
    }

    private final void setImageDrawable(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        C89219l.m154709a((Object) mutate, "");
        C0705a.m2494a(mutate, this.f55031c);
        if (this.f55033e == null) {
            this.f55033e = new HashMap();
        }
        View view = (View) this.f55033e.get(Integer.valueOf((int) R.id.dzk));
        if (view == null) {
            view = findViewById(R.id.dzk);
            this.f55033e.put(Integer.valueOf((int) R.id.dzk), view);
        }
        ((ImageView) view).setImageDrawable(mutate);
    }

    /* renamed from: a */
    public final void mo37807a(EnumC23224a aVar) {
        int i;
        int i2 = C23234b.f55064a[aVar.ordinal()];
        if (i2 == 1) {
            i = R.drawable.l;
        } else if (i2 != 2) {
            i = R.drawable.n;
        } else {
            i = R.drawable.m;
        }
        Drawable a = C0643b.m2369a(getContext(), i);
        if (a != null) {
            C89219l.m154709a((Object) a, "");
            setImageDrawable(a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSheetHandle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9029);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.es, R.attr.et, R.attr.eu, R.attr.ev, R.attr.ew, R.attr.ex, R.attr.ey, R.attr.ez, R.attr.f0, R.attr.f1, R.attr.f2, R.attr.f3, R.attr.f4, R.attr.f5, R.attr.f6, R.attr.f7, R.attr.f8, R.attr.f9, R.attr.f_, R.attr.fa}, R.attr.c3, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        this.f55031c = obtainStyledAttributes.getColor(7, Color.parseColor("#33161823"));
        obtainStyledAttributes.recycle();
        this.f55032d = new C23225b(this);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.r, this, true);
        mo37807a(EnumC23224a.DEFAULT);
        MethodCollector.m26664o(9029);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxSheetHandle(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.c3 : i);
    }
}
