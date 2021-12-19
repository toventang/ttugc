package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a */
    private static final int[] f63100a = {16842912};

    /* renamed from: b */
    private boolean f63101b;

    public boolean isChecked() {
        return this.f63101b;
    }

    public void toggle() {
        setChecked(!this.f63101b);
    }

    static {
        Covode.recordClassIndex(32108);
    }

    public void setChecked(boolean z) {
        if (this.f63101b != z) {
            this.f63101b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f63101b) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f63100a;
        return mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.wl);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0792v.m2747a(this, new C0726a() {
            /* class com.google.android.material.internal.CheckableImageButton.C266561 */

            static {
                Covode.recordClassIndex(32109);
            }

            @Override // androidx.core.p037h.C0726a
            /* renamed from: d */
            public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
                super.mo2813d(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // androidx.core.p037h.C0726a
            /* renamed from: a */
            public final void mo2808a(View view, C0733d dVar) {
                super.mo2808a(view, dVar);
                dVar.mo2836a(true);
                dVar.f2837a.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }
}
