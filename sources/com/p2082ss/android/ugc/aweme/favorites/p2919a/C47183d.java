package com.p2082ss.android.ugc.aweme.favorites.p2919a;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.View$OnClickListenerC47454i;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.question.p3665g.C66532b;
import com.p2082ss.android.ugc.aweme.question.p3665g.C66533c;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.d */
public final class C47183d extends AbstractC39060f<C66504c> {

    /* renamed from: a */
    public final Fragment f109821a;

    /* renamed from: b */
    private final Activity f109822b;

    static {
        Covode.recordClassIndex(55787);
    }

    public C47183d(Activity activity, Fragment fragment) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fragment, "");
        this.f109822b = activity;
        this.f109821a = fragment;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.zw, viewGroup, false);
        C89219l.m154716b(a, "");
        return new View$OnClickListenerC47454i(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        UrlModel urlModel;
        Drawable drawable;
        Resources resources;
        String content;
        Integer videosCount;
        Resources resources2;
        User user;
        UrlModel urlModel2;
        User creator;
        User creator2;
        Long l;
        C89219l.m154721d(viewHolder, "");
        C66504c cVar = (C66504c) mo63369e().get(i);
        View$OnClickListenerC47454i iVar = (View$OnClickListenerC47454i) viewHolder;
        Activity activity = this.f109822b;
        Fragment fragment = this.f109821a;
        C89219l.m154721d(this, "");
        if (cVar != null && activity != null && fragment != null) {
            iVar.f110229c = activity;
            iVar.f110230d = fragment;
            iVar.f110227a = cVar;
            iVar.f110228b = cVar.getContent();
            iVar.f110231e = this;
            iVar.f110232f = new View$OnClickListenerC47454i.C47455a(iVar);
            iVar.f110233g = C66533c.m118280a();
            C66533c cVar2 = iVar.f110233g;
            String str = null;
            if (cVar2 != null) {
                C66504c cVar3 = iVar.f110227a;
                if (cVar3 != null) {
                    l = cVar3.getId();
                } else {
                    l = null;
                }
                C33943c<C66532b> a = cVar2.mo105518a(String.valueOf(l));
                if (a != null) {
                    a.mo60214a(iVar, false);
                }
            }
            iVar.f110240n.setVisibility(8);
            C66504c cVar4 = iVar.f110227a;
            if (cVar4 == null || (creator2 = cVar4.getCreator()) == null) {
                urlModel = null;
            } else {
                urlModel = creator2.getAvatarThumb();
            }
            if (urlModel != null) {
                C66504c cVar5 = iVar.f110227a;
                if (cVar5 == null || (creator = cVar5.getCreator()) == null) {
                    urlModel2 = null;
                } else {
                    urlModel2 = creator.getAvatarThumb();
                }
                C20766v a2 = C20761r.m39060a(C34735v.m70965a(urlModel2));
                a2.f49098K = true;
                C20766v a3 = a2.mo34179a("collection_question");
                a3.f49092E = iVar.f110236j;
                a3.mo34186c();
            } else {
                SmartCircleImageView smartCircleImageView = iVar.f110236j;
                Activity activity2 = iVar.f110229c;
                if (activity2 == null || (resources = activity2.getResources()) == null) {
                    drawable = null;
                } else {
                    drawable = resources.getDrawable(2131231879);
                }
                smartCircleImageView.setBackground(drawable);
                iVar.f110236j.setPlaceholderImage(2131231879);
            }
            C66504c cVar6 = iVar.f110227a;
            if (cVar6 == null || cVar6.getCreator() == null) {
                iVar.f110237k.setVisibility(8);
                C11279p.m19999a((View) iVar.f110238l, (int) C13628n.m24520b(activity, 8.0f));
            } else {
                TuxTextView tuxTextView = iVar.f110237k;
                C66504c cVar7 = iVar.f110227a;
                if (cVar7 != null) {
                    user = cVar7.getCreator();
                } else {
                    user = null;
                }
                tuxTextView.setText(C80580in.m139677a(user, false));
            }
            C66504c cVar8 = iVar.f110227a;
            if (!(cVar8 == null || (videosCount = cVar8.getVideosCount()) == null)) {
                int intValue = videosCount.intValue();
                String a4 = C53437b.m98615a((long) intValue);
                Activity activity3 = iVar.f110229c;
                if (!(activity3 == null || (resources2 = activity3.getResources()) == null)) {
                    str = resources2.getQuantityString(R.plurals.gz, intValue, a4);
                }
                iVar.f110239m.setText(str);
            }
            C66504c cVar9 = iVar.f110227a;
            if (!(cVar9 == null || (content = cVar9.getContent()) == null)) {
                iVar.f110238l.setText(new C17191a.C17192a().mo27177a(new C89350l("(?m)^[ \t]*\r?\n").replace(content, "")).f40973a);
                EOYServiceImpl.m120048b().mo106960a(iVar.f110238l);
            }
            iVar.f110235i.setOnClickListener(iVar);
            iVar.f110235i.setOnLongClickListener(iVar);
            iVar.f110234h.setOnClickListener(new View$OnClickListenerC47454i.View$OnClickListenerC47463i(iVar));
        }
    }
}
