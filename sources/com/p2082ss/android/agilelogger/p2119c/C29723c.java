package com.p2082ss.android.agilelogger.p2119c;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.ss.android.agilelogger.c.c */
public final class C29723c {
    static {
        Covode.recordClassIndex(36120);
    }

    /* renamed from: a */
    private static Bundle m59899a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m59902a(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Bundle[{");
        m59904a(bundle, sb);
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m59901a(Uri uri) {
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = Uri.class.getDeclaredMethod("toSafeString", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(uri, new Object[0]);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return uri.toString();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return uri.toString();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return uri.toString();
        }
    }

    /* renamed from: a */
    private static Object m59900a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m59904a(Bundle bundle, StringBuilder sb) {
        boolean z = true;
        for (String str : bundle.keySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(str).append('=');
            Object a = m59900a(bundle, str);
            if (a instanceof int[]) {
                sb.append(Arrays.toString((int[]) a));
            } else if (a instanceof byte[]) {
                byte[] bArr = (byte[]) a;
                if (bArr.length < 102400) {
                    sb.append(Arrays.toString(bArr));
                } else {
                    sb.append("byte[] in Bundle is too long, limit for 100K");
                }
            } else if (a instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) a));
            } else if (a instanceof short[]) {
                sb.append(Arrays.toString((short[]) a));
            } else if (a instanceof long[]) {
                sb.append(Arrays.toString((long[]) a));
            } else if (a instanceof float[]) {
                sb.append(Arrays.toString((float[]) a));
            } else if (a instanceof double[]) {
                sb.append(Arrays.toString((double[]) a));
            } else if (a instanceof String[]) {
                sb.append(Arrays.toString((String[]) a));
            } else if (a instanceof CharSequence[]) {
                sb.append(Arrays.toString((CharSequence[]) a));
            } else if (a instanceof Parcelable[]) {
                sb.append(Arrays.toString((Parcelable[]) a));
            } else if (a instanceof Bundle) {
                sb.append(m59902a((Bundle) a));
            } else {
                sb.append(a);
            }
            z = false;
        }
    }

    /* renamed from: a */
    public static void m59903a(Intent intent, StringBuilder sb) {
        boolean z;
        String action = intent.getAction();
        boolean z2 = true;
        boolean z3 = false;
        if (action != null) {
            sb.append("act=").append(action);
            z = false;
        } else {
            z = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cat=[");
            for (String str : categories) {
                if (!z2) {
                    sb.append(',');
                }
                sb.append(str);
                z2 = false;
            }
            sb.append("]");
            z = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("dat=");
            int i = Build.VERSION.SDK_INT;
            sb.append(m59901a(data));
            z = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("typ=").append(type);
            z = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("flg=0x").append(Integer.toHexString(flags));
            z = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("pkg=").append(str2);
            z = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cmp=").append(component.flattenToShortString());
            z = false;
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("bnds=").append(sourceBounds.toShortString());
            z = false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (intent.getClipData() != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("(has clip)");
        } else {
            z3 = z;
        }
        Bundle a = m59899a(intent);
        if (a != null) {
            if (!z3) {
                sb.append(' ');
            }
            sb.append("extras={");
            m59904a(a, sb);
            sb.append('}');
        }
        int i3 = Build.VERSION.SDK_INT;
        Intent selector = intent.getSelector();
        if (selector != null) {
            sb.append(" sel=");
            m59903a(selector, sb);
            sb.append("}");
        }
    }
}
