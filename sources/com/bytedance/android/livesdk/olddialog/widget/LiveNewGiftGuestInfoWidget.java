package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestLinkRoomReportEnableSetting;
import com.bytedance.android.livesdk.olddialog.viewmodel.C10041a;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;

public class LiveNewGiftGuestInfoWidget extends LiveWidget implements View.OnClickListener, AbstractC33974au {

    /* renamed from: a */
    public C10041a f24410a;

    static {
        Covode.recordClassIndex(11603);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.b5p;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.containerView.setVisibility(0);
        AvatarIconView avatarIconView = (AvatarIconView) this.contentView.findViewById(R.id.nz);
        TextView textView = (TextView) this.contentView.findViewById(R.id.ejy);
        View findViewById = this.contentView.findViewById(R.id.fa7);
        User user = this.f24410a.f24385a;
        if (user != null) {
            avatarIconView.setAvatar(user.getAvatarThumb());
            textView.setText(C3966y.m9660a((int) R.string.ek0, C6581g.m14075a(user)));
        }
        avatarIconView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.nz || view.getId() == R.id.fa7) {
            this.f24410a.f24389e.postValue(true);
            C6894d.m14753a().f17266k = GuestLinkRoomReportEnableSetting.INSTANCE.getValue();
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f24410a.f24385a, "guest_connection");
            userProfileEvent.mSource = "guest_connection";
            C6779a.m14563a().mo13053a(userProfileEvent);
        }
    }
}
