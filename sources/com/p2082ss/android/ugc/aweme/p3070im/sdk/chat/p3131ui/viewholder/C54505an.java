package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.p035f.C0671a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareMusicContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55215k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55225q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55226r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55192b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.an */
public class C54505an extends AbstractC54482a<ShareMusicContent> {

    /* renamed from: a */
    private RemoteImageView f124919a;

    /* renamed from: b */
    private TuxTextView f124920b;

    /* renamed from: x */
    private TuxTextView f124921x;

    /* renamed from: y */
    private TextView f124922y;

    /* renamed from: z */
    private View f124923z;

    static {
        Covode.recordClassIndex(64216);
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
        this.f124919a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById3, "");
        this.f124920b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ajs);
        C89219l.m154716b(findViewById4, "");
        this.f124921x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.eez);
        C89219l.m154716b(findViewById5, "");
        this.f124922y = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.a1x);
        C89219l.m154716b(findViewById6, "");
        this.f124923z = findViewById6;
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
            RemoteImageView remoteImageView = this.f124919a;
            if (remoteImageView == null) {
                C89219l.m154710a("iconView");
            }
            C55192b.m100905a(remoteImageView, new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize});
            return;
        }
        RemoteImageView remoteImageView2 = this.f124919a;
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
    public C54505an(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareMusicContent shareMusicContent, int i) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareMusicContent, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareMusicContent, i);
        C0671a a = C0671a.m2407a();
        TuxTextView tuxTextView = this.f124920b;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        tuxTextView.setText(shareMusicContent.getMusicName());
        TuxTextView tuxTextView2 = this.f124921x;
        if (tuxTextView2 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.f124921x;
        if (tuxTextView3 == null) {
            C89219l.m154710a("descView");
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        tuxTextView3.setText(context.getResources().getString(R.string.cfc, a.mo2696b(C55215k.m100959a((long) shareMusicContent.getUserCount()))));
        TextView textView = this.f124922y;
        if (textView == null) {
            C89219l.m154710a("tagView");
        }
        textView.setText(R.string.cfb);
        RemoteImageView remoteImageView = this.f124919a;
        if (remoteImageView == null) {
            C89219l.m154710a("iconView");
        }
        C55225q.m100988a(remoteImageView, shareMusicContent.getCoverThumb(), 2131232867, R.drawable.av5);
        this.f124819o.mo91505a(50331648, 17);
        this.f124819o.mo91505a(67108864, this.f124823s);
    }
}
