package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStickerContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55215k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55225q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55226r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55192b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ay */
public class C54516ay extends AbstractC54482a<ShareStickerContent> {

    /* renamed from: a */
    private RemoteImageView f124945a;

    /* renamed from: b */
    private TuxTextView f124946b;

    /* renamed from: x */
    private TuxTextView f124947x;

    /* renamed from: y */
    private TextView f124948y;

    static {
        Covode.recordClassIndex(64227);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        Object a = mo91563a(R.id.acq);
        C89219l.m154716b(a, "");
        this.f124819o = C54438a.C54439a.m99780a((View) a);
        Object a2 = mo91563a(R.id.icon_iv);
        C89219l.m154716b(a2, "");
        this.f124945a = (RemoteImageView) a2;
        Object a3 = mo91563a(R.id.title_tv);
        C89219l.m154716b(a3, "");
        this.f124946b = (TuxTextView) a3;
        Object a4 = mo91563a(R.id.ajs);
        C89219l.m154716b(a4, "");
        this.f124947x = (TuxTextView) a4;
        Object a5 = mo91563a(R.id.eez);
        C89219l.m154716b(a5, "");
        this.f124948y = (TextView) a5;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    public final void bK_() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.li);
        if (C55226r.m100992a()) {
            RemoteImageView remoteImageView = this.f124945a;
            if (remoteImageView == null) {
                C89219l.m154710a("iconView");
            }
            C55192b.m100905a(remoteImageView, new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize});
            return;
        }
        RemoteImageView remoteImageView2 = this.f124945a;
        if (remoteImageView2 == null) {
            C89219l.m154710a("iconView");
        }
        C55192b.m100905a(remoteImageView2, new float[]{0.0f, dimensionPixelSize, dimensionPixelSize, 0.0f});
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        super.mo91564a(onClickListener);
        this.f124819o.mo91506a(onClickListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91565a(View.OnLongClickListener onLongClickListener) {
        C89219l.m154721d(onLongClickListener, "");
        this.f124819o.mo91507a(onLongClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54516ay(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareStickerContent shareStickerContent, int i) {
        long j;
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareStickerContent, i);
        if (shareStickerContent != null) {
            TuxTextView tuxTextView = this.f124946b;
            if (tuxTextView == null) {
                C89219l.m154710a("titleView");
            }
            tuxTextView.setText(shareStickerContent.getTitle());
            TuxTextView tuxTextView2 = this.f124947x;
            if (tuxTextView2 == null) {
                C89219l.m154710a("descView");
            }
            tuxTextView2.setVisibility(0);
            TuxTextView tuxTextView3 = this.f124947x;
            if (tuxTextView3 == null) {
                C89219l.m154710a("descView");
            }
            View view = this.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            Object[] objArr = new Object[1];
            Long userCount = shareStickerContent.getUserCount();
            if (userCount != null) {
                j = userCount.longValue();
            } else {
                j = 0;
            }
            objArr[0] = C55215k.m100959a(j);
            tuxTextView3.setText(resources.getString(R.string.ar8, objArr));
            RemoteImageView remoteImageView = this.f124945a;
            if (remoteImageView == null) {
                C89219l.m154710a("iconView");
            }
            C55225q.m100988a(remoteImageView, shareStickerContent.getCover(), 2131232865, 2131232865);
        }
        TextView textView = this.f124948y;
        if (textView == null) {
            C89219l.m154710a("tagView");
        }
        textView.setText(R.string.g40);
        this.f124819o.mo91505a(50331648, 39);
        this.f124819o.mo91505a(67108864, this.f124823s);
    }
}
