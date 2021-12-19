package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38398c;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.a */
public final class C38391a extends AbstractC39058d {

    /* renamed from: d */
    String f90712d = "";

    /* renamed from: e */
    private final AbstractC35500d f90713e;

    static {
        Covode.recordClassIndex(45897);
    }

    public C38391a(AbstractC35500d dVar) {
        C89219l.m154721d(dVar, "");
        this.f90713e = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return null;
        }
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.anr, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C38398c(a, this.f90713e);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        Aweme aweme;
        UrlModel avatarLarger;
        long j;
        if (this.f92236l != null && i >= 0 && i < this.f92236l.size() && (aweme = (Aweme) this.f92236l.get(i)) != null) {
            Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserAwemeViewHolder");
            C38398c cVar = (C38398c) viewHolder;
            String str = this.f90712d;
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(str, "");
            cVar.f90727g = aweme;
            User author = aweme.getAuthor();
            if (author != null) {
                if (author.getAvatarMedium() != null) {
                    avatarLarger = author.getAvatarMedium();
                } else if (author.getAvatarThumb() != null) {
                    avatarLarger = author.getAvatarThumb();
                } else if (author.getAvatarLarger() != null) {
                    avatarLarger = author.getAvatarLarger();
                }
                if (avatarLarger != null) {
                    C20766v a = C20761r.m39058a(new C20714a(avatarLarger.getUrlList()));
                    a.f49092E = cVar.f90723c;
                    a.mo34186c();
                }
            }
            cVar.f90722b.setText(aweme.getDesc());
            StringBuilder sb = new StringBuilder("@");
            User author2 = aweme.getAuthor();
            C89219l.m154716b(author2, "");
            cVar.f90724d.setText(sb.append(author2.getNickname()).toString());
            TuxTextView tuxTextView = cVar.f90725e;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getDiggCount();
            } else {
                j = 0;
            }
            tuxTextView.setText(C53437b.m98615a(j));
            if (C89219l.m154714a((Object) aweme.getAid(), (Object) str)) {
                cVar.f90726f.setVisibility(0);
                cVar.f90721a.setOnClickListener(new C38398c.View$OnClickListenerC38399a(cVar, aweme));
            } else {
                cVar.f90726f.setVisibility(8);
                cVar.f90721a.setOnClickListener(new C38398c.View$OnClickListenerC38400b(cVar, aweme));
            }
            cVar.mo62381c();
        }
    }
}
