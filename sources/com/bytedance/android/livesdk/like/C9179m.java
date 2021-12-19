package com.bytedance.android.livesdk.like;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.like.m */
public final /* synthetic */ class C9179m implements AbstractC88434g {

    /* renamed from: a */
    static final AbstractC88434g f22353a = new C9179m();

    static {
        Covode.recordClassIndex(10086);
    }

    private C9179m() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        C5832d dVar = (C5832d) obj;
        if (dVar == null || dVar.data == null) {
            return C88925a.m154171a(C88790v.f201616a);
        }
        ArrayList arrayList = new ArrayList();
        if (!((C9187u) dVar.data).mo15306a().isEmpty()) {
            for (ImageModel imageModel : ((C9187u) dVar.data).mo15306a()) {
                arrayList.add(C7577g.m15569a(imageModel).mo143292d(new C9177k(imageModel)));
            }
        }
        if (!((C9187u) dVar.data).mo15307b().isEmpty()) {
            for (ImageModel imageModel2 : ((C9187u) dVar.data).mo15307b()) {
                arrayList.add(C7577g.m15569a(imageModel2).mo143292d(new C9178l(imageModel2)));
            }
        }
        return AbstractC88979t.m154313c(arrayList);
    }
}
