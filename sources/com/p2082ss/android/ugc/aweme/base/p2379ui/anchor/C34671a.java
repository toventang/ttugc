package com.p2082ss.android.ugc.aweme.base.p2379ui.anchor;

import android.net.Uri;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.service.CommonFeedApiService;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.a */
public final class C34671a implements ICommonFeedApiService {

    /* renamed from: a */
    public static final C34671a f81927a = new C34671a();

    /* renamed from: b */
    private final /* synthetic */ ICommonFeedApiService f81928b;

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: a */
    public final AbstractC89277c<? extends AbstractC12693u<? extends AbstractC22876d>> mo61325a() {
        return this.f81928b.mo61325a();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: a */
    public final List<AnchorCommonStruct> mo61326a(Aweme aweme) {
        return this.f81928b.mo61326a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: a */
    public final void mo61327a(Uri uri, boolean z) {
        C89219l.m154721d(uri, "");
        this.f81928b.mo61327a(uri, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: b */
    public final long mo61328b() {
        return this.f81928b.mo61328b();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: c */
    public final boolean mo61329c() {
        return this.f81928b.mo61329c();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: d */
    public final boolean mo61330d() {
        return this.f81928b.mo61330d();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: e */
    public final boolean mo61331e() {
        return this.f81928b.mo61331e();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: f */
    public final void mo61332f() {
        this.f81928b.mo61332f();
    }

    static {
        Covode.recordClassIndex(41658);
    }

    private C34671a() {
        ICommonFeedApiService g = CommonFeedApiService.m120037g();
        C89219l.m154716b(g, "");
        this.f81928b = g;
    }
}
