package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36223d;
import com.p2082ss.android.ugc.aweme.comment.api.CommentApi;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.net.C61354g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.comment.j.o */
public final class C36518o extends C36510i {
    static {
        Covode.recordClassIndex(43821);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.C36510i, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CommentItemList) this.mData).items;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.p2082ss.android.ugc.aweme.comment.p2496j.C36510i
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 7) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.C36510i
    /* renamed from: a */
    public final void mo63980a(List<Comment> list) {
        if (!C13603b.m24435a((Collection) list)) {
            ((CommentItemList) this.mData).replyStyle = 2;
            if (this.mListQueryType == 4) {
                ((CommentItemList) this.mData).items = new ArrayList();
            }
            for (Comment comment : list) {
                comment.setCommentType(2);
                ((CommentItemList) this.mData).items.add(comment);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.C36510i, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        String valueOf;
        if (objArr[5] == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(objArr[5]);
        }
        m74322a(String.valueOf(objArr[1]), ((Long) objArr[3]).longValue(), C36520p.m74324a(String.valueOf(objArr[1])).f86475b, String.valueOf(objArr[2]), String.valueOf(objArr[4]), valueOf, ((Integer) objArr[6]).intValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.C36510i, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        String valueOf;
        if (objArr[5] == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(objArr[5]);
        }
        m74322a(String.valueOf(objArr[1]), ((Long) objArr[3]).longValue(), C36520p.m74324a(String.valueOf(objArr[1])).f86475b, String.valueOf(objArr[2]), String.valueOf(objArr[4]), valueOf, ((Integer) objArr[6]).intValue());
    }

    /* renamed from: a */
    private void m74322a(String str, long j, int i, String str2, String str3, String str4, int i2) {
        this.f86443c = "reply";
        C51423a.m95791b(4, "CommentLog", "CommentReplyListModel: fetchList: aid = " + this.f86442b + " commentId = " + str);
        if (C36223d.m73822a().f85543a) {
            CommentApi.m73894a(str, j, i, str2, str3, str4, i2).mo5532a(new AbstractC1729g<CommentItemList, CommentItemList>() {
                /* class com.p2082ss.android.ugc.aweme.comment.p2496j.C36518o.C365191 */

                static {
                    Covode.recordClassIndex(43822);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // p077b.AbstractC1729g
                public final /* synthetic */ CommentItemList then(C1731i<CommentItemList> iVar) {
                    if (!iVar.mo5544c()) {
                        return C36518o.m74300a(iVar.mo5545d());
                    }
                    throw iVar.mo5546e();
                }
            }).mo5532a(new C61354g(this.mHandler));
        } else {
            CommentApi.m73894a(str, j, i, str2, str3, str4, i2).mo5532a(new C61354g(this.mHandler));
        }
    }
}
