package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.VideoUpdateTipsContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bl */
public final class C54540bl extends AbstractC54482a<VideoUpdateTipsContent> {

    /* renamed from: a */
    private RemoteImageView f124998a;

    /* renamed from: b */
    private TextView f124999b;

    /* renamed from: x */
    private TextView f125000x;

    /* renamed from: y */
    private View f125001y;

    static {
        Covode.recordClassIndex(64251);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        View findViewById = this.itemView.findViewById(R.id.afs);
        C89219l.m154716b(findViewById, "");
        this.f124998a = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById2, "");
        this.f124999b = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.adq);
        C89219l.m154716b(findViewById3, "");
        this.f125000x = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.aco);
        C89219l.m154716b(findViewById4, "");
        this.f124819o = C54438a.C54439a.m99780a(findViewById4);
        View findViewById5 = this.itemView.findViewById(R.id.afv);
        C89219l.m154716b(findViewById5, "");
        this.f125001y = findViewById5;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        this.f124819o.mo91506a(onClickListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91565a(View.OnLongClickListener onLongClickListener) {
        C89219l.m154721d(onLongClickListener, "");
        this.f124819o.mo91507a(onLongClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54540bl(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, VideoUpdateTipsContent videoUpdateTipsContent, int i) {
        VideoUpdateTipsContent videoUpdateTipsContent2 = videoUpdateTipsContent;
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, videoUpdateTipsContent2, i);
        if (videoUpdateTipsContent2 != null) {
            RemoteImageView remoteImageView = this.f124998a;
            if (remoteImageView == null) {
                C89219l.m154710a("coverIv");
            }
            C34577e.m70592a(remoteImageView, videoUpdateTipsContent2.getCover());
            TextView textView = this.f124999b;
            if (textView == null) {
                C89219l.m154710a("titleTv");
            }
            textView.setText(videoUpdateTipsContent2.getTitle());
            TextView textView2 = this.f125000x;
            if (textView2 == null) {
                C89219l.m154710a("contentTv");
            }
            textView2.setText(videoUpdateTipsContent2.getContent());
            if (videoUpdateTipsContent2.isPhoto()) {
                View view = this.f125001y;
                if (view == null) {
                    C89219l.m154710a("coverTipsV");
                }
                view.setVisibility(0);
            } else {
                View view2 = this.f125001y;
                if (view2 == null) {
                    C89219l.m154710a("coverTipsV");
                }
                view2.setVisibility(8);
            }
        }
        this.f124819o.mo91505a(50331648, 11);
        this.f124819o.mo91505a(67108864, this.f124823s);
    }
}
