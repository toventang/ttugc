package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42995z;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3739b.C68783a;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3739b.C68784b;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod */
public final class GetAbTestMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82604b = "getABTestParams";

    static {
        Covode.recordClassIndex(42102);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82604b;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod$a */
    static final class C35015a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82605a;

        static {
            Covode.recordClassIndex(42103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35015a(BaseBridgeMethod.AbstractC34965a aVar) {
            super(1);
            this.f82605a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            this.f82605a.mo61872a(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod$c */
    static final class C35017c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82608a;

        static {
            Covode.recordClassIndex(42105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35017c(BaseBridgeMethod.AbstractC34965a aVar) {
            super(1);
            this.f82608a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            this.f82608a.mo61872a(str);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAbTestMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod$d */
    static final class C35018d extends AbstractC89220m implements AbstractC89172b<Exception, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82609a;

        static {
            Covode.recordClassIndex(42106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35018d(BaseBridgeMethod.AbstractC34965a aVar) {
            super(1);
            this.f82609a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Exception exc) {
            Exception exc2 = exc;
            C89219l.m154721d(exc2, "");
            this.f82609a.mo61871a(0, exc2.getMessage());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod$b */
    static final class C35016b extends AbstractC89220m implements AbstractC89172b<Exception, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82606a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f82607b;

        static {
            Covode.recordClassIndex(42104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35016b(BaseBridgeMethod.AbstractC34965a aVar, JSONObject jSONObject) {
            super(1);
            this.f82606a = aVar;
            this.f82607b = jSONObject;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Exception exc) {
            Exception exc2 = exc;
            C89219l.m154721d(exc2, "");
            this.f82606a.mo61871a(0, exc2.getMessage());
            C22708a.m42803a((Throwable) exc2, "GetConfigMethod getConfigParams, params = " + this.f82607b);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (C68784b.m121256a()) {
            C68783a.m121255a(jSONObject, new C35015a(aVar), new C35016b(aVar, jSONObject));
        } else {
            C42995z.f100241a.mo73182a(jSONObject, new C35017c(aVar), new C35018d(aVar));
        }
    }
}
