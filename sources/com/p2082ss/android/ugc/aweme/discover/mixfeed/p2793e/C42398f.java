package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41937p;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42751bf;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42755bh;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.f */
public final class C42398f extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: a */
    public C42755bh f98765a;

    /* renamed from: b */
    public Music f98766b;

    static {
        Covode.recordClassIndex(50343);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    /* renamed from: I */
    public final View mo70834I() {
        C42755bh bhVar = this.f98765a;
        if (bhVar != null) {
            return bhVar.mo73024b();
        }
        return null;
    }

    public C42398f(View view, Context context) {
        super(view);
        this.f98765a = new C42755bh(view, context, false, new AbstractC42751bf.AbstractC42753a() {
            /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42398f.C423991 */

            static {
                Covode.recordClassIndex(50344);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42751bf.AbstractC42753a
            /* renamed from: a */
            public final void mo71588a() {
                C39162r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(new C33743c().mo59976a("search_type", "music").mo59977a()));
                AbstractC81915c.m141874a(new C41937p(C67458j.f151136e));
            }
        });
    }
}
