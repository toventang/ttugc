package com.p2082ss.android.ugc.aweme.specact.pendant.bridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import java.util.HashMap;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.bridge.SpecActFollowMethod */
public final class SpecActFollowMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(87830);
    }

    private SpecActFollowMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ SpecActFollowMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.bridge.SpecActFollowMethod$b */
    public static final class C74961b implements AbstractC88986z<FollowStatus> {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f168531a;

        static {
            Covode.recordClassIndex(87832);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C74961b(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f168531a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(FollowStatus followStatus) {
            FollowStatus followStatus2 = followStatus;
            C89219l.m154721d(followStatus2, "");
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f168531a;
            if (aVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("follow_status", followStatus2.followStatus);
                aVar.mo79888a(jSONObject);
            }
        }
    }

    public SpecActFollowMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.bridge.SpecActFollowMethod$a */
    static final class C74960a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ JSONObject f168530a;

        static {
            Covode.recordClassIndex(87831);
        }

        C74960a(JSONObject jSONObject) {
            this.f168530a = jSONObject;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<FollowStatus> vVar) {
            String str;
            String str2;
            FollowStatus a;
            C89219l.m154721d(vVar, "");
            JSONObject jSONObject = this.f168530a;
            Integer num = null;
            if (jSONObject != null) {
                str = jSONObject.optString("uid");
            } else {
                str = null;
            }
            JSONObject jSONObject2 = this.f168530a;
            if (jSONObject2 != null) {
                str2 = jSONObject2.optString("sec_uid");
            } else {
                str2 = null;
            }
            JSONObject jSONObject3 = this.f168530a;
            if (jSONObject3 != null) {
                num = Integer.valueOf(jSONObject3.optInt(StringSet.type));
            }
            if (str != null && str2 != null && num != null && (a = UserService.m138861d().mo123562a(str, str2, num.intValue(), -1, -1, "", -1, "", new HashMap())) != null) {
                vVar.mo143031a(a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        AbstractC88979t.m154294a(new C74960a(jSONObject)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new C74961b(aVar));
    }
}
