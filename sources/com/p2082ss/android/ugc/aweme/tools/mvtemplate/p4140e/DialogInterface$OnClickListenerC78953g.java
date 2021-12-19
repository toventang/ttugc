package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.e.g */
public final /* synthetic */ class DialogInterface$OnClickListenerC78953g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final MvThemeData f177447a;

    /* renamed from: b */
    private final DialogInterface.OnClickListener f177448b;

    static {
        Covode.recordClassIndex(92102);
    }

    public DialogInterface$OnClickListenerC78953g(MvThemeData mvThemeData, DialogInterface.OnClickListener onClickListener) {
        this.f177447a = mvThemeData;
        this.f177448b = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MvThemeData mvThemeData = this.f177447a;
        DialogInterface.OnClickListener onClickListener = this.f177448b;
        String id = mvThemeData.f177184a.getId();
        C89219l.m154721d(id, "");
        SharedPreferences.Editor edit = C34822d.m71158a(C63238c.f143574a, "mv_template", 0).edit();
        edit.putBoolean(id, true);
        C13611a.m24460a(edit);
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
