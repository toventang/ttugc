package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.story.model.b */
public final class C77379b implements AbstractC81914b {

    /* renamed from: a */
    public final int f173611a;

    /* renamed from: b */
    public final String f173612b = null;

    /* renamed from: c */
    public final String f173613c = null;

    /* renamed from: d */
    public final Aweme f173614d;

    /* renamed from: e */
    public boolean f173615e;

    /* renamed from: f */
    public String f173616f;

    /* renamed from: g */
    public String[] f173617g;

    /* renamed from: h */
    public CreateAwemeResponse.C69724a f173618h;

    static {
        Covode.recordClassIndex(90409);
    }

    public final String toString() {
        return "state:" + this.f173611a + "  materialId:" + this.f173612b + " videoPath:" + this.f173613c;
    }

    public C77379b(int i, Aweme aweme) {
        this.f173611a = i;
        this.f173614d = aweme;
    }
}
