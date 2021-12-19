package com.bytedance.android.livesdk.feed.p533i;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.i.h */
final /* synthetic */ class View$OnClickListenerC8607h implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC8597a f21271a;

    /* renamed from: b */
    private final Room f21272b;

    /* renamed from: c */
    private final PopupWindow f21273c;

    static {
        Covode.recordClassIndex(9464);
    }

    View$OnClickListenerC8607h(AbstractC8597a aVar, Room room, PopupWindow popupWindow) {
        this.f21271a = aVar;
        this.f21272b = room;
        this.f21273c = popupWindow;
    }

    public final void onClick(View view) {
        this.f21271a.mo14907a(this.f21272b, this.f21273c);
    }
}
