package com.bytedance.android.livesdk.chatroom.interaction;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.chatroom.p488c.C7407w;
import com.bytedance.android.livesdk.model.message.C9719cc;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.interaction.f */
public final class C7640f {

    /* renamed from: a */
    private final DataChannel f18944a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.f$a */
    final /* synthetic */ class C7642a implements AbstractC88433f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f18945a;

        static {
            Covode.recordClassIndex(8419);
        }

        C7642a(AbstractC89172b bVar) {
            this.f18945a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154716b(this.f18945a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8417);
    }

    public final void onEvent(C7407w wVar) {
        Room room;
        User user;
        C89219l.m154721d(wVar, "");
        if (wVar.f18360a != null && (room = (Room) this.f18944a.mo28318b(C9093de.class)) != null && (user = (User) this.f18944a.mo28318b(C9101dm.class)) != null) {
            ShareReportResult shareReportResult = wVar.f18360a;
            C89219l.m154716b(shareReportResult, "");
            if (shareReportResult.getDeltaIntimacy() > 0) {
                long id = room.getId();
                ShareReportResult shareReportResult2 = wVar.f18360a;
                C89219l.m154716b(shareReportResult2, "");
                C9719cc a = C7302b.m15206a(id, shareReportResult2.getDisplayText(), user);
                IMessageManager iMessageManager = (IMessageManager) this.f18944a.mo28318b(C9068cg.class);
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(a, true);
                }
            }
        }
    }

    public C7640f(Fragment fragment, DataChannel dataChannel) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(dataChannel, "");
        this.f18944a = dataChannel;
        C6779a.m14563a().mo13050a(fragment, C7407w.class, dataChannel).mo17949a(new C7642a(new AbstractC89172b<C7407w, C89391z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.C7640f.C76411 */

            static {
                Covode.recordClassIndex(8418);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C7407w wVar) {
                C7407w wVar2 = wVar;
                C89219l.m154721d(wVar2, "");
                ((C7640f) this.receiver).onEvent(wVar2);
                return C89391z.f203057a;
            }
        }));
    }
}
