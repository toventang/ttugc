package com.bytedance.android.livesdk.feed.viewmodel;

import android.content.Context;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1206f.C17309b;

public class DislikeTipViewModel extends RxViewModel {

    /* renamed from: a */
    public boolean f21501a;

    /* renamed from: b */
    public int f21502b;

    /* renamed from: c */
    public boolean f21503c;

    /* renamed from: d */
    private Context f21504d;

    static {
        Covode.recordClassIndex(9582);
    }

    public DislikeTipViewModel(AbstractC8643m mVar, long j, Context context) {
        boolean z;
        C9520ag a = mVar.mo14949a(j);
        if (a == null || a.getDislike() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f21501a = z;
        this.f21504d = context;
        this.f21503c = C17309b.m32048a(context, "ttlive_live_user").mo27622a("HAVE_SHOW_DISLIKE_GUIDE", false);
    }
}
