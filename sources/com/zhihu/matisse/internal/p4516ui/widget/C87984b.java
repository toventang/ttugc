package com.zhihu.matisse.internal.p4516ui.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.b */
public class C87984b extends DialogInterface$OnCancelListenerC0944d {
    static {
        Covode.recordClassIndex(104009);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("extra_title");
        String string2 = getArguments().getString("extra_message");
        DialogInterfaceC0216c.C0217a aVar = new DialogInterfaceC0216c.C0217a(getActivity());
        if (!TextUtils.isEmpty(string)) {
            aVar.mo449a(string);
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.mo456b(string2);
        }
        aVar.mo446a(R.string.d14, new DialogInterface.OnClickListener() {
            /* class com.zhihu.matisse.internal.p4516ui.widget.C87984b.DialogInterface$OnClickListenerC879851 */

            static {
                Covode.recordClassIndex(104010);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return aVar.mo453a();
    }

    /* renamed from: a */
    public static C87984b m153051a(String str, String str2) {
        C87984b bVar = new C87984b();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        bVar.setArguments(bundle);
        return bVar;
    }
}
