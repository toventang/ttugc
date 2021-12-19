package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.EmojiContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55225q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.k */
public class C54555k extends AbstractC54482a<EmojiContent> {

    /* renamed from: b */
    private static final int f125042b = ((int) C13628n.m24520b(C17867d.m33078a(), 112.0f));

    /* renamed from: x */
    private static final int f125043x = ((int) C13628n.m24520b(C17867d.m33078a(), 300.0f));

    /* renamed from: y */
    private static final int f125044y = ((int) C13628n.m24520b(C17867d.m33078a(), 180.0f));

    /* renamed from: a */
    private RemoteImageView f125045a;

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    public void bJ_() {
        super.bJ_();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        this.f125045a = (RemoteImageView) this.itemView.findViewById(R.id.d1t);
        this.f124819o = C54438a.C54439a.m99780a(this.itemView.findViewById(R.id.acq));
    }

    static {
        Covode.recordClassIndex(64266);
    }

    public C54555k(View view) {
        super(view);
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, EmojiContent emojiContent, int i) {
        int i2;
        super.mo91008a(aiVar, aiVar2, (BaseContent) emojiContent, i);
        if (this.f124820p.getType() == 500 || this.f124820p.getType() == 501) {
            ((C24246a) this.f125045a.getHierarchy()).mo39953a(1, (Drawable) null);
        } else {
            ((C24246a) this.f125045a.getHierarchy()).mo39966c(R.drawable.auo);
        }
        UrlModel localUrl = ((EmojiContent) this.f124820p).getLocalUrl();
        Object tag = this.f125045a.getTag(67108864);
        if (localUrl != null) {
            if (!localUrl.equals(tag)) {
                this.f125045a.setTag(67108864, localUrl);
            }
            this.f124819o.mo91505a(50331648, 10);
            this.f124819o.mo91505a(67108864, this.f124823s);
        }
        if (((EmojiContent) this.f124820p).getUrl() != null && !((EmojiContent) this.f124820p).getUrl().equals(tag)) {
            this.f125045a.setTag(67108864, ((EmojiContent) this.f124820p).getUrl());
        }
        this.f124819o.mo91505a(50331648, 10);
        this.f124819o.mo91505a(67108864, this.f124823s);
        int i3 = 0;
        if (((EmojiContent) this.f124820p).getHeight() == 0 || ((EmojiContent) this.f124820p).getWidth() == 0) {
            i2 = 0;
        } else if (((EmojiContent) this.f124820p).getWidth() >= ((EmojiContent) this.f124820p).getHeight()) {
            i3 = f125042b;
            i2 = (((EmojiContent) this.f124820p).getHeight() * i3) / ((EmojiContent) this.f124820p).getWidth();
        } else {
            i2 = f125042b;
            i3 = (((EmojiContent) this.f124820p).getWidth() * i2) / ((EmojiContent) this.f124820p).getHeight();
        }
        if (C55225q.m100990a(((EmojiContent) this.f124820p).getImageType())) {
            i3 = f125044y;
            i2 = (((EmojiContent) this.f124820p).getHeight() * i3) / ((EmojiContent) this.f124820p).getWidth();
            int i4 = f125043x;
            if (i2 > i4) {
                i2 = i4;
            }
            ((C24246a) this.f125045a.getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57458h);
        }
        ViewGroup.LayoutParams layoutParams = this.f125045a.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i2;
        this.f125045a.setLayoutParams(layoutParams);
        int min = Math.min(i3, i2);
        if (C55225q.m100990a(((EmojiContent) this.f124820p).getImageType()) || C55225q.m100991b(((EmojiContent) this.f124820p).getImageType())) {
            if (localUrl == null) {
                C55198a.m100929a(this.f125045a, ((EmojiContent) this.f124820p).getUrl(), i3, i2, min, min, (AbstractC55220o) null);
            } else {
                C55198a.m100929a(this.f125045a, localUrl, i3, i2, min, min, (AbstractC55220o) null);
            }
            this.f124819o.mo91505a(50331648, 10);
            this.f124819o.mo91505a(67108864, this.f124823s);
        }
        if (localUrl == null) {
            C55198a.m100928a(this.f125045a, ((EmojiContent) this.f124820p).getUrl(), i3, i2);
        } else {
            C55198a.m100928a(this.f125045a, localUrl, i3, i2);
        }
        this.f124819o.mo91505a(50331648, 10);
        this.f124819o.mo91505a(67108864, this.f124823s);
    }
}
