package androidx.core.content.p032a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.p034e.C0656a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.a.c */
public final class C0629c {

    /* renamed from: androidx.core.content.a.c$a */
    public interface AbstractC0630a {
        static {
            Covode.recordClassIndex(709);
        }
    }

    static {
        Covode.recordClassIndex(708);
    }

    /* renamed from: androidx.core.content.a.c$b */
    public static final class C0631b implements AbstractC0630a {

        /* renamed from: a */
        public final C0632c[] f2625a;

        static {
            Covode.recordClassIndex(710);
        }

        public C0631b(C0632c[] cVarArr) {
            this.f2625a = cVarArr;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m2339a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m2340a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next != 3) {
                continue;
            } else {
                i--;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    /* renamed from: a */
    public static AbstractC0630a m2337a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                xmlPullParser.require(2, null, "font-family");
                if (xmlPullParser.getName().equals("font-family")) {
                    return m2341b(xmlPullParser, resources);
                }
                m2340a(xmlPullParser);
                return null;
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m2338a(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2339a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2339a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: b */
    private static AbstractC0630a m2341b(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.uh, R.attr.ui, R.attr.uj, R.attr.uk, R.attr.ul, R.attr.um});
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m2342c(xmlPullParser, resources));
                    } else {
                        m2340a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0631b((C0632c[]) arrayList.toArray(new C0632c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m2340a(xmlPullParser);
        }
        return new C0633d(new C0656a(string, string2, string3, m2338a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: c */
    private static C0632c m2342c(XmlPullParser xmlPullParser, Resources resources) {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{16844082, 16844083, 16844095, 16844143, 16844144, R.attr.uf, R.attr.un, R.attr.up, R.attr.uq, R.attr.al3});
        int i = 8;
        if (!obtainAttributes.hasValue(8)) {
            i = 1;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = 6;
        if (!obtainAttributes.hasValue(6)) {
            i3 = 2;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 9;
        if (!obtainAttributes.hasValue(9)) {
            i4 = 3;
        }
        int i5 = 7;
        if (!obtainAttributes.hasValue(7)) {
            i5 = 4;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = 5;
        if (!obtainAttributes.hasValue(5)) {
            i7 = 0;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m2340a(xmlPullParser);
        }
        return new C0632c(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: androidx.core.content.a.c$d */
    public static final class C0633d implements AbstractC0630a {

        /* renamed from: a */
        public final C0656a f2632a;

        /* renamed from: b */
        public final int f2633b;

        /* renamed from: c */
        public final int f2634c;

        static {
            Covode.recordClassIndex(712);
        }

        public C0633d(C0656a aVar, int i, int i2) {
            this.f2632a = aVar;
            this.f2634c = i;
            this.f2633b = i2;
        }
    }

    /* renamed from: androidx.core.content.a.c$c */
    public static final class C0632c {

        /* renamed from: a */
        public final String f2626a;

        /* renamed from: b */
        public int f2627b;

        /* renamed from: c */
        public boolean f2628c;

        /* renamed from: d */
        public String f2629d;

        /* renamed from: e */
        public int f2630e;

        /* renamed from: f */
        public int f2631f;

        static {
            Covode.recordClassIndex(711);
        }

        public C0632c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2626a = str;
            this.f2627b = i;
            this.f2628c = z;
            this.f2629d = str2;
            this.f2630e = i2;
            this.f2631f = i3;
        }
    }
}
