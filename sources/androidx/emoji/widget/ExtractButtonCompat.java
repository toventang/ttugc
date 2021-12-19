package androidx.emoji.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.Button;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;

public class ExtractButtonCompat extends Button {
    static {
        Covode.recordClassIndex(993);
    }

    public boolean hasWindowFocus() {
        if (!isEnabled() || getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0823h.m2905a(this, callback));
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
