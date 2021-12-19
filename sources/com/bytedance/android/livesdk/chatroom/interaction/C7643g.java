package com.bytedance.android.livesdk.chatroom.interaction;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.C8458k;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.interaction.g */
public final class C7643g {

    /* renamed from: a */
    private final DataChannel f18946a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.g$a */
    final /* synthetic */ class C7645a implements AbstractC88433f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f18947a;

        static {
            Covode.recordClassIndex(8422);
        }

        C7645a(AbstractC89172b bVar) {
            this.f18947a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154716b(this.f18947a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8420);
    }

    public final void onEvent(C8458k kVar) {
        User user = (User) this.f18946a.mo28318b(C9101dm.class);
        if (user != null) {
            user.setPayScores(user.getPayScores() + ((long) kVar.f20909a));
            user.setNeverRecharge(false);
            this.f18946a.mo28315b(C9101dm.class, user);
        }
    }

    public C7643g(Fragment fragment, DataChannel dataChannel) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(dataChannel, "");
        this.f18946a = dataChannel;
        C6779a.m14563a().mo13050a(fragment, C8458k.class, dataChannel).mo17949a(new C7645a(new AbstractC89172b<C8458k, C89391z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.C7643g.C76441 */

            static {
                Covode.recordClassIndex(8421);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C8458k kVar) {
                C8458k kVar2 = kVar;
                C89219l.m154721d(kVar2, "");
                ((C7643g) this.receiver).onEvent(kVar2);
                return C89391z.f203057a;
            }
        }));
    }
}
