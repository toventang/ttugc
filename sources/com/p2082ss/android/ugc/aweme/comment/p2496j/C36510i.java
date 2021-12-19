package com.p2082ss.android.ugc.aweme.comment.p2496j;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36223d;
import com.p2082ss.android.ugc.aweme.comment.api.CommentApi;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36426l;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36542d;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37140de;
import com.p2082ss.android.ugc.aweme.comment.util.C37194f;
import com.p2082ss.android.ugc.aweme.emoji.p2898c.C46455a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.net.C61354g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.j.i */
public class C36510i extends AbstractC36502a<Comment, CommentItemList> {

    /* renamed from: b */
    public String f86442b;

    /* renamed from: c */
    protected String f86443c;

    /* renamed from: d */
    public String f86444d;

    /* renamed from: e */
    public AbstractC36426l f86445e;

    /* renamed from: f */
    public long f86446f;

    /* renamed from: g */
    public AbstractC37140de f86447g;

    /* renamed from: h */
    public boolean f86448h;

    /* renamed from: i */
    public boolean f86449i;

    /* renamed from: j */
    private int f86450j;

    /* renamed from: k */
    private boolean f86451k = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    static {
        Covode.recordClassIndex(43813);
    }

    /* renamed from: b */
    public final long mo63982b() {
        if (this.mData == null) {
            return 0;
        }
        return ((CommentItemList) this.mData).total;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public boolean isHasMore() {
        if (this.mData == null || !((CommentItemList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public List<Comment> getItems() {
        AbstractC36426l lVar;
        if (this.mData == null) {
            return null;
        }
        if (((CommentItemList) this.mData).replyStyle != 2 || (lVar = this.f86445e) == null) {
            return ((CommentItemList) this.mData).items;
        }
        return lVar.mo63737a();
    }

    /* renamed from: a */
    public final boolean mo63981a() {
        if (TextUtils.equals(this.f86443c, "v1") || TextUtils.equals(this.f86443c, "v2")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m74301a(Comment comment) {
        comment.setTimeFormat(C37194f.m75166b(comment));
        User user = comment.getUser();
        if (user != null) {
            user.setUserDisplayName(C80580in.m139677a(user, false));
        }
        C46579b.m89898a((Context) null, comment.getText());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void refreshList(Object... objArr) {
        m74302a((String) objArr[1], 0, (String) objArr[2], (Long) objArr[3], ((Integer) objArr[4]).intValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((CommentItemList) this.mData).cursor;
        }
        m74302a(str, j, (String) objArr[2], (Long) objArr[3], ((Integer) objArr[4]).intValue());
    }

    /* renamed from: a */
    protected static CommentItemList m74300a(CommentItemList commentItemList) {
        List<Comment> list;
        if (!(!C36223d.m73822a().f85543a || commentItemList == null || (list = commentItemList.items) == null || list.size() == 0)) {
            for (int i = 0; i < list.size(); i++) {
                m74301a(list.get(i));
                List<Comment> replyComments = list.get(i).getReplyComments();
                if (replyComments != null) {
                    for (int i2 = 0; i2 < replyComments.size(); i2++) {
                        m74301a(replyComments.get(i2));
                    }
                }
            }
        }
        return commentItemList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo63976a(CommentItemList commentItemList) {
        int size;
        if (this.f86442b != null) {
            C36542d dVar = this.f86429a;
            String str = this.f86442b;
            C89219l.m154721d(str, "");
            dVar.f86525a.put("GroupId", str);
        }
        C36542d dVar2 = this.f86429a;
        String str2 = this.f86443c;
        C89219l.m154721d(str2, "");
        dVar2.f86525a.put("MethodName", str2);
        if (commentItemList != null) {
            this.f86429a.f86525a.put("TotalCount", String.valueOf(commentItemList.total));
            C36542d dVar3 = this.f86429a;
            if (commentItemList.items == null) {
                size = 0;
            } else {
                size = commentItemList.items.size();
            }
            dVar3.f86525a.put("ActualReturnCount", String.valueOf(size));
            this.f86429a.f86525a.put("Offset", String.valueOf(commentItemList.cursor));
        }
        C36542d dVar4 = this.f86429a;
        if (!dVar4.f86525a.containsKey("UserId")) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                ConcurrentHashMap<String, String> concurrentHashMap = dVar4.f86525a;
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                String curUserId = g2.getCurUserId();
                C89219l.m154716b(curUserId, "");
                concurrentHashMap.put("UserId", curUserId);
            }
        }
        if (!dVar4.f86525a.containsKey("DeviceId")) {
            ConcurrentHashMap<String, String> concurrentHashMap2 = dVar4.f86525a;
            String deviceId = DeviceRegisterManager.getDeviceId();
            C89219l.m154716b(deviceId, "");
            concurrentHashMap2.put("DeviceId", deviceId);
        }
        try {
            C33830n.m70668a("aweme_comment_list_api_monitor_log", new JSONObject(C89041ag.m154429c(dVar4.f86525a)));
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36502a, com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public /* synthetic */ void handleData(CommentItemList commentItemList) {
        boolean z;
        CommentItemList commentItemList2 = commentItemList;
        C36542d dVar = this.f86429a;
        dVar.f86525a.put("Duration", String.valueOf(System.currentTimeMillis() - dVar.f86526b));
        if (commentItemList2 != null) {
            if (commentItemList2.newInsertIds != null) {
                this.f86444d = commentItemList2.newInsertIds;
            }
            this.f86429a.mo64008a(commentItemList2);
            if (this.f86448h) {
                for (Comment comment : commentItemList2.items) {
                    if (TextUtils.equals(this.f86444d, comment.getCid())) {
                        this.f86447g.mo64664a(comment);
                    }
                }
            }
            if (this.f86449i) {
                for (Comment comment2 : commentItemList2.items) {
                    if (TextUtils.equals(this.f86444d, comment2.getCid())) {
                        this.f86447g.mo64665b(comment2);
                    }
                }
            }
        }
        mo63976a(commentItemList2);
        if (mo63981a()) {
            long j = this.f86446f;
            if (j != 0) {
                if (commentItemList2 == null) {
                    C36542d.C36543a.m74397a(this.f86443c, this.f86442b, j, 102, "", "");
                } else if (C13603b.m24435a((Collection) commentItemList2.items)) {
                    C36542d.C36543a.m74397a(this.f86443c, this.f86442b, this.f86446f, 101, "", "");
                }
            }
        }
        boolean z2 = false;
        if (commentItemList2 == null || (C13603b.m24435a((Collection) commentItemList2.items) && this.mListQueryType == 4)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                List<Comment> list = commentItemList2.items;
                this.mData = commentItemList2;
                ((CommentItemList) this.mData).items = new ArrayList();
                mo63980a(list);
            } else if (i == 4) {
                mo63980a(commentItemList2.items);
                ((CommentItemList) this.mData).total = commentItemList2.total;
                ((CommentItemList) this.mData).cursor = commentItemList2.cursor;
                CommentItemList commentItemList3 = (CommentItemList) this.mData;
                if (commentItemList2.hasMore && ((CommentItemList) this.mData).hasMore) {
                    z2 = true;
                }
                commentItemList3.hasMore = z2;
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                List<Comment> list2 = commentItemList2.items;
                this.mData = commentItemList2;
                ((CommentItemList) this.mData).items = new ArrayList();
                mo63980a(list2);
            }
            ((CommentItemList) this.mData).hasMore = false;
        }
        C46455a.f108228a.mo78986a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63980a(List<Comment> list) {
        AbstractC36426l lVar;
        if (!C13603b.m24435a((Collection) list)) {
            if (((CommentItemList) this.mData).replyStyle != 2 || (lVar = this.f86445e) == null) {
                for (Comment comment : list) {
                    if (!C13603b.m24435a((Collection) comment.getReplyComments())) {
                        Comment comment2 = comment.getReplyComments().get(0);
                        ArrayList arrayList = new ArrayList();
                        comment.setReplyComments(null);
                        arrayList.add(comment);
                        comment2.setReplyComments(arrayList);
                        comment = comment2;
                    }
                    comment.setNeedHint(TextUtils.equals(this.f86444d, comment.getCid()));
                    if (!((CommentItemList) this.mData).items.contains(comment)) {
                        comment.setCommentType(1);
                        ((CommentItemList) this.mData).items.add(comment);
                    }
                }
                return;
            }
            lVar.mo63741b();
            this.f86445e.mo63739a(this.f86444d);
            this.f86445e.mo63738a(this.f86450j);
            if (this.mListQueryType == 1) {
                this.f86445e.mo63742c();
            }
            this.f86445e.mo63740a(list);
        }
    }

    /* renamed from: a */
    private void m74302a(String str, long j, String str2, Long l, int i) {
        this.f86442b = str;
        this.f86444d = str2;
        this.f86450j = i;
        if (this.f86451k) {
            C1731i.m5640b(new CallableC36513j(this, str2, j, l, i), C40780g.m82241a());
            return;
        }
        C51423a.m95791b(4, "CommentLog", "CommentFetchModel: fetchList: aid = " + this.f86442b + " insertCids = " + str2);
        this.f86443c = "v2";
        if (C36223d.m73822a().f85543a) {
            CommentApi.m73893a(this.f86442b, j, 20, str2, l, i).mo5532a(new AbstractC1729g<CommentItemList, CommentItemList>() {
                /* class com.p2082ss.android.ugc.aweme.comment.p2496j.C36510i.C365122 */

                static {
                    Covode.recordClassIndex(43815);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // p077b.AbstractC1729g
                public final /* synthetic */ CommentItemList then(C1731i<CommentItemList> iVar) {
                    if (!iVar.mo5544c()) {
                        return C36510i.m74300a(iVar.mo5545d());
                    }
                    throw iVar.mo5546e();
                }
            }).mo5532a(new C61354g(this.mHandler));
        } else {
            CommentApi.m73893a(this.f86442b, j, 20, str2, l, i).mo5532a(new C61354g(this.mHandler));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo63979a(String str, long j, int i, Long l, int i2) {
        C51423a.m95791b(4, "CommentLog", "CommentFetchModel: fetchList task call: aid = " + this.f86442b + " insertCids = " + str);
        this.f86443c = "v2";
        if (C36223d.m73822a().f85543a) {
            CommentApi.m73893a(this.f86442b, j, i, str, l, i2).mo5532a(new AbstractC1729g<CommentItemList, CommentItemList>() {
                /* class com.p2082ss.android.ugc.aweme.comment.p2496j.C36510i.C365111 */

                static {
                    Covode.recordClassIndex(43814);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // p077b.AbstractC1729g
                public final /* synthetic */ CommentItemList then(C1731i<CommentItemList> iVar) {
                    if (!iVar.mo5544c()) {
                        return C36510i.m74300a(iVar.mo5545d());
                    }
                    throw iVar.mo5546e();
                }
            }).mo5532a(new C61354g(this.mHandler));
            return null;
        }
        CommentApi.m73893a(this.f86442b, j, i, str, l, i2).mo5532a(new C61354g(this.mHandler));
        return null;
    }
}
