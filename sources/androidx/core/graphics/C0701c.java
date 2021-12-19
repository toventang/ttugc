package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.graphics.c */
public final class C0701c {

    /* renamed from: a */
    private static final ThreadLocal<C0692e<Rect, Rect>> f2763a = new ThreadLocal<>();

    static {
        Covode.recordClassIndex(780);
    }

    /* renamed from: a */
    public static boolean m2469a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("󟿽");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        ThreadLocal<C0692e<Rect, Rect>> threadLocal = f2763a;
        C0692e<Rect, Rect> eVar = threadLocal.get();
        if (eVar == null) {
            eVar = new C0692e<>(new Rect(), new Rect());
            threadLocal.set(eVar);
        } else {
            eVar.f2750a.setEmpty();
            eVar.f2751b.setEmpty();
        }
        paint.getTextBounds("󟿽", 0, 2, (Rect) eVar.f2750a);
        paint.getTextBounds(str, 0, length, (Rect) eVar.f2751b);
        if (!eVar.f2750a.equals(eVar.f2751b)) {
            return true;
        }
        return false;
    }
}
