package com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b */
public final class C59774b implements AbstractC17641a {

    /* renamed from: a */
    public String f136162a;

    /* renamed from: b */
    public UrlModel f136163b;

    /* renamed from: c */
    public String f136164c;

    /* renamed from: d */
    public String f136165d;

    /* renamed from: e */
    public Aweme f136166e;

    static {
        Covode.recordClassIndex(70177);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C59774b) && C89219l.m154714a(this.f136166e, ((C59774b) obj).f136166e);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f136166e;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MixFeedItem(aweme=" + this.f136166e + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C59774b(Aweme aweme) {
        UrlModel urlModel;
        C89219l.m154721d(aweme, "");
        this.f136166e = aweme;
        String aid = aweme.getAid();
        C89219l.m154716b(aid, "");
        this.f136162a = aid;
        Video video = this.f136166e.getVideo();
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        this.f136163b = urlModel;
        this.f136164c = this.f136166e.getDesc();
        AwemeStatistics statistics = this.f136166e.getStatistics();
        C89219l.m154716b(statistics, "");
        String a = C53437b.m98615a(statistics.getPlayCount());
        C89219l.m154716b(a, "");
        this.f136165d = a;
    }
}
