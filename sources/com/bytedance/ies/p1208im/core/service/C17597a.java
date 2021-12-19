package com.bytedance.ies.p1208im.core.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17432d;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17441h;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17443i;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a;
import com.bytedance.ies.p1208im.core.p1209a.C17397a;
import com.bytedance.ies.p1208im.core.p1209a.C17398b;
import com.bytedance.ies.p1208im.core.p1209a.C17402c;
import com.bytedance.ies.p1208im.core.p1209a.C17404d;
import com.bytedance.ies.p1208im.core.p1209a.C17406e;
import com.bytedance.ies.p1208im.core.p1209a.C17409f;
import com.bytedance.ies.p1208im.core.p1209a.C17413g;
import com.bytedance.ies.p1208im.core.p1226g.C17593e;
import com.bytedance.p1399im.core.p1408d.C19656k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.service.a */
public final class C17597a implements AbstractC17466a {

    /* renamed from: a */
    public static final C17598a f42087a = new C17598a((byte) 0);

    static {
        Covode.recordClassIndex(20087);
    }

    /* renamed from: com.bytedance.ies.im.core.service.a$a */
    public static final class C17598a {
        static {
            Covode.recordClassIndex(20088);
        }

        private C17598a() {
        }

        public /* synthetic */ C17598a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: b */
    public final AbstractC17420a mo27879b() {
        return C17397a.f41738b;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: d */
    public final AbstractC17441h mo27883d() {
        return C17409f.f41762b;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: e */
    public final AbstractC17436f mo27884e() {
        return C17406e.f41758b;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: c */
    public final AbstractC17443i mo27882c() {
        return new C17413g();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: a */
    public final C17438g.AbstractC17440b mo27878a() {
        return new C17593e();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: a */
    public final long mo27875a(String str) {
        return C19656k.m36718a(str);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: c */
    public final AbstractC17427b mo27881c(String str) {
        C89219l.m154721d(str, "");
        return new C17398b(str);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: b */
    public final String mo27880b(String str) {
        long a = C17453a.m32404a(str);
        if (a <= 0) {
            C17415a.m32255b().mo27838c("InternalService", "getConversationIdByUid toUid invalid: ".concat(String.valueOf(str)));
            return null;
        }
        long parseLong = Long.parseLong(C17415a.m32258e().mo27825d());
        if (parseLong > 0) {
            return C19656k.m36719a(a);
        }
        C17415a.m32255b().mo27838c("InternalService", "getConversationIdByUid self uid invalid: " + parseLong + ", " + C17415a.m32258e().mo27822a());
        return null;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: a */
    public final AbstractC17432d mo27876a(String str, int[] iArr) {
        C89219l.m154721d(str, "");
        return new C17402c(str, iArr, 7);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a
    /* renamed from: a */
    public final AbstractC17434e mo27877a(String str, boolean z) {
        C89219l.m154721d(str, "");
        return new C17404d(str, z);
    }
}
