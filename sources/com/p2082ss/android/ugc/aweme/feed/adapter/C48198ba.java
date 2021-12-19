package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18026g;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49670ae;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49690r;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ba */
public final class C48198ba implements AbstractC12853j {

    /* renamed from: a */
    public final C49672ag f111650a;

    /* renamed from: b */
    public final C36387c f111651b;

    /* renamed from: c */
    public final C49690r f111652c;

    /* renamed from: d */
    public final C35503c f111653d;

    /* renamed from: e */
    public final C71904j f111654e;

    /* renamed from: f */
    public final C18017a f111655f;

    /* renamed from: g */
    public final C49670ae f111656g;

    /* renamed from: h */
    public final C50458e f111657h;

    /* renamed from: i */
    public final FollowStatusEvent f111658i;

    /* renamed from: j */
    public final C2954a f111659j;

    /* renamed from: k */
    public final C18026g f111660k;

    /* renamed from: l */
    public final InteractionTagInfoEvent f111661l;

    static {
        Covode.recordClassIndex(56940);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48198ba)) {
            return false;
        }
        C48198ba baVar = (C48198ba) obj;
        return C89219l.m154714a(this.f111650a, baVar.f111650a) && C89219l.m154714a(this.f111651b, baVar.f111651b) && C89219l.m154714a(this.f111652c, baVar.f111652c) && C89219l.m154714a(this.f111653d, baVar.f111653d) && C89219l.m154714a(this.f111654e, baVar.f111654e) && C89219l.m154714a(this.f111655f, baVar.f111655f) && C89219l.m154714a(this.f111656g, baVar.f111656g) && C89219l.m154714a(this.f111657h, baVar.f111657h) && C89219l.m154714a(this.f111658i, baVar.f111658i) && C89219l.m154714a(this.f111659j, baVar.f111659j) && C89219l.m154714a(this.f111660k, baVar.f111660k) && C89219l.m154714a(this.f111661l, baVar.f111661l);
    }

    public final int hashCode() {
        C49672ag agVar = this.f111650a;
        int i = 0;
        int hashCode = (agVar != null ? agVar.hashCode() : 0) * 31;
        C36387c cVar = this.f111651b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C49690r rVar = this.f111652c;
        int hashCode3 = (hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C35503c cVar2 = this.f111653d;
        int hashCode4 = (hashCode3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C71904j jVar = this.f111654e;
        int hashCode5 = (hashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        C18017a aVar = this.f111655f;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C49670ae aeVar = this.f111656g;
        int hashCode7 = (hashCode6 + (aeVar != null ? aeVar.hashCode() : 0)) * 31;
        C50458e eVar = this.f111657h;
        int hashCode8 = (hashCode7 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        FollowStatusEvent followStatusEvent = this.f111658i;
        int hashCode9 = (hashCode8 + (followStatusEvent != null ? followStatusEvent.hashCode() : 0)) * 31;
        C2954a aVar2 = this.f111659j;
        int hashCode10 = (hashCode9 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C18026g gVar = this.f111660k;
        int hashCode11 = (hashCode10 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        InteractionTagInfoEvent interactionTagInfoEvent = this.f111661l;
        if (interactionTagInfoEvent != null) {
            i = interactionTagInfoEvent.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        return "VideoEventDispatchState(videoEvent=" + this.f111650a + ", commentEvent=" + this.f111651b + ", diggEvent=" + this.f111652c + ", profileFollowEvent=" + this.f111653d + ", playerEvent=" + this.f111654e + ", onAwesomeSplashEvent=" + this.f111655f + ", shareEndEvent=" + this.f111656g + ", playProgressEvent=" + this.f111657h + ", followStatus=" + this.f111658i + ", roomStatusEvent=" + this.f111659j + ", topViewLiveEndEvent=" + this.f111660k + ", interactionTagInfoEvent=" + this.f111661l + ")";
    }

    public /* synthetic */ C48198ba() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    private C48198ba(C49672ag agVar, C36387c cVar, C49690r rVar, C35503c cVar2, C71904j jVar, C18017a aVar, C49670ae aeVar, C50458e eVar, FollowStatusEvent followStatusEvent, C2954a aVar2, C18026g gVar, InteractionTagInfoEvent interactionTagInfoEvent) {
        this.f111650a = agVar;
        this.f111651b = cVar;
        this.f111652c = rVar;
        this.f111653d = cVar2;
        this.f111654e = jVar;
        this.f111655f = aVar;
        this.f111656g = aeVar;
        this.f111657h = eVar;
        this.f111658i = followStatusEvent;
        this.f111659j = aVar2;
        this.f111660k = gVar;
        this.f111661l = interactionTagInfoEvent;
    }

    /* renamed from: a */
    public static /* synthetic */ C48198ba m91540a(C48198ba baVar, C49672ag agVar, C36387c cVar, C49690r rVar, C35503c cVar2, C71904j jVar, C18017a aVar, C49670ae aeVar, C50458e eVar, FollowStatusEvent followStatusEvent, C2954a aVar2, C18026g gVar, InteractionTagInfoEvent interactionTagInfoEvent, int i) {
        InteractionTagInfoEvent interactionTagInfoEvent2 = interactionTagInfoEvent;
        C18026g gVar2 = gVar;
        C35503c cVar3 = cVar2;
        C49690r rVar2 = rVar;
        C36387c cVar4 = cVar;
        C49672ag agVar2 = agVar;
        C71904j jVar2 = jVar;
        C18017a aVar3 = aVar;
        C49670ae aeVar2 = aeVar;
        C50458e eVar2 = eVar;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        C2954a aVar4 = aVar2;
        if ((i & 1) != 0) {
            agVar2 = baVar.f111650a;
        }
        if ((i & 2) != 0) {
            cVar4 = baVar.f111651b;
        }
        if ((i & 4) != 0) {
            rVar2 = baVar.f111652c;
        }
        if ((i & 8) != 0) {
            cVar3 = baVar.f111653d;
        }
        if ((i & 16) != 0) {
            jVar2 = baVar.f111654e;
        }
        if ((i & 32) != 0) {
            aVar3 = baVar.f111655f;
        }
        if ((i & 64) != 0) {
            aeVar2 = baVar.f111656g;
        }
        if ((i & 128) != 0) {
            eVar2 = baVar.f111657h;
        }
        if ((i & 256) != 0) {
            followStatusEvent2 = baVar.f111658i;
        }
        if ((i & 512) != 0) {
            aVar4 = baVar.f111659j;
        }
        if ((i & 1024) != 0) {
            gVar2 = baVar.f111660k;
        }
        if ((i & 2048) != 0) {
            interactionTagInfoEvent2 = baVar.f111661l;
        }
        return new C48198ba(agVar2, cVar4, rVar2, cVar3, jVar2, aVar3, aeVar2, eVar2, followStatusEvent2, aVar4, gVar2, interactionTagInfoEvent2);
    }
}
