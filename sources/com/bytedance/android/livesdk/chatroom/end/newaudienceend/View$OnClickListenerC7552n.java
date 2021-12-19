package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.n */
final /* synthetic */ class View$OnClickListenerC7552n implements View.OnClickListener {

    /* renamed from: a */
    private final LiveNewRecommendView f18765a;

    static {
        Covode.recordClassIndex(8325);
    }

    View$OnClickListenerC7552n(LiveNewRecommendView liveNewRecommendView) {
        this.f18765a = liveNewRecommendView;
    }

    public final void onClick(View view) {
        LiveNewRecommendView liveNewRecommendView = this.f18765a;
        if (liveNewRecommendView.f18708b != null && view != null && view.getTag() != null && (view.getTag() instanceof Room)) {
            C7554p.m15532a((Room) view.getTag(), liveNewRecommendView.f18707a, liveNewRecommendView.f18708b, false);
        }
    }
}
