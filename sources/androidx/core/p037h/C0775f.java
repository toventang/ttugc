package androidx.core.p037h;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.h.f */
public final class C0775f {

    /* renamed from: a */
    private static boolean f2934a;

    /* renamed from: b */
    private static Method f2935b;

    /* renamed from: c */
    private static boolean f2936c;

    /* renamed from: d */
    private static Field f2937d;

    /* renamed from: androidx.core.h.f$a */
    public interface AbstractC0776a {
        static {
            Covode.recordClassIndex(857);
        }

        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    static {
        Covode.recordClassIndex(856);
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m2695a(Dialog dialog) {
        if (!f2936c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2937d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2936c = true;
        }
        Field field = f2937d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m2696a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2934a) {
            try {
                f2935b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2934a = true;
        }
        Method method = f2935b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2697a(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2696a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0792v.m2761b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: a */
    private static boolean m2698a(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener a = m2695a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0792v.m2761b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: a */
    public static boolean m2699a(AbstractC0776a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m2697a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m2698a((Dialog) callback, keyEvent);
        }
        if ((view == null || !C0792v.m2761b(view, keyEvent)) && !aVar.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }
}
