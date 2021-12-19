package com.bytedance.tiktok.homepage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.ProfileEditActivity;

/* renamed from: com.bytedance.tiktok.homepage.b */
public final /* synthetic */ class DialogInterface$OnClickListenerC22728b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final MainActivity f53693a;

    static {
        Covode.recordClassIndex(26617);
    }

    public DialogInterface$OnClickListenerC22728b(MainActivity mainActivity) {
        this.f53693a = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.f53693a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("change_to_ba", true);
        ProfileEditActivity.m115659a(mainActivity, bundle);
    }
}
