package com.bytedance.android.live.p405s;

import android.app.Dialog;
import android.content.Context;
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
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.s.h */
public class C6106h implements AbstractC6103e {
    static {
        Covode.recordClassIndex(6723);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public AbstractC6102d configUserHelper(C10935a aVar, DataChannel dataChannel, C88411a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(aVar2, "");
        return null;
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void fetchAdminList(AbstractC6095a aVar, long j) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void fetchKickOutList(AbstractC6100b bVar, long j, int i, int i2) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void fetchMuteDurationList(AbstractC89172b<? super List<C3265j>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void fetchMuteList(AbstractC6101c cVar, long j, int i, int i2) {
        C89219l.m154721d(cVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public Dialog getEnsureKickOutDialog(Context context, long j, long j2, long j3, AbstractC6104f fVar) {
        return null;
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public String getReportScene() {
        return null;
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void kickOut(AbstractC6100b bVar, boolean z, long j, long j2) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void muteUser(User user, long j, C3265j jVar, AbstractC6105g gVar) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(gVar, "");
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void report(Context context, C11666c cVar) {
        C89219l.m154721d(cVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void report(Context context, C11838d dVar) {
        C89219l.m154721d(dVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void setMuteDuration(C3265j jVar) {
        C89219l.m154721d(jVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void unmuteUser(User user, long j, AbstractC6105g gVar) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(gVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void updateAdmin(AbstractC6095a aVar, boolean z, User user, long j, long j2, String str) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void updateAdmin(AbstractC6095a aVar, boolean z, C6096a aVar2, long j, long j2, String str) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public AbstractC88403ab<C3265j> getMuteDuration() {
        AbstractC88403ab<C3265j> a = AbstractC88403ab.m153602a(C3265j.f9350b);
        C89219l.m154716b(a, "");
        return a;
    }
}
