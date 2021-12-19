package com.bytedance.apm.block.p766a;

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

/* renamed from: com.bytedance.apm.block.a.j */
public abstract class AbstractWindow$CallbackC12381j implements Window.Callback {

    /* renamed from: b */
    protected Window.Callback f29864b;

    static {
        Covode.recordClassIndex(14187);
    }

    public void onAttachedToWindow() {
        this.f29864b.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f29864b.onContentChanged();
    }

    public void onDetachedFromWindow() {
        this.f29864b.onDetachedFromWindow();
    }

    public boolean onSearchRequested() {
        return this.f29864b.onSearchRequested();
    }

    public AbstractWindow$CallbackC12381j(Window.Callback callback) {
        this.f29864b = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f29864b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f29864b.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f29864b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f29864b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f29864b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f29864b.onActionModeStarted(actionMode);
    }

    public View onCreatePanelView(int i) {
        return this.f29864b.onCreatePanelView(i);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f29864b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f29864b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f29864b.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f29864b.onSearchRequested(searchEvent);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f29864b.onCreatePanelMenu(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f29864b.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f29864b.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f29864b.onPanelClosed(i, menu);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f29864b.onWindowStartingActionMode(callback, i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f29864b.onPreparePanel(i, view, menu);
    }
}
