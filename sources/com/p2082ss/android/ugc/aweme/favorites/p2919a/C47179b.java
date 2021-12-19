package com.p2082ss.android.ugc.aweme.favorites.p2919a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36399m;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36504c;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36506e;
import com.p2082ss.android.ugc.aweme.comment.p2500n.C36547a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.View$OnClickListenerC47440b;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.b */
public final class C47179b extends AbstractC39060f<Comment> {

    /* renamed from: a */
    private final Activity f109810a;

    /* renamed from: b */
    private final Fragment f109811b;

    static {
        Covode.recordClassIndex(55783);
    }

    /* renamed from: a */
    public final void mo79578a(Comment comment) {
        C89219l.m154721d(comment, "");
        mo63369e().remove(comment);
        notifyDataSetChanged();
        if (mo63369e().isEmpty()) {
            Fragment fragment = this.f109811b;
            Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.ui.CommentCollectListFragment");
            ((AbstractC47599a) fragment).mo59525f();
        }
    }

    public C47179b(Activity activity, Fragment fragment) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fragment, "");
        this.f109810a = activity;
        this.f109811b = fragment;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.zu, viewGroup, false);
        C89219l.m154716b(a, "");
        return new View$OnClickListenerC47440b(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        User user;
        Aweme aliasAweme;
        Video video;
        UrlModel cover;
        User user2;
        UrlModel avatarThumb;
        String str;
        C89219l.m154721d(viewHolder, "");
        Comment comment = (Comment) mo63369e().get(i);
        View$OnClickListenerC47440b bVar = (View$OnClickListenerC47440b) viewHolder;
        Activity activity = this.f109810a;
        Fragment fragment = this.f109811b;
        C89219l.m154721d(this, "");
        if (comment != null && activity != null && fragment != null) {
            bVar.f110177b = activity;
            bVar.f110178c = fragment;
            bVar.f110176a = comment;
            bVar.f110182g = this;
            bVar.f110192q.setVisibility(8);
            bVar.f110181f = C36547a.m74402a();
            C36547a aVar = bVar.f110181f;
            String str2 = null;
            if (aVar != null) {
                Comment comment2 = bVar.f110176a;
                if (comment2 != null) {
                    str = comment2.getCid();
                } else {
                    str = null;
                }
                C33943c<C36399m> a = aVar.mo64259a(str);
                if (a != null) {
                    a.mo60214a(bVar, false);
                }
            }
            bVar.f110180e = new View$OnClickListenerC47440b.C47442b(bVar);
            bVar.f110179d = new C36274b(fragment, bVar.hashCode(), bVar);
            C36274b bVar2 = bVar.f110179d;
            if (bVar2 != null) {
                bVar2.f85750u = true;
            }
            bVar.f110183h = new C36506e();
            C36506e eVar = bVar.f110183h;
            if (eVar != null) {
                eVar.mo67838a(new C36504c());
            }
            C36506e eVar2 = bVar.f110183h;
            if (eVar2 != null) {
                eVar2.mo67839a_(bVar);
            }
            Comment comment3 = bVar.f110176a;
            if (!(comment3 == null || (user2 = comment3.getUser()) == null || (avatarThumb = user2.getAvatarThumb()) == null)) {
                C20766v a2 = C20761r.m39060a(C34735v.m70965a(avatarThumb));
                a2.f49098K = true;
                C20766v a3 = a2.mo34179a("collection_comment");
                a3.f49092E = bVar.f110188m;
                a3.mo34186c();
            }
            Comment comment4 = bVar.f110176a;
            if (comment4 == null || (aliasAweme = comment4.getAliasAweme()) == null || (video = aliasAweme.getVideo()) == null || (cover = video.getCover()) == null) {
                bVar.f110187l.setVisibility(8);
            } else {
                C34577e.m70592a(bVar.f110187l, cover);
                bVar.f110187l.setVisibility(0);
            }
            Comment comment5 = bVar.f110176a;
            if (!(comment5 == null || comment5.getText() == null)) {
                TuxTextView tuxTextView = bVar.f110190o;
                Comment comment6 = bVar.f110176a;
                if (comment6 != null) {
                    str2 = comment6.getText();
                }
                tuxTextView.setText(str2);
            }
            Comment comment7 = bVar.f110176a;
            if (!(comment7 == null || (user = comment7.getUser()) == null)) {
                bVar.f110189n.setText(C80580in.m139677a(user, false));
            }
            Comment comment8 = bVar.f110176a;
            if (comment8 != null) {
                bVar.f110191p.setText(C80566ib.m139651a(activity, ((long) comment8.getCreateTime()) * bVar.f110193r));
            }
            bVar.f110186k.setOnClickListener(bVar);
            bVar.f110186k.setOnLongClickListener(bVar);
            bVar.f110184i.setOnClickListener(new View$OnClickListenerC47440b.View$OnClickListenerC47446f(bVar));
            bVar.f110185j.setOnClickListener(new View$OnClickListenerC47440b.View$OnClickListenerC47447g(bVar));
            bVar.mo79706c();
        }
    }
}
