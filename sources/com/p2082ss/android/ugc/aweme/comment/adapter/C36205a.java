package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.comment.adapter.CommentPreCreateViewHolderManager;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36305b;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36317c;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36347d;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.AbstractC36304d;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.C36301c;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentTaggedPeopleView;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36176c;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36424j;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36540c;
import com.p2082ss.android.ugc.aweme.comment.util.C37201k;
import com.p2082ss.android.ugc.aweme.comment.util.C37221v;
import com.p2082ss.android.ugc.aweme.comment.widget.CommentDescView;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39047b;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.feed.widget.C50506a;
import com.p2082ss.android.ugc.aweme.feed.widget.C50507b;
import com.p2082ss.android.ugc.aweme.feed.widget.C50516i;
import com.p2082ss.android.ugc.aweme.feed.widget.C50517j;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.C33148d;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33136a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33138c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80275bv;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.a */
public final class C36205a extends AbstractC39060f<Comment> implements AbstractC36211ad {

    /* renamed from: A */
    private HashSet<String> f85503A;

    /* renamed from: B */
    private AbstractC33136a f85504B;

    /* renamed from: a */
    public AbstractC36428a f85505a;

    /* renamed from: b */
    public String f85506b;

    /* renamed from: c */
    public Aweme f85507c;

    /* renamed from: d */
    public String f85508d;

    /* renamed from: e */
    public C37221v f85509e;

    /* renamed from: f */
    public boolean f85510f;

    /* renamed from: g */
    public AbstractC33138c f85511g;

    /* renamed from: h */
    public DataCenter f85512h;

    /* renamed from: i */
    private HashMap<Long, Long> f85513i;

    /* renamed from: j */
    private C36500h f85514j;

    /* renamed from: k */
    private final int f85515k;

    /* renamed from: w */
    private final int f85516w;

    /* renamed from: x */
    private final int f85517x;

    /* renamed from: y */
    private HashSet<Comment> f85518y;

    /* renamed from: z */
    private CommentPreCreateViewHolderManager f85519z;

    static {
        Covode.recordClassIndex(43471);
    }

    /* renamed from: b */
    private static boolean m73774b(int i) {
        return i == 1 || i == 0 || i == 10 || i == 12;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: e */
    public final List<Comment> mo63369e() {
        return this.f92236l;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.adapter.AbstractC36211ad
    /* renamed from: a */
    public final int[] mo63363a() {
        return new int[]{1, 2};
    }

    /* renamed from: a */
    public final void mo63359a(String str) {
        boolean z;
        if (mo60933c() != 0) {
            for (int i = 0; i < this.f92236l.size(); i++) {
                Comment comment = (Comment) this.f92236l.get(i);
                if (comment != null && C13627m.m24499a(comment.getCid(), str)) {
                    String authorUid = this.f85514j.getAuthorUid();
                    if (comment.getUserDigged() == 1) {
                        comment.setUserDigged(0);
                        comment.setDiggCount(comment.getDiggCount() - 1);
                    } else {
                        comment.setUserDigged(1);
                        comment.setDiggCount(comment.getDiggCount() + 1);
                    }
                    if (TextUtils.equals(authorUid, C31575b.m65865g().getCurUserId()) && comment.getLabelType() != 1) {
                        if (comment.getUserDigged() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        comment.setAuthorDigged(z);
                    }
                    notifyItemChanged(i, 0);
                    AbstractC81915c.m141874a(new C36387c(2, new Object[]{this.f85514j.getAid(), comment}));
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63360a(String str, int i) {
        int c = mo60933c();
        if (c != 0 && !TextUtils.isEmpty(str)) {
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= c) {
                    break;
                }
                Comment comment = (Comment) this.f92236l.get(i3);
                if (comment == null || !C13627m.m24499a(comment.getCid(), str)) {
                    i3++;
                } else {
                    if (comment.getGift() != null) {
                        String str2 = this.f85506b;
                        String aid = this.f85514j.getAid();
                        String authorUid = this.f85514j.getAuthorUid();
                        Long valueOf = Long.valueOf(comment.getGift().getId());
                        C33744d a = C36540c.m74377a(str2, aid);
                        a.mo59983a("enter_from", str2);
                        a.mo59983a("group_id", aid);
                        a.mo59983a("author_id", authorUid);
                        a.mo59982a("gift_id", valueOf);
                        C39162r.m79460a("delete_gift_from_comment", a.f79943a);
                    }
                    i2 = i3;
                }
            }
            mo63354a(i2, i);
        }
    }

    /* renamed from: a */
    public final void mo63361a(Set<String> set, Map<String, Comment> map) {
        Comment comment;
        List<Comment> l = m73778l();
        for (String str : set) {
            if (this.f92236l.size() > 0 && (comment = map.get(str)) != null) {
                int indexOf = this.f92236l.indexOf(comment);
                if (indexOf >= 0) {
                    int d = this.f85509e.mo64776d(comment.getCid());
                    if (d > 1) {
                        List list = this.f92236l;
                        list.subList(indexOf, Math.min(list.size(), d + indexOf)).clear();
                    } else {
                        this.f92236l.remove(indexOf);
                    }
                } else {
                    CommentReplyListItem e = this.f85509e.mo64777e(comment.getReplyId());
                    if (e != null) {
                        if (e.mReplyComments.indexOf(comment) >= 0 && e.mButtonStruct != null) {
                            e.mButtonStruct.setReplyCommentTotal(e.mComment.getReplyCommentTotal() - 1);
                            int intValue = Integer.valueOf(e.mButtonStruct.getCid()).intValue() + e.mButtonStruct.getTopSize() + 1;
                            if (e.mButtonStruct.getReplyCommentTotal() <= ((long) e.mButtonStruct.getTopSize())) {
                                this.f92236l.remove(intValue);
                            } else {
                                notifyDataSetChanged();
                            }
                        }
                        e.mComment.setReplyCommentTotal(e.mComment.getReplyCommentTotal() - 1);
                        e.mReplyComments.remove(comment);
                    }
                }
                m73773a(comment);
            }
        }
        C80275bv.m139152a(this, l, this.f92236l);
    }

    /* renamed from: a */
    public final void mo63357a(Comment comment, String str, String str2) {
        String cid;
        int indexOf;
        String str3;
        String str4;
        String str5;
        String str6;
        if (comment != null) {
            int i = -1;
            if (comment.getCommentType() == 2) {
                cid = comment.getReplyId();
                indexOf = this.f85509e.mo64778f(cid);
                List<Comment> b = this.f85509e.mo64774b(String.valueOf(indexOf));
                if (b != null) {
                    i = b.indexOf(comment);
                }
            } else if (comment.getCommentType() == 1) {
                cid = comment.getCid();
                indexOf = this.f85509e.mo64778f(cid);
            } else {
                cid = comment.getCid();
                indexOf = this.f92236l.indexOf(comment);
            }
            if (TextUtils.isEmpty(comment.getReplyToReplyCommentId()) || TextUtils.equals(comment.getReplyToReplyCommentId(), "0")) {
                str3 = (TextUtils.isEmpty(comment.getReplyId()) || TextUtils.equals(comment.getReplyId(), "0")) ? "original" : "reply";
            } else {
                str3 = "reply_to_reply";
            }
            String str7 = "";
            if (comment.getUser() == null || comment.getUser().getUid() == null) {
                str4 = str7;
            } else {
                str4 = comment.getUser().getUid();
            }
            if (TextUtils.equals("reply_via_video", str)) {
                C36539b.m74374a(str2, this.f85514j.getAid(), comment.getCid(), str4, cid, indexOf + 1, i + 1, str3, this.f85514j.getEnterFrom(), this.f85514j.getInsertCids(), !TextUtils.equals(this.f85514j.getAuthorUid(), C31575b.m65865g().getCurUserId()) ? 1 : 0);
                return;
            }
            if (!(comment.getAliasAweme() == null || comment.getAliasAweme().getAid() == null)) {
                str7 = comment.getAliasAweme().getAid();
            }
            if (TextUtils.equals("click_comment_chain", this.f85506b) || TextUtils.equals("click_comment_bubble", this.f85506b) || TextUtils.equals("collection_comment", this.f85506b)) {
                str5 = this.f85506b;
                if (TextUtils.isEmpty(this.f85514j.getEnterMethod())) {
                    str6 = this.f85506b;
                } else {
                    str6 = this.f85514j.getEnterMethod();
                }
            } else if (TextUtils.equals("message", this.f85506b) || TextUtils.equals("push", this.f85506b)) {
                str5 = TextUtils.equals("message", this.f85506b) ? "notification" : this.f85506b;
                str6 = this.f85506b;
            } else {
                str6 = this.f85506b;
                str5 = "click_comment_button";
            }
            C36539b.m74373a(str5, this.f85514j.getAid(), comment.getCid(), str4, cid, indexOf + 1, i + 1, str3, str6, str7);
        }
    }

    /* renamed from: a */
    public final void mo63362a(boolean z) {
        Comment comment;
        HashMap<Long, Long> hashMap = this.f85513i;
        if (hashMap != null) {
            for (Map.Entry<Long, Long> entry : hashMap.entrySet()) {
                Long key = entry.getKey();
                Comment comment2 = new Comment();
                comment2.setCid(String.valueOf(key));
                int indexOf = this.f92236l.indexOf(comment2);
                if (indexOf >= 0 && (comment = (Comment) this.f92236l.get(indexOf)) != null) {
                    if (z) {
                        m73772a(key.longValue(), System.currentTimeMillis());
                        if (comment.isAuthorDigged()) {
                            C36539b.m74376b(this.f85506b, this.f85514j.getAid(), this.f85514j.getAuthorUid(), comment.getCid());
                        }
                    } else {
                        m73773a((Comment) this.f92236l.get(indexOf));
                        System.currentTimeMillis();
                        entry.setValue(0L);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63356a(Comment comment, int i) {
        if (comment != null) {
            List<Comment> l = m73778l();
            this.f92236l.add(i, comment);
            C80275bv.m139152a(this, l, this.f92236l);
        }
    }

    /* renamed from: d */
    public final void mo63368d() {
        HashSet<String> hashSet = this.f85503A;
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    /* renamed from: l */
    private List<Comment> m73778l() {
        if (this.f92236l == null) {
            this.f92236l = new ArrayList();
        }
        return new ArrayList(this.f92236l);
    }

    /* renamed from: d */
    private C36229h m73776d(ViewGroup viewGroup) {
        return new C36229h(viewGroup, this.f85505a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo63358a(Comment comment) {
        mo63356a(comment, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.a$a */
    public static class C36207a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f85521a;

        static {
            Covode.recordClassIndex(43473);
        }

        C36207a(View view) {
            super(view);
            this.f85521a = (TextView) view.findViewById(R.id.f1j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: c_ */
    public final int mo63367c_(View view) {
        return (int) C13628n.m24520b(view.getContext(), 45.0f);
    }

    /* renamed from: c */
    private C36256x m73775c(ViewGroup viewGroup) {
        return new C36256x(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ir, viewGroup, false), this.f85505a);
    }

    /* renamed from: e */
    private static C36207a m73777e(ViewGroup viewGroup) {
        return new C36207a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.j0, viewGroup, false));
    }

    /* renamed from: a */
    private Rect m73771a(int i) {
        int c;
        int i2 = this.f85516w;
        int c2 = mo60936c(i);
        if (i >= mo60933c() - 1) {
            c = -1;
        } else {
            c = mo60936c(i + 1);
        }
        if (m73774b(c2) && !m73774b(c)) {
            i2 = this.f85515k;
        }
        return new Rect(-1, this.f85516w, -1, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        if (this.f92236l != null) {
            int commentType = ((Comment) this.f92236l.get(i)).getCommentType();
            if (commentType == 0) {
                return 0;
            }
            int i2 = 1;
            if (commentType != 1) {
                i2 = 2;
                if (commentType != 2) {
                    i2 = 221;
                    if (commentType != 221) {
                        i2 = 222;
                        if (commentType != 222) {
                            switch (commentType) {
                                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                    return 10;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                    return 11;
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                    return 12;
                            }
                        }
                    }
                }
            }
            return i2;
        }
        return super.mo60936c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        CommentTaggedPeopleView commentTaggedPeopleView;
        DataCenter dataCenter;
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C36247s) {
            C36247s sVar = (C36247s) viewHolder;
            sVar.mo63425e();
            Comment comment = sVar.f85637a;
        } else if (viewHolder instanceof C36229h) {
            C36229h hVar = (C36229h) viewHolder;
            if (hVar.f85565A != null && (hVar.itemView.getContext() instanceof ActivityC0945e) && C36176c.m73729a()) {
                hVar.f85565A.mo64780a().removeObserver(hVar.f85566B);
            }
            Comment comment2 = hVar.f85600y;
        } else if (viewHolder instanceof C36225f) {
            ((C36225f) viewHolder).mo63389c();
        } else if ((viewHolder instanceof View$OnClickListenerC36245r) && (dataCenter = (commentTaggedPeopleView = ((View$OnClickListenerC36245r) viewHolder).f85622e).f86027a) != null) {
            dataCenter.mo60193b("TAGGED_PEOPLE_ACTION", (AbstractC1214u<C33942b>) commentTaggedPeopleView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a */
    public final void mo63355a(RecyclerView.ViewHolder viewHolder) {
        super.mo63355a(viewHolder);
        View view = viewHolder.itemView;
        int i = this.f85517x;
        view.setPadding(i, i, i, i);
        viewHolder.itemView.setLayoutParams(new RecyclerView.C1367j(-1, -2));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final void mo63366c(List<Comment> list) {
        if (!C13603b.m24435a((Collection) list)) {
            List<Comment> l = m73778l();
            this.f92236l.addAll(list);
            C80275bv.m139152a(this, l, this.f92236l);
        }
    }

    /* renamed from: a */
    private void m73773a(Comment comment) {
        long j;
        String cid;
        int indexOf;
        String str;
        String str2;
        String valueOf;
        String valueOf2;
        String str3;
        if (comment != null && !TextUtils.isEmpty(this.f85506b)) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            HashMap<Long, Long> hashMap = this.f85513i;
            if (hashMap != null && hashMap.get(Long.valueOf(j)) != null && this.f85513i.get(Long.valueOf(j)).longValue() > 10) {
                long currentTimeMillis = System.currentTimeMillis() - this.f85513i.get(Long.valueOf(j)).longValue();
                if (currentTimeMillis > 30) {
                    String predictedAgeGroup = C31575b.m65865g().getCurUser().getPredictedAgeGroup();
                    String predictedAgeGroup2 = comment.getUser().getPredictedAgeGroup();
                    int i = -1;
                    String str4 = "";
                    if (comment.getCommentType() == 2) {
                        cid = comment.getReplyId();
                        indexOf = this.f85509e.mo64778f(cid);
                        str = comment.getCid();
                        List<Comment> b = this.f85509e.mo64774b(String.valueOf(indexOf));
                        if (b != null) {
                            i = b.indexOf(comment);
                        }
                        str2 = "2";
                    } else if (comment.getCommentType() == 1) {
                        cid = comment.getCid();
                        indexOf = this.f85509e.mo64778f(cid);
                        str2 = "1";
                        str = str4;
                    } else {
                        cid = comment.getCid();
                        indexOf = this.f92236l.indexOf(comment);
                        str = str4;
                        str2 = str;
                    }
                    if (TextUtils.isEmpty(comment.getLabelText())) {
                        valueOf = str4;
                    } else {
                        valueOf = String.valueOf(comment.getLabelType());
                    }
                    if (comment.getRelationLabel() == null) {
                        valueOf2 = str4;
                    } else {
                        valueOf2 = String.valueOf(comment.getRelationLabel().getType());
                    }
                    if (comment.getUser() == null || comment.getUser().getUid() == null) {
                        str3 = str4;
                    } else {
                        str3 = comment.getUser().getUid();
                    }
                    if (TextUtils.equals(this.f85514j.getAuthorUid(), str3)) {
                        str4 = "creator";
                    } else if (comment.getUser().getFollowStatus() == 2) {
                        str4 = "friends";
                    } else if (comment.getUser().getFollowStatus() == 1) {
                        str4 = "following";
                    }
                    C36540c.m74381a(this.f85507c.getAuthor(), this.f85506b, this.f85514j.getAid(), cid, indexOf + 1, str, i + 1, currentTimeMillis, this.f85508d, this.f85514j.getIsLongItem(), valueOf, valueOf2, str3, str4, comment.getCid(), str2, predictedAgeGroup, predictedAgeGroup2);
                    if (comment.getGift() != null) {
                        C36540c.m74389a(this.f85506b, this.f85514j.getAid(), this.f85514j.getAuthorUid(), str3, comment.getCid(), comment.getGift().getId());
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Comment comment;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C36247s) {
            C36247s sVar = (C36247s) viewHolder;
            if (!(sVar.f85637a == null || !sVar.f85637a.isNeedHint() || sVar.f85631A == null)) {
                sVar.f85631A.postDelayed(new RunnableC36255w(sVar), 150);
            }
            sVar.mo63424d();
            comment = sVar.f85637a;
        } else if (viewHolder instanceof C36229h) {
            C36229h hVar = (C36229h) viewHolder;
            if (!(hVar.f85600y == null || !hVar.f85600y.isNeedHint() || hVar.f85576a == null)) {
                hVar.f85576a.postDelayed(new RunnableC36244q(hVar), 150);
            }
            if (hVar.f85565A != null && (hVar.itemView.getContext() instanceof ActivityC0945e) && C36176c.m73729a()) {
                hVar.f85565A.mo64780a().observe((ActivityC0580d) hVar.itemView.getContext(), hVar.f85566B);
            }
            comment = hVar.f85600y;
        } else if (viewHolder instanceof C36225f) {
            ((C36225f) viewHolder).mo63388b();
            return;
        } else if (viewHolder instanceof View$OnClickListenerC36245r) {
            View$OnClickListenerC36245r rVar = (View$OnClickListenerC36245r) viewHolder;
            CommentTaggedPeopleView commentTaggedPeopleView = rVar.f85622e;
            DataCenter dataCenter = commentTaggedPeopleView.f86027a;
            if (dataCenter != null) {
                dataCenter.mo60189a("TAGGED_PEOPLE_ACTION", (AbstractC1214u<C33942b>) commentTaggedPeopleView);
            }
            CommentMultiAnchorTagLayout commentMultiAnchorTagLayout = rVar.f85623f;
            commentMultiAnchorTagLayout.f86008a.mo63545b(commentMultiAnchorTagLayout);
            return;
        } else {
            return;
        }
        if (comment != null && comment.getUser() != null) {
            try {
                long parseLong = Long.parseLong(comment.getCid());
                if (parseLong != 0) {
                    m73772a(parseLong, System.currentTimeMillis());
                }
            } catch (Exception unused) {
            }
            if (comment.isAuthorDigged()) {
                C36539b.m74376b(this.f85506b, this.f85514j.getAid(), this.f85514j.getAuthorUid(), comment.getCid());
            }
            if (comment.getAliasAweme() != null) {
                mo63357a(comment, "video_comment_show", this.f85506b);
            }
            Aweme aweme = this.f85507c;
            if (aweme != null && aweme.isAd() && comment.getAdFlag() == 1) {
                if (this.f85503A == null) {
                    this.f85503A = new HashSet<>();
                }
                String cid = comment.getCid();
                if (!this.f85503A.contains(cid)) {
                    this.f85503A.add(cid);
                    C18129a.m33746a("comment_ad", "othershow", this.f85507c.getAwemeRawAd()).mo28900b("refer", "top_comment").mo28897a("comment_id", cid).mo28901b();
                }
            }
        }
    }

    /* renamed from: a */
    private void m73772a(long j, long j2) {
        this.f85513i.put(Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.adapter.AbstractC36211ad
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63353a(int i, ViewGroup viewGroup) {
        if (i == 2) {
            return m73776d(viewGroup);
        }
        if (i != 222) {
            return m73775c(viewGroup);
        }
        return m73777e(viewGroup);
    }

    /* renamed from: b */
    public final void mo63364b(String str, int i) {
        int c = mo60933c();
        if (c != 0 && !TextUtils.isEmpty(str)) {
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 < c) {
                    Comment comment = (Comment) this.f92236l.get(i3);
                    if (comment != null && C13627m.m24499a(comment.getFakeId(), str)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            mo63354a(i2, i);
        }
    }

    public C36205a(AbstractC36428a aVar, C36500h hVar) {
        this.f85513i = new HashMap<>();
        this.f85515k = (int) C13628n.m24520b(C17867d.m33078a(), 6.0f);
        this.f85516w = (int) C13628n.m24520b(C17867d.m33078a(), 10.0f);
        this.f85517x = (int) C13628n.m24520b(C17867d.m33078a(), 16.0f);
        this.f85510f = false;
        this.f85518y = new HashSet<>();
        this.f85504B = new AbstractC33136a() {
            /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36205a.C362061 */

            static {
                Covode.recordClassIndex(43472);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33136a
            /* renamed from: a */
            public final void mo58996a() {
                C36205a.this.f85505a.mo63751j();
            }
        };
        this.f85505a = aVar;
        this.f85514j = hVar;
        mo67825k();
    }

    /* renamed from: a */
    public final void mo63354a(int i, int i2) {
        int i3;
        if (i >= 0 && i < this.f92236l.size()) {
            List<Comment> l = m73778l();
            if (i2 > 1) {
                int i4 = i;
                while (true) {
                    i3 = i + i2;
                    if (i4 >= Math.min(this.f92236l.size(), i3)) {
                        break;
                    }
                    m73773a((Comment) this.f92236l.get(i4));
                    i4++;
                }
                List list = this.f92236l;
                list.subList(i, Math.min(list.size(), i3)).clear();
            } else {
                m73773a((Comment) this.f92236l.get(i));
                this.f92236l.remove(i);
            }
            C80275bv.m139152a(this, l, this.f92236l);
        }
    }

    /* renamed from: c */
    public final int mo63365c(String str, int i) {
        if (mo60933c() == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < this.f92236l.size(); i2++) {
            Comment comment = (Comment) this.f92236l.get(i2);
            if (comment != null && comment.getCommentType() == i && C13627m.m24499a(comment.getCid(), str)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C36247s sVar;
        C36229h hVar;
        int i2;
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                if (!C36223d.m73822a().f85546d || (hVar = (C36229h) this.f85519z.mo63335a(2)) == null) {
                    hVar = m73776d(viewGroup);
                }
                hVar.f85569E = this.f85514j.getAuthorUid();
                hVar.f85568D = this.f85514j.getAid();
                hVar.f85570F = C76706a.m134284j(this.f85507c);
                hVar.f85567C = this.f85506b;
                return hVar;
            } else if (i == 221) {
                View$OnClickListenerC36245r rVar = new View$OnClickListenerC36245r(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.jb, viewGroup, false), this.f85505a);
                rVar.f85627j = this.f85512h;
                return rVar;
            } else if (i != 222) {
                switch (i) {
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        C33148d dVar = new C33148d();
                        dVar.f78745h = 5;
                        dVar.f78744g = this.f85506b;
                        dVar.f78746i = this.f85504B;
                        return CommercializeAdServiceImpl.m79243a().mo67721a(viewGroup.getContext(), dVar);
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        return new C36225f(viewGroup, this.f85505a);
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        C33148d dVar2 = new C33148d();
                        dVar2.f78738a = C38681bh.m78486a(this.f85507c);
                        dVar2.f78745h = 8;
                        dVar2.f78744g = this.f85506b;
                        dVar2.f78746i = this.f85504B;
                        return CommercializeAdServiceImpl.m79243a().mo67721a(viewGroup.getContext(), dVar2);
                    default:
                        z = true;
                        break;
                }
            } else {
                C36207a e = m73777e(viewGroup);
                boolean a = C80580in.m139681a(this.f85514j.getAuthorUid());
                TextView textView = e.f85521a;
                Resources resources = e.itemView.getContext().getResources();
                if (a) {
                    i2 = R.string.h5q;
                } else {
                    i2 = R.string.h5p;
                }
                textView.setText(resources.getText(i2));
                return e;
            }
        }
        if (!C36223d.m73822a().f85546d || (sVar = (C36247s) this.f85519z.mo63335a(i)) == null) {
            sVar = m73775c(viewGroup);
        }
        sVar.mo63418a(z);
        sVar.mo63423c(this.f85514j.getAuthorUid());
        sVar.mo63420b(this.f85514j.getAid());
        sVar.mo63412a(this.f85514j.getPageType());
        sVar.mo63421b(C76706a.m134284j(this.f85507c));
        sVar.mo63417a(this.f85506b);
        return sVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        String a;
        boolean z2;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        AwemeTextLabelModel label;
        int i10;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 2) {
            AbstractC36424j jVar = (AbstractC36424j) viewHolder;
            jVar.mo63394a((Comment) this.f92236l.get(i));
            jVar.mo63395a(this.f85506b);
        } else if (itemViewType != 221) {
            if (itemViewType != 222) {
                switch (itemViewType) {
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        this.f85512h.mo60191a("comment_shown", (Object) 0);
                        C33148d dVar = new C33148d();
                        dVar.f78742e = (C38255s) this.f92236l.get(i);
                        dVar.f78743f = m73771a(i);
                        dVar.f78744g = this.f85506b;
                        ((AbstractC39047b) viewHolder).mo59005a(C17867d.m33078a(), dVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        C36225f fVar = (C36225f) viewHolder;
                        CommentReplyButtonStruct commentReplyButtonStruct = (CommentReplyButtonStruct) this.f92236l.get(i);
                        if (commentReplyButtonStruct != null) {
                            fVar.f85557h = commentReplyButtonStruct;
                            fVar.mo63386a();
                            break;
                        }
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        this.f85512h.mo60191a("comment_shown", (Object) 0);
                        C33148d dVar2 = new C33148d();
                        dVar2.f78738a = C38681bh.m78486a(this.f85507c);
                        dVar2.f78739b = this.f85507c;
                        dVar2.f78741d = this.f85512h;
                        dVar2.f78740c = this.f85511g;
                        ((AbstractC39047b) viewHolder).mo59005a(C17867d.m33078a(), dVar2);
                        break;
                    default:
                        this.f85512h.mo60191a("comment_shown", (Object) 0);
                        ((C36247s) viewHolder).mo63415a((Comment) this.f92236l.get(i), m73771a(i));
                        if (viewHolder instanceof C36256x) {
                            ((C36247s) viewHolder).mo63417a(this.f85506b);
                            break;
                        }
                        break;
                }
            }
        } else {
            this.f85512h.mo60191a("comment_shown", (Object) 0);
            View$OnClickListenerC36245r rVar = (View$OnClickListenerC36245r) viewHolder;
            C36317c cVar = (C36317c) this.f92236l.get(i);
            C89219l.m154721d(cVar, "");
            rVar.f85626i = cVar.getUser();
            User user = rVar.f85626i;
            boolean z3 = true;
            if (user != null) {
                C20766v a2 = C20761r.m39060a(C34735v.m70965a(user.getAvatarThumb())).mo34185b(C80397em.m139369a(100)).mo34176a(rVar.f85625h, rVar.f85625h);
                a2.f49098K = true;
                a2.f49092E = rVar.f85618a;
                a2.mo34186c();
                if (!TextUtils.isEmpty(user.getRemarkName())) {
                    rVar.f85619b.setText(user.getRemarkName());
                } else {
                    rVar.f85619b.setText(user.getUniqueId());
                }
                rVar.f85621d.setText(" · ");
                View view = rVar.itemView;
                C89219l.m154716b(view, "");
                C80581io.m139704a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), rVar.f85619b);
            }
            Aweme aweme = cVar.getAweme();
            CommentDescView commentDescView = rVar.f85620c;
            commentDescView.setMEnableToggle(true);
            C36305b mobParams = cVar.getMobParams();
            View view2 = rVar.itemView;
            C89219l.m154716b(view2, "");
            String string = view2.getContext().getString(R.string.bnr);
            C89219l.m154716b(string, "");
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(mobParams, "");
            C89219l.m154721d(string, "");
            commentDescView.f87866l = aweme;
            commentDescView.f87867m = mobParams;
            C36305b bVar = commentDescView.f87867m;
            if (bVar == null) {
                C89219l.m154710a("mMobParams");
            }
            String str2 = bVar.eventType;
            C89219l.m154716b(str2, "");
            commentDescView.f87858d = str2;
            C36305b bVar2 = commentDescView.f87867m;
            if (bVar2 == null) {
                C89219l.m154710a("mMobParams");
            }
            commentDescView.f87859e = bVar2.pageType;
            Aweme aweme2 = commentDescView.f87866l;
            if (aweme2 == null) {
                C89219l.m154710a("mAweme");
            }
            String contentDesc = aweme2.getContentDesc();
            if (commentDescView.f87872r && contentDesc != null) {
                try {
                    JSONArray jSONArray = new JSONArray(contentDesc);
                    int length = jSONArray.length();
                    String[] strArr = new String[length];
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        strArr[i12] = jSONArray.get(i12).toString();
                        String str3 = strArr[i12];
                        if (str3 == null) {
                            C89219l.m154715b();
                        }
                        i11 += str3.length();
                    }
                    commentDescView.f87877w = length - 1;
                    commentDescView.f87876v = i11;
                    if (length > 1) {
                        commentDescView.f87873s = new SpannableStringBuilder(TextUtils.join("\n", strArr));
                        commentDescView.f87875u = strArr;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (commentDescView.f87872r && commentDescView.f87875u != null) {
                Aweme aweme3 = commentDescView.f87866l;
                if (aweme3 == null) {
                    C89219l.m154710a("mAweme");
                }
                if (aweme3.getContentDescExtra() != null) {
                    String[] strArr2 = commentDescView.f87875u;
                    if (strArr2 == null) {
                        C89219l.m154715b();
                    }
                    int length2 = strArr2.length;
                    int[] iArr = new int[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        String[] strArr3 = commentDescView.f87875u;
                        if (strArr3 == null) {
                            C89219l.m154715b();
                        }
                        String str4 = strArr3[i13];
                        if (str4 != null) {
                            i10 = str4.length();
                        } else {
                            i10 = 0;
                        }
                        iArr[i13] = i10;
                    }
                    Aweme aweme4 = commentDescView.f87866l;
                    if (aweme4 == null) {
                        C89219l.m154710a("mAweme");
                    }
                    List<TextExtraStruct> contentDescExtra = aweme4.getContentDescExtra();
                    ArrayList arrayList = new ArrayList();
                    for (TextExtraStruct textExtraStruct : contentDescExtra) {
                        C89219l.m154716b(textExtraStruct, "");
                        int lineIndex = textExtraStruct.getLineIndex();
                        int i14 = 0;
                        for (int i15 = 0; i15 < lineIndex; i15++) {
                            i14 += iArr[i15];
                        }
                        int start = textExtraStruct.getStart() + i14 + lineIndex;
                        int end = (textExtraStruct.getEnd() + start) - textExtraStruct.getStart();
                        TextExtraStruct clone = textExtraStruct.clone();
                        C89219l.m154716b(clone, "");
                        clone.setStart(start);
                        clone.setEnd(end);
                        arrayList.add(clone);
                    }
                    commentDescView.f87874t = arrayList;
                }
            }
            String desc = aweme.getDesc();
            if (desc == null || desc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a = C89361p.m154868a(string, " ", " ");
            } else {
                String desc2 = aweme.getDesc();
                C89219l.m154716b(desc2, "");
                a = C89361p.m154868a(desc2, " ", " ");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            spannableStringBuilder.append(commentDescView.getPostTime());
            if (!TextUtils.isEmpty(spannableStringBuilder)) {
                commentDescView.f87855a.setText(spannableStringBuilder);
                commentDescView.f87855a.setVisibility(0);
                C46579b.m89899a(commentDescView.f87855a);
            } else {
                commentDescView.f87855a.setVisibility(8);
            }
            Integer num = commentDescView.f87869o;
            if (num != null) {
                commentDescView.f87855a.setTextColor(num.intValue());
            }
            commentDescView.f87855a.setSpanColor(commentDescView.f87855a.getCurrentTextColor());
            commentDescView.f87855a.setOnSpanClickListener(new CommentDescView.C37273d(commentDescView));
            Aweme aweme5 = commentDescView.f87866l;
            if (aweme5 == null) {
                C89219l.m154710a("mAweme");
            }
            if (commentDescView.f87878x) {
                commentDescView.f87855a.scrollTo(0, 0);
                commentDescView.f87857c.getLayoutParams().height = -2;
            }
            if (commentDescView.getContext() != null) {
                commentDescView.setTextExtraList(aweme5);
                try {
                    if (C80471gb.m139483a(commentDescView.getContext())) {
                        if (commentDescView.f87878x) {
                            commentDescView.f87855a.setMovementMethod(C50517j.C50518a.m94697a());
                        } else {
                            commentDescView.f87855a.setMovementMethod(C50516i.m94696a());
                        }
                    } else if (commentDescView.f87878x) {
                        commentDescView.f87855a.setMovementMethod(C50507b.C50508a.m94688a());
                    } else {
                        commentDescView.f87855a.setMovementMethod(C50506a.m94687a());
                    }
                } catch (IndexOutOfBoundsException e2) {
                    C51423a.m95788a("", e2);
                }
                commentDescView.f87855a.getViewTreeObserver().addOnGlobalLayoutListener(new CommentDescView.ViewTreeObserver$OnGlobalLayoutListenerC37270c(commentDescView, aweme5));
            }
            CommentRichTagView commentRichTagView = rVar.f85624g;
            C89219l.m154721d(aweme, "");
            if (commentRichTagView != null) {
                if (C36301c.m73998a(aweme)) {
                    C36347d dVar3 = new C36347d();
                    C36347d.C36348a aVar = new C36347d.C36348a();
                    aVar.f85944a = dVar3;
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd == null || (label = awemeRawAd.getLabel()) == null || (str = label.getLabelName()) == null) {
                        str = "";
                    }
                    int color = commentRichTagView.getResources().getColor(R.color.g);
                    C36347d dVar4 = aVar.f85944a;
                    if (dVar4 != null) {
                        dVar4.f85929g = Integer.valueOf(color);
                    }
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    float applyDimension = TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics());
                    C36347d dVar5 = aVar.f85944a;
                    if (dVar5 != null) {
                        dVar5.f85930h = Float.valueOf(applyDimension);
                    }
                    C89219l.m154721d(str, "");
                    C36347d dVar6 = aVar.f85944a;
                    if (dVar6 != null) {
                        dVar6.f85923a = str;
                    }
                    C36347d dVar7 = aVar.f85944a;
                    if (dVar7 != null) {
                        dVar7.f85926d = 72;
                    }
                    int color2 = commentRichTagView.getResources().getColor(R.color.c5);
                    C36347d dVar8 = aVar.f85944a;
                    if (dVar8 != null) {
                        dVar8.f85924b = Integer.valueOf(color2);
                    }
                    C36347d dVar9 = aVar.f85944a;
                    if (dVar9 != null) {
                        C89393b.m154951c(commentRichTagView);
                        C89219l.m154721d(dVar9, "");
                        C89219l.m154721d(aweme, "");
                        if (!TextUtils.isEmpty(dVar9.f85923a)) {
                            Integer num2 = dVar9.f85941s;
                            if (num2 != null) {
                                int intValue = num2.intValue();
                                ViewGroup.LayoutParams descViewParams = commentRichTagView.getDescViewParams();
                                Objects.requireNonNull(descViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) descViewParams;
                                ViewGroup.LayoutParams imageViewParams = commentRichTagView.getImageViewParams();
                                Objects.requireNonNull(imageViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageViewParams;
                                layoutParams.addRule(1, 0);
                                if (intValue == 1 || intValue == 2) {
                                    layoutParams.addRule(15);
                                    layoutParams2.addRule(15);
                                } else {
                                    layoutParams.addRule(14);
                                    layoutParams2.addRule(14);
                                }
                                if (intValue == 1) {
                                    layoutParams.addRule(1, commentRichTagView.getImageId());
                                    Integer num3 = dVar9.f85942t;
                                    if (num3 != null) {
                                        i6 = num3.intValue();
                                    } else {
                                        i6 = 0;
                                    }
                                    layoutParams.leftMargin = i6;
                                } else if (intValue == 2) {
                                    layoutParams2.addRule(1, commentRichTagView.getDescId());
                                    Integer num4 = dVar9.f85942t;
                                    if (num4 != null) {
                                        i7 = num4.intValue();
                                    } else {
                                        i7 = 0;
                                    }
                                    layoutParams2.leftMargin = i7;
                                } else if (intValue == 3) {
                                    layoutParams.addRule(3, commentRichTagView.getImageId());
                                    Integer num5 = dVar9.f85942t;
                                    if (num5 != null) {
                                        i8 = num5.intValue();
                                    } else {
                                        i8 = 0;
                                    }
                                    layoutParams.topMargin = i8;
                                } else if (intValue == 4) {
                                    layoutParams2.addRule(3, commentRichTagView.getDescId());
                                    Integer num6 = dVar9.f85942t;
                                    if (num6 != null) {
                                        i9 = num6.intValue();
                                    } else {
                                        i9 = 0;
                                    }
                                    layoutParams2.topMargin = i9;
                                }
                                commentRichTagView.getMDescTextView().setLayoutParams(layoutParams);
                                commentRichTagView.getMImageView().setLayoutParams(layoutParams2);
                            }
                            if (!(dVar9.f85931i == null && dVar9.f85932j == null)) {
                                ViewGroup.LayoutParams tagViewParams = commentRichTagView.getTagViewParams();
                                Objects.requireNonNull(tagViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) tagViewParams;
                                Integer num7 = dVar9.f85931i;
                                if (num7 != null) {
                                    layoutParams3.width = num7.intValue();
                                }
                                Integer num8 = dVar9.f85932j;
                                if (num8 != null) {
                                    layoutParams3.height = num8.intValue();
                                }
                                commentRichTagView.getMContentView().setLayoutParams(layoutParams3);
                            }
                            RelativeLayout.LayoutParams layoutParams4 = dVar9.f85938p;
                            if (layoutParams4 != null) {
                                commentRichTagView.getMContentView().setLayoutParams(layoutParams4);
                            }
                            RelativeLayout.LayoutParams layoutParams5 = dVar9.f85939q;
                            if (layoutParams5 != null) {
                                commentRichTagView.getMDescTextView().setLayoutParams(layoutParams5);
                            }
                            RelativeLayout.LayoutParams layoutParams6 = dVar9.f85940r;
                            if (layoutParams6 != null) {
                                commentRichTagView.getMImageView().setLayoutParams(layoutParams6);
                            }
                            commentRichTagView.getMDescTextView().setText(dVar9.f85923a);
                            Integer num9 = dVar9.f85924b;
                            if (num9 != null) {
                                commentRichTagView.getMDescTextView().setTextColor(num9.intValue());
                            }
                            Float f = dVar9.f85925c;
                            if (f != null) {
                                commentRichTagView.getMDescTextView().setTextSize(f.floatValue());
                            }
                            Integer num10 = dVar9.f85926d;
                            if (num10 != null) {
                                commentRichTagView.getMDescTextView().setTuxFont(num10.intValue());
                            }
                            TextUtils.TruncateAt truncateAt = dVar9.f85927e;
                            if (truncateAt != null) {
                                commentRichTagView.getMDescTextView().setEllipsize(truncateAt);
                            }
                            Integer num11 = dVar9.f85928f;
                            if (num11 != null) {
                                commentRichTagView.getMDescTextView().setMaxLines(num11.intValue());
                            }
                            Integer num12 = dVar9.f85937o;
                            if (num12 != null) {
                                commentRichTagView.getMImageView().setImageResource(num12.intValue());
                                commentRichTagView.getMImageView().setVisibility(0);
                            }
                            if (dVar9.f85929g != null) {
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setShape(0);
                                Integer num13 = dVar9.f85929g;
                                if (num13 != null) {
                                    gradientDrawable.setColor(num13.intValue());
                                }
                                Float f2 = dVar9.f85930h;
                                if (f2 != null) {
                                    gradientDrawable.setCornerRadius(f2.floatValue());
                                }
                                commentRichTagView.getMContentView().setBackground(gradientDrawable);
                            }
                            if (!(dVar9.f85935m == null && dVar9.f85936n == null && dVar9.f85933k == null && dVar9.f85934l == null)) {
                                int i16 = Build.VERSION.SDK_INT;
                                RelativeLayout mContentView = commentRichTagView.getMContentView();
                                Integer num14 = dVar9.f85933k;
                                if (num14 != null) {
                                    i2 = num14.intValue();
                                } else {
                                    i2 = 0;
                                }
                                Integer num15 = dVar9.f85935m;
                                if (num15 != null) {
                                    i3 = num15.intValue();
                                } else {
                                    i3 = 0;
                                }
                                Integer num16 = dVar9.f85934l;
                                if (num16 != null) {
                                    i4 = num16.intValue();
                                } else {
                                    i4 = 0;
                                }
                                Integer num17 = dVar9.f85936n;
                                if (num17 != null) {
                                    i5 = num17.intValue();
                                } else {
                                    i5 = 0;
                                }
                                mContentView.setPaddingRelative(i2, i3, i4, i5);
                            }
                        }
                        commentRichTagView.setOnClickListener(new C36301c.View$OnClickListenerC36302a(commentRichTagView, aweme));
                    } else {
                        C89393b.m154949a(commentRichTagView);
                    }
                } else {
                    C89393b.m154949a(commentRichTagView);
                }
            }
            rVar.f85622e.mo63652a(rVar.f85627j, cVar);
            CommentMultiAnchorTagLayout commentMultiAnchorTagLayout = rVar.f85623f;
            C89219l.m154721d(cVar, "");
            commentMultiAnchorTagLayout.f86013f = cVar;
            C36317c cVar2 = commentMultiAnchorTagLayout.f86013f;
            if (cVar2 == null || !cVar2.isAnchorsFold()) {
                z2 = true;
            } else {
                z2 = false;
            }
            commentMultiAnchorTagLayout.mo63638b(z2);
            C36317c cVar3 = commentMultiAnchorTagLayout.f86013f;
            if (cVar3 != null) {
                z3 = cVar3.isAnchorsFold();
            }
            commentMultiAnchorTagLayout.f86012e = z3;
            commentMultiAnchorTagLayout.f86011d.getViewTreeObserver().addOnGlobalLayoutListener(new CommentMultiAnchorTagLayout.ViewTreeObserver$OnGlobalLayoutListenerC36369b(commentMultiAnchorTagLayout));
            commentMultiAnchorTagLayout.f86009b.setOnClickListener(new CommentMultiAnchorTagLayout.View$OnClickListenerC36370c(commentMultiAnchorTagLayout));
            commentMultiAnchorTagLayout.f86010c.setOnClickListener(new CommentMultiAnchorTagLayout.View$OnClickListenerC36371d(commentMultiAnchorTagLayout));
            AbstractC36304d dVar10 = commentMultiAnchorTagLayout.f86008a;
            Context context = commentMultiAnchorTagLayout.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            dVar10.mo63543a(cVar, (Activity) context);
            commentMultiAnchorTagLayout.f86008a.mo63544a(commentMultiAnchorTagLayout);
        }
        if (C37201k.f87715b != null) {
            C37201k.f87714a.removeMessages(0);
            C37201k.HandlerC37203b bVar3 = C37201k.f87714a;
            Message message = new Message();
            message.what = 0;
            Bundle bundle = new Bundle();
            bundle.putLong("key_finish_ts", System.currentTimeMillis());
            message.setData(bundle);
            bVar3.sendMessageDelayed(message, 300);
        }
    }

    public C36205a(AbstractC36428a aVar, C36500h hVar, RecyclerView recyclerView) {
        this(aVar, hVar);
        if (C36223d.m73822a().f85546d && recyclerView != null) {
            CommentPreCreateViewHolderManager commentPreCreateViewHolderManager = new CommentPreCreateViewHolderManager(this, recyclerView);
            this.f85519z = commentPreCreateViewHolderManager;
            commentPreCreateViewHolderManager.f85465a = Math.min((int) hVar.getCommentCount(), 5);
            new C58221f.C58224c().mo95703b((AbstractC58264w) new CommentPreCreateViewHolderManager.PreCreateViewHolderLegoTask()).mo95706a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo63355a(viewHolder);
        } else if (list.isEmpty()) {
            mo60186a(viewHolder, i);
        } else {
            int intValue = ((Integer) list.get(0)).intValue();
            if (intValue == 0) {
                if (viewHolder instanceof C36256x) {
                    C36256x xVar = (C36256x) viewHolder;
                    xVar.getClass().getSimpleName();
                    if (xVar.f85637a != null) {
                        xVar.mo63432a(xVar.f85637a.isUserDigged(), xVar.f85637a.getDiggCount(), false, xVar.f85637a.isAuthorDigged());
                    }
                    xVar.mo63417a(this.f85506b);
                }
                if (viewHolder instanceof C36229h) {
                    AbstractC36424j jVar = (AbstractC36424j) viewHolder;
                    jVar.mo63399c();
                    jVar.mo63395a(this.f85506b);
                }
            } else if (intValue == 1) {
                if (viewHolder instanceof C36256x) {
                    ((C36247s) viewHolder).mo63419b();
                }
                if (viewHolder instanceof AbstractC36424j) {
                    ((AbstractC36424j) viewHolder).mo63398b();
                }
            } else if (intValue == 2 && (viewHolder instanceof C36256x)) {
                ((C36247s) viewHolder).mo63419b();
            }
        }
    }
}
