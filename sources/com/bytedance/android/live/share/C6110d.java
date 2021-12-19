package com.bytedance.android.live.share;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.share.d */
public class C6110d implements AbstractC6109c {
    static {
        Covode.recordClassIndex(6803);
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public AbstractView$OnClickListenerC5841f getShareBehavior(ActivityC0945e eVar, Context context, EnumC11728i iVar, AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        return null;
    }

    public String getShareUrl(User user) {
        return "";
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public LiveWidget getShareWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public AbstractC88979t<C5832d<ShareReportResult>> sendShare(long j, String str, int i, String str2, String str3) {
        return null;
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public AbstractC6107a share() {
        return null;
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public boolean shareable(Room room) {
        return false;
    }

    /* renamed from: com.bytedance.android.live.share.d$a */
    public static final class C6111a implements AbstractC6108b {
        static {
            Covode.recordClassIndex(6804);
        }

        @Override // com.bytedance.android.live.share.AbstractC6108b
        /* renamed from: a */
        public final void mo11992a() {
        }

        @Override // com.bytedance.android.live.share.AbstractC6108b
        /* renamed from: a */
        public final void mo11993a(DataChannel dataChannel, IMessageManager iMessageManager, int i) {
            C89219l.m154721d(dataChannel, "");
        }

        C6111a() {
        }
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public AbstractC6108b provideShareCountManager() {
        return new C6111a();
    }
}
