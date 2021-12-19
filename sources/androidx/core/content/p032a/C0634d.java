package androidx.core.content.p032a;

import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.content.a.d */
public final class C0634d {
    static {
        Covode.recordClassIndex(713);
    }

    /* renamed from: a */
    static Shader.TileMode m2343a(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a.d$a */
    public static final class C0635a {

        /* renamed from: a */
        final int[] f2635a;

        /* renamed from: b */
        final float[] f2636b;

        static {
            Covode.recordClassIndex(714);
        }

        C0635a(int i, int i2) {
            this.f2635a = new int[]{i, i2};
            this.f2636b = new float[]{0.0f, 1.0f};
        }

        C0635a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2635a = new int[size];
            this.f2636b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2635a[i] = list.get(i).intValue();
                this.f2636b[i] = list2.get(i).floatValue();
            }
        }

        C0635a(int i, int i2, int i3) {
            this.f2635a = new int[]{i, i2, i3};
            this.f2636b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.core.content.p032a.C0634d.C0635a m2344a(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p032a.C0634d.m2344a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.a.d$a");
    }
}
