package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareUserContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bc */
public class C54522bc extends AbstractC54482a<ShareUserContent> {

    /* renamed from: a */
    protected RemoteImageView f124965a;

    /* renamed from: b */
    private TuxTextView f124966b;

    /* renamed from: x */
    private TuxTextView f124967x;

    /* renamed from: y */
    private TextView f124968y;

    static {
        Covode.recordClassIndex(64233);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final RemoteImageView mo91619i() {
        RemoteImageView remoteImageView = this.f124965a;
        if (remoteImageView == null) {
            C89219l.m154710a("iconView");
        }
        return remoteImageView;
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
        this.f124965a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById3, "");
        this.f124966b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ajs);
        C89219l.m154716b(findViewById4, "");
        this.f124967x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.eez);
        C89219l.m154716b(findViewById5, "");
        this.f124968y = (TextView) findViewById5;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    public final void bK_() {
        C24250e b = C24250e.m46054b();
        RemoteImageView remoteImageView = this.f124965a;
        if (remoteImageView == null) {
            C89219l.m154710a("iconView");
        }
        C24246a aVar = (C24246a) remoteImageView.getHierarchy();
        C89219l.m154716b(aVar, "");
        aVar.mo39959a(b);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.lm);
        RemoteImageView remoteImageView2 = this.f124965a;
        if (remoteImageView2 == null) {
            C89219l.m154710a("iconView");
        }
        remoteImageView2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.eg1);
        C89219l.m154716b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = 0;
        int i = Build.VERSION.SDK_INT;
        layoutParams2.setMarginStart(0);
        layoutParams2.gravity = 16;
        linearLayout.setLayoutParams(layoutParams2);
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91618a(ShareUserContent shareUserContent) {
        C89219l.m154721d(shareUserContent, "");
        IMUser a = C55085g.m100751a(shareUserContent.getUid(), shareUserContent.getSecUid());
        if (a == null || a.getAvatarThumb() == null) {
            RemoteImageView remoteImageView = this.f124965a;
            if (remoteImageView == null) {
                C89219l.m154710a("iconView");
            }
            C34577e.m70591a(remoteImageView, 2131232314);
            return;
        }
        RemoteImageView remoteImageView2 = this.f124965a;
        if (remoteImageView2 == null) {
            C89219l.m154710a("iconView");
        }
        C55198a.m100933a(remoteImageView2, a.getAvatarThumb(), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54522bc(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareUserContent shareUserContent, int i) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareUserContent, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareUserContent, i);
        TuxTextView tuxTextView = this.f124966b;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        tuxTextView.setText(shareUserContent.getName());
        TuxTextView tuxTextView2 = this.f124967x;
        if (tuxTextView2 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.f124967x;
        if (tuxTextView3 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView3.setText("@" + shareUserContent.getDesc());
        TextView textView = this.f124968y;
        if (textView == null) {
            C89219l.m154710a("tagView");
        }
        textView.setText(R.string.cij);
        mo91618a(shareUserContent);
        this.f124819o.mo91505a(50331648, 21);
        this.f124819o.mo91505a(67108864, this.f124823s);
    }
}
