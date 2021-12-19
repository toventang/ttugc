package com.bytedance.android.live.p405s;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.p405s.p406a.C6096a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.s.e */
public interface AbstractC6103e extends AbstractC2953a {
    static {
        Covode.recordClassIndex(6720);
    }

    AbstractC6102d configUserHelper(C10935a aVar, DataChannel dataChannel, C88411a aVar2);

    void fetchAdminList(AbstractC6095a aVar, long j);

    void fetchKickOutList(AbstractC6100b bVar, long j, int i, int i2);

    void fetchMuteDurationList(AbstractC89172b<? super List<C3265j>, C89391z> bVar);

    void fetchMuteList(AbstractC6101c cVar, long j, int i, int i2);

    Dialog getEnsureKickOutDialog(Context context, long j, long j2, long j3, AbstractC6104f fVar);

    AbstractC88403ab<C3265j> getMuteDuration();

    String getReportScene();

    void kickOut(AbstractC6100b bVar, boolean z, long j, long j2);

    void muteUser(User user, long j, C3265j jVar, AbstractC6105g gVar);

    void report(Context context, C11666c cVar);

    void report(Context context, C11838d dVar);

    void setMuteDuration(C3265j jVar);

    void unmuteUser(User user, long j, AbstractC6105g gVar);

    void updateAdmin(AbstractC6095a aVar, boolean z, User user, long j, long j2, String str);

    void updateAdmin(AbstractC6095a aVar, boolean z, C6096a aVar2, long j, long j2, String str);
}
