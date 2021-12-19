package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3341a.C57435a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.FeedTitleWidget */
public final class FeedTitleWidget extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(67347);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    /* renamed from: b */
    public final AbstractC57436a mo94686b(View view) {
        return new C57423a(view, view);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.FeedTitleWidget$a */
    public static final class C57423a extends AbstractC57436a {

        /* renamed from: a */
        final /* synthetic */ View f130909a;

        /* renamed from: b */
        private TextView f130910b;

        static {
            Covode.recordClassIndex(67348);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94687a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94690a(DataCenter dataCenter) {
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: b */
        public final String mo94694b() {
            return "title";
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94689a(View view) {
            MethodCollector.m26663i(5065);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.acx, (ViewGroup) null);
                this.f130910b = (TextView) inflate.findViewById(R.id.f63);
                frameLayout.addView(inflate);
            }
            MethodCollector.m26664o(5065);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94691a(C57435a aVar) {
            User author;
            String shortId;
            super.mo94691a(aVar);
            TextView textView = this.f130910b;
            if (textView != null) {
                StringBuilder sb = new StringBuilder("@");
                Aweme aweme = this.f130950d;
                String str = "";
                if (aweme == null || (author = aweme.getAuthor()) == null) {
                    str = null;
                } else {
                    C89219l.m154721d(author, str);
                    if (!TextUtils.isEmpty(author.getUniqueId())) {
                        shortId = author.getUniqueId();
                        C89219l.m154716b(shortId, str);
                    } else if (!TextUtils.isEmpty(author.getShortId())) {
                        shortId = author.getShortId();
                        C89219l.m154716b(shortId, str);
                    }
                    str = shortId;
                }
                textView.setText(sb.append(str).toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57423a(View view, View view2) {
            super(view2);
            this.f130909a = view;
        }
    }
}
