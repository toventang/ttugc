package androidx.core.content.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.content.p032a.C0634d;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.a.b */
public final class C0628b {

    /* renamed from: a */
    public final Shader f2622a;

    /* renamed from: b */
    public int f2623b;

    /* renamed from: c */
    private final ColorStateList f2624c;

    static {
        Covode.recordClassIndex(707);
    }

    /* renamed from: a */
    public final boolean mo2667a() {
        if (this.f2622a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo2670c() {
        if (mo2667a() || this.f2623b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo2669b() {
        ColorStateList colorStateList;
        if (this.f2622a != null || (colorStateList = this.f2624c) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static C0628b m2331a(int i) {
        return new C0628b(null, null, i);
    }

    /* renamed from: a */
    public final boolean mo2668a(int[] iArr) {
        if (mo2669b()) {
            ColorStateList colorStateList = this.f2624c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2623b) {
                this.f2623b = colorForState;
                return true;
            }
        }
        return false;
    }

    private C0628b(Shader shader, ColorStateList colorStateList, int i) {
        this.f2622a = shader;
        this.f2624c = colorStateList;
        this.f2623b = i;
    }

    /* renamed from: a */
    public static C0628b m2332a(Resources resources, int i, Resources.Theme theme) {
        int next;
        Shader shader;
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    String name = xml.getName();
                    int hashCode = name.hashCode();
                    if (hashCode != 89650992) {
                        if (hashCode == 1191572447 && name.equals("selector")) {
                            ColorStateList a = C0627a.m2329a(resources, xml, asAttributeSet, theme);
                            try {
                                return new C0628b(null, a, a.getDefaultColor());
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                    } else if (name.equals("gradient")) {
                        String name2 = xml.getName();
                        if (name2.equals("gradient")) {
                            TypedArray a2 = C0642h.m2361a(resources, theme, asAttributeSet, new int[]{16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051});
                            float a3 = C0642h.m2358a(a2, (XmlPullParser) xml, "startX", 8, 0.0f);
                            float a4 = C0642h.m2358a(a2, (XmlPullParser) xml, "startY", 9, 0.0f);
                            float a5 = C0642h.m2358a(a2, (XmlPullParser) xml, "endX", 10, 0.0f);
                            float a6 = C0642h.m2358a(a2, (XmlPullParser) xml, "endY", 11, 0.0f);
                            float a7 = C0642h.m2358a(a2, (XmlPullParser) xml, "centerX", 3, 0.0f);
                            float a8 = C0642h.m2358a(a2, (XmlPullParser) xml, "centerY", 4, 0.0f);
                            int a9 = C0642h.m2360a(a2, (XmlPullParser) xml, StringSet.type, 2, 0);
                            int a10 = C0642h.m2359a(a2, xml, "startColor", 0);
                            boolean a11 = C0642h.m2364a(xml, "centerColor");
                            int a12 = C0642h.m2359a(a2, xml, "centerColor", 7);
                            int a13 = C0642h.m2359a(a2, xml, "endColor", 1);
                            int a14 = C0642h.m2360a(a2, (XmlPullParser) xml, "tileMode", 6, 0);
                            float a15 = C0642h.m2358a(a2, (XmlPullParser) xml, "gradientRadius", 5, 0.0f);
                            a2.recycle();
                            C0634d.C0635a a16 = C0634d.m2344a(resources, xml, asAttributeSet, theme);
                            if (a16 == null) {
                                if (a11) {
                                    a16 = new C0634d.C0635a(a10, a12, a13);
                                } else {
                                    a16 = new C0634d.C0635a(a10, a13);
                                }
                            }
                            if (a9 != 1) {
                                if (a9 != 2) {
                                    shader = new LinearGradient(a3, a4, a5, a6, a16.f2635a, a16.f2636b, C0634d.m2343a(a14));
                                } else {
                                    shader = new SweepGradient(a7, a8, a16.f2635a, a16.f2636b);
                                }
                            } else if (a15 > 0.0f) {
                                shader = new RadialGradient(a7, a8, a15, a16.f2635a, a16.f2636b, C0634d.m2343a(a14));
                            } else {
                                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                            }
                            return new C0628b(shader, null, 0);
                        }
                        throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                    }
                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (Exception unused2) {
            return null;
        }
    }
}
