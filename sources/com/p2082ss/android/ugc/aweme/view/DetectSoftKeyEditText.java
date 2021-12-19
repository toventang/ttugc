package com.p2082ss.android.ugc.aweme.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.DetectSoftKeyEditText */
public final class DetectSoftKeyEditText extends DmtEditText {

    /* renamed from: a */
    public View.OnKeyListener f181226a;

    /* renamed from: b */
    private AbstractC81087b f181227b;

    /* renamed from: com.ss.android.ugc.aweme.view.DetectSoftKeyEditText$b */
    public interface AbstractC81087b {
        static {
            Covode.recordClassIndex(94410);
        }

        /* renamed from: a */
        void mo115797a(int i);
    }

    static {
        Covode.recordClassIndex(94408);
    }

    public final void setOnSelectionChangedListener(AbstractC81087b bVar) {
        this.f181227b = bVar;
    }

    public final void setSoftKeyListener(View.OnKeyListener onKeyListener) {
        C89219l.m154721d(onKeyListener, "");
        this.f181226a = onKeyListener;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C81086a(super.onCreateInputConnection(editorInfo));
    }

    /* renamed from: com.ss.android.ugc.aweme.view.DetectSoftKeyEditText$a */
    final class C81086a extends InputConnectionWrapper {
        static {
            Covode.recordClassIndex(94409);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            C89219l.m154721d(keyEvent, "");
            View.OnKeyListener onKeyListener = DetectSoftKeyEditText.this.f181226a;
            if (onKeyListener == null || !onKeyListener.onKey(DetectSoftKeyEditText.this, keyEvent.getKeyCode(), keyEvent)) {
                return super.sendKeyEvent(keyEvent);
            }
            return true;
        }

        public C81086a(InputConnection inputConnection) {
            super(inputConnection, true);
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            if (i != 1 || i2 != 0) {
                return super.deleteSurroundingText(i, i2);
            }
            if (!sendKeyEvent(new KeyEvent(0, 67)) || !sendKeyEvent(new KeyEvent(1, 67))) {
                return false;
            }
            return true;
        }
    }

    public DetectSoftKeyEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        AbstractC81087b bVar = this.f181227b;
        if (bVar != null) {
            bVar.mo115797a(i);
        }
    }
}
