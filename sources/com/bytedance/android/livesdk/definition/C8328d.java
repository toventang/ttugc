package com.bytedance.android.livesdk.definition;

import com.bytedance.android.live.broadcast.model.C3270n;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.definition.d */
public final class C8328d {

    /* renamed from: a */
    public String f20619a;

    /* renamed from: b */
    public String f20620b;

    /* renamed from: c */
    public boolean f20621c;

    static {
        Covode.recordClassIndex(9166);
    }

    public C8328d() {
    }

    /* renamed from: a */
    public final String mo14661a() {
        String str = this.f20619a;
        if (str == null) {
            C89219l.m154710a(StringSet.name);
        }
        return str;
    }

    /* renamed from: b */
    public final String mo14662b() {
        String str = this.f20620b;
        if (str == null) {
            C89219l.m154710a("sdkKey");
        }
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8328d(C3270n.C3271a aVar) {
        this();
        C89219l.m154721d(aVar, "");
        String str = aVar.f9364a;
        C89219l.m154716b(str, "");
        this.f20619a = str;
        String str2 = aVar.f9365b;
        C89219l.m154716b(str2, "");
        this.f20620b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8328d(LiveCoreSDKData.Quality quality) {
        this();
        C89219l.m154721d(quality, "");
        String str = quality.name;
        C89219l.m154716b(str, "");
        this.f20619a = str;
        String str2 = quality.sdkKey;
        C89219l.m154716b(str2, "");
        this.f20620b = str2;
    }
}
