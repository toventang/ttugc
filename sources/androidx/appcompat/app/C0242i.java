package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.app.i */
public class C0242i extends DialogInterface$OnCancelListenerC0944d {
    static {
        Covode.recordClassIndex(276);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC0240h(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof DialogC0240h) {
            DialogC0240h hVar = (DialogC0240h) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            hVar.cn_();
            return;
        }
        super.setupDialog(dialog, i);
    }
}
