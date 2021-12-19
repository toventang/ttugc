package com.bytedance.android.livesdk.chatroom.backroom.micbackwidget;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.backroom.C7334b;
import com.bytedance.android.livesdk.chatroom.backroom.RoomBackProgressView;
import com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.C7360a;
import com.bytedance.android.livesdk.chatroom.backroom.p485d.C7349a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9130l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class RoomBackRoomWidget extends RoomRecycleWidget implements C7360a.AbstractC7361a, AbstractC33974au {

    /* renamed from: a */
    private RoomBackProgressView f18238a;

    /* renamed from: b */
    private Room f18239b;

    /* renamed from: c */
    private EnterRoomConfig f18240c;

    /* renamed from: d */
    private HSImageView f18241d;

    static {
        Covode.recordClassIndex(8123);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bd6;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        C7360a.f18247e = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.C7360a.AbstractC7361a
    /* renamed from: a */
    public final void mo13584a() {
        hide();
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        Long l;
        if (C7349a.m15251a()) {
            return false;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (l = (Long) dataChannel.mo28318b(C9130l.class)) == null || l.longValue() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        attach();
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.C7360a.AbstractC7361a
    /* renamed from: a */
    public final void mo13585a(float f) {
        show();
        RoomBackProgressView roomBackProgressView = this.f18238a;
        if (roomBackProgressView != null) {
            roomBackProgressView.setProgress(f);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.RoomBackRoomWidget$a */
    static final class View$OnClickListenerC7359a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomBackRoomWidget f18242a;

        static {
            Covode.recordClassIndex(8124);
        }

        View$OnClickListenerC7359a(RoomBackRoomWidget roomBackRoomWidget) {
            this.f18242a = roomBackRoomWidget;
        }

        public final void onClick(View view) {
            Long l;
            RoomBackRoomWidget roomBackRoomWidget = this.f18242a;
            DataChannel dataChannel = roomBackRoomWidget.dataChannel;
            if (dataChannel != null && (l = (Long) dataChannel.mo28318b(C9130l.class)) != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
                    if (aVar != null) {
                        aVar.jumpRoom(longValue, false);
                    }
                    C6501b.C6502a.m13948a("livesdk_line_up_list_click_return").mo12643a(roomBackRoomWidget.dataChannel).mo12655b();
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        RoomBackProgressView roomBackProgressView;
        View view = getView();
        if (view != null) {
            roomBackProgressView = (RoomBackProgressView) view.findViewById(R.id.dml);
        } else {
            roomBackProgressView = null;
        }
        this.f18238a = roomBackProgressView;
        this.f18239b = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f18240c = C7334b.f18205a.mo13571a(C3888a.m9505a(getContext())).mo13567a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        float f;
        int i;
        View view = getView();
        if (view != null) {
            C89219l.m154716b(view, "");
            view.setVisibility(8);
            HSImageView hSImageView = (HSImageView) view.findViewById(R.id.dmj);
            this.f18241d = hSImageView;
            if (hSImageView != null) {
                hSImageView.setBackgroundResource(2131234714);
            }
            if (!C6229a.m13521a(this.context)) {
                i = R.drawable.bu8;
            } else {
                i = R.drawable.bu9;
            }
            view.setBackgroundResource(i);
            view.setOnClickListener(new View$OnClickListenerC7359a(this));
        }
        if (C7360a.f18244b) {
            C7360a.f18247e = this;
            if (C7360a.f18246d == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(360.0f, 0.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(((long) C7360a.f18245c) * 1000);
                ofFloat.addUpdateListener(C7360a.C7362b.f18249a);
                ofFloat.addListener(new C7360a.C7363c());
                ofFloat.start();
                C7360a.f18246d = ofFloat;
                return;
            }
            ValueAnimator valueAnimator = C7360a.f18246d;
            if (valueAnimator == null) {
                C89219l.m154715b();
            }
            if (!valueAnimator.isStarted()) {
                C7360a.AbstractC7361a aVar = C7360a.f18247e;
                if (aVar != null) {
                    aVar.mo13584a();
                    return;
                }
                return;
            }
            C7360a.AbstractC7361a aVar2 = C7360a.f18247e;
            if (aVar2 != null) {
                ValueAnimator valueAnimator2 = C7360a.f18246d;
                if (valueAnimator2 == null) {
                    C89219l.m154715b();
                }
                Object animatedValue = valueAnimator2.getAnimatedValue();
                if (!(animatedValue instanceof Float)) {
                    animatedValue = null;
                }
                Float f2 = (Float) animatedValue;
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    f = 0.0f;
                }
                aVar2.mo13585a(f);
            }
        }
    }
}
