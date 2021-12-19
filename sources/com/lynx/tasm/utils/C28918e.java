package com.lynx.tasm.utils;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.lynx.tasm.utils.e */
public final class C28918e {

    /* renamed from: a */
    private static Field f68344a;

    /* renamed from: b */
    private static Field f68345b;

    static {
        Covode.recordClassIndex(35046);
        try {
            Field declaredField = StaticLayout.class.getDeclaredField("mLines");
            f68344a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = StaticLayout.class.getDeclaredField("mColumns");
            f68345b = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m57924a(Layout layout, CharSequence charSequence) {
        int lineCount;
        int i;
        int ellipsisStart;
        if (layout != null && !TextUtils.isEmpty(charSequence) && (lineCount = layout.getLineCount()) != 0 && (ellipsisStart = layout.getEllipsisStart(lineCount - 1)) >= 0 && Character.isLowSurrogate(charSequence.charAt(ellipsisStart))) {
            int i2 = ellipsisStart + 1;
            if (layout instanceof StaticLayout) {
                try {
                    ((int[]) f68344a.get(layout))[(((Integer) f68345b.get(layout)).intValue() * i) + 5] = i2;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
