package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.context.AbstractC31035d;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31025g;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.s */
public final class C72808s implements AbstractC31035d {

    /* renamed from: a */
    public boolean f163293a;

    /* renamed from: b */
    public boolean f163294b;

    /* renamed from: c */
    public float f163295c;

    /* renamed from: d */
    public int f163296d;

    /* renamed from: e */
    public boolean f163297e;

    /* renamed from: f */
    private EnumC31025g f163298f;

    /* renamed from: g */
    private String f163299g;

    static {
        Covode.recordClassIndex(85494);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31035d
    /* renamed from: a */
    public final boolean mo56180a() {
        return this.f163294b;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31035d
    /* renamed from: b */
    public final float mo56181b() {
        return this.f163295c;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31035d
    /* renamed from: c */
    public final boolean mo56182c() {
        return this.f163293a;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31035d
    /* renamed from: d */
    public final int mo56183d() {
        return this.f163296d;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31035d
    /* renamed from: e */
    public final EnumC31025g mo56184e() {
        return this.f163298f;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31035d
    /* renamed from: f */
    public final boolean mo56185f() {
        return this.f163297e;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31035d
    /* renamed from: g */
    public final String mo56186g() {
        return this.f163299g;
    }

    /* renamed from: a */
    public final void mo115094a(EnumC31025g gVar) {
        C89219l.m154721d(gVar, "");
        this.f163298f = gVar;
    }

    public C72808s(CameraComponentModel cameraComponentModel) {
        C89219l.m154721d(cameraComponentModel, "");
        this.f163293a = cameraComponentModel.f155649e != 1 ? false : true;
        this.f163295c = 4.0f;
        this.f163298f = EnumC31025g.AS_ENCODE_PROFILE_MAIN;
        this.f163296d = 15;
        this.f163299g = "";
    }
}
