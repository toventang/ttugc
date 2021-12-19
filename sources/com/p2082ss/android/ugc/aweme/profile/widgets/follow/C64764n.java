package com.p2082ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.n */
public final class C64764n implements AbstractC12644a<AbstractC64763m> {

    /* renamed from: a */
    public final AbstractC64763m f146523a = new C64765a(this);

    /* renamed from: b */
    public final IUserService f146524b;

    static {
        Covode.recordClassIndex(76231);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC64763m mo20458a() {
        return this.f146523a;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.n$a */
    public static final class C64765a implements AbstractC64763m {

        /* renamed from: a */
        final /* synthetic */ C64764n f146525a;

        static {
            Covode.recordClassIndex(76232);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64765a(C64764n nVar) {
            this.f146525a = nVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64763m
        /* renamed from: a */
        public final AbstractC88979t<BaseResponse> mo104209a(String str, String str2) {
            return this.f146525a.f146524b.mo123565a(str, str2);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64763m
        /* renamed from: a */
        public final Object mo104210a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4, Map<String, String> map) {
            return this.f146525a.f146524b.mo123562a(str, str2, i, i2, i3, str3, i4, str4, map);
        }
    }

    public C64764n(IUserService iUserService) {
        C89219l.m154721d(iUserService, "");
        this.f146524b = iUserService;
    }
}
