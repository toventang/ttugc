package androidx.p063m.p064a.p065a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.p032a.C0642h;
import androidx.core.graphics.C0702d;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.m.a.a.e */
public final class C1256e {
    static {
        Covode.recordClassIndex(1365);
    }

    /* renamed from: a */
    private static boolean m4010a(int i) {
        return i >= 28 && i <= 31;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.e$a */
    public static class C1257a implements TypeEvaluator<C0702d.C0704b[]> {

        /* renamed from: a */
        private C0702d.C0704b[] f4113a;

        static {
            Covode.recordClassIndex(1366);
        }

        C1257a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ C0702d.C0704b[] evaluate(float f, C0702d.C0704b[] bVarArr, C0702d.C0704b[] bVarArr2) {
            C0702d.C0704b[] bVarArr3 = bVarArr;
            C0702d.C0704b[] bVarArr4 = bVarArr2;
            if (C0702d.m2473a(bVarArr3, bVarArr4)) {
                C0702d.C0704b[] bVarArr5 = this.f4113a;
                if (bVarArr5 == null || !C0702d.m2473a(bVarArr5, bVarArr3)) {
                    this.f4113a = C0702d.m2475a(bVarArr3);
                }
                for (int i = 0; i < bVarArr3.length; i++) {
                    this.f4113a[i].mo2732a(bVarArr3[i], bVarArr4[i], f);
                }
                return this.f4113a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: android.animation.PropertyValuesHolder[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (m4010a(r1.type) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01af, code lost:
        if (r1 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b1, code lost:
        r1 = m4005a(r3, r2, 0, 1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b7, code lost:
        if (r1 == null) goto L_0x01a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m4011a(android.content.Context r16, android.content.res.Resources r17, android.content.res.Resources.Theme r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20) {
        /*
        // Method dump skipped, instructions count: 465
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p063m.p064a.p065a.C1256e.m4011a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    /* renamed from: a */
    private static void m4009a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static Keyframe m4003a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: a */
    public static Animator m4001a(Context context, Resources resources, Resources.Theme theme, int i) {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator a = m4002a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
            if (animation != null) {
                animation.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0138, code lost:
        if (r3 == 0) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m4005a(android.content.res.TypedArray r15, int r16, int r17, int r18, java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p063m.p064a.p065a.C1256e.m4005a(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static void m4007a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        long a = (long) C0642h.m2360a(typedArray, xmlPullParser, "duration", 1, 300);
        long a2 = (long) C0642h.m2360a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0642h.m2360a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0642h.m2364a(xmlPullParser, "valueFrom") && C0642h.m2364a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                TypedValue peekValue = typedArray.peekValue(5);
                if (peekValue != null) {
                    z = true;
                    i = peekValue.type;
                } else {
                    z = false;
                    i = 0;
                }
                TypedValue peekValue2 = typedArray.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                    i2 = peekValue2.type;
                } else {
                    z2 = false;
                    i2 = 0;
                }
                if ((!z || !m4010a(i)) && (!z2 || !m4010a(i2))) {
                    a3 = 0;
                } else {
                    a3 = 3;
                }
            }
            PropertyValuesHolder a4 = m4005a(typedArray, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator.setValues(a4);
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0642h.m2360a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0642h.m2360a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
            String c = C0642h.m2366c(typedArray2, xmlPullParser, "pathData", 1);
            if (c != null) {
                String c2 = C0642h.m2366c(typedArray2, xmlPullParser, "propertyXName", 2);
                String c3 = C0642h.m2366c(typedArray2, xmlPullParser, "propertyYName", 3);
                if (c2 == null && c3 == null) {
                    throw new InflateException(typedArray2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                m4008a(C0702d.m2471a(c), objectAnimator, 0.5f * f, c2, c3);
                return;
            }
            objectAnimator.setPropertyName(C0642h.m2366c(typedArray2, xmlPullParser, "propertyName", 0));
        }
    }

    /* renamed from: a */
    private static void m4008a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }

    /* renamed from: a */
    private static ObjectAnimator m4004a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m4006a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static ValueAnimator m4006a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4096g);
        TypedArray a2 = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4100k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m4007a(valueAnimator, a, a2, f, xmlPullParser);
        int b = C0642h.m2365b(a, xmlPullParser, "interpolator", 0);
        if (b > 0) {
            valueAnimator.setInterpolator(C1255d.m4000a(context, b));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0008 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0008 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: android.animation.Animator[] */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static Animator m4002a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        int i2;
        int depth = xmlPullParser.getDepth();
        ObjectAnimator objectAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i2 = 0;
            if (next != 3) {
                if (next == 1) {
                    break;
                } else if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        objectAnimator = m4004a(context, resources, theme, attributeSet, f, xmlPullParser);
                    } else if (name.equals("animator")) {
                        objectAnimator = m4006a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray a = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4097h);
                        m4002a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, C0642h.m2360a(a, xmlPullParser, "ordering", 0, 0), f);
                        a.recycle();
                        objectAnimator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] a2 = m4011a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (!(a2 == null || objectAnimator == null || !(objectAnimator instanceof ValueAnimator))) {
                            objectAnimator.setValues(a2);
                        }
                        i2 = 1;
                        objectAnimator = objectAnimator;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet != null && i2 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(objectAnimator);
                    }
                } else {
                    continue;
                }
            } else if (xmlPullParser.getDepth() <= depth) {
                break;
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i2] = it.next();
                i2++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return objectAnimator;
    }
}
