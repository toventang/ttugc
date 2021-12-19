package com.bytedance.android.monitorV2.lynx.p741a;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.bytedance.android.monitorV2.p740l.C12133i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23497b;
import com.bytedance.ugc.p1744a.C23500c;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28591d;
import com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.a.e */
public final class C12147e extends C23500c.AbstractC23501a {

    /* renamed from: a */
    public static final C12147e f29192a = new C12147e();

    /* renamed from: c */
    private static final String f29193c = f29193c;

    /* renamed from: d */
    private static final Method f29194d = C12133i.m21665a((Class<?>) LynxBaseUI.class, "getOriginLeft", (Class<?>[]) null);

    private C12147e() {
    }

    static {
        Covode.recordClassIndex(13876);
    }

    /* renamed from: a */
    private static int m21687a(int i) {
        if (i == 0 || Color.alpha(i) < 5) {
            return 0;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (red <= 240 || green <= 240 || blue <= 240) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static int m21688a(Drawable drawable) {
        while (drawable instanceof StateListDrawable) {
            drawable = ((StateListDrawable) drawable).getCurrent();
        }
        if (drawable == null) {
            return 0;
        }
        if (drawable instanceof ColorDrawable) {
            return m21687a(((ColorDrawable) drawable).getColor());
        }
        if (!(drawable instanceof BackgroundDrawable)) {
            return 1;
        }
        C28591d dVar = null;
        try {
            Field declaredField = BackgroundDrawable.class.getDeclaredField("f");
            C89219l.m154709a((Object) declaredField, "");
            declaredField.setAccessible(true);
            dVar = (C28591d) declaredField.get(drawable);
        } catch (Exception unused) {
        }
        if (dVar == null || !dVar.mo49417a()) {
            return m21687a(((BackgroundDrawable) drawable).f67606e);
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b9, code lost:
        if (((double) ((com.lynx.tasm.behavior.p2052ui.LynxFlattenUI) r10).f67255a) < 0.05d) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (((double) r7.getScaleY()) >= 0.01d) goto L_0x0093;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21690a(com.lynx.tasm.LynxView r9, com.lynx.tasm.behavior.p2052ui.LynxBaseUI r10) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.lynx.p741a.C12147e.m21690a(com.lynx.tasm.LynxView, com.lynx.tasm.behavior.ui.LynxBaseUI):boolean");
    }

    @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23501a
    /* renamed from: a */
    public final boolean mo19176a(C23497b bVar, View view, int i, int i2, int i3, int i4, int i5, int i6, C23500c.AbstractC23501a aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        if (!(view instanceof LynxView)) {
            return false;
        }
        try {
            UIGroup<UIBody.C28581a> lynxUIRoot = ((LynxView) view).getLynxUIRoot();
            C89219l.m154709a((Object) lynxUIRoot, "");
            m21689a((LynxView) view, bVar, lynxUIRoot, i, i2, i3, i4, i5, i6, aVar, "-");
            return true;
        } catch (Throwable unused) {
            bVar.mo38239a(i3, i4, i5, i6, 1);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0114, code lost:
        if (r0.length() > 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0154, code lost:
        if (r0.length() > 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ca, code lost:
        if (r8 > 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024e, code lost:
        if (r0.length() > 0) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0125  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21689a(com.lynx.tasm.LynxView r24, com.bytedance.ugc.p1744a.C23497b r25, com.lynx.tasm.behavior.p2052ui.LynxBaseUI r26, int r27, int r28, int r29, int r30, int r31, int r32, com.bytedance.ugc.p1744a.C23500c.AbstractC23501a r33, java.lang.String r34) {
        /*
        // Method dump skipped, instructions count: 658
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.lynx.p741a.C12147e.m21689a(com.lynx.tasm.LynxView, com.bytedance.ugc.a.b, com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, int, int, int, int, com.bytedance.ugc.a.c$a, java.lang.String):void");
    }
}
