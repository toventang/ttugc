package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class StarHostView extends ConstraintLayout {

    /* renamed from: i */
    public static final C10571a f25523i = new C10571a((byte) 0);

    /* renamed from: g */
    public C10572b f25524g;

    /* renamed from: h */
    public C10573c f25525h;

    /* renamed from: j */
    private final AbstractC89244h f25526j;

    /* renamed from: k */
    private final AbstractC89244h f25527k;

    /* renamed from: l */
    private final AbstractC89244h f25528l;

    /* renamed from: m */
    private final AbstractC89244h f25529m;

    /* renamed from: n */
    private final AbstractC89244h f25530n;

    static {
        Covode.recordClassIndex(12157);
    }

    public StarHostView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final StarHostBadgeView getHostBadgeView() {
        return (StarHostBadgeView) this.f25530n.getValue();
    }

    private final HSImageView getHostLivingImage() {
        return (HSImageView) this.f25528l.getValue();
    }

    public final HSImageView getHostAvatarBorderImage() {
        return (HSImageView) this.f25527k.getValue();
    }

    public final AppCompatImageView getHostAvatarImage() {
        return (AppCompatImageView) this.f25526j.getValue();
    }

    public final LiveTextView getHostUserNameText() {
        return (LiveTextView) this.f25529m.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$a */
    public static final class C10571a {
        static {
            Covode.recordClassIndex(12158);
        }

        private C10571a() {
        }

        public /* synthetic */ C10571a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$d */
    public static final class C10574d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25540a;

        static {
            Covode.recordClassIndex(12161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10574d(StarHostView starHostView) {
            super(0);
            this.f25540a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo17498a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17498a() {
            AppCompatImageView hostAvatarImage = this.f25540a.getHostAvatarImage();
            ViewGroup.LayoutParams layoutParams = this.f25540a.getHostAvatarImage().getLayoutParams();
            layoutParams.width = C3966y.m9653a((float) StarHostView.m19154a(this.f25540a).f25536a);
            layoutParams.height = C3966y.m9653a((float) StarHostView.m19154a(this.f25540a).f25536a);
            hostAvatarImage.setLayoutParams(layoutParams);
            C11279p.m19999a(this.f25540a.getHostAvatarImage(), C3966y.m9653a((float) StarHostView.m19154a(this.f25540a).f25538c));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$e */
    public static final class C10575e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25541a;

        static {
            Covode.recordClassIndex(12162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10575e(StarHostView starHostView) {
            super(0);
            this.f25541a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo17499a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17499a() {
            HSImageView hostAvatarBorderImage = this.f25541a.getHostAvatarBorderImage();
            ViewGroup.LayoutParams layoutParams = this.f25541a.getHostAvatarBorderImage().getLayoutParams();
            layoutParams.width = C3966y.m9653a((float) StarHostView.m19154a(this.f25541a).f25537b);
            layoutParams.height = C3966y.m9653a((float) StarHostView.m19154a(this.f25541a).f25537b);
            hostAvatarBorderImage.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$h */
    static final class C10578h extends AbstractC89220m implements AbstractC89171a<HSImageView> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25544a;

        static {
            Covode.recordClassIndex(12165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10578h(StarHostView starHostView) {
            super(0);
            this.f25544a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HSImageView invoke() {
            return this.f25544a.findViewById(R.id.bzu);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$i */
    static final class C10579i extends AbstractC89220m implements AbstractC89171a<AppCompatImageView> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25545a;

        static {
            Covode.recordClassIndex(12166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10579i(StarHostView starHostView) {
            super(0);
            this.f25545a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AppCompatImageView invoke() {
            return this.f25545a.findViewById(R.id.bzt);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$j */
    static final class C10580j extends AbstractC89220m implements AbstractC89171a<StarHostBadgeView> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25546a;

        static {
            Covode.recordClassIndex(12167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10580j(StarHostView starHostView) {
            super(0);
            this.f25546a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StarHostBadgeView invoke() {
            return this.f25546a.findViewById(R.id.e6a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$k */
    static final class C10581k extends AbstractC89220m implements AbstractC89171a<HSImageView> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25547a;

        static {
            Covode.recordClassIndex(12168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10581k(StarHostView starHostView) {
            super(0);
            this.f25547a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HSImageView invoke() {
            return this.f25547a.findViewById(R.id.bzv);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$l */
    static final class C10582l extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25548a;

        static {
            Covode.recordClassIndex(12169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10582l(StarHostView starHostView) {
            super(0);
            this.f25548a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f25548a.findViewById(R.id.f49);
        }
    }

    /* renamed from: b */
    private final void m19156b() {
        C10574d dVar = new C10574d(this);
        C10575e eVar = new C10575e(this);
        dVar.mo17498a();
        eVar.mo17499a();
    }

    /* renamed from: d */
    private final C10573c m19158d() {
        int i;
        C10572b bVar = this.f25524g;
        if (bVar == null) {
            C89219l.m154710a("starHostItem");
        }
        if (bVar.f25535e) {
            C10572b bVar2 = this.f25524g;
            if (bVar2 == null) {
                C89219l.m154710a("starHostItem");
            }
            int i2 = bVar2.f25532b;
            if (i2 == 1) {
                i = 2131234263;
            } else if (i2 != 2) {
                i = 2131234267;
            } else {
                i = 2131234265;
            }
        } else {
            C10572b bVar3 = this.f25524g;
            if (bVar3 == null) {
                C89219l.m154710a("starHostItem");
            }
            int i3 = bVar3.f25532b;
            if (i3 == 1) {
                i = 2131234264;
            } else if (i3 != 2) {
                i = 2131234268;
            } else {
                i = 2131234266;
            }
        }
        C10572b bVar4 = this.f25524g;
        if (bVar4 == null) {
            C89219l.m154710a("starHostItem");
        }
        if (bVar4.f25532b != 1) {
            return new C10573c(40, 48, 16, i);
        }
        return new C10573c(48, 56, 28, i);
    }

    /* renamed from: c */
    private final void m19157c() {
        C10576f fVar = new C10576f(this);
        C10577g gVar = new C10577g(this);
        C10572b bVar = this.f25524g;
        if (bVar == null) {
            C89219l.m154710a("starHostItem");
        }
        if (bVar.f25531a != null) {
            AppCompatImageView hostAvatarImage = getHostAvatarImage();
            C10572b bVar2 = this.f25524g;
            if (bVar2 == null) {
                C89219l.m154710a("starHostItem");
            }
            User user = bVar2.f25531a;
            if (user == null) {
                C89219l.m154715b();
            }
            C7577g.m15571a(hostAvatarImage, user.getAvatarThumb(), getHostAvatarImage().getWidth(), getHostAvatarImage().getHeight(), 2131234742);
            fVar.mo17500a(true);
            gVar.mo17501a(true);
            C13628n.m24510a(getHostBadgeView(), 0);
            StarHostBadgeView hostBadgeView = getHostBadgeView();
            C10572b bVar3 = this.f25524g;
            if (bVar3 == null) {
                C89219l.m154710a("starHostItem");
            }
            int i = bVar3.f25532b;
            C10572b bVar4 = this.f25524g;
            if (bVar4 == null) {
                C89219l.m154710a("starHostItem");
            }
            int i2 = bVar4.f25533c;
            C10572b bVar5 = this.f25524g;
            if (bVar5 == null) {
                C89219l.m154710a("starHostItem");
            }
            hostBadgeView.mo17487a(i, i2, bVar5.f25535e);
            C10572b bVar6 = this.f25524g;
            if (bVar6 == null) {
                C89219l.m154710a("starHostItem");
            }
            if (bVar6.f25534d) {
                C3941k.m9600a(getHostAvatarBorderImage(), 2131234853);
                C3941k.m9607a(getHostLivingImage(), "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
                C13628n.m24510a(getHostAvatarBorderImage(), 0);
                C13628n.m24510a(getHostLivingImage(), 0);
                return;
            }
            C13628n.m24510a(getHostAvatarBorderImage(), 8);
            C13628n.m24510a(getHostLivingImage(), 8);
            return;
        }
        fVar.mo17500a(false);
        gVar.mo17501a(false);
        C13628n.m24510a(getHostBadgeView(), 8);
        C13628n.m24510a(getHostAvatarBorderImage(), 8);
        C13628n.m24510a(getHostLivingImage(), 8);
        AppCompatImageView hostAvatarImage2 = getHostAvatarImage();
        C10573c cVar = this.f25525h;
        if (cVar == null) {
            C89219l.m154710a("starHostLayoutParams");
        }
        hostAvatarImage2.setImageResource(cVar.f25539d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$f */
    public static final class C10576f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25542a;

        static {
            Covode.recordClassIndex(12163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10576f(StarHostView starHostView) {
            super(1);
            this.f25542a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            mo17500a(bool.booleanValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17500a(boolean z) {
            String str;
            if (z) {
                LiveTextView hostUserNameText = this.f25542a.getHostUserNameText();
                User user = StarHostView.m19155b(this.f25542a).f25531a;
                if (user == null || (str = user.displayId) == null) {
                    str = "";
                }
                hostUserNameText.setText(str);
                hostUserNameText.setMaxLines(1);
                return;
            }
            LiveTextView hostUserNameText2 = this.f25542a.getHostUserNameText();
            hostUserNameText2.setText(C3966y.m9657a((int) R.string.ehm));
            hostUserNameText2.setMaxLines(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$g */
    public static final class C10577g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StarHostView f25543a;

        static {
            Covode.recordClassIndex(12164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10577g(StarHostView starHostView) {
            super(1);
            this.f25543a = starHostView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            mo17501a(bool.booleanValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17501a(boolean z) {
            String str;
            String str2;
            LiveTextView hostUserNameText = this.f25543a.getHostUserNameText();
            if (StarHostView.m19155b(this.f25543a).f25535e) {
                if (z) {
                    str2 = "#161823";
                } else {
                    str2 = "#57161823";
                }
                hostUserNameText.setTextColor(Color.parseColor(str2));
                return;
            }
            if (z) {
                str = "#E6FFFFFF";
            } else {
                str = "#57FFFFFF";
            }
            hostUserNameText.setTextColor(Color.parseColor(str));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C10573c m19154a(StarHostView starHostView) {
        C10573c cVar = starHostView.f25525h;
        if (cVar == null) {
            C89219l.m154710a("starHostLayoutParams");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C10572b m19155b(StarHostView starHostView) {
        C10572b bVar = starHostView.f25524g;
        if (bVar == null) {
            C89219l.m154710a("starHostItem");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo17488a(C10572b bVar) {
        C89219l.m154721d(bVar, "");
        this.f25524g = bVar;
        this.f25525h = m19158d();
        m19156b();
        m19157c();
    }

    private /* synthetic */ StarHostView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    private StarHostView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bd2, this, true);
        this.f25526j = C11831d.m20835a(new C10579i(this));
        this.f25527k = C11831d.m20835a(new C10578h(this));
        this.f25528l = C11831d.m20835a(new C10581k(this));
        this.f25529m = C11831d.m20835a(new C10582l(this));
        this.f25530n = C11831d.m20835a(new C10580j(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$c */
    public static final class C10573c {

        /* renamed from: a */
        public final int f25536a;

        /* renamed from: b */
        public final int f25537b;

        /* renamed from: c */
        public final int f25538c;

        /* renamed from: d */
        public final int f25539d;

        static {
            Covode.recordClassIndex(12160);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10573c)) {
                return false;
            }
            C10573c cVar = (C10573c) obj;
            return this.f25536a == cVar.f25536a && this.f25537b == cVar.f25537b && this.f25538c == cVar.f25538c && this.f25539d == cVar.f25539d;
        }

        public final int hashCode() {
            return (((((this.f25536a * 31) + this.f25537b) * 31) + this.f25538c) * 31) + this.f25539d;
        }

        public final String toString() {
            return "StarHostLayoutParams(avatarRadius=" + this.f25536a + ", avatarBorderRadius=" + this.f25537b + ", avatarTopMargin=" + this.f25538c + ", emptyAvatarResId=" + this.f25539d + ")";
        }

        public C10573c(int i, int i2, int i3, int i4) {
            this.f25536a = i;
            this.f25537b = i2;
            this.f25538c = i3;
            this.f25539d = i4;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostView$b */
    public static final class C10572b {

        /* renamed from: a */
        public final User f25531a;

        /* renamed from: b */
        public final int f25532b;

        /* renamed from: c */
        public final int f25533c;

        /* renamed from: d */
        public final boolean f25534d;

        /* renamed from: e */
        public final boolean f25535e;

        static {
            Covode.recordClassIndex(12159);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10572b)) {
                return false;
            }
            C10572b bVar = (C10572b) obj;
            return C89219l.m154714a(this.f25531a, bVar.f25531a) && this.f25532b == bVar.f25532b && this.f25533c == bVar.f25533c && this.f25534d == bVar.f25534d && this.f25535e == bVar.f25535e;
        }

        public final int hashCode() {
            User user = this.f25531a;
            int hashCode = (((((user != null ? user.hashCode() : 0) * 31) + this.f25532b) * 31) + this.f25533c) * 31;
            boolean z = this.f25534d;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            if (!this.f25535e) {
                i = 0;
            }
            return i5 + i;
        }

        public final String toString() {
            return "StarHostItem(user=" + this.f25531a + ", rankNum=" + this.f25532b + ", starHostCount=" + this.f25533c + ", isLiving=" + this.f25534d + ", isPortrait=" + this.f25535e + ")";
        }

        public C10572b(User user, int i, int i2, boolean z, boolean z2) {
            this.f25531a = user;
            this.f25532b = i;
            this.f25533c = i2;
            this.f25534d = z;
            this.f25535e = z2;
        }
    }
}
