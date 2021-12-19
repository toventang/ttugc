package com.p2082ss.android.ugc.aweme.music.p3481ui.widget;

import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14518d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder */
public final class ThirdMusicViewHolder extends PowerCell<C61238d> {

    /* renamed from: a */
    public WrapContentRemoteImageView f139031a;

    /* renamed from: b */
    private View f139032b;

    /* renamed from: j */
    private TuxTextView f139033j;

    /* renamed from: k */
    private View f139034k;

    /* renamed from: l */
    private Animation f139035l;

    static {
        Covode.recordClassIndex(71842);
    }

    /* renamed from: a */
    public final void mo98759a() {
        View view = this.f139032b;
        if (view == null) {
            C89219l.m154710a("loading");
        }
        view.clearAnimation();
        View view2 = this.f139032b;
        if (view2 == null) {
            C89219l.m154710a("loading");
        }
        view2.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder$b */
    public static final class C61233b extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ ThirdMusicViewHolder f139038a;

        static {
            Covode.recordClassIndex(71844);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61233b(ThirdMusicViewHolder thirdMusicViewHolder) {
            this.f139038a = thirdMusicViewHolder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
            C89219l.m154721d(str, "");
            ThirdMusicViewHolder.m110885a(this.f139038a).mo125077a(fVar);
            this.f139038a.mo98759a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            C89219l.m154721d(str, "");
            ThirdMusicViewHolder.m110885a(this.f139038a).mo125077a(fVar);
            this.f139038a.mo98759a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ WrapContentRemoteImageView m110885a(ThirdMusicViewHolder thirdMusicViewHolder) {
        WrapContentRemoteImageView wrapContentRemoteImageView = thirdMusicViewHolder.f139031a;
        if (wrapContentRemoteImageView == null) {
            C89219l.m154710a("cover");
        }
        return wrapContentRemoteImageView;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder$a */
    static final class View$OnClickListenerC61232a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThirdMusicViewHolder f139036a;

        /* renamed from: b */
        final /* synthetic */ ExternalMusicInfo f139037b;

        static {
            Covode.recordClassIndex(71843);
        }

        View$OnClickListenerC61232a(ThirdMusicViewHolder thirdMusicViewHolder, ExternalMusicInfo externalMusicInfo) {
            this.f139036a = thirdMusicViewHolder;
            this.f139037b = externalMusicInfo;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((AbstractC61236b) C14518d.m26526a(this.f139036a, C89204ab.m154669a(AbstractC61236b.class))).mo98762b(this.f139037b);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        MethodCollector.m26663i(7923);
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.al7, viewGroup, false);
        View findViewById = a.findViewById(R.id.byi);
        C89219l.m154716b(findViewById, "");
        this.f139031a = (WrapContentRemoteImageView) findViewById;
        View findViewById2 = a.findViewById(R.id.byj);
        C89219l.m154716b(findViewById2, "");
        this.f139032b = findViewById2;
        View findViewById3 = a.findViewById(R.id.byk);
        C89219l.m154716b(findViewById3, "");
        this.f139033j = (TuxTextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.fhv);
        C89219l.m154716b(findViewById4, "");
        this.f139034k = findViewById4;
        Animation loadAnimation = AnimationUtils.loadAnimation(viewGroup.getContext(), R.anim.cw);
        C89219l.m154716b(loadAnimation, "");
        this.f139035l = loadAnimation;
        C89219l.m154716b(a, "");
        MethodCollector.m26664o(7923);
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo23350a(com.p2082ss.android.ugc.aweme.music.p3481ui.widget.C61238d r8) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.widget.ThirdMusicViewHolder.mo23350a(com.bytedance.ies.powerlist.b.a):void");
    }
}
