package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.QaStruct */
public final class QaStruct implements Serializable {
    @AbstractC27891c(mo46611a = "user_avatar")
    public UrlModel avatarUrl;
    @AbstractC27891c(mo46611a = "invited_users")
    public List<Long> inviteUserList;
    @AbstractC27891c(mo46611a = "item_id")
    public long itemId;
    @AbstractC27891c(mo46611a = "content")
    public String questionContent;
    @AbstractC27891c(mo46611a = "question_id")
    public long questionId;
    @AbstractC27891c(mo46611a = "sec_uid")
    public String secId;
    @AbstractC27891c(mo46611a = "source")
    public EnumC75311f source;
    @AbstractC27891c(mo46611a = "user_id")
    public long userId;
    @AbstractC27891c(mo46611a = "username")
    public String userName;

    static {
        Covode.recordClassIndex(88219);
    }

    public QaStruct() {
        this(0, 0, 0, null, null, null, null, null, null, 511, null);
    }

    public QaStruct(long j) {
        this(j, 0, 0, null, null, null, null, null, null, 510, null);
    }

    public QaStruct(long j, long j2) {
        this(j, j2, 0, null, null, null, null, null, null, 508, null);
    }

    public QaStruct(long j, long j2, long j3) {
        this(j, j2, j3, null, null, null, null, null, null, 504, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel) {
        this(j, j2, j3, urlModel, null, null, null, null, null, 496, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str) {
        this(j, j2, j3, urlModel, str, null, null, null, null, 480, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2) {
        this(j, j2, j3, urlModel, str, str2, null, null, null, 448, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3) {
        this(j, j2, j3, urlModel, str, str2, str3, null, null, 384, null);
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list) {
        this(j, j2, j3, urlModel, str, str2, str3, list, null, 256, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m132112x6c773119(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.data.QaStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QaStruct copy$default(QaStruct qaStruct, long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List list, EnumC75311f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = qaStruct.questionId;
        }
        if ((i & 2) != 0) {
            j2 = qaStruct.userId;
        }
        if ((i & 4) != 0) {
            j3 = qaStruct.itemId;
        }
        if ((i & 8) != 0) {
            urlModel = qaStruct.avatarUrl;
        }
        if ((i & 16) != 0) {
            str = qaStruct.userName;
        }
        if ((i & 32) != 0) {
            str2 = qaStruct.questionContent;
        }
        if ((i & 64) != 0) {
            str3 = qaStruct.secId;
        }
        if ((i & 128) != 0) {
            list = qaStruct.inviteUserList;
        }
        if ((i & 256) != 0) {
            fVar = qaStruct.source;
        }
        return qaStruct.copy(j, j2, j3, urlModel, str, str2, str3, list, fVar);
    }

    public final long component1() {
        return this.questionId;
    }

    public final long component2() {
        return this.userId;
    }

    public final long component3() {
        return this.itemId;
    }

    public final UrlModel component4() {
        return this.avatarUrl;
    }

    public final String component5() {
        return this.userName;
    }

    public final String component6() {
        return this.questionContent;
    }

    public final String component7() {
        return this.secId;
    }

    public final List<Long> component8() {
        return this.inviteUserList;
    }

    public final EnumC75311f component9() {
        return this.source;
    }

    public final QaStruct copy(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC75311f fVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(fVar, "");
        return new QaStruct(j, j2, j3, urlModel, str, str2, str3, list, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QaStruct)) {
            return false;
        }
        QaStruct qaStruct = (QaStruct) obj;
        return this.questionId == qaStruct.questionId && this.userId == qaStruct.userId && this.itemId == qaStruct.itemId && C89219l.m154714a(this.avatarUrl, qaStruct.avatarUrl) && C89219l.m154714a(this.userName, qaStruct.userName) && C89219l.m154714a(this.questionContent, qaStruct.questionContent) && C89219l.m154714a(this.secId, qaStruct.secId) && C89219l.m154714a(this.inviteUserList, qaStruct.inviteUserList) && C89219l.m154714a(this.source, qaStruct.source);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((m132112x6c773119(this.questionId) * 31) + m132112x6c773119(this.userId)) * 31) + m132112x6c773119(this.itemId)) * 31;
        UrlModel urlModel = this.avatarUrl;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str = this.userName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.questionContent;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.secId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Long> list = this.inviteUserList;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        EnumC75311f fVar = this.source;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "QaStruct(questionId=" + this.questionId + ", userId=" + this.userId + ", itemId=" + this.itemId + ", avatarUrl=" + this.avatarUrl + ", userName=" + this.userName + ", questionContent=" + this.questionContent + ", secId=" + this.secId + ", inviteUserList=" + this.inviteUserList + ", source=" + this.source + ")";
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final List<Long> getInviteUserList() {
        return this.inviteUserList;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getQuestionContent() {
        return this.questionContent;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getSecId() {
        return this.secId;
    }

    public final EnumC75311f getSource() {
        return this.source;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List<Long> list, EnumC75311f fVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(fVar, "");
        this.questionId = j;
        this.userId = j2;
        this.itemId = j3;
        this.avatarUrl = urlModel;
        this.userName = str;
        this.questionContent = str2;
        this.secId = str3;
        this.inviteUserList = list;
        this.source = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QaStruct(long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List list, EnumC75311f fVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? 0 : j2, (i & 4) == 0 ? j3 : 0, (i & 8) != 0 ? null : urlModel, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? str3 : null, (i & 128) != 0 ? C89086z.INSTANCE : list, (i & 256) != 0 ? EnumC75311f.Default : fVar);
    }

    public final void setSource(EnumC75311f fVar) {
        C89219l.m154721d(fVar, "");
        this.source = fVar;
    }
}
