package com.p2082ss.android.ugc.aweme.common.p2629a;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.common.a.d */
public abstract class AbstractC39058d extends AbstractC34766g<Aweme> {
    static {
        Covode.recordClassIndex(46674);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo67805b(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (mo67805b(viewHolder)) {
            ((AbstractC39062g) viewHolder).mo66994b(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (mo67805b(viewHolder)) {
            AbstractC39062g gVar = (AbstractC39062g) viewHolder;
            gVar.mo66994b(false);
            gVar.as_();
        }
    }

    /* renamed from: a */
    public final int mo67803a(String str) {
        if (this.f92236l != null && !this.f92236l.isEmpty() && !TextUtils.isEmpty(str)) {
            int size = this.f92236l.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) this.f92236l.get(i);
                if (aweme != null && C13627m.m24499a(str, aweme.getAid())) {
                    if (mo61481b() != null) {
                        return i + 1;
                    } else {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo67804a(FollowStatus followStatus) {
        User author;
        if (!(this.f92236l == null || this.f92236l.isEmpty() || followStatus == null || TextUtils.isEmpty(followStatus.userId))) {
            for (Aweme aweme : this.f92236l) {
                if (!(aweme == null || (author = aweme.getAuthor()) == null || !followStatus.userId.equals(author.getUid()))) {
                    author.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }
}
