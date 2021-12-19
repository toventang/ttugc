package com.p2082ss.android.ugc.aweme.story.feed.common;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4019b.AbstractC76591a;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76595e;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76599i;
import com.p2082ss.android.ugc.aweme.story.p4019b.EnumC76597g;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.a */
public abstract class AbstractC77188a extends AbstractC48136a {

    /* renamed from: b */
    public AbstractC48149ai f173153b;

    /* renamed from: c */
    public EnumC76739a f173154c = EnumC76739a.LOOP_CURRENT_USER;

    /* renamed from: d */
    public int f173155d = -1;

    /* renamed from: e */
    public int f173156e = -1;

    /* renamed from: f */
    public Aweme f173157f;

    /* renamed from: g */
    public UserStory f173158g;

    /* renamed from: h */
    public final String f173159h;

    /* renamed from: i */
    public final String f173160i;

    /* renamed from: j */
    public String f173161j;

    /* renamed from: k */
    public final String f173162k;

    /* renamed from: l */
    public final Set<String> f173163l;

    /* renamed from: m */
    public final C48238ce f173164m;

    /* renamed from: n */
    private final List<AbstractC77190b> f173165n = new ArrayList();

    static {
        Covode.recordClassIndex(90200);
    }

    /* renamed from: a */
    public abstract void mo120795a(int i, boolean z);

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public final void mo80270a(AbstractC84295k kVar) {
    }

    /* renamed from: k */
    public abstract int mo120802k();

    /* renamed from: l */
    public abstract int mo120803l();

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: s */
    public final int mo80228s() {
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: A */
    public final void mo80149A() {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.mo80235z();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: e */
    public void mo80275e() {
        super.mo80275e();
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null) {
            aiVar.mo80072g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: z */
    public final void mo80235z() {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.mo80235z();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: c */
    public final AbstractC84293i mo80273c() {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar == null || (P = aiVar.mo80101P()) == null) {
            return null;
        }
        return P.mo80273c();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: j */
    public final AbstractC63042j.C63049g mo80281j() {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar == null || (P = aiVar.mo80101P()) == null) {
            return null;
        }
        return P.mo80281j();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: w */
    public final boolean mo80232w() {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar == null || (P = aiVar.mo80101P()) == null) {
            return false;
        }
        return P.mo80232w();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: x */
    public final Surface mo80233x() {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar == null || (P = aiVar.mo80101P()) == null) {
            return null;
        }
        return P.mo80233x();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: y */
    public final View mo80234y() {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar == null || (P = aiVar.mo80101P()) == null) {
            return null;
        }
        return P.mo80234y();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public void mo80269a(EnumC76739a aVar) {
        C89219l.m154721d(aVar, "");
        this.f173154c = aVar;
    }

    /* renamed from: b */
    public final void mo120798b(EnumC76739a aVar) {
        C89219l.m154721d(aVar, "");
        this.f173154c = aVar;
    }

    /* renamed from: c */
    public final void mo120800c(String str) {
        C89219l.m154721d(str, "");
        this.f173161j = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: b */
    public final void mo80209b(Aweme aweme) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.mo80209b(aweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onDecoderBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onPausePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onPlayCompleted(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C84208l lVar) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onPlayFailed(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onPlayProgressChange(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onPreparePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C84216o oVar) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onResumePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(C84208l lVar) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.onRetryOnError(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public void mo80267a(int i) {
        super.mo80267a(i);
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null) {
            aiVar.mo70614a(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo120799b(AbstractC89172b<? super List<AbstractC77190b>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        bVar.invoke(this.f173165n);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80215e(int i) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.mo80215e(i);
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: a */
    public final void mo80280a(OnUIPlayListener onUIPlayListener) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.mo80280a(onUIPlayListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80217e(boolean z) {
        AbstractC48136a P;
        AbstractC48149ai aiVar = this.f173153b;
        if (aiVar != null && (P = aiVar.mo80101P()) != null) {
            P.mo80217e(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo120797a(AbstractC89172b<? super AbstractC77190b, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        Iterator<T> it = this.f173165n.iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo120801d(String str) {
        Aweme aweme;
        Integer num;
        int i;
        String str2;
        Aweme currentStory;
        Integer currentIndex;
        Aweme aweme2;
        Integer num2;
        Aweme aweme3;
        Integer num3;
        C89219l.m154721d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -2015881337) {
            if (hashCode != 1431203431) {
                if (hashCode == 1753337067 && str.equals("story_collection_play") && (aweme3 = this.f173157f) != null) {
                    int k = mo120802k();
                    int l = mo120803l();
                    String str3 = this.f173164m.f111753j;
                    String str4 = this.f173162k;
                    C89219l.m154721d(aweme3, "");
                    C89219l.m154721d(str3, "");
                    C89219l.m154721d(str4, "");
                    C33744d a = new C33744d().mo59983a("author_id", C76706a.m134270a(aweme3)).mo59983a("story_collection_id", C76706a.m134276b(aweme3)).mo59980a("item_cnt", k).mo59980a("unread_item_cnt", l).mo59983a("enter_from", str3).mo59983a("enter_method", C76598h.f171917b).mo59983a("request_id", aweme3.getRequestId());
                    User author = aweme3.getAuthor();
                    if (author != null) {
                        num3 = Integer.valueOf(author.getFollowStatus());
                    } else {
                        num3 = null;
                    }
                    C39162r.m79460a("story_collection_play", a.mo59982a("follow_status", num3).mo59983a("enter_position", str4).f79943a);
                }
            } else if (str.equals("story_collection_play_finish") && (aweme2 = this.f173157f) != null) {
                int k2 = mo120802k();
                int l2 = mo120803l();
                String str5 = this.f173164m.f111753j;
                String str6 = this.f173162k;
                C89219l.m154721d(aweme2, "");
                C89219l.m154721d(str5, "");
                C89219l.m154721d(str6, "");
                C33744d a2 = new C33744d().mo59983a("story_collection_id", C76706a.m134276b(aweme2)).mo59980a("item_cnt", k2).mo59980a("unread_item_cnt", l2).mo59983a("enter_from", str5).mo59983a("enter_method", C76598h.f171917b).mo59983a("author_id", C76706a.m134270a(aweme2)).mo59983a("request_id", aweme2.getRequestId());
                User author2 = aweme2.getAuthor();
                if (author2 != null) {
                    num2 = Integer.valueOf(author2.getFollowStatus());
                } else {
                    num2 = null;
                }
                C39162r.m79460a("story_collection_play_finish", a2.mo59982a("follow_status", num2).mo59983a("enter_position", str6).f79943a);
            }
        } else if (str.equals("story_collection_play_end") && (aweme = this.f173157f) != null) {
            int k3 = mo120802k();
            int l3 = mo120803l();
            String str7 = this.f173164m.f111753j;
            int size = this.f173163l.size();
            String str8 = this.f173162k;
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(str7, "");
            C89219l.m154721d(str8, "");
            C33744d a3 = new C33744d().mo59983a("story_collection_id", C76706a.m134276b(aweme)).mo59980a("item_cnt", k3).mo59980a("unread_item_cnt", l3).mo59983a("enter_from", str7).mo59983a("author_id", C76706a.m134270a(aweme)).mo59983a("enter_method", C76598h.f171917b).mo59983a("request_id", aweme.getRequestId());
            User author3 = aweme.getAuthor();
            if (author3 != null) {
                num = Integer.valueOf(author3.getFollowStatus());
            } else {
                num = null;
            }
            C33744d a4 = a3.mo59982a("follow_status", num);
            UserStory userStory = aweme.getUserStory();
            int i2 = 0;
            if (userStory != null) {
                i = (int) userStory.getCurrentPosition();
            } else {
                i = 0;
            }
            C33744d a5 = a4.mo59980a("story_start_num", i);
            UserStory userStory2 = aweme.getUserStory();
            if (!(userStory2 == null || (currentIndex = UserStoryKt.currentIndex(userStory2)) == null)) {
                i2 = currentIndex.intValue();
            }
            C33744d a6 = a5.mo59980a("story_current_num", i2);
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 == null || (currentStory = UserStoryKt.currentStory(userStory3)) == null || (str2 = currentStory.getAid()) == null) {
                str2 = "";
            }
            C39162r.m79460a("story_collection_play_end", a6.mo59983a("group_id", str2).mo59980a("read_cnt", size).mo59983a("enter_position", str8).f79943a);
        }
    }

    /* renamed from: a */
    protected static void m134920a(List<AbstractC77190b> list, AbstractC77190b bVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        list.add(bVar);
    }

    /* renamed from: a */
    public final void mo120796a(EnumC76597g gVar, AbstractC76591a aVar) {
        C89219l.m154721d(gVar, "");
        this.f173164m.f111745b.mo63634a(new C49672ag(60, new C76595e(gVar, aVar)));
    }

    public AbstractC77188a(ViewGroup viewGroup, AbstractC84295k kVar, C48238ce ceVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ceVar, "");
        this.f173164m = ceVar;
        C49812b bVar = ceVar.f111748e.param;
        C89219l.m154716b(bVar, "");
        this.f173159h = bVar.getEventType();
        C49812b bVar2 = ceVar.f111748e.param;
        C89219l.m154716b(bVar2, "");
        this.f173160i = bVar2.getFrom();
        this.f173161j = "";
        C49812b bVar3 = ceVar.f111748e.param;
        C89219l.m154716b(bVar3, "");
        this.f173162k = C76599i.m134188a(bVar3);
        this.f173163l = new LinkedHashSet();
    }
}
