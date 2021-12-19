package com.p2082ss.android.ugc.aweme.kids.discovery.list;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.AbstractC57367d;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.C57364c;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57559a;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57561c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.a */
public final class C57590a extends AbstractC39058d implements AbstractC57367d {

    /* renamed from: j */
    public static final C57591a f131465j = new C57591a((byte) 0);

    /* renamed from: d */
    public C57559a f131466d;

    /* renamed from: e */
    public boolean f131467e = true;

    /* renamed from: f */
    public int f131468f;

    /* renamed from: g */
    public String f131469g;

    /* renamed from: h */
    public String f131470h;

    /* renamed from: i */
    public int f131471i = -1;

    /* renamed from: k */
    private final int f131472k;

    /* renamed from: w */
    private final int f131473w;

    /* renamed from: x */
    private final Context f131474x;

    static {
        Covode.recordClassIndex(67548);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.a$a */
    public static final class C57591a {
        static {
            Covode.recordClassIndex(67549);
        }

        private C57591a() {
        }

        public /* synthetic */ C57591a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final int mo60933c() {
        if (super.mo60933c() <= 8 || this.f131471i != 1) {
            return super.mo60933c();
        }
        return 9;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.acj, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C57597d(a, this);
    }

    public C57590a(Context context) {
        C89219l.m154721d(context, "");
        this.f131474x = context;
        this.f131472k = context.getResources().getDimensionPixelSize(R.dimen.n1);
        this.f131473w = context.getResources().getDimensionPixelSize(R.dimen.n0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a */
    public final void mo63355a(RecyclerView.ViewHolder viewHolder) {
        float f;
        List list;
        C89219l.m154721d(viewHolder, "");
        TuxTextView tuxTextView = (TuxTextView) viewHolder.itemView.findViewById(R.id.ffk);
        if (this.f131471i != 1 || (list = this.f92236l) == null || list.size() <= 8) {
            f = 14.0f;
        } else {
            Objects.requireNonNull(tuxTextView, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            tuxTextView.setText(this.f131474x.getString(R.string.cs0));
            f = 104.0f;
        }
        View view = viewHolder.itemView;
        C89219l.m154716b(view, "");
        view.setLayoutParams(new ViewGroup.LayoutParams((int) C13628n.m24520b(C17867d.m33078a(), f), (int) C13628n.m24520b(C17867d.m33078a(), 133.0f)));
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        return C57364c.C57366a.m103977a(viewGroup, "category", this, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final void mo61483b(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        C57364c cVar = (C57364c) viewHolder;
        Aweme aweme = (Aweme) this.f92236l.get(i);
        int i2 = this.f131472k;
        int i3 = this.f131473w;
        if (aweme != null) {
            View view = cVar.itemView;
            C89219l.m154716b(view, "");
            AbstractC39059e.m79277a(view.getRootView(), i2, i3);
            cVar.mo94629a(aweme);
        }
        cVar.f92234p = this.f131467e;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.AbstractC57367d
    /* renamed from: a */
    public final void mo94631a(View view, Aweme aweme, String str) {
        C57561c cVar;
        if (view != null) {
            if (TextUtils.equals("view more", str)) {
                C57355f.m103962a("click_view_more_category", new C33743c().mo59976a("enter_from", "discovery").mo59976a("exit_method", "swipe_for_more").mo59976a("category_id", this.f131469g).mo59977a());
                C57559a aVar = this.f131466d;
                if (aVar != null && (cVar = aVar.f131396b) != null) {
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    SmartRouter.buildRoute(context, "//kids/discovery/gallery").withParam("title", cVar.f131402b).withParam("challenge_id", cVar.f131401a).withParam("feed_type", cVar.f131403c).withParam("mob_enter_from", "swipe_for_more").open();
                }
            } else if (aweme != null) {
                Bundle bundle = new Bundle();
                bundle.putString("group_id", aweme.getAid());
                bundle.putString("enter_from", "discovery");
                C57355f.m103961a("discover_preview_enter", bundle);
                SmartRouter.buildRoute(view.getContext(), "//kids/discovery/feed").withParam("current_id", aweme.getAid()).withParam("enter_from", "category_details_page").withParam("title", this.f131470h).withParam("challenge_id", this.f131469g).withParam("feed_type", this.f131471i).open();
            }
        }
    }
}
