package com.p2082ss.android.ugc.aweme.feed.caption.edit;

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

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.DetectSoftKeyEditText */
public final class DetectSoftKeyEditText extends DmtEditText {

    /* renamed from: a */
    public View.OnKeyListener f113448a;

    /* renamed from: b */
    private AbstractC49360b f113449b;

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.DetectSoftKeyEditText$b */
    public interface AbstractC49360b {
        static {
            Covode.recordClassIndex(58165);
        }
    }

    static {
        Covode.recordClassIndex(58163);
    }

    public final void setOnSelectionChangedListener(AbstractC49360b bVar) {
        this.f113449b = bVar;
    }

    public final void setSoftKeyListener(View.OnKeyListener onKeyListener) {
        C89219l.m154721d(onKeyListener, "");
        this.f113448a = onKeyListener;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C49359a(super.onCreateInputConnection(editorInfo));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.DetectSoftKeyEditText$a */
    final class C49359a extends InputConnectionWrapper {
        static {
            Covode.recordClassIndex(58164);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            C89219l.m154721d(keyEvent, "");
            View.OnKeyListener onKeyListener = DetectSoftKeyEditText.this.f113448a;
            if (onKeyListener == null || !onKeyListener.onKey(DetectSoftKeyEditText.this, keyEvent.getKeyCode(), keyEvent)) {
                return super.sendKeyEvent(keyEvent);
            }
            return true;
        }

        public C49359a(InputConnection inputConnection) {
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
    }
}
