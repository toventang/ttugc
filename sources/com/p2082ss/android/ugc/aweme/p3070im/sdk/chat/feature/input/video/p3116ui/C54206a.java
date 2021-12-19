package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui.C54226c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55053f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.C55256c;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.a */
public final class C54206a extends RecyclerView.AbstractC1350a<C54226c> {

    /* renamed from: d */
    public static final C54207a f124189d = new C54207a((byte) 0);

    /* renamed from: a */
    List<? extends Aweme> f124190a = C89086z.INSTANCE;

    /* renamed from: b */
    int f124191b = -1;

    /* renamed from: c */
    public final FavoriteVideoPickerViewModel f124192c;

    static {
        Covode.recordClassIndex(63893);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C54226c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m99471a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.a$a */
    public static final class C54207a {
        static {
            Covode.recordClassIndex(63894);
        }

        private C54207a() {
        }

        public /* synthetic */ C54207a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f124190a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.a$b */
    public static final class C54208b implements C54226c.AbstractC54228b {

        /* renamed from: a */
        final /* synthetic */ C54206a f124193a;

        /* renamed from: b */
        final /* synthetic */ Aweme f124194b;

        static {
            Covode.recordClassIndex(63895);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui.C54226c.AbstractC54228b
        /* renamed from: a */
        public final void mo91302a() {
            FavoriteVideoPickerViewModel favoriteVideoPickerViewModel = this.f124193a.f124192c;
            Aweme aweme = this.f124194b;
            C89219l.m154721d(aweme, "");
            if (aweme.canShare()) {
                favoriteVideoPickerViewModel.f124179f.setValue(new C55256c<>(aweme));
            } else {
                favoriteVideoPickerViewModel.f124180g.setValue(new C55256c<>(aweme));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui.C54226c.AbstractC54228b
        /* renamed from: a */
        public final void mo91303a(boolean z) {
            if (z) {
                this.f124193a.f124192c.mo91300a(this.f124194b);
            } else {
                this.f124193a.f124192c.mo91300a(null);
            }
        }

        C54208b(C54206a aVar, Aweme aweme) {
            this.f124193a = aVar;
            this.f124194b = aweme;
        }
    }

    public C54206a(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
        C89219l.m154721d(favoriteVideoPickerViewModel, "");
        this.f124192c = favoriteVideoPickerViewModel;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m99471a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3744);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a7s, viewGroup, false);
        C89219l.m154716b(a2, "");
        C54226c cVar = new C54226c(a2);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = cVar.getClass().getName();
        MethodCollector.m26664o(3744);
        return cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C54226c cVar, int i) {
        boolean z;
        UrlModel cover;
        C54226c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        Aweme aweme = (Aweme) this.f124190a.get(i);
        if (i == this.f124191b) {
            z = true;
        } else {
            z = false;
        }
        C54208b bVar = new C54208b(this, aweme);
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(bVar, "");
        cVar2.f124231a = bVar;
        View findViewById = cVar2.itemView.findViewById(R.id.afn);
        C89219l.m154716b(findViewById, "");
        cVar2.f124232b = (SmartImageView) findViewById;
        Video video = aweme.getVideo();
        if (video == null || (cover = video.getCover()) == null) {
            SmartImageView smartImageView = cVar2.f124232b;
            if (smartImageView == null) {
                C89219l.m154710a("coverView");
            }
            smartImageView.setImageDrawable(null);
        } else {
            C20766v a = C20761r.m39060a(C34735v.m70965a(cover));
            int[] a2 = C80397em.m139369a(200);
            if (a2 != null) {
                a.mo34185b(a2);
            }
            SmartImageView smartImageView2 = cVar2.f124232b;
            if (smartImageView2 == null) {
                C89219l.m154710a("coverView");
            }
            a.f49092E = smartImageView2;
            a.mo34179a("VideoViewHolder - Cover").mo34186c();
        }
        SmartImageView smartImageView3 = cVar2.f124232b;
        if (smartImageView3 == null) {
            C89219l.m154710a("coverView");
        }
        smartImageView3.setOnClickListener(new C54226c.View$OnClickListenerC54229c(cVar2));
        cVar2.mo91308a(z);
        if (!aweme.canShare() || C55053f.m100676a() != 2) {
            TuxRadio tuxRadio = cVar2.f124233c;
            if (tuxRadio == null) {
                C89219l.m154710a("radioButton");
            }
            tuxRadio.setVisibility(8);
        } else {
            TuxRadio tuxRadio2 = cVar2.f124233c;
            if (tuxRadio2 == null) {
                C89219l.m154710a("radioButton");
            }
            tuxRadio2.setVisibility(0);
        }
        TuxTextView tuxTextView = (TuxTextView) cVar2.itemView.findViewById(R.id.fa1);
        User author = aweme.getAuthor();
        C89219l.m154716b(author, "");
        C20766v a3 = C20761r.m39060a(C34735v.m70965a(author.getAvatarThumb()));
        a3.f49092E = (SmartAvatarImageView) cVar2.itemView.findViewById(R.id.f__);
        a3.mo34179a("VideoViewHolder - Avatar").mo34186c();
        C89219l.m154716b(tuxTextView, "");
        User author2 = aweme.getAuthor();
        C89219l.m154716b(author2, "");
        tuxTextView.setText(author2.getUniqueId());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C54226c cVar, int i, List list) {
        C54226c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(cVar2, i, list);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        cVar2.mo91308a(((Boolean) obj).booleanValue());
    }
}
