package com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.sharedar.C69548c;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.e */
public final class C69535e extends AbstractC69514a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f155338b = {new C89232y(C69535e.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0)};

    /* renamed from: c */
    private final AbstractC89248d f155339c = C21572a.m40504a(getDiContainer(), C69548c.class);

    static {
        Covode.recordClassIndex(81877);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final long mo109765a() {
        return 8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69535e(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final void mo109766a(int i, long j, String str) {
        SharedARModel sharedARModel;
        if (str != null) {
            int optInt = new JSONObject(str).optInt("state", -1);
            boolean z = false;
            C69548c cVar = (C69548c) this.f155339c.mo23374a(this, f155338b[0]);
            cVar.f155365e.postValue(Integer.valueOf(optInt));
            AbstractC1174ac a = C1181ae.m3881a(cVar.f155367g, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
            C1213t<Boolean> tVar = cVar.f155366f;
            if (optInt == 1) {
                z = true;
            }
            tVar.postValue(Boolean.valueOf(z));
            if (optInt == 3 && shortVideoContext != null && (sharedARModel = shortVideoContext.f155756Q) != null) {
                sharedARModel.setSharedARSessionId(null);
                sharedARModel.setSharedARMultiPlayerUserName(null);
                sharedARModel.setSharedARMultiPlayerUserId(null);
                sharedARModel.setCurrentUserHost(true);
            }
        }
    }
}
