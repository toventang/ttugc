package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.context.AbstractC31038f;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ap */
public final class C72768ap implements AbstractC31038f {

    /* renamed from: a */
    public boolean f163151a;

    /* renamed from: b */
    public String f163152b;

    /* renamed from: c */
    public String f163153c;

    /* renamed from: d */
    public int f163154d;

    /* renamed from: e */
    public int f163155e;

    /* renamed from: f */
    public boolean f163156f;

    /* renamed from: g */
    private final boolean f163157g;

    static {
        Covode.recordClassIndex(85454);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
    /* renamed from: a */
    public final boolean mo56206a() {
        return this.f163151a;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
    /* renamed from: b */
    public final String mo56207b() {
        return this.f163152b;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
    /* renamed from: c */
    public final String mo56208c() {
        return this.f163153c;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
    /* renamed from: d */
    public final int mo56209d() {
        return this.f163154d;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
    /* renamed from: e */
    public final int mo56210e() {
        return this.f163155e;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
    /* renamed from: f */
    public final boolean mo56211f() {
        return this.f163156f;
    }

    public C72768ap(CameraComponentModel cameraComponentModel) {
        boolean z;
        String str = "";
        C89219l.m154721d(cameraComponentModel, str);
        GameDuetResource gameDuetResource = cameraComponentModel.f155666v;
        if (gameDuetResource == null || gameDuetResource.gameSticker == null) {
            z = false;
        } else {
            z = true;
        }
        this.f163151a = z;
        String str2 = cameraComponentModel.f155659o.f155682d;
        this.f163152b = str2 == null ? str : str2;
        String str3 = cameraComponentModel.f155659o.f155681c;
        this.f163153c = str3 != null ? str3 : str;
        this.f163154d = cameraComponentModel.f155659o.f155686h;
        this.f163155e = cameraComponentModel.f155659o.f155687i;
        this.f163157g = cameraComponentModel.f155659o.f155697s;
    }
}
