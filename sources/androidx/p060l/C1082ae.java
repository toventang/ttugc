package androidx.p060l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: androidx.l.ae */
final class C1082ae {

    /* renamed from: a */
    static final C1088ai f3726a;

    /* renamed from: b */
    static final Property<View, Float> f3727b = new Property<View, Float>(Float.class, "translationAlpha") {
        /* class androidx.p060l.C1082ae.C10831 */

        static {
            Covode.recordClassIndex(1176);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf(C1082ae.f3726a.mo3849a(view));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            C1082ae.m3646a(view, f.floatValue());
        }
    };

    /* renamed from: c */
    static final Property<View, Rect> f3728c = new Property<View, Rect>(Rect.class, "clipBounds") {
        /* class androidx.p060l.C1082ae.C10842 */

        static {
            Covode.recordClassIndex(1177);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Rect get(View view) {
            return C0792v.m2790x(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Rect rect) {
            C0792v.m2745a(view, rect);
        }
    };

    /* renamed from: d */
    private static Field f3729d;

    /* renamed from: e */
    private static boolean f3730e;

    static {
        Covode.recordClassIndex(1175);
        if (Build.VERSION.SDK_INT >= 22) {
            f3726a = new C1087ah();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f3726a = new C1086ag();
        } else {
            int i = Build.VERSION.SDK_INT;
            f3726a = new C1085af();
        }
    }

    /* renamed from: a */
    static AbstractC1081ad m3645a(View view) {
        int i = Build.VERSION.SDK_INT;
        return new C1080ac(view);
    }

    /* renamed from: b */
    static AbstractC1096an m3649b(View view) {
        int i = Build.VERSION.SDK_INT;
        return new C1095am(view);
    }

    /* renamed from: a */
    static void m3646a(View view, float f) {
        f3726a.mo3850a(view, f);
    }

    /* renamed from: a */
    static void m3647a(View view, int i) {
        if (!f3730e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3729d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3730e = true;
        }
        Field field = f3729d;
        if (field != null) {
            try {
                f3729d.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: a */
    static void m3648a(View view, int i, int i2, int i3, int i4) {
        f3726a.mo3855a(view, i, i2, i3, i4);
    }
}
