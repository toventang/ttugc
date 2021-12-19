package com.bytedance.ies.dmt.p1194ui.dialog;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.p */
public final class Window$CallbackC17224p implements Window.Callback {

    /* renamed from: a */
    public AbstractC17225a f41137a;

    /* renamed from: b */
    public final Window.Callback f41138b;

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.p$a */
    public interface AbstractC17225a {
        static {
            Covode.recordClassIndex(19686);
        }

        /* renamed from: a */
        void mo27249a(boolean z);
    }

    static {
        Covode.recordClassIndex(19685);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f41138b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f41138b.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f41138b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f41138b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f41138b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f41138b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f41138b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f41138b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f41138b.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f41138b.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C89219l.m154721d(menu, "");
        return this.f41138b.onCreatePanelMenu(i, menu);
    }

    public final View onCreatePanelView(int i) {
        return this.f41138b.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f41138b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C89219l.m154721d(menuItem, "");
        return this.f41138b.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        C89219l.m154721d(menu, "");
        return this.f41138b.onMenuOpened(i, menu);
    }

    public final void onPanelClosed(int i, Menu menu) {
        C89219l.m154721d(menu, "");
        this.f41138b.onPanelClosed(i, menu);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C89219l.m154721d(menu, "");
        return this.f41138b.onPreparePanel(i, view, menu);
    }

    public final boolean onSearchRequested() {
        return this.f41138b.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f41138b.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f41138b.onWindowAttributesChanged(layoutParams);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f41138b.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f41138b.onWindowStartingActionMode(callback, i);
    }

    public Window$CallbackC17224p(Window.Callback callback) {
        C89219l.m154721d(callback, "");
        this.f41138b = callback;
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f41138b.onWindowFocusChanged(z);
        AbstractC17225a aVar = this.f41137a;
        if (aVar != null) {
            aVar.mo27249a(z);
        }
    }
}
