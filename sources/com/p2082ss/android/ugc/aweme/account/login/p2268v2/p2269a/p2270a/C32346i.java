package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import java.io.Serializable;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.i */
public final class C32346i extends AbstractC32581c {

    /* renamed from: b */
    private final EnumC32592i f77149b;

    /* renamed from: c */
    private final EnumC32594j f77150c;

    /* renamed from: d */
    private final JSONObject f77151d;

    static {
        Covode.recordClassIndex(39114);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        Serializable serializable;
        Bundle arguments = this.f77733a.getArguments();
        if (arguments == null || (serializable = arguments.getSerializable("phone_number")) == null) {
            return true;
        }
        AbstractC32572b bVar = this.f77733a;
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber");
        String a = C31940a.m66306a((C31940a.C31941a) serializable);
        C89219l.m154716b(a, "");
        C32407x.m66808b(bVar, a, this.f77149b, this.f77150c, "anti_spam").mo143246c();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32346i(AbstractC32572b bVar, EnumC32592i iVar, EnumC32594j jVar, JSONObject jSONObject) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        this.f77149b = iVar;
        this.f77150c = jVar;
        this.f77151d = jSONObject;
    }
}
