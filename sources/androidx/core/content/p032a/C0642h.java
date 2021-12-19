package androidx.core.content.p032a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.a.h */
public final class C0642h {
    static {
        Covode.recordClassIndex(721);
    }

    /* renamed from: a */
    public static boolean m2364a(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static TypedValue m2362a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (!m2364a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    /* renamed from: b */
    public static int m2365b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2364a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    /* renamed from: c */
    public static String m2366c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2364a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static int m2359a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2364a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    /* renamed from: a */
    public static TypedArray m2361a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static float m2358a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m2364a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m2360a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2364a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static C0628b m2363a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (m2364a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0628b.m2331a(typedValue.data);
            }
            C0628b a = C0628b.m2332a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0628b.m2331a(0);
    }
}
