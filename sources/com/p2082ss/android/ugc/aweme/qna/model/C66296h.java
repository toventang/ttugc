package com.p2082ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66358d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.qna.model.h */
public final class C66296h extends C66293f {

    /* renamed from: a */
    public final C66358d f149055a;

    /* renamed from: b */
    public final C66299k f149056b;

    /* renamed from: c */
    public final String f149057c;

    /* renamed from: d */
    public final String f149058d;

    /* renamed from: e */
    public final String f149059e;

    /* renamed from: f */
    public final List<User> f149060f;

    /* renamed from: j */
    public final String f149061j;

    /* renamed from: k */
    public final Boolean f149062k;

    /* renamed from: l */
    public boolean f149063l;

    /* renamed from: m */
    public boolean f149064m;

    /* renamed from: n */
    public boolean f149065n;

    /* renamed from: o */
    public final List<String> f149066o;

    static {
        Covode.recordClassIndex(77805);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private C66296h(int i, String str, C66358d dVar, C66299k kVar, String str2, String str3, String str4, List<? extends User> list, String str5, Boolean bool, boolean z, List<String> list2) {
        super(i, str);
        this.f149055a = dVar;
        this.f149056b = kVar;
        this.f149057c = str2;
        this.f149058d = str3;
        this.f149059e = str4;
        this.f149060f = list;
        this.f149061j = str5;
        this.f149062k = bool;
        this.f149063l = false;
        this.f149064m = false;
        this.f149065n = z;
        this.f149066o = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C66296h(int i, String str, C66358d dVar, C66299k kVar, String str2, String str3, String str4, List list, String str5, Boolean bool, boolean z, List list2, int i2) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : dVar, (i2 & 8) != 0 ? null : kVar, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : bool, (i2 & 4096) != 0 ? false : z, (i2 & 8192) == 0 ? list2 : null);
    }
}
