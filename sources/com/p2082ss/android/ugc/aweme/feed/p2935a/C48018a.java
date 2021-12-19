package com.p2082ss.android.ugc.aweme.feed.p2935a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.helper.C49617c;
import com.p2082ss.android.ugc.aweme.feed.model.OcrLocation;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75401d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.a.a */
public final class C48018a implements AbstractC75401d {

    /* renamed from: a */
    private final Context f111239a;

    /* renamed from: b */
    private final Video f111240b;

    /* renamed from: c */
    private final C49617c f111241c;

    /* renamed from: d */
    private final OcrLocation f111242d;

    static {
        Covode.recordClassIndex(56744);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75401d
    /* renamed from: a */
    public final AbstractC75401d.C75402a mo80041a() {
        Video video = this.f111240b;
        if (video == null) {
            return new AbstractC75401d.C75402a(0, 0);
        }
        AbstractC75401d.C75402a a = this.f111241c.mo81410a(this.f111239a, video);
        C89219l.m154716b(a, "");
        return a;
    }

    public C48018a(Context context, Video video, C49617c cVar, OcrLocation ocrLocation) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        this.f111239a = context;
        this.f111240b = video;
        this.f111241c = cVar;
        this.f111242d = ocrLocation;
    }
}
