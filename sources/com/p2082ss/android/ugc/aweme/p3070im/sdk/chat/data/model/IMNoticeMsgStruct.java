package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct */
public final class IMNoticeMsgStruct {
    @AbstractC27891c(mo46611a = "msg_content")
    private IMFromMessageTips msgContent;
    @AbstractC27891c(mo46611a = "msg_type")
    private Integer msgType;
    @AbstractC27891c(mo46611a = "notice_code")
    private String noticeCode;

    static {
        Covode.recordClassIndex(63443);
    }

    public static /* synthetic */ IMNoticeMsgStruct copy$default(IMNoticeMsgStruct iMNoticeMsgStruct, Integer num, String str, IMFromMessageTips iMFromMessageTips, int i, Object obj) {
        if ((i & 1) != 0) {
            num = iMNoticeMsgStruct.msgType;
        }
        if ((i & 2) != 0) {
            str = iMNoticeMsgStruct.noticeCode;
        }
        if ((i & 4) != 0) {
            iMFromMessageTips = iMNoticeMsgStruct.msgContent;
        }
        return iMNoticeMsgStruct.copy(num, str, iMFromMessageTips);
    }

    public final Integer component1() {
        return this.msgType;
    }

    public final String component2() {
        return this.noticeCode;
    }

    public final IMFromMessageTips component3() {
        return this.msgContent;
    }

    public final IMNoticeMsgStruct copy(Integer num, String str, IMFromMessageTips iMFromMessageTips) {
        C89219l.m154721d(iMFromMessageTips, "");
        return new IMNoticeMsgStruct(num, str, iMFromMessageTips);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMNoticeMsgStruct)) {
            return false;
        }
        IMNoticeMsgStruct iMNoticeMsgStruct = (IMNoticeMsgStruct) obj;
        return C89219l.m154714a(this.msgType, iMNoticeMsgStruct.msgType) && C89219l.m154714a(this.noticeCode, iMNoticeMsgStruct.noticeCode) && C89219l.m154714a(this.msgContent, iMNoticeMsgStruct.msgContent);
    }

    public final int hashCode() {
        Integer num = this.msgType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.noticeCode;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        IMFromMessageTips iMFromMessageTips = this.msgContent;
        if (iMFromMessageTips != null) {
            i = iMFromMessageTips.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "IMNoticeMsgStruct(msgType=" + this.msgType + ", noticeCode=" + this.noticeCode + ", msgContent=" + this.msgContent + ")";
    }

    public final IMFromMessageTips getMsgContent() {
        return this.msgContent;
    }

    public final Integer getMsgType() {
        return this.msgType;
    }

    public final String getNoticeCode() {
        return this.noticeCode;
    }

    public final void setMsgType(Integer num) {
        this.msgType = num;
    }

    public final void setNoticeCode(String str) {
        this.noticeCode = str;
    }

    public final void setMsgContent(IMFromMessageTips iMFromMessageTips) {
        C89219l.m154721d(iMFromMessageTips, "");
        this.msgContent = iMFromMessageTips;
    }

    public IMNoticeMsgStruct(Integer num, String str, IMFromMessageTips iMFromMessageTips) {
        C89219l.m154721d(iMFromMessageTips, "");
        this.msgType = num;
        this.noticeCode = str;
        this.msgContent = iMFromMessageTips;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IMNoticeMsgStruct(Integer num, String str, IMFromMessageTips iMFromMessageTips, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, iMFromMessageTips);
    }
}
