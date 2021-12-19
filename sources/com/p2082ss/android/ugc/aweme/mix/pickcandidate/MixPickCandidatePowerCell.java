package com.p2082ss.android.ugc.aweme.mix.pickcandidate;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59537a;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MixPickCandidatePowerCell */
public final class MixPickCandidatePowerCell extends PowerCell<C59905a> {

    /* renamed from: a */
    public Context f136392a;

    static {
        Covode.recordClassIndex(70301);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MixPickCandidatePowerCell$a */
    static final class View$OnClickListenerC59892a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MixPickCandidatePowerCell f136393a;

        /* renamed from: b */
        final /* synthetic */ C59905a f136394b;

        static {
            Covode.recordClassIndex(70302);
        }

        View$OnClickListenerC59892a(MixPickCandidatePowerCell mixPickCandidatePowerCell, C59905a aVar) {
            this.f136393a = mixPickCandidatePowerCell;
            this.f136394b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f136393a.f136392a;
            if (context != null) {
                MixFeedService.m109435k().mo97310a(context);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MixPickCandidatePowerCell$b */
    static final class View$OnClickListenerC59893b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MixPickCandidatePowerCell f136395a;

        /* renamed from: b */
        final /* synthetic */ C59905a f136396b;

        static {
            Covode.recordClassIndex(70303);
        }

        View$OnClickListenerC59893b(MixPickCandidatePowerCell mixPickCandidatePowerCell, C59905a aVar) {
            this.f136395a = mixPickCandidatePowerCell;
            this.f136396b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f136395a.f136392a;
            if (context != null) {
                MixFeedService.m109435k().mo97310a(context);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MixPickCandidatePowerCell$c */
    static final class View$OnClickListenerC59894c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MixPickCandidatePowerCell f136397a;

        /* renamed from: b */
        final /* synthetic */ C59905a f136398b;

        static {
            Covode.recordClassIndex(70304);
        }

        View$OnClickListenerC59894c(MixPickCandidatePowerCell mixPickCandidatePowerCell, C59905a aVar) {
            this.f136397a = mixPickCandidatePowerCell;
            this.f136398b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f136397a.f136392a;
            if (context != null) {
                MixFeedService.m109435k().mo97310a(context);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f136392a = viewGroup.getContext();
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.akh, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MixPickCandidatePowerCell$d */
    static final class View$OnClickListenerC59895d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MixPickCandidatePowerCell f136399a;

        /* renamed from: b */
        final /* synthetic */ C59905a f136400b;

        static {
            Covode.recordClassIndex(70305);
        }

        View$OnClickListenerC59895d(MixPickCandidatePowerCell mixPickCandidatePowerCell, C59905a aVar) {
            this.f136399a = mixPickCandidatePowerCell;
            this.f136400b = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (this.f136399a.f136392a != null) {
                Context context = this.f136399a.f136392a;
                if (context == null) {
                    C89219l.m154715b();
                }
                Aweme aweme = this.f136400b.f136432e;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (context != null) {
                    Intent intent = new Intent(context, MixVideoDetailActivity.class);
                    intent.putExtra("id", str);
                    C59537a aVar = new C59537a();
                    aVar.setMEnterCleanMode(true);
                    intent.putExtra("mix_video_list_params", aVar);
                    intent.putExtra("enter_from", "create_playlist");
                    C84349a.m145093a(intent, context);
                    context.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m109338a(int i) {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.a1e);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        ((TuxIconView) view2.findViewById(R.id.a1e)).setIconRes(i);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        ((TuxIconView) view3.findViewById(R.id.a1e)).setTintColor(view4.getResources().getColor(R.color.l));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MixPickCandidatePowerCell$e */
    static final class View$OnClickListenerC59896e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MixPickCandidatePowerCell f136401a;

        /* renamed from: b */
        final /* synthetic */ C59905a f136402b;

        static {
            Covode.recordClassIndex(70306);
        }

        View$OnClickListenerC59896e(MixPickCandidatePowerCell mixPickCandidatePowerCell, C59905a aVar) {
            this.f136401a = mixPickCandidatePowerCell;
            this.f136402b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) PowerCell.m32713b(this.f136401a, MultiVideoViewModel.class);
            if (multiVideoViewModel != null && multiVideoViewModel.f136412h && !this.f136402b.f136429b) {
                View view2 = this.f136401a.itemView;
                C89219l.m154716b(view2, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.a19);
                C89219l.m154716b(appCompatCheckBox, "");
                appCompatCheckBox.setSelected(this.f136402b.f136429b);
            } else if (this.f136402b.f136433f) {
                View view3 = this.f136401a.itemView;
                C89219l.m154716b(view3, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view3.findViewById(R.id.a19);
                C89219l.m154716b(appCompatCheckBox2, "");
                appCompatCheckBox2.setSelected(this.f136402b.f136429b);
            } else {
                C59905a aVar = this.f136402b;
                aVar.f136429b = true ^ aVar.f136429b;
                View view4 = this.f136401a.itemView;
                C89219l.m154716b(view4, "");
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view4.findViewById(R.id.a19);
                C89219l.m154716b(appCompatCheckBox3, "");
                appCompatCheckBox3.setSelected(this.f136402b.f136429b);
                if (this.f136402b.f136429b) {
                    MultiVideoViewModel multiVideoViewModel2 = (MultiVideoViewModel) PowerCell.m32713b(this.f136401a, MultiVideoViewModel.class);
                    if (multiVideoViewModel2 != null) {
                        this.f136401a.getAdapterPosition();
                        multiVideoViewModel2.mo97289a(this.f136402b.f136432e);
                        return;
                    }
                    return;
                }
                MultiVideoViewModel multiVideoViewModel3 = (MultiVideoViewModel) PowerCell.m32713b(this.f136401a, MultiVideoViewModel.class);
                if (multiVideoViewModel3 != null) {
                    this.f136401a.getAdapterPosition();
                    multiVideoViewModel3.mo97291b(this.f136402b.f136432e);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MixPickCandidatePowerCell$f */
    static final class View$OnClickListenerC59897f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MixPickCandidatePowerCell f136403a;

        /* renamed from: b */
        final /* synthetic */ C59905a f136404b;

        static {
            Covode.recordClassIndex(70307);
        }

        View$OnClickListenerC59897f(MixPickCandidatePowerCell mixPickCandidatePowerCell, C59905a aVar) {
            this.f136403a = mixPickCandidatePowerCell;
            this.f136404b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) PowerCell.m32713b(this.f136403a, MultiVideoViewModel.class);
            if (multiVideoViewModel != null && multiVideoViewModel.f136412h && !this.f136404b.f136429b) {
                View view2 = this.f136403a.itemView;
                C89219l.m154716b(view2, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.a19);
                C89219l.m154716b(appCompatCheckBox, "");
                appCompatCheckBox.setSelected(this.f136404b.f136429b);
            } else if (this.f136404b.f136433f) {
                View view3 = this.f136403a.itemView;
                C89219l.m154716b(view3, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view3.findViewById(R.id.a19);
                C89219l.m154716b(appCompatCheckBox2, "");
                appCompatCheckBox2.setSelected(this.f136404b.f136429b);
            } else {
                C59905a aVar = this.f136404b;
                aVar.f136429b = true ^ aVar.f136429b;
                View view4 = this.f136403a.itemView;
                C89219l.m154716b(view4, "");
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view4.findViewById(R.id.a19);
                C89219l.m154716b(appCompatCheckBox3, "");
                appCompatCheckBox3.setSelected(this.f136404b.f136429b);
                if (this.f136404b.f136429b) {
                    MultiVideoViewModel multiVideoViewModel2 = (MultiVideoViewModel) PowerCell.m32713b(this.f136403a, MultiVideoViewModel.class);
                    if (multiVideoViewModel2 != null) {
                        this.f136403a.getAdapterPosition();
                        multiVideoViewModel2.mo97289a(this.f136404b.f136432e);
                        return;
                    }
                    return;
                }
                MultiVideoViewModel multiVideoViewModel3 = (MultiVideoViewModel) PowerCell.m32713b(this.f136403a, MultiVideoViewModel.class);
                if (multiVideoViewModel3 != null) {
                    this.f136403a.getAdapterPosition();
                    multiVideoViewModel3.mo97291b(this.f136404b.f136432e);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C59905a aVar) {
        List<String> urlList;
        C59905a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        UrlModel urlModel = aVar2.f136428a;
        if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null)) {
            if (!urlList.isEmpty()) {
                View view = this.itemView;
                C89219l.m154716b(view, "");
                RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.a1a);
                String str = urlList.get(0);
                if (str == null) {
                    str = "";
                }
                C34577e.m70608b(remoteImageView, str, -1, -1);
            } else {
                Context context = this.f136392a;
                if (context != null) {
                    View view2 = this.itemView;
                    C89219l.m154716b(view2, "");
                    C34577e.m70591a((RemoteImageView) view2.findViewById(R.id.a1a), context.getResources().getColor(R.color.j));
                }
            }
        }
        if (aVar2.f136430c || aVar2.f136433f) {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            FrameLayout frameLayout = (FrameLayout) view3.findViewById(R.id.a1b);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
        } else {
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            FrameLayout frameLayout2 = (FrameLayout) view4.findViewById(R.id.a1b);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setVisibility(8);
        }
        if (aVar2.f136434g) {
            m109338a(R.raw.icon_exclamation_mark_circle);
            this.itemView.setOnClickListener(new View$OnClickListenerC59892a(this, aVar2));
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            ((AppCompatCheckBox) view5.findViewById(R.id.a19)).setOnClickListener(new View$OnClickListenerC59893b(this, aVar2));
            View view6 = this.itemView;
            C89219l.m154716b(view6, "");
            ((RelativeLayout) view6.findViewById(R.id.a1_)).setOnClickListener(new View$OnClickListenerC59894c(this, aVar2));
        } else if (aVar2.f136431d) {
            m109338a(R.raw.icon_playlist);
            View view7 = this.itemView;
            C89219l.m154716b(view7, "");
            TuxIconView tuxIconView = (TuxIconView) view7.findViewById(R.id.a1e);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
        } else {
            View view8 = this.itemView;
            C89219l.m154716b(view8, "");
            TuxIconView tuxIconView2 = (TuxIconView) view8.findViewById(R.id.a1e);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        View view9 = this.itemView;
        C89219l.m154716b(view9, "");
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view9.findViewById(R.id.a19);
        C89219l.m154716b(appCompatCheckBox, "");
        appCompatCheckBox.setSelected(aVar2.f136429b);
        View view10 = this.itemView;
        C89219l.m154716b(view10, "");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view10.findViewById(R.id.a19);
        C89219l.m154716b(appCompatCheckBox2, "");
        appCompatCheckBox2.setClickable(!aVar2.f136430c);
        if (!aVar2.f136430c && !aVar2.f136433f) {
            this.itemView.setOnClickListener(new View$OnClickListenerC59895d(this, aVar2));
            View view11 = this.itemView;
            C89219l.m154716b(view11, "");
            ((AppCompatCheckBox) view11.findViewById(R.id.a19)).setOnClickListener(new View$OnClickListenerC59896e(this, aVar2));
            View view12 = this.itemView;
            C89219l.m154716b(view12, "");
            ((RelativeLayout) view12.findViewById(R.id.a1_)).setOnClickListener(new View$OnClickListenerC59897f(this, aVar2));
        } else if (!aVar2.f136434g) {
            this.itemView.setOnClickListener(null);
            View view13 = this.itemView;
            C89219l.m154716b(view13, "");
            ((AppCompatCheckBox) view13.findViewById(R.id.a19)).setOnClickListener(null);
            View view14 = this.itemView;
            C89219l.m154716b(view14, "");
            ((RelativeLayout) view14.findViewById(R.id.a1_)).setOnClickListener(null);
        }
    }
}
