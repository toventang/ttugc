package com.p2082ss.android.ugc.aweme.sticker.types.game;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.p */
public final class C76083p extends C76074h implements AbstractC76082o {

    /* renamed from: c */
    private TextView f170933c;

    static {
        Covode.recordClassIndex(89028);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76081n, com.p2082ss.android.ugc.aweme.sticker.types.game.C76074h
    /* renamed from: c */
    public final void mo119814c() {
        super.mo119814c();
        TextView textView = this.f170933c;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76083p(FrameLayout frameLayout) {
        super(frameLayout);
        C89219l.m154721d(frameLayout, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.C76074h
    /* renamed from: a */
    public final View mo119810a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aid, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76082o
    /* renamed from: a */
    public final void mo119818a(String str) {
        if (this.f170933c == null) {
            this.f170933c = (TextView) this.f170926b.findViewById(R.id.aai);
        }
        TextView textView = this.f170933c;
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
}
