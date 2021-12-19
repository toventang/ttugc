package com.bytedance.tux.p1722h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.badge.C22993a;
import com.bytedance.tux.badge.C22995c;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.h.i */
public final class C23163i {

    /* renamed from: a */
    public static final Rect f54817a = new Rect();

    /* renamed from: b */
    private static final Map<View, View.OnLayoutChangeListener> f54818b = new LinkedHashMap();

    /* renamed from: a */
    public static final boolean m43664a(View view) {
        C89219l.m154719c(view, "");
        return C0792v.m2768e(view) == 1;
    }

    static {
        Covode.recordClassIndex(27092);
    }

    /* renamed from: b */
    public static void m43666b(View view) {
        C89219l.m154719c(view, "");
        view.setOnTouchListener(new View$OnTouchListenerC23151a(0.75f, 50, null));
    }

    /* renamed from: c */
    public static final void m43669c(View view) {
        C89219l.m154719c(view, "");
        int i = Build.VERSION.SDK_INT;
        View.OnLayoutChangeListener remove = f54818b.remove(view);
        if (remove != null) {
            view.removeOnLayoutChangeListener(remove);
        }
        view.getOverlay().clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.h.i$a */
    public static final class C23164a extends AbstractC89220m implements AbstractC89172b<C22995c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f54819a;

        /* renamed from: b */
        final /* synthetic */ float f54820b;

        /* renamed from: c */
        final /* synthetic */ float f54821c;

        /* renamed from: d */
        final /* synthetic */ C22995c f54822d;

        static {
            Covode.recordClassIndex(27093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23164a(View view, float f, float f2, C22995c cVar) {
            super(1);
            this.f54819a = view;
            this.f54820b = f;
            this.f54821c = f2;
            this.f54822d = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22995c cVar) {
            mo37655a(cVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo37655a(C22995c cVar) {
            float width;
            C89219l.m154719c(cVar, "");
            if (C23163i.m43664a(this.f54819a)) {
                width = this.f54820b - this.f54821c;
            } else {
                this.f54819a.getDrawingRect(C23163i.f54817a);
                width = ((((float) C23163i.f54817a.width()) - this.f54820b) - ((float) this.f54822d.f54404c)) + this.f54821c;
            }
            cVar.f54406e = width;
        }
    }

    /* renamed from: b */
    public static final Drawable m43665b(Context context) {
        C89219l.m154719c(context, "");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ab8});
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        return C0643b.m2369a(context, obtainStyledAttributes.getResourceId(0, 0));
    }

    /* renamed from: a */
    public static final ColorMatrixColorFilter m43656a(int i) {
        return new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, (float) Color.red(i), 0.0f, 1.0f, 0.0f, 0.0f, (float) Color.green(i), 0.0f, 0.0f, 1.0f, 0.0f, (float) Color.blue(i), 0.0f, 0.0f, 0.0f, (((float) Color.alpha(i)) * 1.0f) / 255.0f, 0.0f});
    }

    /* renamed from: a */
    public static final boolean m43663a(Context context) {
        C89219l.m154719c(context, "");
        int i = Build.VERSION.SDK_INT;
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        Configuration configuration = resources.getConfiguration();
        C89219l.m154709a((Object) configuration, "");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final LayerDrawable m43657a(Drawable drawable, Drawable drawable2) {
        C89219l.m154719c(drawable, "");
        C89219l.m154719c(drawable2, "");
        return new LayerDrawable(new Drawable[]{drawable2, drawable});
    }

    /* renamed from: a */
    public static final void m43658a(View view, int i, float f, float f2) {
        C89219l.m154719c(view, "");
        int i2 = Build.VERSION.SDK_INT;
        view.getOverlay().clear();
        Context context = view.getContext();
        C89219l.m154709a((Object) context, "");
        C22995c a = C22993a.m43369a(context, null, 0, 0, 0, 62);
        a.f54410i = i;
        a.mo37337a(C22993a.m43371a(0, 2, 0));
        a.mo37336a();
        float f3 = ((float) i) / 2.0f;
        a.f54407f = f - f3;
        C23164a aVar = new C23164a(view, f2, f3, a);
        aVar.mo37655a(a);
        View$OnLayoutChangeListenerC23165b bVar = new View$OnLayoutChangeListenerC23165b(aVar, a);
        f54818b.put(view, bVar);
        view.addOnLayoutChangeListener(bVar);
        view.getOverlay().add(a);
    }

    /* renamed from: b */
    public static final void m43667b(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        C89219l.m154719c(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Context context = view.getContext();
            C89219l.m154709a((Object) context, "");
            m43662a((ViewGroup.MarginLayoutParams) layoutParams, context, num, num2, num3, num4, z);
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static final void m43659a(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        boolean z2;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        C89219l.m154719c(view, "");
        if (!(num == null && num3 == null) && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num != null) {
            paddingLeft = num.intValue();
        } else {
            paddingLeft = view.getPaddingLeft();
        }
        if (num2 != null) {
            paddingTop = num2.intValue();
        } else {
            paddingTop = view.getPaddingTop();
        }
        if (num3 != null) {
            paddingRight = num3.intValue();
        } else {
            paddingRight = view.getPaddingRight();
        }
        if (num4 != null) {
            paddingBottom = num4.intValue();
        } else {
            paddingBottom = view.getPaddingBottom();
        }
        if (z2) {
            Context context = view.getContext();
            C89219l.m154709a((Object) context, "");
            if (m43663a(context)) {
                view.setPadding(paddingRight, paddingTop, paddingLeft, paddingBottom);
                return;
            }
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* renamed from: a */
    public static /* synthetic */ void m43660a(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        m43659a(view, num, num2, num3, num4, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m43668b(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        m43667b(view, num, num2, num3, num4, z);
    }

    /* renamed from: a */
    public static void m43662a(ViewGroup.MarginLayoutParams marginLayoutParams, Context context, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        C89219l.m154719c(marginLayoutParams, "");
        C89219l.m154719c(context, "");
        if (!(num == null && num3 == null)) {
            if (!z || !m43663a(context)) {
                if (num != null) {
                    marginLayoutParams.leftMargin = num.intValue();
                }
                if (num3 != null) {
                    marginLayoutParams.rightMargin = num3.intValue();
                }
            } else {
                if (num != null) {
                    marginLayoutParams.rightMargin = num.intValue();
                }
                if (num3 != null) {
                    marginLayoutParams.leftMargin = num3.intValue();
                }
            }
        }
        if (num2 != null) {
            marginLayoutParams.topMargin = num2.intValue();
        }
        if (num4 != null) {
            marginLayoutParams.bottomMargin = num4.intValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (num != null) {
            marginLayoutParams.setMarginStart(num.intValue());
        }
        if (num3 != null) {
            marginLayoutParams.setMarginEnd(num3.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.h.i$b */
    public static final class View$OnLayoutChangeListenerC23165b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ C23164a f54823a;

        /* renamed from: b */
        final /* synthetic */ C22995c f54824b;

        static {
            Covode.recordClassIndex(27094);
        }

        View$OnLayoutChangeListenerC23165b(C23164a aVar, C22995c cVar) {
            this.f54823a = aVar;
            this.f54824b = cVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f54823a.mo37655a(this.f54824b);
        }
    }
}
