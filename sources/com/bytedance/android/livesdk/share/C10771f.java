package com.bytedance.android.livesdk.share;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.share.AbstractC6107a;
import com.bytedance.android.live.share.AbstractC6108b;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11274k;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.livesdk.share.f */
public class C10771f implements AbstractC6109c {
    private AbstractC6107a shareCenter;

    static {
        Covode.recordClassIndex(12371);
    }

    public String getShareUrl(User user) {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public LiveWidget getShareWidget() {
        return new LiveShareWidget();
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public AbstractC6108b provideShareCountManager() {
        return new C10770e();
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public AbstractC6107a share() {
        if (this.shareCenter == null) {
            this.shareCenter = new C10767d((IHostShare) C6193a.m13435a(IHostShare.class));
        }
        return this.shareCenter;
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public boolean shareable(Room room) {
        if (room == null || room.getOwner() == null || room.getOwner().getSecret() == 1) {
            return false;
        }
        if (room.getRoomAuthStatus() == null || room.getRoomAuthStatus().isEnableShare()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public AbstractView$OnClickListenerC5841f getShareBehavior(ActivityC0945e eVar, Context context, EnumC11728i iVar, AbstractC1204m mVar) {
        return new C10772g(eVar, context, iVar, mVar);
    }

    @Override // com.bytedance.android.live.share.AbstractC6109c
    public AbstractC88979t<C5832d<ShareReportResult>> sendShare(long j, String str, int i, String str2, String str3) {
        if (str3 == null) {
            str3 = "";
        }
        return ((ShareApi) C5805e.m12718a().mo11572a(ShareApi.class)).sendShare(j, new C11274k().mo18034a("target_id", "-1").mo18034a("share_type", String.valueOf(i)).mo18034a("common_label_list", String.valueOf(str2)).mo18034a("to_user_ids", str3.replaceAll(" ", "")).f26963a).mo143271a(new C11191f());
    }
}
