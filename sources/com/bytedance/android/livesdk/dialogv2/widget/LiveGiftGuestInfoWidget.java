package com.bytedance.android.livesdk.dialogv2.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4329e;
import com.bytedance.android.livesdk.C6909bi;
import com.bytedance.android.livesdk.C9005j;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestLinkRoomReportEnableSetting;
import com.bytedance.android.livesdk.model.C9914v;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.service.p624b.C10696a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveGiftGuestInfoWidget extends LiveWidget implements View.OnClickListener, AbstractC33974au {

    /* renamed from: a */
    public LiveGiftDialogViewModel f20752a;

    static {
        Covode.recordClassIndex(9233);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b5p;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        ViewGroup viewGroup = this.containerView;
        C89219l.m154716b(viewGroup, "");
        viewGroup.setVisibility(0);
        AvatarIconView avatarIconView = (AvatarIconView) this.contentView.findViewById(R.id.nz);
        TextView textView = (TextView) this.contentView.findViewById(R.id.ejy);
        View findViewById = this.contentView.findViewById(R.id.fa7);
        User user = C8374a.C8375a.C8376a.f20718a.f20708b;
        if (user != null) {
            avatarIconView.setAvatar(user.getAvatarThumb());
            C89219l.m154716b(textView, "");
            textView.setText(C3966y.m9660a((int) R.string.ek0, C6581g.m14075a(user)));
        }
        avatarIconView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        this.dataChannel.mo28309a((AbstractC1204m) this, C6909bi.class, (AbstractC89172b) new C8392a(this));
    }

    public final void onClick(View view) {
        User user = C8374a.C8375a.C8376a.f20718a.f20708b;
        if (view == null) {
            return;
        }
        if (view.getId() == R.id.nz || view.getId() == R.id.fa7) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4329e.class, true);
            }
            C6894d.m14753a().f17266k = GuestLinkRoomReportEnableSetting.INSTANCE.getValue();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user, "guest_connection");
            userProfileEvent.mSource = "guest_connection";
            C6779a.m14563a().mo13053a(userProfileEvent);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget$a */
    static final class C8392a extends AbstractC89220m implements AbstractC89172b<C10696a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveGiftGuestInfoWidget f20753a;

        static {
            Covode.recordClassIndex(9234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8392a(LiveGiftGuestInfoWidget liveGiftGuestInfoWidget) {
            super(1);
            this.f20753a = liveGiftGuestInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10696a aVar) {
            C9914v vVar;
            C10696a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f25752a == C10696a.EnumC10697a.TAB_EVENT || aVar2.f25752a == C10696a.EnumC10697a.GIFT_EVENT) {
                C9914v vVar2 = aVar2.f25753b;
                if (!(vVar2 == null || vVar2.f24033a == null || (vVar = aVar2.f25753b) == null || vVar.f24034b == null)) {
                    this.f20753a.containerView.post(new Runnable(this) {
                        /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget.C8392a.RunnableC83931 */

                        /* renamed from: a */
                        final /* synthetic */ C8392a f20754a;

                        static {
                            Covode.recordClassIndex(9235);
                        }

                        {
                            this.f20754a = r1;
                        }

                        public final void run() {
                            ViewGroup viewGroup = this.f20754a.f20753a.containerView;
                            if (viewGroup != null) {
                                viewGroup.setVisibility(8);
                            }
                        }
                    });
                    C6779a.m14563a().mo13053a(new C9005j());
                }
            } else if (aVar2.f25752a == C10696a.EnumC10697a.TAB_EMPTY_EVENT) {
                C6779a.m14563a().mo13053a(new C9005j());
                this.f20753a.containerView.post(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget.C8392a.RunnableC83942 */

                    /* renamed from: a */
                    final /* synthetic */ C8392a f20755a;

                    static {
                        Covode.recordClassIndex(9236);
                    }

                    {
                        this.f20755a = r1;
                    }

                    public final void run() {
                        ViewGroup viewGroup = this.f20755a.f20753a.containerView;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(0);
                        }
                    }
                });
            } else if (aVar2.f25752a == C10696a.EnumC10697a.GIFT_EMPTY_EVENT && !C8374a.C8375a.C8376a.f20718a.f20717k) {
                C6779a.m14563a().mo13053a(new C9005j());
                this.f20753a.containerView.post(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget.C8392a.RunnableC83953 */

                    /* renamed from: a */
                    final /* synthetic */ C8392a f20756a;

                    static {
                        Covode.recordClassIndex(9237);
                    }

                    {
                        this.f20756a = r1;
                    }

                    public final void run() {
                        ViewGroup viewGroup = this.f20756a.f20753a.containerView;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(0);
                        }
                    }
                });
            }
            return C89391z.f203057a;
        }
    }
}
