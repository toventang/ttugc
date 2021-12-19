package com.p2082ss.android.ugc.aweme.story.publish.foreground;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.settings.C68742h;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.foreground.a */
public final class C77443a extends AbstractC72639k implements C40964c.AbstractC40966a {

    /* renamed from: a */
    private boolean f173762a;

    /* renamed from: b */
    private boolean f173763b;

    /* renamed from: c */
    private boolean f173764c;

    /* renamed from: d */
    private final List<ScheduleInfo> f173765d;

    static {
        Covode.recordClassIndex(90476);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
    /* renamed from: b */
    public final void mo70155b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
    /* renamed from: a */
    public final void mo70154a() {
        m135399c();
    }

    /* renamed from: c */
    private final void m135399c() {
        if (C68742h.m121175a() && this.f173762a) {
            if (!this.f173764c) {
                StoryPublishNotificationService.C77441a.m135395a();
                this.f173764c = true;
            }
            this.f173763b = StoryPublishNotificationService.C77441a.m135398a(this.f173765d);
        }
    }

    public C77443a(List<ScheduleInfo> list) {
        C89219l.m154721d(list, "");
        this.f173765d = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onProgress(int i, Object obj) {
        this.f173762a = true;
        if (!this.f173763b) {
            C40964c cVar = C40964c.C40968c.f95804a;
            C89219l.m154716b(cVar, "");
            if (cVar.mo70144a()) {
                m135399c();
            }
        }
    }
}
