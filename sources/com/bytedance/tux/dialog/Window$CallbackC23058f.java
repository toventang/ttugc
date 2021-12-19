package com.bytedance.tux.dialog;

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

/* renamed from: com.bytedance.tux.dialog.f */
public final class Window$CallbackC23058f implements Window.Callback {

    /* renamed from: a */
    public AbstractC23059a f54568a;

    /* renamed from: b */
    private final Window.Callback f54569b;

    /* renamed from: com.bytedance.tux.dialog.f$a */
    public interface AbstractC23059a {
        static {
            Covode.recordClassIndex(26979);
        }

        /* renamed from: a */
        void mo37469a(boolean z);
    }

    static {
        Covode.recordClassIndex(26978);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f54569b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f54569b.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f54569b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f54569b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f54569b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f54569b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f54569b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f54569b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f54569b.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f54569b.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C89219l.m154719c(menu, "");
        return this.f54569b.onCreatePanelMenu(i, menu);
    }

    public final View onCreatePanelView(int i) {
        return this.f54569b.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f54569b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C89219l.m154719c(menuItem, "");
        return this.f54569b.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        C89219l.m154719c(menu, "");
        return this.f54569b.onMenuOpened(i, menu);
    }

    public final void onPanelClosed(int i, Menu menu) {
        C89219l.m154719c(menu, "");
        this.f54569b.onPanelClosed(i, menu);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C89219l.m154719c(menu, "");
        return this.f54569b.onPreparePanel(i, view, menu);
    }

    public final boolean onSearchRequested() {
        return this.f54569b.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f54569b.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f54569b.onWindowAttributesChanged(layoutParams);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f54569b.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f54569b.onWindowStartingActionMode(callback, i);
    }

    public Window$CallbackC23058f(Window.Callback callback) {
        C89219l.m154719c(callback, "");
        this.f54569b = callback;
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f54569b.onWindowFocusChanged(z);
        AbstractC23059a aVar = this.f54568a;
        if (aVar != null) {
            aVar.mo37469a(z);
        }
    }
}
