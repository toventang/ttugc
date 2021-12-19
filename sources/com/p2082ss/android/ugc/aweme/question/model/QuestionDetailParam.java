package com.p2082ss.android.ugc.aweme.question.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import java.io.Serializable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.model.QuestionDetailParam */
public final class QuestionDetailParam implements IRouteArg, Serializable {
    public static final Parcelable.Creator<QuestionDetailParam> CREATOR = new C66572a();
    private String awemeId;
    private final AbstractC89244h enterFrom$delegate;
    private String enterMethod;
    private String from;
    private final AbstractC89244h id$delegate;
    private String processId;
    private String questionId;
    private String questionType;

    static {
        Covode.recordClassIndex(78115);
    }

    public QuestionDetailParam() {
        this(null, null, null, null, null, null, 63, null);
    }

    public QuestionDetailParam(String str) {
        this(str, null, null, null, null, null, 62, null);
    }

    public QuestionDetailParam(String str, String str2) {
        this(str, str2, null, null, null, null, 60, null);
    }

    public QuestionDetailParam(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, 56, null);
    }

    public QuestionDetailParam(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null, 48, null);
    }

    public QuestionDetailParam(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, 32, null);
    }

    public static QuestionDetailParam __fromBundle(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (bundle == null) {
            return null;
        }
        int i = 0;
        if (bundle.containsKey("id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("id"), String.class);
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("aweme_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("aweme_id"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("enter_method")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("question_type")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("question_type"), String.class);
        } else {
            i += 16;
            str5 = null;
        }
        if (bundle.containsKey("process_id")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("process_id"), String.class);
        } else {
            i += 32;
        }
        return new QuestionDetailParam(str, str2, str3, str4, str5, str6, i, null);
    }

    public static /* synthetic */ QuestionDetailParam copy$default(QuestionDetailParam questionDetailParam, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionDetailParam.questionId;
        }
        if ((i & 2) != 0) {
            str2 = questionDetailParam.awemeId;
        }
        if ((i & 4) != 0) {
            str3 = questionDetailParam.from;
        }
        if ((i & 8) != 0) {
            str4 = questionDetailParam.enterMethod;
        }
        if ((i & 16) != 0) {
            str5 = questionDetailParam.questionType;
        }
        if ((i & 32) != 0) {
            str6 = questionDetailParam.processId;
        }
        return questionDetailParam.copy(str, str2, str3, str4, str5, str6);
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public final String component1() {
        return this.questionId;
    }

    public final String component2() {
        return this.awemeId;
    }

    public final String component3() {
        return this.from;
    }

    public final String component4() {
        return this.enterMethod;
    }

    public final String component5() {
        return this.questionType;
    }

    public final String component6() {
        return this.processId;
    }

    public final QuestionDetailParam copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new QuestionDetailParam(str, str2, str3, str4, str5, str6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionDetailParam)) {
            return false;
        }
        QuestionDetailParam questionDetailParam = (QuestionDetailParam) obj;
        return C89219l.m154714a(this.questionId, questionDetailParam.questionId) && C89219l.m154714a(this.awemeId, questionDetailParam.awemeId) && C89219l.m154714a(this.from, questionDetailParam.from) && C89219l.m154714a(this.enterMethod, questionDetailParam.enterMethod) && C89219l.m154714a(this.questionType, questionDetailParam.questionType) && C89219l.m154714a(this.processId, questionDetailParam.processId);
    }

    public final String getEnterFrom() {
        return (String) this.enterFrom$delegate.getValue();
    }

    public final String getId() {
        return (String) this.id$delegate.getValue();
    }

    public final int hashCode() {
        String str = this.questionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.from;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.enterMethod;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.questionType;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.processId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "QuestionDetailParam(questionId=" + this.questionId + ", awemeId=" + this.awemeId + ", from=" + this.from + ", enterMethod=" + this.enterMethod + ", questionType=" + this.questionType + ", processId=" + this.processId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.questionId);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.from);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.questionType);
        parcel.writeString(this.processId);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getQuestionType() {
        return this.questionType;
    }

    /* renamed from: com.ss.android.ugc.aweme.question.model.QuestionDetailParam$a */
    public static class C66572a implements Parcelable.Creator<QuestionDetailParam> {
        static {
            Covode.recordClassIndex(78116);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ QuestionDetailParam[] newArray(int i) {
            return new QuestionDetailParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ QuestionDetailParam createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new QuestionDetailParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.model.QuestionDetailParam$b */
    static final class C66573b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ QuestionDetailParam f149685a;

        static {
            Covode.recordClassIndex(78117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66573b(QuestionDetailParam questionDetailParam) {
            super(0);
            this.f149685a = questionDetailParam;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String from = this.f149685a.getFrom();
            if (from == null || from.length() <= 0) {
                return "";
            }
            return from;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.model.QuestionDetailParam$c */
    static final class C66574c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ QuestionDetailParam f149686a;

        static {
            Covode.recordClassIndex(78118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66574c(QuestionDetailParam questionDetailParam) {
            super(0);
            this.f149686a = questionDetailParam;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String questionId = this.f149686a.getQuestionId();
            if (questionId == null || questionId.length() <= 0) {
                return "";
            }
            return questionId;
        }
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setQuestionId(String str) {
        this.questionId = str;
    }

    public final void setQuestionType(String str) {
        this.questionType = str;
    }

    public QuestionDetailParam(String str, String str2, String str3, String str4, String str5, String str6) {
        this.questionId = str;
        this.awemeId = str2;
        this.from = str3;
        this.enterMethod = str4;
        this.questionType = str5;
        this.processId = str6;
        this.id$delegate = C89250i.m154773a((AbstractC89171a) new C66574c(this));
        this.enterFrom$delegate = C89250i.m154773a((AbstractC89171a) new C66573b(this));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ QuestionDetailParam(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, p4600h.p4611f.p4613b.C89214g r15) {
        /*
            r7 = this;
            r5 = r12
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0 = r14 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000c
            r1 = r6
        L_0x000c:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0016
            r3 = r6
        L_0x0016:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x001b
            r4 = r6
        L_0x001b:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0020
            r5 = r6
        L_0x0020:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0029
        L_0x0024:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            r6 = r13
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.question.model.QuestionDetailParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
