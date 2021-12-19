package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.o */
public final /* synthetic */ class View$OnClickListenerC7553o implements View.OnClickListener {

    /* renamed from: a */
    private final LiveNewRecommendView f18766a;

    /* renamed from: b */
    private final List f18767b;

    /* renamed from: c */
    private final int f18768c;

    static {
        Covode.recordClassIndex(8326);
    }

    View$OnClickListenerC7553o(LiveNewRecommendView liveNewRecommendView, List list, int i) {
        this.f18766a = liveNewRecommendView;
        this.f18767b = list;
        this.f18768c = i;
    }

    public final void onClick(View view) {
        LiveNewRecommendView liveNewRecommendView = this.f18766a;
        List list = this.f18767b;
        int i = this.f18768c;
        if (liveNewRecommendView.f18710d != null) {
            liveNewRecommendView.f18710d.mo13785e();
        }
        C7554p.m15532a((Room) list.get(i), liveNewRecommendView.getContext(), liveNewRecommendView.f18708b, false);
    }
}
