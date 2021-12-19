package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.livesdk.chatroom.backroom.C7334b;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9143y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class BackRoomWidget extends RoomWidget implements AbstractC33974au {

    /* renamed from: a */
    public static final C7969a f19800a = new C7969a((byte) 0);

    static {
        Covode.recordClassIndex(8766);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bg4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BackRoomWidget$a */
    public static final class C7969a {
        static {
            Covode.recordClassIndex(8767);
        }

        private C7969a() {
        }

        public /* synthetic */ C7969a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m16095a(Context context) {
            if (C7334b.f18205a.mo13571a(C3888a.m9505a(context)).mo13567a() == null || !LiveDrawerSettings.INSTANCE.getValue().enableReturnBtn()) {
                return false;
            }
            return true;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        return C7969a.m16095a(getContext());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC7970b(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28310a(C9143y.class, (AbstractC89172b) new C7971c(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BackRoomWidget$b */
    static final class View$OnClickListenerC7970b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BackRoomWidget f19801a;

        static {
            Covode.recordClassIndex(8768);
        }

        View$OnClickListenerC7970b(BackRoomWidget backRoomWidget) {
            this.f19801a = backRoomWidget;
        }

        public final void onClick(View view) {
            C6779a.m14563a().mo13053a(new C7400q(8));
            C6501b.C6502a.m13948a("livesdk_topleft_return_click").mo12643a(this.f19801a.dataChannel).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BackRoomWidget$c */
    static final class C7971c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BackRoomWidget f19802a;

        static {
            Covode.recordClassIndex(8769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7971c(BackRoomWidget backRoomWidget) {
            super(1);
            this.f19802a = backRoomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            View view = this.f19802a.getView();
            if (view != null) {
                view.setVisibility(intValue);
            }
            return C89391z.f203057a;
        }
    }
}
