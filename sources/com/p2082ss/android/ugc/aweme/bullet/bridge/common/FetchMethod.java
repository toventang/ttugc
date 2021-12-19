package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod */
public final class FetchMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: c */
    public static final C35007a f82586c = new C35007a((byte) 0);

    /* renamed from: b */
    public C34337k f82587b;

    /* renamed from: d */
    private final String f82588d = "fetch";

    /* renamed from: e */
    private AbstractC16183k.EnumC16184a f82589e = AbstractC16183k.EnumC16184a.PROTECT;

    /* renamed from: f */
    private final C81577a.AbstractC81580c f82590f = new C35009c(this);

    static {
        Covode.recordClassIndex(42091);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod$a */
    public static final class C35007a {
        static {
            Covode.recordClassIndex(42092);
        }

        private C35007a() {
        }

        public /* synthetic */ C35007a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82589e;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82588d;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod$b */
    static final class C35008b implements C81577a.AbstractC81578a {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82591a;

        static {
            Covode.recordClassIndex(42093);
        }

        C35008b(BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82591a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a.AbstractC81578a
        /* renamed from: a */
        public final void mo61884a(JSONObject jSONObject) {
            this.f82591a.mo61874a(jSONObject);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82589e = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            C81577a.m141439a(m71423a(jSONObject), jSONObject.optJSONObject("res"), mo61869j(), new C35008b(aVar), this.f82590f).mo125268a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod$c */
    static final class C35009c implements C81577a.AbstractC81580c {

        /* renamed from: a */
        final /* synthetic */ FetchMethod f82592a;

        static {
            Covode.recordClassIndex(42094);
        }

        C35009c(FetchMethod fetchMethod) {
            this.f82592a = fetchMethod;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
            if (r0 != 0) goto L_0x0053;
         */
        @Override // com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a.AbstractC81580c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo61885a(com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a.C81579b r7, com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a.C81581d r8) {
            /*
            // Method dump skipped, instructions count: 199
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.bridge.common.FetchMethod.C35009c.mo61885a(com.ss.android.ugc.aweme.web.jsbridge.a.a$b, com.ss.android.ugc.aweme.web.jsbridge.a.a$d):void");
        }
    }
}
