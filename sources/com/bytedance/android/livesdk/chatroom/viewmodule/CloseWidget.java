package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
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

public final class CloseWidget extends RoomWidget implements AbstractC33974au {
    static {
        Covode.recordClassIndex(8773);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bg5;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC7974a(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28310a(C9143y.class, (AbstractC89172b) new C7975b(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget$a */
    static final class View$OnClickListenerC7974a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CloseWidget f19819a;

        static {
            Covode.recordClassIndex(8774);
        }

        View$OnClickListenerC7974a(CloseWidget closeWidget) {
            this.f19819a = closeWidget;
        }

        public final void onClick(View view) {
            C6779a.m14563a().mo13053a(new C7400q(6));
            C6501b.C6502a.m13948a("livesdk_exit_liveroom_click").mo12643a(this.f19819a.dataChannel).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget$b */
    static final class C7975b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CloseWidget f19820a;

        static {
            Covode.recordClassIndex(8775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7975b(CloseWidget closeWidget) {
            super(1);
            this.f19820a = closeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            View view = this.f19820a.getView();
            if (view != null) {
                view.setVisibility(intValue);
            }
            return C89391z.f203057a;
        }
    }
}
