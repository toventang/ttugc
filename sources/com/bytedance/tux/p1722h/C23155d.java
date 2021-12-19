package com.bytedance.tux.p1722h;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.p017a.p018a.C0196a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.h.d */
public final class C23155d {
    static {
        Covode.recordClassIndex(27084);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.h.d$a */
    public static final class C23156a extends AbstractC89220m implements AbstractC89172b<TypedValue, Integer> {

        /* renamed from: a */
        public static final C23156a f54812a = new C23156a();

        static {
            Covode.recordClassIndex(27085);
        }

        C23156a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(TypedValue typedValue) {
            TypedValue typedValue2 = typedValue;
            C89219l.m154719c(typedValue2, "");
            if (C23155d.m43645a(typedValue2)) {
                return Integer.valueOf(typedValue2.data);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.tux.h.d$b */
    public static final class C23157b extends AbstractC89220m implements AbstractC89172b<TypedValue, Drawable> {

        /* renamed from: a */
        final /* synthetic */ Context f54813a;

        static {
            Covode.recordClassIndex(27086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23157b(Context context) {
            super(1);
            this.f54813a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Drawable invoke(TypedValue typedValue) {
            TypedValue typedValue2 = typedValue;
            C89219l.m154719c(typedValue2, "");
            if (C23155d.m43645a(typedValue2)) {
                return new ColorDrawable(typedValue2.data);
            }
            if (typedValue2.resourceId != 0) {
                return C23155d.m43646b(this.f54813a, typedValue2.resourceId);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m43645a(TypedValue typedValue) {
        if (typedValue.type < 28 || typedValue.type > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final Drawable m43646b(Context context, int i) {
        try {
            return C0196a.m619b(context, i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final Integer m43641a(Context context, int i) {
        C89219l.m154719c(context, "");
        return (Integer) m43643a(context, i, C23156a.f54812a);
    }

    /* renamed from: a */
    public static final <T> T m43643a(Context context, int i, AbstractC89172b<? super TypedValue, ? extends T> bVar) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        C89219l.m154709a((Object) theme, "");
        return (T) m43644a(theme, i, typedValue, bVar);
    }

    /* renamed from: a */
    public static final Integer m43642a(Context context, int[] iArr, int i) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(iArr, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.cg, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(i, 1);
        obtainStyledAttributes.recycle();
        if (color == 1) {
            return null;
        }
        return Integer.valueOf(color);
    }

    /* renamed from: a */
    private static final <T> T m43644a(Resources.Theme theme, int i, TypedValue typedValue, AbstractC89172b<? super TypedValue, ? extends T> bVar) {
        while (theme.resolveAttribute(i, typedValue, true)) {
            if (typedValue.type != 2) {
                return (T) bVar.invoke(typedValue);
            }
            i = typedValue.data;
        }
        return null;
    }
}
