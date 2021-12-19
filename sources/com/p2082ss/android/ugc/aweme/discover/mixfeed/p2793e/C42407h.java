package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41937p;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42744bb;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchMixUserCell;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.h */
public final class C42407h extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: a */
    public SearchMixUserCell f98782a;

    /* renamed from: b */
    public List<SearchUser> f98783b;

    static {
        Covode.recordClassIndex(50352);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    /* renamed from: I */
    public final View mo70834I() {
        SearchMixUserCell searchMixUserCell = this.f98782a;
        if (searchMixUserCell != null) {
            return searchMixUserCell.mo73015a();
        }
        return null;
    }

    public C42407h(View view, Context context) {
        super(view);
        SearchMixUserCell searchMixUserCell = new SearchMixUserCell(view, context, new AbstractC42744bb.AbstractC42746a() {
            /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42407h.C424081 */

            static {
                Covode.recordClassIndex(50353);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42744bb.AbstractC42746a
            /* renamed from: a */
            public final void mo71596a() {
                C39162r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(new C33743c().mo59976a("search_type", "user").mo59977a()));
                AbstractC81915c.m141874a(new C41937p(C67458j.f151134c));
            }
        });
        this.f98782a = searchMixUserCell;
        searchMixUserCell.f99330l = false;
    }
}
