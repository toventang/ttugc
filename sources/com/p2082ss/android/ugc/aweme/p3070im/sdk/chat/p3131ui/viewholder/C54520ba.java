package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareUserContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55226r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55192b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ba */
public class C54520ba extends AbstractC54482a<ShareUserContent> {

    /* renamed from: A */
    private RemoteImageView f124957A;

    /* renamed from: B */
    private TextView f124958B;

    /* renamed from: a */
    protected RemoteImageView f124959a;

    /* renamed from: b */
    private TuxTextView f124960b;

    /* renamed from: x */
    private TuxTextView f124961x;

    /* renamed from: y */
    private RemoteImageView f124962y;

    /* renamed from: z */
    private RemoteImageView f124963z;

    static {
        Covode.recordClassIndex(64231);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final RemoteImageView mo91616i() {
        RemoteImageView remoteImageView = this.f124959a;
        if (remoteImageView == null) {
            C89219l.m154710a("iconView");
        }
        return remoteImageView;
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
            RemoteImageView remoteImageView = this.f124962y;
            if (remoteImageView == null) {
                C89219l.m154710a("img1View");
            }
            C55192b.m100905a(remoteImageView, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
            RemoteImageView remoteImageView2 = this.f124957A;
            if (remoteImageView2 == null) {
                C89219l.m154710a("img3View");
            }
            C55192b.m100905a(remoteImageView2, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
            return;
        }
        RemoteImageView remoteImageView3 = this.f124962y;
        if (remoteImageView3 == null) {
            C89219l.m154710a("img1View");
        }
        C55192b.m100905a(remoteImageView3, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
        RemoteImageView remoteImageView4 = this.f124957A;
        if (remoteImageView4 == null) {
            C89219l.m154710a("img3View");
        }
        C55192b.m100905a(remoteImageView4, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        View findViewById = this.itemView.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f124819o = C54438a.C54439a.m99780a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.icon_iv);
        C89219l.m154716b(findViewById2, "");
        this.f124959a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById3, "");
        this.f124960b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ajs);
        C89219l.m154716b(findViewById4, "");
        this.f124961x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.blf);
        C89219l.m154716b(findViewById5, "");
        this.f124962y = (RemoteImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.blg);
        C89219l.m154716b(findViewById6, "");
        this.f124963z = (RemoteImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.blh);
        C89219l.m154716b(findViewById7, "");
        this.f124957A = (RemoteImageView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.b70);
        C89219l.m154716b(findViewById8, "");
        this.f124958B = (TextView) findViewById8;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91565a(View.OnLongClickListener onLongClickListener) {
        C89219l.m154721d(onLongClickListener, "");
        this.f124819o.mo91507a(onLongClickListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        super.mo91564a(onClickListener);
        this.f124819o.mo91506a(onClickListener);
        TextView textView = this.f124958B;
        if (textView == null) {
            C89219l.m154710a("mContentFollowTv");
        }
        textView.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91615a(ShareUserContent shareUserContent) {
        C89219l.m154721d(shareUserContent, "");
        IMUser a = C55085g.m100751a(shareUserContent.getUid(), shareUserContent.getSecUid());
        if (a == null || a.getAvatarThumb() == null) {
            RemoteImageView remoteImageView = this.f124959a;
            if (remoteImageView == null) {
                C89219l.m154710a("iconView");
            }
            C34577e.m70591a(remoteImageView, 2131232314);
            return;
        }
        RemoteImageView remoteImageView2 = this.f124959a;
        if (remoteImageView2 == null) {
            C89219l.m154710a("iconView");
        }
        C55198a.m100933a(remoteImageView2, a.getAvatarThumb(), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54520ba(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareUserContent shareUserContent, int i) {
        int i2;
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareUserContent, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareUserContent, i);
        TuxTextView tuxTextView = this.f124960b;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        tuxTextView.setText(shareUserContent.getName());
        TuxTextView tuxTextView2 = this.f124961x;
        if (tuxTextView2 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.f124961x;
        if (tuxTextView3 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView3.setText("@" + shareUserContent.getDesc());
        mo91615a(shareUserContent);
        RemoteImageView remoteImageView = this.f124962y;
        if (remoteImageView == null) {
            C89219l.m154710a("img1View");
        }
        C55198a.m100933a(remoteImageView, shareUserContent.getAwemeCoverList().get(0), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        RemoteImageView remoteImageView2 = this.f124963z;
        if (remoteImageView2 == null) {
            C89219l.m154710a("img2View");
        }
        C55198a.m100933a(remoteImageView2, shareUserContent.getAwemeCoverList().get(1), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        RemoteImageView remoteImageView3 = this.f124957A;
        if (remoteImageView3 == null) {
            C89219l.m154710a("img3View");
        }
        C55198a.m100933a(remoteImageView3, shareUserContent.getAwemeCoverList().get(2), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        IMUser a = C55085g.m100751a(shareUserContent.getUid(), shareUserContent.getSecUid());
        if (a != null) {
            i2 = a.getFollowStatus();
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            TextView textView = this.f124958B;
            if (textView == null) {
                C89219l.m154710a("mContentFollowTv");
            }
            textView.setVisibility(0);
        } else {
            TextView textView2 = this.f124958B;
            if (textView2 == null) {
                C89219l.m154710a("mContentFollowTv");
            }
            textView2.setVisibility(8);
        }
        this.f124819o.mo91505a(50331648, 21);
        this.f124819o.mo91505a(67108864, this.f124823s);
        TextView textView3 = this.f124958B;
        if (textView3 == null) {
            C89219l.m154710a("mContentFollowTv");
        }
        textView3.setTag(50331648, 5);
        TextView textView4 = this.f124958B;
        if (textView4 == null) {
            C89219l.m154710a("mContentFollowTv");
        }
        textView4.setTag(67108864, aiVar);
    }
}
