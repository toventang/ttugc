package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import dmt.p4542av.video.C88303z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c */
public final class C73852c implements AbstractC1204m {

    /* renamed from: a */
    static final boolean f165782a = false;

    /* renamed from: b */
    public final AbstractC73910l f165783b;

    /* renamed from: c */
    public List<String> f165784c = new ArrayList();

    /* renamed from: d */
    public final C73835a f165785d;

    /* renamed from: e */
    public final int f165786e;

    /* renamed from: f */
    public AbstractC85541q f165787f;

    /* renamed from: g */
    public AbstractC85541q f165788g;

    /* renamed from: h */
    public VEVideoEncodeSettings f165789h;

    /* renamed from: i */
    public final String f165790i;

    /* renamed from: j */
    public final boolean f165791j;

    /* renamed from: k */
    public final C73896b f165792k;

    /* renamed from: l */
    public C88303z f165793l;

    /* renamed from: m */
    public C65512a<SynthetiseResult> f165794m;

    /* renamed from: n */
    public boolean f165795n = false;

    /* renamed from: o */
    private final C1205n f165796o;

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f165796o;
    }

    static {
        Covode.recordClassIndex(86598);
    }

    public C73852c(AbstractC73910l lVar, C73835a aVar, String str, boolean z, C73896b bVar) {
        C1205n nVar = new C1205n(this, false);
        this.f165796o = nVar;
        nVar.mo4017a(AbstractC1196i.EnumC1199b.STARTED);
        this.f165783b = lVar;
        this.f165785d = aVar;
        this.f165786e = 0;
        this.f165790i = str;
        this.f165791j = z;
        this.f165792k = bVar;
    }
}
