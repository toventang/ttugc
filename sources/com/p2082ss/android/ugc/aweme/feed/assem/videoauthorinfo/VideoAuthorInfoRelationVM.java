package com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import com.C1764a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagLabelEvent;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50130bm;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationVM */
public final class VideoAuthorInfoRelationVM extends FeedBaseViewModel<C49170p> {

    /* renamed from: k */
    private List<InteractionTagUserInfo> f113057k = new ArrayList();

    static {
        Covode.recordClassIndex(57902);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C49170p();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationVM$b */
    static final class C49111b extends AbstractC89220m implements AbstractC89172b<C49170p, C49170p> {

        /* renamed from: a */
        public static final C49111b f113059a = new C49111b();

        static {
            Covode.recordClassIndex(57904);
        }

        C49111b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49170p invoke(C49170p pVar) {
            C49170p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            return C49170p.m92261a(pVar2, false, null, null, null, null, null, null, 126);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationVM$c */
    static final class C49112c extends AbstractC89220m implements AbstractC89172b<C49170p, C49170p> {

        /* renamed from: a */
        final /* synthetic */ boolean f113060a;

        static {
            Covode.recordClassIndex(57905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49112c(boolean z) {
            super(1);
            this.f113060a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49170p invoke(C49170p pVar) {
            C49170p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            return C49170p.m92261a(pVar2, false, null, null, null, null, null, new C12776a(Boolean.valueOf(this.f113060a)), 63);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationVM$a */
    static final class C49110a extends AbstractC89220m implements AbstractC89172b<C49170p, C49170p> {

        /* renamed from: a */
        final /* synthetic */ FollowStatus f113058a;

        static {
            Covode.recordClassIndex(57903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49110a(FollowStatus followStatus) {
            super(1);
            this.f113058a = followStatus;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49170p invoke(C49170p pVar) {
            C49170p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            return C49170p.m92261a(pVar2, false, true, null, null, null, C89387v.m154943a(Integer.valueOf(this.f113058a.followStatus), Integer.valueOf(this.f113058a.followerStatus)), null, 93);
        }
    }

    /* renamed from: a */
    public final String mo80829a(Aweme aweme) {
        InteractionTagInfo interactionTagInfo;
        List<InteractionTagUserInfo> taggedUsers;
        String a;
        if (!C36410g.m74111b() || aweme == null || (interactionTagInfo = aweme.getInteractionTagInfo()) == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null) {
            return "";
        }
        Iterator<T> it = this.f113057k.iterator();
        while (it.hasNext()) {
            if (!taggedUsers.contains(it.next())) {
                new InteractionTagLabelEvent(aweme).post();
            }
        }
        this.f113057k = taggedUsers;
        if (!(!taggedUsers.isEmpty())) {
            return "";
        }
        if (taggedUsers.size() != 1) {
            String string = C17879g.m33104a().getString(R.string.g9y);
            C89219l.m154716b(string, "");
            a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"", Integer.valueOf(taggedUsers.size())}, 2));
            C89219l.m154716b(a, "");
        } else if (C58071d.m104909c()) {
            a = taggedUsers.get(0).getNickname();
        } else {
            a = taggedUsers.get(0).getUniqueId();
        }
        if (a == null) {
            return "";
        }
        return a;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(videoItemParams, "");
        return videoItemParams;
    }

    /* renamed from: a */
    public final void mo80830a(Aweme aweme, String str) {
        String str2 = "";
        C89219l.m154721d(aweme, str2);
        C89219l.m154721d(str, str2);
        C33744d a = new C33744d().mo59983a("enter_from", this.f112231p);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = str2;
        }
        C33744d a2 = a.mo59983a("group_id", aid);
        String authorUid = aweme.getAuthorUid();
        if (authorUid != null) {
            str2 = authorUid;
        }
        C39162r.m79460a("tag_anchor_show", a2.mo59983a("author_id", str2).mo59983a("anchor_type", str).f79943a);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C49170p mo80488a(C49170p pVar, VideoItemParams videoItemParams) {
        boolean z;
        MatchedFriendStruct matchedFriendStruct;
        AwemeRelationRecommendModel relationRecommendInfo;
        User author;
        List<AwemeHybridLabelModel> hybridLabels;
        C49170p pVar2 = pVar;
        C89219l.m154721d(pVar2, "");
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme == null) {
            return pVar2;
        }
        if (C50130bm.m94079b(aweme.getAid()) || (relationRecommendInfo = aweme.getRelationRecommendInfo()) == null || relationRecommendInfo.getRecType() == null || ((aweme.getMutualRelation() == null && ((hybridLabels = aweme.getHybridLabels()) == null || hybridLabels.isEmpty())) || !C47008he.m90283b() || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 0)) {
            z = false;
        } else {
            z = true;
        }
        C49170p a = C49170p.m92261a(pVar2, z, null, null, null, null, null, null, 126);
        if (!a.f113143a) {
            return a;
        }
        if (aweme.getMutualRelation() != null) {
            a = C49170p.m92261a(a, false, null, aweme.getMutualRelation(), null, null, null, null, 123);
        } else {
            User author2 = aweme.getAuthor();
            if (author2 == null || (matchedFriendStruct = author2.getMatchedFriendStruct()) == null || matchedFriendStruct.getExternalRecommendReasonStruct() == null) {
                List<AwemeHybridLabelModel> hybridLabels2 = aweme.getHybridLabels();
                if (hybridLabels2 != null && !hybridLabels2.isEmpty()) {
                    a = C49170p.m92261a(a, false, null, null, aweme.getHybridLabels().get(0).getText(), null, null, null, 119);
                }
            } else {
                a = C49170p.m92261a(a, false, null, null, null, aweme, null, null, 111);
            }
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            return C49170p.m92261a(a, false, null, null, null, null, C89387v.m154943a(Integer.valueOf(author3.getFollowStatus()), Integer.valueOf(author3.getFollowerStatus())), null, 95);
        }
        return a;
    }
}
