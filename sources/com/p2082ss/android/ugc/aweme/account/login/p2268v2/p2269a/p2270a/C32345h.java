package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.h */
public final class C32345h extends AbstractC32581c {

    /* renamed from: b */
    final C32343g f77145b;

    /* renamed from: c */
    public final JSONObject f77146c;

    /* renamed from: d */
    public final EnumC32592i f77147d;

    /* renamed from: e */
    public final EnumC32594j f77148e;

    static {
        Covode.recordClassIndex(39113);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        if (!this.f77145b.f77140a) {
            return false;
        }
        AbstractC32572b bVar = this.f77733a;
        Bundle b = this.f77145b.mo58401b();
        b.putInt("current_scene", EnumC32592i.CHANGE_PASSWORD.getValue());
        b.putInt("next_page", this.f77145b.mo58400a().getValue());
        bVar.mo58461a(b);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32345h(AbstractC32572b bVar, JSONObject jSONObject, EnumC32592i iVar, EnumC32594j jVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        this.f77146c = jSONObject;
        this.f77147d = iVar;
        this.f77148e = jVar;
        this.f77145b = new C32343g(jSONObject);
    }
}
