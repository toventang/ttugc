package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.SessionListNavArg */
public final class SessionListNavArg implements IRouteArg {
    public static final Parcelable.Creator<SessionListNavArg> CREATOR = new C54874b();
    public static final C54873a Companion = new C54873a((byte) 0);
    private final Integer chatType;
    private final String conversationId;
    private final String enterFrom;
    private final String enterMethod;
    private final Integer isGroupMemberRequest;
    private final String jumpedFromInviteId;
    private final Integer messageCount;
    private final Integer messagePreviewEnabled;
    private final String noticeType;

    static {
        Covode.recordClassIndex(64592);
    }

    public SessionListNavArg() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public SessionListNavArg(String str) {
        this(str, null, null, null, null, null, null, null, null, 510, null);
    }

    public SessionListNavArg(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, null, 508, null);
    }

    public SessionListNavArg(String str, String str2, Integer num) {
        this(str, str2, num, null, null, null, null, null, null, 504, null);
    }

    public SessionListNavArg(String str, String str2, Integer num, String str3) {
        this(str, str2, num, str3, null, null, null, null, null, 496, null);
    }

    public SessionListNavArg(String str, String str2, Integer num, String str3, String str4) {
        this(str, str2, num, str3, str4, null, null, null, null, 480, null);
    }

    public SessionListNavArg(String str, String str2, Integer num, String str3, String str4, String str5) {
        this(str, str2, num, str3, str4, str5, null, null, null, 448, null);
    }

    public SessionListNavArg(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2) {
        this(str, str2, num, str3, str4, str5, num2, null, null, 384, null);
    }

    public SessionListNavArg(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, Integer num3) {
        this(str, str2, num, str3, str4, str5, num2, num3, null, 256, null);
    }

    public static SessionListNavArg __fromBundle(Bundle bundle) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        Integer num2;
        Integer num3;
        Integer num4 = null;
        if (bundle == null) {
            return null;
        }
        int i = 0;
        if (bundle.containsKey("enter_from")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("enter_method")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("message_cnt")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("message_cnt"), Integer.class);
        } else {
            i += 4;
            num = null;
        }
        if (bundle.containsKey("notice_type")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("notice_type"), String.class);
        } else {
            i += 8;
            str3 = null;
        }
        if (bundle.containsKey("im_group_invite_id")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("im_group_invite_id"), String.class);
        } else {
            i += 16;
            str4 = null;
        }
        if (bundle.containsKey("conversation_id")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("conversation_id"), String.class);
        } else {
            i += 32;
            str5 = null;
        }
        if (bundle.containsKey("is_member_request")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("is_member_request"), Integer.class);
        } else {
            i += 64;
            num2 = null;
        }
        if (bundle.containsKey("chat_type")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("chat_type"), Integer.class);
        } else {
            i += 128;
            num3 = null;
        }
        if (bundle.containsKey("message_preview_enabled")) {
            num4 = (Integer) RouteParser.INSTANCE.parse(bundle.get("message_preview_enabled"), Integer.class);
        } else {
            i += 256;
        }
        return new SessionListNavArg(str, str2, num, str3, str4, str5, num2, num3, num4, i, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        Integer num = this.messageCount;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.noticeType);
        parcel.writeString(this.jumpedFromInviteId);
        parcel.writeString(this.conversationId);
        Integer num2 = this.isGroupMemberRequest;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.chatType;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num4 = this.messagePreviewEnabled;
        if (num4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.SessionListNavArg$a */
    public static final class C54873a {
        static {
            Covode.recordClassIndex(64593);
        }

        private C54873a() {
        }

        public /* synthetic */ C54873a(byte b) {
            this();
        }
    }

    public final Integer getChatType() {
        return this.chatType;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getJumpedFromInviteId() {
        return this.jumpedFromInviteId;
    }

    public final Integer getMessageCount() {
        return this.messageCount;
    }

    public final Integer getMessagePreviewEnabled() {
        return this.messagePreviewEnabled;
    }

    public final String getNoticeType() {
        return this.noticeType;
    }

    public final Integer isGroupMemberRequest() {
        return this.isGroupMemberRequest;
    }

    public SessionListNavArg(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.messageCount = num;
        this.noticeType = str3;
        this.jumpedFromInviteId = str4;
        this.conversationId = str5;
        this.isGroupMemberRequest = num2;
        this.chatType = num3;
        this.messagePreviewEnabled = num4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionListNavArg(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : null, (i & 64) != 0 ? 0 : num2, (i & 128) != 0 ? 0 : num3, (i & 256) != 0 ? 0 : num4);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.SessionListNavArg$b */
    public static class C54874b implements Parcelable.Creator<SessionListNavArg> {
        static {
            Covode.recordClassIndex(64594);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SessionListNavArg[] newArray(int i) {
            return new SessionListNavArg[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SessionListNavArg createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new SessionListNavArg(readString, readString2, valueOf, readString3, readString4, readString5, valueOf2, valueOf3, num);
        }
    }
}
