package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63408v;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.presenter.f */
public final /* synthetic */ class C63839f implements AbstractC88430c {

    /* renamed from: a */
    private final C63408v.C63411a f144750a;

    static {
        Covode.recordClassIndex(75263);
    }

    private C63839f(C63408v.C63411a aVar) {
        this.f144750a = aVar;
    }

    /* renamed from: a */
    static AbstractC88430c m115522a(C63408v.C63411a aVar) {
        return new C63839f(aVar);
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88430c
    /* renamed from: a */
    public final Object mo9210a(Object obj, Object obj2) {
        int i;
        Aweme aweme = (Aweme) obj;
        FeedItemList feedItemList = (FeedItemList) obj2;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(feedItemList, "");
        if (aweme.getUserStory() != null) {
            String str = null;
            if (!C76706a.m134288n(aweme)) {
                List<Aweme> items = feedItemList.getItems();
                if (items == null) {
                    items = new ArrayList<>();
                    feedItemList.items = items;
                }
                ListIterator<Aweme> listIterator = items.listIterator(items.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    }
                    Aweme previous = listIterator.previous();
                    if (previous.isTop()) {
                        break;
                    }
                    C89219l.m154716b(previous, "");
                    if (previous.isScheduleVideo()) {
                        break;
                    }
                }
                i = listIterator.nextIndex();
                int i2 = i + 1;
                items.add(i2, aweme);
                StringBuilder append = new StringBuilder("add story item to ").append(i2).append(", uid: ");
                User author = aweme.getAuthor();
                if (author != null) {
                    str = author.getUid();
                }
                C77283a.m135107a("StoryV5VH", append.append(str).toString());
            }
        }
        return feedItemList;
    }
}
