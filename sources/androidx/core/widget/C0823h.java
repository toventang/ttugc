package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.p035f.C0676d;
import androidx.core.p036g.C0697g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: androidx.core.widget.h */
public final class C0823h {

    /* renamed from: a */
    private static Field f3054a;

    /* renamed from: b */
    private static boolean f3055b;

    /* renamed from: c */
    private static Field f3056c;

    /* renamed from: d */
    private static boolean f3057d;

    static {
        Covode.recordClassIndex(906);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.h$a */
    public static class ActionMode$CallbackC0824a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f3058a;

        /* renamed from: b */
        private final TextView f3059b;

        /* renamed from: c */
        private Class<?> f3060c;

        /* renamed from: d */
        private Method f3061d;

        /* renamed from: e */
        private boolean f3062e;

        /* renamed from: f */
        private boolean f3063f;

        static {
            Covode.recordClassIndex(907);
        }

        /* renamed from: a */
        private static Intent m2918a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f3058a.onDestroyActionMode(actionMode);
        }

        ActionMode$CallbackC0824a(ActionMode.Callback callback, TextView textView) {
            this.f3058a = callback;
            this.f3059b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3058a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3058a.onCreateActionMode(actionMode, menu);
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Method declaredMethod;
            boolean z;
            Context context = this.f3059b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3063f) {
                this.f3063f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3060c = cls;
                    this.f3061d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f3062e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3060c = null;
                    this.f3061d = null;
                    this.f3062e = false;
                }
            }
            try {
                if (!this.f3062e || !this.f3060c.isInstance(menu)) {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    declaredMethod = this.f3061d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m2918a(), 0)) {
                        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) || (resolveInfo.activityInfo.exported && (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0))) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                    MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                    TextView textView = this.f3059b;
                    Intent a = m2918a();
                    if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    add.setIntent(a.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f3058a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static int m2903a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return textView.getMaxLines();
    }

    /* renamed from: b */
    public static Drawable[] m2912b(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return textView.getCompoundDrawablesRelative();
    }

    /* renamed from: c */
    public static C0676d.C0677a m2913c(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0676d.C0677a(textView.getTextMetricsParams());
        }
        C0676d.C0677a.C0678a aVar = new C0676d.C0677a.C0678a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            aVar.f2732b = textView.getBreakStrategy();
            aVar.f2733c = textView.getHyphenationFrequency();
        }
        int i = Build.VERSION.SDK_INT;
        aVar.f2731a = m2915d(textView);
        return aVar.mo2716a();
    }

    /* renamed from: a */
    private static Field m2906a(String str) {
        try {
            Field declaredField = TextView.class.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                return declaredField;
            }
        } catch (NoSuchFieldException unused2) {
            return null;
        }
    }

    /* renamed from: d */
    private static TextDirectionHeuristic m2915d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return TextDirectionHeuristics.LOCALE;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: a */
    private static int m2904a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            field.getName();
            return -1;
        }
    }

    /* renamed from: b */
    public static void m2911b(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        } else if (textView instanceof AbstractC0817b) {
            ((AbstractC0817b) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: e */
    public static void m2917e(TextView textView, int i) {
        C0697g.m2450a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: a */
    public static ActionMode.Callback m2905a(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof ActionMode$CallbackC0824a)) {
            return callback;
        }
        return new ActionMode$CallbackC0824a(callback, textView);
    }

    /* renamed from: d */
    public static void m2916d(TextView textView, int i) {
        int i2;
        C0697g.m2450a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: c */
    public static void m2914c(TextView textView, int i) {
        int i2;
        C0697g.m2450a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m2907a(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: a */
    public static void m2909a(TextView textView, Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    /* renamed from: a */
    public static void m2910a(TextView textView, C0676d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(dVar.mo2700a());
        } else if (m2913c(textView).mo2712a(dVar.f2723a)) {
            textView.setText(dVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: a */
    public static void m2908a(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (textView instanceof AbstractC0817b) {
            ((AbstractC0817b) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }
}
