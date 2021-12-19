package com.p2082ss.android.ugc.aweme.friends.invite;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.c */
public interface AbstractC51540c {
    static {
        Covode.recordClassIndex(60806);
    }

    /* renamed from: a */
    void mo87047a();

    /* renamed from: a */
    void mo87048a(View.OnClickListener onClickListener);

    /* renamed from: a */
    void mo87049a(DmtStatusView dmtStatusView, RemoteImageView remoteImageView, TextView textView, TextView textView2, TuxButton tuxButton);

    /* renamed from: a */
    void mo87050a(C56520b bVar);

    /* renamed from: a */
    void mo87051a(String str);

    /* renamed from: b */
    String mo87052b();

    /* renamed from: c */
    LiveData<Boolean> mo87053c();
}
