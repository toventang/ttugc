package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.FeedbackSubmitSuccessMethod */
public final class FeedbackSubmitSuccessMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    private static final C42913a f100061a = new C42913a((byte) 0);

    static {
        Covode.recordClassIndex(51018);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.FeedbackSubmitSuccessMethod$a */
    static final class C42913a {
        static {
            Covode.recordClassIndex(51019);
        }

        private C42913a() {
        }

        public /* synthetic */ C42913a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackSubmitSuccessMethod(C18288a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        AbstractC81915c.m141874a(new C42918b());
    }
}
