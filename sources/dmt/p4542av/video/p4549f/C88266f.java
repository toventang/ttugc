package dmt.p4542av.video.p4549f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.C71372a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.C71374b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionApi;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.f.f */
public final class C88266f implements AbstractC73799a {

    /* renamed from: a */
    private final Context f200301a;

    static {
        Covode.recordClassIndex(104301);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        new C71372a().mo112862a(false);
        AbstractC63196au C = C63244g.m114602a().mo73257C();
        String str = StickerPermissionApi.C71371a.f159950a;
        C89219l.m154716b(str, "");
        AbstractC88979t<StickerPermissionResponse> a = ((StickerPermissionApi) C.createRetrofit(str, true, StickerPermissionApi.class)).getStickerPermission().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        a.mo143254a(C71374b.C71375a.f159954a, C71374b.C71376b.f159955a);
    }

    public C88266f(Context context) {
        C89219l.m154721d(context, "");
        this.f200301a = context;
    }
}
