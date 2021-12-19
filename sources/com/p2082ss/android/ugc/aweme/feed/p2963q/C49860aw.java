package com.p2082ss.android.ugc.aweme.feed.p2963q;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49744a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49987t;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50558w;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import java.util.Date;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.q.aw */
public final class C49860aw extends C49888x implements AbstractC49987t {

    /* renamed from: s */
    public static String f114940s = "FeedDeduplicate";

    /* renamed from: a */
    public Date f114941a;

    /* renamed from: b */
    public long f114942b;

    /* renamed from: c */
    public long f114943c;

    /* renamed from: r */
    public int f114944r;

    /* renamed from: t */
    public AbstractC49744a f114945t;

    static {
        Covode.recordClassIndex(58967);
    }

    public C49860aw(String str) {
        super(str, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: a */
    public final void mo70393a(View view, Bundle bundle) {
        super.mo70393a(view, bundle);
        Date date = new Date();
        this.f114941a = date;
        this.f114942b = date.getTime();
        this.f114944r = -1;
        if (C16048b.m29633a().mo25412a(true, "enable_feed_replace_unseen_video", 0) == 1) {
            this.f114759N.mo67974a(new ViewPager.C1582h() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49860aw.C498611 */

                static {
                    Covode.recordClassIndex(58968);
                }

                @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageSelected(int i) {
                    C49860aw.this.mo81110aE();
                    C49860aw.this.f114768W.getCount();
                    C49860aw.this.mo81109aD().getAid();
                    C49860aw.this.f114943c = new Date().getTime();
                    if (i > C49860aw.this.f114944r) {
                        long j = C49860aw.this.f114943c;
                        long j2 = C49860aw.this.f114942b;
                        List<Aweme> d = C49860aw.this.f114768W.mo80327d();
                        C89219l.m154721d(d, "");
                        if (j - j2 > 7200000 && !C50558w.m94789a(i, d)) {
                            C49860aw.this.f114945t.mo84303c();
                        }
                    }
                    C49860aw.this.f114944r = i;
                    C49860aw awVar = C49860aw.this;
                    awVar.f114942b = awVar.f114943c;
                    super.onPageSelected(i);
                }
            });
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo62668a(List<Aweme> list, int i) {
        if (this.f114768W.getCount() == 0) {
            this.f114768W.mo80286a(list);
        } else {
            this.f114768W.mo80322a(list, i);
        }
        if (i >= 0 && i < this.f114768W.getCount()) {
            this.f114759N.setCurrentItem(i);
            Aweme c = this.f114768W.mo80287c(i);
            if (C76706a.m134277c(c)) {
                mo84754bg().mo80114a(c, i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49987t
    /* renamed from: d */
    public final void mo84887d(List<Aweme> list, boolean z) {
        if (mo84730bE()) {
            this.f114778aF.setRefreshing(false);
            this.f114768W.f111624b = z;
            if (!z) {
                this.f114758M.mo85752c();
            } else {
                this.f114758M.mo85753d();
            }
            Aweme c = this.f114768W.mo80287c(this.f114759N.getCurrentItem());
            int count = this.f114768W.getCount();
            list.size();
            int a = C50545m.m94760a(list, c) + 1;
            C50558w.m94788a(list);
            for (int i = 0; i < count - a; i++) {
                list.get(a).getAid();
                list.get(a).getRequestId();
                list.remove(a);
            }
            this.f114768W.mo80286a(list);
            C50558w.m94788a(list);
            list.size();
        }
    }
}
