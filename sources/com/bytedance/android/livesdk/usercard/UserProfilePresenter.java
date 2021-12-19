package com.bytedance.android.livesdk.usercard;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p379n.C5765aa;
import com.bytedance.android.live.p379n.C5792x;
import com.bytedance.android.live.p403q.AbstractC6091a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class UserProfilePresenter implements AbstractC33974au {

    /* renamed from: a */
    private DialogInterface$OnCancelListenerC0944d f26299a;

    /* renamed from: b */
    private final C10935a f26300b;

    /* renamed from: c */
    private final DataChannel f26301c;

    /* renamed from: d */
    private final boolean f26302d;

    /* renamed from: com.bytedance.android.livesdk.usercard.UserProfilePresenter$a */
    final /* synthetic */ class C10942a implements AbstractC88433f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f26303a;

        static {
            Covode.recordClassIndex(12557);
        }

        C10942a(AbstractC89172b bVar) {
            this.f26303a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154716b(this.f26303a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(12554);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            dismissDialog();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void dismissDialog() {
        Dialog dialog;
        DialogInterface$OnCancelListenerC0944d dVar;
        DialogInterface$OnCancelListenerC0944d dVar2 = this.f26299a;
        if (dVar2 != null && (dialog = dVar2.getDialog()) != null && dialog.isShowing() && (dVar = this.f26299a) != null) {
            dVar.dismiss();
        }
    }

    public final void onEvent(UserProfileEvent userProfileEvent) {
        Context context;
        long j;
        Dialog dialog;
        if (this.f26300b.isViewValid()) {
            DialogInterface$OnCancelListenerC0944d dVar = this.f26299a;
            if ((dVar == null || (dialog = dVar.getDialog()) == null || !dialog.isShowing()) && (context = this.f26300b.getContext()) != null) {
                C89219l.m154716b(context, "");
                AbstractC0952i fragmentManager = this.f26300b.getFragmentManager();
                if (fragmentManager != null) {
                    C89219l.m154716b(fragmentManager, "");
                    Room room = (Room) this.f26301c.mo28318b(C9093de.class);
                    if (room != null) {
                        DialogInterface$OnCancelListenerC0944d dVar2 = null;
                        if (!room.isOfficial()) {
                            User user = userProfileEvent.user;
                            if (user != null) {
                                j = user.getId();
                            } else {
                                j = userProfileEvent.userId;
                            }
                            this.f26301c.mo28315b(C5765aa.class, (Object) true);
                            DialogInterface$OnCancelListenerC0944d userCardDialog = ((AbstractC6091a) C6193a.m13435a(AbstractC6091a.class)).getUserCardDialog(context, this.f26302d, j, room, (User) this.f26301c.mo28318b(C9101dm.class), userProfileEvent.mSource, userProfileEvent);
                            if (userCardDialog != null) {
                                userCardDialog.show(fragmentManager, userCardDialog.getClass().getSimpleName());
                                dVar2 = userCardDialog;
                            }
                            this.f26299a = dVar2;
                        }
                    }
                }
            }
        }
    }

    public UserProfilePresenter(C10935a aVar, DataChannel dataChannel, boolean z, AbstractC1204m mVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(mVar, "");
        this.f26300b = aVar;
        this.f26301c = dataChannel;
        this.f26302d = z;
        mVar.getLifecycle().mo4012a(this);
        dataChannel.mo28309a((AbstractC1204m) aVar, C5792x.class, (AbstractC89172b) new AbstractC89172b<UserProfileEvent, C89391z>(this) {
            /* class com.bytedance.android.livesdk.usercard.UserProfilePresenter.C109401 */

            static {
                Covode.recordClassIndex(12555);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(UserProfileEvent userProfileEvent) {
                UserProfileEvent userProfileEvent2 = userProfileEvent;
                C89219l.m154721d(userProfileEvent2, "");
                ((UserProfilePresenter) this.receiver).onEvent(userProfileEvent2);
                return C89391z.f203057a;
            }
        });
        C6779a.m14563a().mo13050a(aVar, UserProfileEvent.class, dataChannel).mo17949a(new C10942a(new AbstractC89172b<UserProfileEvent, C89391z>(this) {
            /* class com.bytedance.android.livesdk.usercard.UserProfilePresenter.C109412 */

            static {
                Covode.recordClassIndex(12556);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(UserProfileEvent userProfileEvent) {
                UserProfileEvent userProfileEvent2 = userProfileEvent;
                C89219l.m154721d(userProfileEvent2, "");
                ((UserProfilePresenter) this.receiver).onEvent(userProfileEvent2);
                return C89391z.f203057a;
            }
        }));
    }
}
