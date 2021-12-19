package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39098d;
import com.p2082ss.android.ugc.aweme.feed.adapter.View$OnClickListenerC48170aw;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49504ag;
import com.p2082ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.p2082ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.av */
public final class C48169av extends AbstractC39060f<UserWithAweme> implements View$OnClickListenerC48170aw.AbstractC48173a, View$OnClickListenerC48170aw.AbstractC48174b {

    /* renamed from: a */
    public String f111563a = "";

    /* renamed from: b */
    public AbstractC39098d<View$OnClickListenerC48170aw> f111564b;

    /* renamed from: c */
    public C64357h.AbstractC64362b f111565c;

    /* renamed from: d */
    private int f111566d = -1;

    /* renamed from: e */
    private int f111567e = -1;

    /* renamed from: f */
    private final GalleryLayoutManager f111568f;

    static {
        Covode.recordClassIndex(56911);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.View$OnClickListenerC48170aw.AbstractC48174b
    /* renamed from: a */
    public final void mo80301a(int i) {
        this.f111568f.mo4318a(i + 1);
    }

    public C48169av(GalleryLayoutManager galleryLayoutManager) {
        C89219l.m154721d(galleryLayoutManager, "");
        this.f111568f = galleryLayoutManager;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.View$OnClickListenerC48170aw.AbstractC48173a
    /* renamed from: a */
    public final void mo80302a(User user, int i) {
        C89219l.m154721d(user, "");
        GalleryLayoutManager galleryLayoutManager = this.f111568f;
        if (galleryLayoutManager.f114053b >= 0 && galleryLayoutManager.f114053b == i && galleryLayoutManager.f114062k != null && !galleryLayoutManager.f114062k.mo4486n()) {
            mo63369e().remove(this.f111568f.f114053b);
            notifyItemRemoved(this.f111568f.f114053b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bil, viewGroup, false);
        C89219l.m154716b(a, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        if (C49504ag.m92740a()) {
            if (this.f111567e == -1 || this.f111566d == -1) {
                int a2 = (int) (((float) C13628n.m24504a(context)) * 0.712f);
                this.f111567e = a2;
                this.f111566d = (int) (((float) a2) * 1.34f);
            }
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f111567e;
                layoutParams.height = this.f111566d;
            } else {
                layoutParams = new RecyclerView.C1367j(this.f111567e, this.f111566d);
            }
            a.setLayoutParams(layoutParams);
        }
        return new View$OnClickListenerC48170aw(a, this, this, this.f111568f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009c, code lost:
        if (r0 == null) goto L_0x001a;
     */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60186a(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.C48169av.mo60186a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
