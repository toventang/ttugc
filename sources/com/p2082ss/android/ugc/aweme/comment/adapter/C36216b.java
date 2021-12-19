package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentAtSearchLoadingView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.b */
public final class C36216b extends AbstractC39060f<CommentAtSummonFriendItem> {

    /* renamed from: c */
    public static final C36217a f85530c = new C36217a((byte) 0);

    /* renamed from: a */
    public AbstractC36218b f85531a;

    /* renamed from: b */
    public int f85532b;

    /* renamed from: d */
    private CommentAtSearchLoadingView f85533d;

    /* renamed from: e */
    private final Aweme f85534e;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.b$b */
    public interface AbstractC36218b {
        static {
            Covode.recordClassIndex(43484);
        }

        /* renamed from: a */
        void mo63381a(int i, CommentAtSummonFriendItem commentAtSummonFriendItem);

        /* renamed from: a */
        void mo63382a(User user);
    }

    static {
        Covode.recordClassIndex(43482);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.b$a */
    public static final class C36217a {
        static {
            Covode.recordClassIndex(43483);
        }

        private C36217a() {
        }

        public /* synthetic */ C36217a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void ao_() {
        super.ao_();
        CommentAtSearchLoadingView commentAtSearchLoadingView = this.f85533d;
        if (commentAtSearchLoadingView != null) {
            commentAtSearchLoadingView.mo64511a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void aq_() {
        super.aq_();
        CommentAtSearchLoadingView commentAtSearchLoadingView = this.f85533d;
        if (commentAtSearchLoadingView != null) {
            commentAtSearchLoadingView.mo64511a(false);
        }
    }

    public C36216b(Aweme aweme) {
        this.f85534e = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        CommentAtSearchLoadingView commentAtSearchLoadingView;
        Context context;
        Context context2;
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        String str = null;
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            commentAtSearchLoadingView = null;
        } else {
            commentAtSearchLoadingView = new CommentAtSearchLoadingView(context2, (AttributeSet) null, 6);
        }
        this.f85533d = commentAtSearchLoadingView;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27403a(this.f85533d));
        View b = dmtStatusView.mo27380b(2);
        Objects.requireNonNull(b, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) b;
        if (!(viewGroup == null || (context = viewGroup.getContext()) == null)) {
            str = context.getString(R.string.cxg);
        }
        textView.setText(str);
        Context context3 = textView.getContext();
        C89219l.m154716b(context3, "");
        textView.setTextColor(context3.getResources().getColor(R.color.c2));
        C89219l.m154716b(a_, "");
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.j1, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C36219c(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchViewHolder");
        Object obj = this.f92236l.get(i);
        C89219l.m154716b(obj, "");
        ((C36219c) viewHolder).mo63383a((CommentAtSummonFriendItem) obj, this.f85534e, this.f85531a);
    }
}
